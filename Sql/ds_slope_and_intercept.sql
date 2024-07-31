create table if not exists ds_slope_and_intercept(
slope_code Integer not null,
function_code Integer null,
dynamic_allocation varchar(255) null,
coefficient varchar(255) null,
splittor varchar(255) null,
predictions varchar(255) null,
resequenced char null,
key_value varchar(255) null,
low_key varchar(255) null,
high_key varchar(255) null,
significant_key_value varchar(255) null,
insignificant_key_value varchar(255) null,
hypothesis varchar(255) null,
alternative_hypothesis varchar(255) null,
entity_state varchar(255) null,
remarks varchar(255) null,
constraint ds_slope_and_intercept_pk primary key(slope_code));