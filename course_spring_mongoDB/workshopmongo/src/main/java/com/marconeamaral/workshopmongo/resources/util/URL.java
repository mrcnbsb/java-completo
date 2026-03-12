package com.marconeamaral.workshopmongo.resources.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class URL {

    public static String decodeParam(String text) {
        try {
            return URLDecoder.decode(text, "UTF-8");
        } catch (UnsupportedEncodingException e) {
           return ""; //se ocorrer uma exceção de codificação, o método retorna uma string vazia. Isso é uma forma de lidar com a exceção sem interromper o fluxo do programa, mas pode ser útil para depuração ou para indicar que houve um problema na decodificação.
        }
    }

    public static Date convertDate(String textDate, Date defaultValue) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); //SimpleDateFormat é uma classe do Java que permite formatar e analisar datas de acordo com um padrão específico. Neste caso, o padrão é "ano-mês-dia" (yyyy-MM-dd), o que significa que a data deve estar no formato "2024-06-30" para ser convertida corretamente.
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
        try {
            return sdf.parse(textDate);
        } catch (ParseException e) {
            return defaultValue; //se ocorrer uma exceção de análise (ParseException), o método retorna um valor padrão (defaultValue) fornecido como argumento. Isso é uma forma de lidar com a exceção sem interromper o fluxo do programa, permitindo que o método retorne um valor válido mesmo quando a string de data não estiver no formato correto.
        } //parse() é um método da classe SimpleDateFormat que converte uma string em um objeto Date de acordo com o padrão definido. Se a string textDate estiver no formato correto, ela será convertida para um objeto Date correspondente. Se a string não estiver no formato correto, o método lançará uma exceção ParseException, que deve ser tratada adequadamente.
    }

}
