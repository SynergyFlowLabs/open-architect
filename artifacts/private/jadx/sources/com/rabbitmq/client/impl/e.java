package com.rabbitmq.client.impl;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes13.dex */
public class e implements com.rabbitmq.client.m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f265174b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w f265175a;

    public e() {
        this(null, null, null);
    }

    private static void c() {
        s0 s0Var = new s0(3, 0, new byte[0]);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            s0Var.n(new DataOutputStream(byteArrayOutputStream));
            int length = byteArrayOutputStream.toByteArray().length;
            if (8 == length) {
                return;
            }
            throw new IllegalStateException("Internal error: expected EMPTY_FRAME_SIZE(8) is not equal to computed value: " + length);
        } catch (IOException unused) {
            throw new IllegalStateException("IOException while checking EMPTY_FRAME_SIZE");
        }
    }

    public static void d() {
        c();
    }

    private static StringBuilder e(byte[] bArr, boolean z10) {
        try {
            if (z10) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(bArr.length);
                sb2.append(" bytes of payload");
                return sb2;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append('\"');
            sb3.append(new String(bArr, "UTF-8"));
            sb3.append('\"');
            return sb3;
        } catch (Exception unused) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append('|');
            sb4.append(bArr.length);
            sb4.append('|');
            return sb4;
        }
    }

    @Override // com.rabbitmq.client.m
    public byte[] b() {
        return this.f265175a.f();
    }

    @Override // com.rabbitmq.client.m
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public j a() {
        return this.f265175a.g();
    }

    @Override // com.rabbitmq.client.m
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public y0 getMethod() {
        return this.f265175a.h();
    }

    public boolean h(s0 s0Var) throws IOException {
        return this.f265175a.i(s0Var);
    }

    public String i(boolean z10) {
        String str;
        synchronized (this.f265175a) {
            try {
                str = AbstractJsonLexerKt.BEGIN_OBJ + this.f265175a.h() + ", " + this.f265175a.g() + ", " + ((CharSequence) e(this.f265175a.f(), z10)) + AbstractJsonLexerKt.END_OBJ;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    public void j(d dVar) throws IOException {
        int iV8 = dVar.V8();
        i iVarN = dVar.N();
        synchronized (this.f265175a) {
            try {
                y0 y0VarH = this.f265175a.h();
                if (y0VarH.Y()) {
                    byte[] bArrF = this.f265175a.f();
                    s0 s0VarI = this.f265175a.g().i(iV8, bArrF.length);
                    int iO = iVarN.O();
                    boolean z10 = iO > 0;
                    int length = z10 ? iO - 8 : bArrF.length;
                    if (z10 && s0VarI.l() > iO) {
                        throw new IllegalArgumentException(String.format("Content headers exceeded max frame size: %d > %d", Integer.valueOf(s0VarI.l()), Integer.valueOf(iO)));
                    }
                    iVarN.b(y0VarH.Z(iV8));
                    iVarN.b(s0VarI);
                    for (int i10 = 0; i10 < bArrF.length; i10 += length) {
                        int length2 = bArrF.length - i10;
                        if (length2 >= length) {
                            length2 = length;
                        }
                        iVarN.b(s0.d(iV8, bArrF, i10, length2));
                    }
                } else {
                    iVarN.b(y0VarH.Z(iV8));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        iVarN.flush();
    }

    public String toString() {
        return i(false);
    }

    public e(com.rabbitmq.client.o0 o0Var) {
        this(o0Var, null, null);
    }

    public e(com.rabbitmq.client.o0 o0Var, j jVar, byte[] bArr) {
        this.f265175a = new w((y0) o0Var, jVar, bArr);
    }
}
