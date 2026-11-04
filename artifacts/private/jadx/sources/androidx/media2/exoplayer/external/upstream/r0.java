package androidx.media2.exoplayer.external.upstream;

import android.net.Uri;
import androidx.annotation.b1;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketException;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class r0 extends e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f57432p = 2000;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f57433q = 8000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f57434f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final byte[] f57435g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final DatagramPacket f57436h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.p0
    private Uri f57437i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.p0
    private DatagramSocket f57438j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.p0
    private MulticastSocket f57439k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.p0
    private InetAddress f57440l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.p0
    private InetSocketAddress f57441m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f57442n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f57443o;

    public static final class a extends IOException {
        public a(IOException cause) {
            super(cause);
        }
    }

    public r0() {
        this(2000);
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public long b(o dataSpec) throws a {
        Uri uri = dataSpec.f57370a;
        this.f57437i = uri;
        String host = uri.getHost();
        int port = this.f57437i.getPort();
        g(dataSpec);
        try {
            this.f57440l = InetAddress.getByName(host);
            this.f57441m = new InetSocketAddress(this.f57440l, port);
            if (this.f57440l.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(this.f57441m);
                this.f57439k = multicastSocket;
                multicastSocket.joinGroup(this.f57440l);
                this.f57438j = this.f57439k;
            } else {
                this.f57438j = new DatagramSocket(this.f57441m);
            }
            try {
                this.f57438j.setSoTimeout(this.f57434f);
                this.f57442n = true;
                i(dataSpec);
                return -1L;
            } catch (SocketException e10) {
                throw new a(e10);
            }
        } catch (IOException e11) {
            throw new a(e11);
        }
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public void close() {
        this.f57437i = null;
        MulticastSocket multicastSocket = this.f57439k;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup(this.f57440l);
            } catch (IOException unused) {
            }
            this.f57439k = null;
        }
        DatagramSocket datagramSocket = this.f57438j;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f57438j = null;
        }
        this.f57440l = null;
        this.f57441m = null;
        this.f57443o = 0;
        if (this.f57442n) {
            this.f57442n = false;
            e();
        }
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    @androidx.annotation.p0
    public Uri getUri() {
        return this.f57437i;
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public int read(byte[] buffer, int offset, int readLength) throws a {
        if (readLength == 0) {
            return 0;
        }
        if (this.f57443o == 0) {
            try {
                this.f57438j.receive(this.f57436h);
                int length = this.f57436h.getLength();
                this.f57443o = length;
                d(length);
            } catch (IOException e10) {
                throw new a(e10);
            }
        }
        int length2 = this.f57436h.getLength();
        int i10 = this.f57443o;
        int iMin = Math.min(i10, readLength);
        System.arraycopy(this.f57435g, length2 - i10, buffer, offset, iMin);
        this.f57443o -= iMin;
        return iMin;
    }

    public r0(int maxPacketSize) {
        this(maxPacketSize, 8000);
    }

    public r0(int maxPacketSize, int socketTimeoutMillis) {
        super(true);
        this.f57434f = socketTimeoutMillis;
        byte[] bArr = new byte[maxPacketSize];
        this.f57435g = bArr;
        this.f57436h = new DatagramPacket(bArr, 0, maxPacketSize);
    }
}
