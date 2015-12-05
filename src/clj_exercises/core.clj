(ns clj-exercises.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!")
  (println (first args)))

(def dict {})

(defn double-num [n]
  (* n 2))

(defn square-num [n]
  (* n n))
