package com.demo.dwr;


import org.apache.log4j.Logger;
import org.directwebremoting.*;
import org.directwebremoting.annotations.RemoteProxy;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import java.util.Collection;

/**
 * Created by 杜保坤 on 16-12-7.
 */
@Component(value="dwrPushServer")
@RemoteProxy
public class DwrPushServer {

    private static final Logger log = Logger.getLogger(DwrPushServer.class);

    public void onPageLoad(String userID) {

        ScriptSession scriptSession = WebContextFactory.get().getScriptSession();
        // 工厂方法get()返回WebContext实例，通过WebContext获取servlet参数
        // ScriptSession与HttpSession类似
        scriptSession.setAttribute("userId", userID);

        MessagePushServlet mpServlet = new MessagePushServlet();
        try {
            mpServlet.init();
            log.info(String.format("消息推送初始化成功，userId：%s", userID));
        } catch (ServletException e) {
            log.error(String.format("消息推送初始化错误，userId：%s", userID));
        }

    }

    /**
     * 消息推送方法
     * @param userid 用户识别id
     * @param message 推送消息
     */
    public void pushMessage(String userid,String message){
        final String userId = userid;
        final String sendMessage = message;
        Browser.withAllSessionsFiltered(new ScriptSessionFilter() {
            @Override
            public boolean match(ScriptSession session) {
                if(session.getAttribute("userId") == null){
                    return false;
                }else{
                    return (session.getAttribute("userId")).equals(userId);
                }
            }
        },new Runnable() {
            private ScriptBuffer scriptBuffer = new ScriptBuffer();
            @Override
            public void run() {
                //showMessage -- 推送页面js方法
                scriptBuffer.appendCall("showMessage",sendMessage);
                Collection<ScriptSession> sessions = Browser.getTargetSessions();
                for (ScriptSession session : sessions){
                    session.addScript(scriptBuffer);
                }
                log.info(String.format("向用户推送消息，uid：%s，message：%s", userId, sendMessage));
            }
        });
    }
}
