package androidx.compose.ui.layout;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nOnRemeasuredModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnRemeasuredModifier.kt\nandroidx/compose/ui/layout/OnSizeChangedNode\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,108:1\n30#2:109\n30#2:111\n80#3:110\n80#3:112\n*S KotlinDebug\n*F\n+ 1 OnRemeasuredModifier.kt\nandroidx/compose/ui/layout/OnSizeChangedNode\n*L\n78#1:109\n84#1:111\n78#1:110\n84#1:112\n*E\n"})
final class z1 extends androidx.compose.ui.a0.d implements androidx.compose.ui.node.f0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private Function1<? super androidx.compose.ui.unit.u, Unit> f39598s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f39599t = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f39600v;

    public z1(@NotNull Function1<? super androidx.compose.ui.unit.u, Unit> function1) {
        this.f39598s = function1;
        long j10 = Integer.MIN_VALUE;
        this.f39600v = androidx.compose.ui.unit.u.e((j10 & com.rabbitmq.client.k0.f265952a) | (j10 << 32));
    }

    @Override // androidx.compose.ui.a0.d
    public boolean X8() {
        return this.f39599t;
    }

    @Override // androidx.compose.ui.node.f0
    public void c0(long j10) {
        if (androidx.compose.ui.unit.u.h(this.f39600v, j10)) {
            return;
        }
        this.f39598s.invoke(androidx.compose.ui.unit.u.b(j10));
        this.f39600v = j10;
    }

    public final void v9(@NotNull Function1<? super androidx.compose.ui.unit.u, Unit> function1) {
        this.f39598s = function1;
        long j10 = Integer.MIN_VALUE;
        this.f39600v = androidx.compose.ui.unit.u.e((j10 & com.rabbitmq.client.k0.f265952a) | (j10 << 32));
    }
}
