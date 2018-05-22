INSERT INTO category (id, name) VALUES (1,'IA'),
                                       (2,'IБ'),
                                       (3,'IВ'),
                                       (4,'II'),
                                       (5,'III'),
                                       (6,'IV'),
                                       (7,'V');

INSERT INTO property_type(id, name) VALUES (1,'Федеральная'),
                                           (2, 'Субъекта Российской Федерации'),
                                           (3, 'Муниципальная'),
                                           (4, 'Физического лица'),
                                           (5, 'Юридического лица');

INSERT INTO road_class(id, name) VALUES (1,'Автомобильные дороги федерального значения'),
                                        (2, 'Автомобильные дороги регионального или межмуниципального значения'),
                                        (3, 'Дороги местного значения'),
                                        (4,'Частные автомобильные дороги');

INSERT INTO transit_condition(id,name) values (1,'Автомагистраль'),
                                          (2,'Скоростная дорога'),
                                          (3, 'Дорога обычного типа');

INSERT INTO type_of_usage(id, name) VALUES (1, 'Общего пользования'),
                                           (2, 'Необщего пользования');

INSERT INTO user_role(id, role_name) VALUES (1, 'ADMINISTRATOR'),
                                            (2, 'USER');