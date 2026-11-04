package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes3.dex */
public class SwitchPreference extends TwoStatePreference {
    private final a E3;
    private CharSequence F3;
    private CharSequence G3;

    private class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (SwitchPreference.this.c(Boolean.valueOf(z10))) {
                SwitchPreference.this.H1(z10);
            } else {
                compoundButton.setChecked(!z10);
            }
        }
    }

    public SwitchPreference(@NonNull Context context, @p0 AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.E3 = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v.k.f73316o1, i10, i11);
        N1(androidx.core.content.res.n.o(typedArrayObtainStyledAttributes, v.k.f73340w1, v.k.f73319p1));
        K1(androidx.core.content.res.n.o(typedArrayObtainStyledAttributes, v.k.f73337v1, v.k.f73322q1));
        V1(androidx.core.content.res.n.o(typedArrayObtainStyledAttributes, v.k.f73346y1, v.k.f73328s1));
        T1(androidx.core.content.res.n.o(typedArrayObtainStyledAttributes, v.k.f73343x1, v.k.f73331t1));
        I1(androidx.core.content.res.n.b(typedArrayObtainStyledAttributes, v.k.f73334u1, v.k.f73325r1, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void W1(View view) {
        boolean z10 = view instanceof Switch;
        if (z10) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f72977z3);
        }
        if (z10) {
            Switch r10 = (Switch) view;
            r10.setTextOn(this.F3);
            r10.setTextOff(this.G3);
            r10.setOnCheckedChangeListener(this.E3);
        }
    }

    private void X1(View view) {
        if (((AccessibilityManager) r().getSystemService("accessibility")).isEnabled()) {
            W1(view.findViewById(R.id.switch_widget));
            O1(view.findViewById(R.id.summary));
        }
    }

    @Override // androidx.preference.Preference
    @b1({b1.a.LIBRARY})
    protected void I0(@NonNull View view) {
        super.I0(view);
        X1(view);
    }

    @p0
    public CharSequence Q1() {
        return this.G3;
    }

    @p0
    public CharSequence R1() {
        return this.F3;
    }

    public void S1(int i10) {
        T1(r().getString(i10));
    }

    public void T1(@p0 CharSequence charSequence) {
        this.G3 = charSequence;
        o0();
    }

    public void U1(int i10) {
        V1(r().getString(i10));
    }

    public void V1(@p0 CharSequence charSequence) {
        this.F3 = charSequence;
        o0();
    }

    @Override // androidx.preference.Preference
    public void u0(@NonNull u uVar) {
        super.u0(uVar);
        W1(uVar.h(R.id.switch_widget));
        P1(uVar);
    }

    public SwitchPreference(@NonNull Context context, @p0 AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public SwitchPreference(@NonNull Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, androidx.core.content.res.n.a(context, v.a.f73170d0, R.attr.switchPreferenceStyle));
    }

    public SwitchPreference(@NonNull Context context) {
        this(context, null);
    }
}
