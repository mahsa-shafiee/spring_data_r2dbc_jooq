package com.jooq.r2dbc_jooq.model.dao;

import com.jooq.r2dbc_jooq.model.entity.ProductPojo;
import com.jooq.r2dbc_jooq.model.entity.ProductRecord;
import com.jooq.r2dbc_jooq.model.entity.ProductTable;
import org.jooq.DSLContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JooqProductRepository {

    private static final Logger logger = LoggerFactory.getLogger(JooqProductRepository.class);

    private final DSLContext dslContext;

    ProductTable productTable = ProductTable.PRODUCT_TABLE;

    public JooqProductRepository(DSLContext context) {
        this.dslContext = context;
    }


    public Long add(ProductPojo product) {
        logger.info("Adding new product entry with information: {}", product);
        ProductRecord productRecord = dslContext.insertInto(productTable, productTable.NAME)
                .values(product.getName())
                .returning(productTable.ID)
                .fetchOne();

        return productRecord.getValue(productTable.ID);
    }

    public List<ProductPojo> getProducts() {
        logger.info("Get all products");
        return dslContext.selectFrom(productTable)
                .fetchInto(ProductPojo.class);
    }

    public ProductPojo selectOneById(Long id) {
        logger.info("Get product with id : {}", id);
        return dslContext.selectFrom(productTable)
                .where(productTable.ID.eq(id))
                .fetchOneInto(ProductPojo.class);
    }

    public boolean delete(Long id) {
        logger.info("Delete product with id : {}", id);
        return dslContext.deleteFrom(productTable)
                .where(productTable.ID.eq(id))
                .execute() == 1;
    }

    public boolean update(ProductPojo product) {
        return dslContext.update(productTable)
                .set(productTable.NAME, product.getName())
                .set(productTable.TIMESTAMP, product.getTimestamp())
                .where(productTable.ID.eq(product.getId()))
                .execute() == 1;
    }

}
