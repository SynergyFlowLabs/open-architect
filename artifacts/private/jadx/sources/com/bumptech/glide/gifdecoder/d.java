package com.bumptech.glide.gifdecoder;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f96076e = "GifHeaderParser";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f96077f = 255;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f96078g = 44;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f96079h = 33;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f96080i = 59;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f96081j = 249;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f96082k = 255;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f96083l = 254;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f96084m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f96085n = 28;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f96086o = 2;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f96087p = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f96088q = 128;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f96089r = 64;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f96090s = 7;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f96091t = 128;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f96092u = 7;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static final int f96093v = 2;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static final int f96094w = 10;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f96095x = 256;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ByteBuffer f96097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f96098c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f96096a = new byte[256];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f96099d = 0;

    private boolean b() {
        return this.f96098c.f96064b != 0;
    }

    private int e() {
        try {
            return this.f96097b.get() & 255;
        } catch (Exception unused) {
            this.f96098c.f96064b = 1;
            return 0;
        }
    }

    private void f() {
        this.f96098c.f96066d.f96050a = o();
        this.f96098c.f96066d.f96051b = o();
        this.f96098c.f96066d.f96052c = o();
        this.f96098c.f96066d.f96053d = o();
        int iE = e();
        int i10 = 4 | 1;
        boolean z10 = (iE & 128) != 0;
        int iPow = (int) Math.pow(2.0d, (iE & 7) + 1);
        b bVar = this.f96098c.f96066d;
        bVar.f96054e = (iE & 64) != 0;
        if (z10) {
            bVar.f96060k = h(iPow);
        } else {
            bVar.f96060k = null;
        }
        this.f96098c.f96066d.f96059j = this.f96097b.position();
        t();
        if (b()) {
            return;
        }
        c cVar = this.f96098c;
        cVar.f96065c++;
        cVar.f96067e.add(cVar.f96066d);
    }

    private void g() {
        int iE = e();
        this.f96099d = iE;
        if (iE <= 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            try {
                int i11 = this.f96099d;
                if (i10 >= i11) {
                    return;
                }
                int i12 = i11 - i10;
                this.f96097b.get(this.f96096a, i10, i12);
                i10 += i12;
            } catch (Exception unused) {
                this.f96098c.f96064b = 1;
                return;
            }
        }
    }

    @p0
    private int[] h(int i10) {
        byte[] bArr = new byte[i10 * 3];
        int[] iArr = null;
        try {
            this.f96097b.get(bArr);
            iArr = new int[256];
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10) {
                int i13 = bArr[i12] & 255;
                int i14 = i12 + 2;
                int i15 = bArr[i12 + 1] & 255;
                i12 += 3;
                int i16 = i11 + 1;
                iArr[i11] = (i15 << 8) | (i13 << 16) | (-16777216) | (bArr[i14] & 255);
                i11 = i16;
            }
            return iArr;
        } catch (BufferUnderflowException unused) {
            this.f96098c.f96064b = 1;
            return iArr;
        }
    }

    private void i() {
        j(Integer.MAX_VALUE);
    }

    private void j(int i10) {
        boolean z10 = false;
        while (!z10 && !b() && this.f96098c.f96065c <= i10) {
            int iE = e();
            if (iE == 33) {
                int iE2 = e();
                if (iE2 == 1) {
                    s();
                } else if (iE2 == 249) {
                    this.f96098c.f96066d = new b();
                    k();
                } else if (iE2 == 254) {
                    s();
                } else if (iE2 != 255) {
                    s();
                } else {
                    g();
                    StringBuilder sb2 = new StringBuilder();
                    for (int i11 = 0; i11 < 11; i11++) {
                        sb2.append((char) this.f96096a[i11]);
                    }
                    if (sb2.toString().equals("NETSCAPE2.0")) {
                        n();
                    } else {
                        s();
                    }
                }
            } else if (iE == 44) {
                c cVar = this.f96098c;
                if (cVar.f96066d == null) {
                    cVar.f96066d = new b();
                }
                f();
            } else if (iE != 59) {
                this.f96098c.f96064b = 1;
            } else {
                z10 = true;
            }
        }
    }

    private void k() {
        e();
        int iE = e();
        b bVar = this.f96098c.f96066d;
        int i10 = (iE & 28) >> 2;
        bVar.f96056g = i10;
        if (i10 == 0) {
            bVar.f96056g = 1;
        }
        bVar.f96055f = (iE & 1) != 0;
        int iO = o();
        if (iO < 2) {
            iO = 10;
        }
        b bVar2 = this.f96098c.f96066d;
        bVar2.f96058i = iO * 10;
        bVar2.f96057h = e();
        e();
    }

    private void l() {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < 6; i10++) {
            sb2.append((char) e());
        }
        if (!sb2.toString().startsWith("GIF")) {
            this.f96098c.f96064b = 1;
            return;
        }
        m();
        if (!this.f96098c.f96070h || b()) {
            return;
        }
        c cVar = this.f96098c;
        cVar.f96063a = h(cVar.f96071i);
        c cVar2 = this.f96098c;
        cVar2.f96074l = cVar2.f96063a[cVar2.f96072j];
    }

    private void m() {
        this.f96098c.f96068f = o();
        this.f96098c.f96069g = o();
        int iE = e();
        c cVar = this.f96098c;
        cVar.f96070h = (iE & 128) != 0;
        cVar.f96071i = (int) Math.pow(2.0d, (iE & 7) + 1);
        this.f96098c.f96072j = e();
        this.f96098c.f96073k = e();
    }

    private void n() {
        do {
            g();
            byte[] bArr = this.f96096a;
            if (bArr[0] == 1) {
                this.f96098c.f96075m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.f96099d <= 0) {
                return;
            }
        } while (!b());
    }

    private int o() {
        return this.f96097b.getShort();
    }

    private void p() {
        this.f96097b = null;
        Arrays.fill(this.f96096a, (byte) 0);
        this.f96098c = new c();
        this.f96099d = 0;
    }

    private void s() {
        int iE;
        do {
            iE = e();
            this.f96097b.position(Math.min(this.f96097b.position() + iE, this.f96097b.limit()));
        } while (iE > 0);
    }

    private void t() {
        e();
        s();
    }

    public void a() {
        this.f96097b = null;
        this.f96098c = null;
    }

    public boolean c() {
        l();
        if (!b()) {
            int i10 = 3 << 2;
            j(2);
        }
        return this.f96098c.f96065c > 1;
    }

    @NonNull
    public c d() {
        if (this.f96097b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (b()) {
            return this.f96098c;
        }
        l();
        if (!b()) {
            i();
            c cVar = this.f96098c;
            if (cVar.f96065c < 0) {
                cVar.f96064b = 1;
            }
        }
        return this.f96098c;
    }

    public d q(@NonNull ByteBuffer byteBuffer) {
        p();
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f96097b = byteBufferAsReadOnlyBuffer;
        byteBufferAsReadOnlyBuffer.position(0);
        this.f96097b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public d r(@p0 byte[] bArr) {
        if (bArr != null) {
            q(ByteBuffer.wrap(bArr));
            return this;
        }
        this.f96097b = null;
        this.f96098c.f96064b = 2;
        return this;
    }
}
