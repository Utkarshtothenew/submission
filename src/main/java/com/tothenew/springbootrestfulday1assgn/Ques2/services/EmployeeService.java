package com.tothenew.springbootrestfulday1assgn.Ques2.services;

import com.tothenew.springbootrestfulday1assgn.Ques2.Model.EmployeeBean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class EmployeeService {
    private static List<EmployeeBean> employeeBeanList = new ArrayList<>();
    private static int counter = 3;

    static {
        employeeBeanList.add(new EmployeeBean(1,"Shiva",22));
        employeeBeanList.add(new EmployeeBean(2,"Shivam",42));
        employeeBeanList.add(new EmployeeBean(3,"Shivang",32));
    }

    public List<EmployeeBean> getAll() {
        return employeeBeanList;
    }

    public EmployeeBean getById(Integer id) {
        for (EmployeeBean employeeBean: employeeBeanList) {
            if (employeeBean.getId() == id) {
                return employeeBean;
            }
        }
        return null;
    }

    public EmployeeBean addEmployee(EmployeeBean employeeBean) {
        if (employeeBean.getId() == null) {
            employeeBean.setId(++counter);
        }
        employeeBeanList.add(employeeBean);
        return employeeBean;    }

    public List<EmployeeBean> deleteById(Integer id) {
        Iterator iterator = employeeBeanList.iterator();
        while (iterator.hasNext()) {
            EmployeeBean employeeBean = (EmployeeBean) iterator.next();
            if (employeeBean.getId() == id) {
                iterator.remove();
                return employeeBeanList;
            }
        }
        return null;
    }


//    public void putEmployee(EmployeeBean employeeBean) {
//
//        employeeBeanList.add(employeeBean);
//           }




    public List<EmployeeBean> updateEmployee(EmployeeBean employeeBean) {
        Iterator iterator = employeeBeanList.iterator();
        EmployeeBean employeeBeanLocal = (EmployeeBean) iterator.next();
        while (iterator.hasNext()) {
            if (employeeBean.getId() == employeeBeanLocal.getId()) {
                employeeBeanList.remove(employeeBeanLocal);
            }
        }
        employeeBeanList.add(employeeBean);
        return employeeBeanList;
    }
}
