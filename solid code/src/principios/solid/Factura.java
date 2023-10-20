
package principios.solid;

// Se crea la clase Factura cuya reponsabilidad es la creación del objeto Factura e implementa un método para el calculo del valor total (SRP)
public class Factura {
    private Phone phone;
    private int quantity;
    private float discountRate;
    private float total;

    public Factura(Phone phone, int quantity, float discountRate) {
        this.phone = phone;
        this.quantity = quantity;
        this.discountRate = discountRate;
        this.total = 0;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(float discountRate) {
        this.discountRate = discountRate;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
    public float totalValue() {
        float price = ((phone.getPrice() - phone.getPrice() * discountRate) * this.quantity);
        setTotal(getTotal() + price);
        return price;
    }
    
    
    //Se agrega tras la creación de la clase un método que permite imprimir la factura, extendiendo la clase sin necesidad de modificar su base (OCP)
    public void print() {
        System.out.println(getQuantity() + "X " + getPhone().getModel() + " " + getPhone().getPrice() + "$");
        System.out.println("Tasa de Descuento: " + getDiscountRate());
        System.out.println("Total: " + getTotal());
    }
    
}
