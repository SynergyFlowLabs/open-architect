package com.google.zxing.datamatrix.encoder;

/* JADX INFO: loaded from: classes5.dex */
class c implements g {
    c() {
    }

    private int c(h hVar, StringBuilder sb2, StringBuilder sb3, int i10) {
        int length = sb2.length();
        sb2.delete(length - i10, length);
        hVar.f130420f--;
        int iD = d(hVar.d(), sb3);
        hVar.l();
        return iD;
    }

    private static String e(CharSequence charSequence, int i10) {
        int iCharAt = (charSequence.charAt(i10) * 1600) + (charSequence.charAt(i10 + 1) * '(') + charSequence.charAt(i10 + 2) + 1;
        return new String(new char[]{(char) (iCharAt / 256), (char) (iCharAt % 256)});
    }

    static void g(h hVar, StringBuilder sb2) {
        hVar.t(e(sb2, 0));
        sb2.delete(0, 3);
    }

    @Override // com.google.zxing.datamatrix.encoder.g
    public int a() {
        return 1;
    }

    @Override // com.google.zxing.datamatrix.encoder.g
    public void b(h hVar) {
        StringBuilder sb2 = new StringBuilder();
        while (hVar.j()) {
            char cD = hVar.d();
            hVar.f130420f++;
            int iD = d(cD, sb2);
            int iA = hVar.a() + ((sb2.length() / 3) << 1);
            hVar.r(iA);
            int iB = hVar.h().b() - iA;
            if (!hVar.j()) {
                StringBuilder sb3 = new StringBuilder();
                if (sb2.length() % 3 == 2 && (iB < 2 || iB > 2)) {
                    iD = c(hVar, sb2, sb3, iD);
                }
                while (sb2.length() % 3 == 1 && ((iD <= 3 && iB != 1) || iD > 3)) {
                    iD = c(hVar, sb2, sb3, iD);
                }
                break;
            }
            if (sb2.length() % 3 == 0 && j.o(hVar.e(), hVar.f130420f, a()) != a()) {
                hVar.p(0);
                break;
            }
        }
        f(hVar, sb2);
    }

    int d(char c10, StringBuilder sb2) {
        if (c10 == ' ') {
            sb2.append((char) 3);
            return 1;
        }
        if (c10 >= '0' && c10 <= '9') {
            sb2.append((char) (c10 - ','));
            return 1;
        }
        if (c10 >= 'A' && c10 <= 'Z') {
            sb2.append((char) (c10 - '3'));
            return 1;
        }
        if (c10 < ' ') {
            sb2.append((char) 0);
            sb2.append(c10);
            return 2;
        }
        if (c10 >= '!' && c10 <= '/') {
            sb2.append((char) 1);
            sb2.append((char) (c10 - '!'));
            return 2;
        }
        if (c10 >= ':' && c10 <= '@') {
            sb2.append((char) 1);
            sb2.append((char) (c10 - '+'));
            return 2;
        }
        if (c10 >= '[' && c10 <= '_') {
            sb2.append((char) 1);
            sb2.append((char) (c10 - 'E'));
            return 2;
        }
        if (c10 < '`' || c10 > 127) {
            sb2.append("\u0001\u001e");
            return d((char) (c10 - 128), sb2) + 2;
        }
        sb2.append((char) 2);
        sb2.append((char) (c10 - '`'));
        return 2;
    }

    void f(h hVar, StringBuilder sb2) {
        int length = (sb2.length() / 3) << 1;
        int length2 = sb2.length() % 3;
        int iA = hVar.a() + length;
        hVar.r(iA);
        int iB = hVar.h().b() - iA;
        if (length2 == 2) {
            sb2.append((char) 0);
            while (sb2.length() >= 3) {
                g(hVar, sb2);
            }
            if (hVar.j()) {
                hVar.s((char) 254);
            }
        } else if (iB == 1 && length2 == 1) {
            while (sb2.length() >= 3) {
                g(hVar, sb2);
            }
            if (hVar.j()) {
                hVar.s((char) 254);
            }
            hVar.f130420f--;
        } else {
            if (length2 != 0) {
                throw new IllegalStateException("Unexpected case. Please report!");
            }
            while (sb2.length() >= 3) {
                g(hVar, sb2);
            }
            if (iB > 0 || hVar.j()) {
                hVar.s((char) 254);
            }
        }
        hVar.p(0);
    }
}
