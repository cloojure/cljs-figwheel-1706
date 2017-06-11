(ns ^:figwheel-load  hello-seymore.tests
  (:require [cljs.test :refer-macros [deftest is run-tests run-all-tests]])
)

(deftest t-demo
  (is (= 5 (+ 2 3)))
  (is (= 5 (+ 2 93)))
  )
