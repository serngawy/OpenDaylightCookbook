
 Making a custom OpenDaylight BE command.
 ========================================

 OpenDaylight BE is based upon the Apache Karaf 3.0.4 container.
 We can use Apache Karaf's Maven archetype to generate a
 custom command project.  

 The below Maven Archetype will generate a project structure
 for the development of an Apache Karaf command. You should
 select the archetypeVersion to match the Karaf version.

 mvn archetype:generate \
  -DarchetypeGroupId=org.apache.karaf.archetypes \
  -DarchetypeArtifactId=karaf-command-archetype \
  -DarchetypeVersion=3.0.4 \
  -DgroupId=com.mycompany \
  -DartifactId=com.mycompany.command \
  -Dversion=1.0.0-SNAPSHOT \
  -Dpackage=com.mycompany.package

 When the archetype is executed you will be presented
 with several choices as below:

Define value for property 'command': : sample
Define value for property 'description': : a sample custom command
Define value for property 'scope': : cookbook

 Above we provided a command name "sample", a description of
 our sample command, and a command family scope of "cookbook".

 Sample Invocation:
 ------------------

 mvn archetype:generate \
  -DarchetypeGroupId=org.apache.karaf.archetypes \
  -DarchetypeArtifactId=karaf-command-archetype \
  -DarchetypeVersion=3.0.4 \
  -DgroupId=com.packt.chapter10 \
  -DartifactId=command \
  -Dversion=1.0.0-SNAPSHOT \ 
  -Dpackage=com.packt

 Sample installation of Bundle into ODL BE
 -----------------------------------------
 
 karaf@root()> install mvn:com.packt/odl-be-command
 Bundle ID: 88
 karaf@root()>

 Sample invocation in ODL BE 
 ---------------------------
 
 karaf@root()> cookbook:sample -o 4 test
 Executing command sample
 Option: 4
 Argument: test
 karaf@root()

 Sample invocation without specifying scope
 ------------------------------------------

 karaf@root()> sample -o 4 test
 Executing command sample
 Option: 4
 Argument: test
 karaf@root()>
