package com.rabbitmq.client;

import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public class e2 extends g1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f265075e = "UTF-8";

    public e2(k kVar) throws IOException {
        super(kVar);
    }

    @Override // com.rabbitmq.client.g1
    public byte[] f(byte[] bArr, a.c cVar) {
        String str;
        try {
            str = new String(bArr, "UTF-8");
        } catch (IOException unused) {
            str = new String(bArr);
        }
        String strQ = q(str, cVar);
        try {
            return strQ.getBytes("UTF-8");
        } catch (IOException unused2) {
            return strQ.getBytes();
        }
    }

    @Override // com.rabbitmq.client.g1
    public void i(byte[] bArr) {
        try {
            r(new String(bArr, "UTF-8"));
        } catch (IOException unused) {
            r(new String(bArr));
        }
    }

    public String p(String str) {
        return "";
    }

    public String q(String str, a.c cVar) {
        return p(str);
    }

    public void r(String str) {
    }

    public e2(k kVar, String str) throws IOException {
        super(kVar, str);
    }
}
