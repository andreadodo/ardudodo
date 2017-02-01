package android.vm.ardudodo.ui.adapters;

import static android.vm.ardudodo.models.HouseIndex.*;

/**
 * Created by andrea on 01/02/17.
 */

public class requestAdapter {
    private int id, cmd;
    private String message="";

    public requestAdapter(){
        message= String.valueOf((char)START + (char)ENQ + (char)0 + (char)0 + (char)STOP);
    }

    public requestAdapter(int id, boolean cmd) {
        if(id>100&&id<200) {
            this.id=id+100; //-100+200
            if(cmd == true) this.cmd = ON;
            else if(cmd == false) this.cmd = OFF;
        }
        message= String.valueOf((char)START + (char)LGT + (char)this.id + (char)this.cmd + (char)STOP);
    }

    public requestAdapter(int id, int cmd) {
        if (id>200&&id<300) {
            this.id = id; //-200+200
            if (cmd >= 0 && cmd <= 100)
                this.cmd = cmd + 100;
            message= String.valueOf((char)START + (char)TAP + (char)this.id + (char)this.cmd + (char)STOP);
        }
    }

    public String getMessage() {
        return message;
    }
}





