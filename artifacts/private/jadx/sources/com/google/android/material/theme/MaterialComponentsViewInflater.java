package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.appcompat.app.s;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.e;
import androidx.appcompat.widget.h;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.radiobutton.a;
import com.google.android.material.textfield.v;

/* JADX INFO: loaded from: classes4.dex */
public class MaterialComponentsViewInflater extends s {
    @Override // androidx.appcompat.app.s
    @NonNull
    protected e c(@NonNull Context context, @p0 AttributeSet attributeSet) {
        return new v(context, attributeSet);
    }

    @Override // androidx.appcompat.app.s
    @NonNull
    protected h d(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // androidx.appcompat.app.s
    @NonNull
    protected AppCompatCheckBox e(Context context, AttributeSet attributeSet) {
        return new MaterialCheckBox(context, attributeSet);
    }

    @Override // androidx.appcompat.app.s
    @NonNull
    protected AppCompatRadioButton k(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }

    @Override // androidx.appcompat.app.s
    @NonNull
    protected AppCompatTextView o(Context context, AttributeSet attributeSet) {
        return new z6.a(context, attributeSet);
    }
}
