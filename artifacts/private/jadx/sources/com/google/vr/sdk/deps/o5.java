package com.google.vr.sdk.deps;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class o5 extends n5<Object, Object> {
    o5(int i10) {
        super(i10, (byte) 0);
    }

    @Override // com.google.vr.sdk.deps.n5
    public final void e() {
        if (!i()) {
            for (int i10 = 0; i10 < j(); i10++) {
                Map.Entry<Object, Object> entryH = h(i10);
                if (((b3) entryH.getKey()).d()) {
                    entryH.setValue(Collections.unmodifiableList((List) entryH.getValue()));
                }
            }
            for (Map.Entry<Object, Object> entry : m()) {
                if (((b3) entry.getKey()).d()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.e();
    }
}
