(ns clojure-matrix-bench.core
  (:gen-class main)
  (:require [clojure-matrix-bench.clatrix :as clatrix]
            [clojure-matrix-bench.ojalgo :as ojalgo]))

(defn -main [& {:as args}]
  (println "start => clatrix 0.5.0")
  (clatrix/testing)
  (println "start => ojalgo 42.0.0")
  (ojalgo/testing)
  )
