# Programmazione ad Oggetti - Laboratorio 02

#### FASE 1 - Principio di incapsulamento

* Analizzare la classe `Student`
* Si noti che:
    - I campi sono ora privati: un client della classe non sarà mai influenzato dalla modifica di meri aspetti implementativi
    - Sono stati introdotti dei selettori per ottenere le proprietà dell'oggetto: `getName()`, `getSurname()`, ...

#### Il metodo `toString()`

* Si implementi il metodo `String toString()` lasciato incompleto (si ricordi che `String toString()` è il metodo convenzionalmente usato in Java per ottenere la rappresentazione testuale di un oggetto).

#### Aggiunta di nuove funzionalità

* Si completi la classe `Student` per modellare le funzionalità aggiuntive associate alla modellazione dei voti che lo studente riceve

#### Costruzione di classi utilità

* Si completi la classe `ArrayUtil` seguendo le istruzioni riportate nei commenti della medesima

* Si testino l'implementazione utilizzando la classe `TestStudents`.


#### FASE 2 - Esercizio più avanzato

1. Si completi la classe `oop.lab02.constructors.Smartphone` con i campi:
    - `int nCPU, ram, sdSize`
    - `String brand, model`
    - `boolean hasGPS, hasNFC, has3G`
2. Si implementino nella classe suddetta i seguenti costruttori:
    - `Smartphone(String brand, String model)`
    - `Smartphone(String brand, String model, int sdSize, boolean hasGPS, boolean has3g)`
    - `Smartphone(String brand, String model, int sdSize)`
    - `Smartphone(String brand, String model, boolean hasNFC)`
    - Costruttore con un argomento per campo (NB: ci si assicuri di usare `this` per richiamare i costruttori esistenti)
3. Si utilizzino i commenti riportati nel `main` della classe per scrivere un test ed eseguirlo.
