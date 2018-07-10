import smile.stat.distribution.{GaussianDistribution, KernelDensity}

object UnknownDistributionEstimation extends App {
  val gaussianDistribution = new GaussianDistribution(42, 24)

  val data = Array.fill(5000)(gaussianDistribution.rand())

  // Now, let's estimate the distribution based on the generated data, assuming we don't know it comes
  // from a Gaussian one.
  val k = new KernelDensity(data)

  println(s"Estimated p(1.0): ${k.p(1.0)}")
  println(s"Actual p(1.0): ${gaussianDistribution.p(1.0)}")
  println(s"Delta: ${math.abs(k.p(1.0) - gaussianDistribution.p(1.0))}")
}
