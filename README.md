FRI VSš 2014/15
===============

* Informacije o predmetih
* Izpitna vprašanja
* Izpiski


####[WEBPAGE](http://gto76.github.io/fri/index.html)

----------------

An implementation of communal web-page using GitHub repository, a GitHub page of the project, few bash scripts and a makefile.

I'm currently using it to publish notes from computer science classes. It consists of pages that get generated by parsing markdown files and adding a universal header to them. Each page has its own directory, with a main markdown file called `text.md`. The header contains links to the main page and markdown file on GitHub, so anyone with a GitHub account can edit the file.  

To update the html pages run `make` command in projects' root. To create a new subpage run `create-course <name>` script in `scripts` directory. It will create a new directory containing a markdown file and it will add a new rule to the `makefile`. `makefile` only needs to be edited if we add any subpages to the subpage itself.

Templates directory contains a file called `head` that defines few CSS properties that get added to all the pages. It also contains a file called `index` that contains the content of the main page (links to the subpages get generated automatically).

In `scripts` directory there is also a `pre-commit` hook that can be linked to `.git/hooks` directory, in order for git to check if site is up to date before every commit. It will run `make` command and abort the commit it if is not.

How To Run
----------
```
$ sudo apt-get install markdown
$ git clone https://github.com/gto76/fri
$ cd fri
$ google-chrome index.html
```
