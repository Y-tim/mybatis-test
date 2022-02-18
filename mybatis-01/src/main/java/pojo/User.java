package pojo;

/**
 * @author ylx
 * date 2022/2/15 14:16
 */
public class User {
    private String id;
    private String name;
    private  String sex;

    public User() {
    }

    public User(String id, String name, String sex) {
        this.id = id;
        this.name = name;
        this.sex = sex;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex+"'";
    }
}
