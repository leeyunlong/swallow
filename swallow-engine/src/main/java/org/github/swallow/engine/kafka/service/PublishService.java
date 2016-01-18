package org.github.swallow.engine.kafka.service;

import java.util.List;
import java.util.Properties;

import kafka.javaapi.producer.Producer;
import kafka.producer.ProducerConfig;

import org.github.swallow.engine.LifeCycleBean;
import org.github.swallow.engine.kafka.EventPublish;

public class PublishService implements EventPublish, LifeCycleBean {

	Producer<String, String> producer;

	@Override
	public void publish(String topic, String message) {

	}

	@Override
	public void publish(String topic, List<String> messages) {

	}

	@Override
	public void start() throws Exception {
		Properties props = new Properties();
		producer = new Producer<String, String>(new ProducerConfig(props));
	}

	@Override
	public void shutdown() throws Exception {
		if (producer != null) {
			producer.close();
		}
	}

}
