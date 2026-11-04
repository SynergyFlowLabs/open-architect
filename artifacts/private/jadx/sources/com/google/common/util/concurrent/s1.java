package com.google.common.util.concurrent;

import java.util.logging.Logger;

/* JADX INFO: loaded from: classes5.dex */
@o0
@com.google.common.annotations.b
final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f120321a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f120322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile Logger f120323c;

    s1(Class<?> ownerOfLogger) {
        this.f120322b = ownerOfLogger.getName();
    }

    Logger a() {
        Logger logger = this.f120323c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f120321a) {
            try {
                Logger logger2 = this.f120323c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f120322b);
                this.f120323c = logger3;
                return logger3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
