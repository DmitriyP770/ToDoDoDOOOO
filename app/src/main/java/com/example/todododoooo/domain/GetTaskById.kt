package com.example.todododoooo.domain

class GetTaskById(private val taskListRepository: TaskListRepository) {

    fun getTaskById(task: Task){
        taskListRepository.getTaskById(task)
    }
}