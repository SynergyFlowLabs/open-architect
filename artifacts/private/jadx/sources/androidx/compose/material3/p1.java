package androidx.compose.material3;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nAppBarDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBarDsl.kt\nandroidx/compose/material3/AppBarMenuState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,403:1\n85#2:404\n117#2,2:405\n*S KotlinDebug\n*F\n+ 1 AppBarDsl.kt\nandroidx/compose/material3/AppBarMenuState\n*L\n243#1:404\n243#1:405,2\n*E\n"})
public final class p1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f31528b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f31529a = androidx.compose.runtime.d7.g(Boolean.FALSE, null, 2, null);

    private final void c(boolean z10) {
        this.f31529a.setValue(Boolean.valueOf(z10));
    }

    public final void a() {
        c(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b() {
        return ((Boolean) this.f31529a.getValue()).booleanValue();
    }

    public final void d() {
        c(true);
    }
}
