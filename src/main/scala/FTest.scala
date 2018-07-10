import smile.math.ftest

import scala.util.Random

object FTest extends App {
  val x = Array.fill(100)(Random.nextGaussian())
  val y = Array.fill(100)(Random.nextGaussian())

  val test = ftest(x, y)
  println(s"P value: ${test.pvalue}")
  println(s"F: ${test.f}")
  println(s"DF1: ${test.df1}")
  println(s"DF2: ${test.df2}")

}
