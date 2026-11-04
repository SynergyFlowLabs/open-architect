package com.google.android.gms.common.data;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.gms.common.internal.w;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public abstract class i<T> extends a<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f106390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ArrayList f106391c;

    @g6.a
    protected i(@NonNull DataHolder dataHolder) {
        super(dataHolder);
        this.f106390b = false;
    }

    private final void r() {
        synchronized (this) {
            try {
                if (!this.f106390b) {
                    int count = ((DataHolder) w.r(this.f106379a)).getCount();
                    ArrayList arrayList = new ArrayList();
                    this.f106391c = arrayList;
                    if (count > 0) {
                        arrayList.add(0);
                        String strL = l();
                        String strQ2 = this.f106379a.q2(strL, 0, this.f106379a.s2(0));
                        for (int i10 = 1; i10 < count; i10++) {
                            int iS2 = this.f106379a.s2(i10);
                            String strQ3 = this.f106379a.q2(strL, i10, iS2);
                            if (strQ3 == null) {
                                throw new NullPointerException("Missing value for markerColumn: " + strL + ", at row: " + i10 + ", for window: " + iS2);
                            }
                            if (!strQ3.equals(strQ2)) {
                                this.f106391c.add(Integer.valueOf(i10));
                                strQ2 = strQ3;
                            }
                        }
                    }
                    this.f106390b = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @p0
    @g6.a
    protected String c() {
        return null;
    }

    @NonNull
    @g6.a
    protected abstract T d(int i10, int i11);

    @Override // com.google.android.gms.common.data.a, com.google.android.gms.common.data.b
    @NonNull
    @g6.a
    public final T get(int i10) {
        int iIntValue;
        int iIntValue2;
        r();
        int iM = m(i10);
        int i11 = 0;
        if (i10 >= 0 && i10 != this.f106391c.size()) {
            if (i10 == this.f106391c.size() - 1) {
                iIntValue = ((DataHolder) w.r(this.f106379a)).getCount();
                iIntValue2 = ((Integer) this.f106391c.get(i10)).intValue();
            } else {
                iIntValue = ((Integer) this.f106391c.get(i10 + 1)).intValue();
                iIntValue2 = ((Integer) this.f106391c.get(i10)).intValue();
            }
            int i12 = iIntValue - iIntValue2;
            if (i12 == 1) {
                int iM2 = m(i10);
                int iS2 = ((DataHolder) w.r(this.f106379a)).s2(iM2);
                String strC = c();
                if (strC == null || this.f106379a.q2(strC, iM2, iS2) != null) {
                    i11 = 1;
                }
            } else {
                i11 = i12;
            }
        }
        return d(iM, i11);
    }

    @Override // com.google.android.gms.common.data.a, com.google.android.gms.common.data.b
    @g6.a
    public int getCount() {
        r();
        return this.f106391c.size();
    }

    @NonNull
    @g6.a
    protected abstract String l();

    final int m(int i10) {
        if (i10 >= 0 && i10 < this.f106391c.size()) {
            return ((Integer) this.f106391c.get(i10)).intValue();
        }
        throw new IllegalArgumentException("Position " + i10 + " is out of bounds for this buffer");
    }
}
