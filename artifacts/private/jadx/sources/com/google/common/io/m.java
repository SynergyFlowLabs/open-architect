package com.google.common.io;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@r
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @com.google.common.annotations.e
    static final Logger f119037a = Logger.getLogger(m.class.getName());

    private m() {
    }

    public static void a(@fj.a Closeable closeable, boolean swallowIOException) throws IOException {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e10) {
            if (!swallowIOException) {
                throw e10;
            }
            f119037a.log(Level.WARNING, "IOException thrown while closing Closeable.", (Throwable) e10);
        }
    }

    public static void b(@fj.a InputStream inputStream) {
        try {
            a(inputStream, true);
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public static void c(@fj.a Reader reader) {
        try {
            a(reader, true);
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
