(ns find-keywords.core
  (:require [clojure.tools.cli :refer :all]
            [image-lib.core    :refer :all])
  (:gen-class))

(def cli-options
  [["-c" "--count" "Counts the results"]
   ["-d" "--database DATABASE" "specifies database to use"
    :default "soulflyer"]
   ["-k" "--keyword-collection KEYWORD-COLLECTION" "specifies the keyword collection"
    :default "keywords"]
   ["-h" "--help"]])

(defn -main
  [& args]
  (let [{:keys [options arguments errors summary]} (parse-opts args cli-options)
        kw (find-sub-keywords
            (:database options)
            (:keyword-collection options) (first arguments))]

    (cond
      (:help options)
      (println (str "Usage:\nfind-keywords [options] keyword\n\nvoptions:\n" summary))

      (:count options)
      (println (count kw))

      :else
      (doall
       (map println kw)))))
