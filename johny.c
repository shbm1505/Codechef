#include<stdio.h>
 
int main()
{
    int t,i,j,k,l,n,count=0,m;
    long int a[100];
    scanf("%d",&t);
    while(t--)
    {count=0;
              scanf("%d",&n);
              for(i=1;i<=n;i++)
              scanf("%d",&a[i]);
                              
              scanf("%d",&k);
              for(i=1;i<=n;i++)
                               if(a[i]<=a[k])
                               count++;
                               printf("%d\n",count);
                               }
                               
                               return 0;
                               }