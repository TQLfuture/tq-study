package com.tq.biz.tm;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 一维 表格模板
 */
public class OneSheetTemplate extends AbstractTemplate {

    /**
     * 表格名称
     */
    public String title;

    /**
     * 行
     */
    public List<OneSheetRow> rows;

    /**
     * 表格头
     */
    public Header header;


    @Data
    @Builder
    static class OneSheetRow {
        /**
         * 第一维expression
         */
        public String expression;


        /**
         * 结果数据
         */
        public String result;
    }

    @Data
    @Builder
    static class Header {

        /**
         * 第一维expression
         */
        public String expressionDesc;
        /**
         * 结果数据
         */
        public String resultDesc;
    }

    @Override
    public String show() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.title).append("\n");
        builder.append(this.header.expressionDesc).append("  |  ").append(this.header.resultDesc).append("\n");
        this.rows.forEach( v -> {
            builder.append(v.expression).append("  |  ").append(v.result).append("\n");
        });
        System.out.println("\n"+builder.toString()+"\n");
        return builder.toString();
    }

    public static List<OneSheetRow> mockRows() {
        List<OneSheetRow> list = new ArrayList<>();
        list.add(OneSheetRow.builder().expression("0<{weight}<10").result("70").build());
        list.add(OneSheetRow.builder().expression("{weight}=10").result("80").build());
        list.add(OneSheetRow.builder().expression("{weight}>10").result("(80 + {weight}-10)*0.3").build());
        // 同时这里的模板的概念
        return list;
    }

    public static OneSheetTemplate mockOneSheetTemplate() {
        OneSheetTemplate sheet = new OneSheetTemplate();
        sheet.title = "        重量计算        ";
        sheet.header = Header.builder().expressionDesc("kg").resultDesc("元/kg").build();
        sheet.rows = mockRows();
        return sheet;
    }

    public static void main(String[] args) {
        mockOneSheetTemplate().show();
    }
}
