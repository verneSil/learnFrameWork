package com.example.learnscope.demo;

import java.io.StringReader;
import java.util.Properties;
import io.micrometer.core.instrument.util.StringUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.PriorityOrdered;
import org.springframework.core.env.Environment;
import org.springframework.core.env.PropertySource;
import org.springframework.stereotype.Component;


/**
 * @Author: Earendil
 * @Date: 2020/11/12 11:07 AM
 */
//@Component
public class MyConfigPropertySource extends PropertySource<Properties> implements PriorityOrdered, BeanFactoryPostProcessor,
        EnvironmentAware {

  public MyConfigPropertySource(String name, Properties source) {
    super(name, source);
  }

  public MyConfigPropertySource(String name) {
    super(name);
  }

  @Override
  public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {

  }

  @Override
  public void setEnvironment(Environment environment) {

  }

  @Override
  public int getOrder() {
    return 0;
  }

  @Override
  public Object getProperty(String s) {
    return null;
  }

  private Properties parseConfig(String config) {
    Properties properties = new Properties();
    if(StringUtils.isNotEmpty(config)) {
      try {
        properties.load(new StringReader(config));
      } catch (Exception var4) {
        throw new IllegalArgumentException("detail center parse config error, config:" + config, var4);
      }
    }

    return properties;
  }
}
