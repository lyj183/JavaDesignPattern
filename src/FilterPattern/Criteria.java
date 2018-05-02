package FilterPattern;

import java.util.List;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/11 09:39
 * @Description: 第2步 创建Criteria的接口。
 **/

public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
