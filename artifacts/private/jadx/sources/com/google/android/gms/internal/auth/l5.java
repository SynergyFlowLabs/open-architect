package com.google.android.gms.internal.auth;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class l5 extends v5 {
    l5(int i10) {
        super(i10, null);
    }

    @Override // com.google.android.gms.internal.auth.v5
    public final void a() {
        if (!j()) {
            int i10 = 4 << 0;
            for (int i11 = 0; i11 < b(); i11++) {
                Map.Entry entryG = g(i11);
                if (((n3) entryG.getKey()).h()) {
                    entryG.setValue(Collections.unmodifiableList((List) entryG.getValue()));
                }
            }
            for (Map.Entry entry : c()) {
                if (((n3) entry.getKey()).h()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.a();
    }
}
