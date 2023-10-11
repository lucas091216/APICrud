# APICrud
Crud Feito em Java Desenvolvido para alavancagem do aprendizado com o framwork SPRING BOOT
Mysql foi usado como banco de dados. 

Trabalhando com Requisições HTTP esse projeto tem os seguintes protocolos: 

PUT : Atualizar Medico
DEL : Deletar Medico        //exclusao logica, ou seja, só faz com que ele esteja inativo e não apaga de verdade. 
DEL : ATivar Medico         //Ativa um Medico inativo pelo id.
GET : List Medico ativo     //Lista SOMENTE os medicos ativos.
GET : List todo os Medicos  //Lista TODOS os medicos, ou seja até os desativados
POST: Cadastra um medico    //Cadastra um medico novo no sistema.

Funcionalidades feitas tambem com a classe Pacientes. 

Foi usada a LIB JPA Repository para fazer a persistencia no banco de dados, trazer valores e modificar os dados. 
LIB Lombok foi usada para um codigo mais limpo. 





