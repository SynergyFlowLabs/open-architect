package org.apache.commons.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes14.dex */
public class r implements Iterator<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BufferedReader f336815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f336816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f336817c = false;

    public r(Reader reader) throws IllegalArgumentException {
        if (reader == null) {
            throw new IllegalArgumentException("Reader must not be null");
        }
        if (reader instanceof BufferedReader) {
            this.f336815a = (BufferedReader) reader;
        } else {
            this.f336815a = new BufferedReader(reader);
        }
    }

    public static void c(r rVar) {
        if (rVar != null) {
            rVar.b();
        }
    }

    public void b() {
        this.f336817c = true;
        p.m(this.f336815a);
        this.f336816b = null;
    }

    protected boolean d(String str) {
        return true;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public String next() {
        return f();
    }

    public String f() {
        if (!hasNext()) {
            throw new NoSuchElementException("No more lines");
        }
        String str = this.f336816b;
        int i10 = 4 ^ 0;
        this.f336816b = null;
        return str;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        String line;
        if (this.f336816b != null) {
            return true;
        }
        if (this.f336817c) {
            return false;
        }
        do {
            try {
                line = this.f336815a.readLine();
                if (line == null) {
                    this.f336817c = true;
                    return false;
                }
            } catch (IOException e10) {
                b();
                throw new IllegalStateException(e10);
            }
        } while (!d(line));
        this.f336816b = line;
        return true;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Remove unsupported on LineIterator");
    }
}
