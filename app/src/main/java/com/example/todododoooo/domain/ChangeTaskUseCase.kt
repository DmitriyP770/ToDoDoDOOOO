package com.example.todododoooo.domain

class ChangeTaskUseCase (private val taskListRepository: TaskListRepository){
   fun editTask(task: Task){
   taskListRepository.editTask(task)
   }

}