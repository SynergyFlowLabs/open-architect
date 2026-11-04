package androidx.paging;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
public final class g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final String f72015a = "Paging";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f72016b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f72017c = 3;

    public static final void a(@androidx.annotation.g0(from = 2, to = 3) int i10, @Nullable Throwable th2, @NotNull Function0<String> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        f2 f2Var = f2.f71875a;
        if (f2Var.a(i10)) {
            f2Var.b(i10, block.invoke(), th2);
        }
    }

    public static /* synthetic */ void b(int i10, Throwable th2, Function0 block, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            th2 = null;
        }
        Intrinsics.checkNotNullParameter(block, "block");
        f2 f2Var = f2.f71875a;
        if (f2Var.a(i10)) {
            f2Var.b(i10, (String) block.invoke(), th2);
        }
    }
}
