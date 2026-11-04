package androidx.media3.common.audio;

import androidx.media3.common.util.b1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes3.dex */
@b1
public abstract class i implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected g.a f60338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected g.a f60339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private g.a f60340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private g.a f60341e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ByteBuffer f60342f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ByteBuffer f60343g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f60344h;

    public i() {
        ByteBuffer byteBuffer = g.f60331a;
        this.f60342f = byteBuffer;
        this.f60343g = byteBuffer;
        g.a aVar = g.a.f60332e;
        this.f60340d = aVar;
        this.f60341e = aVar;
        this.f60338b = aVar;
        this.f60339c = aVar;
    }

    @Override // androidx.media3.common.audio.g
    @androidx.annotation.i
    public boolean a() {
        return this.f60344h && this.f60343g == g.f60331a;
    }

    @Override // androidx.media3.common.audio.g
    public final void c() {
        this.f60344h = true;
        j();
    }

    @Override // androidx.media3.common.audio.g
    @androidx.annotation.i
    public ByteBuffer d() {
        ByteBuffer byteBuffer = this.f60343g;
        this.f60343g = g.f60331a;
        return byteBuffer;
    }

    @Override // androidx.media3.common.audio.g
    public final g.a e(g.a aVar) throws g.b {
        this.f60340d = aVar;
        this.f60341e = h(aVar);
        return isActive() ? this.f60341e : g.a.f60332e;
    }

    @Override // androidx.media3.common.audio.g
    public final void flush() {
        this.f60343g = g.f60331a;
        this.f60344h = false;
        this.f60338b = this.f60340d;
        this.f60339c = this.f60341e;
        i();
    }

    protected final boolean g() {
        return this.f60343g.hasRemaining();
    }

    protected g.a h(g.a aVar) throws g.b {
        return g.a.f60332e;
    }

    protected void i() {
    }

    @Override // androidx.media3.common.audio.g
    @androidx.annotation.i
    public boolean isActive() {
        return this.f60341e != g.a.f60332e;
    }

    protected void j() {
    }

    protected void k() {
    }

    protected final ByteBuffer l(int i10) {
        if (this.f60342f.capacity() < i10) {
            this.f60342f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f60342f.clear();
        }
        ByteBuffer byteBuffer = this.f60342f;
        this.f60343g = byteBuffer;
        return byteBuffer;
    }

    @Override // androidx.media3.common.audio.g
    public final void reset() {
        flush();
        this.f60342f = g.f60331a;
        g.a aVar = g.a.f60332e;
        this.f60340d = aVar;
        this.f60341e = aVar;
        this.f60338b = aVar;
        this.f60339c = aVar;
        k();
    }
}
