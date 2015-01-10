/*
 * Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.wso2.carbon.ml.decomposition.internal;

/**
 * This class contains a set of common constants used by
 * decomposition module
 */
public class DecompositionConstants {

    // Spark configuration related constants
    public static final String SPARK_CONFIG_XML = "repository/conf/etc/spark-config.xml";

    // Dataset related constants
    public static final String EMPTY = "";
    public static final String NA = "NA";
    public static final String CSV = ".csv";
    public static final String TSV = ".tsv";

    // Constants related to drawing random samples
    public static final int RANDOM_SAMPLE_SIZE = 10000;
    public static final long RANDOM_SEED = 1024L;

    // System property names
    public static final String HOME = "user.home";
    public static final String FILE_SEPARATOR = "file.separator";
    public static final String ML_PROJECTS = "MLProjects";
}
