FRI VSš 2014/15
---------------

* Informacije o predmetih
* Izpitna vprašanja
* Izpiski


[webpage](http://gto76.github.io/fri/index.html)

----------------

An implementation of communal web-page using github repository, a github page of the project, few bash scripts and a makefile.

I'm currently using it to publish notes from computer science classes. It consists of pages that get generated by parsing markdown files and adding a universal header to them. Each page has its own directory, with a main markdown file called `text.md`. The header contains a link to the main page (which contains a list of links to all the subpages) and a link to the markdown file on the github, so anyone with a github account can edit the file.  

To update the html pages run `make` command in projects root. To create a new subpage run `create-course <name>` script in `scripts` directory. It will create a new directory containing a markdown file and it will add a new rule to the `makefile`. `makefile` only needs to be edited if we add any subpages to the subpage itself.

Templates directory contains a file called `head` that defines a few css properties that get added to all the pages. It also contains a file called `index` that contains a content of the main page (links to the subpages get generated automatically).

In `scripts` directory there is also a `pre-commit` hook that can be linked to `.git/hooks` directory, in order for git to check if site is up to date before every commit. It will run `make` command and abort the commit it if is not.
