(ns clojure-matrix-bench.clatrix
  (:refer-clojure :exclude [get set map-indexed map rand vector? + - * pp vector])
  (:use [clatrix.core]))

;; 1. "n" = 3000
;; 2. "m" will be a 3000x3000 matrix filled with randomized numbers like following:
;;
;; 6.66e-01  6.93e-01  7.45e-01  .  7.60e-01  3.33e-01  3.24e-01
;; 7.16e-01  2.01e-01  3.24e-01  .  7.45e-01  8.60e-02  8.08e-01
;; 1.50e-01  1.49e-02  9.72e-01  .  4.00e-01  4.02e-01  7.36e-01
;; ...
;; 6.62e-01  6.84e-01  9.67e-01  .  7.40e-01  4.63e-01  3.78e-01
;; 8.24e-01  6.66e-01  1.72e-01  .  8.44e-01  2.46e-01  9.58e-01
;; 7.85e-02  3.04e-01  1.32e-01  .  3.81e-01  3.31e-01  6.54e-01
;;
;; 3. Create inverted matrix by some function
;; 4. Times original "m" with above inverted matrix
;; 5. Finally execute trace of that in order to compute sum of its diagonal elements
(defn test-main []
  (let [n 3000
        m (rand n n)]
    (trace (* m (i m)))))

(defn testing []
  (time (test-main)))
