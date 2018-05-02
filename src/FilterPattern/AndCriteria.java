package FilterPattern;

import java.util.List;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/11 10:05
 * @Description: 第3步 创建实现Criteria接口的具体类(CriteriaMale, CriteriaFemale, AndCriteria, OrCriteria)。
 **/

public class AndCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
        return otherCriteria.meetCriteria(firstCriteriaPersons);
    }
}
