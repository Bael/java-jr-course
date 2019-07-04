package pro.lvm444.javacourse.jpa.springBootHibernateExample.config;

import org.h2.Driver;
import org.h2.jdbcx.JdbcDataSource;
import org.hibernate.cfg.Environment;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import org.springframework.orm.jpa.JpaDialect;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaDialect;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.Properties;

@Configuration
public class dbconfig {


    @Bean(name = "entityManagerFactory")
    public EntityManagerFactory createEntityManagerFactory()
    {
        // VENDOR ADAPTER
        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        vendorAdapter.setDatabase(Database.H2);
        vendorAdapter.setGenerateDdl(true);
        vendorAdapter.setShowSql(true);

        // LocalContainerEntityManagerFactoryBean
        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
        factory.setJpaVendorAdapter(vendorAdapter);
        factory.setPackagesToScan("pro.lvm444.javacourse.jpa.springBootHibernateExample.entity");
        factory.setDataSource(configureDataSource());
        factory.setJpaDialect(new HibernateJpaDialect());

        Properties jpaProperties = new Properties();
        jpaProperties.setProperty(Environment.AUTOCOMMIT, String.valueOf(true));
        jpaProperties.setProperty(Environment.HBM2DDL_AUTO,"create");

        factory.setJpaProperties(jpaProperties);
        factory.afterPropertiesSet();

        return factory.getObject();
    }


    @Bean(name = "dataSource")
    public DataSource configureDataSource() {
        final JdbcDataSource jdbcDataSource = new JdbcDataSource();
        jdbcDataSource.setURL("jdbc:h2:mem:test;DB_CLOSE_DELAY=-1;MODE=PostgreSQL");

        jdbcDataSource.setUser("sa");
        jdbcDataSource.setPassword("");

        return jdbcDataSource;
    }
}
