package sages.bootcamp.dao;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)

@ContextConfiguration("classpath:spring.xml")

public class PartDaoImpTest extends AbstractTransactionalJUnit4SpringContextTests {
    @Autowired
    private PartDaoImp partDaoImp;

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Test
    public void addPart() throws Exception {
        String partName = "stojak";
        int price = 10;
        int catalog_Number = 3235;
        partDaoImp.addPart(partName, price, catalog_Number);

        Long count = jdbcTemplate.queryForObject(
                "SELECT count(*)FROM parts WHERE name LIKE ?", Long.class, partName
        );
        Assertions.assertThat(count).isEqualTo(1);
    }


    @Test
    public void findPpartById() throws Exception {
    }

    @Test
    public void findPpartByCatalogNumber() throws Exception {
    }

    @Test
    public void findPart() throws Exception {
    }

}