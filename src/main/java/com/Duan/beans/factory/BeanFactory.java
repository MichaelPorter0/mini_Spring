package com.Duan.beans.factory;

import com.Duan.beans.BeansException;

public interface BeanFactory {

    Object getBean(String name) throws BeansException;

}