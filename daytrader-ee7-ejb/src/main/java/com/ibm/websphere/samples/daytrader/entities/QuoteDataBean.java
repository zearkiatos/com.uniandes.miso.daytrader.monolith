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

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.ibm.websphere.samples.daytrader.util.Log;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;

@Entity(name = "quoteejb")
@Table(name = "quoteejb")
@NamedQueries({
        @NamedQuery(name = "quoteejb.allQuotes", query = "SELECT q FROM quoteejb q")})
@NamedNativeQueries({ @NamedNativeQuery(name = "quoteejb.quoteForUpdate", query = "select * from quoteejb q where q.symbol=? for update", resultClass = com.ibm.websphere.samples.daytrader.entities.QuoteDataBean.class) })
public class QuoteDataBean implements Serializable {

    /* Accessor methods for persistent fields */

    private static final long serialVersionUID = 1847932261895838791L;

    @Id
    @NotNull
    @Column(name = "SYMBOL", nullable = false)
    private String symbol; /* symbol */

    @Column(name = "COMPANYNAME")
    private String companyName; /* companyName */

    @NotNull
    @Column(name = "VOLUME", nullable = false)
    private double volume; /* volume */

    @Column(name = "PRICE")
    private BigDecimal price; /* price */

    @Column(name = "OPEN1")
    private BigDecimal open1; /* open1 price */

    @Column(name = "LOW")
    private BigDecimal low; /* low price */

    @Column(name = "HIGH")
    private BigDecimal high; /* high price */

    @NotNull
    @Column(name = "CHANGE1", nullable = false)
    private double change1; /* price change */

    /* Accessor methods for relationship fields are not kept in the DataBean */

    public QuoteDataBean() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/QuoteDataBean.java::com.ibm.websphere.samples.daytrader.entities.QuoteDataBean::QuoteDataBean(String)|");

    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/QuoteDataBean.java::com.ibm.websphere.samples.daytrader.entities.QuoteDataBean::QuoteDataBean(String)|");
}
}

    public QuoteDataBean(String symbol, String companyName, double volume, BigDecimal price, BigDecimal open, BigDecimal low, BigDecimal high, double change) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/QuoteDataBean.java::com.ibm.websphere.samples.daytrader.entities.QuoteDataBean::QuoteDataBean(String, String, double, BigDecimal, BigDecimal, BigDecimal, BigDecimal, double)|");

        setSymbol(symbol);
        setCompanyName(companyName);
        setVolume(volume);
        setPrice(price);
        setOpen(open);
        setLow(low);
        setHigh(high);
        setChange(change);
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/QuoteDataBean.java::com.ibm.websphere.samples.daytrader.entities.QuoteDataBean::QuoteDataBean(String, String, double, BigDecimal, BigDecimal, BigDecimal, BigDecimal, double)|");
}
}

    public static QuoteDataBean getRandomInstance() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/QuoteDataBean.java::com.ibm.websphere.samples.daytrader.entities.QuoteDataBean::getRandomInstance()|");

        return new QuoteDataBean(TradeConfig.rndSymbol(), // symbol
                TradeConfig.rndSymbol() + " Incorporated", // Company Name
                TradeConfig.rndFloat(100000), // volume
                TradeConfig.rndBigDecimal(1000.0f), // price
                TradeConfig.rndBigDecimal(1000.0f), // open1
                TradeConfig.rndBigDecimal(1000.0f), // low
                TradeConfig.rndBigDecimal(1000.0f), // high
                TradeConfig.rndFloat(100000) // volume
        );
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/QuoteDataBean.java::com.ibm.websphere.samples.daytrader.entities.QuoteDataBean::getRandomInstance()|");
}
}

    // Create a "zero" value quoteDataBean for the given symbol
    public QuoteDataBean(String symbol) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/QuoteDataBean.java::com.ibm.websphere.samples.daytrader.entities.QuoteDataBean::QuoteDataBean(String)|");

        setSymbol(symbol);
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/QuoteDataBean.java::com.ibm.websphere.samples.daytrader.entities.QuoteDataBean::QuoteDataBean(String)|");
}
}

    @Override
    public String toString() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/QuoteDataBean.java::com.ibm.websphere.samples.daytrader.entities.QuoteDataBean::toString()|");

        return "\n\tQuote Data for: " + getSymbol() + "\n\t\t companyName: " + getCompanyName() + "\n\t\t      volume: " + getVolume() + "\n\t\t       price: "
                + getPrice() + "\n\t\t        open1: " + getOpen() + "\n\t\t         low: " + getLow() + "\n\t\t        high: " + getHigh()
                + "\n\t\t      change1: " + getChange();
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/QuoteDataBean.java::com.ibm.websphere.samples.daytrader.entities.QuoteDataBean::toString()|");
}
}

    public String toHTML() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/QuoteDataBean.java::com.ibm.websphere.samples.daytrader.entities.QuoteDataBean::toHTML()|");

        return "<BR>Quote Data for: " + getSymbol() + "<LI> companyName: " + getCompanyName() + "</LI>" + "<LI>      volume: " + getVolume() + "</LI>"
                + "<LI>       price: " + getPrice() + "</LI>" + "<LI>        open1: " + getOpen() + "</LI>" + "<LI>         low: " + getLow() + "</LI>"
                + "<LI>        high: " + getHigh() + "</LI>" + "<LI>      change1: " + getChange() + "</LI>";
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/QuoteDataBean.java::com.ibm.websphere.samples.daytrader.entities.QuoteDataBean::toHTML()|");
}
}

    public void print() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/QuoteDataBean.java::com.ibm.websphere.samples.daytrader.entities.QuoteDataBean::print()|");

        Log.log(this.toString());
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/QuoteDataBean.java::com.ibm.websphere.samples.daytrader.entities.QuoteDataBean::print()|");
}
}

    public String getSymbol() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/QuoteDataBean.java::com.ibm.websphere.samples.daytrader.entities.QuoteDataBean::getSymbol()|");

        return symbol;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/QuoteDataBean.java::com.ibm.websphere.samples.daytrader.entities.QuoteDataBean::getSymbol()|");
}
}

    public void setSymbol(String symbol) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/QuoteDataBean.java::com.ibm.websphere.samples.daytrader.entities.QuoteDataBean::setSymbol(String)|");

        this.symbol = symbol;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/QuoteDataBean.java::com.ibm.websphere.samples.daytrader.entities.QuoteDataBean::setSymbol(String)|");
}
}

    public String getCompanyName() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/QuoteDataBean.java::com.ibm.websphere.samples.daytrader.entities.QuoteDataBean::getCompanyName()|");

        return companyName;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/QuoteDataBean.java::com.ibm.websphere.samples.daytrader.entities.QuoteDataBean::getCompanyName()|");
}
}

    public void setCompanyName(String companyName) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/QuoteDataBean.java::com.ibm.websphere.samples.daytrader.entities.QuoteDataBean::setCompanyName(String)|");

        this.companyName = companyName;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/QuoteDataBean.java::com.ibm.websphere.samples.daytrader.entities.QuoteDataBean::setCompanyName(String)|");
}
}

    public BigDecimal getPrice() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/QuoteDataBean.java::com.ibm.websphere.samples.daytrader.entities.QuoteDataBean::getPrice()|");

        return price;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/QuoteDataBean.java::com.ibm.websphere.samples.daytrader.entities.QuoteDataBean::getPrice()|");
}
}

    public void setPrice(BigDecimal price) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/QuoteDataBean.java::com.ibm.websphere.samples.daytrader.entities.QuoteDataBean::setPrice(BigDecimal)|");

        this.price = price;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/QuoteDataBean.java::com.ibm.websphere.samples.daytrader.entities.QuoteDataBean::setPrice(BigDecimal)|");
}
}

    public BigDecimal getOpen() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/QuoteDataBean.java::com.ibm.websphere.samples.daytrader.entities.QuoteDataBean::getOpen()|");

        return open1;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/QuoteDataBean.java::com.ibm.websphere.samples.daytrader.entities.QuoteDataBean::getOpen()|");
}
}

    public void setOpen(BigDecimal open) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/QuoteDataBean.java::com.ibm.websphere.samples.daytrader.entities.QuoteDataBean::setOpen(BigDecimal)|");

        this.open1 = open;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/QuoteDataBean.java::com.ibm.websphere.samples.daytrader.entities.QuoteDataBean::setOpen(BigDecimal)|");
}
}

    public BigDecimal getLow() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/QuoteDataBean.java::com.ibm.websphere.samples.daytrader.entities.QuoteDataBean::getLow()|");

        return low;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/QuoteDataBean.java::com.ibm.websphere.samples.daytrader.entities.QuoteDataBean::getLow()|");
}
}

    public void setLow(BigDecimal low) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/QuoteDataBean.java::com.ibm.websphere.samples.daytrader.entities.QuoteDataBean::setLow(BigDecimal)|");

        this.low = low;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/QuoteDataBean.java::com.ibm.websphere.samples.daytrader.entities.QuoteDataBean::setLow(BigDecimal)|");
}
}

    public BigDecimal getHigh() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/QuoteDataBean.java::com.ibm.websphere.samples.daytrader.entities.QuoteDataBean::getHigh()|");

        return high;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/QuoteDataBean.java::com.ibm.websphere.samples.daytrader.entities.QuoteDataBean::getHigh()|");
}
}

    public void setHigh(BigDecimal high) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/QuoteDataBean.java::com.ibm.websphere.samples.daytrader.entities.QuoteDataBean::setHigh(BigDecimal)|");

        this.high = high;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/QuoteDataBean.java::com.ibm.websphere.samples.daytrader.entities.QuoteDataBean::setHigh(BigDecimal)|");
}
}

    public double getChange() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/QuoteDataBean.java::com.ibm.websphere.samples.daytrader.entities.QuoteDataBean::getChange()|");

        return change1;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/QuoteDataBean.java::com.ibm.websphere.samples.daytrader.entities.QuoteDataBean::getChange()|");
}
}

    public void setChange(double change) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/QuoteDataBean.java::com.ibm.websphere.samples.daytrader.entities.QuoteDataBean::setChange(double)|");

        this.change1 = change;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/QuoteDataBean.java::com.ibm.websphere.samples.daytrader.entities.QuoteDataBean::setChange(double)|");
}
}

    public double getVolume() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/QuoteDataBean.java::com.ibm.websphere.samples.daytrader.entities.QuoteDataBean::getVolume()|");

        return volume;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/QuoteDataBean.java::com.ibm.websphere.samples.daytrader.entities.QuoteDataBean::getVolume()|");
}
}

    public void setVolume(double volume) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/QuoteDataBean.java::com.ibm.websphere.samples.daytrader.entities.QuoteDataBean::setVolume(double)|");

        this.volume = volume;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/QuoteDataBean.java::com.ibm.websphere.samples.daytrader.entities.QuoteDataBean::setVolume(double)|");
}
}

    @Override
    public int hashCode() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/QuoteDataBean.java::com.ibm.websphere.samples.daytrader.entities.QuoteDataBean::hashCode()|");

        int hash = 0;
        hash += (this.symbol != null ? this.symbol.hashCode() : 0);
        return hash;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/QuoteDataBean.java::com.ibm.websphere.samples.daytrader.entities.QuoteDataBean::hashCode()|");
}
}

    @Override
    public boolean equals(Object object) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/QuoteDataBean.java::com.ibm.websphere.samples.daytrader.entities.QuoteDataBean::equals(Object)|");

        
        if (!(object instanceof QuoteDataBean)) {
            return false;
        }
        QuoteDataBean other = (QuoteDataBean) object;
        if (this.symbol != other.symbol && (this.symbol == null || !this.symbol.equals(other.symbol))) {
            return false;
        }
        return true;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/entities/QuoteDataBean.java::com.ibm.websphere.samples.daytrader.entities.QuoteDataBean::equals(Object)|");
}
}
}