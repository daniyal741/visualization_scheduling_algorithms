/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoproject;

/**
 *
 * @author bakhtawar
 */
public class ArrayDs {
    int[ ] arr;
    
    ArrayDs(int s)
    {
        arr=new int[s];
    }
    
    public void setValue(int i,int v)
    {
        
            arr[i]=v;
            
       
    }
    public int getValue(int i)
    {
        return arr[i];
    }
    
    
}
