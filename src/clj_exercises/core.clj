(ns clj-exercises.core
  (:gen-class))

(def cards
  [ {:name "Ace", :suite "spade", :color :black},
    {:name "King", :suite "spade", :color :black},
    {:name "Queen", :suite "spade", :color :black},
    {:name "Jack", :suite "spade", :color :black},
    {:name "10", :suite "spade", :color :black},
    {:name "9", :suite "spade", :color :black},
    {:name "8", :suite "spade", :color :black},
    {:name "7", :suite "spade", :color :black},
    {:name "6", :suite "spade", :color :black},
    {:name "5", :suite "spade", :color :black},
    {:name "4", :suite "spade", :color :black},
    {:name "3", :suite "spade", :color :black},
    {:name "2", :suite "spade", :color :black},
    {:name "Ace", :suite "heart", :color :red},
    {:name "King", :suite "heart", :color :red},
    {:name "Queen", :suite "heart", :color :red},
    {:name "Jack", :suite "heart", :color :red},
    {:name "10", :suite "heart", :color :red},
    {:name "9", :suite "heart", :color :red},
    {:name "8", :suite "heart", :color :red},
    {:name "7", :suite "heart", :color :red},
    {:name "6", :suite "heart", :color :red},
    {:name "5", :suite "heart", :color :red},
    {:name "4", :suite "heart", :color :red},
    {:name "3", :suite "heart", :color :red},
    {:name "2", :suite "heart", :color :red},
    {:name "Ace", :suite "club", :color :black},
    {:name "King", :suite "club", :color :black},
    {:name "Queen", :suite "club", :color :black},
    {:name "Jack", :suite "club", :color :black},
    {:name "10", :suite "club", :color :black},
    {:name "9", :suite "club", :color :black},
    {:name "8", :suite "club", :color :black},
    {:name "7", :suite "club", :color :black},
    {:name "6", :suite "club", :color :black},
    {:name "5", :suite "club", :color :black},
    {:name "4", :suite "club", :color :black},
    {:name "3", :suite "club", :color :black},
    {:name "2", :suite "club", :color :black},
    {:name "Ace", :suite "diamond", :color :red},
    {:name "King", :suite "diamond", :color :red},
    {:name "Queen", :suite "diamond", :color :red},
    {:name "Jack", :suite "diamond", :color :red},
    {:name "10", :suite "diamond", :color :red},
    {:name "9", :suite "diamond", :color :red},
    {:name "8", :suite "diamond", :color :red},
    {:name "7", :suite "diamond", :color :red},
    {:name "6", :suite "diamond", :color :red},
    {:name "5", :suite "diamond", :color :red},
    {:name "4", :suite "diamond", :color :red},
    {:name "3", :suite "diamond", :color :red},
    {:name "2", :suite "diamond", :color :red}
  ])

(defn available-suites [suite]
  (into [] (filter #(not (= suite %)) ["diamond", "club", "heart", "spade"])))

(defn pick-suite [suite]
  (let [suites (available-suites suite)]
    (get suites (rand-int 3))))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (get (first cards) :name))
  (println (available-suites "diamond"))
  (println (pick-suite "diamond"))
  (println "Hello, World!"))

