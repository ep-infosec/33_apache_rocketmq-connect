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

package org.apache.rocketmq.connect.jms.connector;

import static org.junit.Assert.assertEquals;

import io.openmessaging.connector.api.component.task.Task;
import java.util.HashSet;
import java.util.Set;

import org.apache.rocketmq.connect.jms.Config;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import io.openmessaging.KeyValue;
import io.openmessaging.internal.DefaultKeyValue;

public class BaseJmsSourceConnectorTest {

	public static final Set<String> REQUEST_CONFIG = new HashSet<String>() {
        {
            add("activemqUrl");
            add("destinationType");
            add("destinationName");
        }
    };
	
	BaseJmsSourceConnector connector = new BaseJmsSourceConnector() {
	    
		
		@Override
		public Class<? extends Task> taskClass() {
			return BaseJmsSourceTask.class;
		}
		
		@Override
		public Set<String> getRequiredConfig() {
			return REQUEST_CONFIG;
		}
	};

    @Test
    public void taskClassTest() {
        assertEquals(connector.taskClass(), BaseJmsSourceTask.class);
    }
}
