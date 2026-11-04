package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes3.dex */
public class ListPreference extends DialogPreference {
    private static final String K3 = "ListPreference";
    private CharSequence[] F3;
    private CharSequence[] G3;
    private String H3;
    private String I3;
    private boolean J3;

    public static final class a implements Preference.f<ListPreference> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static a f72921a;

        private a() {
        }

        @NonNull
        public static a b() {
            if (f72921a == null) {
                f72921a = new a();
            }
            return f72921a;
        }

        @Override // androidx.preference.Preference.f
        @p0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public CharSequence a(@NonNull ListPreference listPreference) {
            return TextUtils.isEmpty(listPreference.X1()) ? listPreference.r().getString(v.i.f73241c) : listPreference.X1();
        }
    }

    public ListPreference(@NonNull Context context, @p0 AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v.k.f73347z, i10, i11);
        this.F3 = androidx.core.content.res.n.q(typedArrayObtainStyledAttributes, v.k.C, v.k.A);
        this.G3 = androidx.core.content.res.n.q(typedArrayObtainStyledAttributes, v.k.D, v.k.B);
        int i12 = v.k.E;
        if (androidx.core.content.res.n.b(typedArrayObtainStyledAttributes, i12, i12, false)) {
            r1(a.b());
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, v.k.K, i10, i11);
        this.I3 = androidx.core.content.res.n.o(typedArrayObtainStyledAttributes2, v.k.f73327s0, v.k.S);
        typedArrayObtainStyledAttributes2.recycle();
    }

    private int a2() {
        return V1(this.H3);
    }

    @Override // androidx.preference.Preference
    protected void C0(@p0 Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.C0(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.C0(savedState.getSuperState());
        f2(savedState.f72920a);
    }

    @Override // androidx.preference.Preference
    @p0
    protected Parcelable D0() {
        Parcelable parcelableD0 = super.D0();
        if (j0()) {
            return parcelableD0;
        }
        SavedState savedState = new SavedState(parcelableD0);
        savedState.f72920a = Z1();
        return savedState;
    }

    @Override // androidx.preference.Preference
    protected void E0(Object obj) {
        f2(U((String) obj));
    }

    public int V1(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.G3) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (TextUtils.equals(this.G3[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    public CharSequence[] W1() {
        return this.F3;
    }

    @p0
    public CharSequence X1() {
        CharSequence[] charSequenceArr;
        int iA2 = a2();
        if (iA2 < 0 || (charSequenceArr = this.F3) == null) {
            return null;
        }
        return charSequenceArr[iA2];
    }

    public CharSequence[] Y1() {
        return this.G3;
    }

    public String Z1() {
        return this.H3;
    }

    @Override // androidx.preference.Preference
    @p0
    public CharSequence a0() {
        if (c0() != null) {
            return c0().a(this);
        }
        CharSequence charSequenceX1 = X1();
        CharSequence charSequenceA0 = super.a0();
        String str = this.I3;
        if (str != null) {
            if (charSequenceX1 == null) {
                charSequenceX1 = "";
            }
            String str2 = String.format(str, charSequenceX1);
            if (!TextUtils.equals(str2, charSequenceA0)) {
                return str2;
            }
        }
        return charSequenceA0;
    }

    public void b2(@androidx.annotation.e int i10) {
        c2(r().getResources().getTextArray(i10));
    }

    public void c2(CharSequence[] charSequenceArr) {
        this.F3 = charSequenceArr;
    }

    public void d2(@androidx.annotation.e int i10) {
        e2(r().getResources().getTextArray(i10));
    }

    public void e2(CharSequence[] charSequenceArr) {
        this.G3 = charSequenceArr;
    }

    public void f2(String str) {
        boolean zEquals = TextUtils.equals(this.H3, str);
        if (zEquals && this.J3) {
            return;
        }
        this.H3 = str;
        this.J3 = true;
        N0(str);
        if (zEquals) {
            return;
        }
        o0();
    }

    public void g2(int i10) {
        CharSequence[] charSequenceArr = this.G3;
        if (charSequenceArr != null) {
            f2(charSequenceArr[i10].toString());
        }
    }

    @Override // androidx.preference.Preference
    public void q1(@p0 CharSequence charSequence) {
        super.q1(charSequence);
        if (charSequence == null) {
            this.I3 = null;
        } else {
            this.I3 = charSequence.toString();
        }
    }

    @Override // androidx.preference.Preference
    protected Object y0(@NonNull TypedArray typedArray, int i10) {
        return typedArray.getString(i10);
    }

    private static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f72920a;

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
            this.f72920a = parcel.readString();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f72920a);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public ListPreference(@NonNull Context context, @p0 AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public ListPreference(@NonNull Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, androidx.core.content.res.n.a(context, v.a.f73183k, R.attr.dialogPreferenceStyle));
    }

    public ListPreference(@NonNull Context context) {
        this(context, null);
    }
}
