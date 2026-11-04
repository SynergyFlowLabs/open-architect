package androidx.core.content.pm;

import androidx.annotation.b1;
import androidx.annotation.m1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP_PREFIX})
public abstract class g<T> {

    @b1({b1.a.LIBRARY})
    public static class a extends g<Void> {
        @Override // androidx.core.content.pm.g
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Void a(List<e> list) {
            return null;
        }

        @Override // androidx.core.content.pm.g
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Void c() {
            return null;
        }

        @Override // androidx.core.content.pm.g
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Void d(List<String> list) {
            return null;
        }
    }

    @androidx.annotation.d
    public abstract T a(List<e> list);

    @m1
    public List<e> b() throws Exception {
        return new ArrayList();
    }

    @androidx.annotation.d
    public abstract T c();

    @androidx.annotation.d
    public abstract T d(List<String> list);
}
