package androidx.compose.runtime;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@k7
public abstract class m4<T> extends u0<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f36256c = 0;

    public m4(@NotNull Function0<? extends T> function0) {
        super(function0, null);
    }

    private final z7<T> i(n4<T> n4Var) {
        if (!n4Var.k()) {
            if (n4Var.c() != null) {
                return new k1(n4Var.c());
            }
            return n4Var.g() != null ? new z1(n4Var.g()) : new p7(n4Var.d());
        }
        n3<T> n3VarG = n4Var.g();
        if (n3VarG == null) {
            T tH = n4Var.h();
            u6<T> u6VarF = n4Var.f();
            if (u6VarF == null) {
                u6VarF = w6.z();
            }
            n3VarG = w6.k(tH, u6VarF);
        }
        return new z1(n3VarG);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d A[PHI: r6
      0x003d: PHI (r6v2 java.lang.Object) = (r6v5 java.lang.Object), (r6v6 java.lang.Object) binds: [B:17:0x004f, B:12:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.compose.runtime.u0
    @NotNull
    public z7<T> d(@NotNull n4<T> n4Var, @Nullable z7<T> z7Var) {
        k1 k1Var;
        Object obj;
        p7 p7Var;
        z1 z1Var = null;
        int i10 = 5 << 0;
        if (z7Var instanceof z1) {
            if (n4Var.k()) {
                z1Var = (z1) z7Var;
                z1Var.f().setValue(n4Var.d());
            }
        } else if (z7Var instanceof p7) {
            if (n4Var.l()) {
                p7Var = (p7) z7Var;
                if (Intrinsics.areEqual(n4Var.d(), p7Var.f())) {
                    obj = k1Var;
                    obj = p7Var;
                    z1Var = (z7<T>) obj;
                }
            }
        } else if (z7Var instanceof k1) {
            k1Var = (k1) z7Var;
            if (n4Var.c() == k1Var.f()) {
                obj = k1Var;
                obj = p7Var;
                z1Var = (z7<T>) obj;
            }
        }
        obj = k1Var;
        obj = p7Var;
        return z1Var == null ? i(n4Var) : z1Var;
    }

    @NotNull
    public abstract n4<T> e(T t10);

    @NotNull
    public final n4<T> f(T t10) {
        return e(t10);
    }

    @NotNull
    public final n4<T> g(@NotNull Function1<? super v0, ? extends T> function1) {
        return new n4<>(this, null, false, null, null, function1, false);
    }

    @NotNull
    public final n4<T> h(T t10) {
        return e(t10).j();
    }
}
