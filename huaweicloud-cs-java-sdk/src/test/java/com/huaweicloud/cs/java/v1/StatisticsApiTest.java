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


package com.huaweicloud.cs.java.v1;

import com.huaweicloud.cs.java.v1.client.ApiException;
import com.huaweicloud.cs.java.v1.model.GlobalErrorResponse;
import com.huaweicloud.cs.java.v1.model.OverviewResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StatisticsApi
 */
@Ignore
public class StatisticsApiTest {

    private final StatisticsApi api = new StatisticsApi();

    
    /**
     * 概要统计用户的作业和费用情况
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void overviewTest() throws ApiException {
        String xProjectId = null;
        OverviewResponse response = api.overview(xProjectId);

        // TODO: test validations
    }
    
}
