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
public class SuppSearch {
    private String idtokosupplier;
    private String sname;
    private String mno;
    private String address;
    
    public SuppSearch(String idtokosupplier,String sname, String mno, String address)
    {
        this.idtokosupplier=idtokosupplier;
        this.sname=sname;
        this.mno=mno;
        this.address=address;
        
        
    }
    
     public String getidtokosupplier()
     {
         return idtokosupplier;
     }
    public String getsname()
    {
        return sname;
    }
    public String getmno()
    {
        return mno;
    }
    public String getaddress()
    {
        return address;
    }
}
