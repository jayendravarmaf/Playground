#include <stdio.h>
#include <string.h>

void lower_string(char s[]) {
   int c = 0;
   
   while (s[c] != '\0') {
      if (s[c] >= 'A' && s[c] <= 'Z') {
         s[c] = s[c] + 32;
      }
      c++;
   }
}

int main()
{
    char str[100], sub[100];

    int i, j, l, l1, l2;
    int count = 0, count1 = 0;
    i = 0;
    while (1)
    {
        scanf("%c", &str[i]);
        if (str[i] == '\n')
            break;
        i++;
    }
    i = 0;
    while (1)
    {
        scanf("%c", &sub[i]);
        if (sub[i] == '\n')
            break;
        i++;
    }

    lower_string(str);
    lower_string(sub);


    l1 = strlen(str);
    l2 = strlen(sub);

    for (i = 0; i <= l1;)
    {
        j = 0;
        count = 0;
        while ((str[i] == sub[j]))
        {
            count++;
            i++;
            j++;
        }
        if (count == l2)
        {
            count1++;
            count = 0;
        }
        else
            i++;
    }


    
        printf("%d", count1);

    return 0;
}

