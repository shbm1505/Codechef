#include<stdio.h>
#include<string.h>
 
 
int main()
{
     int i=0,j,k,t,count;
     scanf("%d",&t);
     char text[100];
     char r;
     while(i<t)
     {
                count=0;
                scanf("%s",&text);
                k=strlen(text);
                for(j=0;j<k;j++)
                {
                                r=text[j];
                                if(r=='A'||r=='D'||r=='O'||r=='P'||r=='Q'||r=='R')
                                count++;
                                if(r=='B')
                                count=count+2;
                                }
                              i++; printf("%d\n",count);  }
                             
                              
                                   return 0;                
    }

