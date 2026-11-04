package io.sentry.ndk;

/* JADX INFO: loaded from: classes11.dex */
public enum c {
    SENTRY_HANDLER_STRATEGY_DEFAULT(0),
    SENTRY_HANDLER_STRATEGY_CHAIN_AT_START(1);

    private final int value;

    c(int i10) {
        this.value = i10;
    }

    public int getValue() {
        return this.value;
    }
}
