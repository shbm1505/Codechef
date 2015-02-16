#include<stdio.h>
 
int main()
{
    int t,b,e,p,c;
    
    scanf("%d",&t);
    while(t--)
    {         c=0;
              scanf("%d",&p);
              
              
              if(p>=2048)
              {while(p>=2048)
              {
              p=p-2048;
              c++;
              }
              }
               if(p>=1024&&p<2048)
              {
              p=p-1024;
              c++;
    
              }
               if(p>=512&&p<1024)
              {
                                p=p-512;
                                c++;
                    
                                }
              if(p>=256&&p<512)
              {
                               p=p-256;
                               c++;
                    
                               }
               if(p>=128&&p<256)
              {
                               p=p-128;
                               c++;
                               }
               if(p>=64&&p<128)
              {
                              p=p-64;
                              c++;
              
                              }
               if(p>=32&&p<64)
              {
                             p=p-32;
                             c++;
                             }
               if(p>=16&&p<32)
              {
                             p=p-16;
                             c++;
                    
                             }
               if(p>=8&&p<16)
              {
                            p=p-8;
                            c++;
              
                            }
               if(p>=4&&p<8)
              {
                           p=p-4;
                           c++;
                    
                           }
               if(p>=2&&p<4)
              {
                           p=p-2;
                           c++;
                    
                           }
              if(p==1)
              {
                   
              c++;
              
              }
              
              printf("%d\n",c);
              }
 
    return 0;
}