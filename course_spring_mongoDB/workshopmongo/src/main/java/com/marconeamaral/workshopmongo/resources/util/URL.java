package com.marconeamaral.workshopmongo.resources.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class URL {

    public static String decodeParam(String text) {
        try {
            return URLDecoder.decode(text, "UTF-8");
        } catch (UnsupportedEncodingException e) {
           return ""; //se ocorrer uma exceção de codificação, o método retorna uma string vazia. Isso é uma forma de lidar com a exceção sem interromper o fluxo do programa, mas pode ser útil para depuração ou para indicar que houve um problema na decodificação.
        }
    }

}
