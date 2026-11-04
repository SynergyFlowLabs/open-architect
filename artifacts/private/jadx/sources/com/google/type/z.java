package com.google.type;

import com.google.protobuf.f3;
import com.google.protobuf.l1;
import com.google.protobuf.s1;
import com.google.protobuf.t1;
import com.google.protobuf.v0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class z extends l1<z, b> implements a0 {
    public static final int ADDRESS_LINES_FIELD_NUMBER = 9;
    public static final int ADMINISTRATIVE_AREA_FIELD_NUMBER = 6;
    private static final z DEFAULT_INSTANCE;
    public static final int LANGUAGE_CODE_FIELD_NUMBER = 3;
    public static final int LOCALITY_FIELD_NUMBER = 7;
    public static final int ORGANIZATION_FIELD_NUMBER = 11;
    private static volatile f3<z> PARSER = null;
    public static final int POSTAL_CODE_FIELD_NUMBER = 4;
    public static final int RECIPIENTS_FIELD_NUMBER = 10;
    public static final int REGION_CODE_FIELD_NUMBER = 2;
    public static final int REVISION_FIELD_NUMBER = 1;
    public static final int SORTING_CODE_FIELD_NUMBER = 5;
    public static final int SUBLOCALITY_FIELD_NUMBER = 8;
    private int revision_;
    private String regionCode_ = "";
    private String languageCode_ = "";
    private String postalCode_ = "";
    private String sortingCode_ = "";
    private String administrativeArea_ = "";
    private String locality_ = "";
    private String sublocality_ = "";
    private s1.k<String> addressLines_ = l1.Ij();
    private s1.k<String> recipients_ = l1.Ij();
    private String organization_ = "";

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f126756a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f126756a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f126756a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f126756a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f126756a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f126756a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f126756a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f126756a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<z, b> implements a0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.type.a0
        public String Ag() {
            return ((z) this.f126038b).Ag();
        }

        @Override // com.google.type.a0
        public com.google.protobuf.u B2() {
            return ((z) this.f126038b).B2();
        }

        @Override // com.google.type.a0
        public com.google.protobuf.u B9() {
            return ((z) this.f126038b).B9();
        }

        @Override // com.google.type.a0
        public com.google.protobuf.u Bk() {
            return ((z) this.f126038b).Bk();
        }

        @Override // com.google.type.a0
        public List<String> Ci() {
            return Collections.unmodifiableList(((z) this.f126038b).Ci());
        }

        @Override // com.google.type.a0
        public String Db() {
            return ((z) this.f126038b).Db();
        }

        @Override // com.google.type.a0
        public String J8() {
            return ((z) this.f126038b).J8();
        }

        @Override // com.google.type.a0
        public String Lb() {
            return ((z) this.f126038b).Lb();
        }

        @Override // com.google.type.a0
        public String Lk() {
            return ((z) this.f126038b).Lk();
        }

        public b Ol(String str) {
            El();
            ((z) this.f126038b).Km(str);
            return this;
        }

        @Override // com.google.type.a0
        public com.google.protobuf.u Pf() {
            return ((z) this.f126038b).Pf();
        }

        public b Pl(com.google.protobuf.u uVar) {
            El();
            ((z) this.f126038b).Lm(uVar);
            return this;
        }

        public b Ql(Iterable<String> iterable) {
            El();
            ((z) this.f126038b).Mm(iterable);
            return this;
        }

        public b Rl(Iterable<String> iterable) {
            El();
            ((z) this.f126038b).Nm(iterable);
            return this;
        }

        public b Sl(String str) {
            El();
            ((z) this.f126038b).Om(str);
            return this;
        }

        public b Tl(com.google.protobuf.u uVar) {
            El();
            ((z) this.f126038b).Pm(uVar);
            return this;
        }

        public b Ul() {
            El();
            ((z) this.f126038b).Qm();
            return this;
        }

        public b Vl() {
            El();
            ((z) this.f126038b).Rm();
            return this;
        }

        @Override // com.google.type.a0
        public int Wf() {
            return ((z) this.f126038b).Wf();
        }

        public b Wl() {
            El();
            ((z) this.f126038b).Sm();
            return this;
        }

        public b Xl() {
            El();
            ((z) this.f126038b).Tm();
            return this;
        }

        @Override // com.google.type.a0
        public com.google.protobuf.u Y1() {
            return ((z) this.f126038b).Y1();
        }

        public b Yl() {
            El();
            ((z) this.f126038b).Um();
            return this;
        }

        @Override // com.google.type.a0
        public com.google.protobuf.u Z9(int i10) {
            return ((z) this.f126038b).Z9(i10);
        }

        public b Zl() {
            El();
            ((z) this.f126038b).Vm();
            return this;
        }

        @Override // com.google.type.a0
        public com.google.protobuf.u aa() {
            return ((z) this.f126038b).aa();
        }

        public b am() {
            El();
            ((z) this.f126038b).Wm();
            return this;
        }

        @Override // com.google.type.a0
        public com.google.protobuf.u bf(int i10) {
            return ((z) this.f126038b).bf(i10);
        }

        public b bm() {
            El();
            ((z) this.f126038b).Xm();
            return this;
        }

        @Override // com.google.type.a0
        public String ci(int i10) {
            return ((z) this.f126038b).ci(i10);
        }

        public b cm() {
            El();
            ((z) this.f126038b).Ym();
            return this;
        }

        public b dm() {
            El();
            ((z) this.f126038b).Zm();
            return this;
        }

        public b em() {
            El();
            ((z) this.f126038b).an();
            return this;
        }

        public b fm(int i10, String str) {
            El();
            ((z) this.f126038b).tn(i10, str);
            return this;
        }

        @Override // com.google.type.a0
        public String getLanguageCode() {
            return ((z) this.f126038b).getLanguageCode();
        }

        @Override // com.google.type.a0
        public String getRegionCode() {
            return ((z) this.f126038b).getRegionCode();
        }

        public b gm(String str) {
            El();
            ((z) this.f126038b).un(str);
            return this;
        }

        public b hm(com.google.protobuf.u uVar) {
            El();
            ((z) this.f126038b).vn(uVar);
            return this;
        }

        public b im(String str) {
            El();
            ((z) this.f126038b).wn(str);
            return this;
        }

        public b jm(com.google.protobuf.u uVar) {
            El();
            ((z) this.f126038b).xn(uVar);
            return this;
        }

        public b km(String str) {
            El();
            ((z) this.f126038b).yn(str);
            return this;
        }

        @Override // com.google.type.a0
        public List<String> l8() {
            return Collections.unmodifiableList(((z) this.f126038b).l8());
        }

        @Override // com.google.type.a0
        public com.google.protobuf.u lc() {
            return ((z) this.f126038b).lc();
        }

        public b lm(com.google.protobuf.u uVar) {
            El();
            ((z) this.f126038b).zn(uVar);
            return this;
        }

        @Override // com.google.type.a0
        public String mj(int i10) {
            return ((z) this.f126038b).mj(i10);
        }

        public b mm(String str) {
            El();
            ((z) this.f126038b).An(str);
            return this;
        }

        @Override // com.google.type.a0
        public int nh() {
            return ((z) this.f126038b).nh();
        }

        public b nm(com.google.protobuf.u uVar) {
            El();
            ((z) this.f126038b).Bn(uVar);
            return this;
        }

        public b om(String str) {
            El();
            ((z) this.f126038b).Cn(str);
            return this;
        }

        public b pm(com.google.protobuf.u uVar) {
            El();
            ((z) this.f126038b).Dn(uVar);
            return this;
        }

        @Override // com.google.type.a0
        public com.google.protobuf.u qj() {
            return ((z) this.f126038b).qj();
        }

        public b qm(int i10, String str) {
            El();
            ((z) this.f126038b).En(i10, str);
            return this;
        }

        public b rm(String str) {
            El();
            ((z) this.f126038b).Fn(str);
            return this;
        }

        public b sm(com.google.protobuf.u uVar) {
            El();
            ((z) this.f126038b).Gn(uVar);
            return this;
        }

        public b tm(int i10) {
            El();
            ((z) this.f126038b).Hn(i10);
            return this;
        }

        public b um(String str) {
            El();
            ((z) this.f126038b).In(str);
            return this;
        }

        public b vm(com.google.protobuf.u uVar) {
            El();
            ((z) this.f126038b).Jn(uVar);
            return this;
        }

        @Override // com.google.type.a0
        public int w8() {
            return ((z) this.f126038b).w8();
        }

        public b wm(String str) {
            El();
            ((z) this.f126038b).Kn(str);
            return this;
        }

        public b xm(com.google.protobuf.u uVar) {
            El();
            ((z) this.f126038b).Ln(uVar);
            return this;
        }

        @Override // com.google.type.a0
        public String ye() {
            return ((z) this.f126038b).ye();
        }

        private b() {
            super(z.DEFAULT_INSTANCE);
        }
    }

    static {
        z zVar = new z();
        DEFAULT_INSTANCE = zVar;
        l1.Wl(z.class, zVar);
    }

    private z() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void An(String str) {
        str.getClass();
        this.organization_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Bn(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.organization_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Cn(String str) {
        str.getClass();
        this.postalCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Dn(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.postalCode_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void En(int i10, String str) {
        str.getClass();
        cn();
        this.recipients_.set(i10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Fn(String str) {
        str.getClass();
        this.regionCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Gn(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.regionCode_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Hn(int i10) {
        this.revision_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void In(String str) {
        str.getClass();
        this.sortingCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Jn(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.sortingCode_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Km(String str) {
        str.getClass();
        bn();
        this.addressLines_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Kn(String str) {
        str.getClass();
        this.sublocality_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lm(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        bn();
        this.addressLines_.add(uVar.z0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Ln(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.sublocality_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Mm(Iterable<String> iterable) {
        bn();
        com.google.protobuf.a.y(iterable, this.addressLines_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Nm(Iterable<String> iterable) {
        cn();
        com.google.protobuf.a.y(iterable, this.recipients_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Om(String str) {
        str.getClass();
        cn();
        this.recipients_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Pm(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        cn();
        this.recipients_.add(uVar.z0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qm() {
        this.addressLines_ = l1.Ij();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Rm() {
        this.administrativeArea_ = dn().Lk();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Sm() {
        this.languageCode_ = dn().getLanguageCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Tm() {
        this.locality_ = dn().Db();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Um() {
        this.organization_ = dn().Ag();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Vm() {
        this.postalCode_ = dn().J8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Wm() {
        this.recipients_ = l1.Ij();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Xm() {
        this.regionCode_ = dn().getRegionCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Ym() {
        this.revision_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Zm() {
        this.sortingCode_ = dn().Lb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void an() {
        this.sublocality_ = dn().ye();
    }

    private void bn() {
        s1.k<String> kVar = this.addressLines_;
        if (kVar.s1()) {
            return;
        }
        this.addressLines_ = l1.yl(kVar);
    }

    private void cn() {
        s1.k<String> kVar = this.recipients_;
        if (kVar.s1()) {
            return;
        }
        this.recipients_ = l1.yl(kVar);
    }

    public static z dn() {
        return DEFAULT_INSTANCE;
    }

    public static b en() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b fn(z zVar) {
        return DEFAULT_INSTANCE.Uf(zVar);
    }

    public static z gn(InputStream inputStream) throws IOException {
        return (z) l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static z hn(InputStream inputStream, v0 v0Var) throws IOException {
        return (z) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static z in(com.google.protobuf.u uVar) throws t1 {
        return (z) l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static z jn(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
        return (z) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static z kn(com.google.protobuf.z zVar) throws IOException {
        return (z) l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static z ln(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
        return (z) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static z mn(InputStream inputStream) throws IOException {
        return (z) l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static z nn(InputStream inputStream, v0 v0Var) throws IOException {
        return (z) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static z on(ByteBuffer byteBuffer) throws t1 {
        return (z) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static z pn(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
        return (z) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static z qn(byte[] bArr) throws t1 {
        return (z) l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static z rn(byte[] bArr, v0 v0Var) throws t1 {
        return (z) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static f3<z> sn() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tn(int i10, String str) {
        str.getClass();
        bn();
        this.addressLines_.set(i10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void un(String str) {
        str.getClass();
        this.administrativeArea_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vn(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.administrativeArea_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wn(String str) {
        str.getClass();
        this.languageCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xn(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.languageCode_ = uVar.z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yn(String str) {
        str.getClass();
        this.locality_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zn(com.google.protobuf.u uVar) {
        com.google.protobuf.a.R(uVar);
        this.locality_ = uVar.z0();
    }

    @Override // com.google.type.a0
    public String Ag() {
        return this.organization_;
    }

    @Override // com.google.type.a0
    public com.google.protobuf.u B2() {
        return com.google.protobuf.u.C(this.languageCode_);
    }

    @Override // com.google.type.a0
    public com.google.protobuf.u B9() {
        return com.google.protobuf.u.C(this.postalCode_);
    }

    @Override // com.google.type.a0
    public com.google.protobuf.u Bk() {
        return com.google.protobuf.u.C(this.organization_);
    }

    @Override // com.google.type.a0
    public List<String> Ci() {
        return this.addressLines_;
    }

    @Override // com.google.type.a0
    public String Db() {
        return this.locality_;
    }

    @Override // com.google.type.a0
    public String J8() {
        return this.postalCode_;
    }

    @Override // com.google.type.a0
    public String Lb() {
        return this.sortingCode_;
    }

    @Override // com.google.type.a0
    public String Lk() {
        return this.administrativeArea_;
    }

    @Override // com.google.type.a0
    public com.google.protobuf.u Pf() {
        return com.google.protobuf.u.C(this.sortingCode_);
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
        f3 cVar;
        int i10 = a.f126756a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new z();
            case 2:
                return new b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0002\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȚ\nȚ\u000bȈ", new Object[]{"revision_", "regionCode_", "languageCode_", "postalCode_", "sortingCode_", "administrativeArea_", "locality_", "sublocality_", "addressLines_", "recipients_", "organization_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<z> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (z.class) {
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

    @Override // com.google.type.a0
    public int Wf() {
        return this.revision_;
    }

    @Override // com.google.type.a0
    public com.google.protobuf.u Y1() {
        return com.google.protobuf.u.C(this.regionCode_);
    }

    @Override // com.google.type.a0
    public com.google.protobuf.u Z9(int i10) {
        return com.google.protobuf.u.C(this.addressLines_.get(i10));
    }

    @Override // com.google.type.a0
    public com.google.protobuf.u aa() {
        return com.google.protobuf.u.C(this.locality_);
    }

    @Override // com.google.type.a0
    public com.google.protobuf.u bf(int i10) {
        return com.google.protobuf.u.C(this.recipients_.get(i10));
    }

    @Override // com.google.type.a0
    public String ci(int i10) {
        return this.addressLines_.get(i10);
    }

    @Override // com.google.type.a0
    public String getLanguageCode() {
        return this.languageCode_;
    }

    @Override // com.google.type.a0
    public String getRegionCode() {
        return this.regionCode_;
    }

    @Override // com.google.type.a0
    public List<String> l8() {
        return this.recipients_;
    }

    @Override // com.google.type.a0
    public com.google.protobuf.u lc() {
        return com.google.protobuf.u.C(this.sublocality_);
    }

    @Override // com.google.type.a0
    public String mj(int i10) {
        return this.recipients_.get(i10);
    }

    @Override // com.google.type.a0
    public int nh() {
        return this.addressLines_.size();
    }

    @Override // com.google.type.a0
    public com.google.protobuf.u qj() {
        return com.google.protobuf.u.C(this.administrativeArea_);
    }

    @Override // com.google.type.a0
    public int w8() {
        return this.recipients_.size();
    }

    @Override // com.google.type.a0
    public String ye() {
        return this.sublocality_;
    }
}
