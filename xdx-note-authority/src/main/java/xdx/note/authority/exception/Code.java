package xdx.note.authority.exception;

import xdx.note.framework.common.param.BaseCode;

public enum Code implements BaseCode {

/**
 * 一共10位，分成四段:
 * 第一段1位，异常类型(1业务异常 2系统异常)
 * 第二段3位，系统类型(001用户系统 002商品系统)
 * 第三段3位，模块(001MDM 002USER)
 * 第四段3位，错误码(每个模块自增)
 */

    /**
     * 业务异常
     */
    SUCCESS("1001001000", "成功"),


    /**
     * 系统异常
     */
    FAIL("2001001999", "失败"),
    ;


    private String code;
    private String msg;

    Code(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getMsg() {
        return msg;
    }
}
