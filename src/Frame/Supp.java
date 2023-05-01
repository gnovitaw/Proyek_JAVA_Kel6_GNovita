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
public class Supp {
    private int id;
    private String idtokosupplier;
    private String sname;
    private String mno;
    private String address;
    
    public Supp(int id,String idtokosupplier, String sname,String mno, String address)
    {
        this.id=id;
        this.idtokosupplier=idtokosupplier;
        this.sname=sname;
        this.mno=mno;
        this.address=address;
        
        
    }
         
    public int getid()
    {
        return id;
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
