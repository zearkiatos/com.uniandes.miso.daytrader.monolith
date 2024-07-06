/**
 * (C) Copyright IBM Corporation 2015.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ibm.websphere.samples.daytrader.util.Log;

/**
 *
 * PingServlet2Servlet tests servlet to servlet request dispatching. Servlet 1,
 * the controller, creates a new JavaBean object forwards the servlet request
 * with the JavaBean added to Servlet 2. Servlet 2 obtains access to the
 * JavaBean through the Servlet request object and provides the dynamic HTML
 * output based on the JavaBean data. PingServlet2ServletRcv receives a request
 * from {@link PingServlet2Servlet} and displays output.
 *
 */
@WebServlet(name = "PingServlet2ServletRcv", urlPatterns = { "/servlet/PingServlet2ServletRcv" })
public class PingServlet2ServletRcv extends HttpServlet {
    private static final long serialVersionUID = -5241563129216549706L;
    private static String initTime = null;

    /**
     * forwards post requests to the doGet method Creation date: (11/6/2000
     * 10:52:39 AM)
     *
     * @param res
     *            javax.servlet.http.HttpServletRequest
     * @param res2
     *            javax.servlet.http.HttpServletResponse
     */
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/prims/PingServlet2ServletRcv.java::com.ibm.websphere.samples.daytrader.web.prims.PingServlet2ServletRcv::doPost(HttpServletRequest, HttpServletResponse)|");

        doGet(req, res);
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/prims/PingServlet2ServletRcv.java::com.ibm.websphere.samples.daytrader.web.prims.PingServlet2ServletRcv::doPost(HttpServletRequest, HttpServletResponse)|");
}
}

    /**
     * this is the main method of the servlet that will service all get
     * requests.
     *
     * @param request
     *            HttpServletRequest
     * @param responce
     *            HttpServletResponce
     **/
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/prims/PingServlet2ServletRcv.java::com.ibm.websphere.samples.daytrader.web.prims.PingServlet2ServletRcv::doGet(HttpServletRequest, HttpServletResponse)|");

        PingBean ab;
        try {
            ab = (PingBean) req.getAttribute("ab");
            res.setContentType("text/html");
            PrintWriter out = res.getWriter();
            out.println("<html><head><title>Ping Servlet2Servlet</title></head>"
                    + "<body><HR><BR><FONT size=\"+2\" color=\"#000066\">PingServlet2Servlet:<BR></FONT><FONT size=\"+1\" color=\"#000066\">Init time: "
                    + initTime + "</FONT><BR><BR><B>Message from Servlet: </B>" + ab.getMsg() + "</body></html>");
        } catch (Exception ex) {
            Log.error(ex, "PingServlet2ServletRcv.doGet(...): general exception");
            res.sendError(500, "PingServlet2ServletRcv.doGet(...): general exception" + ex.toString());
        }

    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/prims/PingServlet2ServletRcv.java::com.ibm.websphere.samples.daytrader.web.prims.PingServlet2ServletRcv::doGet(HttpServletRequest, HttpServletResponse)|");
}
}

    /**
     * called when the class is loaded to initialize the servlet
     *
     * @param config
     *            ServletConfig:
     **/
    @Override
    public void init(ServletConfig config) throws ServletException {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/prims/PingServlet2ServletRcv.java::com.ibm.websphere.samples.daytrader.web.prims.PingServlet2ServletRcv::init(ServletConfig)|");

        super.init(config);
        initTime = new java.util.Date().toString();

    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/prims/PingServlet2ServletRcv.java::com.ibm.websphere.samples.daytrader.web.prims.PingServlet2ServletRcv::init(ServletConfig)|");
}
}
}