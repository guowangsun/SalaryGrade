package com.guowangsun;

import java.io.Serializable;

/**
 * 个人类型
 * Created by sun on 15-3-2.
 */
public enum PersonType implements Serializable {
    TEST(0) {
        @Override public PersonType addOne() {
            return ONE;
        }

        @Override public Integer getAward() {
            return 4;
        }
    }, ONE(1) {
        @Override public PersonType addOne() {
            return TWO;
        }

        @Override public Integer getAward() {
            return 7;
        }
    }, TWO(2) {
        @Override public PersonType addOne() {
            return THREE;
        }

        @Override public Integer getAward() {
            return 10;
        }
    }, THREE(3) {
        @Override public PersonType addOne() {
            return FOUR;
        }

        @Override public Integer getAward() {
            return 13;
        }
    }, FOUR(4) {
        @Override public PersonType addOne() {
            return FIVE;
        }

        @Override public Integer getAward() {
            return 16;
        }
    }, FIVE(5) {
        @Override public PersonType addOne() {
            return TOTAL;
        }

        @Override public Integer getAward() {
            return 21;
        }
    }, TOTAL(6) {
        @Override public PersonType addOne() {
            return TOTAL;
        }

        @Override public Integer getAward() {
            return 25;
        }
    };

    private Integer code;

    PersonType(Integer code) {
        this.code = code;
    }

    public abstract PersonType addOne();

    public abstract Integer getAward();

    public Integer getCode() {
        return code;
    }
}
