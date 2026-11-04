package com.planner5d.library.widget.editor.facade;

import org.jetbrains.annotations.NotNull;
import rx.Observable;

/* JADX INFO: loaded from: classes12.dex */
public interface e0 {

    public static final class a {
        public static /* synthetic */ void a(e0 e0Var, boolean z10, boolean z11, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: editorInProgress");
            }
            if ((i10 & 2) != 0) {
                z11 = false;
            }
            e0Var.h(z10, z11);
        }
    }

    void h(boolean z10, boolean z11);

    @NotNull
    Observable<com.planner5d.library.widget.editor.a.b> m();

    void n();

    void r();

    void u();

    void w(@NotNull com.planner5d.library.widget.editor.projectresources.viewoptions.b bVar);

    void x();
}
