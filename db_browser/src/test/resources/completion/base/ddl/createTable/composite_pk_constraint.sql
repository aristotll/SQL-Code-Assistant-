CREATE TABLE countries_demo (
    country_id      CHAR(2) CONSTRAINT country_id_nn_demo NOT NULL,
    country_name    VARCHAR2(40),
    currency_name   VARCHAR2(25),
    currency_symbol VARCHAR2(3),
    region          VARCHAR2(15),
    CONSTRAINT country_c_id_pk_demo
        PRIMARY KEY (country_id, "country_name", <caret>)
);


