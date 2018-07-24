package com.doctorai.test;

/**
 * @author Jimmy
 * @date 2018/7/24
 */
public class Result {

    private Integer state; //返回状态码(0:异常 1:正常)
    private Object date;  //封装返回数据


    public Result(Integer state, Object date) {
        this.state = state;
        this.date = date;
    }


    public Result() {
    }


    public Integer getState() {
        return state;
    }

    public Object getDate() {
        return date;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public void setDate(Object date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Result{" +
                "state=" + state +
                ", date=" + date +
                '}';
    }
}
