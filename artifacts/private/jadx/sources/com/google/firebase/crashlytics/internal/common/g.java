package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.NonNull;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes5.dex */
class g implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.p0
    private final byte[] f121048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final String f121049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final String f121050c;

    g(@NonNull String str, @NonNull String str2, @androidx.annotation.p0 byte[] bArr) {
        this.f121049b = str;
        this.f121050c = str2;
        this.f121048a = bArr;
    }

    @androidx.annotation.p0
    private byte[] c() {
        if (d()) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream.write(this.f121048a);
                    gZIPOutputStream.finish();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    gZIPOutputStream.close();
                    byteArrayOutputStream.close();
                    return byteArray;
                } catch (Throwable th2) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    private boolean d() {
        byte[] bArr = this.f121048a;
        return bArr == null || bArr.length == 0;
    }

    @Override // com.google.firebase.crashlytics.internal.common.q0
    @NonNull
    public String a() {
        return this.f121050c;
    }

    @Override // com.google.firebase.crashlytics.internal.common.q0
    @androidx.annotation.p0
    public com.google.firebase.crashlytics.internal.model.f0.e.b b() {
        byte[] bArrC = c();
        if (bArrC == null) {
            return null;
        }
        return com.google.firebase.crashlytics.internal.model.f0.e.b.a().b(bArrC).c(this.f121049b).a();
    }

    @Override // com.google.firebase.crashlytics.internal.common.q0
    @androidx.annotation.p0
    public InputStream e() {
        if (d()) {
            return null;
        }
        return new ByteArrayInputStream(this.f121048a);
    }
}
