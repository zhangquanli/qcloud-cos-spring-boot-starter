package com.github.zhangquanli.qcloud.cos;

import com.qcloud.cos.COSClient;
import com.qcloud.cos.ClientConfig;
import com.qcloud.cos.auth.BasicCOSCredentials;
import com.qcloud.cos.auth.COSCredentials;
import com.qcloud.cos.region.Region;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * QcloudCosAutoConfiguration
 *
 * @author zhangquanli
 */
@Configuration
@EnableConfigurationProperties(QcloudCosProperties.class)
public class QcloudCosAutoConfiguration {

    private QcloudCosProperties qcloudCosProperties;

    public QcloudCosAutoConfiguration(QcloudCosProperties qcloudCosProperties) {
        this.qcloudCosProperties = qcloudCosProperties;
    }

    @Bean
    public COSClient cosClient() {
        String secretId = qcloudCosProperties.getSecretId();
        String secretKey = qcloudCosProperties.getSecretKey();
        String regionName = qcloudCosProperties.getRegionName();
        // 初始化认证
        COSCredentials cosCredentials = new BasicCOSCredentials(secretId, secretKey);
        // 客户端配置
        ClientConfig clientConfig = new ClientConfig(new Region(regionName));
        // 创建客户端
        return new COSClient(cosCredentials, clientConfig);
    }
}
