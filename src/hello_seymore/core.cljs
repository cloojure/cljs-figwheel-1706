(ns hello-seymore.core
  (:require [sablono.core :as sab]
            [hello-seymore.components :refer [like-seymore]]
  ))

(def app-state (atom { :likes 999 }))

(defn render! []
  (.render js/ReactDOM
           (like-seymore app-state)
           (.getElementById js/document "app")))

(add-watch app-state :on-change (fn [_ _ _ _] (render!)))

(render!)

