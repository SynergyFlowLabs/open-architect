package androidx.preference;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes3.dex */
public class f extends k {

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    private static final String f72999v3 = "ListPreferenceDialogFragment.index";

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    private static final String f73000w3 = "ListPreferenceDialogFragment.entries";

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    private static final String f73001x3 = "ListPreferenceDialogFragment.entryValues";

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    int f73002s3;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    private CharSequence[] f73003t3;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    private CharSequence[] f73004u3;

    class a implements DialogInterface.OnClickListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            f fVar = f.this;
            fVar.f73002s3 = i10;
            fVar.onClick(dialogInterface, -1);
            dialogInterface.dismiss();
        }
    }

    private ListPreference I() {
        return (ListPreference) A();
    }

    @NonNull
    public static f J(String str) {
        f fVar = new f();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        fVar.setArguments(bundle);
        return fVar;
    }

    @Override // androidx.preference.k
    public void E(boolean z10) {
        int i10;
        if (!z10 || (i10 = this.f73002s3) < 0) {
            return;
        }
        String string = this.f73004u3[i10].toString();
        ListPreference listPreferenceI = I();
        if (listPreferenceI.c(string)) {
            listPreferenceI.f2(string);
        }
    }

    @Override // androidx.preference.k
    protected void F(@NonNull androidx.appcompat.app.c.a aVar) {
        super.F(aVar);
        aVar.setSingleChoiceItems(this.f73003t3, this.f73002s3, new a());
        aVar.setPositiveButton((CharSequence) null, (DialogInterface.OnClickListener) null);
    }

    @Override // androidx.preference.k, androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onCreate(@p0 Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f73002s3 = bundle.getInt(f72999v3, 0);
            this.f73003t3 = bundle.getCharSequenceArray(f73000w3);
            this.f73004u3 = bundle.getCharSequenceArray(f73001x3);
            return;
        }
        ListPreference listPreferenceI = I();
        if (listPreferenceI.W1() == null || listPreferenceI.Y1() == null) {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.f73002s3 = listPreferenceI.V1(listPreferenceI.Z1());
        this.f73003t3 = listPreferenceI.W1();
        this.f73004u3 = listPreferenceI.Y1();
    }

    @Override // androidx.preference.k, androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(f72999v3, this.f73002s3);
        bundle.putCharSequenceArray(f73000w3, this.f73003t3);
        bundle.putCharSequenceArray(f73001x3, this.f73004u3);
    }
}
