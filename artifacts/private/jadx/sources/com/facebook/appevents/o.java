package com.facebook.appevents;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final o f99155a = new o();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f99156b = o.class.getName();

    private o() {
    }

    @oj.n
    public static final synchronized void a(@NotNull a accessTokenAppIdPair, @NotNull h0 appEvents) {
        try {
            if (com.facebook.internal.instrument.crashshield.b.e(o.class)) {
                return;
            }
            try {
                Intrinsics.checkNotNullParameter(accessTokenAppIdPair, "accessTokenAppIdPair");
                Intrinsics.checkNotNullParameter(appEvents, "appEvents");
                com.facebook.appevents.internal.g gVar = com.facebook.appevents.internal.g.f99011a;
                com.facebook.appevents.internal.g.b();
                g gVar2 = g.f98867a;
                g0 g0VarA = g.a();
                g0VarA.a(accessTokenAppIdPair, appEvents.e());
                g.b(g0VarA);
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, o.class);
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @oj.n
    public static final synchronized void b(@NotNull f eventsToPersist) {
        try {
            if (com.facebook.internal.instrument.crashshield.b.e(o.class)) {
                return;
            }
            try {
                Intrinsics.checkNotNullParameter(eventsToPersist, "eventsToPersist");
                com.facebook.appevents.internal.g gVar = com.facebook.appevents.internal.g.f99011a;
                com.facebook.appevents.internal.g.b();
                g gVar2 = g.f98867a;
                g0 g0VarA = g.a();
                for (a aVar : eventsToPersist.f()) {
                    h0 h0VarC = eventsToPersist.c(aVar);
                    if (h0VarC == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    g0VarA.a(aVar, h0VarC.e());
                }
                g gVar3 = g.f98867a;
                g.b(g0VarA);
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, o.class);
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }
}
