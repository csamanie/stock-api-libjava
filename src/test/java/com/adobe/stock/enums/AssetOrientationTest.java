/*******************************************************************************
 * Copyright 2017 Adobe Systems Incorporated. All rights reserved.
 * This file is licensed to you under the Apache License, Version 2.0
 * (the "License") you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 *******************************************************************************/
package com.adobe.stock.enums;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({ com.adobe.stock.logger.TestCustomLogger.class,
        com.adobe.stock.logger.TestSuiteLogger.class })
@Test(suiteName = "AssetOrientation")
public class AssetOrientationTest {
    private HashMap<AssetOrientation, String> testData = new HashMap<AssetOrientation, String>();

    @BeforeClass
    public void initializeTestData() {
        testData.put(AssetOrientation.HORIZONTAL, "horizontal");
        testData.put(AssetOrientation.VERTICAL, "vertical");
        testData.put(AssetOrientation.SQUARE, "square");
        testData.put(AssetOrientation.ALL, "all");
    }

    @Test(groups = "AssetOrientation.toString")
    public void toString_should_return_string_equivalent_value_of_AssetOrientation_enum() {
        for (AssetOrientation env : AssetOrientation.values()) {
            AssetOrientation.valueOf(env.name());
            Assert.assertEquals(env.toString(), testData.get(env));
        }
    }
}
