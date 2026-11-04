package androidx.constraintlayout.core.parser;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class i extends c {
    public i(char[] cArr) {
        super(cArr);
    }

    public static c M(char[] cArr) {
        return new i(cArr);
    }

    @NonNull
    public static i N(@NonNull String str) {
        i iVar = new i(str.toCharArray());
        iVar.J(0L);
        iVar.F(str.length() - 1);
        return iVar;
    }

    @Override // androidx.constraintlayout.core.parser.c
    protected String K(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder();
        c(sb2, i10);
        sb2.append("'");
        sb2.append(k());
        sb2.append("'");
        return sb2.toString();
    }

    @Override // androidx.constraintlayout.core.parser.c
    protected String L() {
        return "'" + k() + "'";
    }

    @Override // androidx.constraintlayout.core.parser.c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof i) && k().equals(((i) obj).k())) {
            return true;
        }
        return super.equals(obj);
    }

    @Override // androidx.constraintlayout.core.parser.c
    public int hashCode() {
        return super.hashCode();
    }
}
