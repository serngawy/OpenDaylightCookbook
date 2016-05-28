
 Feature Descriptor Demo
 =======================

 Build code with "mvn install".

 Deployment:

 karaf@root()> feature:repo-add mvn:com.packt/opendaylight-features-file/1.0.0-SNAPSHOT/xml/features 

 karaf@root()> feature:install recipe4-all-modules 
 Apache Karaf starting moduleA bundle
 Apache Karaf starting moduleB bundle
 karaf@root()> list
 START LEVEL 100 , List Threshold: 50
 ID | State  | Lvl | Version        | Name                            
 ---------------------------------------------------------------------
 91 | Active |  80 | 1.0.0.SNAPSHOT | Chapter 10 :: Recipe 7 :: moduleA
 92 | Active |  80 | 1.0.0.SNAPSHOT | Chapter 10 :: Recipe 7 :: moduleB
 karaf@root()>
