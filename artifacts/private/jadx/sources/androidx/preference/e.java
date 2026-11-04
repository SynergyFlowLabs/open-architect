package androidx.preference;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class e extends j {
    private static final String X = "ListPreferenceDialogFragment.entries";
    private static final String Y = "ListPreferenceDialogFragment.entryValues";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f72994w = "ListPreferenceDialogFragment.index";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    int f72995s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private CharSequence[] f72996t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private CharSequence[] f72997v;

    class a implements DialogInterface.OnClickListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            e eVar = e.this;
            eVar.f72995s = i10;
            eVar.onClick(dialogInterface, -1);
            dialogInterface.dismiss();
        }
    }

    @Deprecated
    public e() {
    }

    private ListPreference h() {
        return (ListPreference) a();
    }

    @NonNull
    @Deprecated
    public static e i(String str) {
        e eVar = new e();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        eVar.setArguments(bundle);
        return eVar;
    }

    @Override // androidx.preference.j
    @Deprecated
    public void e(boolean z10) {
        int i10;
        ListPreference listPreferenceH = h();
        if (!z10 || (i10 = this.f72995s) < 0) {
            return;
        }
        String string = this.f72997v[i10].toString();
        if (listPreferenceH.c(string)) {
            listPreferenceH.f2(string);
        }
    }

    @Override // androidx.preference.j
    protected void f(@NonNull AlertDialog.Builder builder) {
        super.f(builder);
        builder.setSingleChoiceItems(this.f72996t, this.f72995s, new a());
        builder.setPositiveButton((CharSequence) null, (DialogInterface.OnClickListener) null);
    }

    @Override // androidx.preference.j, android.app.DialogFragment, android.app.Fragment
    public void onCreate(@p0 Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f72995s = bundle.getInt(f72994w, 0);
            this.f72996t = bundle.getCharSequenceArray(X);
            this.f72997v = bundle.getCharSequenceArray(Y);
            return;
        }
        ListPreference listPreferenceH = h();
        if (listPreferenceH.W1() == null || listPreferenceH.Y1() == null) {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.f72995s = listPreferenceH.V1(listPreferenceH.Z1());
        this.f72996t = listPreferenceH.W1();
        this.f72997v = listPreferenceH.Y1();
    }

    @Override // androidx.preference.j, android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(f72994w, this.f72995s);
        bundle.putCharSequenceArray(X, this.f72996t);
        bundle.putCharSequenceArray(Y, this.f72997v);
    }
}
