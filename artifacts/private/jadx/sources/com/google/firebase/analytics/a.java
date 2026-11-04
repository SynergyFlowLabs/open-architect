package com.google.firebase.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.firebase.q;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private static volatile FirebaseAnalytics f120686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Object f120687b = new Object();

    @p0
    public static final FirebaseAnalytics a() {
        return f120686a;
    }

    @NotNull
    public static final FirebaseAnalytics b(@NonNull com.google.firebase.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        if (f120686a == null) {
            synchronized (f120687b) {
                try {
                    if (f120686a == null) {
                        f120686a = FirebaseAnalytics.getInstance(q.c(com.google.firebase.d.f121972a).n());
                    }
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        FirebaseAnalytics firebaseAnalytics = f120686a;
        Intrinsics.checkNotNull(firebaseAnalytics);
        return firebaseAnalytics;
    }

    @NotNull
    public static final Object c() {
        return f120687b;
    }

    public static final void d(@NonNull FirebaseAnalytics firebaseAnalytics, @NonNull String name, @NonNull Function1<? super d, Unit> block) {
        Intrinsics.checkNotNullParameter(firebaseAnalytics, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(block, "block");
        d dVar = new d();
        block.invoke(dVar);
        firebaseAnalytics.c(name, dVar.a());
    }

    public static final void e(@Nullable FirebaseAnalytics firebaseAnalytics) {
        f120686a = firebaseAnalytics;
    }

    public static final void f(@NonNull FirebaseAnalytics firebaseAnalytics, @NonNull Function1<? super b, Unit> block) {
        Intrinsics.checkNotNullParameter(firebaseAnalytics, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        b bVar = new b();
        block.invoke(bVar);
        firebaseAnalytics.f(bVar.a());
    }
}
