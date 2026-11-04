package com.google.protobuf;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
@y
abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final r f126282a = new a();

    class a extends r {
        a() {
        }

        @Override // com.google.protobuf.r
        public d a(int capacity) {
            return d.j(ByteBuffer.allocateDirect(capacity));
        }

        @Override // com.google.protobuf.r
        public d b(int capacity) {
            return d.k(new byte[capacity]);
        }
    }

    r() {
    }

    public static r c() {
        return f126282a;
    }

    public abstract d a(int capacity);

    public abstract d b(int capacity);
}
