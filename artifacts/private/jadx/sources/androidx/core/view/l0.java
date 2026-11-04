package androidx.core.view;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public interface l0 {
    void addMenuProvider(@NonNull r0 r0Var);

    void addMenuProvider(@NonNull r0 r0Var, @NonNull androidx.lifecycle.o0 o0Var);

    @e.a({"LambdaLast"})
    void addMenuProvider(@NonNull r0 r0Var, @NonNull androidx.lifecycle.o0 o0Var, @NonNull androidx.lifecycle.c0.b bVar);

    void invalidateMenu();

    void removeMenuProvider(@NonNull r0 r0Var);
}
