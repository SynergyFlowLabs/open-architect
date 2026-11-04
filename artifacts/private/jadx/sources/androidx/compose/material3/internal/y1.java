package androidx.compose.material3.internal;

import android.content.Context;
import android.view.Window;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nBasicEdgeToEdgeDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicEdgeToEdgeDialog.android.kt\nandroidx/compose/material3/internal/DialogLayout\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,343:1\n85#2:344\n117#2,2:345\n*S KotlinDebug\n*F\n+ 1 BasicEdgeToEdgeDialog.android.kt\nandroidx/compose/material3/internal/DialogLayout\n*L\n317#1:344\n317#1:345,2\n*E\n"})
final class y1 extends androidx.compose.ui.platform.a implements androidx.compose.ui.window.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Window f29248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f29249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f29250c;

    public y1(@NotNull Context context, @NotNull Window window) {
        super(context, null, 0, 6, null);
        this.f29248a = window;
        this.f29249b = d7.g(u1.f29174a.a(), null, 2, null);
    }

    private final Function2<androidx.compose.runtime.c0, Integer, Unit> getContent() {
        return (Function2) this.f29249b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(y1 y1Var, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        y1Var.Content(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    private final void setContent(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
        this.f29249b.setValue(function2);
    }

    @Override // androidx.compose.ui.platform.a
    @androidx.compose.runtime.o
    public void Content(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-2017021053);
        int i12 = 7 ^ 2;
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.k0(this) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (c0VarR.h((i11 & 3) != 2, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-2017021053, i11, -1, "androidx.compose.material3.internal.DialogLayout.Content (BasicEdgeToEdgeDialog.android.kt:329)");
            }
            getContent().invoke(c0VarR, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.internal.x1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return y1.j(this.f29226a, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // androidx.compose.ui.platform.a
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f29250c;
    }

    @Override // androidx.compose.ui.window.l
    @NotNull
    public Window getWindow() {
        return this.f29248a;
    }

    public final void k(@NotNull androidx.compose.runtime.p0 p0Var, @NotNull Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
        setParentCompositionContext(p0Var);
        setContent(function2);
        this.f29250c = true;
        createComposition();
    }
}
