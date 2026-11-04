package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.aa;
import com.google.android.gms.internal.measurement.ba;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ba<MessageType extends ba<MessageType, BuilderType>, BuilderType extends aa<MessageType, BuilderType>> implements yc {
    protected int zza = 0;

    protected static void i(Iterable iterable, List list) {
        aa.k(iterable, list);
    }

    @Override // com.google.android.gms.internal.measurement.yc
    public final ra a() {
        try {
            int iE = e();
            ra raVar = ra.f108771b;
            byte[] bArr = new byte[iE];
            int i10 = wa.f108946d;
            ua uaVar = new ua(bArr, 0, iE);
            f(uaVar);
            return oa.a(uaVar, bArr);
        } catch (IOException e10) {
            String name = getClass().getName();
            StringBuilder sb2 = new StringBuilder(name.length() + 72);
            sb2.append("Serializing ");
            sb2.append(name);
            sb2.append(" to a ByteString threw an IOException (should never happen).");
            throw new RuntimeException(sb2.toString(), e10);
        }
    }

    public final byte[] g() {
        try {
            int iE = e();
            byte[] bArr = new byte[iE];
            int i10 = wa.f108946d;
            ua uaVar = new ua(bArr, 0, iE);
            f(uaVar);
            uaVar.e();
            return bArr;
        } catch (IOException e10) {
            String name = getClass().getName();
            StringBuilder sb2 = new StringBuilder(name.length() + 72);
            sb2.append("Serializing ");
            sb2.append(name);
            sb2.append(" to a byte array threw an IOException (should never happen).");
            throw new RuntimeException(sb2.toString(), e10);
        }
    }

    int h(jd jdVar) {
        throw null;
    }
}
