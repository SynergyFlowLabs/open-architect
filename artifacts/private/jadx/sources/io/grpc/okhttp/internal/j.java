package io.grpc.okhttp.internal;

import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: loaded from: classes13.dex */
public final class j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f290649d = 307;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f290650e = 308;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f290651f = 100;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f290652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f290653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f290654c;

    public j(i iVar, int i10, String str) {
        this.f290652a = iVar;
        this.f290653b = i10;
        this.f290654c = str;
    }

    public static j a(String str) throws IOException {
        i iVar;
        int i10;
        String strSubstring;
        if (str.startsWith("HTTP/1.")) {
            i10 = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt == 0) {
                iVar = i.HTTP_1_0;
            } else {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                iVar = i.HTTP_1_1;
            }
        } else {
            if (!str.startsWith("ICY ")) {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            iVar = i.HTTP_1_0;
            i10 = 4;
        }
        int i11 = i10 + 3;
        if (str.length() < i11) {
            throw new ProtocolException("Unexpected status line: " + str);
        }
        try {
            int i12 = Integer.parseInt(str.substring(i10, i11));
            if (str.length() <= i11) {
                strSubstring = "";
            } else {
                if (str.charAt(i11) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                strSubstring = str.substring(i10 + 4);
            }
            return new j(iVar, i12, strSubstring);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: " + str);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f290652a == i.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb2.append(' ');
        sb2.append(this.f290653b);
        if (this.f290654c != null) {
            sb2.append(' ');
            sb2.append(this.f290654c);
        }
        return sb2.toString();
    }
}
