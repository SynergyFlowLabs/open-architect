package com.google.firebase.perf.v1;

import com.google.protobuf.f3;
import com.google.protobuf.l1;
import com.google.protobuf.s1;
import com.google.protobuf.t1;
import com.google.protobuf.v0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class u extends l1<u, c> implements v {
    private static final u DEFAULT_INSTANCE;
    private static volatile f3<u> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SESSION_VERBOSITY_FIELD_NUMBER = 2;
    private static final s1.h.a<Integer, w> sessionVerbosity_converter_ = new a();
    private int bitField0_;
    private String sessionId_ = "";
    private s1.g sessionVerbosity_ = l1.gj();

    class a implements s1.h.a<Integer, w> {
        a() {
        }

        @Override // com.google.protobuf.s1.h.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public w convert(Integer num) {
            w wVarL = w.l(num.intValue());
            return wVarL == null ? w.SESSION_VERBOSITY_NONE : wVarL;
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f124386a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f124386a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f124386a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f124386a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f124386a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f124386a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f124386a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f124386a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class c extends l1.b<u, c> implements v {
        /* synthetic */ c(a aVar) {
            this();
        }

        @Override // com.google.firebase.perf.v1.v
        public List<w> Kh() {
            return ((u) this.f126038b).Kh();
        }

        @Override // com.google.firebase.perf.v1.v
        public int Mj() {
            return ((u) this.f126038b).Mj();
        }

        public c Ol(Iterable<? extends w> iterable) {
            El();
            ((u) this.f126038b).hm(iterable);
            return this;
        }

        public c Pl(w wVar) {
            El();
            ((u) this.f126038b).im(wVar);
            return this;
        }

        public c Ql() {
            El();
            ((u) this.f126038b).jm();
            return this;
        }

        public c Rl() {
            El();
            ((u) this.f126038b).km();
            return this;
        }

        public c Sl(String str) {
            El();
            ((u) this.f126038b).Cm(str);
            return this;
        }

        public c Tl(com.google.protobuf.u uVar) {
            El();
            ((u) this.f126038b).Dm(uVar);
            return this;
        }

        public c Ul(int i10, w wVar) {
            El();
            ((u) this.f126038b).Em(i10, wVar);
            return this;
        }

        @Override // com.google.firebase.perf.v1.v
        public String getSessionId() {
            return ((u) this.f126038b).getSessionId();
        }

        @Override // com.google.firebase.perf.v1.v
        public w ik(int i10) {
            return ((u) this.f126038b).ik(i10);
        }

        @Override // com.google.firebase.perf.v1.v
        public com.google.protobuf.u s3() {
            return ((u) this.f126038b).s3();
        }

        @Override // com.google.firebase.perf.v1.v
        public boolean t6() {
            return ((u) this.f126038b).t6();
        }

        private c() {
            super(u.DEFAULT_INSTANCE);
        }
    }

    static {
        u uVar = new u();
        DEFAULT_INSTANCE = uVar;
        l1.Wl(u.class, uVar);
    }

    private u() {
    }

    public static u Am(byte[] bArr, v0 v0Var) throws t1 {
        return (u) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static f3<u> Bm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Cm(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Dm(com.google.protobuf.u uVar) {
        this.sessionId_ = uVar.z0();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Em(int i10, w wVar) {
        wVar.getClass();
        lm();
        this.sessionVerbosity_.X(i10, wVar.i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hm(Iterable<? extends w> iterable) {
        lm();
        Iterator<? extends w> it = iterable.iterator();
        while (it.hasNext()) {
            this.sessionVerbosity_.w1(it.next().i());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void im(w wVar) {
        wVar.getClass();
        lm();
        this.sessionVerbosity_.w1(wVar.i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jm() {
        this.bitField0_ &= -2;
        this.sessionId_ = mm().getSessionId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void km() {
        this.sessionVerbosity_ = l1.gj();
    }

    private void lm() {
        s1.g gVar = this.sessionVerbosity_;
        if (!gVar.s1()) {
            this.sessionVerbosity_ = l1.wl(gVar);
        }
    }

    public static u mm() {
        return DEFAULT_INSTANCE;
    }

    public static c nm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static c om(u uVar) {
        return DEFAULT_INSTANCE.Uf(uVar);
    }

    public static u pm(InputStream inputStream) throws IOException {
        return (u) l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static u qm(InputStream inputStream, v0 v0Var) throws IOException {
        return (u) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static u rm(com.google.protobuf.u uVar) throws t1 {
        return (u) l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static u sm(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
        return (u) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static u tm(com.google.protobuf.z zVar) throws IOException {
        return (u) l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static u um(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
        return (u) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static u vm(InputStream inputStream) throws IOException {
        return (u) l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static u wm(InputStream inputStream, v0 v0Var) throws IOException {
        return (u) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static u xm(ByteBuffer byteBuffer) throws t1 {
        return (u) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static u ym(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
        return (u) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static u zm(byte[] bArr) throws t1 {
        return (u) l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.firebase.perf.v1.v
    public List<w> Kh() {
        return new s1.h(this.sessionVerbosity_, sessionVerbosity_converter_);
    }

    @Override // com.google.firebase.perf.v1.v
    public int Mj() {
        return this.sessionVerbosity_.size();
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
        f3 cVar;
        int i10 = b.f124386a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new u();
            case 2:
                return new c(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002ࠞ", new Object[]{"bitField0_", "sessionId_", "sessionVerbosity_", w.o()});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<u> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (u.class) {
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

    @Override // com.google.firebase.perf.v1.v
    public String getSessionId() {
        return this.sessionId_;
    }

    @Override // com.google.firebase.perf.v1.v
    public w ik(int i10) {
        w wVarL = w.l(this.sessionVerbosity_.getInt(i10));
        if (wVarL == null) {
            wVarL = w.SESSION_VERBOSITY_NONE;
        }
        return wVarL;
    }

    @Override // com.google.firebase.perf.v1.v
    public com.google.protobuf.u s3() {
        return com.google.protobuf.u.C(this.sessionId_);
    }

    @Override // com.google.firebase.perf.v1.v
    public boolean t6() {
        return (this.bitField0_ & 1) != 0;
    }
}
