(ns function-interface.core)

(def p1 {:first-name "Michael"
         :last-name "Bevilacqua"})
 
                                
(def p2 {:first-name "Pedro"
         :last-name  "Vasquez"})

(def p3 {:first-name "Robert"
         :last-name "Aarons"})

(def people[p3 p2 p1])

;现在我们创建了一个匿名的排序函数，并将它与想要排序的人员数据一起传递给sort函数
(sort (fn[p1 p2]
      (compare (p1 :first-name)(p2 :first-name))) people)