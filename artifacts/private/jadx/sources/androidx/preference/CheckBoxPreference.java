package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes3.dex */
public class CheckBoxPreference extends TwoStatePreference {
    private final a E3;

    private class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (CheckBoxPreference.this.c(Boolean.valueOf(z10))) {
                CheckBoxPreference.this.H1(z10);
            } else {
                compoundButton.setChecked(!z10);
            }
        }
    }

    public CheckBoxPreference(@NonNull Context context, @p0 AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void Q1(View view) {
        boolean z10 = view instanceof CompoundButton;
        if (z10) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f72977z3);
        }
        if (z10) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.E3);
        }
    }

    private void R1(@NonNull View view) {
        if (((AccessibilityManager) r().getSystemService("accessibility")).isEnabled()) {
            Q1(view.findViewById(R.id.checkbox));
            O1(view.findViewById(R.id.summary));
        }
    }

    @Override // androidx.preference.Preference
    @b1({b1.a.LIBRARY})
    protected void I0(@NonNull View view) {
        super.I0(view);
        R1(view);
    }

    @Override // androidx.preference.Preference
    public void u0(@NonNull u uVar) {
        super.u0(uVar);
        Q1(uVar.h(R.id.checkbox));
        P1(uVar);
    }

    public CheckBoxPreference(@NonNull Context context, @p0 AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.E3 = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v.k.f73281d, i10, i11);
        N1(androidx.core.content.res.n.o(typedArrayObtainStyledAttributes, v.k.f73299j, v.k.f73284e));
        K1(androidx.core.content.res.n.o(typedArrayObtainStyledAttributes, v.k.f73296i, v.k.f73287f));
        I1(androidx.core.content.res.n.b(typedArrayObtainStyledAttributes, v.k.f73293h, v.k.f73290g, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    public CheckBoxPreference(@NonNull Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, androidx.core.content.res.n.a(context, v.a.f73171e, R.attr.checkBoxPreferenceStyle));
    }

    public CheckBoxPreference(@NonNull Context context) {
        this(context, null);
    }
}
