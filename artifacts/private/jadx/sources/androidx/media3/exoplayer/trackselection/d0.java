package androidx.media3.exoplayer.trackselection;

import androidx.annotation.p0;
import androidx.media3.common.b4;
import androidx.media3.common.util.b1;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class d0 extends c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f65679k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @p0
    private final Object f65680l;

    public d0(b4 b4Var, int i10) {
        this(b4Var, i10, 0);
    }

    @Override // androidx.media3.exoplayer.trackselection.c0
    public int a() {
        return 0;
    }

    @Override // androidx.media3.exoplayer.trackselection.c0
    @p0
    public Object n() {
        return this.f65680l;
    }

    @Override // androidx.media3.exoplayer.trackselection.c0
    public int o() {
        return this.f65679k;
    }

    @Override // androidx.media3.exoplayer.trackselection.c0
    public void v(long j10, long j11, long j12, List<? extends androidx.media3.exoplayer.source.chunk.m> list, androidx.media3.exoplayer.source.chunk.n[] nVarArr) {
    }

    public d0(b4 b4Var, int i10, int i11) {
        this(b4Var, i10, i11, 0, null);
    }

    public d0(b4 b4Var, int i10, int i11, int i12, @p0 Object obj) {
        super(b4Var, new int[]{i10}, i11);
        this.f65679k = i12;
        this.f65680l = obj;
    }
}
