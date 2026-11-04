package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.play_billing.m5;
import com.google.android.gms.internal.play_billing.n5;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class n5<MessageType extends n5<MessageType, BuilderType>, BuilderType extends m5<MessageType, BuilderType>> implements h8 {
    protected int zza = 0;

    protected static void h(Iterable iterable, List list) {
        m5.i(iterable, list);
    }

    @Override // com.google.android.gms.internal.play_billing.h8
    public final d6 c() {
        try {
            int iD = d();
            d6 d6Var = d6.f109102b;
            byte[] bArr = new byte[iD];
            h6 h6Var = new h6(bArr, 0, iD);
            a(h6Var);
            h6Var.b();
            return new b6(bArr);
        } catch (IOException e10) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e10);
        }
    }

    int g(s8 s8Var) {
        throw null;
    }

    public final byte[] i() {
        try {
            int iD = d();
            byte[] bArr = new byte[iD];
            h6 h6Var = new h6(bArr, 0, iD);
            a(h6Var);
            h6Var.b();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e10);
        }
    }
}
