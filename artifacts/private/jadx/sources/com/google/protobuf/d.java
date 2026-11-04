package com.google.protobuf;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
@y
abstract class d {

    class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f125824a;

        a(final ByteBuffer val$buffer) {
            this.f125824a = val$buffer;
        }

        @Override // com.google.protobuf.d
        public byte[] a() {
            return this.f125824a.array();
        }

        @Override // com.google.protobuf.d
        public int b() {
            return this.f125824a.arrayOffset();
        }

        @Override // com.google.protobuf.d
        public boolean c() {
            return this.f125824a.hasArray();
        }

        @Override // com.google.protobuf.d
        public boolean d() {
            return true;
        }

        @Override // com.google.protobuf.d
        public int e() {
            return this.f125824a.limit();
        }

        @Override // com.google.protobuf.d
        public ByteBuffer f() {
            return this.f125824a;
        }

        @Override // com.google.protobuf.d
        public int g() {
            return this.f125824a.position();
        }

        @Override // com.google.protobuf.d
        public d h(int position) {
            v1.e(this.f125824a, position);
            return this;
        }

        @Override // com.google.protobuf.d
        public int i() {
            return this.f125824a.remaining();
        }
    }

    class b extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f125825a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ byte[] f125826b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f125827c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f125828d;

        b(final byte[] val$bytes, final int val$offset, final int val$length) {
            this.f125826b = val$bytes;
            this.f125827c = val$offset;
            this.f125828d = val$length;
        }

        @Override // com.google.protobuf.d
        public byte[] a() {
            return this.f125826b;
        }

        @Override // com.google.protobuf.d
        public int b() {
            return this.f125827c;
        }

        @Override // com.google.protobuf.d
        public boolean c() {
            return true;
        }

        @Override // com.google.protobuf.d
        public boolean d() {
            return false;
        }

        @Override // com.google.protobuf.d
        public int e() {
            return this.f125828d;
        }

        @Override // com.google.protobuf.d
        public ByteBuffer f() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.d
        public int g() {
            return this.f125825a;
        }

        @Override // com.google.protobuf.d
        public d h(int position) {
            if (position >= 0 && position <= this.f125828d) {
                this.f125825a = position;
                return this;
            }
            throw new IllegalArgumentException("Invalid position: " + position);
        }

        @Override // com.google.protobuf.d
        public int i() {
            return this.f125828d - this.f125825a;
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
