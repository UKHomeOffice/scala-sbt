package uk.gov.homeoffice.scalasbt

import org.specs2.mutable.Specification

class Specs2EarthSpec extends Specification {

  "The Earth" should {
    "be flat" in {
      Earth.isFlat mustEqual true
    }
  }
}
