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
package com.ibm.websphere.samples.daytrader.entities;

import java.io.Serializable;
import java.math.BigDecimal;
//import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import com.ibm.websphere.samples.daytrader.util.Log;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;

@Entity(name = "orderejb")
@Table(name = "orderejb")
@NamedQueries({
        @NamedQuery(name = "orderejb.findByOrderfee", query = "SELECT o FROM orderejb o WHERE o.orderFee = :orderfee"),
        @NamedQuery(name = "orderejb.findByCompletiondate", query = "SELECT o FROM orderejb o WHERE o.completionDate = :completiondate"),
        @NamedQuery(name = "orderejb.findByOrdertype", query = "SELECT o FROM orderejb o WHERE o.orderType = :ordertype"),
        @NamedQuery(name = "orderejb.findByOrderstatus", query = "SELECT o FROM orderejb o WHERE o.orderStatus = :orderstatus"),
        @NamedQuery(name = "orderejb.findByPrice", query = "SELECT o FROM orderejb o WHERE o.price = :price"),
        @NamedQuery(name = "orderejb.findByQuantity", query = "SELECT o FROM orderejb o WHERE o.quantity = :quantity"),
        @NamedQuery(name = "orderejb.findByOpendate", query = "SELECT o FROM orderejb o WHERE o.openDate = :opendate"),
        @NamedQuery(name = "orderejb.findByOrderid", query = "SELECT o FROM orderejb o WHERE o.orderID = :orderid"),
        @NamedQuery(name = "orderejb.findByAccountAccountid", query = "SELECT o FROM orderejb o WHERE o.account.accountID = :accountAccountid"),
        @NamedQuery(name = "orderejb.findByQuoteSymbol", query = "SELECT o FROM orderejb o WHERE o.quote.symbol = :quoteSymbol"),
        @NamedQuery(name = "orderejb.findByHoldingHoldingid", query = "SELECT o FROM orderejb o WHERE o.holding.holdingID = :holdingHoldingid"),
        @NamedQuery(name = "orderejb.closedOrders", query = "SELECT o FROM orderejb o WHERE o.orderStatus = 'closed' AND o.account.profile.userID  = :userID"),
        @NamedQuery(name = "orderejb.completeClosedOrders", query = "UPDATE orderejb o SET o.orderStatus = 'completed' WHERE o.orderStatus = 'closed' AND o.account.profile.userID  = :userID") })
public class OrderDataBean implements Serializable {

    private static final long serialVersionUID = 120650490200739057L;

    @Id
    @TableGenerator(name = "orderIdGen", table = "KEYGENEJB", pkColumnName = "KEYNAME", valueColumnName = "KEYVAL", pkColumnValue = "order", allocationSize = 1000)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "orderIdGen")
    @Column(name = "ORDERID", nullable = false)
    private Integer orderID; /* orderID */

    @Column(name = "ORDERTYPE")
    private String orderType; /* orderType (buy, sell, etc.) */

    @Column(name = "ORDERSTATUS")
    private String orderStatus; /*
                                 * orderStatus (open, processing, completed,
                                 * closed, cancelled)
                                 */

    @Column(name = "OPENDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date openDate; /* openDate (when the order was entered) */

    @Column(name = "COMPLETIONDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date completionDate; /* completionDate */

    @NotNull
    @Column(name = "QUANTITY", nullable = false)
    private double quantity; /* quantity */

    @Column(name = "PRICE")
    private BigDecimal price; /* price */

    @Column(name = "ORDERFEE")
    private BigDecimal orderFee; /* price */

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ACCOUNT_ACCOUNTID")
    private AccountDataBean account;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "QUOTE_SYMBOL")
    private QuoteDataBean quote;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "HOLDING_HOLDINGID")
    private HoldingDataBean holding;

    /* Fields for relationship fields are not kept in the Data Bean */
    @Transient
    private String symbol;

    public OrderDataBean() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::OrderDataBean()|");

    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::OrderDataBean()|");
}
}

    public OrderDataBean(Integer orderID, String orderType, String orderStatus, Date openDate, Date completionDate, double quantity, BigDecimal price,
            BigDecimal orderFee, String symbol) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::OrderDataBean(Integer, String, String, Date, Date, double, BigDecimal, BigDecimal, String)|");

        setOrderID(orderID);
        setOrderType(orderType);
        setOrderStatus(orderStatus);
        setOpenDate(openDate);
        setCompletionDate(completionDate);
        setQuantity(quantity);
        setPrice(price);
        setOrderFee(orderFee);
        setSymbol(symbol);
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::OrderDataBean(Integer, String, String, Date, Date, double, BigDecimal, BigDecimal, String)|");
}
}

    public OrderDataBean(String orderType, String orderStatus, Date openDate, Date completionDate, double quantity, BigDecimal price, BigDecimal orderFee,
            AccountDataBean account, QuoteDataBean quote, HoldingDataBean holding) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::OrderDataBean(String, String, Date, Date, double, BigDecimal, BigDecimal, AccountDataBean, QuoteDataBean, HoldingDataBean)|");

        setOrderType(orderType);
        setOrderStatus(orderStatus);
        setOpenDate(openDate);
        setCompletionDate(completionDate);
        setQuantity(quantity);
        setPrice(price);
        setOrderFee(orderFee);
        setAccount(account);
        setQuote(quote);
        setHolding(holding);
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::OrderDataBean(String, String, Date, Date, double, BigDecimal, BigDecimal, AccountDataBean, QuoteDataBean, HoldingDataBean)|");
}
}

    public static OrderDataBean getRandomInstance() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::getRandomInstance()|");

        return new OrderDataBean(new Integer(TradeConfig.rndInt(100000)), TradeConfig.rndBoolean() ? "buy" : "sell", "open", new java.util.Date(
                TradeConfig.rndInt(Integer.MAX_VALUE)), new java.util.Date(TradeConfig.rndInt(Integer.MAX_VALUE)), TradeConfig.rndQuantity(),
                TradeConfig.rndBigDecimal(1000.0f), TradeConfig.rndBigDecimal(1000.0f), TradeConfig.rndSymbol());
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::getRandomInstance()|");
}
}

    @Override
    public String toString() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::toString()|");

        return "Order " + getOrderID() + "\n\t      orderType: " + getOrderType() + "\n\t    orderStatus: " + getOrderStatus() + "\n\t       openDate: "
                + getOpenDate() + "\n\t completionDate: " + getCompletionDate() + "\n\t       quantity: " + getQuantity() + "\n\t          price: "
                + getPrice() + "\n\t       orderFee: " + getOrderFee() + "\n\t         symbol: " + getSymbol();
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::toString()|");
}
}

    public String toHTML() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::toHTML()|");

        return "<BR>Order <B>" + getOrderID() + "</B>" + "<LI>      orderType: " + getOrderType() + "</LI>" + "<LI>    orderStatus: " + getOrderStatus()
                + "</LI>" + "<LI>       openDate: " + getOpenDate() + "</LI>" + "<LI> completionDate: " + getCompletionDate() + "</LI>"
                + "<LI>       quantity: " + getQuantity() + "</LI>" + "<LI>          price: " + getPrice() + "</LI>" + "<LI>       orderFee: " + getOrderFee()
                + "</LI>" + "<LI>         symbol: " + getSymbol() + "</LI>";
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::toHTML()|");
}
}

    public void print() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::print()|");

        Log.log(this.toString());
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::print()|");
}
}

    public Integer getOrderID() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::getOrderID()|");

        return orderID;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::getOrderID()|");
}
}

    public void setOrderID(Integer orderID) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::setOrderID(Integer)|");

        this.orderID = orderID;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::setOrderID(Integer)|");
}
}

    public String getOrderType() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::getOrderType()|");

        return orderType;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::getOrderType()|");
}
}

    public void setOrderType(String orderType) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::setOrderType(String)|");

        this.orderType = orderType;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::setOrderType(String)|");
}
}

    public String getOrderStatus() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::getOrderStatus()|");

        return orderStatus;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::getOrderStatus()|");
}
}

    public void setOrderStatus(String orderStatus) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::setOrderStatus(String)|");

        this.orderStatus = orderStatus;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::setOrderStatus(String)|");
}
}

    public Date getOpenDate() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::getOpenDate()|");

        return openDate;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::getOpenDate()|");
}
}

    public void setOpenDate(Date openDate) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::setOpenDate(Date)|");

        this.openDate = openDate;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::setOpenDate(Date)|");
}
}

    public Date getCompletionDate() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::getCompletionDate()|");

        return completionDate;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::getCompletionDate()|");
}
}

    public void setCompletionDate(Date completionDate) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::setCompletionDate(Date)|");

        this.completionDate = completionDate;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::setCompletionDate(Date)|");
}
}

    public double getQuantity() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::getQuantity()|");

        return quantity;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::getQuantity()|");
}
}

    public void setQuantity(double quantity) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::setQuantity(double)|");

        this.quantity = quantity;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::setQuantity(double)|");
}
}

    public BigDecimal getPrice() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::getPrice()|");

        return price;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::getPrice()|");
}
}

    public void setPrice(BigDecimal price) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::setPrice(BigDecimal)|");

        this.price = price;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::setPrice(BigDecimal)|");
}
}

    public BigDecimal getOrderFee() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::getOrderFee()|");

        return orderFee;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::getOrderFee()|");
}
}

    public void setOrderFee(BigDecimal orderFee) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::setOrderFee(BigDecimal)|");

        this.orderFee = orderFee;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::setOrderFee(BigDecimal)|");
}
}

    public String getSymbol() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::getSymbol()|");

        if (quote != null) {
            return quote.getSymbol();
        }
        return symbol;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::getSymbol()|");
}
}

    public void setSymbol(String symbol) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::setSymbol(String)|");

        this.symbol = symbol;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::setSymbol(String)|");
}
}

    public AccountDataBean getAccount() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::getAccount()|");

        return account;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::getAccount()|");
}
}

    public void setAccount(AccountDataBean account) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::setAccount(AccountDataBean)|");

        this.account = account;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::setAccount(AccountDataBean)|");
}
}

    public QuoteDataBean getQuote() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::getQuote()|");

        return quote;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::getQuote()|");
}
}

    public void setQuote(QuoteDataBean quote) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::setQuote(QuoteDataBean)|");

        this.quote = quote;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::setQuote(QuoteDataBean)|");
}
}

    public HoldingDataBean getHolding() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::getHolding()|");

        return holding;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::getHolding()|");
}
}

    public void setHolding(HoldingDataBean holding) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::setHolding(HoldingDataBean)|");

        this.holding = holding;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::setHolding(HoldingDataBean)|");
}
}

    public boolean isBuy() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::isBuy()|");

        String orderType = getOrderType();
        if (orderType.compareToIgnoreCase("buy") == 0) {
            return true;
        }
        return false;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::isBuy()|");
}
}

    public boolean isSell() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::isSell()|");

        String orderType = getOrderType();
        if (orderType.compareToIgnoreCase("sell") == 0) {
            return true;
        }
        return false;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::isSell()|");
}
}

    public boolean isOpen() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::isOpen()|");

        String orderStatus = getOrderStatus();
        if ((orderStatus.compareToIgnoreCase("open") == 0) || (orderStatus.compareToIgnoreCase("processing") == 0)) {
            return true;
        }
        return false;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::isOpen()|");
}
}

    public boolean isCompleted() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::isCompleted()|");

        String orderStatus = getOrderStatus();
        if ((orderStatus.compareToIgnoreCase("completed") == 0) || (orderStatus.compareToIgnoreCase("alertcompleted") == 0)
                || (orderStatus.compareToIgnoreCase("cancelled") == 0)) {
            return true;
        }
        return false;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::isCompleted()|");
}
}

    public boolean isCancelled() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::isCancelled()|");

        String orderStatus = getOrderStatus();
        if (orderStatus.compareToIgnoreCase("cancelled") == 0) {
            return true;
        }
        return false;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::isCancelled()|");
}
}

    public void cancel() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::cancel()|");

        setOrderStatus("cancelled");
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::cancel()|");
}
}

    @Override
    public int hashCode() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::hashCode()|");

        int hash = 0;
        hash += (this.orderID != null ? this.orderID.hashCode() : 0);
        return hash;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::hashCode()|");
}
}

    @Override
    public boolean equals(Object object) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::equals(Object)|");

        
        if (!(object instanceof OrderDataBean)) {
            return false;
        }
        OrderDataBean other = (OrderDataBean) object;
        if (this.orderID != other.orderID && (this.orderID == null || !this.orderID.equals(other.orderID))) {
            return false;
        }
        return true;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/OrderDataBean.java::com.ibm.websphere.samples.daytrader.entities.OrderDataBean::equals(Object)|");
}
}
}
