package androidx.constraintlayout.core.parser;

/* JADX INFO: loaded from: classes2.dex */
public class a extends b {
    public a(char[] cArr) {
        super(cArr);
    }

    public static c N(char[] cArr) {
        return new a(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.c
    protected String K(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder();
        String strL = L();
        if (i11 > 0 || strL.length() + i10 >= c.f44158f) {
            sb2.append("[\n");
            boolean z10 = true;
            for (c cVar : this.f44157h) {
                if (z10) {
                    z10 = false;
                } else {
                    sb2.append(",\n");
                }
                c(sb2, c.f44159g + i10);
                sb2.append(cVar.K(c.f44159g + i10, i11 - 1));
            }
            sb2.append("\n");
            c(sb2, i10);
            sb2.append("]");
        } else {
            sb2.append(strL);
        }
        return sb2.toString();
    }

    @Override // androidx.constraintlayout.core.parser.c
    protected String L() {
        StringBuilder sb2 = new StringBuilder(n() + "[");
        boolean z10 = true;
        for (int i10 = 0; i10 < this.f44157h.size(); i10++) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(this.f44157h.get(i10).L());
        }
        return ((Object) sb2) + "]";
    }
}
