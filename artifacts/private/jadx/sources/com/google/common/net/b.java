package com.google.common.net;

import com.google.common.base.d0;
import com.google.common.base.j0;
import com.google.common.base.r0;
import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
@a
@z7.j
@com.google.common.annotations.b
public final class b implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f119465d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f119466e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f119467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f119468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f119469c;

    private b(String host, int port, boolean hasBracketlessColons) {
        this.f119467a = host;
        this.f119468b = port;
        this.f119469c = hasBracketlessColons;
    }

    public static b a(String host) {
        b bVarC = c(host);
        j0.u(!bVarC.h(), "Host has a port: %s", host);
        return bVarC;
    }

    public static b b(String host, int port) {
        j0.k(i(port), "Port out of range: %s", port);
        b bVarC = c(host);
        j0.u(!bVarC.h(), "Host has a port: %s", host);
        return new b(bVarC.f119467a, port, bVarC.f119469c);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0053  */
    /* JADX WARN: Code duplicated, block: B:20:0x005d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0069  */
    @z7.a
    public static b c(String hostPortString) {
        boolean z10;
        String strSubstring;
        String str;
        String strSubstring2;
        j0.E(hostPortString);
        int i10 = -1;
        if (!hostPortString.startsWith("[")) {
            int iIndexOf = hostPortString.indexOf(58);
            if (iIndexOf >= 0) {
                int i11 = iIndexOf + 1;
                if (hostPortString.indexOf(58, i11) == -1) {
                    strSubstring2 = hostPortString.substring(0, iIndexOf);
                    strSubstring = hostPortString.substring(i11);
                }
                if (!r0.d(strSubstring)) {
                    j0.u(strSubstring.startsWith(org.slf4j.h.f339615a3) && com.google.common.base.e.f().C(strSubstring), "Unparseable port number: %s", hostPortString);
                    try {
                        i10 = Integer.parseInt(strSubstring);
                        j0.u(i(i10), "Port number out of range: %s", hostPortString);
                    } catch (NumberFormatException unused) {
                        throw new IllegalArgumentException("Unparseable port number: " + hostPortString);
                    }
                }
                return new b(str, i10, z10);
            }
            z10 = iIndexOf >= 0;
            strSubstring = null;
            str = hostPortString;
            if (!r0.d(strSubstring)) {
                j0.u(strSubstring.startsWith(org.slf4j.h.f339615a3) && com.google.common.base.e.f().C(strSubstring), "Unparseable port number: %s", hostPortString);
                i10 = Integer.parseInt(strSubstring);
                j0.u(i(i10), "Port number out of range: %s", hostPortString);
            }
            return new b(str, i10, z10);
        }
        String[] strArrE = e(hostPortString);
        strSubstring2 = strArrE[0];
        strSubstring = strArrE[1];
        str = strSubstring2;
        z10 = false;
        if (!r0.d(strSubstring)) {
            j0.u(strSubstring.startsWith(org.slf4j.h.f339615a3) && com.google.common.base.e.f().C(strSubstring), "Unparseable port number: %s", hostPortString);
            i10 = Integer.parseInt(strSubstring);
            j0.u(i(i10), "Port number out of range: %s", hostPortString);
        }
        return new b(str, i10, z10);
    }

    private static String[] e(String hostPortString) {
        j0.u(hostPortString.charAt(0) == '[', "Bracketed host-port string must start with a bracket: %s", hostPortString);
        int iIndexOf = hostPortString.indexOf(58);
        int iLastIndexOf = hostPortString.lastIndexOf(93);
        j0.u(iIndexOf > -1 && iLastIndexOf > iIndexOf, "Invalid bracketed host/port: %s", hostPortString);
        String strSubstring = hostPortString.substring(1, iLastIndexOf);
        int i10 = iLastIndexOf + 1;
        if (i10 == hostPortString.length()) {
            return new String[]{strSubstring, ""};
        }
        j0.u(hostPortString.charAt(i10) == ':', "Only a colon may follow a close bracket: %s", hostPortString);
        int i11 = iLastIndexOf + 2;
        for (int i12 = i11; i12 < hostPortString.length(); i12++) {
            j0.u(Character.isDigit(hostPortString.charAt(i12)), "Port must be numeric: %s", hostPortString);
        }
        return new String[]{strSubstring, hostPortString.substring(i11)};
    }

    private static boolean i(int port) {
        return port >= 0 && port <= 65535;
    }

    public String d() {
        return this.f119467a;
    }

    public boolean equals(@fj.a Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof b) {
            b bVar = (b) other;
            if (d0.a(this.f119467a, bVar.f119467a) && this.f119468b == bVar.f119468b) {
                return true;
            }
        }
        return false;
    }

    public int f() {
        j0.g0(h());
        return this.f119468b;
    }

    public int g(int defaultPort) {
        return h() ? this.f119468b : defaultPort;
    }

    public boolean h() {
        return this.f119468b >= 0;
    }

    public int hashCode() {
        return d0.b(this.f119467a, Integer.valueOf(this.f119468b));
    }

    @z7.a
    public b j() {
        j0.u(!this.f119469c, "Possible bracketless IPv6 literal: %s", this.f119467a);
        return this;
    }

    public b k(int defaultPort) {
        j0.d(i(defaultPort));
        return h() ? this : new b(this.f119467a, defaultPort, this.f119469c);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(this.f119467a.length() + 8);
        if (this.f119467a.indexOf(58) >= 0) {
            sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
            sb2.append(this.f119467a);
            sb2.append(AbstractJsonLexerKt.END_LIST);
        } else {
            sb2.append(this.f119467a);
        }
        if (h()) {
            sb2.append(AbstractJsonLexerKt.COLON);
            sb2.append(this.f119468b);
        }
        return sb2.toString();
    }
}
