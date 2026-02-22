package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Department obj = new Department(1, "Books");		
		//Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, obj);
		
//		SellerDao sellerDao = DaoFactory.createSellerDao();
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: department findById ===");
		Department department = departmentDao.findById(3);		
		System.out.println(department);

//		System.out.println("\n=== TEST 2: seller findByDepartment ===");
//		Department department = new Department(2, null);
//		List<Seller> list = sellerDao.findByDepartment(department);
//		for(Seller obj : list) {
//			System.out.println(obj);
//		}
		
		System.out.println("\n=== TEST 3: department findByAll ===");		
		List<Department> list = departmentDao.findAll();
		for(Department obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 4: department insert ===");	
		Department newDepartment = new Department(null, "Music");		
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());
		
		System.out.println("\n=== TEST 5: department update ===");
		department = departmentDao.findById(13);
		department.setName("Events");
		departmentDao.update(department);
		System.out.println("Update completed");
		
		System.out.println("\n=== TEST 6: department delete ===");
		System.out.println("Enter id for delete teste:");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed");
		
		sc.close();
		
	}

}
