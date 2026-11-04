package androidx.compose.ui.platform;

import android.view.View;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nNestedScrollInteropConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestedScrollInteropConnection.android.kt\nandroidx/compose/ui/platform/NestedScrollInteropConnection\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,365:1\n1#2:366\n65#3:367\n69#3:370\n65#3:373\n69#3:376\n65#3:379\n69#3:382\n60#4:368\n70#4:371\n60#4:374\n70#4:377\n60#4:380\n70#4:383\n22#5:369\n22#5:372\n22#5:375\n22#5:378\n22#5:381\n22#5:384\n*S KotlinDebug\n*F\n+ 1 NestedScrollInteropConnection.android.kt\nandroidx/compose/ui/platform/NestedScrollInteropConnection\n*L\n71#1:367\n72#1:370\n94#1:373\n95#1:376\n96#1:379\n97#1:382\n71#1:368\n72#1:371\n94#1:374\n95#1:377\n96#1:380\n97#1:383\n71#1:369\n72#1:372\n94#1:375\n95#1:378\n96#1:381\n97#1:384\n*E\n"})
public final class d3 implements androidx.compose.ui.input.nestedscroll.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f40406e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final View f40407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f40408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.core.view.w0 f40409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final int[] f40410d;

    public d3(@NotNull View view, float f10) {
        this.f40407a = view;
        this.f40408b = f10;
        androidx.core.view.w0 w0Var = new androidx.core.view.w0(view);
        w0Var.p(true);
        this.f40409c = w0Var;
        this.f40410d = new int[2];
        androidx.core.view.u1.h2(view, true);
    }

    private final void a() {
        if (this.f40409c.l(0)) {
            this.f40409c.u(0);
        }
        if (this.f40409c.l(1)) {
            this.f40409c.u(1);
        }
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    @Nullable
    public Object B0(long j10, long j11, @NotNull kotlin.coroutines.d<? super androidx.compose.ui.unit.c0> dVar) {
        a();
        return androidx.compose.ui.unit.c0.b(androidx.compose.ui.unit.c0.f42681b.a());
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    public long G7(long j10, int i10) {
        if (!this.f40409c.s(e3.g(j10), e3.l(i10))) {
            return n0.g.f332700b.e();
        }
        ArraysKt.fill$default(this.f40410d, 0, 0, 0, 6, (Object) null);
        this.f40409c.d(e3.f(Float.intBitsToFloat((int) (j10 >> 32))), e3.f(Float.intBitsToFloat((int) (com.rabbitmq.client.k0.f265952a & j10))), this.f40410d, null, e3.l(i10));
        return e3.k(this.f40410d, j10);
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    @Nullable
    public Object a4(long j10, @NotNull kotlin.coroutines.d<? super androidx.compose.ui.unit.c0> dVar) {
        if (!this.f40409c.b(e3.m(androidx.compose.ui.unit.c0.l(j10)), e3.m(androidx.compose.ui.unit.c0.n(j10))) && !this.f40409c.a(e3.m(androidx.compose.ui.unit.c0.l(j10)), e3.m(androidx.compose.ui.unit.c0.n(j10)), true)) {
            j10 = androidx.compose.ui.unit.c0.f42681b.a();
        }
        return androidx.compose.ui.unit.c0.b(j10);
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    public long b2(long j10, long j11, int i10) {
        if (!this.f40409c.s(e3.g(j11), e3.l(i10))) {
            return n0.g.f332700b.e();
        }
        ArraysKt.fill$default(this.f40410d, 0, 0, 0, 6, (Object) null);
        this.f40409c.e(e3.f(Float.intBitsToFloat((int) (j10 >> 32))), e3.f(Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a))), e3.f(Float.intBitsToFloat((int) (j11 >> 32))), e3.f(Float.intBitsToFloat((int) (j11 & com.rabbitmq.client.k0.f265952a))), null, e3.l(i10), this.f40410d);
        return e3.k(this.f40410d, j11);
    }
}
