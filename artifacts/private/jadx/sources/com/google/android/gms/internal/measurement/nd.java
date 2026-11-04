package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class nd extends rd {
    nd() {
        super(null);
    }

    @Override // com.google.android.gms.internal.measurement.rd
    public final void a() {
        if (!b()) {
            for (int i10 = 0; i10 < c(); i10++) {
                Map.Entry entryD = d(i10);
                if (((fb) ((od) entryD).k()).m()) {
                    entryD.setValue(Collections.unmodifiableList((List) entryD.getValue()));
                }
            }
            for (Map.Entry entry : e()) {
                if (((fb) entry.getKey()).m()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.a();
    }
}
