# TP4 – UML Relaciones 1 a 1

## Objetivo
Modelar clases con relaciones **1 a 1** y **dependencias** en UML, y preparar el terreno para su futura implementación en Java. Se cubren:
- Asociación (unidireccional/bidireccional)
- Agregación
- Composición
- Dependencia de **uso** y de **creación**

Cada ejercicio debe indicar **tipo de relación**, **dirección**, **diagrama UML** y su posterior **implementación en Java**.

---

## Estructura de proyecto
```text
tp-uml-relaciones/
├─ README.md
├─ src/
│  └─ main/
│     └─ java/
│        └─ 
├─ docs/
│  ├─ uml/
│  │  ├─ plantuml/
│  │  │  ├─ 01-pasaporte-foto-titular.puml
│  │  │  ├─ 02-celular-bateria-usuario.puml
│  │  │  ├─ 03-libro-autor-editorial.puml
│  │  │  ├─ ... 
│  │  └─ png/
│  │     ├─ 01-pasaporte-foto-titular.png
│  │     ├─ 02-celular-bateria-usuario.png
│  │     ├─ 03-libro-autor-editorial.png
│  │     ├─ ... 
│  └─ notas/
│     └─ decisiones.md
└─ .gitignore            
```

- `docs/uml/plantuml`: fuentes de texto plano en **PlantUML** (UML estándar).
- `docs/uml/png`: export de imágenes para el informe/entrega.
- `docs/notas/decisiones.md`: decisiones de modelado, supuestos y razones (opcional).

---

## Convenciones UML empleadas
- **Asociación 1:1**: línea sólida; opcional flecha abierta para dirección (uni o bidireccional).
- **Agregación 1:1**: rombo **blanco** en el lado del contenedor (la parte puede existir sin el todo).
- **Composición 1:1**: rombo **negro** en el lado del todo (ciclo de vida dependiente).
- **Bidireccional**: línea sólida sin flechas; multiplicidades en ambos extremos.
- **Dependencia**: línea discontinua con flecha; usar estereotipos `<<use>>` (uso) y `<<create>>` (creación).

---

## Herramientas recomendadas
- **PlantUML** como formato principal.
    - Plugin **IntelliJ IDEA**: “PlantUML Integration”
- **Alternativas para bosquejos**: UMLetino, draw.io, StarUML.
---

## Cómo ver / generar diagramas

### Opción VS Code
1. Instalar extensión *PlantUML*.
2. Abrir cualquier `.puml` en `docs/uml/plantuml`.
3. Usar *Preview* (vista previa) y exportar a PNG o SVG.

### Opción IntelliJ IDEA
1. Instalar plugin *PlantUML Integration*.
2. Abrir `.puml` y usar la vista previa integrada para exportar.
---

## Notas de modelado
- **Agregación**: el “todo” recibe la parte **ya creada**.
- **Composición**: el “todo” **crea** la parte internamente y la parte no vive sin el todo.
- **Dependencia**: relación temporal (`..>`), no se modela como atributo persistente.

---

## Licencia
Este material es de uso académico.