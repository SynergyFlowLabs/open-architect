package io.ably.lib.types;

import com.devtodev.analytics.internal.storage.sqlite.PeopleCardEntry;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes13.dex */
public class g implements Cloneable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f288008g = "timestamp";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f288009h = "id";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f288010i = "clientId";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f288011j = "connectionId";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f288012k = "encoding";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f288013l = "data";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final com.davidehrmann.vcdiff.b f288014m = com.davidehrmann.vcdiff.c.g().c();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static Pattern f288015n = Pattern.compile("([\\-\\w]+)(\\+([\\-\\w]+))?");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f288016o = g.class.getName();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f288017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f288018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f288019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f288020d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f288021e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f288022f;

    private String f(String[] strArr, char c10, int i10, int i11) {
        StringBuilder sb2 = new StringBuilder(strArr[i10]);
        for (int i12 = i10 + 1; i12 < i11; i12++) {
            sb2.append(c10);
            sb2.append(strArr[i12]);
        }
        return sb2.toString();
    }

    public static com.google.gson.o l(g gVar) {
        String str;
        com.google.gson.o oVar = new com.google.gson.o();
        Object obj = gVar.f288022f;
        String str2 = gVar.f288021e;
        if (obj != null) {
            if (obj instanceof byte[]) {
                oVar.P("data", new String(io.ably.lib.util.b.f((byte[]) obj)));
                if (str2 == null) {
                    str = "base64";
                } else {
                    str = str2 + "/base64";
                }
                str2 = str;
            } else {
                oVar.P("data", obj.toString());
            }
            if (str2 != null) {
                oVar.P("encoding", str2);
            }
        }
        String str3 = gVar.f288017a;
        if (str3 != null) {
            oVar.P("id", str3);
        }
        String str4 = gVar.f288019c;
        if (str4 != null) {
            oVar.P("clientId", str4);
        }
        String str5 = gVar.f288020d;
        if (str5 != null) {
            oVar.P("connectionId", str5);
        }
        return oVar;
    }

    private static byte[] n(byte[] bArr, byte[] bArr2) throws w {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            f288014m.c(bArr2, bArr, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th2) {
            throw w.e(th2, new r("VCDIFF delta decode failed", 400, 40018));
        }
    }

    protected int a() {
        int i10 = this.f288018b > 0 ? 1 : 0;
        if (this.f288017a != null) {
            i10++;
        }
        if (this.f288019c != null) {
            i10++;
        }
        if (this.f288020d != null) {
            i10++;
        }
        if (this.f288021e != null) {
            i10++;
        }
        return this.f288022f != null ? i10 + 1 : i10;
    }

    public void b(l lVar) throws w {
        c(lVar, new p());
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006d  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void c(l lVar, p pVar) throws w {
        byte b10;
        Object objN = this.f288022f;
        String str = this.f288021e;
        if (str != null) {
            String[] strArrSplit = str.split("\\/");
            int length = strArrSplit.length;
            while (true) {
                if (length > 0) {
                    try {
                        int i10 = length - 1;
                        Matcher matcher = f288015n.matcher(strArrSplit[i10]);
                        if (matcher.matches()) {
                            String strGroup = matcher.group(1);
                            switch (strGroup.hashCode()) {
                                case -1396204209:
                                    if (!strGroup.equals("base64")) {
                                        b10 = -1;
                                    } else {
                                        b10 = 0;
                                    }
                                    break;
                                case -1360271861:
                                    if (!strGroup.equals("cipher")) {
                                        b10 = -1;
                                    } else {
                                        b10 = 3;
                                    }
                                    break;
                                case -822215630:
                                    if (!strGroup.equals(q.f288149d)) {
                                        b10 = -1;
                                    } else {
                                        b10 = 4;
                                    }
                                    break;
                                case 3271912:
                                    if (!strGroup.equals(PeopleCardEntry.json)) {
                                        b10 = -1;
                                    } else {
                                        b10 = 2;
                                    }
                                    break;
                                case 111607186:
                                    if (!strGroup.equals("utf-8")) {
                                        b10 = -1;
                                    } else {
                                        b10 = 1;
                                    }
                                    break;
                                default:
                                    b10 = -1;
                                    break;
                            }
                            if (b10 == 0) {
                                try {
                                    byte[] bArrA = io.ably.lib.util.b.a((String) this.f288022f);
                                    this.f288022f = bArrA;
                                    if (length == strArrSplit.length) {
                                        objN = bArrA;
                                    }
                                } catch (IllegalArgumentException unused) {
                                    throw w.d("Invalid base64 data received");
                                }
                            } else if (b10 == 1) {
                                try {
                                    this.f288022f = new String((byte[]) this.f288022f, "UTF-8");
                                } catch (UnsupportedEncodingException | ClassCastException unused2) {
                                }
                            } else if (b10 == 2) {
                                try {
                                    this.f288022f = io.ably.lib.util.p.f288248a.c(((String) this.f288022f).trim());
                                } catch (com.google.gson.p unused3) {
                                    throw w.d("Invalid JSON data received");
                                }
                            } else if (b10 == 3) {
                                if (lVar == null || !lVar.f288108d) {
                                    throw w.d("Encrypted message received but encryption is not set up");
                                }
                                try {
                                    this.f288022f = io.ably.lib.util.e.b(lVar.c()).b((byte[]) this.f288022f);
                                } catch (a e10) {
                                    throw w.d(e10.f287918a.f288158c);
                                }
                            } else if (b10 == 4) {
                                objN = n((byte[]) this.f288022f, pVar.a());
                                this.f288022f = objN;
                            }
                            length = i10;
                        }
                    } catch (Throwable th2) {
                        this.f288021e = length > 0 ? f(strArrSplit, '/', 0, length) : null;
                        throw th2;
                    }
                }
            }
            this.f288021e = length > 0 ? f(strArrSplit, '/', 0, length) : null;
        }
        if (objN instanceof String) {
            pVar.b((String) objN);
        } else {
            if (!(objN instanceof byte[])) {
                throw w.d("Message data neither String nor byte[]. Unsupported message data type.");
            }
            pVar.c((byte[]) objN);
        }
    }

    public void d(l lVar) throws a {
        String str;
        String str2;
        Object obj = this.f288022f;
        String str3 = "";
        if (obj != null) {
            if (obj instanceof com.google.gson.l) {
                this.f288022f = io.ably.lib.util.p.f288250c.C((com.google.gson.l) obj);
                StringBuilder sb2 = new StringBuilder();
                if (this.f288021e == null) {
                    str2 = "";
                } else {
                    str2 = this.f288021e + "/";
                }
                sb2.append(str2);
                sb2.append(PeopleCardEntry.json);
                this.f288021e = sb2.toString();
            }
            Object obj2 = this.f288022f;
            if (obj2 instanceof String) {
                if (lVar != null && lVar.f288108d) {
                    try {
                        this.f288022f = ((String) obj2).getBytes("UTF-8");
                    } catch (UnsupportedEncodingException unused) {
                    }
                    StringBuilder sb3 = new StringBuilder();
                    if (this.f288021e == null) {
                        str = "";
                    } else {
                        str = this.f288021e + "/";
                    }
                    sb3.append(str);
                    sb3.append("utf-8");
                    this.f288021e = sb3.toString();
                }
            } else if (!(obj2 instanceof byte[])) {
                io.ably.lib.util.k.b(f288016o, "Message data must be either `byte[]`, `String` or `JSONElement`; implicit coercion of other types to String is deprecated");
                throw a.a(new r("Invalid message data or encoding", 400, 40013));
            }
        }
        if (lVar == null || !lVar.f288108d) {
            return;
        }
        io.ably.lib.util.e.f fVarC = io.ably.lib.util.e.c(lVar.c());
        this.f288022f = fVarC.a((byte[]) this.f288022f);
        StringBuilder sb4 = new StringBuilder();
        if (this.f288021e != null) {
            str3 = this.f288021e + "/";
        }
        sb4.append(str3);
        sb4.append("cipher+");
        sb4.append(fVarC.getAlgorithm());
        this.f288021e = sb4.toString();
    }

    public void e(StringBuilder sb2) {
        if (this.f288019c != null) {
            sb2.append(" clientId=");
            sb2.append(this.f288019c);
        }
        if (this.f288020d != null) {
            sb2.append(" connectionId=");
            sb2.append(this.f288020d);
        }
        if (this.f288022f != null) {
            sb2.append(" data=");
            sb2.append(this.f288022f);
        }
        if (this.f288021e != null) {
            sb2.append(" encoding=");
            sb2.append(this.f288021e);
        }
        if (this.f288017a != null) {
            sb2.append(" id=");
            sb2.append(this.f288017a);
        }
    }

    protected void g(com.google.gson.o oVar) throws w {
        Long lJ = j(oVar, "timestamp");
        if (lJ != null) {
            this.f288018b = lJ.longValue();
        }
        this.f288017a = k(oVar, "id");
        this.f288019c = k(oVar, "clientId");
        this.f288020d = k(oVar, "connectionId");
        this.f288021e = k(oVar, "encoding");
        this.f288022f = k(oVar, "data");
    }

    boolean h(org.msgpack.core.o oVar, String str, org.msgpack.core.c cVar) throws IOException {
        str.getClass();
        switch (str) {
            case "id":
                this.f288017a = oVar.h1();
                return true;
            case "data":
                if (!cVar.k().l()) {
                    this.f288022f = oVar.h1();
                    return true;
                }
                byte[] bArr = new byte[oVar.B0()];
                oVar.T(bArr);
                this.f288022f = bArr;
                return true;
            case "timestamp":
                this.f288018b = oVar.U0();
                return true;
            case "clientId":
                this.f288019c = oVar.h1();
                return true;
            case "encoding":
                this.f288021e = oVar.h1();
                return true;
            case "connectionId":
                this.f288020d = oVar.h1();
                return true;
            default:
                return false;
        }
    }

    protected Integer i(com.google.gson.o oVar, String str) {
        com.google.gson.l lVarS = oVar.S(str);
        if (lVarS == null || (lVarS instanceof com.google.gson.n)) {
            return null;
        }
        return Integer.valueOf(lVarS.s());
    }

    protected Long j(com.google.gson.o oVar, String str) {
        com.google.gson.l lVarS = oVar.S(str);
        if (lVarS == null || (lVarS instanceof com.google.gson.n)) {
            return null;
        }
        return Long.valueOf(lVarS.A());
    }

    protected String k(com.google.gson.o oVar, String str) {
        com.google.gson.l lVarS = oVar.S(str);
        if (lVarS == null || (lVarS instanceof com.google.gson.n)) {
            return null;
        }
        return lVarS.D();
    }

    void o(org.msgpack.core.j jVar) throws IOException {
        if (this.f288018b > 0) {
            jVar.N("timestamp");
            jVar.x(this.f288018b);
        }
        if (this.f288017a != null) {
            jVar.N("id");
            jVar.N(this.f288017a);
        }
        if (this.f288019c != null) {
            jVar.N("clientId");
            jVar.N(this.f288019c);
        }
        if (this.f288020d != null) {
            jVar.N("connectionId");
            jVar.N(this.f288020d);
        }
        if (this.f288021e != null) {
            jVar.N("encoding");
            jVar.N(this.f288021e);
        }
        if (this.f288022f != null) {
            jVar.N("data");
            Object obj = this.f288022f;
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                jVar.j(bArr.length);
                jVar.r0(bArr);
                return;
            }
            jVar.N(obj.toString());
        }
    }
}
