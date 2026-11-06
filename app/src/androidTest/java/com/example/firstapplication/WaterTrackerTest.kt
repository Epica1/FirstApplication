//package com.example.firstapplication
//
//import androidx.compose.ui.test.junit4.createComposeRule
//import androidx.compose.ui.test.onNodeWithText
//import androidx.compose.ui.test.performClick
//import org.junit.Rule
//import org.junit.Test
//
//class WaterTrackerTest {
//
//    @get:Rule
//    val composeTestRule = createComposeRule()
//
//    @Test
//    fun addWaterButton_existsAndIncreasesWaterCount() {
//        composeTestRule.setContent { WaterTracker() }
//
//        // Проверяем наличие кнопки добавления жидкости
//        composeTestRule.onNodeWithText("+250 мл").assertExists()
//
//        // Нажимаем и проверяем, что значение увеличилось на 250 (с 750 до 1000)
//        composeTestRule.onNodeWithText("+250 мл").performClick()
//        composeTestRule.onNodeWithText("1000 мл").assertExists()
//    }
//
//    @Test
//    fun finishDayButton_existsAndResetsWaterCount() {
//        composeTestRule.setContent { WaterTracker() }
//
//        // Проверяем наличие кнопки "Завершить день"
//        composeTestRule.onNodeWithText("Завершить день").assertExists()
//
//        // Нажимаем — счётчик жидкости должен сброситься до 0
//        composeTestRule.onNodeWithText("Завершить день").performClick()
//        composeTestRule.onNodeWithText("0 мл").assertExists()
//    }
//
//    @Test
//    fun streakText_showsCorrectDaysCountAfterReachingGoal() {
//        composeTestRule.setContent { WaterTracker() }
//
//        // Стартовое значение 750 мл, добавляем ещё 3 раза по 250 = 1500 мл
//        repeat(3) {
//            composeTestRule.onNodeWithText("+250 мл").performClick()
//        }
//
//        composeTestRule.onNodeWithText("Завершить день").performClick()
//
//        // Проверяем, что счётчик дней подряд увеличился до 1
//        composeTestRule.onNodeWithText("Дней подряд с нормой: 1").assertExists()
//    }
//}