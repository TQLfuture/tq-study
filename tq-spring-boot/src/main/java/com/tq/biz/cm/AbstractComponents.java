package com.tq.biz.cm;

import com.tq.biz.cm.input.Input;

/**
 * 抽象组件
 */
public abstract class AbstractComponents<In extends Input> {

    /**
     * 组件名称
     */
    public String name;

    public String buildExpression() {
        return null;
    }

    public String execute(In input) {
        return null;
    }
}
