package io.sentry.protocol;

import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public enum f0 {
    CUSTOM,
    URL,
    ROUTE,
    VIEW,
    COMPONENT,
    TASK;

    static {
        int i10 = 6 & 3;
    }

    public String apiName() {
        return name().toLowerCase(Locale.ROOT);
    }
}
