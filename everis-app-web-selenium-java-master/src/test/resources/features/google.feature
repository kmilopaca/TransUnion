#language:es
@DEMO
Característica: Prueba de concepto SpringBoot + Cucumber - GOOGLE

  @GOOGLE_SEARCH
  Escenario: caso1-Busqueda en google
    Dado que abro la pagina de google
    Cuando Selecciono Registro
    Y Nombre"Ivan Camilo", Apellido"Pacanchique", Telefono"3223599600", Correo "Kmilo.reg@gmail.com"
    Y Direcccion "calle 123", Ciudad"Bogota"
    Cuando nombre de usuario "Kmilo.reg@gmail.com", Contraseña "Kmilo.1032" ,Confirmar "Kmilo.1032"
    Y se guardan los cambios


  @GOOGLE_SETTINGS
  Escenario: caso2-Configuraciones en google
    Dado que abro la pagina de configuracio de google
    Cuando busco la opcion "Usuario"
    Entonces valido que el resultado sea "Autocompletar"
