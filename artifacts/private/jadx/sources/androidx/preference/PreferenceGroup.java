package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.collection.h3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PreferenceGroup extends Preference {
    private static final String I3 = "PreferenceGroup";
    private final Handler A3;
    private final List<Preference> B3;
    private boolean C3;
    private int D3;
    private boolean E3;
    private int F3;
    private b G3;
    private final Runnable H3;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    final h3<String, Long> f72966z3;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                try {
                    PreferenceGroup.this.f72966z3.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public interface b {
        void a();
    }

    public interface c {
        int c(@NonNull Preference preference);

        int e(@NonNull String str);
    }

    public PreferenceGroup(@NonNull Context context, @p0 AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f72966z3 = new h3<>();
        this.A3 = new Handler(Looper.getMainLooper());
        this.C3 = true;
        this.D3 = 0;
        this.E3 = false;
        this.F3 = Integer.MAX_VALUE;
        this.G3 = null;
        this.H3 = new a();
        this.B3 = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v.k.F0, i10, i11);
        int i12 = v.k.I0;
        this.C3 = androidx.core.content.res.n.b(typedArrayObtainStyledAttributes, i12, i12, true);
        if (typedArrayObtainStyledAttributes.hasValue(v.k.H0)) {
            int i13 = v.k.H0;
            T1(androidx.core.content.res.n.d(typedArrayObtainStyledAttributes, i13, i13, Integer.MAX_VALUE));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private boolean R1(@NonNull Preference preference) {
        boolean zRemove;
        synchronized (this) {
            try {
                preference.B0();
                if (preference.N() == this) {
                    int i10 = 2 << 0;
                    preference.b(null);
                }
                zRemove = this.B3.remove(preference);
                if (zRemove) {
                    String strE = preference.E();
                    if (strE != null) {
                        this.f72966z3.put(strE, Long.valueOf(preference.z()));
                        this.A3.removeCallbacks(this.H3);
                        this.A3.post(this.H3);
                    }
                    if (this.E3) {
                        preference.x0();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zRemove;
    }

    @Override // androidx.preference.Preference
    protected void C0(@p0 Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.C0(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.F3 = savedState.f72967a;
        super.C0(savedState.getSuperState());
    }

    @Override // androidx.preference.Preference
    @NonNull
    protected Parcelable D0() {
        return new SavedState(super.D0(), this.F3);
    }

    public void D1(@NonNull Preference preference) {
        E1(preference);
    }

    public boolean E1(@NonNull Preference preference) {
        long jH;
        if (this.B3.contains(preference)) {
            return true;
        }
        if (preference.E() != null) {
            PreferenceGroup preferenceGroupN = this;
            while (preferenceGroupN.N() != null) {
                preferenceGroupN = preferenceGroupN.N();
            }
            preferenceGroupN.F1(preference.E());
        }
        if (preference.M() == Integer.MAX_VALUE) {
            if (this.C3) {
                int i10 = this.D3;
                this.D3 = i10 + 1;
                preference.j1(i10);
            }
            if (preference instanceof PreferenceGroup) {
                ((PreferenceGroup) preference).V1(this.C3);
            }
        }
        int iBinarySearch = Collections.binarySearch(this.B3, preference);
        if (iBinarySearch < 0) {
            iBinarySearch = (iBinarySearch * (-1)) - 1;
        }
        if (!O1(preference)) {
            int i11 = 3 ^ 0;
            return false;
        }
        synchronized (this) {
            this.B3.add(iBinarySearch, preference);
        }
        s sVarX = X();
        String strE = preference.E();
        if (strE == null || !this.f72966z3.containsKey(strE)) {
            jH = sVarX.h();
        } else {
            jH = this.f72966z3.get(strE).longValue();
            this.f72966z3.remove(strE);
        }
        preference.t0(sVarX, jH);
        preference.b(this);
        if (this.E3) {
            preference.r0();
        }
        q0();
        return true;
    }

    @p0
    public <T extends Preference> T F1(@NonNull CharSequence charSequence) {
        T t10;
        if (charSequence == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
        if (TextUtils.equals(E(), charSequence)) {
            return this;
        }
        int iJ1 = J1();
        for (int i10 = 0; i10 < iJ1; i10++) {
            PreferenceGroup preferenceGroup = (T) I1(i10);
            if (TextUtils.equals(preferenceGroup.E(), charSequence)) {
                return preferenceGroup;
            }
            if ((preferenceGroup instanceof PreferenceGroup) && (t10 = (T) preferenceGroup.F1(charSequence)) != null) {
                return t10;
            }
        }
        return null;
    }

    public int G1() {
        return this.F3;
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @p0
    public b H1() {
        return this.G3;
    }

    @NonNull
    public Preference I1(int i10) {
        return this.B3.get(i10);
    }

    public int J1() {
        return this.B3.size();
    }

    @b1({b1.a.LIBRARY})
    public boolean K1() {
        return this.E3;
    }

    protected boolean L1() {
        return true;
    }

    public boolean N1() {
        return this.C3;
    }

    protected boolean O1(@NonNull Preference preference) {
        preference.A0(this, x1());
        return true;
    }

    public void P1() {
        synchronized (this) {
            try {
                List<Preference> list = this.B3;
                for (int size = list.size() - 1; size >= 0; size--) {
                    R1(list.get(0));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        q0();
    }

    public boolean Q1(@NonNull Preference preference) {
        boolean zR1 = R1(preference);
        q0();
        return zR1;
    }

    public boolean S1(@NonNull CharSequence charSequence) {
        Preference preferenceF1 = F1(charSequence);
        if (preferenceF1 == null) {
            return false;
        }
        return preferenceF1.N().Q1(preferenceF1);
    }

    public void T1(int i10) {
        if (i10 != Integer.MAX_VALUE) {
            f0();
        }
        this.F3 = i10;
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void U1(@p0 b bVar) {
        this.G3 = bVar;
    }

    public void V1(boolean z10) {
        this.C3 = z10;
    }

    void W1() {
        synchronized (this) {
            Collections.sort(this.B3);
        }
    }

    @Override // androidx.preference.Preference
    protected void n(@NonNull Bundle bundle) {
        super.n(bundle);
        int iJ1 = J1();
        for (int i10 = 0; i10 < iJ1; i10++) {
            I1(i10).n(bundle);
        }
    }

    @Override // androidx.preference.Preference
    protected void o(@NonNull Bundle bundle) {
        super.o(bundle);
        int iJ1 = J1();
        for (int i10 = 0; i10 < iJ1; i10++) {
            I1(i10).o(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public void p0(boolean z10) {
        super.p0(z10);
        int iJ1 = J1();
        for (int i10 = 0; i10 < iJ1; i10++) {
            I1(i10).A0(this, z10);
        }
    }

    @Override // androidx.preference.Preference
    public void r0() {
        super.r0();
        this.E3 = true;
        int iJ1 = J1();
        for (int i10 = 0; i10 < iJ1; i10++) {
            I1(i10).r0();
        }
    }

    @Override // androidx.preference.Preference
    public void x0() {
        super.x0();
        this.E3 = false;
        int iJ1 = J1();
        for (int i10 = 0; i10 < iJ1; i10++) {
            I1(i10).x0();
        }
    }

    static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f72967a;

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
            this.f72967a = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f72967a);
        }

        SavedState(Parcelable parcelable, int i10) {
            super(parcelable);
            this.f72967a = i10;
        }
    }

    public PreferenceGroup(@NonNull Context context, @p0 AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public PreferenceGroup(@NonNull Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
