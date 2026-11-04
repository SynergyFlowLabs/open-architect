package com.google.common.hash;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes5.dex */
@k
@z7.j
abstract class b extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f118748b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final q[] f118749a;

    class a implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ r[] f118750a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f118751b;

        a(final b this$0, final r[] val$hashers) {
            this.f118750a = val$hashers;
            this.f118751b = this$0;
        }

        @Override // com.google.common.hash.r
        public p n() {
            return this.f118751b.m(this.f118750a);
        }

        @Override // com.google.common.hash.r
        public <T> r o(@h0 T instance, n<? super T> funnel) {
            for (r rVar : this.f118750a) {
                rVar.o(instance, funnel);
            }
            return this;
        }

        @Override // com.google.common.hash.r, com.google.common.hash.i0
        public r a(float f10) {
            for (r rVar : this.f118750a) {
                rVar.a(f10);
            }
            return this;
        }

        @Override // com.google.common.hash.r, com.google.common.hash.i0
        public r b(int i10) {
            for (r rVar : this.f118750a) {
                rVar.b(i10);
            }
            return this;
        }

        @Override // com.google.common.hash.r, com.google.common.hash.i0
        public r c(long l10) {
            for (r rVar : this.f118750a) {
                rVar.c(l10);
            }
            return this;
        }

        @Override // com.google.common.hash.r, com.google.common.hash.i0
        public r d(double d10) {
            for (r rVar : this.f118750a) {
                rVar.d(d10);
            }
            return this;
        }

        @Override // com.google.common.hash.r, com.google.common.hash.i0
        public r e(short s10) {
            for (r rVar : this.f118750a) {
                rVar.e(s10);
            }
            return this;
        }

        @Override // com.google.common.hash.r, com.google.common.hash.i0
        public r f(boolean b10) {
            for (r rVar : this.f118750a) {
                rVar.f(b10);
            }
            return this;
        }

        @Override // com.google.common.hash.r, com.google.common.hash.i0
        public r g(byte b10) {
            for (r rVar : this.f118750a) {
                rVar.g(b10);
            }
            return this;
        }

        @Override // com.google.common.hash.r, com.google.common.hash.i0
        public r h(byte[] bytes) {
            for (r rVar : this.f118750a) {
                rVar.h(bytes);
            }
            return this;
        }

        @Override // com.google.common.hash.r, com.google.common.hash.i0
        public r i(char c10) {
            for (r rVar : this.f118750a) {
                rVar.i(c10);
            }
            return this;
        }

        @Override // com.google.common.hash.r, com.google.common.hash.i0
        public r j(CharSequence chars) {
            for (r rVar : this.f118750a) {
                rVar.j(chars);
            }
            return this;
        }

        @Override // com.google.common.hash.r, com.google.common.hash.i0
        public r k(byte[] bytes, int off, int len) {
            for (r rVar : this.f118750a) {
                rVar.k(bytes, off, len);
            }
            return this;
        }

        @Override // com.google.common.hash.r, com.google.common.hash.i0
        public r l(ByteBuffer bytes) {
            int iPosition = bytes.position();
            for (r rVar : this.f118750a) {
                x.d(bytes, iPosition);
                rVar.l(bytes);
            }
            return this;
        }

        @Override // com.google.common.hash.r, com.google.common.hash.i0
        public r m(CharSequence chars, Charset charset) {
            for (r rVar : this.f118750a) {
                rVar.m(chars, charset);
            }
            return this;
        }
    }

    b(q... functions) {
        for (q qVar : functions) {
            com.google.common.base.j0.E(qVar);
        }
        this.f118749a = functions;
    }

    private r l(r[] hashers) {
        return new a(this, hashers);
    }

    @Override // com.google.common.hash.c, com.google.common.hash.q
    public r a(int expectedInputSize) {
        com.google.common.base.j0.d(expectedInputSize >= 0);
        int length = this.f118749a.length;
        r[] rVarArr = new r[length];
        for (int i10 = 0; i10 < length; i10++) {
            rVarArr[i10] = this.f118749a[i10].a(expectedInputSize);
        }
        return l(rVarArr);
    }

    @Override // com.google.common.hash.q
    public r i() {
        int length = this.f118749a.length;
        r[] rVarArr = new r[length];
        for (int i10 = 0; i10 < length; i10++) {
            rVarArr[i10] = this.f118749a[i10].i();
        }
        return l(rVarArr);
    }

    abstract p m(r[] hashers);
}
