package com.tq.biz.cm;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.TypeReference;
import com.tq.biz.cm.input.FanliaoInput;
import com.tq.biz.cm.input.Input;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 反料组件
 */
public class FanLiaoComponents extends AbstractComponents<FanliaoInput> {

    public List<ReturnEntiy> list() {
        List<ReturnEntiy> list = new ArrayList<>();
        list.add(ReturnEntiy.builder().returnAmount("3").subsidy("0").build());
        list.add(ReturnEntiy.builder().returnAmount("3").subsidy("6").build());
        // 这里的expression依赖总运费
        list.add(ReturnEntiy.builder().returnAmount("all").subsidy("0.6").build());
        return list;
    }


    @Builder
    @Data
    static class ReturnEntiy {
        /**
         * 特殊，如果是整车，补贴为60%
         */
        String returnAmount;
        String subsidy;
    }

    @Override
    public String buildExpression() {
        return null;
    }

    @Override
    public String execute(FanliaoInput input) {
        return null;
    }
    
    @Data
    static class A<T extends B> {
        private String userName;
        private T t;
    }
    @Data
    static class B  {
        private String password;
    }

    @Data
    static class B1 extends B {
        private String b1;
    }

    @Data
    static class B2 extends B {
        private String b2;
    }

    public static void main(String[] args) {
        String s = JSON.toJSONString(null);

        String s1 = "{\"password\":\"xx\",\"userName\":\"bb\"}";
        A o = JSON.parseObject(s1, new TypeReference<A>() {});
        B o1 = JSON.parseObject(s1, new TypeReference<B>() {});

        System.out.println(s);

    }
}
