package com.sun.jna;

/* JADX INFO: loaded from: classes13.dex */
public class CallbackThreadInitializer {
    private boolean daemon;
    private boolean detach;
    private ThreadGroup group;
    private String name;

    public CallbackThreadInitializer() {
        this(true);
    }

    public boolean detach(Callback callback) {
        return this.detach;
    }

    public String getName(Callback callback) {
        return this.name;
    }

    public ThreadGroup getThreadGroup(Callback callback) {
        return this.group;
    }

    public boolean isDaemon(Callback callback) {
        return this.daemon;
    }

    public CallbackThreadInitializer(boolean z10) {
        this(z10, false);
    }

    public CallbackThreadInitializer(boolean z10, boolean z11) {
        this(z10, z11, null);
    }

    public CallbackThreadInitializer(boolean z10, boolean z11, String str) {
        this(z10, z11, str, null);
    }

    public CallbackThreadInitializer(boolean z10, boolean z11, String str, ThreadGroup threadGroup) {
        this.daemon = z10;
        this.detach = z11;
        this.name = str;
        this.group = threadGroup;
    }
}
