public class test1 {
	public static void main(String[] args) {
		
		Car cCar = new Car("instance of car", 12);
		System.out.println(cCar);

		Vehicle vCar = (Vehicle) cCar;
		System.out.println(vCar);
	}
}
