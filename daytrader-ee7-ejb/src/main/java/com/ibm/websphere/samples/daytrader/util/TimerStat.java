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
package com.ibm.websphere.samples.daytrader.util;

/**
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates. To enable and disable the creation of type
 * comments go to Window>Preferences>Java>Code Generation.
 */
public class TimerStat {

    private double min = 1000000000.0, max = 0.0, totalTime = 0.0;
    private int count;

    /**
     * Returns the count.
     *
     * @return int
     */
    public int getCount() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/util/TimerStat.java::com.ibm.websphere.samples.daytrader.util.TimerStat::getCount()|");

        return count;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/util/TimerStat.java::com.ibm.websphere.samples.daytrader.util.TimerStat::getCount()|");
}
}

    /**
     * Returns the max.
     *
     * @return double
     */
    public double getMax() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/util/TimerStat.java::com.ibm.websphere.samples.daytrader.util.TimerStat::getMax()|");

        return max;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/util/TimerStat.java::com.ibm.websphere.samples.daytrader.util.TimerStat::getMax()|");
}
}

    /**
     * Returns the min.
     *
     * @return double
     */
    public double getMin() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/util/TimerStat.java::com.ibm.websphere.samples.daytrader.util.TimerStat::getMin()|");

        return min;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/util/TimerStat.java::com.ibm.websphere.samples.daytrader.util.TimerStat::getMin()|");
}
}

    /**
     * Sets the count.
     *
     * @param count
     *            The count to set
     */
    public void setCount(int count) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/util/TimerStat.java::com.ibm.websphere.samples.daytrader.util.TimerStat::setCount(int)|");

        this.count = count;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/util/TimerStat.java::com.ibm.websphere.samples.daytrader.util.TimerStat::setCount(int)|");
}
}

    /**
     * Sets the max.
     *
     * @param max
     *            The max to set
     */
    public void setMax(double max) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/util/TimerStat.java::com.ibm.websphere.samples.daytrader.util.TimerStat::setMax(double)|");

        this.max = max;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/util/TimerStat.java::com.ibm.websphere.samples.daytrader.util.TimerStat::setMax(double)|");
}
}

    /**
     * Sets the min.
     *
     * @param min
     *            The min to set
     */
    public void setMin(double min) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/util/TimerStat.java::com.ibm.websphere.samples.daytrader.util.TimerStat::setMin(double)|");

        this.min = min;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/util/TimerStat.java::com.ibm.websphere.samples.daytrader.util.TimerStat::setMin(double)|");
}
}

    /**
     * Returns the totalTime.
     *
     * @return double
     */
    public double getTotalTime() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/util/TimerStat.java::com.ibm.websphere.samples.daytrader.util.TimerStat::getTotalTime()|");

        return totalTime;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/util/TimerStat.java::com.ibm.websphere.samples.daytrader.util.TimerStat::getTotalTime()|");
}
}

    /**
     * Sets the totalTime.
     *
     * @param totalTime
     *            The totalTime to set
     */
    public void setTotalTime(double totalTime) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/util/TimerStat.java::com.ibm.websphere.samples.daytrader.util.TimerStat::setTotalTime(double)|");

        this.totalTime = totalTime;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/util/TimerStat.java::com.ibm.websphere.samples.daytrader.util.TimerStat::setTotalTime(double)|");
}
}

    /**
     * Returns the max in Secs
     *
     * @return double
     */
    public double getMaxSecs() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/util/TimerStat.java::com.ibm.websphere.samples.daytrader.util.TimerStat::getMaxSecs()|");

        return max / 1000.0;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/util/TimerStat.java::com.ibm.websphere.samples.daytrader.util.TimerStat::getMaxSecs()|");
}
}

    /**
     * Returns the min in Secs
     *
     * @return double
     */
    public double getMinSecs() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/util/TimerStat.java::com.ibm.websphere.samples.daytrader.util.TimerStat::getMinSecs()|");

        return min / 1000.0;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/util/TimerStat.java::com.ibm.websphere.samples.daytrader.util.TimerStat::getMinSecs()|");
}
}

    /**
     * Returns the average time in Secs
     *
     * @return double
     */
    public double getAvgSecs() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/util/TimerStat.java::com.ibm.websphere.samples.daytrader.util.TimerStat::getAvgSecs()|");


        double avg = getTotalTime() / getCount();
        return avg / 1000.0;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/util/TimerStat.java::com.ibm.websphere.samples.daytrader.util.TimerStat::getAvgSecs()|");
}
}
}
