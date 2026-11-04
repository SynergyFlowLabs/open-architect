package androidx.preference;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class h extends k {

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    private static final String f73012w3 = "MultiSelectListPreferenceDialogFragmentCompat.values";

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    private static final String f73013x3 = "MultiSelectListPreferenceDialogFragmentCompat.changed";

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    private static final String f73014y3 = "MultiSelectListPreferenceDialogFragmentCompat.entries";

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    private static final String f73015z3 = "MultiSelectListPreferenceDialogFragmentCompat.entryValues";

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    Set<String> f73016s3 = new HashSet();

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    boolean f73017t3;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    CharSequence[] f73018u3;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    CharSequence[] f73019v3;

    class a implements DialogInterface.OnMultiChoiceClickListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnMultiChoiceClickListener
        public void onClick(DialogInterface dialogInterface, int i10, boolean z10) {
            if (z10) {
                h hVar = h.this;
                hVar.f73017t3 |= hVar.f73016s3.add(hVar.f73019v3[i10].toString());
            } else {
                h hVar2 = h.this;
                hVar2.f73017t3 |= hVar2.f73016s3.remove(hVar2.f73019v3[i10].toString());
            }
        }
    }

    private MultiSelectListPreference I() {
        return (MultiSelectListPreference) A();
    }

    @NonNull
    public static h J(String str) {
        h hVar = new h();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        hVar.setArguments(bundle);
        return hVar;
    }

    @Override // androidx.preference.k
    public void E(boolean z10) {
        if (z10 && this.f73017t3) {
            MultiSelectListPreference multiSelectListPreferenceI = I();
            if (multiSelectListPreferenceI.c(this.f73016s3)) {
                multiSelectListPreferenceI.e2(this.f73016s3);
            }
        }
        this.f73017t3 = false;
    }

    @Override // androidx.preference.k
    protected void F(@NonNull androidx.appcompat.app.c.a aVar) {
        super.F(aVar);
        int length = this.f73019v3.length;
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            zArr[i10] = this.f73016s3.contains(this.f73019v3[i10].toString());
        }
        aVar.setMultiChoiceItems(this.f73018u3, zArr, new a());
    }

    @Override // androidx.preference.k, androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onCreate(@p0 Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f73016s3.clear();
            this.f73016s3.addAll(bundle.getStringArrayList(f73012w3));
            this.f73017t3 = bundle.getBoolean(f73013x3, false);
            this.f73018u3 = bundle.getCharSequenceArray(f73014y3);
            this.f73019v3 = bundle.getCharSequenceArray(f73015z3);
            return;
        }
        MultiSelectListPreference multiSelectListPreferenceI = I();
        if (multiSelectListPreferenceI.W1() == null || multiSelectListPreferenceI.X1() == null) {
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        this.f73016s3.clear();
        this.f73016s3.addAll(multiSelectListPreferenceI.Z1());
        this.f73017t3 = false;
        this.f73018u3 = multiSelectListPreferenceI.W1();
        this.f73019v3 = multiSelectListPreferenceI.X1();
    }

    @Override // androidx.preference.k, androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList(f73012w3, new ArrayList<>(this.f73016s3));
        bundle.putBoolean(f73013x3, this.f73017t3);
        bundle.putCharSequenceArray(f73014y3, this.f73018u3);
        bundle.putCharSequenceArray(f73015z3, this.f73019v3);
    }
}
