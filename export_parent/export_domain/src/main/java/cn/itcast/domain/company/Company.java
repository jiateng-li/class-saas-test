package cn.itcast.domain.company;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 李嘉腾
 */
@Data
public class Company implements Serializable {

    private String id;
    private String name;
    private Date expirationDate;    //到期时间  expiration_date
    private String address;
    private String licenseId;       // license_id
    private String representative;
    private String phone;
    private String companySize;     // company_size
    private String industry;
    private String remarks;
    private Integer state;
    private Double balance;
    private String city;
}
