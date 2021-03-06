package ru.maxdexter.mynotecompose.navigation.destionation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import ru.maxdexter.mynotecompose.navigation.Screens.Companion.LIST_SCREEN

const val LIST_ARGUMENT_KEY = "action"
const val TASK_ARGUMENT_KEY = "taskId"
fun NavGraphBuilder.listComposable(navigateToTaskScreen:(Int)-> Unit) {
    composable(
        route = LIST_SCREEN,
        arguments = listOf(navArgument(LIST_ARGUMENT_KEY) {
            type = NavType.StringType })
    ) {

    }
}