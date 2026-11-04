package com.google.type;

import com.google.protobuf.f3;
import com.google.protobuf.l1;
import com.google.protobuf.t1;
import com.google.protobuf.v0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class q extends l1<q, b> implements r {
    private static final q DEFAULT_INSTANCE;
    public static final int DENOMINATOR_FIELD_NUMBER = 2;
    public static final int NUMERATOR_FIELD_NUMBER = 1;
    private static volatile f3<q> PARSER;
    private long denominator_;
    private long numerator_;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f126753a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f126753a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f126753a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f126753a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f126753a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f126753a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f126753a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f126753a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<q, b> implements r {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b Ol() {
            El();
            ((q) this.f126038b).em();
            return this;
        }

        public b Pl() {
            El();
            ((q) this.f126038b).fm();
            return this;
        }

        public b Ql(long j10) {
            El();
            ((q) this.f126038b).wm(j10);
            return this;
        }

        public b Rl(long j10) {
            El();
            ((q) this.f126038b).xm(j10);
            return this;
        }

        @Override // com.google.type.r
        public long ah() {
            return ((q) this.f126038b).ah();
        }

        @Override // com.google.type.r
        public long n9() {
            return ((q) this.f126038b).n9();
        }

        private b() {
            super(q.DEFAULT_INSTANCE);
        }
    }

    static {
        q qVar = new q();
        DEFAULT_INSTANCE = qVar;
        l1.Wl(q.class, qVar);
    }

    private q() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void em() {
        this.denominator_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fm() {
        this.numerator_ = 0L;
    }

    public static q gm() {
        return DEFAULT_INSTANCE;
    }

    public static b hm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b im(q qVar) {
        return DEFAULT_INSTANCE.Uf(qVar);
    }

    public static q jm(InputStream inputStream) throws IOException {
        return (q) l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static q km(InputStream inputStream, v0 v0Var) throws IOException {
        return (q) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static q lm(com.google.protobuf.u uVar) throws t1 {
        return (q) l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static q mm(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
        return (q) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static q nm(com.google.protobuf.z zVar) throws IOException {
        return (q) l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static q om(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
        return (q) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static q pm(InputStream inputStream) throws IOException {
        return (q) l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static q qm(InputStream inputStream, v0 v0Var) throws IOException {
        return (q) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static q rm(ByteBuffer byteBuffer) throws t1 {
        return (q) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static q sm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
        return (q) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static q tm(byte[] bArr) throws t1 {
        return (q) l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static q um(byte[] bArr, v0 v0Var) throws t1 {
        return (q) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static f3<q> vm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wm(long j10) {
        this.denominator_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xm(long j10) {
        this.numerator_ = j10;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
        f3 cVar;
        int i10 = a.f126753a[iVar.ordinal()];
        a aVar = null;
        boolean z10 = false | false;
        switch (i10) {
            case 1:
                return new q();
            case 2:
                return new b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0002", new Object[]{"numerator_", "denominator_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<q> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (q.class) {
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

    @Override // com.google.type.r
    public long ah() {
        return this.numerator_;
    }

    @Override // com.google.type.r
    public long n9() {
        return this.denominator_;
    }
}
