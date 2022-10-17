package service.test3;

/**
 * @program: SA1
 * @description:
 * @author: lydms
 * @create: 2022-10-16 21:46
 **/
public class KWICSubject extends Subject{
    public void startKWIC(){
        for (int i = 0;i<4;i++){
            super.notifyOneObserver(i);
        }
    }
}
