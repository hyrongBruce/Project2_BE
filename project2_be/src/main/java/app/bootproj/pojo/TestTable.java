package app.bootproj.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TestTable
 */
@Entity
@Table(name = "test_table")
public class TestTable {

    @Id
    Integer id_test_table;
    String test_col1;
    String testCol2;

    public TestTable(Integer id_test_table, String test_col1, String testCol2) {
        this.id_test_table = id_test_table;
        this.test_col1 = test_col1;
        this.testCol2 = testCol2;
    }

    public TestTable(String test_col1, String testCol2) {
        this.test_col1 = test_col1;
        this.testCol2 = testCol2;
    }

    public Integer getId_test_table() {
        return id_test_table;
    }

    public void setId_test_table(Integer id_test_table) {
        this.id_test_table = id_test_table;
    }

    public String getTest_col1() {
        return test_col1;
    }

    public void setTest_col1(String test_col1) {
        this.test_col1 = test_col1;
    }

    public String getTestCol2() {
        return testCol2;
    }

    public void setTestCol2(String testCol2) {
        this.testCol2 = testCol2;
    }

    public TestTable() {
    }

    @Override
    public String toString() {
        return "TestTable [id_test_table=" + id_test_table + ", testCol2=" + testCol2 + ", test_col1=" + test_col1
                + "]";
    }
    
    
}