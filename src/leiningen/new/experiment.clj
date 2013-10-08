(ns leiningen.new.experiment
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "experiment"))

(defn experiment
  "FIXME: write documentation"
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (main/info "Generating fresh 'lein new' experiment project.")
    (->files data
             ["project.clj" (render "project.clj" data)]
             ["{{sanitized}}.clj" (render "main.clj" data)])))
