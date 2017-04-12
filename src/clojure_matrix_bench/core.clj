(ns clojure-matrix-bench.core
  (:refer-clojure :exclude [get set map-indexed map rand vector? + - * pp vector])
  (:use [clatrix.core]))
 
(defn- my-main []
  (let [n 3000
        m (rand n n)]
    (trace (* m (i m)))))
 
(defn -main []
  (print (time (my-main))))
