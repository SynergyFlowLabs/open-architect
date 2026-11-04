package com.google.android.gms.internal.play_billing;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class w8 extends b9 {
    w8() {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.b9
    public final void a() {
        if (!j()) {
            for (int i10 = 0; i10 < c(); i10++) {
                Map.Entry entryG = g(i10);
                if (((u6) ((x8) entryG).k()).j()) {
                    entryG.setValue(Collections.unmodifiableList((List) entryG.getValue()));
                }
            }
            for (Map.Entry entry : d()) {
                if (((u6) entry.getKey()).j()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.a();
    }
}
