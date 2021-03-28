# loggerlibrary

#SETUP

Logger.setConfig(LoggerConfig(context))

#USE

Logger.d("logger library")

#ADVANCED

LoggerConfig loggerConfig = LoggerConfig.newBuilder(context)

  .setExportConsole(true)  // show log on console
  
  .setExportTxt(true)      // save log to txt file into app specific storage (storage/Android/data/com.hyvu.loggerapplication/files/LoggerOutput)
  
  .build()
  
 Logger.setConfig(loggerConfig)

#FLOWCHART

 ![image](https://user-images.githubusercontent.com/41892926/112708980-318fda00-8ee8-11eb-9110-04670c50ac78.png)
