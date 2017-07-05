package sages.bootcamp.dao;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import sages.bootcamp.werchouse.Part;

import java.util.List;

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

        Integer id = jdbcTemplate.queryForObject("SELECT max(id) FROM parts", Integer.class);
        Part partById = partDaoImp.findPpartById(id);
        Assertions.assertThat(partById).isNotNull();
    }

    @Test
    public void findPpartByCatalogNumber() throws Exception {
        Integer catalogNumber = jdbcTemplate.queryForObject("SELECT catalog_number FROM parts WHERE catalog_number =  ?", Integer.class, 16488);
        Part partByCatalogNumber = partDaoImp.findPpartByCatalogNumber(catalogNumber);
        Assertions.assertThat(partByCatalogNumber).isNotNull();
    }

    @Test
    public void findPartByName() throws Exception {
        String name = jdbcTemplate.queryForObject("SELECT name FROM parts WHERE name LIKE ?", String.class, "uszczelka");
        Part partByName = partDaoImp.findPartByName(name);
        Assertions.assertThat(partByName).isNotNull();

    }

    @Test
    public void findPpartByavailable_quantity() throws Exception {

        //Integer available_quantity = jdbcTemplate.queryForObject("SELECT available_quantity FROM parts WHERE available_quantity >0 ", Integer.class  );
        List<Part> partByavailable_quantity = partDaoImp.findPartByavailable_quantity();
        Assertions.assertThat(partByavailable_quantity.size()).isEqualTo(3);
    }

}