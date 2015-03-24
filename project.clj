(defproject com.cemerick/piggieback "0.2.0-SNAPSHOT"
  :description "Adding support for running ClojureScript REPLs over nREPL."
  :url "http://github.com/cemerick/piggieback"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/tools.nrepl "0.2.9"]
                 [org.clojure/clojurescript "0.0-3149"]]
  
  :repl-options {:nrepl-middleware [cemerick.piggieback/wrap-cljs-repl]}
  
  :deploy-repositories {"releases" {:url "https://oss.sonatype.org/service/local/staging/deploy/maven2/" :creds :gpg}
                        "snapshots" {:url "https://oss.sonatype.org/content/repositories/snapshots/" :creds :gpg}}

  :aliases  {"all" ["with-profile" "dev"]}

  ; why do I need to repeat this to get the right rev in `lein repl`? :-/
  :profiles {:dev {:dependencies [[org.clojure/tools.nrepl "0.2.9"]]}}
  
  ;;maven central requirements
  :scm {:url "git@github.com:cemerick/piggieback.git"}
  :pom-addition [:developers [:developer
                              [:name "Chas Emerick"]
                              [:url "http://cemerick.com"]
                              [:email "chas@cemerick.com"]
                              [:timezone "-5"]]])
