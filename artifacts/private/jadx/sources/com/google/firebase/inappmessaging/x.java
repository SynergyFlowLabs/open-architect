package com.google.firebase.inappmessaging;

import com.google.protobuf.f3;
import com.google.protobuf.l1;
import com.google.protobuf.o2;
import com.google.protobuf.t1;
import com.google.protobuf.v0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class x {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f123134a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f123134a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f123134a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f123134a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f123134a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f123134a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f123134a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f123134a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1<b, a> implements c {
        public static final int ACTION_URL_FIELD_NUMBER = 1;
        private static final b DEFAULT_INSTANCE;
        private static volatile f3<b> PARSER;
        private String actionUrl_ = "";

        public static final class a extends l1.b<b, a> implements c {
            /* synthetic */ a(a aVar) {
                this();
            }

            public a Ol() {
                El();
                ((b) this.f126038b).dm();
                return this;
            }

            public a Pl(String str) {
                El();
                ((b) this.f126038b).um(str);
                return this;
            }

            public a Ql(com.google.protobuf.u uVar) {
                El();
                ((b) this.f126038b).vm(uVar);
                return this;
            }

            @Override // com.google.firebase.inappmessaging.x.c
            public String Sj() {
                return ((b) this.f126038b).Sj();
            }

            @Override // com.google.firebase.inappmessaging.x.c
            public com.google.protobuf.u oi() {
                return ((b) this.f126038b).oi();
            }

            private a() {
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

        /* JADX INFO: Access modifiers changed from: private */
        public void dm() {
            this.actionUrl_ = em().Sj();
        }

        public static b em() {
            return DEFAULT_INSTANCE;
        }

        public static a fm() {
            return DEFAULT_INSTANCE.jf();
        }

        public static a gm(b bVar) {
            return DEFAULT_INSTANCE.Uf(bVar);
        }

        public static b hm(InputStream inputStream) throws IOException {
            return (b) l1.El(DEFAULT_INSTANCE, inputStream);
        }

        public static b im(InputStream inputStream, v0 v0Var) throws IOException {
            return (b) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static b jm(com.google.protobuf.u uVar) throws t1 {
            return (b) l1.Gl(DEFAULT_INSTANCE, uVar);
        }

        public static b km(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
            return (b) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
        }

        public static b lm(com.google.protobuf.z zVar) throws IOException {
            return (b) l1.Il(DEFAULT_INSTANCE, zVar);
        }

        public static b mm(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
            return (b) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
        }

        public static b nm(InputStream inputStream) throws IOException {
            return (b) l1.Kl(DEFAULT_INSTANCE, inputStream);
        }

        public static b om(InputStream inputStream, v0 v0Var) throws IOException {
            return (b) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static b pm(ByteBuffer byteBuffer) throws t1 {
            return (b) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
        }

        public static b qm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
            return (b) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
        }

        public static b rm(byte[] bArr) throws t1 {
            return (b) l1.Ol(DEFAULT_INSTANCE, bArr);
        }

        public static b sm(byte[] bArr, v0 v0Var) throws t1 {
            return (b) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
        }

        public static f3<b> tm() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void um(String str) {
            str.getClass();
            this.actionUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void vm(com.google.protobuf.u uVar) {
            com.google.protobuf.a.R(uVar);
            this.actionUrl_ = uVar.z0();
        }

        @Override // com.google.protobuf.l1
        protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
            f3 cVar;
            int i10 = a.f123134a[iVar.ordinal()];
            a aVar = null;
            switch (i10) {
                case 1:
                    return new b();
                case 2:
                    return new a(aVar);
                case 3:
                    return l1.Al(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"actionUrl_"});
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

        @Override // com.google.firebase.inappmessaging.x.c
        public String Sj() {
            return this.actionUrl_;
        }

        @Override // com.google.firebase.inappmessaging.x.c
        public com.google.protobuf.u oi() {
            return com.google.protobuf.u.C(this.actionUrl_);
        }
    }

    public interface c extends o2 {
        String Sj();

        com.google.protobuf.u oi();
    }

    public static final class d extends l1<d, a> implements e {
        public static final int ACTION_FIELD_NUMBER = 4;
        public static final int BACKGROUND_HEX_COLOR_FIELD_NUMBER = 5;
        public static final int BODY_FIELD_NUMBER = 2;
        private static final d DEFAULT_INSTANCE;
        public static final int IMAGE_URL_FIELD_NUMBER = 3;
        private static volatile f3<d> PARSER = null;
        public static final int TITLE_FIELD_NUMBER = 1;
        private b action_;
        private int bitField0_;
        private p body_;
        private p title_;
        private String imageUrl_ = "";
        private String backgroundHexColor_ = "";

        public static final class a extends l1.b<d, a> implements e {
            /* synthetic */ a(a aVar) {
                this();
            }

            @Override // com.google.firebase.inappmessaging.x.e
            public com.google.protobuf.u C1() {
                return ((d) this.f126038b).C1();
            }

            @Override // com.google.firebase.inappmessaging.x.e
            public String E0() {
                return ((d) this.f126038b).E0();
            }

            @Override // com.google.firebase.inappmessaging.x.e
            public com.google.protobuf.u E1() {
                return ((d) this.f126038b).E1();
            }

            @Override // com.google.firebase.inappmessaging.x.e
            public boolean M1() {
                return ((d) this.f126038b).M1();
            }

            public a Ol() {
                El();
                ((d) this.f126038b).pm();
                return this;
            }

            public a Pl() {
                El();
                ((d) this.f126038b).qm();
                return this;
            }

            public a Ql() {
                El();
                ((d) this.f126038b).rm();
                return this;
            }

            public a Rl() {
                El();
                ((d) this.f126038b).sm();
                return this;
            }

            @Override // com.google.firebase.inappmessaging.x.e
            public String S0() {
                return ((d) this.f126038b).S0();
            }

            public a Sl() {
                El();
                ((d) this.f126038b).tm();
                return this;
            }

            public a Tl(b bVar) {
                El();
                ((d) this.f126038b).vm(bVar);
                return this;
            }

            public a Ul(p pVar) {
                El();
                ((d) this.f126038b).wm(pVar);
                return this;
            }

            public a Vl(p pVar) {
                El();
                ((d) this.f126038b).xm(pVar);
                return this;
            }

            public a Wl(b.a aVar) {
                El();
                ((d) this.f126038b).Nm(aVar.build());
                return this;
            }

            public a Xl(b bVar) {
                El();
                ((d) this.f126038b).Nm(bVar);
                return this;
            }

            public a Yl(String str) {
                El();
                ((d) this.f126038b).Om(str);
                return this;
            }

            public a Zl(com.google.protobuf.u uVar) {
                El();
                ((d) this.f126038b).Pm(uVar);
                return this;
            }

            public a am(p.a aVar) {
                El();
                ((d) this.f126038b).Qm(aVar.build());
                return this;
            }

            public a bm(p pVar) {
                El();
                ((d) this.f126038b).Qm(pVar);
                return this;
            }

            public a cm(String str) {
                El();
                ((d) this.f126038b).Rm(str);
                return this;
            }

            public a dm(com.google.protobuf.u uVar) {
                El();
                ((d) this.f126038b).Sm(uVar);
                return this;
            }

            public a em(p.a aVar) {
                El();
                ((d) this.f126038b).Tm(aVar.build());
                return this;
            }

            public a fm(p pVar) {
                El();
                ((d) this.f126038b).Tm(pVar);
                return this;
            }

            @Override // com.google.firebase.inappmessaging.x.e
            public p getBody() {
                return ((d) this.f126038b).getBody();
            }

            @Override // com.google.firebase.inappmessaging.x.e
            public p getTitle() {
                return ((d) this.f126038b).getTitle();
            }

            @Override // com.google.firebase.inappmessaging.x.e
            public boolean hasBody() {
                return ((d) this.f126038b).hasBody();
            }

            @Override // com.google.firebase.inappmessaging.x.e
            public boolean j1() {
                return ((d) this.f126038b).j1();
            }

            @Override // com.google.firebase.inappmessaging.x.e
            public b k0() {
                return ((d) this.f126038b).k0();
            }

            private a() {
                super(d.DEFAULT_INSTANCE);
            }
        }

        static {
            d dVar = new d();
            DEFAULT_INSTANCE = dVar;
            l1.Wl(d.class, dVar);
        }

        private d() {
        }

        public static d Am(InputStream inputStream) throws IOException {
            return (d) l1.El(DEFAULT_INSTANCE, inputStream);
        }

        public static d Bm(InputStream inputStream, v0 v0Var) throws IOException {
            return (d) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static d Cm(com.google.protobuf.u uVar) throws t1 {
            return (d) l1.Gl(DEFAULT_INSTANCE, uVar);
        }

        public static d Dm(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
            return (d) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
        }

        public static d Em(com.google.protobuf.z zVar) throws IOException {
            return (d) l1.Il(DEFAULT_INSTANCE, zVar);
        }

        public static d Fm(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
            return (d) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
        }

        public static d Gm(InputStream inputStream) throws IOException {
            return (d) l1.Kl(DEFAULT_INSTANCE, inputStream);
        }

        public static d Hm(InputStream inputStream, v0 v0Var) throws IOException {
            return (d) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static d Im(ByteBuffer byteBuffer) throws t1 {
            return (d) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
        }

        public static d Jm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
            return (d) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
        }

        public static d Km(byte[] bArr) throws t1 {
            return (d) l1.Ol(DEFAULT_INSTANCE, bArr);
        }

        public static d Lm(byte[] bArr, v0 v0Var) throws t1 {
            return (d) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
        }

        public static f3<d> Mm() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Nm(b bVar) {
            bVar.getClass();
            this.action_ = bVar;
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Om(String str) {
            str.getClass();
            this.backgroundHexColor_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Pm(com.google.protobuf.u uVar) {
            com.google.protobuf.a.R(uVar);
            this.backgroundHexColor_ = uVar.z0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Qm(p pVar) {
            pVar.getClass();
            this.body_ = pVar;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Rm(String str) {
            str.getClass();
            this.imageUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Sm(com.google.protobuf.u uVar) {
            com.google.protobuf.a.R(uVar);
            this.imageUrl_ = uVar.z0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Tm(p pVar) {
            pVar.getClass();
            this.title_ = pVar;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void pm() {
            this.action_ = null;
            this.bitField0_ &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void qm() {
            this.backgroundHexColor_ = um().S0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void rm() {
            this.body_ = null;
            this.bitField0_ &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void sm() {
            this.imageUrl_ = um().E0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void tm() {
            this.title_ = null;
            this.bitField0_ &= -2;
        }

        public static d um() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void vm(b bVar) {
            bVar.getClass();
            b bVar2 = this.action_;
            if (bVar2 == null || bVar2 == b.em()) {
                this.action_ = bVar;
            } else {
                this.action_ = b.gm(this.action_).Jl(bVar).B1();
            }
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void wm(p pVar) {
            pVar.getClass();
            p pVar2 = this.body_;
            if (pVar2 == null || pVar2 == p.im()) {
                this.body_ = pVar;
            } else {
                this.body_ = p.km(this.body_).Jl(pVar).B1();
            }
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void xm(p pVar) {
            pVar.getClass();
            p pVar2 = this.title_;
            if (pVar2 == null || pVar2 == p.im()) {
                this.title_ = pVar;
            } else {
                this.title_ = p.km(this.title_).Jl(pVar).B1();
            }
            this.bitField0_ |= 1;
        }

        public static a ym() {
            return DEFAULT_INSTANCE.jf();
        }

        public static a zm(d dVar) {
            return DEFAULT_INSTANCE.Uf(dVar);
        }

        @Override // com.google.firebase.inappmessaging.x.e
        public com.google.protobuf.u C1() {
            return com.google.protobuf.u.C(this.imageUrl_);
        }

        @Override // com.google.firebase.inappmessaging.x.e
        public String E0() {
            return this.imageUrl_;
        }

        @Override // com.google.firebase.inappmessaging.x.e
        public com.google.protobuf.u E1() {
            return com.google.protobuf.u.C(this.backgroundHexColor_);
        }

        @Override // com.google.firebase.inappmessaging.x.e
        public boolean M1() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.l1
        protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
            f3 cVar;
            int i10 = a.f123134a[iVar.ordinal()];
            a aVar = null;
            switch (i10) {
                case 1:
                    return new d();
                case 2:
                    return new a(aVar);
                case 3:
                    return l1.Al(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003Ȉ\u0004ဉ\u0002\u0005Ȉ", new Object[]{"bitField0_", "title_", "body_", "imageUrl_", "action_", "backgroundHexColor_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f3<d> f3Var = PARSER;
                    if (f3Var != null) {
                        return f3Var;
                    }
                    synchronized (d.class) {
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

        @Override // com.google.firebase.inappmessaging.x.e
        public String S0() {
            return this.backgroundHexColor_;
        }

        @Override // com.google.firebase.inappmessaging.x.e
        public p getBody() {
            p pVarIm = this.body_;
            if (pVarIm == null) {
                pVarIm = p.im();
            }
            return pVarIm;
        }

        @Override // com.google.firebase.inappmessaging.x.e
        public p getTitle() {
            p pVarIm = this.title_;
            if (pVarIm == null) {
                pVarIm = p.im();
            }
            return pVarIm;
        }

        @Override // com.google.firebase.inappmessaging.x.e
        public boolean hasBody() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.firebase.inappmessaging.x.e
        public boolean j1() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.firebase.inappmessaging.x.e
        public b k0() {
            b bVar = this.action_;
            return bVar == null ? b.em() : bVar;
        }
    }

    public interface e extends o2 {
        com.google.protobuf.u C1();

        String E0();

        com.google.protobuf.u E1();

        boolean M1();

        String S0();

        p getBody();

        p getTitle();

        boolean hasBody();

        boolean j1();

        b k0();
    }

    public static final class f extends l1<f, a> implements g {
        public static final int BUTTON_HEX_COLOR_FIELD_NUMBER = 2;
        private static final f DEFAULT_INSTANCE;
        private static volatile f3<f> PARSER = null;
        public static final int TEXT_FIELD_NUMBER = 1;
        private int bitField0_;
        private String buttonHexColor_ = "";
        private p text_;

        public static final class a extends l1.b<f, a> implements g {
            /* synthetic */ a(a aVar) {
                this();
            }

            public a Ol() {
                El();
                ((f) this.f126038b).gm();
                return this;
            }

            public a Pl() {
                El();
                ((f) this.f126038b).hm();
                return this;
            }

            public a Ql(p pVar) {
                El();
                ((f) this.f126038b).jm(pVar);
                return this;
            }

            public a Rl(String str) {
                El();
                ((f) this.f126038b).zm(str);
                return this;
            }

            public a Sl(com.google.protobuf.u uVar) {
                El();
                ((f) this.f126038b).Am(uVar);
                return this;
            }

            @Override // com.google.firebase.inappmessaging.x.g
            public boolean T3() {
                return ((f) this.f126038b).T3();
            }

            public a Tl(p.a aVar) {
                El();
                ((f) this.f126038b).Bm(aVar.build());
                return this;
            }

            public a Ul(p pVar) {
                El();
                ((f) this.f126038b).Bm(pVar);
                return this;
            }

            @Override // com.google.firebase.inappmessaging.x.g
            public com.google.protobuf.u Vd() {
                return ((f) this.f126038b).Vd();
            }

            @Override // com.google.firebase.inappmessaging.x.g
            public p getText() {
                return ((f) this.f126038b).getText();
            }

            @Override // com.google.firebase.inappmessaging.x.g
            public String h9() {
                return ((f) this.f126038b).h9();
            }

            private a() {
                super(f.DEFAULT_INSTANCE);
            }
        }

        static {
            f fVar = new f();
            DEFAULT_INSTANCE = fVar;
            l1.Wl(f.class, fVar);
        }

        private f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Am(com.google.protobuf.u uVar) {
            com.google.protobuf.a.R(uVar);
            this.buttonHexColor_ = uVar.z0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Bm(p pVar) {
            pVar.getClass();
            this.text_ = pVar;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void gm() {
            this.buttonHexColor_ = im().h9();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void hm() {
            this.text_ = null;
            this.bitField0_ &= -2;
        }

        public static f im() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void jm(p pVar) {
            pVar.getClass();
            p pVar2 = this.text_;
            if (pVar2 == null || pVar2 == p.im()) {
                this.text_ = pVar;
            } else {
                this.text_ = p.km(this.text_).Jl(pVar).B1();
            }
            this.bitField0_ |= 1;
        }

        public static a km() {
            return DEFAULT_INSTANCE.jf();
        }

        public static a lm(f fVar) {
            return DEFAULT_INSTANCE.Uf(fVar);
        }

        public static f mm(InputStream inputStream) throws IOException {
            return (f) l1.El(DEFAULT_INSTANCE, inputStream);
        }

        public static f nm(InputStream inputStream, v0 v0Var) throws IOException {
            return (f) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static f om(com.google.protobuf.u uVar) throws t1 {
            return (f) l1.Gl(DEFAULT_INSTANCE, uVar);
        }

        public static f pm(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
            return (f) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
        }

        public static f qm(com.google.protobuf.z zVar) throws IOException {
            return (f) l1.Il(DEFAULT_INSTANCE, zVar);
        }

        public static f rm(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
            return (f) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
        }

        public static f sm(InputStream inputStream) throws IOException {
            return (f) l1.Kl(DEFAULT_INSTANCE, inputStream);
        }

        public static f tm(InputStream inputStream, v0 v0Var) throws IOException {
            return (f) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static f um(ByteBuffer byteBuffer) throws t1 {
            return (f) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
        }

        public static f vm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
            return (f) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
        }

        public static f wm(byte[] bArr) throws t1 {
            return (f) l1.Ol(DEFAULT_INSTANCE, bArr);
        }

        public static f xm(byte[] bArr, v0 v0Var) throws t1 {
            return (f) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
        }

        public static f3<f> ym() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zm(String str) {
            str.getClass();
            this.buttonHexColor_ = str;
        }

        @Override // com.google.protobuf.l1
        protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
            f3 cVar;
            int i10 = a.f123134a[iVar.ordinal()];
            a aVar = null;
            switch (i10) {
                case 1:
                    return new f();
                case 2:
                    return new a(aVar);
                case 3:
                    return l1.Al(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ", new Object[]{"bitField0_", "text_", "buttonHexColor_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f3<f> f3Var = PARSER;
                    if (f3Var != null) {
                        return f3Var;
                    }
                    synchronized (f.class) {
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

        @Override // com.google.firebase.inappmessaging.x.g
        public boolean T3() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.firebase.inappmessaging.x.g
        public com.google.protobuf.u Vd() {
            return com.google.protobuf.u.C(this.buttonHexColor_);
        }

        @Override // com.google.firebase.inappmessaging.x.g
        public p getText() {
            p pVarIm = this.text_;
            if (pVarIm == null) {
                pVarIm = p.im();
            }
            return pVarIm;
        }

        @Override // com.google.firebase.inappmessaging.x.g
        public String h9() {
            return this.buttonHexColor_;
        }
    }

    public interface g extends o2 {
        boolean T3();

        com.google.protobuf.u Vd();

        p getText();

        String h9();
    }

    public static final class h extends l1<h, a> implements i {
        public static final int BACKGROUND_HEX_COLOR_FIELD_NUMBER = 5;
        public static final int BODY_FIELD_NUMBER = 2;
        private static final h DEFAULT_INSTANCE;
        public static final int LANDSCAPE_IMAGE_URL_FIELD_NUMBER = 4;
        private static volatile f3<h> PARSER = null;
        public static final int PORTRAIT_IMAGE_URL_FIELD_NUMBER = 3;
        public static final int PRIMARY_ACTION_BUTTON_FIELD_NUMBER = 6;
        public static final int PRIMARY_ACTION_FIELD_NUMBER = 7;
        public static final int SECONDARY_ACTION_BUTTON_FIELD_NUMBER = 8;
        public static final int SECONDARY_ACTION_FIELD_NUMBER = 9;
        public static final int TITLE_FIELD_NUMBER = 1;
        private int bitField0_;
        private p body_;
        private f primaryActionButton_;
        private b primaryAction_;
        private f secondaryActionButton_;
        private b secondaryAction_;
        private p title_;
        private String portraitImageUrl_ = "";
        private String landscapeImageUrl_ = "";
        private String backgroundHexColor_ = "";

        public static final class a extends l1.b<h, a> implements i {
            /* synthetic */ a(a aVar) {
                this();
            }

            @Override // com.google.firebase.inappmessaging.x.i
            public boolean Bj() {
                return ((h) this.f126038b).Bj();
            }

            @Override // com.google.firebase.inappmessaging.x.i
            public com.google.protobuf.u E1() {
                return ((h) this.f126038b).E1();
            }

            @Override // com.google.firebase.inappmessaging.x.i
            public String Ea() {
                return ((h) this.f126038b).Ea();
            }

            @Override // com.google.firebase.inappmessaging.x.i
            public f H8() {
                return ((h) this.f126038b).H8();
            }

            @Override // com.google.firebase.inappmessaging.x.i
            public f Lj() {
                return ((h) this.f126038b).Lj();
            }

            @Override // com.google.firebase.inappmessaging.x.i
            public b Ne() {
                return ((h) this.f126038b).Ne();
            }

            public a Ol() {
                El();
                ((h) this.f126038b).Bm();
                return this;
            }

            public a Pl() {
                El();
                ((h) this.f126038b).Cm();
                return this;
            }

            public a Ql() {
                El();
                ((h) this.f126038b).Dm();
                return this;
            }

            public a Rl() {
                El();
                ((h) this.f126038b).Em();
                return this;
            }

            @Override // com.google.firebase.inappmessaging.x.i
            public String S0() {
                return ((h) this.f126038b).S0();
            }

            public a Sl() {
                El();
                ((h) this.f126038b).Fm();
                return this;
            }

            public a Tl() {
                El();
                ((h) this.f126038b).Gm();
                return this;
            }

            public a Ul() {
                El();
                ((h) this.f126038b).Hm();
                return this;
            }

            public a Vl() {
                El();
                ((h) this.f126038b).Im();
                return this;
            }

            public a Wl() {
                El();
                ((h) this.f126038b).Jm();
                return this;
            }

            public a Xl(p pVar) {
                El();
                ((h) this.f126038b).Lm(pVar);
                return this;
            }

            @Override // com.google.firebase.inappmessaging.x.i
            public String Yi() {
                return ((h) this.f126038b).Yi();
            }

            public a Yl(b bVar) {
                El();
                ((h) this.f126038b).Mm(bVar);
                return this;
            }

            public a Zl(f fVar) {
                El();
                ((h) this.f126038b).Nm(fVar);
                return this;
            }

            @Override // com.google.firebase.inappmessaging.x.i
            public com.google.protobuf.u ab() {
                return ((h) this.f126038b).ab();
            }

            public a am(b bVar) {
                El();
                ((h) this.f126038b).Om(bVar);
                return this;
            }

            public a bm(f fVar) {
                El();
                ((h) this.f126038b).Pm(fVar);
                return this;
            }

            public a cm(p pVar) {
                El();
                ((h) this.f126038b).Qm(pVar);
                return this;
            }

            @Override // com.google.firebase.inappmessaging.x.i
            public com.google.protobuf.u dk() {
                return ((h) this.f126038b).dk();
            }

            @Override // com.google.firebase.inappmessaging.x.i
            public boolean dl() {
                return ((h) this.f126038b).dl();
            }

            public a dm(String str) {
                El();
                ((h) this.f126038b).gn(str);
                return this;
            }

            public a em(com.google.protobuf.u uVar) {
                El();
                ((h) this.f126038b).hn(uVar);
                return this;
            }

            @Override // com.google.firebase.inappmessaging.x.i
            public boolean fc() {
                return ((h) this.f126038b).fc();
            }

            @Override // com.google.firebase.inappmessaging.x.i
            public b ff() {
                return ((h) this.f126038b).ff();
            }

            public a fm(p.a aVar) {
                El();
                ((h) this.f126038b).in(aVar.build());
                return this;
            }

            @Override // com.google.firebase.inappmessaging.x.i
            public p getBody() {
                return ((h) this.f126038b).getBody();
            }

            @Override // com.google.firebase.inappmessaging.x.i
            public p getTitle() {
                return ((h) this.f126038b).getTitle();
            }

            public a gm(p pVar) {
                El();
                ((h) this.f126038b).in(pVar);
                return this;
            }

            @Override // com.google.firebase.inappmessaging.x.i
            public boolean hasBody() {
                return ((h) this.f126038b).hasBody();
            }

            public a hm(String str) {
                El();
                ((h) this.f126038b).jn(str);
                return this;
            }

            public a im(com.google.protobuf.u uVar) {
                El();
                ((h) this.f126038b).kn(uVar);
                return this;
            }

            @Override // com.google.firebase.inappmessaging.x.i
            public boolean j1() {
                return ((h) this.f126038b).j1();
            }

            public a jm(String str) {
                El();
                ((h) this.f126038b).ln(str);
                return this;
            }

            public a km(com.google.protobuf.u uVar) {
                El();
                ((h) this.f126038b).mn(uVar);
                return this;
            }

            public a lm(b.a aVar) {
                El();
                ((h) this.f126038b).nn(aVar.build());
                return this;
            }

            public a mm(b bVar) {
                El();
                ((h) this.f126038b).nn(bVar);
                return this;
            }

            public a nm(f.a aVar) {
                El();
                ((h) this.f126038b).on(aVar.build());
                return this;
            }

            public a om(f fVar) {
                El();
                ((h) this.f126038b).on(fVar);
                return this;
            }

            public a pm(b.a aVar) {
                El();
                ((h) this.f126038b).pn(aVar.build());
                return this;
            }

            public a qm(b bVar) {
                El();
                ((h) this.f126038b).pn(bVar);
                return this;
            }

            public a rm(f.a aVar) {
                El();
                ((h) this.f126038b).qn(aVar.build());
                return this;
            }

            public a sm(f fVar) {
                El();
                ((h) this.f126038b).qn(fVar);
                return this;
            }

            public a tm(p.a aVar) {
                El();
                ((h) this.f126038b).rn(aVar.build());
                return this;
            }

            @Override // com.google.firebase.inappmessaging.x.i
            public boolean uh() {
                return ((h) this.f126038b).uh();
            }

            public a um(p pVar) {
                El();
                ((h) this.f126038b).rn(pVar);
                return this;
            }

            private a() {
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
        public void Bm() {
            this.backgroundHexColor_ = Km().S0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Cm() {
            this.body_ = null;
            this.bitField0_ &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Dm() {
            this.landscapeImageUrl_ = Km().Yi();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Em() {
            this.portraitImageUrl_ = Km().Ea();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Fm() {
            this.primaryAction_ = null;
            this.bitField0_ &= -9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Gm() {
            this.primaryActionButton_ = null;
            this.bitField0_ &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Hm() {
            this.secondaryAction_ = null;
            this.bitField0_ &= -33;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Im() {
            this.secondaryActionButton_ = null;
            this.bitField0_ &= -17;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Jm() {
            this.title_ = null;
            this.bitField0_ &= -2;
        }

        public static h Km() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Lm(p pVar) {
            pVar.getClass();
            p pVar2 = this.body_;
            if (pVar2 == null || pVar2 == p.im()) {
                this.body_ = pVar;
            } else {
                this.body_ = p.km(this.body_).Jl(pVar).B1();
            }
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Mm(b bVar) {
            bVar.getClass();
            b bVar2 = this.primaryAction_;
            if (bVar2 == null || bVar2 == b.em()) {
                this.primaryAction_ = bVar;
            } else {
                this.primaryAction_ = b.gm(this.primaryAction_).Jl(bVar).B1();
            }
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Nm(f fVar) {
            fVar.getClass();
            f fVar2 = this.primaryActionButton_;
            if (fVar2 == null || fVar2 == f.im()) {
                this.primaryActionButton_ = fVar;
            } else {
                this.primaryActionButton_ = f.lm(this.primaryActionButton_).Jl(fVar).B1();
            }
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Om(b bVar) {
            bVar.getClass();
            b bVar2 = this.secondaryAction_;
            if (bVar2 == null || bVar2 == b.em()) {
                this.secondaryAction_ = bVar;
            } else {
                this.secondaryAction_ = b.gm(this.secondaryAction_).Jl(bVar).B1();
            }
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Pm(f fVar) {
            fVar.getClass();
            f fVar2 = this.secondaryActionButton_;
            if (fVar2 == null || fVar2 == f.im()) {
                this.secondaryActionButton_ = fVar;
            } else {
                this.secondaryActionButton_ = f.lm(this.secondaryActionButton_).Jl(fVar).B1();
            }
            this.bitField0_ |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Qm(p pVar) {
            pVar.getClass();
            p pVar2 = this.title_;
            if (pVar2 == null || pVar2 == p.im()) {
                this.title_ = pVar;
            } else {
                this.title_ = p.km(this.title_).Jl(pVar).B1();
            }
            this.bitField0_ |= 1;
        }

        public static a Rm() {
            return DEFAULT_INSTANCE.jf();
        }

        public static a Sm(h hVar) {
            return DEFAULT_INSTANCE.Uf(hVar);
        }

        public static h Tm(InputStream inputStream) throws IOException {
            return (h) l1.El(DEFAULT_INSTANCE, inputStream);
        }

        public static h Um(InputStream inputStream, v0 v0Var) throws IOException {
            return (h) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static h Vm(com.google.protobuf.u uVar) throws t1 {
            return (h) l1.Gl(DEFAULT_INSTANCE, uVar);
        }

        public static h Wm(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
            return (h) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
        }

        public static h Xm(com.google.protobuf.z zVar) throws IOException {
            return (h) l1.Il(DEFAULT_INSTANCE, zVar);
        }

        public static h Ym(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
            return (h) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
        }

        public static h Zm(InputStream inputStream) throws IOException {
            return (h) l1.Kl(DEFAULT_INSTANCE, inputStream);
        }

        public static h an(InputStream inputStream, v0 v0Var) throws IOException {
            return (h) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static h bn(ByteBuffer byteBuffer) throws t1 {
            return (h) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
        }

        public static h cn(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
            return (h) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
        }

        public static h dn(byte[] bArr) throws t1 {
            return (h) l1.Ol(DEFAULT_INSTANCE, bArr);
        }

        public static h en(byte[] bArr, v0 v0Var) throws t1 {
            return (h) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
        }

        public static f3<h> fn() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void gn(String str) {
            str.getClass();
            this.backgroundHexColor_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void hn(com.google.protobuf.u uVar) {
            com.google.protobuf.a.R(uVar);
            this.backgroundHexColor_ = uVar.z0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void in(p pVar) {
            pVar.getClass();
            this.body_ = pVar;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void jn(String str) {
            str.getClass();
            this.landscapeImageUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void kn(com.google.protobuf.u uVar) {
            com.google.protobuf.a.R(uVar);
            this.landscapeImageUrl_ = uVar.z0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void ln(String str) {
            str.getClass();
            this.portraitImageUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mn(com.google.protobuf.u uVar) {
            com.google.protobuf.a.R(uVar);
            this.portraitImageUrl_ = uVar.z0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void nn(b bVar) {
            bVar.getClass();
            this.primaryAction_ = bVar;
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void on(f fVar) {
            fVar.getClass();
            this.primaryActionButton_ = fVar;
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void pn(b bVar) {
            bVar.getClass();
            this.secondaryAction_ = bVar;
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void qn(f fVar) {
            fVar.getClass();
            this.secondaryActionButton_ = fVar;
            this.bitField0_ |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void rn(p pVar) {
            pVar.getClass();
            this.title_ = pVar;
            this.bitField0_ |= 1;
        }

        @Override // com.google.firebase.inappmessaging.x.i
        public boolean Bj() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.firebase.inappmessaging.x.i
        public com.google.protobuf.u E1() {
            return com.google.protobuf.u.C(this.backgroundHexColor_);
        }

        @Override // com.google.firebase.inappmessaging.x.i
        public String Ea() {
            return this.portraitImageUrl_;
        }

        @Override // com.google.firebase.inappmessaging.x.i
        public f H8() {
            f fVarIm = this.primaryActionButton_;
            if (fVarIm == null) {
                fVarIm = f.im();
            }
            return fVarIm;
        }

        @Override // com.google.firebase.inappmessaging.x.i
        public f Lj() {
            f fVar = this.secondaryActionButton_;
            return fVar == null ? f.im() : fVar;
        }

        @Override // com.google.firebase.inappmessaging.x.i
        public b Ne() {
            b bVar = this.primaryAction_;
            return bVar == null ? b.em() : bVar;
        }

        @Override // com.google.protobuf.l1
        protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
            f3 cVar;
            int i10 = a.f123134a[iVar.ordinal()];
            a aVar = null;
            switch (i10) {
                case 1:
                    return new h();
                case 2:
                    return new a(aVar);
                case 3:
                    return l1.Al(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006ဉ\u0002\u0007ဉ\u0003\bဉ\u0004\tဉ\u0005", new Object[]{"bitField0_", "title_", "body_", "portraitImageUrl_", "landscapeImageUrl_", "backgroundHexColor_", "primaryActionButton_", "primaryAction_", "secondaryActionButton_", "secondaryAction_"});
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

        @Override // com.google.firebase.inappmessaging.x.i
        public String S0() {
            return this.backgroundHexColor_;
        }

        @Override // com.google.firebase.inappmessaging.x.i
        public String Yi() {
            return this.landscapeImageUrl_;
        }

        @Override // com.google.firebase.inappmessaging.x.i
        public com.google.protobuf.u ab() {
            return com.google.protobuf.u.C(this.landscapeImageUrl_);
        }

        @Override // com.google.firebase.inappmessaging.x.i
        public com.google.protobuf.u dk() {
            return com.google.protobuf.u.C(this.portraitImageUrl_);
        }

        @Override // com.google.firebase.inappmessaging.x.i
        public boolean dl() {
            if ((this.bitField0_ & 32) == 0) {
                return false;
            }
            int i10 = 5 ^ 1;
            return true;
        }

        @Override // com.google.firebase.inappmessaging.x.i
        public boolean fc() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.firebase.inappmessaging.x.i
        public b ff() {
            b bVar = this.secondaryAction_;
            return bVar == null ? b.em() : bVar;
        }

        @Override // com.google.firebase.inappmessaging.x.i
        public p getBody() {
            p pVarIm = this.body_;
            if (pVarIm == null) {
                pVarIm = p.im();
            }
            return pVarIm;
        }

        @Override // com.google.firebase.inappmessaging.x.i
        public p getTitle() {
            p pVar = this.title_;
            return pVar == null ? p.im() : pVar;
        }

        @Override // com.google.firebase.inappmessaging.x.i
        public boolean hasBody() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.firebase.inappmessaging.x.i
        public boolean j1() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.firebase.inappmessaging.x.i
        public boolean uh() {
            return (this.bitField0_ & 8) != 0;
        }
    }

    public interface i extends o2 {
        boolean Bj();

        com.google.protobuf.u E1();

        String Ea();

        f H8();

        f Lj();

        b Ne();

        String S0();

        String Yi();

        com.google.protobuf.u ab();

        com.google.protobuf.u dk();

        boolean dl();

        boolean fc();

        b ff();

        p getBody();

        p getTitle();

        boolean hasBody();

        boolean j1();

        boolean uh();
    }

    public static final class j extends l1<j, a> implements k {
        public static final int BANNER_FIELD_NUMBER = 1;
        public static final int CARD_FIELD_NUMBER = 4;
        private static final j DEFAULT_INSTANCE;
        public static final int IMAGE_ONLY_FIELD_NUMBER = 3;
        public static final int MODAL_FIELD_NUMBER = 2;
        private static volatile f3<j> PARSER;
        private int messageDetailsCase_ = 0;
        private Object messageDetails_;

        public static final class a extends l1.b<j, a> implements k {
            /* synthetic */ a(a aVar) {
                this();
            }

            public a Ol() {
                El();
                ((j) this.f126038b).nm();
                return this;
            }

            public a Pl() {
                El();
                ((j) this.f126038b).om();
                return this;
            }

            public a Ql() {
                El();
                ((j) this.f126038b).pm();
                return this;
            }

            public a Rl() {
                El();
                ((j) this.f126038b).qm();
                return this;
            }

            public a Sl() {
                El();
                ((j) this.f126038b).rm();
                return this;
            }

            @Override // com.google.firebase.inappmessaging.x.k
            public boolean T8() {
                return ((j) this.f126038b).T8();
            }

            public a Tl(d dVar) {
                El();
                ((j) this.f126038b).tm(dVar);
                return this;
            }

            @Override // com.google.firebase.inappmessaging.x.k
            public boolean Ug() {
                return ((j) this.f126038b).Ug();
            }

            public a Ul(h hVar) {
                El();
                ((j) this.f126038b).um(hVar);
                return this;
            }

            public a Vl(l lVar) {
                El();
                ((j) this.f126038b).vm(lVar);
                return this;
            }

            @Override // com.google.firebase.inappmessaging.x.k
            public boolean Wg() {
                return ((j) this.f126038b).Wg();
            }

            public a Wl(n nVar) {
                El();
                ((j) this.f126038b).wm(nVar);
                return this;
            }

            public a Xl(d.a aVar) {
                El();
                ((j) this.f126038b).Mm(aVar.build());
                return this;
            }

            public a Yl(d dVar) {
                El();
                ((j) this.f126038b).Mm(dVar);
                return this;
            }

            public a Zl(h.a aVar) {
                El();
                ((j) this.f126038b).Nm(aVar.build());
                return this;
            }

            @Override // com.google.firebase.inappmessaging.x.k
            public n ai() {
                return ((j) this.f126038b).ai();
            }

            public a am(h hVar) {
                El();
                ((j) this.f126038b).Nm(hVar);
                return this;
            }

            public a bm(l.a aVar) {
                El();
                ((j) this.f126038b).Om(aVar.build());
                return this;
            }

            public a cm(l lVar) {
                El();
                ((j) this.f126038b).Om(lVar);
                return this;
            }

            public a dm(n.a aVar) {
                El();
                ((j) this.f126038b).Pm(aVar.build());
                return this;
            }

            @Override // com.google.firebase.inappmessaging.x.k
            public l ec() {
                return ((j) this.f126038b).ec();
            }

            public a em(n nVar) {
                El();
                ((j) this.f126038b).Pm(nVar);
                return this;
            }

            @Override // com.google.firebase.inappmessaging.x.k
            public b fh() {
                return ((j) this.f126038b).fh();
            }

            @Override // com.google.firebase.inappmessaging.x.k
            public d kh() {
                return ((j) this.f126038b).kh();
            }

            @Override // com.google.firebase.inappmessaging.x.k
            public boolean oe() {
                return ((j) this.f126038b).oe();
            }

            @Override // com.google.firebase.inappmessaging.x.k
            public h pa() {
                return ((j) this.f126038b).pa();
            }

            private a() {
                super(j.DEFAULT_INSTANCE);
            }
        }

        public enum b {
            BANNER(1),
            MODAL(2),
            IMAGE_ONLY(3),
            CARD(4),
            MESSAGEDETAILS_NOT_SET(0);


            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f123141a;

            b(int i10) {
                this.f123141a = i10;
            }

            public static b l(int i10) {
                if (i10 == 0) {
                    return MESSAGEDETAILS_NOT_SET;
                }
                if (i10 == 1) {
                    return BANNER;
                }
                if (i10 == 2) {
                    return MODAL;
                }
                if (i10 == 3) {
                    return IMAGE_ONLY;
                }
                if (i10 != 4) {
                    return null;
                }
                return CARD;
            }

            @Deprecated
            public static b n(int i10) {
                return l(i10);
            }

            public int i() {
                return this.f123141a;
            }
        }

        static {
            j jVar = new j();
            DEFAULT_INSTANCE = jVar;
            l1.Wl(j.class, jVar);
        }

        private j() {
        }

        public static j Am(InputStream inputStream, v0 v0Var) throws IOException {
            return (j) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static j Bm(com.google.protobuf.u uVar) throws t1 {
            return (j) l1.Gl(DEFAULT_INSTANCE, uVar);
        }

        public static j Cm(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
            return (j) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
        }

        public static j Dm(com.google.protobuf.z zVar) throws IOException {
            return (j) l1.Il(DEFAULT_INSTANCE, zVar);
        }

        public static j Em(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
            return (j) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
        }

        public static j Fm(InputStream inputStream) throws IOException {
            return (j) l1.Kl(DEFAULT_INSTANCE, inputStream);
        }

        public static j Gm(InputStream inputStream, v0 v0Var) throws IOException {
            return (j) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static j Hm(ByteBuffer byteBuffer) throws t1 {
            return (j) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
        }

        public static j Im(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
            return (j) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
        }

        public static j Jm(byte[] bArr) throws t1 {
            return (j) l1.Ol(DEFAULT_INSTANCE, bArr);
        }

        public static j Km(byte[] bArr, v0 v0Var) throws t1 {
            return (j) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
        }

        public static f3<j> Lm() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Mm(d dVar) {
            dVar.getClass();
            this.messageDetails_ = dVar;
            this.messageDetailsCase_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Nm(h hVar) {
            hVar.getClass();
            this.messageDetails_ = hVar;
            this.messageDetailsCase_ = 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Om(l lVar) {
            lVar.getClass();
            this.messageDetails_ = lVar;
            this.messageDetailsCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Pm(n nVar) {
            nVar.getClass();
            this.messageDetails_ = nVar;
            this.messageDetailsCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void nm() {
            if (this.messageDetailsCase_ == 1) {
                this.messageDetailsCase_ = 0;
                this.messageDetails_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void om() {
            if (this.messageDetailsCase_ == 4) {
                this.messageDetailsCase_ = 0;
                this.messageDetails_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void pm() {
            if (this.messageDetailsCase_ == 3) {
                this.messageDetailsCase_ = 0;
                this.messageDetails_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void qm() {
            this.messageDetailsCase_ = 0;
            this.messageDetails_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void rm() {
            if (this.messageDetailsCase_ == 2) {
                this.messageDetailsCase_ = 0;
                this.messageDetails_ = null;
            }
        }

        public static j sm() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void tm(d dVar) {
            dVar.getClass();
            if (this.messageDetailsCase_ != 1 || this.messageDetails_ == d.um()) {
                this.messageDetails_ = dVar;
            } else {
                this.messageDetails_ = d.zm((d) this.messageDetails_).Jl(dVar).B1();
            }
            this.messageDetailsCase_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void um(h hVar) {
            hVar.getClass();
            if (this.messageDetailsCase_ != 4 || this.messageDetails_ == h.Km()) {
                this.messageDetails_ = hVar;
            } else {
                this.messageDetails_ = h.Sm((h) this.messageDetails_).Jl(hVar).B1();
            }
            this.messageDetailsCase_ = 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void vm(l lVar) {
            lVar.getClass();
            if (this.messageDetailsCase_ != 3 || this.messageDetails_ == l.im()) {
                this.messageDetails_ = lVar;
            } else {
                this.messageDetails_ = l.lm((l) this.messageDetails_).Jl(lVar).B1();
            }
            this.messageDetailsCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void wm(n nVar) {
            nVar.getClass();
            if (this.messageDetailsCase_ != 2 || this.messageDetails_ == n.ym()) {
                this.messageDetails_ = nVar;
            } else {
                this.messageDetails_ = n.Em((n) this.messageDetails_).Jl(nVar).B1();
            }
            this.messageDetailsCase_ = 2;
        }

        public static a xm() {
            return DEFAULT_INSTANCE.jf();
        }

        public static a ym(j jVar) {
            return DEFAULT_INSTANCE.Uf(jVar);
        }

        public static j zm(InputStream inputStream) throws IOException {
            return (j) l1.El(DEFAULT_INSTANCE, inputStream);
        }

        @Override // com.google.protobuf.l1
        protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
            f3 cVar;
            int i10 = a.f123134a[iVar.ordinal()];
            a aVar = null;
            switch (i10) {
                case 1:
                    return new j();
                case 2:
                    return new a(aVar);
                case 3:
                    return l1.Al(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"messageDetails_", "messageDetailsCase_", d.class, n.class, l.class, h.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f3<j> f3Var = PARSER;
                    if (f3Var != null) {
                        return f3Var;
                    }
                    synchronized (j.class) {
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

        @Override // com.google.firebase.inappmessaging.x.k
        public boolean T8() {
            return this.messageDetailsCase_ == 1;
        }

        @Override // com.google.firebase.inappmessaging.x.k
        public boolean Ug() {
            return this.messageDetailsCase_ == 4;
        }

        @Override // com.google.firebase.inappmessaging.x.k
        public boolean Wg() {
            return this.messageDetailsCase_ == 2;
        }

        @Override // com.google.firebase.inappmessaging.x.k
        public n ai() {
            return this.messageDetailsCase_ == 2 ? (n) this.messageDetails_ : n.ym();
        }

        @Override // com.google.firebase.inappmessaging.x.k
        public l ec() {
            return this.messageDetailsCase_ == 3 ? (l) this.messageDetails_ : l.im();
        }

        @Override // com.google.firebase.inappmessaging.x.k
        public b fh() {
            return b.l(this.messageDetailsCase_);
        }

        @Override // com.google.firebase.inappmessaging.x.k
        public d kh() {
            return this.messageDetailsCase_ == 1 ? (d) this.messageDetails_ : d.um();
        }

        @Override // com.google.firebase.inappmessaging.x.k
        public boolean oe() {
            return this.messageDetailsCase_ == 3;
        }

        @Override // com.google.firebase.inappmessaging.x.k
        public h pa() {
            return this.messageDetailsCase_ == 4 ? (h) this.messageDetails_ : h.Km();
        }
    }

    public interface k extends o2 {
        boolean T8();

        boolean Ug();

        boolean Wg();

        n ai();

        l ec();

        j.b fh();

        d kh();

        boolean oe();

        h pa();
    }

    public static final class l extends l1<l, a> implements m {
        public static final int ACTION_FIELD_NUMBER = 2;
        private static final l DEFAULT_INSTANCE;
        public static final int IMAGE_URL_FIELD_NUMBER = 1;
        private static volatile f3<l> PARSER;
        private b action_;
        private int bitField0_;
        private String imageUrl_ = "";

        public static final class a extends l1.b<l, a> implements m {
            /* synthetic */ a(a aVar) {
                this();
            }

            @Override // com.google.firebase.inappmessaging.x.m
            public com.google.protobuf.u C1() {
                return ((l) this.f126038b).C1();
            }

            @Override // com.google.firebase.inappmessaging.x.m
            public String E0() {
                return ((l) this.f126038b).E0();
            }

            @Override // com.google.firebase.inappmessaging.x.m
            public boolean M1() {
                return ((l) this.f126038b).M1();
            }

            public a Ol() {
                El();
                ((l) this.f126038b).gm();
                return this;
            }

            public a Pl() {
                El();
                ((l) this.f126038b).hm();
                return this;
            }

            public a Ql(b bVar) {
                El();
                ((l) this.f126038b).jm(bVar);
                return this;
            }

            public a Rl(b.a aVar) {
                El();
                ((l) this.f126038b).zm(aVar.build());
                return this;
            }

            public a Sl(b bVar) {
                El();
                ((l) this.f126038b).zm(bVar);
                return this;
            }

            public a Tl(String str) {
                El();
                ((l) this.f126038b).Am(str);
                return this;
            }

            public a Ul(com.google.protobuf.u uVar) {
                El();
                ((l) this.f126038b).Bm(uVar);
                return this;
            }

            @Override // com.google.firebase.inappmessaging.x.m
            public b k0() {
                return ((l) this.f126038b).k0();
            }

            private a() {
                super(l.DEFAULT_INSTANCE);
            }
        }

        static {
            l lVar = new l();
            DEFAULT_INSTANCE = lVar;
            l1.Wl(l.class, lVar);
        }

        private l() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Am(String str) {
            str.getClass();
            this.imageUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Bm(com.google.protobuf.u uVar) {
            com.google.protobuf.a.R(uVar);
            this.imageUrl_ = uVar.z0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void gm() {
            this.action_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void hm() {
            this.imageUrl_ = im().E0();
        }

        public static l im() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void jm(b bVar) {
            bVar.getClass();
            b bVar2 = this.action_;
            if (bVar2 == null || bVar2 == b.em()) {
                this.action_ = bVar;
            } else {
                this.action_ = b.gm(this.action_).Jl(bVar).B1();
            }
            this.bitField0_ |= 1;
        }

        public static a km() {
            return DEFAULT_INSTANCE.jf();
        }

        public static a lm(l lVar) {
            return DEFAULT_INSTANCE.Uf(lVar);
        }

        public static l mm(InputStream inputStream) throws IOException {
            return (l) l1.El(DEFAULT_INSTANCE, inputStream);
        }

        public static l nm(InputStream inputStream, v0 v0Var) throws IOException {
            return (l) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static l om(com.google.protobuf.u uVar) throws t1 {
            return (l) l1.Gl(DEFAULT_INSTANCE, uVar);
        }

        public static l pm(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
            return (l) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
        }

        public static l qm(com.google.protobuf.z zVar) throws IOException {
            return (l) l1.Il(DEFAULT_INSTANCE, zVar);
        }

        public static l rm(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
            return (l) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
        }

        public static l sm(InputStream inputStream) throws IOException {
            return (l) l1.Kl(DEFAULT_INSTANCE, inputStream);
        }

        public static l tm(InputStream inputStream, v0 v0Var) throws IOException {
            return (l) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static l um(ByteBuffer byteBuffer) throws t1 {
            return (l) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
        }

        public static l vm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
            return (l) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
        }

        public static l wm(byte[] bArr) throws t1 {
            return (l) l1.Ol(DEFAULT_INSTANCE, bArr);
        }

        public static l xm(byte[] bArr, v0 v0Var) throws t1 {
            return (l) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
        }

        public static f3<l> ym() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zm(b bVar) {
            bVar.getClass();
            this.action_ = bVar;
            this.bitField0_ |= 1;
        }

        @Override // com.google.firebase.inappmessaging.x.m
        public com.google.protobuf.u C1() {
            return com.google.protobuf.u.C(this.imageUrl_);
        }

        @Override // com.google.firebase.inappmessaging.x.m
        public String E0() {
            return this.imageUrl_;
        }

        @Override // com.google.firebase.inappmessaging.x.m
        public boolean M1() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.l1
        protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
            f3 cVar;
            int i10 = a.f123134a[iVar.ordinal()];
            a aVar = null;
            switch (i10) {
                case 1:
                    return new l();
                case 2:
                    return new a(aVar);
                case 3:
                    return l1.Al(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "imageUrl_", "action_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f3<l> f3Var = PARSER;
                    if (f3Var != null) {
                        return f3Var;
                    }
                    synchronized (l.class) {
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

        @Override // com.google.firebase.inappmessaging.x.m
        public b k0() {
            b bVarEm = this.action_;
            if (bVarEm == null) {
                bVarEm = b.em();
            }
            return bVarEm;
        }
    }

    public interface m extends o2 {
        com.google.protobuf.u C1();

        String E0();

        boolean M1();

        b k0();
    }

    public static final class n extends l1<n, a> implements o {
        public static final int ACTION_BUTTON_FIELD_NUMBER = 4;
        public static final int ACTION_FIELD_NUMBER = 5;
        public static final int BACKGROUND_HEX_COLOR_FIELD_NUMBER = 6;
        public static final int BODY_FIELD_NUMBER = 2;
        private static final n DEFAULT_INSTANCE;
        public static final int IMAGE_URL_FIELD_NUMBER = 3;
        private static volatile f3<n> PARSER = null;
        public static final int TITLE_FIELD_NUMBER = 1;
        private f actionButton_;
        private b action_;
        private int bitField0_;
        private p body_;
        private p title_;
        private String imageUrl_ = "";
        private String backgroundHexColor_ = "";

        public static final class a extends l1.b<n, a> implements o {
            /* synthetic */ a(a aVar) {
                this();
            }

            @Override // com.google.firebase.inappmessaging.x.o
            public com.google.protobuf.u C1() {
                return ((n) this.f126038b).C1();
            }

            @Override // com.google.firebase.inappmessaging.x.o
            public String E0() {
                return ((n) this.f126038b).E0();
            }

            @Override // com.google.firebase.inappmessaging.x.o
            public com.google.protobuf.u E1() {
                return ((n) this.f126038b).E1();
            }

            @Override // com.google.firebase.inappmessaging.x.o
            public boolean M1() {
                return ((n) this.f126038b).M1();
            }

            public a Ol() {
                El();
                ((n) this.f126038b).sm();
                return this;
            }

            public a Pl() {
                El();
                ((n) this.f126038b).tm();
                return this;
            }

            public a Ql() {
                El();
                ((n) this.f126038b).um();
                return this;
            }

            public a Rl() {
                El();
                ((n) this.f126038b).vm();
                return this;
            }

            @Override // com.google.firebase.inappmessaging.x.o
            public String S0() {
                return ((n) this.f126038b).S0();
            }

            public a Sl() {
                El();
                ((n) this.f126038b).wm();
                return this;
            }

            public a Tl() {
                El();
                ((n) this.f126038b).xm();
                return this;
            }

            public a Ul(b bVar) {
                El();
                ((n) this.f126038b).zm(bVar);
                return this;
            }

            public a Vl(f fVar) {
                El();
                ((n) this.f126038b).Am(fVar);
                return this;
            }

            public a Wl(p pVar) {
                El();
                ((n) this.f126038b).Bm(pVar);
                return this;
            }

            public a Xl(p pVar) {
                El();
                ((n) this.f126038b).Cm(pVar);
                return this;
            }

            public a Yl(b.a aVar) {
                El();
                ((n) this.f126038b).Sm(aVar.build());
                return this;
            }

            public a Zl(b bVar) {
                El();
                ((n) this.f126038b).Sm(bVar);
                return this;
            }

            public a am(f.a aVar) {
                El();
                ((n) this.f126038b).Tm(aVar.build());
                return this;
            }

            public a bm(f fVar) {
                El();
                ((n) this.f126038b).Tm(fVar);
                return this;
            }

            public a cm(String str) {
                El();
                ((n) this.f126038b).Um(str);
                return this;
            }

            public a dm(com.google.protobuf.u uVar) {
                El();
                ((n) this.f126038b).Vm(uVar);
                return this;
            }

            public a em(p.a aVar) {
                El();
                ((n) this.f126038b).Wm(aVar.build());
                return this;
            }

            public a fm(p pVar) {
                El();
                ((n) this.f126038b).Wm(pVar);
                return this;
            }

            @Override // com.google.firebase.inappmessaging.x.o
            public p getBody() {
                return ((n) this.f126038b).getBody();
            }

            @Override // com.google.firebase.inappmessaging.x.o
            public p getTitle() {
                return ((n) this.f126038b).getTitle();
            }

            public a gm(String str) {
                El();
                ((n) this.f126038b).Xm(str);
                return this;
            }

            @Override // com.google.firebase.inappmessaging.x.o
            public boolean hasBody() {
                return ((n) this.f126038b).hasBody();
            }

            public a hm(com.google.protobuf.u uVar) {
                El();
                ((n) this.f126038b).Ym(uVar);
                return this;
            }

            public a im(p.a aVar) {
                El();
                ((n) this.f126038b).Zm(aVar.build());
                return this;
            }

            @Override // com.google.firebase.inappmessaging.x.o
            public boolean j1() {
                return ((n) this.f126038b).j1();
            }

            public a jm(p pVar) {
                El();
                ((n) this.f126038b).Zm(pVar);
                return this;
            }

            @Override // com.google.firebase.inappmessaging.x.o
            public b k0() {
                return ((n) this.f126038b).k0();
            }

            @Override // com.google.firebase.inappmessaging.x.o
            public boolean xe() {
                return ((n) this.f126038b).xe();
            }

            @Override // com.google.firebase.inappmessaging.x.o
            public f yh() {
                return ((n) this.f126038b).yh();
            }

            private a() {
                super(n.DEFAULT_INSTANCE);
            }
        }

        static {
            n nVar = new n();
            DEFAULT_INSTANCE = nVar;
            l1.Wl(n.class, nVar);
        }

        private n() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Am(f fVar) {
            fVar.getClass();
            f fVar2 = this.actionButton_;
            if (fVar2 == null || fVar2 == f.im()) {
                this.actionButton_ = fVar;
            } else {
                this.actionButton_ = f.lm(this.actionButton_).Jl(fVar).B1();
            }
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Bm(p pVar) {
            pVar.getClass();
            p pVar2 = this.body_;
            if (pVar2 == null || pVar2 == p.im()) {
                this.body_ = pVar;
            } else {
                this.body_ = p.km(this.body_).Jl(pVar).B1();
            }
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Cm(p pVar) {
            pVar.getClass();
            p pVar2 = this.title_;
            if (pVar2 == null || pVar2 == p.im()) {
                this.title_ = pVar;
            } else {
                this.title_ = p.km(this.title_).Jl(pVar).B1();
            }
            this.bitField0_ |= 1;
        }

        public static a Dm() {
            return DEFAULT_INSTANCE.jf();
        }

        public static a Em(n nVar) {
            return DEFAULT_INSTANCE.Uf(nVar);
        }

        public static n Fm(InputStream inputStream) throws IOException {
            return (n) l1.El(DEFAULT_INSTANCE, inputStream);
        }

        public static n Gm(InputStream inputStream, v0 v0Var) throws IOException {
            return (n) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static n Hm(com.google.protobuf.u uVar) throws t1 {
            return (n) l1.Gl(DEFAULT_INSTANCE, uVar);
        }

        public static n Im(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
            return (n) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
        }

        public static n Jm(com.google.protobuf.z zVar) throws IOException {
            return (n) l1.Il(DEFAULT_INSTANCE, zVar);
        }

        public static n Km(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
            return (n) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
        }

        public static n Lm(InputStream inputStream) throws IOException {
            return (n) l1.Kl(DEFAULT_INSTANCE, inputStream);
        }

        public static n Mm(InputStream inputStream, v0 v0Var) throws IOException {
            return (n) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static n Nm(ByteBuffer byteBuffer) throws t1 {
            return (n) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
        }

        public static n Om(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
            return (n) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
        }

        public static n Pm(byte[] bArr) throws t1 {
            return (n) l1.Ol(DEFAULT_INSTANCE, bArr);
        }

        public static n Qm(byte[] bArr, v0 v0Var) throws t1 {
            return (n) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
        }

        public static f3<n> Rm() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Sm(b bVar) {
            bVar.getClass();
            this.action_ = bVar;
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Tm(f fVar) {
            fVar.getClass();
            this.actionButton_ = fVar;
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Um(String str) {
            str.getClass();
            this.backgroundHexColor_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Vm(com.google.protobuf.u uVar) {
            com.google.protobuf.a.R(uVar);
            this.backgroundHexColor_ = uVar.z0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Wm(p pVar) {
            pVar.getClass();
            this.body_ = pVar;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Xm(String str) {
            str.getClass();
            this.imageUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Ym(com.google.protobuf.u uVar) {
            com.google.protobuf.a.R(uVar);
            this.imageUrl_ = uVar.z0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Zm(p pVar) {
            pVar.getClass();
            this.title_ = pVar;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void sm() {
            this.action_ = null;
            this.bitField0_ &= -9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void tm() {
            this.actionButton_ = null;
            this.bitField0_ &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void um() {
            this.backgroundHexColor_ = ym().S0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void vm() {
            this.body_ = null;
            this.bitField0_ &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void wm() {
            this.imageUrl_ = ym().E0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void xm() {
            this.title_ = null;
            this.bitField0_ &= -2;
        }

        public static n ym() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zm(b bVar) {
            bVar.getClass();
            b bVar2 = this.action_;
            if (bVar2 == null || bVar2 == b.em()) {
                this.action_ = bVar;
            } else {
                this.action_ = b.gm(this.action_).Jl(bVar).B1();
            }
            this.bitField0_ |= 8;
        }

        @Override // com.google.firebase.inappmessaging.x.o
        public com.google.protobuf.u C1() {
            return com.google.protobuf.u.C(this.imageUrl_);
        }

        @Override // com.google.firebase.inappmessaging.x.o
        public String E0() {
            return this.imageUrl_;
        }

        @Override // com.google.firebase.inappmessaging.x.o
        public com.google.protobuf.u E1() {
            return com.google.protobuf.u.C(this.backgroundHexColor_);
        }

        @Override // com.google.firebase.inappmessaging.x.o
        public boolean M1() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.l1
        protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
            f3 cVar;
            int i10 = a.f123134a[iVar.ordinal()];
            a aVar = null;
            switch (i10) {
                case 1:
                    return new n();
                case 2:
                    return new a(aVar);
                case 3:
                    return l1.Al(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003Ȉ\u0004ဉ\u0002\u0005ဉ\u0003\u0006Ȉ", new Object[]{"bitField0_", "title_", "body_", "imageUrl_", "actionButton_", "action_", "backgroundHexColor_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f3<n> f3Var = PARSER;
                    if (f3Var != null) {
                        return f3Var;
                    }
                    synchronized (n.class) {
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

        @Override // com.google.firebase.inappmessaging.x.o
        public String S0() {
            return this.backgroundHexColor_;
        }

        @Override // com.google.firebase.inappmessaging.x.o
        public p getBody() {
            p pVar = this.body_;
            return pVar == null ? p.im() : pVar;
        }

        @Override // com.google.firebase.inappmessaging.x.o
        public p getTitle() {
            p pVarIm = this.title_;
            if (pVarIm == null) {
                pVarIm = p.im();
            }
            return pVarIm;
        }

        @Override // com.google.firebase.inappmessaging.x.o
        public boolean hasBody() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.firebase.inappmessaging.x.o
        public boolean j1() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.firebase.inappmessaging.x.o
        public b k0() {
            b bVar = this.action_;
            return bVar == null ? b.em() : bVar;
        }

        @Override // com.google.firebase.inappmessaging.x.o
        public boolean xe() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.firebase.inappmessaging.x.o
        public f yh() {
            f fVarIm = this.actionButton_;
            if (fVarIm == null) {
                fVarIm = f.im();
            }
            return fVarIm;
        }
    }

    public interface o extends o2 {
        com.google.protobuf.u C1();

        String E0();

        com.google.protobuf.u E1();

        boolean M1();

        String S0();

        p getBody();

        p getTitle();

        boolean hasBody();

        boolean j1();

        b k0();

        boolean xe();

        f yh();
    }

    public static final class p extends l1<p, a> implements q {
        private static final p DEFAULT_INSTANCE;
        public static final int HEX_COLOR_FIELD_NUMBER = 2;
        private static volatile f3<p> PARSER = null;
        public static final int TEXT_FIELD_NUMBER = 1;
        private String text_ = "";
        private String hexColor_ = "";

        public static final class a extends l1.b<p, a> implements q {
            /* synthetic */ a(a aVar) {
                this();
            }

            public a Ol() {
                El();
                ((p) this.f126038b).gm();
                return this;
            }

            public a Pl() {
                El();
                ((p) this.f126038b).hm();
                return this;
            }

            public a Ql(String str) {
                El();
                ((p) this.f126038b).ym(str);
                return this;
            }

            public a Rl(com.google.protobuf.u uVar) {
                El();
                ((p) this.f126038b).zm(uVar);
                return this;
            }

            public a Sl(String str) {
                El();
                ((p) this.f126038b).Am(str);
                return this;
            }

            public a Tl(com.google.protobuf.u uVar) {
                El();
                ((p) this.f126038b).Bm(uVar);
                return this;
            }

            @Override // com.google.firebase.inappmessaging.x.q
            public com.google.protobuf.u Wc() {
                return ((p) this.f126038b).Wc();
            }

            @Override // com.google.firebase.inappmessaging.x.q
            public String getText() {
                return ((p) this.f126038b).getText();
            }

            @Override // com.google.firebase.inappmessaging.x.q
            public com.google.protobuf.u kg() {
                return ((p) this.f126038b).kg();
            }

            @Override // com.google.firebase.inappmessaging.x.q
            public String ra() {
                return ((p) this.f126038b).ra();
            }

            private a() {
                super(p.DEFAULT_INSTANCE);
            }
        }

        static {
            p pVar = new p();
            DEFAULT_INSTANCE = pVar;
            l1.Wl(p.class, pVar);
        }

        private p() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Am(String str) {
            str.getClass();
            this.text_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Bm(com.google.protobuf.u uVar) {
            com.google.protobuf.a.R(uVar);
            this.text_ = uVar.z0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void gm() {
            this.hexColor_ = im().ra();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void hm() {
            this.text_ = im().getText();
        }

        public static p im() {
            return DEFAULT_INSTANCE;
        }

        public static a jm() {
            return DEFAULT_INSTANCE.jf();
        }

        public static a km(p pVar) {
            return DEFAULT_INSTANCE.Uf(pVar);
        }

        public static p lm(InputStream inputStream) throws IOException {
            return (p) l1.El(DEFAULT_INSTANCE, inputStream);
        }

        public static p mm(InputStream inputStream, v0 v0Var) throws IOException {
            return (p) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static p nm(com.google.protobuf.u uVar) throws t1 {
            return (p) l1.Gl(DEFAULT_INSTANCE, uVar);
        }

        public static p om(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
            return (p) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
        }

        public static p pm(com.google.protobuf.z zVar) throws IOException {
            return (p) l1.Il(DEFAULT_INSTANCE, zVar);
        }

        public static p qm(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
            return (p) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
        }

        public static p rm(InputStream inputStream) throws IOException {
            return (p) l1.Kl(DEFAULT_INSTANCE, inputStream);
        }

        public static p sm(InputStream inputStream, v0 v0Var) throws IOException {
            return (p) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static p tm(ByteBuffer byteBuffer) throws t1 {
            return (p) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
        }

        public static p um(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
            return (p) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
        }

        public static p vm(byte[] bArr) throws t1 {
            return (p) l1.Ol(DEFAULT_INSTANCE, bArr);
        }

        public static p wm(byte[] bArr, v0 v0Var) throws t1 {
            return (p) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
        }

        public static f3<p> xm() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void ym(String str) {
            str.getClass();
            this.hexColor_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zm(com.google.protobuf.u uVar) {
            com.google.protobuf.a.R(uVar);
            this.hexColor_ = uVar.z0();
        }

        @Override // com.google.protobuf.l1
        protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
            f3 cVar;
            int i10 = a.f123134a[iVar.ordinal()];
            a aVar = null;
            switch (i10) {
                case 1:
                    return new p();
                case 2:
                    return new a(aVar);
                case 3:
                    return l1.Al(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"text_", "hexColor_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f3<p> f3Var = PARSER;
                    if (f3Var != null) {
                        return f3Var;
                    }
                    synchronized (p.class) {
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

        @Override // com.google.firebase.inappmessaging.x.q
        public com.google.protobuf.u Wc() {
            return com.google.protobuf.u.C(this.text_);
        }

        @Override // com.google.firebase.inappmessaging.x.q
        public String getText() {
            return this.text_;
        }

        @Override // com.google.firebase.inappmessaging.x.q
        public com.google.protobuf.u kg() {
            return com.google.protobuf.u.C(this.hexColor_);
        }

        @Override // com.google.firebase.inappmessaging.x.q
        public String ra() {
            return this.hexColor_;
        }
    }

    public interface q extends o2 {
        com.google.protobuf.u Wc();

        String getText();

        com.google.protobuf.u kg();

        String ra();
    }

    private x() {
    }

    public static void a(v0 v0Var) {
    }
}
