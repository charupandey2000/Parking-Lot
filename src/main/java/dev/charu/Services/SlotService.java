package dev.charu.Services;

import dev.charu.Models.Slot;
import dev.charu.Repository.SlotRepository;

public class SlotService {
    SlotRepository slotRepository=new SlotRepository();

    public Slot createnewslot(Slot slot){
        return slotRepository.save(slot);

    }

    public Slot getslotwithstatusFree(){
        return slotRepository.findSlotstatusFree();
    }
}
