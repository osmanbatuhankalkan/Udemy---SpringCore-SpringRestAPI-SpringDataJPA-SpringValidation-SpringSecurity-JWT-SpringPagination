package com.osmanbatuhan.spring_rest_api.Repository;

import com.osmanbatuhan.spring_rest_api.Model.Employee;
import com.osmanbatuhan.spring_rest_api.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository//Burada 'Spring Contexte' Bean oluşturduk,
//Bu sayede sonrasından 'Contexten' alıp enjeksiyon işlemleri yapabileceğiz.

public class EmployeeRepository {

    //'SpringContexte' oluşturulmuş olan '@Bean'leri(@RestController,@Repository,@Service),
    // '@Autowired' ile Enjekte ediyoruz. Bu sayede classlar arası veri iletimini, kullanımını sağlıyoruz. 'Classlar ARASI GEÇİŞ SAĞLIYOR'.
    @Autowired
    private List<Employee> employeeList;

    public List<Employee> getAllEmployeeList(){
        return employeeList;
    }
}
