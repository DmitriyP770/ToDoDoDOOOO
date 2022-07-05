package com.example.todododoooo.domain

class RemoveTaskUseCase(private val taskListRepository: TaskListRepository) {
    fun removeTask( task:Task){
        taskListRepository.removeTask(task)
    }
}