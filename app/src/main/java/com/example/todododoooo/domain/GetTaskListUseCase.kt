package com.example.todododoooo.domain

class GetTaskListUseCase(private val taskListRepository: TaskListRepository) {
    fun getTaskList():List<Task>{
       return taskListRepository.getTaskList()
    }
}