package com.google.gson;

import com.google.gson.internal.j0;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes5.dex */
public final class u implements Iterator<l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.gson.stream.a f125634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f125635b;

    public u(String str) {
        this(new StringReader(str));
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l next() throws p {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        try {
            return j0.a(this.f125634a);
        } catch (OutOfMemoryError | StackOverflowError e10) {
            throw new p("Failed parsing JSON source to Json", e10);
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        boolean z10;
        synchronized (this.f125635b) {
            try {
                try {
                    z10 = this.f125634a.x() != com.google.gson.stream.c.END_DOCUMENT;
                } catch (com.google.gson.stream.e e10) {
                    throw new v(e10);
                } catch (IOException e11) {
                    throw new m(e11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    public u(Reader reader) {
        com.google.gson.stream.a aVar = new com.google.gson.stream.a(reader);
        this.f125634a = aVar;
        aVar.R(y.LENIENT);
        this.f125635b = new Object();
    }
}
