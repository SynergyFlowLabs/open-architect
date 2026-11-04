package com.google.api.client.http;

import com.google.api.client.util.m0;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes4.dex */
public class i implements n {

    class a extends BufferedOutputStream {
        a(OutputStream outputStream) {
            super(outputStream);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            try {
                flush();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.google.api.client.http.n
    public void a(m0 m0Var, OutputStream outputStream) throws IOException {
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(new a(outputStream));
        m0Var.writeTo(gZIPOutputStream);
        gZIPOutputStream.close();
    }

    @Override // com.google.api.client.http.n
    public String getName() {
        return "gzip";
    }
}
