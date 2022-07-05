package com.example.todododoooo.domain

class AddTaskUseCase(private val taskListRepository: TaskListRepository) {

    fun addTask( task: Task) {
        taskListRepository.addTask(task)
    }
}