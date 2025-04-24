package org.apache.flink.playgrounds.spendreport;


import org.apache.flink.table.annotation.DataTypeHint;
import org.apache.flink.table.functions.ScalarFunction;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * <h3>flink-playgrounds</h3>
 *
 * @author NOHI
 * @description <p>Floor</p>
 * @date 2025/04/22 21:47
 **/
public class MyFloor extends ScalarFunction {

    public @DataTypeHint("TIMESTAMP(3)") LocalDateTime eval(@DataTypeHint("TIMESTAMP(3)") LocalDateTime timestamp) {
        return timestamp.truncatedTo(ChronoUnit.HOURS);
    }
}
