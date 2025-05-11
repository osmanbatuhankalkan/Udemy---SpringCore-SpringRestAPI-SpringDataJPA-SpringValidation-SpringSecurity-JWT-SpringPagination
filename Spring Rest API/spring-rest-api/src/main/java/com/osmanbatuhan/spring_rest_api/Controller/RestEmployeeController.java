package com.osmanbatuhan.spring_rest_api.Controller;

import com.osmanbatuhan.spring_rest_api.Model.Employee;
import com.osmanbatuhan.spring_rest_api.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //Burada 'Spring Contexte' Bean oluşturduk,
//Bu sayede sonrasından 'Contexten' alıp enjeksiyon işlemleri yapabileceğiz.

@RequestMapping("/rest/api")// Bu kısım artık bu sınıfın KÖKÜ olmuş oluyor. İstek atılırken '/rest/api/.....' şeklinde yazılacak.Yoksa erişilemez.
public class RestEmployeeController {

    //'SpringContexte' oluşturulmuş olan '@Bean'leri(@RestController,@Repository,@Service),
    // '@Autowired' ile Enjekte ediyoruz. Bu sayede classlar arası veri iletimini, kullanımını sağlıyoruz. 'Classlar ARASI GEÇİŞ SAĞLIYOR'.
    @Autowired
    private EmployeeService employeeService;


    @GetMapping(path="/employee-List")
    public List<Employee> getAllEmployeeList(){
        return employeeService.getAllEmployeeList();
    }
}
