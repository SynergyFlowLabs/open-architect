package com.google.android.gms.common;

import android.os.RemoteException;
import com.google.android.gms.common.internal.p2;
import com.google.android.gms.common.internal.q2;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
abstract class x0 extends p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f106986a;

    protected x0(byte[] bArr) {
        com.google.android.gms.common.internal.w.a(bArr.length == 25);
        this.f106986a = Arrays.hashCode(bArr);
    }

    protected static byte[] n(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    public final boolean equals(@androidx.annotation.p0 Object obj) {
        if (obj != null && (obj instanceof q2)) {
            try {
                q2 q2Var = (q2) obj;
                if (q2Var.h() != this.f106986a) {
                    return false;
                }
                com.google.android.gms.dynamic.d dVarM = q2Var.m();
                if (dVarM != null) {
                    return Arrays.equals(p(), (byte[]) com.google.android.gms.dynamic.f.n(dVarM));
                }
            } catch (RemoteException unused) {
            }
        }
        return false;
    }

    @Override // com.google.android.gms.common.internal.q2
    public final int h() {
        return this.f106986a;
    }

    public final int hashCode() {
        return this.f106986a;
    }

    @Override // com.google.android.gms.common.internal.q2
    public final com.google.android.gms.dynamic.d m() {
        return com.google.android.gms.dynamic.f.p(p());
    }

    abstract byte[] p();
}
