# 📚 ReadOn – Sistema de Biblioteca Digital e Física

Projeto acadêmico em desenvolvimento que visa implementar um **sistema de gerenciamento de biblioteca** integrado, com suporte a **livros físicos, ebooks e audiobooks**, incluindo funcionalidades de **empréstimo, reserva, leitura digital, notificações e relatórios**.

Desenvolvido para a disciplina Programação Orientada a Objetos 2 (UTFPR - Cornélio Procópio) pelos alunos Mariana Gasparotto Palácios,  Júlia Pivello Vila Real e Mateus de Jesus Gonçalves

---

## 🚀 Funcionalidades

### 👤 Para Leitores
- Cadastro/Login/Recuperação de senha  
- Busca e filtros por título, autor, ISBN, tipo e disponibilidade  
- Visualização detalhada do livro (sinopse, avaliações e disponibilidade)  
- Empréstimo de livros físicos e acompanhamento dos empréstimos ativos  
- Reserva de itens indisponíveis (com gerenciamento de fila)  
- Leitura online/download controlado de ebooks  
- Streaming de audiobooks com progresso salvo  
- Avaliação e comentários de títulos  
- Minhas listas e favoritos *(opcional)*  
- Notificações automáticas (lembretes, reservas, bloqueios)  

### 📖 Para Bibliotecários
- CRUD de livros e exemplares 
- Gestão de empréstimos: retirada, devolução, renovação e multas  
- Gestão de reservas e fila de espera  
- Administração de licenças digitais (limites simultâneos de acesso)  
- Relatórios: uso do acervo, atrasos, títulos mais acessados  
- Configuração de políticas (prazo, limite de itens, multas, renovações)  
- Gerência de usuários (bloqueio/desbloqueio, perfis de acesso)  

---

## 🏗 Arquitetura do Sistema

O sistema segue o paradigma **orientado a objetos** com classes bem definidas para representar os principais elementos de uma biblioteca:

- **Biblioteca** → Orquestra as operações principais (empréstimos, reservas, devoluções, notificações, relatórios).  
- **Livro (abstrato)** → Representa metadados básicos de qualquer obra (título, autor, ISBN, tipo).  
  - **Ebook** (formato, tamanho, DRM, licença digital)  
  - **Audiobook** (narrador, duração, capítulos, bitrate)  
  - **LivroFisico** (gerenciado via `Exemplar`)  
- **Exemplar** → Representa uma cópia física do livro, com status e histórico de empréstimos.  
- **Usuario** → Perfil de Leitor ou Bibliotecário, com regras de bloqueio, notificações e controle de empréstimos.  
- **LicencaDigital** → Controle de sessões simultâneas para ebooks e audiobooks.  
- **Avaliacao** → Notas e comentários de usuários sobre livros.  
- **PoliticaEmprestimo / PoliticaMulta / PoliticaRenovacao** → Objetos de valor para gerenciar regras da biblioteca.  

---

## 📊 Diagrama de Classes



---


## 🛠 Tecnologias e Ferramentas

- **Linguagem**: Java (plano de implementação)  
- **Modelagem UML**: Astah UML  
- **Controle de versão**: GitHub  
- **Interface gráfica**: Swing/JavaFX *(previsto para prototipagem)*  
- **Banco de dados**: Em definição (possível uso de PostgreSQL ou MySQL)  

---

## 📌 Status do Projeto

📍 **Em desenvolvimento** – fase de modelagem UML e definição de regras de negócio.  
Próximas etapas:  
- Implementação das classes principais em Java.  
- Construção de interface para leitores e bibliotecários.  
- Integração com banco de dados.  

---

## 👥 Autores

- **Júlia Pivello Vila Real** – Engenharia de Software, UTFPR
- **Mariana Gasparotto Palácios** – Engenharia de Software, UTFPR
- **Mateus de Jesus Gonçalves** – Engenharia de Software, UTFPR

