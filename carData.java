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
class carData{
    private int carNo, carModel;
    private String carName;
    carData(){

    }
    public carData(int carNo, int carModel, String carName) {
        this.carNo = carNo;
        this.carModel = carModel;
        this.carName = carName;
    }
    public int getCarNo() {
        return carNo;
    }
    public void setCarNo(int carNo) {
        this.carNo = carNo;
    }
    public int getCarModel() {
        return carModel;
    }
    public void setCarModel(int carModel) {
        this.carModel = carModel;
    }
    public String getCarName() {
        return carName;
    }
    public void setCarName(String carName) {
        this.carName = carName;
    }
    @Override
    public String toString() {
        return "*********Your Details*********\n [carNo=" + carNo + ", carModel=" + carModel + ", carName=" + carName + "]";
    }

    
}