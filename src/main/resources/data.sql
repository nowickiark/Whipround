INSERT INTO WHIP_ROUND(id,goal,description) values (nextval('whip_seq'),300000,'Bog house for dogDao');
INSERT INTO WHIP_ROUND(id,goal,description) values (nextval('whip_seq'),50000,'search team for waldo');
INSERT INTO WHIP_ROUND(id,goal,description) values (nextval('whip_seq'),300000,'Sweter dla Darka');

INSERT INTO DONATION(id,donation,whip_round_id, user_name, email) values (nextval('donation_seq'),99,2, 'Arek', 'arek@gmai.com');
INSERT INTO DONATION(id,donation,whip_round_id, user_name, email) values (nextval('donation_seq'),150,2, 'Jarek', 'jarek@Gmail.com');


commit;