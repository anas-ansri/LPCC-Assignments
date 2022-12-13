%{

#include <stdio.h>

%}



%%

[\t]+ ;

is |
am |
are |
was |
be |
being |
do |
will |
would |
should  {printf("%s : is a verb", yytext);}


[a-zA-Z]+ {
    printf("%s: don't recognize, might be a noun\n", yytext);
}

.|\n {ECHO ;}

%%


int yywrap(void){

}

int main(){
    printf("Enter a string: ");
    yylex()
}