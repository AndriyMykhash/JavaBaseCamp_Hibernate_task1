package com;

import com.representation.Department;
import com.representation.Workers;
import com.service.DepartmentService;
import com.service.WorkersService;

public class Main {

    public static void main(String[] arg) {

        DepartmentService service = new DepartmentService();
//        Department user = new Department();
//        user.setName("Yeeeas");
//        user.setStatus(true);
//                service.saveDepartment(user);
        Department user1 = service.findDepartment(7l);
        service.deleteDepartment(user1);
        Department user2 = service.findDepartment(7l);

//        WorkersService workersService = new WorkersService();
//
//        Workers workers = workersService.findWorkers(4l);
//        System.out.println(workers.getAge()+" "+workers.getAvailability());
//        System.out.println(user.getName());



    }
}
