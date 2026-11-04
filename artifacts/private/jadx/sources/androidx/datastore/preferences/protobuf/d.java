package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
@y
abstract class d {

    class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f50042a;

        a(final ByteBuffer val$buffer) {
            this.f50042a = val$buffer;
        }

        @Override // androidx.datastore.preferences.protobuf.d
        public byte[] a() {
            return this.f50042a.array();
        }

        @Override // androidx.datastore.preferences.protobuf.d
        public int b() {
            return this.f50042a.arrayOffset();
        }

        @Override // androidx.datastore.preferences.protobuf.d
        public boolean c() {
            return this.f50042a.hasArray();
        }

        @Override // androidx.datastore.preferences.protobuf.d
        public boolean d() {
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.d
        public int e() {
            return this.f50042a.limit();
        }

        @Override // androidx.datastore.preferences.protobuf.d
        public ByteBuffer f() {
            return this.f50042a;
        }

        @Override // androidx.datastore.preferences.protobuf.d
        public int g() {
            return this.f50042a.position();
        }

        @Override // androidx.datastore.preferences.protobuf.d
        public d h(int position) {
            v1.e(this.f50042a, position);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.d
        public int i() {
            return this.f50042a.remaining();
        }
    }

    class b extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f50043a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ byte[] f50044b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f50045c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f50046d;

        b(final byte[] val$bytes, final int val$offset, final int val$length) {
            this.f50044b = val$bytes;
            this.f50045c = val$offset;
            this.f50046d = val$length;
        }

        @Override // androidx.datastore.preferences.protobuf.d
        public byte[] a() {
            return this.f50044b;
        }

        @Override // androidx.datastore.preferences.protobuf.d
        public int b() {
            return this.f50045c;
        }

        @Override // androidx.datastore.preferences.protobuf.d
        public boolean c() {
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.d
        public boolean d() {
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.d
        public int e() {
            return this.f50046d;
        }

        @Override // androidx.datastore.preferences.protobuf.d
        public ByteBuffer f() {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.d
        public int g() {
            return this.f50043a;
        }

        @Override // androidx.datastore.preferences.protobuf.d
        public d h(int position) {
            if (position >= 0 && position <= this.f50046d) {
                this.f50043a = position;
                return this;
            }
            throw new IllegalArgumentException("Invalid position: " + position);
        }

        @Override // androidx.datastore.preferences.protobuf.d
        public int i() {
            return this.f50046d - this.f50043a;
        }
    }

    d() {
    }

    public static d j(final ByteBuffer buffer) {
        s1.e(buffer, "buffer");
        return new a(buffer);
    }

    public static d k(byte[] bytes) {
        return m(bytes, 0, bytes.length);
    }

    public static d l(final byte[] bytes, final int offset, final int length) {
        if (offset < 0 || length < 0 || offset + length > bytes.length) {
            throw new IndexOutOfBoundsException(String.format("bytes.length=%d, offset=%d, length=%d", Integer.valueOf(bytes.length), Integer.valueOf(offset), Integer.valueOf(length)));
        }
        return m(bytes, offset, length);
    }

    private static d m(final byte[] bytes, final int offset, final int length) {
        return new b(bytes, offset, length);
    }

    public abstract byte[] a();

    public abstract int b();

    public abstract boolean c();

    public abstract boolean d();

    public abstract int e();

    public abstract ByteBuffer f();

    public abstract int g();

    @x
    public abstract d h(int position);

    public abstract int i();
}
