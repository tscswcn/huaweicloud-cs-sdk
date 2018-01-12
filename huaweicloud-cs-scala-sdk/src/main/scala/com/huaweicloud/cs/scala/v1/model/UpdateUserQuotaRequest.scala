/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package com.huaweicloud.cs.scala.v1.model

import com.huaweicloud.cs.scala.v1.client.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class UpdateUserQuotaRequest (
  /* 用户最大SPU配额 */
  spuQuota: Option[Int],
  /* 分配给用户的集群id列表 */
  clusters: Option[Seq[Int]]
) extends ApiModel


