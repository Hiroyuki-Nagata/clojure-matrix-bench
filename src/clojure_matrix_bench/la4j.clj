(ns clojure-matrix-bench.la4j
  (:import
   (java.util Random)
   (org.la4j.matrix DenseMatrix)
   (org.la4j.inversion GaussJordanInverter)))

;;  30 x   30 => Elapsed time:    85.680574 msecs
;; 300 x  300 => Elapsed time: 50994.100823 msecs
;;1000 x 1000 => Over 5 minutes...
;;
(defn test-main []
  (let [n 1000
        m (DenseMatrix/random n n (new Random))
        i (new GaussJordanInverter m)]

    (. i inverse)

    ))

(defn testing []
  (time (test-main)))
