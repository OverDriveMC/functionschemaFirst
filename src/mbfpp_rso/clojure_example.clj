(ns mbfpp-rso-clojure-example)

;Scope 1-Top Level
(def foo "first foo")
(def bar "first bar")
(def baz "first baz")
;Scope 2 - Function Arguments
(defn make-printer [foo bar]
  (fn[]
    (let [foo "third foo"] ;Scope 3 - Let Statement
      (println foo)
      (println bar)
      (println baz)
      ))  
)  
(def a-printer(make-printer "second foo" "second bar"))

(a-printer)
