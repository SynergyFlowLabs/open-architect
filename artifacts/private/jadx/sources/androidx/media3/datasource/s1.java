package androidx.media3.datasource;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class s1 extends e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f62562o = 2000;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f62563p = 8000;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f62564q = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f62565f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final byte[] f62566g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final DatagramPacket f62567h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.p0
    private Uri f62568i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.p0
    private DatagramSocket f62569j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.p0
    private MulticastSocket f62570k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.p0
    private InetAddress f62571l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f62572m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f62573n;

    public static final class a extends u {
        public a(Throwable th2, int i10) {
            super(th2, i10);
        }
    }

    public s1() {
        this(2000);
    }

    @Override // androidx.media3.datasource.p, androidx.media3.datasource.g0
    public long c(x xVar) throws a {
        Uri uri = xVar.f62594a;
        this.f62568i = uri;
        String str = (String) androidx.media3.common.util.a.g(uri.getHost());
        int port = this.f62568i.getPort();
        w(xVar);
        try {
            this.f62571l = InetAddress.getByName(str);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f62571l, port);
            if (this.f62571l.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f62570k = multicastSocket;
                multicastSocket.joinGroup(this.f62571l);
                this.f62569j = this.f62570k;
            } else {
                this.f62569j = new DatagramSocket(inetSocketAddress);
            }
            this.f62569j.setSoTimeout(this.f62565f);
            this.f62572m = true;
            x(xVar);
            return -1L;
        } catch (IOException e10) {
            throw new a(e10, androidx.media3.common.x0.f61834p1);
        } catch (SecurityException e11) {
            throw new a(e11, androidx.media3.common.x0.f61820i3);
        }
    }

    @Override // androidx.media3.datasource.p, androidx.media3.datasource.g0
    public void close() {
        this.f62568i = null;
        MulticastSocket multicastSocket = this.f62570k;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup((InetAddress) androidx.media3.common.util.a.g(this.f62571l));
            } catch (IOException unused) {
            }
            this.f62570k = null;
        }
        DatagramSocket datagramSocket = this.f62569j;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f62569j = null;
        }
        this.f62571l = null;
        this.f62573n = 0;
        if (this.f62572m) {
            this.f62572m = false;
            v();
        }
    }

    @Override // androidx.media3.datasource.p
    @androidx.annotation.p0
    public Uri getUri() {
        return this.f62568i;
    }

    @Override // androidx.media3.common.l, androidx.media3.datasource.g0
    public int read(byte[] bArr, int i10, int i11) throws a {
        if (i11 == 0) {
            return 0;
        }
        if (this.f62573n == 0) {
            try {
                ((DatagramSocket) androidx.media3.common.util.a.g(this.f62569j)).receive(this.f62567h);
                int length = this.f62567h.getLength();
                this.f62573n = length;
                u(length);
            } catch (SocketTimeoutException e10) {
                throw new a(e10, androidx.media3.common.x0.H1);
            } catch (IOException e11) {
                throw new a(e11, androidx.media3.common.x0.f61834p1);
            }
        }
        int length2 = this.f62567h.getLength();
        int i12 = this.f62573n;
        int iMin = Math.min(i12, i11);
        System.arraycopy(this.f62566g, length2 - i12, bArr, i10, iMin);
        this.f62573n -= iMin;
        return iMin;
    }

    public int y() {
        DatagramSocket datagramSocket = this.f62569j;
        if (datagramSocket == null) {
            return -1;
        }
        return datagramSocket.getLocalPort();
    }

    public s1(int i10) {
        this(i10, 8000);
    }

    public s1(int i10, int i11) {
        super(true);
        this.f62565f = i11;
        byte[] bArr = new byte[i10];
        this.f62566g = bArr;
        this.f62567h = new DatagramPacket(bArr, 0, i10);
    }
}
