package com.google.common.io;

import com.google.common.collect.l6;
import com.google.common.collect.x7;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@r
public abstract class k {

    private final class a extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Charset f119027a;

        a(Charset charset) {
            this.f119027a = (Charset) com.google.common.base.j0.E(charset);
        }

        @Override // com.google.common.io.g
        public k a(Charset charset) {
            return charset.equals(this.f119027a) ? k.this : super.a(charset);
        }

        @Override // com.google.common.io.g
        public InputStream m() throws IOException {
            return new h0(k.this.m(), this.f119027a, 8192);
        }

        public String toString() {
            return k.this.toString() + ".asByteSource(" + this.f119027a + ")";
        }
    }

    private static class b extends k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final com.google.common.base.o0 f119029b = com.google.common.base.o0.l("\r\n|\n|\r");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final CharSequence f119030a;

        class a extends com.google.common.collect.c<String> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Iterator<String> f119031c;

            a() {
                this.f119031c = b.f119029b.n(b.this.f119030a).iterator();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.c
            @fj.a
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public String b() {
                if (this.f119031c.hasNext()) {
                    String next = this.f119031c.next();
                    if (this.f119031c.hasNext() || !next.isEmpty()) {
                        return next;
                    }
                }
                return c();
            }
        }

        protected b(CharSequence seq) {
            this.f119030a = (CharSequence) com.google.common.base.j0.E(seq);
        }

        private Iterator<String> t() {
            return new a();
        }

        @Override // com.google.common.io.k
        public boolean i() {
            return this.f119030a.length() == 0;
        }

        @Override // com.google.common.io.k
        public long j() {
            return this.f119030a.length();
        }

        @Override // com.google.common.io.k
        public com.google.common.base.e0<Long> k() {
            return com.google.common.base.e0.f(Long.valueOf(this.f119030a.length()));
        }

        @Override // com.google.common.io.k
        public Reader m() {
            return new i(this.f119030a);
        }

        @Override // com.google.common.io.k
        public String n() {
            return this.f119030a.toString();
        }

        @Override // com.google.common.io.k
        @fj.a
        public String o() {
            Iterator<String> itT = t();
            if (itT.hasNext()) {
                return itT.next();
            }
            return null;
        }

        @Override // com.google.common.io.k
        public l6<String> p() {
            return l6.A(t());
        }

        @Override // com.google.common.io.k
        @f0
        public <T> T q(z<T> processor) throws IOException {
            Iterator<String> itT = t();
            while (itT.hasNext() && processor.a(itT.next())) {
            }
            return processor.getResult();
        }

        public String toString() {
            return "CharSource.wrap(" + com.google.common.base.c.k(this.f119030a, 30, "...") + ")";
        }
    }

    private static final class c extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Iterable<? extends k> f119033a;

        c(Iterable<? extends k> sources) {
            this.f119033a = (Iterable) com.google.common.base.j0.E(sources);
        }

        @Override // com.google.common.io.k
        public boolean i() throws IOException {
            Iterator<? extends k> it = this.f119033a.iterator();
            while (it.hasNext()) {
                if (!it.next().i()) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.io.k
        public long j() throws IOException {
            Iterator<? extends k> it = this.f119033a.iterator();
            long j10 = 0;
            while (it.hasNext()) {
                j10 += it.next().j();
            }
            return j10;
        }

        @Override // com.google.common.io.k
        public com.google.common.base.e0<Long> k() {
            Iterator<? extends k> it = this.f119033a.iterator();
            long jLongValue = 0;
            while (it.hasNext()) {
                com.google.common.base.e0<Long> e0VarK = it.next().k();
                if (!e0VarK.e()) {
                    return com.google.common.base.e0.a();
                }
                jLongValue += e0VarK.d().longValue();
            }
            return com.google.common.base.e0.f(Long.valueOf(jLongValue));
        }

        @Override // com.google.common.io.k
        public Reader m() throws IOException {
            return new e0(this.f119033a.iterator());
        }

        public String toString() {
            return "CharSource.concat(" + this.f119033a + ")";
        }
    }

    private static final class d extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final d f119034c = new d();

        private d() {
            super("");
        }

        @Override // com.google.common.io.k.b
        public String toString() {
            return "CharSource.empty()";
        }
    }

    private static class e extends b {
        protected e(String seq) {
            super(seq);
        }

        @Override // com.google.common.io.k
        public long e(j sink) throws IOException {
            com.google.common.base.j0.E(sink);
            o oVarB = o.b();
            try {
                ((Writer) oVarB.c(sink.b())).write((String) this.f119030a);
                long length = this.f119030a.length();
                oVarB.close();
                return length;
            } catch (Throwable th2) {
                try {
                    throw oVarB.d(th2);
                } catch (Throwable th3) {
                    oVarB.close();
                    throw th3;
                }
            }
        }

        @Override // com.google.common.io.k
        public long f(Appendable appendable) throws IOException {
            appendable.append(this.f119030a);
            return this.f119030a.length();
        }

        @Override // com.google.common.io.k.b, com.google.common.io.k
        public Reader m() {
            return new StringReader((String) this.f119030a);
        }
    }

    protected k() {
    }

    public static k b(Iterable<? extends k> sources) {
        return new c(sources);
    }

    public static k c(Iterator<? extends k> sources) {
        return b(l6.A(sources));
    }

    public static k d(k... sources) {
        return b(l6.B(sources));
    }

    private long g(Reader reader) throws IOException {
        long j10 = 0;
        while (true) {
            long jSkip = reader.skip(Long.MAX_VALUE);
            if (jSkip == 0) {
                return j10;
            }
            j10 += jSkip;
        }
    }

    public static k h() {
        return d.f119034c;
    }

    public static k r(CharSequence charSequence) {
        return charSequence instanceof String ? new e((String) charSequence) : new b(charSequence);
    }

    public g a(Charset charset) {
        return new a(charset);
    }

    @z7.a
    public long e(j sink) throws IOException {
        com.google.common.base.j0.E(sink);
        o oVarB = o.b();
        try {
            long jB = l.b((Reader) oVarB.c(m()), (Writer) oVarB.c(sink.b()));
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

    @z7.a
    public long f(Appendable appendable) throws IOException {
        com.google.common.base.j0.E(appendable);
        o oVarB = o.b();
        try {
            long jB = l.b((Reader) oVarB.c(m()), appendable);
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

    public boolean i() throws IOException {
        com.google.common.base.e0<Long> e0VarK = k();
        if (e0VarK.e()) {
            return e0VarK.d().longValue() == 0;
        }
        o oVarB = o.b();
        try {
            boolean z10 = ((Reader) oVarB.c(m())).read() == -1;
            oVarB.close();
            return z10;
        } catch (Throwable th2) {
            try {
                throw oVarB.d(th2);
            } catch (Throwable th3) {
                oVarB.close();
                throw th3;
            }
        }
    }

    public long j() throws IOException {
        com.google.common.base.e0<Long> e0VarK = k();
        if (e0VarK.e()) {
            return e0VarK.d().longValue();
        }
        o oVarB = o.b();
        try {
            long jG = g((Reader) oVarB.c(m()));
            oVarB.close();
            return jG;
        } catch (Throwable th2) {
            try {
                throw oVarB.d(th2);
            } catch (Throwable th3) {
                oVarB.close();
                throw th3;
            }
        }
    }

    public com.google.common.base.e0<Long> k() {
        return com.google.common.base.e0.a();
    }

    public BufferedReader l() throws IOException {
        Reader readerM = m();
        return readerM instanceof BufferedReader ? (BufferedReader) readerM : new BufferedReader(readerM);
    }

    public abstract Reader m() throws IOException;

    public String n() throws IOException {
        o oVarB = o.b();
        try {
            String strK = l.k((Reader) oVarB.c(m()));
            oVarB.close();
            return strK;
        } catch (Throwable th2) {
            try {
                throw oVarB.d(th2);
            } catch (Throwable th3) {
                oVarB.close();
                throw th3;
            }
        }
    }

    @fj.a
    public String o() throws IOException {
        o oVarB = o.b();
        try {
            String line = ((BufferedReader) oVarB.c(l())).readLine();
            oVarB.close();
            return line;
        } catch (Throwable th2) {
            try {
                throw oVarB.d(th2);
            } catch (Throwable th3) {
                oVarB.close();
                throw th3;
            }
        }
    }

    public l6<String> p() throws IOException {
        o oVarB = o.b();
        try {
            BufferedReader bufferedReader = (BufferedReader) oVarB.c(l());
            ArrayList arrayListQ = x7.q();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    l6<String> l6VarW = l6.w(arrayListQ);
                    oVarB.close();
                    return l6VarW;
                }
                arrayListQ.add(line);
            }
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
    @f0
    public <T> T q(z<T> zVar) throws IOException {
        com.google.common.base.j0.E(zVar);
        o oVarB = o.b();
        try {
            T t10 = (T) l.h((Reader) oVarB.c(m()), zVar);
            oVarB.close();
            return t10;
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
