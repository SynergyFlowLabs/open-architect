package androidx.compose.ui.graphics;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nPath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Path.kt\nandroidx/compose/ui/graphics/Path\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,364:1\n1#2:365\n*E\n"})
public interface k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f37827a = a.f37828a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f37828a = new a();

        private a() {
        }

        @NotNull
        public final k2 a(int i10, @NotNull k2 k2Var, @NotNull k2 k2Var2) {
            k2 k2VarA = u.a();
            if (k2VarA.X(k2Var, k2Var2, i10)) {
                return k2VarA;
            }
            throw new IllegalArgumentException("Path.combine() failed.  This may be due an invalid path; in particular, check for NaN values.");
        }
    }

    public static final class b {
        @Deprecated
        @NotNull
        public static k2 e(@NotNull k2 k2Var, @NotNull k2 k2Var2) {
            return k2.super.s(k2Var2);
        }

        @Deprecated
        public static void f(@NotNull k2 k2Var, @NotNull n0.j jVar, float f10, float f11, boolean z10) {
            k2.super.o(jVar, f10, f11, z10);
        }

        @Deprecated
        @NotNull
        public static q2 g(@NotNull k2 k2Var) {
            return k2.super.iterator();
        }

        @Deprecated
        @NotNull
        public static q2 h(@NotNull k2 k2Var, @NotNull q2.a aVar, float f10) {
            return k2.super.K(aVar, f10);
        }

        @Deprecated
        @NotNull
        public static k2 j(@NotNull k2 k2Var, @NotNull k2 k2Var2) {
            return k2.super.H(k2Var2);
        }

        @Deprecated
        @NotNull
        public static k2 k(@NotNull k2 k2Var, @NotNull k2 k2Var2) {
            return k2.super.v(k2Var2);
        }

        @Deprecated
        @NotNull
        public static k2 l(@NotNull k2 k2Var, @NotNull k2 k2Var2) {
            return k2.super.b(k2Var2);
        }

        @Deprecated
        public static void m(@NotNull k2 k2Var, float f10, float f11, float f12, float f13) {
            k2.super.N(f10, f11, f12, f13);
        }

        @Deprecated
        public static void n(@NotNull k2 k2Var, float f10, float f11, float f12, float f13) {
            k2.super.r(f10, f11, f12, f13);
        }

        @Deprecated
        public static void o(@NotNull k2 k2Var) {
            k2.super.P();
        }

        @Deprecated
        public static void p(@NotNull k2 k2Var, @NotNull float[] fArr) {
            k2.super.a(fArr);
        }

        @Deprecated
        @NotNull
        public static k2 q(@NotNull k2 k2Var, @NotNull k2 k2Var2) {
            return k2.super.R(k2Var2);
        }
    }

    public enum c {
        CounterClockwise,
        Clockwise;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f37832d = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<c> l() {
            return f37832d;
        }
    }

    static /* synthetic */ void B(k2 k2Var, n0.j jVar, c cVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addOval");
        }
        if ((i10 & 2) != 0) {
            cVar = c.CounterClockwise;
        }
        k2Var.Q(jVar, cVar);
    }

    static /* synthetic */ void S(k2 k2Var, n0.l lVar, c cVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addRoundRect");
        }
        if ((i10 & 2) != 0) {
            cVar = c.CounterClockwise;
        }
        k2Var.d(lVar, cVar);
    }

    static /* synthetic */ void g(k2 k2Var, n0.j jVar, c cVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addRect");
        }
        if ((i10 & 2) != 0) {
            cVar = c.CounterClockwise;
        }
        k2Var.O(jVar, cVar);
    }

    static /* synthetic */ q2 u(k2 k2Var, q2.a aVar, float f10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: iterator");
        }
        if ((i10 & 2) != 0) {
            f10 = 0.25f;
        }
        return k2Var.K(aVar, f10);
    }

    static /* synthetic */ void y(k2 k2Var, k2 k2Var2, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPath-Uv8p0NA");
        }
        if ((i10 & 2) != 0) {
            j10 = n0.g.f332700b.e();
        }
        k2Var.E(k2Var2, j10);
    }

    void A(float f10, float f11);

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Prefer usage of addRect() with a winding direction", replaceWith = @kotlin.b1(expression = "addRect(rect)", imports = {}))
    /* synthetic */ void C(n0.j jVar);

    void E(@NotNull k2 k2Var, long j10);

    void F(float f10, float f11);

    boolean G();

    @NotNull
    default k2 H(@NotNull k2 k2Var) {
        k2 k2VarA = u.a();
        k2VarA.X(this, k2Var, t2.f38235b.a());
        return k2VarA;
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Prefer usage of addOval() with a winding direction", replaceWith = @kotlin.b1(expression = "addOval(oval)", imports = {}))
    /* synthetic */ void I(n0.j jVar);

    @kotlin.l(level = kotlin.n.WARNING, message = "Use quadraticTo() for consistency with cubicTo()", replaceWith = @kotlin.b1(expression = "quadraticTo(x1, y1, x2, y2)", imports = {}))
    void J(float f10, float f11, float f12, float f13);

    @NotNull
    default q2 K(@NotNull q2.a aVar, float f10) {
        return r.a(this, aVar, f10);
    }

    void M(int i10);

    default void N(float f10, float f11, float f12, float f13) {
        J(f10, f11, f12, f13);
    }

    void O(@NotNull n0.j jVar, @NotNull c cVar);

    default void P() {
        reset();
    }

    void Q(@NotNull n0.j jVar, @NotNull c cVar);

    @NotNull
    default k2 R(@NotNull k2 k2Var) {
        k2 k2VarA = u.a();
        k2VarA.X(this, k2Var, t2.f38235b.e());
        return k2VarA;
    }

    void U(@NotNull n0.j jVar, float f10, float f11);

    void V(float f10, float f11, float f12, float f13, float f14, float f15);

    boolean X(@NotNull k2 k2Var, @NotNull k2 k2Var2, int i10);

    void Y(float f10, float f11);

    default void a(@NotNull float[] fArr) {
    }

    @NotNull
    default k2 b(@NotNull k2 k2Var) {
        k2 k2VarA = u.a();
        k2VarA.X(this, k2Var, t2.f38235b.d());
        return k2VarA;
    }

    void close();

    void d(@NotNull n0.l lVar, @NotNull c cVar);

    void e(float f10, float f11);

    void f(float f10, float f11, float f12, float f13, float f14, float f15);

    @NotNull
    n0.j getBounds();

    @kotlin.l(level = kotlin.n.WARNING, message = "Use relativeQuadraticTo() for consistency with relativeCubicTo()", replaceWith = @kotlin.b1(expression = "relativeQuadraticTo(dx1, dy1, dx2, dy2)", imports = {}))
    void h(float f10, float f11, float f12, float f13);

    boolean isEmpty();

    @NotNull
    default q2 iterator() {
        return r.b(this, null, 0.0f, 6, null);
    }

    void m(long j10);

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Prefer usage of addRoundRect() with a winding direction", replaceWith = @kotlin.b1(expression = "addRoundRect(roundRect)", imports = {}))
    /* synthetic */ void n(n0.l lVar);

    default void o(@NotNull n0.j jVar, float f10, float f11, boolean z10) {
        w(jVar, i1.a(f10), i1.a(f11), z10);
    }

    default void r(float f10, float f11, float f12, float f13) {
        h(f10, f11, f12, f13);
    }

    void reset();

    @NotNull
    default k2 s(@NotNull k2 k2Var) {
        k2 k2VarA = u.a();
        k2VarA.X(this, k2Var, t2.f38235b.b());
        return k2VarA;
    }

    @NotNull
    default k2 v(@NotNull k2 k2Var) {
        return b(k2Var);
    }

    void w(@NotNull n0.j jVar, float f10, float f11, boolean z10);

    int x();

    void z(@NotNull n0.j jVar, float f10, float f11);
}
