package androidx.compose.material;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class je {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.b5 f23321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.s0 f23322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private Integer f23323c;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ScrollableTabData$onLaidOut$1$1", f = "TabRow.kt", i = {}, l = {450}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f23324a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f23326c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f23326c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return je.this.new a(this.f23326c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f23324a;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.compose.foundation.b5 b5Var = je.this.f23321a;
                int i11 = this.f23326c;
                androidx.compose.animation.core.o<Float> oVar = aj.f22091b;
                this.f23324a = 1;
                if (b5Var.u(i11, oVar, this) == objL) {
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

    public je(@NotNull androidx.compose.foundation.b5 b5Var, @NotNull kotlinx.coroutines.s0 s0Var) {
        this.f23321a = b5Var;
        this.f23322b = s0Var;
    }

    private final int b(ti tiVar, androidx.compose.ui.unit.d dVar, int i10, List<ti> list) {
        int iG6 = dVar.g6(((ti) CollectionsKt.last((List) list)).b()) + i10;
        int iA = iG6 - this.f23321a.A();
        return kotlin.ranges.r.I(dVar.g6(tiVar.a()) - ((iA / 2) - (dVar.g6(tiVar.c()) / 2)), 0, kotlin.ranges.r.u(iG6 - iA, 0));
    }

    public final void c(@NotNull androidx.compose.ui.unit.d dVar, int i10, @NotNull List<ti> list, int i11) {
        int iB;
        Integer num = this.f23323c;
        if (num != null && num.intValue() == i11) {
            return;
        }
        this.f23323c = Integer.valueOf(i11);
        ti tiVar = (ti) CollectionsKt.getOrNull(list, i11);
        if (tiVar == null || this.f23321a.B() == (iB = b(tiVar, dVar, i10, list))) {
            return;
        }
        kotlinx.coroutines.k.f(this.f23322b, null, null, new a(iB, null), 3, null);
    }
}
