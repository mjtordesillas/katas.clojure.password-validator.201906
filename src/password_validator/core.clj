(ns password-validator.core
  (:gen-class))

(defn valid? [password]
  (>= (count password) 8))
