package androidx.constraintlayout.core.parser;

import com.facebook.internal.z0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public class j extends c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f44184h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    a f44185i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    char[] f44186j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    char[] f44187k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    char[] f44188l;

    enum a {
        UNKNOWN,
        TRUE,
        FALSE,
        NULL
    }

    public j(char[] cArr) {
        super(cArr);
        this.f44184h = 0;
        this.f44185i = a.UNKNOWN;
        this.f44186j = z0.P.toCharArray();
        this.f44187k = "false".toCharArray();
        this.f44188l = AbstractJsonLexerKt.NULL.toCharArray();
    }

    public static c M(char[] cArr) {
        return new j(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.c
    protected String K(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder();
        c(sb2, i10);
        sb2.append(k());
        return sb2.toString();
    }

    @Override // androidx.constraintlayout.core.parser.c
    protected String L() {
        if (!g.f44169d) {
            return k();
        }
        return "<" + k() + ">";
    }

    public boolean N() throws h {
        a aVar = this.f44185i;
        if (aVar == a.TRUE) {
            return true;
        }
        if (aVar == a.FALSE) {
            return false;
        }
        throw new h("this token is not a boolean: <" + k() + ">", this);
    }

    public a O() {
        return this.f44185i;
    }

    public boolean P() throws h {
        if (this.f44185i == a.NULL) {
            return true;
        }
        throw new h("this token is not a null: <" + k() + ">", this);
    }

    public boolean Q(char c10, long j10) {
        int iOrdinal = this.f44185i.ordinal();
        boolean z10 = false;
        if (iOrdinal == 0) {
            char[] cArr = this.f44186j;
            int i10 = this.f44184h;
            if (cArr[i10] == c10) {
                this.f44185i = a.TRUE;
            } else if (this.f44187k[i10] == c10) {
                this.f44185i = a.FALSE;
            } else if (this.f44188l[i10] == c10) {
                this.f44185i = a.NULL;
            }
            z10 = true;
        } else if (iOrdinal == 1) {
            char[] cArr2 = this.f44186j;
            int i11 = this.f44184h;
            z10 = cArr2[i11] == c10;
            if (z10 && i11 + 1 == cArr2.length) {
                F(j10);
            }
        } else if (iOrdinal == 2) {
            char[] cArr3 = this.f44187k;
            int i12 = this.f44184h;
            z10 = cArr3[i12] == c10;
            if (z10 && i12 + 1 == cArr3.length) {
                F(j10);
            }
        } else if (iOrdinal == 3) {
            char[] cArr4 = this.f44188l;
            int i13 = this.f44184h;
            z10 = cArr4[i13] == c10;
            if (z10 && i13 + 1 == cArr4.length) {
                F(j10);
            }
        }
        this.f44184h++;
        return z10;
    }
}
