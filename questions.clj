"works"
(= (0 1 2 3 4 5)
   (for [x (range 6)] x))

"doesn't why"
(= '(0 1 2 3 4 5)
   (for [x (range 6)] x))
