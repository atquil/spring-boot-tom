# telemetry-observability-monitoring

Welcome to the Spring Boot TOM (Telemetry, Observability, and Monitoring) Tutorials repository! This series is designed to help you master the essential tools and techniques for monitoring and observing your Spring Boot applications.

## Repository Structure
This repository is organized into feature branches, each dedicated to a specific tool or concept. Each branch contains code examples, configurations, and a corresponding YouTube tutorial to guide you through the setup and usage

| **Category**       | **Tools/Concepts**                                                                  | **Description**                                                                                             | Topics                                                                              | Youtube Link |
|--------------------|-------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------|--------------|
| **/telemetry**     |                                                                                     |                                                                                                             |                                                                                     |              |
|                    | OpenTelemetry                                                                       | A set of APIs, libraries, agents, and instrumentation to collect telemetry data (logs, metrics, traces).    |                                                                                     |              |
|                    | Micrometer                                                                          | A metrics instrumentation library for JVM-based applications.                                               |                                                                                     |              |
|                    | Zipkin                                                                              | A distributed tracing system that helps gather timing data needed to troubleshoot latency problems.         |                                                                                     |              |
|                    | Jaeger                                                                              | An open-source, end-to-end distributed tracing tool.                                                        |                                                                                     |              |
| **/observability** |                                                                                     |                                                                                                             |                                                                                     |              |
|                    | Grafana                                                                             | A multi-platform open-source analytics and interactive visualization web application.                       |                                                                                     |              |                                                                                                             |
|                    | Prometheus                                                                          | An open-source systems monitoring and alerting toolkit, often used for metrics collection and querying.     |                                                                                     |              |
|                    | Elastic Stack (ELK)                                                                 | A suite of tools (Elasticsearch, Logstash, Kibana) for searching, analyzing, and visualizing log data.      |                                                                                     |              |
|                    | Fluentd                                                                             | An open-source data collector for unified logging layer.                                                    |                                                                                     |              |
| **/monitoring**    |                                                                                     |
|                    | **[/actuator](https://github.com/atquil/spring-boot-tom/tree/monitoring/actuator)** | Provides production-ready features to help you monitor and manage your application.                         | `default API`,`custom API`, `custom groups`, `extension`, `security`, `logFile` etc |              |                                                                                                   |
|                    | Nagios                                                                              | A powerful monitoring system that enables organizations to identify and resolve IT infrastructure problems. |                                                                                     |              |
|                    | Zabbix                                                                              | An enterprise-class open-source distributed monitoring solution.                                            |                                                                                     |              |
|                    | New Relic                                                                           | A cloud-based observability platform that helps monitor and manage application performance.                 |                                                                                     |              |
