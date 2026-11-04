package com.google.longrunning;

import com.google.protobuf.f3;
import com.google.protobuf.l1;
import com.google.protobuf.t1;
import com.google.protobuf.u;
import com.google.protobuf.v0;
import com.google.protobuf.z;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends l1<g, b> implements h {
    private static final g DEFAULT_INSTANCE;
    public static final int FILTER_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 4;
    public static final int PAGE_SIZE_FIELD_NUMBER = 2;
    public static final int PAGE_TOKEN_FIELD_NUMBER = 3;
    private static volatile f3<g> PARSER;
    private int pageSize_;
    private String name_ = "";
    private String filter_ = "";
    private String pageToken_ = "";

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f125700a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f125700a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f125700a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f125700a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f125700a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f125700a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f125700a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f125700a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<g, b> implements h {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b Ol() {
            El();
            ((g) this.f126038b).lm();
            return this;
        }

        public b Pl() {
            El();
            ((g) this.f126038b).mm();
            return this;
        }

        @Override // com.google.longrunning.h
        public u Qg() {
            return ((g) this.f126038b).Qg();
        }

        public b Ql() {
            El();
            ((g) this.f126038b).nm();
            return this;
        }

        public b Rl() {
            El();
            ((g) this.f126038b).om();
            return this;
        }

        public b Sl(String str) {
            El();
            ((g) this.f126038b).Fm(str);
            return this;
        }

        public b Tl(u uVar) {
            El();
            ((g) this.f126038b).Gm(uVar);
            return this;
        }

        public b Ul(String str) {
            El();
            ((g) this.f126038b).Hm(str);
            return this;
        }

        public b Vl(u uVar) {
            El();
            ((g) this.f126038b).Im(uVar);
            return this;
        }

        public b Wl(int i10) {
            El();
            ((g) this.f126038b).Jm(i10);
            return this;
        }

        public b Xl(String str) {
            El();
            ((g) this.f126038b).Km(str);
            return this;
        }

        public b Yl(u uVar) {
            El();
            ((g) this.f126038b).Lm(uVar);
            return this;
        }

        @Override // com.google.longrunning.h
        public u a() {
            return ((g) this.f126038b).a();
        }

        @Override // com.google.longrunning.h
        public String getFilter() {
            return ((g) this.f126038b).getFilter();
        }

        @Override // com.google.longrunning.h
        public String getName() {
            return ((g) this.f126038b).getName();
        }

        @Override // com.google.longrunning.h
        public u ia() {
            return ((g) this.f126038b).ia();
        }

        @Override // com.google.longrunning.h
        public String nf() {
            return ((g) this.f126038b).nf();
        }

        @Override // com.google.longrunning.h
        public int t1() {
            return ((g) this.f126038b).t1();
        }

        private b() {
            super(g.DEFAULT_INSTANCE);
        }
    }

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        l1.Wl(g.class, gVar);
    }

    private g() {
    }

    public static g Am(ByteBuffer byteBuffer) throws t1 {
        return (g) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static g Bm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
        return (g) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static g Cm(byte[] bArr) throws t1 {
        return (g) l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static g Dm(byte[] bArr, v0 v0Var) throws t1 {
        return (g) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static f3<g> Em() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Fm(String str) {
        str.getClass();
        this.filter_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Gm(u uVar) {
        com.google.protobuf.a.R(uVar);
        this.filter_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Hm(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Im(u uVar) {
        com.google.protobuf.a.R(uVar);
        this.name_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Jm(int i10) {
        this.pageSize_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Km(String str) {
        str.getClass();
        this.pageToken_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lm(u uVar) {
        com.google.protobuf.a.R(uVar);
        this.pageToken_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lm() {
        this.filter_ = pm().getFilter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mm() {
        this.name_ = pm().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nm() {
        this.pageSize_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void om() {
        this.pageToken_ = pm().nf();
    }

    public static g pm() {
        return DEFAULT_INSTANCE;
    }

    public static b qm() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b rm(g gVar) {
        return DEFAULT_INSTANCE.Uf(gVar);
    }

    public static g sm(InputStream inputStream) throws IOException {
        return (g) l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static g tm(InputStream inputStream, v0 v0Var) throws IOException {
        return (g) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static g um(u uVar) throws t1 {
        return (g) l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static g vm(u uVar, v0 v0Var) throws t1 {
        return (g) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static g wm(z zVar) throws IOException {
        return (g) l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static g xm(z zVar, v0 v0Var) throws IOException {
        return (g) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static g ym(InputStream inputStream) throws IOException {
        return (g) l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static g zm(InputStream inputStream, v0 v0Var) throws IOException {
        return (g) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    @Override // com.google.longrunning.h
    public u Qg() {
        return u.C(this.pageToken_);
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
        f3 cVar;
        int i10 = a.f125700a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new g();
            case 2:
                return new b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003Ȉ\u0004Ȉ", new Object[]{"filter_", "pageSize_", "pageToken_", "name_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<g> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (g.class) {
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

    @Override // com.google.longrunning.h
    public u a() {
        return u.C(this.name_);
    }

    @Override // com.google.longrunning.h
    public String getFilter() {
        return this.filter_;
    }

    @Override // com.google.longrunning.h
    public String getName() {
        return this.name_;
    }

    @Override // com.google.longrunning.h
    public u ia() {
        return u.C(this.filter_);
    }

    @Override // com.google.longrunning.h
    public String nf() {
        return this.pageToken_;
    }

    @Override // com.google.longrunning.h
    public int t1() {
        return this.pageSize_;
    }
}
