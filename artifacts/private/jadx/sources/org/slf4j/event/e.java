package org.slf4j.event;

/* JADX INFO: loaded from: classes14.dex */
public enum e {
    ERROR(40, "ERROR"),
    WARN(30, "WARN"),
    INFO(20, "INFO"),
    DEBUG(10, "DEBUG"),
    TRACE(0, "TRACE");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f339598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f339599b;

    e(int i10, String str) {
        this.f339598a = i10;
        this.f339599b = str;
    }

    public static e l(int i10) {
        if (i10 == 0) {
            return TRACE;
        }
        if (i10 == 10) {
            return DEBUG;
        }
        if (i10 == 20) {
            return INFO;
        }
        if (i10 == 30) {
            return WARN;
        }
        if (i10 == 40) {
            return ERROR;
        }
        throw new IllegalArgumentException("Level integer [" + i10 + "] not recognized.");
    }

    public int n() {
        return this.f339598a;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f339599b;
    }
}
