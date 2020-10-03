# Java 

## Objektorientierung 

### Personenverwaltung 

Modelliere und Implementiere einen Personenverwaltung! 
Die Klasse Personenverwaltung soll die Möglichkeit bieten Personen anzulegen und Personen zu löschen. 
Zum Speichern kannst du gerne eine [Liste](https://docs.oracle.com/javase/7/docs/api/java/util/List.html) verwenden.

⚠️ Ziel ist es nicht in der Main Methode den Person-Konstruktor aufzurufen und diese Personen der Personenverwaltung zu übergeben! Stattdessen sollte die Personenverwaltung eine Methode `createPerson` bieten über die Personen erstellt werden können

Personen besitzen verschiedene Eigenschaften u.a. Vorname, Nachname, Geburtsdatum, Adresse, Geschlecht. 

Die Klasse Personenverwaltung soll mehrere `create` Methoden zur Erstellung von Personen bieten: 
* Eine Person die lediglich mit Vornamen und Nachnamen erstellt wird
* Eine Person die mit allen Werten erstellt wird
* Eine Person die mit Namen, Geschlecht und Geburtstdatum erstellt wird

Versuch für die Abbildung des Geschlechts ein [Java Enum](https://www.w3schools.com/java/java_enums.asp) zu verwenden. Eine Adresse hat vermutlich auch ihre eigene Klasse verdient da sie aus PLZ, Ort, Straßenname und Hausnummer besteht. 

⚠️ Vergiss nicht auf die Unit Tests
