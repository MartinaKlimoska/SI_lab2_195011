## Цикломатска комплексност

Цикломатската комплексност за графот е 8.
Графот за функцијата има 25 ребра и 19 јазли.
Комплексноста се определува по формулата:
V(G) = E - N + 2
V(G) = 25 - 19 + 2 = 8
Исто така може и да се определи по бројот на предикатни јазли: P = 7
V(G) = P + 1 = 7 + 1 = 8


## Multiple condition

6-if јазли, 4-if јазли со multiple condition

|conditions|tests|
|-----|-----|
| if (hr < 0 \|\| hr > 24) | Time(-4, 0, 0) Time(26, 0, 0) |
| if (min < 0 \|\| min > 59) | Time(0, -1, 0)	Time(0, 90, 0) |
| if (sec >= 0 && sec <= 59) | Time(1, 1, -20) Time(1, 1, 70) |
| if (hr == 24 && min == 0 && sec == 0) | Time(24, 0, 0) Time(24, 1, 0) Time(24, 0, 6) Time(24, 1, 6) |

## Every branch

6-if јазли, циклус
гранки за изминување: B-C, C-D, C-E, B-F, F-G, G-H, G-I, I-J, I-K, F-L, L-M, L-N, O-A, O-P

|tests|branches|
|-----|-----|
|Time(-4, 0, 0)|A-B, B-C, C-D, D-O, O-P|
|Time(50, 0, 0)	|C-E|
|Time(7, 63, 0)	|B-F, F-G, G-H, H-O|
|Time(0, 1, 1)	|G-I, I-J, J-O|
|Time(0, 0, 62)	|I-K, K-O|
|Time(24, 0, 0)	|F-L, L-M, M-O|
|Time(24, 1, 1)	|L-N, N-O|

