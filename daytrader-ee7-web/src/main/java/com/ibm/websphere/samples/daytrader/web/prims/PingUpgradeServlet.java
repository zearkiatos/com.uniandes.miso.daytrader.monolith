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

import javax.servlet.ReadListener;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpUpgradeHandler;
import javax.servlet.http.WebConnection;
import javax.servlet.annotation.WebServlet;

import com.ibm.websphere.samples.daytrader.util.Log;

@WebServlet(name = "PingUpgradeServlet", urlPatterns = { "/servlet/PingUpgradeServlet" }, asyncSupported=true)
public class PingUpgradeServlet extends HttpServlet {
    private static final long serialVersionUID = -6955518532146927509L;
   

    @Override
    protected void doGet(final HttpServletRequest req, final HttpServletResponse res) throws ServletException, IOException {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/prims/PingUpgradeServlet.java::com.ibm.websphere.samples.daytrader.web.prims.PingUpgradeServlet::doGet(HttpServletRequest, HttpServletResponse)|");

        doPost(req,res);
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/prims/PingUpgradeServlet.java::com.ibm.websphere.samples.daytrader.web.prims.PingUpgradeServlet::doGet(HttpServletRequest, HttpServletResponse)|");
}
}
    
    @Override
    protected void doPost(final HttpServletRequest req, final HttpServletResponse res) throws ServletException, IOException {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/prims/PingUpgradeServlet.java::com.ibm.websphere.samples.daytrader.web.prims.PingUpgradeServlet::doPost(HttpServletRequest, HttpServletResponse)|");

      
        if (Log.doTrace()) {
            Log.trace("PingUpgradeServlet:doPost");
        }
        
        if ("echo".equals(req.getHeader("Upgrade"))) {
            
            if (Log.doTrace()) {
                Log.trace("PingUpgradeServlet:doPost -- found echo, doing upgrade");
            }
            
            res.setStatus(101);
            res.setHeader("Upgrade", "echo");
            res.setHeader("Connection", "Upgrade");

            req.upgrade(Handler.class);          
          
        } else {
            
            if (Log.doTrace()) {
                Log.trace("PingUpgradeServlet:doPost -- did not find echo, no upgrade");
            }
            
            res.getWriter().println("No upgrade: " + req.getHeader("Upgrade"));
        }
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/prims/PingUpgradeServlet.java::com.ibm.websphere.samples.daytrader.web.prims.PingUpgradeServlet::doPost(HttpServletRequest, HttpServletResponse)|");
}
}

    public static class Handler implements HttpUpgradeHandler {
    
        @Override
        public void init(final WebConnection wc) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/prims/PingUpgradeServlet.java::com.ibm.websphere.samples.daytrader.web.prims.PingUpgradeServlet.Handler::init(WebConnection)|");

            Listener listener = null;
            try {
                listener = new Listener(wc);
              
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
      
            try {
                
                if (Log.doTrace()) {
                    Log.trace("PingUpgradeServlet$Handler.init() -- Initializing Handler");
                }
          
                // flush headers if any
                wc.getOutputStream().flush();
                wc.getInputStream().setReadListener(listener);
        
            } catch (IOException e) {
                throw new IllegalArgumentException(e);
            }
        
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/prims/PingUpgradeServlet.java::com.ibm.websphere.samples.daytrader.web.prims.PingUpgradeServlet.Handler::init(WebConnection)|");
}
}

        @Override
        public void destroy() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/prims/PingUpgradeServlet.java::com.ibm.websphere.samples.daytrader.web.prims.PingUpgradeServlet.Handler::destroy()|");

            if (Log.doTrace()) {
                Log.trace("PingUpgradeServlet$Handler.destroy() -- Destroying Handler");
            }
        
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/prims/PingUpgradeServlet.java::com.ibm.websphere.samples.daytrader.web.prims.PingUpgradeServlet.Handler::destroy()|");
}
}
    }

    private static class Listener implements ReadListener {
        private final WebConnection connection;
        private ServletInputStream input = null;
        private ServletOutputStream output = null;
        
        private Listener(final WebConnection connection) throws IOException  {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/prims/PingUpgradeServlet.java::com.ibm.websphere.samples.daytrader.web.prims.PingUpgradeServlet.Listener::Listener(WebConnection)|");

            this.connection = connection;
            this.input = connection.getInputStream();
            this.output = connection.getOutputStream();
        
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/prims/PingUpgradeServlet.java::com.ibm.websphere.samples.daytrader.web.prims.PingUpgradeServlet.Listener::Listener(WebConnection)|");
}
}

        @Override
        public void onDataAvailable() throws IOException {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/prims/PingUpgradeServlet.java::com.ibm.websphere.samples.daytrader.web.prims.PingUpgradeServlet.Listener::onDataAvailable()|");

            
            if (Log.doTrace()) {
                Log.trace("PingUpgradeServlet$Listener.onDataAvailable() called");
            }
            
            byte[] data = new byte[1024];
            int len = -1;
            
            while (input.isReady()  && (len = input.read(data)) != -1) {
                    String dataRead = new String(data, 0, len);
                    
                    if (Log.doTrace()) {
                        Log.trace("PingUpgradeServlet$Listener.onDataAvailable() -- Adding data to queue -->" + dataRead + "<--");
                    }
                    
                    output.println(dataRead);
                    output.flush();
            }
            
            closeConnection();
        
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/prims/PingUpgradeServlet.java::com.ibm.websphere.samples.daytrader.web.prims.PingUpgradeServlet.Listener::onDataAvailable()|");
}
}

        private void closeConnection() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/prims/PingUpgradeServlet.java::com.ibm.websphere.samples.daytrader.web.prims.PingUpgradeServlet.Listener::closeConnection()|");

            try {
                connection.close();
            } catch (Exception e) {
                if (Log.doTrace()) {
                    Log.error(e.toString());
                }
            }
        
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/prims/PingUpgradeServlet.java::com.ibm.websphere.samples.daytrader.web.prims.PingUpgradeServlet.Listener::closeConnection()|");
}
}
        
        
        @Override
        public void onAllDataRead() throws IOException {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/prims/PingUpgradeServlet.java::com.ibm.websphere.samples.daytrader.web.prims.PingUpgradeServlet.Listener::onAllDataRead()|");

            closeConnection();
        
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/prims/PingUpgradeServlet.java::com.ibm.websphere.samples.daytrader.web.prims.PingUpgradeServlet.Listener::onAllDataRead()|");
}
}

        @Override
        public void onError(final Throwable t) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/prims/PingUpgradeServlet.java::com.ibm.websphere.samples.daytrader.web.prims.PingUpgradeServlet.Listener::onError(Throwable)|");

            closeConnection();
        
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/prims/PingUpgradeServlet.java::com.ibm.websphere.samples.daytrader.web.prims.PingUpgradeServlet.Listener::onError(Throwable)|");
}
}
    }
}