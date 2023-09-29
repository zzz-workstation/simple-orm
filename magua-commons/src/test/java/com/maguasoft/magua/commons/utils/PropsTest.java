package com.maguasoft.magua.commons.utils;

import com.maguasoft.magua.commons.io.Props;
import com.maguasoft.magua.commons.utils.bean.TestBean;
import org.junit.Assert;
import org.junit.Test;

import java.util.Properties;

public class PropsTest {

    String defaultPath = "./test.properties";

    @Test
    public void testGetProps() {
        Properties props = Props.getProps(defaultPath);
        Assert.assertNotNull(props);
        Assert.assertNotNull(props.get("database.uri"));
        Assert.assertNotNull(props.get("database.name"));
        Assert.assertNotNull(props.get("database.password"));
        Assert.assertNotNull(props.get("database.dialect"));
        Assert.assertNotNull(props.get("database.entity-package"));
    }

    @Test
    public void testGetPropsValueBy() {
        String value = Props.getPropsValueBy(defaultPath, "entity-package");
        Assert.assertNotNull(value);
    }

    @Test
    public void testGetBeanProps1() {
        TestBean beanProps = Props.getBeanProps(defaultPath, TestBean.class, "database");
        System.out.println(beanProps);
        Assert.assertNotNull(beanProps);
        Assert.assertNotNull(beanProps.getUri());
        Assert.assertNotNull(beanProps.getName());
        Assert.assertNotNull(beanProps.getPassword());
        Assert.assertNotNull(beanProps.getDialect());
        Assert.assertNotNull(beanProps.getEntityPackage());
    }

    @Test
    public void testGetBeanProps2() {
        TestBean beanProps = Props.getBeanProps(defaultPath, TestBean.class);
        System.out.println(beanProps);
        Assert.assertNotNull(beanProps);
        Assert.assertNotNull(beanProps.getUri());
        Assert.assertNotNull(beanProps.getName());
        Assert.assertNotNull(beanProps.getPassword());
        Assert.assertNotNull(beanProps.getDialect());
        Assert.assertNotNull(beanProps.getEntityPackage());
    }
}
