package androidx.media3.extractor;

import android.net.Uri;
import androidx.media3.common.util.b1;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@b1
public interface w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f69568a = new w() { // from class: androidx.media3.extractor.v
        @Override // androidx.media3.extractor.w
        public final r[] c() {
            return w.f();
        }
    };

    static /* synthetic */ r[] f() {
        return new r[0];
    }

    default w a(androidx.media3.extractor.text.r.a aVar) {
        return this;
    }

    @z7.a
    default w b(int i10) {
        return this;
    }

    r[] c();

    @z7.a
    @Deprecated
    default w d(boolean z10) {
        return this;
    }

    default r[] e(Uri uri, Map<String, List<String>> map) {
        return c();
    }
}
