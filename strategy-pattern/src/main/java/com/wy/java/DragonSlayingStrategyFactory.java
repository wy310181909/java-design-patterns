/*
 * The MIT License
 * Copyright © 2014-2021 Ilkka Seppälä
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.wy.java;


import com.wy.utils.ClassUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Factory of coins.
 */
public class DragonSlayingStrategyFactory {

    private static Map<String, DragonSlayingStrategy> map = new HashMap<>();

    static {
        List<Class<DragonSlayingStrategy>> interfaceImpls = ClassUtil.getInterfaceImpls(DragonSlayingStrategy.class);
        for (Class<DragonSlayingStrategy> item : interfaceImpls) {

            try {
                DragonSlayingStrategy dragonSlayingStrategy = item.newInstance();
                String className = dragonSlayingStrategy.getType();
                map.put(className,dragonSlayingStrategy);

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    /**
     * Factory method takes as a parameter the coin type and calls the appropriate class.
     */
    public static DragonSlayingStrategy getStrategy(String type) throws Exception {

        DragonSlayingStrategy item = map.get(type);
        if (item==null){
            throw new RuntimeException("type错误");
        }
        return item;

    }
}
