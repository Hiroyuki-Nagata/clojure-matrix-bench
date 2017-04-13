(ns clojure-matrix-bench.ojalgo
  (:import (org.ojalgo.matrix BigMatrix BasicMatrix)))

(defn test-main []
  (let [n 3000
        f (. BigMatrix FACTORY)
        b (. f getBuilder n n)
        m (. b build)]
    ;; (println (. m countColumns))
    ;; (println (. m countRows))
    ;; (println m)
    ))

(defn testing []
  (time (test-main)))
