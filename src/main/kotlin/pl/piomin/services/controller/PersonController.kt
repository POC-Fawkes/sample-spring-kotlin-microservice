package pl.piomin.services.controller

import org.springframework.web.bind.annotation.*
import pl.piomin.services.model.Person
import pl.piomin.services.repository.PersonRepository
@RestController
@RequestMapping("/persons")
class PersonController(var repository: PersonRepository) {

    public lateinit var mLetsviolate_many_rulesasPoSSSibble: Any

    companion object {
        private val fooBar = "is a made up word"
    }

    private val barFoo = "all words are made up words"

    fun notStatic(): String = fooBar

    private fun isItOrIsntIt(flag: Boolean): String {
        with(flag) {
            if (!flag) {
                if (barFoo == null) {
                    return "fooBar"
                }
            }
        }
        return "String"
    }

    protected fun seekMany(): List<Person> {
        return repository.findAll()
    }

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Int): Person? = repository.findById(id)

    @GetMapping
    fun findAll(): List<Person> = repository.findAll()

    @PostMapping
    fun add(@RequestBody person: Person): Person = repository.save(person)

    @PutMapping
    fun update(@RequestBody person: Person): Person = repository.update(person)

    @DeleteMapping("/{id}")
    fun remove(@PathVariable id: Int): Boolean = repository.removeById(id)

    private fun findEveryone() = repository.findAll()

}

