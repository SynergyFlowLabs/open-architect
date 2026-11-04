package io.intercom.android.sdk.metrics.ops;

/* JADX INFO: loaded from: classes13.dex */
public class OpsEvent {
    private final String eventType;
    private final String name;
    private final long timestamp;

    public OpsEvent(String str, String str2, long j10) {
        this.eventType = str;
        this.name = str2;
        this.timestamp = j10;
    }

    public String getEventType() {
        return this.eventType;
    }

    public String getName() {
        return this.name;
    }

    public long getTimestamp() {
        return this.timestamp;
    }
}
