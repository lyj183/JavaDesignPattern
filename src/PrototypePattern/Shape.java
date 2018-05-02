package PrototypePattern;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/6 16:28
 * @Description: 第1步 创建一个实现Clonable接口的抽象类。
 */

public abstract class Shape implements Cloneable {
    private String id;
    protected String type;

    abstract void draw();

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }
}
