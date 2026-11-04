package com.google.api.client.json;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d {
    private ByteArrayOutputStream m(Object obj, boolean z10) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        e eVarA = a(byteArrayOutputStream, com.google.api.client.util.j.f116086a);
        if (z10) {
            eVarA.b();
        }
        eVarA.e(obj);
        eVarA.c();
        return byteArrayOutputStream;
    }

    private String p(Object obj, boolean z10) throws IOException {
        return m(obj, z10).toString("UTF-8");
    }

    public abstract e a(OutputStream outputStream, Charset charset) throws IOException;

    public abstract e b(Writer writer) throws IOException;

    public final f c() {
        return new f(this);
    }

    public abstract g d(InputStream inputStream) throws IOException;

    public abstract g e(InputStream inputStream, Charset charset) throws IOException;

    public abstract g f(Reader reader) throws IOException;

    public abstract g g(String str) throws IOException;

    public final <T> T h(InputStream inputStream, Class<T> cls) throws IOException {
        return (T) d(inputStream).w(cls);
    }

    public final <T> T i(InputStream inputStream, Charset charset, Class<T> cls) throws IOException {
        return (T) e(inputStream, charset).w(cls);
    }

    public final <T> T j(Reader reader, Class<T> cls) throws IOException {
        return (T) f(reader).w(cls);
    }

    public final <T> T k(String str, Class<T> cls) throws IOException {
        return (T) g(str).p(cls);
    }

    public final byte[] l(Object obj) throws IOException {
        return m(obj, false).toByteArray();
    }

    public final String n(Object obj) throws IOException {
        return p(obj, true);
    }

    public final String o(Object obj) throws IOException {
        return p(obj, false);
    }
}
