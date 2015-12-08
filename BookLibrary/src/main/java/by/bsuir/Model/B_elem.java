/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bsuir.Model;


public class B_elem {

    private int id;
    private int data_post;
    private int shifr;
    private String name;

    public B_elem(int id, int data_post, int shifr, String name){
        this.id = id;
        this.data_post = data_post;
        this.shifr = shifr;
        this.name = name;
   
    }

    public int getShifr(){
        return this.shifr;
    }

    public void setShifr(int shifr){
        this.shifr = shifr;
    }

    public int getData_post(){
        return this.data_post;
    }

    public void setData_post(int data_post) {
        this.data_post = data_post;
    }

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }
        public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
    
