/*
 * CloudStream Service API
 * 实时流计算服（CloudStream Service，简称CS），是运行在华为云上的实时流式大数据分析服务，完全托管的方式让用户无需感知计算集群，只需聚焦于Stream SQL业务，即时执行作业，完全兼容Apache Flink API。
 *
 * OpenAPI spec version: 1.0.0
 * Contact: CloudStream@huawei.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.huaweicloud.cs.java.v1.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.huaweicloud.cs.java.v1.model.SqlJobUpdateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SqlJobUpdateResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-12T18:34:48.675+08:00")
public class SqlJobUpdateResponse {
  @SerializedName("message_id")
  private String messageId = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("update_time")
  private Long updateTime = null;

  @SerializedName("current_time")
  private Long currentTime = null;

  @SerializedName("payload")
  private SqlJobUpdateTime payload = null;

  public SqlJobUpdateResponse messageId(String messageId) {
    this.messageId = messageId;
    return this;
  }

   /**
   * 消息类型ID
   * @return messageId
  **/
  @ApiModelProperty(example = "CS.10001", value = "消息类型ID")
  public String getMessageId() {
    return messageId;
  }

  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }

  public SqlJobUpdateResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * 消息内容
   * @return message
  **/
  @ApiModelProperty(example = "消息内容", value = "消息内容")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public SqlJobUpdateResponse updateTime(Long updateTime) {
    this.updateTime = updateTime;
    return this;
  }

   /**
   * 作业更新时间, 毫秒数
   * @return updateTime
  **/
  @ApiModelProperty(example = "4000000", value = "作业更新时间, 毫秒数")
  public Long getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(Long updateTime) {
    this.updateTime = updateTime;
  }

  public SqlJobUpdateResponse currentTime(Long currentTime) {
    this.currentTime = currentTime;
    return this;
  }

   /**
   * 当前时间, 毫秒数
   * @return currentTime
  **/
  @ApiModelProperty(example = "4000000", value = "当前时间, 毫秒数")
  public Long getCurrentTime() {
    return currentTime;
  }

  public void setCurrentTime(Long currentTime) {
    this.currentTime = currentTime;
  }

  public SqlJobUpdateResponse payload(SqlJobUpdateTime payload) {
    this.payload = payload;
    return this;
  }

   /**
   * Get payload
   * @return payload
  **/
  @ApiModelProperty(value = "")
  public SqlJobUpdateTime getPayload() {
    return payload;
  }

  public void setPayload(SqlJobUpdateTime payload) {
    this.payload = payload;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SqlJobUpdateResponse sqlJobUpdateResponse = (SqlJobUpdateResponse) o;
    return Objects.equals(this.messageId, sqlJobUpdateResponse.messageId) &&
        Objects.equals(this.message, sqlJobUpdateResponse.message) &&
        Objects.equals(this.updateTime, sqlJobUpdateResponse.updateTime) &&
        Objects.equals(this.currentTime, sqlJobUpdateResponse.currentTime) &&
        Objects.equals(this.payload, sqlJobUpdateResponse.payload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageId, message, updateTime, currentTime, payload);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SqlJobUpdateResponse {\n");
    
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    currentTime: ").append(toIndentedString(currentTime)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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

}

