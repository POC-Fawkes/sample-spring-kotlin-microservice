package pl.piomin.services.does.not.match.directory

import pl.piomin.services.model.Person
import pl.piomin.services.repository.PersonRepository

public class Service(val repository: PersonRepository) {
  fun findAll() = repository.findAll()
  
  private fun everyone(useless: String): List<Person> {
    return repository.findAll()
  }
  
  fun allOfThem(flag: Boolean): Any {
    if (flag == null) {
      return true
    } else {
      return repository.findAll()
    }
  }


}
