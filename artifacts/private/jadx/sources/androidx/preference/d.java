package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class d extends Preference {

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    private long f72993z3;

    d(@NonNull Context context, List<Preference> list, long j10) {
        super(context);
        D1();
        E1(list);
        this.f72993z3 = j10 + 1000000;
    }

    private void D1() {
        f1(v.h.f73221a);
        a1(v.e.f73208a);
        s1(v.i.f73240b);
        j1(999);
    }

    private void E1(List<Preference> list) {
        ArrayList arrayList = new ArrayList();
        CharSequence string = null;
        for (Preference preference : list) {
            CharSequence charSequenceD0 = preference.d0();
            boolean z10 = preference instanceof PreferenceGroup;
            if (z10 && !TextUtils.isEmpty(charSequenceD0)) {
                arrayList.add((PreferenceGroup) preference);
            }
            if (arrayList.contains(preference.N())) {
                if (z10) {
                    arrayList.add((PreferenceGroup) preference);
                }
            } else if (!TextUtils.isEmpty(charSequenceD0)) {
                string = string == null ? charSequenceD0 : r().getString(v.i.f73243e, string, charSequenceD0);
            }
        }
        q1(string);
    }

    @Override // androidx.preference.Preference
    public void u0(@NonNull u uVar) {
        super.u0(uVar);
        uVar.l(false);
    }

    @Override // androidx.preference.Preference
    long z() {
        return this.f72993z3;
    }
}
