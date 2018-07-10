import smile.math.{ttest, ttest2}

import scala.util.Random

object TTest extends App {
  // One-Sample Test
  val x = Array.fill(1000)(Random.nextGaussian())
  val test = ttest(x, 1.0)
  println(s"P value: ${test.pvalue}")

  // Paired Two-Sample Test
  val y = Array.fill(1000)(Random.nextGaussian())
  val test2 = ttest(x, y)
  println(s"P value: ${test2.pvalue}")

  // Independent (Unpaired) Two-Sample Test
  val test3 = ttest2(x, y)
  println(s"P value: ${test3.pvalue}")
}
