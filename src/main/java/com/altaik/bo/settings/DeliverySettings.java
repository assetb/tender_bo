/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altaik.bo.settings;

import com.altaik.bo.utils.KeywordUtils;

import java.util.ArrayList;

/**
 *
 * @author Aset
 */
public class DeliverySettings {
    public String keyword1;
    public String keyword2;
    public String keyword3;
    public ArrayList<Integer> regions;
    public ArrayList<Integer> methods;
    public ArrayList<Integer> sources;
    public Double minsum = 0.0;
    public Double maxsum = 0.0;
    
    
    public String GetMorphoKeyword1(){
        return KeywordUtils.MorphoTransform(keyword1);
    }
    
    
    public String GetMorphoKeyword2(){
        return KeywordUtils.MorphoTransform(keyword2);
    }
    
    
    public String GetMorphoKeyword3(){
        return KeywordUtils.MorphoTransform(keyword3);
    }
    
    /**
     *Emphasize keywords from delivery settings in the provided string
     * @param str - string where keywords would be emphasized
     * @return
     */
    public String TripleEmphasize(String str){
        return KeywordUtils.Emphasize(KeywordUtils.Emphasize(KeywordUtils.Emphasize(str, keyword1), keyword2), keyword3);
    }
    
    
    public String GetLikeQuery(){
        
        //Logger.getLogger(DeliverySettings.class.getName()).log(Level.INFO, "GET LIKE QUERY: keyword1: {0}", keyword1);
        //Logger.getLogger(DeliverySettings.class.getName()).log(Level.INFO, "GET LIKE QUERY: keyword2: {0}", keyword2);
        //Logger.getLogger(DeliverySettings.class.getName()).log(Level.INFO, "GET LIKE QUERY: keyword3: {0}", keyword3);
        
        String prepare1 = KeywordUtils.PrepareLike(keyword1);
        String prepare2 = KeywordUtils.PrepareLike(keyword2);
        String prepare3 = KeywordUtils.PrepareLike(keyword3);
        
        //Logger.getLogger(DeliverySettings.class.getName()).log(Level.INFO, "GET LIKE QUERY: prepare1: {0}", prepare1);
        //Logger.getLogger(DeliverySettings.class.getName()).log(Level.INFO, "GET LIKE QUERY: prepare2: {0}", prepare2);
        //Logger.getLogger(DeliverySettings.class.getName()).log(Level.INFO, "GET LIKE QUERY: prepare3: {0}", prepare3);

        String query = prepare1;
        
        //Logger.getLogger(DeliverySettings.class.getName()).log(Level.INFO, "GET LIKE QUERY: query: {0}", query);

        if(!prepare2.isEmpty()) query += (query.isEmpty()?"":" OR ") + prepare2;
        
        //Logger.getLogger(DeliverySettings.class.getName()).log(Level.INFO, "GET LIKE QUERY: query: {0}", query);
        
        if(!prepare3.isEmpty()) query += (query.isEmpty()?"":" OR ") + prepare3;
        
        //Logger.getLogger(DeliverySettings.class.getName()).log(Level.INFO, "GET LIKE QUERY: {0}", query);

        return query;
    }
    
    
    public String GetWhereQuery(){
        
        //Logger.getLogger(DeliverySettings.class.getName()).log(Level.INFO, "In the Ger Where Query");
        
        String result = "";
        
        String likeStr = GetLikeQuery();
        if(!likeStr.isEmpty()) result += (result.isEmpty()?"":" AND ") + "(" + likeStr + ")";
        
        //Logger.getLogger(DeliverySettings.class.getName()).log(Level.INFO, "result 1 = {0}", result);
        
        String sourcesStr = KeywordUtils.ArrayJoin(sources);
        if(!sourcesStr.isEmpty()) result = result + (result.isEmpty()?"":" AND ") + "(p.source IN (" + sourcesStr + ") OR p.source is null)";
        
        //Logger.getLogger(DeliverySettings.class.getName()).log(Level.INFO, "result 2 = {0}", result);
        
        String regionsStr = KeywordUtils.ArrayJoin(regions);
        if(!regionsStr.isEmpty()) result = result + (result.isEmpty()?"":" AND ") + "(p.venue  IN (" + regionsStr + ") OR p.venue  is null)";
        
        //Logger.getLogger(DeliverySettings.class.getName()).log(Level.INFO, "result 3 = {0}", result);
        
        String methodsStr = KeywordUtils.ArrayJoin(methods);
        if(!methodsStr.isEmpty()) result = result + (result.isEmpty()?"":" AND ") + "(p.method IN (" + methodsStr + ") OR p.method is null)";
        
        //Logger.getLogger(DeliverySettings.class.getName()).log(Level.INFO, "result 4 = {0}", result);
        
        if(minsum > 0.00) result += " AND l.sum >= '" + minsum.toString() + "'";
        if(maxsum > 0.00) result += " AND l.sum <= '" + maxsum.toString() + "'";
        
        //Logger.getLogger(DeliverySettings.class.getName()).log(Level.INFO, "result 5 = {0}", result);
        
        if(!result.isEmpty()) result = "(" + result + ")";
        
        //Logger.getLogger(DeliverySettings.class.getName()).log(Level.INFO, "result 6 = {0}", result);
        
        return result;
    }
}
