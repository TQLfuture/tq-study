package com.tq.biz.cm;

import java.util.HashMap;
import java.util.Map;

/**
 * 转运补贴
 */
public class TransferSubsidyComponents extends AbstractComponents {

    /**
     * 构建 参数
     *
     * @param param
     * @return
     */
    public Map<String, String> map(Map<String, String> param) {
        Map<String/*expression*/, String/*结果*/> map = new HashMap<>();
        map.put("斗转", "70");
        map.put("塔吊", "80");
        return map;
    }

    @Override
    public String buildExpression() {
        Map<String, String> map = this.map(null);
        return null;
    }
}
