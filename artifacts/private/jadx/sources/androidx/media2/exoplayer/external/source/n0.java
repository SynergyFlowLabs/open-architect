package androidx.media2.exoplayer.external.source;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
final class n0 implements x, x.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x[] f56296a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j f56298c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.p0
    private x.a f56300e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.p0
    private TrackGroupArray f56301f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private w0 f56303h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayList<x> f56299d = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final IdentityHashMap<v0, Integer> f56297b = new IdentityHashMap<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private x[] f56302g = new x[0];

    public n0(j compositeSequenceableLoaderFactory, x... periods) {
        this.f56298c = compositeSequenceableLoaderFactory;
        this.f56296a = periods;
        this.f56303h = compositeSequenceableLoaderFactory.a(new w0[0]);
    }

    @Override // androidx.media2.exoplayer.external.source.x, androidx.media2.exoplayer.external.source.w0
    public long b() {
        return this.f56303h.b();
    }

    @Override // androidx.media2.exoplayer.external.source.x, androidx.media2.exoplayer.external.source.w0
    public void c(long positionUs) {
        this.f56303h.c(positionUs);
    }

    @Override // androidx.media2.exoplayer.external.source.w0.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void j(x ignored) {
        ((x.a) androidx.media2.exoplayer.external.util.a.g(this.f56300e)).j(this);
    }

    @Override // androidx.media2.exoplayer.external.source.x, androidx.media2.exoplayer.external.source.w0
    public long e() {
        return this.f56303h.e();
    }

    @Override // androidx.media2.exoplayer.external.source.x
    public List f(List list) {
        return w.a(this, list);
    }

    @Override // androidx.media2.exoplayer.external.source.x.a
    public void g(x preparedPeriod) {
        this.f56299d.remove(preparedPeriod);
        if (this.f56299d.isEmpty()) {
            int i10 = 0;
            for (x xVar : this.f56296a) {
                i10 += xVar.m().f55657a;
            }
            TrackGroup[] trackGroupArr = new TrackGroup[i10];
            int i11 = 0;
            for (x xVar2 : this.f56296a) {
                TrackGroupArray trackGroupArrayM = xVar2.m();
                int i12 = trackGroupArrayM.f55657a;
                int i13 = 0;
                while (i13 < i12) {
                    trackGroupArr[i11] = trackGroupArrayM.a(i13);
                    i13++;
                    i11++;
                }
            }
            this.f56301f = new TrackGroupArray(trackGroupArr);
            ((x.a) androidx.media2.exoplayer.external.util.a.g(this.f56300e)).g(this);
        }
    }

    @Override // androidx.media2.exoplayer.external.source.x
    public long h(long positionUs) {
        long jH = this.f56302g[0].h(positionUs);
        int i10 = 1;
        while (true) {
            x[] xVarArr = this.f56302g;
            if (i10 >= xVarArr.length) {
                return jH;
            }
            if (xVarArr[i10].h(jH) != jH) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i10++;
        }
    }

    @Override // androidx.media2.exoplayer.external.source.x
    public long i() {
        long jI = this.f56296a[0].i();
        int i10 = 1;
        while (true) {
            x[] xVarArr = this.f56296a;
            if (i10 >= xVarArr.length) {
                if (jI != -9223372036854775807L) {
                    for (x xVar : this.f56302g) {
                        if (xVar != this.f56296a[0] && xVar.h(jI) != jI) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                }
                return jI;
            }
            if (xVarArr[i10].i() != -9223372036854775807L) {
                throw new IllegalStateException("Child reported discontinuity.");
            }
            i10++;
        }
    }

    @Override // androidx.media2.exoplayer.external.source.x, androidx.media2.exoplayer.external.source.w0
    public boolean k(long positionUs) {
        if (this.f56299d.isEmpty()) {
            return this.f56303h.k(positionUs);
        }
        int size = this.f56299d.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f56299d.get(i10).k(positionUs);
        }
        return false;
    }

    @Override // androidx.media2.exoplayer.external.source.x
    public TrackGroupArray m() {
        return (TrackGroupArray) androidx.media2.exoplayer.external.util.a.g(this.f56301f);
    }

    @Override // androidx.media2.exoplayer.external.source.x
    public long n(long positionUs, androidx.media2.exoplayer.external.x0 seekParameters) {
        x[] xVarArr = this.f56302g;
        return (xVarArr.length > 0 ? xVarArr[0] : this.f56296a[0]).n(positionUs, seekParameters);
    }

    @Override // androidx.media2.exoplayer.external.source.x
    public void o() throws IOException {
        for (x xVar : this.f56296a) {
            xVar.o();
        }
    }

    @Override // androidx.media2.exoplayer.external.source.x
    public void p(long positionUs, boolean toKeyframe) {
        for (x xVar : this.f56302g) {
            xVar.p(positionUs, toKeyframe);
        }
    }

    @Override // androidx.media2.exoplayer.external.source.x
    public void r(x.a callback, long positionUs) {
        this.f56300e = callback;
        Collections.addAll(this.f56299d, this.f56296a);
        for (x xVar : this.f56296a) {
            xVar.r(this, positionUs);
        }
    }

    @Override // androidx.media2.exoplayer.external.source.x
    public long s(androidx.media2.exoplayer.external.trackselection.m[] selections, boolean[] mayRetainStreamFlags, v0[] streams, boolean[] streamResetFlags, long positionUs) {
        androidx.media2.exoplayer.external.trackselection.m[] mVarArr = selections;
        int[] iArr = new int[mVarArr.length];
        int[] iArr2 = new int[mVarArr.length];
        for (int i10 = 0; i10 < mVarArr.length; i10++) {
            v0 v0Var = streams[i10];
            iArr[i10] = v0Var == null ? -1 : this.f56297b.get(v0Var).intValue();
            iArr2[i10] = -1;
            androidx.media2.exoplayer.external.trackselection.m mVar = mVarArr[i10];
            if (mVar != null) {
                TrackGroup trackGroupG = mVar.g();
                int i11 = 0;
                while (true) {
                    x[] xVarArr = this.f56296a;
                    if (i11 >= xVarArr.length) {
                        break;
                    }
                    if (xVarArr[i11].m().b(trackGroupG) != -1) {
                        iArr2[i10] = i11;
                        break;
                    }
                    i11++;
                }
            }
        }
        this.f56297b.clear();
        int length = mVarArr.length;
        v0[] v0VarArr = new v0[length];
        v0[] v0VarArr2 = new v0[mVarArr.length];
        androidx.media2.exoplayer.external.trackselection.m[] mVarArr2 = new androidx.media2.exoplayer.external.trackselection.m[mVarArr.length];
        ArrayList arrayList = new ArrayList(this.f56296a.length);
        long j10 = positionUs;
        int i12 = 0;
        while (i12 < this.f56296a.length) {
            for (int i13 = 0; i13 < mVarArr.length; i13++) {
                androidx.media2.exoplayer.external.trackselection.m mVar2 = null;
                v0VarArr2[i13] = iArr[i13] == i12 ? streams[i13] : null;
                if (iArr2[i13] == i12) {
                    mVar2 = mVarArr[i13];
                }
                mVarArr2[i13] = mVar2;
            }
            int i14 = i12;
            long jS = this.f56296a[i12].s(mVarArr2, mayRetainStreamFlags, v0VarArr2, streamResetFlags, j10);
            if (i14 == 0) {
                j10 = jS;
            } else if (jS != j10) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            int i15 = 0;
            boolean z10 = false;
            while (i15 < mVarArr.length) {
                if (iArr2[i15] == i14) {
                    v0 v0Var2 = (v0) androidx.media2.exoplayer.external.util.a.g(v0VarArr2[i15]);
                    v0VarArr[i15] = v0VarArr2[i15];
                    this.f56297b.put(v0Var2, Integer.valueOf(i14));
                    z10 = true;
                } else if (iArr[i15] == i14) {
                    androidx.media2.exoplayer.external.util.a.i(v0VarArr2[i15] == null);
                }
                i15++;
                mVarArr = selections;
            }
            if (z10) {
                arrayList.add(this.f56296a[i14]);
            }
            i12 = i14 + 1;
            mVarArr = selections;
        }
        System.arraycopy(v0VarArr, 0, streams, 0, length);
        x[] xVarArr2 = new x[arrayList.size()];
        this.f56302g = xVarArr2;
        arrayList.toArray(xVarArr2);
        this.f56303h = this.f56298c.a(this.f56302g);
        return j10;
    }
}
