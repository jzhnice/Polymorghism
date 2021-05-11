package Demo03;

import javax.swing.text.StyledEditorKit;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-11 09:52
 */
public class Woman  extends  Person{
    boolean isBeauty;
    public void goShoppong(){
        System.out.println("女人喜欢购物");
    }

    @Override
    public void eat(){
        System.out.println("女人少吃，为了减肥");
    }
    @Override
    public void walk(){
        System.out.println("女人苗条的走路");
    }
}
