package com.tenable.io.api;


import com.tenable.io.api.editors.models.Filter;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertNotNull;


/**
 * Copyright (c) 2017 Tenable Network Security, Inc.
 */
public class FiltersApiClientTest extends TestBase {

    @Test
    public void testFilters() throws Exception {
        TenableIoClient apiClient = new TenableIoClient();
        List<Filter> filters = apiClient.getFiltersApi().workbenchesVulnerabilities();
        assertNotNull( filters );
    }

}
