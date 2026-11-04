package com.google.vr.sdk.deps;

/* JADX INFO: loaded from: classes5.dex */
final class l6 extends IllegalArgumentException {
    l6(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("Unpaired surrogate at index ");
        sb2.append(i10);
        sb2.append(" of ");
        sb2.append(i11);
        super(sb2.toString());
    }
}
