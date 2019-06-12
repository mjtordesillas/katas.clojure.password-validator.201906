(ns password-validator.core
  (:gen-class)
  (:require [clojure.string :refer :all]))

(defn- contains-number? [password]
  (some? (re-find #"[0-9]+" password)))

(defn contains-lowercase? [password]
  (some? (re-find #"[a-z]+" password)))

(defn contains-uppercase? [password]
  (some? (re-find #"[A-Z]+" password)))

(defn valid? [password]
  (and
    (>= (count password) 8)
    (includes? password "_")
    (contains-number? password)
    (contains-lowercase? password)
    (contains-uppercase? password)))