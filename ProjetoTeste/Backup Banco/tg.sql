PGDMP     3                    v            TG    10.2    10.2 )               0    0    ENCODING    ENCODING         SET client_encoding = 'LATIN1';
                       false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                       false                       1262    16452    TG    DATABASE     ?   CREATE DATABASE "TG" WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'Portuguese_Brazil.1252' LC_CTYPE = 'Portuguese_Brazil.1252';
    DROP DATABASE "TG";
             postgres    false                        2615    2200    public    SCHEMA        CREATE SCHEMA public;
    DROP SCHEMA public;
             postgres    false                       0    0    SCHEMA public    COMMENT     6   COMMENT ON SCHEMA public IS 'standard public schema';
                  postgres    false    3                        3079    12924    plpgsql 	   EXTENSION     ?   CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;
    DROP EXTENSION plpgsql;
                  false                        0    0    EXTENSION plpgsql    COMMENT     @   COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';
                       false    1            ?            1259    16453    clientes    TABLE     ?  CREATE TABLE clientes (
    id_cliente integer NOT NULL,
    nome_cliente character varying(100),
    endereco_cliente character varying(50),
    complemento_cliente character varying(20),
    bairro_cliente character varying(20),
    cidade_cliente character varying(20),
    cep_cliente character varying(20),
    telefone_cliente character varying(20),
    celular_cliente character varying(20)
);
    DROP TABLE public.clientes;
       public         postgres    false    3            ?            1259    16456    clientes_id_cliente_seq    SEQUENCE     y   CREATE SEQUENCE clientes_id_cliente_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 .   DROP SEQUENCE public.clientes_id_cliente_seq;
       public       postgres    false    3    196            !           0    0    clientes_id_cliente_seq    SEQUENCE OWNED BY     E   ALTER SEQUENCE clientes_id_cliente_seq OWNED BY clientes.id_cliente;
            public       postgres    false    197            ?            1259    16458    itens_venda_produto    TABLE     }   CREATE TABLE itens_venda_produto (
    id_venda integer NOT NULL,
    id_produto integer NOT NULL,
    quantidade integer
);
 '   DROP TABLE public.itens_venda_produto;
       public         postgres    false    3            ?            1259    16461    login    TABLE     ?   CREATE TABLE login (
    id_login integer NOT NULL,
    nome character varying(100),
    login character varying(50) NOT NULL,
    senha character varying(50),
    adm integer
);
    DROP TABLE public.login;
       public         postgres    false    3            ?            1259    16464    login_id_login_seq    SEQUENCE     t   CREATE SEQUENCE login_id_login_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 )   DROP SEQUENCE public.login_id_login_seq;
       public       postgres    false    3    199            "           0    0    login_id_login_seq    SEQUENCE OWNED BY     ;   ALTER SEQUENCE login_id_login_seq OWNED BY login.id_login;
            public       postgres    false    200            ?            1259    16466    produtos    TABLE     ?   CREATE TABLE produtos (
    id_produto integer NOT NULL,
    nome_produto character varying(50),
    preco_produto numeric,
    quantidade_produto integer
);
    DROP TABLE public.produtos;
       public         postgres    false    3            ?            1259    16472    produtos_id_produto_seq    SEQUENCE     y   CREATE SEQUENCE produtos_id_produto_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 .   DROP SEQUENCE public.produtos_id_produto_seq;
       public       postgres    false    201    3            #           0    0    produtos_id_produto_seq    SEQUENCE OWNED BY     E   ALTER SEQUENCE produtos_id_produto_seq OWNED BY produtos.id_produto;
            public       postgres    false    202            ?            1259    16474    venda    TABLE     ?   CREATE TABLE venda (
    id_venda integer NOT NULL,
    valor_venda numeric,
    id_cliente integer,
    data date DEFAULT CURRENT_DATE
);
    DROP TABLE public.venda;
       public         postgres    false    3            ?            1259    16480    venda_id_venda_seq    SEQUENCE     t   CREATE SEQUENCE venda_id_venda_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 )   DROP SEQUENCE public.venda_id_venda_seq;
       public       postgres    false    3    203            $           0    0    venda_id_venda_seq    SEQUENCE OWNED BY     ;   ALTER SEQUENCE venda_id_venda_seq OWNED BY venda.id_venda;
            public       postgres    false    204            ?
           2604    16482    clientes id_cliente    DEFAULT     l   ALTER TABLE ONLY clientes ALTER COLUMN id_cliente SET DEFAULT nextval('clientes_id_cliente_seq'::regclass);
 B   ALTER TABLE public.clientes ALTER COLUMN id_cliente DROP DEFAULT;
       public       postgres    false    197    196            ?
           2604    16483    login id_login    DEFAULT     b   ALTER TABLE ONLY login ALTER COLUMN id_login SET DEFAULT nextval('login_id_login_seq'::regclass);
 =   ALTER TABLE public.login ALTER COLUMN id_login DROP DEFAULT;
       public       postgres    false    200    199            ?
           2604    16484    produtos id_produto    DEFAULT     l   ALTER TABLE ONLY produtos ALTER COLUMN id_produto SET DEFAULT nextval('produtos_id_produto_seq'::regclass);
 B   ALTER TABLE public.produtos ALTER COLUMN id_produto DROP DEFAULT;
       public       postgres    false    202    201            ?
           2604    16485    venda id_venda    DEFAULT     b   ALTER TABLE ONLY venda ALTER COLUMN id_venda SET DEFAULT nextval('venda_id_venda_seq'::regclass);
 =   ALTER TABLE public.venda ALTER COLUMN id_venda DROP DEFAULT;
       public       postgres    false    204    203                      0    16453    clientes 
   TABLE DATA               ?   COPY clientes (id_cliente, nome_cliente, endereco_cliente, complemento_cliente, bairro_cliente, cidade_cliente, cep_cliente, telefone_cliente, celular_cliente) FROM stdin;
    public       postgres    false    196   a+                 0    16458    itens_venda_produto 
   TABLE DATA               H   COPY itens_venda_produto (id_venda, id_produto, quantidade) FROM stdin;
    public       postgres    false    198   ?+                 0    16461    login 
   TABLE DATA               ;   COPY login (id_login, nome, login, senha, adm) FROM stdin;
    public       postgres    false    199   ?+                 0    16466    produtos 
   TABLE DATA               X   COPY produtos (id_produto, nome_produto, preco_produto, quantidade_produto) FROM stdin;
    public       postgres    false    201   ,                 0    16474    venda 
   TABLE DATA               A   COPY venda (id_venda, valor_venda, id_cliente, data) FROM stdin;
    public       postgres    false    203   l,       %           0    0    clientes_id_cliente_seq    SEQUENCE SET     ?   SELECT pg_catalog.setval('clientes_id_cliente_seq', 17, true);
            public       postgres    false    197            &           0    0    login_id_login_seq    SEQUENCE SET     :   SELECT pg_catalog.setval('login_id_login_seq', 15, true);
            public       postgres    false    200            '           0    0    produtos_id_produto_seq    SEQUENCE SET     ?   SELECT pg_catalog.setval('produtos_id_produto_seq', 18, true);
            public       postgres    false    202            (           0    0    venda_id_venda_seq    SEQUENCE SET     :   SELECT pg_catalog.setval('venda_id_venda_seq', 66, true);
            public       postgres    false    204            ?
           2606    16487    clientes pk_cliente 
   CONSTRAINT     R   ALTER TABLE ONLY clientes
    ADD CONSTRAINT pk_cliente PRIMARY KEY (id_cliente);
 =   ALTER TABLE ONLY public.clientes DROP CONSTRAINT pk_cliente;
       public         postgres    false    196            ?
           2606    16489    login pk_login 
   CONSTRAINT     K   ALTER TABLE ONLY login
    ADD CONSTRAINT pk_login PRIMARY KEY (id_login);
 8   ALTER TABLE ONLY public.login DROP CONSTRAINT pk_login;
       public         postgres    false    199            ?
           2606    16491    produtos pk_produto 
   CONSTRAINT     R   ALTER TABLE ONLY produtos
    ADD CONSTRAINT pk_produto PRIMARY KEY (id_produto);
 =   ALTER TABLE ONLY public.produtos DROP CONSTRAINT pk_produto;
       public         postgres    false    201            ?
           2606    16493    venda pk_venda 
   CONSTRAINT     K   ALTER TABLE ONLY venda
    ADD CONSTRAINT pk_venda PRIMARY KEY (id_venda);
 8   ALTER TABLE ONLY public.venda DROP CONSTRAINT pk_venda;
       public         postgres    false    203            ?
           2606    16495 $   itens_venda_produto pk_venda_produto 
   CONSTRAINT     m   ALTER TABLE ONLY itens_venda_produto
    ADD CONSTRAINT pk_venda_produto PRIMARY KEY (id_venda, id_produto);
 N   ALTER TABLE ONLY public.itens_venda_produto DROP CONSTRAINT pk_venda_produto;
       public         postgres    false    198    198            ?
           2606    16496    venda fk_cliente    FK CONSTRAINT     o   ALTER TABLE ONLY venda
    ADD CONSTRAINT fk_cliente FOREIGN KEY (id_cliente) REFERENCES clientes(id_cliente);
 :   ALTER TABLE ONLY public.venda DROP CONSTRAINT fk_cliente;
       public       postgres    false    203    2700    196            ?
           2606    16501    itens_venda_produto fk_produto    FK CONSTRAINT     }   ALTER TABLE ONLY itens_venda_produto
    ADD CONSTRAINT fk_produto FOREIGN KEY (id_produto) REFERENCES produtos(id_produto);
 H   ALTER TABLE ONLY public.itens_venda_produto DROP CONSTRAINT fk_produto;
       public       postgres    false    2706    201    198            ?
           2606    16506    itens_venda_produto fk_venda    FK CONSTRAINT     t   ALTER TABLE ONLY itens_venda_produto
    ADD CONSTRAINT fk_venda FOREIGN KEY (id_venda) REFERENCES venda(id_venda);
 F   ALTER TABLE ONLY public.itens_venda_produto DROP CONSTRAINT fk_venda;
       public       postgres    false    203    2708    198               5   x?34?ṱTp/??M,JL-?L??DNC?bNCCM??s??qqq Fza            x?33?4??4?23?4"?=... "c?         ;   x?3??L.?/Rp/??ɏ??,s9??9?M9S?2???R?!b@?????? &?         @   x?3??,H,HLO???44 N.Cs????̒?"N#??!PČ?$59'1%???Є+F??? ??\         )   x?33?44 NCsN#C]#]#.33NS4?=... ??     