#include<stdio.h>
#include<conio.h>
void main()
{
	int n[100],m[100],o[100],no1,i,no2,j;
	
	printf("Enter Size Of Array1: ");
	scanf("%d",&no1);
	printf("Enter Size Of Array2: ");
	scanf("%d",&no2);
	if(no1!=no2)
	{
		printf("Size of Array1 & Array2 Must Be Same");
		printf("Enter Size Of Array2: ");
		scanf("%d",&no2);
	}
	else
	{
		
		for(i=0;i<no1;i++)
		{
			printf("Enter Value For: ",no1[i]);
			scanf("%d",&no1[i]);
		}
	
		
		for(j=0;j<no2;j++)
		{
			printf("Enter Value For: ",no2[i]);
			scanf("%d",&no2[i]);
		}
	}
	