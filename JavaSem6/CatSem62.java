package JavaSem6;

import java.util.Objects;

public class CatSem62 {
    String name;
    Integer age;
    Integer weight;
    Integer height;
    String sex;
    String ownerName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CatSem62 CatSem62 = (CatSem62) o;
        return Objects.equals(name, CatSem62.name) || Objects.equals(age, CatSem62.age);
    }
    @Override
    public String toString() {
        return "Владелец: " + ownerName + ". Кот: " + name + ". Возраст: " 
        + age + ". Вес: " + weight + ". Рост: " + height + ". Пол: " + sex + ".\n";
    }

    public String getName() {
        return name;
    }
    public Integer getAge() {
        return age;
    }
    public Integer getWeight() {
        return weight;
    }
    public Integer getHeight() {
        return height;
    }
    public String getSex() {
        return sex;
    }
    public String getOwnerName() {
        return ownerName;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public void setWeight(Integer weight) {
        this.weight = weight;
    }
    public void setHeight(Integer height) {
        this.height = height;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
