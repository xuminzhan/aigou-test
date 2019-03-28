package cn.itsource.common;

public class AjaxResult {
    public static void main(String[] args) {
        AjaxResult.me().setSuccess(false).setMsg("操作失败").setObject("error");
    }
    //判断是否操作成功
    private boolean success=true;
    //操作结果
    private String msg="操作成功";
    //返回后台数据信息
    private Object object=null;
    public static AjaxResult me(){
        return new AjaxResult();
    }

    public boolean isSuccess() {
        return success;
    }

    public AjaxResult setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public AjaxResult setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public Object getObject() {
        return object;
    }

    public AjaxResult setObject(Object object) {
        this.object = object;
        return this;
    }

    @Override
    public String toString() {
        return "AjaxResult{" +
                "success=" + success +
                ", msg='" + msg + '\'' +
                ", object=" + object +
                '}';
    }
}
