package androidx.preference;

import android.R;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes3.dex */
public class DropDownPreference extends ListPreference {
    private final Context L3;
    private final ArrayAdapter M3;
    private Spinner N3;
    private final AdapterView.OnItemSelectedListener O3;

    class a implements AdapterView.OnItemSelectedListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            if (i10 >= 0) {
                String string = DropDownPreference.this.Y1()[i10].toString();
                if (!string.equals(DropDownPreference.this.Z1()) && DropDownPreference.this.c(string)) {
                    DropDownPreference.this.f2(string);
                }
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public DropDownPreference(@NonNull Context context) {
        this(context, null);
    }

    private int i2(String str) {
        CharSequence[] charSequenceArrY1 = Y1();
        if (str == null || charSequenceArrY1 == null) {
            return -1;
        }
        for (int length = charSequenceArrY1.length - 1; length >= 0; length--) {
            if (TextUtils.equals(charSequenceArrY1[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    private void j2() {
        this.M3.clear();
        if (W1() != null) {
            for (CharSequence charSequence : W1()) {
                this.M3.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.ListPreference
    public void c2(@NonNull CharSequence[] charSequenceArr) {
        super.c2(charSequenceArr);
        j2();
    }

    @Override // androidx.preference.ListPreference
    public void g2(int i10) {
        f2(Y1()[i10].toString());
    }

    @NonNull
    protected ArrayAdapter h2() {
        return new ArrayAdapter(this.L3, R.layout.simple_spinner_dropdown_item);
    }

    @Override // androidx.preference.Preference
    protected void o0() {
        super.o0();
        ArrayAdapter arrayAdapter = this.M3;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.Preference
    public void u0(@NonNull u uVar) {
        Spinner spinner = (Spinner) uVar.itemView.findViewById(v.f.f73217h);
        this.N3 = spinner;
        spinner.setAdapter((SpinnerAdapter) this.M3);
        this.N3.setOnItemSelectedListener(this.O3);
        this.N3.setSelection(i2(Z1()));
        super.u0(uVar);
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    protected void v0() {
        this.N3.performClick();
    }

    public DropDownPreference(@NonNull Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, v.a.f73186n);
    }

    public DropDownPreference(@NonNull Context context, @p0 AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public DropDownPreference(@NonNull Context context, @p0 AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.O3 = new a();
        this.L3 = context;
        this.M3 = h2();
        j2();
    }
}
