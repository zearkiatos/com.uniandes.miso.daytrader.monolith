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

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ibm.websphere.samples.daytrader.util.Log;

/**
 *
 * PingServlet2JNDI performs a basic JNDI lookup of a JDBC DataSource
 *
 */

@WebServlet(name = "PingServlet2JNDI", urlPatterns = { "/servlet/PingServlet2JNDI" })
public class PingServlet2JNDI extends HttpServlet {

    private static final long serialVersionUID = -8236271998141415347L;
    private static String initTime;
    private static int hitCount;

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

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/prims/PingServlet2JNDI.java::com.ibm.websphere.samples.daytrader.web.prims.PingServlet2JNDI::doPost(HttpServletRequest, HttpServletResponse)|");

        doGet(req, res);
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/prims/PingServlet2JNDI.java::com.ibm.websphere.samples.daytrader.web.prims.PingServlet2JNDI::doPost(HttpServletRequest, HttpServletResponse)|");
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

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/prims/PingServlet2JNDI.java::com.ibm.websphere.samples.daytrader.web.prims.PingServlet2JNDI::doGet(HttpServletRequest, HttpServletResponse)|");

        res.setContentType("text/html");
        java.io.PrintWriter out = res.getWriter();

        StringBuffer output = new StringBuffer(100);

        try {
            output.append("<html><head><title>Ping JNDI -- lookup of JDBC DataSource</title></head>"
                    + "<body><HR><FONT size=\"+2\" color=\"#000066\">Ping JNDI -- lookup of JDBC DataSource</FONT><HR><FONT size=\"-1\" color=\"#000066\">Init time : "
                    + initTime);
            hitCount++;
            output.append("</FONT><BR>Hit Count: " + hitCount);
            output.append("<HR></body></html>");
            out.println(output.toString());
        } catch (Exception e) {
            Log.error(e, "PingServlet2JNDI -- error look up of a JDBC DataSource");
            res.sendError(500, "PingServlet2JNDI Exception caught: " + e.toString());
        }

    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/prims/PingServlet2JNDI.java::com.ibm.websphere.samples.daytrader.web.prims.PingServlet2JNDI::doGet(HttpServletRequest, HttpServletResponse)|");
}
}

    /**
     * returns a string of information about the servlet
     *
     * @return info String: contains info about the servlet
     **/
    @Override
    public String getServletInfo() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/prims/PingServlet2JNDI.java::com.ibm.websphere.samples.daytrader.web.prims.PingServlet2JNDI::getServletInfo()|");

        return "Basic JNDI look up of a JDBC DataSource";
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/prims/PingServlet2JNDI.java::com.ibm.websphere.samples.daytrader.web.prims.PingServlet2JNDI::getServletInfo()|");
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

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/prims/PingServlet2JNDI.java::com.ibm.websphere.samples.daytrader.web.prims.PingServlet2JNDI::init(ServletConfig)|");

        super.init(config);
        hitCount = 0;
        initTime = new java.util.Date().toString();
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/prims/PingServlet2JNDI.java::com.ibm.websphere.samples.daytrader.web.prims.PingServlet2JNDI::init(ServletConfig)|");
}
}
}