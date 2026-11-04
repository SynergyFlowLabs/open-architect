package androidx.media2.exoplayer.external.text.webvtt;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.util.q0;
import androidx.media2.exoplayer.external.util.x;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class b extends androidx.media2.exoplayer.external.text.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f56943q = 8;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f56944r = 1885436268;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f56945s = 1937011815;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f56946t = 1987343459;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final x f56947o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final e.b f56948p;

    public b() {
        super("Mp4WebvttDecoder");
        this.f56947o = new x();
        this.f56948p = new e.b();
    }

    private static androidx.media2.exoplayer.external.text.b B(x sampleData, e.b builder, int remainingCueBoxBytes) throws androidx.media2.exoplayer.external.text.g {
        builder.c();
        while (remainingCueBoxBytes > 0) {
            if (remainingCueBoxBytes < 8) {
                throw new androidx.media2.exoplayer.external.text.g("Incomplete vtt cue box header found.");
            }
            int iL = sampleData.l();
            int iL2 = sampleData.l();
            int i10 = iL - 8;
            String strD = q0.D(sampleData.f57720a, sampleData.c(), i10);
            sampleData.R(i10);
            remainingCueBoxBytes = (remainingCueBoxBytes - 8) - i10;
            if (iL2 == f56945s) {
                f.j(strD, builder);
            } else if (iL2 == f56944r) {
                f.k(null, strD.trim(), builder, Collections.EMPTY_LIST);
            }
        }
        return builder.a();
    }

    @Override // androidx.media2.exoplayer.external.text.c
    protected androidx.media2.exoplayer.external.text.e y(byte[] bytes, int length, boolean reset) throws androidx.media2.exoplayer.external.text.g {
        this.f56947o.O(bytes, length);
        ArrayList arrayList = new ArrayList();
        while (this.f56947o.a() > 0) {
            if (this.f56947o.a() < 8) {
                throw new androidx.media2.exoplayer.external.text.g("Incomplete Mp4Webvtt Top Level box header found.");
            }
            int iL = this.f56947o.l();
            if (this.f56947o.l() == f56946t) {
                arrayList.add(B(this.f56947o, this.f56948p, iL - 8));
            } else {
                this.f56947o.R(iL - 8);
            }
        }
        return new c(arrayList);
    }
}
