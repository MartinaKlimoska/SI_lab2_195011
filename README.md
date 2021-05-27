# SI_lab2_195011
![ControlFlowGraph](https://user-images.githubusercontent.com/82380946/119906236-1f650300-bf4e-11eb-9dbb-1ab05140972b.png)
2. Јазли на график
A	for (int i = 0; i < timesList.size(); i++) {
B	if (hr < 0 || hr > 24){
C	if (hr < 0){
D	throw new RuntimeException("The hours are smaller than the minimum");
E	throw new RuntimeException("The hours are grater than the maximum");
F	else if (hr < 24) {
G	if (min < 0 || min > 59)
H	throw new RuntimeException("The minutes are not valid!");
I	if (sec >= 0 && sec <= 59)
J	result.add(hr * 3600 + min * 60 + sec);
K	throw new RuntimeException("The seconds are not valid");
L	else if (hr == 24 && min == 0 && sec == 0) {
M	result.add(hr * 3600 + min * 60 + sec);
N	throw new RuntimeException("The time is greater than the maximum");
O	//if ends
P	return result;

3. Цикломатската комплексност за графот е 8.
Графот за функцијата има 25 ребра и 19 јазли.
Комплексноста се определува по формулата:
V(G) = E - N + 2
V(G) = 25 - 19 + 2 = 8
Исто така може и да се определи по бројот на предикатни јазли: P = 7
V(G) = P + 1 = 7 + 1 = 8

4. Multiple condition
6-if јазли, 4-if јазли со multiple condition

јазли:						тестови:
if (hr < 0 || hr > 24)
	TF 					Time(-4, 0, 0)
	FT					Time(26, 0, 0)
if (min < 0 || min > 59)
	TF					Time(0, -1, 0)
	FT					Time(0, 90, 0)
if (sec >= 0 && sec <= 59)
	TF					Time(1, 1, -20)
	FT					Time(1, 1, 70)
else if (hr == 24 && min == 0 && sec == 0)	
	TTT					Time(24, 0, 0)
	ТFT / TTF / TFF				Time(24, 1, 0) Time(24, 0, 6) Time(24, 1, 6)
//hr == 24 - always true

5. Every branch
6-if јазли, циклус
гранки за изминување: B-C, C-D, C-E, B-F, F-G, G-H, G-I, I-J, I-K, F-L, L-M, L-N, O-A, O-P

тестови:		гранки:
Time(-4, 0, 0)		A-B, B-C, C-D, D-O, O-P
Time(50, 0, 0)		C-E
Time(7, 63, 0)		B-F F-G G-H H-O
Time(0, 1, 1)		  G-I I-J J-O
Time(0, 0, 62)		I-K K-O
Time(24, 0, 0)		F-L L-M M-O
Time(24, 1, 1)		L-N N-O
