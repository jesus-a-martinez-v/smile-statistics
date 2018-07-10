import smile.math.kstest
import smile.stat.distribution.GaussianDistribution

import scala.util.Random

object KolmogorovSmirnovTest extends App {
  // One-Sample Test
  val x = Array.fill(1000)(Random.nextGaussian())
  val gaussianDistribution = new GaussianDistribution(0, 1)
  val test = kstest(x, gaussianDistribution)
  println(s"P value: ${test.pvalue}")

  // Two-Sample Test
  val y = Array.fill(1000)(Random.nextGaussian())
  val test2 = kstest(x, y)
  println(s"P value: ${test2.pvalue}")
}
