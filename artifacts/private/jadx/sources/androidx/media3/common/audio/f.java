package androidx.media3.common.audio;

import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import com.google.common.collect.l6;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l6<g> f60325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<g> f60326b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ByteBuffer[] f60327c = new ByteBuffer[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private g.a f60328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private g.a f60329e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f60330f;

    public f(l6<g> l6Var) {
        this.f60325a = l6Var;
        int i10 = 6 << 0;
        g.a aVar = g.a.f60332e;
        this.f60328d = aVar;
        this.f60329e = aVar;
        this.f60330f = false;
    }

    private int c() {
        return this.f60327c.length - 1;
    }

    private void h(ByteBuffer byteBuffer) {
        boolean z10;
        for (boolean z11 = true; z11; z11 = z10) {
            z10 = false;
            for (int i10 = 0; i10 <= c(); i10++) {
                if (!this.f60327c[i10].hasRemaining()) {
                    g gVar = this.f60326b.get(i10);
                    if (!gVar.a()) {
                        ByteBuffer byteBuffer2 = i10 > 0 ? this.f60327c[i10 - 1] : byteBuffer.hasRemaining() ? byteBuffer : g.f60331a;
                        long jRemaining = byteBuffer2.remaining();
                        gVar.b(byteBuffer2);
                        this.f60327c[i10] = gVar.d();
                        z10 |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.f60327c[i10].hasRemaining();
                    } else if (!this.f60327c[i10].hasRemaining() && i10 < c()) {
                        this.f60326b.get(i10 + 1).c();
                    }
                }
            }
        }
    }

    @z7.a
    public g.a a(g.a aVar) throws g.b {
        if (aVar.equals(g.a.f60332e)) {
            throw new g.b(aVar);
        }
        for (int i10 = 0; i10 < this.f60325a.size(); i10++) {
            g gVar = this.f60325a.get(i10);
            g.a aVarE = gVar.e(aVar);
            if (gVar.isActive()) {
                androidx.media3.common.util.a.i(!aVarE.equals(g.a.f60332e));
                aVar = aVarE;
            }
        }
        this.f60329e = aVar;
        return aVar;
    }

    public void b() {
        this.f60326b.clear();
        this.f60328d = this.f60329e;
        this.f60330f = false;
        for (int i10 = 0; i10 < this.f60325a.size(); i10++) {
            g gVar = this.f60325a.get(i10);
            gVar.flush();
            if (gVar.isActive()) {
                this.f60326b.add(gVar);
            }
        }
        this.f60327c = new ByteBuffer[this.f60326b.size()];
        for (int i11 = 0; i11 <= c(); i11++) {
            this.f60327c[i11] = this.f60326b.get(i11).d();
        }
    }

    public ByteBuffer d() {
        if (!g()) {
            return g.f60331a;
        }
        ByteBuffer byteBuffer = this.f60327c[c()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        h(g.f60331a);
        return this.f60327c[c()];
    }

    public g.a e() {
        return this.f60328d;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f60325a.size() != fVar.f60325a.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f60325a.size(); i10++) {
            if (this.f60325a.get(i10) != fVar.f60325a.get(i10)) {
                return false;
            }
        }
        return true;
    }

    public boolean f() {
        return this.f60330f && this.f60326b.get(c()).a() && !this.f60327c[c()].hasRemaining();
    }

    public boolean g() {
        return !this.f60326b.isEmpty();
    }

    public int hashCode() {
        return this.f60325a.hashCode();
    }

    public void i() {
        if (g() && !this.f60330f) {
            this.f60330f = true;
            this.f60326b.get(0).c();
        }
    }

    public void j(ByteBuffer byteBuffer) {
        if (g() && !this.f60330f) {
            h(byteBuffer);
        }
    }

    public void k() {
        for (int i10 = 0; i10 < this.f60325a.size(); i10++) {
            g gVar = this.f60325a.get(i10);
            gVar.flush();
            gVar.reset();
        }
        this.f60327c = new ByteBuffer[0];
        g.a aVar = g.a.f60332e;
        this.f60328d = aVar;
        this.f60329e = aVar;
        this.f60330f = false;
    }
}
