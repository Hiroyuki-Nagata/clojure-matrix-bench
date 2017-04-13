(ns clojure-matrix-bench.core
  (:gen-class main)
  (:require [clojure-matrix-bench.clatrix :as clatrix]))

(defn -main [& {:as args}]
  (println "start => clatrix 0.5.0")
  (clatrix/testing))
