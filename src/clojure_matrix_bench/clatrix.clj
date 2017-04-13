(ns clojure-matrix-bench.clatrix
  (:refer-clojure :exclude [get set map-indexed map rand vector? + - * pp vector])
  (:use [clatrix.core]))

(defn test-main []
  (let [n 3000
        m (rand n n)]
    (trace (* m (i m)))))

(defn testing []
  (time (test-main)))
