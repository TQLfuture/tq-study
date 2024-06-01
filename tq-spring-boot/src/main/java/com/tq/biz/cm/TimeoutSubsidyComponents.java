package com.tq.biz.cm;

import java.util.HashMap;
import java.util.Map;

/**
 * 超时补贴
 */
public class TimeoutSubsidyComponents extends AbstractComponents {

    public  Map<String,String> param() {
        // 补贴
        Map<String,String> map = new HashMap<>();
        map.put("overTime","6");

        map.put("subsidy","10");
        // 超过 overTime 的时间，超时的部分就按照 （x-overTime）* subsidy

        // 如果这里的special 这里的表达就是，选择了
        map.put("special","0");
        map.put("specialTypes","塔吊;泵送");
        return map;
    }

    @Override
    public String buildExpression() {
        // 每个节点都会有自己的expression 表达
        return null;
    }
}
