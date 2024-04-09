/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gki2;

/**
 *
 * @author Thuan Thao
 */
public class product implements IProduct{
    
    int IdProduct;
    String nameProduct;
    float costProduct;
    int quantity;

    public product(int IdProduct, String nameProduct, float costProduct, int quantity) {
        this.IdProduct = IdProduct;
        this.nameProduct = nameProduct;
        this.costProduct = costProduct;
        this.quantity = quantity;
    }

    public int getIdProduct() {
        return IdProduct;
    }

    public void setIdProduct(int IdProduct) {
        this.IdProduct = IdProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public float getCostProduct() {
        return costProduct;
    }

    public void setCostProduct(float costProduct) {
        this.costProduct = costProduct;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "product{" + "IdProduct=" + IdProduct + ", nameProduct=" + nameProduct + ", costProduct=" + costProduct + ", quantity=" + quantity + '}';
    }
//    
    

    @Override
    public void sale() {
        float coast = (float) (this.costProduct * 1.1 * this.quantity);
        System.out.println(coast);
        
    }
    
}
