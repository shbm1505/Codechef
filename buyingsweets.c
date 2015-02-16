#include<stdio.h>
 
int A[100];
 
int main()
{
	int i,min,N,sweets,T,total,X;
	scanf("%d",&T);
	while(T--)
	{
		scanf("%d %d",&N,&X);
		total=0;
		for(i=0;i<N;i++)
		{
			scanf("%d",&A[i]);
			total+=A[i];
		}
		sweets=total/X;
		min=A[0];
		for(i=1;i<N;i++)
			if(min>A[i])
				min=A[i];
		if(sweets==(total-min)/X)
			printf("-1\n");
		else
			printf("%d\n",sweets);
	}
	return 0;
}  