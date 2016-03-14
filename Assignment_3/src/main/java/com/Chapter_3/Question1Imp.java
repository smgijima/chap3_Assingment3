package com.Chapter_3;


import java.util.*;



/**
 * Created by mgijima on 2016/03/13.
 */
public class Question1Imp implements Question1 {


    public Collection<Object> animalDetails() {

        Collection anim = new HashSet();
        anim.add("cat");
        return anim;
    }

    public List<String> names() {
        List list = new ArrayList();
        list.add("Siphiwo");
        list.add("Mzuvukile");
        list.add("Asanda");

        return list;
    }

    public Map<String, String> levelOfStudy() {

        Map level = new HashMap();

        level.put("213033401","Diploma");
        level.put("213033402","Btech");
        level.put("213033403","Masters");

        return level;
    }



    public Set<String> stuffNumber() {

        Set set = new HashSet();

        set.add("0001");
        set.add("0002");
        set.add("0003");
        return set;
    }
}
