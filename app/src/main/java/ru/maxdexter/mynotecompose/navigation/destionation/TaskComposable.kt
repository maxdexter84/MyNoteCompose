package ru.maxdexter.mynotecompose.navigation.destionation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import ru.maxdexter.mynotecompose.navigation.Screens
import ru.maxdexter.mynotecompose.util.Action

fun NavGraphBuilder.taskComposable(navigateToListScreen:(Action)-> Unit) {
    composable(
        route = Screens.TASK_SCREEN,
        arguments = listOf(navArgument(TASK_ARGUMENT_KEY) {
            type = NavType.IntType })
    ) {

    }
}