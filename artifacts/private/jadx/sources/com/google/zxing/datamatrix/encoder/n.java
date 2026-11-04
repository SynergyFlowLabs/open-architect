package com.google.zxing.datamatrix.encoder;

/* JADX INFO: loaded from: classes5.dex */
final class n extends c {
    n() {
    }

    @Override // com.google.zxing.datamatrix.encoder.c, com.google.zxing.datamatrix.encoder.g
    public int a() {
        return 3;
    }

    @Override // com.google.zxing.datamatrix.encoder.c, com.google.zxing.datamatrix.encoder.g
    public void b(h hVar) {
        StringBuilder sb2 = new StringBuilder();
        while (hVar.j()) {
            char cD = hVar.d();
            hVar.f130420f++;
            d(cD, sb2);
            if (sb2.length() % 3 == 0) {
                c.g(hVar, sb2);
                if (j.o(hVar.e(), hVar.f130420f, a()) != a()) {
                    hVar.p(0);
                    break;
                }
            }
        }
        f(hVar, sb2);
    }

    @Override // com.google.zxing.datamatrix.encoder.c
    int d(char c10, StringBuilder sb2) {
        if (c10 == '\r') {
            sb2.append((char) 0);
        } else if (c10 == ' ') {
            sb2.append((char) 3);
        } else if (c10 == '*') {
            sb2.append((char) 1);
        } else if (c10 == '>') {
            sb2.append((char) 2);
        } else if (c10 >= '0' && c10 <= '9') {
            sb2.append((char) (c10 - ','));
        } else if (c10 < 'A' || c10 > 'Z') {
            j.f(c10);
        } else {
            sb2.append((char) (c10 - '3'));
        }
        return 1;
    }

    @Override // com.google.zxing.datamatrix.encoder.c
    void f(h hVar, StringBuilder sb2) {
        hVar.q();
        int iB = hVar.h().b() - hVar.a();
        hVar.f130420f -= sb2.length();
        if (hVar.g() > 1 || iB > 1 || hVar.g() != iB) {
            hVar.s((char) 254);
        }
        if (hVar.f() < 0) {
            hVar.p(0);
        }
    }
}
