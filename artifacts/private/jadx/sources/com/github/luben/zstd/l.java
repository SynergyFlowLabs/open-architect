package com.github.luben.zstd;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f103039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ByteBuffer f103040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<Integer> f103041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f103042d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f103043e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f103044f;

    public l(int i10, int i11) {
        this(i10, i11, Zstd.defaultCompressionLevel());
    }

    private int[] b(List<Integer> list) {
        int[] iArr = new int[list.size()];
        Iterator<Integer> it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = it.next().intValue();
            i10++;
        }
        return iArr;
    }

    public synchronized boolean a(byte[] bArr) {
        if (this.f103043e + ((long) bArr.length) > this.f103039a) {
            return false;
        }
        this.f103040b.put(bArr);
        this.f103041c.add(Integer.valueOf(bArr.length));
        this.f103043e += (long) bArr.length;
        return true;
    }

    public byte[] c() throws o {
        return d(false);
    }

    public byte[] d(boolean z10) throws o {
        ByteBuffer byteBufferF = f(z10);
        byte[] bArr = new byte[byteBufferF.remaining()];
        byteBufferF.get(bArr);
        return bArr;
    }

    public ByteBuffer e() throws o {
        return f(false);
    }

    public synchronized ByteBuffer f(boolean z10) throws o {
        ByteBuffer byteBufferAllocateDirect;
        byteBufferAllocateDirect = ByteBuffer.allocateDirect(this.f103042d);
        long jY0 = Zstd.y0(this.f103040b, b(this.f103041c), byteBufferAllocateDirect, z10, this.f103044f);
        if (Zstd.isError(jY0)) {
            byteBufferAllocateDirect.limit(0);
            throw new o(jY0);
        }
        byteBufferAllocateDirect.limit(Long.valueOf(jY0).intValue());
        return byteBufferAllocateDirect;
    }

    public l(int i10, int i11, int i12) {
        this.f103040b = ByteBuffer.allocateDirect(i10);
        this.f103041c = new ArrayList();
        this.f103039a = i10;
        this.f103042d = i11;
        this.f103044f = i12;
    }
}
