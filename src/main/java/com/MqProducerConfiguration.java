package com;

import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * @Author:wjy
 * @Date: 2018/8/24.
 */
@SpringBootConfiguration
public class MqProducerConfiguration {

	/**
	 *
	 */
	@Value("${rocketmq.producer.groupName}")
	private String groupName;

	@Value("${rocketmq.producer.namesrvAddr}")
	private String namesrvAddr;

	/**
	 * 消息最大大小，默认4M
	 */
	@Value("${rocketmq.producer.maxMessageSize}")
	private Integer maxMessageSize;

	/**
	 * 消息发送超时时间，默认3秒
	 */
	@Value("${rocketmq.producer.sendMsgTimeout}")
	private Integer sendMsgTimeout;

	/**
	 * 消息发送失败重试次数，默认2次
	 */
	@Value("${rocketmq.producer.retryTimesWhenSendFailed}")
	private Integer retryTimesWhenSendFailed;

	@Bean
	public DefaultMQProducer getRocketMQProducer(){
		if (StringUtils.isEmpty(this.groupName)) {

		}
		return null;
	}
}
