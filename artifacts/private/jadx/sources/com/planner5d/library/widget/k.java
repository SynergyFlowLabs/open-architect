package com.planner5d.library.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.planner5d.library.services.utility.k3;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class k extends ConstraintLayout implements com.planner5d.library.services.o.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f258216d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<com.planner5d.library.services.q0.g<Boolean>> f258217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final p0 f258218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final te.l f258219c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.planner5d.library.services.o.a
    public void f(@NotNull com.planner5d.library.services.o.b type, @Nullable k3 k3Var) {
        CharSequence charSequenceI;
        Intrinsics.checkNotNullParameter(type, "type");
        TextView textView = this.f258219c.f380953c;
        if (k3Var != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            charSequenceI = k3Var.i(context);
        } else {
            charSequenceI = null;
        }
        textView.setText(charSequenceI);
        androidx.core.widget.d.d(this.f258219c.f380952b, androidx.core.content.d.h(getContext(), k3Var == null ? c1.e.Rf : c1.e.f250732rf));
    }

    @NotNull
    public final TextView getTextView() {
        MaterialCheckBox checkbox = this.f258219c.f380952b;
        Intrinsics.checkNotNullExpressionValue(checkbox, "checkbox");
        return checkbox;
    }

    @Override // com.planner5d.library.services.o.a
    @Nullable
    public String getValue() {
        return null;
    }

    public final void setChecked(boolean z10) {
        this.f258219c.f380952b.setChecked(z10);
    }

    public final void setText(@NotNull CharSequence label) {
        Intrinsics.checkNotNullParameter(label, "label");
        p0 p0Var = this.f258218b;
        MaterialCheckBox checkbox = this.f258219c.f380952b;
        Intrinsics.checkNotNullExpressionValue(checkbox, "checkbox");
        p0Var.b(checkbox, label, null);
    }

    @Override // com.planner5d.library.widget.EditTextWithValidator.b
    public boolean validate() {
        this.f258219c.f380953c.setText((CharSequence) null);
        androidx.core.widget.d.d(this.f258219c.f380952b, androidx.core.content.d.h(getContext(), c1.e.Rf));
        Iterator<com.planner5d.library.services.q0.g<Boolean>> it = this.f258217a.iterator();
        while (it.hasNext()) {
            String strA = it.next().a(Boolean.valueOf(this.f258219c.f380952b.isChecked()));
            if (strA != null) {
                this.f258219c.f380953c.setText(strA);
                androidx.core.widget.d.d(this.f258219c.f380952b, androidx.core.content.d.h(getContext(), c1.e.f250732rf));
                return false;
            }
        }
        return true;
    }

    public final void w(@NotNull CompoundButton.OnCheckedChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f258219c.f380952b.setOnCheckedChangeListener(listener);
    }

    public final void x(@NotNull com.planner5d.library.services.q0.g<Boolean> validator) {
        Intrinsics.checkNotNullParameter(validator, "validator");
        this.f258217a.add(validator);
    }

    public final boolean y() {
        return this.f258219c.f380952b.isChecked();
    }

    public final void z(@androidx.annotation.f1 int i10, @androidx.annotation.f1 @Nullable Integer num) {
        p0 p0Var = this.f258218b;
        MaterialCheckBox checkbox = this.f258219c.f380952b;
        Intrinsics.checkNotNullExpressionValue(checkbox, "checkbox");
        p0Var.a(checkbox, i10, num);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f258217a = new LinkedList();
        this.f258219c = te.l.a(View.inflate(context, c1.l.f252138b2, this));
        this.f258218b = new p0(context, attributeSet, i10);
    }
}
