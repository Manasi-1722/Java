// Question:
// Create class Medicine with below attributes: 

// MedicineName - String 
// batch - String 
// disease - String 
// price - int

// Create class Solution and implement static method "getPriceByDisease" in the Solution class. 
// This method will take array of Medicine objects and a disease String as parameters. 
// And will return another sorted array of Integer objects where the disease String matches with the 
// original array of Medicine object's disease attribute (case insensitive search).

// Write necessary getters and setters.

// Before calling "getPriceByDisease" method in the main method, read values for four Medicine objects 
// referring the attributes in above sequence along with a String disease. Then call the "getPriceByDisease" 
// method and print the result.

// Input
// -------------

// dolo650
// FAC124W
// fever
// 100
// paracetamol
// PAC545B
// bodypain
// 150
// almox
// ALM747S
// fever
// 200
// aspirin
// ASP849Q
// flu
// 250
// bodypain

// Output
// ---------
// 100
// 200



import java.util.*;

public class ps_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Medicine[] arr = new Medicine[4];
        for(int i=0; i<4; i++){
            String a = sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();

            arr[i] = new Medicine(a, b, c, d);
        }

        String disease = sc.nextLine();
        Medicine[] price = getPriceByDisease(arr, disease);
        for(int i=0; i<price.length; i++){
            System.out.println(price[i].getPrice());
        }


        sc.close();
        
    }

    public static Medicine[] getPriceByDisease(Medicine[] arr, String disease){
        Medicine[] arr2 = new Medicine[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i].getDisease().equals(disease)){
                arr2 = Arrays.copyOf(arr2, arr2.length + 1);
                arr2[arr2.length - 1] = arr[i];
            }
        }
        return arr2;
    }


}

class Medicine {

    String medicineName;
    String batch;
    String disease;
    int price;

    // constructor
    public Medicine(String medicineName, String batch, String disease, int price) {
        this.medicineName = medicineName;
        this.batch = batch;
        this.disease = disease;
        this.price = price;
    }

    // getter
    public String getMedicineName(){
        return medicineName;
    }

    public String getBatch(){
        return batch;
    }

    public String getDisease(){
        return disease;
    }

    public int getPrice(){
        return price;
    }
}
