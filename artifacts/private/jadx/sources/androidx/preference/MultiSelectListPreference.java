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
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class MultiSelectListPreference extends DialogPreference {
    private CharSequence[] F3;
    private CharSequence[] G3;
    private Set<String> H3;

    public MultiSelectListPreference(@NonNull Context context, @p0 AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.H3 = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v.k.F, i10, i11);
        this.F3 = androidx.core.content.res.n.q(typedArrayObtainStyledAttributes, v.k.I, v.k.G);
        this.G3 = androidx.core.content.res.n.q(typedArrayObtainStyledAttributes, v.k.J, v.k.H);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    protected void C0(@p0 Parcelable parcelable) {
        if (parcelable != null && parcelable.getClass().equals(SavedState.class)) {
            SavedState savedState = (SavedState) parcelable;
            super.C0(savedState.getSuperState());
            e2(savedState.f72922a);
            return;
        }
        super.C0(parcelable);
    }

    @Override // androidx.preference.Preference
    @p0
    protected Parcelable D0() {
        Parcelable parcelableD0 = super.D0();
        if (j0()) {
            return parcelableD0;
        }
        SavedState savedState = new SavedState(parcelableD0);
        savedState.f72922a = Z1();
        return savedState;
    }

    @Override // androidx.preference.Preference
    protected void E0(Object obj) {
        e2(V((Set) obj));
    }

    public int V1(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.G3) == null) {
            return -1;
        }
        int length = charSequenceArr.length;
        do {
            length--;
            if (length < 0) {
                return -1;
            }
        } while (!TextUtils.equals(this.G3[length].toString(), str));
        return length;
    }

    public CharSequence[] W1() {
        return this.F3;
    }

    public CharSequence[] X1() {
        return this.G3;
    }

    protected boolean[] Y1() {
        CharSequence[] charSequenceArr = this.G3;
        int length = charSequenceArr.length;
        Set<String> set = this.H3;
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            zArr[i10] = set.contains(charSequenceArr[i10].toString());
        }
        return zArr;
    }

    public Set<String> Z1() {
        return this.H3;
    }

    public void a2(@androidx.annotation.e int i10) {
        b2(r().getResources().getTextArray(i10));
    }

    public void b2(CharSequence[] charSequenceArr) {
        this.F3 = charSequenceArr;
    }

    public void c2(@androidx.annotation.e int i10) {
        d2(r().getResources().getTextArray(i10));
    }

    public void d2(CharSequence[] charSequenceArr) {
        this.G3 = charSequenceArr;
    }

    public void e2(Set<String> set) {
        this.H3.clear();
        this.H3.addAll(set);
        O0(set);
        o0();
    }

    @Override // androidx.preference.Preference
    @p0
    protected Object y0(@NonNull TypedArray typedArray, int i10) {
        CharSequence[] textArray = typedArray.getTextArray(i10);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    private static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Set<String> f72922a;

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
            int i10 = parcel.readInt();
            this.f72922a = new HashSet();
            String[] strArr = new String[i10];
            parcel.readStringArray(strArr);
            Collections.addAll(this.f72922a, strArr);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f72922a.size());
            Set<String> set = this.f72922a;
            parcel.writeStringArray((String[]) set.toArray(new String[set.size()]));
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public MultiSelectListPreference(@NonNull Context context, @p0 AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public MultiSelectListPreference(@NonNull Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, androidx.core.content.res.n.a(context, v.a.f73183k, R.attr.dialogPreferenceStyle));
    }

    public MultiSelectListPreference(@NonNull Context context) {
        this(context, null);
    }
}
