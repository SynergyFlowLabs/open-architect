package com.google.firebase.crashlytics.internal.metadata;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.lang3.z;

/* JADX INFO: loaded from: classes5.dex */
class i implements d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Charset f121304d = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f121305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f121306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private h f121307c;

    class a implements h.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte[] f121308a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int[] f121309b;

        a(byte[] bArr, int[] iArr) {
            this.f121308a = bArr;
            this.f121309b = iArr;
        }

        @Override // com.google.firebase.crashlytics.internal.metadata.h.d
        public void a(InputStream inputStream, int i10) throws IOException {
            try {
                inputStream.read(this.f121308a, this.f121309b[0], i10);
                int[] iArr = this.f121309b;
                iArr[0] = iArr[0] + i10;
                inputStream.close();
            } catch (Throwable th2) {
                inputStream.close();
                throw th2;
            }
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte[] f121311a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f121312b;

        b(byte[] bArr, int i10) {
            this.f121311a = bArr;
            this.f121312b = i10;
        }
    }

    i(File file, int i10) {
        this.f121305a = file;
        this.f121306b = i10;
    }

    private void f(long j10, String str) {
        if (this.f121307c == null) {
            return;
        }
        if (str == null) {
            str = AbstractJsonLexerKt.NULL;
        }
        try {
            int i10 = this.f121306b / 4;
            if (str.length() > i10) {
                str = "..." + str.substring(str.length() - i10);
            }
            this.f121307c.e(String.format(Locale.US, "%d %s%n", Long.valueOf(j10), str.replaceAll(z.f337565d, " ").replaceAll("\n", " ")).getBytes(f121304d));
            while (!this.f121307c.m() && this.f121307c.Y() > this.f121306b) {
                this.f121307c.I();
            }
        } catch (IOException e10) {
            com.google.firebase.crashlytics.internal.g.f().e("There was a problem writing to the Crashlytics log.", e10);
        }
    }

    private b g() {
        if (!this.f121305a.exists()) {
            return null;
        }
        h();
        h hVar = this.f121307c;
        if (hVar == null) {
            return null;
        }
        int[] iArr = {0};
        byte[] bArr = new byte[hVar.Y()];
        try {
            this.f121307c.h(new a(bArr, iArr));
        } catch (IOException e10) {
            com.google.firebase.crashlytics.internal.g.f().e("A problem occurred while reading the Crashlytics log file.", e10);
        }
        return new b(bArr, iArr[0]);
    }

    private void h() {
        if (this.f121307c == null) {
            try {
                this.f121307c = new h(this.f121305a);
            } catch (IOException e10) {
                com.google.firebase.crashlytics.internal.g.f().e("Could not open log file: " + this.f121305a, e10);
            }
        }
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.d
    public byte[] a() {
        b bVarG = g();
        if (bVarG == null) {
            return null;
        }
        int i10 = bVarG.f121312b;
        byte[] bArr = new byte[i10];
        System.arraycopy(bVarG.f121311a, 0, bArr, 0, i10);
        return bArr;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.d
    public void b() {
        d();
        this.f121305a.delete();
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.d
    public void c(long j10, String str) {
        h();
        f(j10, str);
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.d
    public void d() {
        com.google.firebase.crashlytics.internal.common.i.f(this.f121307c, "There was a problem closing the Crashlytics log file.");
        this.f121307c = null;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.d
    public String e() {
        byte[] bArrA = a();
        if (bArrA != null) {
            return new String(bArrA, f121304d);
        }
        return null;
    }
}
