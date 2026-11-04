package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class TwoStatePreference extends Preference {
    private CharSequence A3;
    private CharSequence B3;
    private boolean C3;
    private boolean D3;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    protected boolean f72977z3;

    public TwoStatePreference(@NonNull Context context, @p0 AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }

    @Override // androidx.preference.Preference
    protected void C0(@p0 Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.C0(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.C0(savedState.getSuperState());
        H1(savedState.f72978a);
    }

    @Override // androidx.preference.Preference
    @p0
    protected Parcelable D0() {
        Parcelable parcelableD0 = super.D0();
        if (j0()) {
            return parcelableD0;
        }
        SavedState savedState = new SavedState(parcelableD0);
        savedState.f72978a = G1();
        return savedState;
    }

    public boolean D1() {
        return this.D3;
    }

    @Override // androidx.preference.Preference
    protected void E0(Object obj) {
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        H1(O(((Boolean) obj).booleanValue()));
    }

    @p0
    public CharSequence E1() {
        return this.B3;
    }

    @p0
    public CharSequence F1() {
        return this.A3;
    }

    public boolean G1() {
        return this.f72977z3;
    }

    public void H1(boolean z10) {
        boolean z11 = this.f72977z3 != z10;
        if (z11 || !this.C3) {
            this.f72977z3 = z10;
            this.C3 = true;
            J0(z10);
            if (z11) {
                p0(x1());
                o0();
            }
        }
    }

    public void I1(boolean z10) {
        this.D3 = z10;
    }

    public void J1(int i10) {
        K1(r().getString(i10));
    }

    public void K1(@p0 CharSequence charSequence) {
        this.B3 = charSequence;
        if (!G1()) {
            o0();
        }
    }

    public void L1(int i10) {
        N1(r().getString(i10));
    }

    public void N1(@p0 CharSequence charSequence) {
        this.A3 = charSequence;
        if (G1()) {
            o0();
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0039  */
    /* JADX WARN: Code duplicated, block: B:20:0x0045  */
    /* JADX WARN: Code duplicated, block: B:23:0x004c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0054  */
    @b1({b1.a.LIBRARY})
    protected void O1(View view) {
        boolean z10;
        int i10;
        CharSequence charSequenceA0;
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            if (!this.f72977z3 || TextUtils.isEmpty(this.A3)) {
                if (this.f72977z3 || TextUtils.isEmpty(this.B3)) {
                    z10 = true;
                } else {
                    textView.setText(this.B3);
                }
                if (z10) {
                    charSequenceA0 = a0();
                    if (!TextUtils.isEmpty(charSequenceA0)) {
                        textView.setText(charSequenceA0);
                        z10 = false;
                    }
                }
                i10 = z10 ? 8 : 0;
                if (i10 != textView.getVisibility()) {
                    textView.setVisibility(i10);
                }
            } else {
                textView.setText(this.A3);
            }
            z10 = false;
            if (z10) {
                charSequenceA0 = a0();
                if (!TextUtils.isEmpty(charSequenceA0)) {
                    textView.setText(charSequenceA0);
                    z10 = false;
                }
            }
            if (z10) {
            }
            if (i10 != textView.getVisibility()) {
                textView.setVisibility(i10);
            }
        }
    }

    protected void P1(@NonNull u uVar) {
        O1(uVar.h(R.id.summary));
    }

    @Override // androidx.preference.Preference
    protected void v0() {
        super.v0();
        boolean z10 = !G1();
        if (c(Boolean.valueOf(z10))) {
            H1(z10);
        }
    }

    @Override // androidx.preference.Preference
    public boolean x1() {
        boolean z10;
        if (this.D3) {
            z10 = this.f72977z3;
        } else {
            z10 = !this.f72977z3;
        }
        return z10 || super.x1();
    }

    @Override // androidx.preference.Preference
    @p0
    protected Object y0(@NonNull TypedArray typedArray, int i10) {
        return Boolean.valueOf(typedArray.getBoolean(i10, false));
    }

    static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f72978a;

        class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f72978a = parcel.readInt() == 1;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f72978a ? 1 : 0);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public TwoStatePreference(@NonNull Context context, @p0 AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public TwoStatePreference(@NonNull Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TwoStatePreference(@NonNull Context context) {
        this(context, null);
    }
}
