//№1
//package com.example.firstapplication
//
//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//
//@Composable
//fun Hello(name: String?) {
//    val greeting = if (name != null) name else "Имя не задано"
//    Text(text = greeting)
//}
//
//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            // Hello(name = "Михаил")
//            Hello(name = null)
//        }
//    }
//}

//№2
//package com.example.firstapplication
//
//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.layout.size
//import androidx.compose.foundation.shape.CircleShape
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.draw.clip
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//
//@Composable
//fun Hello(name: String?) {
//    Text(
//        text = name ?: "Имя не задано",
//        modifier = Modifier.padding(top = 32.dp)
//    )
//}
//
//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            Hello(name = "Михаил")
//        }
//    }
//}
//
//@Composable
//fun HelloPreview() {
//    Hello(name = "Михаил")
//}
//
//// Задание 2: три макета предпросмотра
//
//@Preview(showSystemUi = true, name = "Портрет")
//@Composable
//fun HelloPreviewPortrait() {
//    HelloPreview()
//}
//
//@Preview(
//    showSystemUi = true,
//    name = "Горизонтальный",
//    device = "spec:width=411dp,height=891dp,orientation=landscape"
//)
//@Composable
//fun HelloPreviewLandscape() {
//    HelloPreview()
//}
//
//@Preview(name = "Круглый", widthDp = 220, heightDp = 220)
//@Composable
//fun HelloPreviewRound() {
//    Box(
//        modifier = Modifier
//            .size(200.dp)
//            .clip(CircleShape)
//            .background(Color.Yellow),
//        contentAlignment = Alignment.Center
//    ) {
//        HelloPreview()
//    }
//}


//№3
//package com.example.firstapplication
//
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.padding
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.res.stringResource
//import androidx.compose.ui.text.font.FontStyle
//import androidx.compose.ui.text.style.TextAlign
//import androidx.compose.ui.text.style.TextDecoration
//import androidx.compose.ui.text.style.TextOverflow
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//
//@Composable
//fun ComposeDescriptionSamples() {
//    Column {
//        // Вариант 1: зелёный цвет шрифта, 16.sp, курсив, по центру
//        Text(
//            text = stringResource(R.string.compose_description),
//            color = Color.Green,
//            fontSize = 16.sp,
//            fontStyle = FontStyle.Italic,
//            textAlign = TextAlign.Center,
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(8.dp)
//        )
//
//        // Вариант 2: одна строка, в конце многоточие
//        Text(
//            text = stringResource(R.string.compose_description),
//            maxLines = 1,
//            overflow = TextOverflow.Ellipsis,
//            modifier = Modifier.padding(8.dp)
//        )
//
//        // Вариант 3: отступ перед первой строкой, 24.sp, чёрный текст на зелёном фоне, подчёркнутый
//        Text(
//            text = stringResource(R.string.compose_description),
//            fontSize = 24.sp,
//            color = Color.Black,
//            textDecoration = TextDecoration.Underline,
//            modifier = Modifier
//                .background(Color.Green)
//                .padding(top = 48.dp)
//        )
//    }
//}
//
//@Preview(showBackground = true, name = "Задание 3")
//@Composable
//fun ComposeDescriptionSamplesPreview() {
//    ComposeDescriptionSamples()
//}


//№4
//package com.example.firstapplication
//
//import androidx.compose.foundation.BorderStroke
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.material3.Button
//import androidx.compose.material3.ButtonDefaults
//import androidx.compose.material3.CenterAlignedTopAppBar
//import androidx.compose.material3.ExperimentalMaterial3Api
//import androidx.compose.material3.Scaffold
//import androidx.compose.material3.Text
//import androidx.compose.material3.TopAppBarDefaults
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//
//@Composable
//fun StyledButton() {
//    Button(
//        onClick = { /* действие */ },
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(16.dp),
//        shape = RoundedCornerShape(16.dp),
//        border = BorderStroke(2.dp, Color.Gray),
//        colors = ButtonDefaults.buttonColors(
//            containerColor = Color.LightGray,
//            contentColor = Color.Black
//        ),
//        elevation = ButtonDefaults.buttonElevation(defaultElevation = 4.dp)
//    ) {
//        Text(text = "Нажми на меня")
//    }
//}
//
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun ButtonScreen() {
//    Scaffold(
//        topBar = {
//            CenterAlignedTopAppBar(
//                title = { Text("FirstComposeProject") },
//                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
//                    containerColor = Color(0xFF6200EE),
//                    titleContentColor = Color.White
//                )
//            )
//        }
//    ) { innerPadding ->
//        Column(modifier = Modifier
//            .fillMaxSize()
//            .padding(innerPadding)
//        ) {
//            StyledButton()
//        }
//    }
//}
//
//@Preview(showSystemUi = true, name = "ButtonPreview - portrait")
//@Composable
//fun ButtonScreenPreview() {
//    ButtonScreen()
//}


//№5
//package com.example.firstapplication
//
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.aspectRatio
//import androidx.compose.foundation.layout.fillMaxHeight
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.shape.CircleShape
//import androidx.compose.material3.CenterAlignedTopAppBar
//import androidx.compose.material3.ExperimentalMaterial3Api
//import androidx.compose.material3.Scaffold
//import androidx.compose.material3.Text
//import androidx.compose.material3.TopAppBarDefaults
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.draw.clip
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//
//@Composable
//fun InitialsCard() {
//    Box(
//        modifier = Modifier
//            .fillMaxWidth()
//            .height(100.dp)
//            .background(Color.LightGray),
//        contentAlignment = Alignment.Center
//    ) {
//        Box(
//            modifier = Modifier
//                .padding(vertical = 16.dp)
//                .fillMaxHeight()
//                .aspectRatio(1f)
//                .clip(CircleShape)
//                .background(Color(0xFFFF5722)), // оранжевый
//            contentAlignment = Alignment.Center
//        ) {
//            Text(text = "МО")
//        }
//    }
//}
//
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun InitialsScreen() {
//    Scaffold(
//        topBar = {
//            CenterAlignedTopAppBar(
//                title = { Text("FirstComposeProject") },
//                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
//                    containerColor = Color(0xFF6200EE),
//                    titleContentColor = Color.White
//                )
//            )
//        }
//    ) { innerPadding ->
//        Column(modifier = Modifier
//            .fillMaxSize()
//            .padding(innerPadding)
//        ) {
//            InitialsCard()
//        }
//    }
//}
//
//@Preview(showSystemUi = true, name = "Task5Preview - portrait")
//@Composable
//fun InitialsScreenPreview() {
//    InitialsScreen()
//}


//№6
//package com.example.firstapplication
//
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.size
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.graphics.ColorFilter
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//
//// Вариант 1: круг исходного размера в правом верхнем углу,
//// компонент 240.dp x 120.dp с чёрным фоном
//@Composable
//fun CircleTopEndSample() {
//    Box(
//        modifier = Modifier
//            .size(width = 240.dp, height = 120.dp)
//            .background(Color.Black)
//    ) {
//        Image(
//            painter = painterResource(id = R.drawable.circle),
//            contentDescription = null,
//            modifier = Modifier.align(Alignment.TopEnd)
//        )
//    }
//}
//
//// Вариант 2: синий фон, круг по центру, растянут по размерам,
//// цвет круга — фиолетовый
//@Composable
//fun CircleStretchedPurpleSample() {
//    Box(
//        modifier = Modifier
//            .size(width = 240.dp, height = 120.dp)
//            .background(Color.Blue)
//    ) {
//        Image(
//            painter = painterResource(id = R.drawable.circle),
//            contentDescription = null,
//            colorFilter = ColorFilter.tint(Color(0xFF9C27B0)),
//            modifier = Modifier
//                .fillMaxSize()
//                .align(Alignment.Center)
//        )
//    }
//}
//
//@Preview(showBackground = true, name = "оранжевый")
//@Composable
//fun CircleTopEndSamplePreview() {
//    CircleTopEndSample()
//}
//
//@Preview(showBackground = true, name = "фиолетовый")
//@Composable
//fun CircleStretchedPurpleSamplePreview() {
//    CircleStretchedPurpleSample()
//}


//№7
//package com.example.firstapplication
//
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.layout.size
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.Star
//import androidx.compose.material3.Icon
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.text.style.TextAlign
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//
//data class Contact(
//    val firstName: String,
//    val middleName: String,
//    val lastName: String,
//    val phone: String,
//    val address: String
//)
//
//val sampleContacts = listOf(
//    Contact("Евгений", "Андреевич", "Лукашин", "+7 495 495 95 95", "г. Москва, 3-я улица Строителей, д. 25, кв. 12"),
//    Contact("Василий", "Егорович", "Кузякин", "—", "Ивановская область, дер. Крутово, д. 4"),
//    Contact("Людмила", "Прокофьевна", "Калугина", "+7 495 788 78 78", "Москва, Большая Никитская, д. 43, кв. 290")
//)
//
//// Задание 7 (Column): обычный текст, без фона, слева
//@Composable
//fun ContactColumn(contact: Contact) {
//    Column(modifier = Modifier.padding(16.dp)) {
//        Text(text = "Имя: ${contact.firstName}")
//        Text(text = "Отчество: ${contact.middleName}")
//        Text(text = "Фамилия: ${contact.lastName}")
//        Text(text = "Мобильный телефон: ${contact.phone}")
//        Text(text = "Адрес: ${contact.address}")
//    }
//}
//
//// Задание 7 (Row): серая карточка, текст по центру, звезда справа (произвольное изображение)
//@Composable
//fun ContactRow(contact: Contact) {
//    Row(
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(8.dp)
//            .background(Color.LightGray)
//            .padding(16.dp),
//        horizontalArrangement = Arrangement.SpaceBetween,
//        verticalAlignment = Alignment.CenterVertically
//    ) {
//        Column(
//            horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//            Text(text = "Имя: ${contact.firstName}", textAlign = TextAlign.Center)
//            Text(text = "Отчество: ${contact.middleName}", textAlign = TextAlign.Center)
//            Text(text = "Фамилия: ${contact.lastName}", textAlign = TextAlign.Center)
//            Text(text = "Мобильный телефон: ${contact.phone}", textAlign = TextAlign.Center)
//            Text(text = "Адрес: ${contact.address}", textAlign = TextAlign.Center)
//        }
//        Icon(
//            imageVector = Icons.Default.Star,
//            contentDescription = null,
//            tint = Color(0xFFFF5722),
//            modifier = Modifier.size(32.dp)
//        )
//    }
//}
//
//// Серая карточка без звезды — для списка
//@Composable
//fun ContactCard(contact: Contact) {
//    Column(
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(8.dp)
//            .background(Color.LightGray)
//            .padding(16.dp),
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        Text(text = "Имя: ${contact.firstName}", textAlign = TextAlign.Center)
//        Text(text = "Отчество: ${contact.middleName}", textAlign = TextAlign.Center)
//        Text(text = "Фамилия: ${contact.lastName}", textAlign = TextAlign.Center)
//        Text(text = "Мобильный телефон: ${contact.phone}", textAlign = TextAlign.Center)
//        Text(text = "Адрес: ${contact.address}", textAlign = TextAlign.Center)
//    }
//}
//
//@Composable
//fun ContactList(contacts: List<Contact>) {
//    Column(
//        verticalArrangement = Arrangement.spacedBy(8.dp),
//        modifier = Modifier.padding(8.dp)
//    ) {
//        contacts.forEach { contact ->
//            ContactCard(contact)
//        }
//    }
//}
//
//@Preview(showBackground = true, name = "ContactColumnPreview - portrait")
//@Composable
//fun ContactColumnPreview() {
//    ContactColumn(sampleContacts[0])
//}
//
//@Preview(showBackground = true, name = "ContactRowPreview - portrait")
//@Composable
//fun ContactRowPreview() {
//    ContactRow(sampleContacts[0])
//}
//
//@Preview(showBackground = true, name = "ListPreview - portrait")
//@Composable
//fun ListPreview() {
//    ContactList(sampleContacts)
//}


//№8
//package com.example.firstapplication
//
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Spacer
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.material3.Button
//import androidx.compose.material3.ButtonDefaults
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
//import androidx.compose.runtime.setValue
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//
//val primaryColor = Color(0xFF3F51B5)   // синий заголовка
//val secondaryColor = Color(0xFF616161) // серый числа
//val buttonColor = Color(0xFF1E3A5F)    // тёмно-синяя кнопка
//val buttonTextColor = Color.White
//
//@Composable
//fun WaterTracker() {
//    var waterCount by remember { mutableStateOf(750) }
//    var streakDays by remember { mutableStateOf(0) }
//
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .padding(16.dp),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        Text(
//            text = "Трекер воды",
//            fontSize = 22.sp,
//            fontWeight = FontWeight.Bold,
//            color = primaryColor
//        )
//        Spacer(modifier = Modifier.height(24.dp))
//        Text(
//            text = "$waterCount мл",
//            fontSize = 32.sp,
//            fontWeight = FontWeight.Bold,
//            color = secondaryColor
//        )
//        Spacer(modifier = Modifier.height(16.dp))
//        Button(
//            onClick = { waterCount += 250 },
//            colors = ButtonDefaults.buttonColors(containerColor = buttonColor),
//            shape = RoundedCornerShape(20.dp)
//        ) {
//            Text(
//                text = "+250 мл",
//                fontSize = 14.sp,
//                fontWeight = FontWeight.Bold,
//                color = buttonTextColor
//            )
//        }
//        Spacer(modifier = Modifier.height(12.dp))
//        Button(
//            onClick = {
//                streakDays = if (waterCount >= 1500) streakDays + 1 else 0
//                waterCount = 0
//            },
//            colors = ButtonDefaults.buttonColors(containerColor = buttonColor),
//            shape = RoundedCornerShape(20.dp)
//        ) {
//            Text(
//                text = "Завершить день",
//                fontSize = 14.sp,
//                fontWeight = FontWeight.Bold,
//                color = buttonTextColor
//            )
//        }
//        Spacer(modifier = Modifier.height(12.dp))
//        Text(text = "Дней подряд с нормой: $streakDays", color = secondaryColor)
//    }
//}
//
//@Preview(showSystemUi = true, name = "WaterTrackerPreview")
//@Composable
//fun WaterTrackerPreview() {
//    WaterTracker()
//}


//№10
//package com.example.firstapplication
//
//import android.content.Context
//import android.os.Bundle
//import android.widget.Toast
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Spacer
//import androidx.compose.foundation.layout.height
//import androidx.compose.material3.Button
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.LaunchedEffect
//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
//import androidx.compose.runtime.setValue
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.platform.LocalContext
//import androidx.compose.ui.unit.dp
//import kotlin.random.Random
//
//data class Cart(val products: List<Product>)
//data class Product(val id: Int, val name: String, val price: Int)
//
//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            ShoppingCartScreen()
//        }
//    }
//
//    @Composable
//    fun ShoppingCartScreen() {
//        var products by remember {
//            mutableStateOf(
//                listOf(
//                    Product(0, "Товар #1", 100),
//                    Product(1, "Товар #2", 150),
//                    Product(2, "Товар #3", 56)
//                )
//            )
//        }
//
//        val totalSum = products.sumOf { it.price }
//        val productSize = products.size
//        val context = LocalContext.current
//
//        Column {
//            for (product in products) {
//                Text(text = product.name + " - " + product.price + " рублей")
//            }
//            Spacer(modifier = Modifier.height(10.dp))
//            Text(text = "Товаров на сумму: $totalSum рублей")
//            AddProductSection(totalSum = totalSum, context = context) {
//                products = products + Product(
//                    id = products.size,
//                    name = "Товар #${products.size + 1}",
//                    price = Random.nextInt(0, 100)
//                )
//            }
//            RemoveProductSection(productSize = productSize) {
//                products = products.dropLast(1)
//            }
//        }
//    }
//
//    @Composable
//    fun AddProductSection(
//        totalSum: Int,
//        context: Context,
//        onAdd: () -> Unit
//    ) {
//        LaunchedEffect(totalSum) {
//            if (totalSum > 500) {
//                Toast.makeText(context, "Доставка бесплатная!", Toast.LENGTH_SHORT).show()
//            }
//        }
//        Button(onClick = onAdd) {
//            Text(text = "Добавить товар")
//        }
//    }
//
//    @Composable
//    fun RemoveProductSection(
//        productSize: Int,
//        onRemove: () -> Unit
//    ) {
//        if (productSize > 0) {
//            Button(onClick = onRemove) {
//                Text(text = "Удалить товар")
//            }
//        }
//    }
//}