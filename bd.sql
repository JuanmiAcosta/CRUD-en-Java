CREATE TABLE Stock(
    Cproducto NUMBER NOT NULL PRIMARY KEY,
    Cantidad NUMBER NOT NULL
);

CREATE TABLE Pedido(
    Cpedido NUMBER NOT NULL PRIMARY KEY,
    Ccliente NUMBER NOT NULL,
    Fecha_pedido DATE NOT NULL
);

CREATE TABLE Detalle_pedido(
    Cpedido NUMBER NOT NULL,
    Cproducto NUMBER NOT NULL,
    Cantidad NUMBER NOT NULL,
    PRIMARY KEY(Cpedido, Cproducto)
    FOREIGN KEY(Cpedido) REFERENCES Pedido(Cpedido),
    FOREIGN KEY(Cproducto) REFERENCES Stock(Cproducto)
);