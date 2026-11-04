package io.ably.lib.types;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes13.dex */
public class p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f288146b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f288145a = null;

    public byte[] a() {
        byte[] bArr = this.f288146b;
        if (bArr != null) {
            return bArr;
        }
        String str = this.f288145a;
        if (str != null) {
            return str.getBytes(Charset.forName("UTF-8"));
        }
        return null;
    }

    public void b(String str) {
        this.f288145a = str;
        this.f288146b = null;
    }

    public void c(byte[] bArr) {
        this.f288146b = bArr;
        this.f288145a = null;
    }
}
