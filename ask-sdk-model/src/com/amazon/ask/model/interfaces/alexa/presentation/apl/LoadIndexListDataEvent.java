/*
* Copyright 2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
*
* Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file
* except in compliance with the License. A copy of the License is located at
*
* http://aws.amazon.com/apache2.0/
*
* or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for
* the specific language governing permissions and limitations under the License.
*/


package com.amazon.ask.model.interfaces.alexa.presentation.apl;

import java.util.Objects;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The LoadIndexListData event is sent to the skill to retrieve additional list items.
 */

@JsonDeserialize(builder = LoadIndexListDataEvent.Builder.class)
public final class LoadIndexListDataEvent extends com.amazon.ask.model.Request  {

    @JsonProperty("token")
    private String token = null;

    @JsonProperty("correlationToken")
    private String correlationToken = null;

    @JsonProperty("listId")
    private String listId = null;

    @JsonProperty("startIndex")
    private Integer startIndex = null;

    @JsonProperty("count")
    private Integer count = null;

    public static Builder builder() {
        return new Builder();
    }

    private LoadIndexListDataEvent(Builder builder) {
        String discriminatorValue = "Alexa.Presentation.APL.LoadIndexListData";

        this.type = discriminatorValue;
        if (builder.requestId != null) {
            this.requestId = builder.requestId;
        }
        if (builder.timestamp != null) {
            this.timestamp = builder.timestamp;
        }
        if (builder.locale != null) {
            this.locale = builder.locale;
        }
        if (builder.token != null) {
            this.token = builder.token;
        }
        if (builder.correlationToken != null) {
            this.correlationToken = builder.correlationToken;
        }
        if (builder.listId != null) {
            this.listId = builder.listId;
        }
        if (builder.startIndex != null) {
            this.startIndex = builder.startIndex;
        }
        if (builder.count != null) {
            this.count = builder.count;
        }
    }

    /**
     * The token as specified in the presentation's RenderDocument directive.
     * @return token
    **/
    @JsonProperty("token")
    public String getToken() {
        return token;
    }


    /**
     * An identifier generated by a device that is used to correlate requests with their corresponding response directives.
     * @return correlationToken
    **/
    @JsonProperty("correlationToken")
    public String getCorrelationToken() {
        return correlationToken;
    }


    /**
     * The identifier of the list whose items to fetch.
     * @return listId
    **/
    @JsonProperty("listId")
    public String getListId() {
        return listId;
    }


    /**
     * The lowest index of the items to fetch (inclusive)
     * @return startIndex
    **/
    @JsonProperty("startIndex")
    public Integer getStartIndex() {
        return startIndex;
    }


    /**
     * The number of items to fetch. Examples:  startIndex = 10, count = 2: Skill is expected to return items at indexes 10 and 11. startIndex = -2, count = 5: Skill is expected to return items at indexes -2, -1, 0, 1 and 2 
     * @return count
    **/
    @JsonProperty("count")
    public Integer getCount() {
        return count;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LoadIndexListDataEvent interfacesAlexaPresentationAplLoadIndexListDataEvent = (LoadIndexListDataEvent) o;
        return Objects.equals(this.token, interfacesAlexaPresentationAplLoadIndexListDataEvent.token) &&
            Objects.equals(this.correlationToken, interfacesAlexaPresentationAplLoadIndexListDataEvent.correlationToken) &&
            Objects.equals(this.listId, interfacesAlexaPresentationAplLoadIndexListDataEvent.listId) &&
            Objects.equals(this.startIndex, interfacesAlexaPresentationAplLoadIndexListDataEvent.startIndex) &&
            Objects.equals(this.count, interfacesAlexaPresentationAplLoadIndexListDataEvent.count) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(token, correlationToken, listId, startIndex, count, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LoadIndexListDataEvent {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
        sb.append("    correlationToken: ").append(toIndentedString(correlationToken)).append("\n");
        sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
        sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
  
    public static class Builder {
        private String requestId;
        private OffsetDateTime timestamp;
        private String locale;
        private String token;
        private String correlationToken;
        private String listId;
        private Integer startIndex;
        private Integer count;

        private Builder() {}

        @JsonProperty("requestId")

        public Builder withRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }


        @JsonProperty("timestamp")

        public Builder withTimestamp(OffsetDateTime timestamp) {
            this.timestamp = timestamp;
            return this;
        }


        @JsonProperty("locale")

        public Builder withLocale(String locale) {
            this.locale = locale;
            return this;
        }


        @JsonProperty("token")

        public Builder withToken(String token) {
            this.token = token;
            return this;
        }


        @JsonProperty("correlationToken")

        public Builder withCorrelationToken(String correlationToken) {
            this.correlationToken = correlationToken;
            return this;
        }


        @JsonProperty("listId")

        public Builder withListId(String listId) {
            this.listId = listId;
            return this;
        }


        @JsonProperty("startIndex")

        public Builder withStartIndex(Integer startIndex) {
            this.startIndex = startIndex;
            return this;
        }


        @JsonProperty("count")

        public Builder withCount(Integer count) {
            this.count = count;
            return this;
        }


        public LoadIndexListDataEvent build() {
            return new LoadIndexListDataEvent(this);
        }
    }
}

