package androidx.compose.runtime;

import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class f3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f35774a = 126665345;

    static final class a implements Function2<c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e3 f35775a;

        a(e3 e3Var) {
            this.f35775a = e3Var;
        }

        @androidx.compose.runtime.o
        public final void c(c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (m0.l0()) {
                m0.A0(-328108779, i10, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:40)");
            }
            c0Var.b0(this.f35775a, null);
            if (m0.l0()) {
                m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [P] */
    static final class b<P> implements pj.n<P, c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e3<P> f35776a;

        b(e3<P> e3Var) {
            this.f35776a = e3Var;
        }

        @androidx.compose.runtime.o
        public final void c(P p10, c0 c0Var, int i10) {
            if ((i10 & 6) == 0) {
                i10 |= (i10 & 8) == 0 ? c0Var.D(p10) : c0Var.k0(p10) ? 4 : 2;
            }
            if (!c0Var.h((i10 & 19) != 18, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (m0.l0()) {
                int i11 = 0 ^ (-1);
                m0.A0(1032736913, i10, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:63)");
            }
            c0Var.b0(this.f35776a, p10);
            if (m0.l0()) {
                m0.z0();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(Object obj, c0 c0Var, Integer num) {
            c(obj, c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [P1, P2] */
    static final class c<P1, P2> implements pj.o<P1, P2, c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e3<Pair<P1, P2>> f35777a;

        c(e3<Pair<P1, P2>> e3Var) {
            this.f35777a = e3Var;
        }

        @androidx.compose.runtime.o
        public final void c(P1 p10, P2 p11, c0 c0Var, int i10) {
            int i11;
            if ((i10 & 6) == 0) {
                i11 = ((i10 & 8) == 0 ? c0Var.D(p10) : c0Var.k0(p10) ? 4 : 2) | i10;
            } else {
                i11 = i10;
            }
            if ((i10 & 48) == 0) {
                i11 |= (i10 & 64) == 0 ? c0Var.D(p11) : c0Var.k0(p11) ? 32 : 16;
            }
            if (!c0Var.h((i11 & com.planner5d.library.engine.input.f.b.F1) != 146, i11 & 1)) {
                c0Var.u();
                return;
            }
            if (m0.l0()) {
                m0.A0(-525773808, i11, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:88)");
            }
            c0Var.b0(this.f35777a, TuplesKt.to(p10, p11));
            if (m0.l0()) {
                m0.z0();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // pj.o
        public /* bridge */ /* synthetic */ Unit invoke(Object obj, Object obj2, c0 c0Var, Integer num) {
            c(obj, obj2, c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [P1, P2, P3] */
    static final class d<P1, P2, P3> implements pj.p<P1, P2, P3, c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e3<kotlin.n1<P1, P2, P3>> f35778a;

        d(e3<kotlin.n1<P1, P2, P3>> e3Var) {
            this.f35778a = e3Var;
        }

        @androidx.compose.runtime.o
        public final void c(P1 p10, P2 p11, P3 p12, c0 c0Var, int i10) {
            int i11;
            if ((i10 & 6) == 0) {
                i11 = ((i10 & 8) == 0 ? c0Var.D(p10) : c0Var.k0(p10) ? 4 : 2) | i10;
            } else {
                i11 = i10;
            }
            if ((i10 & 48) == 0) {
                i11 |= (i10 & 64) == 0 ? c0Var.D(p11) : c0Var.k0(p11) ? 32 : 16;
            }
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                i11 |= (i10 & 512) == 0 ? c0Var.D(p12) : c0Var.k0(p12) ? 256 : 128;
            }
            if (!c0Var.h((i11 & 1171) != 1170, i11 & 1)) {
                c0Var.u();
                return;
            }
            if (m0.l0()) {
                m0.A0(1477386365, i11, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:115)");
            }
            c0Var.b0(this.f35778a, new kotlin.n1(p10, p11, p12));
            if (m0.l0()) {
                m0.z0();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // pj.p
        public /* bridge */ /* synthetic */ Unit invoke(Object obj, Object obj2, Object obj3, c0 c0Var, Integer num) {
            c(obj, obj2, obj3, c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [P1, P2, P3, P4] */
    static final class e<P1, P2, P3, P4> implements pj.q<P1, P2, P3, P4, c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e3<Object[]> f35779a;

        e(e3<Object[]> e3Var) {
            this.f35779a = e3Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // pj.q
        public /* bridge */ /* synthetic */ Unit H(Object obj, Object obj2, Object obj3, Object obj4, c0 c0Var, Integer num) {
            c(obj, obj2, obj3, obj4, c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        public final void c(P1 p10, P2 p11, P3 p12, P4 p13, c0 c0Var, int i10) {
            int i11;
            if ((i10 & 6) == 0) {
                i11 = ((i10 & 8) == 0 ? c0Var.D(p10) : c0Var.k0(p10) ? 4 : 2) | i10;
            } else {
                i11 = i10;
            }
            if ((i10 & 48) == 0) {
                i11 |= (i10 & 64) == 0 ? c0Var.D(p11) : c0Var.k0(p11) ? 32 : 16;
            }
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                i11 |= (i10 & 512) == 0 ? c0Var.D(p12) : c0Var.k0(p12) ? 256 : 128;
            }
            if ((i10 & 3072) == 0) {
                i11 |= (i10 & 4096) == 0 ? c0Var.D(p13) : c0Var.k0(p13) ? 2048 : 1024;
            }
            if (!c0Var.h((i11 & 9363) != 9362, i11 & 1)) {
                c0Var.u();
                return;
            }
            if (m0.l0()) {
                m0.A0(-1304803723, i11, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:146)");
            }
            c0Var.b0(this.f35779a, new Object[]{p10, p11, p12, p13});
            if (m0.l0()) {
                m0.z0();
            }
        }
    }

    static final class f implements pj.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<c0, Integer, Unit> f35780a;

        /* JADX WARN: Multi-variable type inference failed */
        f(Function2<? super c0, ? super Integer, Unit> function2) {
            this.f35780a = function2;
        }

        @androidx.compose.runtime.o
        public final void c(Void r10, c0 c0Var, int i10) {
            if (m0.l0()) {
                m0.A0(-703201834, i10, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:39)");
            }
            this.f35780a.invoke(c0Var, 0);
            if (m0.l0()) {
                m0.z0();
            }
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            c((Void) obj, (c0) obj2, ((Number) obj3).intValue());
            return Unit.f312394a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [P1, P2] */
    static final class g<P1, P2> implements pj.n<Pair<? extends P1, ? extends P2>, c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ pj.o<P1, P2, c0, Integer, Unit> f35781a;

        /* JADX WARN: Multi-variable type inference failed */
        g(pj.o<? super P1, ? super P2, ? super c0, ? super Integer, Unit> oVar) {
            this.f35781a = oVar;
        }

        @androidx.compose.runtime.o
        public final void c(Pair<? extends P1, ? extends P2> pair, c0 c0Var, int i10) {
            if ((i10 & 6) == 0) {
                i10 |= (i10 & 8) == 0 ? c0Var.D(pair) : c0Var.k0(pair) ? 4 : 2;
            }
            if (!c0Var.h((i10 & 19) != 18, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (m0.l0()) {
                m0.A0(561467799, i10, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:87)");
            }
            this.f35781a.invoke(pair.getFirst(), pair.getSecond(), c0Var, 0);
            if (m0.l0()) {
                m0.z0();
            }
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(Object obj, c0 c0Var, Integer num) {
            c((Pair) obj, c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [P1, P2, P3] */
    static final class h<P1, P2, P3> implements pj.n<kotlin.n1<? extends P1, ? extends P2, ? extends P3>, c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ pj.p<P1, P2, P3, c0, Integer, Unit> f35782a;

        /* JADX WARN: Multi-variable type inference failed */
        h(pj.p<? super P1, ? super P2, ? super P3, ? super c0, ? super Integer, Unit> pVar) {
            this.f35782a = pVar;
        }

        @androidx.compose.runtime.o
        public final void c(kotlin.n1<? extends P1, ? extends P2, ? extends P3> n1Var, c0 c0Var, int i10) {
            if ((i10 & 6) == 0) {
                i10 |= (i10 & 8) == 0 ? c0Var.D(n1Var) : c0Var.k0(n1Var) ? 4 : 2;
            }
            if (!c0Var.h((i10 & 19) != 18, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (m0.l0()) {
                m0.A0(-846116651, i10, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:113)");
            }
            this.f35782a.invoke(n1Var.f(), n1Var.g(), n1Var.h(), c0Var, 0);
            if (m0.l0()) {
                m0.z0();
            }
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(Object obj, c0 c0Var, Integer num) {
            c((kotlin.n1) obj, c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    static final class i implements pj.n<Object[], c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ pj.q<P1, P2, P3, P4, c0, Integer, Unit> f35783a;

        /* JADX WARN: Multi-variable type inference failed */
        i(pj.q<? super P1, ? super P2, ? super P3, ? super P4, ? super c0, ? super Integer, Unit> qVar) {
            this.f35783a = qVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @androidx.compose.runtime.o
        public final void c(Object[] objArr, c0 c0Var, int i10) {
            if (m0.l0()) {
                m0.A0(743481490, i10, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:142)");
            }
            this.f35783a.H((P1) objArr[0], (P2) objArr[1], (P3) objArr[2], (P4) objArr[3], c0Var, 0);
            if (m0.l0()) {
                m0.z0();
            }
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, c0 c0Var, Integer num) {
            c(objArr, c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    static final class j<R> implements pj.n<R, c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e3<R> f35784a;

        j(e3<R> e3Var) {
            this.f35784a = e3Var;
        }

        @androidx.compose.runtime.o
        public final void c(R r10, c0 c0Var, int i10) {
            boolean z10;
            if ((i10 & 6) == 0) {
                i10 |= (i10 & 8) == 0 ? c0Var.D(r10) : c0Var.k0(r10) ? 4 : 2;
            }
            if ((i10 & 19) != 18) {
                z10 = true;
                boolean z11 = !true;
            } else {
                z10 = false;
            }
            if (!c0Var.h(z10, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (m0.l0()) {
                m0.A0(-1655274392, i10, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:172)");
            }
            c0Var.b0(this.f35784a, r10);
            if (m0.l0()) {
                m0.z0();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(Object obj, c0 c0Var, Integer num) {
            c(obj, c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [P, R] */
    static final class k<P, R> implements pj.o<R, P, c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e3<Pair<R, P>> f35785a;

        k(e3<Pair<R, P>> e3Var) {
            this.f35785a = e3Var;
        }

        @androidx.compose.runtime.o
        public final void c(R r10, P p10, c0 c0Var, int i10) {
            int i11;
            if ((i10 & 6) == 0) {
                i11 = ((i10 & 8) == 0 ? c0Var.D(r10) : c0Var.k0(r10) ? 4 : 2) | i10;
            } else {
                i11 = i10;
            }
            if ((i10 & 48) == 0) {
                i11 |= (i10 & 64) == 0 ? c0Var.D(p10) : c0Var.k0(p10) ? 32 : 16;
            }
            if (!c0Var.h((i11 & com.planner5d.library.engine.input.f.b.F1) != 146, i11 & 1)) {
                c0Var.u();
                return;
            }
            if (m0.l0()) {
                m0.A0(1349529900, i11, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:197)");
            }
            c0Var.b0(this.f35785a, TuplesKt.to(r10, p10));
            if (m0.l0()) {
                m0.z0();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // pj.o
        public /* bridge */ /* synthetic */ Unit invoke(Object obj, Object obj2, c0 c0Var, Integer num) {
            c(obj, obj2, c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [P1, R, P2] */
    static final class l<P1, P2, R> implements pj.p<R, P1, P2, c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e3<kotlin.n1<R, P1, P2>> f35786a;

        l(e3<kotlin.n1<R, P1, P2>> e3Var) {
            this.f35786a = e3Var;
        }

        @androidx.compose.runtime.o
        public final void c(R r10, P1 p10, P2 p11, c0 c0Var, int i10) {
            int i11;
            if ((i10 & 6) == 0) {
                i11 = ((i10 & 8) == 0 ? c0Var.D(r10) : c0Var.k0(r10) ? 4 : 2) | i10;
            } else {
                i11 = i10;
            }
            if ((i10 & 48) == 0) {
                i11 |= (i10 & 64) == 0 ? c0Var.D(p10) : c0Var.k0(p10) ? 32 : 16;
            }
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                i11 |= (i10 & 512) == 0 ? c0Var.D(p11) : c0Var.k0(p11) ? 256 : 128;
            }
            if (!c0Var.h((i11 & 1171) != 1170, i11 & 1)) {
                c0Var.u();
                return;
            }
            if (m0.l0()) {
                m0.A0(2121535275, i11, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:222)");
            }
            c0Var.b0(this.f35786a, new kotlin.n1(r10, p10, p11));
            if (m0.l0()) {
                m0.z0();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // pj.p
        public /* bridge */ /* synthetic */ Unit invoke(Object obj, Object obj2, Object obj3, c0 c0Var, Integer num) {
            c(obj, obj2, obj3, c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [P1, R, P2, P3] */
    static final class m<P1, P2, P3, R> implements pj.q<R, P1, P2, P3, c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e3<Object[]> f35787a;

        m(e3<Object[]> e3Var) {
            this.f35787a = e3Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // pj.q
        public /* bridge */ /* synthetic */ Unit H(Object obj, Object obj2, Object obj3, Object obj4, c0 c0Var, Integer num) {
            c(obj, obj2, obj3, obj4, c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        public final void c(R r10, P1 p10, P2 p11, P3 p12, c0 c0Var, int i10) {
            int i11;
            if ((i10 & 6) == 0) {
                i11 = ((i10 & 8) == 0 ? c0Var.D(r10) : c0Var.k0(r10) ? 4 : 2) | i10;
            } else {
                i11 = i10;
            }
            if ((i10 & 48) == 0) {
                i11 |= (i10 & 64) == 0 ? c0Var.D(p10) : c0Var.k0(p10) ? 32 : 16;
            }
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                i11 |= (i10 & 512) == 0 ? c0Var.D(p11) : c0Var.k0(p11) ? 256 : 128;
            }
            if ((i10 & 3072) == 0) {
                i11 |= (i10 & 4096) == 0 ? c0Var.D(p12) : c0Var.k0(p12) ? 2048 : 1024;
            }
            if (!c0Var.h((i11 & 9363) != 9362, i11 & 1)) {
                c0Var.u();
                return;
            }
            if (m0.l0()) {
                m0.A0(572330192, i11, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:252)");
            }
            c0Var.b0(this.f35787a, new Object[]{r10, p10, p11, p12});
            if (m0.l0()) {
                m0.z0();
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    static final class n<R> implements pj.n<R, c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ pj.n<R, c0, Integer, Unit> f35788a;

        /* JADX WARN: Multi-variable type inference failed */
        n(pj.n<? super R, ? super c0, ? super Integer, Unit> nVar) {
            this.f35788a = nVar;
        }

        @androidx.compose.runtime.o
        public final void c(R r10, c0 c0Var, int i10) {
            if ((i10 & 6) == 0) {
                i10 |= (i10 & 8) == 0 ? c0Var.D(r10) : c0Var.k0(r10) ? 4 : 2;
            }
            if (!c0Var.h((i10 & 19) != 18, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (m0.l0()) {
                m0.A0(668517896, i10, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:171)");
            }
            this.f35788a.invoke(r10, c0Var, Integer.valueOf(i10 & 14));
            if (m0.l0()) {
                m0.z0();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(Object obj, c0 c0Var, Integer num) {
            c(obj, c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [P, R] */
    static final class o<P, R> implements pj.n<Pair<? extends R, ? extends P>, c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ pj.o<R, P, c0, Integer, Unit> f35789a;

        /* JADX WARN: Multi-variable type inference failed */
        o(pj.o<? super R, ? super P, ? super c0, ? super Integer, Unit> oVar) {
            this.f35789a = oVar;
        }

        @androidx.compose.runtime.o
        public final void c(Pair<? extends R, ? extends P> pair, c0 c0Var, int i10) {
            if ((i10 & 6) == 0) {
                i10 |= (i10 & 8) == 0 ? c0Var.D(pair) : c0Var.k0(pair) ? 4 : 2;
            }
            if (!c0Var.h((i10 & 19) != 18, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (m0.l0()) {
                m0.A0(-95003188, i10, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:196)");
            }
            this.f35789a.invoke(pair.getFirst(), pair.getSecond(), c0Var, 0);
            if (m0.l0()) {
                m0.z0();
            }
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(Object obj, c0 c0Var, Integer num) {
            c((Pair) obj, c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [P1, R, P2] */
    static final class p<P1, P2, R> implements pj.n<kotlin.n1<? extends R, ? extends P1, ? extends P2>, c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ pj.p<R, P1, P2, c0, Integer, Unit> f35790a;

        /* JADX WARN: Multi-variable type inference failed */
        p(pj.p<? super R, ? super P1, ? super P2, ? super c0, ? super Integer, Unit> pVar) {
            this.f35790a = pVar;
        }

        @androidx.compose.runtime.o
        public final void c(kotlin.n1<? extends R, ? extends P1, ? extends P2> n1Var, c0 c0Var, int i10) {
            if ((i10 & 6) == 0) {
                i10 |= (i10 & 8) == 0 ? c0Var.D(n1Var) : c0Var.k0(n1Var) ? 4 : 2;
            }
            if (!c0Var.h((i10 & 19) != 18, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (m0.l0()) {
                m0.A0(-963896566, i10, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:221)");
            }
            this.f35790a.invoke(n1Var.f(), n1Var.g(), n1Var.h(), c0Var, 0);
            if (m0.l0()) {
                m0.z0();
            }
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(Object obj, c0 c0Var, Integer num) {
            c((kotlin.n1) obj, c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    static final class q implements pj.n<Object[], c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ pj.q<R, P1, P2, P3, c0, Integer, Unit> f35791a;

        /* JADX WARN: Multi-variable type inference failed */
        q(pj.q<? super R, ? super P1, ? super P2, ? super P3, ? super c0, ? super Integer, Unit> qVar) {
            this.f35791a = qVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @androidx.compose.runtime.o
        public final void c(Object[] objArr, c0 c0Var, int i10) {
            if (m0.l0()) {
                int i11 = 5 | (-1);
                m0.A0(-346590649, i10, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:248)");
            }
            this.f35791a.H((R) objArr[0], (P1) objArr[1], (P2) objArr[2], (P3) objArr[3], c0Var, 0);
            if (m0.l0()) {
                m0.z0();
            }
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, c0 c0Var, Integer num) {
            c(objArr, c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    @e0.c
    @NotNull
    public static final Function2<c0, Integer, Unit> a(@NotNull Function2<? super c0, ? super Integer, Unit> function2) {
        return androidx.compose.runtime.internal.w.c(-328108779, true, new a(new e3(androidx.compose.runtime.internal.w.c(-703201834, true, new f(function2)))));
    }

    @e0.c
    @NotNull
    public static final <P> pj.n<P, c0, Integer, Unit> b(@NotNull pj.n<? super P, ? super c0, ? super Integer, Unit> nVar) {
        return androidx.compose.runtime.internal.w.c(1032736913, true, new b(new e3(nVar)));
    }

    @e0.c
    @NotNull
    public static final <P1, P2> pj.o<P1, P2, c0, Integer, Unit> c(@NotNull pj.o<? super P1, ? super P2, ? super c0, ? super Integer, Unit> oVar) {
        return androidx.compose.runtime.internal.w.c(-525773808, true, new c(new e3(androidx.compose.runtime.internal.w.c(561467799, true, new g(oVar)))));
    }

    @e0.c
    @NotNull
    public static final <P1, P2, P3> pj.p<P1, P2, P3, c0, Integer, Unit> d(@NotNull pj.p<? super P1, ? super P2, ? super P3, ? super c0, ? super Integer, Unit> pVar) {
        return androidx.compose.runtime.internal.w.c(1477386365, true, new d(new e3(androidx.compose.runtime.internal.w.c(-846116651, true, new h(pVar)))));
    }

    @e0.c
    @NotNull
    public static final <P1, P2, P3, P4> pj.q<P1, P2, P3, P4, c0, Integer, Unit> e(@NotNull pj.q<? super P1, ? super P2, ? super P3, ? super P4, ? super c0, ? super Integer, Unit> qVar) {
        return androidx.compose.runtime.internal.w.c(-1304803723, true, new e(new e3(androidx.compose.runtime.internal.w.c(743481490, true, new i(qVar)))));
    }

    @e0.c
    @androidx.compose.runtime.p(scheme = "[0[0]:[_]]")
    @NotNull
    public static final <R> pj.n<R, c0, Integer, Unit> f(@NotNull pj.n<? super R, ? super c0, ? super Integer, Unit> nVar) {
        return androidx.compose.runtime.internal.w.c(-1655274392, true, new j(new e3(androidx.compose.runtime.internal.w.c(668517896, true, new n(nVar)))));
    }

    @e0.c
    @NotNull
    public static final <R, P> pj.o<R, P, c0, Integer, Unit> g(@NotNull pj.o<? super R, ? super P, ? super c0, ? super Integer, Unit> oVar) {
        return androidx.compose.runtime.internal.w.c(1349529900, true, new k(new e3(androidx.compose.runtime.internal.w.c(-95003188, true, new o(oVar)))));
    }

    @e0.c
    @NotNull
    public static final <R, P1, P2> pj.p<R, P1, P2, c0, Integer, Unit> h(@NotNull pj.p<? super R, ? super P1, ? super P2, ? super c0, ? super Integer, Unit> pVar) {
        return androidx.compose.runtime.internal.w.c(2121535275, true, new l(new e3(androidx.compose.runtime.internal.w.c(-963896566, true, new p(pVar)))));
    }

    @e0.c
    @NotNull
    public static final <R, P1, P2, P3> pj.q<R, P1, P2, P3, c0, Integer, Unit> i(@NotNull pj.q<? super R, ? super P1, ? super P2, ? super P3, ? super c0, ? super Integer, Unit> qVar) {
        int i10 = 5 & 1;
        return androidx.compose.runtime.internal.w.c(572330192, true, new m(new e3(androidx.compose.runtime.internal.w.c(-346590649, true, new q(qVar)))));
    }
}
