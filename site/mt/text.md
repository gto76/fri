
	 __  __ _____ 
	|  \/  |_   _|
	| |\/| | | |  
	| |  | | | |  
	|_|  |_| |_|  
             
=========================
Multimedijske Tehnologije
=========================

>[Učilnica](https://ucilnica.fri.uni-lj.si/course/view.php?id=61)  
>[Urnik](https://urnik.fri.uni-lj.si/timetable/2014_2015_zimski/allocations?subject=63734)  

>[Matija Marlot](http://www.fri.uni-lj.si/si/matija-marolt)  
>[Matevž Pesek](http://www.fri.uni-lj.si/si/matevz-pesek/)  

```timetable
 PON ; 13-16 ; P03  ; predavanja 
 SRE ; 14    ;      ; govorilne MM 
     ;  8-10 ; PR16 ; vaje
     ; 14-16 ; PR07 ; vaje
```

>Letos stvari bolj projektno orientirane, vaje bojo potekale bolj konzultacijsko.

>Trije seminarji. Text/audio/video > vse vrste podatkov bomo probali zvizualizirat.

>Vsebina vaj:

>* Implementacije
* Spoznavanje orodij
* Konzultacije o seminarjih

>Ni več kolokvijev.

>Ocena 50% izpit / 50% seminarji, obadva dela morata biti ocenjena pozitivno.

>Vsak seminar ocenjen z do 18 tockami.

VAJE
----
```timetable
22.10;;;tekst, obratni idex, TF, IDF  
29.10;;;odpadejo  
10.11;;;<strong>predstavitev 1. seminarja</strong> - na predavanjih
5.11;;;zvok - osnove Matlaba  
12.11;;;zvok - Essentia  
19.11;;;konzultacije - seminar (essentia)  
26.11;;;Chroma/MIR toolbox  
3.12;;;konzultacije - seminar (vizualizacije)  
8.12;;;<strong>predstavitev 2. seminarja</strong>   - na predavanjih
10.12;;;manipulacije s slikami (Matlab)  
17.12;;;OpenCV - how-to  
24.12;;;OpenCV - konzultacije  
31.12;;;praznik  
8.1;;;transformacije (Matlab)    
15.1;;;transformacije (Matlab) + konzultacije pred oddajo seminarja  
19.1;;;<strong>predstavitev 3. seminarja</strong> - na predavanjih  
```
  


SEMINARJI
---------

### Text
>XML slovenskih ljudskih pesmi... -> vizualizacije
kup meta podatkov

>1. Otsranit stop words
2. Term frequency/inverse term frequency
3. Korenske oblike besed.
	- porter - algoritem za anglescino
	- obeliks - bol konkreten sistem (uporabite ga)
4. Izračun podobnosti dokumentov 
	- TF/IDF
	- bonus LSA/LDA
5. Interakcija - vpišeš - dobiš top 10 doxov (minimum)
6. Textovno drevo - hierarhical clustering
7. Podobnostna matrika
8. Kako se je po letih zbiral pesmi
9. d3-js, j-query

>10.11 - predstavitev na predavanjih

### Audio
* Zbirka industrijskih zvokov, z metapodatki -> zvizualizirat zbirko
* Essentia - računanje značilk (izbereš feature)
* Dobrodošle bolj art vizualizacije
* Dodat slikce glede na metapodatke
* Izračunamo offline (~100 zvokov, zaprta množica)

>8.12 - predstavitev na predavanjih

### Video
* Face tracking
* OpenCV
* Podobnosti med kadri
* DB - data driven documents

>19.1 - predstavitev na predavanjih


IZPIT
-----

### 2012

Tole se je pojavilo lani na izpitu, tako da bodo verjetno na kolokviju tudi podobna vprašanja in bolj podrobna, ker je manj snovi.

Vprašanja na izpitu 2011:
* Lematizacija
* bilinearna interpolacija
* mpeg-1
* kje pride do izgube pri kodiranju jpeg
* tf-idf
* kaj je ideja efektov, ki uporabljajo zakasnitve
* kaj je gama korekcija, kje se uporablja
* kako lahko kodiramo z mediano
* kako lahko spremenimo višino signala z vzorci...
* kaj so I, B P slike pri mpeg-1 kodiranju
* kater barvni prostor zajema vse barve, ki jih vidimo in za kaj se uporablja
* kaj lahko poveš o magnitudi ... vzorca (3 poševne bele pikce v črnem kvadratu)
* kaj so vizualne besede
* kako bi uporabil beseda1 AND beseda2 pri obrnjenem indeksiranju.....
* Levensteinova razdalja
* še neki o mpeg-1
* kaj je vektor premika/razdalj 


* lemantizacija besed
* Zakaj je pri videu YUV in YcbCr
* Kako amplituda vpliva na glasnost
* Najvecja izguba pri JPEG kodiranju (kater korak)
* Kaj je identifikacija avdio posnetka
* tb-itf
* Zakaj se uporablja fitriranje z mediano
* Gama korekcija
* Magnituta slikca s 3emi diagonalnimi belimimi kockicami
* Kako izmerimo višino tona
* Kaj so vizualne besede
* Efekti z zakasnitvijo – osnovna ideja
* kako sestavis pri indeksiranju beseda1 AND beseda2
* Vektor gibanja pri videu
* Levensteinova razdalja
* kaj je bipolarna interpolacija pri transformaciji slik
* MPEG-1 kodiranje, kako določimo št. bitov za kvantizacijo
* Kater barvni spekter prikaze vse barve

* Kaj je lematizacija besedila?
* Kaj je gama korekcija?
* Kaj je CMYK in kaj YCbCr? 
* Kaj pri MPEG-1 pomeni B, P in I?
* Kako je zvok odvisen od amplitude?
* Kaj določa ton zvoka?
* Kaj zazna vektor gibanja?
* Kako se amplituda (glasnost) zvoka spreminja skozi čas?
* Obrnjen indeks:
* Kaj je Levenshteinova razdalja?
* Kaj je tf-idf?

----------

Edit: Vprašanja

1. Kaj je smisel entropijskega kodiranja? kaj potrebujemo, da lahko kodiramo?
2. Z Huffmanom zakodiraj "KALAMARCKI"
3. Kako izvedemo iskanje Beseda1 OR Beseda2 (ilustriraj s primerom)
4. Podana je bila tabela, 3 besede in v kolikih dokumentih se posamezna pojavi (10, 100, 1000). Število vseh dokumentov je 10 000. Koliko je idf?
5. Podano je bilo neko zaporedje cifer, ki se kodira z RLE. Koliko je kompresijsko razmerje?
6. Kaj je BOM?
7. Narisana je bila shema obiskovanja spletnih strani in podana verjetnost obiska. Izračunaj PageRank.
8. Zakaj v vektorske prostoru evklidska razdalja ni dobra?
9. Iskanje v vektorskem prostoru
10. Razlika med text code in text encoding (tole ne vem če sem si prav zapomnila. Se kdo spomni?)
11. Podani sta bili dve besedi (ne spomnim se kateri). Koliko je Levenshteinova razdalja? Opiši kako jo izračunamo.
12. Kaj je pozicijski indeks?
13. Kako bi iskali po*ka? (nekaj takega)
14. Kaj smisel/bistvo pri LZ77?

Tole so vprašanja po spominu. 

----------

Evo vprašanja, ki sem jih imela (je pa bilo več verzij kolokvija, tako kot pri prvem):

1. Kaj je vzorčenje in kaj je kvantizacija?
2. Kakšno vlogo ima LFO pri sintezi zvoka?
3. Kakšne tone dobimo če imamo pri sintezi s frekvenčno modulacijo razmerje celih števil C:M?
4. Katere lastnosti ima dober zvočni prstni odtis?
5. Kako indeksira Shazam?
6. Kaj je prostorski efekt: odmev prostora?
7. Kako na zvok vpliva efekt distorzije?
8. Kakšno je razmerje med močjo signala in šumom, če kvantizacijo izvajamo z 8 biti? Kako smo prišli do te številke?
9. Kaj so to harmoniki oz. alikvotni toni? Kako vplivajo oz. kako vezo majo z osnovnimi frekvencami?
10. Zakaj za kodiranje/sintezo govora uporabljamo drugačen algoritem kot za ostale zvoke?
11. Kako pri LPC vemo če gre za nezvočnik ali zvočnik?
12. Kakšne so lahko posledice če analogne zvoke neposredno vzorčimo? Kako jih odpravimo?

Vprašanja so seveda po spominu zato niso čisto dobesedno taka, se razume 


----------
Predavanja
==========

----
TEXT
----

### TF-IDF
>Term frequency - inverse docujment frequency

### OBRNJEN INDEX
>Omogoca boolove izraze: w1 and w2

### ISKANJE V VEKTORSKEM PROSTORU
* Druga metoda, ne uporablja obrnjenega indexa.
* Ne nujno eksaktno iskanje, iscemo podobnosti:  

		       | D1  D2  D3
		---------------------
		car    |  1   2   0
		drive  |  0   1   0
		banana |  0   1   0
* V tabelo lahko shranjujemo tudi tf-idf.

#### Evklidska Razdalja
* Ni dobra izbira ker dokumenti z razlicnimi besedami so dalec narazaen, ceprov je del besed skupnih.  

		             _________
		dist(a,b) = √Σ(ai-bi)²  

#### Kosinusna Razdalja
* Kot med vektorji, boljse, dot produkt

### LATENT SEMANTIC INDEXING
* Vsak dokument je predstavljen z temo -> manj dimenzij
* Kako izluscimo temo:  

		        | D1  D2  D3  D4              
		--------------------------
		nogomet |  2   1   0   0        
		messi   |  3   2   0   0   = X  
		hrana   |  0   0   1   2
		solata  |  0   0   1   1
		==========================
		nogomet |  5   3   0   0
		hrana   |  0   0   2   3

#### SVD - Singularni razcep
* [U,S,V] = svd(X)

---------
STISKANJE
---------

* Redundantnost podatkov
	- Casovna: video, staticni kadri
	- Prostorska: velika podrocja enake barve/kontrasta
	- Spektralna: spremembe v barvi manj ocitne kot v kontrastu
	- Zaznavna: frekfenc blizu glasne frekfence ne slisimo

* Stiskanje ponavljanj

* RLE: 1111222333333 => (1,4),(2,3),(3,6)


### ENTROPIJSKA KODIRANJA

* Veckrat kot se simbol pojavi, krajso kodno besedo ima.

#### Shanonov Teorem (1948)

* Optimalna dolzina I(x) = -log₂P(x)

>AABACABAAB  
P(A) = 6/10  
P(B) = 3/10  
P(C) = 1/10  

>I(A) = -log₂6/10 * 0.6 = 0.74b * 0.6 = 0.4b  
I(B) = -log₂3/10 * 0.3 = 1.74b * 0.3 = 0.6b  
I(C) = -log₂1/10 * 0.1 = 3.32b * 0.1 = 0.3b  
Σ = 1.3b  

* Se pravi najbolj optimalno kodiranje uporabi 1.3 bita na simbol, pod predpostavko neodvisnosti med pojavitvami simbolov.
                                       
#### Primer 1 - Siva slika
>x: {0...255}  
P(Xi) = 1/256 

		₂₅₅
		-Σ 1/256 * -log₂1/256 =
		 ⁰
		-1 * -8 = 8b -> najboljse mozno kodiranje

#### Primer 2 - Siva slika, polovica pixlov ima vrednost 0
>x: {0...255}  
P(0) = 0.5  
P(Xi) = 0.5/255  

	                      ₂₅₅
		-0.5 * -log₂0.5 + -Σ 1/255 * -log₂1/255 =
		                   ⁰
		0.5 + -4.49 ≈ 5b -> najboljse mozno kodiranje	

#### Kako Zakodirati
>Predpone besed morajo biti enolicne.

#### Hufmanov Algoritem
* Doloci kode tako da se proba cim bolj priblizat optimalnemu kodiranju.
* Najbolj standardno kodiranje, prisotno v vseh formatih, ponavadi nekje na koncu (zip, jpeg).

#### Aritmeticno Kodiranje
* Kot biblija na meterski palici z zarezo
* H264: Lahko namesto Hufmana
* Ne da bitne kode za vsak posamezen simbol, ampak skupino sibolov

### UNIVERZALNE KODE
* V naprej dolocena kodiranja (abeceda,...)

#### Rice
* Manjse stevilke so bolj verjetne
* FLAC, UTF-8: Razlicno stevilo bajtov za razlicen znak
* Waveform - zvok: verjetnost vrednosti sempla ima peak na 0 in potem pada proti maxu in minu.

### KODIRANJE S SLOVARJI
* Entropijska Kodiranja: predvideva se medsebojno neodvisnost simbolov.
* Neodvisnost ne drzi v tekstu, zvoku, slikah...
	- Podzaporedja se velikokrat pojavijo -> dobijo key
	- Zip (LZ77)
	- Ustvarimo slovar in
	- kodiramo kot pare: (koda, polozaj) -> (4,0),(3,5)
* Dinamicni slovar: slovar se zgenerira glede na vsebino

#### LZ77 (Zip)
* Lampel-Ziv 1977  

		ABCDCDABCEBCDA
		ABCD|  |  |
		    v  v  +->(9,3,A)
		(2,2,A)(6,2,E)
* Nikoli ne gremo prevec nazaj gledat (buffer omejen na nekaj kilobajtov) (+ look ahead buffer)
* Prvi kilobajt ponavadi pustimo nezakodiran
* Kje je slovar? Slovar je impliciten, nimamo explicitne tabele!

#### LZW
* Lampel-Ziv-Welsch
* Mal boljsi
* Gif, Compress
* Sproti gradi slovar

### KODIRANJE RAZLIK
* Razlike med sempli pri zvoku -> oblika grafa enaka kot pri razporeditvi vrednosti samo  se bolj spicast. -> Entropija je manjsa (nakljucen signal ima najvecjo entropino)
* Entropija 16 bitnega zvoka je priblizno 14 bitov (Hufman)
* FLAC -> 1:2 ≈ 8b
* Entropija razlik semplov za 16 bitni signal je priblizno 11 bitov

* Siva slika (8b):
	- Entropija skor 8b
	- Entropija razlik ≈ 4.5b
* FLAC poskusa naredit funkcijo za nopovedovanje oblike funkcije (LPC - Linear Predictive Coding)








































