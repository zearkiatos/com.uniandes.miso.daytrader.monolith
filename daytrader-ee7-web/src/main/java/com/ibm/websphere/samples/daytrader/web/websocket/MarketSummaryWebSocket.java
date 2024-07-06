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
package com.ibm.websphere.samples.daytrader.web.websocket;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

import javax.enterprise.event.Observes;
import javax.jms.Message;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.JsonValue;
import javax.websocket.CloseReason;
import javax.websocket.EndpointConfig;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import com.ibm.websphere.samples.daytrader.TradeAction;
import com.ibm.websphere.samples.daytrader.util.Log;
import com.ibm.websphere.samples.daytrader.util.WebSocketJMSMessage;


/** This class is a WebSocket EndPoint that sends the Market Summary in JSON form when requested 
 *  and sends stock price changes when received from an MDB through a CDI event
 * */

@ServerEndpoint(value = "/marketsummary",decoders=ActionDecoder.class)
public class MarketSummaryWebSocket {

	private static final Set<Session> sessions = Collections.synchronizedSet(new HashSet<Session>());
    private final CountDownLatch latch = new CountDownLatch(1);

    @OnOpen
    public void onOpen(final Session session, EndpointConfig ec) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/websocket/MarketSummaryWebSocket.java::com.ibm.websphere.samples.daytrader.web.websocket.MarketSummaryWebSocket::onOpen(Session, EndpointConfig)|");

        if (Log.doTrace()) {
            Log.trace("MarketSummaryWebSocket:onOpen -- session -->" + session + "<--");
        }

        sessions.add(session);
        latch.countDown();
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/websocket/MarketSummaryWebSocket.java::com.ibm.websphere.samples.daytrader.web.websocket.MarketSummaryWebSocket::onOpen(Session, EndpointConfig)|");
}
} 
    
    @OnMessage
    public void sendMarketSummary(ActionMessage message, Session currentSession) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/websocket/MarketSummaryWebSocket.java::com.ibm.websphere.samples.daytrader.web.websocket.MarketSummaryWebSocket::sendMarketSummary(ActionMessage, Session)|");


        String action = message.getDecodedAction();
        
        if (Log.doTrace()) {
            if (action != null ) {
                Log.trace("MarketSummaryWebSocket:sendMarketSummary -- received -->" + action + "<--");
            } else {
                Log.trace("MarketSummaryWebSocket:sendMarketSummary -- received -->null<--");
            }
        }
        
        if (action != null && action.equals("update")) {
            TradeAction tAction = new TradeAction();

            try {
                
                JsonObject mkSummary = tAction.getMarketSummary().toJSON();

                if (Log.doTrace()) {
                    Log.trace("MarketSummaryWebSocket:sendMarketSummary -- sending -->" + mkSummary + "<--");
                }
                
                // Make sure onopen is finished
                latch.await();
                
                if (RecentStockChangeList.isEmpty()) {
                    currentSession.getAsyncRemote().sendText(mkSummary.toString());
                    
                }
                else { // Merge Objects 
                    JsonObject recentChangeList = RecentStockChangeList.stockChangesInJSON();
                    currentSession.getAsyncRemote().sendText(mergeJsonObjects(mkSummary,recentChangeList).toString());
                }
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/websocket/MarketSummaryWebSocket.java::com.ibm.websphere.samples.daytrader.web.websocket.MarketSummaryWebSocket::sendMarketSummary(ActionMessage, Session)|");
}
}

    @OnError
    public void onError(Throwable t, Session currentSession) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/websocket/MarketSummaryWebSocket.java::com.ibm.websphere.samples.daytrader.web.websocket.MarketSummaryWebSocket::onError(Throwable, Session)|");

        if (Log.doTrace()) {
            Log.trace("MarketSummaryWebSocket:onError -- session -->" + currentSession + "<--");
        }
        t.printStackTrace();
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/websocket/MarketSummaryWebSocket.java::com.ibm.websphere.samples.daytrader.web.websocket.MarketSummaryWebSocket::onError(Throwable, Session)|");
}
}

    @OnClose
    public void onClose(Session session, CloseReason reason) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/websocket/MarketSummaryWebSocket.java::com.ibm.websphere.samples.daytrader.web.websocket.MarketSummaryWebSocket::onClose(Session, CloseReason)|");


        if (Log.doTrace()) {
            Log.trace("MarketSummaryWebSocket:onClose -- session -->" + session + "<--");
        }

        sessions.remove(session);

    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/websocket/MarketSummaryWebSocket.java::com.ibm.websphere.samples.daytrader.web.websocket.MarketSummaryWebSocket::onClose(Session, CloseReason)|");
}
}
    
    public static void onJMSMessage(@Observes @WebSocketJMSMessage Message message) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/websocket/MarketSummaryWebSocket.java::com.ibm.websphere.samples.daytrader.web.websocket.MarketSummaryWebSocket::onJMSMessage(Message)|");

    	
    	if (Log.doTrace()) {
            Log.trace("MarketSummaryWebSocket:onJMSMessage");
        }
    	
    	RecentStockChangeList.addStockChange(message);
        
        JsonObject stockChangeJson = RecentStockChangeList.stockChangesInJSON();
        
        synchronized(sessions) {
            for (Session s : sessions) {
                if (s.isOpen()) {
                    s.getAsyncRemote().sendText(stockChangeJson.toString());
                }
            }
        }
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/websocket/MarketSummaryWebSocket.java::com.ibm.websphere.samples.daytrader.web.websocket.MarketSummaryWebSocket::onJMSMessage(Message)|");
}
}    
    
    private JsonObject mergeJsonObjects(JsonObject obj1, JsonObject obj2) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/websocket/MarketSummaryWebSocket.java::com.ibm.websphere.samples.daytrader.web.websocket.MarketSummaryWebSocket::mergeJsonObjects(JsonObject, JsonObject)|");

        
        JsonObjectBuilder jObjectBuilder = Json.createObjectBuilder();
        
        Set<String> keys1 = obj1.keySet();
        Iterator<String> iter1 = keys1.iterator();
        
        while(iter1.hasNext()) {
            String key = (String)iter1.next();
            JsonValue value = obj1.get(key);
            
            jObjectBuilder.add(key, value);
            
        }
        
        Set<String> keys2 = obj2.keySet();
        Iterator<String> iter2 = keys2.iterator();
        
        while(iter2.hasNext()) {
            String key = (String)iter2.next();
            JsonValue value = obj2.get(key);
            
            jObjectBuilder.add(key, value);
            
        }
        
        return jObjectBuilder.build();
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/websocket/MarketSummaryWebSocket.java::com.ibm.websphere.samples.daytrader.web.websocket.MarketSummaryWebSocket::mergeJsonObjects(JsonObject, JsonObject)|");
}
}
}
