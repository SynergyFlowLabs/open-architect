package com.planner5d.library.widget.editor.history;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.w0;
import com.google.android.material.bottomsheet.AdvancedBottomSheetBehavior;
import com.planner5d.library.databinding.n3;
import com.planner5d.library.f;
import com.planner5d.library.widget.editor.history.EditorHistoryButtons;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oj.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import we.e;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
public final class EditorHistoryButtons extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f256887b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final n3 f256888a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public EditorHistoryButtons(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(Function0 function0, View view) {
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(Function0 function0, View view) {
        function0.invoke();
    }

    public final void c(@NotNull AdvancedBottomSheetBehavior<View> bottomSheetBehavior) {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "bottomSheetBehavior");
        bottomSheetBehavior.W(new e(this, getResources().getDimensionPixelSize(f.g.Kh) + getResources().getDimensionPixelSize(f.g.f167420zh)));
    }

    public final void d(boolean z10, boolean z11) {
        this.f256888a.f159395b.setEnabled(z10);
        this.f256888a.f159396c.setEnabled(z11);
    }

    public final void e(@NotNull final Function0<Unit> actionOnBack, @NotNull final Function0<Unit> actionOnForward) {
        Intrinsics.checkNotNullParameter(actionOnBack, "actionOnBack");
        Intrinsics.checkNotNullParameter(actionOnForward, "actionOnForward");
        this.f256888a.f159395b.setOnClickListener(new View.OnClickListener() { // from class: we.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditorHistoryButtons.f(actionOnBack, view);
            }
        });
        this.f256888a.f159396c.setOnClickListener(new View.OnClickListener() { // from class: we.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditorHistoryButtons.g(actionOnForward, view);
            }
        });
    }

    @NotNull
    public final n3 getBinding() {
        return this.f256888a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public EditorHistoryButtons(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ EditorHistoryButtons(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @j
    public EditorHistoryButtons(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        n3 n3VarB = n3.b(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(n3VarB, "inflate(...)");
        this.f256888a = n3VarB;
    }
}
