package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.NonNull;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes5.dex */
class l0 implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final File f121124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final String f121125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final String f121126c;

    l0(@NonNull String str, @NonNull String str2, @NonNull File file) {
        this.f121125b = str;
        this.f121126c = str2;
        this.f121124a = file;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @androidx.annotation.p0
    private byte[] c() {
        byte[] bArr = new byte[8192];
        try {
            InputStream inputStreamE = e();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    if (inputStreamE == null) {
                        gZIPOutputStream.close();
                        byteArrayOutputStream.close();
                        if (inputStreamE != null) {
                            inputStreamE.close();
                        }
                        return null;
                    }
                    while (true) {
                        try {
                            int i10 = inputStreamE.read(bArr);
                            if (i10 <= 0) {
                                gZIPOutputStream.finish();
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                gZIPOutputStream.close();
                                byteArrayOutputStream.close();
                                inputStreamE.close();
                                return byteArray;
                            }
                            gZIPOutputStream.write(bArr, 0, i10);
                        } catch (Throwable th2) {
                            try {
                                gZIPOutputStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                        try {
                            byteArrayOutputStream.close();
                        } catch (Throwable th4) {
                            th.addSuppressed(th4);
                        }
                        throw th;
                    }
                } catch (Throwable th5) {
                    byteArrayOutputStream.close();
                    throw th5;
                }
            } catch (Throwable th6) {
                if (inputStreamE != null) {
                    try {
                        inputStreamE.close();
                    } catch (Throwable th7) {
                        th6.addSuppressed(th7);
                    }
                }
                throw th6;
            }
            if (inputStreamE != null) {
                inputStreamE.close();
            }
            throw th6;
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.common.q0
    @NonNull
    public String a() {
        return this.f121126c;
    }

    @Override // com.google.firebase.crashlytics.internal.common.q0
    @androidx.annotation.p0
    public com.google.firebase.crashlytics.internal.model.f0.e.b b() {
        byte[] bArrC = c();
        if (bArrC != null) {
            return com.google.firebase.crashlytics.internal.model.f0.e.b.a().b(bArrC).c(this.f121125b).a();
        }
        return null;
    }

    @Override // com.google.firebase.crashlytics.internal.common.q0
    @androidx.annotation.p0
    public InputStream e() {
        if (this.f121124a.exists() && this.f121124a.isFile()) {
            try {
                return new FileInputStream(this.f121124a);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }
}
