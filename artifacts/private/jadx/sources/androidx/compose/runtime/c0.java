package androidx.compose.runtime;

import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f35327a = a.f35328a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f35328a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private static final Object f35329b = new C0269a();

        /* JADX INFO: renamed from: androidx.compose.runtime.c0$a$a, reason: collision with other inner class name */
        public static final class C0269a {
            C0269a() {
            }

            public String toString() {
                return "Empty";
            }
        }

        private a() {
        }

        @NotNull
        public final Object a() {
            return f35329b;
        }

        @d2
        public final void b(boolean z10) {
            m0.v0(z10);
        }

        @s2
        public final void c(@Nullable h1 h1Var) {
            m0.f36228a = h1Var;
        }
    }

    @r2
    @kotlin.l(message = "Prefer the higher-precision compositeKeyHashCode instead", replaceWith = @kotlin.b1(expression = "compositeKeyHashCode", imports = {}))
    static /* synthetic */ void a0() {
    }

    @w
    static /* synthetic */ void b() {
    }

    @r2
    static /* synthetic */ void d0() {
    }

    @r2
    static /* synthetic */ void i() {
    }

    @w
    static /* synthetic */ void m() {
    }

    @r2
    static /* synthetic */ void n0() {
    }

    @w
    static /* synthetic */ void r0() {
    }

    @w
    static /* synthetic */ void t0() {
    }

    @w
    static /* synthetic */ void v() {
    }

    @w
    static /* synthetic */ void x0() {
    }

    @w
    void A();

    @r2
    @NotNull
    p0 B();

    void C();

    @w
    boolean D(@Nullable Object obj);

    @w
    void E(int i10);

    @r2
    void F(@NotNull n4<?>[] n4VarArr);

    @w
    default boolean G(boolean z10) {
        return G(z10);
    }

    @w
    default boolean H(short s10) {
        return H(s10);
    }

    @w
    default boolean I(float f10) {
        return I(f10);
    }

    @w
    void J();

    @w
    default boolean K(int i10) {
        return K(i10);
    }

    @w
    default boolean L(long j10) {
        return L(j10);
    }

    @w
    default boolean M(byte b10) {
        return M(b10);
    }

    @w
    default boolean N(char c10) {
        return N(c10);
    }

    @w
    default boolean O(double d10) {
        return O(d10);
    }

    boolean P();

    @w
    void Q();

    @w
    @NotNull
    c0 R(int i10);

    @NotNull
    i<?> S();

    @w
    @Nullable
    s5 T();

    @w
    @NotNull
    Object U(@Nullable Object obj, @Nullable Object obj2);

    @w
    void V();

    @r2
    <T> T W(@NotNull u0<T> u0Var);

    @lm.n
    @NotNull
    CoroutineContext X();

    @w
    void Y(@Nullable Object obj);

    @w
    void Z();

    int a();

    @r2
    void b0(@NotNull e3<?> e3Var, @Nullable Object obj);

    @w
    void c(boolean z10);

    @lm.n
    void c0();

    boolean d();

    @r2
    void e(@NotNull List<Pair<i3, i3>> list);

    void e0();

    @w
    <V, T> void f(V v10, @NotNull Function2<? super T, ? super V, Unit> function2);

    @Nullable
    q4 f0();

    long g();

    @w
    void g0();

    @r2
    boolean h(boolean z10, int i10);

    @w
    void h0(int i10);

    @w
    @Nullable
    Object i0();

    @w
    void j(int i10);

    @NotNull
    androidx.compose.runtime.tooling.f j0();

    @NotNull
    b1 k();

    @w
    default boolean k0(@Nullable Object obj) {
        return D(obj);
    }

    @w
    void l();

    @w
    void l0();

    @w
    void m0(int i10, @Nullable Object obj);

    @r2
    void n();

    @w
    void o();

    @w
    void o0();

    @r2
    void p(@NotNull Function0<Unit> function0);

    @r2
    void p0(@NotNull n4<?> n4Var);

    @w
    void q();

    @w
    <T> void q0(@NotNull Function0<? extends T> function0);

    @w
    void r(int i10, @Nullable Object obj);

    @Nullable
    Object s();

    @r2
    void s0();

    void t(@NotNull String str);

    @w
    void u();

    default int u0() {
        return Long.hashCode(g());
    }

    @w
    void v0();

    void w(int i10, @NotNull String str);

    @w
    void w0();

    @lm.n
    @NotNull
    l1 x();

    boolean y();

    @r2
    void z(@NotNull q4 q4Var);
}
