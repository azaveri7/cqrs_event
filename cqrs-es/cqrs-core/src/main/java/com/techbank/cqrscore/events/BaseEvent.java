package com.techbank.cqrscore.events;

import com.techbank.cqrscore.messages.Message;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@SuperBuilder
public abstract class BaseEvent extends Message {
    private int version;
}
