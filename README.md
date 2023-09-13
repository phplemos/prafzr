# Considerações iniciais

> Esse projeto tem como objetivo, pôr em prática o aprendizado adquirido na disciplina Engenharia de Software bem como praticar todo o processo de um desenvolvimento, já existe “Ns” aplicações todolist, mas meu objetivo não é querer criar algo novo, mas sim criar algo. No processo de desenvolvimento estou utilizando o ChatGPT para poder me direcionar e otimizar tempo de processo, como o ToDoList já é uma aplicação muito conhecida, não há a necessidade de reinventar a roda, então, estou coletando requisitos e sugestões de funcionalidades atraves do chatbot.




### Levantamento de requisitos:

>Atores:
Usuário Registrado:
os usuários que se cadastraram no aplicativo e têm acesso às funcionalidades completas.
Visitante não Autenticado:
Os usuários que estão visitando o aplicativo, mas ainda não fizeram login. Eles podem ter acesso a funcionalidades limitadas, como a página de login ou a página de registro.


* 1. Cadastro de Usuário </br>
   Descrição: Permitir que os usuários se cadastrem e acessem o aplicativo com um nome de usuário e senha. </br>
   Funcionalidade Futura: Recuperação de senha por e-mail. </br>
   Prioridade: Alta </br>
* 2. Adição de Tarefas</br>
   Descrição: Permitir que os usuários adicionem novas tarefas à lista. </br>
   Funcionalidade Futura: Adição de etiquetas ou categorias para organizar tarefas. </br>
   Prioridade: Alta </br>
* 3. Edição de Tarefas</br>
   Descrição: Permitir que os usuários editem o título ou a descrição de uma tarefa existente.</br>
   Funcionalidade Futura: Histórico de edições de tarefas.</br>
   Prioridade: Média </br>
* 4. Exclusão de Tarefas</br>
   Descrição: Permitir que os usuários excluam tarefas da lista.</br>
   Funcionalidade Futura: Arquivamento de tarefas em vez de exclusão definitiva.</br>
   Prioridade: Alta </br>
* 5. Marcação de Tarefas como Concluídas </br>
   Descrição: Permitir que os usuários marquem tarefas como concluídas. </br>
   Funcionalidade Futura: Visualização separada de tarefas concluídas e não concluídas. </br>
   Prioridade: Alta </br>
* 6. Ordenação de Tarefas </br>
   Descrição: Permitir que os usuários ordenem as tarefas na lista. </br>
   Funcionalidade Futura: Ordenação automática por data de vencimento ou prioridade. </br>
   Prioridade: Média </br>
* 7. Data de Vencimento </br>
   Descrição: Permitir que os usuários definam uma data de vencimento para uma tarefa. </br>
   Funcionalidade Futura: Notificações de lembrete de tarefas próximas da data de vencimento. </br>
   Prioridade: Média </br>
* 8. Busca e Filtro de Tarefas </br>
   Descrição: Permitir que os usuários busquem tarefas específicas e filtrem por diferentes critérios. </br>
   Funcionalidade Futura: Filtros avançados com base em várias características. </br>
   Prioridade: Média </br>
* 9. Interface Responsiva </br>
   Descrição: Garantir que o aplicativo seja acessível em diferentes dispositivos (desktop, tablet, mobile). </br>
   Funcionalidade Futura: Funcionalidades específicas otimizadas para diferentes plataformas. </br>
   Prioridade: Alta </br>
* 10. Feedback de Ação </br>
    Descrição: Fornecer feedback imediato após a execução de uma ação (por exemplo, adição, edição ou exclusão de uma tarefa). </br>
    Funcionalidade Futura: Opções de personalização de feedback. </br>
    Prioridade: Baixa </br>
* 11. Autenticação </br>
    Descrição: Garantir que apenas usuários autenticados tenham acesso às funcionalidades do aplicativo. </br>
    Funcionalidade Futura: Integração com autenticação de terceiros (por exemplo, Google, Facebook). </br>
    Prioridade: Média </br>


### Descrição de casos de uso:

> * Caso de Uso 1: Cadastro de Usuário </br>
Ator Principal: Visitante não Autenticado </br>
Descrição: O visitante não autenticado deseja criar uma conta no aplicativo. </br>
Fluxo Básico: </br>
O visitante acessa a página de registro. </br>
O sistema exibe um formulário de registro. </br>
O visitante preenche os campos de nome de usuário e senha. </br>
O visitante confirma o registro. </br>
O sistema valida os dados e cria uma conta para o usuário. </br>
O sistema redireciona o usuário para a página principal logado. </br>


> * Caso de Uso 2: Adição de Tarefas </br>
Ator Principal: Usuário Registrado </br>
Descrição: O usuário deseja adicionar uma nova tarefa à sua lista. </br>
Fluxo Básico: </br>
O usuário está na página principal. </br>
O usuário clica no botão "Adicionar Tarefa". </br>
O sistema exibe um formulário para adicionar uma nova tarefa. </br>
O usuário preenche os detalhes da nova tarefa (título, descrição, data de vencimento, etc.). </br>
O usuário confirma a adição. </br>
O sistema adiciona a tarefa à lista do usuário. </br>


> * Caso de Uso 3: Edição de Tarefas </br>
Ator Principal: Usuário Registrado </br>
Descrição: O usuário deseja editar os detalhes de uma tarefa existente. </br>
Fluxo Básico: </br>
O usuário está na página principal. </br>
O usuário clica na tarefa que deseja editar. </br>
O sistema exibe os detalhes da tarefa e um botão "Editar". </br>
O usuário clica no botão "Editar". </br>
O sistema permite que o usuário edite os detalhes da tarefa (título, descrição, data de vencimento, etc.). </br>
O usuário confirma a edição. </br>
O sistema atualiza os detalhes da tarefa. </br>


> * Caso de Uso 4: Exclusão de Tarefas </br>
Ator Principal: Usuário Registrado </br>
Descrição: O usuário deseja excluir uma tarefa de sua lista. </br>
Fluxo Básico: </br>
O usuário está na página principal. </br>
O usuário clica na tarefa que deseja excluir. </br>
O sistema exibe os detalhes da tarefa e um botão "Excluir". </br>
O usuário confirma a exclusão. </br>
O sistema remove a tarefa da lista do usuário. </br>


> * Caso de Uso 5: Marcação de Tarefas como Concluídas </br>
Ator Principal: Usuário Registrado </br>
Descrição: O usuário deseja marcar uma tarefa como concluída. </br>
Fluxo Básico: </br>
O usuário está na página principal. </br>
O usuário clica na tarefa que deseja marcar como concluída. </br>
O sistema atualiza o status da tarefa para "concluída". </br>


> * Caso de Uso 6: Ordenação de Tarefas </br>
Ator Principal: Usuário Registrado </br>
Descrição: O usuário deseja reordenar as tarefas em sua lista. </br>
Fluxo Básico: </br>
O usuário está na página principal. </br>
O usuário arrasta e solta as tarefas na ordem desejada. </br>
O sistema atualiza a ordem das tarefas na lista. </br>


> * Caso de Uso 7: Data de Vencimento </br>
Ator Principal: Usuário Registrado </br>
Descrição: O usuário deseja definir uma data de vencimento para uma tarefa. </br>
Fluxo Básico: </br>
O usuário está adicionando ou editando uma tarefa. </br>
O usuário seleciona ou insere uma data de vencimento para a tarefa. </br>
O sistema registra a data de vencimento da tarefa. </br>


> * Caso de Uso 8: Busca e Filtro de Tarefas </br>
Ator Principal: Usuário Registrado </br>
Descrição: O usuário deseja buscar ou filtrar tarefas com base em critérios específicos. </br>
Fluxo Básico: </br>
O usuário utiliza a função de busca ou filtros na página principal. </br>
O sistema exibe os resultados de acordo com os critérios fornecidos. </br>


> * Caso de Uso 9: Interface Responsiva </br>
Ator Principal: Todos os Usuários </br>
Descrição: Os usuários desejam acessar o aplicativo em diferentes dispositivos (desktop, tablet, mobile). </br>
Fluxo Básico: </br>
O usuário acessa o aplicativo a partir do dispositivo de escolha. </br>
O sistema adapta a interface para proporcionar uma experiência otimizada no dispositivo em uso. </br>


> * Caso de Uso 10: Feedback de Ação </br>
Ator Principal: Usuário Registrado </br>
Descrição: O usuário deseja receber feedback imediato após a execução de uma ação. </br>
Fluxo Básico: </br>
O usuário realiza uma ação, como adicionar, editar ou excluir uma tarefa. </br>
O sistema fornece feedback visual ou mensagens de confirmação. </br>
    

> * Caso de Uso 11: Autenticação </br>
Ator Principal: Visitante não Autenticado </br>
Descrição: O visitante deseja autenticar-se no aplicativo para acessar funcionalidades exclusivas. </br>
Fluxo Básico: </br>
O visitante acessa a página de login. </br>
O sistema exibe um formulário de login. </br>
O visitante insere seu nome de usuário e senha. </br>
O visitante confirma o login. </br>
O sistema valida as credenciais e redireciona o usuário para a página principal logado. </br>

### Diagrama de casos de uso:

> Foi utilizado o Draw.io para elaborar o diagrama em questão.
![caso_de_uso](https://github.com/phplemos/prafzr/blob/master/img/Diagrama%20de%20caso%20de%20uso.drawio.png?raw=true)


### Diagrama ER Banco de dados:

> Foi utilizado o Draw.io para elaborar o diagrama em questão.
![banco_dados](https://github.com/phplemos/prafzr/blob/master/img/Diagrama%20ER%20Banco%20de%20dados.png?raw=true)



### Recursos e tecnologias:
> Como o intuito e objetivo desse projeto é pôr em prática o conteúdo aprendido na disciplina Engenharia de Software, e pôr em prática conhecimentos, decidi subdividir o projeto em algumas tecnologias, por conta de familiaridade e conhecimento com Java, o Spring / Spring Web vai ser responsável por toda a parte de backend atraves da API Rest bem estruturada que a framework fornece, quanto ao frontend ainda nao decidi exatamente qual framework utilizar, mas a priori utilizarei Flutter para o mobile e React para o Web, porem ao decorrer do projeto pode haver mudanças.


