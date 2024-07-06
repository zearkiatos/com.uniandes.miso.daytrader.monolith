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

import javax.enterprise.context.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpSession;

import com.ibm.websphere.samples.daytrader.TradeAction;
import com.ibm.websphere.samples.daytrader.beans.RunStatsDataBean;
import com.ibm.websphere.samples.daytrader.direct.TradeDirect;
import com.ibm.websphere.samples.daytrader.util.Log;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import com.ibm.websphere.samples.daytrader.web.TradeBuildDB;

@Named("tradeconfig")
@RequestScoped
public class TradeConfigJSF {

    @Inject
    private ExternalContext facesExternalContext;

    private String runtimeMode = TradeConfig.runTimeModeNames[TradeConfig.getRunTimeMode()];
    private String orderProcessingMode = TradeConfig.orderProcessingModeNames[TradeConfig.getOrderProcessingMode()];
    //private String cachingType = TradeConfig.cachingTypeNames[TradeConfig.getCachingType()];
    //private int distributedMapCacheSize = TradeConfig.getDistributedMapCacheSize();
    private int maxUsers = TradeConfig.getMAX_USERS();
    private int maxQuotes = TradeConfig.getMAX_QUOTES();
    private int marketSummaryInterval = TradeConfig.getMarketSummaryInterval();
    private String webInterface = TradeConfig.webInterfaceNames[TradeConfig.getWebInterface()];
    private int primIterations = TradeConfig.getPrimIterations();
    private int percentSentToWebsocket = TradeConfig.getPercentSentToWebsocket();
    private boolean publishQuotePriceChange = TradeConfig.getPublishQuotePriceChange();
    private boolean longRun = TradeConfig.getLongRun();
    private boolean displayOrderAlerts = TradeConfig.getDisplayOrderAlerts();
    private boolean useRemoteEJBInterface = TradeConfig.useRemoteEJBInterface();
    private boolean actionTrace = TradeConfig.getActionTrace();
    private boolean trace = TradeConfig.getTrace();
    private String[] runtimeModeList = TradeConfig.runTimeModeNames;
    private String[] orderProcessingModeList = TradeConfig.orderProcessingModeNames;
    //private String[] cachingTypeList = TradeConfig.cachingTypeNames;
    private String[] webInterfaceList = TradeConfig.webInterfaceNames;
    private String result = "";

    public void updateConfig() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::updateConfig()|");

        String currentConfigStr = "\n\n########## Trade configuration update. Current config:\n\n";
        String runTimeModeStr = this.runtimeMode;
        if (runTimeModeStr != null) {
            try {
                for (int i = 0; i < runtimeModeList.length; i++) {
                    if (runTimeModeStr.equals(runtimeModeList[i])) {
                        TradeConfig.setRunTimeMode(i);
                    }
                }
            } catch (Exception e) {

                Log.error(e, "TradeConfigJSF.updateConfig(..): minor exception caught", "trying to set runtimemode to " + runTimeModeStr,
                        "reverting to current value");

            } // If the value is bad, simply revert to current
        }
        currentConfigStr += "\t\tRunTimeMode:\t\t\t" + TradeConfig.runTimeModeNames[TradeConfig.getRunTimeMode()] + "\n";

        TradeConfig.setUseRemoteEJBInterface(useRemoteEJBInterface);
        currentConfigStr += "\t\tUse Remote EJB Interface:\t" + TradeConfig.useRemoteEJBInterface() + "\n";
        
        String orderProcessingModeStr = this.orderProcessingMode;
        if (orderProcessingModeStr != null) {
            try {
                for (int i = 0; i < orderProcessingModeList.length; i++) {
                    if (orderProcessingModeStr.equals(orderProcessingModeList[i])) {
                        TradeConfig.orderProcessingMode = i;
                    }
                }
            } catch (Exception e) {
                Log.error(e, "TradeConfigJSF.updateConfig(..): minor exception caught", "trying to set orderProcessing to " + orderProcessingModeStr,
                        "reverting to current value");

            } // If the value is bad, simply revert to current
        }
        currentConfigStr += "\t\tOrderProcessingMode:\t\t" + TradeConfig.orderProcessingModeNames[TradeConfig.orderProcessingMode] + "\n";

        /*
        String cachingTypeStr = this.cachingType;
        if (cachingTypeStr != null) {
            try {
                for (int i = 0; i < cachingTypeList.length; i++) {
                    if (cachingTypeStr.equals(cachingTypeList[i])) {
                        TradeConfig.cachingType = i;
                    }
                }
            } catch (Exception e) {
                Log.error(e, "TradeConfigJSF.updateConfig(..): minor exception caught", "trying to set cachingType to " + cachingTypeStr,
                        "reverting to current value");

            } // If the value is bad, simply revert to current
        }
        currentConfigStr += "\t\tCachingType:\t\t\t" + TradeConfig.cachingTypeNames[TradeConfig.cachingType] + "\n";

        int distMapCacheSize = this.distributedMapCacheSize;

        try {
            TradeConfig.setDistributedMapCacheSize(distMapCacheSize);
        } catch (Exception e) {
            Log.error(e, "TradeConfigJSF.updateConfig(..): minor exception caught", "trying to set distributedMapCacheSize", "reverting to current value");

        } // If the value is bad, simply revert to current

        currentConfigStr += "\t\tDMapCacheSize:\t\t\t" + TradeConfig.getDistributedMapCacheSize() + "\n";
		*/
        
        String webInterfaceStr = webInterface;
        if (webInterfaceStr != null) {
            try {
                for (int i = 0; i < webInterfaceList.length; i++) {
                    if (webInterfaceStr.equals(webInterfaceList[i])) {
                        TradeConfig.webInterface = i;
                    }
                }
            } catch (Exception e) {
                Log.error(e, "TradeConfigJSF.updateConfig(..): minor exception caught", "trying to set WebInterface to " + webInterfaceStr,
                        "reverting to current value");

            } // If the value is bad, simply revert to current
        }
        currentConfigStr += "\t\tWeb Interface:\t\t\t" + TradeConfig.webInterfaceNames[TradeConfig.webInterface] + "\n";

        TradeConfig.setMAX_USERS(maxUsers);
        TradeConfig.setMAX_QUOTES(maxQuotes);

        currentConfigStr += "\t\tTrade  Users:\t\t\t" + TradeConfig.getMAX_USERS() + "\n";
        currentConfigStr += "\t\tTrade Quotes:\t\t\t" + TradeConfig.getMAX_QUOTES() + "\n";

        TradeConfig.setMarketSummaryInterval(marketSummaryInterval);

        currentConfigStr += "\t\tMarket Summary Interval:\t" + TradeConfig.getMarketSummaryInterval() + "\n";

        TradeConfig.setPrimIterations(primIterations);

        currentConfigStr += "\t\tPrimitive Iterations:\t\t" + TradeConfig.getPrimIterations() + "\n";

        TradeConfig.setPublishQuotePriceChange(publishQuotePriceChange);
        currentConfigStr += "\t\tTradeStreamer MDB Enabled:\t" + TradeConfig.getPublishQuotePriceChange() + "\n";

        TradeConfig.setPercentSentToWebsocket(percentSentToWebsocket);
        currentConfigStr += "\t\t% of trades on Websocket:\t" + TradeConfig.getPercentSentToWebsocket() + "\n";
        
        TradeConfig.setLongRun(longRun);
        currentConfigStr += "\t\tLong Run Enabled:\t\t" + TradeConfig.getLongRun() + "\n";

        TradeConfig.setDisplayOrderAlerts(displayOrderAlerts);
        currentConfigStr += "\t\tDisplay Order Alerts:\t\t" + TradeConfig.getDisplayOrderAlerts() + "\n";

        Log.setTrace(trace);
        currentConfigStr += "\t\tTrace Enabled:\t\t\t" + TradeConfig.getTrace() + "\n";

        Log.setActionTrace(actionTrace);
        currentConfigStr += "\t\tAction Trace Enabled:\t\t" + TradeConfig.getActionTrace() + "\n";

        System.out.println(currentConfigStr);
        setResult("DayTrader Configuration Updated");
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::updateConfig()|");
}
}

    public String resetTrade() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::resetTrade()|");

        RunStatsDataBean runStatsData = new RunStatsDataBean();
        TradeConfig currentConfig = new TradeConfig();
        HttpSession session = (HttpSession) facesExternalContext.getSession(true);
        try {
        	// Do not inject TradeAction on this class because we dont want the 
        	// config to initialiaze at startup. 
            TradeAction tradeAction = new TradeAction();
            runStatsData = tradeAction.resetTrade(false);
            session.setAttribute("runStatsData", runStatsData);
            session.setAttribute("tradeConfig", currentConfig);
            result += "Trade Reset completed successfully";

        } catch (Exception e) {
            result += "Trade Reset Error  - see log for details";
            session.setAttribute("result", result);
            Log.error(e, result);
        }

        return "stats";
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::resetTrade()|");
}
}

    public String populateDatabase() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::populateDatabase()|");


        try {
            new TradeBuildDB(new java.io.PrintWriter(System.out), null);
        } catch (Exception e) {
            e.printStackTrace();
        }       

        result = "TradeBuildDB: **** DayTrader Database Built - " + TradeConfig.getMAX_USERS() + " users created, " + TradeConfig.getMAX_QUOTES()
                + " quotes created. ****<br/>";
        result += "TradeBuildDB: **** Check System.Out for any errors. ****<br/>";

        return "database";
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::populateDatabase()|");
}
}

    public String buildDatabaseTables() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::buildDatabaseTables()|");

        try {

            //Find out the Database being used
            TradeDirect tradeDirect = new TradeDirect();

            String dbProductName = null;
            try {
                dbProductName = tradeDirect.checkDBProductName();
            } catch (Exception e) {
                Log.error(e, "TradeBuildDB: Unable to check DB Product name");
            }
            if (dbProductName == null) {
                result += "TradeBuildDB: **** Unable to check DB Product name, please check Database/AppServer configuration and retry ****<br/>";
                return "database";
            }

            String ddlFile = null;
            //Locate DDL file for the specified database
            try {
                result = result + "TradeBuildDB: **** Database Product detected: " + dbProductName + " ****<br/>";
                if (dbProductName.startsWith("DB2/")) { // if db is DB2
                    ddlFile = "/dbscripts/db2/Table.ddl";
                } else if (dbProductName.startsWith("Apache Derby")) { //if db is Derby
                    ddlFile = "/dbscripts/derby/Table.ddl";
                } else if (dbProductName.startsWith("Oracle")) { // if the Db is Oracle
                    ddlFile = "/dbscripts/oracle/Table.ddl";
                } else { // Unsupported "Other" Database
                    ddlFile = "/dbscripts/derby/Table.ddl";
                    result = result + "TradeBuildDB: **** This Database is unsupported/untested use at your own risk ****<br/>";
                }

                result = result + "TradeBuildDB: **** The DDL file at path" + ddlFile + " will be used ****<br/>";
            } catch (Exception e) {
                Log.error(e, "TradeBuildDB: Unable to locate DDL file for the specified database");
                result = result + "TradeBuildDB: **** Unable to locate DDL file for the specified database ****<br/>";
                return "database";
            }

            new TradeBuildDB(new java.io.PrintWriter(System.out), facesExternalContext.getResourceAsStream(ddlFile));

            result = result + "TradeBuildDB: **** DayTrader Database Created, Check System.Out for any errors. ****<br/>";

        } catch (Exception e) {
            e.printStackTrace();
        }

        // Go to configure.xhtml
        return "database";
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::buildDatabaseTables()|");
}
}

    public void setRuntimeMode(String runtimeMode) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::setRuntimeMode(String)|");

        this.runtimeMode = runtimeMode;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::setRuntimeMode(String)|");
}
}

    public String getRuntimeMode() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::getRuntimeMode()|");

        return runtimeMode;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::getRuntimeMode()|");
}
}

    public void setOrderProcessingMode(String orderProcessingMode) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::setOrderProcessingMode(String)|");

        this.orderProcessingMode = orderProcessingMode;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::setOrderProcessingMode(String)|");
}
}

    public String getOrderProcessingMode() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::getOrderProcessingMode()|");

        return orderProcessingMode;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::getOrderProcessingMode()|");
}
}
    /*
    public void setCachingType(String cachingType) {
        this.cachingType = cachingType;
    }

    public String getCachingType() {
        return cachingType;
    }

    public void setDistributedMapCacheSize(int distributedMapCacheSize) {
        this.distributedMapCacheSize = distributedMapCacheSize;
    }

    public int getDistributedMapCacheSize() {
        return distributedMapCacheSize;
    }*/

    public void setMaxUsers(int maxUsers) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::setMaxUsers(int)|");

        this.maxUsers = maxUsers;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::setMaxUsers(int)|");
}
}

    public int getMaxUsers() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::getMaxUsers()|");

        return maxUsers;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::getMaxUsers()|");
}
}

    public void setmaxQuotes(int maxQuotes) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::setmaxQuotes(int)|");

        this.maxQuotes = maxQuotes;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::setmaxQuotes(int)|");
}
}

    public int getMaxQuotes() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::getMaxQuotes()|");

        return maxQuotes;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::getMaxQuotes()|");
}
}

    public void setMarketSummaryInterval(int marketSummaryInterval) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::setMarketSummaryInterval(int)|");

        this.marketSummaryInterval = marketSummaryInterval;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::setMarketSummaryInterval(int)|");
}
}

    public int getMarketSummaryInterval() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::getMarketSummaryInterval()|");

        return marketSummaryInterval;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::getMarketSummaryInterval()|");
}
}

    public void setPrimIterations(int primIterations) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::setPrimIterations(int)|");

        this.primIterations = primIterations;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::setPrimIterations(int)|");
}
}

    public int getPrimIterations() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::getPrimIterations()|");

        return primIterations;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::getPrimIterations()|");
}
}

    public void setPublishQuotePriceChange(boolean publishQuotePriceChange) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::setPublishQuotePriceChange(boolean)|");

        this.publishQuotePriceChange = publishQuotePriceChange;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::setPublishQuotePriceChange(boolean)|");
}
}

    public boolean isPublishQuotePriceChange() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::isPublishQuotePriceChange()|");

        return publishQuotePriceChange;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::isPublishQuotePriceChange()|");
}
}
    
    public void setPercentSentToWebsocket(int percentSentToWebsocket) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::setPercentSentToWebsocket(int)|");

        this. percentSentToWebsocket =  percentSentToWebsocket;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::setPercentSentToWebsocket(int)|");
}
}

    public int getPercentSentToWebsocket() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::getPercentSentToWebsocket()|");

        return  percentSentToWebsocket;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::getPercentSentToWebsocket()|");
}
}

    public void setDisplayOrderAlerts(boolean displayOrderAlerts) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::setDisplayOrderAlerts(boolean)|");

        this.displayOrderAlerts = displayOrderAlerts;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::setDisplayOrderAlerts(boolean)|");
}
}

    public boolean isDisplayOrderAlerts() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::isDisplayOrderAlerts()|");

        return displayOrderAlerts;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::isDisplayOrderAlerts()|");
}
}
    
    public void setUseRemoteEJBInterface(boolean useRemoteEJBInterface) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::setUseRemoteEJBInterface(boolean)|");

        this.useRemoteEJBInterface = useRemoteEJBInterface;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::setUseRemoteEJBInterface(boolean)|");
}
}

    public boolean isUseRemoteEJBInterface() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::isUseRemoteEJBInterface()|");

        return useRemoteEJBInterface;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::isUseRemoteEJBInterface()|");
}
}

    public void setLongRun(boolean longRun) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::setLongRun(boolean)|");

        this.longRun = longRun;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::setLongRun(boolean)|");
}
}

    public boolean isLongRun() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::isLongRun()|");

        return longRun;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::isLongRun()|");
}
}

    public void setTrace(boolean trace) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::setTrace(boolean)|");

        this.trace = trace;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::setTrace(boolean)|");
}
}

    public boolean isTrace() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::isTrace()|");

        return trace;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::isTrace()|");
}
}

    public void setRuntimeModeList(String[] runtimeModeList) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::setRuntimeModeList(String[])|");

        this.runtimeModeList = runtimeModeList;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::setRuntimeModeList(String[])|");
}
}

    public String[] getRuntimeModeList() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::getRuntimeModeList()|");

        return runtimeModeList;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::getRuntimeModeList()|");
}
}

    public void setOrderProcessingModeList(String[] orderProcessingModeList) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::setOrderProcessingModeList(String[])|");

        this.orderProcessingModeList = orderProcessingModeList;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::setOrderProcessingModeList(String[])|");
}
}

    public String[] getOrderProcessingModeList() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::getOrderProcessingModeList()|");

        return orderProcessingModeList;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::getOrderProcessingModeList()|");
}
}

    /*public void setCachingTypeList(String[] cachingTypeList) {
        this.cachingTypeList = cachingTypeList;
    }

    public String[] getCachingTypeList() {
        return cachingTypeList;
    }*/

    public void setWebInterface(String webInterface) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::setWebInterface(String)|");

        this.webInterface = webInterface;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::setWebInterface(String)|");
}
}

    public String getWebInterface() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::getWebInterface()|");

        return webInterface;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::getWebInterface()|");
}
}

    public void setWebInterfaceList(String[] webInterfaceList) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::setWebInterfaceList(String[])|");

        this.webInterfaceList = webInterfaceList;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::setWebInterfaceList(String[])|");
}
}

    public String[] getWebInterfaceList() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::getWebInterfaceList()|");

        return webInterfaceList;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::getWebInterfaceList()|");
}
}

    public void setActionTrace(boolean actionTrace) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::setActionTrace(boolean)|");

        this.actionTrace = actionTrace;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::setActionTrace(boolean)|");
}
}

    public boolean isActionTrace() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::isActionTrace()|");

        return actionTrace;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::isActionTrace()|");
}
}

    public void setResult(String result) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::setResult(String)|");

        this.result = result;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::setResult(String)|");
}
}

    public String getResult() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::getResult()|");

        return result;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-web/src/main/java/com/ibm/websphere/samples/daytrader/web/jsf/TradeConfigJSF.java::com.ibm.websphere.samples.daytrader.web.jsf.TradeConfigJSF::getResult()|");
}
}

}
