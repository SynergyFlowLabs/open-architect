package com.google.gson.internal;

import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class j0 {
    private j0() {
        throw new UnsupportedOperationException();
    }

    public static com.google.gson.l a(com.google.gson.stream.a aVar) throws com.google.gson.p {
        boolean z10;
        try {
            try {
                aVar.x();
                z10 = false;
                try {
                    return com.google.gson.internal.bind.p.V.read(aVar);
                } catch (EOFException e10) {
                    e = e10;
                    if (z10) {
                        return com.google.gson.n.f125555a;
                    }
                    throw new com.google.gson.v(e);
                }
            } catch (EOFException e11) {
                e = e11;
                z10 = true;
            }
        } catch (com.google.gson.stream.e e12) {
            throw new com.google.gson.v(e12);
        } catch (IOException e13) {
            throw new com.google.gson.m(e13);
        } catch (NumberFormatException e14) {
            throw new com.google.gson.v(e14);
        }
    }

    public static void b(com.google.gson.l lVar, com.google.gson.stream.d dVar) throws IOException {
        com.google.gson.internal.bind.p.V.write(dVar, lVar);
    }

    public static Writer c(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new b(appendable);
    }

    private static final class b extends Writer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Appendable f125489a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a f125490b = new a();

        private static class a implements CharSequence {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private char[] f125491a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f125492b;

            private a() {
            }

            void a(char[] cArr) {
                this.f125491a = cArr;
                this.f125492b = null;
            }

            @Override // java.lang.CharSequence
            public char charAt(int i10) {
                return this.f125491a[i10];
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.f125491a.length;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i10, int i11) {
                return new String(this.f125491a, i10, i11 - i10);
            }

            @Override // java.lang.CharSequence
            public String toString() {
                if (this.f125492b == null) {
                    this.f125492b = new String(this.f125491a);
                }
                return this.f125492b;
            }
        }

        b(Appendable appendable) {
            this.f125489a = appendable;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i10, int i11) throws IOException {
            this.f125490b.a(cArr);
            this.f125489a.append(this.f125490b, i10, i11 + i10);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence) throws IOException {
            this.f125489a.append(charSequence);
            return this;
        }

        @Override // java.io.Writer
        public void write(int i10) throws IOException {
            this.f125489a.append((char) i10);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence, int i10, int i11) throws IOException {
            this.f125489a.append(charSequence, i10, i11);
            return this;
        }

        @Override // java.io.Writer
        public void write(String str, int i10, int i11) throws IOException {
            Objects.requireNonNull(str);
            this.f125489a.append(str, i10, i11 + i10);
        }
    }
}
