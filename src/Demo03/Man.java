package Demo03;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-11 09:50
 */
public class Man  extends  Person{
    boolean isSmoking;
    public void earnMoney(){
        System.out.println("男人负责杨家");
    }

    @Override
    public void eat(){
        System.out.println("男人多吃肉，长肌肉");
    }
    @Override
    public void walk(){
        System.out.println("男人霸气的走路");
    }




}
