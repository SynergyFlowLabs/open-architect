package com.google.android.gms.common.api.internal;

import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f106160a = Collections.newSetFromMap(new WeakHashMap());

    @NonNull
    @g6.a
    public static <L> o<L> a(@NonNull L l10, @NonNull Looper looper, @NonNull String str) {
        com.google.android.gms.common.internal.w.s(l10, "Listener must not be null");
        com.google.android.gms.common.internal.w.s(looper, "Looper must not be null");
        com.google.android.gms.common.internal.w.s(str, "Listener type must not be null");
        return new o<>(looper, l10, str);
    }

    @NonNull
    @g6.a
    public static <L> o<L> b(@NonNull L l10, @NonNull Executor executor, @NonNull String str) {
        com.google.android.gms.common.internal.w.s(l10, "Listener must not be null");
        com.google.android.gms.common.internal.w.s(executor, "Executor must not be null");
        com.google.android.gms.common.internal.w.s(str, "Listener type must not be null");
        return new o<>(executor, l10, str);
    }

    @NonNull
    @g6.a
    public static <L> o.a<L> c(@NonNull L l10, @NonNull String str) {
        com.google.android.gms.common.internal.w.s(l10, "Listener must not be null");
        com.google.android.gms.common.internal.w.s(str, "Listener type must not be null");
        com.google.android.gms.common.internal.w.m(str, "Listener type must not be empty");
        return new o.a<>(l10, str);
    }

    @NonNull
    public final o d(@NonNull Object obj, @NonNull Looper looper, @NonNull String str) {
        Set set = this.f106160a;
        o oVarA = a(obj, looper, "NO_TYPE");
        set.add(oVarA);
        return oVarA;
    }

    public final void e() {
        Iterator it = this.f106160a.iterator();
        while (it.hasNext()) {
            ((o) it.next()).a();
        }
        this.f106160a.clear();
    }
}
