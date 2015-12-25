(ns clj-exercises.core
  (:gen-class))


(def card-names
  ["Ace" "King" "Queen" "Jack" "10" "9" "8" "7" "6" "5" "4" "3" "2"])

(def card-suites ["diamond" "spade" "heart" "club"])

(def cards
  (shuffle [
    {:name "Ace", :suite "spade", :color :black :faced-up false},
    {:name "King", :suite "spade", :color :black :faced-up false},
    {:name "Queen", :suite "spade", :color :black :faced-up false},
    {:name "Jack", :suite "spade", :color :black :faced-up false},
    {:name "10", :suite "spade", :color :black :faced-up false},
    {:name "9", :suite "spade", :color :black :faced-up false},
    {:name "8", :suite "spade", :color :black :faced-up false},
    {:name "7", :suite "spade", :color :black :faced-up false},
    {:name "6", :suite "spade", :color :black :faced-up false},
    {:name "5", :suite "spade", :color :black :faced-up false},
    {:name "4", :suite "spade", :color :black :faced-up false},
    {:name "3", :suite "spade", :color :black :faced-up false},
    {:name "2", :suite "spade", :color :black :faced-up false},
    {:name "Ace", :suite "heart", :color :red :faced-up false},
    {:name "King", :suite "heart", :color :red :faced-up false},
    {:name "Queen", :suite "heart", :color :red :faced-up false},
    {:name "Jack", :suite "heart", :color :red :faced-up false},
    {:name "10", :suite "heart", :color :red :faced-up false},
    {:name "9", :suite "heart", :color :red :faced-up false},
    {:name "8", :suite "heart", :color :red :faced-up false},
    {:name "7", :suite "heart", :color :red :faced-up false},
    {:name "6", :suite "heart", :color :red :faced-up false},
    {:name "5", :suite "heart", :color :red :faced-up false},
    {:name "4", :suite "heart", :color :red :faced-up false},
    {:name "3", :suite "heart", :color :red :faced-up false},
    {:name "2", :suite "heart", :color :red :faced-up false},
    {:name "Ace", :suite "club", :color :black :faced-up false},
    {:name "King", :suite "club", :color :black :faced-up false},
    {:name "Queen", :suite "club", :color :black :faced-up false},
    {:name "Jack", :suite "club", :color :black :faced-up false},
    {:name "10", :suite "club", :color :black :faced-up false},
    {:name "9", :suite "club", :color :black :faced-up false},
    {:name "8", :suite "club", :color :black :faced-up false},
    {:name "7", :suite "club", :color :black :faced-up false},
    {:name "6", :suite "club", :color :black :faced-up false},
    {:name "5", :suite "club", :color :black :faced-up false},
    {:name "4", :suite "club", :color :black :faced-up false},
    {:name "3", :suite "club", :color :black :faced-up false},
    {:name "2", :suite "club", :color :black :faced-up false},
    {:name "Ace", :suite "diamond", :color :red :faced-up false},
    {:name "King", :suite "diamond", :color :red :faced-up false},
    {:name "Queen", :suite "diamond", :color :red :faced-up false},
    {:name "Jack", :suite "diamond", :color :red :faced-up false},
    {:name "10", :suite "diamond", :color :red :faced-up false},
    {:name "9", :suite "diamond", :color :red :faced-up false},
    {:name "8", :suite "diamond", :color :red :faced-up false},
    {:name "7", :suite "diamond", :color :red :faced-up false},
    {:name "6", :suite "diamond", :color :red :faced-up false},
    {:name "5", :suite "diamond", :color :red :faced-up false},
    {:name "4", :suite "diamond", :color :red :faced-up false},
    {:name "3", :suite "diamond", :color :red :faced-up false},
    {:name "2", :suite "diamond", :color :red}
  ]))

(defn available-suites [suite]
  (into [] (filter #(not (= suite %)) card-suites)))

(defn pick-suite [suite]
  (let [suites (available-suites suite)]
    (get suites (rand-int 3))))

(defn make-tableau-column [card-set]
  (concat
    (conj []
      (assoc (first card-set) :faced-up true))
    (seq (rest card-set))))

(defn create-tableau [tableau-cols stock]
  (if (< (count tableau-cols) 7)
    (let [card-count (inc (count tableau-cols))]
      (create-tableau
        (conj tableau-cols
          (into []
            (make-tableau-column
              (take card-count stock))))
        (drop card-count stock)))
    tableau-cols))

(defn play-solitaire []
  (let [stock       (drop 28 cards)
        tableau     (take 28 cards)
        waste       []
        foundations []]
        ))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (get (first cards) :name))
  (println (available-suites "diamond"))
  (println (pick-suite "diamond"))
  (println "Hello, World!"))

