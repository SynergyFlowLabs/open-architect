package com.google.vr.sdk.deps;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class v6 extends IOException {
    v6(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder(108);
        sb2.append("CodedOutputStream was writing to a flat byte array and ran out of space (pos ");
        sb2.append(i10);
        sb2.append(" limit ");
        sb2.append(i11);
        sb2.append(").");
        super(sb2.toString());
    }
}
