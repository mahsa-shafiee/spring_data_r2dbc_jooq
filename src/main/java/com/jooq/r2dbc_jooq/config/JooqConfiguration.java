package com.jooq.r2dbc_jooq.config;

import org.jooq.DSLContext;
import org.jooq.impl.DataSourceConnectionProvider;
import org.jooq.impl.DefaultConfiguration;
import org.jooq.impl.DefaultDSLContext;
import org.jooq.impl.DefaultExecuteListenerProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jooq.JooqExceptionTranslator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.TransactionAwareDataSourceProxy;

import javax.sql.DataSource;

//@Configuration
public class JooqConfiguration {

//    @Bean
//    public DataSource dataSource() {
//        JdbcDataSource dataSource = new JdbcDataSource();
//        dataSource.setURL("jdbc:mysql://localhost:3306/jooqdb");
//        dataSource.setUser("root");
//        dataSource.setPassword("1234");
//        return dataSource;
//    }
//
//    @Bean
//    public TransactionAwareDataSourceProxy transactionAwareDataSource() {
//        return new TransactionAwareDataSourceProxy(dataSource());
//    }
//
//    @Bean
//    public DataSourceTransactionManager transactionManager() {
//        return new DataSourceTransactionManager(dataSource());
//    }
//
//    @Bean
//    public DataSourceConnectionProvider connectionProvider() {
//        return new DataSourceConnectionProvider(transactionAwareDataSource());
//    }
//
//    @Bean
//    public ExceptionTranslator exceptionTransformer() {
//        return new ExceptionTranslator();
//    }
//
//    @Bean
//    @Primary
//    public DefaultDSLContext dsl() {
//        return new DefaultDSLContext(configuration());
//    }
//
//    @Bean
//    public DefaultConfiguration configuration() {
//        DefaultConfiguration jooqConfiguration = new DefaultConfiguration();
//        jooqConfiguration.set(connectionProvider());
//        jooqConfiguration.set(new DefaultExecuteListenerProvider(exceptionTransformer()));
//
//        SQLDialect dialect = SQLDialect.valueOf("MYSQL");
//        jooqConfiguration.set(dialect);
//
//        return jooqConfiguration;
//    }

//    @Autowired
//    DataSource dataSource;
//
//    @Bean
//    public DataSourceConnectionProvider connectionProvider() {
//        return new DataSourceConnectionProvider(
//                new TransactionAwareDataSourceProxy(dataSource));
//    }

//    @Bean
//    public DataSource dataSource() {
//        return DataSourceBuilder.create().build();
//    }

//    @Bean@Primary
//    public DSLContext dsl() {
//        return new DefaultDSLContext(configuration());
//    }
//
//    public DefaultConfiguration configuration() {
//        DefaultConfiguration config = new DefaultConfiguration();
//        config.set(connectionProvider());
//        config.set(new DefaultExecuteListenerProvider(
//                new JooqExceptionTranslator() ));
//        return config;
//    }

}