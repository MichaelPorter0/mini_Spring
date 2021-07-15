package com.Duan.beans.factory.support;

import com.Duan.beans.factory.config.BeanDefinition;

public interface  BeanDefinitionRegistry {
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
