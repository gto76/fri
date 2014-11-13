
	 ___ ____  
	|_ _/ ___| 
	 | |\___ \ 
	 | | ___) |
	|___|____/ 
           
=====================
Informacijski Sistemi
=====================

>[Učilnica](https://ucilnica.fri.uni-lj.si/course/view.php?id=63)  
[Urnik](https://urnik.fri.uni-lj.si/timetable/2014_2015_zimski/allocations?subject=63714)  

>[Damjan Vavpotič](http://www.fri.uni-lj.si/si/damjan-vavpotic/)  
>Gregor Weiss  
>[Slavko Žitnik](http://www.fri.uni-lj.si/si/slavko-zitnik/)  

```timetable
 PON ;  9-10 ; R2.60 ; govorilne DV 
 TOR ; 10-12 ; PR09  ; vaje
     ; 17-19 ; K1129 ; vaje
 SRE ; 11    ; 2.44  ; govorilne GW
     ; 12-15 ; P22   ; predavanja
 ČET ;  8-10 ; PR16  ; vaje
 PET ;  8-10 ; PR16  ; vaje
     ; 11-13 ; PR16  ; vaje
```

>50 % ocene predstavlja praktično delo študenta, ki se ocenjuje preko seminarskih nalog, 50 % ocene predstavlja pisni izpit, ki ga je mogoče izdelati tudi s sprotnim delom v obliki kolokvijev.

>Predavanja so bila. Šli pa smo čez uvodni pdf. Profesor se mi zdi zlo uredu, se ga da fino poslušat, dobro govori :) povedal je tudi da predavanja niso obvezna in se da predmet opravit s tem da predelaš le pdfje.

VAJE
----
Udeležba na laboratorijskih vajah mora biti vsaj 75%.
Priblizno 7 obveznih vaj.

Poudarek bo na povezovanju in uporabi različnih tehnologij pri razvoju spletnih poslovnih aplikacij.

* 1.Seminarska: Osnoven IRC  
* 2.Seminarska: Nadgraditev z bazo  
* 3.Seminarska: Poljubna nadgradnja (Android)  

### Programska oprema
Programska oprema je dosegljiva preko programa [MSDNAA](http://www.fri.uni-lj.si/si/fakulteta/program_msdnaa/):

* Microsoft Visual Studio 2012 (Ultimate)
* Microsoft SQL Server 2012 (Express verzija je že vključena v namestitev Microsoft Visual Studio 2012)

V kolikor imate z dostopom do MSDNAA težave pišite na email: msdnaa@fri.uni-lj.si

### Vaje 2

#### Hranjenje prenosa stanja
##### Del requesta in responsa
* Parametri v naslovu 

			button_click -> redirect(url-z-parametri)
* Piškotki 

			hc = new Cookie(); 
			response.cookies.add(hc)
* Lastnost viewState - del htmlja

			// set:
			viewState.add(IME, PRIIMEK)
			// get:
			foreach (stateItem si in viewState.values)
				si.value.ToString();

##### Na voljo povsod v kodi
* Sejna spremenljivka

			// set:
			Session["naziv"] = "grof"
			// get:
			if (Session["naziv"] != null)
				Label1.Text = (String) Session["Naziv"];
* Aplikacijska spremenljivka - vidna v vseh sejah

			Application["naziv"] = "grof"...

#### Validacija Vnosa
* Pri uporabniku, seveda je treba kasneje na serverju se enkrat preverit vnose.
* Required Field Validator
	- ControlToValidate = "TextBox1"
	- Error Message = "Please enter value"
	- Is Valid
	- Validate
	- On Play
* Compare Validator: Compares two fields (repeat your email)
* Range Validator: Years
* Regular Expression Validator (email: ".*@.*\\..*")
* Validation summary

### Vaje 4
* Slavko Zitnik
* Virtualni strezniki bojo na faxu

#### Povezava z bazo
* Dodamo obstojeco bazo v projekt z - App_Data: Add Existing Item...: Northwind.mdf
* Nevidni Gradnik za povezavo do baze - Data: SqlDataSource
* Gradnik za prikaz podatkov v tabeli - Data: GridView
* Primer regexa v SQL stavku, % je enako kot * - LIKE '%bla%'
* Imamo Product tabelo in zelimo zamenjat suplierId in categoruId z njunima imenoma. Za to rabimo se dva SqlDataSourca, in v vsakemu odkljukamo zeljene columne. Pri product SqlDataSourcu moramo se - advanced: generate insert, update, delete...!


KOLOKVIJ
--------
* Dva kolokvija...  
* Kviz na eUčilnici  
* Vprašanja iz snovi predavanj (teorija)  
* Za uspešno opravljen izpit je potrebno pri obeh kolokvijih doseči vsaj 50% točk.  
* Predvidena termina (začetek decembra, sredina januarja)  

### 2013
1.kolokvij bo 4.12.ob 18.00


