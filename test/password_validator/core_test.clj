(ns password-validator.core-test
  (:require [clojure.test :refer :all]
            [password-validator.core :refer :all]))

(deftest password-validator
  (testing "Valid password"
    (is (= true (valid? "Aa8_nnnn"))))
  (testing "Passwords with less than 8 characters are not valid"
    (is (= false (valid? "Aa8_nnn"))))
  (testing "Passwords without an underscore are not valid"
    (is (= false (valid? "Aa8nnnnn")))))
