package androidx.media3.exoplayer.audio;

import android.util.SparseArray;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
@b1
public class w0 implements t0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f63420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f63421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseArray<b> f63422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ByteBuffer f63423d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private androidx.media3.common.audio.g.a f63424e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private androidx.media3.common.audio.g.a f63425f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private androidx.media3.common.audio.k f63426g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f63427h;

    public interface a {
        void a(int i10, b bVar);
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f63428a = 1.0f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f63429b = -1.0f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private double f63430c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f63431d;

        public void a(@androidx.annotation.x(from = -1.0d, to = 1.0d) float f10) {
            com.google.common.base.j0.d(f10 >= -1.0f && f10 <= 1.0f);
            this.f63428a = Math.min(this.f63428a, f10);
            this.f63429b = Math.max(this.f63429b, f10);
            double d10 = f10;
            this.f63430c += d10 * d10;
            this.f63431d++;
        }

        public double b() {
            return this.f63429b;
        }

        public double c() {
            return this.f63428a;
        }

        public double d() {
            return Math.sqrt(this.f63430c / ((double) this.f63431d));
        }

        public int e() {
            return this.f63431d;
        }
    }

    public w0(int i10, int i11, a aVar) {
        this.f63420a = i10;
        this.f63421b = aVar;
        this.f63423d = ByteBuffer.allocate(k1.E0(4, i11));
        this.f63422c = new SparseArray<>(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            this.f63422c.append(i12, new b());
        }
    }

    @Override // androidx.media3.exoplayer.audio.t0.a
    public void a(ByteBuffer byteBuffer) {
        androidx.media3.common.util.a.k(this.f63424e);
        androidx.media3.common.util.a.k(this.f63425f);
        androidx.media3.common.util.a.k(this.f63426g);
        while (byteBuffer.hasRemaining()) {
            this.f63423d.rewind();
            ByteBuffer byteBuffer2 = byteBuffer;
            androidx.media3.common.audio.e.f(byteBuffer2, this.f63424e, this.f63423d, this.f63425f, this.f63426g, 1, false, true);
            this.f63423d.rewind();
            for (int i10 = 0; i10 < this.f63422c.size(); i10++) {
                b bVar = this.f63422c.get(i10);
                bVar.a(this.f63423d.getFloat());
                if (bVar.e() >= this.f63427h) {
                    this.f63421b.a(i10, bVar);
                    this.f63422c.put(i10, new b());
                }
            }
            byteBuffer = byteBuffer2;
        }
    }

    @Override // androidx.media3.exoplayer.audio.t0.a
    public void b(int i10, int i11, int i12) {
        this.f63427h = i10 / this.f63420a;
        this.f63424e = new androidx.media3.common.audio.g.a(i10, i11, i12);
        this.f63425f = new androidx.media3.common.audio.g.a(i10, this.f63422c.size(), 4);
        this.f63426g = androidx.media3.common.audio.k.b(i11, this.f63422c.size());
    }
}
