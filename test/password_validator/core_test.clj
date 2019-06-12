(ns password-validator.core-test
  (:require [clojure.test :refer :all]
            [password-validator.core :refer :all]))

(deftest password-validator
  (testing "Valid password"
    (is (= true (valid? "Aa8_nnnn")))))
