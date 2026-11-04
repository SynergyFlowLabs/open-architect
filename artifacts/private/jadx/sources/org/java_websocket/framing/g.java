package org.java_websocket.framing;

import java.nio.ByteBuffer;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes14.dex */
public abstract class g implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private em.c f337893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ByteBuffer f337894c = org.java_websocket.util.b.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f337892a = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f337895d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f337896e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f337897f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f337898g = false;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f337899a;

        static {
            int[] iArr = new int[em.c.values().length];
            f337899a = iArr;
            try {
                iArr[em.c.PING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f337899a[em.c.PONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f337899a[em.c.TEXT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f337899a[em.c.BINARY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f337899a[em.c.CLOSING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f337899a[em.c.CONTINUOUS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public g(em.c cVar) {
        this.f337893b = cVar;
    }

    public static g i(em.c cVar) {
        if (cVar == null) {
            throw new IllegalArgumentException("Supplied opcode cannot be null");
        }
        switch (a.f337899a[cVar.ordinal()]) {
            case 1:
                return new h();
            case 2:
                return new i();
            case 3:
                return new j();
            case 4:
                return new org.java_websocket.framing.a();
            case 5:
                return new b();
            case 6:
                return new c();
            default:
                throw new IllegalArgumentException("Supplied opcode is invalid");
        }
    }

    @Override // org.java_websocket.framing.f
    public boolean a() {
        return this.f337895d;
    }

    @Override // org.java_websocket.framing.f
    public ByteBuffer b() {
        return this.f337894c;
    }

    @Override // org.java_websocket.framing.f
    public void c(f fVar) {
        ByteBuffer byteBufferB = fVar.b();
        if (this.f337894c == null) {
            this.f337894c = ByteBuffer.allocate(byteBufferB.remaining());
            byteBufferB.mark();
            this.f337894c.put(byteBufferB);
            byteBufferB.reset();
        } else {
            byteBufferB.mark();
            ByteBuffer byteBuffer = this.f337894c;
            byteBuffer.position(byteBuffer.limit());
            ByteBuffer byteBuffer2 = this.f337894c;
            byteBuffer2.limit(byteBuffer2.capacity());
            if (byteBufferB.remaining() > this.f337894c.remaining()) {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBufferB.remaining() + this.f337894c.capacity());
                this.f337894c.flip();
                byteBufferAllocate.put(this.f337894c);
                byteBufferAllocate.put(byteBufferB);
                this.f337894c = byteBufferAllocate;
            } else {
                this.f337894c.put(byteBufferB);
            }
            this.f337894c.rewind();
            byteBufferB.reset();
        }
        this.f337892a = fVar.h();
    }

    @Override // org.java_websocket.framing.f
    public boolean d() {
        return this.f337896e;
    }

    @Override // org.java_websocket.framing.f
    public boolean e() {
        return this.f337897f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            g gVar = (g) obj;
            if (this.f337892a != gVar.f337892a || this.f337895d != gVar.f337895d || this.f337896e != gVar.f337896e || this.f337897f != gVar.f337897f || this.f337898g != gVar.f337898g || this.f337893b != gVar.f337893b) {
                return false;
            }
            ByteBuffer byteBuffer = this.f337894c;
            if (byteBuffer != null) {
                return byteBuffer.equals(gVar.f337894c);
            }
            if (gVar.f337894c == null) {
                return true;
            }
        }
        return false;
    }

    @Override // org.java_websocket.framing.f
    public em.c f() {
        return this.f337893b;
    }

    @Override // org.java_websocket.framing.f
    public boolean g() {
        return this.f337898g;
    }

    @Override // org.java_websocket.framing.f
    public boolean h() {
        return this.f337892a;
    }

    public int hashCode() {
        int iHashCode = (((this.f337892a ? 1 : 0) * 31) + this.f337893b.hashCode()) * 31;
        ByteBuffer byteBuffer = this.f337894c;
        return ((((((((iHashCode + (byteBuffer != null ? byteBuffer.hashCode() : 0)) * 31) + (this.f337895d ? 1 : 0)) * 31) + (this.f337896e ? 1 : 0)) * 31) + (this.f337897f ? 1 : 0)) * 31) + (this.f337898g ? 1 : 0);
    }

    public abstract void j() throws fm.c;

    public void k(boolean z10) {
        this.f337892a = z10;
    }

    public void l(ByteBuffer byteBuffer) {
        this.f337894c = byteBuffer;
    }

    public void m(boolean z10) {
        this.f337896e = z10;
    }

    public void n(boolean z10) {
        this.f337897f = z10;
    }

    public void o(boolean z10) {
        this.f337898g = z10;
    }

    public void p(boolean z10) {
        this.f337895d = z10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Framedata{ opcode:");
        sb2.append(f());
        sb2.append(", fin:");
        sb2.append(h());
        sb2.append(", rsv1:");
        sb2.append(d());
        sb2.append(", rsv2:");
        sb2.append(e());
        sb2.append(", rsv3:");
        sb2.append(g());
        sb2.append(", payload length:[pos:");
        sb2.append(this.f337894c.position());
        sb2.append(", len:");
        sb2.append(this.f337894c.remaining());
        sb2.append("], payload:");
        sb2.append(this.f337894c.remaining() > 1000 ? "(too big to display)" : new String(this.f337894c.array()));
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        return sb2.toString();
    }
}
