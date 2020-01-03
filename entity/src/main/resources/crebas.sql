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
   id                   varchar(50) not null comment '���',
   name                 varchar(50) not null comment '����',
   start_amount         decimal(15,3) not null comment '��Ͷ���',
   step_amount          decimal(15,3) not null comment 'Ͷ�ʲ���',
   lockup_period        smallint not null comment '������',
   earning_rate         decimal(5,3) not null comment '������',
   status               varchar(20) not null comment '״̬',
   remark               varchar(200) comment '��ע',
   creatr_at            datetime comment '����ʱ��',
   create_user          varchar(20) comment '������',
   update_at            datetime comment '����ʱ��',
   update_user          varchar(20) comment '������',
   primary key (id)
);

