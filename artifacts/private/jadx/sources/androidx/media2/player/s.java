package androidx.media2.player;

import android.os.Handler;
import android.os.Looper;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.d0;
import androidx.media2.exoplayer.external.util.x;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
@e.a({"RestrictedApi"})
class s extends androidx.media2.exoplayer.external.b {
    public static final int H1 = 0;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    public static final int f58432g3 = 2;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    public static final int f58433h3 = -1;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private static final int f58434i3 = 110000;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private static final int f58435j3 = 3;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private static final int f58436k3 = -1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public static final int f58437p2 = 1;
    private boolean X;
    private boolean Y;
    private boolean[] Z;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final c f58438j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Handler f58439k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final x f58440l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final SortedMap<Long, byte[]> f58441m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final d0 f58442n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.text.i f58443o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private int f58444p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private int f58445p1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final b f58446s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final b f58447t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final int[] f58448v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final x f58449w;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f58450a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f58451b;

        a(int i10, int i11) {
            this.f58450a = i10;
            this.f58451b = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            s.this.f58438j.g(this.f58450a, this.f58451b);
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte[] f58453a = new byte[3];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f58454b;

        b() {
        }

        public void a(byte b10, byte b11) {
            int i10 = this.f58454b + 2;
            byte[] bArr = this.f58453a;
            if (i10 > bArr.length) {
                this.f58453a = Arrays.copyOf(bArr, bArr.length * 2);
            }
            byte[] bArr2 = this.f58453a;
            int i11 = this.f58454b;
            int i12 = i11 + 1;
            this.f58454b = i12;
            bArr2[i11] = b10;
            this.f58454b = i11 + 2;
            bArr2[i12] = b11;
        }

        public void b(byte b10, byte b11, byte b12) {
            int i10 = this.f58454b + 3;
            byte[] bArr = this.f58453a;
            if (i10 > bArr.length) {
                this.f58453a = Arrays.copyOf(bArr, bArr.length * 2);
            }
            byte[] bArr2 = this.f58453a;
            int i11 = this.f58454b;
            int i12 = i11 + 1;
            this.f58454b = i12;
            bArr2[i11] = b10;
            int i13 = i11 + 2;
            this.f58454b = i13;
            bArr2[i12] = b11;
            this.f58454b = i11 + 3;
            bArr2[i13] = b12;
        }

        public void c() {
            this.f58454b = 0;
        }

        public boolean d() {
            if (this.f58454b <= 0) {
                return false;
            }
            int i10 = 5 | 1;
            return true;
        }
    }

    public interface c {
        void b(byte[] bArr, long j10);

        void g(int i10, int i11);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    s(c cVar) {
        super(3);
        this.f58438j = cVar;
        this.f58439k = new Handler(Looper.myLooper());
        this.f58440l = new x();
        this.f58441m = new TreeMap();
        this.f58442n = new d0();
        this.f58443o = new androidx.media2.exoplayer.external.text.i();
        this.f58446s = new b();
        this.f58447t = new b();
        this.f58448v = new int[2];
        this.f58449w = new x();
        this.f58444p0 = -1;
        this.f58445p1 = -1;
    }

    private void L(long j10) {
        if (this.f58444p0 != -1 && this.f58445p1 != -1) {
            byte[] bArrCopyOf = new byte[0];
            long j11 = -9223372036854775807L;
            while (!this.f58441m.isEmpty()) {
                Long lFirstKey = this.f58441m.firstKey();
                long jLongValue = lFirstKey.longValue();
                if (j10 < jLongValue) {
                    break;
                }
                byte[] bArr = (byte[]) androidx.core.util.t.l(this.f58441m.get(lFirstKey));
                int length = bArrCopyOf.length;
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArr.length + length);
                System.arraycopy(bArr, 0, bArrCopyOf, length, bArr.length);
                SortedMap<Long, byte[]> sortedMap = this.f58441m;
                sortedMap.remove(sortedMap.firstKey());
                j11 = jLongValue;
            }
            if (bArrCopyOf.length > 0) {
                this.f58438j.b(bArrCopyOf, j11);
            }
        }
    }

    private void M() {
        this.f58441m.clear();
        this.f58446s.c();
        this.f58447t.c();
        this.Y = false;
        this.X = false;
    }

    private void N(b bVar, long j10) {
        this.f58449w.O(bVar.f58453a, bVar.f58454b);
        bVar.c();
        int iD = this.f58449w.D() & 31;
        if (iD == 0) {
            iD = 64;
        }
        if (this.f58449w.d() == iD * 2) {
            while (this.f58449w.a() >= 2) {
                int iD2 = this.f58449w.D();
                int iD3 = (iD2 & 224) >> 5;
                int i10 = iD2 & 31;
                if ((iD3 == 7 && (iD3 = this.f58449w.D() & 63) < 7) || this.f58449w.a() < i10) {
                    break;
                    break;
                }
                if (i10 > 0) {
                    P(1, iD3);
                    if (this.f58444p0 == 1 && this.f58445p1 == iD3) {
                        byte[] bArr = new byte[i10];
                        this.f58449w.i(bArr, 0, i10);
                        this.f58441m.put(Long.valueOf(j10), bArr);
                    } else {
                        this.f58449w.R(i10);
                    }
                }
            }
        }
    }

    private void O(b bVar, long j10) {
        this.f58441m.put(Long.valueOf(j10), Arrays.copyOf(bVar.f58453a, bVar.f58454b));
        bVar.c();
    }

    private void P(int i10, int i11) {
        int i12 = (i10 << 6) + i11;
        boolean[] zArr = this.Z;
        if (zArr[i12]) {
            return;
        }
        zArr[i12] = true;
        this.f58439k.post(new a(i10, i11));
    }

    @Override // androidx.media2.exoplayer.external.b
    protected synchronized void C(long j10, boolean z10) {
        try {
            M();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // androidx.media2.exoplayer.external.b
    protected void G(Format[] formatArr, long j10) throws androidx.media2.exoplayer.external.i {
        super.G(formatArr, j10);
        this.Z = new boolean[128];
    }

    public synchronized void K() {
        try {
            Q(-1, -1);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void Q(int i10, int i11) {
        this.f58444p0 = i10;
        this.f58445p1 = i11;
        M();
    }

    @Override // androidx.media2.exoplayer.external.t0
    public boolean a() {
        if (!this.Y || !this.f58441m.isEmpty()) {
            return false;
        }
        int i10 = 4 ^ 1;
        return true;
    }

    @Override // androidx.media2.exoplayer.external.u0
    public int b(Format format) {
        String str = format.f53103i;
        return ("application/cea-608".equals(str) || "application/cea-708".equals(str) || "text/vtt".equals(str)) ? 4 : 0;
    }

    @Override // androidx.media2.exoplayer.external.t0
    public synchronized void g(long j10, long j11) {
        try {
            if (getState() != 2) {
                return;
            }
            L(j10);
            if (!this.X) {
                this.f58443o.o();
                int iH = H(this.f58442n, this.f58443o, false);
                if (iH != -3 && iH != -5) {
                    if (this.f58443o.t()) {
                        this.Y = true;
                        return;
                    } else {
                        this.X = true;
                        this.f58443o.D();
                    }
                }
                return;
            }
            androidx.media2.exoplayer.external.text.i iVar = this.f58443o;
            if (iVar.f53790d - j10 > 110000) {
                return;
            }
            this.X = false;
            this.f58440l.O(iVar.f53789c.array(), this.f58443o.f53789c.limit());
            this.f58446s.c();
            while (this.f58440l.a() >= 3) {
                byte bD = (byte) this.f58440l.D();
                byte bD2 = (byte) this.f58440l.D();
                byte bD3 = (byte) this.f58440l.D();
                int i10 = bD & 3;
                if ((bD & 4) != 0) {
                    if (i10 == 3) {
                        if (this.f58447t.d()) {
                            N(this.f58447t, this.f58443o.f53790d);
                        }
                        this.f58447t.a(bD2, bD3);
                    } else {
                        b bVar = this.f58447t;
                        if (bVar.f58454b > 0 && i10 == 2) {
                            bVar.a(bD2, bD3);
                        } else if (i10 == 0 || i10 == 1) {
                            byte b10 = (byte) (bD2 & 127);
                            byte b11 = (byte) (bD3 & 127);
                            if (b10 >= 16 || b11 >= 16) {
                                if (b10 >= 16 && b10 <= 31) {
                                    int i11 = (b10 >= 24 ? 1 : 0) + (bD != 0 ? 2 : 0);
                                    this.f58448v[i10] = i11;
                                    P(0, i11);
                                }
                                if (this.f58444p0 == 0 && this.f58445p1 == this.f58448v[i10]) {
                                    this.f58446s.b((byte) i10, b10, b11);
                                }
                            }
                        }
                    }
                } else if (i10 == 3 || i10 == 2) {
                    if (this.f58447t.d()) {
                        N(this.f58447t, this.f58443o.f53790d);
                    }
                }
            }
            if (this.f58444p0 == 0 && this.f58446s.d()) {
                O(this.f58446s, this.f58443o.f53790d);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // androidx.media2.exoplayer.external.t0
    public boolean isReady() {
        return true;
    }
}
