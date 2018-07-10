import smile.math.{chisqtest, chisqtest2}

import scala.util.Random

object ChiSquaredTest extends App {
  // One-Sample Test
  val x: Array[Int] = Array.fill(100)(Random.nextInt(100))
  val probabilities: Array[Double] = Array.fill(100)(Random.nextDouble())

  val test = chisqtest(x, probabilities)
  println(s"P value: ${test.pvalue}")

  // Two-Sample Test
  val y = Array.fill(100)(Random.nextInt(100))
  val test2 = chisqtest2(x, y)
  println(s"P value: ${test2.pvalue}")

}
