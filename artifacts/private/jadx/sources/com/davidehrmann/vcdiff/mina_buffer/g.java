package com.davidehrmann.vcdiff.mina_buffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes3.dex */
public class g implements e {
    @Override // com.davidehrmann.vcdiff.mina_buffer.e
    public d a(ByteBuffer byteBuffer) {
        return new a(byteBuffer);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.e
    public d b(int i10, boolean z10) {
        return a(c(i10, z10));
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.e
    public ByteBuffer c(int i10, boolean z10) {
        return z10 ? ByteBuffer.allocateDirect(i10) : ByteBuffer.allocate(i10);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.e
    public void dispose() {
    }

    private class a extends com.davidehrmann.vcdiff.mina_buffer.a {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private ByteBuffer f97997l;

        protected a(ByteBuffer byteBuffer) {
            super(g.this, byteBuffer.capacity());
            this.f97997l = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.davidehrmann.vcdiff.mina_buffer.d
        public void U() {
        }

        @Override // com.davidehrmann.vcdiff.mina_buffer.a
        protected d U2() {
            return g.this.new a(this, this.f97997l.asReadOnlyBuffer());
        }

        @Override // com.davidehrmann.vcdiff.mina_buffer.d
        public boolean V0() {
            return this.f97997l.hasArray();
        }

        @Override // com.davidehrmann.vcdiff.mina_buffer.a
        protected void X2(ByteBuffer byteBuffer) {
            this.f97997l = byteBuffer;
        }

        @Override // com.davidehrmann.vcdiff.mina_buffer.a
        protected d a3() {
            return g.this.new a(this, this.f97997l.duplicate());
        }

        @Override // com.davidehrmann.vcdiff.mina_buffer.a
        protected d f3() {
            return g.this.new a(this, this.f97997l.slice());
        }

        @Override // com.davidehrmann.vcdiff.mina_buffer.d
        public byte[] k() {
            return this.f97997l.array();
        }

        @Override // com.davidehrmann.vcdiff.mina_buffer.d
        public int l() {
            return this.f97997l.arrayOffset();
        }

        @Override // com.davidehrmann.vcdiff.mina_buffer.d
        public ByteBuffer x() {
            return this.f97997l;
        }

        protected a(a aVar, ByteBuffer byteBuffer) {
            super(aVar);
            this.f97997l = byteBuffer;
        }
    }
}
