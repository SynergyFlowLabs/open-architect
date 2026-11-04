package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseIntArray f106652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.google.android.gms.common.g f106653b;

    public u0() {
        this(com.google.android.gms.common.f.x());
    }

    public final int a(Context context, int i10) {
        int i11;
        synchronized (this.f106652a) {
            i11 = this.f106652a.get(i10, -1);
        }
        return i11;
    }

    public final int b(@NonNull Context context, @NonNull com.google.android.gms.common.api.a.f fVar) {
        w.r(context);
        w.r(fVar);
        int iK = 0;
        if (!fVar.s()) {
            return 0;
        }
        int iN = fVar.n();
        int iA = a(context, iN);
        if (iA != -1) {
            return iA;
        }
        synchronized (this.f106652a) {
            int i10 = 0;
            while (true) {
                try {
                    if (i10 >= this.f106652a.size()) {
                        iK = -1;
                        break;
                    }
                    int iKeyAt = this.f106652a.keyAt(i10);
                    if (iKeyAt > iN && this.f106652a.get(iKeyAt) == 0) {
                        break;
                    }
                    i10++;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (iK == -1) {
                iK = this.f106653b.k(context, iN);
            }
            this.f106652a.put(iN, iK);
        }
        return iK;
    }

    public final void c() {
        synchronized (this.f106652a) {
            this.f106652a.clear();
        }
    }

    public u0(@NonNull com.google.android.gms.common.g gVar) {
        this.f106652a = new SparseIntArray();
        w.r(gVar);
        this.f106653b = gVar;
    }
}
