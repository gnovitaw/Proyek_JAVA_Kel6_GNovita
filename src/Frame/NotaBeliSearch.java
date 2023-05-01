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
public class NotaBeliSearch {
    private int bno;
    private String sname;
    private String product;
    private int amt;
    private int qty;
    private String pdate;
    
    public NotaBeliSearch(int bno,String sname,String product, int qty,int amt, String pdate)
    {
        this.bno=bno;
        this.sname=sname;
        this.product=product;
        this.qty=qty;
        this.amt=amt;
        this.pdate=pdate;
        
        
    }
    
     public int getbno()
    {
        return bno;
    }
    public String getsname()
    {
        return sname;
    }
    public String getproduct()
    {
        return product;
    }
    public int getqty()
    {
        return qty;
    }
    public int getamt()
    {
        return amt;
    }
    public String pdate()
    {
        return pdate;
    }
}
