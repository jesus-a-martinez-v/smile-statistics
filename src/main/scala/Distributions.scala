import smile.stat.distribution.ExponentialDistribution

object Distributions extends App {
  val e = new ExponentialDistribution(1.0)

  println(s"Created distribution: $e")
  println(s"Mean: ${e.mean}")
  println(s"Variance: ${e.`var`}")
  println(s"Standard Deviation: ${e.sd}")
  println(s"Entropy: ${e.entropy}")
  println(s"Generated random number: ${e.rand()}")
  println(s"PDF: ${e.p(2.0)}")
  println(s"CDF: ${e.cdf(2.0)}")
  println(s"Quantile: ${e.quantile(0.1)}")
  println(s"Log Likelihood: ${e.logLikelihood(Array(1.0, 1.1, 0.9, 1.5))}")

  // We can also estimate a distribution from given data
  val estimatedDistribution = new ExponentialDistribution(Array(1.0, 1.1, 0.9, 1.5, 1.8, 1.9, 2.0, 0.5))
  println(s"Estimated distribution: $estimatedDistribution")
}
