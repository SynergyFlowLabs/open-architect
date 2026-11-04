package androidx.media2.exoplayer.external;

import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public class e implements d {
    @Override // androidx.media2.exoplayer.external.d
    public boolean a(o0 player, boolean reset) {
        player.L(reset);
        return true;
    }

    @Override // androidx.media2.exoplayer.external.d
    public boolean b(o0 player, boolean playWhenReady) {
        player.b0(playWhenReady);
        return true;
    }

    @Override // androidx.media2.exoplayer.external.d
    public boolean c(o0 player, boolean shuffleModeEnabled) {
        player.K(shuffleModeEnabled);
        return true;
    }

    @Override // androidx.media2.exoplayer.external.d
    public boolean d(o0 player, int windowIndex, long positionMs) {
        player.j0(windowIndex, positionMs);
        return true;
    }

    @Override // androidx.media2.exoplayer.external.d
    public boolean e(o0 player, int repeatMode) {
        player.D(repeatMode);
        return true;
    }
}
