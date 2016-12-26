package com.demo.dwr;

import org.apache.log4j.Logger;
import org.directwebremoting.Container;
import org.directwebremoting.ServerContextFactory;
import org.directwebremoting.WebContextFactory;
import org.directwebremoting.event.ScriptSessionEvent;
import org.directwebremoting.event.ScriptSessionListener;
import org.directwebremoting.extend.ScriptSessionManager;
import org.directwebremoting.servlet.DwrServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;

public class MessagePushServlet extends DwrServlet {

    private static final long serialVersionUID = 4298890285665323894L;
    private static final Logger log = Logger.getLogger(MessagePushServlet.class);

    @Override
    public void init() throws ServletException {

        Container container = ServerContextFactory.get().getContainer();
        // 工厂方法get()返回ServerContext实例
        ScriptSessionManager manager = container.getBean(ScriptSessionManager.class);
        ScriptSessionListener listener = new ScriptSessionListener() {
            public void sessionCreated(ScriptSessionEvent ev) {
                HttpSession session = WebContextFactory.get().getSession();

                String userID = (String) session.getAttribute("userId");
                log.info("a ScriptSession is created");
                ev.getSession().setAttribute("userId", userID);
            }

            public void sessionDestroyed(ScriptSessionEvent ev) {
                log.info("a ScriptSession is distroyed");
            }
        };
        manager.addScriptSessionListener(listener);
    }
}