package ru.maxdexter.mynotecompose.navigation

import androidx.navigation.NavHostController
import ru.maxdexter.mynotecompose.util.Action

class Screens (navController: NavHostController) {
    val list: (Action) -> Unit = { action ->
        navController.navigate("list/${action.name}") {
            popUpTo(LIST_SCREEN) {inclusive = true}
        }
    }

    val task:(Int) -> Unit = { taskId ->
        navController.navigate("task/$taskId")
    }

    companion object{
        const val LIST_SCREEN = "list/{action}"
        const val TASK_SCREEN = "task/{taskId}"


    }

}