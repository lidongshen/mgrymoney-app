/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2020/1/3 10:07:23                            */
/*==============================================================*/


drop table if exists t_product;

/*==============================================================*/
/* Table: t_product                                             */
/*==============================================================*/
create table t_product
(
   id                   varchar(50) not null comment '编号',
   name                 varchar(50) not null comment '名称',
   start_amount         decimal(15,3) not null comment '起投金额',
   step_amount          decimal(15,3) not null comment '投资步长',
   lockup_period        smallint not null comment '锁定期',
   earning_rate         decimal(5,3) not null comment '收益率',
   status               varchar(20) not null comment '状态',
   remark               varchar(200) comment '备注',
   creatr_at            datetime comment '创建时间',
   create_user          varchar(20) comment '创建者',
   update_at            datetime comment '更新时间',
   update_user          varchar(20) comment '更新者',
   primary key (id)
);

