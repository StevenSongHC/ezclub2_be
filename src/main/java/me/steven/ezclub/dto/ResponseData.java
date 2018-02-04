package me.steven.ezclub.dto;

import com.google.gson.Gson;

public class ResponseData {

    private Boolean success;        // success flag
    private Integer status;         // http status code
    private Integer code;           // customized code
    private String msg;             // message
    private Object data;            // data to display

    public ResponseData() {
        // set to success by default
        this.success = true;
        this.status = 200;
    }

    public ResponseData(Boolean success, Integer status, String msg, Object data) {
        this.success = success;
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    public Boolean getSuccess() {
        return success;
    }
    public void setSuccess(Boolean success) {
        this.success = success;
    }
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    public Integer getCode() {
        return code;
    }
    public void setCode(Integer code) {
        this.code = code;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }

}
