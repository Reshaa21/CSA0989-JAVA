class AreaRect 
{
    int length, breath;

    AreaRect(int a, int b)
    {
        length = a;
        breath = b;
    }

    void Area()
    {
        int area = length * breath;
        System.out.println("Area of Rectangle = " + area);
    }
}

 class AreaOfRectangle
 {
    public static void main(String[] args) 
	{
        AreaRect rect = new AreaRect(10, 20);
        rect.Area();
        }
}
