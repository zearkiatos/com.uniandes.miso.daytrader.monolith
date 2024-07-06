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
public class MDBStats extends java.util.HashMap<String, TimerStat> {

    private static final long serialVersionUID = -3759835921094193760L;
    // Singleton class
    private static MDBStats mdbStats = null;

    private MDBStats() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/util/MDBStats.java::com.ibm.websphere.samples.daytrader.util.MDBStats::MDBStats()|");

    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/util/MDBStats.java::com.ibm.websphere.samples.daytrader.util.MDBStats::MDBStats()|");
}
}

    public static synchronized MDBStats getInstance() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/util/MDBStats.java::com.ibm.websphere.samples.daytrader.util.MDBStats::getInstance()|");

        if (mdbStats == null) {
            mdbStats = new MDBStats();
        }
        return mdbStats;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/util/MDBStats.java::com.ibm.websphere.samples.daytrader.util.MDBStats::getInstance()|");
}
}

    public TimerStat addTiming(String type, long sendTime, long recvTime) {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/util/MDBStats.java::com.ibm.websphere.samples.daytrader.util.MDBStats::addTiming(String, long, long)|");

        TimerStat stats = null;
        synchronized (type) {

            stats = get(type);
            if (stats == null) {
                stats = new TimerStat();
            }

            long time = recvTime - sendTime;
            if (time > stats.getMax()) {
                stats.setMax(time);
            }
            if (time < stats.getMin()) {
                stats.setMin(time);
            }
            stats.setCount(stats.getCount() + 1);
            stats.setTotalTime(stats.getTotalTime() + time);

            put(type, stats);
        }
        return stats;
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/util/MDBStats.java::com.ibm.websphere.samples.daytrader.util.MDBStats::addTiming(String, long, long)|");
}
}

    public synchronized void reset() {
try {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/util/MDBStats.java::com.ibm.websphere.samples.daytrader.util.MDBStats::reset()|");

        clear();
    
}
finally {

java.lang.System.err.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting com.uniandes.miso.daytrader.monolith/daytrader-ee7-ejb/src/main/java/com/ibm/websphere/samples/daytrader/util/MDBStats.java::com.ibm.websphere.samples.daytrader.util.MDBStats::reset()|");
}
}

}
