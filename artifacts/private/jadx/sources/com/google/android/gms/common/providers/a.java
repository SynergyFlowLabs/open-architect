package com.google.android.gms.common.providers;

import androidx.annotation.NonNull;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
@Deprecated
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static InterfaceC0971a f106804a;

    /* JADX INFO: renamed from: com.google.android.gms.common.providers.a$a, reason: collision with other inner class name */
    public interface InterfaceC0971a {
        @NonNull
        @g6.a
        @Deprecated
        ScheduledExecutorService a();
    }

    private a() {
    }

    @NonNull
    @g6.a
    @Deprecated
    public static synchronized InterfaceC0971a a() {
        try {
            if (f106804a == null) {
                f106804a = new b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f106804a;
    }
}
