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
import androidx.appcompat.widget.SwitchCompat;

/* JADX INFO: loaded from: classes3.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {
    private final a E3;
    private CharSequence F3;
    private CharSequence G3;

    private class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (SwitchPreferenceCompat.this.c(Boolean.valueOf(z10))) {
                SwitchPreferenceCompat.this.H1(z10);
            } else {
                compoundButton.setChecked(!z10);
            }
        }
    }

    public SwitchPreferenceCompat(@NonNull Context context, @p0 AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.E3 = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v.k.f73349z1, i10, i11);
        N1(androidx.core.content.res.n.o(typedArrayObtainStyledAttributes, v.k.H1, v.k.A1));
        K1(androidx.core.content.res.n.o(typedArrayObtainStyledAttributes, v.k.G1, v.k.B1));
        V1(androidx.core.content.res.n.o(typedArrayObtainStyledAttributes, v.k.J1, v.k.D1));
        T1(androidx.core.content.res.n.o(typedArrayObtainStyledAttributes, v.k.I1, v.k.E1));
        I1(androidx.core.content.res.n.b(typedArrayObtainStyledAttributes, v.k.F1, v.k.C1, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void W1(View view) {
        boolean z10 = view instanceof SwitchCompat;
        if (z10) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f72977z3);
        }
        if (z10) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.F3);
            switchCompat.setTextOff(this.G3);
            switchCompat.setOnCheckedChangeListener(this.E3);
        }
    }

    private void X1(View view) {
        if (((AccessibilityManager) r().getSystemService("accessibility")).isEnabled()) {
            W1(view.findViewById(v.f.f73218i));
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
        W1(uVar.h(v.f.f73218i));
        P1(uVar);
    }

    public SwitchPreferenceCompat(@NonNull Context context, @p0 AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public SwitchPreferenceCompat(@NonNull Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, v.a.f73168c0);
    }

    public SwitchPreferenceCompat(@NonNull Context context) {
        this(context, null);
    }
}
