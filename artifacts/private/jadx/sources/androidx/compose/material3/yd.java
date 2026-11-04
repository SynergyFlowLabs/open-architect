package androidx.compose.material3;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.k7
@SourceDebugExtension({"SMAP\nNavigationDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/DrawerPredictiveBackState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,1315:1\n85#2:1316\n117#2,2:1317\n81#3:1319\n114#3,2:1320\n81#3:1322\n114#3,2:1323\n*S KotlinDebug\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/DrawerPredictiveBackState\n*L\n1194#1:1316\n1194#1:1317,2\n1196#1:1319\n1196#1:1320,2\n1198#1:1322\n1198#1:1323,2\n*E\n"})
public final class yd {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f34753d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f34754a = androidx.compose.runtime.d7.g(Boolean.TRUE, null, 2, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.k3 f34755b = androidx.compose.runtime.g4.b(0.0f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.k3 f34756c = androidx.compose.runtime.g4.b(0.0f);

    public final void a() {
        g(true);
        e(0.0f);
        f(0.0f);
    }

    public final float b() {
        return this.f34755b.V0();
    }

    public final float c() {
        return this.f34756c.V0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean d() {
        return ((Boolean) this.f34754a.getValue()).booleanValue();
    }

    public final void e(float f10) {
        this.f34755b.q(f10);
    }

    public final void f(float f10) {
        this.f34756c.q(f10);
    }

    public final void g(boolean z10) {
        this.f34754a.setValue(Boolean.valueOf(z10));
    }

    public final void h(float f10, boolean z10, boolean z11, float f11, float f12, float f13) {
        g(z10 != z11);
        if (!d()) {
            f11 = f12;
        }
        e(androidx.compose.ui.util.e.r(0.0f, f11, f10));
        f(androidx.compose.ui.util.e.r(0.0f, f13, f10));
    }
}
