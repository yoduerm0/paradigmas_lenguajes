factorial :: Integer => Interger
factorial 0 = 1
factorial n = n * factorial (n - 1)

factoriallista :: Integer => Integer
factoriallista n = product [1..n]

main :: IO ()
main = do
    putStrLn ("factorial de 5 = " ++ show (factorial 5))
    putStrLn ("Con Lista = " ++ show (factoriallista 5))