package ru.maxdexter.mynotecompose.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import ru.maxdexter.mynotecompose.navigation.Screens.Companion.LIST_SCREEN
import ru.maxdexter.mynotecompose.navigation.destionation.listComposable
import ru.maxdexter.mynotecompose.navigation.destionation.taskComposable

@Composable
fun SetUpNavigation(navHostController: NavHostController) {
    val screen = remember(navHostController) {
        Screens(navHostController)

    }

    NavHost(navController = navHostController, startDestination = LIST_SCREEN)
    {
        listComposable(
            navigateToTaskScreen = screen.task
        )
        taskComposable(navigateToListScreen =screen.list )

    }

}