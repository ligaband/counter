public class Counter {
    //recursion: the process of a function/method calling itself


    //create a method that counts up from a start number to a finish number.
    void countUp(int start, int stop){
        //check if start value is greater than final value, then return an error if so.
        if (start > stop){
            System.out.println("Start number must be less than final value. Please try again!");
            return;
        }
        //print the value of start to the console
        System.out.println(start);

        //add one to the value of start
        start++;

        if (start <= stop){
            countUp(start, stop);
        }
        return;
    }

    void countDown(int start, int stop){
        if (start < stop){
            System.out.println("Start number must be greater than final value. Please try again!");
            return;
        }

        System.out.println(start);

        start--;

        if (start >= stop){
            countDown(start, stop);

        }
        return;

    }
}
