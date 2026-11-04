package androidx.work.impl.utils;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nProcessUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProcessUtils.kt\nandroidx/work/impl/utils/ProcessUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,88:1\n1#2:89\n*E\n"})
@oj.i(name = "ProcessUtils")
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final String f77274a;

    static {
        String strI = androidx.work.v.i("ProcessUtils");
        Intrinsics.checkNotNullExpressionValue(strI, "tagWithPrefix(\"ProcessUtils\")");
        f77274a = strI;
    }

    @e.a({"PrivateApi", "DiscouragedPrivateApi"})
    private static final String a(Context context) {
        return a.f77160a.a();
    }

    public static final boolean b(@NotNull Context context, @NotNull androidx.work.c configuration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        String strA = a(context);
        String strC = configuration.c();
        return (strC == null || strC.length() == 0) ? Intrinsics.areEqual(strA, context.getApplicationInfo().processName) : Intrinsics.areEqual(strA, configuration.c());
    }
}
