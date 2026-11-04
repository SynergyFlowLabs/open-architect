package androidx.media3.exoplayer.source;

import com.google.common.collect.l6;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class o implements j {
    @Override // androidx.media3.exoplayer.source.j
    @Deprecated
    public t1 a(t1... t1VarArr) {
        return new i(t1VarArr);
    }

    @Override // androidx.media3.exoplayer.source.j
    public t1 b(List<? extends t1> list, List<List<Integer>> list2) {
        return new i(list, list2);
    }

    @Override // androidx.media3.exoplayer.source.j
    public t1 empty() {
        return new i(l6.F(), l6.F());
    }
}
