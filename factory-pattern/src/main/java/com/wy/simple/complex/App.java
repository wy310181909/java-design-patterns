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

package com.wy.simple.complex;


import com.wy.utils.PropertiesUtil;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {

    public static void main(String[] args) throws Exception {
        getProperties1();
        log.info("=====================================");
        getProperties2();
    }


    private static void getProperties1() {
        try {
            Coin copperCoin = CoinFactory.getCoin(PropertiesUtil.getProperties1("class"));
            log.info(copperCoin.getDescription());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 使用类加载器读取配置文件
     */
    private static void getProperties2() {
        try {
            Coin copperCoin = CoinFactory.getCoin(PropertiesUtil.getProperties2("class"));
            log.info(copperCoin.getDescription());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
