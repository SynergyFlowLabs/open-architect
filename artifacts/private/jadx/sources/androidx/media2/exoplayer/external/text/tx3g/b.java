package androidx.media2.exoplayer.external.text.tx3g;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.text.e;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
final class b implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f56928b = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<androidx.media2.exoplayer.external.text.b> f56929a;

    public b(androidx.media2.exoplayer.external.text.b cue) {
        this.f56929a = Collections.singletonList(cue);
    }

    @Override // androidx.media2.exoplayer.external.text.e
    public long b(int index) {
        androidx.media2.exoplayer.external.util.a.a(index == 0);
        return 0L;
    }

    @Override // androidx.media2.exoplayer.external.text.e
    public int k() {
        return 1;
    }

    @Override // androidx.media2.exoplayer.external.text.e
    public int l(long timeUs) {
        return timeUs < 0 ? 0 : -1;
    }

    @Override // androidx.media2.exoplayer.external.text.e
    public List<androidx.media2.exoplayer.external.text.b> n(long timeUs) {
        return timeUs >= 0 ? this.f56929a : Collections.EMPTY_LIST;
    }

    private b() {
        this.f56929a = Collections.EMPTY_LIST;
    }
}
