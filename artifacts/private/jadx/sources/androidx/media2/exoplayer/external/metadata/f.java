package androidx.media2.exoplayer.external.metadata;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.d0;
import androidx.media2.exoplayer.external.i;
import androidx.media2.exoplayer.external.util.q0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class f extends androidx.media2.exoplayer.external.b implements Handler.Callback {
    private static final int Z = 0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final int f55438p0 = 5;
    private boolean X;
    private long Y;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final c f55439j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final e f55440k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @p0
    private final Handler f55441l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final d0 f55442m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final d f55443n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Metadata[] f55444o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final long[] f55445s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f55446t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f55447v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private b f55448w;

    public f(e output, @p0 Looper outputLooper) {
        this(output, outputLooper, c.f55423a);
    }

    private void K(Metadata metadata, List<Metadata.Entry> decodedEntries) {
        for (int i10 = 0; i10 < metadata.e(); i10++) {
            Format formatO0 = metadata.c(i10).O0();
            if (formatO0 == null || !this.f55439j.b(formatO0)) {
                decodedEntries.add(metadata.c(i10));
            } else {
                b bVarA = this.f55439j.a(formatO0);
                byte[] bArr = (byte[]) androidx.media2.exoplayer.external.util.a.g(metadata.c(i10).Y());
                this.f55443n.o();
                this.f55443n.z(bArr.length);
                this.f55443n.f53789c.put(bArr);
                this.f55443n.D();
                Metadata metadataA = bVarA.a(this.f55443n);
                if (metadataA != null) {
                    K(metadataA, decodedEntries);
                }
            }
        }
    }

    private void L() {
        Arrays.fill(this.f55444o, (Object) null);
        this.f55446t = 0;
        this.f55447v = 0;
    }

    private void M(Metadata metadata) {
        Handler handler = this.f55441l;
        if (handler != null) {
            handler.obtainMessage(0, metadata).sendToTarget();
        } else {
            N(metadata);
        }
    }

    private void N(Metadata metadata) {
        this.f55440k.P(metadata);
    }

    @Override // androidx.media2.exoplayer.external.b
    protected void C(long positionUs, boolean joining) {
        L();
        this.X = false;
    }

    @Override // androidx.media2.exoplayer.external.b
    protected void G(Format[] formats, long offsetUs) throws i {
        this.f55448w = this.f55439j.a(formats[0]);
    }

    @Override // androidx.media2.exoplayer.external.t0
    public boolean a() {
        return this.X;
    }

    @Override // androidx.media2.exoplayer.external.u0
    public int b(Format format) {
        if (this.f55439j.b(format)) {
            return androidx.media2.exoplayer.external.b.J(null, format.f53108l) ? 4 : 2;
        }
        return 0;
    }

    @Override // androidx.media2.exoplayer.external.t0
    public void g(long positionUs, long elapsedRealtimeUs) throws i {
        if (!this.X && this.f55447v < 5) {
            this.f55443n.o();
            int iH = H(this.f55442m, this.f55443n, false);
            if (iH == -4) {
                if (this.f55443n.t()) {
                    this.X = true;
                } else if (!this.f55443n.s()) {
                    d dVar = this.f55443n;
                    dVar.f55424j = this.Y;
                    dVar.D();
                    Metadata metadataA = this.f55448w.a(this.f55443n);
                    if (metadataA != null) {
                        ArrayList arrayList = new ArrayList(metadataA.e());
                        K(metadataA, arrayList);
                        if (!arrayList.isEmpty()) {
                            Metadata metadata = new Metadata(arrayList);
                            int i10 = this.f55446t;
                            int i11 = this.f55447v;
                            int i12 = (i10 + i11) % 5;
                            this.f55444o[i12] = metadata;
                            this.f55445s[i12] = this.f55443n.f53790d;
                            this.f55447v = i11 + 1;
                        }
                    }
                }
            } else if (iH == -5) {
                this.Y = this.f55442m.f53762c.f53109m;
            }
        }
        if (this.f55447v > 0) {
            long[] jArr = this.f55445s;
            int i13 = this.f55446t;
            if (jArr[i13] <= positionUs) {
                M(this.f55444o[i13]);
                Metadata[] metadataArr = this.f55444o;
                int i14 = this.f55446t;
                metadataArr[i14] = null;
                this.f55446t = (i14 + 1) % 5;
                this.f55447v--;
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message msg) {
        if (msg.what != 0) {
            throw new IllegalStateException();
        }
        N((Metadata) msg.obj);
        return true;
    }

    @Override // androidx.media2.exoplayer.external.t0
    public boolean isReady() {
        return true;
    }

    @Override // androidx.media2.exoplayer.external.b
    protected void o() {
        L();
        this.f55448w = null;
    }

    public f(e output, @p0 Looper outputLooper, c decoderFactory) {
        super(4);
        this.f55440k = (e) androidx.media2.exoplayer.external.util.a.g(output);
        this.f55441l = outputLooper == null ? null : q0.w(outputLooper, this);
        this.f55439j = (c) androidx.media2.exoplayer.external.util.a.g(decoderFactory);
        this.f55442m = new d0();
        this.f55443n = new d();
        this.f55444o = new Metadata[5];
        this.f55445s = new long[5];
    }
}
