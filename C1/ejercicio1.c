#include <stdio.h>

void meses(int mes){
    switch (mes){
    case 1:
        printf("Enero\n");
        break;
    case 2:
        printf("Febrero\n");
        break;
    case 3:
        printf("Marzo\n");
        break;
    case 4:
        printf("Abril\n");
        break;
    case 5: 
        printf("Mayo\n");
        break;
    case 6:
        printf("Junio\n");
        break;
    case 7:
        printf("Julio\n"); 
        break;     
    case 8:
        printf("Agosto\n");
        break;
    case 9:
        printf("Septiembre\n");
        break;
    case 10:
        printf("Octubre\n");
        break;
    case 11:
        printf("Noviembre\n");
        break;
    case 12:    
        printf("Diciembre\n");
        break;
    default:
        printf("Mes no valido\n");
        break;
    }
}

int main(){
    int mes;
    printf("Ingrese un numero de mes (1-12): ");
    scanf("%d", &mes);
    meses(mes);
    return 0;
}