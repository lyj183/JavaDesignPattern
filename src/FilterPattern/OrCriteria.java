package FilterPattern;

import java.util.List;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/11 10:12
 * @Description: 第3步 创建实现Criteria接口的具体类(CriteriaMale, CriteriaFemale, AndCriteria, OrCriteria)。
 **/

public class OrCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaItems = criteria.meetCriteria(persons);
        List<Person> otherCriteriaItems = otherCriteria.meetCriteria(persons);

        for (Person person :
                otherCriteriaItems) {
            if (!firstCriteriaItems.contains(person)) {
                firstCriteriaItems.add(person);
            }
        }

        return firstCriteriaItems;
    }
}
