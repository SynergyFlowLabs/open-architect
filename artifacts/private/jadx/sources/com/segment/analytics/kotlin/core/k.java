package com.segment.analytics.kotlin.core;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nErrors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Errors.kt\ncom/segment/analytics/kotlin/core/ErrorsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,59:1\n1#2:60\n*E\n"})
public final class k {
    public static final void a(@Nullable a aVar, @NotNull Throwable error, @NotNull String message, @NotNull String metric, @NotNull String log, @NotNull Function1<? super Map<String, String>, Unit> buildTags) {
        f fVarU;
        Function1<Throwable, Unit> function1Y;
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(metric, "metric");
        Intrinsics.checkNotNullParameter(log, "log");
        Intrinsics.checkNotNullParameter(buildTags, "buildTags");
        if (aVar != null && (fVarU = aVar.u()) != null && (function1Y = fVarU.y()) != null) {
            function1Y.invoke(error);
        }
        String message2 = error.getMessage();
        if (message2 != null) {
            message = message + ": " + message2;
        }
        vf.f.b(a.Companion, message, null, 2, null);
        w.f267062a.f(metric, log, buildTags);
    }

    public static final void b(@NotNull a.b bVar, @NotNull String error) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(error, "error");
        vf.f.b(a.Companion, error, null, 2, null);
    }

    public static final void c(@NotNull a.b bVar, @NotNull Throwable error) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(error, "error");
        String message = error.getMessage();
        if (message != null) {
            vf.f.b(a.Companion, message, null, 2, null);
        }
    }

    public static final void d(@NotNull a aVar, @NotNull Throwable error) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(error, "error");
        Function1<Throwable, Unit> function1Y = aVar.u().y();
        if (function1Y != null) {
            function1Y.invoke(error);
        }
        c(a.Companion, error);
    }
}
