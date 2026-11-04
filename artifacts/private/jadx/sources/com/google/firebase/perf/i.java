package com.google.firebase.perf;

import com.google.firebase.perf.metrics.Trace;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.h0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nPerformance.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Performance.kt\ncom/google/firebase/perf/PerformanceKt\n*L\n1#1,68:1\n49#1,5:69\n*S KotlinDebug\n*F\n+ 1 Performance.kt\ncom/google/firebase/perf/PerformanceKt\n*L\n61#1:69,5\n*E\n"})
public final class i {
    @NotNull
    public static final e a(@NotNull com.google.firebase.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        e eVarC = e.c();
        Intrinsics.checkNotNullExpressionValue(eVarC, "getInstance()");
        return eVarC;
    }

    public static final <T> T b(@NotNull Trace trace, @NotNull Function1<? super Trace, ? extends T> block) {
        Intrinsics.checkNotNullParameter(trace, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        trace.start();
        try {
            T tInvoke = block.invoke(trace);
            h0.d(1);
            trace.stop();
            h0.c(1);
            return tInvoke;
        } catch (Throwable th2) {
            h0.d(1);
            trace.stop();
            h0.c(1);
            throw th2;
        }
    }

    public static final <T> T c(@NotNull String name, @NotNull Function1<? super Trace, ? extends T> block) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(block, "block");
        Trace traceC = Trace.c(name);
        Intrinsics.checkNotNullExpressionValue(traceC, "create(name)");
        traceC.start();
        try {
            T tInvoke = block.invoke(traceC);
            h0.d(1);
            traceC.stop();
            h0.c(1);
            return tInvoke;
        } catch (Throwable th2) {
            h0.d(1);
            traceC.stop();
            h0.c(1);
            throw th2;
        }
    }

    public static final void d(@NotNull com.google.firebase.perf.metrics.h hVar, @NotNull Function1<? super com.google.firebase.perf.metrics.h, Unit> block) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        hVar.h();
        try {
            block.invoke(hVar);
            h0.d(1);
            hVar.i();
            h0.c(1);
        } catch (Throwable th2) {
            h0.d(1);
            hVar.i();
            h0.c(1);
            throw th2;
        }
    }
}
