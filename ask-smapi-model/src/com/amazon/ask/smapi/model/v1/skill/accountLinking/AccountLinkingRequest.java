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


package com.amazon.ask.smapi.model.v1.skill.accountLinking;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * The payload for creating the account linking partner.
 */

@JsonDeserialize(builder = AccountLinkingRequest.Builder.class)
public final class AccountLinkingRequest {

    @JsonProperty("type")
    private String type = null;

    @JsonProperty("authorizationUrl")
    private String authorizationUrl = null;

    @JsonProperty("domains")
    private List<String> domains = new ArrayList<String>();

    @JsonProperty("clientId")
    private String clientId = null;

    @JsonProperty("scopes")
    private List<String> scopes = new ArrayList<String>();

    @JsonProperty("accessTokenUrl")
    private String accessTokenUrl = null;

    @JsonProperty("clientSecret")
    private String clientSecret = null;

    @JsonProperty("accessTokenScheme")
    private String accessTokenScheme = null;

    @JsonProperty("defaultTokenExpirationInSeconds")
    private Integer defaultTokenExpirationInSeconds = null;

    @JsonProperty("reciprocalAccessTokenUrl")
    private String reciprocalAccessTokenUrl = null;

    @JsonProperty("redirectUrls")
    private List<String> redirectUrls = new ArrayList<String>();

    public static Builder builder() {
        return new Builder();
    }

    private AccountLinkingRequest(Builder builder) {
        if (builder.type != null) {
            this.type = builder.type;
        }
        if (builder.authorizationUrl != null) {
            this.authorizationUrl = builder.authorizationUrl;
        }
        if (builder.domains != null) {
            this.domains = builder.domains;
        }
        if (builder.clientId != null) {
            this.clientId = builder.clientId;
        }
        if (builder.scopes != null) {
            this.scopes = builder.scopes;
        }
        if (builder.accessTokenUrl != null) {
            this.accessTokenUrl = builder.accessTokenUrl;
        }
        if (builder.clientSecret != null) {
            this.clientSecret = builder.clientSecret;
        }
        if (builder.accessTokenScheme != null) {
            this.accessTokenScheme = builder.accessTokenScheme;
        }
        if (builder.defaultTokenExpirationInSeconds != null) {
            this.defaultTokenExpirationInSeconds = builder.defaultTokenExpirationInSeconds;
        }
        if (builder.reciprocalAccessTokenUrl != null) {
            this.reciprocalAccessTokenUrl = builder.reciprocalAccessTokenUrl;
        }
        if (builder.redirectUrls != null) {
            this.redirectUrls = builder.redirectUrls;
        }
    }

    /**
     * Get type
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getTypeAsString().
     *
     * @return type
    **/
    
    public com.amazon.ask.smapi.model.v1.skill.accountLinking.AccountLinkingType getType() {
        return com.amazon.ask.smapi.model.v1.skill.accountLinking.AccountLinkingType.fromValue(type);
    }

    /**
     * Get the underlying String value for type.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return type as a String value
    **/
    @JsonProperty("type")
    public String getTypeAsString() {
      return type;
    }

    /**
     * The url where customers will be redirected in the companion app to enter login credentials.
     * @return authorizationUrl
    **/
    @JsonProperty("authorizationUrl")
    public String getAuthorizationUrl() {
        return authorizationUrl;
    }


    /**
     * The list of domains that the authorization URL will fetch content from.
     * @return domains
    **/
    @JsonProperty("domains")
    public List<String> getDomains() {
        return domains;
    }


    /**
     * The unique public string used to identify the client requesting for authentication.
     * @return clientId
    **/
    @JsonProperty("clientId")
    public String getClientId() {
        return clientId;
    }


    /**
     * The list of permissions which will be requested from the skill user.
     * @return scopes
    **/
    @JsonProperty("scopes")
    public List<String> getScopes() {
        return scopes;
    }


    /**
     * The url used for access token and token refresh requests.
     * @return accessTokenUrl
    **/
    @JsonProperty("accessTokenUrl")
    public String getAccessTokenUrl() {
        return accessTokenUrl;
    }


    /**
     * The client secret provided by developer.
     * @return clientSecret
    **/
    @JsonProperty("clientSecret")
    public String getClientSecret() {
        return clientSecret;
    }


    /**
     * Get accessTokenScheme
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getAccessTokenSchemeAsString().
     *
     * @return accessTokenScheme
    **/
    
    public com.amazon.ask.smapi.model.v1.skill.accountLinking.AccessTokenSchemeType getAccessTokenScheme() {
        return com.amazon.ask.smapi.model.v1.skill.accountLinking.AccessTokenSchemeType.fromValue(accessTokenScheme);
    }

    /**
     * Get the underlying String value for accessTokenScheme.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return accessTokenScheme as a String value
    **/
    @JsonProperty("accessTokenScheme")
    public String getAccessTokenSchemeAsString() {
      return accessTokenScheme;
    }

    /**
     * The time in seconds for which access token is valid. If OAuth client returns \"expires_in\", it will be overwrite this parameter. 
     * @return defaultTokenExpirationInSeconds
    **/
    @JsonProperty("defaultTokenExpirationInSeconds")
    public Integer getDefaultTokenExpirationInSeconds() {
        return defaultTokenExpirationInSeconds;
    }


    /**
     * Optional, if your skill requires reciprocal authorization, provide this additional access token url to handle reciprocal (Alexa) authorization codes that can be exchanged for Alexa access tokens.
     * @return reciprocalAccessTokenUrl
    **/
    @JsonProperty("reciprocalAccessTokenUrl")
    public String getReciprocalAccessTokenUrl() {
        return reciprocalAccessTokenUrl;
    }


    /**
     * The list of valid urls to redirect back to, when the linking process is initiated from a third party system.
     * @return redirectUrls
    **/
    @JsonProperty("redirectUrls")
    public List<String> getRedirectUrls() {
        return redirectUrls;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AccountLinkingRequest v1SkillAccountLinkingAccountLinkingRequest = (AccountLinkingRequest) o;
        return Objects.equals(this.type, v1SkillAccountLinkingAccountLinkingRequest.type) &&
            Objects.equals(this.authorizationUrl, v1SkillAccountLinkingAccountLinkingRequest.authorizationUrl) &&
            Objects.equals(this.domains, v1SkillAccountLinkingAccountLinkingRequest.domains) &&
            Objects.equals(this.clientId, v1SkillAccountLinkingAccountLinkingRequest.clientId) &&
            Objects.equals(this.scopes, v1SkillAccountLinkingAccountLinkingRequest.scopes) &&
            Objects.equals(this.accessTokenUrl, v1SkillAccountLinkingAccountLinkingRequest.accessTokenUrl) &&
            Objects.equals(this.clientSecret, v1SkillAccountLinkingAccountLinkingRequest.clientSecret) &&
            Objects.equals(this.accessTokenScheme, v1SkillAccountLinkingAccountLinkingRequest.accessTokenScheme) &&
            Objects.equals(this.defaultTokenExpirationInSeconds, v1SkillAccountLinkingAccountLinkingRequest.defaultTokenExpirationInSeconds) &&
            Objects.equals(this.reciprocalAccessTokenUrl, v1SkillAccountLinkingAccountLinkingRequest.reciprocalAccessTokenUrl) &&
            Objects.equals(this.redirectUrls, v1SkillAccountLinkingAccountLinkingRequest.redirectUrls);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, authorizationUrl, domains, clientId, scopes, accessTokenUrl, clientSecret, accessTokenScheme, defaultTokenExpirationInSeconds, reciprocalAccessTokenUrl, redirectUrls);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccountLinkingRequest {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    authorizationUrl: ").append(toIndentedString(authorizationUrl)).append("\n");
        sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
        sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
        sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
        sb.append("    accessTokenUrl: ").append(toIndentedString(accessTokenUrl)).append("\n");
        sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
        sb.append("    accessTokenScheme: ").append(toIndentedString(accessTokenScheme)).append("\n");
        sb.append("    defaultTokenExpirationInSeconds: ").append(toIndentedString(defaultTokenExpirationInSeconds)).append("\n");
        sb.append("    reciprocalAccessTokenUrl: ").append(toIndentedString(reciprocalAccessTokenUrl)).append("\n");
        sb.append("    redirectUrls: ").append(toIndentedString(redirectUrls)).append("\n");
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
        private String type;
        private String authorizationUrl;
        private List<String> domains;
        private String clientId;
        private List<String> scopes;
        private String accessTokenUrl;
        private String clientSecret;
        private String accessTokenScheme;
        private Integer defaultTokenExpirationInSeconds;
        private String reciprocalAccessTokenUrl;
        private List<String> redirectUrls;

        private Builder() {}

        @JsonProperty("type")
        public Builder withType(String type) {
          this.type = type;
          return this;
        }

        public Builder withType(com.amazon.ask.smapi.model.v1.skill.accountLinking.AccountLinkingType type) {
            this.type = type != null ? type.toString() : null;
            return this;
        }


        @JsonProperty("authorizationUrl")

        public Builder withAuthorizationUrl(String authorizationUrl) {
            this.authorizationUrl = authorizationUrl;
            return this;
        }


        @JsonProperty("domains")

        public Builder withDomains(List<String> domains) {
            this.domains = domains;
            return this;
        }

        public Builder addDomainsItem(String domainsItem) {
            if (this.domains == null) {
                this.domains = new ArrayList<String>();
            }
            this.domains.add(domainsItem);
            return this;
        }

        @JsonProperty("clientId")

        public Builder withClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }


        @JsonProperty("scopes")

        public Builder withScopes(List<String> scopes) {
            this.scopes = scopes;
            return this;
        }

        public Builder addScopesItem(String scopesItem) {
            if (this.scopes == null) {
                this.scopes = new ArrayList<String>();
            }
            this.scopes.add(scopesItem);
            return this;
        }

        @JsonProperty("accessTokenUrl")

        public Builder withAccessTokenUrl(String accessTokenUrl) {
            this.accessTokenUrl = accessTokenUrl;
            return this;
        }


        @JsonProperty("clientSecret")

        public Builder withClientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }


        @JsonProperty("accessTokenScheme")
        public Builder withAccessTokenScheme(String accessTokenScheme) {
          this.accessTokenScheme = accessTokenScheme;
          return this;
        }

        public Builder withAccessTokenScheme(com.amazon.ask.smapi.model.v1.skill.accountLinking.AccessTokenSchemeType accessTokenScheme) {
            this.accessTokenScheme = accessTokenScheme != null ? accessTokenScheme.toString() : null;
            return this;
        }


        @JsonProperty("defaultTokenExpirationInSeconds")

        public Builder withDefaultTokenExpirationInSeconds(Integer defaultTokenExpirationInSeconds) {
            this.defaultTokenExpirationInSeconds = defaultTokenExpirationInSeconds;
            return this;
        }


        @JsonProperty("reciprocalAccessTokenUrl")

        public Builder withReciprocalAccessTokenUrl(String reciprocalAccessTokenUrl) {
            this.reciprocalAccessTokenUrl = reciprocalAccessTokenUrl;
            return this;
        }


        @JsonProperty("redirectUrls")

        public Builder withRedirectUrls(List<String> redirectUrls) {
            this.redirectUrls = redirectUrls;
            return this;
        }

        public Builder addRedirectUrlsItem(String redirectUrlsItem) {
            if (this.redirectUrls == null) {
                this.redirectUrls = new ArrayList<String>();
            }
            this.redirectUrls.add(redirectUrlsItem);
            return this;
        }

        public AccountLinkingRequest build() {
            return new AccountLinkingRequest(this);
        }
    }
}

