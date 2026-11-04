package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes3.dex */
public class EditTextPreference extends DialogPreference {
    private String F3;

    @p0
    private a G3;

    public interface a {
        void a(@NonNull EditText editText);
    }

    public static final class b implements Preference.f<EditTextPreference> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static b f72919a;

        private b() {
        }

        @NonNull
        public static b b() {
            if (f72919a == null) {
                f72919a = new b();
            }
            return f72919a;
        }

        @Override // androidx.preference.Preference.f
        @p0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public CharSequence a(@NonNull EditTextPreference editTextPreference) {
            return TextUtils.isEmpty(editTextPreference.W1()) ? editTextPreference.r().getString(v.i.f73241c) : editTextPreference.W1();
        }
    }

    public EditTextPreference(@NonNull Context context, @p0 AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v.k.f73341x, i10, i11);
        int i12 = v.k.f73344y;
        if (androidx.core.content.res.n.b(typedArrayObtainStyledAttributes, i12, i12, false)) {
            r1(b.b());
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    protected void C0(@p0 Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.C0(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.C0(savedState.getSuperState());
        Y1(savedState.f72918a);
    }

    @Override // androidx.preference.Preference
    @p0
    protected Parcelable D0() {
        Parcelable parcelableD0 = super.D0();
        if (j0()) {
            return parcelableD0;
        }
        SavedState savedState = new SavedState(parcelableD0);
        savedState.f72918a = W1();
        return savedState;
    }

    @Override // androidx.preference.Preference
    protected void E0(Object obj) {
        Y1(U((String) obj));
    }

    @p0
    a V1() {
        return this.G3;
    }

    @p0
    public String W1() {
        return this.F3;
    }

    public void X1(@p0 a aVar) {
        this.G3 = aVar;
    }

    public void Y1(@p0 String str) {
        boolean zX1 = x1();
        this.F3 = str;
        N0(str);
        boolean zX2 = x1();
        if (zX2 != zX1) {
            p0(zX2);
        }
        o0();
    }

    @Override // androidx.preference.Preference
    public boolean x1() {
        return TextUtils.isEmpty(this.F3) || super.x1();
    }

    @Override // androidx.preference.Preference
    protected Object y0(@NonNull TypedArray typedArray, int i10) {
        return typedArray.getString(i10);
    }

    private static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f72918a;

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
            this.f72918a = parcel.readString();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f72918a);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public EditTextPreference(@NonNull Context context, @p0 AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public EditTextPreference(@NonNull Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, androidx.core.content.res.n.a(context, v.a.f73187o, R.attr.editTextPreferenceStyle));
    }

    public EditTextPreference(@NonNull Context context) {
        this(context, null);
    }
}
