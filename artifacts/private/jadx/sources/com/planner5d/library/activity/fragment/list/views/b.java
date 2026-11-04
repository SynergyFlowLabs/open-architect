package com.planner5d.library.activity.fragment.list.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import androidx.annotation.v;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.d;
import androidx.core.widget.r;
import com.planner5d.library.databinding.r5;
import com.planner5d.library.f;
import com.planner5d.library.services.utility.k3;
import com.planner5d.library.widget.drawable.c;
import com.planner5d.library.widget.x;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 1)
@SourceDebugExtension({"SMAP\nMainListButtonsView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainListButtonsView.kt\ncom/planner5d/library/activity/fragment/list/views/MainListButtonsView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,60:1\n1#2:61\n257#3,2:62\n*S KotlinDebug\n*F\n+ 1 MainListButtonsView.kt\ncom/planner5d/library/activity/fragment/list/views/MainListButtonsView\n*L\n49#1:62,2\n*E\n"})
public final class b extends ConstraintLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f134439b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f134440a;

    @w0(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f134441e = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final k3 f134442a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f134443b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f134444c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final View.OnClickListener f134445d;

        public a(@NotNull k3 title, @v int i10, @v int i11, @NotNull View.OnClickListener listener) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.f134442a = title;
            this.f134443b = i10;
            this.f134444c = i11;
            this.f134445d = listener;
        }

        public final int a() {
            return this.f134444c;
        }

        public final int b() {
            return this.f134443b;
        }

        @NotNull
        public final View.OnClickListener c() {
            return this.f134445d;
        }

        @NotNull
        public final k3 d() {
            return this.f134442a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
        int i10 = 3 >> 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(b bVar, int i10, int i11) {
        super.onMeasure(i10, i11);
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003d  */
    private final void y(Button button, a aVar) {
        Drawable drawableMutate;
        CharSequence charSequenceI;
        k3 k3VarD;
        int i10 = 0;
        if (aVar != null) {
            Integer numValueOf = Integer.valueOf(aVar.b());
            if (numValueOf.intValue() <= 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                Drawable drawableA = c.f254258a.a(button.getContext(), numValueOf.intValue(), null);
                if (drawableA == null || (drawableMutate = drawableA.mutate()) == null) {
                    drawableMutate = null;
                } else {
                    int i11 = this.f134440a;
                    drawableMutate.setBounds(0, 0, i11, i11);
                }
            } else {
                drawableMutate = null;
            }
        } else {
            drawableMutate = null;
        }
        button.setBackground(d.l(button.getContext(), aVar != null ? aVar.a() : f.h.K1));
        if (!(aVar != null)) {
            i10 = 8;
        }
        button.setVisibility(i10);
        if (aVar == null || (k3VarD = aVar.d()) == null) {
            charSequenceI = null;
        } else {
            Context context = button.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            charSequenceI = k3VarD.i(context);
        }
        button.setText(charSequenceI);
        r.u(button, drawableMutate, null, null, null);
        button.setOnClickListener(aVar != null ? aVar.c() : null);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        x.f258869a.f(i10, i11, new Function2() { // from class: com.planner5d.library.activity.fragment.list.views.a
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return b.x(this.f134438a, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
            }
        });
    }

    public final void setButtons(@NotNull a... buttons) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        r5 r5VarA = r5.a(this);
        Button button0 = r5VarA.f159598b;
        Intrinsics.checkNotNullExpressionValue(button0, "button0");
        a[] aVarArr = !(buttons.length == 0) ? buttons : null;
        y(button0, aVarArr != null ? aVarArr[0] : null);
        Button button1 = r5VarA.f159599c;
        Intrinsics.checkNotNullExpressionValue(button1, "button1");
        a[] aVarArr2 = buttons.length >= 2 ? buttons : null;
        y(button1, aVarArr2 != null ? aVarArr2[1] : null);
        Button button2 = r5VarA.f159600d;
        Intrinsics.checkNotNullExpressionValue(button2, "button2");
        if (buttons.length < 3) {
            buttons = null;
        }
        y(button2, buttons != null ? buttons[2] : null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, f.m.X7, this);
        this.f134440a = context.getResources().getDimensionPixelSize(f.g.f167334vh);
    }
}
