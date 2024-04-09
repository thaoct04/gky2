/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gki2;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Thuan Thao
 */
public class order implements  Serializable{
    int idOrder;
    int dayOrder;
    int endOrder;
    String nameOrder;
    String address;
    ArrayList<product>list;

    public order(int idOrder, int dayOrder, int endOrder, String nameOrder, String address) {
        this.idOrder = idOrder;
        this.dayOrder = dayOrder;
        this.endOrder = endOrder;
        this.nameOrder = nameOrder;
        this.address = address;
        this.list = new ArrayList<>();
    }

  

    @Override
    public String toString() {
        return "order{" + "idOrder=" + idOrder + ", dayOrder=" + dayOrder + ", endOrder=" + endOrder + ", nameOrder=" + nameOrder + ", address=" + address + ", list=" + list + '}';
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public int getDayOrder() {
        return dayOrder;
    }

    public void setDayOrder(int dayOrder) {
        this.dayOrder = dayOrder;
    }

    public int getEndOrder() {
        return endOrder;
    }

    public void setEndOrder(int endOrder) {
        this.endOrder = endOrder;
    }

    public String getNameOrder() {
        return nameOrder;
    }

    public void setNameOrder(String nameOrder) {
        this.nameOrder = nameOrder;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<product> getList() {
        return list;
    }

    public void setList(ArrayList<product> list) {
        this.list = list;
    }
//    
    public void addPr(product pr){
        this.list.add(pr);
    }
    
    public void removePr(product pr){
       if(list.isEmpty()){
           System.out.println("khong co san pham nen khong the xoa ");
       }else{
            this.list.remove(pr);
       }
    }
    
    public void fixPr(int id,String name,float costpr4,int quantitypr){
          if(list.isEmpty()){
           System.out.println("khong co san pham nen khong the sua can tao san pham va them vao don hang ");
       }else{
            for(product pr : list){
                if(pr.IdProduct == id){
                    pr.setNameProduct(name);
                    pr.setCostProduct(costpr4);
                    pr.setQuantity(quantitypr);
                }
            }
       }
    }

}