package androidx.lifecycle.viewmodel.compose;

import androidx.compose.runtime.c0;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.o;
import androidx.lifecycle.f2;
import androidx.lifecycle.j2;
import androidx.lifecycle.m2;
import androidx.lifecycle.z;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class n {
    @o
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Superseded by viewModel that takes CreationExtras")
    public static final /* synthetic */ <VM extends f2> VM a(m2 m2Var, String str, j2.c cVar, c0 c0Var, int i10, int i11) {
        if ((i11 & 1) != 0 && (m2Var = b.f52543a.c(c0Var, 6)) == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        m2 m2Var2 = m2Var;
        String str2 = (i11 & 2) != 0 ? null : str;
        j2.c cVar2 = (i11 & 4) != 0 ? null : cVar;
        Intrinsics.reifiedOperationMarker(4, "VM");
        return (VM) l.h(j1.d(f2.class), m2Var2, str2, cVar2, null, c0Var, (i10 << 3) & 8176, 16);
    }

    @o
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Superseded by viewModel that takes CreationExtras")
    public static final /* synthetic */ f2 b(Class cls, m2 m2Var, String str, j2.c cVar, c0 c0Var, int i10, int i11) {
        if ((i11 & 2) != 0 && (m2Var = b.f52543a.c(c0Var, 6)) == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        m2 m2Var2 = m2Var;
        String str2 = (i11 & 4) != 0 ? null : str;
        j2.c cVar2 = (i11 & 8) != 0 ? null : cVar;
        if (m0.l0()) {
            m0.A0(-1252471378, i10, -1, "androidx.lifecycle.viewmodel.compose.viewModel (ViewModel.android.kt:80)");
        }
        f2 f2VarB = m.b(m2Var2, oj.b.i(cls), str2, cVar2, null, 8, null);
        if (m0.l0()) {
            m0.z0();
        }
        return f2VarB;
    }

    @o
    @NotNull
    public static final <VM extends f2> VM c(@NotNull Class<VM> cls, @Nullable m2 m2Var, @Nullable String str, @Nullable j2.c cVar, @Nullable v2.a aVar, @Nullable c0 c0Var, int i10, int i11) {
        if ((i11 & 2) != 0 && (m2Var = b.f52543a.c(c0Var, 6)) == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        if ((i11 & 4) != 0) {
            str = null;
        }
        if ((i11 & 8) != 0) {
            cVar = null;
        }
        if ((i11 & 16) != 0) {
            aVar = m2Var instanceof z ? ((z) m2Var).getDefaultViewModelCreationExtras() : v2.a.b.f381327c;
        }
        if (m0.l0()) {
            m0.A0(-1566358618, i10, -1, "androidx.lifecycle.viewmodel.compose.viewModel (ViewModel.android.kt:118)");
        }
        VM vm2 = (VM) l.a(m2Var, oj.b.i(cls), str, cVar, aVar);
        if (m0.l0()) {
            m0.z0();
        }
        return vm2;
    }
}
