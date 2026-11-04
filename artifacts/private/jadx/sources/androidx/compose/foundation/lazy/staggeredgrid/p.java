package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.j2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nLazyStaggeredGridIntervalContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridIntervalContent.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridIntervalContent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,66:1\n1#2:67\n*E\n"})
public final class p extends androidx.compose.foundation.lazy.layout.y<l> implements o0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f17985d = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final j2<l> f17986b = new j2<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final w0 f17987c = new w0(E());

    static final class a implements pj.o<x, Integer, androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ pj.n<x, androidx.compose.runtime.c0, Integer, Unit> f17988a;

        /* JADX WARN: Multi-variable type inference failed */
        a(pj.n<? super x, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar) {
            this.f17988a = nVar;
        }

        @androidx.compose.runtime.o
        public final void c(x xVar, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                if (c0Var.D(xVar)) {
                    i12 = 4;
                    int i13 = 1 ^ 4;
                } else {
                    i12 = 2;
                }
                i11 |= i12;
            }
            if (!c0Var.h((i11 & 131) != 130, i11 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1062451479, i11, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridIntervalContent.item.<anonymous> (LazyStaggeredGridIntervalContent.kt:44)");
            }
            this.f17988a.invoke(xVar, c0Var, Integer.valueOf(i11 & 14));
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // pj.o
        public /* bridge */ /* synthetic */ Unit invoke(x xVar, Integer num, androidx.compose.runtime.c0 c0Var, Integer num2) {
            c(xVar, num.intValue(), c0Var, num2.intValue());
            return Unit.f312394a;
        }
    }

    public p(@NotNull Function1<? super o0, Unit> function1) {
        function1.invoke(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object N(Object obj, int i10) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object O(Object obj, int i10) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f1 P(f1 f1Var, int i10) {
        return f1Var;
    }

    @Override // androidx.compose.foundation.lazy.layout.y
    @NotNull
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public j2<l> E() {
        return this.f17986b;
    }

    @NotNull
    public final w0 M() {
        return this.f17987c;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.o0
    public void n(@Nullable final Object obj, @Nullable final Object obj2, @Nullable final f1 f1Var, @NotNull pj.n<? super x, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar) {
        u(1, obj != null ? new Function1() { // from class: androidx.compose.foundation.lazy.staggeredgrid.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                return p.N(obj, ((Integer) obj3).intValue());
            }
        } : null, new Function1() { // from class: androidx.compose.foundation.lazy.staggeredgrid.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                return p.O(obj2, ((Integer) obj3).intValue());
            }
        }, f1Var != null ? new Function1() { // from class: androidx.compose.foundation.lazy.staggeredgrid.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                return p.P(f1Var, ((Integer) obj3).intValue());
            }
        } : null, androidx.compose.runtime.internal.w.c(1062451479, true, new a(nVar)));
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.o0
    public void u(int i10, @Nullable Function1<? super Integer, ? extends Object> function1, @NotNull Function1<? super Integer, ? extends Object> function2, @Nullable Function1<? super Integer, f1> function3, @NotNull pj.o<? super x, ? super Integer, ? super androidx.compose.runtime.c0, ? super Integer, Unit> oVar) {
        E().c(i10, new l(function1, function2, function3, oVar));
    }
}
