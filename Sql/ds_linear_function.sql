create table if not exists ds_linear_function(
function_code varchar(255) not null,
variable_list varchar(255) null,
dependent_variable varchar(255) null,
independant_variable varchar(255) null,
coefficient_variable varchar(255) null,
explanatory_variable varchar(255) null,
average_changes varchar(255) null,
assumption_data Integer null,
variable_prediction varchar(255) null,
valid_data_sample varchar(255) null,
entity_state varchar(255) null,
constraint ds_linear_function_pk primary key(function_code));