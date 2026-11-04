package com.google.android.gms.auth.api.accounttransfer;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes4.dex */
public final class v implements com.google.android.gms.common.api.a.d.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v f105117b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bundle f105118a;

    static {
        Bundle bundle = new Bundle();
        if (!bundle.containsKey("accountTypes")) {
            bundle.putStringArrayList("accountTypes", new ArrayList<>(0));
        }
        f105117b = new v(bundle, null);
    }

    /* synthetic */ v(Bundle bundle, u uVar) {
        this.f105118a = bundle;
    }

    public final Bundle a() {
        return new Bundle(this.f105118a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        Bundle bundleA = a();
        Bundle bundleA2 = ((v) obj).a();
        if (bundleA.size() != bundleA2.size()) {
            return false;
        }
        for (String str : bundleA.keySet()) {
            if (!bundleA2.containsKey(str) || !com.google.android.gms.common.internal.u.b(bundleA.get(str), bundleA2.get(str))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        Bundle bundleA = a();
        int size = bundleA.size();
        ArrayList arrayList = new ArrayList(size + size);
        ArrayList arrayList2 = new ArrayList(bundleA.keySet());
        Collections.sort(arrayList2);
        int size2 = arrayList2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            String str = (String) arrayList2.get(i10);
            arrayList.add(str);
            arrayList.add(bundleA.get(str));
        }
        return com.google.android.gms.common.internal.u.c(arrayList);
    }
}
