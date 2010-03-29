(ns boids.rules.total
  (:use boids.spatial-vector
	boids.rules.center-of-mass
	boids.rules.velocity
	boids.rules.avoidance
	boids.rules.bounds))

(def center-of-mass-adjustment-factor 0.01)
(def velocity-adjustment-factor 1.0)
(def avoidance-adjustment-factor 1.0)
(def bounds-adjustment-factor 1.0)

(defn total-adjustment [the-boid bspace]
  (let [c (sv-mul center-of-mass-adjustment-factor (center-of-mass-adjustment the-boid bspace))
	v (sv-mul velocity-adjustment-factor (velocity-adjustment the-boid bspace))
	a (sv-mul avoidance-adjustment-factor (avoidance-adjustment the-boid bspace))
	b (sv-mul bounds-adjustment-factor (bounds-adjustment the-boid bspace))]
    (sv-sum c v a b)))
