package androidx.media3.datasource.cache;

import androidx.media3.common.util.b1;
import androidx.media3.datasource.x;

/* JADX INFO: loaded from: classes3.dex */
@b1
public interface h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f62369a = new h() { // from class: androidx.media3.datasource.cache.g
        @Override // androidx.media3.datasource.cache.h
        public final String b(x xVar) {
            return h.a(xVar);
        }
    };

    static /* synthetic */ String a(x xVar) {
        String str = xVar.f62602i;
        return str != null ? str : xVar.f62594a.toString();
    }

    String b(x xVar);
}
