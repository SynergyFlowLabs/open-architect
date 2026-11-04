package com.google.gson.internal.bind;

import com.google.gson.r;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends com.google.gson.stream.a {
    private static final Reader D3 = new a();
    private static final Object E3 = new Object();
    private int A3;
    private String[] B3;
    private int[] C3;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    private Object[] f125344z3;

    class a extends Reader {
        a() {
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i10, int i11) {
            throw new AssertionError();
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f125345a;

        static {
            int[] iArr = new int[com.google.gson.stream.c.values().length];
            f125345a = iArr;
            try {
                iArr[com.google.gson.stream.c.NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f125345a[com.google.gson.stream.c.END_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f125345a[com.google.gson.stream.c.END_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f125345a[com.google.gson.stream.c.END_DOCUMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public g(com.google.gson.l lVar) {
        super(D3);
        this.f125344z3 = new Object[32];
        this.A3 = 0;
        this.B3 = new String[32];
        this.C3 = new int[32];
        y0(lVar);
    }

    private String g(boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('$');
        int i10 = 0;
        while (true) {
            int i11 = this.A3;
            if (i10 >= i11) {
                return sb2.toString();
            }
            Object[] objArr = this.f125344z3;
            Object obj = objArr[i10];
            if (obj instanceof com.google.gson.i) {
                i10++;
                if (i10 < i11 && (objArr[i10] instanceof Iterator)) {
                    int i12 = this.C3[i10];
                    if (z10 && i12 > 0 && (i10 == i11 - 1 || i10 == i11 - 2)) {
                        i12--;
                    }
                    sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
                    sb2.append(i12);
                    sb2.append(AbstractJsonLexerKt.END_LIST);
                }
            } else if ((obj instanceof com.google.gson.o) && (i10 = i10 + 1) < i11 && (objArr[i10] instanceof Iterator)) {
                sb2.append('.');
                String str = this.B3[i10];
                if (str != null) {
                    sb2.append(str);
                }
            }
            i10++;
        }
    }

    private void j0(com.google.gson.stream.c cVar) throws IOException {
        if (x() == cVar) {
            return;
        }
        throw new IllegalStateException("Expected " + cVar + " but was " + x() + o());
    }

    private String o() {
        return " at path " + S();
    }

    private String o0(boolean z10) throws IOException {
        j0(com.google.gson.stream.c.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) r0()).next();
        String str = (String) entry.getKey();
        this.B3[this.A3 - 1] = z10 ? "<skipped>" : str;
        y0(entry.getValue());
        return str;
    }

    private Object r0() {
        return this.f125344z3[this.A3 - 1];
    }

    @z7.a
    private Object w0() {
        Object[] objArr = this.f125344z3;
        int i10 = this.A3 - 1;
        this.A3 = i10;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    private void y0(Object obj) {
        int i10 = this.A3;
        Object[] objArr = this.f125344z3;
        if (i10 == objArr.length) {
            int i11 = i10 * 2;
            this.f125344z3 = Arrays.copyOf(objArr, i11);
            this.C3 = Arrays.copyOf(this.C3, i11);
            this.B3 = (String[]) Arrays.copyOf(this.B3, i11);
        }
        Object[] objArr2 = this.f125344z3;
        int i12 = this.A3;
        this.A3 = i12 + 1;
        objArr2[i12] = obj;
    }

    @Override // com.google.gson.stream.a
    public void F0() throws IOException {
        j0(com.google.gson.stream.c.END_ARRAY);
        w0();
        w0();
        int i10 = this.A3;
        if (i10 > 0) {
            int[] iArr = this.C3;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // com.google.gson.stream.a
    public void F1() throws IOException {
        j0(com.google.gson.stream.c.END_OBJECT);
        this.B3[this.A3 - 1] = null;
        w0();
        w0();
        int i10 = this.A3;
        if (i10 > 0) {
            int[] iArr = this.C3;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // com.google.gson.stream.a
    public void J0() throws IOException {
        j0(com.google.gson.stream.c.BEGIN_ARRAY);
        y0(((com.google.gson.i) r0()).iterator());
        this.C3[this.A3 - 1] = 0;
    }

    @Override // com.google.gson.stream.a
    public String S() {
        return g(false);
    }

    @Override // com.google.gson.stream.a
    public void a7() throws IOException {
        j0(com.google.gson.stream.c.NULL);
        w0();
        int i10 = this.A3;
        if (i10 > 0) {
            int[] iArr = this.C3;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // com.google.gson.stream.a
    public void a9() throws IOException {
        int i10 = b.f125345a[x().ordinal()];
        if (i10 == 1) {
            o0(true);
            return;
        }
        if (i10 == 2) {
            F0();
            return;
        }
        if (i10 == 3) {
            F1();
            return;
        }
        if (i10 != 4) {
            w0();
            int i11 = this.A3;
            if (i11 > 0) {
                int[] iArr = this.C3;
                int i12 = i11 - 1;
                iArr[i12] = iArr[i12] + 1;
            }
        }
    }

    @Override // com.google.gson.stream.a, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f125344z3 = new Object[]{E3};
        this.A3 = 1;
    }

    @Override // com.google.gson.stream.a
    public String h() {
        return g(true);
    }

    @Override // com.google.gson.stream.a
    public boolean hasNext() throws IOException {
        com.google.gson.stream.c cVarX = x();
        return (cVarX == com.google.gson.stream.c.END_OBJECT || cVarX == com.google.gson.stream.c.END_ARRAY || cVarX == com.google.gson.stream.c.END_DOCUMENT) ? false : true;
    }

    @Override // com.google.gson.stream.a
    public String jc() throws IOException {
        com.google.gson.stream.c cVarX = x();
        com.google.gson.stream.c cVar = com.google.gson.stream.c.STRING;
        if (cVarX == cVar || cVarX == com.google.gson.stream.c.NUMBER) {
            String strD = ((r) w0()).D();
            int i10 = this.A3;
            if (i10 > 0) {
                int[] iArr = this.C3;
                int i11 = i10 - 1;
                iArr[i11] = iArr[i11] + 1;
            }
            return strD;
        }
        throw new IllegalStateException("Expected " + cVar + " but was " + cVarX + o());
    }

    com.google.gson.l k0() throws IOException {
        com.google.gson.stream.c cVarX = x();
        if (cVarX != com.google.gson.stream.c.NAME && cVarX != com.google.gson.stream.c.END_ARRAY && cVarX != com.google.gson.stream.c.END_OBJECT && cVarX != com.google.gson.stream.c.END_DOCUMENT) {
            com.google.gson.l lVar = (com.google.gson.l) r0();
            a9();
            return lVar;
        }
        throw new IllegalStateException("Unexpected " + cVarX + " when reading a JsonElement.");
    }

    @Override // com.google.gson.stream.a
    public void m1() throws IOException {
        j0(com.google.gson.stream.c.BEGIN_OBJECT);
        y0(((com.google.gson.o) r0()).entrySet().iterator());
    }

    @Override // com.google.gson.stream.a
    public String na() throws IOException {
        return o0(false);
    }

    @Override // com.google.gson.stream.a
    public boolean nextBoolean() throws IOException {
        j0(com.google.gson.stream.c.BOOLEAN);
        boolean zL = ((r) w0()).l();
        int i10 = this.A3;
        if (i10 > 0) {
            int[] iArr = this.C3;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return zL;
    }

    @Override // com.google.gson.stream.a
    public double nextDouble() throws IOException {
        com.google.gson.stream.c cVarX = x();
        com.google.gson.stream.c cVar = com.google.gson.stream.c.NUMBER;
        if (cVarX != cVar && cVarX != com.google.gson.stream.c.STRING) {
            throw new IllegalStateException("Expected " + cVar + " but was " + cVarX + o());
        }
        double dP = ((r) r0()).p();
        if (!l() && (Double.isNaN(dP) || Double.isInfinite(dP))) {
            throw new com.google.gson.stream.e("JSON forbids NaN and infinities: " + dP);
        }
        w0();
        int i10 = this.A3;
        if (i10 > 0) {
            int[] iArr = this.C3;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return dP;
    }

    @Override // com.google.gson.stream.a
    public int nextInt() throws IOException {
        com.google.gson.stream.c cVarX = x();
        com.google.gson.stream.c cVar = com.google.gson.stream.c.NUMBER;
        if (cVarX != cVar && cVarX != com.google.gson.stream.c.STRING) {
            throw new IllegalStateException("Expected " + cVar + " but was " + cVarX + o());
        }
        int iS = ((r) r0()).s();
        w0();
        int i10 = this.A3;
        if (i10 > 0) {
            int[] iArr = this.C3;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return iS;
    }

    @Override // com.google.gson.stream.a
    public long nextLong() throws IOException {
        com.google.gson.stream.c cVarX = x();
        com.google.gson.stream.c cVar = com.google.gson.stream.c.NUMBER;
        if (cVarX != cVar && cVarX != com.google.gson.stream.c.STRING) {
            throw new IllegalStateException("Expected " + cVar + " but was " + cVarX + o());
        }
        long jA = ((r) r0()).A();
        w0();
        int i10 = this.A3;
        if (i10 > 0) {
            int[] iArr = this.C3;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return jA;
    }

    @Override // com.google.gson.stream.a
    public String toString() {
        return g.class.getSimpleName() + o();
    }

    @Override // com.google.gson.stream.a
    public com.google.gson.stream.c x() throws IOException {
        if (this.A3 == 0) {
            return com.google.gson.stream.c.END_DOCUMENT;
        }
        Object objR0 = r0();
        if (objR0 instanceof Iterator) {
            boolean z10 = this.f125344z3[this.A3 - 2] instanceof com.google.gson.o;
            Iterator it = (Iterator) objR0;
            if (!it.hasNext()) {
                return z10 ? com.google.gson.stream.c.END_OBJECT : com.google.gson.stream.c.END_ARRAY;
            }
            if (z10) {
                return com.google.gson.stream.c.NAME;
            }
            y0(it.next());
            return x();
        }
        if (objR0 instanceof com.google.gson.o) {
            return com.google.gson.stream.c.BEGIN_OBJECT;
        }
        if (objR0 instanceof com.google.gson.i) {
            return com.google.gson.stream.c.BEGIN_ARRAY;
        }
        if (objR0 instanceof r) {
            r rVar = (r) objR0;
            if (rVar.P()) {
                return com.google.gson.stream.c.STRING;
            }
            if (rVar.M()) {
                return com.google.gson.stream.c.BOOLEAN;
            }
            if (rVar.O()) {
                return com.google.gson.stream.c.NUMBER;
            }
            throw new AssertionError();
        }
        if (objR0 instanceof com.google.gson.n) {
            return com.google.gson.stream.c.NULL;
        }
        if (objR0 == E3) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw new com.google.gson.stream.e("Custom JsonElement subclass " + objR0.getClass().getName() + " is not supported");
    }

    public void x0() throws IOException {
        j0(com.google.gson.stream.c.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) r0()).next();
        y0(entry.getValue());
        y0(new r((String) entry.getKey()));
    }
}
