/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

/**
 *
 * @author novitawg
 */
public class Stock {
    private String id;
    private String pname;
    private String sname;
    private int available;
    private int mrp;
    
    public Stock(String id,String pname, String sname, int available, int mrp)
    {
        this.id=id;
        this.pname=pname;
        this.sname=sname;
        this.available=available;
        this.mrp=mrp;
        
        
    }
    
        public String getid()
    {
        return id;
    }
    public String getpname()
    {
        return pname;
    }
    public String getsname()
    {
        return sname;
    }
    public int getavailable()
    {
        return available;
    }
    public int getmrp()
    {
        return mrp;
    }
}

