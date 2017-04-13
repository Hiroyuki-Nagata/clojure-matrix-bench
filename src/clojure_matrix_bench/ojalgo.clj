(ns clojure-matrix-bench.ojalgo
  (:import (org.ojalgo.matrix BigMatrix)
           (org.ojalgo.random Uniform)))

(defn make-random-matrix ^BigMatrix [^Integer rows ^Integer cols]
  (let [f (. BigMatrix FACTORY)]
    (. f makeFilled rows cols (new Uniform 0 1))))

(defn test-main []
  (let [n 3000
        f (. BigMatrix FACTORY)
        m (make-random-matrix n n)
        t ^BigMatrix (. m multiply (. m invert))]
    (. t getTrace)))

(defn testing []
  (time (test-main)))
