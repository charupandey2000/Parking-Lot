package dev.charu.Genrator;

import java.util.concurrent.atomic.AtomicLong;

public class parkingLotId {

    public static AtomicLong id=new AtomicLong();

    public static long id(){
          return id.getAndIncrement();
    }
}
