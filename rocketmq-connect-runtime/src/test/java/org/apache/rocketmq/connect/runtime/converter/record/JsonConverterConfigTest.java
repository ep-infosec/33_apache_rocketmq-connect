/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.rocketmq.connect.runtime.converter.record;

import org.apache.rocketmq.connect.runtime.converter.record.json.DecimalFormat;
import org.apache.rocketmq.connect.runtime.converter.record.json.JsonConverterConfig;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class JsonConverterConfigTest {

    @Test
    public void shouldBeCaseInsensitiveForDecimalFormatConfig() {
        final Map<String, Object> configValues = new HashMap<>();
        configValues.put(JsonConverterConfig.DECIMAL_FORMAT_CONFIG, "NuMeRiC");
        final JsonConverterConfig config = new JsonConverterConfig(configValues);
        assertEquals(config.decimalFormat(), DecimalFormat.NUMERIC);
    }

}