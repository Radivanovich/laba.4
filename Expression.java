package laba3; 

/*
 * 4.	� ������ ����� �������� ����� �������� ��������� ����������, ����� ������� ����� �� ��������� � ������ �����.
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Expression {

	public static boolean test(String str) {
		Pattern p = Pattern.compile(".*,|.*\\.|.*\\?|.*!");
		Matcher m = p.matcher(str);
		return m.matches();
	}

	public static void main(String[] args) {
		String str = "���� ���� ��� � ����, � ���� � ��� ������� ����.";
		String replacement = "replace";
		String[] s1 = str.split(" ");
		int n;
		Scanner inp = new Scanner(System.in);
		System.out.println("����� ����� ����� �� ������ ��������?");
		n = inp.nextInt();
		int arr[];
		arr = new int[s1.length];
		int j=0;
		try
		{
		for (int i = 0; i < s1.length; i++)
			if (s1[i].length() == n) {
				if (test(s1[i]) == false)
				{
					s1[i] = replacement;
					arr[j]=i;
					j++;
				}
			} else if (s1[i].length() - 1 == n) {
				if (test(s1[i]) == true)
				{
					s1[i] = replacement;
					arr[j]=i;
					j++;
				}
			}
		str = "";
		for (int i = 0; i < s1.length; i++)
			str += s1[i] + " "; 
		}
		catch (ArrayIndexOutOfBoundsException e) { 
            System.out.println("��������� �� ������������� ������� �������");       
        }
		catch (Exception e) { 
            System.out.println("��������� ��� �����-�� ����������"); 
        } 
		finally{
			if(j!=0)
			{
			System.out.print("������ ����� � �������� ");
			for (int i = 0; i < j; i++)
				System.out.print(arr[i]+" ");
			System.out.println();
			}
			else
				System.out.println("������ �� ������");	
		}
		System.out.println(str);
	}
}
