package androidx.media3.exoplayer.util;

import android.os.SystemClock;
import androidx.annotation.b0;
import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import androidx.media3.exoplayer.upstream.o;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.ConcurrentModificationException;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f66190a = "time.android.com";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f66191b = 1000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f66192c = 10;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f66193d = 24;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f66194e = 32;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f66195f = 40;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f66196g = 48;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f66197h = 123;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f66198i = 3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f66199j = 4;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f66200k = 5;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f66201l = 3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f66202m = 3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f66203n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f66204o = 15;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final long f66205p = 2208988800L;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Object f66206q = new Object();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Object f66207r = new Object();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @b0("valueLock")
    private static boolean f66208s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @b0("valueLock")
    private static long f66209t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @b0("valueLock")
    private static String f66210u = "time.android.com";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @b0("valueLock")
    private static int f66211v = 1000;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @b0("valueLock")
    private static long f66212w = -9223372036854775807L;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @b0("valueLock")
    private static long f66213x = -9223372036854775807L;

    public interface b {
        void a();

        void b(IOException iOException);
    }

    private static final class c implements o.b<o.e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @p0
        private final b f66214a;

        public c(@p0 b bVar) {
            this.f66214a = bVar;
        }

        @Override // androidx.media3.exoplayer.upstream.o.b
        public o.c n(o.e eVar, long j10, long j11, IOException iOException, int i10) {
            b bVar = this.f66214a;
            if (bVar != null) {
                bVar.b(iOException);
            }
            return o.f66130k;
        }

        @Override // androidx.media3.exoplayer.upstream.o.b
        public void s(o.e eVar, long j10, long j11, boolean z10) {
        }

        @Override // androidx.media3.exoplayer.upstream.o.b
        public void w(o.e eVar, long j10, long j11) {
            if (this.f66214a != null) {
                if (!d.n()) {
                    this.f66214a.b(new IOException(new ConcurrentModificationException()));
                    return;
                }
                this.f66214a.a();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.util.d$d, reason: collision with other inner class name */
    private static final class C0599d implements o.e {
        private C0599d() {
        }

        @Override // androidx.media3.exoplayer.upstream.o.e
        public void a() throws IOException {
            synchronized (d.f66206q) {
                try {
                    synchronized (d.f66207r) {
                        try {
                            if (d.f66208s) {
                                return;
                            }
                            long jO = d.o();
                            synchronized (d.f66207r) {
                                try {
                                    long unused = d.f66213x = SystemClock.elapsedRealtime();
                                    long unused2 = d.f66209t = jO;
                                    boolean unused3 = d.f66208s = true;
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }

        @Override // androidx.media3.exoplayer.upstream.o.e
        public void b() {
        }
    }

    private d() {
    }

    private static void h(byte b10, byte b11, int i10, long j10) throws IOException {
        if (b10 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b11 != 4 && b11 != 5) {
            throw new IOException("SNTP: Untrusted mode: " + ((int) b11));
        }
        if (i10 != 0 && i10 <= 15) {
            if (j10 == 0) {
                throw new IOException("SNTP: Zero transmitTime");
            }
        } else {
            throw new IOException("SNTP: Untrusted stratum: " + i10);
        }
    }

    public static long i() {
        long j10;
        synchronized (f66207r) {
            try {
                j10 = f66208s ? f66209t : -9223372036854775807L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return j10;
    }

    public static long j() {
        long j10;
        synchronized (f66207r) {
            try {
                j10 = f66212w;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return j10;
    }

    public static String k() {
        String str;
        synchronized (f66207r) {
            str = f66210u;
        }
        return str;
    }

    public static int l() {
        int i10;
        synchronized (f66207r) {
            try {
                i10 = f66211v;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i10;
    }

    public static void m(@p0 o oVar, @p0 b bVar) {
        if (n()) {
            if (bVar != null) {
                bVar.a();
            }
        } else {
            if (oVar == null) {
                oVar = new o("SntpClient");
            }
            oVar.n(new C0599d(), new c(bVar), 1);
        }
    }

    public static boolean n() {
        boolean z10;
        synchronized (f66207r) {
            try {
                if (f66213x != -9223372036854775807L && f66212w != -9223372036854775807L) {
                    f66208s = f66208s && SystemClock.elapsedRealtime() - f66213x < f66212w;
                }
                z10 = f66208s;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long o() throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(l());
            InetAddress[] allByName = InetAddress.getAllByName(k());
            int length = allByName.length;
            SocketTimeoutException socketTimeoutException = null;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                byte[] bArr = new byte[48];
                DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, allByName[i10], f66197h);
                bArr[0] = com.google.common.base.c.E;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                u(bArr, 40, jCurrentTimeMillis);
                datagramSocket.send(datagramPacket);
                try {
                    datagramSocket.receive(new DatagramPacket(bArr, 48));
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    long j10 = jCurrentTimeMillis + (jElapsedRealtime2 - jElapsedRealtime);
                    byte b10 = bArr[0];
                    int i12 = bArr[1] & 255;
                    long jQ = q(bArr, 24);
                    long jQ2 = q(bArr, 32);
                    long jQ3 = q(bArr, 40);
                    h((byte) ((b10 >> 6) & 3), (byte) (b10 & 7), i12, jQ3);
                    long j11 = (j10 + (((jQ2 - jQ) + (jQ3 - j10)) / 2)) - jElapsedRealtime2;
                    datagramSocket.close();
                    return j11;
                } catch (SocketTimeoutException e10) {
                    if (socketTimeoutException == null) {
                        socketTimeoutException = e10;
                    } else {
                        socketTimeoutException.addSuppressed(e10);
                    }
                    int i13 = i11 + 1;
                    if (i11 >= 10) {
                        throw ((SocketTimeoutException) androidx.media3.common.util.a.g(socketTimeoutException));
                    }
                    i10++;
                    i11 = i13;
                }
            }
            throw ((SocketTimeoutException) androidx.media3.common.util.a.g(socketTimeoutException));
        } catch (Throwable th2) {
            try {
                datagramSocket.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    private static long p(byte[] bArr, int i10) {
        int i11 = bArr[i10];
        int i12 = bArr[i10 + 1];
        int i13 = bArr[i10 + 2];
        int i14 = bArr[i10 + 3];
        if ((i11 & 128) == 128) {
            i11 = (i11 & 127) + 128;
        }
        if ((i12 & 128) == 128) {
            i12 = (i12 & 127) + 128;
        }
        if ((i13 & 128) == 128) {
            i13 = (i13 & 127) + 128;
        }
        if ((i14 & 128) == 128) {
            i14 = (i14 & 127) + 128;
        }
        return (((long) i11) << 24) + (((long) i12) << 16) + (((long) i13) << 8) + ((long) i14);
    }

    private static long q(byte[] bArr, int i10) {
        long jP = p(bArr, i10);
        long jP2 = p(bArr, i10 + 4);
        if (jP == 0 && jP2 == 0) {
            return 0L;
        }
        return ((jP - f66205p) * 1000) + ((jP2 * 1000) / 4294967296L);
    }

    public static void r(long j10) {
        synchronized (f66207r) {
            try {
                f66212w = j10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void s(String str) {
        synchronized (f66207r) {
            try {
                if (!f66210u.equals(str)) {
                    f66210u = str;
                    f66208s = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void t(int i10) {
        synchronized (f66207r) {
            try {
                if (f66211v != i10) {
                    f66211v = i10;
                    int i11 = 5 ^ 0;
                    f66208s = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static void u(byte[] bArr, int i10, long j10) {
        if (j10 == 0) {
            Arrays.fill(bArr, i10, i10 + 8, (byte) 0);
            return;
        }
        long j11 = j10 / 1000;
        long j12 = j10 - (j11 * 1000);
        long j13 = j11 + f66205p;
        bArr[i10] = (byte) (j13 >> 24);
        bArr[i10 + 1] = (byte) (j13 >> 16);
        bArr[i10 + 2] = (byte) (j13 >> 8);
        bArr[i10 + 3] = (byte) j13;
        long j14 = (j12 * 4294967296L) / 1000;
        bArr[i10 + 4] = (byte) (j14 >> 24);
        bArr[i10 + 5] = (byte) (j14 >> 16);
        bArr[i10 + 6] = (byte) (j14 >> 8);
        bArr[i10 + 7] = (byte) (Math.random() * 255.0d);
    }
}
