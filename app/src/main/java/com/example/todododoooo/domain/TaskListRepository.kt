package com.example.todododoooo.domain

interface TaskListRepository {
    fun addTask( task: Task) : List<Task>
    fun editTask(task: Task)
    fun getTaskById(task: Task)
    fun getTaskList():List<Task>
    fun removeTask( task:Task)
}