package com.google.common.io;

import java.io.Flushable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@r
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f119065a = Logger.getLogger(v.class.getName());

    private v() {
    }

    public static void a(Flushable flushable, boolean swallowIOException) throws IOException {
        try {
            flushable.flush();
        } catch (IOException e10) {
            if (!swallowIOException) {
                throw e10;
            }
            f119065a.log(Level.WARNING, "IOException thrown while flushing Flushable.", (Throwable) e10);
        }
    }

    @com.google.common.annotations.a
    public static void b(Flushable flushable) {
        try {
            a(flushable, true);
        } catch (IOException e10) {
            f119065a.log(Level.SEVERE, "IOException should not have been thrown.", (Throwable) e10);
        }
    }
}
