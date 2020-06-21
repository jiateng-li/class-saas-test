package cn.itcast.service.company;

import cn.itcast.domain.company.Company;

import java.util.List;

/**
 * @author 李嘉腾
 */
public interface CompanyService {

    List<Company> findAll();
}
