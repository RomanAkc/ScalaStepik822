class Person (val name: String)

class Student(name: String, val course: Int) extends Person(name)

class Pair[+T](val first: T, val second: T) {
  def replaceFirst[B >: T](newValue: B): Pair[B] = {
    new Pair(newValue, second)
  }
}

def printNames(pair: Pair[Person]): Unit = {
  println("1: " + pair.first.name + "  2: " + pair.second.name)
}

val pair = new Pair(new Student("Pavel", 1)
  , new Student("Oleg", 5))

printNames(pair.replaceFirst(new Person("Oliver")))

//def f1[M <: IndexedSeq[_]](data: M) = println(data.head)

//def f2(data: Seq[_]): List[_] = data.toList; val x: Int = f2(Seq(1,2,3)).head

//def f3(x: _) = println("ignored")