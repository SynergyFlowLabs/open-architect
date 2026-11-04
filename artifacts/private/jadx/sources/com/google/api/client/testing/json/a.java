package com.google.api.client.testing.json;

import com.google.api.client.json.e;
import com.google.api.client.json.g;
import com.google.api.client.util.f;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes4.dex */
@f
public class a extends com.google.api.client.json.d {
    @Override // com.google.api.client.json.d
    public e a(OutputStream outputStream, Charset charset) throws IOException {
        return new b(this);
    }

    @Override // com.google.api.client.json.d
    public e b(Writer writer) throws IOException {
        return new b(this);
    }

    @Override // com.google.api.client.json.d
    public g d(InputStream inputStream) throws IOException {
        return new c(this);
    }

    @Override // com.google.api.client.json.d
    public g e(InputStream inputStream, Charset charset) throws IOException {
        return new c(this);
    }

    @Override // com.google.api.client.json.d
    public g f(Reader reader) throws IOException {
        return new c(this);
    }

    @Override // com.google.api.client.json.d
    public g g(String str) throws IOException {
        return new c(this);
    }
}
