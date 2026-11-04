package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
@y
abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final r f50548a = new a();

    class a extends r {
        a() {
        }

        @Override // androidx.datastore.preferences.protobuf.r
        public d a(int capacity) {
            return d.j(ByteBuffer.allocateDirect(capacity));
        }

        @Override // androidx.datastore.preferences.protobuf.r
        public d b(int capacity) {
            return d.k(new byte[capacity]);
        }
    }

    r() {
    }

    public static r c() {
        return f50548a;
    }

    public abstract d a(int capacity);

    public abstract d b(int capacity);
}
