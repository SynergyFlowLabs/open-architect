package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DialogPreference extends Preference {
    private CharSequence A3;
    private Drawable B3;
    private CharSequence C3;
    private CharSequence D3;
    private int E3;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    private CharSequence f72916z3;

    public interface a {
        @p0
        <T extends Preference> T e(@NonNull CharSequence charSequence);
    }

    public DialogPreference(@NonNull Context context, @p0 AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v.k.f73302k, i10, i11);
        String strO = androidx.core.content.res.n.o(typedArrayObtainStyledAttributes, v.k.f73332u, v.k.f73305l);
        this.f72916z3 = strO;
        if (strO == null) {
            this.f72916z3 = d0();
        }
        this.A3 = androidx.core.content.res.n.o(typedArrayObtainStyledAttributes, v.k.f73329t, v.k.f73308m);
        this.B3 = androidx.core.content.res.n.c(typedArrayObtainStyledAttributes, v.k.f73323r, v.k.f73311n);
        this.C3 = androidx.core.content.res.n.o(typedArrayObtainStyledAttributes, v.k.f73338w, v.k.f73314o);
        this.D3 = androidx.core.content.res.n.o(typedArrayObtainStyledAttributes, v.k.f73335v, v.k.f73317p);
        this.E3 = androidx.core.content.res.n.n(typedArrayObtainStyledAttributes, v.k.f73326s, v.k.f73320q, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @p0
    public Drawable D1() {
        return this.B3;
    }

    public int E1() {
        return this.E3;
    }

    @p0
    public CharSequence F1() {
        return this.A3;
    }

    @p0
    public CharSequence G1() {
        return this.f72916z3;
    }

    @p0
    public CharSequence H1() {
        return this.D3;
    }

    @p0
    public CharSequence I1() {
        return this.C3;
    }

    public void J1(int i10) {
        this.B3 = j.a.b(r(), i10);
    }

    public void K1(@p0 Drawable drawable) {
        this.B3 = drawable;
    }

    public void L1(int i10) {
        this.E3 = i10;
    }

    public void N1(int i10) {
        O1(r().getString(i10));
    }

    public void O1(@p0 CharSequence charSequence) {
        this.A3 = charSequence;
    }

    public void P1(int i10) {
        Q1(r().getString(i10));
    }

    public void Q1(@p0 CharSequence charSequence) {
        this.f72916z3 = charSequence;
    }

    public void R1(int i10) {
        S1(r().getString(i10));
    }

    public void S1(@p0 CharSequence charSequence) {
        this.D3 = charSequence;
    }

    public void T1(int i10) {
        U1(r().getString(i10));
    }

    public void U1(@p0 CharSequence charSequence) {
        this.C3 = charSequence;
    }

    @Override // androidx.preference.Preference
    protected void v0() {
        X().I(this);
    }

    public DialogPreference(@NonNull Context context, @p0 AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public DialogPreference(@NonNull Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, androidx.core.content.res.n.a(context, v.a.f73183k, R.attr.dialogPreferenceStyle));
    }

    public DialogPreference(@NonNull Context context) {
        this(context, null);
    }
}
