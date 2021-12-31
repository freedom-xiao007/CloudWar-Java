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

package com.cloud.war.controll;

import com.cloud.war.model.GameUnit;

import java.util.ArrayList;
import java.util.List;

/**
 * 持有所有的游戏单位
 */
public class UnitContainer {

    private static final UnitContainer instance = new UnitContainer();

    public static UnitContainer getInstance() {
        return instance;
    }

    List<GameUnit> gameUnits = new ArrayList<>();

    public void addGameUnits(final GameUnit gameUnit) {
        this.gameUnits.add(gameUnit);
    }

    public void flush() {
        gameUnits.forEach(GameUnit::update);
    }

    public void collision() {
        for (final GameUnit gameUnit: gameUnits) {
            gameUnit.attack(gameUnits);
        }
    }
}
