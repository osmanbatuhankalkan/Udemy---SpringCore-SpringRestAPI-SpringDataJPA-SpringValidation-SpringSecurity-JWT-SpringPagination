package com.osmanbatuhan.spring_rest_api.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
//Bu sınıfımızda: Sanal Db'de(AppConfig) yaratacağımız kullanıcı variable'larını yarattık.
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private String id;
    private String name;
    private String surname;
}
