package androidx.lifecycle.viewmodel.compose;

import androidx.compose.runtime.c0;
import androidx.compose.runtime.o;
import androidx.lifecycle.f2;
import androidx.lifecycle.j2;
import androidx.lifecycle.m2;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class l {
    @NotNull
    public static final <VM extends f2> VM a(@NotNull m2 m2Var, @NotNull kotlin.reflect.d<VM> dVar, @Nullable String str, @Nullable j2.c cVar, @NotNull v2.a aVar) {
        return (VM) m.a(m2Var, dVar, str, cVar, aVar);
    }

    @o
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Superseded by viewModel that takes CreationExtras")
    public static final /* synthetic */ <VM extends f2> VM c(m2 m2Var, String str, j2.c cVar, c0 c0Var, int i10, int i11) {
        return (VM) n.a(m2Var, str, cVar, c0Var, i10, i11);
    }

    @o
    public static final /* synthetic */ <VM extends f2> VM d(m2 m2Var, String str, j2.c cVar, v2.a aVar, c0 c0Var, int i10, int i11) {
        return (VM) m.c(m2Var, str, cVar, aVar, c0Var, i10, i11);
    }

    @o
    public static final /* synthetic */ <VM extends f2> VM e(m2 m2Var, String str, Function1<? super v2.a, ? extends VM> function1, c0 c0Var, int i10, int i11) {
        return (VM) m.d(m2Var, str, function1, c0Var, i10, i11);
    }

    @o
    @NotNull
    public static final <VM extends f2> VM g(@NotNull Class<VM> cls, @Nullable m2 m2Var, @Nullable String str, @Nullable j2.c cVar, @Nullable v2.a aVar, @Nullable c0 c0Var, int i10, int i11) {
        return (VM) n.c(cls, m2Var, str, cVar, aVar, c0Var, i10, i11);
    }

    @o
    @NotNull
    public static final <VM extends f2> VM h(@NotNull kotlin.reflect.d<VM> dVar, @Nullable m2 m2Var, @Nullable String str, @Nullable j2.c cVar, @Nullable v2.a aVar, @Nullable c0 c0Var, int i10, int i11) {
        return (VM) m.e(dVar, m2Var, str, cVar, aVar, c0Var, i10, i11);
    }
}
