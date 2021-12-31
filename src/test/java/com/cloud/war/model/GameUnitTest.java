/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.cloud.war.model;

import com.cloud.war.model.biology.Biology;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * {@link GameUnit} test
 */
public class GameUnitTest {

    private GameUnit gameUnit;

    @BeforeEach
    public void init() {
        gameUnit = new Biology(10, 10, 10, 10);
    }

    @Test
    public void moveUpTest() {
        gameUnit.moveUp(10);
        Assertions.assertEquals(0, gameUnit.getLocation().getTop());
        Assertions.assertEquals(10, gameUnit.getLocation().getBottom());
        Assertions.assertEquals(10, gameUnit.getLocation().getLeft());
        Assertions.assertEquals(20, gameUnit.getLocation().getRight());
    }

    @Test
    public void moveDownTest() {
        gameUnit.moveDown(10);
        Assertions.assertEquals(20, gameUnit.getLocation().getTop());
        Assertions.assertEquals(30, gameUnit.getLocation().getBottom());
        Assertions.assertEquals(10, gameUnit.getLocation().getLeft());
        Assertions.assertEquals(20, gameUnit.getLocation().getRight());
    }

    @Test
    public void moveLeftTest() {
        gameUnit.moveLeft(10);
        Assertions.assertEquals(10, gameUnit.getLocation().getTop());
        Assertions.assertEquals(20, gameUnit.getLocation().getBottom());
        Assertions.assertEquals(0, gameUnit.getLocation().getLeft());
        Assertions.assertEquals(10, gameUnit.getLocation().getRight());
    }

    @Test
    public void moveRightTest() {
        gameUnit.moveRight(10);
        Assertions.assertEquals(10, gameUnit.getLocation().getTop());
        Assertions.assertEquals(20, gameUnit.getLocation().getBottom());
        Assertions.assertEquals(20, gameUnit.getLocation().getLeft());
        Assertions.assertEquals(30, gameUnit.getLocation().getRight());
    }
}
