/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoproject;



/**
 *
 * @author Kali
 */
public class Queue {
    private P_Value1[] Array;

    int count = 0;
    int ms;

  

    public Queue(int s) {

        ms = s;
        Array = new P_Value1[ms];

    }
    
    public P_Value1[] getArray()
    {
    
        return Array;
    
    }
     public void setP(int i,int p)
    {
    
         Array[i].p = p;
    
    }
     public void setV(int i,int v)
    {
    
         Array[i].v = v;
    
    }
    public int getP(int i)
    {
    
        return Array[i].p;
    
    }
     public int getV(int i)
    {
    
        return Array[i].v;
    
    }
      public void setPr(int i,int pr)
    {
    
         Array[i].pr = pr;
    
    }
    public int getPr(int i)
    {
    
        return Array[i].pr;
    
    }
     

    public boolean IsEmpty() {

        if (count == 0) {
            return true;

        }

        return false;

    }

    public boolean IsFull() {

        if (count == ms) {

            return true;

        }

        return false;

    }

    public void Insert(int p, int v,int pr) {

        if (IsFull() == true) {

            System.out.println("\nOverFlow.....");

        } else {

            P_Value1 obj = new P_Value1();
            obj.setP(p);
            obj.setV(v);
            obj.setPr(pr);
            
            if (count == 0) {

                Array[0] = obj;
                count++;

            } else {
                int i = 0;
                while (i < count && Array[i].getPr() < pr) {

                    i++;

                }
                if (i == count) {

                    Array[i] = obj;
                    count++;
                } else {

                    for (int j = count - 1; j >= i; j--) {

                        Array[j + 1] = Array[j];

                    }
                    Array[i] = obj;
                    count++;

                }

            }

        }

    }
    
    
    
}
