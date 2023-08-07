/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.gobblin.cluster.temporal;

import java.util.Properties;

import org.apache.hadoop.fs.Path;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import io.temporal.activity.ActivityInterface;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@ActivityInterface
public interface GobblinTemporalActivity {

    String composeGreeting(String name);

    // Method to run Gobblin Task in activity
    void run(Properties jobProps, String appWorkDir, String jobId, String workUnitFilePath, String jobStateFilePath)
        throws Exception;
}
