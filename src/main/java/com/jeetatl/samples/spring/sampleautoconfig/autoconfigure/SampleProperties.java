package com.jeetatl.samples.spring.sampleautoconfig.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "com.jeetatl.samples")
public class SampleProperties {

    private String prop1;

    /**
     * The length of largest side of square.
     */
    private Integer prop2;

    private static SubProp subProp = new SubProp();

    public String getProp1() {
        return prop1;
    }

    public void setProp1(String prop1) {
        this.prop1 = prop1;
    }

    public Integer getProp2() {
        return prop2;
    }

    public void setProp2(Integer prop2) {
        this.prop2 = prop2;
    }

    public static SubProp getSubProp() {
        return subProp;
    }

    public static void setSubProp(SubProp subProp) {
        SampleProperties.subProp = subProp;
    }

    private static class SubProp {
        private String subprop1;

        public String getSubprop1() {
            return subprop1;
        }

        public void setSubprop1(String subprop1) {
            this.subprop1 = subprop1;
        }

        @Override
        public String toString() {
            return "SubProp{" +
                    "subprop1='" + subprop1 + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "SampleProperties{" +
                "prop1='" + prop1 + '\'' +
                ", prop2=" + prop2 +
                ", subProp=" + subProp +
                '}';
    }
}
