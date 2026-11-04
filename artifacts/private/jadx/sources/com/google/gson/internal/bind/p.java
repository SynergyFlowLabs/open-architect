package com.google.gson.internal.bind;

import com.google.gson.internal.k0;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public final class p {
    public static final com.google.gson.b0<BigInteger> A;
    public static final com.google.gson.b0<com.google.gson.internal.b0> B;
    public static final com.google.gson.c0 C;
    public static final com.google.gson.b0<StringBuilder> D;
    public static final com.google.gson.c0 E;
    public static final com.google.gson.b0<StringBuffer> F;
    public static final com.google.gson.c0 G;
    public static final com.google.gson.b0<URL> H;
    public static final com.google.gson.c0 I;
    public static final com.google.gson.b0<URI> J;
    public static final com.google.gson.c0 K;
    public static final com.google.gson.b0<InetAddress> L;
    public static final com.google.gson.c0 M;
    public static final com.google.gson.b0<UUID> N;
    public static final com.google.gson.c0 O;
    public static final com.google.gson.b0<Currency> P;
    public static final com.google.gson.c0 Q;
    public static final com.google.gson.b0<Calendar> R;
    public static final com.google.gson.c0 S;
    public static final com.google.gson.b0<Locale> T;
    public static final com.google.gson.c0 U;
    public static final com.google.gson.b0<com.google.gson.l> V;
    public static final com.google.gson.c0 W;
    public static final com.google.gson.c0 X;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.google.gson.b0<Class> f125408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final com.google.gson.c0 f125409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final com.google.gson.b0<BitSet> f125410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final com.google.gson.c0 f125411d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final com.google.gson.b0<Boolean> f125412e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final com.google.gson.b0<Boolean> f125413f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final com.google.gson.c0 f125414g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final com.google.gson.b0<Number> f125415h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final com.google.gson.c0 f125416i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final com.google.gson.b0<Number> f125417j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final com.google.gson.c0 f125418k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final com.google.gson.b0<Number> f125419l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final com.google.gson.c0 f125420m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final com.google.gson.b0<AtomicInteger> f125421n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final com.google.gson.c0 f125422o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final com.google.gson.b0<AtomicBoolean> f125423p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final com.google.gson.c0 f125424q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final com.google.gson.b0<AtomicIntegerArray> f125425r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final com.google.gson.c0 f125426s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final com.google.gson.b0<Number> f125427t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final com.google.gson.b0<Number> f125428u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final com.google.gson.b0<Number> f125429v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final com.google.gson.b0<Character> f125430w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final com.google.gson.c0 f125431x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final com.google.gson.b0<String> f125432y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final com.google.gson.b0<BigDecimal> f125433z;

    class a extends com.google.gson.b0<AtomicIntegerArray> {
        a() {
        }

        @Override // com.google.gson.b0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AtomicIntegerArray read(com.google.gson.stream.a aVar) throws IOException {
            ArrayList arrayList = new ArrayList();
            aVar.J0();
            while (aVar.hasNext()) {
                try {
                    arrayList.add(Integer.valueOf(aVar.nextInt()));
                } catch (NumberFormatException e10) {
                    throw new com.google.gson.v(e10);
                }
            }
            aVar.F0();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i10 = 0; i10 < size; i10++) {
                atomicIntegerArray.set(i10, ((Integer) arrayList.get(i10)).intValue());
            }
            return atomicIntegerArray;
        }

        @Override // com.google.gson.b0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(com.google.gson.stream.d dVar, AtomicIntegerArray atomicIntegerArray) throws IOException {
            dVar.d();
            int length = atomicIntegerArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                dVar.k0(atomicIntegerArray.get(i10));
            }
            dVar.g();
        }
    }

    class a0 extends com.google.gson.b0<Boolean> {
        a0() {
        }

        @Override // com.google.gson.b0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean read(com.google.gson.stream.a aVar) throws IOException {
            com.google.gson.stream.c cVarX = aVar.x();
            if (cVarX != com.google.gson.stream.c.NULL) {
                return cVarX == com.google.gson.stream.c.STRING ? Boolean.valueOf(Boolean.parseBoolean(aVar.jc())) : Boolean.valueOf(aVar.nextBoolean());
            }
            aVar.a7();
            return null;
        }

        @Override // com.google.gson.b0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(com.google.gson.stream.d dVar, Boolean bool) throws IOException {
            dVar.o0(bool);
        }
    }

    class b extends com.google.gson.b0<Number> {
        b() {
        }

        @Override // com.google.gson.b0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Number read(com.google.gson.stream.a aVar) throws IOException {
            if (aVar.x() == com.google.gson.stream.c.NULL) {
                aVar.a7();
                return null;
            }
            try {
                return Long.valueOf(aVar.nextLong());
            } catch (NumberFormatException e10) {
                throw new com.google.gson.v(e10);
            }
        }

        @Override // com.google.gson.b0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(com.google.gson.stream.d dVar, Number number) throws IOException {
            if (number == null) {
                dVar.y();
            } else {
                dVar.k0(number.longValue());
            }
        }
    }

    class b0 extends com.google.gson.b0<Boolean> {
        b0() {
        }

        @Override // com.google.gson.b0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean read(com.google.gson.stream.a aVar) throws IOException {
            if (aVar.x() != com.google.gson.stream.c.NULL) {
                return Boolean.valueOf(aVar.jc());
            }
            aVar.a7();
            return null;
        }

        @Override // com.google.gson.b0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(com.google.gson.stream.d dVar, Boolean bool) throws IOException {
            dVar.w0(bool == null ? AbstractJsonLexerKt.NULL : bool.toString());
        }
    }

    class c extends com.google.gson.b0<Number> {
        c() {
        }

        @Override // com.google.gson.b0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Number read(com.google.gson.stream.a aVar) throws IOException {
            if (aVar.x() != com.google.gson.stream.c.NULL) {
                return Float.valueOf((float) aVar.nextDouble());
            }
            aVar.a7();
            return null;
        }

        @Override // com.google.gson.b0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(com.google.gson.stream.d dVar, Number number) throws IOException {
            if (number == null) {
                dVar.y();
                return;
            }
            if (!(number instanceof Float)) {
                number = Float.valueOf(number.floatValue());
            }
            dVar.r0(number);
        }
    }

    class c0 extends com.google.gson.b0<Number> {
        c0() {
        }

        @Override // com.google.gson.b0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Number read(com.google.gson.stream.a aVar) throws IOException {
            if (aVar.x() == com.google.gson.stream.c.NULL) {
                aVar.a7();
                return null;
            }
            try {
                int iNextInt = aVar.nextInt();
                if (iNextInt <= 255 && iNextInt >= -128) {
                    return Byte.valueOf((byte) iNextInt);
                }
                throw new com.google.gson.v("Lossy conversion from " + iNextInt + " to byte; at path " + aVar.h());
            } catch (NumberFormatException e10) {
                throw new com.google.gson.v(e10);
            }
        }

        @Override // com.google.gson.b0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(com.google.gson.stream.d dVar, Number number) throws IOException {
            if (number == null) {
                dVar.y();
            } else {
                dVar.k0(number.byteValue());
            }
        }
    }

    class d extends com.google.gson.b0<Number> {
        d() {
        }

        @Override // com.google.gson.b0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Number read(com.google.gson.stream.a aVar) throws IOException {
            if (aVar.x() != com.google.gson.stream.c.NULL) {
                return Double.valueOf(aVar.nextDouble());
            }
            aVar.a7();
            return null;
        }

        @Override // com.google.gson.b0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(com.google.gson.stream.d dVar, Number number) throws IOException {
            if (number == null) {
                dVar.y();
            } else {
                dVar.g0(number.doubleValue());
            }
        }
    }

    class d0 extends com.google.gson.b0<Number> {
        d0() {
        }

        @Override // com.google.gson.b0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Number read(com.google.gson.stream.a aVar) throws IOException {
            if (aVar.x() == com.google.gson.stream.c.NULL) {
                aVar.a7();
                return null;
            }
            try {
                int iNextInt = aVar.nextInt();
                if (iNextInt <= 65535 && iNextInt >= -32768) {
                    return Short.valueOf((short) iNextInt);
                }
                throw new com.google.gson.v("Lossy conversion from " + iNextInt + " to short; at path " + aVar.h());
            } catch (NumberFormatException e10) {
                throw new com.google.gson.v(e10);
            }
        }

        @Override // com.google.gson.b0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(com.google.gson.stream.d dVar, Number number) throws IOException {
            if (number == null) {
                dVar.y();
            } else {
                dVar.k0(number.shortValue());
            }
        }
    }

    class e extends com.google.gson.b0<Character> {
        e() {
        }

        @Override // com.google.gson.b0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Character read(com.google.gson.stream.a aVar) throws IOException {
            if (aVar.x() == com.google.gson.stream.c.NULL) {
                aVar.a7();
                return null;
            }
            String strJc = aVar.jc();
            if (strJc.length() == 1) {
                return Character.valueOf(strJc.charAt(0));
            }
            throw new com.google.gson.v("Expecting character, got: " + strJc + "; at " + aVar.h());
        }

        @Override // com.google.gson.b0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(com.google.gson.stream.d dVar, Character ch2) throws IOException {
            dVar.w0(ch2 == null ? null : String.valueOf(ch2));
        }
    }

    class e0 extends com.google.gson.b0<Number> {
        e0() {
        }

        @Override // com.google.gson.b0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Number read(com.google.gson.stream.a aVar) throws IOException {
            if (aVar.x() == com.google.gson.stream.c.NULL) {
                aVar.a7();
                return null;
            }
            try {
                return Integer.valueOf(aVar.nextInt());
            } catch (NumberFormatException e10) {
                throw new com.google.gson.v(e10);
            }
        }

        @Override // com.google.gson.b0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(com.google.gson.stream.d dVar, Number number) throws IOException {
            if (number == null) {
                dVar.y();
            } else {
                dVar.k0(number.intValue());
            }
        }
    }

    class f extends com.google.gson.b0<String> {
        f() {
        }

        @Override // com.google.gson.b0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String read(com.google.gson.stream.a aVar) throws IOException {
            com.google.gson.stream.c cVarX = aVar.x();
            if (cVarX != com.google.gson.stream.c.NULL) {
                return cVarX == com.google.gson.stream.c.BOOLEAN ? Boolean.toString(aVar.nextBoolean()) : aVar.jc();
            }
            aVar.a7();
            return null;
        }

        @Override // com.google.gson.b0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(com.google.gson.stream.d dVar, String str) throws IOException {
            dVar.w0(str);
        }
    }

    class f0 extends com.google.gson.b0<AtomicInteger> {
        f0() {
        }

        @Override // com.google.gson.b0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AtomicInteger read(com.google.gson.stream.a aVar) throws IOException {
            try {
                return new AtomicInteger(aVar.nextInt());
            } catch (NumberFormatException e10) {
                throw new com.google.gson.v(e10);
            }
        }

        @Override // com.google.gson.b0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(com.google.gson.stream.d dVar, AtomicInteger atomicInteger) throws IOException {
            dVar.k0(atomicInteger.get());
        }
    }

    class g extends com.google.gson.b0<BigDecimal> {
        g() {
        }

        @Override // com.google.gson.b0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BigDecimal read(com.google.gson.stream.a aVar) throws IOException {
            if (aVar.x() == com.google.gson.stream.c.NULL) {
                aVar.a7();
                return null;
            }
            String strJc = aVar.jc();
            try {
                return com.google.gson.internal.e0.b(strJc);
            } catch (NumberFormatException e10) {
                throw new com.google.gson.v("Failed parsing '" + strJc + "' as BigDecimal; at path " + aVar.h(), e10);
            }
        }

        @Override // com.google.gson.b0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(com.google.gson.stream.d dVar, BigDecimal bigDecimal) throws IOException {
            dVar.r0(bigDecimal);
        }
    }

    class g0 extends com.google.gson.b0<AtomicBoolean> {
        g0() {
        }

        @Override // com.google.gson.b0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AtomicBoolean read(com.google.gson.stream.a aVar) throws IOException {
            return new AtomicBoolean(aVar.nextBoolean());
        }

        @Override // com.google.gson.b0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(com.google.gson.stream.d dVar, AtomicBoolean atomicBoolean) throws IOException {
            dVar.x0(atomicBoolean.get());
        }
    }

    class h extends com.google.gson.b0<BigInteger> {
        h() {
        }

        @Override // com.google.gson.b0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BigInteger read(com.google.gson.stream.a aVar) throws IOException {
            if (aVar.x() == com.google.gson.stream.c.NULL) {
                aVar.a7();
                return null;
            }
            String strJc = aVar.jc();
            try {
                return com.google.gson.internal.e0.c(strJc);
            } catch (NumberFormatException e10) {
                throw new com.google.gson.v("Failed parsing '" + strJc + "' as BigInteger; at path " + aVar.h(), e10);
            }
        }

        @Override // com.google.gson.b0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(com.google.gson.stream.d dVar, BigInteger bigInteger) throws IOException {
            dVar.r0(bigInteger);
        }
    }

    class i extends com.google.gson.b0<com.google.gson.internal.b0> {
        i() {
        }

        @Override // com.google.gson.b0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.google.gson.internal.b0 read(com.google.gson.stream.a aVar) throws IOException {
            if (aVar.x() != com.google.gson.stream.c.NULL) {
                return new com.google.gson.internal.b0(aVar.jc());
            }
            aVar.a7();
            return null;
        }

        @Override // com.google.gson.b0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(com.google.gson.stream.d dVar, com.google.gson.internal.b0 b0Var) throws IOException {
            dVar.r0(b0Var);
        }
    }

    class j extends com.google.gson.b0<StringBuilder> {
        j() {
        }

        @Override // com.google.gson.b0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public StringBuilder read(com.google.gson.stream.a aVar) throws IOException {
            if (aVar.x() != com.google.gson.stream.c.NULL) {
                return new StringBuilder(aVar.jc());
            }
            aVar.a7();
            return null;
        }

        @Override // com.google.gson.b0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(com.google.gson.stream.d dVar, StringBuilder sb2) throws IOException {
            dVar.w0(sb2 == null ? null : sb2.toString());
        }
    }

    class k extends com.google.gson.b0<Class> {
        k() {
        }

        @Override // com.google.gson.b0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Class read(com.google.gson.stream.a aVar) throws IOException {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?\nSee " + k0.a("java-lang-class-unsupported"));
        }

        @Override // com.google.gson.b0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(com.google.gson.stream.d dVar, Class cls) throws IOException {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?\nSee " + k0.a("java-lang-class-unsupported"));
        }
    }

    class l extends com.google.gson.b0<StringBuffer> {
        l() {
        }

        @Override // com.google.gson.b0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public StringBuffer read(com.google.gson.stream.a aVar) throws IOException {
            if (aVar.x() != com.google.gson.stream.c.NULL) {
                return new StringBuffer(aVar.jc());
            }
            aVar.a7();
            return null;
        }

        @Override // com.google.gson.b0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(com.google.gson.stream.d dVar, StringBuffer stringBuffer) throws IOException {
            dVar.w0(stringBuffer == null ? null : stringBuffer.toString());
        }
    }

    class m extends com.google.gson.b0<URL> {
        m() {
        }

        @Override // com.google.gson.b0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public URL read(com.google.gson.stream.a aVar) throws IOException {
            if (aVar.x() == com.google.gson.stream.c.NULL) {
                aVar.a7();
                return null;
            }
            String strJc = aVar.jc();
            if (strJc.equals(AbstractJsonLexerKt.NULL)) {
                return null;
            }
            return new URL(strJc);
        }

        @Override // com.google.gson.b0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(com.google.gson.stream.d dVar, URL url) throws IOException {
            dVar.w0(url == null ? null : url.toExternalForm());
        }
    }

    class n extends com.google.gson.b0<URI> {
        n() {
        }

        @Override // com.google.gson.b0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public URI read(com.google.gson.stream.a aVar) throws IOException {
            if (aVar.x() == com.google.gson.stream.c.NULL) {
                aVar.a7();
                return null;
            }
            try {
                String strJc = aVar.jc();
                if (strJc.equals(AbstractJsonLexerKt.NULL)) {
                    return null;
                }
                return new URI(strJc);
            } catch (URISyntaxException e10) {
                throw new com.google.gson.m(e10);
            }
        }

        @Override // com.google.gson.b0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(com.google.gson.stream.d dVar, URI uri) throws IOException {
            dVar.w0(uri == null ? null : uri.toASCIIString());
        }
    }

    class o extends com.google.gson.b0<InetAddress> {
        o() {
        }

        @Override // com.google.gson.b0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InetAddress read(com.google.gson.stream.a aVar) throws IOException {
            if (aVar.x() != com.google.gson.stream.c.NULL) {
                return InetAddress.getByName(aVar.jc());
            }
            aVar.a7();
            return null;
        }

        @Override // com.google.gson.b0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(com.google.gson.stream.d dVar, InetAddress inetAddress) throws IOException {
            dVar.w0(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.p$p, reason: collision with other inner class name */
    class C1198p extends com.google.gson.b0<UUID> {
        C1198p() {
        }

        @Override // com.google.gson.b0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public UUID read(com.google.gson.stream.a aVar) throws IOException {
            if (aVar.x() == com.google.gson.stream.c.NULL) {
                aVar.a7();
                return null;
            }
            String strJc = aVar.jc();
            try {
                return UUID.fromString(strJc);
            } catch (IllegalArgumentException e10) {
                throw new com.google.gson.v("Failed parsing '" + strJc + "' as UUID; at path " + aVar.h(), e10);
            }
        }

        @Override // com.google.gson.b0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(com.google.gson.stream.d dVar, UUID uuid) throws IOException {
            dVar.w0(uuid == null ? null : uuid.toString());
        }
    }

    class q extends com.google.gson.b0<Currency> {
        q() {
        }

        @Override // com.google.gson.b0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Currency read(com.google.gson.stream.a aVar) throws IOException {
            String strJc = aVar.jc();
            try {
                return Currency.getInstance(strJc);
            } catch (IllegalArgumentException e10) {
                throw new com.google.gson.v("Failed parsing '" + strJc + "' as Currency; at path " + aVar.h(), e10);
            }
        }

        @Override // com.google.gson.b0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(com.google.gson.stream.d dVar, Currency currency) throws IOException {
            dVar.w0(currency.getCurrencyCode());
        }
    }

    class r extends com.google.gson.b0<Calendar> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final String f125434a = "year";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String f125435b = "month";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f125436c = "dayOfMonth";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final String f125437d = "hourOfDay";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f125438e = "minute";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f125439f = "second";

        r() {
        }

        @Override // com.google.gson.b0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Calendar read(com.google.gson.stream.a aVar) throws IOException {
            if (aVar.x() == com.google.gson.stream.c.NULL) {
                aVar.a7();
                return null;
            }
            aVar.m1();
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (aVar.x() != com.google.gson.stream.c.END_OBJECT) {
                String strNa = aVar.na();
                int iNextInt = aVar.nextInt();
                strNa.getClass();
                int i16 = 0 | (-1);
                switch (strNa) {
                    case "dayOfMonth":
                        i12 = iNextInt;
                        break;
                    case "minute":
                        i14 = iNextInt;
                        break;
                    case "second":
                        i15 = iNextInt;
                        break;
                    case "year":
                        i10 = iNextInt;
                        break;
                    case "month":
                        i11 = iNextInt;
                        break;
                    case "hourOfDay":
                        i13 = iNextInt;
                        break;
                }
            }
            aVar.F1();
            return new GregorianCalendar(i10, i11, i12, i13, i14, i15);
        }

        @Override // com.google.gson.b0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(com.google.gson.stream.d dVar, Calendar calendar) throws IOException {
            if (calendar == null) {
                dVar.y();
                return;
            }
            dVar.e();
            dVar.t(f125434a);
            dVar.k0(calendar.get(1));
            dVar.t(f125435b);
            dVar.k0(calendar.get(2));
            dVar.t(f125436c);
            dVar.k0(calendar.get(5));
            dVar.t(f125437d);
            dVar.k0(calendar.get(11));
            dVar.t(f125438e);
            dVar.k0(calendar.get(12));
            dVar.t(f125439f);
            dVar.k0(calendar.get(13));
            dVar.h();
        }
    }

    class s extends com.google.gson.b0<Locale> {
        s() {
        }

        @Override // com.google.gson.b0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Locale read(com.google.gson.stream.a aVar) throws IOException {
            if (aVar.x() == com.google.gson.stream.c.NULL) {
                aVar.a7();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(aVar.jc(), "_");
            String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            if (strNextToken2 == null && strNextToken3 == null) {
                return new Locale(strNextToken);
            }
            return strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
        }

        @Override // com.google.gson.b0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(com.google.gson.stream.d dVar, Locale locale) throws IOException {
            dVar.w0(locale == null ? null : locale.toString());
        }
    }

    class t implements com.google.gson.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.gson.reflect.a f125440a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.google.gson.b0 f125441b;

        t(com.google.gson.reflect.a aVar, com.google.gson.b0 b0Var) {
            this.f125440a = aVar;
            this.f125441b = b0Var;
        }

        @Override // com.google.gson.c0
        public <T> com.google.gson.b0<T> create(com.google.gson.f fVar, com.google.gson.reflect.a<T> aVar) {
            if (aVar.equals(this.f125440a)) {
                return this.f125441b;
            }
            return null;
        }
    }

    class u implements com.google.gson.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Class f125442a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.google.gson.b0 f125443b;

        u(Class cls, com.google.gson.b0 b0Var) {
            this.f125442a = cls;
            this.f125443b = b0Var;
        }

        @Override // com.google.gson.c0
        public <T> com.google.gson.b0<T> create(com.google.gson.f fVar, com.google.gson.reflect.a<T> aVar) {
            if (aVar.getRawType() == this.f125442a) {
                return this.f125443b;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f125442a.getName() + ",adapter=" + this.f125443b + "]";
        }
    }

    class v extends com.google.gson.b0<BitSet> {
        v() {
        }

        @Override // com.google.gson.b0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BitSet read(com.google.gson.stream.a aVar) throws IOException {
            BitSet bitSet = new BitSet();
            aVar.J0();
            com.google.gson.stream.c cVarX = aVar.x();
            int i10 = 0;
            while (cVarX != com.google.gson.stream.c.END_ARRAY) {
                int i11 = z.f125454a[cVarX.ordinal()];
                boolean zNextBoolean = true;
                if (i11 == 1 || i11 == 2) {
                    int iNextInt = aVar.nextInt();
                    if (iNextInt == 0) {
                        zNextBoolean = false;
                    } else if (iNextInt != 1) {
                        throw new com.google.gson.v("Invalid bitset value " + iNextInt + ", expected 0 or 1; at path " + aVar.h());
                    }
                } else {
                    if (i11 != 3) {
                        throw new com.google.gson.v("Invalid bitset value type: " + cVarX + "; at path " + aVar.S());
                    }
                    zNextBoolean = aVar.nextBoolean();
                }
                if (zNextBoolean) {
                    bitSet.set(i10);
                }
                i10++;
                cVarX = aVar.x();
            }
            aVar.F0();
            return bitSet;
        }

        @Override // com.google.gson.b0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(com.google.gson.stream.d dVar, BitSet bitSet) throws IOException {
            dVar.d();
            int length = bitSet.length();
            for (int i10 = 0; i10 < length; i10++) {
                dVar.k0(bitSet.get(i10) ? 1L : 0L);
            }
            dVar.g();
        }
    }

    class w implements com.google.gson.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Class f125444a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f125445b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.google.gson.b0 f125446c;

        w(Class cls, Class cls2, com.google.gson.b0 b0Var) {
            this.f125444a = cls;
            this.f125445b = cls2;
            this.f125446c = b0Var;
        }

        @Override // com.google.gson.c0
        public <T> com.google.gson.b0<T> create(com.google.gson.f fVar, com.google.gson.reflect.a<T> aVar) {
            Class<? super T> rawType = aVar.getRawType();
            if (rawType != this.f125444a && rawType != this.f125445b) {
                return null;
            }
            return this.f125446c;
        }

        public String toString() {
            return "Factory[type=" + this.f125445b.getName() + org.slf4j.h.f339615a3 + this.f125444a.getName() + ",adapter=" + this.f125446c + "]";
        }
    }

    class x implements com.google.gson.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Class f125447a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f125448b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.google.gson.b0 f125449c;

        x(Class cls, Class cls2, com.google.gson.b0 b0Var) {
            this.f125447a = cls;
            this.f125448b = cls2;
            this.f125449c = b0Var;
        }

        @Override // com.google.gson.c0
        public <T> com.google.gson.b0<T> create(com.google.gson.f fVar, com.google.gson.reflect.a<T> aVar) {
            Class<? super T> rawType = aVar.getRawType();
            if (rawType == this.f125447a || rawType == this.f125448b) {
                return this.f125449c;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f125447a.getName() + org.slf4j.h.f339615a3 + this.f125448b.getName() + ",adapter=" + this.f125449c + "]";
        }
    }

    class y implements com.google.gson.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Class f125450a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.google.gson.b0 f125451b;

        /* JADX INFO: Add missing generic type declarations: [T1] */
        class a<T1> extends com.google.gson.b0<T1> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Class f125452a;

            a(Class cls) {
                this.f125452a = cls;
            }

            @Override // com.google.gson.b0
            public T1 read(com.google.gson.stream.a aVar) throws IOException {
                T1 t10 = (T1) y.this.f125451b.read(aVar);
                if (t10 != null && !this.f125452a.isInstance(t10)) {
                    throw new com.google.gson.v("Expected a " + this.f125452a.getName() + " but was " + t10.getClass().getName() + "; at path " + aVar.h());
                }
                return t10;
            }

            @Override // com.google.gson.b0
            public void write(com.google.gson.stream.d dVar, T1 t10) throws IOException {
                y.this.f125451b.write(dVar, t10);
            }
        }

        y(Class cls, com.google.gson.b0 b0Var) {
            this.f125450a = cls;
            this.f125451b = b0Var;
        }

        @Override // com.google.gson.c0
        public <T2> com.google.gson.b0<T2> create(com.google.gson.f fVar, com.google.gson.reflect.a<T2> aVar) {
            Class<? super T2> rawType = aVar.getRawType();
            if (this.f125450a.isAssignableFrom(rawType)) {
                return new a(rawType);
            }
            return null;
        }

        public String toString() {
            return "Factory[typeHierarchy=" + this.f125450a.getName() + ",adapter=" + this.f125451b + "]";
        }
    }

    static /* synthetic */ class z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f125454a;

        static {
            int[] iArr = new int[com.google.gson.stream.c.values().length];
            f125454a = iArr;
            try {
                iArr[com.google.gson.stream.c.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f125454a[com.google.gson.stream.c.STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f125454a[com.google.gson.stream.c.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        com.google.gson.b0<Class> b0VarNullSafe = new k().nullSafe();
        f125408a = b0VarNullSafe;
        f125409b = b(Class.class, b0VarNullSafe);
        com.google.gson.b0<BitSet> b0VarNullSafe2 = new v().nullSafe();
        f125410c = b0VarNullSafe2;
        f125411d = b(BitSet.class, b0VarNullSafe2);
        a0 a0Var = new a0();
        f125412e = a0Var;
        f125413f = new b0();
        f125414g = c(Boolean.TYPE, Boolean.class, a0Var);
        c0 c0Var = new c0();
        f125415h = c0Var;
        f125416i = c(Byte.TYPE, Byte.class, c0Var);
        d0 d0Var = new d0();
        f125417j = d0Var;
        f125418k = c(Short.TYPE, Short.class, d0Var);
        e0 e0Var = new e0();
        f125419l = e0Var;
        f125420m = c(Integer.TYPE, Integer.class, e0Var);
        com.google.gson.b0<AtomicInteger> b0VarNullSafe3 = new f0().nullSafe();
        f125421n = b0VarNullSafe3;
        f125422o = b(AtomicInteger.class, b0VarNullSafe3);
        com.google.gson.b0<AtomicBoolean> b0VarNullSafe4 = new g0().nullSafe();
        f125423p = b0VarNullSafe4;
        f125424q = b(AtomicBoolean.class, b0VarNullSafe4);
        com.google.gson.b0<AtomicIntegerArray> b0VarNullSafe5 = new a().nullSafe();
        f125425r = b0VarNullSafe5;
        f125426s = b(AtomicIntegerArray.class, b0VarNullSafe5);
        f125427t = new b();
        f125428u = new c();
        f125429v = new d();
        e eVar = new e();
        f125430w = eVar;
        f125431x = c(Character.TYPE, Character.class, eVar);
        f fVar = new f();
        f125432y = fVar;
        f125433z = new g();
        A = new h();
        B = new i();
        C = b(String.class, fVar);
        j jVar = new j();
        D = jVar;
        E = b(StringBuilder.class, jVar);
        l lVar = new l();
        F = lVar;
        G = b(StringBuffer.class, lVar);
        m mVar = new m();
        H = mVar;
        I = b(URL.class, mVar);
        n nVar = new n();
        J = nVar;
        K = b(URI.class, nVar);
        o oVar = new o();
        L = oVar;
        M = e(InetAddress.class, oVar);
        C1198p c1198p = new C1198p();
        N = c1198p;
        O = b(UUID.class, c1198p);
        com.google.gson.b0<Currency> b0VarNullSafe6 = new q().nullSafe();
        P = b0VarNullSafe6;
        Q = b(Currency.class, b0VarNullSafe6);
        r rVar = new r();
        R = rVar;
        S = d(Calendar.class, GregorianCalendar.class, rVar);
        s sVar = new s();
        T = sVar;
        U = b(Locale.class, sVar);
        com.google.gson.internal.bind.f fVar2 = com.google.gson.internal.bind.f.f125342a;
        V = fVar2;
        W = e(com.google.gson.l.class, fVar2);
        X = com.google.gson.internal.bind.d.f125334d;
    }

    private p() {
        throw new UnsupportedOperationException();
    }

    public static <TT> com.google.gson.c0 a(com.google.gson.reflect.a<TT> aVar, com.google.gson.b0<TT> b0Var) {
        return new t(aVar, b0Var);
    }

    public static <TT> com.google.gson.c0 b(Class<TT> cls, com.google.gson.b0<TT> b0Var) {
        return new u(cls, b0Var);
    }

    public static <TT> com.google.gson.c0 c(Class<TT> cls, Class<TT> cls2, com.google.gson.b0<? super TT> b0Var) {
        return new w(cls, cls2, b0Var);
    }

    public static <TT> com.google.gson.c0 d(Class<TT> cls, Class<? extends TT> cls2, com.google.gson.b0<? super TT> b0Var) {
        return new x(cls, cls2, b0Var);
    }

    public static <T1> com.google.gson.c0 e(Class<T1> cls, com.google.gson.b0<T1> b0Var) {
        return new y(cls, b0Var);
    }
}
