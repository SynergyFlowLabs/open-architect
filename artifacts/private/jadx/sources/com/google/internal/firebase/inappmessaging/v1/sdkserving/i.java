package com.google.internal.firebase.inappmessaging.v1.sdkserving;

import com.google.protobuf.f3;
import com.google.protobuf.l1;
import com.google.protobuf.s1;
import com.google.protobuf.t1;
import com.google.protobuf.u;
import com.google.protobuf.v0;
import com.google.protobuf.z;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends l1<i, b> implements j {
    private static final i DEFAULT_INSTANCE;
    public static final int EXPIRATION_EPOCH_TIMESTAMP_MILLIS_FIELD_NUMBER = 2;
    public static final int MESSAGES_FIELD_NUMBER = 1;
    private static volatile f3<i> PARSER;
    private long expirationEpochTimestampMillis_;
    private s1.k<com.google.internal.firebase.inappmessaging.v1.a.f> messages_ = l1.Ij();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f125669a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f125669a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f125669a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f125669a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f125669a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f125669a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f125669a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f125669a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<i, b> implements j {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b Ol(Iterable<? extends com.google.internal.firebase.inappmessaging.v1.a.f> iterable) {
            El();
            ((i) this.f126038b).im(iterable);
            return this;
        }

        public b Pl(int i10, com.google.internal.firebase.inappmessaging.v1.a.f.C1206a c1206a) {
            El();
            ((i) this.f126038b).jm(i10, c1206a.build());
            return this;
        }

        public b Ql(int i10, com.google.internal.firebase.inappmessaging.v1.a.f fVar) {
            El();
            ((i) this.f126038b).jm(i10, fVar);
            return this;
        }

        public b Rl(com.google.internal.firebase.inappmessaging.v1.a.f.C1206a c1206a) {
            El();
            ((i) this.f126038b).km(c1206a.build());
            return this;
        }

        public b Sl(com.google.internal.firebase.inappmessaging.v1.a.f fVar) {
            El();
            ((i) this.f126038b).km(fVar);
            return this;
        }

        public b Tl() {
            El();
            ((i) this.f126038b).lm();
            return this;
        }

        public b Ul() {
            El();
            ((i) this.f126038b).mm();
            return this;
        }

        public b Vl(int i10) {
            El();
            ((i) this.f126038b).Gm(i10);
            return this;
        }

        public b Wl(long j10) {
            El();
            ((i) this.f126038b).Hm(j10);
            return this;
        }

        public b Xl(int i10, com.google.internal.firebase.inappmessaging.v1.a.f.C1206a c1206a) {
            El();
            ((i) this.f126038b).Im(i10, c1206a.build());
            return this;
        }

        public b Yl(int i10, com.google.internal.firebase.inappmessaging.v1.a.f fVar) {
            El();
            ((i) this.f126038b).Im(i10, fVar);
            return this;
        }

        @Override // com.google.internal.firebase.inappmessaging.v1.sdkserving.j
        public com.google.internal.firebase.inappmessaging.v1.a.f Za(int i10) {
            return ((i) this.f126038b).Za(i10);
        }

        @Override // com.google.internal.firebase.inappmessaging.v1.sdkserving.j
        public int ak() {
            return ((i) this.f126038b).ak();
        }

        @Override // com.google.internal.firebase.inappmessaging.v1.sdkserving.j
        public List<com.google.internal.firebase.inappmessaging.v1.a.f> hg() {
            return Collections.unmodifiableList(((i) this.f126038b).hg());
        }

        @Override // com.google.internal.firebase.inappmessaging.v1.sdkserving.j
        public long ma() {
            return ((i) this.f126038b).ma();
        }

        private b() {
            super(i.DEFAULT_INSTANCE);
        }
    }

    static {
        i iVar = new i();
        DEFAULT_INSTANCE = iVar;
        l1.Wl(i.class, iVar);
    }

    private i() {
    }

    public static i Am(InputStream inputStream, v0 v0Var) throws IOException {
        return (i) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static i Bm(ByteBuffer byteBuffer) throws t1 {
        return (i) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static i Cm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
        return (i) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static i Dm(byte[] bArr) throws t1 {
        return (i) l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static i Em(byte[] bArr, v0 v0Var) throws t1 {
        return (i) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static f3<i> Fm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Gm(int i10) {
        nm();
        this.messages_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Hm(long j10) {
        this.expirationEpochTimestampMillis_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Im(int i10, com.google.internal.firebase.inappmessaging.v1.a.f fVar) {
        fVar.getClass();
        nm();
        this.messages_.set(i10, fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void im(Iterable<? extends com.google.internal.firebase.inappmessaging.v1.a.f> iterable) {
        nm();
        com.google.protobuf.a.y(iterable, this.messages_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jm(int i10, com.google.internal.firebase.inappmessaging.v1.a.f fVar) {
        fVar.getClass();
        nm();
        this.messages_.add(i10, fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void km(com.google.internal.firebase.inappmessaging.v1.a.f fVar) {
        fVar.getClass();
        nm();
        this.messages_.add(fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lm() {
        this.expirationEpochTimestampMillis_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mm() {
        this.messages_ = l1.Ij();
    }

    private void nm() {
        s1.k<com.google.internal.firebase.inappmessaging.v1.a.f> kVar = this.messages_;
        if (kVar.s1()) {
            return;
        }
        this.messages_ = l1.yl(kVar);
    }

    public static i om() {
        return DEFAULT_INSTANCE;
    }

    public static b rm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b sm(i iVar) {
        return DEFAULT_INSTANCE.Uf(iVar);
    }

    public static i tm(InputStream inputStream) throws IOException {
        return (i) l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static i um(InputStream inputStream, v0 v0Var) throws IOException {
        return (i) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static i vm(u uVar) throws t1 {
        return (i) l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static i wm(u uVar, v0 v0Var) throws t1 {
        return (i) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static i xm(z zVar) throws IOException {
        return (i) l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static i ym(z zVar, v0 v0Var) throws IOException {
        return (i) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static i zm(InputStream inputStream) throws IOException {
        return (i) l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
        f3 cVar;
        int i10 = a.f125669a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new i();
            case 2:
                return new b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0002", new Object[]{"messages_", com.google.internal.firebase.inappmessaging.v1.a.f.class, "expirationEpochTimestampMillis_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<i> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (i.class) {
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

    @Override // com.google.internal.firebase.inappmessaging.v1.sdkserving.j
    public com.google.internal.firebase.inappmessaging.v1.a.f Za(int i10) {
        return this.messages_.get(i10);
    }

    @Override // com.google.internal.firebase.inappmessaging.v1.sdkserving.j
    public int ak() {
        return this.messages_.size();
    }

    @Override // com.google.internal.firebase.inappmessaging.v1.sdkserving.j
    public List<com.google.internal.firebase.inappmessaging.v1.a.f> hg() {
        return this.messages_;
    }

    @Override // com.google.internal.firebase.inappmessaging.v1.sdkserving.j
    public long ma() {
        return this.expirationEpochTimestampMillis_;
    }

    public com.google.internal.firebase.inappmessaging.v1.a.g pm(int i10) {
        return this.messages_.get(i10);
    }

    public List<? extends com.google.internal.firebase.inappmessaging.v1.a.g> qm() {
        return this.messages_;
    }
}
