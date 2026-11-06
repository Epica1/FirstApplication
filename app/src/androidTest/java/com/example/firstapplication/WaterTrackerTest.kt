package com.example.firstapplication
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
//        composeTestRule.onNodeWithText("+250 мл").assertExists()
//
//        composeTestRule.onNodeWithText("+250 мл").performClick()
//        composeTestRule.onNodeWithText("1000 мл").assertExists()
//    }
//
//    @Test
//    fun finishDayButton_existsAndResetsWaterCount() {
//        composeTestRule.setContent { WaterTracker() }
//
//        composeTestRule.onNodeWithText("Завершить день").assertExists()
//
//        composeTestRule.onNodeWithText("Завершить день").performClick()
//        composeTestRule.onNodeWithText("0 мл").assertExists()
//    }
//
//    @Test
//    fun streakText_showsCorrectDaysCountAfterReachingGoal() {
//        composeTestRule.setContent { WaterTracker() }
//
//        repeat(3) {
//            composeTestRule.onNodeWithText("+250 мл").performClick()
//        }
//
//        composeTestRule.onNodeWithText("Завершить день").performClick()
//
//        composeTestRule.onNodeWithText("Дней подряд с нормой: 1").assertExists()
//    }
//}