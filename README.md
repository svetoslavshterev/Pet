# Pet 
Pippi ist geschockt davon, welche Sicherheitslücken ihr Code aufweist. Sie erkennt, dass es ein Fehler war,  die privaten Sammlungen _pets (List) und _members (Map) aus den jeweiligen Klassen herauszureichen.
Sie beschließt daher, eine bessere Datenkapselung einzuführen und die Methoden getMembers() sowie getPets() zu streichen, damit niemand mehr diese Sammlungen direkt und unkontrolliert manipulieren kann.

    Die Klasse Pet modifiziert sie so, dass der Tiername nur einmalig initialisiert werden kann.
    In die Klasse Person fügt sie die selektivere Methode getFirstPet() ein.
    In die Klasse Group fügt sie die Methode get() ein, die eine Person anhand ihres Namens zurückliefert.
    Damit das Anvertrauen der Tiere weiterhin klappt, schreibt sie in der Klasse Person eine statische Methode entrustPet(), die ein Tier von einer Person an eine andere Person überträgt.
    Letztendlich passt sie den Code im Hauptprogramm an die Klassenänderungen an, damit Annika und Tommy sich auch ganz sicher weiterhin während ihrer Reise um die Tiere kümmern.
