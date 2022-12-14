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

package org.apache.rocketmq.connect.redis.processor;

import com.moilioncircle.redis.replicator.CloseListener;
import com.moilioncircle.redis.replicator.Replicator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RedisClosedListener implements CloseListener {
    protected final Logger logger = LoggerFactory.getLogger(RedisClosedListener.class);

    private RedisEventProcessor processor;

    public RedisClosedListener(RedisEventProcessor processor) {
        this.processor = processor;
    }

    @Override public void handle(Replicator replicator) {
        logger.error("replicator is stopped");
    }
}
