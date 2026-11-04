package org.apache.commons.io.input;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class b extends o {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Comparator<org.apache.commons.io.a> f336578i = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f336579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<org.apache.commons.io.a> f336580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private org.apache.commons.io.a f336581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int[] f336582d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f336583e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f336584f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f336585g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f336586h;

    static class a implements Comparator<org.apache.commons.io.a> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(org.apache.commons.io.a aVar, org.apache.commons.io.a aVar2) {
            int iD = aVar.d();
            int iD2 = aVar2.d();
            if (iD > iD2) {
                return -1;
            }
            return iD2 > iD ? 1 : 0;
        }
    }

    public b(InputStream inputStream) {
        this(inputStream, false, org.apache.commons.io.a.f336422d);
    }

    private org.apache.commons.io.a d() {
        for (org.apache.commons.io.a aVar : this.f336580b) {
            if (j(aVar)) {
                return aVar;
            }
        }
        return null;
    }

    private boolean j(org.apache.commons.io.a aVar) {
        for (int i10 = 0; i10 < aVar.d(); i10++) {
            if (aVar.a(i10) != this.f336582d[i10]) {
                return false;
            }
        }
        return true;
    }

    private int l() throws IOException {
        e();
        int i10 = this.f336584f;
        if (i10 >= this.f336583e) {
            return -1;
        }
        int[] iArr = this.f336582d;
        this.f336584f = i10 + 1;
        return iArr[i10];
    }

    public org.apache.commons.io.a e() throws IOException {
        if (this.f336582d == null) {
            this.f336583e = 0;
            this.f336582d = new int[this.f336580b.get(0).d()];
            int i10 = 0;
            while (true) {
                int[] iArr = this.f336582d;
                if (i10 >= iArr.length) {
                    break;
                }
                iArr[i10] = ((FilterInputStream) this).in.read();
                this.f336583e++;
                if (this.f336582d[i10] < 0) {
                    break;
                }
                i10++;
            }
            org.apache.commons.io.a aVarD = d();
            this.f336581c = aVarD;
            if (aVarD != null && !this.f336579a) {
                if (aVarD.d() < this.f336582d.length) {
                    this.f336584f = this.f336581c.d();
                } else {
                    this.f336583e = 0;
                }
            }
        }
        return this.f336581c;
    }

    public String f() throws IOException {
        e();
        org.apache.commons.io.a aVar = this.f336581c;
        if (aVar == null) {
            return null;
        }
        return aVar.c();
    }

    public boolean g() throws IOException {
        return e() != null;
    }

    public boolean h(org.apache.commons.io.a aVar) throws IOException {
        if (this.f336580b.contains(aVar)) {
            return this.f336581c != null && e().equals(aVar);
        }
        throw new IllegalArgumentException("Stream not configure to detect " + aVar);
    }

    @Override // org.apache.commons.io.input.o, java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i10) {
        try {
            this.f336585g = this.f336584f;
            this.f336586h = this.f336582d == null;
            ((FilterInputStream) this).in.mark(i10);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // org.apache.commons.io.input.o, java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int iL = l();
        return iL >= 0 ? iL : ((FilterInputStream) this).in.read();
    }

    @Override // org.apache.commons.io.input.o, java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        try {
            this.f336584f = this.f336585g;
            if (this.f336586h) {
                this.f336582d = null;
            }
            ((FilterInputStream) this).in.reset();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // org.apache.commons.io.input.o, java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) throws IOException {
        long j11;
        int i10 = 0;
        while (true) {
            j11 = i10;
            if (j10 <= j11 || l() < 0) {
                break;
            }
            i10++;
        }
        return ((FilterInputStream) this).in.skip(j10 - j11) + j11;
    }

    public b(InputStream inputStream, boolean z10) {
        this(inputStream, z10, org.apache.commons.io.a.f336422d);
    }

    public b(InputStream inputStream, org.apache.commons.io.a... aVarArr) {
        this(inputStream, false, aVarArr);
    }

    @Override // org.apache.commons.io.input.o, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int iL = 0;
        int i12 = 0;
        while (i11 > 0 && iL >= 0) {
            iL = l();
            if (iL >= 0) {
                bArr[i10] = (byte) (iL & 255);
                i11--;
                i12++;
                i10++;
            }
        }
        int i13 = ((FilterInputStream) this).in.read(bArr, i10, i11);
        if (i13 >= 0) {
            return i12 + i13;
        }
        if (i12 > 0) {
            return i12;
        }
        return -1;
    }

    public b(InputStream inputStream, boolean z10, org.apache.commons.io.a... aVarArr) {
        super(inputStream);
        if (aVarArr == null || aVarArr.length == 0) {
            throw new IllegalArgumentException("No BOMs specified");
        }
        this.f336579a = z10;
        Arrays.sort(aVarArr, f336578i);
        this.f336580b = Arrays.asList(aVarArr);
    }

    @Override // org.apache.commons.io.input.o, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }
}
