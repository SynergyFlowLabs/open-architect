package com.google.firebase.perf.v1;

import com.google.protobuf.f3;
import com.google.protobuf.l1;
import com.google.protobuf.t1;
import com.google.protobuf.v0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends l1<c, b> implements d {
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    private static final c DEFAULT_INSTANCE;
    private static volatile f3<c> PARSER = null;
    public static final int USED_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private int usedAppJavaHeapMemoryKb_;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f124255a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f124255a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f124255a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f124255a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f124255a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f124255a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f124255a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f124255a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<c, b> implements d {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.firebase.perf.v1.d
        public boolean A4() {
            return ((c) this.f126038b).A4();
        }

        @Override // com.google.firebase.perf.v1.d
        public boolean Ck() {
            return ((c) this.f126038b).Ck();
        }

        public b Ol() {
            El();
            ((c) this.f126038b).em();
            return this;
        }

        public b Pl() {
            El();
            ((c) this.f126038b).fm();
            return this;
        }

        public b Ql(long j10) {
            El();
            ((c) this.f126038b).wm(j10);
            return this;
        }

        public b Rl(int i10) {
            El();
            ((c) this.f126038b).xm(i10);
            return this;
        }

        @Override // com.google.firebase.perf.v1.d
        public long W3() {
            return ((c) this.f126038b).W3();
        }

        @Override // com.google.firebase.perf.v1.d
        public int mi() {
            return ((c) this.f126038b).mi();
        }

        private b() {
            super(c.DEFAULT_INSTANCE);
        }
    }

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        l1.Wl(c.class, cVar);
    }

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void em() {
        this.bitField0_ &= -2;
        this.clientTimeUs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fm() {
        this.bitField0_ &= -3;
        this.usedAppJavaHeapMemoryKb_ = 0;
    }

    public static c gm() {
        return DEFAULT_INSTANCE;
    }

    public static b hm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b im(c cVar) {
        return DEFAULT_INSTANCE.Uf(cVar);
    }

    public static c jm(InputStream inputStream) throws IOException {
        return (c) l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static c km(InputStream inputStream, v0 v0Var) throws IOException {
        return (c) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static c lm(com.google.protobuf.u uVar) throws t1 {
        return (c) l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static c mm(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
        return (c) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static c nm(com.google.protobuf.z zVar) throws IOException {
        return (c) l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static c om(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
        return (c) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static c pm(InputStream inputStream) throws IOException {
        return (c) l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static c qm(InputStream inputStream, v0 v0Var) throws IOException {
        return (c) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static c rm(ByteBuffer byteBuffer) throws t1 {
        return (c) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static c sm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
        return (c) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static c tm(byte[] bArr) throws t1 {
        return (c) l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static c um(byte[] bArr, v0 v0Var) throws t1 {
        return (c) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static f3<c> vm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wm(long j10) {
        this.bitField0_ |= 1;
        this.clientTimeUs_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xm(int i10) {
        this.bitField0_ |= 2;
        this.usedAppJavaHeapMemoryKb_ = i10;
    }

    @Override // com.google.firebase.perf.v1.d
    public boolean A4() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.firebase.perf.v1.d
    public boolean Ck() {
        if ((this.bitField0_ & 2) == 0) {
            return false;
        }
        boolean z10 = !true;
        return true;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
        f3 cVar;
        int i10 = a.f124255a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new c();
            case 2:
                return new b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001", new Object[]{"bitField0_", "clientTimeUs_", "usedAppJavaHeapMemoryKb_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<c> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (c.class) {
                    try {
                        cVar = PARSER;
                        if (cVar == null) {
                            cVar = new l1.c(DEFAULT_INSTANCE);
                            PARSER = cVar;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return cVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.firebase.perf.v1.d
    public long W3() {
        return this.clientTimeUs_;
    }

    @Override // com.google.firebase.perf.v1.d
    public int mi() {
        return this.usedAppJavaHeapMemoryKb_;
    }
}
