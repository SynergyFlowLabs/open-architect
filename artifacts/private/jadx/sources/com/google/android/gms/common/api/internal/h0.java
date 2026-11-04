package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f106040a = Collections.synchronizedMap(new WeakHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f106041b = Collections.synchronizedMap(new WeakHashMap());

    private final void h(boolean z10, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (this.f106040a) {
            map = new HashMap(this.f106040a);
        }
        synchronized (this.f106041b) {
            map2 = new HashMap(this.f106041b);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z10 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).l(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z10 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((com.google.android.gms.tasks.l) entry2.getKey()).d(new com.google.android.gms.common.api.b(status));
            }
        }
    }

    final void c(BasePendingResult basePendingResult, boolean z10) {
        this.f106040a.put(basePendingResult, Boolean.valueOf(z10));
        basePendingResult.c(new f0(this, basePendingResult));
    }

    final void d(com.google.android.gms.tasks.l lVar, boolean z10) {
        this.f106041b.put(lVar, Boolean.valueOf(z10));
        lVar.a().addOnCompleteListener(new g0(this, lVar));
    }

    final void e(int i10, @androidx.annotation.p0 String str) {
        StringBuilder sb2 = new StringBuilder("The connection to Google Play services was lost");
        if (i10 == 1) {
            sb2.append(" due to service disconnection.");
        } else if (i10 == 3) {
            sb2.append(" due to dead object exception.");
        }
        if (str != null) {
            sb2.append(" Last reason for disconnect: ");
            sb2.append(str);
        }
        h(true, new Status(20, sb2.toString()));
    }

    public final void f() {
        h(false, i.f106047s);
    }

    final boolean g() {
        if (this.f106040a.isEmpty() && this.f106041b.isEmpty()) {
            return false;
        }
        return true;
    }
}
