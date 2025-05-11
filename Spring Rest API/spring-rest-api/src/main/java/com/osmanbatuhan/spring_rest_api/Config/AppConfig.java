package com.osmanbatuhan.spring_rest_api.Config;
import com.osmanbatuhan.spring_rest_api.Model.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;
//Bu Sınıfımızda: SANAL BİR VERİ TABANI YARATIYORUZ. VARMIŞ GİBİ VERİLERİ ÇEKEBİLİDĞİMİZİ GÖRMEK İÇİN.

@Configuration//Burada 'Spring Contexte' Bean oluşturduk,
//Bu sayede sonrasından 'Contexten' alıp enjeksiyon işlemleri yapabileceğiz.
public class AppConfig {

    //Burada ise '@Bean' anatasyonu ile direk 'SpringContexte' atama yapıyoruz.
    // Diğer Controller,Service,Repository @anastasyonlarında zaten kalıtımla, componentlerde.
    // @Bean uygulandığı için @Bean olarak direk yazmaya ihtiyac duymuyorduk.
    @Bean
    public List<Employee> employeeList(){
        List<Employee> employeeList = new ArrayList<>(); //Burada bir ArrayList Nesnesi yaratıyoruz ve içerisine verileri yolluyoruz.
        employeeList.add(new Employee("1","Osman","Kalkan"));
        employeeList.add(new Employee("2","Batuhan","Kalkan"));
        employeeList.add(new Employee("3","Osman Batuhan","Kalkan"));
        employeeList.add(new Employee("4","Yakup","UZ"));
        employeeList.add(new Employee("5","Malik","Jan"));
        employeeList.add(new Employee("6","Mehmet","Eren"));
        employeeList.add(new Employee("7","Ahmet","Emin"));
        return employeeList;
    }
}
