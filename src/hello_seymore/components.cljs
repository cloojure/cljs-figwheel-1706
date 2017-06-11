(ns hello-seymore.components
  (:require [sablono.core :as sab]
            [clojure.string :as str]
            ))

(defn like-seymore [data]
  (sab/html [:div
             [:h1 "Seymore's popularity: " (:likes @data)]
             [:div [:a {:href "#"
                        :onClick #(swap! data update-in [:likes] inc)}
                    "Thumbs up"]]
             [:pre (str/trim "    xx
1. 
  a
  b
2
  a
  b
    i
    ii" ) ]] ))
