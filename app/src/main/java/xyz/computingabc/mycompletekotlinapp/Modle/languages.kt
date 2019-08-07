package xyz.computingabc.mycompletekotlinapp.Modle

data class languages(var title: String)

object  Supplier{
    var language = listOf<languages>(
        languages("C++"),
        languages("Java"),
        languages("C#"),
        languages("JavaScript"),
        languages("PHP"),
        languages("Ruby"),
        languages("Pythan"),
        languages("Kotlin"),
        languages("Pearl"),
        languages("Swift"),
        languages("Objective C"),
        languages("C language"),
        languages("Darth"),
        languages("HTML"),
        languages("XML")
    )
}