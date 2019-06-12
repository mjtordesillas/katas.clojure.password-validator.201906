(ns password-validator.core
  (:gen-class)
  (:require [clojure.string :refer :all]))

(defn valid? [password]
  (and
    (>= (count password) 8)
    (includes? password "_")
    (some? (re-find #"[0-9]+" password))))