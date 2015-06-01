# Dynatrace Service Broker
[![Build Status](https://api.travis-ci.org/hmlingesh/dynatrace-service-broker.svg?branch=master)](https://api.travis-ci.org/hmlingesh/dynatrace-service-broker.svg)

This project is a self-hostable application that provides a service broker that proxies DynaTrace credentials to applications.  This is typically useful for on-premise deployments of Cloud Foundry that wish to easily bind to an off-premise DynaTrace deployment.  In order to facilitate self-hosting, the application is designed to work in [Cloud Foundry][p].

## Requirements

### Java, Maven
The application is written in Java and packaged as a self executable JAR file.  This enables it to run in anywhere that Java is available.  Building the application (required for deployment) requires [Maven][v].

## Deployment
_The following instructions assume that you have [created an account][c] and [installed the `cf` command line tool][l]._

In order to automate the deployment process as much as possible, the project contains a Cloud Foundry [manifest][m].  To deploy run the following commands:

```bash
$ mvn package
$ cf push
```
## Gradlew setup
_This project has enabled for gradle build. 

build.gradle - this file has enabled for spring-boot plugin and  source and target jdk for 1.8+.

```bash
$ gradle build
$ cf push <app-name> -p /build/libs/dynatrace-service-broker-1.0.0-SNAPSHOT.jar
```


### Environment Variables
Since the application is designed to work in a PaaS environment, all configuration is done with environment variables.  The `server` and `profile` value is the only one that is provided by Dynatrace.  All others are unique to a deployment.

| Key | Description
| --- | -----------
| `server` | The Dynatrace server ip with portnumber to provide to all applications.  
| `profile` | The profile that can used for mentioning agent-name during setting java agent path.  This can be any value.


## Developing
The project is set up as a Maven project and doesn't have any special requirements beyond that.


## License
The project is released under version 2.0 of the [Apache License][a].

[a]: http://www.apache.org/licenses/LICENSE-2.0
[c]: http://docs.cloudfoundry.com/docs/dotcom/getting-started.html#signup
[l]: http://docs.cloudfoundry.com/docs/dotcom/getting-started.html#install-cf
[m]: manifest.yml
[p]: http://run.pivotal.io
[u]: http://www.famkruithof.net/uuid/uuidgen
[v]: http://maven.apache.org
