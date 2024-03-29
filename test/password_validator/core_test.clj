(ns password-validator.core-test
  (:require [clojure.test :refer :all]
            [password-validator.core :refer :all]))

(deftest password-validator
  (testing "Valid password"
    (is (= true (valid? "Aa8_nnnn"))))
  (testing "Passwords with less than 8 characters are not valid"
    (is (= false (valid? "Aa8_nnn"))))
  (testing "Passwords without an underscore are not valid"
    (is (= false (valid? "Aa8nnnnn"))))
  (testing "Passwords without a number are not valid"
    (is (= false (valid? "Aa_nnnnn"))))
  (testing "Passwords without a lowercase are not valid"
    (is (= false (valid? "AA8_NNNN"))))
  (testing "Passwords without an uppercase are not valid"
    (is (= false (valid? "aa8_nnnn")))))
