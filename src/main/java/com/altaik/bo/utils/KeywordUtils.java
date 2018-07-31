/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altaik.bo.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Aset
 */
public class KeywordUtils {
    
    private static final Logger logger = Logger.getLogger(KeywordUtils.class.getName());
    
    public static KeyTransformMethodEnum KEY_TRANSFORM_METHOD = KeyTransformMethodEnum.Lingwo;

    public static String WordRoot(String key) {
        if (key.length() > 5 && (key.endsWith("ого") || key.endsWith("oму") || key.endsWith("ему") || key.endsWith("его"))) {
            key = key.substring(0, key.length() - 3);
        } else if (key.length() > 4 && (key.endsWith("ая") || key.endsWith("яя") || key.endsWith("ое") || key.endsWith("еe") || key.endsWith("ий") || key.endsWith("ый") || key.endsWith("ой") || key.endsWith("ей")  || key.endsWith("ее") || key.endsWith("ие") || key.endsWith("ые") || key.endsWith("ых") || key.endsWith("их") || key.endsWith("им") || key.endsWith("ым") || key.endsWith("ом") || key.endsWith("ем") || key.endsWith("ою") || key.endsWith("ею") || key.endsWith("ую") || key.endsWith("юю"))) {
            key = key.substring(0, key.length() - 2);
        } else if (key.length() > 3 && (key.endsWith("а") || key.endsWith("о") || key.endsWith("е") || key.endsWith("и") || key.endsWith("ы") || key.endsWith("у") || key.endsWith("ю") || key.endsWith("ь"))) {
            key = key.substring(0, key.length() - 1);
        }
        return key;
    }
    
    
    public static String PersentageTransform(String key) {
        if (key.length() > 5 && (key.endsWith("ого"))) {
            key = key.substring(0, key.length() - 3) + "%";
        } else if (key.length() > 4 && (key.endsWith("ая") || key.endsWith("oe") || key.endsWith("ый") || key.endsWith("ой") || key.endsWith("ые") || key.endsWith("ых") || key.endsWith("их"))) {
            key = key.substring(0, key.length() - 2) + "%";
        } else if (key.length() > 3 && (key.endsWith("а") || key.endsWith("о") || key.endsWith("е") || key.endsWith("и") || key.endsWith("ы") || key.endsWith("у") || key.endsWith("ю"))) {
            key = key.substring(0, key.length() - 1) + "%";
        } else {
            key = key + " ";
        }
        return key;
    }
    
    
    public static String MorphoTransform(String key){
        if (key.length() > 5 && (key.endsWith("ого"))) {
            key = key.substring(0, key.length() - 3) + "___";
        } else if (key.length() > 4 && (key.endsWith("ая") || key.endsWith("oe") || key.endsWith("ый") || key.endsWith("ой") || key.endsWith("ые"))) {
            key = key.substring(0, key.length() - 2) + "__";
        } else if (key.length() > 3 && (key.endsWith("а") || key.endsWith("о") || key.endsWith("е") || key.endsWith("и") || key.endsWith("ы") || key.endsWith("у") || key.endsWith("ю"))) {
            key = key.substring(0, key.length() - 1) + "_";
        }
        return key;
    }
    
    
    public static String PorterTrasform(String key){
        String porter = Porter.Stem(key);
        return porter+LineOf_(key.length()-porter.length());
    }
    
    
    private static String LineOf_(int n){
        return n<1?"":LineOf_(n-1)+"_";
    }
    
    
    private static final List<String> EXCLUDED_PRETEXT_LIST = Arrays.asList("и","в","c","а","б","бы","не","ни","за","над","на","или","ли","ль","же","как","еще","что","раз","то","так","вот","да","либо","нибудь","кое","по","под");
    
    /**
     *Exclude predlogi
     * @param key - word which is predlog
     * @return
     */
    public static String PretextExclude(String key){
        return (EXCLUDED_PRETEXT_LIST.contains(key) ? "" : key);
    }
    
    public static boolean excludedPretextContains(String key){
        return EXCLUDED_PRETEXT_LIST.contains(key);
    }
    
    /**
     *Replace word containing provided key in the provided string by same word with html tags to emphasize
     * @param str - string where replacement will be
     * @param key - root of word which will be covered by html tags to emphasize
     * @return
     */
    public static String Replace(String str, String key) {
        if (str == null || key == null || str.length() <= key.length() + 1) return str;
        
//        Pattern p = Pattern.compile("[ `1234567890-=~!@#\\$%^&*()\\_\\+\\[\\]\\;\',\\./{}|:\"<>?]", Pattern.CASE_INSENSITIVE|Pattern.UNICODE_CASE);
        Pattern pattern = Pattern.compile("\\b" + key + "\\S*\\B",Pattern.CASE_INSENSITIVE|Pattern.UNICODE_CASE);
        Matcher matcher = pattern.matcher(str);
        int iStart, iEnd, iOffset = 0;
        while(matcher.find()) {
            iStart = matcher.start() + iOffset;
            iEnd = matcher.end() + 1 + iOffset;
            if(iEnd > str.length()){
                iEnd = str.length();
            }
            str = str.substring(0,iStart) + "<u><b>" + str.substring(iStart, iEnd) + "</u></b>" + str.substring(iEnd);
            iOffset = iOffset + 14;
        }
        return str;
    }

//<editor-fold defaultstate="collapsed" desc="comment">
//  previous version
//        int iStart = str.indexOf(key);
//
//        logger.log(Level.INFO, "iStart 1 = {0}", iStart);
//
//        while(iStart > -1){
//            int iEnd = iStart + key.length();
//
//        logger.log(Level.INFO, "iEnd   1 = {0}", iEnd);
//
//            Pattern pattern = Pattern.compile("[ `1234567890-=~!@#$%^&*()\\_+\\[\\];\\',\\./{}|:\"<>?\\$]");
////            Pattern pattern = Pattern.compile("[^ a-z]",Pattern.CASE_INSENSITIVE);
//            Matcher matcher = pattern.matcher(str.substring(iEnd));
//            if(matcher.find()) iEnd = iEnd + matcher.start();
//            //else iEnd = str.length();
//
//        logger.log(Level.INFO, "iEnd   2 = {0}", iEnd);
//
//            str = str.substring(0,iStart) + "<u><b>" + str.substring(iStart, iEnd) + "</b></u>" + str.substring(iEnd);
//            iStart = str.indexOf(key, iEnd + 14);
//
//        logger.log(Level.INFO, "iStart 2 = {0}", iStart);
//
//        }
//        return str;
    
//          old version
//        return str.contains(key)?str.replace(key, "<u><b>" + key + "</b></u>"):str;
//    }
//</editor-fold>

    
    
    /**
     *Emphasize provided keyword in the provided string
     * @param str string where keyword will be emphasized
     * @param keyword - keyword which will be emphasized in the provided string
     * @return
     */
    public static String Emphasize(String str, String keyword) {
        if(keyword == null){
            keyword = "";
        }
        keyword = keyword.replaceAll("([\\(\\)\\{\\}\\[\\]])", "\\\\$1");
        String[] words = keyword.replace(" ", ",").replace(";", ",").split(",");
        for (String key : words) {
            key = key.toLowerCase();
            switch(KEY_TRANSFORM_METHOD){
                case Lingwo: key = WordRoot(key); break;
                case Porter: key = PorterTrasform(key); break;
            }
            if (!key.isEmpty()) {
                str = Replace(str, key);
                //str = Replace(str, key.toUpperCase());
                //str = Replace(str, key.substring(0, 1).toUpperCase() + key.substring(1));
            }
        }
        return str;
    }
    
    
    public static String PrepareLike(String keyword) {
        String keyquery = "";
        if(keyword == null){
            keyword = "";
        }
        for (String keycoll : keyword.replace("'","").toLowerCase().split(",")) {
            
            //Logger.getLogger(KeywordUtils.class.getName()).log(Level.INFO, "PrepareLike:keycoll: {0}", keycoll);
            
            String keyFront = "", keyBack = "";
            for (String keyitem : keycoll.trim().split(" ")) {
            
                //Logger.getLogger(KeywordUtils.class.getName()).log(Level.INFO, "PrepareLike:keyitem: {0}", keyitem);
            
                if(keyitem.isEmpty() || excludedPretextContains(keyitem)) continue;

                String wordRoot = WordRoot(keyitem);
                keyFront = keyFront + (keyFront.isEmpty()?"":"%") + wordRoot;
                keyBack  = wordRoot + (keyBack.isEmpty() ?"":"%") + keyBack;
            }
//            if (!keyFront.isEmpty()) keyquery += (keyquery.isEmpty()?"":" OR ") + "p.runame LIKE '%" + keyFront + "%' OR l.runame LIKE '%" + keyFront + "%' OR l.rudescription LIKE '%" + keyFront + "%' OR p.kzname LIKE '%" + keyFront + "%' OR l.kzname LIKE '%" + keyFront + "%'  OR l.kzdescription LIKE '%" + keyFront + "%'";
            if (!keyFront.isEmpty())                            keyquery += (keyquery.isEmpty()?"":" OR ") + "p.runame LIKE '%" + keyFront + "%' OR l.runame LIKE '%" + keyFront + "%' OR l.rudescription LIKE '%" + keyFront + "%'";
            if (!keyBack.isEmpty() && keyFront.contains("%"))   keyquery += (keyquery.isEmpty()?"":" OR ") + "p.runame LIKE '%" + keyBack  + "%' OR l.runame LIKE '%" + keyBack  + "%' OR l.rudescription LIKE '%" + keyBack  + "%'";
            
            //Logger.getLogger(KeywordUtils.class.getName()).log(Level.INFO, "PrepareLike:keyquery: {0}", keyquery);
            
        }
        return keyquery;
    }
    
    
    public static String ArrayJoin(ArrayList<Integer> array){
        String result = "";
        for(Integer item:array){
            if(null==item||item>0) continue;
            result += (result.isEmpty()?"":",") + item.toString();
        }
        return result;
    }
    

    
}
