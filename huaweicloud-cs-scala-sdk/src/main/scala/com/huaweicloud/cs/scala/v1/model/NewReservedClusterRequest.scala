/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package com.huaweicloud.cs.scala.v1.model

import com.huaweicloud.cs.scala.v1.client.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class NewReservedClusterRequest (
  /* 集群名称 */
  name: String,
  /* 集群描述 */
  desc: Option[String],
  /* 集群最大SPU配额 */
  maximumSpuQuota: Option[Int]
) extends ApiModel


