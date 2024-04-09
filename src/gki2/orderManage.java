/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gki2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Thuan Thao
 */
public class orderManage {

    ArrayList<order> list;

    public orderManage() {
        list = new ArrayList<>();
    }

    public ArrayList<order> getList() {
        return list;
    }

    public void setList(ArrayList<order> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "orderManage{" + "list=" + list + '}';
    }

    public void addOrder(order od) {
        this.list.add(od);
    }

    public void searchOrderByName(String name) {
        if (this.list.isEmpty()) {
            System.out.println("danh sach chua co don hang nao (quay lai b4)");
        } else {
            for (order od : list) {
                if (od.getNameOrder().equals(name)) {
                    System.out.println(od);
                }
            }
        }

    }

    public void editOrder(int id, String name) {
        if (this.list.isEmpty()) {
            System.out.println("danh sach rong khong chinh sua dc");
        } else {
            for (order od : list) {
                if (od.getIdOrder() == id) {
                    od.setNameOrder(name);
                }
            }
        }
    }

    public void removeOrder(order od) {
        this.list.remove(od);
    }

    public void printListOder() {
        if (this.list.isEmpty()) {
            System.out.println("chua co don hang nao trong danh sach(thuc hien bc 6 de them don hang )");
        } else {
            for (order od : this.list) {
                System.out.println(od);
            }
        }

    }

    public void writeFile(String url) {
        try {
//              File file = new File(url);
//              OutputStream os = new FileOutputStream(file);
//              ObjectOutputStream oos = new ObjectOutputStream(os);
//              for(order od: this.list){
//                  oos.writeObject(od);
//                  oos.flush();
//                  oos.close();
//              }
            File file = new File(url);

            OutputStream os = new FileOutputStream(file);

            ObjectOutputStream ous = new ObjectOutputStream(os);
            for (order od : list) {
                ous.writeObject(od);
                ous.flush();
                ous.close();
            }

        } catch (Exception e) {
        }
    }
    
//    public void manageOrderByOderDay(){
//        Collections.sort(list,new Comparator<order>()
//        {
//            @Override
//            public int compare()
//        });
    }

    public void readFile(String url) {
        try {

            try {
                File f = new File(url);
                FileInputStream ip = new FileInputStream(f);
                ObjectInputStream ob = new ObjectInputStream(ip);
                while (true) {
                    order d = (order) ob.readObject();
                    if (d == null) {
                        break;
                    } else {
                        this.list.add(d);
                    }
                }
                for (order od : list) {
                    System.out.println(od);
                }

                ob.close();
            } catch (Exception e) {

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
