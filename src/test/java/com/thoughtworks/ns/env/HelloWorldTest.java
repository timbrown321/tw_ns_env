package com.thoughtworks.ns.env;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class HelloWorldTest {
    @Test
    public void testSum() throws Exception {
        assertThat(3, is(HelloWorld.sum(1, 2)));
    }
}
