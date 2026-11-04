package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class g3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Status f106032c = new Status(8, "The connection to Google Play services was lost");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.l1
    final Set f106033a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f3 f106034b = new f3(this);

    final void a(BasePendingResult basePendingResult) {
        this.f106033a.add(basePendingResult);
        basePendingResult.v(this.f106034b);
    }

    public final void b() {
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.f106033a.toArray(new BasePendingResult[0])) {
            basePendingResult.v(null);
            if (basePendingResult.u()) {
                this.f106033a.remove(basePendingResult);
            }
        }
    }
}
