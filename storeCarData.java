/**
 * Project: [Parking Management System]
 * Author: Muhammad Qasim Riaz
 * Organization: Gujranwala Institute of Future Technologies
 * Date: [26-December-2023]
 *
 * Description: [The Parking Management System is a comprehensive solution designed to streamline
 * and optimize the process of parking management for various establishments such as commercial 
 * buildings, residential complexes, shopping malls, and public spaces.]
 *
 * Fair Use Disclaimer:
 * This project may contain copyrighted material that has not been specifically authorized by the copyright owner.
 * The use of such materials is intended for educational and non-commercial purposes, constituting a 'fair use'
 * of any such copyrighted material as provided for in Section 107 of the U.S. Copyright Law and similar laws in
 * other jurisdictions. The distribution of this project is for academic and educational purposes only.
 *
 * If you believe that your copyrighted work is being infringed upon and you would like it to be removed from
 * this project, please contact us at [contact@email.com] with sufficient evidence for prompt removal.
 */
public class storeCarData {
    private carData[] carDB;

    public storeCarData(int size) {
        carDB = new carData[size];
    }
    public void addCar(int index,carData data) {
        if (index >= 0 && index < carDB.length) {
            carDB[index] = data;
        } else {
            System.out.println("Invalid index.");
        }
    }
    public void display(){
            for (carData carData : carDB) {
                System.out.println(carData);
            }
    }
    
}
