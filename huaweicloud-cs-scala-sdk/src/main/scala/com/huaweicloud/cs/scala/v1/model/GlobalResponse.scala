/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package com.huaweicloud.cs.scala.v1.model

import com.huaweicloud.cs.scala.v1.client.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class GlobalResponse (
  /* 消息类型ID */
  messageId: Option[String],
  /* 消息内容 */
  message: Option[String],
  /* 当前时间, 毫秒数 */
  currentTime: Option[Long]
) extends ApiModel


