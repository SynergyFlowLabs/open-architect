package com.google.android.vending.licensing;

import android.text.TextUtils;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;

/* JADX INFO: loaded from: classes4.dex */
class h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f115054h = "LicenseValidator";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f115055i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f115056j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f115057k = 2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f115058l = 3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f115059m = 4;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f115060n = 5;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f115061o = 257;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f115062p = 258;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f115063q = 259;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f115064r = "SHA1withRSA";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f115065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f115066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f115067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f115068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f115069e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final d f115070f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p f115071g;

    h(k kVar, d dVar, g gVar, int i10, String str, String str2, p pVar) {
        this.f115065a = kVar;
        this.f115070f = dVar;
        this.f115066b = gVar;
        this.f115067c = i10;
        this.f115068d = str;
        this.f115069e = str2;
        this.f115071g = pVar;
    }

    private void d(int i10) {
        this.f115066b.c(i10);
    }

    private void e() {
        this.f115066b.b(k.f115073b);
    }

    private void f(int i10, n nVar) {
        this.f115065a.a(i10, nVar);
        if (this.f115065a.b()) {
            this.f115066b.a(i10);
        } else {
            this.f115066b.b(i10);
        }
    }

    public g a() {
        return this.f115066b;
    }

    public int b() {
        return this.f115067c;
    }

    public String c() {
        return this.f115068d;
    }

    public void g(PublicKey publicKey, int i10, String str, String str2) {
        p pVar;
        n nVar;
        String str3;
        if (i10 == 0 || i10 == 1 || i10 == 2) {
            try {
                Signature signature = Signature.getInstance(f115064r);
                signature.initVerify(publicKey);
                signature.update(str.getBytes());
                if (!signature.verify(com.google.android.vending.licensing.util.a.a(str2)) || ((pVar = this.f115071g) != null && !pVar.a(str, str2))) {
                    e();
                    return;
                }
                try {
                    n nVarA = n.a(str);
                    if (nVarA.f115079a != i10) {
                        e();
                        return;
                    }
                    if (nVarA.f115080b != this.f115067c) {
                        e();
                        return;
                    }
                    if (!nVarA.f115081c.equals(this.f115068d)) {
                        e();
                        return;
                    }
                    if (!nVarA.f115082d.equals(this.f115069e)) {
                        e();
                        return;
                    }
                    String str4 = nVarA.f115083e;
                    if (TextUtils.isEmpty(str4)) {
                        e();
                        return;
                    } else {
                        nVar = nVarA;
                        str3 = str4;
                    }
                } catch (IllegalArgumentException unused) {
                    e();
                    return;
                }
            } catch (com.google.android.vending.licensing.util.b unused2) {
                e();
                return;
            } catch (InvalidKeyException unused3) {
                d(5);
                return;
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(e10);
            } catch (SignatureException e11) {
                throw new RuntimeException(e11);
            } catch (Throwable unused4) {
                this.f115066b.b(k.f115074c);
                return;
            }
        } else {
            str3 = null;
            nVar = null;
        }
        if (i10 != 0) {
            if (i10 == 1) {
                f(k.f115073b, nVar);
                return;
            }
            if (i10 != 2) {
                if (i10 == 3) {
                    d(3);
                    return;
                }
                if (i10 == 4) {
                    f(k.f115074c, nVar);
                    return;
                }
                if (i10 == 5) {
                    f(k.f115074c, nVar);
                    return;
                }
                switch (i10) {
                    case 257:
                        f(k.f115074c, nVar);
                        return;
                    case f115062p /* 258 */:
                        d(1);
                        return;
                    case f115063q /* 259 */:
                        d(2);
                        return;
                    default:
                        e();
                        return;
                }
            }
        }
        f(this.f115070f.a(str3), nVar);
    }
}
