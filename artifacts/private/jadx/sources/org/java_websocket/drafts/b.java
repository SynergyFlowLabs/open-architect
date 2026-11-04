package org.java_websocket.drafts;

import androidx.collection.g3;
import com.google.common.primitives.t;
import com.planner5d.library.services.utility.e0;
import em.e;
import fm.g;
import gm.d;
import im.h;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import org.apache.commons.lang3.time.m;
import org.java_websocket.framing.f;
import org.java_websocket.framing.j;
import org.java_websocket.i;
import org.slf4j.c;

/* JADX INFO: loaded from: classes14.dex */
public class b extends org.java_websocket.drafts.a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f337851o = "Sec-WebSocket-Key";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f337852p = "Sec-WebSocket-Protocol";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f337853q = "Sec-WebSocket-Extensions";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f337854r = "Sec-WebSocket-Accept";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f337855s = "Upgrade";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f337856t = "Connection";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    static final /* synthetic */ boolean f337857u = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f337858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f337859d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private d f337860e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<d> f337861f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private d f337862g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private km.a f337863h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<km.a> f337864i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private f f337865j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List<ByteBuffer> f337866k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ByteBuffer f337867l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final SecureRandom f337868m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f337869n;

    private class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f337870a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f337871b;

        a(int i10, int i11) {
            this.f337870a = i10;
            this.f337871b = i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int c() {
            return this.f337870a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int d() {
            return this.f337871b;
        }
    }

    public b() {
        this((List<d>) Collections.EMPTY_LIST);
    }

    private void C(ByteBuffer byteBuffer) {
        synchronized (this.f337866k) {
            this.f337866k.add(byteBuffer);
        }
    }

    private void D() throws g {
        long J = J();
        if (J <= this.f337869n) {
            return;
        }
        E();
        this.f337858c.k("Payload limit reached. Allowed: {} Current: {}", Integer.valueOf(this.f337869n), Long.valueOf(J));
        throw new g(this.f337869n);
    }

    private void E() {
        synchronized (this.f337866k) {
            try {
                this.f337866k.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private em.b F(String str) {
        for (km.a aVar : this.f337864i) {
            if (aVar.b(str)) {
                this.f337863h = aVar;
                this.f337858c.b0("acceptHandshake - Matching protocol found: {}", aVar);
                return em.b.MATCHED;
            }
        }
        return em.b.NOT_MATCHED;
    }

    private ByteBuffer G(f fVar) {
        ByteBuffer byteBufferB = fVar.b();
        int i10 = 0;
        boolean z10 = this.f337849a == e.CLIENT;
        int iT = T(byteBufferB);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((iT > 1 ? iT + 1 : iT) + 1 + (z10 ? 4 : 0) + byteBufferB.remaining());
        byte bH = (byte) (H(fVar.f()) | ((byte) (fVar.h() ? -128 : 0)));
        if (fVar.d()) {
            bH = (byte) (bH | R(1));
        }
        if (fVar.e()) {
            bH = (byte) (bH | R(2));
        }
        if (fVar.g()) {
            bH = (byte) (R(3) | bH);
        }
        byteBufferAllocate.put(bH);
        byte[] bArrB0 = b0(byteBufferB.remaining(), iT);
        if (iT == 1) {
            byteBufferAllocate.put((byte) (bArrB0[0] | N(z10)));
        } else if (iT == 2) {
            byteBufferAllocate.put((byte) (N(z10) | 126));
            byteBufferAllocate.put(bArrB0);
        } else {
            if (iT != 8) {
                throw new IllegalStateException("Size representation not supported/specified");
            }
            byteBufferAllocate.put((byte) (N(z10) | 127));
            byteBufferAllocate.put(bArrB0);
        }
        if (z10) {
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(4);
            byteBufferAllocate2.putInt(this.f337868m.nextInt());
            byteBufferAllocate.put(byteBufferAllocate2.array());
            while (byteBufferB.hasRemaining()) {
                byteBufferAllocate.put((byte) (byteBufferB.get() ^ byteBufferAllocate2.get(i10 % 4)));
                i10++;
            }
        } else {
            byteBufferAllocate.put(byteBufferB);
            byteBufferB.flip();
        }
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    private byte H(em.c cVar) {
        if (cVar == em.c.CONTINUOUS) {
            return (byte) 0;
        }
        if (cVar == em.c.TEXT) {
            return (byte) 1;
        }
        if (cVar == em.c.BINARY) {
            return (byte) 2;
        }
        if (cVar == em.c.CLOSING) {
            return (byte) 8;
        }
        if (cVar == em.c.PING) {
            return (byte) 9;
        }
        if (cVar == em.c.PONG) {
            return (byte) 10;
        }
        throw new IllegalArgumentException("Don't know how to handle " + cVar.toString());
    }

    private String I(String str) {
        try {
            return org.java_websocket.util.a.g(MessageDigest.getInstance(e0.f225194b).digest((str.trim() + okhttp3.internal.ws.g.f334635b).getBytes()));
        } catch (NoSuchAlgorithmException e10) {
            throw new IllegalStateException(e10);
        }
    }

    private long J() {
        long jLimit;
        synchronized (this.f337866k) {
            try {
                Iterator<ByteBuffer> it = this.f337866k.iterator();
                jLimit = 0;
                while (it.hasNext()) {
                    jLimit += (long) it.next().limit();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jLimit;
    }

    private byte N(boolean z10) {
        return z10 ? (byte) -128 : (byte) 0;
    }

    private ByteBuffer P() throws g {
        ByteBuffer byteBufferAllocate;
        synchronized (this.f337866k) {
            try {
                Iterator<ByteBuffer> it = this.f337866k.iterator();
                long jLimit = 0;
                while (it.hasNext()) {
                    jLimit += (long) it.next().limit();
                }
                D();
                byteBufferAllocate = ByteBuffer.allocate((int) jLimit);
                Iterator<ByteBuffer> it2 = this.f337866k.iterator();
                while (it2.hasNext()) {
                    byteBufferAllocate.put(it2.next());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    private byte R(int i10) {
        if (i10 == 1) {
            return t.f119782a;
        }
        if (i10 == 2) {
            return (byte) 32;
        }
        if (i10 != 3) {
            return (byte) 0;
        }
        return com.google.common.base.c.f116465r;
    }

    private String S() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(m.f337525a));
        return simpleDateFormat.format(calendar.getTime());
    }

    private int T(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() <= 125) {
            return 1;
        }
        return byteBuffer.remaining() <= 65535 ? 2 : 8;
    }

    private void U(i iVar, RuntimeException runtimeException) {
        this.f337858c.c("Runtime exception during onWebsocketMessage", runtimeException);
        iVar.F().o(iVar, runtimeException);
    }

    private void V(i iVar, f fVar) {
        try {
            iVar.F().u(iVar, fVar.b());
        } catch (RuntimeException e10) {
            U(iVar, e10);
        }
    }

    private void W(i iVar, f fVar) {
        int iQ;
        String strR;
        if (fVar instanceof org.java_websocket.framing.b) {
            org.java_websocket.framing.b bVar = (org.java_websocket.framing.b) fVar;
            iQ = bVar.q();
            strR = bVar.r();
        } else {
            iQ = 1005;
            strR = "";
        }
        if (iVar.E() == em.d.CLOSING) {
            iVar.j(iQ, strR, true);
        } else if (n() == em.a.TWOWAY) {
            iVar.a(iQ, strR, true);
        } else {
            iVar.v(iQ, strR, false);
        }
    }

    private void X(i iVar, f fVar, em.c cVar) throws fm.c {
        em.c cVar2 = em.c.CONTINUOUS;
        if (cVar != cVar2) {
            Z(fVar);
        } else if (fVar.h()) {
            Y(iVar, fVar);
        } else if (this.f337865j == null) {
            this.f337858c.j("Protocol error: Continuous frame sequence was not started.");
            throw new fm.c(1002, "Continuous frame sequence was not started.");
        }
        if (cVar == em.c.TEXT && !org.java_websocket.util.c.b(fVar.b())) {
            this.f337858c.j("Protocol error: Payload is not UTF8");
            throw new fm.c(1007);
        }
        if (cVar != cVar2 || this.f337865j == null) {
            return;
        }
        C(fVar.b());
    }

    private void Y(i iVar, f fVar) throws fm.c {
        if (this.f337865j == null) {
            this.f337858c.J("Protocol error: Previous continuous frame sequence not completed.");
            throw new fm.c(1002, "Continuous frame sequence was not started.");
        }
        C(fVar.b());
        D();
        if (this.f337865j.f() == em.c.TEXT) {
            ((org.java_websocket.framing.g) this.f337865j).l(P());
            ((org.java_websocket.framing.g) this.f337865j).j();
            try {
                iVar.F().p(iVar, org.java_websocket.util.c.f(this.f337865j.b()));
            } catch (RuntimeException e10) {
                U(iVar, e10);
            }
        } else if (this.f337865j.f() == em.c.BINARY) {
            ((org.java_websocket.framing.g) this.f337865j).l(P());
            ((org.java_websocket.framing.g) this.f337865j).j();
            try {
                iVar.F().u(iVar, this.f337865j.b());
            } catch (RuntimeException e11) {
                U(iVar, e11);
            }
        }
        this.f337865j = null;
        E();
    }

    private void Z(f fVar) throws fm.c {
        if (this.f337865j != null) {
            this.f337858c.J("Protocol error: Previous continuous frame sequence not completed.");
            throw new fm.c(1002, "Previous continuous frame sequence not completed.");
        }
        this.f337865j = fVar;
        C(fVar.b());
        D();
    }

    private void a0(i iVar, f fVar) throws fm.c {
        try {
            iVar.F().p(iVar, org.java_websocket.util.c.f(fVar.b()));
        } catch (RuntimeException e10) {
            U(iVar, e10);
        }
    }

    private byte[] b0(long j10, int i10) {
        byte[] bArr = new byte[i10];
        int i11 = (i10 * 8) - 8;
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) (j10 >>> (i11 - (i12 * 8)));
        }
        return bArr;
    }

    private em.c c0(byte b10) throws fm.e {
        if (b10 == 0) {
            return em.c.CONTINUOUS;
        }
        if (b10 == 1) {
            return em.c.TEXT;
        }
        if (b10 == 2) {
            return em.c.BINARY;
        }
        switch (b10) {
            case 8:
                return em.c.CLOSING;
            case 9:
                return em.c.PING;
            case 10:
                return em.c.PONG;
            default:
                throw new fm.e("Unknown opcode " + ((int) b10));
        }
    }

    private f d0(ByteBuffer byteBuffer) throws fm.c, fm.a {
        b bVar;
        ByteBuffer byteBuffer2;
        if (byteBuffer == null) {
            throw new IllegalArgumentException();
        }
        int iRemaining = byteBuffer.remaining();
        int iD = 2;
        f0(iRemaining, 2);
        byte b10 = byteBuffer.get();
        boolean z10 = (b10 >> 8) != 0;
        boolean z11 = (b10 & t.f119782a) != 0;
        boolean z12 = (b10 & 32) != 0;
        boolean z13 = (b10 & com.google.common.base.c.f116465r) != 0;
        byte b11 = byteBuffer.get();
        boolean z14 = (b11 & (-128)) != 0;
        int iC = (byte) (b11 & 127);
        em.c cVarC0 = c0((byte) (b10 & com.google.common.base.c.f116464q));
        if (iC < 0 || iC > 125) {
            bVar = this;
            byteBuffer2 = byteBuffer;
            a aVarG0 = bVar.g0(byteBuffer2, cVarC0, iC, iRemaining, 2);
            iC = aVarG0.c();
            iD = aVarG0.d();
        } else {
            bVar = this;
            byteBuffer2 = byteBuffer;
        }
        bVar.e0(iC);
        bVar.f0(iRemaining, iD + (z14 ? 4 : 0) + iC);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bVar.d(iC));
        if (z14) {
            byte[] bArr = new byte[4];
            byteBuffer2.get(bArr);
            for (int i10 = 0; i10 < iC; i10++) {
                byteBufferAllocate.put((byte) (byteBuffer2.get() ^ bArr[i10 % 4]));
            }
        } else {
            byteBufferAllocate.put(byteBuffer2.array(), byteBuffer2.position(), byteBufferAllocate.limit());
            byteBuffer2.position(byteBuffer2.position() + byteBufferAllocate.limit());
        }
        org.java_websocket.framing.g gVarI = org.java_websocket.framing.g.i(cVarC0);
        gVarI.k(z10);
        gVarI.m(z11);
        gVarI.n(z12);
        gVarI.o(z13);
        byteBufferAllocate.flip();
        gVarI.l(byteBufferAllocate);
        if (gVarI.f() != em.c.CONTINUOUS) {
            if (gVarI.d() || gVarI.e() || gVarI.g()) {
                bVar.f337862g = bVar.K();
            } else {
                bVar.f337862g = bVar.f337860e;
            }
        }
        if (bVar.f337862g == null) {
            bVar.f337862g = bVar.f337860e;
        }
        bVar.f337862g.h(gVarI);
        bVar.f337862g.f(gVarI);
        if (bVar.f337858c.R()) {
            bVar.f337858c.k("afterDecoding({}): {}", Integer.valueOf(gVarI.b().remaining()), gVarI.b().remaining() > 1000 ? "too big to display" : new String(gVarI.b().array()));
        }
        gVarI.j();
        return gVarI;
    }

    private void e0(long j10) throws g {
        if (j10 > g3.f12256c) {
            this.f337858c.J("Limit exedeed: Payloadsize is to big...");
            throw new g("Payloadsize is to big...");
        }
        int i10 = this.f337869n;
        if (j10 > i10) {
            this.f337858c.k("Payload limit reached. Allowed: {} Current: {}", Integer.valueOf(i10), Long.valueOf(j10));
            throw new g("Payload limit reached.", this.f337869n);
        }
        if (j10 >= 0) {
            return;
        }
        this.f337858c.J("Limit underflow: Payloadsize is to little...");
        throw new g("Payloadsize is to little...");
    }

    private void f0(int i10, int i11) throws fm.a {
        if (i10 >= i11) {
            return;
        }
        this.f337858c.J("Incomplete frame: maxpacketsize < realpacketsize");
        throw new fm.a(i11);
    }

    private a g0(ByteBuffer byteBuffer, em.c cVar, int i10, int i11, int i12) throws fm.e, fm.a, g {
        int i13;
        int iIntValue;
        if (cVar == em.c.PING || cVar == em.c.PONG || cVar == em.c.CLOSING) {
            this.f337858c.J("Invalid frame: more than 125 octets");
            throw new fm.e("more than 125 octets");
        }
        if (i10 == 126) {
            i13 = i12 + 2;
            f0(i11, i13);
            iIntValue = new BigInteger(new byte[]{0, byteBuffer.get(), byteBuffer.get()}).intValue();
        } else {
            i13 = i12 + 8;
            f0(i11, i13);
            byte[] bArr = new byte[8];
            for (int i14 = 0; i14 < 8; i14++) {
                bArr[i14] = byteBuffer.get();
            }
            long jLongValue = new BigInteger(bArr).longValue();
            e0(jLongValue);
            iIntValue = (int) jLongValue;
        }
        return new a(iIntValue, i13);
    }

    public d K() {
        return this.f337859d;
    }

    public List<d> L() {
        return this.f337861f;
    }

    public List<km.a> M() {
        return this.f337864i;
    }

    public int O() {
        return this.f337869n;
    }

    public km.a Q() {
        return this.f337863h;
    }

    @Override // org.java_websocket.drafts.a
    public em.b a(im.a aVar, h hVar) throws fm.f {
        if (!c(hVar)) {
            this.f337858c.J("acceptHandshakeAsClient - Missing/wrong upgrade or connection in handshake.");
            return em.b.NOT_MATCHED;
        }
        if (!aVar.i("Sec-WebSocket-Key") || !hVar.i("Sec-WebSocket-Accept")) {
            this.f337858c.J("acceptHandshakeAsClient - Missing Sec-WebSocket-Key or Sec-WebSocket-Accept");
            return em.b.NOT_MATCHED;
        }
        if (!I(aVar.g("Sec-WebSocket-Key")).equals(hVar.g("Sec-WebSocket-Accept"))) {
            this.f337858c.J("acceptHandshakeAsClient - Wrong key for Sec-WebSocket-Key.");
            return em.b.NOT_MATCHED;
        }
        em.b bVar = em.b.NOT_MATCHED;
        String strG = hVar.g("Sec-WebSocket-Extensions");
        for (d dVar : this.f337861f) {
            if (dVar.b(strG)) {
                this.f337859d = dVar;
                bVar = em.b.MATCHED;
                this.f337858c.b0("acceptHandshakeAsClient - Matching extension found: {}", dVar);
                break;
            }
        }
        em.b bVarF = F(hVar.g("Sec-WebSocket-Protocol"));
        em.b bVar2 = em.b.MATCHED;
        if (bVarF == bVar2 && bVar == bVar2) {
            return bVar2;
        }
        this.f337858c.J("acceptHandshakeAsClient - No matching extension or protocol found.");
        return em.b.NOT_MATCHED;
    }

    @Override // org.java_websocket.drafts.a
    public em.b b(im.a aVar) throws fm.f {
        if (u(aVar) != 13) {
            this.f337858c.J("acceptHandshakeAsServer - Wrong websocket version.");
            return em.b.NOT_MATCHED;
        }
        em.b bVar = em.b.NOT_MATCHED;
        String strG = aVar.g("Sec-WebSocket-Extensions");
        for (d dVar : this.f337861f) {
            if (dVar.e(strG)) {
                this.f337859d = dVar;
                bVar = em.b.MATCHED;
                this.f337858c.b0("acceptHandshakeAsServer - Matching extension found: {}", dVar);
                break;
            }
        }
        em.b bVarF = F(aVar.g("Sec-WebSocket-Protocol"));
        em.b bVar2 = em.b.MATCHED;
        if (bVarF == bVar2 && bVar == bVar2) {
            return bVar2;
        }
        this.f337858c.J("acceptHandshakeAsServer - No matching extension or protocol found.");
        return em.b.NOT_MATCHED;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f337869n != bVar.O()) {
                return false;
            }
            d dVar = this.f337859d;
            if (dVar == null ? bVar.K() != null : !dVar.equals(bVar.K())) {
                return false;
            }
            km.a aVar = this.f337863h;
            if (aVar != null) {
                return aVar.equals(bVar.Q());
            }
            if (bVar.Q() == null) {
                return true;
            }
        }
        return false;
    }

    @Override // org.java_websocket.drafts.a
    public org.java_websocket.drafts.a f() {
        ArrayList arrayList = new ArrayList();
        Iterator<d> it = L().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a());
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<km.a> it2 = M().iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next().a());
        }
        return new b(arrayList, arrayList2, this.f337869n);
    }

    @Override // org.java_websocket.drafts.a
    public ByteBuffer g(f fVar) {
        K().c(fVar);
        if (this.f337858c.R()) {
            this.f337858c.k("afterEnconding({}): {}", Integer.valueOf(fVar.b().remaining()), fVar.b().remaining() > 1000 ? "too big to display" : new String(fVar.b().array()));
        }
        return G(fVar);
    }

    @Override // org.java_websocket.drafts.a
    public List<f> h(String str, boolean z10) {
        j jVar = new j();
        jVar.l(ByteBuffer.wrap(org.java_websocket.util.c.h(str)));
        jVar.p(z10);
        try {
            jVar.j();
            return Collections.singletonList(jVar);
        } catch (fm.c e10) {
            throw new fm.h(e10);
        }
    }

    public int hashCode() {
        d dVar = this.f337859d;
        int iHashCode = (dVar != null ? dVar.hashCode() : 0) * 31;
        km.a aVar = this.f337863h;
        int iHashCode2 = aVar != null ? aVar.hashCode() : 0;
        int i10 = this.f337869n;
        return ((iHashCode + iHashCode2) * 31) + (i10 ^ (i10 >>> 32));
    }

    @Override // org.java_websocket.drafts.a
    public List<f> i(ByteBuffer byteBuffer, boolean z10) {
        org.java_websocket.framing.a aVar = new org.java_websocket.framing.a();
        aVar.l(byteBuffer);
        aVar.p(z10);
        try {
            aVar.j();
            return Collections.singletonList(aVar);
        } catch (fm.c e10) {
            throw new fm.h(e10);
        }
    }

    @Override // org.java_websocket.drafts.a
    public em.a n() {
        return em.a.TWOWAY;
    }

    @Override // org.java_websocket.drafts.a
    public im.b p(im.b bVar) {
        bVar.a("Upgrade", "websocket");
        bVar.a("Connection", "Upgrade");
        byte[] bArr = new byte[16];
        this.f337868m.nextBytes(bArr);
        bVar.a("Sec-WebSocket-Key", org.java_websocket.util.a.g(bArr));
        bVar.a(com.google.common.net.d.f119482c2, "13");
        StringBuilder sb2 = new StringBuilder();
        for (d dVar : this.f337861f) {
            if (dVar.g() != null && dVar.g().length() != 0) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(dVar.g());
            }
        }
        if (sb2.length() != 0) {
            bVar.a("Sec-WebSocket-Extensions", sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder();
        for (km.a aVar : this.f337864i) {
            if (aVar.c().length() != 0) {
                if (sb3.length() > 0) {
                    sb3.append(", ");
                }
                sb3.append(aVar.c());
            }
        }
        if (sb3.length() != 0) {
            bVar.a("Sec-WebSocket-Protocol", sb3.toString());
        }
        return bVar;
    }

    @Override // org.java_websocket.drafts.a
    public im.c q(im.a aVar, im.i iVar) throws fm.f {
        iVar.a("Upgrade", "websocket");
        iVar.a("Connection", aVar.g("Connection"));
        String strG = aVar.g("Sec-WebSocket-Key");
        if (strG == null || "".equals(strG)) {
            throw new fm.f("missing Sec-WebSocket-Key");
        }
        iVar.a("Sec-WebSocket-Accept", I(strG));
        if (K().d().length() != 0) {
            iVar.a("Sec-WebSocket-Extensions", K().d());
        }
        if (Q() != null && Q().c().length() != 0) {
            iVar.a("Sec-WebSocket-Protocol", Q().c());
        }
        iVar.e("Web Socket Protocol Handshake");
        iVar.a(com.google.common.net.d.C0, "TooTallNate Java-WebSocket");
        iVar.a(com.google.common.net.d.f119483d, S());
        return iVar;
    }

    @Override // org.java_websocket.drafts.a
    public void r(i iVar, f fVar) throws fm.c {
        em.c cVarF = fVar.f();
        if (cVarF == em.c.CLOSING) {
            W(iVar, fVar);
            return;
        }
        if (cVarF == em.c.PING) {
            iVar.F().A(iVar, fVar);
            return;
        }
        if (cVarF == em.c.PONG) {
            iVar.Q();
            iVar.F().x(iVar, fVar);
            return;
        }
        if (!fVar.h() || cVarF == em.c.CONTINUOUS) {
            X(iVar, fVar, cVarF);
            return;
        }
        if (this.f337865j != null) {
            this.f337858c.j("Protocol error: Continuous frame sequence not completed.");
            throw new fm.c(1002, "Continuous frame sequence not completed.");
        }
        if (cVarF == em.c.TEXT) {
            a0(iVar, fVar);
        } else if (cVarF == em.c.BINARY) {
            V(iVar, fVar);
        } else {
            this.f337858c.j("non control or continious frame expected");
            throw new fm.c(1002, "non control or continious frame expected");
        }
    }

    @Override // org.java_websocket.drafts.a
    public String toString() {
        String string = super.toString();
        if (K() != null) {
            string = string + " extension: " + K().toString();
        }
        if (Q() != null) {
            string = string + " protocol: " + Q().toString();
        }
        return string + " max frame size: " + this.f337869n;
    }

    @Override // org.java_websocket.drafts.a
    public void v() {
        this.f337867l = null;
        d dVar = this.f337859d;
        if (dVar != null) {
            dVar.reset();
        }
        this.f337859d = new gm.b();
        this.f337863h = null;
    }

    @Override // org.java_websocket.drafts.a
    public List<f> x(ByteBuffer byteBuffer) throws fm.c {
        LinkedList linkedList;
        while (true) {
            linkedList = new LinkedList();
            if (this.f337867l == null) {
                break;
            }
            try {
                byteBuffer.mark();
                int iRemaining = byteBuffer.remaining();
                int iRemaining2 = this.f337867l.remaining();
                if (iRemaining2 <= iRemaining) {
                    this.f337867l.put(byteBuffer.array(), byteBuffer.position(), iRemaining2);
                    byteBuffer.position(byteBuffer.position() + iRemaining2);
                    linkedList.add(d0((ByteBuffer) this.f337867l.duplicate().position(0)));
                    this.f337867l = null;
                    break;
                }
                this.f337867l.put(byteBuffer.array(), byteBuffer.position(), iRemaining);
                byteBuffer.position(byteBuffer.position() + iRemaining);
                return Collections.EMPTY_LIST;
            } catch (fm.a e10) {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(d(e10.a()));
                this.f337867l.rewind();
                byteBufferAllocate.put(this.f337867l);
                this.f337867l = byteBufferAllocate;
            }
        }
        while (byteBuffer.hasRemaining()) {
            byteBuffer.mark();
            try {
                linkedList.add(d0(byteBuffer));
            } catch (fm.a e11) {
                byteBuffer.reset();
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(d(e11.a()));
                this.f337867l = byteBufferAllocate2;
                byteBufferAllocate2.put(byteBuffer);
            }
        }
        return linkedList;
    }

    public b(d dVar) {
        this((List<d>) Collections.singletonList(dVar));
    }

    public b(List<d> list) {
        this(list, (List<km.a>) Collections.singletonList(new km.b("")));
    }

    public b(List<d> list, List<km.a> list2) {
        this(list, list2, Integer.MAX_VALUE);
    }

    public b(List<d> list, int i10) {
        this(list, Collections.singletonList(new km.b("")), i10);
    }

    public b(List<d> list, List<km.a> list2, int i10) {
        this.f337858c = org.slf4j.e.k(b.class);
        this.f337859d = new gm.b();
        this.f337860e = new gm.b();
        this.f337868m = new SecureRandom();
        if (list != null && list2 != null && i10 >= 1) {
            this.f337861f = new ArrayList(list.size());
            this.f337864i = new ArrayList(list2.size());
            this.f337866k = new ArrayList();
            Iterator<d> it = list.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                if (it.next().getClass().equals(gm.b.class)) {
                    z10 = true;
                }
            }
            this.f337861f.addAll(list);
            if (!z10) {
                List<d> list3 = this.f337861f;
                list3.add(list3.size(), this.f337859d);
            }
            this.f337864i.addAll(list2);
            this.f337869n = i10;
            this.f337862g = null;
            return;
        }
        throw new IllegalArgumentException();
    }
}
