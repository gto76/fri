# Creates webpages by converting text file in every folder to text.html using markdown parser. Any additional subpages need to be added by hand as a new rule.


# all:
all: emp mt tpo is

# emp:
emp: emp/text.html emp/1kolokvij.html emp/3kolokvijERP.html

emp/1kolokvij.html : emp/1kolokvij.txt
	cd emp; \
	./create-1kolokvij-html

emp/3kolokvijERP.html : emp/3kolokvijERP.txt
	cd emp; \
	./create-3kolokvijERP-html

# mt:
mt: mt/text.html

# tpo:
tpo: tpo/text.html

# is
is: is/text.html


# Generic rule for converting text file into text.html, regardles of the path 
%/text.html : %/text
	scripts/create-text-html $(dir $<) scripts/header

