package FilterPattern;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/11 09:33
 * @Description: 第1步 创建要应用标准的类。
 **/

public class Person {
    private String name;
    private String gender;
    private String maritalStatus;
    public Person(String name, String gender, String maritalStatus) {
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }
}
