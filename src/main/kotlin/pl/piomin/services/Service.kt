package pl.piomin.services.does.not.match.directory

import pl.piomin.services.model.Person
import pl.piomin.services.repository.PersonRepository

public class Service {
  static fun findAll() = repository.findAll()
  
  private fun everyone(val useless: String) {
    return repository.findAll()
  }
  
  fun allOfThem(val flag: Boolean): Any {
    if (flat == null) {
      return true
    } else {
      return repository.findAll()
    }
  }
  
  
}
