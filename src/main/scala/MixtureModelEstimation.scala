import smile.stat.distribution._

object MixtureModelEstimation extends App {
  // This is the actual mixture distribution we're generating data from
  val gaussianDistribution = new GaussianDistribution(-2.0, 1.0)
  val exponentialDistribution = new ExponentialDistribution(0.8)
  val gammaDistribution = new GammaDistribution(2.0, 3.0)

  // Generate sample data, selecting 500 member from each distribution.
  val sampleData =
    Array.fill(500)(gaussianDistribution.rand()) ++
    Array.fill(500)(exponentialDistribution.rand()) ++
    Array.fill(500)(gammaDistribution.rand())

  // Define the initial guess of the components in the mixture model.
  val gaussianInitialGuess = new Mixture.Component(0.3, new GaussianDistribution(0.0, 1.0))
  val exponentialInitialGuess = new Mixture.Component(0.3, new ExponentialDistribution(1.0))
  val gammaInitialGuess = new Mixture.Component(0.4, new GammaDistribution(1.0, 2.0))

  import collection.JavaConverters._

  // Estimate the model
  val mixtureMembers = List(gaussianInitialGuess, exponentialInitialGuess, gammaInitialGuess).asJava
  val mixture = new ExponentialFamilyMixture(mixtureMembers, sampleData)
  println(s"Estimated model: $mixture")
}
