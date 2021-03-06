package FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/11 09:41
 * @Description: 第3步 创建实现Criteria接口的具体类(CriteriaMale, CriteriaFemale, AndCriteria, OrCriteria)。
 **/

public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();
        for (Person person :
                persons) {
            if (person.getGender().equalsIgnoreCase("MALE")) {
                malePersons.add(person);
            }
            }
        return malePersons;
    }
}
