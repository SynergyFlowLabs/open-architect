package org.apache.commons.codec.net;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import nk.h;
import org.apache.commons.codec.binary.m;

/* JADX INFO: loaded from: classes9.dex */
abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static final char f335481a = '?';

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final String f335482b = "?=";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final String f335483c = "=?";

    d() {
    }

    protected String g(String str) throws nk.f, UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        if (!str.startsWith(f335483c) || !str.endsWith(f335482b)) {
            throw new nk.f("RFC 1522 violation: malformed encoded content");
        }
        int length = str.length() - 2;
        int iIndexOf = str.indexOf(63, 2);
        if (iIndexOf == length) {
            throw new nk.f("RFC 1522 violation: charset token not found");
        }
        String strSubstring = str.substring(2, iIndexOf);
        if (strSubstring.equals("")) {
            throw new nk.f("RFC 1522 violation: charset not specified");
        }
        int i10 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(63, i10);
        if (iIndexOf2 == length) {
            throw new nk.f("RFC 1522 violation: encoding token not found");
        }
        String strSubstring2 = str.substring(i10, iIndexOf2);
        if (l().equalsIgnoreCase(strSubstring2)) {
            int i11 = iIndexOf2 + 1;
            return new String(h(m.g(str.substring(i11, str.indexOf(63, i11)))), strSubstring);
        }
        throw new nk.f("This codec cannot decode " + strSubstring2 + " encoded content");
    }

    protected abstract byte[] h(byte[] bArr) throws nk.f;

    protected abstract byte[] i(byte[] bArr) throws h;

    protected String j(String str, String str2) throws h, UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        return k(str, Charset.forName(str2));
    }

    protected String k(String str, Charset charset) throws h {
        if (str == null) {
            return null;
        }
        return f335483c + charset + f335481a + l() + f335481a + m.p(i(str.getBytes(charset))) + f335482b;
    }

    protected abstract String l();
}
