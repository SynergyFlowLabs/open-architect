package androidx.compose.material3;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class rt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.b5 f32595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.s0 f32596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.animation.core.y0<Float> f32597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private Integer f32598d;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ScrollableTabData$onLaidOut$1$1", f = "TabRow.kt", i = {}, l = {1156}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f32599a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f32601c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f32601c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return rt.this.new a(this.f32601c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f32599a;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.compose.foundation.b5 b5Var = rt.this.f32595a;
                int i11 = this.f32601c;
                androidx.compose.animation.core.y0 y0Var = rt.this.f32597c;
                this.f32599a = 1;
                if (b5Var.u(i11, y0Var, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public rt(@NotNull androidx.compose.foundation.b5 b5Var, @NotNull kotlinx.coroutines.s0 s0Var, @NotNull androidx.compose.animation.core.y0<Float> y0Var) {
        this.f32595a = b5Var;
        this.f32596b = s0Var;
        this.f32597c = y0Var;
    }

    private final int c(f30 f30Var, androidx.compose.ui.unit.d dVar, int i10, List<f30> list) {
        int iG6 = dVar.g6(((f30) CollectionsKt.last((List) list)).c()) + i10;
        int iA = iG6 - this.f32595a.A();
        return kotlin.ranges.r.I(dVar.g6(f30Var.b()) - ((iA / 2) - (dVar.g6(f30Var.d()) / 2)), 0, kotlin.ranges.r.u(iG6 - iA, 0));
    }

    public final void d(@NotNull androidx.compose.ui.unit.d dVar, int i10, @NotNull List<f30> list, int i11) {
        int iC;
        Integer num = this.f32598d;
        if (num != null && num.intValue() == i11) {
            return;
        }
        this.f32598d = Integer.valueOf(i11);
        f30 f30Var = (f30) CollectionsKt.getOrNull(list, i11);
        if (f30Var == null || this.f32595a.B() == (iC = c(f30Var, dVar, i10, list))) {
            return;
        }
        kotlinx.coroutines.k.f(this.f32596b, null, null, new a(iC, null), 3, null);
    }
}
