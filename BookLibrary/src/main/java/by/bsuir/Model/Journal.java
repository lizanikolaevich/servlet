/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bsuir.Model;


public class Journal extends PrintPublication{
    
    private String tema;
    private String period;
    private int number_iz;

    public Journal(int id, int data_post, int count,String name) {
        super(id, data_post, count,name);
    }
   

     public void Joutnal(String tema, String period, int number_iz){
        this.tema = tema;
        this.period = period;
        this.number_iz = number_iz;
}
      public String getTema(){
        return this.tema;
    }

    public void setTema(String tema){
        this.tema= tema;
    }

    public String getPeriod(){
        return this.period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public int getNumber_iz(){
        return this.number_iz;
    }

    public void setNumber_iz (int number_iz){
        this.number_iz = number_iz;
    }
}

