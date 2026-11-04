package io.sentry.clientreport;

import io.sentry.da;

/* JADX INFO: loaded from: classes11.dex */
public enum f {
    QUEUE_OVERFLOW("queue_overflow"),
    CACHE_OVERFLOW("cache_overflow"),
    RATELIMIT_BACKOFF("ratelimit_backoff"),
    NETWORK_ERROR("network_error"),
    SAMPLE_RATE(da.b.f305377g),
    BEFORE_SEND("before_send"),
    EVENT_PROCESSOR("event_processor"),
    BACKPRESSURE("backpressure");

    private final String reason;

    static {
        int i10 = 2 << 1;
    }

    f(String str) {
        this.reason = str;
    }

    public String getReason() {
        return this.reason;
    }
}
