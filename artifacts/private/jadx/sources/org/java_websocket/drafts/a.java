package org.java_websocket.drafts;

import em.c;
import em.e;
import fm.f;
import im.d;
import im.h;
import im.i;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.java_websocket.framing.g;
import org.java_websocket.framing.j;

/* JADX INFO: loaded from: classes14.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected e f337849a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected c f337850b = null;

    private static im.c A(String[] strArr, String str) throws f {
        if (!"101".equals(strArr[1])) {
            throw new f(String.format("Invalid status code received: %s Status line: %s", strArr[1], str));
        }
        if (!"HTTP/1.1".equalsIgnoreCase(strArr[0])) {
            throw new f(String.format("Invalid status line received: %s Status line: %s", strArr[0], str));
        }
        im.e eVar = new im.e();
        eVar.k(Short.parseShort(strArr[1]));
        eVar.e(strArr[2]);
        return eVar;
    }

    private static im.c B(String[] strArr, String str) throws f {
        if (!"GET".equalsIgnoreCase(strArr[0])) {
            throw new f(String.format("Invalid request method received: %s Status line: %s", strArr[0], str));
        }
        if (!"HTTP/1.1".equalsIgnoreCase(strArr[2])) {
            throw new f(String.format("Invalid status line received: %s Status line: %s", strArr[2], str));
        }
        d dVar = new d();
        dVar.d(strArr[1]);
        return dVar;
    }

    public static ByteBuffer s(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        byte b10 = 48;
        while (byteBuffer.hasRemaining()) {
            byte b11 = byteBuffer.get();
            byteBufferAllocate.put(b11);
            if (b10 == 13 && b11 == 10) {
                byteBufferAllocate.limit(byteBufferAllocate.position() - 2);
                byteBufferAllocate.position(0);
                return byteBufferAllocate;
            }
            b10 = b11;
        }
        byteBuffer.position(byteBuffer.position() - byteBufferAllocate.position());
        return null;
    }

    public static String t(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferS = s(byteBuffer);
        if (byteBufferS == null) {
            return null;
        }
        return org.java_websocket.util.c.e(byteBufferS.array(), 0, byteBufferS.limit());
    }

    public static im.c z(ByteBuffer byteBuffer, e eVar) throws f {
        String strT = t(byteBuffer);
        if (strT == null) {
            throw new fm.b(byteBuffer.capacity() + 128);
        }
        String[] strArrSplit = strT.split(" ", 3);
        if (strArrSplit.length != 3) {
            throw new f();
        }
        im.c cVarA = eVar == e.CLIENT ? A(strArrSplit, strT) : B(strArrSplit, strT);
        String strT2 = t(byteBuffer);
        while (strT2 != null && strT2.length() > 0) {
            String[] strArrSplit2 = strT2.split(":", 2);
            if (strArrSplit2.length != 2) {
                throw new f("not an http header");
            }
            if (cVarA.i(strArrSplit2[0])) {
                cVarA.a(strArrSplit2[0], cVarA.g(strArrSplit2[0]) + "; " + strArrSplit2[1].replaceFirst("^ +", ""));
            } else {
                cVarA.a(strArrSplit2[0], strArrSplit2[1].replaceFirst("^ +", ""));
            }
            strT2 = t(byteBuffer);
        }
        if (strT2 != null) {
            return cVarA;
        }
        throw new fm.b();
    }

    public abstract em.b a(im.a aVar, h hVar) throws f;

    public abstract em.b b(im.a aVar) throws f;

    protected boolean c(im.f fVar) {
        return fVar.g(com.google.common.net.d.N).equalsIgnoreCase("websocket") && fVar.g(com.google.common.net.d.f119523o).toLowerCase(Locale.ENGLISH).contains("upgrade");
    }

    public int d(int i10) throws fm.c {
        if (i10 >= 0) {
            return i10;
        }
        throw new fm.c(1002, "Negative count");
    }

    public List<org.java_websocket.framing.f> e(c cVar, ByteBuffer byteBuffer, boolean z10) {
        g jVar;
        c cVar2 = c.BINARY;
        if (cVar != cVar2 && cVar != c.TEXT) {
            throw new IllegalArgumentException("Only Opcode.BINARY or  Opcode.TEXT are allowed");
        }
        if (this.f337850b != null) {
            jVar = new org.java_websocket.framing.c();
        } else {
            this.f337850b = cVar;
            if (cVar == cVar2) {
                jVar = new org.java_websocket.framing.a();
            } else {
                jVar = cVar == c.TEXT ? new j() : null;
            }
        }
        jVar.l(byteBuffer);
        jVar.k(z10);
        try {
            jVar.j();
            if (z10) {
                this.f337850b = null;
            } else {
                this.f337850b = cVar;
            }
            return Collections.singletonList(jVar);
        } catch (fm.c e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public abstract a f();

    public abstract ByteBuffer g(org.java_websocket.framing.f fVar);

    public abstract List<org.java_websocket.framing.f> h(String str, boolean z10);

    public abstract List<org.java_websocket.framing.f> i(ByteBuffer byteBuffer, boolean z10);

    public List<ByteBuffer> j(im.f fVar) {
        return m(fVar, true);
    }

    @Deprecated
    public List<ByteBuffer> k(im.f fVar, e eVar) {
        return j(fVar);
    }

    @Deprecated
    public List<ByteBuffer> l(im.f fVar, e eVar, boolean z10) {
        return m(fVar, z10);
    }

    public List<ByteBuffer> m(im.f fVar, boolean z10) {
        StringBuilder sb2 = new StringBuilder(100);
        if (fVar instanceof im.a) {
            sb2.append("GET ");
            sb2.append(((im.a) fVar).c());
            sb2.append(" HTTP/1.1");
        } else {
            if (!(fVar instanceof h)) {
                throw new IllegalArgumentException("unknown role");
            }
            sb2.append("HTTP/1.1 101 ");
            sb2.append(((h) fVar).b());
        }
        sb2.append("\r\n");
        Iterator<String> itJ = fVar.j();
        while (itJ.hasNext()) {
            String next = itJ.next();
            String strG = fVar.g(next);
            sb2.append(next);
            sb2.append(": ");
            sb2.append(strG);
            sb2.append("\r\n");
        }
        sb2.append("\r\n");
        byte[] bArrA = org.java_websocket.util.c.a(sb2.toString());
        byte[] content = z10 ? fVar.getContent() : null;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((content == null ? 0 : content.length) + bArrA.length);
        byteBufferAllocate.put(bArrA);
        if (content != null) {
            byteBufferAllocate.put(content);
        }
        byteBufferAllocate.flip();
        return Collections.singletonList(byteBufferAllocate);
    }

    public abstract em.a n();

    public e o() {
        return this.f337849a;
    }

    public abstract im.b p(im.b bVar) throws f;

    public abstract im.c q(im.a aVar, i iVar) throws f;

    public abstract void r(org.java_websocket.i iVar, org.java_websocket.framing.f fVar) throws fm.c;

    public String toString() {
        return getClass().getSimpleName();
    }

    int u(im.f fVar) {
        String strG = fVar.g(com.google.common.net.d.f119482c2);
        if (strG.length() > 0) {
            try {
                return new Integer(strG.trim()).intValue();
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    public abstract void v();

    public void w(e eVar) {
        this.f337849a = eVar;
    }

    public abstract List<org.java_websocket.framing.f> x(ByteBuffer byteBuffer) throws fm.c;

    public im.f y(ByteBuffer byteBuffer) throws f {
        return z(byteBuffer, this.f337849a);
    }
}
