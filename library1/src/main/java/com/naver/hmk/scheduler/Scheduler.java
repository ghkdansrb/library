package com.naver.hmk.scheduler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.naver.hmk.repository.LibraryDao;

@Component
public class Scheduler {
	
	@Autowired
    private LibraryDao libraryDao;
     
    //매초 00 마다 스케줄러가 실행된다
    @Scheduled(cron = "0 * * * * *")
    public void cronTest1(){
    	System.out.println("---discard bookScheduler 작동---");
        try {
            int value = libraryDao.discardBook();
            if(value>0){
            	System.out.println("---폐기예정일이 넘은 도서 "+value+"개가 삭제되었습니다.---");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
