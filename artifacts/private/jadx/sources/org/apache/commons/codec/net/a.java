package org.apache.commons.codec.net;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import nk.h;
import nk.i;
import nk.j;

/* JADX INFO: loaded from: classes9.dex */
public class a extends d implements j, i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Charset f335466d;

    public a() {
        this(nk.d.f333413f);
    }

    @Override // nk.g
    public Object a(Object obj) throws h {
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return f((String) obj);
        }
        throw new h("Objects of type " + obj.getClass().getName() + " cannot be encoded using BCodec");
    }

    @Override // nk.e
    public Object b(Object obj) throws nk.f {
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return c((String) obj);
        }
        throw new nk.f("Objects of type " + obj.getClass().getName() + " cannot be decoded using BCodec");
    }

    @Override // nk.i
    public String c(String str) throws nk.f {
        if (str == null) {
            return null;
        }
        try {
            return g(str);
        } catch (UnsupportedEncodingException e10) {
            throw new nk.f(e10.getMessage(), e10);
        }
    }

    @Override // nk.j
    public String f(String str) throws h {
        if (str == null) {
            return null;
        }
        return n(str, o());
    }

    @Override // org.apache.commons.codec.net.d
    protected byte[] h(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return org.apache.commons.codec.binary.d.z(bArr);
    }

    @Override // org.apache.commons.codec.net.d
    protected byte[] i(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return org.apache.commons.codec.binary.d.B(bArr);
    }

    @Override // org.apache.commons.codec.net.d
    protected String l() {
        return "B";
    }

    public String m(String str, String str2) throws h {
        if (str == null) {
            return null;
        }
        try {
            return j(str, str2);
        } catch (UnsupportedEncodingException e10) {
            throw new h(e10.getMessage(), e10);
        }
    }

    public String n(String str, Charset charset) throws h {
        if (str == null) {
            return null;
        }
        return k(str, charset);
    }

    public Charset o() {
        return this.f335466d;
    }

    public String p() {
        return this.f335466d.name();
    }

    public a(Charset charset) {
        this.f335466d = charset;
    }

    public a(String str) {
        this(Charset.forName(str));
    }
}
