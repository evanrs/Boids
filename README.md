Boids
=====
This is a Clojure implementation of Craig Reynolds' original [Boids
flocking algorithm](http://www.red3d.com/cwr/boids/).  The Boids
algorithm simulates coordinated animal motion such as you'd see in
bird flocks and fish schools.

I was at the 1987 Siggraph convention the year he presented this
work. It was really revolutionary for its time and left a big
impression on me.  See his famous CGI simulation ["Stanley and Stella
in Breaking the
Ice"](http://www.youtube.com/watch?v=3bTqWsVqyzE&NR=1).

The rendition implemented in this program is considerably lower-fi
than Craig's.

Installation
------------
1. This is Clojure, so you will need to have Java (preferably 1.6)
installed on your system
2. Download and install
[leiningen](http://github.com/technomancy/leiningen).  The
installation instructions on the leiningen github page are pretty
clear, but basically, you download the script (_not_ git clone), put
it somewhere in your path and make it executable, then run  <tt>lein
self-install</tt> at the command 
3. Fork or <tt>git clone</tt> this repository
4. That's it.  Follow the usage instructions from there on out.
Beware that leiningen is maven-like and will try to download the entire
universe when you run it the first time.


Usage
-----
In the top-level project directory, run

    $ lein repl

This gives you a Clojure REPL with all the classpaths set for the
project. Now, you can execute the following commands (in this sequence) in the
REPL

Import the functions in src/boids/main.clj

    user=> (use 'boids.main)

Generate a Var s that is a "double agent" (my term) for controlling the display

    user=> (def s (initialise-boid-space-agent)) 
	       
Start the flock moving

    user=> (start-animation s) 

Freeze the flock in place

    user=> (stop-animation s) 

Kills the flock and it's window

    user=> (kill-animation s) 

License
-------
What??  Like anybody cares.
