package com.google.common.io;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@r
public abstract class j {
    protected j() {
    }

    public Writer a() throws IOException {
        Writer writerB = b();
        return writerB instanceof BufferedWriter ? (BufferedWriter) writerB : new BufferedWriter(writerB);
    }

    public abstract Writer b() throws IOException;

    public void c(CharSequence charSequence) throws IOException {
        com.google.common.base.j0.E(charSequence);
        o oVarB = o.b();
        try {
            Writer writer = (Writer) oVarB.c(b());
            writer.append(charSequence);
            writer.flush();
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
    public long d(Readable readable) throws IOException {
        com.google.common.base.j0.E(readable);
        o oVarB = o.b();
        try {
            Writer writer = (Writer) oVarB.c(b());
            long jB = l.b(readable, writer);
            writer.flush();
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

    public void e(Iterable<? extends CharSequence> lines) throws IOException {
        f(lines, System.getProperty("line.separator"));
    }

    public void f(Iterable<? extends CharSequence> lines, String lineSeparator) throws IOException {
        com.google.common.base.j0.E(lines);
        com.google.common.base.j0.E(lineSeparator);
        o oVarB = o.b();
        try {
            Writer writer = (Writer) oVarB.c(a());
            Iterator<? extends CharSequence> it = lines.iterator();
            while (it.hasNext()) {
                writer.append(it.next()).append((CharSequence) lineSeparator);
            }
            writer.flush();
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
}
