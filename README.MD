Jag började att skapa appen genom att göra en "MainActivity" som visade en sida med knapparna "Accelerometer" och "Compass". Sedan lade jag till så att den "Compass"-knappen länkade till en ny kompass-aktivitet. Därpå gjorde jag en Accelerometer-aktivitet och kopplade "Accelerometer"-knappen på startsidan till denna knapp. Sedan gjordes lite småändringar såsom färg, tillbakaknapp och liknande.

Koden i kompassaktiviteten är kopierad från tutorialn *"How-to create a Compass App"* tillgänglig på https://www.wlsdevelop.com/index.php/en/blog?option=com_content&view=article&id=38. 
Modifikationer som har gjort till denna kod är att bilden har bytts ut samt att det finns en tillbaka-knapp längst upp till vänster som länkar tillbaka en till MainAktiviteten. En kort text där det står *"Direction: "* har även lagts till för att indikera att det är en riktning som visas. Texten har dessutom ändrats så att det står *Degrees" istället för "°".


MainAktiviteten är byggd utifrån tutorialn *"Build Your First App"*, tillgänglig på: https://developer.android.com/training/basics/firstapp/index.html
Inga tillägg har gjort i denna aktivitet (förutom det faktum att det är två knappar istället för en som i tutorialn).


Större delarna av AccelerometerAktiviteten är kopierad från *"SensorManager"*-dokumentationen, tillgänglig på: https://developer.android.com/reference/android/hardware/SensorManager.html.  
OnSensorChanged-metoden i AccelerometerAktiviteten är inspirerad av *"SensorEvent"*-dokumentationen, tillgänglig på: https://developer.android.com/reference/android/hardware/SensorEvent.html.


Tillägg som har gjorts i AccelerometerAktiviteten är att lägga till en tillbakaknapp, att skärmen skiftar till grön färg när man lutar mobilen åt höger samt att skärmen skiftar till röd färg när man lutar mobilen åt vänster. Dessutom har det lagts till att texten "HÖGER" visas när telefonen är lutat åt höger och texten "VÄNSTER" visas när telefonen är lutad åt vänster
