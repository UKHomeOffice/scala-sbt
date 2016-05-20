package uk.gov.homeoffice.scalasbt

abstract class Planet {
  def isFlat: Boolean
}

object Earth extends Planet {
  override def isFlat = true
}