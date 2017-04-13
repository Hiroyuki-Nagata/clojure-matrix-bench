# clojure-matrix-bench

Comparing libraries for matrix computation

## Usage

```
$ lein check && lein run
```

## Explanation

* English
** [Trace (linear algebra)](https://en.wikipedia.org/wiki/Trace_(linear_algebra))

```
1. "n" = 3000
2. "m" will be a 3000x3000 matrix filled with randomized numbers like following:

6.66e-01  6.93e-01  7.45e-01  .  7.60e-01  3.33e-01  3.24e-01
7.16e-01  2.01e-01  3.24e-01  .  7.45e-01  8.60e-02  8.08e-01
1.50e-01  1.49e-02  9.72e-01  .  4.00e-01  4.02e-01  7.36e-01
...
6.62e-01  6.84e-01  9.67e-01  .  7.40e-01  4.63e-01  3.78e-01
8.24e-01  6.66e-01  1.72e-01  .  8.44e-01  2.46e-01  9.58e-01
7.85e-02  3.04e-01  1.32e-01  .  3.81e-01  3.31e-01  6.54e-01

3. Create inverted matrix by some function
4. Times original "m" with above inverted matrix
5. Finally execute trace of that in order to compute sum of its diagonal elements
```

* 日本語
** [跡 （線型代数学）](https://ja.wikipedia.org/wiki/%E8%B7%A1_(%E7%B7%9A%E5%9E%8B%E4%BB%A3%E6%95%B0%E5%AD%A6))

```
1. "n" = 3000 とおく
2. 一辺3000の行列 "m" を作成する、中身は以下のような一様乱数で埋める：

6.66e-01  6.93e-01  7.45e-01  .  7.60e-01  3.33e-01  3.24e-01
7.16e-01  2.01e-01  3.24e-01  .  7.45e-01  8.60e-02  8.08e-01
1.50e-01  1.49e-02  9.72e-01  .  4.00e-01  4.02e-01  7.36e-01
...
6.62e-01  6.84e-01  9.67e-01  .  7.40e-01  4.63e-01  3.78e-01
8.24e-01  6.66e-01  1.72e-01  .  8.44e-01  2.46e-01  9.58e-01
7.85e-02  3.04e-01  1.32e-01  .  3.81e-01  3.31e-01  6.54e-01

3. 適当な方法で逆行列を作成する
4. 3.で作成した行列と"m"の積を求める
5. 最後に出来上がった行列の跡を求めて終わり
```

## License

Copyright Hiroyuki Nagata © 2017 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
