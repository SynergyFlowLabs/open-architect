package androidx.compose.ui.platform;

import android.view.View;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nNestedScrollInteropConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestedScrollInteropConnection.android.kt\nandroidx/compose/ui/platform/LegacyNestedScrollInteropConnection\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,365:1\n1#2:366\n65#3:367\n69#3:370\n65#3:373\n69#3:376\n65#3:379\n69#3:382\n60#4:368\n70#4:371\n60#4:374\n70#4:377\n60#4:380\n70#4:383\n22#5:369\n22#5:372\n22#5:375\n22#5:378\n22#5:381\n22#5:384\n*S KotlinDebug\n*F\n+ 1 NestedScrollInteropConnection.android.kt\nandroidx/compose/ui/platform/LegacyNestedScrollInteropConnection\n*L\n176#1:367\n177#1:370\n199#1:373\n200#1:376\n201#1:379\n202#1:382\n176#1:368\n177#1:371\n199#1:374\n200#1:377\n201#1:380\n202#1:383\n176#1:369\n177#1:372\n199#1:375\n200#1:378\n201#1:381\n202#1:384\n*E\n"})
public final class z2 implements androidx.compose.ui.input.nestedscroll.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f40991d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final View f40992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.core.view.w0 f40993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final int[] f40994c;

    public z2(@NotNull View view) {
        this.f40992a = view;
        androidx.core.view.w0 w0Var = new androidx.core.view.w0(view);
        w0Var.p(true);
        this.f40993b = w0Var;
        this.f40994c = new int[2];
        androidx.core.view.u1.h2(view, true);
    }

    private final void a() {
        if (this.f40993b.l(0)) {
            this.f40993b.u(0);
        }
        if (this.f40993b.l(1)) {
            this.f40993b.u(1);
        }
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    @Nullable
    public Object B0(long j10, long j11, @NotNull kotlin.coroutines.d<? super androidx.compose.ui.unit.c0> dVar) {
        if (!this.f40993b.a(e3.m(androidx.compose.ui.unit.c0.l(j11)), e3.m(androidx.compose.ui.unit.c0.n(j11)), true)) {
            j11 = androidx.compose.ui.unit.c0.f42681b.a();
        }
        a();
        return androidx.compose.ui.unit.c0.b(j11);
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    public long G7(long j10, int i10) {
        if (!this.f40993b.s(e3.g(j10), e3.l(i10))) {
            return n0.g.f332700b.e();
        }
        ArraysKt.fill$default(this.f40994c, 0, 0, 0, 6, (Object) null);
        this.f40993b.d(e3.f(Float.intBitsToFloat((int) (j10 >> 32))), e3.f(Float.intBitsToFloat((int) (com.rabbitmq.client.k0.f265952a & j10))), this.f40994c, null, e3.l(i10));
        return e3.k(this.f40994c, j10);
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    @Nullable
    public Object a4(long j10, @NotNull kotlin.coroutines.d<? super androidx.compose.ui.unit.c0> dVar) {
        if (!this.f40993b.b(e3.m(androidx.compose.ui.unit.c0.l(j10)), e3.m(androidx.compose.ui.unit.c0.n(j10)))) {
            j10 = androidx.compose.ui.unit.c0.f42681b.a();
        }
        a();
        return androidx.compose.ui.unit.c0.b(j10);
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    public long b2(long j10, long j11, int i10) {
        if (!this.f40993b.s(e3.g(j11), e3.l(i10))) {
            return n0.g.f332700b.e();
        }
        ArraysKt.fill$default(this.f40994c, 0, 0, 0, 6, (Object) null);
        this.f40993b.e(e3.f(Float.intBitsToFloat((int) (j10 >> 32))), e3.f(Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a))), e3.f(Float.intBitsToFloat((int) (j11 >> 32))), e3.f(Float.intBitsToFloat((int) (j11 & com.rabbitmq.client.k0.f265952a))), null, e3.l(i10), this.f40994c);
        return e3.k(this.f40994c, j11);
    }
}
