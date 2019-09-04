package com.wzf.common.api.vo;

import com.wzf.common.constant.CommonConstant;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "接口返回对象",description = "接口返回对象")
public class Result<T> implements Serializable {
    private static final long serialVersionUID = 6565281674070089329L;

    /**
     * 成功标志
     */
    @ApiModelProperty(value = "成功标志")
    private boolean success = true;

    /**
     * 返回处理消息
     */
    @ApiModelProperty(value = "返回处理消息")
    private String message = "操作成功";

    /**
     * 返回代码
     */
    @ApiModelProperty("返回代码")
    private Integer code = 0;

    /**
     * 返回数据对象
     */
    @ApiModelProperty("返回数据对象")
    private T data;

    /**
     * 时间戳
     */

    public Result(Integer code,String message,T data){
        this.code = code;
        this.message = message;
        this.data = data;
    }
    @ApiModelProperty("时间戳")
    private long timestamp = System.currentTimeMillis();

    public  Result<T> error500(String message){
        this.message =message;
        this.code = CommonConstant.SERVER_ERROR_500;
        this.success=false;
        return this;
    }

    public Result<T> success(String message){
        this.message = message;
        this.code = CommonConstant.OK;
        this.success = true;
        return this;
    }

    public Result<T> success(){
        return success("调用成功");
    }

    public Result<T> success(T data){
        this.message = "调用成功";
        this.code = CommonConstant.OK;
        this.success = true;
        this.data = data;
        return this;
    }
    public Result<T> success(String message,T data){
        this.message = message;
        this.code = CommonConstant.OK;
        this.success = true;
        this.data = data;
        return this;
    }

    public static Result<Object> ok(){
        Result<Object> r = new Result<>();
        r.setSuccess(true);
        r.setCode(CommonConstant.OK);
        r.setMessage("success");
        return r;
    }
    public static Result<Object> ok(String msg) {
        Result<Object> r = new Result<Object>();
        r.setSuccess(true);
        r.setCode(CommonConstant.OK);
        r.setMessage(msg);
        return r;
    }

    public static Result<Object> ok(Object data) {
        Result<Object> r = new Result<Object>();
        r.setSuccess(true);
        r.setCode(CommonConstant.OK);
        r.setData(data);
        return r;
    }

    public static Result<Object> error(String msg) {
        return error(CommonConstant.SERVER_ERROR_500, msg);
    }

    public static Result<Object> error(int code, String msg) {
        Result<Object> r = new Result<Object>();
        r.setCode(code);
        r.setMessage(msg);
        r.setSuccess(false);
        return r;
    }

    /**
     * 未授权返回结果
     */
    public static <T> Result<T> forbidden(T data) {
        return new Result<T>(ResultCode.FORBIDDEN.getCode(), ResultCode.FORBIDDEN.getMessage(), data);
    }

    /**
     * 未登录返回结果
     */
    public static <T>Result<T> unauthorized(T data) {
        return new Result<T>(ResultCode.UNAUTHORIZED.getCode(), ResultCode.UNAUTHORIZED.getMessage(), data);
    }

    /**
     * 无权限访问返回结果
     */
    public static Result<Object> noauth(String msg) {
        return error(CommonConstant.NO_AUTH, msg);
    }
}
