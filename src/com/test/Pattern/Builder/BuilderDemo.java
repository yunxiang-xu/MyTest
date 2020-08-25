package com.test.Pattern.Builder;

import com.test.Pattern.Strategy.StrategyContext;
import com.test.Pattern.Strategy.StrategyImpl1;
import com.test.Pattern.Strategy.StrategyImpl2;

public class BuilderDemo {
	// 真正的属性都是不可变的
    private final int id;
    private final String action;
    private final String operator;
    private final String content;
    
 // 私有构造方法，只被 Builder 类调用
    private BuilderDemo(Builder builder) {
        this.id = builder.id;
        this.action = builder.action;
        this.operator = builder.operator;
        this.content = builder.content;
    }
    
    public static class Builder {
        //必须参数
        private int id;
        private String action;

        // 可选参数
        private String content = "";
        private String operator;


        //使用设置好的参数值新建 OperateLog 对象
        public BuilderDemo build(){
            return new BuilderDemo(this);
        }

        // 每个 setter 方法都返回当前的对象，做到链式调用
        public Builder setContent(String content) {
            this.content = content;
            return this;
        }

        public Builder setOperator(String operator) {
            this.operator = operator;
            return this;
        }
    }
    
    
    public static void main(String[] args) {
    	BuilderDemo demo = new BuilderDemo.Builder().setContent("aaa").setOperator("bbb").build();
    	System.out.println(demo);
		
	}
}
