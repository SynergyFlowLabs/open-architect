package com.google.common.io;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@r
public abstract class f {

    private final class b extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Charset f118985a;

        @Override // com.google.common.io.j
        public Writer b() throws IOException {
            return new OutputStreamWriter(f.this.c(), this.f118985a);
        }

        public String toString() {
            return f.this.toString() + ".asCharSink(" + this.f118985a + ")";
        }

        private b(Charset charset) {
            this.f118985a = (Charset) com.google.common.base.j0.E(charset);
        }
    }

    protected f() {
    }

    public j a(Charset charset) {
        return new b(charset);
    }

    public OutputStream b() throws IOException {
        OutputStream outputStreamC = c();
        return outputStreamC instanceof BufferedOutputStream ? (BufferedOutputStream) outputStreamC : new BufferedOutputStream(outputStreamC);
    }

    public abstract OutputStream c() throws IOException;

    public void d(byte[] bytes) throws IOException {
        com.google.common.base.j0.E(bytes);
        o oVarB = o.b();
        try {
            OutputStream outputStream = (OutputStream) oVarB.c(c());
            outputStream.write(bytes);
            outputStream.flush();
            oVarB.close();
        } catch (Throwable th2) {
            try {
                throw oVarB.d(th2);
            } catch (Throwable th3) {
                oVarB.close();
                throw th3;
            }
        }
    }

    @z7.a
    public long e(InputStream input) throws IOException {
        com.google.common.base.j0.E(input);
        o oVarB = o.b();
        try {
            OutputStream outputStream = (OutputStream) oVarB.c(c());
            long jB = h.b(input, outputStream);
            outputStream.flush();
            oVarB.close();
            return jB;
        } catch (Throwable th2) {
            try {
                throw oVarB.d(th2);
            } catch (Throwable th3) {
                oVarB.close();
                throw th3;
            }
        }
    }
}
