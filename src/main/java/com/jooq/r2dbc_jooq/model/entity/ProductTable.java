package com.jooq.r2dbc_jooq.model.entity;

import org.jooq.Identity;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

import static org.jooq.impl.Internal.createIdentity;

public class ProductTable extends TableImpl<ProductRecord> {

    public static final ProductTable PRODUCT_TABLE = new ProductTable();

    public static final UniqueKey<ProductRecord> ID_PKEY = Internal.createUniqueKey(PRODUCT_TABLE, "id_pkey", PRODUCT_TABLE.ID);

    public final TableField<ProductRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");
    public final TableField<ProductRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR, this, "");
    public final TableField<ProductRecord, LocalDateTime> TIMESTAMP = createField(DSL.name("timestamp"), SQLDataType.LOCALDATETIME, this, "");

    public ProductTable() {
        super(DSL.name("product"), null);
    }

    @Override
    public Identity<ProductRecord, ?> getIdentity() {
        return createIdentity(this, ID);
    }

    @Override
    public UniqueKey<ProductRecord> getPrimaryKey() {
        return ID_PKEY;
    }

    @Override
    public List<UniqueKey<ProductRecord>> getKeys() {
        return Collections.singletonList(ID_PKEY);
    }

    @Override
    public Class<? extends ProductRecord> getRecordType() {
        return ProductRecord.class;
    }

}
