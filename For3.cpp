#include<stdio.h>

main()
{
	int i,n,fact;			
	printf("\n\t Enter the Number = ");
	scanf("%d",&n);	
	
	for(i=1,fact=1;i<=n;i++)	
		fact=fact*i;

	printf("\n\t Factorial = %d",fact);	
}

