/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.rocketmq.connect.cassandra.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Config {
    private static final Logger LOG = LoggerFactory.getLogger(Config.class);

    /* Database Connection Config */
    private String dbUrl;
    private String dbPort;
    private String localDataCenter;
    private String dbUsername;
    private String dbPassword;
    private String dataType;
    private String rocketmqTopic;

    private List tableWhitelist;
    private List tableBlacklist;
    private String whiteDataBase;
    private String whiteTable;

    public static final String CONN_TASK_PARALLELISM = "task-parallelism";

    public static final String CONN_TASK_DIVIDE_STRATEGY = "task-divide-strategy";
    public static final String CONN_WHITE_LIST = "whiteDataBase";
    public static final String CONN_SOURCE_RECORD_CONVERTER = "source-record-converter";
    public static final String CONN_DB_IP = "dbUrl";
    public static final String CONN_DB_PORT = "dbPort";
    public static final String CONN_DB_USERNAME = "dbUsername";
    public static final String CONN_DB_PASSWORD = "dbPassword";
    public static final String CONN_DB_DATACENTER = "localDataCenter";
    public static final String CONN_DATA_TYPE = "dataType";
    public static final String CONN_TOPIC_NAMES = "topicNames";
    public static final String CONN_DB_MODE = "mode";

    public static final String CONN_SOURCE_RMQ = "source-rocketmq";
    public static final String CONN_SOURCE_CLUSTER = "source-cluster";
    public static final String REFRESH_INTERVAL = "refresh.interval";

    public static final String CONNECTOR_CLASS = "connector.class";

    public static final String VALUE_CONVERTER = "value.converter";
    public static final String ROCKETMQ_TOPIC = "rocketmqTopic";

    /* Mode Config */
    private String mode = "";
    private String incrementingColumnName = "";
    private String query = "";
    private String timestampColmnName = "";
    private boolean validateNonNull = true;

    /*Connector config*/
    private String tableTypes = "table";
    private long pollInterval = 5000;
    private int batchMaxRows = 100;
    private long tablePollInterval = 60000;
    private long timestampDelayInterval = 0;
    private String dbTimezone = "GMT+8";
    private String queueName;

    private Logger log = LoggerFactory.getLogger(Config.class);
    public static final Set<String> REQUEST_CONFIG = new HashSet<String>() {
        {
            add("dbUrl");
            add("dbPort");
            add("localDataCenter");
            add("mode");
            add("rocketmqTopic");
        }
    };



    public static Logger getLOG() {
        return LOG;
    }

    public String getDbUrl() { return dbUrl; }

    public void setDbUrl(String dbUrl) { this.dbUrl = dbUrl; }

    public String getDbPort() { return dbPort; }

    public void setDbPort(String dbPort) { this.dbPort = dbPort; }

    public String getLocalDataCenter() {
        return localDataCenter;
    }

    public void setLocalDataCenter(String localDataCenter) {
        this.localDataCenter = localDataCenter;
    }

    public String getDbUsername() {
        return dbUsername;
    }

    public void setDbUsername(String dbUsername) {
        this.dbUsername = dbUsername;
    }

    public String getDbPassword() {
        return dbPassword;
    }

    public void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getRocketmqTopic() {
        return rocketmqTopic;
    }

    public void setRocketmqTopic(String rocketmqTopic) {
        this.rocketmqTopic = rocketmqTopic;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getIncrementingColumnName() {
        return incrementingColumnName;
    }

    public void setIncrementingColumnName(String incrementingColumnName) {
        this.incrementingColumnName = incrementingColumnName;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getTimestampColmnName() {
        return timestampColmnName;
    }

    public void setTimestampColmnName(String timestampColmnName) {
        this.timestampColmnName = timestampColmnName;
    }

    public boolean isValidateNonNull() {
        return validateNonNull;
    }

    public void setValidateNonNull(boolean validateNonNull) {
        this.validateNonNull = validateNonNull;
    }

    public String getTableTypes() {
        return tableTypes;
    }

    public void setTableTypes(String tableTypes) {
        this.tableTypes = tableTypes;
    }

    public long getPollInterval() {
        return pollInterval;
    }

    public void setPollInterval(long pollInterval) {
        this.pollInterval = pollInterval;
    }

    public int getBatchMaxRows() {
        return batchMaxRows;
    }

    public void setBatchMaxRows(int batchMaxRows) {
        this.batchMaxRows = batchMaxRows;
    }

    public long getTablePollInterval() {
        return tablePollInterval;
    }

    public void setTablePollInterval(long tablePollInterval) {
        this.tablePollInterval = tablePollInterval;
    }

    public long getTimestampDelayInterval() {
        return timestampDelayInterval;
    }

    public void setTimestampDelayInterval(long timestampDelayInterval) {
        this.timestampDelayInterval = timestampDelayInterval;
    }

    public String getDbTimezone() {
        return dbTimezone;
    }

    public void setDbTimezone(String dbTimezone) {
        this.dbTimezone = dbTimezone;
    }

    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    public Logger getLog() {
        return log;
    }

    public void setLog(Logger log) {
        this.log = log;
    }

    public List getTableWhitelist() {
        return tableWhitelist;
    }

    public void setTableWhitelist(List tableWhitelist) {
        this.tableWhitelist = tableWhitelist;
    }

    public List getTableBlacklist() {
        return tableBlacklist;
    }

    public void setTableBlacklist(List tableBlacklist) {
        this.tableBlacklist = tableBlacklist;
    }

    public String getWhiteDataBase() {
        return whiteDataBase;
    }

    public void setWhiteDataBase(String whiteDataBase) {
        this.whiteDataBase = whiteDataBase;
    }

    public String getWhiteTable() {
        return whiteTable;
    }

    public void setWhiteTable(String whiteTable) {
        this.whiteTable = whiteTable;
    }

}