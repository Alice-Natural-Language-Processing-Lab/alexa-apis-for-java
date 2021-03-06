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


package com.amazon.ask.smapi.model.v1.skill.asr.evaluations;

import java.util.Objects;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetAsrEvaluationStatusResponseObject
 */

@JsonDeserialize(builder = GetAsrEvaluationStatusResponseObject.Builder.class)
public final class GetAsrEvaluationStatusResponseObject {

    @JsonProperty("status")
    private String status = null;

    @JsonProperty("totalEvaluationCount")
    private BigDecimal totalEvaluationCount = null;

    @JsonProperty("completedEvaluationCount")
    private BigDecimal completedEvaluationCount = null;

    @JsonProperty("startTimestamp")
    private OffsetDateTime startTimestamp = null;

    @JsonProperty("request")
    private com.amazon.ask.smapi.model.v1.skill.asr.evaluations.PostAsrEvaluationsRequestObject request = null;

    @JsonProperty("error")
    private com.amazon.ask.smapi.model.v1.skill.asr.evaluations.ErrorObject error = null;

    @JsonProperty("result")
    private com.amazon.ask.smapi.model.v1.skill.asr.evaluations.EvaluationMetadataResult result = null;

    public static Builder builder() {
        return new Builder();
    }

    private GetAsrEvaluationStatusResponseObject(Builder builder) {
        if (builder.status != null) {
            this.status = builder.status;
        }
        if (builder.totalEvaluationCount != null) {
            this.totalEvaluationCount = builder.totalEvaluationCount;
        }
        if (builder.completedEvaluationCount != null) {
            this.completedEvaluationCount = builder.completedEvaluationCount;
        }
        if (builder.startTimestamp != null) {
            this.startTimestamp = builder.startTimestamp;
        }
        if (builder.request != null) {
            this.request = builder.request;
        }
        if (builder.error != null) {
            this.error = builder.error;
        }
        if (builder.result != null) {
            this.result = builder.result;
        }
    }

    /**
     * Get status
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getStatusAsString().
     *
     * @return status
    **/
    
    public com.amazon.ask.smapi.model.v1.skill.asr.evaluations.EvaluationStatus getStatus() {
        return com.amazon.ask.smapi.model.v1.skill.asr.evaluations.EvaluationStatus.fromValue(status);
    }

    /**
     * Get the underlying String value for status.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return status as a String value
    **/
    @JsonProperty("status")
    public String getStatusAsString() {
      return status;
    }

    /**
     * indicate the total number of evaluations that are supposed to be run in the evaluation request
     * @return totalEvaluationCount
    **/
    @JsonProperty("totalEvaluationCount")
    public BigDecimal getTotalEvaluationCount() {
        return totalEvaluationCount;
    }


    /**
     * indicate the number of completed evaluations
     * @return completedEvaluationCount
    **/
    @JsonProperty("completedEvaluationCount")
    public BigDecimal getCompletedEvaluationCount() {
        return completedEvaluationCount;
    }


    /**
     * indicate the start time stamp of the ASR evaluation job. ISO-8601 Format.
     * @return startTimestamp
    **/
    @JsonProperty("startTimestamp")
    public OffsetDateTime getStartTimestamp() {
        return startTimestamp;
    }


    /**
     * Get request
     * @return request
    **/
    @JsonProperty("request")
    public com.amazon.ask.smapi.model.v1.skill.asr.evaluations.PostAsrEvaluationsRequestObject getRequest() {
        return request;
    }


    /**
     * Get error
     * @return error
    **/
    @JsonProperty("error")
    public com.amazon.ask.smapi.model.v1.skill.asr.evaluations.ErrorObject getError() {
        return error;
    }


    /**
     * Get result
     * @return result
    **/
    @JsonProperty("result")
    public com.amazon.ask.smapi.model.v1.skill.asr.evaluations.EvaluationMetadataResult getResult() {
        return result;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetAsrEvaluationStatusResponseObject v1SkillAsrEvaluationsGetAsrEvaluationStatusResponseObject = (GetAsrEvaluationStatusResponseObject) o;
        return Objects.equals(this.status, v1SkillAsrEvaluationsGetAsrEvaluationStatusResponseObject.status) &&
            Objects.equals(this.totalEvaluationCount, v1SkillAsrEvaluationsGetAsrEvaluationStatusResponseObject.totalEvaluationCount) &&
            Objects.equals(this.completedEvaluationCount, v1SkillAsrEvaluationsGetAsrEvaluationStatusResponseObject.completedEvaluationCount) &&
            Objects.equals(this.startTimestamp, v1SkillAsrEvaluationsGetAsrEvaluationStatusResponseObject.startTimestamp) &&
            Objects.equals(this.request, v1SkillAsrEvaluationsGetAsrEvaluationStatusResponseObject.request) &&
            Objects.equals(this.error, v1SkillAsrEvaluationsGetAsrEvaluationStatusResponseObject.error) &&
            Objects.equals(this.result, v1SkillAsrEvaluationsGetAsrEvaluationStatusResponseObject.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, totalEvaluationCount, completedEvaluationCount, startTimestamp, request, error, result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetAsrEvaluationStatusResponseObject {\n");
        
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    totalEvaluationCount: ").append(toIndentedString(totalEvaluationCount)).append("\n");
        sb.append("    completedEvaluationCount: ").append(toIndentedString(completedEvaluationCount)).append("\n");
        sb.append("    startTimestamp: ").append(toIndentedString(startTimestamp)).append("\n");
        sb.append("    request: ").append(toIndentedString(request)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
        private String status;
        private BigDecimal totalEvaluationCount;
        private BigDecimal completedEvaluationCount;
        private OffsetDateTime startTimestamp;
        private com.amazon.ask.smapi.model.v1.skill.asr.evaluations.PostAsrEvaluationsRequestObject request;
        private com.amazon.ask.smapi.model.v1.skill.asr.evaluations.ErrorObject error;
        private com.amazon.ask.smapi.model.v1.skill.asr.evaluations.EvaluationMetadataResult result;

        private Builder() {}

        @JsonProperty("status")
        public Builder withStatus(String status) {
          this.status = status;
          return this;
        }

        public Builder withStatus(com.amazon.ask.smapi.model.v1.skill.asr.evaluations.EvaluationStatus status) {
            this.status = status != null ? status.toString() : null;
            return this;
        }


        @JsonProperty("totalEvaluationCount")

        public Builder withTotalEvaluationCount(BigDecimal totalEvaluationCount) {
            this.totalEvaluationCount = totalEvaluationCount;
            return this;
        }


        @JsonProperty("completedEvaluationCount")

        public Builder withCompletedEvaluationCount(BigDecimal completedEvaluationCount) {
            this.completedEvaluationCount = completedEvaluationCount;
            return this;
        }


        @JsonProperty("startTimestamp")

        public Builder withStartTimestamp(OffsetDateTime startTimestamp) {
            this.startTimestamp = startTimestamp;
            return this;
        }


        @JsonProperty("request")

        public Builder withRequest(com.amazon.ask.smapi.model.v1.skill.asr.evaluations.PostAsrEvaluationsRequestObject request) {
            this.request = request;
            return this;
        }


        @JsonProperty("error")

        public Builder withError(com.amazon.ask.smapi.model.v1.skill.asr.evaluations.ErrorObject error) {
            this.error = error;
            return this;
        }


        @JsonProperty("result")

        public Builder withResult(com.amazon.ask.smapi.model.v1.skill.asr.evaluations.EvaluationMetadataResult result) {
            this.result = result;
            return this;
        }


        public GetAsrEvaluationStatusResponseObject build() {
            return new GetAsrEvaluationStatusResponseObject(this);
        }
    }
}

