(ns password-validator.core
  (:gen-class)
  (:require [clojure.string :refer :all]))

(defn- long-enough? [password]
  (>= (count password) 8))

(defn- contains-underscore? [password]
  (includes? password "_"))

(defn- contains-number? [password]
  (some? (re-find #"[0-9]+" password)))

(defn- contains-lowercase? [password]
  (some? (re-find #"[a-z]+" password)))

(defn- contains-uppercase? [password]
  (some? (re-find #"[A-Z]+" password)))

(defn valid? [password]
  (and
    (long-enough? password)
    (contains-underscore? password)
    (contains-number? password)
    (contains-lowercase? password)
    (contains-uppercase? password)))