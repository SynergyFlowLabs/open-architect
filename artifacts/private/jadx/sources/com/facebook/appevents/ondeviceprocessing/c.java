package com.facebook.appevents.ondeviceprocessing;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.b1;
import com.facebook.appevents.p;
import com.facebook.g0;
import com.facebook.internal.e1;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c f99162a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Set<String> f99163b = SetsKt.setOf((Object[]) new String[]{p.f99212p, p.f99230y, p.A});

    private c() {
    }

    private final boolean c(com.facebook.appevents.e eVar) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return false;
        }
        try {
            return !eVar.h() || (eVar.h() && f99163b.contains(eVar.getName()));
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return false;
        }
    }

    @n
    public static final boolean d() {
        if (com.facebook.internal.instrument.crashshield.b.e(c.class)) {
            return false;
        }
        try {
            g0 g0Var = g0.f99617a;
            if (!g0.E(g0.n())) {
                e1 e1Var = e1.f99794a;
                if (!e1.W()) {
                    e eVar = e.f99166a;
                    if (e.b()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, c.class);
            return false;
        }
    }

    @n
    public static final void e(@NotNull final String applicationId, @NotNull final com.facebook.appevents.e event) {
        if (com.facebook.internal.instrument.crashshield.b.e(c.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(event, "event");
            if (f99162a.c(event)) {
                g0 g0Var = g0.f99617a;
                g0.y().execute(new Runnable() { // from class: com.facebook.appevents.ondeviceprocessing.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.f(applicationId, event);
                    }
                });
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, c.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(String applicationId, com.facebook.appevents.e event) {
        if (com.facebook.internal.instrument.crashshield.b.e(c.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(applicationId, "$applicationId");
            Intrinsics.checkNotNullParameter(event, "$event");
            e eVar = e.f99166a;
            e.c(applicationId, CollectionsKt.listOf(event));
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, c.class);
        }
    }

    @n
    public static final void g(@Nullable final String str, @Nullable final String str2) {
        if (com.facebook.internal.instrument.crashshield.b.e(c.class)) {
            return;
        }
        try {
            g0 g0Var = g0.f99617a;
            final Context contextN = g0.n();
            if (contextN == null || str == null || str2 == null) {
                return;
            }
            g0.y().execute(new Runnable() { // from class: com.facebook.appevents.ondeviceprocessing.a
                @Override // java.lang.Runnable
                public final void run() {
                    c.h(contextN, str2, str);
                }
            });
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, c.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(Context context, String str, String str2) {
        if (!com.facebook.internal.instrument.crashshield.b.e(c.class)) {
            try {
                Intrinsics.checkNotNullParameter(context, "$context");
                SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
                String strStringPlus = Intrinsics.stringPlus(str2, "pingForOnDevice");
                if (sharedPreferences.getLong(strStringPlus, 0L) == 0) {
                    e eVar = e.f99166a;
                    e.e(str2);
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.putLong(strStringPlus, System.currentTimeMillis());
                    editorEdit.apply();
                }
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, c.class);
            }
        }
    }
}
