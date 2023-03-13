package com.example.myapplication

import android.content.Intent
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val data = mutableListOf<AnimalData>()

        val imgPathCat: String = "app/src/main/res/images/cat.png"
        val imgPathDog: String = "app/src/main/res/images/dog.png"
        val imgPathMouse: String = "app/src/main/res/images/mouse.png"

        data.add(AnimalData("Cat", "Just cat", R.drawable.cat, "The cat (Felis catus) is a domestic species of small carnivorous mammal. It is the only domesticated species in the family Felidae and is commonly referred to as the domestic cat or house cat to distinguish it from the wild members of the family. Cats are commonly kept as house pets but can also be farm cats or feral cats; the feral cat ranges freely and avoids human contact. Domestic cats are valued by humans for companionship and their ability to kill rodents. About 60 cat breeds are recognized by various cat registries."))
        data.add(AnimalData("Dog", "Just dog", R.drawable.dog, "The dog (Canis familiaris or Canis lupus familiaris) is a domesticated descendant of the wolf. Also called the domestic dog, it is derived from the extinct Pleistocene wolf, and the modern wolf is the dog's nearest living relative. Dogs were the first species to be domesticated by hunter-gatherers over 15,000 years ago before the development of agriculture. Due to their long association with humans, dogs have expanded to a large number of domestic individuals and gained the ability to thrive on a starch-rich diet that would be inadequate for other canids." +
                "The dog has been selectively bred over millennia for various behaviors, sensory capabilities, and physical attributes. Dog breeds vary widely in shape, size, and color. They perform many roles for humans, such as hunting, herding, pulling loads, protection, assisting police and the military, companionship, therapy, and aiding disabled people. Over the millennia, dogs became uniquely adapted to human behavior, and the human–canine bond has been a topic of frequent study. This influence on human society has given them the sobriquet of \"man's best friend\"."))
        data.add(AnimalData("Mouse", "Just Mouse", R.drawable.mouse,  "A mouse (pl: mice) is a small rodent. Characteristically, mice are known to have a pointed snout, small rounded ears, a body-length scaly tail, and a high breeding rate. The best known mouse species is the common house mouse (Mus musculus). Mice are also popular as pets. In some places, certain kinds of field mice are locally common. They are known to invade homes for food and shelter. Mice are typically distinguished from rats by their size. Generally, when a muroid rodent is discovered, its common name includes the term mouse if it is smaller, or rat if it is larger. The common terms rat and mouse are not taxonomically specific. Typical mice are classified in the genus Mus, but the term mouse is not confined to members of Mus and can also apply to species from other genera such as the deer mouse, Peromyscus."))

        recyclerView.adapter = AnimalsRecyclerAdapter(data, this)
    }

    public fun startActivity(longDesc: String)
    {
        startActivity(Intent(this, SecondActivity::class.java).apply
        {
            putExtra("text", longDesc)
        })
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
    }

    override fun onRestoreInstanceState(
        savedInstanceState: Bundle?,
        persistentState: PersistableBundle?
    ) {
        super.onRestoreInstanceState(savedInstanceState, persistentState)
    }
}