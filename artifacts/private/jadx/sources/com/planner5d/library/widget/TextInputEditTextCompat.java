package com.planner5d.library.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.planner5d.library.services.utility.k3;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class TextInputEditTextCompat extends TextInputEditText implements EditTextWithValidator.b, com.planner5d.library.services.o.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f249527n = 8;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final List<com.planner5d.library.services.q0.g<String>> f249528i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private CharSequence f249529j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final ColorStateList f249530k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final ColorStateList f249531l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final ColorStateList f249532m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextInputEditTextCompat(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f249528i = new LinkedList();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(androidx.core.content.d.g(getContext(), c1.e.f250479gg));
        Intrinsics.checkNotNullExpressionValue(colorStateListValueOf, "valueOf(...)");
        this.f249530k = colorStateListValueOf;
        ColorStateList colorStateListValueOf2 = ColorStateList.valueOf(androidx.core.content.d.g(getContext(), c1.e.f250732rf));
        Intrinsics.checkNotNullExpressionValue(colorStateListValueOf2, "valueOf(...)");
        this.f249531l = colorStateListValueOf2;
        ColorStateList colorStateListValueOf3 = ColorStateList.valueOf(androidx.core.content.d.g(getContext(), c1.e.Rf));
        Intrinsics.checkNotNullExpressionValue(colorStateListValueOf3, "valueOf(...)");
        this.f249532m = colorStateListValueOf3;
    }

    @Override // com.planner5d.library.services.o.a
    public void f(@NotNull com.planner5d.library.services.o.b type, @Nullable k3 k3Var) {
        CharSequence charSequenceI;
        TextInputLayout textInputLayout;
        Intrinsics.checkNotNullParameter(type, "type");
        if (k3Var != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            charSequenceI = k3Var.i(context);
        } else {
            charSequenceI = null;
        }
        setError(charSequenceI);
        if (type != com.planner5d.library.services.o.b.Success || (textInputLayout = getTextInputLayout()) == null) {
            return;
        }
        textInputLayout.setBoxStrokeErrorColor(this.f249532m);
        textInputLayout.setErrorTextColor(this.f249532m);
        textInputLayout.setDefaultHintTextColor(this.f249532m);
    }

    @Nullable
    public final String getTextAsString() {
        String string;
        Editable text = getText();
        if (text == null || (string = text.toString()) == null) {
            return null;
        }
        return StringsKt.E5(string).toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.planner5d.library.widget.TextInputEditTextCompat] */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.view.View] */
    @Nullable
    public final TextInputLayout getTextInputLayout() {
        do {
            this = (View) this.getParent();
            if (this == 0) {
                return null;
            }
        } while (!(this instanceof TextInputLayout));
        return (TextInputLayout) this;
    }

    @Override // com.planner5d.library.services.o.a
    @Nullable
    public String getValue() {
        return getTextAsString();
    }

    public final void i(@NotNull com.planner5d.library.services.q0.g<String> validator) {
        Intrinsics.checkNotNullParameter(validator, "validator");
        this.f249528i.add(validator);
    }

    @Override // android.widget.TextView
    public void setError(@Nullable CharSequence charSequence) {
        if (Intrinsics.areEqual(this.f249529j, charSequence)) {
            return;
        }
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            textInputLayout.setError(charSequence);
            textInputLayout.setBoxStrokeErrorColor(this.f249531l);
            textInputLayout.setErrorTextColor(this.f249531l);
            textInputLayout.setDefaultHintTextColor(charSequence == null ? this.f249530k : this.f249531l);
        } else {
            super.setError(charSequence);
        }
        this.f249529j = charSequence;
    }

    @Override // com.planner5d.library.widget.EditTextWithValidator.b
    public boolean validate() {
        setError(null);
        String textAsString = getTextAsString();
        Iterator<com.planner5d.library.services.q0.g<String>> it = this.f249528i.iterator();
        while (it.hasNext()) {
            String strA = it.next().a(textAsString);
            if (strA != null) {
                setError(strA);
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextInputEditTextCompat(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f249528i = new LinkedList();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(androidx.core.content.d.g(getContext(), c1.e.f250479gg));
        Intrinsics.checkNotNullExpressionValue(colorStateListValueOf, "valueOf(...)");
        this.f249530k = colorStateListValueOf;
        ColorStateList colorStateListValueOf2 = ColorStateList.valueOf(androidx.core.content.d.g(getContext(), c1.e.f250732rf));
        Intrinsics.checkNotNullExpressionValue(colorStateListValueOf2, "valueOf(...)");
        this.f249531l = colorStateListValueOf2;
        ColorStateList colorStateListValueOf3 = ColorStateList.valueOf(androidx.core.content.d.g(getContext(), c1.e.Rf));
        Intrinsics.checkNotNullExpressionValue(colorStateListValueOf3, "valueOf(...)");
        this.f249532m = colorStateListValueOf3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextInputEditTextCompat(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f249528i = new LinkedList();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(androidx.core.content.d.g(getContext(), c1.e.f250479gg));
        Intrinsics.checkNotNullExpressionValue(colorStateListValueOf, "valueOf(...)");
        this.f249530k = colorStateListValueOf;
        ColorStateList colorStateListValueOf2 = ColorStateList.valueOf(androidx.core.content.d.g(getContext(), c1.e.f250732rf));
        Intrinsics.checkNotNullExpressionValue(colorStateListValueOf2, "valueOf(...)");
        this.f249531l = colorStateListValueOf2;
        ColorStateList colorStateListValueOf3 = ColorStateList.valueOf(androidx.core.content.d.g(getContext(), c1.e.Rf));
        Intrinsics.checkNotNullExpressionValue(colorStateListValueOf3, "valueOf(...)");
        this.f249532m = colorStateListValueOf3;
    }
}
