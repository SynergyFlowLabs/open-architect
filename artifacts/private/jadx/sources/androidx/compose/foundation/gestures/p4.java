package androidx.compose.foundation.gestures;

import kotlin.ResultKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class p4 implements androidx.compose.ui.input.nestedscroll.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f14948c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final y3 f14949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f14950b;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollableNestedScrollConnection", f = "Scrollable.kt", i = {0}, l = {924}, m = "onPostFling-RZ2iAVY", n = {"available"}, s = {"J$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f14951a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f14952b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f14954d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f14952b = obj;
            this.f14954d |= Integer.MIN_VALUE;
            return p4.this.B0(0L, 0L, this);
        }
    }

    public p4(@NotNull y3 y3Var, boolean z10) {
        this.f14949a = y3Var;
        this.f14950b = z10;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // androidx.compose.ui.input.nestedscroll.a
    @Nullable
    public Object B0(long j10, long j11, @NotNull kotlin.coroutines.d<? super androidx.compose.ui.unit.c0> dVar) {
        a aVar;
        long jA;
        long jA2;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f14954d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f14954d = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objA = aVar.f14952b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f14954d;
        if (i11 == 0) {
            ResultKt.m(objA);
            if (this.f14950b) {
                if (this.f14949a.b()) {
                    jA2 = androidx.compose.ui.unit.c0.f42681b.a();
                } else {
                    y3 y3Var = this.f14949a;
                    aVar.f14951a = j11;
                    aVar.f14954d = 1;
                    objA = y3Var.a(j11, aVar);
                    if (objA == objL) {
                        return objL;
                    }
                }
                jA = androidx.compose.ui.unit.c0.p(j11, jA2);
            } else {
                jA = androidx.compose.ui.unit.c0.f42681b.a();
            }
            return androidx.compose.ui.unit.c0.b(jA);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j11 = aVar.f14951a;
        ResultKt.m(objA);
        jA2 = ((androidx.compose.ui.unit.c0) objA).v();
        jA = androidx.compose.ui.unit.c0.p(j11, jA2);
        return androidx.compose.ui.unit.c0.b(jA);
    }

    public final boolean a() {
        return this.f14950b;
    }

    @NotNull
    public final y3 b() {
        return this.f14949a;
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    public long b2(long j10, long j11, int i10) {
        return this.f14950b ? this.f14949a.c(j11) : n0.g.f332700b.e();
    }

    public final void c(boolean z10) {
        this.f14950b = z10;
    }
}
