class IntegerDemo
{
	public static void main(String[] args)
	{
		Integer x = 4;//�Զ�װ��  new Integer(4);
		
		x = x +2;//�Զ�����  x+2 �������Զ����䣬�����int���ͣ���2���мӷ����㣬�ٽ��ͽ���װ�丳��x��
		
		Integer m = 128;
		Integer n = 128;
		
		sop("m==n:"+(m==n));
		
		Integer a = 127;
		Integer b = 127;
		
		sop("a==b:"+(a==b));//���Ϊtrue����Ϊa �� bָ����ͬһ��Integer����
						   //��Ϊ����ֵ��byte��Χ���ݣ����������ԣ�
						   //�������ֵ�Ѿ����ڣ��򲻻��ٿ����µĿռ䡣
	}
	
	public static void method()
	{
		Integer x = new Integer("123");
		
		Integer y = new Integer(123);
		
		sop("x==y"+(x==y));
		sop("x.equals(y)"+x.equals(y));
	}
	public static void sop(String str)
	{
		System.out.println(str);
	}
}

