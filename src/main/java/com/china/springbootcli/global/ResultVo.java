package com.china.springbootcli.global;

import lombok.Data;

@Data
public class ResultVo<T> {
    private String msg;
    private int code;
    private T data;

    public ResultVo<T> ok(){
        return null;
    }


}
