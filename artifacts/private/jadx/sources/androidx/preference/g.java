package androidx.preference;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class g extends j {
    private static final String X = "MultiSelectListPreferenceDialogFragment.values";
    private static final String Y = "MultiSelectListPreferenceDialogFragment.changed";
    private static final String Z = "MultiSelectListPreferenceDialogFragment.entries";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final String f73006p0 = "MultiSelectListPreferenceDialogFragment.entryValues";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    Set<String> f73007s = new HashSet();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    boolean f73008t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    CharSequence[] f73009v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    CharSequence[] f73010w;

    class a implements DialogInterface.OnMultiChoiceClickListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnMultiChoiceClickListener
        public void onClick(DialogInterface dialogInterface, int i10, boolean z10) {
            if (z10) {
                g gVar = g.this;
                gVar.f73008t |= gVar.f73007s.add(gVar.f73010w[i10].toString());
            } else {
                g gVar2 = g.this;
                gVar2.f73008t |= gVar2.f73007s.remove(gVar2.f73010w[i10].toString());
            }
        }
    }

    @Deprecated
    public g() {
    }

    private MultiSelectListPreference h() {
        return (MultiSelectListPreference) a();
    }

    @NonNull
    @Deprecated
    public static g i(String str) {
        g gVar = new g();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        gVar.setArguments(bundle);
        return gVar;
    }

    @Override // androidx.preference.j
    @Deprecated
    public void e(boolean z10) {
        MultiSelectListPreference multiSelectListPreferenceH = h();
        if (z10 && this.f73008t) {
            Set<String> set = this.f73007s;
            if (multiSelectListPreferenceH.c(set)) {
                multiSelectListPreferenceH.e2(set);
            }
        }
        this.f73008t = false;
    }

    @Override // androidx.preference.j
    protected void f(@NonNull AlertDialog.Builder builder) {
        super.f(builder);
        int length = this.f73010w.length;
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            zArr[i10] = this.f73007s.contains(this.f73010w[i10].toString());
        }
        builder.setMultiChoiceItems(this.f73009v, zArr, new a());
    }

    @Override // androidx.preference.j, android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f73007s.clear();
            this.f73007s.addAll(bundle.getStringArrayList(X));
            this.f73008t = bundle.getBoolean(Y, false);
            this.f73009v = bundle.getCharSequenceArray(Z);
            this.f73010w = bundle.getCharSequenceArray(f73006p0);
            return;
        }
        MultiSelectListPreference multiSelectListPreferenceH = h();
        if (multiSelectListPreferenceH.W1() == null || multiSelectListPreferenceH.X1() == null) {
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        this.f73007s.clear();
        this.f73007s.addAll(multiSelectListPreferenceH.Z1());
        this.f73008t = false;
        this.f73009v = multiSelectListPreferenceH.W1();
        this.f73010w = multiSelectListPreferenceH.X1();
    }

    @Override // androidx.preference.j, android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList(X, new ArrayList<>(this.f73007s));
        bundle.putBoolean(Y, this.f73008t);
        bundle.putCharSequenceArray(Z, this.f73009v);
        bundle.putCharSequenceArray(f73006p0, this.f73010w);
    }
}
