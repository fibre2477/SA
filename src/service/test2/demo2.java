package service.test2;

/**
 * @program: SA1
 * @description:
 * @author: lydms
 * @create: 2022-10-16 21:41
 **/
public class demo2 {
    public void main2() {
        Input input = new Input();
        input.input("E:\\input.txt");
        Shift shift = new Shift(input.getLineTxt());
        shift.shift();
        Alphabetizer alphabetizer = new Alphabetizer(shift.getKwicList());
        alphabetizer.sort();
        Output output = new Output(alphabetizer.getKwicList());
        output.output("E:\\output.txt");

    }
}