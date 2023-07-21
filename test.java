// Java for the above approach
class test{
    public static void findNumbers(int N)
    {
        int half = N / 2;
        if (N % 2 == 0)
        {
            half--;
        }
        for(int i = 1; i <= half; i++)
        {
        System.out.print((-1) * i + ", " +
                                i + ", ");
        }
    
        int check = N & 1;
        if (check != 0)
        {
            System.out.println(N);
        }
        else
        {
        System.out.println(0 + ", " + N);
        }
    }
    public static void main(String[] args)
    {
            
        int N = 5;
        findNumbers(N);
    }
    }
    
    
    