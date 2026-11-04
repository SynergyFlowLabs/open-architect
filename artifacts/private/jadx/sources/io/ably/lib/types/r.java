package io.ably.lib.types;

import androidx.media2.session.SessionCommand;
import java.io.IOException;
import java.net.NoRouteToHostException;
import java.net.UnknownHostException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes13.dex */
public class r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f288154e = "https://help.ably.io/error/";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f288155f = "io.ably.lib.types.r";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f288156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f288157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f288158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f288159d;

    public r() {
    }

    static r a(org.msgpack.core.o oVar) throws IOException {
        return new r().h(oVar);
    }

    private static r b(org.msgpack.core.o oVar) throws IOException {
        int iB1 = oVar.b1();
        r rVarA = null;
        for (int i10 = 0; i10 < iB1; i10++) {
            String strIntern = oVar.h1().intern();
            if (oVar.d().equals(org.msgpack.core.c.f339230f)) {
                oVar.d1();
            } else {
                strIntern.getClass();
                if (strIntern.equals("error")) {
                    rVarA = a(oVar);
                } else {
                    io.ably.lib.util.k.k(f288155f, "Unexpected field: " + strIntern);
                    oVar.a9();
                }
            }
        }
        return rVarA;
    }

    public static r c(byte[] bArr) throws IOException {
        return b(io.ably.lib.util.p.f288252e.n(bArr));
    }

    public static r d(String str, int i10) {
        return new r(str, i10, i10 * 100);
    }

    public static r e(Throwable th2) {
        if ((th2 instanceof UnknownHostException) || (th2 instanceof NoRouteToHostException)) {
            return new r(th2.getLocalizedMessage(), 500, SessionCommand.f58661j0);
        }
        if (th2 instanceof IOException) {
            return new r(th2.getLocalizedMessage(), 500, 50000);
        }
        return new r("Unexpected exception: " + th2.getLocalizedMessage(), 50000, 500);
    }

    private static String f(int i10) {
        return f288154e + i10;
    }

    private String g() {
        String str = this.f288158c;
        if (str == null) {
            str = "";
        }
        String strF = this.f288159d;
        if (strF == null) {
            int i10 = this.f288156a;
            strF = i10 > 0 ? f(i10) : null;
        }
        if (strF == null || str.contains(strF)) {
            return str;
        }
        return str + " (See " + strF + ")";
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f288156a == rVar.f288156a && this.f288157b == rVar.f288157b && ((str = this.f288158c) == (str2 = rVar.f288158c) || (str != null && str.equals(str2)));
    }

    r h(org.msgpack.core.o oVar) throws IOException {
        int iB1 = oVar.b1();
        for (int i10 = 0; i10 < iB1; i10++) {
            String strIntern = oVar.h1().intern();
            if (!oVar.d().equals(org.msgpack.core.c.f339230f)) {
                strIntern.getClass();
                switch (strIntern) {
                    case "code":
                        this.f288156a = oVar.T0();
                        break;
                    case "href":
                        this.f288159d = oVar.h1();
                        break;
                    case "statusCode":
                        this.f288157b = oVar.T0();
                        break;
                    case "message":
                        this.f288158c = oVar.h1();
                        break;
                    default:
                        io.ably.lib.util.k.k(f288155f, "Unexpected field: " + strIntern);
                        oVar.a9();
                        break;
                }
            } else {
                oVar.d1();
            }
        }
        return this;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{ErrorInfo");
        sb2.append(" message=");
        sb2.append(g());
        if (this.f288156a > 0) {
            sb2.append(" code=");
            sb2.append(this.f288156a);
        }
        if (this.f288157b > 0) {
            sb2.append(" statusCode=");
            sb2.append(this.f288157b);
        }
        if (this.f288159d != null) {
            sb2.append(" href=");
            sb2.append(this.f288159d);
        }
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        return sb2.toString();
    }

    public r(String str, int i10) {
        this.f288156a = i10;
        this.f288158c = str;
    }

    public r(String str, int i10, int i11) {
        this(str, i11);
        this.f288157b = i10;
        if (i11 > 0) {
            this.f288159d = f(i11);
        }
    }
}
