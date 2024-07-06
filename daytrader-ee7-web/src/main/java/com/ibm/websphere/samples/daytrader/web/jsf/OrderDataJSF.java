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
package com.ibm.websphere.samples.daytrader.web.jsf;

import java.math.BigDecimal;
import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.faces.context.ExternalContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpSession;

import com.ibm.websphere.samples.daytrader.TradeAction;
import com.ibm.websphere.samples.daytrader.entities.OrderDataBean;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;

@Named("orderdata")
public class OrderDataJSF {
    @Inject
    private ExternalContext facesExternalContext;

    @Inject
    private TradeAction tradeAction;

    private OrderData[] allOrders;
    private OrderData orderData;

    public OrderDataJSF() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/OrderDataJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.OrderDataJSF::OrderDataJSF()|");

    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/OrderDataJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.OrderDataJSF::OrderDataJSF()|");
}
}

    public void getAllOrder() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/OrderDataJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.OrderDataJSF::getAllOrder()|");

        try {
            HttpSession session = (HttpSession) facesExternalContext.getSession(true);
            String userID = (String) session.getAttribute("uidBean");

            ArrayList<?> orderDataBeans = (TradeConfig.getLongRun() ? new ArrayList<Object>() : (ArrayList<?>) tradeAction.getOrders(userID));
            OrderData[] orders = new OrderData[orderDataBeans.size()];

            int count = 0;

            for (Object order : orderDataBeans) {
                OrderData r = new OrderData(((OrderDataBean) order).getOrderID(), ((OrderDataBean) order).getOrderStatus(),
                        ((OrderDataBean) order).getOpenDate(), ((OrderDataBean) order).getCompletionDate(), ((OrderDataBean) order).getOrderFee(),
                        ((OrderDataBean) order).getOrderType(), ((OrderDataBean) order).getQuantity(), ((OrderDataBean) order).getSymbol());
                r.setPrice(((OrderDataBean) order).getPrice());
                r.setTotal(r.getPrice().multiply(new BigDecimal(r.getQuantity())));
                orders[count] = r;
                count++;
            }

            setAllOrders(orders);
        } catch (Exception e) {
            e.printStackTrace();
        }

    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/OrderDataJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.OrderDataJSF::getAllOrder()|");
}
}

    @PostConstruct
    public void getOrder() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/OrderDataJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.OrderDataJSF::getOrder()|");

        HttpSession session = (HttpSession) facesExternalContext.getSession(true);
        OrderData order = (OrderData) session.getAttribute("orderData");

        if (order != null) {
            setOrderData(order);
        }
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/OrderDataJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.OrderDataJSF::getOrder()|");
}
}

    public void setAllOrders(OrderData[] allOrders) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/OrderDataJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.OrderDataJSF::setAllOrders(OrderData[])|");

        this.allOrders = allOrders;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/OrderDataJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.OrderDataJSF::setAllOrders(OrderData[])|");
}
}

    public OrderData[] getAllOrders() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/OrderDataJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.OrderDataJSF::getAllOrders()|");

        return allOrders;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/OrderDataJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.OrderDataJSF::getAllOrders()|");
}
}

    public void setOrderData(OrderData orderData) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/OrderDataJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.OrderDataJSF::setOrderData(OrderData)|");

        this.orderData = orderData;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/OrderDataJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.OrderDataJSF::setOrderData(OrderData)|");
}
}

    public OrderData getOrderData() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/OrderDataJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.OrderDataJSF::getOrderData()|");

        return orderData;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/OrderDataJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.OrderDataJSF::getOrderData()|");
}
}
}
