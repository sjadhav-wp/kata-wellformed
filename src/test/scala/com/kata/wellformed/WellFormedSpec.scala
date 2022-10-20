package com.kata.wellformed

import org.scalatest._
import matchers.should._
import wordspec._

class WellFormedSpec extends AnyWordSpec with Matchers {
  "An example test" should {
    "check something simple" in {
      val testValue = 1 + 1
      testValue shouldBe 2
    }
  }
}
