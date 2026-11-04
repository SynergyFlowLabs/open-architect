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
public final class b extends l1<b, C1209b> implements c {
    public static final int ALREADY_SEEN_CAMPAIGNS_FIELD_NUMBER = 1;
    private static final b DEFAULT_INSTANCE;
    private static volatile f3<b> PARSER;
    private s1.k<com.google.internal.firebase.inappmessaging.v1.sdkserving.a> alreadySeenCampaigns_ = l1.Ij();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f125666a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f125666a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f125666a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f125666a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f125666a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f125666a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f125666a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f125666a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: com.google.internal.firebase.inappmessaging.v1.sdkserving.b$b, reason: collision with other inner class name */
    public static final class C1209b extends l1.b<b, C1209b> implements c {
        /* synthetic */ C1209b(a aVar) {
            this();
        }

        @Override // com.google.internal.firebase.inappmessaging.v1.sdkserving.c
        public List<com.google.internal.firebase.inappmessaging.v1.sdkserving.a> O7() {
            return Collections.unmodifiableList(((b) this.f126038b).O7());
        }

        public C1209b Ol(Iterable<? extends com.google.internal.firebase.inappmessaging.v1.sdkserving.a> iterable) {
            El();
            ((b) this.f126038b).gm(iterable);
            return this;
        }

        public C1209b Pl(int i10, com.google.internal.firebase.inappmessaging.v1.sdkserving.a.b bVar) {
            El();
            ((b) this.f126038b).hm(i10, bVar.build());
            return this;
        }

        public C1209b Ql(int i10, com.google.internal.firebase.inappmessaging.v1.sdkserving.a aVar) {
            El();
            ((b) this.f126038b).hm(i10, aVar);
            return this;
        }

        public C1209b Rl(com.google.internal.firebase.inappmessaging.v1.sdkserving.a.b bVar) {
            El();
            ((b) this.f126038b).im(bVar.build());
            return this;
        }

        public C1209b Sl(com.google.internal.firebase.inappmessaging.v1.sdkserving.a aVar) {
            El();
            ((b) this.f126038b).im(aVar);
            return this;
        }

        @Override // com.google.internal.firebase.inappmessaging.v1.sdkserving.c
        public int T1() {
            return ((b) this.f126038b).T1();
        }

        public C1209b Tl() {
            El();
            ((b) this.f126038b).jm();
            return this;
        }

        public C1209b Ul(int i10) {
            El();
            ((b) this.f126038b).Dm(i10);
            return this;
        }

        public C1209b Vl(int i10, com.google.internal.firebase.inappmessaging.v1.sdkserving.a.b bVar) {
            El();
            ((b) this.f126038b).Em(i10, bVar.build());
            return this;
        }

        public C1209b Wl(int i10, com.google.internal.firebase.inappmessaging.v1.sdkserving.a aVar) {
            El();
            ((b) this.f126038b).Em(i10, aVar);
            return this;
        }

        @Override // com.google.internal.firebase.inappmessaging.v1.sdkserving.c
        public com.google.internal.firebase.inappmessaging.v1.sdkserving.a x4(int i10) {
            return ((b) this.f126038b).x4(i10);
        }

        private C1209b() {
            super(b.DEFAULT_INSTANCE);
        }
    }

    static {
        b bVar = new b();
        DEFAULT_INSTANCE = bVar;
        l1.Wl(b.class, bVar);
    }

    private b() {
    }

    public static b Am(byte[] bArr) throws t1 {
        return (b) l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static b Bm(byte[] bArr, v0 v0Var) throws t1 {
        return (b) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static f3<b> Cm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Dm(int i10) {
        km();
        this.alreadySeenCampaigns_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Em(int i10, com.google.internal.firebase.inappmessaging.v1.sdkserving.a aVar) {
        aVar.getClass();
        km();
        this.alreadySeenCampaigns_.set(i10, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gm(Iterable<? extends com.google.internal.firebase.inappmessaging.v1.sdkserving.a> iterable) {
        km();
        com.google.protobuf.a.y(iterable, this.alreadySeenCampaigns_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hm(int i10, com.google.internal.firebase.inappmessaging.v1.sdkserving.a aVar) {
        aVar.getClass();
        km();
        this.alreadySeenCampaigns_.add(i10, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void im(com.google.internal.firebase.inappmessaging.v1.sdkserving.a aVar) {
        aVar.getClass();
        km();
        this.alreadySeenCampaigns_.add(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jm() {
        this.alreadySeenCampaigns_ = l1.Ij();
    }

    private void km() {
        s1.k<com.google.internal.firebase.inappmessaging.v1.sdkserving.a> kVar = this.alreadySeenCampaigns_;
        if (kVar.s1()) {
            return;
        }
        this.alreadySeenCampaigns_ = l1.yl(kVar);
    }

    public static b nm() {
        return DEFAULT_INSTANCE;
    }

    public static C1209b om() {
        return DEFAULT_INSTANCE.jf();
    }

    public static C1209b pm(b bVar) {
        return DEFAULT_INSTANCE.Uf(bVar);
    }

    public static b qm(InputStream inputStream) throws IOException {
        return (b) l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static b rm(InputStream inputStream, v0 v0Var) throws IOException {
        return (b) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static b sm(u uVar) throws t1 {
        return (b) l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static b tm(u uVar, v0 v0Var) throws t1 {
        return (b) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static b um(z zVar) throws IOException {
        return (b) l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static b vm(z zVar, v0 v0Var) throws IOException {
        return (b) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static b wm(InputStream inputStream) throws IOException {
        return (b) l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static b xm(InputStream inputStream, v0 v0Var) throws IOException {
        return (b) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static b ym(ByteBuffer byteBuffer) throws t1 {
        return (b) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static b zm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
        return (b) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    @Override // com.google.internal.firebase.inappmessaging.v1.sdkserving.c
    public List<com.google.internal.firebase.inappmessaging.v1.sdkserving.a> O7() {
        return this.alreadySeenCampaigns_;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
        f3 cVar;
        int i10 = a.f125666a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new b();
            case 2:
                return new C1209b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"alreadySeenCampaigns_", com.google.internal.firebase.inappmessaging.v1.sdkserving.a.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<b> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (b.class) {
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

    @Override // com.google.internal.firebase.inappmessaging.v1.sdkserving.c
    public int T1() {
        return this.alreadySeenCampaigns_.size();
    }

    public d lm(int i10) {
        return this.alreadySeenCampaigns_.get(i10);
    }

    public List<? extends d> mm() {
        return this.alreadySeenCampaigns_;
    }

    @Override // com.google.internal.firebase.inappmessaging.v1.sdkserving.c
    public com.google.internal.firebase.inappmessaging.v1.sdkserving.a x4(int i10) {
        return this.alreadySeenCampaigns_.get(i10);
    }
}
