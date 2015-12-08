/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bsuir.Model;

public class P_iz extends B_elem{
    
    
    private String poublisher;
    private int count_page;

    public P_iz(int id, int data_post, int count,String name) {
        super(id, data_post, count,name);
    }

    public void P_iz(String name, String poublisher, int count_page){
        this.poublisher = poublisher;
        this.count_page = count_page;
}
      public int getCount_page(){
        return this.count_page;
    }

    public void setCount_page(int count_page){
        this.count_page = count_page;
    }

    public String getPoublisher(){
        return this.poublisher;
    }

    public void setPoublisher(String poublisher){
        this.poublisher = poublisher;
    }

}
