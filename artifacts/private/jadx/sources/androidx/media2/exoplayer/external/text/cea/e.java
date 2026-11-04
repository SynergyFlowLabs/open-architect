package androidx.media2.exoplayer.external.text.cea;

import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.media2.exoplayer.external.text.i;
import androidx.media2.exoplayer.external.text.j;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
abstract class e implements androidx.media2.exoplayer.external.text.f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f56679g = 10;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f56680h = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayDeque<b> f56681a = new ArrayDeque<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayDeque<j> f56682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PriorityQueue<b> f56683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f56684d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f56685e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f56686f;

    private static final class b extends i implements Comparable<b> {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f56687k;

        private b() {
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public int compareTo(@NonNull b other) {
            if (t() != other.t()) {
                return t() ? 1 : -1;
            }
            long j10 = this.f53790d - other.f53790d;
            if (j10 == 0) {
                j10 = this.f56687k - other.f56687k;
                if (j10 == 0) {
                    return 0;
                }
            }
            return j10 > 0 ? 1 : -1;
        }
    }

    private final class c extends j {
        private c() {
        }

        @Override // androidx.media2.exoplayer.external.text.j, androidx.media2.exoplayer.external.decoder.f
        public final void x() {
            e.this.l(this);
        }
    }

    public e() {
        int i10 = 0;
        while (true) {
            if (i10 >= 10) {
                break;
            }
            this.f56681a.add(new b());
            i10++;
        }
        this.f56682b = new ArrayDeque<>();
        for (int i11 = 0; i11 < 2; i11++) {
            this.f56682b.add(new c());
        }
        this.f56683c = new PriorityQueue<>();
    }

    private void k(b inputBuffer) {
        inputBuffer.o();
        this.f56681a.add(inputBuffer);
    }

    @Override // androidx.media2.exoplayer.external.text.f
    public void d(long positionUs) {
        this.f56685e = positionUs;
    }

    protected abstract androidx.media2.exoplayer.external.text.e e();

    protected abstract void f(i inputBuffer);

    @Override // androidx.media2.exoplayer.external.decoder.c
    public void flush() {
        this.f56686f = 0L;
        this.f56685e = 0L;
        while (!this.f56683c.isEmpty()) {
            k(this.f56683c.poll());
        }
        b bVar = this.f56684d;
        if (bVar != null) {
            k(bVar);
            this.f56684d = null;
        }
    }

    @Override // androidx.media2.exoplayer.external.decoder.c
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public i c() throws androidx.media2.exoplayer.external.text.g {
        androidx.media2.exoplayer.external.util.a.i(this.f56684d == null);
        if (this.f56681a.isEmpty()) {
            return null;
        }
        b bVarPollFirst = this.f56681a.pollFirst();
        this.f56684d = bVarPollFirst;
        return bVarPollFirst;
    }

    @Override // androidx.media2.exoplayer.external.decoder.c
    public abstract String getName();

    @Override // androidx.media2.exoplayer.external.decoder.c
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public j a() throws androidx.media2.exoplayer.external.text.g {
        if (this.f56682b.isEmpty()) {
            return null;
        }
        while (!this.f56683c.isEmpty() && this.f56683c.peek().f53790d <= this.f56685e) {
            b bVarPoll = this.f56683c.poll();
            if (bVarPoll.t()) {
                j jVarPollFirst = this.f56682b.pollFirst();
                jVarPollFirst.c(4);
                k(bVarPoll);
                return jVarPollFirst;
            }
            f(bVarPoll);
            if (i()) {
                androidx.media2.exoplayer.external.text.e eVarE = e();
                if (!bVarPoll.s()) {
                    j jVarPollFirst2 = this.f56682b.pollFirst();
                    jVarPollFirst2.z(bVarPoll.f53790d, eVarE, Long.MAX_VALUE);
                    k(bVarPoll);
                    return jVarPollFirst2;
                }
            }
            k(bVarPoll);
        }
        return null;
    }

    protected abstract boolean i();

    @Override // androidx.media2.exoplayer.external.decoder.c
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void b(i inputBuffer) throws androidx.media2.exoplayer.external.text.g {
        androidx.media2.exoplayer.external.util.a.a(inputBuffer == this.f56684d);
        if (inputBuffer.s()) {
            k(this.f56684d);
        } else {
            b bVar = this.f56684d;
            long j10 = this.f56686f;
            this.f56686f = 1 + j10;
            bVar.f56687k = j10;
            this.f56683c.add(this.f56684d);
        }
        this.f56684d = null;
    }

    protected void l(j outputBuffer) {
        outputBuffer.o();
        this.f56682b.add(outputBuffer);
    }

    @Override // androidx.media2.exoplayer.external.decoder.c
    public void release() {
    }
}
