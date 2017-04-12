(ns clojure-matrix-bench.core
  (:use [clatrix.core :only [trace i]]))
 
(defn- my-main []
  (let [n 3000
        m (rand n n)]
    (trace (* m (i m)))))
 
(defn -main []
  (print (time my-main)))
