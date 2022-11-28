package org.example.DataGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


import java.sql.Timestamp;


@Getter
@Setter
public class PhoneData {
    public Long callId;
    public String callerName;
    public String calleeName;
    public String callerPhone;
    public String calleePhone;
    public Timestamp timeStamp;
    public int Duration;
}
