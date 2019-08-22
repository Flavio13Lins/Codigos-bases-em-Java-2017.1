package Texto;

import java.lang.*;

/** OBJECTIVE: Replace words within a text **/

public class Texto {
    private String palavras;

    public String getPalavras(){
        return this.palavras;
    }

    public Texto(String texto){ //Base constructor
        this.palavras = texto;
    }

    public Texto(){ //Constructor to the case of the object without text
        this("SEM TEXTO");
    }

    public void imprime(){ //Print the text
        System.out.println(this.palavras);
    }

    public int numeroPalavras(){ //Return the number of words
        int total=1;
        for(int i=0; i<this.palavras.length(); i++){
            if(this.palavras.charAt(i) == ' '){
                total++;
            }
        }
        return total;
    }

    public int posicaoPalavra(String palavra){
        //Finds a word in the text and return the position
        int i = 0, ini, fim = 0, num = 1;
        String a;
        while(i <= (this.palavras.length() + 1) ){
            if(i == this.palavras.length() ){
                ini = fim + 1;
                fim = i;
                a = this.palavras.substring(ini, fim);
                if( a.equals(palavra) ){
                    return num;
                }
                else{
                    return -1;
                }
            }
            else if(this.palavras.charAt(i) == ' '){
                ini = fim + 1;
                if(num == 1){
                    ini = 0;
                }
                fim = i;
                a = this.palavras.substring(ini, fim);
                if( a.equals(palavra) ){
                    return num;
                }
                else{
                    num++;
                    i++;
                }
            }
            else{
                i++;
            }
        }
        return -1;
    }

    public void trocaPalavra(String uma, String outra){
        int i = 0, ini, fim = 0, num = 1;
        String a, iniciotexto, fimtexto;
        while(i <= (this.palavras.length() + 1) ){
            if(i == this.palavras.length() ){
                ini = fim + 1;
                fim = i;
                a = this.palavras.substring(ini, fim);
                if( a.equals(uma) ){
                    //FOUND THE WORD AT THE END OF THE TEXT
                    iniciotexto = this.palavras.substring(0, ini);
                    this.palavras = iniciotexto.concat(outra);
                    return;
                    //WORD REPLACED
                }
                return;
            }
            else if(this.palavras.charAt(i) == ' '){
                ini = fim + 1;
                if(num == 1){
                    ini = 0;
                }
                fim = i;
                a = this.palavras.substring(ini, fim);
                if( a.equals(uma) ){
                    if( ini == 0 ){
                        //FOUND THE WORD AT THE BEGINNING OF THE TEXT
                        fimtexto = this.palavras.substring(fim);
                        this.palavras = outra.concat(fimtexto);
                        //WORD REPLACED
                    }
                    else{
                        //JUST FOUND WORD IN THE TEXT
                        iniciotexto = this.palavras.substring(0, ini);
                        fimtexto = this.palavras.substring(fim);
                        this.palavras = iniciotexto.concat(outra);
                        this.palavras = this.palavras.concat(fimtexto);
                        //WORD REPLACED
                    }
                    return;
                }
                else{
                    num++;
                    i++;
                }
            }
            else{
                i++;
            }
        }
    }
}
