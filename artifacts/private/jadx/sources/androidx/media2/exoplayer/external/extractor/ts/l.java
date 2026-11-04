package androidx.media2.exoplayer.external.extractor.ts;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.Format;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class l implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<h0.a> f54911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.extractor.s[] f54912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f54913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f54914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f54915e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f54916f;

    public l(List<h0.a> subtitleInfos) {
        this.f54911a = subtitleInfos;
        this.f54912b = new androidx.media2.exoplayer.external.extractor.s[subtitleInfos.size()];
    }

    private boolean b(androidx.media2.exoplayer.external.util.x data, int expectedValue) {
        if (data.a() == 0) {
            return false;
        }
        if (data.D() != expectedValue) {
            this.f54913c = false;
        }
        this.f54914d--;
        return this.f54913c;
    }

    @Override // androidx.media2.exoplayer.external.extractor.ts.m
    public void a() {
        this.f54913c = false;
    }

    @Override // androidx.media2.exoplayer.external.extractor.ts.m
    public void c(long pesTimeUs, int flags) {
        if ((flags & 4) == 0) {
            return;
        }
        this.f54913c = true;
        this.f54916f = pesTimeUs;
        this.f54915e = 0;
        this.f54914d = 2;
    }

    @Override // androidx.media2.exoplayer.external.extractor.ts.m
    public void d(androidx.media2.exoplayer.external.util.x data) {
        if (this.f54913c && (this.f54914d != 2 || b(data, 32))) {
            if (this.f54914d != 1 || b(data, 0)) {
                int iC = data.c();
                int iA = data.a();
                for (androidx.media2.exoplayer.external.extractor.s sVar : this.f54912b) {
                    data.Q(iC);
                    sVar.d(data, iA);
                }
                this.f54915e += iA;
            }
        }
    }

    @Override // androidx.media2.exoplayer.external.extractor.ts.m
    public void e(androidx.media2.exoplayer.external.extractor.k extractorOutput, h0.e idGenerator) {
        for (int i10 = 0; i10 < this.f54912b.length; i10++) {
            h0.a aVar = this.f54911a.get(i10);
            idGenerator.a();
            androidx.media2.exoplayer.external.extractor.s sVarA = extractorOutput.a(idGenerator.c(), 3);
            sVarA.c(Format.v(idGenerator.b(), "application/dvbsubs", null, -1, 0, Collections.singletonList(aVar.f54846c), aVar.f54844a, null));
            this.f54912b[i10] = sVarA;
        }
    }

    @Override // androidx.media2.exoplayer.external.extractor.ts.m
    public void f() {
        if (this.f54913c) {
            for (androidx.media2.exoplayer.external.extractor.s sVar : this.f54912b) {
                sVar.b(this.f54916f, 1, this.f54915e, 0, null);
            }
            this.f54913c = false;
        }
    }
}
