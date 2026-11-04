package androidx.lifecycle.viewmodel.compose;

import androidx.compose.runtime.a1;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.m4;
import androidx.compose.runtime.n4;
import androidx.compose.runtime.o;
import androidx.lifecycle.m2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 1)
@SourceDebugExtension({"SMAP\nLocalViewModelStoreOwner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalViewModelStoreOwner.kt\nandroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,49:1\n75#2:50\n*S KotlinDebug\n*F\n+ 1 LocalViewModelStoreOwner.kt\nandroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner\n*L\n35#1:50\n*E\n"})
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f52543a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final m4<m2> f52544b = a1.k(null, new Function0() { // from class: androidx.lifecycle.viewmodel.compose.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return b.b();
        }
    }, 1, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f52545c = 0;

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m2 b() {
        return null;
    }

    @o
    @oj.i(name = "getCurrent")
    @Nullable
    public final m2 c(@Nullable c0 c0Var, int i10) {
        if (m0.l0()) {
            m0.A0(-584162872, i10, -1, "androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.<get-current> (LocalViewModelStoreOwner.kt:34)");
        }
        m2 m2VarA = (m2) c0Var.W(f52544b);
        if (m2VarA == null) {
            c0Var.E(1260197609);
            m2VarA = c.a(c0Var, 0);
        } else {
            c0Var.E(1260196493);
        }
        c0Var.A();
        if (m0.l0()) {
            m0.z0();
        }
        return m2VarA;
    }

    @NotNull
    public final n4<m2> d(@NotNull m2 m2Var) {
        return f52544b.f(m2Var);
    }
}
