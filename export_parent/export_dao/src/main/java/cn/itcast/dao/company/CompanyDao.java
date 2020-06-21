package cn.itcast.dao.company;

import cn.itcast.domain.company.Company;

import java.util.List;

/**
 * @author 李嘉腾
 */
public interface CompanyDao {

    public abstract List<Company> findAll();
}
