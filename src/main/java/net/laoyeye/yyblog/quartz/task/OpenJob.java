package net.laoyeye.yyblog.quartz.task;

import net.laoyeye.yyblog.common.utils.DateUtils;
import org.apache.commons.lang3.StringUtils;
import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.stereotype.Component;

import java.util.Date;

@DisallowConcurrentExecution //作业不并发
@Component
public class OpenJob implements Job{

    @Override
    public void execute(JobExecutionContext arg0) throws JobExecutionException {

        if(StringUtils.isNotBlank(arg0.getJobDetail().getJobDataMap().get("taskId").toString())){
            if(arg0.getJobDetail().getJobDataMap().get("taskId").toString().equals("32")){
                System.out.println("开灯任务1-----taskId："+arg0.getJobDetail().getJobDataMap().get("taskId") +"----时间："+ DateUtils.fullTime(new Date()));
            }else{
                System.out.println("开灯任务2-----taskId："+arg0.getJobDetail().getJobDataMap().get("taskId") +"----时间："+ DateUtils.fullTime(new Date()));
            }
        }
    }
}