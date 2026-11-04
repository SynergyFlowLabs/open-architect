package com.planner5d.library.widget.editor;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.planner5d.library.services.utility.h3;
import com.planner5d.library.widget.textview.ButtonTextView;
import kotlin.Unit;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oj.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nPovPromptView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PovPromptView.kt\ncom/planner5d/library/widget/editor/PovPromptView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,141:1\n161#2,8:142\n161#2,8:150\n161#2,8:158\n*S KotlinDebug\n*F\n+ 1 PovPromptView.kt\ncom/planner5d/library/widget/editor/PovPromptView\n*L\n68#1:142,8\n71#1:150,8\n85#1:158,8\n*E\n"})
public final class PovPromptView extends ConstraintLayout {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f254293e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f254294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f254295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final ButtonTextView f254296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final f0<TextView> f254297d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public PovPromptView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void A(androidx.constraintlayout.widget.f fVar) {
        fVar.O(this.f254296c.getId(), 1);
        fVar.n1(this.f254296c.getId(), 7, com.github.danielnilsson9.colorpickerview.view.d.a(getContext(), 22.0f));
        fVar.n1(this.f254296c.getId(), 4, com.github.danielnilsson9.colorpickerview.view.d.a(getContext(), 13.0f));
    }

    private final void B(androidx.constraintlayout.widget.f fVar) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(com.planner5d.library.f.g.f167420zh);
        fVar.n1(this.f254296c.getId(), 6, dimensionPixelSize);
        fVar.n1(this.f254296c.getId(), 7, dimensionPixelSize);
        fVar.n1(this.f254296c.getId(), 4, getResources().getDimensionPixelSize(com.planner5d.library.f.g.Ah));
        fVar.R(this.f254296c.getId(), getResources().getDimensionPixelSize(com.planner5d.library.f.g.U1));
        fVar.K(this.f254296c.getId(), 6, 0, 6);
    }

    private final void C() {
        int iA = com.github.danielnilsson9.colorpickerview.view.d.a(getContext(), 14.0f);
        setBackgroundResource(com.planner5d.library.f.C1549f.Dn);
        ButtonTextView buttonTextView = this.f254296c;
        buttonTextView.setPadding(buttonTextView.getPaddingLeft(), iA, buttonTextView.getPaddingRight(), iA);
        if (this.f254297d.Z()) {
            this.f254297d.getValue().setVisibility(8);
        }
        androidx.constraintlayout.widget.f fVar = new androidx.constraintlayout.widget.f();
        z(fVar);
        A(fVar);
        fVar.r(this);
    }

    private final void D() {
        setBackgroundResource(com.planner5d.library.f.C1549f.Xn);
        ButtonTextView buttonTextView = this.f254296c;
        buttonTextView.setPadding(buttonTextView.getPaddingLeft(), this.f254294a, buttonTextView.getPaddingRight(), this.f254295b);
        TextView value = this.f254297d.getValue();
        value.setVisibility(0);
        value.setPadding(value.getPaddingLeft(), value.getResources().getDimensionPixelSize(com.planner5d.library.f.g.f167420zh), value.getPaddingRight(), value.getPaddingBottom());
        androidx.constraintlayout.widget.f fVar = new androidx.constraintlayout.widget.f();
        z(fVar);
        B(fVar);
        y(fVar);
        fVar.r(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView F(Context context, PovPromptView povPromptView) {
        TextView textView = new TextView(new androidx.appcompat.view.d(context, com.planner5d.library.f.t.V8));
        textView.setId(View.generateViewId());
        textView.setText(com.planner5d.library.f.s.Bz);
        povPromptView.addView(textView, new ConstraintLayout.b(0, 0));
        return textView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(Function0 function0, View view) {
        function0.invoke();
    }

    private final void y(androidx.constraintlayout.widget.f fVar) {
        TextView value = this.f254297d.getValue();
        int dimensionPixelSize = getResources().getDimensionPixelSize(com.planner5d.library.f.g.f167420zh);
        fVar.N(value.getId(), 1);
        fVar.O(value.getId(), 1);
        fVar.n1(value.getId(), 6, dimensionPixelSize);
        fVar.n1(value.getId(), 7, dimensionPixelSize);
        fVar.n1(value.getId(), 4, getResources().getDimensionPixelSize(com.planner5d.library.f.g.Qh));
        fVar.R(value.getId(), getResources().getDimensionPixelSize(com.planner5d.library.f.g.U1));
        fVar.K(value.getId(), 4, this.f254296c.getId(), 3);
        fVar.K(value.getId(), 7, 0, 7);
        fVar.K(value.getId(), 6, 0, 6);
    }

    private final void z(androidx.constraintlayout.widget.f fVar) {
        fVar.N(this.f254296c.getId(), 1);
        fVar.K(this.f254296c.getId(), 4, 0, 4);
        fVar.K(this.f254296c.getId(), 7, 0, 7);
    }

    public final void E() {
        if (h3.W(getContext())) {
            D();
        } else {
            C();
        }
    }

    public final void setOnRenderClickAction(@NotNull final Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f254296c.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.widget.editor.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PovPromptView.G(action, view);
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public PovPromptView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ PovPromptView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @j
    public PovPromptView(@NotNull final Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        int i11 = 7 & 0;
        ButtonTextView buttonTextView = new ButtonTextView(new androidx.appcompat.view.d(context, com.planner5d.library.f.t.F6), null, 0, 6, null);
        buttonTextView.setId(View.generateViewId());
        buttonTextView.setText(com.planner5d.library.f.s.pz);
        addView(buttonTextView, new ConstraintLayout.b(0, 0));
        this.f254294a = buttonTextView.getPaddingTop();
        this.f254295b = buttonTextView.getPaddingBottom();
        this.f254296c = buttonTextView;
        this.f254297d = g0.c(new Function0() { // from class: com.planner5d.library.widget.editor.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PovPromptView.F(context, this);
            }
        });
        E();
    }
}
