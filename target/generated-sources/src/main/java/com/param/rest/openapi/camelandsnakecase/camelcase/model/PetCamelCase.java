/*
 * Swagger Petstore
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.param.rest.openapi.camelandsnakecase.camelcase.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * PetCamelCase
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-03T15:36:50.716696+05:30[Asia/Kolkata]")
public class PetCamelCase implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_PET_NAME = "petName";
  @SerializedName(SERIALIZED_NAME_PET_NAME)
  private String petName;

  public static final String SERIALIZED_NAME_PER_TAG = "perTag";
  @SerializedName(SERIALIZED_NAME_PER_TAG)
  private String perTag;


  public PetCamelCase id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public PetCamelCase petName(String petName) {
    
    this.petName = petName;
    return this;
  }

   /**
   * Get petName
   * @return petName
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "")

  public String getPetName() {
    return petName;
  }


  public void setPetName(String petName) {
    this.petName = petName;
  }


  public PetCamelCase perTag(String perTag) {
    
    this.perTag = perTag;
    return this;
  }

   /**
   * Get perTag
   * @return perTag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPerTag() {
    return perTag;
  }


  public void setPerTag(String perTag) {
    this.perTag = perTag;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PetCamelCase petCamelCase = (PetCamelCase) o;
    return Objects.equals(this.id, petCamelCase.id) &&
        Objects.equals(this.petName, petCamelCase.petName) &&
        Objects.equals(this.perTag, petCamelCase.perTag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, petName, perTag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PetCamelCase {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    petName: ").append(toIndentedString(petName)).append("\n");
    sb.append("    perTag: ").append(toIndentedString(perTag)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

