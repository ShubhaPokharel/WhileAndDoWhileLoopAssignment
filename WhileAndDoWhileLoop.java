class WhileAndDoWhileLoop{
	public static void main(String[] args){
	 int num = 10;
	 int start = 1;
	 int sum = 0;

        while(start <= num)
        {
            sum += start;
            start++;
        }

        System.out.println(sum);
	}
}