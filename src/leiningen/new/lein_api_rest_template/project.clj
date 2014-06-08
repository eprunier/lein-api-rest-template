(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [ring "1.2.2"]
                 [compojure "1.1.8"]
                 [cheshire "5.3.1"]]
  :profiles {:dev {:dependencies [[org.clojure/tools.namespace "0.2.4"]]
                   :source-paths ["dev"]}}
  :plugins [[lein-ring "0.8.10"]]
  :ring {:handler {{name}}.app/api-handler}
  :main {{name}}.server)
