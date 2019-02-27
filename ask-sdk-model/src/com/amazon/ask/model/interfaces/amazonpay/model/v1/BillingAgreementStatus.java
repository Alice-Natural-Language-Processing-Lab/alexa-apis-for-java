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


package com.amazon.ask.model.interfaces.amazonpay.model.v1;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Indicates the current status of the billing agreement. For more information about the State and ReasonCode response elements, see Billing agreement states and reason codes - https://pay.amazon.com/us/developer/documentation/apireference/201752870
 */
public enum BillingAgreementStatus {
  
  CANCELED("CANCELED"),
  
  CLOSED("CLOSED"),
  
  DRAFT("DRAFT"),
  
  OPEN("OPEN"),
  
  SUSPENDED("SUSPENDED");

  private String value;

  BillingAgreementStatus(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static BillingAgreementStatus fromValue(String text) {
    for (BillingAgreementStatus b : BillingAgreementStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

