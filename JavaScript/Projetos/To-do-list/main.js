const todoList = [{
  name: '',
  dueDate: ''
}];

renderTodoList();


function renderTodoList(){
  let todoListHTML = '';

  todoList.forEach((todoObject, index) => {
    const { name, dueDate } = todoObject;
    const html = `
    <div>${name}</div>
    <div>${dueDate}</div>
    <button class="delete-todo-button js-delete-todo-button">Delete</button>
  `;
    todoListHTML += html;
  })

          //forEach do the same thing as for loop, but it's more easy to read the forEach

 /* for (let i = 0; i < todoList.length; i++) {
    const todoObject = todoList[i];
    //const name = todoObject.name;
    //const dueDate = todoObject.dueDate
    const { name, dueDate } = todoObject;
    const html = `
    <div>${name}</div>
    <div>${dueDate}</div>
    <button onclick="
      todoList.splice(${i}, 1);
      renderTodoList();
    " class="delete-todo-button">Delete</button>
  `;
    todoListHTML += html;
  }*/

  document.querySelector('.js-todo-list').innerHTML = todoListHTML;
  
  document.querySelectorAll('.js-delete-todo-button')
    .forEach((deleteButton, index) => {
      deleteButton.addEventListener('click', () => {
        todoList.splice(index, 1);
        renderTodoList();
      });
    });
}

document.querySelector('.js-button')
  .addEventListener('click', () => {
    addTodo();
  })

document.body.addEventListener('keydown', (event) => {
  if (event.key === 'Enter'){
    addTodo();
  }
})

function addTodo() {
  const inputElement = document.querySelector('.js-name-input');
  const name = inputElement.value;

  const dateInputElement = document.querySelector('.js-due-date-input');
  const dueDate = dateInputElement.value;


  todoList.push({
    name,
    dueDate
  });

  inputElement.value = '';

  renderTodoList();
}







/*const list = [
  'make dinner',
  'wash dishes',
  'study'
];

for (let index = 0; index <= list.length - 1; index++) {
  const value = list[index]
  console.log(value);
}

    Both do the same, but using 'i' is shorter and the code looks more clean

for (let i = 0; index < list.length; i++) {
  const value = list[i]
  console.log(value);
}*/