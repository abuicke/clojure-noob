(ns clojure-noob.core
  (:gen-class))

(defn two-params
  [x y]
  (str "Two parameters! That's nothing! Pah! I will smoosh them "
       "together to spite you! " x y))

(defn print-pair
  [[x y]]
  (format "(%d, %d)" x y))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (print (print-pair [4 5])))
