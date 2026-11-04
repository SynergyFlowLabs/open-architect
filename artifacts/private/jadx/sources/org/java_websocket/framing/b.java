package org.java_websocket.framing;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes14.dex */
public class b extends d {
    public static final int A = -3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f337873j = 1000;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f337874k = 1001;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f337875l = 1002;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f337876m = 1003;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f337877n = 1005;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f337878o = 1006;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f337879p = 1007;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f337880q = 1008;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f337881r = 1009;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f337882s = 1010;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f337883t = 1011;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f337884u = 1012;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f337885v = 1013;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f337886w = 1014;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f337887x = 1015;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f337888y = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f337889z = -2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f337890h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f337891i;

    public b() {
        super(em.c.CLOSING);
        t("");
        s(1000);
    }

    private void u() {
        byte[] bArrH = org.java_websocket.util.c.h(this.f337891i);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt(this.f337890h);
        byteBufferAllocate.position(2);
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(bArrH.length + 2);
        byteBufferAllocate2.put(byteBufferAllocate);
        byteBufferAllocate2.put(bArrH);
        byteBufferAllocate2.rewind();
        super.l(byteBufferAllocate2);
    }

    private void v(ByteBuffer byteBuffer, int i10) throws fm.c {
        try {
            try {
                byteBuffer.position(byteBuffer.position() + 2);
                this.f337891i = org.java_websocket.util.c.f(byteBuffer);
                byteBuffer.position(i10);
            } catch (IllegalArgumentException unused) {
                throw new fm.c(1007);
            }
        } catch (Throwable th2) {
            byteBuffer.position(i10);
            throw th2;
        }
    }

    @Override // org.java_websocket.framing.g, org.java_websocket.framing.f
    public ByteBuffer b() {
        return this.f337890h == 1005 ? org.java_websocket.util.b.a() : super.b();
    }

    @Override // org.java_websocket.framing.g
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && super.equals(obj)) {
            b bVar = (b) obj;
            if (this.f337890h != bVar.f337890h) {
                return false;
            }
            String str = this.f337891i;
            if (str != null) {
                return str.equals(bVar.f337891i);
            }
            return bVar.f337891i == null;
        }
        return false;
    }

    @Override // org.java_websocket.framing.g
    public int hashCode() {
        int iHashCode = ((super.hashCode() * 31) + this.f337890h) * 31;
        String str = this.f337891i;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // org.java_websocket.framing.d, org.java_websocket.framing.g
    public void j() throws fm.c {
        super.j();
        if (this.f337890h == 1007 && this.f337891i.isEmpty()) {
            throw new fm.c(1007, "Received text is no valid utf8 string!");
        }
        if (this.f337890h == 1005 && this.f337891i.length() > 0) {
            throw new fm.c(1002, "A close frame must have a closecode if it has a reason");
        }
        int i10 = this.f337890h;
        if (i10 > 1015 && i10 < 3000) {
            throw new fm.c(1002, "Trying to send an illegal close code!");
        }
        if (i10 == 1006 || i10 == 1015 || i10 == 1005 || i10 > 4999 || i10 < 1000 || i10 == 1004) {
            throw new fm.e("closecode must not be sent over the wire: " + this.f337890h);
        }
    }

    @Override // org.java_websocket.framing.g
    public void l(ByteBuffer byteBuffer) {
        this.f337890h = 1005;
        this.f337891i = "";
        byteBuffer.mark();
        if (byteBuffer.remaining() == 0) {
            this.f337890h = 1000;
            return;
        }
        if (byteBuffer.remaining() == 1) {
            this.f337890h = 1002;
            return;
        }
        if (byteBuffer.remaining() >= 2) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            byteBufferAllocate.position(2);
            byteBufferAllocate.putShort(byteBuffer.getShort());
            byteBufferAllocate.position(0);
            this.f337890h = byteBufferAllocate.getInt();
        }
        byteBuffer.reset();
        try {
            v(byteBuffer, byteBuffer.position());
        } catch (fm.c unused) {
            this.f337890h = 1007;
            this.f337891i = null;
        }
    }

    public int q() {
        return this.f337890h;
    }

    public String r() {
        return this.f337891i;
    }

    public void s(int i10) {
        this.f337890h = i10;
        if (i10 == 1015) {
            this.f337890h = 1005;
            this.f337891i = "";
        }
        u();
    }

    public void t(String str) {
        if (str == null) {
            str = "";
        }
        this.f337891i = str;
        u();
    }

    @Override // org.java_websocket.framing.g
    public String toString() {
        return super.toString() + "code: " + this.f337890h;
    }
}
