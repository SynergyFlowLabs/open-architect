package com.superwall.sdk.paywall.presentation.rule_logic.cel;

import kotlin.enums.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public interface InPeriod {

    public enum Period {
        HOUR,
        DAY,
        WEEK,
        MONTH,
        INSTALL;

        private static final /* synthetic */ kotlin.enums.a $ENTRIES = c.c(values());

        static {
            int i10 = 6 | 3;
        }

        @NotNull
        public static kotlin.enums.a<Period> getEntries() {
            return $ENTRIES;
        }
    }

    @NotNull
    String getEvent();
}
