package com.facebook.appevents.iap;

import android.content.Context;
import androidx.annotation.b1;
import kotlin.jvm.internal.Intrinsics;
import oj.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f f98900a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f98901b = "com.android.billingclient.api.Purchase";

    private f() {
    }

    private final void c() {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            j jVar = j.f98960a;
            h.b bVar = h.f98904s;
            j.e(bVar.d(), bVar.e());
            bVar.d().clear();
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    @n
    public static final void d(@NotNull Context context) {
        h.b bVar;
        h hVarC;
        if (!com.facebook.internal.instrument.crashshield.b.e(f.class)) {
            try {
                Intrinsics.checkNotNullParameter(context, "context");
                m mVar = m.f98989a;
                if (m.a(f98901b) != null && (hVarC = (bVar = h.f98904s).c(context)) != null && bVar.f().get()) {
                    j jVar = j.f98960a;
                    if (j.d()) {
                        hVarC.q("inapp", new Runnable() { // from class: com.facebook.appevents.iap.d
                            @Override // java.lang.Runnable
                            public final void run() {
                                f.e();
                            }
                        });
                        return;
                    }
                    hVarC.p("inapp", new Runnable() { // from class: com.facebook.appevents.iap.e
                        @Override // java.lang.Runnable
                        public final void run() {
                            f.f();
                        }
                    });
                }
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, f.class);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e() {
        if (com.facebook.internal.instrument.crashshield.b.e(f.class)) {
            return;
        }
        try {
            f98900a.c();
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, f.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f() {
        if (com.facebook.internal.instrument.crashshield.b.e(f.class)) {
            return;
        }
        try {
            f98900a.c();
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, f.class);
        }
    }
}
