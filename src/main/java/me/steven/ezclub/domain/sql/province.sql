CREATE TABLE province(
  id VARCHAR(2) PRIMARY KEY NOT NULL,
  cn_name VARCHAR(25) NOT NULL,
  en_name VARCHAR(255) NOT NULL,
  CONSTRAINT province_id_unique UNIQUE (id),
  CONSTRAINT province_cn_name_unique UNIQUE (cn_name)
);


INSERT INTO province(id, cn_name, en_name) VALUES ('01', '直辖市', 'Municipality');
INSERT INTO province(id, cn_name, en_name) VALUES ('02', '特别行政区', 'Special Administrative Region');
INSERT INTO province(id, cn_name, en_name) VALUES ('GD', '广东', 'Guangdong Province');
INSERT INTO province(id, cn_name, en_name) VALUES ('HI', '海南', 'Hainan Province');
INSERT INTO province(id, cn_name, en_name) VALUES ('HE', '河北', 'Hebei Province');
INSERT INTO province(id, cn_name, en_name) VALUES ('SX', '山西', 'Shanxi Province');
INSERT INTO province(id, cn_name, en_name) VALUES ('NM', '內蒙古', 'Inner Mongolia Autonomous Region');
INSERT INTO province(id, cn_name, en_name) VALUES ('LN', '辽宁', 'Liaoning Province');
INSERT INTO province(id, cn_name, en_name) VALUES ('JL', '吉林', 'Jilin Province');
INSERT INTO province(id, cn_name, en_name) VALUES ('HL', '黑龙江', 'Heilongjiang Province');
INSERT INTO province(id, cn_name, en_name) VALUES ('JS', '江苏', 'Jiangsu Province');
INSERT INTO province(id, cn_name, en_name) VALUES ('ZJ', '浙江', 'Zhejiang Province');
INSERT INTO province(id, cn_name, en_name) VALUES ('AH', '安徽', 'Anhui Province');
INSERT INTO province(id, cn_name, en_name) VALUES ('FJ', '福建', 'Fujian Province');
INSERT INTO province(id, cn_name, en_name) VALUES ('JX', '江西', 'Jiangxi Province');
INSERT INTO province(id, cn_name, en_name) VALUES ('SD', '山东', 'Shandong Province');
INSERT INTO province(id, cn_name, en_name) VALUES ('HA', '河南', 'Henan Province');
INSERT INTO province(id, cn_name, en_name) VALUES ('HB', '湖北', 'Hubei Province');
INSERT INTO province(id, cn_name, en_name) VALUES ('HN', '湖南', 'Hunan Province');
INSERT INTO province(id, cn_name, en_name) VALUES ('GX', '广西', 'Guangxi Zhuang Autonomous Region');
INSERT INTO province(id, cn_name, en_name) VALUES ('SC', '四川', 'Sichuan Province');
INSERT INTO province(id, cn_name, en_name) VALUES ('GZ', '贵州', 'Guizhou Province');
INSERT INTO province(id, cn_name, en_name) VALUES ('YN', '云南', 'Yunnan Province');
INSERT INTO province(id, cn_name, en_name) VALUES ('XZ', '西藏', 'Tibet Autonomous Region');
INSERT INTO province(id, cn_name, en_name) VALUES ('SN', '陕西', 'Shaanxi Province');
INSERT INTO province(id, cn_name, en_name) VALUES ('GS', '甘肃', 'Gansu Province');
INSERT INTO province(id, cn_name, en_name) VALUES ('QH', '青海', 'Qinghai Province');
INSERT INTO province(id, cn_name, en_name) VALUES ('NX', '宁夏', 'Ningxia Hui Autonomous Region');
INSERT INTO province(id, cn_name, en_name) VALUES ('XJ', '新疆', 'Xinjiang Uyghur Autonomous Region');
INSERT INTO province(id, cn_name, en_name) VALUES ('TW', '台湾', 'Taiwan Province');
