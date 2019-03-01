package org.apache.rocketmq.namesrv;

import org.junit.Test;

import java.util.Map;

/***
 *
 * @author: liuyiyou.cn
 * @date: 2019/2/28
 * @Copyright 2019 liuyiyou.cn Inc. All rights reserved
 */
public class EnvTest {

    @Test
    public void getEnv() {
        Map<String, String> map = System.getenv();
        map.forEach((key, value) -> System.out.println(key + "=" + value));
    }

}
