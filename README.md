# VLISC902-students
```
$ git clone -b develop https://github.com/devdan-um/VLISC902-students.git
```

crear una nueva rama a partir de la rama de desarrollo, verificar que estan en la rama de dearrollo
```
$ git branch 
```
Se crea una rama a partir de la rama de desarrollo y se verifica que la nueva rama creada exista y se este trabajando en ella
```
$ git checkout -b feature/<identificadr_de_tu_cambio>
$ git branch  
```
Una vez que se realicen los cambios correspondientes agregan todos los archivos que modificaron y agregaron
```
$ git add README.md
$ git commit -m "descripcion significativa del cambio"
```
Para subir sus cambios 
```
$ git push origin feature/<identificadr_de_tu_cambio>
```