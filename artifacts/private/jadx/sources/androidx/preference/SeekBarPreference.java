package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes3.dex */
public class SeekBarPreference extends Preference {
    private static final String L3 = "SeekBarPreference";
    int A3;
    private int B3;
    private int C3;
    boolean D3;
    SeekBar E3;
    private TextView F3;
    boolean G3;
    private boolean H3;
    boolean I3;
    private final SeekBar.OnSeekBarChangeListener J3;
    private final View.OnKeyListener K3;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    int f72969z3;

    class a implements SeekBar.OnSeekBarChangeListener {
        a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            if (z10) {
                SeekBarPreference seekBarPreference = SeekBarPreference.this;
                if (seekBarPreference.I3 || !seekBarPreference.D3) {
                    seekBarPreference.T1(seekBar);
                    return;
                }
            }
            SeekBarPreference seekBarPreference2 = SeekBarPreference.this;
            seekBarPreference2.U1(i10 + seekBarPreference2.A3);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.D3 = true;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.D3 = false;
            int progress = seekBar.getProgress();
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if (progress + seekBarPreference.A3 != seekBarPreference.f72969z3) {
                seekBarPreference.T1(seekBar);
            }
        }
    }

    class b implements View.OnKeyListener {
        b() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if (!seekBarPreference.G3 && (i10 == 21 || i10 == 22)) {
                return false;
            }
            if (i10 != 23 && i10 != 66) {
                SeekBar seekBar = seekBarPreference.E3;
                if (seekBar == null) {
                    return false;
                }
                return seekBar.onKeyDown(i10, keyEvent);
            }
            return false;
        }
    }

    public SeekBarPreference(@NonNull Context context, @p0 AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.J3 = new a();
        this.K3 = new b();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v.k.f73292g1, i10, i11);
        this.A3 = typedArrayObtainStyledAttributes.getInt(v.k.f73304k1, 0);
        L1(typedArrayObtainStyledAttributes.getInt(v.k.f73298i1, 100));
        O1(typedArrayObtainStyledAttributes.getInt(v.k.f73307l1, 0));
        int i12 = 5 ^ 1;
        this.G3 = typedArrayObtainStyledAttributes.getBoolean(v.k.f73301j1, true);
        this.H3 = typedArrayObtainStyledAttributes.getBoolean(v.k.f73310m1, false);
        this.I3 = typedArrayObtainStyledAttributes.getBoolean(v.k.f73313n1, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void S1(int i10, boolean z10) {
        int i11 = this.A3;
        if (i10 < i11) {
            i10 = i11;
        }
        int i12 = this.B3;
        if (i10 > i12) {
            i10 = i12;
        }
        if (i10 != this.f72969z3) {
            this.f72969z3 = i10;
            U1(i10);
            L0(i10);
            if (z10) {
                o0();
            }
        }
    }

    @Override // androidx.preference.Preference
    protected void C0(@p0 Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.C0(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.C0(savedState.getSuperState());
        this.f72969z3 = savedState.f72970a;
        this.A3 = savedState.f72971b;
        this.B3 = savedState.f72972c;
        o0();
    }

    @Override // androidx.preference.Preference
    @p0
    protected Parcelable D0() {
        Parcelable parcelableD0 = super.D0();
        if (j0()) {
            return parcelableD0;
        }
        SavedState savedState = new SavedState(parcelableD0);
        savedState.f72970a = this.f72969z3;
        savedState.f72971b = this.A3;
        savedState.f72972c = this.B3;
        return savedState;
    }

    public int D1() {
        return this.B3;
    }

    @Override // androidx.preference.Preference
    protected void E0(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        R1(S(((Integer) obj).intValue()));
    }

    public int E1() {
        return this.A3;
    }

    public final int F1() {
        return this.C3;
    }

    public boolean G1() {
        return this.H3;
    }

    public boolean H1() {
        return this.I3;
    }

    public int I1() {
        return this.f72969z3;
    }

    public boolean J1() {
        return this.G3;
    }

    public void K1(boolean z10) {
        this.G3 = z10;
    }

    public final void L1(int i10) {
        int i11 = this.A3;
        if (i10 < i11) {
            i10 = i11;
        }
        if (i10 != this.B3) {
            this.B3 = i10;
            o0();
        }
    }

    public void N1(int i10) {
        int i11 = this.B3;
        if (i10 > i11) {
            i10 = i11;
        }
        if (i10 != this.A3) {
            this.A3 = i10;
            o0();
        }
    }

    public final void O1(int i10) {
        if (i10 != this.C3) {
            this.C3 = Math.min(this.B3 - this.A3, Math.abs(i10));
            o0();
        }
    }

    public void P1(boolean z10) {
        this.H3 = z10;
        o0();
    }

    public void Q1(boolean z10) {
        this.I3 = z10;
    }

    public void R1(int i10) {
        S1(i10, true);
    }

    void T1(@NonNull SeekBar seekBar) {
        int progress = this.A3 + seekBar.getProgress();
        if (progress != this.f72969z3) {
            if (c(Integer.valueOf(progress))) {
                S1(progress, false);
            } else {
                seekBar.setProgress(this.f72969z3 - this.A3);
                U1(this.f72969z3);
            }
        }
    }

    void U1(int i10) {
        TextView textView = this.F3;
        if (textView != null) {
            textView.setText(String.valueOf(i10));
        }
    }

    @Override // androidx.preference.Preference
    public void u0(@NonNull u uVar) {
        super.u0(uVar);
        uVar.itemView.setOnKeyListener(this.K3);
        this.E3 = (SeekBar) uVar.h(v.f.f73215f);
        TextView textView = (TextView) uVar.h(v.f.f73216g);
        this.F3 = textView;
        if (this.H3) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.F3 = null;
        }
        SeekBar seekBar = this.E3;
        if (seekBar == null) {
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.J3);
        this.E3.setMax(this.B3 - this.A3);
        int i10 = this.C3;
        if (i10 != 0) {
            this.E3.setKeyProgressIncrement(i10);
        } else {
            this.C3 = this.E3.getKeyProgressIncrement();
        }
        this.E3.setProgress(this.f72969z3 - this.A3);
        U1(this.f72969z3);
        this.E3.setEnabled(h0());
    }

    @Override // androidx.preference.Preference
    @p0
    protected Object y0(@NonNull TypedArray typedArray, int i10) {
        return Integer.valueOf(typedArray.getInt(i10, 0));
    }

    private static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f72970a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f72971b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f72972c;

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
            this.f72970a = parcel.readInt();
            this.f72971b = parcel.readInt();
            this.f72972c = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f72970a);
            parcel.writeInt(this.f72971b);
            parcel.writeInt(this.f72972c);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public SeekBarPreference(@NonNull Context context, @p0 AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public SeekBarPreference(@NonNull Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, v.a.T);
    }

    public SeekBarPreference(@NonNull Context context) {
        this(context, null);
    }
}
