(defproject find-keywords "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/tools.cli "0.3.3"]
                 [com.novemberain/monger "3.0.1"]
                 [org.slf4j/slf4j-nop "1.7.12"]
                 [image-lib "0.1.0-SNAPSHOT"]]
  :main ^:skip-aot find-keywords.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}}
  :bin {:name "find-images"
        :bin-path "~/bin"})
