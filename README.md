# experiment

A Leiningen template for creating a project that will contain a single file. It
pull pull in midje for testing but otherwise leave you with as small a project
as possible.

Suitable for hello worlding a new library or quickly validating an idea.

## Usage

No installation is needed. Just run:

    lein new experiment hello-world

You will have generated:

```clojure
; hello_world.clj
(ns hello-world
  (:require [midje.sweet :refer :all]))

(fact (+ 1 1) => 2)

; project.clj
(defproject hello-world "0.1.0-SNAPSHOT"
  :description "FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"} 
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [midje "1.5.1"]]
  :source-paths ["."])
```

## License

Copyright © 2013 Logan Campbell

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.


[![Bitdeli Badge](https://d2weczhvl823v0.cloudfront.net/logaan/experiment/trend.png)](https://bitdeli.com/free "Bitdeli Badge")

