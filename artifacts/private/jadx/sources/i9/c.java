package i9;

import com.google.firebase.ktx.Firebase;
import com.google.firebase.perf.e;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.metrics.h;
import kotlin.Unit;
import kotlin.b1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.h0;
import kotlin.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nPerformance.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Performance.kt\ncom/google/firebase/perf/ktx/PerformanceKt\n*L\n1#1,117:1\n78#1,5:118\n*S KotlinDebug\n*F\n+ 1 Performance.kt\ncom/google/firebase/perf/ktx/PerformanceKt\n*L\n99#1:118,5\n*E\n"})
public final class c {
    @NotNull
    public static final e a(@NotNull Firebase firebase) {
        Intrinsics.checkNotNullParameter(firebase, "<this>");
        e eVarC = e.c();
        Intrinsics.checkNotNullExpressionValue(eVarC, "getInstance()");
        return eVarC;
    }

    @l(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.", replaceWith = @b1(expression = "", imports = {}))
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

    @l(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.", replaceWith = @b1(expression = "", imports = {}))
    public static final <T> T c(@NotNull String name, @NotNull Function1<? super Trace, ? extends T> block) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(block, "block");
        Trace traceC = Trace.c(name);
        Intrinsics.checkNotNullExpressionValue(traceC, "create(name)");
        traceC.start();
        try {
            T tInvoke = block.invoke(traceC);
            h0.d(1);
            return tInvoke;
        } finally {
            h0.d(1);
            traceC.stop();
            h0.c(1);
        }
    }

    @l(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.", replaceWith = @b1(expression = "", imports = {}))
    public static final void d(@NotNull h hVar, @NotNull Function1<? super h, Unit> block) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        hVar.h();
        try {
            block.invoke(hVar);
            h0.d(1);
            hVar.i();
        } finally {
            h0.d(1);
            hVar.i();
            h0.c(1);
        }
    }
}
