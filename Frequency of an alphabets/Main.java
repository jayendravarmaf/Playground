#include <stdio.h>
 
int main()
{
   char string[100];
   int c = 0, count[26] = {0}, x;
 
   gets(string);
 
   while (string[c] != '\0') {
 
      if (string[c] >= 'a' && string[c] <= 'z') {
         x = string[c] - 'a';
         count[x]++;
      }
 
      c++;
   }
 
   for (c = 0; c < 26; c++){
       if(count[c]!=0)
       printf("%c%d ", c + 'a', count[c]);
   }
        
   return 0;
}