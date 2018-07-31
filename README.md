# spring-scheduled
The main goal of this project is to explore basic features of the Spring 
build-in job scheduler.

_Reference_: https://spring.io/guides/gs/scheduling-tasks/  

Please refer my other project concerning job scheduling: [quartz](https://github.com/mtumilowicz/quartz).

# preface
Difference between Spring build-in scheduler: 
[comparison quartz vs spring scheduler](http://khalidsaleem.blogspot.com/2015/03/quartz-scheduler-vs-spring-scheduler.html)

In short words:
* Quartz Scheduler provides support for enterprise level features like 
JTA and clustering. It comes with `JobPersistence` support that can be extremely 
beneficial for failed jobs as well as reporting purposes.  
    _Remark_: In case, you need to implement the cluster across multiple 
    machines, a time sync service daemon like 
    http://www.boulder.nist.gov/timefreq/service/its.htm should be used to 
    ensure that clocks are synchronized between these machines that are part 
    of the cluster.
    
# manual
* **SimpleJob** (`SimpleJob.java`) - `@Component` class with `@Scheduled` method  
    example:
    ```
    @Scheduled(fixedRate = 2000)
    ```

* **CronJob** (`CronJob.java`) - `@Component` class with `@Scheduled(cron = "...")` method  
    possible patterns:
    * https://docs.spring.io/spring/docs/current/javadoc-api/org/springframework/scheduling/support/CronSequenceGenerator.html
    * https://www.manpagez.com/man/5/crontab/