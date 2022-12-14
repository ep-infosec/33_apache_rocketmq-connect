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
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.apache.rocketmq.connect.runtime.store;

import io.openmessaging.connector.api.data.RecordPartition;

import java.util.Map;
import java.util.Objects;

/**
 * extend record partition
 */
public class ExtendRecordPartition extends RecordPartition {
    /**
     * connect name
     */
    private String namespace;

    public ExtendRecordPartition(String namespace, Map<String, ?> partition) {
        super(partition);
        this.namespace = namespace;
    }

    public String getNamespace() {
        return namespace;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ExtendRecordPartition)) return false;
        if (!super.equals(o)) return false;
        ExtendRecordPartition that = (ExtendRecordPartition) o;
        return this.namespace.equals(that.namespace);
    }

    @Override
    public String toString() {
        return "ExtendRecordPartition{" +
                "namespace='" + namespace + '\'' +
                "} " + super.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), namespace);
    }
}
