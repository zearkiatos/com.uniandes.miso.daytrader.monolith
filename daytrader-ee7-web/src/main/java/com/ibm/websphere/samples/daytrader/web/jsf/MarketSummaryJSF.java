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
import java.math.RoundingMode;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.ibm.websphere.samples.daytrader.TradeAction;
import com.ibm.websphere.samples.daytrader.beans.MarketSummaryDataBean;
import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import com.ibm.websphere.samples.daytrader.util.FinancialUtils;

@Named("marketdata")
@RequestScoped
public class MarketSummaryJSF {
    @Inject
    private TradeAction tradeAction;

    private BigDecimal TSIA;
    private BigDecimal openTSIA;
    private double volume;
    private QuoteData[] topGainers;
    private QuoteData[] topLosers;
    private Date summaryDate;

    // cache the gainPercent once computed for this bean
    private BigDecimal gainPercent = null;

    @PostConstruct
    public void getMarketSummary() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/MarketSummaryJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.MarketSummaryJSF::getMarketSummary()|");

        try {
            MarketSummaryDataBean marketSummaryData = tradeAction.getMarketSummary();
            setSummaryDate(marketSummaryData.getSummaryDate());
            setTSIA(marketSummaryData.getTSIA());
            setVolume(marketSummaryData.getVolume());
            setGainPercent(marketSummaryData.getGainPercent());

            Collection<?> topGainers = marketSummaryData.getTopGainers();

            Iterator<?> gainers = topGainers.iterator();
            int count = 0;
            QuoteData[] gainerjsfs = new QuoteData[5];

            while (gainers.hasNext() && (count < 5)) {
                QuoteDataBean quote = (QuoteDataBean) gainers.next();
                QuoteData r = new QuoteData(quote.getPrice(), quote.getOpen(), quote.getSymbol());
                gainerjsfs[count] = r;
                count++;
            }

            setTopGainers(gainerjsfs);

            Collection<?> topLosers = marketSummaryData.getTopLosers();

            QuoteData[] loserjsfs = new QuoteData[5];
            count = 0;
            Iterator<?> losers = topLosers.iterator();

            while (losers.hasNext() && (count < 5)) {
                QuoteDataBean quote = (QuoteDataBean) losers.next();
                QuoteData r = new QuoteData(quote.getPrice(), quote.getOpen(), quote.getSymbol());
                loserjsfs[count] = r;
                count++;
            }

            setTopLosers(loserjsfs);

        } catch (Exception e) {
            e.printStackTrace();
        }
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/MarketSummaryJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.MarketSummaryJSF::getMarketSummary()|");
}
}

    public void setTSIA(BigDecimal tSIA) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/MarketSummaryJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.MarketSummaryJSF::setTSIA(BigDecimal)|");

        TSIA = tSIA;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/MarketSummaryJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.MarketSummaryJSF::setTSIA(BigDecimal)|");
}
}

    public BigDecimal getTSIA() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/MarketSummaryJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.MarketSummaryJSF::getTSIA()|");

        return TSIA;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/MarketSummaryJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.MarketSummaryJSF::getTSIA()|");
}
}

    public void setOpenTSIA(BigDecimal openTSIA) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/MarketSummaryJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.MarketSummaryJSF::setOpenTSIA(BigDecimal)|");

        this.openTSIA = openTSIA;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/MarketSummaryJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.MarketSummaryJSF::setOpenTSIA(BigDecimal)|");
}
}

    public BigDecimal getOpenTSIA() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/MarketSummaryJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.MarketSummaryJSF::getOpenTSIA()|");

        return openTSIA;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/MarketSummaryJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.MarketSummaryJSF::getOpenTSIA()|");
}
}

    public void setVolume(double volume) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/MarketSummaryJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.MarketSummaryJSF::setVolume(double)|");

        this.volume = volume;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/MarketSummaryJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.MarketSummaryJSF::setVolume(double)|");
}
}

    public double getVolume() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/MarketSummaryJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.MarketSummaryJSF::getVolume()|");

        return volume;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/MarketSummaryJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.MarketSummaryJSF::getVolume()|");
}
}

    public void setTopGainers(QuoteData[] topGainers) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/MarketSummaryJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.MarketSummaryJSF::setTopGainers(QuoteData[])|");

        this.topGainers = topGainers;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/MarketSummaryJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.MarketSummaryJSF::setTopGainers(QuoteData[])|");
}
}

    public QuoteData[] getTopGainers() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/MarketSummaryJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.MarketSummaryJSF::getTopGainers()|");

        return topGainers;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/MarketSummaryJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.MarketSummaryJSF::getTopGainers()|");
}
}

    public void setTopLosers(QuoteData[] topLosers) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/MarketSummaryJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.MarketSummaryJSF::setTopLosers(QuoteData[])|");

        this.topLosers = topLosers;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/MarketSummaryJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.MarketSummaryJSF::setTopLosers(QuoteData[])|");
}
}

    public QuoteData[] getTopLosers() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/MarketSummaryJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.MarketSummaryJSF::getTopLosers()|");

        return topLosers;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/MarketSummaryJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.MarketSummaryJSF::getTopLosers()|");
}
}

    public void setSummaryDate(Date summaryDate) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/MarketSummaryJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.MarketSummaryJSF::setSummaryDate(Date)|");

        this.summaryDate = summaryDate;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/MarketSummaryJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.MarketSummaryJSF::setSummaryDate(Date)|");
}
}

    public Date getSummaryDate() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/MarketSummaryJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.MarketSummaryJSF::getSummaryDate()|");

        return summaryDate;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/MarketSummaryJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.MarketSummaryJSF::getSummaryDate()|");
}
}

    public void setGainPercent(BigDecimal gainPercent) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/MarketSummaryJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.MarketSummaryJSF::setGainPercent(BigDecimal)|");

        this.gainPercent = gainPercent.setScale(2,RoundingMode.HALF_UP);
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/MarketSummaryJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.MarketSummaryJSF::setGainPercent(BigDecimal)|");
}
}

    public BigDecimal getGainPercent() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/MarketSummaryJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.MarketSummaryJSF::getGainPercent()|");

        return gainPercent;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/MarketSummaryJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.MarketSummaryJSF::getGainPercent()|");
}
}

    public String getGainPercentHTML() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/MarketSummaryJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.MarketSummaryJSF::getGainPercentHTML()|");

        return FinancialUtils.printGainPercentHTML(gainPercent);
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/MarketSummaryJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.MarketSummaryJSF::getGainPercentHTML()|");
}
}

}
