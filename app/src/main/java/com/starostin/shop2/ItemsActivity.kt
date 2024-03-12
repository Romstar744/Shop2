package com.starostin.shop2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ItemsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_items)

        val itemsList: RecyclerView = findViewById(R.id.itemsList)
        val items = arrayListOf<Item>()



        items.add(Item(1, "steelseries", "Игровая мышь SteelSeries", "SteelSeries Rival 3",
            "Мышь проводная SteelSeries Rival 3 [62513] выведет обладателя на лидирующие позиции в насыщенной игровой баталии. " +
                "Плавность движения и маневренное управление достигается оптическим светодиодным сенсором с максимальным разрешением 8500 dpi. " +
                "Осуществив программирование кнопок, вы получите мгновенный доступ к определенным опциям.", 3999))

        items.add(Item(2, "razer", "Игровая мышь Razer", "Razer DeathAdder Essential",
            "Мышь проводная Razer DeathAdder Essential черная [RZ01-03850100-R3M1] обладает слегка изогнутым корпусом, удобным для хвата правой рукой. " +
                    "Эргономичный дизайн снимает лишнее напряжение с запястья и не выскальзывает из ладони." +
                    "Устройство подключается к ПК через стандартный USB-разъем с помощью длинного кабеля 1.8 м." +
                    "На корпусе Razer DeathAdder Essential вы найдете 5 кнопок для удобного управления игровым процессом. " +
                    "Датчик работает в режиме 6400 dpi, мгновенно реагируя на все команды и малейшие движения ладонью.", 1999))

        items.add(Item(3, "logitech", "Игровая мышь Logitech", "Logitech G102 LIGHTSYNC",
            "Мышь Logitech G102 LIGHTSYNC позволяет геймеру проходить игры с максимальным комфортом и эффективностью." +
                    "Данная модель манипулятора обеспечивает стабильное подключение по проводному интерфейсу USB и быструю реакцию на перемещения курсора благодаря датчику с показателем чувствительности до 8000 dpi. " +
                    "Мышь оборудована 6 кнопками.", 2499))

        itemsList.layoutManager = LinearLayoutManager(this)
        itemsList.adapter = ItemsAdapter(items, this)
    }
}