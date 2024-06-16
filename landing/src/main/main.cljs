(ns main
  (:require [reagent.core :as r]
            [reagent.dom :as dom]))

(defn root-node []
  [:div "hi mom"])

(defn ^:export init []
  (dom/render [root-node]
            (.getElementById js/document "app")))
