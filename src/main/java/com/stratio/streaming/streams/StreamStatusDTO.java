/*******************************************************************************
 * Copyright 2014 Stratio
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.stratio.streaming.streams;

import java.io.Serializable;
import java.util.HashMap;

public class StreamStatusDTO implements Serializable {

    /**
	 * 
	 */
    private static final long serialVersionUID = -8455557383950387810L;
    private String streamName;
    private String streamDefinition;
    private Boolean userDefined;
    private Boolean listen_enabled;
    private Boolean saveToCassandra_enabled;
    private Boolean streamToIndexer_enabled;
    private HashMap<String, String> addedQueries;

    /**
     * @param streamName
     * @param listen_enabled
     * @param saveToCassandra_enabled
     */
    public StreamStatusDTO(String streamName, Boolean userDefined) {
        super();
        this.streamName = streamName;
        this.userDefined = userDefined;
        this.listen_enabled = false;
        this.saveToCassandra_enabled = false;
        this.streamToIndexer_enabled = false;
        this.addedQueries = new HashMap<String, String>();
    }

    public Boolean isUserDefined() {
        return userDefined;
    }

    public void setUserDefined(Boolean userDefined) {
        this.userDefined = userDefined;
    }

    public String getStreamName() {
        return streamName;
    }

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    public Boolean isListen_enabled() {
        return listen_enabled;
    }

    public void setListen_enabled(Boolean listen_enabled) {
        this.listen_enabled = listen_enabled;
    }

    public Boolean isSaveToCassandra_enabled() {
        return saveToCassandra_enabled;
    }

    public void setSaveToCassandra_enabled(Boolean saveToCassandra_enabled) {
        this.saveToCassandra_enabled = saveToCassandra_enabled;
    }

    public boolean isStreamToIndexer_enabled() {
        return streamToIndexer_enabled;
    }

    public void setStreamToIndexer_enabled(Boolean streamToIndexer_enabled) {
        this.streamToIndexer_enabled = streamToIndexer_enabled;
    }

    public String getStreamDefinition() {
        return streamDefinition;
    }

    public void setStreamDefinition(String streamDefinition) {
        this.streamDefinition = streamDefinition;
    }

    public HashMap<String, String> getAddedQueries() {
        return addedQueries;
    }

    public void setAddedQueries(HashMap<String, String> addedQueries) {
        this.addedQueries = addedQueries;
    }

}
