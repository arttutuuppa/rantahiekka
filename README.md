# rantahiekka
Tässä tehtävässä luodaan falling sand game-tyyppinen sovellus, jota käytetään erilaisten aineiden simulointiin. Ohjelmassamme simuloidaan hiekan ja veden käyttäytymistä. Lopullisen sovelluksen toiminta on esimerkiksi seuraavanlainen.

Esimerkki hiekkaranta-simulaation toiminnasta.
 

Huom! Käytät tässä tehtävässä luokassa HiekkarantaSovellus olevaa metodia public static int toteutetutOsat() toteutettujen tehtävän osien raportointiin. Älä poista metodia, vaan muokkaa sitä aina kun saat yksittäisen osan valmiiksi. Tehtävä koostuu viidestä osasta.

Huom2! Kun toteutat simulaatiota, varmista että ohjelma pitää tarpeeksi pitkiä taukoja piirtämisten ja simulaatioiden välillä. Tällöin tehoja jää myös testien ajamiseen. Testien suorittaminen palvelimella päätyy heikosti, jos kaikki palvelimen teho menee animaation suorittamiseen. Tällöin testien ajon viestinä on esim. kryptinen "Missing test output.". Jos saat tämän virheen palvelimelta, kokeile suoritusta esimerkiksi siten, että simulaatiota piirretään ja päivitetään korkeintaan 20 kertaa sekunnissa.

Huom3! Kun piirrät hiekkalaatikkoa, piirrä musta alue yhtenä isona suorakulmiona piirtämisen alussa. Näin jokaista yksittäistä mustaa pistettä ei tarvitse erikseen piirtää, ja voit keskittyä muiden pisteiden piirtämiseen.

Tehtävä 10.1: Palaset kohdalleen
Luo tehtäväpohjassa olevaan luokkaan graafinen käyttöliittymä. Graafisen käyttöliittymän komponenttien asettelu tulee tehdä BorderPane-luokan avulla. Lisää BorderPane-luokan keskelle Canvas-olio, jota käytetään piirtämiseen. Aseta Canvas-olion leveydeksi ja korkeudeksi 200 pikseliä. Lisää BorderPane-luokan oikealle laidalle VBox-olio, joka sisältää kolme RadioButton-oliota. Ensimmäiseen RadioButton-olioon tulee liittyä teksti "Metalli", toiseen teksti "Hiekka", ja kolmanteen teksti "Vesi".

Kun saat tämän osan valmiiksi, muokkaa luokan HiekkarantaSovellus metodia public static int toteutetutOsat() siten, että se palauttaa arvon 1. Voit myös palauttaa tehtävän, niin saat siitä ensimmäisen pisteen.

Tehtävä 10.2: Simulaation alkupalat
Luo pakkaukseen hiekkaranta luokka Simulaatio. Luokalla Simulaatio tulee olla seuraavat konstruktorit ja metodit. Käytä luokassa hyödyksi valmista enum-luokkaa Tyyppi.

Konstruktori public Simulaatio(int leveys, int korkeus) luo annetun levyisen ja korkuisen simulaation. Jokainen kohta on aluksi tyhjä.
Metodi public void lisaa(int x, int y, Tyyppi tyyppi lisää annettuun kohtaan annetun tyyppisen elementin. Tyyppi on joko tyhjä, metalli, hiekka tai vesi.
Metodi public Tyyppi sisalto(int x, int y) palauttaa annetussa kohdassa olevan sisällön. Vastaus on joko Tyyppi.TYHJA, Tyyppi.METALLI, Tyyppi.HIEKKA tai Tyyppi.VESI. Jos kohtaan ei ole lisätty mitään arvoa, tyyppi on Tyyppi.TYHJA. Jos käyttäjä kysyy tietoa alueen ulkopuolelta, palauta Tyyppi.METALLI.
Metodi public void paivita() päivittää simulaatiota yhden askeleen. Päivitystoiminnallisuuden toteutus aloitetaan kohtapuoliin .
Kun saat tämän osan valmiiksi, muokkaa luokan HiekkarantaSovellus metodia public static int toteutetutOsat() siten, että se palauttaa arvon 2. Voit myös palauttaa tehtävän, niin saat siitä toisen pisteen.

Tehtävä 10.3: Metallin lisääminen ja piirtäminen
Lisää edellä toteuttamasi Simulaatio osaksi käyttöliittymää. Aseta simulaation leveydeksi 200 ja korkeudeksi 200 pikseliä (simulaation tulee toimia myös muun kokoisena). Lisää tämän jälkeen sovellukseen mahdollisuus metallin lisäämiseen. Metallia lisätään kun käyttäjä piirtää kuvaan sisältöä ja metalli on valittuna oikealla laidalla olevasta valikosta.

Käytä simulaation käyttäjälle näyttämiseen AnimationTimer-luokkaa sekä Canvas-oliota. Piirrä canvas-olion sisältö uudestaan kymmenen kertaa sekunnissa. Kun metallin lisääminen onnistuu, se toimii esimerkiksi seuraavalla tavalla. Alla olevassa esimerkissä hiiren pohjassapito lisää useampia metallipisteitä samaan aikaan.

Esimerkki hiekkaranta-simulaation toiminnasta.
 

Kun saat tämän osan valmiiksi, muokkaa luokan HiekkarantaSovellus metodia public static int toteutetutOsat() siten, että se palauttaa arvon 3. Voit myös palauttaa tehtävän, niin saat kolmannen pisteen.

Tehtävä 10.4: Hiekan lisääminen ja toiminnallisuus
Lisää tämän jälkeen toiminnallisuus hiekan lisäämiseen ja piirtämiseen. Hiekka tulee piirtää eri värillä kuin metalli. Google auttaa tarvittaessa piirtämisessä -- esimerkiksi haku "javafx how to draw on canvas using animationtimer" antaa linkkejä, joista on hyötyä.

Kun onnistut myös hiekan lisäämiseen käyttöliittymässä (metallin lisäämisen tulee myös onnistua!), muokkaa tämän jälkeen Simulaatio-luokan metodia paivita. Metodin paivita tulee toimia siten, että se tarkistaa jokaiselle hiekkaa sisältävälle kohdalle kohdan alla olevat kolme vaihtoehtoa. Jos joku vaihtoehdoista on tyhjä, hiekka siirretään alaspäin tyhjään kohtaan.

Nyt sovelluksessa pitäisi tapahtua liikettä kun piirrät hiekkaa. Saat Random-luokan avulla sovellukseesi satunnaisuutta -- hiekan ei tarvitse toimia aina täsmälleen samalla tavalla.

Esimerkki hiekkaranta-simulaation toiminnasta. Kuvassa hiekka toimii metallin kanssa.
 

Kun saat tämän osan valmiiksi, muokkaa luokan HiekkarantaSovellus metodia public static int toteutetutOsat() siten, että se palauttaa arvon 4. Voit myös palauttaa tehtävän, niin saat neljännen pisteen.

Tehtävä 10.5: Veden lisääminen
Lisää tämän jälkeen toiminnallisuus veden lisäämiseen ja piirtämiseen. Piirrä vesi eri värillä kuin hiekka tai metalli.

Muokkaa tämän jälkeen Simulaatio-luokan metodia paivita siten, että se siirtää kutsun yhteydessä vettä alaspäin jos joku veden alapuolella olevista kohdista on tyhjä. Jos yksikään kohdista ei ole tyhjiä, mutta jommalla kummalla laidalla on sijaa, siirretään vettä sivulle.

Muokkaa vielä sovellusta siten, että hiekka syrjäyttää veden. Kun lisäät hiekkaa, veden tulee siis väistää hiekkaa. Nyt sovelluksen pitäisi toimia kokonaisuudessaan!

Esimerkki hiekkaranta-simulaation toiminnasta.
 

Kun saat tämän osan valmiiksi, muokkaa luokan HiekkarantaSovellus metodia public static int toteutetutOsat() siten, että se palauttaa arvon 5. Voit myös palauttaa tehtävän, niin saat viidennen pisteen.

Palauta tehtävä viimeistään nyt. Voit tämän jälkeen lähteä toteuttamaan uusia toiminnallisuuksia. Miten toteuttaisit esimerkiksi laavan?
