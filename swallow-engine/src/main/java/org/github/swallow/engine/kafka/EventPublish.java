package org.github.swallow.engine.kafka;

import java.util.List;

public interface EventPublish {

	public void publish(String topic, String message);

	public void publish(String topic, List<String> messages);
}
