package com.google.android.gms.internal.play_billing;

import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
final class k4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i0 f109159a = new i0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f109160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile Logger f109161c;

    k4(Class cls) {
        this.f109160b = cls.getName();
    }

    final Logger a() {
        Logger logger = this.f109161c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f109159a) {
            try {
                Logger logger2 = this.f109161c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f109160b);
                this.f109161c = logger3;
                return logger3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
