package com.osmanbatuhan.spring_rest_api.Services;

import com.osmanbatuhan.spring_rest_api.Model.Employee;
import com.osmanbatuhan.spring_rest_api.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service//Burada 'Spring Contexte' Bean oluşturduk,
//Bu sayede sonrasından 'Contexten' alıp enjeksiyon işlemleri yapabileceğiz.

public class EmployeeService {

    //'SpringContexte' oluşturulmuş olan '@Bean'leri(@RestController,@Repository,@Service),
    // '@Autowired' ile Enjekte ediyoruz. Bu sayede classlar arası veri iletimini, kullanımını sağlıyoruz. 'Classlar ARASI GEÇİŞ SAĞLIYOR'.
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployeeList(){
        return employeeRepository.getAllEmployeeList();
    }
}
