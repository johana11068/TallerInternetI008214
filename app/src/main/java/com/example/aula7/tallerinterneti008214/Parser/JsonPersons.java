package com.example.aula7.tallerinterneti008214.Parser;

import com.example.aula7.tallerinterneti008214.Models.Persons;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AULA 7 on 17/04/2018.
 */

public class JsonPersons {
    public static List<Persons> getData(String content) throws JSONException {

        JSONArray jsonArray = new JSONArray(content);

        List<Persons> personsList = new ArrayList<>();

        for (int i = 0; i <= jsonArray.length(); i++){
            JSONObject item = jsonArray.getJSONObject(i);//ingresar a cada item

            Persons persons = new Persons();
            persons.setCodigo(item.getString("codigo"));
            persons.setNombre(item.getString("nombre"));
            persons.setEdad(item.getString("edad"));
            persons.setCorreo(item.getString("correo"));
            persons.setPass(item.getString("pass"));

            personsList.add(persons);
        }
        return personsList;
    }
}
