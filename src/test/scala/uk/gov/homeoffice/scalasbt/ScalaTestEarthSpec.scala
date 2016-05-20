package uk.gov.homeoffice.scalasbt

import org.scalatest._
import org.scalatest.Matchers._

class ScalaTestEarthSpec extends WordSpec {

  "The Earth" should {
    "be flat" in {
      Earth.isFlat shouldBe true
    }
  }
}
