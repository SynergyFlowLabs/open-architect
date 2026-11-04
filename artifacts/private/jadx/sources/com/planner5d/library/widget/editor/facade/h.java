package com.planner5d.library.widget.editor.facade;

import android.os.Bundle;
import com.planner5d.library.widget.editor.helper.h2;
import com.planner5d.library.widget.editor.helper.j2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;
import rx.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public interface h extends j0 {

    public static final class a {
        public static /* synthetic */ Observable a(h hVar, Bundle bundle, j2.a aVar, boolean z10, h2 h2Var, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setup");
            }
            if ((i10 & 8) != 0) {
                h2Var = null;
            }
            return hVar.B(bundle, aVar, z10, h2Var);
        }

        public static /* synthetic */ Subscriber b(h hVar, Runnable runnable, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startSceneLoading");
            }
            if ((i10 & 1) != 0) {
                runnable = null;
            }
            return hVar.q(runnable);
        }
    }

    @NotNull
    g A();

    @NotNull
    Observable<Void> B(@Nullable Bundle bundle, @NotNull j2.a aVar, boolean z10, @Nullable h2 h2Var);

    @NotNull
    com.planner5d.library.widget.editor.helper.selector.a C();

    @NotNull
    i0.b D();

    @NotNull
    e0 F();

    @NotNull
    f G();

    @NotNull
    Observable<Void> L(boolean z10);

    void n(boolean z10);

    void p(@NotNull we.c cVar);

    @NotNull
    Subscriber<com.planner5d.library.widget.editor.a.b> q(@Nullable Runnable runnable);

    void t();

    void u(@NotNull e eVar);

    @NotNull
    w v();

    @NotNull
    v w();

    boolean y();
}
