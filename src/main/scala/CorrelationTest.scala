import smile.math.{kendalltest, pearsontest, spearmantest}
import smile.stat.distribution.GaussianDistribution

import scala.util.Random

object CorrelationTest extends App {
  val gaussianDistribution = new GaussianDistribution(5.0, 10)
  val x = Array.fill(1000)(gaussianDistribution.rand())
  val y = Array.fill(1000)(gaussianDistribution.rand())

  val test = pearsontest(x, y)
  println(s"P value: ${test.pvalue}")

  val x2 = Array.fill(1000)(Random.nextDouble())
  val y2 = Array.fill(1000)(Random.nextDouble())

  val test2 = spearmantest(x2, y2)
  println(s"P value: ${test2.pvalue}")

  val test3 = kendalltest(x2, y2)
  println(s"P value: ${test3.pvalue}")

}
