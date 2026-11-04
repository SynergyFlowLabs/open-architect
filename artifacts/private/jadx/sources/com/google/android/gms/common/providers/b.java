package com.google.android.gms.common.providers;

import com.google.android.gms.internal.common.w;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes4.dex */
final class b implements a.InterfaceC0971a {
    b() {
    }

    @Override // com.google.android.gms.common.providers.a.InterfaceC0971a
    public final ScheduledExecutorService a() {
        w.a();
        return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
    }
}
