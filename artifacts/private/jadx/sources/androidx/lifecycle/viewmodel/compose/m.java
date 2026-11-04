package androidx.lifecycle.viewmodel.compose;

import androidx.compose.runtime.c0;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.o;
import androidx.lifecycle.f2;
import androidx.lifecycle.j2;
import androidx.lifecycle.m2;
import androidx.lifecycle.z;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt__ViewModelKt\n+ 2 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryKt\n*L\n1#1,175:1\n32#2:176\n69#2,2:177\n*S KotlinDebug\n*F\n+ 1 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt__ViewModelKt\n*L\n138#1:176\n138#1:177,2\n*E\n"})
final /* synthetic */ class m {
    @NotNull
    public static final <VM extends f2> VM a(@NotNull m2 m2Var, @NotNull kotlin.reflect.d<VM> dVar, @Nullable String str, @Nullable j2.c cVar, @NotNull v2.a aVar) {
        j2 j2VarD;
        if (cVar != null) {
            j2VarD = j2.f52401b.a(m2Var.getViewModelStore(), cVar, aVar);
        } else if (m2Var instanceof z) {
            j2VarD = j2.f52401b.a(m2Var.getViewModelStore(), ((z) m2Var).getDefaultViewModelProviderFactory(), aVar);
        } else {
            int i10 = 7 | 0;
            j2VarD = j2.b.d(j2.f52401b, m2Var, null, null, 6, null);
        }
        return str != null ? (VM) j2VarD.e(str, dVar) : (VM) j2VarD.f(dVar);
    }

    public static /* synthetic */ f2 b(m2 m2Var, kotlin.reflect.d dVar, String str, j2.c cVar, v2.a aVar, int i10, Object obj) {
        int i11 = 4 >> 0;
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            cVar = null;
        }
        if ((i10 & 8) != 0) {
            aVar = m2Var instanceof z ? ((z) m2Var).getDefaultViewModelCreationExtras() : v2.a.b.f381327c;
        }
        return l.a(m2Var, dVar, str, cVar, aVar);
    }

    @o
    public static final /* synthetic */ <VM extends f2> VM c(m2 m2Var, String str, j2.c cVar, v2.a aVar, c0 c0Var, int i10, int i11) {
        if ((i11 & 1) != 0 && (m2Var = b.f52543a.c(c0Var, 6)) == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        m2 m2Var2 = m2Var;
        String str2 = (i11 & 2) != 0 ? null : str;
        j2.c cVar2 = (i11 & 4) != 0 ? null : cVar;
        if ((i11 & 8) != 0) {
            aVar = m2Var2 instanceof z ? ((z) m2Var2).getDefaultViewModelCreationExtras() : v2.a.b.f381327c;
        }
        Intrinsics.reifiedOperationMarker(4, "VM");
        return (VM) l.h(j1.d(f2.class), m2Var2, str2, cVar2, aVar, c0Var, (i10 << 3) & 65520, 0);
    }

    @o
    public static final /* synthetic */ <VM extends f2> VM d(m2 m2Var, String str, Function1<? super v2.a, ? extends VM> function1, c0 c0Var, int i10, int i11) {
        if ((i11 & 1) != 0 && (m2Var = b.f52543a.c(c0Var, 6)) == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        m2 m2Var2 = m2Var;
        if ((i11 & 2) != 0) {
            str = null;
        }
        String str2 = str;
        Intrinsics.reifiedOperationMarker(4, "VM");
        kotlin.reflect.d dVarD = j1.d(f2.class);
        v2.d dVar = new v2.d();
        Intrinsics.reifiedOperationMarker(4, "VM");
        dVar.a(j1.d(f2.class), function1);
        Unit unit = Unit.f312394a;
        return (VM) l.h(dVarD, m2Var2, str2, dVar.b(), m2Var2 instanceof z ? ((z) m2Var2).getDefaultViewModelCreationExtras() : v2.a.b.f381327c, c0Var, (i10 << 3) & 1008, 0);
    }

    @o
    @NotNull
    public static final <VM extends f2> VM e(@NotNull kotlin.reflect.d<VM> dVar, @Nullable m2 m2Var, @Nullable String str, @Nullable j2.c cVar, @Nullable v2.a aVar, @Nullable c0 c0Var, int i10, int i11) {
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
            m0.A0(1673618944, i10, -1, "androidx.lifecycle.viewmodel.compose.viewModel (ViewModel.kt:105)");
        }
        VM vm2 = (VM) l.a(m2Var, dVar, str, cVar, aVar);
        if (m0.l0()) {
            m0.z0();
        }
        return vm2;
    }
}
