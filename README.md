# MiTTPPprojekt_Paradzik
## Sadržaj
<ul>
  <li>Opis projekta</li>
  <li>Korišteni alati</li>
  <li>Upute o načinu korištenja alata</li>
</ul>

## 1. Opis projekta
<p>Projekt testiranja mobilne aplikacije "TunesForYou" temelji se na automatizaciji testiranja funkcionalnosti aplikacije korištenjem alata Android Studio, Appium i IntelliJ IDEA.</p>
<p>"TunesForYou" je aplikacija za reproduciranje playlisti po raspoloženjima i žanrovima. Korisnik ima mogućnost prijave i pravljenja vlastitih playlisti.</p>
<p>U projektu se testira 5 funkcionalnosti aplikacije</p>
<ul>
  <li>Registracija novog korisnika</li>
  <li>Prijava registriranog korisnika</li>
  <li>Reproduciranje pjesme iz ponuđene playliste</li>
  <li>Kreiranje vlastite playliste</li>
  <li>Unošenje pjesme u vlastitu playlistu</li>
</ul>

<p>Prikaz sučelja ponekih opcija aplikacije</p>

<table>
  <tr>
    <td>
      <img src="https://i.postimg.cc/28JqqDhX/photo-5918059317632811492-y.jpg" alt="#">
    </td>
    <td>
      <img src="https://i.postimg.cc/FHCgTqMM/photo-5918059317632811491-y.jpg" alt="#">
    </td>
    <td>
      <img src="https://i.postimg.cc/tTW0zFMx/photo-5918059317632811490-y.jpg" alt="#">
    </td>
    <td>
      <img src=https://i.postimg.cc/qqcxQ7rw/photo-5918059317632811488-y.jpg" alt="#">
    </td>

  </tr>
  <tr>
    <td>
      <img src="https://i.postimg.cc/nhy0GNb3/photo-5918059317632811486-y.jpg" alt="#">
    </td>
    <td>
      <img src="https://i.postimg.cc/zD47r938/photo-5918059317632811487-y.jpg" alt="#">
    </td> 
  </tr>
</table>

## 2. Korišteni alati
### Intellij IDEA
<p>
IntelliJ IDEA je moćan integrirani razvojni okvir koji pruža napredne alate i funkcije za razvoj softvera, olakšavajući programerima da učinkovito pišu, testiraju i održavaju svoje aplikacije. Unutar Intellij IDEA implemntirani su testovi pomoću Java programskog jezika.</p>

### Appium
<p>Appium je slobodno distribuirani okvir za testiranje korisničkog sučelja otvorenog koda za
mobilne aplikacije. Appium omogućuje provjeru autentičnih, hibridnih i web aplikacija i podržava test
automatizacije na fizičkim uređajima, kao i emulator ili simulator. Pomoću Appiuma smo upravljati emulatorom i istraživati informacije o elementima aplikacije.</p>

### Android Studio
<p>Android Studio je integrirano razvojno okruženje (IDE) koje je specijalizirano za razvoj Android aplikacija, pružajući programerima sve potrebne alate i resurse kako bi kreirali inovativne i pouzdane mobilne aplikacije za Android platformu.</p>

## 3. Upute o načinu korištenja alata
<p>Koraci za postavljanje razvojnog okruženja</p>
<ul>
  <li>Pokrenuti Daemon pozadinski proces</li>
  <li>Pokrenuti Android emulator iz Android Studia ili putem komandne linije
</li>
  <li>Instalirati testnu aplikaciju na emulatoru i pokrenuti server</li>
  <li>Pokrenuti Appium, konfigurirati postavke, unijeti željene sposobnosti mobilnog uređaja unutar <i>New Session Window</i> i započeti sesiju.</li>
</ul>

<p>Koraci za izvođenje projekta</p>
<ul>
  <li>Pokrenuti Intellij IDEA i otvoriti projekt</li>
  <li>Pomoću Mavena instalirati potrebne ovisnosti
</li>
  <li>Pokrenuti testove unutar komandne linije putem naredbe <b>mvn test</b> (Ctrl + Enter)</li>
  <li>Tijekom izvršavanja testove, generiraju se Surefire izvješća o izvršenim testovima na lokaciji ../project_folder/target/surefire-reports/index.html
</li>
</ul>
