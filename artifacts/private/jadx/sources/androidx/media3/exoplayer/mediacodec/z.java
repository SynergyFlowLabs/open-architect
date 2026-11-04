package androidx.media3.exoplayer.mediacodec;

import androidx.media3.common.util.b1;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@b1
public interface z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f64220a = new z() { // from class: androidx.media3.exoplayer.mediacodec.x
        @Override // androidx.media3.exoplayer.mediacodec.z
        public final List a(String str, boolean z10, boolean z11) {
            return f0.n(str, z10, z11);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z f64221b = new z() { // from class: androidx.media3.exoplayer.mediacodec.y
        @Override // androidx.media3.exoplayer.mediacodec.z
        public final List a(String str, boolean z10, boolean z11) {
            return f0.s(z.f64220a.a(str, z10, z11));
        }
    };

    List<t> a(String str, boolean z10, boolean z11) throws f0.c;
}
