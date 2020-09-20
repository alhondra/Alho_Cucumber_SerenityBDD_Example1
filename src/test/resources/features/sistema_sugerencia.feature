#lang=en
Feature: Sugerencia del tamano de la caja
  Para saber el tamaño de la caja que necesito
  Como Cliente
  Quiero una herramienta que me sugiera el tamaño

  Scenario Outline: Sugerir tamano de caja
  Sugerir el tamano de una caja dependiendo sus medidas y fragilidad del contenido
    Given RealBook quiere encargar un lote de cajas
    When solicita la sugerencia de una caja para un objeto que <fragilidad> con unas medidas de <largo> cm largo, <ancho> cm de ancho y <alto> cm de alto
    Then la recomendacion deberia ser una caja con las medidas <largo esperado> cm de largo, <ancho esperado> cm de ancho y <alto esperado> cm de alto
    Examples:
      | fragilidad   | largo | ancho | alto | largo esperado | ancho esperado | alto esperado |
      | no es fragil | 6     | 3     | 18   | 10             | 5              | 20            |
      | es fragil    | 144   | 17    | 80   | 160            | 25             | 88            |

