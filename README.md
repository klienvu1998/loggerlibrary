# loggerlibrary

#SETUP

Logger.setConfig(LoggerConfig(context))

#USE

Logger.d("logger library")

#ADVANCED

LoggerConfig loggerConfig = LoggerConfig.newBuilder(context)
  .setExportConsole(true)  // show log on console
  .setExportTxt(true)      // save log to txt file into app specific storage
  .build()
  
 Logger.setConfig(loggerConfig)
