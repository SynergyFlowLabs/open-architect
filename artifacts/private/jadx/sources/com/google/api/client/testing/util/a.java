package com.google.api.client.testing.util;

import com.google.api.client.util.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

/* JADX INFO: loaded from: classes4.dex */
@com.google.api.client.util.f
public class a extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<LogRecord> f116020a = w.a();

    public List<String> a() {
        ArrayList arrayListA = w.a();
        Iterator<LogRecord> it = this.f116020a.iterator();
        while (it.hasNext()) {
            arrayListA.add(it.next().getMessage());
        }
        return arrayListA;
    }

    @Override // java.util.logging.Handler
    public void close() throws SecurityException {
    }

    @Override // java.util.logging.Handler
    public void flush() {
    }

    @Override // java.util.logging.Handler
    public void publish(LogRecord logRecord) {
        this.f116020a.add(logRecord);
    }
}
