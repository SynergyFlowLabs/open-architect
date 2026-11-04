package androidx.compose.foundation.text;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nTextLayoutResultProxy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayoutResultProxy.kt\nandroidx/compose/foundation/text/TextLayoutResultProxy\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,133:1\n30#2:134\n53#3,3:135\n70#3:139\n70#3:142\n60#3:145\n60#3:148\n69#4:138\n69#4:141\n65#4:144\n65#4:147\n22#5:140\n22#5:143\n22#5:146\n22#5:149\n1#6:150\n*S KotlinDebug\n*F\n+ 1 TextLayoutResultProxy.kt\nandroidx/compose/foundation/text/TextLayoutResultProxy\n*L\n60#1:134\n60#1:135,3\n61#1:139\n75#1:142\n76#1:145\n77#1:148\n61#1:138\n75#1:141\n76#1:144\n77#1:147\n61#1:140\n75#1:143\n76#1:146\n77#1:149\n*E\n"})
public final class y6 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f21787d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.text.p3 f21788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.layout.g0 f21789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.layout.g0 f21790c;

    public y6(@NotNull androidx.compose.ui.text.p3 p3Var, @Nullable androidx.compose.ui.layout.g0 g0Var, @Nullable androidx.compose.ui.layout.g0 g0Var2) {
        this.f21788a = p3Var;
        this.f21789b = g0Var;
        this.f21790c = g0Var2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    private final long a(long j10) {
        n0.j jVarA;
        androidx.compose.ui.layout.g0 g0Var = this.f21789b;
        if (g0Var == null) {
            jVarA = n0.j.f332705e.a();
        } else {
            if (g0Var.I()) {
                androidx.compose.ui.layout.g0 g0Var2 = this.f21790c;
                jVarA = null;
                if (g0Var2 != null) {
                    jVarA = androidx.compose.ui.layout.g0.W(g0Var2, g0Var, false, 2, null);
                }
            } else {
                jVarA = n0.j.f332705e.a();
            }
            if (jVarA == null) {
                jVarA = n0.j.f332705e.a();
            }
        }
        return z6.b(j10, jVarA);
    }

    public static /* synthetic */ int e(y6 y6Var, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return y6Var.d(i10, z10);
    }

    public static /* synthetic */ int h(y6 y6Var, long j10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return y6Var.g(j10, z10);
    }

    @Nullable
    public final androidx.compose.ui.layout.g0 b() {
        return this.f21790c;
    }

    @Nullable
    public final androidx.compose.ui.layout.g0 c() {
        return this.f21789b;
    }

    public final int d(int i10, boolean z10) {
        return this.f21788a.p(i10, z10);
    }

    public final int f(float f10) {
        return this.f21788a.s(Float.intBitsToFloat((int) (m(a(n0.g.g((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f10)) & com.rabbitmq.client.k0.f265952a)))) & com.rabbitmq.client.k0.f265952a)));
    }

    public final int g(long j10, boolean z10) {
        if (z10) {
            j10 = a(j10);
        }
        return this.f21788a.y(m(j10));
    }

    @NotNull
    public final androidx.compose.ui.text.p3 i() {
        return this.f21788a;
    }

    public final boolean j(long j10) {
        long jM = m(a(j10));
        int iS = this.f21788a.s(Float.intBitsToFloat((int) (com.rabbitmq.client.k0.f265952a & jM)));
        int i10 = (int) (jM >> 32);
        return Float.intBitsToFloat(i10) >= this.f21788a.t(iS) && Float.intBitsToFloat(i10) <= this.f21788a.u(iS);
    }

    public final void k(@Nullable androidx.compose.ui.layout.g0 g0Var) {
        this.f21790c = g0Var;
    }

    public final void l(@Nullable androidx.compose.ui.layout.g0 g0Var) {
        this.f21789b = g0Var;
    }

    public final long m(long j10) {
        androidx.compose.ui.layout.g0 g0Var;
        androidx.compose.ui.layout.g0 g0Var2 = this.f21789b;
        if (g0Var2 != null) {
            if (!g0Var2.I()) {
                g0Var2 = null;
            }
            if (g0Var2 != null && (g0Var = this.f21790c) != null) {
                androidx.compose.ui.layout.g0 g0Var3 = g0Var.I() ? g0Var : null;
                if (g0Var3 != null) {
                    return g0Var2.r0(g0Var3, j10);
                }
            }
        }
        return j10;
    }

    public final long n(long j10) {
        androidx.compose.ui.layout.g0 g0Var;
        androidx.compose.ui.layout.g0 g0Var2 = this.f21789b;
        if (g0Var2 != null) {
            if (!g0Var2.I()) {
                g0Var2 = null;
            }
            if (g0Var2 != null && (g0Var = this.f21790c) != null) {
                androidx.compose.ui.layout.g0 g0Var3 = g0Var.I() ? g0Var : null;
                if (g0Var3 != null) {
                    return g0Var3.r0(g0Var2, j10);
                }
            }
        }
        return j10;
    }

    public /* synthetic */ y6(androidx.compose.ui.text.p3 p3Var, androidx.compose.ui.layout.g0 g0Var, androidx.compose.ui.layout.g0 g0Var2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(p3Var, (i10 & 2) != 0 ? null : g0Var, (i10 & 4) != 0 ? null : g0Var2);
    }
}
