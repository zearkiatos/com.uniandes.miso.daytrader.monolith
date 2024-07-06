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

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.component.html.HtmlDataTable;
import javax.faces.context.ExternalContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpSession;

import com.ibm.websphere.samples.daytrader.TradeAction;
import com.ibm.websphere.samples.daytrader.entities.OrderDataBean;
import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import com.ibm.websphere.samples.daytrader.util.Log;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;

@Named("quotedata")
@RequestScoped
public class QuoteJSF {

    @Inject
    private ExternalContext facesExternalContext;

    @Inject
    private TradeAction tradeAction;

    private QuoteData[] quotes;
    private String symbols = null;
    private HtmlDataTable dataTable;
    private Integer quantity = 100;

    @PostConstruct
    public void getAllQuotes() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/QuoteJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.QuoteJSF::getAllQuotes()|");

        getQuotesBySymbols();
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/QuoteJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.QuoteJSF::getAllQuotes()|");
}
}

    public String getQuotesBySymbols() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/QuoteJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.QuoteJSF::getQuotesBySymbols()|");

        HttpSession session = (HttpSession) facesExternalContext.getSession(true);

        if (symbols == null && (session.getAttribute("symbols") == null)) {
            setSymbols("s:0,s:1,s:2,s:3,s:4");
            session.setAttribute("symbols", getSymbols());
        } else if (symbols == null && session.getAttribute("symbols") != null) {
            setSymbols((String) session.getAttribute("symbols"));
        }

        else {
            session.setAttribute("symbols", getSymbols());
        }

        java.util.StringTokenizer st = new java.util.StringTokenizer(symbols, " ,");
        QuoteData[] quoteDatas = new QuoteData[st.countTokens()];
        int count = 0;

        while (st.hasMoreElements()) {
            String symbol = st.nextToken();

            try {
                QuoteDataBean quoteData = tradeAction.getQuote(symbol);
                quoteDatas[count] = new QuoteData(quoteData.getOpen(), quoteData.getPrice(), quoteData.getSymbol(), quoteData.getHigh(), quoteData.getLow(),
                        quoteData.getCompanyName(), quoteData.getVolume(), quoteData.getChange());
                count++;
            } catch (Exception e) {
                Log.error(e.toString());
            }
        }
        setQuotes(quoteDatas);
        return "quotes";
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/QuoteJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.QuoteJSF::getQuotesBySymbols()|");
}
}

    public String buy() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/QuoteJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.QuoteJSF::buy()|");

        HttpSession session = (HttpSession) facesExternalContext.getSession(true);
        String userID = (String) session.getAttribute("uidBean");
        QuoteData quoteData = (QuoteData) dataTable.getRowData();
        OrderDataBean orderDataBean;

        try {
            orderDataBean = tradeAction.buy(userID, quoteData.getSymbol(), new Double(this.quantity).doubleValue(), TradeConfig.orderProcessingMode);
            OrderData orderData = new OrderData(orderDataBean.getOrderID(), orderDataBean.getOrderStatus(), orderDataBean.getOpenDate(),
                    orderDataBean.getCompletionDate(), orderDataBean.getOrderFee(), orderDataBean.getOrderType(), orderDataBean.getQuantity(),
                    orderDataBean.getSymbol());
            session.setAttribute("orderData", orderData);
        } catch (Exception e) {
            Log.error(e.toString());
            e.printStackTrace();
        }
        return "buy";
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/QuoteJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.QuoteJSF::buy()|");
}
}

    public void setQuotes(QuoteData[] quotes) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/QuoteJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.QuoteJSF::setQuotes(QuoteData[])|");

        this.quotes = quotes;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/QuoteJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.QuoteJSF::setQuotes(QuoteData[])|");
}
}

    public QuoteData[] getQuotes() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/QuoteJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.QuoteJSF::getQuotes()|");

        return quotes;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/QuoteJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.QuoteJSF::getQuotes()|");
}
}

    public void setSymbols(String symbols) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/QuoteJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.QuoteJSF::setSymbols(String)|");

        this.symbols = symbols;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/QuoteJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.QuoteJSF::setSymbols(String)|");
}
}

    public String getSymbols() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/QuoteJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.QuoteJSF::getSymbols()|");

        return symbols;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/QuoteJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.QuoteJSF::getSymbols()|");
}
}

    public void setDataTable(HtmlDataTable dataTable) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/QuoteJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.QuoteJSF::setDataTable(HtmlDataTable)|");

        this.dataTable = dataTable;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/QuoteJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.QuoteJSF::setDataTable(HtmlDataTable)|");
}
}

    public HtmlDataTable getDataTable() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/QuoteJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.QuoteJSF::getDataTable()|");

        return dataTable;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/QuoteJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.QuoteJSF::getDataTable()|");
}
}

    public void setQuantity(Integer quantity) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/QuoteJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.QuoteJSF::setQuantity(Integer)|");

        this.quantity = quantity;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/QuoteJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.QuoteJSF::setQuantity(Integer)|");
}
}

    public Integer getQuantity() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/QuoteJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.QuoteJSF::getQuantity()|");

        return quantity;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/QuoteJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.QuoteJSF::getQuantity()|");
}
}
}
