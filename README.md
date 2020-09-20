# Cucumber_SerenityBDD_Java

Proyecto base para proyectos con Serenity BDD y Cucumber.

El ejemplo implementa las 2 siguientes pruebas:

Prueba 1

Given RealBook quiere encargar un lote de cajas

When solicita la sugerencia de una caja para un objeto que no es frágil con unas medidas
de 6 cm de largo, 3 cm de ancho y 18 cm de alto

Then la recomendación debería ser una caja con las medidas 10 cm de largo, 5 cm de
ancho y 20 cm de alto

Prueba 2

Given iTV quiere encargar un lote de cajas

When solicita la sugerencia de una caja para un objeto que es frágil con unas medidas de
144 cm de largo, 17 cm de ancho y 80 cm de alto

Then la recomendación debería ser una caja con las medidas 160 cm de largo, 25 cm de
ancho y 88 cm de alto
