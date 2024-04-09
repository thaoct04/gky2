/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gki2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Thuan Thao
 */
public class m {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
//        
//         product sanPham1 = new product(1,"iphone",10,2);
//        
//         
//         order donhang1 = new order(1, 10,20, "thao", "quang nam");

        orderManage danhsach1 = new orderManage();

        int select = 0;
        order donhang1 = null;
        product sanPham1 = null;

        do {
            System.out.println("---------menu----------");
            System.out.println("1.tao ra don hang");
            System.out.println("2.tao ra san pham");
            System.out.println("3.them san pham vao don hang(phai co don hang thi moi co the them san pham)");
            System.out.println("4.sua san pham");
            System.out.println("5.xoa san pham ra khoi don hang");
            System.out.println("6.them don hang vao danh sach 1");
            System.out.println("7.sua don hang trong danh sach 1");
            System.out.println("8.xoa don hang trong danh sach 1");
            System.out.println("9.them san pham va don hang vao file");
            System.out.println("10.doc san pham va don hang tu file");
            System.out.println("11.hien thi danh sach don hang va san pham");
            System.out.println("12.tiem kiem don hang theo ten nguoi nhan");
            System.out.println("13.sap xep theo ngay");

            select = sc.nextInt();
            switch (select) {
                case 1:
                    System.out.println("moi nhap vao id don hang,ngay dat hang,ngay giao ,ten san pham va dia chi");
                    int idOrder = sc.nextInt();
                      int dayOrder = sc.nextInt();
                    int endOrder = sc.nextInt();
                    String nameOrder = sc.next();
                    String address = sc.next();
                    donhang1 = new order(idOrder, dayOrder, endOrder, nameOrder, address);

                    break;
                case 2:
                    System.out.println("moi nhap thong tin san pham (id san  pham,ten san pham,gia,so luong)");

                    int IdProduct = sc.nextInt();

                    String nameProduct = sc.next();
                    float costProduct = sc.nextFloat();
                    int quantity = sc.nextInt();
                    sanPham1 = new product(IdProduct, nameProduct, costProduct, quantity);

                    break;

                case 3:
                    if (sanPham1 == null) {
                        System.out.println("chua co san pham nen khong the them vao don hang");
                    } else {
                        donhang1.list.add(sanPham1);
                    }

                    break;
                case 4:
                    System.out.println("moi nhap vao id cua san pham(co dinh) va ten san pham,gia ,va so luong can sua");
                       int IdProduct4 = sc.nextInt();
                      String nameProduct4 = sc.next();
                    float costProduct4 = sc.nextFloat();
                    int quantity4 = sc.nextInt();
                    donhang1.fixPr(IdProduct4,nameProduct4,costProduct4,quantity4);
                    break;
                case 5:
                    donhang1.list.remove(sanPham1);
                    break;
                case 6:
                    if (donhang1 == null) {
                        System.out.println("chua co don hang nen khong the them vao danh sach");
                    } else {
                       danhsach1.addOrder(donhang1);
                               
                    }
                    break;
                case 7:
                    if (donhang1 == null) {
                        System.out.println("chua co don hang nen khong the sua trong danh sach");
                    } else {
                        System.out.println("moi nhap id cua san pham can doi ten,va ten sau doi");
                        int idOd = sc.nextInt();
                        String nameOd = sc.next();

                        danhsach1.editOrder(idOd, nameOd);

                        danhsach1.addOrder(donhang1);
                    }

                    break;
                case 8:
                    danhsach1.removeOrder(donhang1);
                    break;
                case 9:
                    System.out.println("moi nhap vao link den file can luu tru");
                    String url = sc.next();
                    danhsach1.writeFile(url);
                    break;
                case 10:
                    System.out.println("moi nhap vao link den file can luu tru");
                    String url2 = sc.next();
                    danhsach1.readFile(url2);
                    break;

                case 11:
                    danhsach1.printListOder();
                    break;
                case 12:
                    System.out.println("moi nhap vao ten de tim kiem");
                    String name1 = sc.next();
                    danhsach1.searchOrderByName(name1);
                    break;
                default:
                    throw new AssertionError();
            }

        } while (select != 0);
//        
    }

}
