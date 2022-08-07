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



public class CoinFactory {


  public static Coin getCoin(String type) throws Exception {

    if ("copperCoin".equals(type)){
      // 做一些特殊的配置
      CopperCoin.DESCRIPTION = CopperCoin.DESCRIPTION + "（初始化过的）";

      // 初始化
      return new CopperCoin();
    }else if ("goldCoin".equals(type)){
      // 做一些特殊的配置
      GoldCoin.DESCRIPTION = GoldCoin.DESCRIPTION + "（初始化过的）";

      return new GoldCoin();
    }else {
      throw new Exception("参数错误");
    }

  }
}
