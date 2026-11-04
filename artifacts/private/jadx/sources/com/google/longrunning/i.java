package com.google.longrunning;

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
    public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
    public static final int OPERATIONS_FIELD_NUMBER = 1;
    private static volatile f3<i> PARSER;
    private s1.k<k> operations_ = l1.Ij();
    private String nextPageToken_ = "";

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f125701a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f125701a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f125701a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f125701a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f125701a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f125701a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f125701a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f125701a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<i, b> implements j {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.longrunning.j
        public String Dc() {
            return ((i) this.f126038b).Dc();
        }

        @Override // com.google.longrunning.j
        public u Hb() {
            return ((i) this.f126038b).Hb();
        }

        @Override // com.google.longrunning.j
        public int Jj() {
            return ((i) this.f126038b).Jj();
        }

        @Override // com.google.longrunning.j
        public k Kb(int i10) {
            return ((i) this.f126038b).Kb(i10);
        }

        @Override // com.google.longrunning.j
        public List<k> Nd() {
            return Collections.unmodifiableList(((i) this.f126038b).Nd());
        }

        public b Ol(Iterable<? extends k> iterable) {
            El();
            ((i) this.f126038b).jm(iterable);
            return this;
        }

        public b Pl(int i10, k.b bVar) {
            El();
            ((i) this.f126038b).km(i10, bVar.build());
            return this;
        }

        public b Ql(int i10, k kVar) {
            El();
            ((i) this.f126038b).km(i10, kVar);
            return this;
        }

        public b Rl(k.b bVar) {
            El();
            ((i) this.f126038b).lm(bVar.build());
            return this;
        }

        public b Sl(k kVar) {
            El();
            ((i) this.f126038b).lm(kVar);
            return this;
        }

        public b Tl() {
            El();
            ((i) this.f126038b).mm();
            return this;
        }

        public b Ul() {
            El();
            ((i) this.f126038b).nm();
            return this;
        }

        public b Vl(int i10) {
            El();
            ((i) this.f126038b).Hm(i10);
            return this;
        }

        public b Wl(String str) {
            El();
            ((i) this.f126038b).Im(str);
            return this;
        }

        public b Xl(u uVar) {
            El();
            ((i) this.f126038b).Jm(uVar);
            return this;
        }

        public b Yl(int i10, k.b bVar) {
            El();
            ((i) this.f126038b).Km(i10, bVar.build());
            return this;
        }

        public b Zl(int i10, k kVar) {
            El();
            ((i) this.f126038b).Km(i10, kVar);
            return this;
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

    public static i Am(InputStream inputStream) throws IOException {
        return (i) l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static i Bm(InputStream inputStream, v0 v0Var) throws IOException {
        return (i) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static i Cm(ByteBuffer byteBuffer) throws t1 {
        return (i) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static i Dm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
        return (i) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static i Em(byte[] bArr) throws t1 {
        return (i) l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static i Fm(byte[] bArr, v0 v0Var) throws t1 {
        return (i) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static f3<i> Gm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Hm(int i10) {
        om();
        this.operations_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Im(String str) {
        str.getClass();
        this.nextPageToken_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Jm(u uVar) {
        com.google.protobuf.a.R(uVar);
        this.nextPageToken_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Km(int i10, k kVar) {
        kVar.getClass();
        om();
        this.operations_.set(i10, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jm(Iterable<? extends k> iterable) {
        om();
        com.google.protobuf.a.y(iterable, this.operations_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void km(int i10, k kVar) {
        kVar.getClass();
        om();
        this.operations_.add(i10, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lm(k kVar) {
        kVar.getClass();
        om();
        this.operations_.add(kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mm() {
        this.nextPageToken_ = pm().Dc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nm() {
        this.operations_ = l1.Ij();
    }

    private void om() {
        s1.k<k> kVar = this.operations_;
        if (kVar.s1()) {
            return;
        }
        this.operations_ = l1.yl(kVar);
    }

    public static i pm() {
        return DEFAULT_INSTANCE;
    }

    public static b sm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b tm(i iVar) {
        return DEFAULT_INSTANCE.Uf(iVar);
    }

    public static i um(InputStream inputStream) throws IOException {
        return (i) l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static i vm(InputStream inputStream, v0 v0Var) throws IOException {
        return (i) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static i wm(u uVar) throws t1 {
        return (i) l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static i xm(u uVar, v0 v0Var) throws t1 {
        return (i) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static i ym(z zVar) throws IOException {
        return (i) l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static i zm(z zVar, v0 v0Var) throws IOException {
        return (i) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    @Override // com.google.longrunning.j
    public String Dc() {
        return this.nextPageToken_;
    }

    @Override // com.google.longrunning.j
    public u Hb() {
        return u.C(this.nextPageToken_);
    }

    @Override // com.google.longrunning.j
    public int Jj() {
        return this.operations_.size();
    }

    @Override // com.google.longrunning.j
    public k Kb(int i10) {
        return this.operations_.get(i10);
    }

    @Override // com.google.longrunning.j
    public List<k> Nd() {
        return this.operations_;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
        f3 cVar;
        int i10 = a.f125701a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new i();
            case 2:
                return new b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002Ȉ", new Object[]{"operations_", k.class, "nextPageToken_"});
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

    public n qm(int i10) {
        return this.operations_.get(i10);
    }

    public List<? extends n> rm() {
        return this.operations_;
    }
}
