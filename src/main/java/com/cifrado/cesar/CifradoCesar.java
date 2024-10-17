package com.cifrado.cesar;

public class CifradoCesar {
    public String cifrar(String texto, int desplazamiento) {
        StringBuilder cifrado = new StringBuilder();

        
        for (char caracter : texto.toCharArray()) {
           
            if (Character.isLetter(caracter)) {
                char base = Character.isUpperCase(caracter) ? 'A' : 'a';
                
                char cifradoCaracter = (char) ((caracter - base + desplazamiento) % 26 + base);
                cifrado.append(cifradoCaracter);
            } else {
                cifrado.append(caracter);
            }
        }

        return cifrado.toString();
    }

   
    public String descifrar(String texto, int desplazamiento) {
        return cifrar(texto, 26 - desplazamiento);
    }
}
