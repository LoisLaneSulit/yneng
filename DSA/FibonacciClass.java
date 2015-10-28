public class FibonacciClass {
    private int x;
    
    FibonacciClass(int value){
        x = value;    
    }
    
    public int fibonacci(int x){
        if (x == 0){
            return 0;
        }else if (x == 1){
            return 1;
        }else{
            return fibonacci(x-2) + fibonacci(x-1);
        }
    }
    
    public void result(){
        for(int i = 0; i<x; i++){
            System.out.print(fibonacci(i) + " ");
    }
}
    
}
