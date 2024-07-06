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
package com.ibm.websphere.samples.daytrader.beans;

import java.io.Serializable;

public class RunStatsDataBean implements Serializable {
    private static final long serialVersionUID = 4017778674103242167L;

    // Constructors
    public RunStatsDataBean() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/beans/RunStatsDataBean.java::com.ibm.websphere.samples.daytrader.beans.RunStatsDataBean::RunStatsDataBean()|");

    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/beans/RunStatsDataBean.java::com.ibm.websphere.samples.daytrader.beans.RunStatsDataBean::RunStatsDataBean()|");
}
}

    // count of trade users in the database (users w/ userID like 'uid:%')
    private int tradeUserCount;
    // count of trade stocks in the database (stocks w/ symbol like 's:%')
    private int tradeStockCount;

    // count of new registered users in this run (users w/ userID like 'ru:%')
    // -- random user
    private int newUserCount;

    // sum of logins by trade users
    private int sumLoginCount;
    // sum of logouts by trade users
    private int sumLogoutCount;

    // count of holdings of trade users
    private int holdingCount;

    // count of orders of trade users
    private int orderCount;
    // count of buy orders of trade users
    private int buyOrderCount;
    // count of sell orders of trade users
    private int sellOrderCount;
    // count of cancelled orders of trade users
    private int cancelledOrderCount;
    // count of open orders of trade users
    private int openOrderCount;
    // count of orders deleted during this trade Reset
    private int deletedOrderCount;

    @Override
    public String toString() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/beans/RunStatsDataBean.java::com.ibm.websphere.samples.daytrader.beans.RunStatsDataBean::toString()|");

        return "\n\tRunStatsData for reset at " + new java.util.Date() + "\n\t\t      tradeUserCount: " + getTradeUserCount() + "\n\t\t        newUserCount: "
                + getNewUserCount() + "\n\t\t       sumLoginCount: " + getSumLoginCount() + "\n\t\t      sumLogoutCount: " + getSumLogoutCount()
                + "\n\t\t        holdingCount: " + getHoldingCount() + "\n\t\t          orderCount: " + getOrderCount() + "\n\t\t       buyOrderCount: "
                + getBuyOrderCount() + "\n\t\t      sellOrderCount: " + getSellOrderCount() + "\n\t\t cancelledOrderCount: " + getCancelledOrderCount()
                + "\n\t\t      openOrderCount: " + getOpenOrderCount() + "\n\t\t   deletedOrderCount: " + getDeletedOrderCount();
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/beans/RunStatsDataBean.java::com.ibm.websphere.samples.daytrader.beans.RunStatsDataBean::toString()|");
}
}

    /**
     * Gets the tradeUserCount
     *
     * @return Returns a int
     */
    public int getTradeUserCount() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/beans/RunStatsDataBean.java::com.ibm.websphere.samples.daytrader.beans.RunStatsDataBean::getTradeUserCount()|");

        return tradeUserCount;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/beans/RunStatsDataBean.java::com.ibm.websphere.samples.daytrader.beans.RunStatsDataBean::getTradeUserCount()|");
}
}

    /**
     * Sets the tradeUserCount
     *
     * @param tradeUserCount
     *            The tradeUserCount to set
     */
    public void setTradeUserCount(int tradeUserCount) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/beans/RunStatsDataBean.java::com.ibm.websphere.samples.daytrader.beans.RunStatsDataBean::setTradeUserCount(int)|");

        this.tradeUserCount = tradeUserCount;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/beans/RunStatsDataBean.java::com.ibm.websphere.samples.daytrader.beans.RunStatsDataBean::setTradeUserCount(int)|");
}
}

    /**
     * Gets the newUserCount
     *
     * @return Returns a int
     */
    public int getNewUserCount() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/beans/RunStatsDataBean.java::com.ibm.websphere.samples.daytrader.beans.RunStatsDataBean::getNewUserCount()|");

        return newUserCount;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/beans/RunStatsDataBean.java::com.ibm.websphere.samples.daytrader.beans.RunStatsDataBean::getNewUserCount()|");
}
}

    /**
     * Sets the newUserCount
     *
     * @param newUserCount
     *            The newUserCount to set
     */
    public void setNewUserCount(int newUserCount) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/beans/RunStatsDataBean.java::com.ibm.websphere.samples.daytrader.beans.RunStatsDataBean::setNewUserCount(int)|");

        this.newUserCount = newUserCount;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/beans/RunStatsDataBean.java::com.ibm.websphere.samples.daytrader.beans.RunStatsDataBean::setNewUserCount(int)|");
}
}

    /**
     * Gets the sumLoginCount
     *
     * @return Returns a int
     */
    public int getSumLoginCount() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/beans/RunStatsDataBean.java::com.ibm.websphere.samples.daytrader.beans.RunStatsDataBean::getSumLoginCount()|");

        return sumLoginCount;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/beans/RunStatsDataBean.java::com.ibm.websphere.samples.daytrader.beans.RunStatsDataBean::getSumLoginCount()|");
}
}

    /**
     * Sets the sumLoginCount
     *
     * @param sumLoginCount
     *            The sumLoginCount to set
     */
    public void setSumLoginCount(int sumLoginCount) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/beans/RunStatsDataBean.java::com.ibm.websphere.samples.daytrader.beans.RunStatsDataBean::setSumLoginCount(int)|");

        this.sumLoginCount = sumLoginCount;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/beans/RunStatsDataBean.java::com.ibm.websphere.samples.daytrader.beans.RunStatsDataBean::setSumLoginCount(int)|");
}
}

    /**
     * Gets the sumLogoutCount
     *
     * @return Returns a int
     */
    public int getSumLogoutCount() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/beans/RunStatsDataBean.java::com.ibm.websphere.samples.daytrader.beans.RunStatsDataBean::getSumLogoutCount()|");

        return sumLogoutCount;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/beans/RunStatsDataBean.java::com.ibm.websphere.samples.daytrader.beans.RunStatsDataBean::getSumLogoutCount()|");
}
}

    /**
     * Sets the sumLogoutCount
     *
     * @param sumLogoutCount
     *            The sumLogoutCount to set
     */
    public void setSumLogoutCount(int sumLogoutCount) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/beans/RunStatsDataBean.java::com.ibm.websphere.samples.daytrader.beans.RunStatsDataBean::setSumLogoutCount(int)|");

        this.sumLogoutCount = sumLogoutCount;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/beans/RunStatsDataBean.java::com.ibm.websphere.samples.daytrader.beans.RunStatsDataBean::setSumLogoutCount(int)|");
}
}

    /**
     * Gets the holdingCount
     *
     * @return Returns a int
     */
    public int getHoldingCount() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/beans/RunStatsDataBean.java::com.ibm.websphere.samples.daytrader.beans.RunStatsDataBean::getHoldingCount()|");

        return holdingCount;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/beans/RunStatsDataBean.java::com.ibm.websphere.samples.daytrader.beans.RunStatsDataBean::getHoldingCount()|");
}
}

    /**
     * Sets the holdingCount
     *
     * @param holdingCount
     *            The holdingCount to set
     */
    public void setHoldingCount(int holdingCount) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/beans/RunStatsDataBean.java::com.ibm.websphere.samples.daytrader.beans.RunStatsDataBean::setHoldingCount(int)|");

        this.holdingCount = holdingCount;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/beans/RunStatsDataBean.java::com.ibm.websphere.samples.daytrader.beans.RunStatsDataBean::setHoldingCount(int)|");
}
}

    /**
     * Gets the buyOrderCount
     *
     * @return Returns a int
     */
    public int getBuyOrderCount() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/beans/RunStatsDataBean.java::com.ibm.websphere.samples.daytrader.beans.RunStatsDataBean::getBuyOrderCount()|");

        return buyOrderCount;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/beans/RunStatsDataBean.java::com.ibm.websphere.samples.daytrader.beans.RunStatsDataBean::getBuyOrderCount()|");
}
}

    /**
     * Sets the buyOrderCount
     *
     * @param buyOrderCount
     *            The buyOrderCount to set
     */
    public void setBuyOrderCount(int buyOrderCount) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/beans/RunStatsDataBean.java::com.ibm.websphere.samples.daytrader.beans.RunStatsDataBean::setBuyOrderCount(int)|");

        this.buyOrderCount = buyOrderCount;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/beans/RunStatsDataBean.java::com.ibm.websphere.samples.daytrader.beans.RunStatsDataBean::setBuyOrderCount(int)|");
}
}

    /**
     * Gets the sellOrderCount
     *
     * @return Returns a int
     */
    public int getSellOrderCount() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/beans/RunStatsDataBean.java::com.ibm.websphere.samples.daytrader.beans.RunStatsDataBean::getSellOrderCount()|");

        return sellOrderCount;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/beans/RunStatsDataBean.java::com.ibm.websphere.samples.daytrader.beans.RunStatsDataBean::getSellOrderCount()|");
}
}

    /**
     * Sets the sellOrderCount
     *
     * @param sellOrderCount
     *            The sellOrderCount to set
     */
    public void setSellOrderCount(int sellOrderCount) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/beans/RunStatsDataBean.java::com.ibm.websphere.samples.daytrader.beans.RunStatsDataBean::setSellOrderCount(int)|");

        this.sellOrderCount = sellOrderCount;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/beans/RunStatsDataBean.java::com.ibm.websphere.samples.daytrader.beans.RunStatsDataBean::setSellOrderCount(int)|");
}
}

    /**
     * Gets the cancelledOrderCount
     *
     * @return Returns a int
     */
    public int getCancelledOrderCount() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/beans/RunStatsDataBean.java::com.ibm.websphere.samples.daytrader.beans.RunStatsDataBean::getCancelledOrderCount()|");

        return cancelledOrderCount;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/beans/RunStatsDataBean.java::com.ibm.websphere.samples.daytrader.beans.RunStatsDataBean::getCancelledOrderCount()|");
}
}

    /**
     * Sets the cancelledOrderCount
     *
     * @param cancelledOrderCount
     *            The cancelledOrderCount to set
     */
    public void setCancelledOrderCount(int cancelledOrderCount) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/beans/RunStatsDataBean.java::com.ibm.websphere.samples.daytrader.beans.RunStatsDataBean::setCancelledOrderCount(int)|");

        this.cancelledOrderCount = cancelledOrderCount;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/beans/RunStatsDataBean.java::com.ibm.websphere.samples.daytrader.beans.RunStatsDataBean::setCancelledOrderCount(int)|");
}
}

    /**
     * Gets the openOrderCount
     *
     * @return Returns a int
     */
    public int getOpenOrderCount() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/beans/RunStatsDataBean.java::com.ibm.websphere.samples.daytrader.beans.RunStatsDataBean::getOpenOrderCount()|");

        return openOrderCount;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/beans/RunStatsDataBean.java::com.ibm.websphere.samples.daytrader.beans.RunStatsDataBean::getOpenOrderCount()|");
}
}

    /**
     * Sets the openOrderCount
     *
     * @param openOrderCount
     *            The openOrderCount to set
     */
    public void setOpenOrderCount(int openOrderCount) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/beans/RunStatsDataBean.java::com.ibm.websphere.samples.daytrader.beans.RunStatsDataBean::setOpenOrderCount(int)|");

        this.openOrderCount = openOrderCount;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/beans/RunStatsDataBean.java::com.ibm.websphere.samples.daytrader.beans.RunStatsDataBean::setOpenOrderCount(int)|");
}
}

    /**
     * Gets the deletedOrderCount
     *
     * @return Returns a int
     */
    public int getDeletedOrderCount() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/beans/RunStatsDataBean.java::com.ibm.websphere.samples.daytrader.beans.RunStatsDataBean::getDeletedOrderCount()|");

        return deletedOrderCount;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/beans/RunStatsDataBean.java::com.ibm.websphere.samples.daytrader.beans.RunStatsDataBean::getDeletedOrderCount()|");
}
}

    /**
     * Sets the deletedOrderCount
     *
     * @param deletedOrderCount
     *            The deletedOrderCount to set
     */
    public void setDeletedOrderCount(int deletedOrderCount) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/beans/RunStatsDataBean.java::com.ibm.websphere.samples.daytrader.beans.RunStatsDataBean::setDeletedOrderCount(int)|");

        this.deletedOrderCount = deletedOrderCount;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/beans/RunStatsDataBean.java::com.ibm.websphere.samples.daytrader.beans.RunStatsDataBean::setDeletedOrderCount(int)|");
}
}

    /**
     * Gets the orderCount
     *
     * @return Returns a int
     */
    public int getOrderCount() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/beans/RunStatsDataBean.java::com.ibm.websphere.samples.daytrader.beans.RunStatsDataBean::getOrderCount()|");

        return orderCount;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/beans/RunStatsDataBean.java::com.ibm.websphere.samples.daytrader.beans.RunStatsDataBean::getOrderCount()|");
}
}

    /**
     * Sets the orderCount
     *
     * @param orderCount
     *            The orderCount to set
     */
    public void setOrderCount(int orderCount) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/beans/RunStatsDataBean.java::com.ibm.websphere.samples.daytrader.beans.RunStatsDataBean::setOrderCount(int)|");

        this.orderCount = orderCount;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/beans/RunStatsDataBean.java::com.ibm.websphere.samples.daytrader.beans.RunStatsDataBean::setOrderCount(int)|");
}
}

    /**
     * Gets the tradeStockCount
     *
     * @return Returns a int
     */
    public int getTradeStockCount() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/beans/RunStatsDataBean.java::com.ibm.websphere.samples.daytrader.beans.RunStatsDataBean::getTradeStockCount()|");

        return tradeStockCount;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/beans/RunStatsDataBean.java::com.ibm.websphere.samples.daytrader.beans.RunStatsDataBean::getTradeStockCount()|");
}
}

    /**
     * Sets the tradeStockCount
     *
     * @param tradeStockCount
     *            The tradeStockCount to set
     */
    public void setTradeStockCount(int tradeStockCount) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/beans/RunStatsDataBean.java::com.ibm.websphere.samples.daytrader.beans.RunStatsDataBean::setTradeStockCount(int)|");

        this.tradeStockCount = tradeStockCount;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/beans/RunStatsDataBean.java::com.ibm.websphere.samples.daytrader.beans.RunStatsDataBean::setTradeStockCount(int)|");
}
}

}
