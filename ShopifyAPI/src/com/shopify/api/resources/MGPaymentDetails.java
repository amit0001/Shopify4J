/**
* DO NOT MODIFY THIS CODE
* 
* Place all of your changes in PaymentDetails.java
* 
* It has been machine generated from fixtures and your changes will be
* lost if anything new needs to be added to the API. 
**/
// Last Generated: 2011-08-25T23:29:48-04:00
package com.shopify.api.resources;

import org.codehaus.jackson.annotate.JsonProperty;

/**
* This code has been machine generated by processing the single entry
* fixtures found from the Shopify API Documentation
*/
  
public class MGPaymentDetails extends ShopifyResource {

	@JsonProperty("credit_card_number")
	private String _credit_card_number;
	public String getCreditCardNumber(){ return _credit_card_number;}
	public void setCreditCardNumber(String _credit_card_number){_credit_card_number = this._credit_card_number;}

	@JsonProperty("credit_card_company")
	private String _credit_card_company;
	public String getCreditCardCompany(){ return _credit_card_company;}
	public void setCreditCardCompany(String _credit_card_company){_credit_card_company = this._credit_card_company;}

}