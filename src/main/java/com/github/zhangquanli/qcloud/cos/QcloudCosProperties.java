package com.github.zhangquanli.qcloud.cos;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * QcloudCosProperties
 *
 * @author zhangquanli
 */
@ConfigurationProperties(prefix = "qcloud.cos")
public class QcloudCosProperties {

    /**
     * 密钥
     */
    private String secretId;
    /**
     * 密钥
     */
    private String secretKey;
    /**
     * 区域名称
     */
    private String regionName;

    public String getSecretId() {
        return secretId;
    }

    public void setSecretId(String secretId) {
        this.secretId = secretId;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }
}
