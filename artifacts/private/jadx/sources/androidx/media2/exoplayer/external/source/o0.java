package androidx.media2.exoplayer.external.source;

import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
public final class o0 extends h<Integer> {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f56304o = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final z[] f56305i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.z0[] f56306j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ArrayList<z> f56307k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final j f56308l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f56309m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.p0
    private a f56310n;

    public static final class a extends IOException {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f56311b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f56312a;

        /* JADX INFO: renamed from: androidx.media2.exoplayer.external.source.o0$a$a, reason: collision with other inner class name */
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface InterfaceC0520a {
        }

        public a(int reason) {
            this.f56312a = reason;
        }
    }

    public o0(z... mediaSources) {
        this(new n(), mediaSources);
    }

    @androidx.annotation.p0
    private a F(androidx.media2.exoplayer.external.z0 timeline) {
        if (this.f56309m == -1) {
            this.f56309m = timeline.i();
        } else if (timeline.i() != this.f56309m) {
            return new a(0);
        }
        return null;
    }

    @Override // androidx.media2.exoplayer.external.source.c, androidx.media2.exoplayer.external.source.z
    @androidx.annotation.p0
    public Object E() {
        z[] zVarArr = this.f56305i;
        if (zVarArr.length > 0) {
            return zVarArr[0].E();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media2.exoplayer.external.source.h
    @androidx.annotation.p0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public z.a w(Integer id2, z.a mediaPeriodId) {
        if (id2.intValue() == 0) {
            return mediaPeriodId;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media2.exoplayer.external.source.h
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void z(Integer id2, z mediaSource, androidx.media2.exoplayer.external.z0 timeline) {
        if (this.f56310n == null) {
            this.f56310n = F(timeline);
        }
        if (this.f56310n != null) {
            return;
        }
        this.f56307k.remove(mediaSource);
        this.f56306j[id2.intValue()] = timeline;
        if (this.f56307k.isEmpty()) {
            s(this.f56306j[0]);
        }
    }

    @Override // androidx.media2.exoplayer.external.source.h, androidx.media2.exoplayer.external.source.z
    public void a() throws IOException {
        a aVar = this.f56310n;
        if (aVar != null) {
            throw aVar;
        }
        super.a();
    }

    @Override // androidx.media2.exoplayer.external.source.z
    public void c(x mediaPeriod) {
        n0 n0Var = (n0) mediaPeriod;
        int i10 = 0;
        while (true) {
            z[] zVarArr = this.f56305i;
            if (i10 >= zVarArr.length) {
                return;
            }
            zVarArr[i10].c(n0Var.f56296a[i10]);
            i10++;
        }
    }

    @Override // androidx.media2.exoplayer.external.source.z
    public x e(z.a id2, androidx.media2.exoplayer.external.upstream.b allocator, long startPositionUs) {
        int length = this.f56305i.length;
        x[] xVarArr = new x[length];
        int iB = this.f56306j[0].b(id2.f56507a);
        for (int i10 = 0; i10 < length; i10++) {
            xVarArr[i10] = this.f56305i[i10].e(id2.a(this.f56306j[i10].m(iB)), allocator, startPositionUs);
        }
        return new n0(this.f56308l, xVarArr);
    }

    @Override // androidx.media2.exoplayer.external.source.h, androidx.media2.exoplayer.external.source.c
    protected void r(@androidx.annotation.p0 androidx.media2.exoplayer.external.upstream.q0 mediaTransferListener) {
        super.r(mediaTransferListener);
        for (int i10 = 0; i10 < this.f56305i.length; i10++) {
            B(Integer.valueOf(i10), this.f56305i[i10]);
        }
    }

    @Override // androidx.media2.exoplayer.external.source.h, androidx.media2.exoplayer.external.source.c
    protected void t() {
        super.t();
        Arrays.fill(this.f56306j, (Object) null);
        this.f56309m = -1;
        this.f56310n = null;
        this.f56307k.clear();
        Collections.addAll(this.f56307k, this.f56305i);
    }

    public o0(j compositeSequenceableLoaderFactory, z... mediaSources) {
        this.f56305i = mediaSources;
        this.f56308l = compositeSequenceableLoaderFactory;
        this.f56307k = new ArrayList<>(Arrays.asList(mediaSources));
        this.f56309m = -1;
        this.f56306j = new androidx.media2.exoplayer.external.z0[mediaSources.length];
    }
}
