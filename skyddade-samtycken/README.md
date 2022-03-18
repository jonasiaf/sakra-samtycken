### Hej!

#### Bakgrund
I och med EU:s samtyckeslag behöver systemen på Arbetsförmedlingen ibland be om samtycke.
Ett samtycke är att viss information för en registrerad användare får användas i ett specifikt syfte. Det är inte knutet till ett system.
Ett samtycke kan till exempel se ut så här: "Jag samtycker till att Arbetsförmedlingen sparar mina personuppgifter".
Samtyckesapplikationen sparar dessa avlagda samtycken i en databas.

Flera system kan dela på samma samtyckestext.

Tabellen "Definitions" motsvarar samtyckestexten, eller samtyckesdefinitionen.
Tabellen "Persons" motsvarar en person som avlagt ett eller flera samtycken.
Tabellen "Consents" motsvarar kopplingen mellan en person och ett avlagt samtycke.

Applikationen kommer förkonfigurerad med Liquibase, som bygger upp databastabellerna automatiskt.
En in-memory databas används automatiskt i det förberedda testet.
Det är ok att ersätta med godtycklig databasimplementation om du vill.

#### Uppgiften
Vissa personer som avlägger samtycke har s.k. "skyddad identitet".
Enbart system som har säkerhetsrutiner för skyddad identitet får se samtycken tillhörande dessa personer.

Uppgiften går ut på att designa och implementera en simpel lösning, så att samtycken tillhörande person med skyddad identitet
döljs från "osäkra" system, men visas för system som är "säkra". Osäkra system ska också kunna spara samtycken.

Du får skapa nya klasser och göra godtyckliga ändringar i existerande implementation,
så länge som det existerande förhållandet mellan Consent, Definition, och Person bevaras. Ta m.a.o inte bort något från entiteterna som finns.

En färdig lösning ska returnera alla samtycken till säkra system, och bara osäkra samtycken till osäkra system, via ConsentController.class

Kryptering och singering av data ingår inte i uppgiften.
Autentisering och auktorisering av system ingår inte i uppgifter.
Enhetstester som verifierar lösningen är av respekt för din tid inte nödvändigt.
Du förväntas inte lägga mer än 2-4 timmar på uppgiften, så prioritera därefter.

#### Kontakt
Den färdiga uppgiften skickas som zip-arkiv tillsammans med ett kort resonemang över lösningen till: jonas.iacobi@arbetsformedlingen.se
Det är tillåtet att ställa frågor, som du gärna får maila till samma adress.

Lycka till!