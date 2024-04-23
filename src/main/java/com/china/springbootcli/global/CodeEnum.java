package com.china.springbootcli.global;

public enum CodeEnum {
    SUCESS(200,"成功"),
    ERROR(500,"失败");

    private int code;
    private String msg;

    CodeEnum(int code, String msg){
        this.msg= msg;
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
