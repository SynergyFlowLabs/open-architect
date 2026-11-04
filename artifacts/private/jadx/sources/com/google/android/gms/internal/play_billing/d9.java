package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes4.dex */
final class d9 {
    static String a(d6 d6Var) {
        StringBuilder sb2 = new StringBuilder(d6Var.i());
        for (int i10 = 0; i10 < d6Var.i(); i10++) {
            byte bC = d6Var.c(i10);
            if (bC == 34) {
                sb2.append("\\\"");
            } else if (bC == 39) {
                sb2.append("\\'");
            } else if (bC != 92) {
                switch (bC) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (bC < 32 || bC > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((bC >>> 6) & 3) + 48));
                            sb2.append((char) (((bC >>> 3) & 7) + 48));
                            sb2.append((char) ((bC & 7) + 48));
                        } else {
                            sb2.append((char) bC);
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }
}
