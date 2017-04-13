(ns clojure-matrix-bench.core
  (:gen-class main)
  (:require [clojure-matrix-bench.clatrix :as clatrix]
            [clojure-matrix-bench.la4j :as la4j]
            [clojure-matrix-bench.ojalgo :as ojalgo]))

(defn -main [& {:as args}]
  ;;(println "start => clatrix 0.5.0")
  ;;(clatrix/testing)
  (println "start => la4j 0.6.0")
  (la4j/testing)
  ;;(println "start => ojalgo 42.0.0, this may take a while")
  ;;(ojalgo/testing)
  )
