(ns boids.rules.velocity-test
  (:use clojure.test 
	boids.boid
	boids.boid-test
	boids.rules.velocity
	boids.spatial-vector))

(deftest test-should-match-velocities-of-other-boids
  (is (= (struct-map spatial-vector :x 3.3333333333333335 :y 2.0) (velocity-adjustment b2 initial-boid-list))))