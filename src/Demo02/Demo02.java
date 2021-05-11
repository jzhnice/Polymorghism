package Demo02;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-11 09:38
 */
public class Demo02 {
    class Father {

        public void running() {
            System.out.println("跑步可以带来健康");
        }
    }




        class Son extends Father {

            @Override
            public void running() {
                System.out.println("跑步太累，不想动");
            }

            public void game() {
                System.out.println("游戏让我交到了很多的朋友");
            }
        }



        class Girl extends Father {
            @Override
            public void running() {
                System.out.println("跑步可以让我保持身材");
            }

            public void sing() {
                System.out.println("唱歌可以让我更有自信");
            }
        }
//    public static void main(String[] args) {
//        Demo02 a = new Girl();
//    }

    }



