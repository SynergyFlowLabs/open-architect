package androidx.media3.extractor.text.cea;

import androidx.annotation.p0;
import androidx.media3.common.util.k1;
import androidx.media3.decoder.h;
import androidx.media3.extractor.text.j;
import androidx.media3.extractor.text.k;
import androidx.media3.extractor.text.l;
import androidx.media3.extractor.text.o;
import androidx.media3.extractor.text.p;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes3.dex */
abstract class e implements k {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f68432h = 10;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f68433i = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayDeque<b> f68434a = new ArrayDeque<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayDeque<p> f68435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayDeque<b> f68436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private b f68437d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f68438e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f68439f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f68440g;

    private static final class b extends o implements Comparable<b> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private long f68441n;

        private b() {
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            if (s() != bVar.s()) {
                return s() ? 1 : -1;
            }
            long j10 = this.f62702f - bVar.f62702f;
            if (j10 == 0) {
                j10 = this.f68441n - bVar.f68441n;
                if (j10 == 0) {
                    return 0;
                }
            }
            return j10 > 0 ? 1 : -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c extends p {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private h.a<c> f68442g;

        public c(h.a<c> aVar) {
            this.f68442g = aVar;
        }

        @Override // androidx.media3.decoder.h
        public final void D() {
            this.f68442g.a(this);
        }
    }

    public e() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f68434a.add(new b());
        }
        this.f68435b = new ArrayDeque<>();
        for (int i11 = 0; i11 < 2; i11++) {
            this.f68435b.add(new c(new h.a() { // from class: androidx.media3.extractor.text.cea.d
                @Override // androidx.media3.decoder.h.a
                public final void a(h hVar) {
                    this.f68431a.p((e.c) hVar);
                }
            }));
        }
        this.f68436c = new ArrayDeque<>();
        this.f68440g = -9223372036854775807L;
    }

    private void o(b bVar) {
        bVar.o();
        this.f68434a.add(bVar);
    }

    @Override // androidx.media3.extractor.text.k
    public void d(long j10) {
        this.f68438e = j10;
    }

    @Override // androidx.media3.decoder.e
    public final void e(long j10) {
        this.f68440g = j10;
    }

    @Override // androidx.media3.decoder.e
    public void flush() {
        this.f68439f = 0L;
        this.f68438e = 0L;
        while (!this.f68436c.isEmpty()) {
            o((b) k1.o(this.f68436c.poll()));
        }
        b bVar = this.f68437d;
        if (bVar != null) {
            o(bVar);
            this.f68437d = null;
        }
    }

    protected abstract j g();

    @Override // androidx.media3.decoder.e
    public abstract String getName();

    protected abstract void h(o oVar);

    @Override // androidx.media3.decoder.e
    @p0
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public o c() throws l {
        androidx.media3.common.util.a.i(this.f68437d == null);
        if (this.f68434a.isEmpty()) {
            return null;
        }
        b bVarPollFirst = this.f68434a.pollFirst();
        this.f68437d = bVarPollFirst;
        return bVarPollFirst;
    }

    @Override // androidx.media3.decoder.e
    @p0
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public p a() throws l {
        if (this.f68435b.isEmpty()) {
            return null;
        }
        while (!this.f68436c.isEmpty() && ((b) k1.o(this.f68436c.peek())).f62702f <= this.f68438e) {
            b bVar = (b) k1.o(this.f68436c.poll());
            if (bVar.s()) {
                p pVar = (p) k1.o(this.f68435b.pollFirst());
                pVar.c(4);
                o(bVar);
                return pVar;
            }
            h(bVar);
            if (m()) {
                j jVarG = g();
                p pVar2 = (p) k1.o(this.f68435b.pollFirst());
                pVar2.E(bVar.f62702f, jVarG, Long.MAX_VALUE);
                o(bVar);
                return pVar2;
            }
            o(bVar);
        }
        return null;
    }

    @p0
    protected final p k() {
        return this.f68435b.pollFirst();
    }

    protected final long l() {
        return this.f68438e;
    }

    protected abstract boolean m();

    /* JADX WARN: Code duplicated, block: B:15:0x003a  */
    @Override // androidx.media3.decoder.e
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void b(o oVar) throws l {
        androidx.media3.common.util.a.a(oVar == this.f68437d);
        b bVar = (b) oVar;
        if (bVar.s()) {
            long j10 = this.f68439f;
            this.f68439f = 1 + j10;
            bVar.f68441n = j10;
            this.f68436c.add(bVar);
        } else {
            long j11 = bVar.f62702f;
            if (j11 != Long.MIN_VALUE) {
                long j12 = this.f68440g;
                if (j12 == -9223372036854775807L || j11 >= j12) {
                    long j13 = this.f68439f;
                    this.f68439f = 1 + j13;
                    bVar.f68441n = j13;
                    this.f68436c.add(bVar);
                } else {
                    o(bVar);
                }
            } else {
                long j14 = this.f68439f;
                this.f68439f = 1 + j14;
                bVar.f68441n = j14;
                this.f68436c.add(bVar);
            }
        }
        this.f68437d = null;
    }

    protected void p(p pVar) {
        pVar.o();
        this.f68435b.add(pVar);
    }

    @Override // androidx.media3.decoder.e
    public void release() {
    }
}
