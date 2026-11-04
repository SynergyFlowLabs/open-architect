package androidx.compose.material3;

import android.content.Context;
import android.view.Window;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nModalBottomSheet.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheet.android.kt\nandroidx/compose/material3/ModalBottomSheetDialogLayout\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,655:1\n85#2:656\n117#2,2:657\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheet.android.kt\nandroidx/compose/material3/ModalBottomSheetDialogLayout\n*L\n423#1:656\n423#1:657,2\n*E\n"})
final class gk extends androidx.compose.ui.platform.a implements androidx.compose.ui.window.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Window f27976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f27977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f27978c;

    public gk(@NotNull Context context, @NotNull Window window) {
        super(context, null, 0, 6, null);
        this.f27976a = window;
        this.f27977b = androidx.compose.runtime.d7.g(t6.f33137a.b(), null, 2, null);
    }

    private final Function2<androidx.compose.runtime.c0, Integer, Unit> getContent() {
        return (Function2) this.f27977b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(gk gkVar, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        gkVar.Content(c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    private final void setContent(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
        this.f27977b.setValue(function2);
    }

    @Override // androidx.compose.ui.platform.a
    @androidx.compose.runtime.o
    public void Content(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(576708319);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.k0(this) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (c0VarR.h((i11 & 3) != 2, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(576708319, i11, -1, "androidx.compose.material3.ModalBottomSheetDialogLayout.Content (ModalBottomSheet.android.kt:437)");
            }
            getContent().invoke(c0VarR, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.fk
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return gk.j(this.f27675a, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // androidx.compose.ui.platform.a
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f27978c;
    }

    @Override // androidx.compose.ui.window.l
    @NotNull
    public Window getWindow() {
        return this.f27976a;
    }

    public final void k(@NotNull androidx.compose.runtime.p0 p0Var, @NotNull Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
        setParentCompositionContext(p0Var);
        setContent(function2);
        this.f27978c = true;
        createComposition();
    }
}
