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
public class BillSearch {
    private int bno;
    private String cname;
    private String product;
    private int amt;
    private String pdate;
    
    public BillSearch(int bno,String cname, String product,int amt, String pdate)
    {
        this.bno=bno;
        this.cname=cname;
        this.product=product;
        this.amt=amt;
        this.pdate=pdate;
        
        
    }
     public int getbno()
    {
        return bno;
    }
    public String getcname()
    {
        return cname;
    }
    public String getproduct()
    {
        return product;
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
