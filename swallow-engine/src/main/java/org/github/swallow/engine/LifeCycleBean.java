package org.github.swallow.engine;

public interface LifeCycleBean {

	public void start() throws Exception;

	public void shutdown() throws Exception;
}
