package keyto.cloud.person.domain;

import com.google.common.base.Objects;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;

/**
 * @author Keyto
 * @create 2017/8/5
 */
@Entity
public class Person extends AbstractPersistable<Long> {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
