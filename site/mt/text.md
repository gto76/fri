
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

Vprašanja na izpitu 2011
Lematizacija
bilinearna interpolacija
mpeg-1
kje pride do izgube pri kodiranju jpeg
tf-idf
kaj je ideja efektov, ki uporabljajo zakasnitve
kaj je gama korekcija, kje se uporablja
kako lahko kodiramo z mediano
kako lahko spremenimo višino signala z vzorci...
kaj so I, B P slike pri mpeg-1 kodiranju
kater barvni prostor zajema vse barve, ki jih vidimo in za kaj se uporablja
kaj lahko poveš o magnitudi ... vzorca (3 poševne bele pikce v črnem kvadratu)
kaj so vizualne besede
kako bi uporabil beseda1 AND beseda2 pri obrnjenem indeksiranju.....
Levensteinova razdalja
še neki o mpeg-1
kaj je vektor premika/razdalj 


lemantizacija besed
Zakaj je pri videu YUV in YcbCr
Kako amplituda vpliva na glasnost
Najvecja izguba pri JPEG kodiranju (kater korak)
Kaj je identifikacija avdio posnetka
tb-itf
Zakaj se uporablja fitriranje z mediano
Gama korekcija
Magnituta slikca s 3emi diagonalnimi belimimi kockicami
Kako izmerimo višino tona
Kaj so vizualne besede
Efekti z zakasnitvijo – osnovna ideja
kako sestavis pri indeksiranju beseda1 AND beseda2
Vektor gibanja pri videu
Levensteinova razdalja
kaj je bipolarna interpolacija pri transformaciji slik
MPEG-1 kodiranje, kako določimo št. bitov za kvantizacijo
Kater barvni spekter prikaze vse barve

Kaj je lematizacija besedila?
Kaj je gama korekcija?
Kaj je CMYK in kaj YCbCr? 
Kaj pri MPEG-1 pomeni B, P in I?
Kako je zvok odvisen od amplitude?
Kaj določa ton zvoka?
Kaj zazna vektor gibanja?
Kako se amplituda (glasnost) zvoka spreminja skozi čas?
Obrnjen indeks:
Kaj je Levenshteinova razdalja?
Kaj je tf-idf?

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

-----------
















