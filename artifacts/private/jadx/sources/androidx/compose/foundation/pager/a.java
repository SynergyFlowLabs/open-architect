package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.q3;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/DefaultPagerNestedScrollConnection\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,592:1\n65#2:593\n69#2:596\n65#2:598\n69#2:601\n65#2:604\n69#2:607\n60#3:594\n70#3:597\n60#3:599\n70#3:602\n60#3:605\n70#3:608\n22#4:595\n22#4:600\n22#4:603\n22#4:606\n*S KotlinDebug\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/DefaultPagerNestedScrollConnection\n*L\n505#1:593\n505#1:596\n510#1:598\n511#1:601\n534#1:604\n534#1:607\n505#1:594\n505#1:597\n510#1:599\n511#1:602\n534#1:605\n534#1:608\n505#1:595\n510#1:600\n511#1:603\n534#1:606\n*E\n"})
final class a implements androidx.compose.ui.input.nestedscroll.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final i1 f18179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final q3 f18180b;

    public a(@NotNull i1 i1Var, @NotNull q3 q3Var) {
        this.f18179a = i1Var;
        this.f18180b = q3Var;
    }

    private final float d(long j10) {
        return Float.intBitsToFloat((int) (this.f18180b == q3.Horizontal ? j10 >> 32 : j10 & com.rabbitmq.client.k0.f265952a));
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    @Nullable
    public Object B0(long j10, long j11, @NotNull kotlin.coroutines.d<? super androidx.compose.ui.unit.c0> dVar) {
        return androidx.compose.ui.unit.c0.b(a(j11, this.f18180b));
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    public long G7(long j10, int i10) {
        if (!androidx.compose.ui.input.nestedscroll.f.j(i10, androidx.compose.ui.input.nestedscroll.f.f38949b.h()) || Math.abs(this.f18179a.F()) <= 1.0E-6d) {
            return n0.g.f332700b.e();
        }
        float F = this.f18179a.F() * this.f18179a.W();
        float fT1 = ((this.f18179a.M().t1() + this.f18179a.M().x1()) * (-Math.signum(this.f18179a.F()))) + F;
        if (this.f18179a.F() > 0.0f) {
            fT1 = F;
            F = fT1;
        }
        q3 q3Var = this.f18180b;
        q3 q3Var2 = q3.Horizontal;
        float fIntBitsToFloat = -this.f18179a.b(-kotlin.ranges.r.H(Float.intBitsToFloat((int) (q3Var == q3Var2 ? j10 >> 32 : j10 & com.rabbitmq.client.k0.f265952a)), F, fT1));
        float fIntBitsToFloat2 = this.f18180b == q3Var2 ? fIntBitsToFloat : Float.intBitsToFloat((int) (j10 >> 32));
        if (this.f18180b != q3.Vertical) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a));
        }
        return n0.g.h(j10, fIntBitsToFloat2, fIntBitsToFloat);
    }

    public final long a(long j10, @NotNull q3 q3Var) {
        return q3Var == q3.Vertical ? androidx.compose.ui.unit.c0.g(j10, 0.0f, 0.0f, 2, null) : androidx.compose.ui.unit.c0.g(j10, 0.0f, 0.0f, 1, null);
    }

    @NotNull
    public final q3 b() {
        return this.f18180b;
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    public long b2(long j10, long j11, int i10) {
        if (androidx.compose.ui.input.nestedscroll.f.j(i10, androidx.compose.ui.input.nestedscroll.f.f38949b.g())) {
            int i11 = 5 << 0;
            if (d(j11) != 0.0f) {
                throw new CancellationException("Scroll cancelled");
            }
        }
        return n0.g.f332700b.e();
    }

    @NotNull
    public final i1 c() {
        return this.f18179a;
    }
}
