package com.novoda.gradle.test;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class SimpleTest {

    @Test
    public void doesNotExplode() throws Exception {
        Simple simple = new Simple();
        assertNotNull(simple);
    }
}
