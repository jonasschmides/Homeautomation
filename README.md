# Übung 7 – Proxy

Aufgabenstellung IoT
Internet of Things ist in aller Munde. Die nächsten 2 Übungen beschäftigen wir uns also damit. Zunächst implementieren Sie einen Remote Proxy, der vorgibt, dass ein Rollo-Schalter (1*rauf, 1*runter) auf Ihrem PC für den Benutzer bereit stellt. Entwickeln Sie dafür auch eine nette Oberfläche dafür. Wenn die Schalter gedrückt werden (es kann nur entweder rauf ODER runter gedrückt werden) wird eine MQTT Nachricht an einen Mosquitto Server geschickt (Topic: home/wohnzimmer/rollo, Nachricht: >0 = rauf, -0 = runter, 0 = stop, x = bis x% geschlossen x<0, x = x% offen wenn x>0) und die Rollo tatsächlich runter oder raufgefahren, die Rollo stoppt automatisch am Endpunkt und setzt den Wert wieder auf 0.
Die Bibliotheken dafür und den Mosquitto Server finden Sie im Internet. ACHTUNG: Sie benötigen die Lösung auch für die nächste Übung.
Gutes Gelingen und viel Spaß mit IoT!

# Mosquito server
 //ToDo
