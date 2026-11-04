package com.google.firebase.perf.v1;

import com.google.protobuf.f3;
import com.google.protobuf.l1;
import com.google.protobuf.t1;
import com.google.protobuf.v0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends l1<h, b> implements i {
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    private static final h DEFAULT_INSTANCE;
    private static volatile f3<h> PARSER = null;
    public static final int SYSTEM_TIME_US_FIELD_NUMBER = 3;
    public static final int USER_TIME_US_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private long systemTimeUs_;
    private long userTimeUs_;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f124270a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f124270a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f124270a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f124270a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f124270a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f124270a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f124270a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f124270a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<h, b> implements i {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.firebase.perf.v1.i
        public boolean A4() {
            return ((h) this.f126038b).A4();
        }

        @Override // com.google.firebase.perf.v1.i
        public long Jh() {
            return ((h) this.f126038b).Jh();
        }

        public b Ol() {
            El();
            ((h) this.f126038b).gm();
            return this;
        }

        public b Pl() {
            El();
            ((h) this.f126038b).hm();
            return this;
        }

        public b Ql() {
            El();
            ((h) this.f126038b).im();
            return this;
        }

        public b Rl(long j10) {
            El();
            ((h) this.f126038b).zm(j10);
            return this;
        }

        public b Sl(long j10) {
            El();
            ((h) this.f126038b).Am(j10);
            return this;
        }

        public b Tl(long j10) {
            El();
            ((h) this.f126038b).Bm(j10);
            return this;
        }

        @Override // com.google.firebase.perf.v1.i
        public long W3() {
            return ((h) this.f126038b).W3();
        }

        @Override // com.google.firebase.perf.v1.i
        public boolean ac() {
            return ((h) this.f126038b).ac();
        }

        @Override // com.google.firebase.perf.v1.i
        public long kd() {
            return ((h) this.f126038b).kd();
        }

        @Override // com.google.firebase.perf.v1.i
        public boolean pk() {
            return ((h) this.f126038b).pk();
        }

        private b() {
            super(h.DEFAULT_INSTANCE);
        }
    }

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        l1.Wl(h.class, hVar);
    }

    private h() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Am(long j10) {
        this.bitField0_ |= 4;
        this.systemTimeUs_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Bm(long j10) {
        this.bitField0_ |= 2;
        this.userTimeUs_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gm() {
        this.bitField0_ &= -2;
        this.clientTimeUs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hm() {
        this.bitField0_ &= -5;
        this.systemTimeUs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void im() {
        this.bitField0_ &= -3;
        this.userTimeUs_ = 0L;
    }

    public static h jm() {
        return DEFAULT_INSTANCE;
    }

    public static b km() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b lm(h hVar) {
        return DEFAULT_INSTANCE.Uf(hVar);
    }

    public static h mm(InputStream inputStream) throws IOException {
        return (h) l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static h nm(InputStream inputStream, v0 v0Var) throws IOException {
        return (h) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static h om(com.google.protobuf.u uVar) throws t1 {
        return (h) l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static h pm(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
        return (h) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static h qm(com.google.protobuf.z zVar) throws IOException {
        return (h) l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static h rm(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
        return (h) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static h sm(InputStream inputStream) throws IOException {
        return (h) l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static h tm(InputStream inputStream, v0 v0Var) throws IOException {
        return (h) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static h um(ByteBuffer byteBuffer) throws t1 {
        return (h) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static h vm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
        return (h) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static h wm(byte[] bArr) throws t1 {
        return (h) l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static h xm(byte[] bArr, v0 v0Var) throws t1 {
        return (h) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static f3<h> ym() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zm(long j10) {
        this.bitField0_ |= 1;
        this.clientTimeUs_ = j10;
    }

    @Override // com.google.firebase.perf.v1.i
    public boolean A4() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.firebase.perf.v1.i
    public long Jh() {
        return this.userTimeUs_;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
        f3 cVar;
        int i10 = a.f124270a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new h();
            case 2:
                return new b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"bitField0_", "clientTimeUs_", "userTimeUs_", "systemTimeUs_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<h> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (h.class) {
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

    @Override // com.google.firebase.perf.v1.i
    public long W3() {
        return this.clientTimeUs_;
    }

    @Override // com.google.firebase.perf.v1.i
    public boolean ac() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.firebase.perf.v1.i
    public long kd() {
        return this.systemTimeUs_;
    }

    @Override // com.google.firebase.perf.v1.i
    public boolean pk() {
        return (this.bitField0_ & 2) != 0;
    }
}
