package org.simplejava;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class SimpleClass {

    public Collection<String> stringAsCollection(String ...strings){

        if(strings == null) {
            throw new NullPointerException(" strings argument is null.");
        }

        Collection<String> list = Arrays.asList(strings);

        System.out.println(list.toString());

        return list;
    }

}
