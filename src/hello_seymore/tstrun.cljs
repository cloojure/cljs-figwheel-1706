(ns ^:figwheel-load  hello-seymore.tstrun
  (:require [cljs.test :refer-macros [deftest is run-tests run-all-tests]])
)

(enable-console-print!)

(defn run-all-tests []
  (run-tests 
    'hello-seymore.tests
  ))
