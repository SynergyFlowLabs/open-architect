package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class e0 {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f125834a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f125834a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f125834a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int i10 = 7 << 3;
                f125834a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f125834a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f125834a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f125834a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f125834a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public interface a0 extends l1.f<z, z.a> {
        boolean G4();

        boolean P7();

        boolean T4();

        boolean Z7();

        List<p0> d();

        p0 e(int i10);

        int f();

        boolean g5();

        boolean j();

        boolean l();

        boolean v4();
    }

    public static final class b extends l1<b, a> implements c {
        private static final b DEFAULT_INSTANCE;
        public static final int ENUM_TYPE_FIELD_NUMBER = 4;
        public static final int EXTENSION_FIELD_NUMBER = 6;
        public static final int EXTENSION_RANGE_FIELD_NUMBER = 5;
        public static final int FIELD_FIELD_NUMBER = 2;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int NESTED_TYPE_FIELD_NUMBER = 3;
        public static final int ONEOF_DECL_FIELD_NUMBER = 8;
        public static final int OPTIONS_FIELD_NUMBER = 7;
        private static volatile f3<b> PARSER = null;
        public static final int RESERVED_NAME_FIELD_NUMBER = 10;
        public static final int RESERVED_RANGE_FIELD_NUMBER = 9;
        private int bitField0_;
        private z options_;
        private byte memoizedIsInitialized = 2;
        private String name_ = "";
        private s1.k<n> field_ = l1.Ij();
        private s1.k<n> extension_ = l1.Ij();
        private s1.k<b> nestedType_ = l1.Ij();
        private s1.k<d> enumType_ = l1.Ij();
        private s1.k<C1214b> extensionRange_ = l1.Ij();
        private s1.k<f0> oneofDecl_ = l1.Ij();
        private s1.k<d> reservedRange_ = l1.Ij();
        private s1.k<String> reservedName_ = l1.Ij();

        public static final class a extends l1.b<b, a> implements c {
            /* synthetic */ a(a aVar) {
                this();
            }

            @Override // com.google.protobuf.e0.c
            public d A0(int i10) {
                return ((b) this.f126038b).A0(i10);
            }

            public a Am() {
                El();
                ((b) this.f126038b).zn();
                return this;
            }

            @Override // com.google.protobuf.e0.c
            public f0 B7(int i10) {
                return ((b) this.f126038b).B7(i10);
            }

            public a Bm() {
                El();
                ((b) this.f126038b).An();
                return this;
            }

            public a Cm() {
                El();
                ((b) this.f126038b).Bn();
                return this;
            }

            @Override // com.google.protobuf.e0.c
            public List<b> D6() {
                return Collections.unmodifiableList(((b) this.f126038b).D6());
            }

            public a Dm() {
                El();
                ((b) this.f126038b).Cn();
                return this;
            }

            public a Em() {
                El();
                ((b) this.f126038b).Dn();
                return this;
            }

            public a Fm() {
                El();
                ((b) this.f126038b).En();
                return this;
            }

            public a Gm() {
                El();
                ((b) this.f126038b).Fn();
                return this;
            }

            public a Hm() {
                El();
                ((b) this.f126038b).Gn();
                return this;
            }

            @Override // com.google.protobuf.e0.c
            public List<String> I0() {
                return Collections.unmodifiableList(((b) this.f126038b).I0());
            }

            public a Im() {
                El();
                ((b) this.f126038b).Hn();
                return this;
            }

            public a Jm() {
                El();
                ((b) this.f126038b).In();
                return this;
            }

            @Override // com.google.protobuf.e0.c
            public n K0(int i10) {
                return ((b) this.f126038b).K0(i10);
            }

            public a Km(z zVar) {
                El();
                ((b) this.f126038b).ho(zVar);
                return this;
            }

            @Override // com.google.protobuf.e0.c
            public n L5(int i10) {
                return ((b) this.f126038b).L5(i10);
            }

            public a Lm(int i10) {
                El();
                ((b) this.f126038b).xo(i10);
                return this;
            }

            public a Mm(int i10) {
                El();
                ((b) this.f126038b).yo(i10);
                return this;
            }

            @Override // com.google.protobuf.e0.c
            public List<d> N0() {
                return Collections.unmodifiableList(((b) this.f126038b).N0());
            }

            public a Nm(int i10) {
                El();
                ((b) this.f126038b).zo(i10);
                return this;
            }

            @Override // com.google.protobuf.e0.c
            public int O0() {
                return ((b) this.f126038b).O0();
            }

            public a Ol(Iterable<? extends d> iterable) {
                El();
                ((b) this.f126038b).bn(iterable);
                return this;
            }

            public a Om(int i10) {
                El();
                ((b) this.f126038b).Ao(i10);
                return this;
            }

            public a Pl(Iterable<? extends n> iterable) {
                El();
                ((b) this.f126038b).cn(iterable);
                return this;
            }

            public a Pm(int i10) {
                El();
                ((b) this.f126038b).Bo(i10);
                return this;
            }

            public a Ql(Iterable<? extends C1214b> iterable) {
                El();
                ((b) this.f126038b).dn(iterable);
                return this;
            }

            public a Qm(int i10) {
                El();
                ((b) this.f126038b).Co(i10);
                return this;
            }

            @Override // com.google.protobuf.e0.c
            public int R4() {
                return ((b) this.f126038b).R4();
            }

            public a Rl(Iterable<? extends n> iterable) {
                El();
                ((b) this.f126038b).en(iterable);
                return this;
            }

            public a Rm(int i10) {
                El();
                ((b) this.f126038b).Do(i10);
                return this;
            }

            public a Sl(Iterable<? extends b> iterable) {
                El();
                ((b) this.f126038b).fn(iterable);
                return this;
            }

            public a Sm(int i10, d.a aVar) {
                El();
                ((b) this.f126038b).Eo(i10, aVar.build());
                return this;
            }

            public a Tl(Iterable<? extends f0> iterable) {
                El();
                ((b) this.f126038b).gn(iterable);
                return this;
            }

            public a Tm(int i10, d dVar) {
                El();
                ((b) this.f126038b).Eo(i10, dVar);
                return this;
            }

            public a Ul(Iterable<String> iterable) {
                El();
                ((b) this.f126038b).hn(iterable);
                return this;
            }

            public a Um(int i10, n.a aVar) {
                El();
                ((b) this.f126038b).Fo(i10, aVar.build());
                return this;
            }

            public a Vl(Iterable<? extends d> iterable) {
                El();
                ((b) this.f126038b).in(iterable);
                return this;
            }

            public a Vm(int i10, n nVar) {
                El();
                ((b) this.f126038b).Fo(i10, nVar);
                return this;
            }

            public a Wl(int i10, d.a aVar) {
                El();
                ((b) this.f126038b).jn(i10, aVar.build());
                return this;
            }

            public a Wm(int i10, C1214b.a aVar) {
                El();
                ((b) this.f126038b).Go(i10, aVar.build());
                return this;
            }

            @Override // com.google.protobuf.e0.c
            public C1214b X3(int i10) {
                return ((b) this.f126038b).X3(i10);
            }

            public a Xl(int i10, d dVar) {
                El();
                ((b) this.f126038b).jn(i10, dVar);
                return this;
            }

            public a Xm(int i10, C1214b c1214b) {
                El();
                ((b) this.f126038b).Go(i10, c1214b);
                return this;
            }

            public a Yl(d.a aVar) {
                El();
                ((b) this.f126038b).kn(aVar.build());
                return this;
            }

            public a Ym(int i10, n.a aVar) {
                El();
                ((b) this.f126038b).Ho(i10, aVar.build());
                return this;
            }

            public a Zl(d dVar) {
                El();
                ((b) this.f126038b).kn(dVar);
                return this;
            }

            public a Zm(int i10, n nVar) {
                El();
                ((b) this.f126038b).Ho(i10, nVar);
                return this;
            }

            @Override // com.google.protobuf.e0.c
            public com.google.protobuf.u a() {
                return ((b) this.f126038b).a();
            }

            @Override // com.google.protobuf.e0.c
            public List<d> a0() {
                return Collections.unmodifiableList(((b) this.f126038b).a0());
            }

            public a am(int i10, n.a aVar) {
                El();
                ((b) this.f126038b).ln(i10, aVar.build());
                return this;
            }

            public a an(String str) {
                El();
                ((b) this.f126038b).Io(str);
                return this;
            }

            @Override // com.google.protobuf.e0.c
            public z b() {
                return ((b) this.f126038b).b();
            }

            public a bm(int i10, n nVar) {
                El();
                ((b) this.f126038b).ln(i10, nVar);
                return this;
            }

            public a bn(com.google.protobuf.u uVar) {
                El();
                ((b) this.f126038b).Jo(uVar);
                return this;
            }

            public a cm(n.a aVar) {
                El();
                ((b) this.f126038b).mn(aVar.build());
                return this;
            }

            public a cn(int i10, a aVar) {
                El();
                ((b) this.f126038b).Ko(i10, aVar.build());
                return this;
            }

            public a dm(n nVar) {
                El();
                ((b) this.f126038b).mn(nVar);
                return this;
            }

            public a dn(int i10, b bVar) {
                El();
                ((b) this.f126038b).Ko(i10, bVar);
                return this;
            }

            @Override // com.google.protobuf.e0.c
            public com.google.protobuf.u e0(int i10) {
                return ((b) this.f126038b).e0(i10);
            }

            public a em(int i10, C1214b.a aVar) {
                El();
                ((b) this.f126038b).nn(i10, aVar.build());
                return this;
            }

            public a en(int i10, f0.a aVar) {
                El();
                ((b) this.f126038b).Lo(i10, aVar.build());
                return this;
            }

            public a fm(int i10, C1214b c1214b) {
                El();
                ((b) this.f126038b).nn(i10, c1214b);
                return this;
            }

            public a fn(int i10, f0 f0Var) {
                El();
                ((b) this.f126038b).Lo(i10, f0Var);
                return this;
            }

            @Override // com.google.protobuf.e0.c
            public boolean g() {
                return ((b) this.f126038b).g();
            }

            @Override // com.google.protobuf.e0.c
            public String getName() {
                return ((b) this.f126038b).getName();
            }

            public a gm(C1214b.a aVar) {
                El();
                ((b) this.f126038b).on(aVar.build());
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a gn(z.a aVar) {
                El();
                ((b) this.f126038b).Mo((z) aVar.build());
                return this;
            }

            @Override // com.google.protobuf.e0.c
            public boolean h() {
                return ((b) this.f126038b).h();
            }

            @Override // com.google.protobuf.e0.c
            public int h2() {
                return ((b) this.f126038b).h2();
            }

            public a hm(C1214b c1214b) {
                El();
                ((b) this.f126038b).on(c1214b);
                return this;
            }

            public a hn(z zVar) {
                El();
                ((b) this.f126038b).Mo(zVar);
                return this;
            }

            @Override // com.google.protobuf.e0.c
            public List<n> i3() {
                return Collections.unmodifiableList(((b) this.f126038b).i3());
            }

            public a im(int i10, n.a aVar) {
                El();
                ((b) this.f126038b).pn(i10, aVar.build());
                return this;
            }

            public a in(int i10, String str) {
                El();
                ((b) this.f126038b).No(i10, str);
                return this;
            }

            public a jm(int i10, n nVar) {
                El();
                ((b) this.f126038b).pn(i10, nVar);
                return this;
            }

            public a jn(int i10, d.a aVar) {
                El();
                ((b) this.f126038b).Oo(i10, aVar.build());
                return this;
            }

            @Override // com.google.protobuf.e0.c
            public int k6() {
                return ((b) this.f126038b).k6();
            }

            public a km(n.a aVar) {
                El();
                ((b) this.f126038b).qn(aVar.build());
                return this;
            }

            public a kn(int i10, d dVar) {
                El();
                ((b) this.f126038b).Oo(i10, dVar);
                return this;
            }

            @Override // com.google.protobuf.e0.c
            public List<f0> l5() {
                return Collections.unmodifiableList(((b) this.f126038b).l5());
            }

            public a lm(n nVar) {
                El();
                ((b) this.f126038b).qn(nVar);
                return this;
            }

            @Override // com.google.protobuf.e0.c
            public int m0() {
                return ((b) this.f126038b).m0();
            }

            @Override // com.google.protobuf.e0.c
            public List<C1214b> m2() {
                return Collections.unmodifiableList(((b) this.f126038b).m2());
            }

            public a mm(int i10, a aVar) {
                El();
                ((b) this.f126038b).rn(i10, aVar.build());
                return this;
            }

            @Override // com.google.protobuf.e0.c
            public b n6(int i10) {
                return ((b) this.f126038b).n6(i10);
            }

            public a nm(int i10, b bVar) {
                El();
                ((b) this.f126038b).rn(i10, bVar);
                return this;
            }

            public a om(a aVar) {
                El();
                ((b) this.f126038b).sn(aVar.build());
                return this;
            }

            public a pm(b bVar) {
                El();
                ((b) this.f126038b).sn(bVar);
                return this;
            }

            @Override // com.google.protobuf.e0.c
            public String q0(int i10) {
                return ((b) this.f126038b).q0(i10);
            }

            public a qm(int i10, f0.a aVar) {
                El();
                ((b) this.f126038b).tn(i10, aVar.build());
                return this;
            }

            @Override // com.google.protobuf.e0.c
            public List<n> r0() {
                return Collections.unmodifiableList(((b) this.f126038b).r0());
            }

            public a rm(int i10, f0 f0Var) {
                El();
                ((b) this.f126038b).tn(i10, f0Var);
                return this;
            }

            public a sm(f0.a aVar) {
                El();
                ((b) this.f126038b).un(aVar.build());
                return this;
            }

            @Override // com.google.protobuf.e0.c
            public int t0() {
                return ((b) this.f126038b).t0();
            }

            public a tm(f0 f0Var) {
                El();
                ((b) this.f126038b).un(f0Var);
                return this;
            }

            public a um(String str) {
                El();
                ((b) this.f126038b).vn(str);
                return this;
            }

            public a vm(com.google.protobuf.u uVar) {
                El();
                ((b) this.f126038b).wn(uVar);
                return this;
            }

            @Override // com.google.protobuf.e0.c
            public int w0() {
                return ((b) this.f126038b).w0();
            }

            public a wm(int i10, d.a aVar) {
                El();
                ((b) this.f126038b).xn(i10, aVar.build());
                return this;
            }

            @Override // com.google.protobuf.e0.c
            public int x2() {
                return ((b) this.f126038b).x2();
            }

            public a xm(int i10, d dVar) {
                El();
                ((b) this.f126038b).xn(i10, dVar);
                return this;
            }

            @Override // com.google.protobuf.e0.c
            public d y0(int i10) {
                return ((b) this.f126038b).y0(i10);
            }

            public a ym(d.a aVar) {
                El();
                ((b) this.f126038b).yn(aVar.build());
                return this;
            }

            public a zm(d dVar) {
                El();
                ((b) this.f126038b).yn(dVar);
                return this;
            }

            private a() {
                super(b.DEFAULT_INSTANCE);
            }
        }

        /* JADX INFO: renamed from: com.google.protobuf.e0$b$b, reason: collision with other inner class name */
        public static final class C1214b extends l1<C1214b, a> implements c {
            private static final C1214b DEFAULT_INSTANCE;
            public static final int END_FIELD_NUMBER = 2;
            public static final int OPTIONS_FIELD_NUMBER = 3;
            private static volatile f3<C1214b> PARSER = null;
            public static final int START_FIELD_NUMBER = 1;
            private int bitField0_;
            private int end_;
            private byte memoizedIsInitialized = 2;
            private l options_;
            private int start_;

            /* JADX INFO: renamed from: com.google.protobuf.e0$b$b$a */
            public static final class a extends l1.b<C1214b, a> implements c {
                /* synthetic */ a(a aVar) {
                    this();
                }

                @Override // com.google.protobuf.e0.b.c
                public boolean L() {
                    return ((C1214b) this.f126038b).L();
                }

                public a Ol() {
                    El();
                    ((C1214b) this.f126038b).hm();
                    return this;
                }

                public a Pl() {
                    El();
                    ((C1214b) this.f126038b).im();
                    return this;
                }

                public a Ql() {
                    El();
                    ((C1214b) this.f126038b).jm();
                    return this;
                }

                public a Rl(l lVar) {
                    El();
                    ((C1214b) this.f126038b).lm(lVar);
                    return this;
                }

                public a Sl(int i10) {
                    El();
                    ((C1214b) this.f126038b).Bm(i10);
                    return this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public a Tl(l.a aVar) {
                    El();
                    ((C1214b) this.f126038b).Cm((l) aVar.build());
                    return this;
                }

                public a Ul(l lVar) {
                    El();
                    ((C1214b) this.f126038b).Cm(lVar);
                    return this;
                }

                public a Vl(int i10) {
                    El();
                    ((C1214b) this.f126038b).Dm(i10);
                    return this;
                }

                @Override // com.google.protobuf.e0.b.c
                public l b() {
                    return ((C1214b) this.f126038b).b();
                }

                @Override // com.google.protobuf.e0.b.c
                public boolean g() {
                    return ((C1214b) this.f126038b).g();
                }

                @Override // com.google.protobuf.e0.b.c
                public int u() {
                    return ((C1214b) this.f126038b).u();
                }

                @Override // com.google.protobuf.e0.b.c
                public int v() {
                    return ((C1214b) this.f126038b).v();
                }

                @Override // com.google.protobuf.e0.b.c
                public boolean x() {
                    return ((C1214b) this.f126038b).x();
                }

                private a() {
                    super(C1214b.DEFAULT_INSTANCE);
                }
            }

            static {
                C1214b c1214b = new C1214b();
                DEFAULT_INSTANCE = c1214b;
                l1.Wl(C1214b.class, c1214b);
            }

            private C1214b() {
            }

            public static f3<C1214b> Am() {
                return DEFAULT_INSTANCE.W7();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void Bm(int i10) {
                this.bitField0_ |= 2;
                this.end_ = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void Cm(l lVar) {
                lVar.getClass();
                this.options_ = lVar;
                this.bitField0_ |= 4;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void Dm(int i10) {
                this.bitField0_ |= 1;
                this.start_ = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void hm() {
                this.bitField0_ &= -3;
                this.end_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void im() {
                this.options_ = null;
                this.bitField0_ &= -5;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void jm() {
                this.bitField0_ &= -2;
                this.start_ = 0;
            }

            public static C1214b km() {
                return DEFAULT_INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Multi-variable type inference failed */
            public void lm(l lVar) {
                lVar.getClass();
                l lVar2 = this.options_;
                if (lVar2 == null || lVar2 == l.zm()) {
                    this.options_ = lVar;
                } else {
                    this.options_ = ((l.a) l.Dm(this.options_).Jl(lVar)).B1();
                }
                this.bitField0_ |= 4;
            }

            public static a mm() {
                return DEFAULT_INSTANCE.jf();
            }

            public static a nm(C1214b c1214b) {
                return DEFAULT_INSTANCE.Uf(c1214b);
            }

            public static C1214b om(InputStream inputStream) throws IOException {
                return (C1214b) l1.El(DEFAULT_INSTANCE, inputStream);
            }

            public static C1214b pm(InputStream inputStream, v0 v0Var) throws IOException {
                return (C1214b) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
            }

            public static C1214b qm(com.google.protobuf.u uVar) throws t1 {
                return (C1214b) l1.Gl(DEFAULT_INSTANCE, uVar);
            }

            public static C1214b rm(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
                return (C1214b) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
            }

            public static C1214b sm(com.google.protobuf.z zVar) throws IOException {
                return (C1214b) l1.Il(DEFAULT_INSTANCE, zVar);
            }

            public static C1214b tm(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
                return (C1214b) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
            }

            public static C1214b um(InputStream inputStream) throws IOException {
                return (C1214b) l1.Kl(DEFAULT_INSTANCE, inputStream);
            }

            public static C1214b vm(InputStream inputStream, v0 v0Var) throws IOException {
                return (C1214b) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
            }

            public static C1214b wm(ByteBuffer byteBuffer) throws t1 {
                return (C1214b) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
            }

            public static C1214b xm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
                return (C1214b) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
            }

            public static C1214b ym(byte[] bArr) throws t1 {
                return (C1214b) l1.Ol(DEFAULT_INSTANCE, bArr);
            }

            public static C1214b zm(byte[] bArr, v0 v0Var) throws t1 {
                return (C1214b) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
            }

            @Override // com.google.protobuf.e0.b.c
            public boolean L() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.l1
            protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
                f3 cVar;
                a aVar = null;
                switch (a.f125834a[iVar.ordinal()]) {
                    case 1:
                        return new C1214b();
                    case 2:
                        return new a(aVar);
                    case 3:
                        return l1.Al(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001င\u0000\u0002င\u0001\u0003ᐉ\u0002", new Object[]{"bitField0_", "start_", "end_", "options_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        f3<C1214b> f3Var = PARSER;
                        if (f3Var != null) {
                            return f3Var;
                        }
                        synchronized (C1214b.class) {
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
                        return Byte.valueOf(this.memoizedIsInitialized);
                    case 7:
                        this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            @Override // com.google.protobuf.e0.b.c
            public l b() {
                l lVar = this.options_;
                return lVar == null ? l.zm() : lVar;
            }

            @Override // com.google.protobuf.e0.b.c
            public boolean g() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.e0.b.c
            public int u() {
                return this.start_;
            }

            @Override // com.google.protobuf.e0.b.c
            public int v() {
                return this.end_;
            }

            @Override // com.google.protobuf.e0.b.c
            public boolean x() {
                return (this.bitField0_ & 2) != 0;
            }
        }

        public interface c extends o2 {
            boolean L();

            l b();

            boolean g();

            int u();

            int v();

            boolean x();
        }

        public static final class d extends l1<d, a> implements e {
            private static final d DEFAULT_INSTANCE;
            public static final int END_FIELD_NUMBER = 2;
            private static volatile f3<d> PARSER = null;
            public static final int START_FIELD_NUMBER = 1;
            private int bitField0_;
            private int end_;
            private int start_;

            public static final class a extends l1.b<d, a> implements e {
                /* synthetic */ a(a aVar) {
                    this();
                }

                @Override // com.google.protobuf.e0.b.e
                public boolean L() {
                    return ((d) this.f126038b).L();
                }

                public a Ol() {
                    El();
                    ((d) this.f126038b).em();
                    return this;
                }

                public a Pl() {
                    El();
                    ((d) this.f126038b).fm();
                    return this;
                }

                public a Ql(int i10) {
                    El();
                    ((d) this.f126038b).wm(i10);
                    return this;
                }

                public a Rl(int i10) {
                    El();
                    ((d) this.f126038b).xm(i10);
                    return this;
                }

                @Override // com.google.protobuf.e0.b.e
                public int u() {
                    return ((d) this.f126038b).u();
                }

                @Override // com.google.protobuf.e0.b.e
                public int v() {
                    return ((d) this.f126038b).v();
                }

                @Override // com.google.protobuf.e0.b.e
                public boolean x() {
                    return ((d) this.f126038b).x();
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

            /* JADX INFO: Access modifiers changed from: private */
            public void em() {
                this.bitField0_ &= -3;
                this.end_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void fm() {
                this.bitField0_ &= -2;
                this.start_ = 0;
            }

            public static d gm() {
                return DEFAULT_INSTANCE;
            }

            public static a hm() {
                return DEFAULT_INSTANCE.jf();
            }

            public static a im(d dVar) {
                return DEFAULT_INSTANCE.Uf(dVar);
            }

            public static d jm(InputStream inputStream) throws IOException {
                return (d) l1.El(DEFAULT_INSTANCE, inputStream);
            }

            public static d km(InputStream inputStream, v0 v0Var) throws IOException {
                return (d) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
            }

            public static d lm(com.google.protobuf.u uVar) throws t1 {
                return (d) l1.Gl(DEFAULT_INSTANCE, uVar);
            }

            public static d mm(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
                return (d) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
            }

            public static d nm(com.google.protobuf.z zVar) throws IOException {
                return (d) l1.Il(DEFAULT_INSTANCE, zVar);
            }

            public static d om(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
                return (d) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
            }

            public static d pm(InputStream inputStream) throws IOException {
                return (d) l1.Kl(DEFAULT_INSTANCE, inputStream);
            }

            public static d qm(InputStream inputStream, v0 v0Var) throws IOException {
                return (d) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
            }

            public static d rm(ByteBuffer byteBuffer) throws t1 {
                return (d) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
            }

            public static d sm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
                return (d) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
            }

            public static d tm(byte[] bArr) throws t1 {
                return (d) l1.Ol(DEFAULT_INSTANCE, bArr);
            }

            public static d um(byte[] bArr, v0 v0Var) throws t1 {
                return (d) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
            }

            public static f3<d> vm() {
                return DEFAULT_INSTANCE.W7();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void wm(int i10) {
                this.bitField0_ |= 2;
                this.end_ = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void xm(int i10) {
                this.bitField0_ |= 1;
                this.start_ = i10;
            }

            @Override // com.google.protobuf.e0.b.e
            public boolean L() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.l1
            protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
                f3 cVar;
                int i10 = a.f125834a[iVar.ordinal()];
                a aVar = null;
                switch (i10) {
                    case 1:
                        return new d();
                    case 2:
                        return new a(aVar);
                    case 3:
                        return l1.Al(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"bitField0_", "start_", "end_"});
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

            @Override // com.google.protobuf.e0.b.e
            public int u() {
                return this.start_;
            }

            @Override // com.google.protobuf.e0.b.e
            public int v() {
                return this.end_;
            }

            @Override // com.google.protobuf.e0.b.e
            public boolean x() {
                return (this.bitField0_ & 2) != 0;
            }
        }

        public interface e extends o2 {
            boolean L();

            int u();

            int v();

            boolean x();
        }

        static {
            b bVar = new b();
            DEFAULT_INSTANCE = bVar;
            l1.Wl(b.class, bVar);
        }

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void An() {
            this.extension_ = l1.Ij();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Ao(int i10) {
            Mn();
            this.field_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Bn() {
            this.extensionRange_ = l1.Ij();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Bo(int i10) {
            Nn();
            this.nestedType_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Cn() {
            this.field_ = l1.Ij();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Co(int i10) {
            On();
            this.oneofDecl_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Dn() {
            this.bitField0_ &= -2;
            this.name_ = Rn().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Do(int i10) {
            Qn();
            this.reservedRange_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void En() {
            this.nestedType_ = l1.Ij();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Eo(int i10, d dVar) {
            dVar.getClass();
            Jn();
            this.enumType_.set(i10, dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Fn() {
            this.oneofDecl_ = l1.Ij();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Fo(int i10, n nVar) {
            nVar.getClass();
            Kn();
            this.extension_.set(i10, nVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Gn() {
            this.options_ = null;
            this.bitField0_ &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Go(int i10, C1214b c1214b) {
            c1214b.getClass();
            Ln();
            this.extensionRange_.set(i10, c1214b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Hn() {
            this.reservedName_ = l1.Ij();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Ho(int i10, n nVar) {
            nVar.getClass();
            Mn();
            this.field_.set(i10, nVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void In() {
            this.reservedRange_ = l1.Ij();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Io(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.name_ = str;
        }

        private void Jn() {
            s1.k<d> kVar = this.enumType_;
            if (!kVar.s1()) {
                this.enumType_ = l1.yl(kVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Jo(com.google.protobuf.u uVar) {
            this.name_ = uVar.z0();
            this.bitField0_ |= 1;
        }

        private void Kn() {
            s1.k<n> kVar = this.extension_;
            if (kVar.s1()) {
                return;
            }
            this.extension_ = l1.yl(kVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Ko(int i10, b bVar) {
            bVar.getClass();
            Nn();
            this.nestedType_.set(i10, bVar);
        }

        private void Ln() {
            s1.k<C1214b> kVar = this.extensionRange_;
            if (kVar.s1()) {
                return;
            }
            this.extensionRange_ = l1.yl(kVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Lo(int i10, f0 f0Var) {
            f0Var.getClass();
            On();
            this.oneofDecl_.set(i10, f0Var);
        }

        private void Mn() {
            s1.k<n> kVar = this.field_;
            if (kVar.s1()) {
                return;
            }
            this.field_ = l1.yl(kVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Mo(z zVar) {
            zVar.getClass();
            this.options_ = zVar;
            this.bitField0_ |= 2;
        }

        private void Nn() {
            s1.k<b> kVar = this.nestedType_;
            if (kVar.s1()) {
                return;
            }
            this.nestedType_ = l1.yl(kVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void No(int i10, String str) {
            str.getClass();
            Pn();
            this.reservedName_.set(i10, str);
        }

        private void On() {
            s1.k<f0> kVar = this.oneofDecl_;
            if (!kVar.s1()) {
                this.oneofDecl_ = l1.yl(kVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Oo(int i10, d dVar) {
            dVar.getClass();
            Qn();
            this.reservedRange_.set(i10, dVar);
        }

        private void Pn() {
            s1.k<String> kVar = this.reservedName_;
            if (!kVar.s1()) {
                this.reservedName_ = l1.yl(kVar);
            }
        }

        private void Qn() {
            s1.k<d> kVar = this.reservedRange_;
            if (kVar.s1()) {
                return;
            }
            this.reservedRange_ = l1.yl(kVar);
        }

        public static b Rn() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void bn(Iterable<? extends d> iterable) {
            Jn();
            com.google.protobuf.a.y(iterable, this.enumType_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void cn(Iterable<? extends n> iterable) {
            Kn();
            com.google.protobuf.a.y(iterable, this.extension_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void dn(Iterable<? extends C1214b> iterable) {
            Ln();
            com.google.protobuf.a.y(iterable, this.extensionRange_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void en(Iterable<? extends n> iterable) {
            Mn();
            com.google.protobuf.a.y(iterable, this.field_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void fn(Iterable<? extends b> iterable) {
            Nn();
            com.google.protobuf.a.y(iterable, this.nestedType_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void gn(Iterable<? extends f0> iterable) {
            On();
            com.google.protobuf.a.y(iterable, this.oneofDecl_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void hn(Iterable<String> iterable) {
            Pn();
            com.google.protobuf.a.y(iterable, this.reservedName_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void ho(z zVar) {
            zVar.getClass();
            z zVar2 = this.options_;
            if (zVar2 == null || zVar2 == z.Lm()) {
                this.options_ = zVar;
            } else {
                this.options_ = ((z.a) z.Pm(this.options_).Jl(zVar)).B1();
            }
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void in(Iterable<? extends d> iterable) {
            Qn();
            com.google.protobuf.a.y(iterable, this.reservedRange_);
        }

        public static a io() {
            return DEFAULT_INSTANCE.jf();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void jn(int i10, d dVar) {
            dVar.getClass();
            Jn();
            this.enumType_.add(i10, dVar);
        }

        public static a jo(b bVar) {
            return DEFAULT_INSTANCE.Uf(bVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void kn(d dVar) {
            dVar.getClass();
            Jn();
            this.enumType_.add(dVar);
        }

        public static b ko(InputStream inputStream) throws IOException {
            return (b) l1.El(DEFAULT_INSTANCE, inputStream);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void ln(int i10, n nVar) {
            nVar.getClass();
            Kn();
            this.extension_.add(i10, nVar);
        }

        public static b lo(InputStream inputStream, v0 v0Var) throws IOException {
            return (b) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mn(n nVar) {
            nVar.getClass();
            Kn();
            this.extension_.add(nVar);
        }

        public static b mo(com.google.protobuf.u uVar) throws t1 {
            return (b) l1.Gl(DEFAULT_INSTANCE, uVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void nn(int i10, C1214b c1214b) {
            c1214b.getClass();
            Ln();
            this.extensionRange_.add(i10, c1214b);
        }

        public static b no(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
            return (b) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void on(C1214b c1214b) {
            c1214b.getClass();
            Ln();
            this.extensionRange_.add(c1214b);
        }

        public static b oo(com.google.protobuf.z zVar) throws IOException {
            return (b) l1.Il(DEFAULT_INSTANCE, zVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void pn(int i10, n nVar) {
            nVar.getClass();
            Mn();
            this.field_.add(i10, nVar);
        }

        public static b po(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
            return (b) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void qn(n nVar) {
            nVar.getClass();
            Mn();
            this.field_.add(nVar);
        }

        public static b qo(InputStream inputStream) throws IOException {
            return (b) l1.Kl(DEFAULT_INSTANCE, inputStream);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void rn(int i10, b bVar) {
            bVar.getClass();
            Nn();
            this.nestedType_.add(i10, bVar);
        }

        public static b ro(InputStream inputStream, v0 v0Var) throws IOException {
            return (b) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void sn(b bVar) {
            bVar.getClass();
            Nn();
            this.nestedType_.add(bVar);
        }

        public static b so(ByteBuffer byteBuffer) throws t1 {
            return (b) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void tn(int i10, f0 f0Var) {
            f0Var.getClass();
            On();
            this.oneofDecl_.add(i10, f0Var);
        }

        public static b to(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
            return (b) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void un(f0 f0Var) {
            f0Var.getClass();
            On();
            this.oneofDecl_.add(f0Var);
        }

        public static b uo(byte[] bArr) throws t1 {
            return (b) l1.Ol(DEFAULT_INSTANCE, bArr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void vn(String str) {
            str.getClass();
            Pn();
            this.reservedName_.add(str);
        }

        public static b vo(byte[] bArr, v0 v0Var) throws t1 {
            return (b) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void wn(com.google.protobuf.u uVar) {
            Pn();
            this.reservedName_.add(uVar.z0());
        }

        public static f3<b> wo() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void xn(int i10, d dVar) {
            dVar.getClass();
            Qn();
            this.reservedRange_.add(i10, dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void xo(int i10) {
            Jn();
            this.enumType_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void yn(d dVar) {
            dVar.getClass();
            Qn();
            this.reservedRange_.add(dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void yo(int i10) {
            Kn();
            this.extension_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zn() {
            this.enumType_ = l1.Ij();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zo(int i10) {
            Ln();
            this.extensionRange_.remove(i10);
        }

        @Override // com.google.protobuf.e0.c
        public d A0(int i10) {
            return this.reservedRange_.get(i10);
        }

        @Override // com.google.protobuf.e0.c
        public f0 B7(int i10) {
            return this.oneofDecl_.get(i10);
        }

        @Override // com.google.protobuf.e0.c
        public List<b> D6() {
            return this.nestedType_;
        }

        @Override // com.google.protobuf.e0.c
        public List<String> I0() {
            return this.reservedName_;
        }

        @Override // com.google.protobuf.e0.c
        public n K0(int i10) {
            return this.extension_.get(i10);
        }

        @Override // com.google.protobuf.e0.c
        public n L5(int i10) {
            return this.field_.get(i10);
        }

        @Override // com.google.protobuf.e0.c
        public List<d> N0() {
            return this.reservedRange_;
        }

        @Override // com.google.protobuf.e0.c
        public int O0() {
            return this.reservedName_.size();
        }

        @Override // com.google.protobuf.e0.c
        public int R4() {
            return this.extensionRange_.size();
        }

        @Override // com.google.protobuf.l1
        protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
            f3 cVar;
            a aVar = null;
            switch (a.f125834a[iVar.ordinal()]) {
                case 1:
                    return new b();
                case 2:
                    return new a(aVar);
                case 3:
                    return l1.Al(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0000\b\u0007\u0001ဈ\u0000\u0002Л\u0003Л\u0004Л\u0005Л\u0006Л\u0007ᐉ\u0001\bЛ\t\u001b\n\u001a", new Object[]{"bitField0_", "name_", "field_", n.class, "nestedType_", b.class, "enumType_", d.class, "extensionRange_", C1214b.class, "extension_", n.class, "options_", "oneofDecl_", f0.class, "reservedRange_", d.class, "reservedName_"});
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public e Sn(int i10) {
            return this.enumType_.get(i10);
        }

        public List<? extends e> Tn() {
            return this.enumType_;
        }

        public o Un(int i10) {
            return this.extension_.get(i10);
        }

        public List<? extends o> Vn() {
            return this.extension_;
        }

        public c Wn(int i10) {
            return this.extensionRange_.get(i10);
        }

        @Override // com.google.protobuf.e0.c
        public C1214b X3(int i10) {
            return this.extensionRange_.get(i10);
        }

        public List<? extends c> Xn() {
            return this.extensionRange_;
        }

        public o Yn(int i10) {
            return this.field_.get(i10);
        }

        public List<? extends o> Zn() {
            return this.field_;
        }

        @Override // com.google.protobuf.e0.c
        public com.google.protobuf.u a() {
            return com.google.protobuf.u.C(this.name_);
        }

        @Override // com.google.protobuf.e0.c
        public List<d> a0() {
            return this.enumType_;
        }

        public c ao(int i10) {
            return this.nestedType_.get(i10);
        }

        @Override // com.google.protobuf.e0.c
        public z b() {
            z zVarLm = this.options_;
            if (zVarLm == null) {
                zVarLm = z.Lm();
            }
            return zVarLm;
        }

        public List<? extends c> bo() {
            return this.nestedType_;
        }

        public g0 co(int i10) {
            return this.oneofDecl_.get(i10);
        }

        @Override // com.google.protobuf.e0.c
        public com.google.protobuf.u e0(int i10) {
            return com.google.protobuf.u.C(this.reservedName_.get(i10));
        }

        public List<? extends g0> eo() {
            return this.oneofDecl_;
        }

        public e fo(int i10) {
            return this.reservedRange_.get(i10);
        }

        @Override // com.google.protobuf.e0.c
        public boolean g() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.e0.c
        public String getName() {
            return this.name_;
        }

        public List<? extends e> go() {
            return this.reservedRange_;
        }

        @Override // com.google.protobuf.e0.c
        public boolean h() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.e0.c
        public int h2() {
            return this.oneofDecl_.size();
        }

        @Override // com.google.protobuf.e0.c
        public List<n> i3() {
            return this.field_;
        }

        @Override // com.google.protobuf.e0.c
        public int k6() {
            return this.nestedType_.size();
        }

        @Override // com.google.protobuf.e0.c
        public List<f0> l5() {
            return this.oneofDecl_;
        }

        @Override // com.google.protobuf.e0.c
        public int m0() {
            return this.extension_.size();
        }

        @Override // com.google.protobuf.e0.c
        public List<C1214b> m2() {
            return this.extensionRange_;
        }

        @Override // com.google.protobuf.e0.c
        public b n6(int i10) {
            return this.nestedType_.get(i10);
        }

        @Override // com.google.protobuf.e0.c
        public String q0(int i10) {
            return this.reservedName_.get(i10);
        }

        @Override // com.google.protobuf.e0.c
        public List<n> r0() {
            return this.extension_;
        }

        @Override // com.google.protobuf.e0.c
        public int t0() {
            return this.reservedRange_.size();
        }

        @Override // com.google.protobuf.e0.c
        public int w0() {
            return this.enumType_.size();
        }

        @Override // com.google.protobuf.e0.c
        public int x2() {
            return this.field_.size();
        }

        @Override // com.google.protobuf.e0.c
        public d y0(int i10) {
            return this.enumType_.get(i10);
        }
    }

    public static final class b0 extends l1<b0, a> implements c0 {
        public static final int CLIENT_STREAMING_FIELD_NUMBER = 5;
        private static final b0 DEFAULT_INSTANCE;
        public static final int INPUT_TYPE_FIELD_NUMBER = 2;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int OPTIONS_FIELD_NUMBER = 4;
        public static final int OUTPUT_TYPE_FIELD_NUMBER = 3;
        private static volatile f3<b0> PARSER = null;
        public static final int SERVER_STREAMING_FIELD_NUMBER = 6;
        private int bitField0_;
        private boolean clientStreaming_;
        private d0 options_;
        private boolean serverStreaming_;
        private byte memoizedIsInitialized = 2;
        private String name_ = "";
        private String inputType_ = "";
        private String outputType_ = "";

        public static final class a extends l1.b<b0, a> implements c0 {
            /* synthetic */ a(a aVar) {
                this();
            }

            @Override // com.google.protobuf.e0.c0
            public boolean E3() {
                return ((b0) this.f126038b).E3();
            }

            @Override // com.google.protobuf.e0.c0
            public boolean M4() {
                return ((b0) this.f126038b).M4();
            }

            @Override // com.google.protobuf.e0.c0
            public boolean O2() {
                return ((b0) this.f126038b).O2();
            }

            public a Ol() {
                El();
                ((b0) this.f126038b).qm();
                return this;
            }

            public a Pl() {
                El();
                ((b0) this.f126038b).rm();
                return this;
            }

            @Override // com.google.protobuf.e0.c0
            public boolean Q7() {
                return ((b0) this.f126038b).Q7();
            }

            public a Ql() {
                El();
                ((b0) this.f126038b).sm();
                return this;
            }

            public a Rl() {
                El();
                ((b0) this.f126038b).tm();
                return this;
            }

            public a Sl() {
                El();
                ((b0) this.f126038b).um();
                return this;
            }

            @Override // com.google.protobuf.e0.c0
            public com.google.protobuf.u T7() {
                return ((b0) this.f126038b).T7();
            }

            public a Tl() {
                El();
                ((b0) this.f126038b).vm();
                return this;
            }

            public a Ul(d0 d0Var) {
                El();
                ((b0) this.f126038b).xm(d0Var);
                return this;
            }

            public a Vl(boolean z10) {
                El();
                ((b0) this.f126038b).Nm(z10);
                return this;
            }

            public a Wl(String str) {
                El();
                ((b0) this.f126038b).Om(str);
                return this;
            }

            public a Xl(com.google.protobuf.u uVar) {
                El();
                ((b0) this.f126038b).Pm(uVar);
                return this;
            }

            public a Yl(String str) {
                El();
                ((b0) this.f126038b).Qm(str);
                return this;
            }

            public a Zl(com.google.protobuf.u uVar) {
                El();
                ((b0) this.f126038b).Rm(uVar);
                return this;
            }

            @Override // com.google.protobuf.e0.c0
            public com.google.protobuf.u a() {
                return ((b0) this.f126038b).a();
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a am(d0.a aVar) {
                El();
                ((b0) this.f126038b).Sm((d0) aVar.build());
                return this;
            }

            @Override // com.google.protobuf.e0.c0
            public d0 b() {
                return ((b0) this.f126038b).b();
            }

            public a bm(d0 d0Var) {
                El();
                ((b0) this.f126038b).Sm(d0Var);
                return this;
            }

            public a cm(String str) {
                El();
                ((b0) this.f126038b).Tm(str);
                return this;
            }

            public a dm(com.google.protobuf.u uVar) {
                El();
                ((b0) this.f126038b).Um(uVar);
                return this;
            }

            public a em(boolean z10) {
                El();
                ((b0) this.f126038b).Vm(z10);
                return this;
            }

            @Override // com.google.protobuf.e0.c0
            public String f3() {
                return ((b0) this.f126038b).f3();
            }

            @Override // com.google.protobuf.e0.c0
            public boolean g() {
                return ((b0) this.f126038b).g();
            }

            @Override // com.google.protobuf.e0.c0
            public boolean g7() {
                return ((b0) this.f126038b).g7();
            }

            @Override // com.google.protobuf.e0.c0
            public String getInputType() {
                return ((b0) this.f126038b).getInputType();
            }

            @Override // com.google.protobuf.e0.c0
            public String getName() {
                return ((b0) this.f126038b).getName();
            }

            @Override // com.google.protobuf.e0.c0
            public boolean h() {
                return ((b0) this.f126038b).h();
            }

            @Override // com.google.protobuf.e0.c0
            public com.google.protobuf.u j6() {
                return ((b0) this.f126038b).j6();
            }

            @Override // com.google.protobuf.e0.c0
            public boolean o7() {
                return ((b0) this.f126038b).o7();
            }

            private a() {
                super(b0.DEFAULT_INSTANCE);
            }
        }

        static {
            b0 b0Var = new b0();
            DEFAULT_INSTANCE = b0Var;
            l1.Wl(b0.class, b0Var);
        }

        private b0() {
        }

        public static b0 Am(InputStream inputStream) throws IOException {
            return (b0) l1.El(DEFAULT_INSTANCE, inputStream);
        }

        public static b0 Bm(InputStream inputStream, v0 v0Var) throws IOException {
            return (b0) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static b0 Cm(com.google.protobuf.u uVar) throws t1 {
            return (b0) l1.Gl(DEFAULT_INSTANCE, uVar);
        }

        public static b0 Dm(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
            return (b0) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
        }

        public static b0 Em(com.google.protobuf.z zVar) throws IOException {
            return (b0) l1.Il(DEFAULT_INSTANCE, zVar);
        }

        public static b0 Fm(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
            return (b0) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
        }

        public static b0 Gm(InputStream inputStream) throws IOException {
            return (b0) l1.Kl(DEFAULT_INSTANCE, inputStream);
        }

        public static b0 Hm(InputStream inputStream, v0 v0Var) throws IOException {
            return (b0) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static b0 Im(ByteBuffer byteBuffer) throws t1 {
            return (b0) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
        }

        public static b0 Jm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
            return (b0) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
        }

        public static b0 Km(byte[] bArr) throws t1 {
            return (b0) l1.Ol(DEFAULT_INSTANCE, bArr);
        }

        public static b0 Lm(byte[] bArr, v0 v0Var) throws t1 {
            return (b0) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
        }

        public static f3<b0> Mm() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Nm(boolean z10) {
            this.bitField0_ |= 16;
            this.clientStreaming_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Om(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.inputType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Pm(com.google.protobuf.u uVar) {
            this.inputType_ = uVar.z0();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Qm(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Rm(com.google.protobuf.u uVar) {
            this.name_ = uVar.z0();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Sm(d0 d0Var) {
            d0Var.getClass();
            this.options_ = d0Var;
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Tm(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.outputType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Um(com.google.protobuf.u uVar) {
            this.outputType_ = uVar.z0();
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Vm(boolean z10) {
            this.bitField0_ |= 32;
            this.serverStreaming_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void qm() {
            this.bitField0_ &= -17;
            this.clientStreaming_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void rm() {
            this.bitField0_ &= -3;
            this.inputType_ = wm().getInputType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void sm() {
            this.bitField0_ &= -2;
            this.name_ = wm().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void tm() {
            this.options_ = null;
            this.bitField0_ &= -9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void um() {
            this.bitField0_ &= -5;
            this.outputType_ = wm().f3();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void vm() {
            this.bitField0_ &= -33;
            this.serverStreaming_ = false;
        }

        public static b0 wm() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void xm(d0 d0Var) {
            d0Var.getClass();
            d0 d0Var2 = this.options_;
            if (d0Var2 == null || d0Var2 == d0.Fm()) {
                this.options_ = d0Var;
            } else {
                this.options_ = ((d0.a) d0.Jm(this.options_).Jl(d0Var)).B1();
            }
            this.bitField0_ |= 8;
        }

        public static a ym() {
            return DEFAULT_INSTANCE.jf();
        }

        public static a zm(b0 b0Var) {
            return DEFAULT_INSTANCE.Uf(b0Var);
        }

        @Override // com.google.protobuf.e0.c0
        public boolean E3() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.protobuf.e0.c0
        public boolean M4() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.e0.c0
        public boolean O2() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.google.protobuf.e0.c0
        public boolean Q7() {
            return this.clientStreaming_;
        }

        @Override // com.google.protobuf.l1
        protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
            f3 cVar;
            a aVar = null;
            switch (a.f125834a[iVar.ordinal()]) {
                case 1:
                    return new b0();
                case 2:
                    return new a(aVar);
                case 3:
                    return l1.Al(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ᐉ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"bitField0_", "name_", "inputType_", "outputType_", "options_", "clientStreaming_", "serverStreaming_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f3<b0> f3Var = PARSER;
                    if (f3Var != null) {
                        return f3Var;
                    }
                    synchronized (b0.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.protobuf.e0.c0
        public com.google.protobuf.u T7() {
            return com.google.protobuf.u.C(this.inputType_);
        }

        @Override // com.google.protobuf.e0.c0
        public com.google.protobuf.u a() {
            return com.google.protobuf.u.C(this.name_);
        }

        @Override // com.google.protobuf.e0.c0
        public d0 b() {
            d0 d0Var = this.options_;
            return d0Var == null ? d0.Fm() : d0Var;
        }

        @Override // com.google.protobuf.e0.c0
        public String f3() {
            return this.outputType_;
        }

        @Override // com.google.protobuf.e0.c0
        public boolean g() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.e0.c0
        public boolean g7() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.e0.c0
        public String getInputType() {
            return this.inputType_;
        }

        @Override // com.google.protobuf.e0.c0
        public String getName() {
            return this.name_;
        }

        @Override // com.google.protobuf.e0.c0
        public boolean h() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.e0.c0
        public com.google.protobuf.u j6() {
            return com.google.protobuf.u.C(this.outputType_);
        }

        @Override // com.google.protobuf.e0.c0
        public boolean o7() {
            return this.serverStreaming_;
        }
    }

    public interface c extends o2 {
        b.d A0(int i10);

        f0 B7(int i10);

        List<b> D6();

        List<String> I0();

        n K0(int i10);

        n L5(int i10);

        List<b.d> N0();

        int O0();

        int R4();

        b.C1214b X3(int i10);

        com.google.protobuf.u a();

        List<d> a0();

        z b();

        com.google.protobuf.u e0(int i10);

        boolean g();

        String getName();

        boolean h();

        int h2();

        List<n> i3();

        int k6();

        List<f0> l5();

        int m0();

        List<b.C1214b> m2();

        b n6(int i10);

        String q0(int i10);

        List<n> r0();

        int t0();

        int w0();

        int x2();

        d y0(int i10);
    }

    public interface c0 extends o2 {
        boolean E3();

        boolean M4();

        boolean O2();

        boolean Q7();

        com.google.protobuf.u T7();

        com.google.protobuf.u a();

        d0 b();

        String f3();

        boolean g();

        boolean g7();

        String getInputType();

        String getName();

        boolean h();

        com.google.protobuf.u j6();

        boolean o7();
    }

    public static final class d extends l1<d, a> implements e {
        private static final d DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int OPTIONS_FIELD_NUMBER = 3;
        private static volatile f3<d> PARSER = null;
        public static final int RESERVED_NAME_FIELD_NUMBER = 5;
        public static final int RESERVED_RANGE_FIELD_NUMBER = 4;
        public static final int VALUE_FIELD_NUMBER = 2;
        private int bitField0_;
        private f options_;
        private byte memoizedIsInitialized = 2;
        private String name_ = "";
        private s1.k<h> value_ = l1.Ij();
        private s1.k<b> reservedRange_ = l1.Ij();
        private s1.k<String> reservedName_ = l1.Ij();

        public static final class a extends l1.b<d, a> implements e {
            /* synthetic */ a(a aVar) {
                this();
            }

            @Override // com.google.protobuf.e0.e
            public b A0(int i10) {
                return ((d) this.f126038b).A0(i10);
            }

            @Override // com.google.protobuf.e0.e
            public List<String> I0() {
                return Collections.unmodifiableList(((d) this.f126038b).I0());
            }

            @Override // com.google.protobuf.e0.e
            public List<b> N0() {
                return Collections.unmodifiableList(((d) this.f126038b).N0());
            }

            @Override // com.google.protobuf.e0.e
            public int O0() {
                return ((d) this.f126038b).O0();
            }

            public a Ol(Iterable<String> iterable) {
                El();
                ((d) this.f126038b).xm(iterable);
                return this;
            }

            public a Pl(Iterable<? extends b> iterable) {
                El();
                ((d) this.f126038b).ym(iterable);
                return this;
            }

            public a Ql(Iterable<? extends h> iterable) {
                El();
                ((d) this.f126038b).zm(iterable);
                return this;
            }

            public a Rl(String str) {
                El();
                ((d) this.f126038b).Am(str);
                return this;
            }

            public a Sl(com.google.protobuf.u uVar) {
                El();
                ((d) this.f126038b).Bm(uVar);
                return this;
            }

            public a Tl(int i10, b.a aVar) {
                El();
                ((d) this.f126038b).Cm(i10, aVar.build());
                return this;
            }

            public a Ul(int i10, b bVar) {
                El();
                ((d) this.f126038b).Cm(i10, bVar);
                return this;
            }

            public a Vl(b.a aVar) {
                El();
                ((d) this.f126038b).Dm(aVar.build());
                return this;
            }

            public a Wl(b bVar) {
                El();
                ((d) this.f126038b).Dm(bVar);
                return this;
            }

            public a Xl(int i10, h.a aVar) {
                El();
                ((d) this.f126038b).Em(i10, aVar.build());
                return this;
            }

            @Override // com.google.protobuf.e0.e
            public int Y5() {
                return ((d) this.f126038b).Y5();
            }

            public a Yl(int i10, h hVar) {
                El();
                ((d) this.f126038b).Em(i10, hVar);
                return this;
            }

            public a Zl(h.a aVar) {
                El();
                ((d) this.f126038b).Fm(aVar.build());
                return this;
            }

            @Override // com.google.protobuf.e0.e
            public com.google.protobuf.u a() {
                return ((d) this.f126038b).a();
            }

            public a am(h hVar) {
                El();
                ((d) this.f126038b).Fm(hVar);
                return this;
            }

            @Override // com.google.protobuf.e0.e
            public f b() {
                return ((d) this.f126038b).b();
            }

            public a bm() {
                El();
                ((d) this.f126038b).Gm();
                return this;
            }

            public a cm() {
                El();
                ((d) this.f126038b).Hm();
                return this;
            }

            public a dm() {
                El();
                ((d) this.f126038b).Im();
                return this;
            }

            @Override // com.google.protobuf.e0.e
            public com.google.protobuf.u e0(int i10) {
                return ((d) this.f126038b).e0(i10);
            }

            public a em() {
                El();
                ((d) this.f126038b).Jm();
                return this;
            }

            public a fm() {
                El();
                ((d) this.f126038b).Km();
                return this;
            }

            @Override // com.google.protobuf.e0.e
            public boolean g() {
                return ((d) this.f126038b).g();
            }

            @Override // com.google.protobuf.e0.e
            public String getName() {
                return ((d) this.f126038b).getName();
            }

            @Override // com.google.protobuf.e0.e
            public h getValue(int i10) {
                return ((d) this.f126038b).getValue(i10);
            }

            public a gm(f fVar) {
                El();
                ((d) this.f126038b).Tm(fVar);
                return this;
            }

            @Override // com.google.protobuf.e0.e
            public boolean h() {
                return ((d) this.f126038b).h();
            }

            public a hm(int i10) {
                El();
                ((d) this.f126038b).jn(i10);
                return this;
            }

            public a im(int i10) {
                El();
                ((d) this.f126038b).kn(i10);
                return this;
            }

            public a jm(String str) {
                El();
                ((d) this.f126038b).ln(str);
                return this;
            }

            public a km(com.google.protobuf.u uVar) {
                El();
                ((d) this.f126038b).mn(uVar);
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a lm(f.a aVar) {
                El();
                ((d) this.f126038b).nn((f) aVar.build());
                return this;
            }

            public a mm(f fVar) {
                El();
                ((d) this.f126038b).nn(fVar);
                return this;
            }

            public a nm(int i10, String str) {
                El();
                ((d) this.f126038b).on(i10, str);
                return this;
            }

            public a om(int i10, b.a aVar) {
                El();
                ((d) this.f126038b).pn(i10, aVar.build());
                return this;
            }

            public a pm(int i10, b bVar) {
                El();
                ((d) this.f126038b).pn(i10, bVar);
                return this;
            }

            @Override // com.google.protobuf.e0.e
            public String q0(int i10) {
                return ((d) this.f126038b).q0(i10);
            }

            @Override // com.google.protobuf.e0.e
            public List<h> q7() {
                return Collections.unmodifiableList(((d) this.f126038b).q7());
            }

            public a qm(int i10, h.a aVar) {
                El();
                ((d) this.f126038b).qn(i10, aVar.build());
                return this;
            }

            public a rm(int i10, h hVar) {
                El();
                ((d) this.f126038b).qn(i10, hVar);
                return this;
            }

            @Override // com.google.protobuf.e0.e
            public int t0() {
                return ((d) this.f126038b).t0();
            }

            private a() {
                super(d.DEFAULT_INSTANCE);
            }
        }

        public static final class b extends l1<b, a> implements c {
            private static final b DEFAULT_INSTANCE;
            public static final int END_FIELD_NUMBER = 2;
            private static volatile f3<b> PARSER = null;
            public static final int START_FIELD_NUMBER = 1;
            private int bitField0_;
            private int end_;
            private int start_;

            public static final class a extends l1.b<b, a> implements c {
                /* synthetic */ a(a aVar) {
                    this();
                }

                @Override // com.google.protobuf.e0.d.c
                public boolean L() {
                    return ((b) this.f126038b).L();
                }

                public a Ol() {
                    El();
                    ((b) this.f126038b).em();
                    return this;
                }

                public a Pl() {
                    El();
                    ((b) this.f126038b).fm();
                    return this;
                }

                public a Ql(int i10) {
                    El();
                    ((b) this.f126038b).wm(i10);
                    return this;
                }

                public a Rl(int i10) {
                    El();
                    ((b) this.f126038b).xm(i10);
                    return this;
                }

                @Override // com.google.protobuf.e0.d.c
                public int u() {
                    return ((b) this.f126038b).u();
                }

                @Override // com.google.protobuf.e0.d.c
                public int v() {
                    return ((b) this.f126038b).v();
                }

                @Override // com.google.protobuf.e0.d.c
                public boolean x() {
                    return ((b) this.f126038b).x();
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
            public void em() {
                this.bitField0_ &= -3;
                this.end_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void fm() {
                this.bitField0_ &= -2;
                this.start_ = 0;
            }

            public static b gm() {
                return DEFAULT_INSTANCE;
            }

            public static a hm() {
                return DEFAULT_INSTANCE.jf();
            }

            public static a im(b bVar) {
                return DEFAULT_INSTANCE.Uf(bVar);
            }

            public static b jm(InputStream inputStream) throws IOException {
                return (b) l1.El(DEFAULT_INSTANCE, inputStream);
            }

            public static b km(InputStream inputStream, v0 v0Var) throws IOException {
                return (b) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
            }

            public static b lm(com.google.protobuf.u uVar) throws t1 {
                return (b) l1.Gl(DEFAULT_INSTANCE, uVar);
            }

            public static b mm(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
                return (b) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
            }

            public static b nm(com.google.protobuf.z zVar) throws IOException {
                return (b) l1.Il(DEFAULT_INSTANCE, zVar);
            }

            public static b om(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
                return (b) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
            }

            public static b pm(InputStream inputStream) throws IOException {
                return (b) l1.Kl(DEFAULT_INSTANCE, inputStream);
            }

            public static b qm(InputStream inputStream, v0 v0Var) throws IOException {
                return (b) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
            }

            public static b rm(ByteBuffer byteBuffer) throws t1 {
                return (b) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
            }

            public static b sm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
                return (b) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
            }

            public static b tm(byte[] bArr) throws t1 {
                return (b) l1.Ol(DEFAULT_INSTANCE, bArr);
            }

            public static b um(byte[] bArr, v0 v0Var) throws t1 {
                return (b) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
            }

            public static f3<b> vm() {
                return DEFAULT_INSTANCE.W7();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void wm(int i10) {
                this.bitField0_ |= 2;
                this.end_ = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void xm(int i10) {
                this.bitField0_ |= 1;
                this.start_ = i10;
            }

            @Override // com.google.protobuf.e0.d.c
            public boolean L() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.l1
            protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
                f3 cVar;
                int i10 = a.f125834a[iVar.ordinal()];
                a aVar = null;
                switch (i10) {
                    case 1:
                        return new b();
                    case 2:
                        return new a(aVar);
                    case 3:
                        return l1.Al(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"bitField0_", "start_", "end_"});
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

            @Override // com.google.protobuf.e0.d.c
            public int u() {
                return this.start_;
            }

            @Override // com.google.protobuf.e0.d.c
            public int v() {
                return this.end_;
            }

            @Override // com.google.protobuf.e0.d.c
            public boolean x() {
                return (this.bitField0_ & 2) != 0;
            }
        }

        public interface c extends o2 {
            boolean L();

            int u();

            int v();

            boolean x();
        }

        static {
            d dVar = new d();
            DEFAULT_INSTANCE = dVar;
            l1.Wl(d.class, dVar);
        }

        private d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Am(String str) {
            str.getClass();
            Lm();
            this.reservedName_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Bm(com.google.protobuf.u uVar) {
            Lm();
            this.reservedName_.add(uVar.z0());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Cm(int i10, b bVar) {
            bVar.getClass();
            Mm();
            this.reservedRange_.add(i10, bVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Dm(b bVar) {
            bVar.getClass();
            Mm();
            this.reservedRange_.add(bVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Em(int i10, h hVar) {
            hVar.getClass();
            Nm();
            this.value_.add(i10, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Fm(h hVar) {
            hVar.getClass();
            Nm();
            this.value_.add(hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Gm() {
            this.bitField0_ &= -2;
            this.name_ = Om().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Hm() {
            this.options_ = null;
            this.bitField0_ &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Im() {
            this.reservedName_ = l1.Ij();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Jm() {
            this.reservedRange_ = l1.Ij();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Km() {
            this.value_ = l1.Ij();
        }

        private void Lm() {
            s1.k<String> kVar = this.reservedName_;
            if (kVar.s1()) {
                return;
            }
            this.reservedName_ = l1.yl(kVar);
        }

        private void Mm() {
            s1.k<b> kVar = this.reservedRange_;
            if (kVar.s1()) {
                return;
            }
            this.reservedRange_ = l1.yl(kVar);
        }

        private void Nm() {
            s1.k<h> kVar = this.value_;
            if (kVar.s1()) {
                return;
            }
            this.value_ = l1.yl(kVar);
        }

        public static d Om() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void Tm(f fVar) {
            fVar.getClass();
            f fVar2 = this.options_;
            if (fVar2 == null || fVar2 == f.Fm()) {
                this.options_ = fVar;
            } else {
                this.options_ = ((f.a) f.Jm(this.options_).Jl(fVar)).B1();
            }
            this.bitField0_ |= 2;
        }

        public static a Um() {
            return DEFAULT_INSTANCE.jf();
        }

        public static a Vm(d dVar) {
            return DEFAULT_INSTANCE.Uf(dVar);
        }

        public static d Wm(InputStream inputStream) throws IOException {
            return (d) l1.El(DEFAULT_INSTANCE, inputStream);
        }

        public static d Xm(InputStream inputStream, v0 v0Var) throws IOException {
            return (d) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static d Ym(com.google.protobuf.u uVar) throws t1 {
            return (d) l1.Gl(DEFAULT_INSTANCE, uVar);
        }

        public static d Zm(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
            return (d) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
        }

        public static d an(com.google.protobuf.z zVar) throws IOException {
            return (d) l1.Il(DEFAULT_INSTANCE, zVar);
        }

        public static d bn(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
            return (d) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
        }

        public static d cn(InputStream inputStream) throws IOException {
            return (d) l1.Kl(DEFAULT_INSTANCE, inputStream);
        }

        public static d dn(InputStream inputStream, v0 v0Var) throws IOException {
            return (d) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static d en(ByteBuffer byteBuffer) throws t1 {
            return (d) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
        }

        public static d fn(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
            return (d) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
        }

        public static d gn(byte[] bArr) throws t1 {
            return (d) l1.Ol(DEFAULT_INSTANCE, bArr);
        }

        public static d hn(byte[] bArr, v0 v0Var) throws t1 {
            return (d) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
        }

        public static f3<d> in() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void jn(int i10) {
            Mm();
            this.reservedRange_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void kn(int i10) {
            Nm();
            this.value_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void ln(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mn(com.google.protobuf.u uVar) {
            this.name_ = uVar.z0();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void nn(f fVar) {
            fVar.getClass();
            this.options_ = fVar;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void on(int i10, String str) {
            str.getClass();
            Lm();
            this.reservedName_.set(i10, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void pn(int i10, b bVar) {
            bVar.getClass();
            Mm();
            this.reservedRange_.set(i10, bVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void qn(int i10, h hVar) {
            hVar.getClass();
            Nm();
            this.value_.set(i10, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void xm(Iterable<String> iterable) {
            Lm();
            com.google.protobuf.a.y(iterable, this.reservedName_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void ym(Iterable<? extends b> iterable) {
            Mm();
            com.google.protobuf.a.y(iterable, this.reservedRange_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zm(Iterable<? extends h> iterable) {
            Nm();
            com.google.protobuf.a.y(iterable, this.value_);
        }

        @Override // com.google.protobuf.e0.e
        public b A0(int i10) {
            return this.reservedRange_.get(i10);
        }

        @Override // com.google.protobuf.e0.e
        public List<String> I0() {
            return this.reservedName_;
        }

        @Override // com.google.protobuf.e0.e
        public List<b> N0() {
            return this.reservedRange_;
        }

        @Override // com.google.protobuf.e0.e
        public int O0() {
            return this.reservedName_.size();
        }

        public c Pm(int i10) {
            return this.reservedRange_.get(i10);
        }

        public List<? extends c> Qm() {
            return this.reservedRange_;
        }

        @Override // com.google.protobuf.l1
        protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
            f3 cVar;
            a aVar = null;
            switch (a.f125834a[iVar.ordinal()]) {
                case 1:
                    return new d();
                case 2:
                    return new a(aVar);
                case 3:
                    return l1.Al(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0003\u0002\u0001ဈ\u0000\u0002Л\u0003ᐉ\u0001\u0004\u001b\u0005\u001a", new Object[]{"bitField0_", "name_", "value_", h.class, "options_", "reservedRange_", b.class, "reservedName_"});
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public i Rm(int i10) {
            return this.value_.get(i10);
        }

        public List<? extends i> Sm() {
            return this.value_;
        }

        @Override // com.google.protobuf.e0.e
        public int Y5() {
            return this.value_.size();
        }

        @Override // com.google.protobuf.e0.e
        public com.google.protobuf.u a() {
            return com.google.protobuf.u.C(this.name_);
        }

        @Override // com.google.protobuf.e0.e
        public f b() {
            f fVarFm = this.options_;
            if (fVarFm == null) {
                fVarFm = f.Fm();
            }
            return fVarFm;
        }

        @Override // com.google.protobuf.e0.e
        public com.google.protobuf.u e0(int i10) {
            return com.google.protobuf.u.C(this.reservedName_.get(i10));
        }

        @Override // com.google.protobuf.e0.e
        public boolean g() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.e0.e
        public String getName() {
            return this.name_;
        }

        @Override // com.google.protobuf.e0.e
        public h getValue(int i10) {
            return this.value_.get(i10);
        }

        @Override // com.google.protobuf.e0.e
        public boolean h() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.e0.e
        public String q0(int i10) {
            return this.reservedName_.get(i10);
        }

        @Override // com.google.protobuf.e0.e
        public List<h> q7() {
            return this.value_;
        }

        @Override // com.google.protobuf.e0.e
        public int t0() {
            return this.reservedRange_.size();
        }
    }

    public static final class d0 extends l1.e<d0, a> implements InterfaceC1216e0 {
        private static final d0 DEFAULT_INSTANCE;
        public static final int DEPRECATED_FIELD_NUMBER = 33;
        public static final int IDEMPOTENCY_LEVEL_FIELD_NUMBER = 34;
        private static volatile f3<d0> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private int bitField0_;
        private boolean deprecated_;
        private int idempotencyLevel_;
        private byte memoizedIsInitialized = 2;
        private s1.k<p0> uninterpretedOption_ = l1.Ij();

        public static final class a extends l1.d<d0, a> implements InterfaceC1216e0 {
            /* synthetic */ a(a aVar) {
                this();
            }

            @Override // com.google.protobuf.e0.InterfaceC1216e0
            public boolean B3() {
                return ((d0) this.f126038b).B3();
            }

            public a Wl(Iterable<? extends p0> iterable) {
                El();
                ((d0) this.f126038b).ym(iterable);
                return this;
            }

            @Override // com.google.protobuf.e0.InterfaceC1216e0
            public b X4() {
                return ((d0) this.f126038b).X4();
            }

            public a Xl(int i10, p0.a aVar) {
                El();
                ((d0) this.f126038b).zm(i10, aVar.build());
                return this;
            }

            public a Yl(int i10, p0 p0Var) {
                El();
                ((d0) this.f126038b).zm(i10, p0Var);
                return this;
            }

            public a Zl(p0.a aVar) {
                El();
                ((d0) this.f126038b).Am(aVar.build());
                return this;
            }

            public a am(p0 p0Var) {
                El();
                ((d0) this.f126038b).Am(p0Var);
                return this;
            }

            public a bm() {
                El();
                ((d0) this.f126038b).Bm();
                return this;
            }

            public a cm() {
                El();
                ((d0) this.f126038b).Cm();
                return this;
            }

            @Override // com.google.protobuf.e0.InterfaceC1216e0
            public List<p0> d() {
                return Collections.unmodifiableList(((d0) this.f126038b).d());
            }

            public a dm() {
                El();
                ((d0) this.f126038b).Dm();
                return this;
            }

            @Override // com.google.protobuf.e0.InterfaceC1216e0
            public p0 e(int i10) {
                return ((d0) this.f126038b).e(i10);
            }

            public a em(int i10) {
                El();
                ((d0) this.f126038b).Xm(i10);
                return this;
            }

            @Override // com.google.protobuf.e0.InterfaceC1216e0
            public int f() {
                return ((d0) this.f126038b).f();
            }

            public a fm(boolean z10) {
                El();
                ((d0) this.f126038b).Ym(z10);
                return this;
            }

            public a gm(b bVar) {
                El();
                ((d0) this.f126038b).Zm(bVar);
                return this;
            }

            public a hm(int i10, p0.a aVar) {
                El();
                ((d0) this.f126038b).an(i10, aVar.build());
                return this;
            }

            public a im(int i10, p0 p0Var) {
                El();
                ((d0) this.f126038b).an(i10, p0Var);
                return this;
            }

            @Override // com.google.protobuf.e0.InterfaceC1216e0
            public boolean j() {
                return ((d0) this.f126038b).j();
            }

            @Override // com.google.protobuf.e0.InterfaceC1216e0
            public boolean l() {
                return ((d0) this.f126038b).l();
            }

            private a() {
                super(d0.DEFAULT_INSTANCE);
            }
        }

        public enum b implements s1.c {
            IDEMPOTENCY_UNKNOWN(0),
            NO_SIDE_EFFECTS(1),
            IDEMPOTENT(2);


            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f125838e = 0;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final int f125839f = 1;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final int f125840g = 2;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private static final s1.d<b> f125841h = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f125843a;

            class a implements s1.d<b> {
                a() {
                }

                @Override // com.google.protobuf.s1.d
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public b a(int i10) {
                    return b.l(i10);
                }
            }

            /* JADX INFO: renamed from: com.google.protobuf.e0$d0$b$b, reason: collision with other inner class name */
            private static final class C1215b implements s1.e {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                static final s1.e f125844a = new C1215b();

                private C1215b() {
                }

                @Override // com.google.protobuf.s1.e
                public boolean a(int i10) {
                    return b.l(i10) != null;
                }
            }

            b(int i10) {
                this.f125843a = i10;
            }

            public static b l(int i10) {
                if (i10 == 0) {
                    return IDEMPOTENCY_UNKNOWN;
                }
                if (i10 == 1) {
                    return NO_SIDE_EFFECTS;
                }
                if (i10 != 2) {
                    return null;
                }
                return IDEMPOTENT;
            }

            public static s1.d<b> n() {
                return f125841h;
            }

            public static s1.e o() {
                return C1215b.f125844a;
            }

            @Deprecated
            public static b p(int i10) {
                return l(i10);
            }

            @Override // com.google.protobuf.s1.c
            public final int i() {
                return this.f125843a;
            }
        }

        static {
            d0 d0Var = new d0();
            DEFAULT_INSTANCE = d0Var;
            l1.Wl(d0.class, d0Var);
        }

        private d0() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Am(p0 p0Var) {
            p0Var.getClass();
            Em();
            this.uninterpretedOption_.add(p0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Bm() {
            this.bitField0_ &= -2;
            this.deprecated_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Cm() {
            this.bitField0_ &= -3;
            this.idempotencyLevel_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Dm() {
            this.uninterpretedOption_ = l1.Ij();
        }

        private void Em() {
            s1.k<p0> kVar = this.uninterpretedOption_;
            if (kVar.s1()) {
                return;
            }
            this.uninterpretedOption_ = l1.yl(kVar);
        }

        public static d0 Fm() {
            return DEFAULT_INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a Im() {
            return (a) DEFAULT_INSTANCE.jf();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a Jm(d0 d0Var) {
            return (a) DEFAULT_INSTANCE.Uf(d0Var);
        }

        public static d0 Km(InputStream inputStream) throws IOException {
            return (d0) l1.El(DEFAULT_INSTANCE, inputStream);
        }

        public static d0 Lm(InputStream inputStream, v0 v0Var) throws IOException {
            return (d0) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static d0 Mm(com.google.protobuf.u uVar) throws t1 {
            return (d0) l1.Gl(DEFAULT_INSTANCE, uVar);
        }

        public static d0 Nm(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
            return (d0) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
        }

        public static d0 Om(com.google.protobuf.z zVar) throws IOException {
            return (d0) l1.Il(DEFAULT_INSTANCE, zVar);
        }

        public static d0 Pm(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
            return (d0) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
        }

        public static d0 Qm(InputStream inputStream) throws IOException {
            return (d0) l1.Kl(DEFAULT_INSTANCE, inputStream);
        }

        public static d0 Rm(InputStream inputStream, v0 v0Var) throws IOException {
            return (d0) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static d0 Sm(ByteBuffer byteBuffer) throws t1 {
            return (d0) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
        }

        public static d0 Tm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
            return (d0) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
        }

        public static d0 Um(byte[] bArr) throws t1 {
            return (d0) l1.Ol(DEFAULT_INSTANCE, bArr);
        }

        public static d0 Vm(byte[] bArr, v0 v0Var) throws t1 {
            return (d0) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
        }

        public static f3<d0> Wm() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Xm(int i10) {
            Em();
            this.uninterpretedOption_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Ym(boolean z10) {
            this.bitField0_ |= 1;
            this.deprecated_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Zm(b bVar) {
            this.idempotencyLevel_ = bVar.i();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void an(int i10, p0 p0Var) {
            p0Var.getClass();
            Em();
            this.uninterpretedOption_.set(i10, p0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void ym(Iterable<? extends p0> iterable) {
            Em();
            com.google.protobuf.a.y(iterable, this.uninterpretedOption_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zm(int i10, p0 p0Var) {
            p0Var.getClass();
            Em();
            this.uninterpretedOption_.add(i10, p0Var);
        }

        @Override // com.google.protobuf.e0.InterfaceC1216e0
        public boolean B3() {
            return (this.bitField0_ & 2) != 0;
        }

        public q0 Gm(int i10) {
            return this.uninterpretedOption_.get(i10);
        }

        public List<? extends q0> Hm() {
            return this.uninterpretedOption_;
        }

        @Override // com.google.protobuf.l1
        protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
            f3 cVar;
            a aVar = null;
            switch (a.f125834a[iVar.ordinal()]) {
                case 1:
                    return new d0();
                case 2:
                    return new a(aVar);
                case 3:
                    return l1.Al(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001!ϧ\u0003\u0000\u0001\u0001!ဇ\u0000\"᠌\u0001ϧЛ", new Object[]{"bitField0_", "deprecated_", "idempotencyLevel_", b.o(), "uninterpretedOption_", p0.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f3<d0> f3Var = PARSER;
                    if (f3Var != null) {
                        return f3Var;
                    }
                    synchronized (d0.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.protobuf.e0.InterfaceC1216e0
        public b X4() {
            b bVarL = b.l(this.idempotencyLevel_);
            return bVarL == null ? b.IDEMPOTENCY_UNKNOWN : bVarL;
        }

        @Override // com.google.protobuf.e0.InterfaceC1216e0
        public List<p0> d() {
            return this.uninterpretedOption_;
        }

        @Override // com.google.protobuf.e0.InterfaceC1216e0
        public p0 e(int i10) {
            return this.uninterpretedOption_.get(i10);
        }

        @Override // com.google.protobuf.e0.InterfaceC1216e0
        public int f() {
            return this.uninterpretedOption_.size();
        }

        @Override // com.google.protobuf.e0.InterfaceC1216e0
        public boolean j() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.e0.InterfaceC1216e0
        public boolean l() {
            return this.deprecated_;
        }
    }

    public interface e extends o2 {
        d.b A0(int i10);

        List<String> I0();

        List<d.b> N0();

        int O0();

        int Y5();

        com.google.protobuf.u a();

        f b();

        com.google.protobuf.u e0(int i10);

        boolean g();

        String getName();

        h getValue(int i10);

        boolean h();

        String q0(int i10);

        List<h> q7();

        int t0();
    }

    /* JADX INFO: renamed from: com.google.protobuf.e0$e0, reason: collision with other inner class name */
    public interface InterfaceC1216e0 extends l1.f<d0, d0.a> {
        boolean B3();

        d0.b X4();

        List<p0> d();

        p0 e(int i10);

        int f();

        boolean j();

        boolean l();
    }

    public static final class f extends l1.e<f, a> implements g {
        public static final int ALLOW_ALIAS_FIELD_NUMBER = 2;
        private static final f DEFAULT_INSTANCE;
        public static final int DEPRECATED_FIELD_NUMBER = 3;
        private static volatile f3<f> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private boolean allowAlias_;
        private int bitField0_;
        private boolean deprecated_;
        private byte memoizedIsInitialized = 2;
        private s1.k<p0> uninterpretedOption_ = l1.Ij();

        public static final class a extends l1.d<f, a> implements g {
            /* synthetic */ a(a aVar) {
                this();
            }

            @Override // com.google.protobuf.e0.g
            public boolean E5() {
                return ((f) this.f126038b).E5();
            }

            @Override // com.google.protobuf.e0.g
            public boolean I6() {
                return ((f) this.f126038b).I6();
            }

            public a Wl(Iterable<? extends p0> iterable) {
                El();
                ((f) this.f126038b).ym(iterable);
                return this;
            }

            public a Xl(int i10, p0.a aVar) {
                El();
                ((f) this.f126038b).zm(i10, aVar.build());
                return this;
            }

            public a Yl(int i10, p0 p0Var) {
                El();
                ((f) this.f126038b).zm(i10, p0Var);
                return this;
            }

            public a Zl(p0.a aVar) {
                El();
                ((f) this.f126038b).Am(aVar.build());
                return this;
            }

            public a am(p0 p0Var) {
                El();
                ((f) this.f126038b).Am(p0Var);
                return this;
            }

            public a bm() {
                El();
                ((f) this.f126038b).Bm();
                return this;
            }

            public a cm() {
                El();
                ((f) this.f126038b).Cm();
                return this;
            }

            @Override // com.google.protobuf.e0.g
            public List<p0> d() {
                return Collections.unmodifiableList(((f) this.f126038b).d());
            }

            public a dm() {
                El();
                ((f) this.f126038b).Dm();
                return this;
            }

            @Override // com.google.protobuf.e0.g
            public p0 e(int i10) {
                return ((f) this.f126038b).e(i10);
            }

            public a em(int i10) {
                El();
                ((f) this.f126038b).Xm(i10);
                return this;
            }

            @Override // com.google.protobuf.e0.g
            public int f() {
                return ((f) this.f126038b).f();
            }

            public a fm(boolean z10) {
                El();
                ((f) this.f126038b).Ym(z10);
                return this;
            }

            public a gm(boolean z10) {
                El();
                ((f) this.f126038b).Zm(z10);
                return this;
            }

            public a hm(int i10, p0.a aVar) {
                El();
                ((f) this.f126038b).an(i10, aVar.build());
                return this;
            }

            public a im(int i10, p0 p0Var) {
                El();
                ((f) this.f126038b).an(i10, p0Var);
                return this;
            }

            @Override // com.google.protobuf.e0.g
            public boolean j() {
                return ((f) this.f126038b).j();
            }

            @Override // com.google.protobuf.e0.g
            public boolean l() {
                return ((f) this.f126038b).l();
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
        public void Am(p0 p0Var) {
            p0Var.getClass();
            Em();
            this.uninterpretedOption_.add(p0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Bm() {
            this.bitField0_ &= -2;
            this.allowAlias_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Cm() {
            this.bitField0_ &= -3;
            this.deprecated_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Dm() {
            this.uninterpretedOption_ = l1.Ij();
        }

        private void Em() {
            s1.k<p0> kVar = this.uninterpretedOption_;
            if (kVar.s1()) {
                return;
            }
            this.uninterpretedOption_ = l1.yl(kVar);
        }

        public static f Fm() {
            return DEFAULT_INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a Im() {
            return (a) DEFAULT_INSTANCE.jf();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a Jm(f fVar) {
            return (a) DEFAULT_INSTANCE.Uf(fVar);
        }

        public static f Km(InputStream inputStream) throws IOException {
            return (f) l1.El(DEFAULT_INSTANCE, inputStream);
        }

        public static f Lm(InputStream inputStream, v0 v0Var) throws IOException {
            return (f) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static f Mm(com.google.protobuf.u uVar) throws t1 {
            return (f) l1.Gl(DEFAULT_INSTANCE, uVar);
        }

        public static f Nm(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
            return (f) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
        }

        public static f Om(com.google.protobuf.z zVar) throws IOException {
            return (f) l1.Il(DEFAULT_INSTANCE, zVar);
        }

        public static f Pm(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
            return (f) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
        }

        public static f Qm(InputStream inputStream) throws IOException {
            return (f) l1.Kl(DEFAULT_INSTANCE, inputStream);
        }

        public static f Rm(InputStream inputStream, v0 v0Var) throws IOException {
            return (f) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static f Sm(ByteBuffer byteBuffer) throws t1 {
            return (f) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
        }

        public static f Tm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
            return (f) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
        }

        public static f Um(byte[] bArr) throws t1 {
            return (f) l1.Ol(DEFAULT_INSTANCE, bArr);
        }

        public static f Vm(byte[] bArr, v0 v0Var) throws t1 {
            return (f) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
        }

        public static f3<f> Wm() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Xm(int i10) {
            Em();
            this.uninterpretedOption_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Ym(boolean z10) {
            this.bitField0_ |= 1;
            this.allowAlias_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Zm(boolean z10) {
            this.bitField0_ |= 2;
            this.deprecated_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void an(int i10, p0 p0Var) {
            p0Var.getClass();
            Em();
            this.uninterpretedOption_.set(i10, p0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void ym(Iterable<? extends p0> iterable) {
            Em();
            com.google.protobuf.a.y(iterable, this.uninterpretedOption_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zm(int i10, p0 p0Var) {
            p0Var.getClass();
            Em();
            this.uninterpretedOption_.add(i10, p0Var);
        }

        @Override // com.google.protobuf.e0.g
        public boolean E5() {
            return this.allowAlias_;
        }

        public q0 Gm(int i10) {
            return this.uninterpretedOption_.get(i10);
        }

        public List<? extends q0> Hm() {
            return this.uninterpretedOption_;
        }

        @Override // com.google.protobuf.e0.g
        public boolean I6() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.l1
        protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
            f3 cVar;
            a aVar = null;
            switch (a.f125834a[iVar.ordinal()]) {
                case 1:
                    return new f();
                case 2:
                    return new a(aVar);
                case 3:
                    return l1.Al(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0002ϧ\u0003\u0000\u0001\u0001\u0002ဇ\u0000\u0003ဇ\u0001ϧЛ", new Object[]{"bitField0_", "allowAlias_", "deprecated_", "uninterpretedOption_", p0.class});
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.protobuf.e0.g
        public List<p0> d() {
            return this.uninterpretedOption_;
        }

        @Override // com.google.protobuf.e0.g
        public p0 e(int i10) {
            return this.uninterpretedOption_.get(i10);
        }

        @Override // com.google.protobuf.e0.g
        public int f() {
            return this.uninterpretedOption_.size();
        }

        @Override // com.google.protobuf.e0.g
        public boolean j() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.e0.g
        public boolean l() {
            return this.deprecated_;
        }
    }

    public static final class f0 extends l1<f0, a> implements g0 {
        private static final f0 DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int OPTIONS_FIELD_NUMBER = 2;
        private static volatile f3<f0> PARSER;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private String name_ = "";
        private h0 options_;

        public static final class a extends l1.b<f0, a> implements g0 {
            /* synthetic */ a(a aVar) {
                this();
            }

            public a Ol() {
                El();
                ((f0) this.f126038b).gm();
                return this;
            }

            public a Pl() {
                El();
                ((f0) this.f126038b).hm();
                return this;
            }

            public a Ql(h0 h0Var) {
                El();
                ((f0) this.f126038b).jm(h0Var);
                return this;
            }

            public a Rl(String str) {
                El();
                ((f0) this.f126038b).zm(str);
                return this;
            }

            public a Sl(com.google.protobuf.u uVar) {
                El();
                ((f0) this.f126038b).Am(uVar);
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a Tl(h0.a aVar) {
                El();
                ((f0) this.f126038b).Bm((h0) aVar.build());
                return this;
            }

            public a Ul(h0 h0Var) {
                El();
                ((f0) this.f126038b).Bm(h0Var);
                return this;
            }

            @Override // com.google.protobuf.e0.g0
            public com.google.protobuf.u a() {
                return ((f0) this.f126038b).a();
            }

            @Override // com.google.protobuf.e0.g0
            public h0 b() {
                return ((f0) this.f126038b).b();
            }

            @Override // com.google.protobuf.e0.g0
            public boolean g() {
                return ((f0) this.f126038b).g();
            }

            @Override // com.google.protobuf.e0.g0
            public String getName() {
                return ((f0) this.f126038b).getName();
            }

            @Override // com.google.protobuf.e0.g0
            public boolean h() {
                return ((f0) this.f126038b).h();
            }

            private a() {
                super(f0.DEFAULT_INSTANCE);
            }
        }

        static {
            f0 f0Var = new f0();
            DEFAULT_INSTANCE = f0Var;
            l1.Wl(f0.class, f0Var);
        }

        private f0() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Am(com.google.protobuf.u uVar) {
            this.name_ = uVar.z0();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Bm(h0 h0Var) {
            h0Var.getClass();
            this.options_ = h0Var;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void gm() {
            this.bitField0_ &= -2;
            this.name_ = im().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void hm() {
            this.options_ = null;
            this.bitField0_ &= -3;
        }

        public static f0 im() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void jm(h0 h0Var) {
            h0Var.getClass();
            h0 h0Var2 = this.options_;
            if (h0Var2 == null || h0Var2 == h0.zm()) {
                this.options_ = h0Var;
            } else {
                this.options_ = ((h0.a) h0.Dm(this.options_).Jl(h0Var)).B1();
            }
            this.bitField0_ |= 2;
        }

        public static a km() {
            return DEFAULT_INSTANCE.jf();
        }

        public static a lm(f0 f0Var) {
            return DEFAULT_INSTANCE.Uf(f0Var);
        }

        public static f0 mm(InputStream inputStream) throws IOException {
            return (f0) l1.El(DEFAULT_INSTANCE, inputStream);
        }

        public static f0 nm(InputStream inputStream, v0 v0Var) throws IOException {
            return (f0) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static f0 om(com.google.protobuf.u uVar) throws t1 {
            return (f0) l1.Gl(DEFAULT_INSTANCE, uVar);
        }

        public static f0 pm(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
            return (f0) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
        }

        public static f0 qm(com.google.protobuf.z zVar) throws IOException {
            return (f0) l1.Il(DEFAULT_INSTANCE, zVar);
        }

        public static f0 rm(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
            return (f0) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
        }

        public static f0 sm(InputStream inputStream) throws IOException {
            return (f0) l1.Kl(DEFAULT_INSTANCE, inputStream);
        }

        public static f0 tm(InputStream inputStream, v0 v0Var) throws IOException {
            return (f0) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static f0 um(ByteBuffer byteBuffer) throws t1 {
            return (f0) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
        }

        public static f0 vm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
            return (f0) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
        }

        public static f0 wm(byte[] bArr) throws t1 {
            return (f0) l1.Ol(DEFAULT_INSTANCE, bArr);
        }

        public static f0 xm(byte[] bArr, v0 v0Var) throws t1 {
            return (f0) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
        }

        public static f3<f0> ym() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zm(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.name_ = str;
        }

        @Override // com.google.protobuf.l1
        protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
            f3 cVar;
            a aVar = null;
            switch (a.f125834a[iVar.ordinal()]) {
                case 1:
                    return new f0();
                case 2:
                    return new a(aVar);
                case 3:
                    return l1.Al(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001", new Object[]{"bitField0_", "name_", "options_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f3<f0> f3Var = PARSER;
                    if (f3Var != null) {
                        return f3Var;
                    }
                    synchronized (f0.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.protobuf.e0.g0
        public com.google.protobuf.u a() {
            return com.google.protobuf.u.C(this.name_);
        }

        @Override // com.google.protobuf.e0.g0
        public h0 b() {
            h0 h0VarZm = this.options_;
            if (h0VarZm == null) {
                h0VarZm = h0.zm();
            }
            return h0VarZm;
        }

        @Override // com.google.protobuf.e0.g0
        public boolean g() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.e0.g0
        public String getName() {
            return this.name_;
        }

        @Override // com.google.protobuf.e0.g0
        public boolean h() {
            return (this.bitField0_ & 1) != 0;
        }
    }

    public interface g extends l1.f<f, f.a> {
        boolean E5();

        boolean I6();

        List<p0> d();

        p0 e(int i10);

        int f();

        boolean j();

        boolean l();
    }

    public interface g0 extends o2 {
        com.google.protobuf.u a();

        h0 b();

        boolean g();

        String getName();

        boolean h();
    }

    public static final class h extends l1<h, a> implements i {
        private static final h DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int NUMBER_FIELD_NUMBER = 2;
        public static final int OPTIONS_FIELD_NUMBER = 3;
        private static volatile f3<h> PARSER;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private String name_ = "";
        private int number_;
        private j options_;

        public static final class a extends l1.b<h, a> implements i {
            /* synthetic */ a(a aVar) {
                this();
            }

            public a Ol() {
                El();
                ((h) this.f126038b).im();
                return this;
            }

            public a Pl() {
                El();
                ((h) this.f126038b).jm();
                return this;
            }

            public a Ql() {
                El();
                ((h) this.f126038b).km();
                return this;
            }

            public a Rl(j jVar) {
                El();
                ((h) this.f126038b).mm(jVar);
                return this;
            }

            public a Sl(String str) {
                El();
                ((h) this.f126038b).Cm(str);
                return this;
            }

            public a Tl(com.google.protobuf.u uVar) {
                El();
                ((h) this.f126038b).Dm(uVar);
                return this;
            }

            public a Ul(int i10) {
                El();
                ((h) this.f126038b).Em(i10);
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a Vl(j.a aVar) {
                El();
                ((h) this.f126038b).Fm((j) aVar.build());
                return this;
            }

            @Override // com.google.protobuf.e0.i
            public boolean W() {
                return ((h) this.f126038b).W();
            }

            public a Wl(j jVar) {
                El();
                ((h) this.f126038b).Fm(jVar);
                return this;
            }

            @Override // com.google.protobuf.e0.i
            public com.google.protobuf.u a() {
                return ((h) this.f126038b).a();
            }

            @Override // com.google.protobuf.e0.i
            public j b() {
                return ((h) this.f126038b).b();
            }

            @Override // com.google.protobuf.e0.i
            public boolean g() {
                return ((h) this.f126038b).g();
            }

            @Override // com.google.protobuf.e0.i
            public String getName() {
                return ((h) this.f126038b).getName();
            }

            @Override // com.google.protobuf.e0.i
            public boolean h() {
                return ((h) this.f126038b).h();
            }

            @Override // com.google.protobuf.e0.i
            public int i() {
                return ((h) this.f126038b).i();
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

        public static h Am(byte[] bArr, v0 v0Var) throws t1 {
            return (h) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
        }

        public static f3<h> Bm() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Cm(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Dm(com.google.protobuf.u uVar) {
            this.name_ = uVar.z0();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Em(int i10) {
            this.bitField0_ |= 2;
            this.number_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Fm(j jVar) {
            jVar.getClass();
            this.options_ = jVar;
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void im() {
            this.bitField0_ &= -2;
            this.name_ = lm().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void jm() {
            this.bitField0_ &= -3;
            this.number_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void km() {
            this.options_ = null;
            this.bitField0_ &= -5;
        }

        public static h lm() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void mm(j jVar) {
            jVar.getClass();
            j jVar2 = this.options_;
            if (jVar2 == null || jVar2 == j.Cm()) {
                this.options_ = jVar;
            } else {
                this.options_ = ((j.a) j.Gm(this.options_).Jl(jVar)).B1();
            }
            this.bitField0_ |= 4;
        }

        public static a nm() {
            return DEFAULT_INSTANCE.jf();
        }

        public static a om(h hVar) {
            return DEFAULT_INSTANCE.Uf(hVar);
        }

        public static h pm(InputStream inputStream) throws IOException {
            return (h) l1.El(DEFAULT_INSTANCE, inputStream);
        }

        public static h qm(InputStream inputStream, v0 v0Var) throws IOException {
            return (h) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static h rm(com.google.protobuf.u uVar) throws t1 {
            return (h) l1.Gl(DEFAULT_INSTANCE, uVar);
        }

        public static h sm(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
            return (h) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
        }

        public static h tm(com.google.protobuf.z zVar) throws IOException {
            return (h) l1.Il(DEFAULT_INSTANCE, zVar);
        }

        public static h um(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
            return (h) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
        }

        public static h vm(InputStream inputStream) throws IOException {
            return (h) l1.Kl(DEFAULT_INSTANCE, inputStream);
        }

        public static h wm(InputStream inputStream, v0 v0Var) throws IOException {
            return (h) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static h xm(ByteBuffer byteBuffer) throws t1 {
            return (h) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
        }

        public static h ym(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
            return (h) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
        }

        public static h zm(byte[] bArr) throws t1 {
            return (h) l1.Ol(DEFAULT_INSTANCE, bArr);
        }

        @Override // com.google.protobuf.l1
        protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
            f3 cVar;
            a aVar = null;
            switch (a.f125834a[iVar.ordinal()]) {
                case 1:
                    return new h();
                case 2:
                    return new a(aVar);
                case 3:
                    return l1.Al(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002င\u0001\u0003ᐉ\u0002", new Object[]{"bitField0_", "name_", "number_", "options_"});
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.protobuf.e0.i
        public boolean W() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.e0.i
        public com.google.protobuf.u a() {
            return com.google.protobuf.u.C(this.name_);
        }

        @Override // com.google.protobuf.e0.i
        public j b() {
            j jVar = this.options_;
            return jVar == null ? j.Cm() : jVar;
        }

        @Override // com.google.protobuf.e0.i
        public boolean g() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.e0.i
        public String getName() {
            return this.name_;
        }

        @Override // com.google.protobuf.e0.i
        public boolean h() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.e0.i
        public int i() {
            return this.number_;
        }
    }

    public static final class h0 extends l1.e<h0, a> implements i0 {
        private static final h0 DEFAULT_INSTANCE;
        private static volatile f3<h0> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private byte memoizedIsInitialized = 2;
        private s1.k<p0> uninterpretedOption_ = l1.Ij();

        public static final class a extends l1.d<h0, a> implements i0 {
            /* synthetic */ a(a aVar) {
                this();
            }

            public a Wl(Iterable<? extends p0> iterable) {
                El();
                ((h0) this.f126038b).um(iterable);
                return this;
            }

            public a Xl(int i10, p0.a aVar) {
                El();
                ((h0) this.f126038b).vm(i10, aVar.build());
                return this;
            }

            public a Yl(int i10, p0 p0Var) {
                El();
                ((h0) this.f126038b).vm(i10, p0Var);
                return this;
            }

            public a Zl(p0.a aVar) {
                El();
                ((h0) this.f126038b).wm(aVar.build());
                return this;
            }

            public a am(p0 p0Var) {
                El();
                ((h0) this.f126038b).wm(p0Var);
                return this;
            }

            public a bm() {
                El();
                ((h0) this.f126038b).xm();
                return this;
            }

            public a cm(int i10) {
                El();
                ((h0) this.f126038b).Rm(i10);
                return this;
            }

            @Override // com.google.protobuf.e0.i0
            public List<p0> d() {
                return Collections.unmodifiableList(((h0) this.f126038b).d());
            }

            public a dm(int i10, p0.a aVar) {
                El();
                ((h0) this.f126038b).Sm(i10, aVar.build());
                return this;
            }

            @Override // com.google.protobuf.e0.i0
            public p0 e(int i10) {
                return ((h0) this.f126038b).e(i10);
            }

            public a em(int i10, p0 p0Var) {
                El();
                ((h0) this.f126038b).Sm(i10, p0Var);
                return this;
            }

            @Override // com.google.protobuf.e0.i0
            public int f() {
                return ((h0) this.f126038b).f();
            }

            private a() {
                super(h0.DEFAULT_INSTANCE);
            }
        }

        static {
            h0 h0Var = new h0();
            DEFAULT_INSTANCE = h0Var;
            l1.Wl(h0.class, h0Var);
        }

        private h0() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a Cm() {
            return (a) DEFAULT_INSTANCE.jf();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a Dm(h0 h0Var) {
            return (a) DEFAULT_INSTANCE.Uf(h0Var);
        }

        public static h0 Em(InputStream inputStream) throws IOException {
            return (h0) l1.El(DEFAULT_INSTANCE, inputStream);
        }

        public static h0 Fm(InputStream inputStream, v0 v0Var) throws IOException {
            return (h0) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static h0 Gm(com.google.protobuf.u uVar) throws t1 {
            return (h0) l1.Gl(DEFAULT_INSTANCE, uVar);
        }

        public static h0 Hm(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
            return (h0) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
        }

        public static h0 Im(com.google.protobuf.z zVar) throws IOException {
            return (h0) l1.Il(DEFAULT_INSTANCE, zVar);
        }

        public static h0 Jm(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
            return (h0) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
        }

        public static h0 Km(InputStream inputStream) throws IOException {
            return (h0) l1.Kl(DEFAULT_INSTANCE, inputStream);
        }

        public static h0 Lm(InputStream inputStream, v0 v0Var) throws IOException {
            return (h0) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static h0 Mm(ByteBuffer byteBuffer) throws t1 {
            return (h0) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
        }

        public static h0 Nm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
            return (h0) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
        }

        public static h0 Om(byte[] bArr) throws t1 {
            return (h0) l1.Ol(DEFAULT_INSTANCE, bArr);
        }

        public static h0 Pm(byte[] bArr, v0 v0Var) throws t1 {
            return (h0) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
        }

        public static f3<h0> Qm() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Rm(int i10) {
            ym();
            this.uninterpretedOption_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Sm(int i10, p0 p0Var) {
            p0Var.getClass();
            ym();
            this.uninterpretedOption_.set(i10, p0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void um(Iterable<? extends p0> iterable) {
            ym();
            com.google.protobuf.a.y(iterable, this.uninterpretedOption_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void vm(int i10, p0 p0Var) {
            p0Var.getClass();
            ym();
            this.uninterpretedOption_.add(i10, p0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void wm(p0 p0Var) {
            p0Var.getClass();
            ym();
            this.uninterpretedOption_.add(p0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void xm() {
            this.uninterpretedOption_ = l1.Ij();
        }

        private void ym() {
            s1.k<p0> kVar = this.uninterpretedOption_;
            if (kVar.s1()) {
                return;
            }
            this.uninterpretedOption_ = l1.yl(kVar);
        }

        public static h0 zm() {
            return DEFAULT_INSTANCE;
        }

        public q0 Am(int i10) {
            return this.uninterpretedOption_.get(i10);
        }

        public List<? extends q0> Bm() {
            return this.uninterpretedOption_;
        }

        @Override // com.google.protobuf.l1
        protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
            f3 cVar;
            a aVar = null;
            switch (a.f125834a[iVar.ordinal()]) {
                case 1:
                    return new h0();
                case 2:
                    return new a(aVar);
                case 3:
                    return l1.Al(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000ϧϧ\u0001\u0000\u0001\u0001ϧЛ", new Object[]{"uninterpretedOption_", p0.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f3<h0> f3Var = PARSER;
                    if (f3Var != null) {
                        return f3Var;
                    }
                    synchronized (h0.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.protobuf.e0.i0
        public List<p0> d() {
            return this.uninterpretedOption_;
        }

        @Override // com.google.protobuf.e0.i0
        public p0 e(int i10) {
            return this.uninterpretedOption_.get(i10);
        }

        @Override // com.google.protobuf.e0.i0
        public int f() {
            return this.uninterpretedOption_.size();
        }
    }

    public interface i extends o2 {
        boolean W();

        com.google.protobuf.u a();

        j b();

        boolean g();

        String getName();

        boolean h();

        int i();
    }

    public interface i0 extends l1.f<h0, h0.a> {
        List<p0> d();

        p0 e(int i10);

        int f();
    }

    public static final class j extends l1.e<j, a> implements k {
        private static final j DEFAULT_INSTANCE;
        public static final int DEPRECATED_FIELD_NUMBER = 1;
        private static volatile f3<j> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private int bitField0_;
        private boolean deprecated_;
        private byte memoizedIsInitialized = 2;
        private s1.k<p0> uninterpretedOption_ = l1.Ij();

        public static final class a extends l1.d<j, a> implements k {
            /* synthetic */ a(a aVar) {
                this();
            }

            public a Wl(Iterable<? extends p0> iterable) {
                El();
                ((j) this.f126038b).wm(iterable);
                return this;
            }

            public a Xl(int i10, p0.a aVar) {
                El();
                ((j) this.f126038b).xm(i10, aVar.build());
                return this;
            }

            public a Yl(int i10, p0 p0Var) {
                El();
                ((j) this.f126038b).xm(i10, p0Var);
                return this;
            }

            public a Zl(p0.a aVar) {
                El();
                ((j) this.f126038b).ym(aVar.build());
                return this;
            }

            public a am(p0 p0Var) {
                El();
                ((j) this.f126038b).ym(p0Var);
                return this;
            }

            public a bm() {
                El();
                ((j) this.f126038b).zm();
                return this;
            }

            public a cm() {
                El();
                ((j) this.f126038b).Am();
                return this;
            }

            @Override // com.google.protobuf.e0.k
            public List<p0> d() {
                return Collections.unmodifiableList(((j) this.f126038b).d());
            }

            public a dm(int i10) {
                El();
                ((j) this.f126038b).Um(i10);
                return this;
            }

            @Override // com.google.protobuf.e0.k
            public p0 e(int i10) {
                return ((j) this.f126038b).e(i10);
            }

            public a em(boolean z10) {
                El();
                ((j) this.f126038b).Vm(z10);
                return this;
            }

            @Override // com.google.protobuf.e0.k
            public int f() {
                return ((j) this.f126038b).f();
            }

            public a fm(int i10, p0.a aVar) {
                El();
                ((j) this.f126038b).Wm(i10, aVar.build());
                return this;
            }

            public a gm(int i10, p0 p0Var) {
                El();
                ((j) this.f126038b).Wm(i10, p0Var);
                return this;
            }

            @Override // com.google.protobuf.e0.k
            public boolean j() {
                return ((j) this.f126038b).j();
            }

            @Override // com.google.protobuf.e0.k
            public boolean l() {
                return ((j) this.f126038b).l();
            }

            private a() {
                super(j.DEFAULT_INSTANCE);
            }
        }

        static {
            j jVar = new j();
            DEFAULT_INSTANCE = jVar;
            l1.Wl(j.class, jVar);
        }

        private j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Am() {
            this.uninterpretedOption_ = l1.Ij();
        }

        private void Bm() {
            s1.k<p0> kVar = this.uninterpretedOption_;
            if (!kVar.s1()) {
                this.uninterpretedOption_ = l1.yl(kVar);
            }
        }

        public static j Cm() {
            return DEFAULT_INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a Fm() {
            return (a) DEFAULT_INSTANCE.jf();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a Gm(j jVar) {
            return (a) DEFAULT_INSTANCE.Uf(jVar);
        }

        public static j Hm(InputStream inputStream) throws IOException {
            return (j) l1.El(DEFAULT_INSTANCE, inputStream);
        }

        public static j Im(InputStream inputStream, v0 v0Var) throws IOException {
            return (j) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static j Jm(com.google.protobuf.u uVar) throws t1 {
            return (j) l1.Gl(DEFAULT_INSTANCE, uVar);
        }

        public static j Km(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
            return (j) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
        }

        public static j Lm(com.google.protobuf.z zVar) throws IOException {
            return (j) l1.Il(DEFAULT_INSTANCE, zVar);
        }

        public static j Mm(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
            return (j) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
        }

        public static j Nm(InputStream inputStream) throws IOException {
            return (j) l1.Kl(DEFAULT_INSTANCE, inputStream);
        }

        public static j Om(InputStream inputStream, v0 v0Var) throws IOException {
            return (j) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static j Pm(ByteBuffer byteBuffer) throws t1 {
            return (j) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
        }

        public static j Qm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
            return (j) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
        }

        public static j Rm(byte[] bArr) throws t1 {
            return (j) l1.Ol(DEFAULT_INSTANCE, bArr);
        }

        public static j Sm(byte[] bArr, v0 v0Var) throws t1 {
            return (j) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
        }

        public static f3<j> Tm() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Um(int i10) {
            Bm();
            this.uninterpretedOption_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Vm(boolean z10) {
            this.bitField0_ |= 1;
            this.deprecated_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Wm(int i10, p0 p0Var) {
            p0Var.getClass();
            Bm();
            this.uninterpretedOption_.set(i10, p0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void wm(Iterable<? extends p0> iterable) {
            Bm();
            com.google.protobuf.a.y(iterable, this.uninterpretedOption_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void xm(int i10, p0 p0Var) {
            p0Var.getClass();
            Bm();
            this.uninterpretedOption_.add(i10, p0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void ym(p0 p0Var) {
            p0Var.getClass();
            Bm();
            this.uninterpretedOption_.add(p0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zm() {
            this.bitField0_ &= -2;
            this.deprecated_ = false;
        }

        public q0 Dm(int i10) {
            return this.uninterpretedOption_.get(i10);
        }

        public List<? extends q0> Em() {
            return this.uninterpretedOption_;
        }

        @Override // com.google.protobuf.l1
        protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
            f3 cVar;
            a aVar = null;
            switch (a.f125834a[iVar.ordinal()]) {
                case 1:
                    return new j();
                case 2:
                    return new a(aVar);
                case 3:
                    return l1.Al(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001ϧ\u0002\u0000\u0001\u0001\u0001ဇ\u0000ϧЛ", new Object[]{"bitField0_", "deprecated_", "uninterpretedOption_", p0.class});
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.protobuf.e0.k
        public List<p0> d() {
            return this.uninterpretedOption_;
        }

        @Override // com.google.protobuf.e0.k
        public p0 e(int i10) {
            return this.uninterpretedOption_.get(i10);
        }

        @Override // com.google.protobuf.e0.k
        public int f() {
            return this.uninterpretedOption_.size();
        }

        @Override // com.google.protobuf.e0.k
        public boolean j() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.e0.k
        public boolean l() {
            return this.deprecated_;
        }
    }

    public static final class j0 extends l1<j0, a> implements k0 {
        private static final j0 DEFAULT_INSTANCE;
        public static final int METHOD_FIELD_NUMBER = 2;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int OPTIONS_FIELD_NUMBER = 3;
        private static volatile f3<j0> PARSER;
        private int bitField0_;
        private l0 options_;
        private byte memoizedIsInitialized = 2;
        private String name_ = "";
        private s1.k<b0> method_ = l1.Ij();

        public static final class a extends l1.b<j0, a> implements k0 {
            /* synthetic */ a(a aVar) {
                this();
            }

            @Override // com.google.protobuf.e0.k0
            public b0 M7(int i10) {
                return ((j0) this.f126038b).M7(i10);
            }

            public a Ol(Iterable<? extends b0> iterable) {
                El();
                ((j0) this.f126038b).mm(iterable);
                return this;
            }

            public a Pl(int i10, b0.a aVar) {
                El();
                ((j0) this.f126038b).nm(i10, aVar.build());
                return this;
            }

            public a Ql(int i10, b0 b0Var) {
                El();
                ((j0) this.f126038b).nm(i10, b0Var);
                return this;
            }

            public a Rl(b0.a aVar) {
                El();
                ((j0) this.f126038b).om(aVar.build());
                return this;
            }

            public a Sl(b0 b0Var) {
                El();
                ((j0) this.f126038b).om(b0Var);
                return this;
            }

            public a Tl() {
                El();
                ((j0) this.f126038b).pm();
                return this;
            }

            public a Ul() {
                El();
                ((j0) this.f126038b).qm();
                return this;
            }

            public a Vl() {
                El();
                ((j0) this.f126038b).rm();
                return this;
            }

            public a Wl(l0 l0Var) {
                El();
                ((j0) this.f126038b).wm(l0Var);
                return this;
            }

            public a Xl(int i10) {
                El();
                ((j0) this.f126038b).Mm(i10);
                return this;
            }

            public a Yl(int i10, b0.a aVar) {
                El();
                ((j0) this.f126038b).Nm(i10, aVar.build());
                return this;
            }

            public a Zl(int i10, b0 b0Var) {
                El();
                ((j0) this.f126038b).Nm(i10, b0Var);
                return this;
            }

            @Override // com.google.protobuf.e0.k0
            public com.google.protobuf.u a() {
                return ((j0) this.f126038b).a();
            }

            public a am(String str) {
                El();
                ((j0) this.f126038b).Om(str);
                return this;
            }

            @Override // com.google.protobuf.e0.k0
            public l0 b() {
                return ((j0) this.f126038b).b();
            }

            public a bm(com.google.protobuf.u uVar) {
                El();
                ((j0) this.f126038b).Pm(uVar);
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a cm(l0.a aVar) {
                El();
                ((j0) this.f126038b).Qm((l0) aVar.build());
                return this;
            }

            public a dm(l0 l0Var) {
                El();
                ((j0) this.f126038b).Qm(l0Var);
                return this;
            }

            @Override // com.google.protobuf.e0.k0
            public boolean g() {
                return ((j0) this.f126038b).g();
            }

            @Override // com.google.protobuf.e0.k0
            public String getName() {
                return ((j0) this.f126038b).getName();
            }

            @Override // com.google.protobuf.e0.k0
            public boolean h() {
                return ((j0) this.f126038b).h();
            }

            @Override // com.google.protobuf.e0.k0
            public int p7() {
                return ((j0) this.f126038b).p7();
            }

            @Override // com.google.protobuf.e0.k0
            public List<b0> z4() {
                return Collections.unmodifiableList(((j0) this.f126038b).z4());
            }

            private a() {
                super(j0.DEFAULT_INSTANCE);
            }
        }

        static {
            j0 j0Var = new j0();
            DEFAULT_INSTANCE = j0Var;
            l1.Wl(j0.class, j0Var);
        }

        private j0() {
        }

        public static j0 Am(InputStream inputStream, v0 v0Var) throws IOException {
            return (j0) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static j0 Bm(com.google.protobuf.u uVar) throws t1 {
            return (j0) l1.Gl(DEFAULT_INSTANCE, uVar);
        }

        public static j0 Cm(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
            return (j0) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
        }

        public static j0 Dm(com.google.protobuf.z zVar) throws IOException {
            return (j0) l1.Il(DEFAULT_INSTANCE, zVar);
        }

        public static j0 Em(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
            return (j0) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
        }

        public static j0 Fm(InputStream inputStream) throws IOException {
            return (j0) l1.Kl(DEFAULT_INSTANCE, inputStream);
        }

        public static j0 Gm(InputStream inputStream, v0 v0Var) throws IOException {
            return (j0) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static j0 Hm(ByteBuffer byteBuffer) throws t1 {
            return (j0) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
        }

        public static j0 Im(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
            return (j0) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
        }

        public static j0 Jm(byte[] bArr) throws t1 {
            return (j0) l1.Ol(DEFAULT_INSTANCE, bArr);
        }

        public static j0 Km(byte[] bArr, v0 v0Var) throws t1 {
            return (j0) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
        }

        public static f3<j0> Lm() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Mm(int i10) {
            sm();
            this.method_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Nm(int i10, b0 b0Var) {
            b0Var.getClass();
            sm();
            this.method_.set(i10, b0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Om(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Pm(com.google.protobuf.u uVar) {
            this.name_ = uVar.z0();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Qm(l0 l0Var) {
            l0Var.getClass();
            this.options_ = l0Var;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mm(Iterable<? extends b0> iterable) {
            sm();
            com.google.protobuf.a.y(iterable, this.method_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void nm(int i10, b0 b0Var) {
            b0Var.getClass();
            sm();
            this.method_.add(i10, b0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void om(b0 b0Var) {
            b0Var.getClass();
            sm();
            this.method_.add(b0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void pm() {
            this.method_ = l1.Ij();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void qm() {
            this.bitField0_ &= -2;
            this.name_ = tm().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void rm() {
            this.options_ = null;
            this.bitField0_ &= -3;
        }

        private void sm() {
            s1.k<b0> kVar = this.method_;
            if (kVar.s1()) {
                return;
            }
            this.method_ = l1.yl(kVar);
        }

        public static j0 tm() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void wm(l0 l0Var) {
            l0Var.getClass();
            l0 l0Var2 = this.options_;
            if (l0Var2 == null || l0Var2 == l0.Cm()) {
                this.options_ = l0Var;
            } else {
                this.options_ = ((l0.a) l0.Gm(this.options_).Jl(l0Var)).B1();
            }
            this.bitField0_ |= 2;
        }

        public static a xm() {
            return DEFAULT_INSTANCE.jf();
        }

        public static a ym(j0 j0Var) {
            return DEFAULT_INSTANCE.Uf(j0Var);
        }

        public static j0 zm(InputStream inputStream) throws IOException {
            return (j0) l1.El(DEFAULT_INSTANCE, inputStream);
        }

        @Override // com.google.protobuf.e0.k0
        public b0 M7(int i10) {
            return this.method_.get(i10);
        }

        @Override // com.google.protobuf.l1
        protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
            f3 cVar;
            a aVar = null;
            switch (a.f125834a[iVar.ordinal()]) {
                case 1:
                    return new j0();
                case 2:
                    return new a(aVar);
                case 3:
                    return l1.Al(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001ဈ\u0000\u0002Л\u0003ᐉ\u0001", new Object[]{"bitField0_", "name_", "method_", b0.class, "options_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f3<j0> f3Var = PARSER;
                    if (f3Var != null) {
                        return f3Var;
                    }
                    synchronized (j0.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.protobuf.e0.k0
        public com.google.protobuf.u a() {
            return com.google.protobuf.u.C(this.name_);
        }

        @Override // com.google.protobuf.e0.k0
        public l0 b() {
            l0 l0VarCm = this.options_;
            if (l0VarCm == null) {
                l0VarCm = l0.Cm();
            }
            return l0VarCm;
        }

        @Override // com.google.protobuf.e0.k0
        public boolean g() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.e0.k0
        public String getName() {
            return this.name_;
        }

        @Override // com.google.protobuf.e0.k0
        public boolean h() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.e0.k0
        public int p7() {
            return this.method_.size();
        }

        public c0 um(int i10) {
            return this.method_.get(i10);
        }

        public List<? extends c0> vm() {
            return this.method_;
        }

        @Override // com.google.protobuf.e0.k0
        public List<b0> z4() {
            return this.method_;
        }
    }

    public interface k extends l1.f<j, j.a> {
        List<p0> d();

        p0 e(int i10);

        int f();

        boolean j();

        boolean l();
    }

    public interface k0 extends o2 {
        b0 M7(int i10);

        com.google.protobuf.u a();

        l0 b();

        boolean g();

        String getName();

        boolean h();

        int p7();

        List<b0> z4();
    }

    public static final class l extends l1.e<l, a> implements m {
        private static final l DEFAULT_INSTANCE;
        private static volatile f3<l> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private byte memoizedIsInitialized = 2;
        private s1.k<p0> uninterpretedOption_ = l1.Ij();

        public static final class a extends l1.d<l, a> implements m {
            /* synthetic */ a(a aVar) {
                this();
            }

            public a Wl(Iterable<? extends p0> iterable) {
                El();
                ((l) this.f126038b).um(iterable);
                return this;
            }

            public a Xl(int i10, p0.a aVar) {
                El();
                ((l) this.f126038b).vm(i10, aVar.build());
                return this;
            }

            public a Yl(int i10, p0 p0Var) {
                El();
                ((l) this.f126038b).vm(i10, p0Var);
                return this;
            }

            public a Zl(p0.a aVar) {
                El();
                ((l) this.f126038b).wm(aVar.build());
                return this;
            }

            public a am(p0 p0Var) {
                El();
                ((l) this.f126038b).wm(p0Var);
                return this;
            }

            public a bm() {
                El();
                ((l) this.f126038b).xm();
                return this;
            }

            public a cm(int i10) {
                El();
                ((l) this.f126038b).Rm(i10);
                return this;
            }

            @Override // com.google.protobuf.e0.m
            public List<p0> d() {
                return Collections.unmodifiableList(((l) this.f126038b).d());
            }

            public a dm(int i10, p0.a aVar) {
                El();
                ((l) this.f126038b).Sm(i10, aVar.build());
                return this;
            }

            @Override // com.google.protobuf.e0.m
            public p0 e(int i10) {
                return ((l) this.f126038b).e(i10);
            }

            public a em(int i10, p0 p0Var) {
                El();
                ((l) this.f126038b).Sm(i10, p0Var);
                return this;
            }

            @Override // com.google.protobuf.e0.m
            public int f() {
                return ((l) this.f126038b).f();
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

        /* JADX WARN: Multi-variable type inference failed */
        public static a Cm() {
            return (a) DEFAULT_INSTANCE.jf();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a Dm(l lVar) {
            return (a) DEFAULT_INSTANCE.Uf(lVar);
        }

        public static l Em(InputStream inputStream) throws IOException {
            return (l) l1.El(DEFAULT_INSTANCE, inputStream);
        }

        public static l Fm(InputStream inputStream, v0 v0Var) throws IOException {
            return (l) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static l Gm(com.google.protobuf.u uVar) throws t1 {
            return (l) l1.Gl(DEFAULT_INSTANCE, uVar);
        }

        public static l Hm(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
            return (l) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
        }

        public static l Im(com.google.protobuf.z zVar) throws IOException {
            return (l) l1.Il(DEFAULT_INSTANCE, zVar);
        }

        public static l Jm(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
            return (l) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
        }

        public static l Km(InputStream inputStream) throws IOException {
            return (l) l1.Kl(DEFAULT_INSTANCE, inputStream);
        }

        public static l Lm(InputStream inputStream, v0 v0Var) throws IOException {
            return (l) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static l Mm(ByteBuffer byteBuffer) throws t1 {
            return (l) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
        }

        public static l Nm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
            return (l) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
        }

        public static l Om(byte[] bArr) throws t1 {
            return (l) l1.Ol(DEFAULT_INSTANCE, bArr);
        }

        public static l Pm(byte[] bArr, v0 v0Var) throws t1 {
            return (l) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
        }

        public static f3<l> Qm() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Rm(int i10) {
            ym();
            this.uninterpretedOption_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Sm(int i10, p0 p0Var) {
            p0Var.getClass();
            ym();
            this.uninterpretedOption_.set(i10, p0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void um(Iterable<? extends p0> iterable) {
            ym();
            com.google.protobuf.a.y(iterable, this.uninterpretedOption_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void vm(int i10, p0 p0Var) {
            p0Var.getClass();
            ym();
            this.uninterpretedOption_.add(i10, p0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void wm(p0 p0Var) {
            p0Var.getClass();
            ym();
            this.uninterpretedOption_.add(p0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void xm() {
            this.uninterpretedOption_ = l1.Ij();
        }

        private void ym() {
            s1.k<p0> kVar = this.uninterpretedOption_;
            if (!kVar.s1()) {
                this.uninterpretedOption_ = l1.yl(kVar);
            }
        }

        public static l zm() {
            return DEFAULT_INSTANCE;
        }

        public q0 Am(int i10) {
            return this.uninterpretedOption_.get(i10);
        }

        public List<? extends q0> Bm() {
            return this.uninterpretedOption_;
        }

        @Override // com.google.protobuf.l1
        protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
            f3 cVar;
            a aVar = null;
            switch (a.f125834a[iVar.ordinal()]) {
                case 1:
                    return new l();
                case 2:
                    return new a(aVar);
                case 3:
                    return l1.Al(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000ϧϧ\u0001\u0000\u0001\u0001ϧЛ", new Object[]{"uninterpretedOption_", p0.class});
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.protobuf.e0.m
        public List<p0> d() {
            return this.uninterpretedOption_;
        }

        @Override // com.google.protobuf.e0.m
        public p0 e(int i10) {
            return this.uninterpretedOption_.get(i10);
        }

        @Override // com.google.protobuf.e0.m
        public int f() {
            return this.uninterpretedOption_.size();
        }
    }

    public static final class l0 extends l1.e<l0, a> implements m0 {
        private static final l0 DEFAULT_INSTANCE;
        public static final int DEPRECATED_FIELD_NUMBER = 33;
        private static volatile f3<l0> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private int bitField0_;
        private boolean deprecated_;
        private byte memoizedIsInitialized = 2;
        private s1.k<p0> uninterpretedOption_ = l1.Ij();

        public static final class a extends l1.d<l0, a> implements m0 {
            /* synthetic */ a(a aVar) {
                this();
            }

            public a Wl(Iterable<? extends p0> iterable) {
                El();
                ((l0) this.f126038b).wm(iterable);
                return this;
            }

            public a Xl(int i10, p0.a aVar) {
                El();
                ((l0) this.f126038b).xm(i10, aVar.build());
                return this;
            }

            public a Yl(int i10, p0 p0Var) {
                El();
                ((l0) this.f126038b).xm(i10, p0Var);
                return this;
            }

            public a Zl(p0.a aVar) {
                El();
                ((l0) this.f126038b).ym(aVar.build());
                return this;
            }

            public a am(p0 p0Var) {
                El();
                ((l0) this.f126038b).ym(p0Var);
                return this;
            }

            public a bm() {
                El();
                ((l0) this.f126038b).zm();
                return this;
            }

            public a cm() {
                El();
                ((l0) this.f126038b).Am();
                return this;
            }

            @Override // com.google.protobuf.e0.m0
            public List<p0> d() {
                return Collections.unmodifiableList(((l0) this.f126038b).d());
            }

            public a dm(int i10) {
                El();
                ((l0) this.f126038b).Um(i10);
                return this;
            }

            @Override // com.google.protobuf.e0.m0
            public p0 e(int i10) {
                return ((l0) this.f126038b).e(i10);
            }

            public a em(boolean z10) {
                El();
                ((l0) this.f126038b).Vm(z10);
                return this;
            }

            @Override // com.google.protobuf.e0.m0
            public int f() {
                return ((l0) this.f126038b).f();
            }

            public a fm(int i10, p0.a aVar) {
                El();
                ((l0) this.f126038b).Wm(i10, aVar.build());
                return this;
            }

            public a gm(int i10, p0 p0Var) {
                El();
                ((l0) this.f126038b).Wm(i10, p0Var);
                return this;
            }

            @Override // com.google.protobuf.e0.m0
            public boolean j() {
                return ((l0) this.f126038b).j();
            }

            @Override // com.google.protobuf.e0.m0
            public boolean l() {
                return ((l0) this.f126038b).l();
            }

            private a() {
                super(l0.DEFAULT_INSTANCE);
            }
        }

        static {
            l0 l0Var = new l0();
            DEFAULT_INSTANCE = l0Var;
            l1.Wl(l0.class, l0Var);
        }

        private l0() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Am() {
            this.uninterpretedOption_ = l1.Ij();
        }

        private void Bm() {
            s1.k<p0> kVar = this.uninterpretedOption_;
            if (kVar.s1()) {
                return;
            }
            this.uninterpretedOption_ = l1.yl(kVar);
        }

        public static l0 Cm() {
            return DEFAULT_INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a Fm() {
            return (a) DEFAULT_INSTANCE.jf();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a Gm(l0 l0Var) {
            return (a) DEFAULT_INSTANCE.Uf(l0Var);
        }

        public static l0 Hm(InputStream inputStream) throws IOException {
            return (l0) l1.El(DEFAULT_INSTANCE, inputStream);
        }

        public static l0 Im(InputStream inputStream, v0 v0Var) throws IOException {
            return (l0) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static l0 Jm(com.google.protobuf.u uVar) throws t1 {
            return (l0) l1.Gl(DEFAULT_INSTANCE, uVar);
        }

        public static l0 Km(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
            return (l0) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
        }

        public static l0 Lm(com.google.protobuf.z zVar) throws IOException {
            return (l0) l1.Il(DEFAULT_INSTANCE, zVar);
        }

        public static l0 Mm(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
            return (l0) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
        }

        public static l0 Nm(InputStream inputStream) throws IOException {
            return (l0) l1.Kl(DEFAULT_INSTANCE, inputStream);
        }

        public static l0 Om(InputStream inputStream, v0 v0Var) throws IOException {
            return (l0) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static l0 Pm(ByteBuffer byteBuffer) throws t1 {
            return (l0) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
        }

        public static l0 Qm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
            return (l0) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
        }

        public static l0 Rm(byte[] bArr) throws t1 {
            return (l0) l1.Ol(DEFAULT_INSTANCE, bArr);
        }

        public static l0 Sm(byte[] bArr, v0 v0Var) throws t1 {
            return (l0) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
        }

        public static f3<l0> Tm() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Um(int i10) {
            Bm();
            this.uninterpretedOption_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Vm(boolean z10) {
            this.bitField0_ |= 1;
            this.deprecated_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Wm(int i10, p0 p0Var) {
            p0Var.getClass();
            Bm();
            this.uninterpretedOption_.set(i10, p0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void wm(Iterable<? extends p0> iterable) {
            Bm();
            com.google.protobuf.a.y(iterable, this.uninterpretedOption_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void xm(int i10, p0 p0Var) {
            p0Var.getClass();
            Bm();
            this.uninterpretedOption_.add(i10, p0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void ym(p0 p0Var) {
            p0Var.getClass();
            Bm();
            this.uninterpretedOption_.add(p0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zm() {
            this.bitField0_ &= -2;
            this.deprecated_ = false;
        }

        public q0 Dm(int i10) {
            return this.uninterpretedOption_.get(i10);
        }

        public List<? extends q0> Em() {
            return this.uninterpretedOption_;
        }

        @Override // com.google.protobuf.l1
        protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
            f3 cVar;
            a aVar = null;
            switch (a.f125834a[iVar.ordinal()]) {
                case 1:
                    return new l0();
                case 2:
                    return new a(aVar);
                case 3:
                    return l1.Al(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001!ϧ\u0002\u0000\u0001\u0001!ဇ\u0000ϧЛ", new Object[]{"bitField0_", "deprecated_", "uninterpretedOption_", p0.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f3<l0> f3Var = PARSER;
                    if (f3Var != null) {
                        return f3Var;
                    }
                    synchronized (l0.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.protobuf.e0.m0
        public List<p0> d() {
            return this.uninterpretedOption_;
        }

        @Override // com.google.protobuf.e0.m0
        public p0 e(int i10) {
            return this.uninterpretedOption_.get(i10);
        }

        @Override // com.google.protobuf.e0.m0
        public int f() {
            return this.uninterpretedOption_.size();
        }

        @Override // com.google.protobuf.e0.m0
        public boolean j() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.e0.m0
        public boolean l() {
            return this.deprecated_;
        }
    }

    public interface m extends l1.f<l, l.a> {
        List<p0> d();

        p0 e(int i10);

        int f();
    }

    public interface m0 extends l1.f<l0, l0.a> {
        List<p0> d();

        p0 e(int i10);

        int f();

        boolean j();

        boolean l();
    }

    public static final class n extends l1<n, a> implements o {
        private static final n DEFAULT_INSTANCE;
        public static final int DEFAULT_VALUE_FIELD_NUMBER = 7;
        public static final int EXTENDEE_FIELD_NUMBER = 2;
        public static final int JSON_NAME_FIELD_NUMBER = 10;
        public static final int LABEL_FIELD_NUMBER = 4;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int NUMBER_FIELD_NUMBER = 3;
        public static final int ONEOF_INDEX_FIELD_NUMBER = 9;
        public static final int OPTIONS_FIELD_NUMBER = 8;
        private static volatile f3<n> PARSER = null;
        public static final int PROTO3_OPTIONAL_FIELD_NUMBER = 17;
        public static final int TYPE_FIELD_NUMBER = 5;
        public static final int TYPE_NAME_FIELD_NUMBER = 6;
        private int bitField0_;
        private int number_;
        private int oneofIndex_;
        private p options_;
        private boolean proto3Optional_;
        private byte memoizedIsInitialized = 2;
        private String name_ = "";
        private int label_ = 1;
        private int type_ = 1;
        private String typeName_ = "";
        private String extendee_ = "";
        private String defaultValue_ = "";
        private String jsonName_ = "";

        public static final class a extends l1.b<n, a> implements o {
            /* synthetic */ a(a aVar) {
                this();
            }

            @Override // com.google.protobuf.e0.o
            public boolean H4() {
                return ((n) this.f126038b).H4();
            }

            @Override // com.google.protobuf.e0.o
            public String K() {
                return ((n) this.f126038b).K();
            }

            @Override // com.google.protobuf.e0.o
            public String M0() {
                return ((n) this.f126038b).M0();
            }

            public a Ol() {
                El();
                ((n) this.f126038b).Cm();
                return this;
            }

            @Override // com.google.protobuf.e0.o
            public com.google.protobuf.u P0() {
                return ((n) this.f126038b).P0();
            }

            public a Pl() {
                El();
                ((n) this.f126038b).Dm();
                return this;
            }

            public a Ql() {
                El();
                ((n) this.f126038b).Em();
                return this;
            }

            public a Rl() {
                El();
                ((n) this.f126038b).Fm();
                return this;
            }

            public a Sl() {
                El();
                ((n) this.f126038b).Gm();
                return this;
            }

            @Override // com.google.protobuf.e0.o
            public boolean T5() {
                return ((n) this.f126038b).T5();
            }

            public a Tl() {
                El();
                ((n) this.f126038b).Hm();
                return this;
            }

            public a Ul() {
                El();
                ((n) this.f126038b).Im();
                return this;
            }

            @Override // com.google.protobuf.e0.o
            public com.google.protobuf.u V6() {
                return ((n) this.f126038b).V6();
            }

            public a Vl() {
                El();
                ((n) this.f126038b).Jm();
                return this;
            }

            @Override // com.google.protobuf.e0.o
            public boolean W() {
                return ((n) this.f126038b).W();
            }

            @Override // com.google.protobuf.e0.o
            public boolean W4() {
                return ((n) this.f126038b).W4();
            }

            public a Wl() {
                El();
                ((n) this.f126038b).Km();
                return this;
            }

            public a Xl() {
                El();
                ((n) this.f126038b).Lm();
                return this;
            }

            public a Yl() {
                El();
                ((n) this.f126038b).Mm();
                return this;
            }

            @Override // com.google.protobuf.e0.o
            public boolean Z6() {
                return ((n) this.f126038b).Z6();
            }

            public a Zl(p pVar) {
                El();
                ((n) this.f126038b).Om(pVar);
                return this;
            }

            @Override // com.google.protobuf.e0.o
            public com.google.protobuf.u a() {
                return ((n) this.f126038b).a();
            }

            public a am(String str) {
                El();
                ((n) this.f126038b).en(str);
                return this;
            }

            @Override // com.google.protobuf.e0.o
            public p b() {
                return ((n) this.f126038b).b();
            }

            public a bm(com.google.protobuf.u uVar) {
                El();
                ((n) this.f126038b).fn(uVar);
                return this;
            }

            @Override // com.google.protobuf.e0.o
            public c c() {
                return ((n) this.f126038b).c();
            }

            @Override // com.google.protobuf.e0.o
            public com.google.protobuf.u c0() {
                return ((n) this.f126038b).c0();
            }

            public a cm(String str) {
                El();
                ((n) this.f126038b).gn(str);
                return this;
            }

            public a dm(com.google.protobuf.u uVar) {
                El();
                ((n) this.f126038b).hn(uVar);
                return this;
            }

            @Override // com.google.protobuf.e0.o
            public boolean e2() {
                return ((n) this.f126038b).e2();
            }

            public a em(String str) {
                El();
                ((n) this.f126038b).in(str);
                return this;
            }

            @Override // com.google.protobuf.e0.o
            public com.google.protobuf.u f4() {
                return ((n) this.f126038b).f4();
            }

            @Override // com.google.protobuf.e0.o
            public b f5() {
                return ((n) this.f126038b).f5();
            }

            public a fm(com.google.protobuf.u uVar) {
                El();
                ((n) this.f126038b).jn(uVar);
                return this;
            }

            @Override // com.google.protobuf.e0.o
            public boolean g() {
                return ((n) this.f126038b).g();
            }

            @Override // com.google.protobuf.e0.o
            public String getName() {
                return ((n) this.f126038b).getName();
            }

            @Override // com.google.protobuf.e0.o
            public String getTypeName() {
                return ((n) this.f126038b).getTypeName();
            }

            public a gm(b bVar) {
                El();
                ((n) this.f126038b).kn(bVar);
                return this;
            }

            @Override // com.google.protobuf.e0.o
            public boolean h() {
                return ((n) this.f126038b).h();
            }

            @Override // com.google.protobuf.e0.o
            public boolean h1() {
                return ((n) this.f126038b).h1();
            }

            public a hm(String str) {
                El();
                ((n) this.f126038b).ln(str);
                return this;
            }

            @Override // com.google.protobuf.e0.o
            public int i() {
                return ((n) this.f126038b).i();
            }

            @Override // com.google.protobuf.e0.o
            public int i0() {
                return ((n) this.f126038b).i0();
            }

            public a im(com.google.protobuf.u uVar) {
                El();
                ((n) this.f126038b).mn(uVar);
                return this;
            }

            public a jm(int i10) {
                El();
                ((n) this.f126038b).nn(i10);
                return this;
            }

            public a km(int i10) {
                El();
                ((n) this.f126038b).on(i10);
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a lm(p.a aVar) {
                El();
                ((n) this.f126038b).pn((p) aVar.build());
                return this;
            }

            @Override // com.google.protobuf.e0.o
            public String m7() {
                return ((n) this.f126038b).m7();
            }

            public a mm(p pVar) {
                El();
                ((n) this.f126038b).pn(pVar);
                return this;
            }

            public a nm(boolean z10) {
                El();
                ((n) this.f126038b).qn(z10);
                return this;
            }

            public a om(c cVar) {
                El();
                ((n) this.f126038b).rn(cVar);
                return this;
            }

            public a pm(String str) {
                El();
                ((n) this.f126038b).sn(str);
                return this;
            }

            public a qm(com.google.protobuf.u uVar) {
                El();
                ((n) this.f126038b).tn(uVar);
                return this;
            }

            @Override // com.google.protobuf.e0.o
            public boolean t5() {
                return ((n) this.f126038b).t5();
            }

            @Override // com.google.protobuf.e0.o
            public boolean u3() {
                return ((n) this.f126038b).u3();
            }

            @Override // com.google.protobuf.e0.o
            public boolean x5() {
                return ((n) this.f126038b).x5();
            }

            private a() {
                super(n.DEFAULT_INSTANCE);
            }
        }

        public enum b implements s1.c {
            LABEL_OPTIONAL(1),
            LABEL_REQUIRED(2),
            LABEL_REPEATED(3);


            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f125848e = 1;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final int f125849f = 2;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final int f125850g = 3;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private static final s1.d<b> f125851h = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f125853a;

            class a implements s1.d<b> {
                a() {
                }

                @Override // com.google.protobuf.s1.d
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public b a(int i10) {
                    return b.l(i10);
                }
            }

            /* JADX INFO: renamed from: com.google.protobuf.e0$n$b$b, reason: collision with other inner class name */
            private static final class C1217b implements s1.e {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                static final s1.e f125854a = new C1217b();

                private C1217b() {
                }

                @Override // com.google.protobuf.s1.e
                public boolean a(int i10) {
                    return b.l(i10) != null;
                }
            }

            b(int i10) {
                this.f125853a = i10;
            }

            public static b l(int i10) {
                if (i10 == 1) {
                    return LABEL_OPTIONAL;
                }
                if (i10 == 2) {
                    return LABEL_REQUIRED;
                }
                if (i10 == 3) {
                    return LABEL_REPEATED;
                }
                boolean z10 = true & false;
                return null;
            }

            public static s1.d<b> n() {
                return f125851h;
            }

            public static s1.e o() {
                return C1217b.f125854a;
            }

            @Deprecated
            public static b p(int i10) {
                return l(i10);
            }

            @Override // com.google.protobuf.s1.c
            public final int i() {
                return this.f125853a;
            }
        }

        public enum c implements s1.c {
            TYPE_DOUBLE(1),
            TYPE_FLOAT(2),
            TYPE_INT64(3),
            TYPE_UINT64(4),
            TYPE_INT32(5),
            TYPE_FIXED64(6),
            TYPE_FIXED32(7),
            TYPE_BOOL(8),
            TYPE_STRING(9),
            TYPE_GROUP(10),
            TYPE_MESSAGE(11),
            TYPE_BYTES(12),
            TYPE_UINT32(13),
            TYPE_ENUM(14),
            TYPE_SFIXED32(15),
            TYPE_SFIXED64(16),
            TYPE_SINT32(17),
            TYPE_SINT64(18);

            public static final int H1 = 6;
            public static final int X = 1;
            public static final int Y = 2;
            public static final int Z = 3;

            /* JADX INFO: renamed from: g3, reason: collision with root package name */
            public static final int f125861g3 = 8;

            /* JADX INFO: renamed from: h3, reason: collision with root package name */
            public static final int f125863h3 = 9;

            /* JADX INFO: renamed from: i3, reason: collision with root package name */
            public static final int f125865i3 = 10;

            /* JADX INFO: renamed from: j3, reason: collision with root package name */
            public static final int f125867j3 = 11;

            /* JADX INFO: renamed from: k3, reason: collision with root package name */
            public static final int f125869k3 = 12;

            /* JADX INFO: renamed from: l3, reason: collision with root package name */
            public static final int f125871l3 = 13;

            /* JADX INFO: renamed from: m3, reason: collision with root package name */
            public static final int f125873m3 = 14;

            /* JADX INFO: renamed from: n3, reason: collision with root package name */
            public static final int f125875n3 = 15;

            /* JADX INFO: renamed from: o3, reason: collision with root package name */
            public static final int f125877o3 = 16;

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final int f125878p0 = 4;

            /* JADX INFO: renamed from: p1, reason: collision with root package name */
            public static final int f125879p1 = 5;

            /* JADX INFO: renamed from: p2, reason: collision with root package name */
            public static final int f125880p2 = 7;

            /* JADX INFO: renamed from: p3, reason: collision with root package name */
            public static final int f125881p3 = 17;

            /* JADX INFO: renamed from: q3, reason: collision with root package name */
            public static final int f125882q3 = 18;

            /* JADX INFO: renamed from: r3, reason: collision with root package name */
            private static final s1.d<c> f125883r3 = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f125889a;

            class a implements s1.d<c> {
                a() {
                }

                @Override // com.google.protobuf.s1.d
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public c a(int i10) {
                    return c.l(i10);
                }
            }

            private static final class b implements s1.e {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                static final s1.e f125890a = new b();

                private b() {
                }

                @Override // com.google.protobuf.s1.e
                public boolean a(int i10) {
                    return c.l(i10) != null;
                }
            }

            c(int i10) {
                this.f125889a = i10;
            }

            public static c l(int i10) {
                switch (i10) {
                    case 1:
                        return TYPE_DOUBLE;
                    case 2:
                        return TYPE_FLOAT;
                    case 3:
                        return TYPE_INT64;
                    case 4:
                        return TYPE_UINT64;
                    case 5:
                        return TYPE_INT32;
                    case 6:
                        return TYPE_FIXED64;
                    case 7:
                        return TYPE_FIXED32;
                    case 8:
                        return TYPE_BOOL;
                    case 9:
                        return TYPE_STRING;
                    case 10:
                        return TYPE_GROUP;
                    case 11:
                        return TYPE_MESSAGE;
                    case 12:
                        return TYPE_BYTES;
                    case 13:
                        return TYPE_UINT32;
                    case 14:
                        return TYPE_ENUM;
                    case 15:
                        return TYPE_SFIXED32;
                    case 16:
                        return TYPE_SFIXED64;
                    case 17:
                        return TYPE_SINT32;
                    case 18:
                        return TYPE_SINT64;
                    default:
                        return null;
                }
            }

            public static s1.d<c> n() {
                return f125883r3;
            }

            public static s1.e o() {
                return b.f125890a;
            }

            @Deprecated
            public static c p(int i10) {
                return l(i10);
            }

            @Override // com.google.protobuf.s1.c
            public final int i() {
                return this.f125889a;
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
        public void Cm() {
            this.bitField0_ &= -65;
            this.defaultValue_ = Nm().K();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Dm() {
            this.bitField0_ &= -33;
            this.extendee_ = Nm().m7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Em() {
            this.bitField0_ &= -257;
            this.jsonName_ = Nm().M0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Fm() {
            this.bitField0_ &= -5;
            this.label_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Gm() {
            this.bitField0_ &= -2;
            this.name_ = Nm().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Hm() {
            this.bitField0_ &= -3;
            this.number_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Im() {
            this.bitField0_ &= -129;
            this.oneofIndex_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Jm() {
            this.options_ = null;
            this.bitField0_ &= -513;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Km() {
            this.bitField0_ &= -1025;
            this.proto3Optional_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Lm() {
            this.bitField0_ &= -9;
            this.type_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Mm() {
            this.bitField0_ &= -17;
            this.typeName_ = Nm().getTypeName();
        }

        public static n Nm() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void Om(p pVar) {
            pVar.getClass();
            p pVar2 = this.options_;
            if (pVar2 == null || pVar2 == p.Rm()) {
                this.options_ = pVar;
            } else {
                this.options_ = ((p.a) p.Vm(this.options_).Jl(pVar)).B1();
            }
            this.bitField0_ |= 512;
        }

        public static a Pm() {
            return DEFAULT_INSTANCE.jf();
        }

        public static a Qm(n nVar) {
            return DEFAULT_INSTANCE.Uf(nVar);
        }

        public static n Rm(InputStream inputStream) throws IOException {
            return (n) l1.El(DEFAULT_INSTANCE, inputStream);
        }

        public static n Sm(InputStream inputStream, v0 v0Var) throws IOException {
            return (n) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static n Tm(com.google.protobuf.u uVar) throws t1 {
            return (n) l1.Gl(DEFAULT_INSTANCE, uVar);
        }

        public static n Um(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
            return (n) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
        }

        public static n Vm(com.google.protobuf.z zVar) throws IOException {
            return (n) l1.Il(DEFAULT_INSTANCE, zVar);
        }

        public static n Wm(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
            return (n) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
        }

        public static n Xm(InputStream inputStream) throws IOException {
            return (n) l1.Kl(DEFAULT_INSTANCE, inputStream);
        }

        public static n Ym(InputStream inputStream, v0 v0Var) throws IOException {
            return (n) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static n Zm(ByteBuffer byteBuffer) throws t1 {
            return (n) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
        }

        public static n an(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
            return (n) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
        }

        public static n bn(byte[] bArr) throws t1 {
            return (n) l1.Ol(DEFAULT_INSTANCE, bArr);
        }

        public static n cn(byte[] bArr, v0 v0Var) throws t1 {
            return (n) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
        }

        public static f3<n> dn() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void en(String str) {
            str.getClass();
            this.bitField0_ |= 64;
            this.defaultValue_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void fn(com.google.protobuf.u uVar) {
            this.defaultValue_ = uVar.z0();
            this.bitField0_ |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void gn(String str) {
            str.getClass();
            this.bitField0_ |= 32;
            this.extendee_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void hn(com.google.protobuf.u uVar) {
            this.extendee_ = uVar.z0();
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void in(String str) {
            str.getClass();
            this.bitField0_ |= 256;
            this.jsonName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void jn(com.google.protobuf.u uVar) {
            this.jsonName_ = uVar.z0();
            this.bitField0_ |= 256;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void kn(b bVar) {
            this.label_ = bVar.i();
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void ln(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mn(com.google.protobuf.u uVar) {
            this.name_ = uVar.z0();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void nn(int i10) {
            this.bitField0_ |= 2;
            this.number_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void on(int i10) {
            this.bitField0_ |= 128;
            this.oneofIndex_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void pn(p pVar) {
            pVar.getClass();
            this.options_ = pVar;
            this.bitField0_ |= 512;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void qn(boolean z10) {
            this.bitField0_ |= 1024;
            this.proto3Optional_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void rn(c cVar) {
            this.type_ = cVar.i();
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void sn(String str) {
            str.getClass();
            this.bitField0_ |= 16;
            this.typeName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void tn(com.google.protobuf.u uVar) {
            this.typeName_ = uVar.z0();
            this.bitField0_ |= 16;
        }

        @Override // com.google.protobuf.e0.o
        public boolean H4() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.google.protobuf.e0.o
        public String K() {
            return this.defaultValue_;
        }

        @Override // com.google.protobuf.e0.o
        public String M0() {
            return this.jsonName_;
        }

        @Override // com.google.protobuf.e0.o
        public com.google.protobuf.u P0() {
            return com.google.protobuf.u.C(this.jsonName_);
        }

        @Override // com.google.protobuf.l1
        protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
            f3 cVar;
            a aVar = null;
            switch (a.f125834a[iVar.ordinal()]) {
                case 1:
                    return new n();
                case 2:
                    return new a(aVar);
                case 3:
                    return l1.Al(DEFAULT_INSTANCE, "\u0001\u000b\u0000\u0001\u0001\u0011\u000b\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0005\u0003င\u0001\u0004᠌\u0002\u0005᠌\u0003\u0006ဈ\u0004\u0007ဈ\u0006\bᐉ\t\tင\u0007\nဈ\b\u0011ဇ\n", new Object[]{"bitField0_", "name_", "extendee_", "number_", "label_", b.o(), "type_", c.o(), "typeName_", "defaultValue_", "options_", "oneofIndex_", "jsonName_", "proto3Optional_"});
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.protobuf.e0.o
        public boolean T5() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.protobuf.e0.o
        public com.google.protobuf.u V6() {
            return com.google.protobuf.u.C(this.typeName_);
        }

        @Override // com.google.protobuf.e0.o
        public boolean W() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.e0.o
        public boolean W4() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.google.protobuf.e0.o
        public boolean Z6() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.google.protobuf.e0.o
        public com.google.protobuf.u a() {
            return com.google.protobuf.u.C(this.name_);
        }

        @Override // com.google.protobuf.e0.o
        public p b() {
            p pVar = this.options_;
            return pVar == null ? p.Rm() : pVar;
        }

        @Override // com.google.protobuf.e0.o
        public c c() {
            c cVarL = c.l(this.type_);
            return cVarL == null ? c.TYPE_DOUBLE : cVarL;
        }

        @Override // com.google.protobuf.e0.o
        public com.google.protobuf.u c0() {
            return com.google.protobuf.u.C(this.defaultValue_);
        }

        @Override // com.google.protobuf.e0.o
        public boolean e2() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.e0.o
        public com.google.protobuf.u f4() {
            return com.google.protobuf.u.C(this.extendee_);
        }

        @Override // com.google.protobuf.e0.o
        public b f5() {
            b bVarL = b.l(this.label_);
            return bVarL == null ? b.LABEL_OPTIONAL : bVarL;
        }

        @Override // com.google.protobuf.e0.o
        public boolean g() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.google.protobuf.e0.o
        public String getName() {
            return this.name_;
        }

        @Override // com.google.protobuf.e0.o
        public String getTypeName() {
            return this.typeName_;
        }

        @Override // com.google.protobuf.e0.o
        public boolean h() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.e0.o
        public boolean h1() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.e0.o
        public int i() {
            return this.number_;
        }

        @Override // com.google.protobuf.e0.o
        public int i0() {
            return this.oneofIndex_;
        }

        @Override // com.google.protobuf.e0.o
        public String m7() {
            return this.extendee_;
        }

        @Override // com.google.protobuf.e0.o
        public boolean t5() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.google.protobuf.e0.o
        public boolean u3() {
            return this.proto3Optional_;
        }

        @Override // com.google.protobuf.e0.o
        public boolean x5() {
            return (this.bitField0_ & 32) != 0;
        }
    }

    public static final class n0 extends l1<n0, a> implements o0 {
        private static final n0 DEFAULT_INSTANCE;
        public static final int LOCATION_FIELD_NUMBER = 1;
        private static volatile f3<n0> PARSER;
        private s1.k<b> location_ = l1.Ij();

        public static final class a extends l1.b<n0, a> implements o0 {
            /* synthetic */ a(a aVar) {
                this();
            }

            @Override // com.google.protobuf.e0.o0
            public List<b> D7() {
                return Collections.unmodifiableList(((n0) this.f126038b).D7());
            }

            @Override // com.google.protobuf.e0.o0
            public int J4() {
                return ((n0) this.f126038b).J4();
            }

            public a Ol(Iterable<? extends b> iterable) {
                El();
                ((n0) this.f126038b).gm(iterable);
                return this;
            }

            public a Pl(int i10, b.a aVar) {
                El();
                ((n0) this.f126038b).hm(i10, aVar.build());
                return this;
            }

            public a Ql(int i10, b bVar) {
                El();
                ((n0) this.f126038b).hm(i10, bVar);
                return this;
            }

            public a Rl(b.a aVar) {
                El();
                ((n0) this.f126038b).im(aVar.build());
                return this;
            }

            public a Sl(b bVar) {
                El();
                ((n0) this.f126038b).im(bVar);
                return this;
            }

            public a Tl() {
                El();
                ((n0) this.f126038b).jm();
                return this;
            }

            public a Ul(int i10) {
                El();
                ((n0) this.f126038b).Dm(i10);
                return this;
            }

            public a Vl(int i10, b.a aVar) {
                El();
                ((n0) this.f126038b).Em(i10, aVar.build());
                return this;
            }

            public a Wl(int i10, b bVar) {
                El();
                ((n0) this.f126038b).Em(i10, bVar);
                return this;
            }

            @Override // com.google.protobuf.e0.o0
            public b b4(int i10) {
                return ((n0) this.f126038b).b4(i10);
            }

            private a() {
                super(n0.DEFAULT_INSTANCE);
            }
        }

        public static final class b extends l1<b, a> implements c {
            private static final b DEFAULT_INSTANCE;
            public static final int LEADING_COMMENTS_FIELD_NUMBER = 3;
            public static final int LEADING_DETACHED_COMMENTS_FIELD_NUMBER = 6;
            private static volatile f3<b> PARSER = null;
            public static final int PATH_FIELD_NUMBER = 1;
            public static final int SPAN_FIELD_NUMBER = 2;
            public static final int TRAILING_COMMENTS_FIELD_NUMBER = 4;
            private int bitField0_;
            private int pathMemoizedSerializedSize = -1;
            private int spanMemoizedSerializedSize = -1;
            private s1.g path_ = l1.gj();
            private s1.g span_ = l1.gj();
            private String leadingComments_ = "";
            private String trailingComments_ = "";
            private s1.k<String> leadingDetachedComments_ = l1.Ij();

            public static final class a extends l1.b<b, a> implements c {
                /* synthetic */ a(a aVar) {
                    this();
                }

                @Override // com.google.protobuf.e0.n0.c
                public String C6(int i10) {
                    return ((b) this.f126038b).C6(i10);
                }

                @Override // com.google.protobuf.e0.n0.c
                public int F0() {
                    return ((b) this.f126038b).F0();
                }

                @Override // com.google.protobuf.e0.n0.c
                public List<String> H2() {
                    return Collections.unmodifiableList(((b) this.f126038b).H2());
                }

                @Override // com.google.protobuf.e0.n0.c
                public boolean L3() {
                    return ((b) this.f126038b).L3();
                }

                public a Ol(Iterable<String> iterable) {
                    El();
                    ((b) this.f126038b).tm(iterable);
                    return this;
                }

                public a Pl(Iterable<? extends Integer> iterable) {
                    El();
                    ((b) this.f126038b).um(iterable);
                    return this;
                }

                public a Ql(Iterable<? extends Integer> iterable) {
                    El();
                    ((b) this.f126038b).vm(iterable);
                    return this;
                }

                public a Rl(String str) {
                    El();
                    ((b) this.f126038b).wm(str);
                    return this;
                }

                public a Sl(com.google.protobuf.u uVar) {
                    El();
                    ((b) this.f126038b).xm(uVar);
                    return this;
                }

                @Override // com.google.protobuf.e0.n0.c
                public com.google.protobuf.u T6() {
                    return ((b) this.f126038b).T6();
                }

                public a Tl(int i10) {
                    El();
                    ((b) this.f126038b).ym(i10);
                    return this;
                }

                @Override // com.google.protobuf.e0.n0.c
                public boolean U3() {
                    return ((b) this.f126038b).U3();
                }

                public a Ul(int i10) {
                    El();
                    ((b) this.f126038b).zm(i10);
                    return this;
                }

                public a Vl() {
                    El();
                    ((b) this.f126038b).Am();
                    return this;
                }

                public a Wl() {
                    El();
                    ((b) this.f126038b).Bm();
                    return this;
                }

                public a Xl() {
                    El();
                    ((b) this.f126038b).Cm();
                    return this;
                }

                @Override // com.google.protobuf.e0.n0.c
                public List<Integer> Y4() {
                    return Collections.unmodifiableList(((b) this.f126038b).Y4());
                }

                public a Yl() {
                    El();
                    ((b) this.f126038b).Dm();
                    return this;
                }

                public a Zl() {
                    El();
                    ((b) this.f126038b).Em();
                    return this;
                }

                public a am(String str) {
                    El();
                    ((b) this.f126038b).Ym(str);
                    return this;
                }

                public a bm(com.google.protobuf.u uVar) {
                    El();
                    ((b) this.f126038b).Zm(uVar);
                    return this;
                }

                @Override // com.google.protobuf.e0.n0.c
                public String c3() {
                    return ((b) this.f126038b).c3();
                }

                public a cm(int i10, String str) {
                    El();
                    ((b) this.f126038b).an(i10, str);
                    return this;
                }

                @Override // com.google.protobuf.e0.n0.c
                public com.google.protobuf.u d4(int i10) {
                    return ((b) this.f126038b).d4(i10);
                }

                public a dm(int i10, int i11) {
                    El();
                    ((b) this.f126038b).bn(i10, i11);
                    return this;
                }

                public a em(int i10, int i11) {
                    El();
                    ((b) this.f126038b).cn(i10, i11);
                    return this;
                }

                @Override // com.google.protobuf.e0.n0.c
                public int f0(int i10) {
                    return ((b) this.f126038b).f0(i10);
                }

                public a fm(String str) {
                    El();
                    ((b) this.f126038b).dn(str);
                    return this;
                }

                public a gm(com.google.protobuf.u uVar) {
                    El();
                    ((b) this.f126038b).en(uVar);
                    return this;
                }

                @Override // com.google.protobuf.e0.n0.c
                public int h6() {
                    return ((b) this.f126038b).h6();
                }

                @Override // com.google.protobuf.e0.n0.c
                public int m3() {
                    return ((b) this.f126038b).m3();
                }

                @Override // com.google.protobuf.e0.n0.c
                public List<Integer> n0() {
                    return Collections.unmodifiableList(((b) this.f126038b).n0());
                }

                @Override // com.google.protobuf.e0.n0.c
                public com.google.protobuf.u r4() {
                    return ((b) this.f126038b).r4();
                }

                @Override // com.google.protobuf.e0.n0.c
                public String t2() {
                    return ((b) this.f126038b).t2();
                }

                @Override // com.google.protobuf.e0.n0.c
                public int v5(int i10) {
                    return ((b) this.f126038b).v5(i10);
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
            public void Am() {
                this.bitField0_ &= -2;
                this.leadingComments_ = Im().c3();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void Bm() {
                this.leadingDetachedComments_ = l1.Ij();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void Cm() {
                this.path_ = l1.gj();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void Dm() {
                this.span_ = l1.gj();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void Em() {
                this.bitField0_ &= -3;
                this.trailingComments_ = Im().t2();
            }

            private void Fm() {
                s1.k<String> kVar = this.leadingDetachedComments_;
                if (kVar.s1()) {
                    return;
                }
                this.leadingDetachedComments_ = l1.yl(kVar);
            }

            private void Gm() {
                s1.g gVar = this.path_;
                if (!gVar.s1()) {
                    this.path_ = l1.wl(gVar);
                }
            }

            private void Hm() {
                s1.g gVar = this.span_;
                if (gVar.s1()) {
                    return;
                }
                this.span_ = l1.wl(gVar);
            }

            public static b Im() {
                return DEFAULT_INSTANCE;
            }

            public static a Jm() {
                return DEFAULT_INSTANCE.jf();
            }

            public static a Km(b bVar) {
                return DEFAULT_INSTANCE.Uf(bVar);
            }

            public static b Lm(InputStream inputStream) throws IOException {
                return (b) l1.El(DEFAULT_INSTANCE, inputStream);
            }

            public static b Mm(InputStream inputStream, v0 v0Var) throws IOException {
                return (b) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
            }

            public static b Nm(com.google.protobuf.u uVar) throws t1 {
                return (b) l1.Gl(DEFAULT_INSTANCE, uVar);
            }

            public static b Om(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
                return (b) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
            }

            public static b Pm(com.google.protobuf.z zVar) throws IOException {
                return (b) l1.Il(DEFAULT_INSTANCE, zVar);
            }

            public static b Qm(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
                return (b) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
            }

            public static b Rm(InputStream inputStream) throws IOException {
                return (b) l1.Kl(DEFAULT_INSTANCE, inputStream);
            }

            public static b Sm(InputStream inputStream, v0 v0Var) throws IOException {
                return (b) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
            }

            public static b Tm(ByteBuffer byteBuffer) throws t1 {
                return (b) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
            }

            public static b Um(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
                return (b) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
            }

            public static b Vm(byte[] bArr) throws t1 {
                return (b) l1.Ol(DEFAULT_INSTANCE, bArr);
            }

            public static b Wm(byte[] bArr, v0 v0Var) throws t1 {
                return (b) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
            }

            public static f3<b> Xm() {
                return DEFAULT_INSTANCE.W7();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void Ym(String str) {
                str.getClass();
                this.bitField0_ |= 1;
                this.leadingComments_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void Zm(com.google.protobuf.u uVar) {
                this.leadingComments_ = uVar.z0();
                this.bitField0_ |= 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void an(int i10, String str) {
                str.getClass();
                Fm();
                this.leadingDetachedComments_.set(i10, str);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void bn(int i10, int i11) {
                Gm();
                this.path_.X(i10, i11);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void cn(int i10, int i11) {
                Hm();
                this.span_.X(i10, i11);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void dn(String str) {
                str.getClass();
                this.bitField0_ |= 2;
                this.trailingComments_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void en(com.google.protobuf.u uVar) {
                this.trailingComments_ = uVar.z0();
                this.bitField0_ |= 2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void tm(Iterable<String> iterable) {
                Fm();
                com.google.protobuf.a.y(iterable, this.leadingDetachedComments_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void um(Iterable<? extends Integer> iterable) {
                Gm();
                com.google.protobuf.a.y(iterable, this.path_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void vm(Iterable<? extends Integer> iterable) {
                Hm();
                com.google.protobuf.a.y(iterable, this.span_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void wm(String str) {
                str.getClass();
                Fm();
                this.leadingDetachedComments_.add(str);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void xm(com.google.protobuf.u uVar) {
                Fm();
                this.leadingDetachedComments_.add(uVar.z0());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void ym(int i10) {
                Gm();
                this.path_.w1(i10);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zm(int i10) {
                Hm();
                this.span_.w1(i10);
            }

            @Override // com.google.protobuf.e0.n0.c
            public String C6(int i10) {
                return this.leadingDetachedComments_.get(i10);
            }

            @Override // com.google.protobuf.e0.n0.c
            public int F0() {
                return this.path_.size();
            }

            @Override // com.google.protobuf.e0.n0.c
            public List<String> H2() {
                return this.leadingDetachedComments_;
            }

            @Override // com.google.protobuf.e0.n0.c
            public boolean L3() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.l1
            protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
                f3 cVar;
                int i10 = a.f125834a[iVar.ordinal()];
                a aVar = null;
                switch (i10) {
                    case 1:
                        return new b();
                    case 2:
                        return new a(aVar);
                    case 3:
                        return l1.Al(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0003\u0000\u0001'\u0002'\u0003ဈ\u0000\u0004ဈ\u0001\u0006\u001a", new Object[]{"bitField0_", "path_", "span_", "leadingComments_", "trailingComments_", "leadingDetachedComments_"});
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

            @Override // com.google.protobuf.e0.n0.c
            public com.google.protobuf.u T6() {
                return com.google.protobuf.u.C(this.trailingComments_);
            }

            @Override // com.google.protobuf.e0.n0.c
            public boolean U3() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.e0.n0.c
            public List<Integer> Y4() {
                return this.span_;
            }

            @Override // com.google.protobuf.e0.n0.c
            public String c3() {
                return this.leadingComments_;
            }

            @Override // com.google.protobuf.e0.n0.c
            public com.google.protobuf.u d4(int i10) {
                return com.google.protobuf.u.C(this.leadingDetachedComments_.get(i10));
            }

            @Override // com.google.protobuf.e0.n0.c
            public int f0(int i10) {
                return this.path_.getInt(i10);
            }

            @Override // com.google.protobuf.e0.n0.c
            public int h6() {
                return this.span_.size();
            }

            @Override // com.google.protobuf.e0.n0.c
            public int m3() {
                return this.leadingDetachedComments_.size();
            }

            @Override // com.google.protobuf.e0.n0.c
            public List<Integer> n0() {
                return this.path_;
            }

            @Override // com.google.protobuf.e0.n0.c
            public com.google.protobuf.u r4() {
                return com.google.protobuf.u.C(this.leadingComments_);
            }

            @Override // com.google.protobuf.e0.n0.c
            public String t2() {
                return this.trailingComments_;
            }

            @Override // com.google.protobuf.e0.n0.c
            public int v5(int i10) {
                return this.span_.getInt(i10);
            }
        }

        public interface c extends o2 {
            String C6(int i10);

            int F0();

            List<String> H2();

            boolean L3();

            com.google.protobuf.u T6();

            boolean U3();

            List<Integer> Y4();

            String c3();

            com.google.protobuf.u d4(int i10);

            int f0(int i10);

            int h6();

            int m3();

            List<Integer> n0();

            com.google.protobuf.u r4();

            String t2();

            int v5(int i10);
        }

        static {
            n0 n0Var = new n0();
            DEFAULT_INSTANCE = n0Var;
            l1.Wl(n0.class, n0Var);
        }

        private n0() {
        }

        public static n0 Am(byte[] bArr) throws t1 {
            return (n0) l1.Ol(DEFAULT_INSTANCE, bArr);
        }

        public static n0 Bm(byte[] bArr, v0 v0Var) throws t1 {
            return (n0) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
        }

        public static f3<n0> Cm() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Dm(int i10) {
            km();
            this.location_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Em(int i10, b bVar) {
            bVar.getClass();
            km();
            this.location_.set(i10, bVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void gm(Iterable<? extends b> iterable) {
            km();
            com.google.protobuf.a.y(iterable, this.location_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void hm(int i10, b bVar) {
            bVar.getClass();
            km();
            this.location_.add(i10, bVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void im(b bVar) {
            bVar.getClass();
            km();
            this.location_.add(bVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void jm() {
            this.location_ = l1.Ij();
        }

        private void km() {
            s1.k<b> kVar = this.location_;
            if (kVar.s1()) {
                return;
            }
            this.location_ = l1.yl(kVar);
        }

        public static n0 lm() {
            return DEFAULT_INSTANCE;
        }

        public static a om() {
            return DEFAULT_INSTANCE.jf();
        }

        public static a pm(n0 n0Var) {
            return DEFAULT_INSTANCE.Uf(n0Var);
        }

        public static n0 qm(InputStream inputStream) throws IOException {
            return (n0) l1.El(DEFAULT_INSTANCE, inputStream);
        }

        public static n0 rm(InputStream inputStream, v0 v0Var) throws IOException {
            return (n0) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static n0 sm(com.google.protobuf.u uVar) throws t1 {
            return (n0) l1.Gl(DEFAULT_INSTANCE, uVar);
        }

        public static n0 tm(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
            return (n0) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
        }

        public static n0 um(com.google.protobuf.z zVar) throws IOException {
            return (n0) l1.Il(DEFAULT_INSTANCE, zVar);
        }

        public static n0 vm(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
            return (n0) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
        }

        public static n0 wm(InputStream inputStream) throws IOException {
            return (n0) l1.Kl(DEFAULT_INSTANCE, inputStream);
        }

        public static n0 xm(InputStream inputStream, v0 v0Var) throws IOException {
            return (n0) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static n0 ym(ByteBuffer byteBuffer) throws t1 {
            return (n0) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
        }

        public static n0 zm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
            return (n0) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
        }

        @Override // com.google.protobuf.e0.o0
        public List<b> D7() {
            return this.location_;
        }

        @Override // com.google.protobuf.e0.o0
        public int J4() {
            return this.location_.size();
        }

        @Override // com.google.protobuf.l1
        protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
            f3 cVar;
            int i10 = a.f125834a[iVar.ordinal()];
            a aVar = null;
            switch (i10) {
                case 1:
                    return new n0();
                case 2:
                    return new a(aVar);
                case 3:
                    return l1.Al(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"location_", b.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f3<n0> f3Var = PARSER;
                    if (f3Var != null) {
                        return f3Var;
                    }
                    synchronized (n0.class) {
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

        @Override // com.google.protobuf.e0.o0
        public b b4(int i10) {
            return this.location_.get(i10);
        }

        public c mm(int i10) {
            return this.location_.get(i10);
        }

        public List<? extends c> nm() {
            return this.location_;
        }
    }

    public interface o extends o2 {
        boolean H4();

        String K();

        String M0();

        com.google.protobuf.u P0();

        boolean T5();

        com.google.protobuf.u V6();

        boolean W();

        boolean W4();

        boolean Z6();

        com.google.protobuf.u a();

        p b();

        n.c c();

        com.google.protobuf.u c0();

        boolean e2();

        com.google.protobuf.u f4();

        n.b f5();

        boolean g();

        String getName();

        String getTypeName();

        boolean h();

        boolean h1();

        int i();

        int i0();

        String m7();

        boolean t5();

        boolean u3();

        boolean x5();
    }

    public interface o0 extends o2 {
        List<n0.b> D7();

        int J4();

        n0.b b4(int i10);
    }

    public static final class p extends l1.e<p, a> implements q {
        public static final int CTYPE_FIELD_NUMBER = 1;
        private static final p DEFAULT_INSTANCE;
        public static final int DEPRECATED_FIELD_NUMBER = 3;
        public static final int JSTYPE_FIELD_NUMBER = 6;
        public static final int LAZY_FIELD_NUMBER = 5;
        public static final int PACKED_FIELD_NUMBER = 2;
        private static volatile f3<p> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        public static final int WEAK_FIELD_NUMBER = 10;
        private int bitField0_;
        private int ctype_;
        private boolean deprecated_;
        private int jstype_;
        private boolean lazy_;
        private boolean packed_;
        private boolean weak_;
        private byte memoizedIsInitialized = 2;
        private s1.k<p0> uninterpretedOption_ = l1.Ij();

        public static final class a extends l1.d<p, a> implements q {
            /* synthetic */ a(a aVar) {
                this();
            }

            @Override // com.google.protobuf.e0.q
            public boolean C0() {
                return ((p) this.f126038b).C0();
            }

            @Override // com.google.protobuf.e0.q
            public boolean E7() {
                return ((p) this.f126038b).E7();
            }

            @Override // com.google.protobuf.e0.q
            public c G5() {
                return ((p) this.f126038b).G5();
            }

            @Override // com.google.protobuf.e0.q
            public boolean H3() {
                return ((p) this.f126038b).H3();
            }

            @Override // com.google.protobuf.e0.q
            public boolean J2() {
                return ((p) this.f126038b).J2();
            }

            public a Wl(Iterable<? extends p0> iterable) {
                El();
                ((p) this.f126038b).Gm(iterable);
                return this;
            }

            public a Xl(int i10, p0.a aVar) {
                El();
                ((p) this.f126038b).Hm(i10, aVar.build());
                return this;
            }

            public a Yl(int i10, p0 p0Var) {
                El();
                ((p) this.f126038b).Hm(i10, p0Var);
                return this;
            }

            @Override // com.google.protobuf.e0.q
            public boolean Z1() {
                return ((p) this.f126038b).Z1();
            }

            public a Zl(p0.a aVar) {
                El();
                ((p) this.f126038b).Im(aVar.build());
                return this;
            }

            public a am(p0 p0Var) {
                El();
                ((p) this.f126038b).Im(p0Var);
                return this;
            }

            public a bm() {
                El();
                ((p) this.f126038b).Jm();
                return this;
            }

            public a cm() {
                El();
                ((p) this.f126038b).Km();
                return this;
            }

            @Override // com.google.protobuf.e0.q
            public List<p0> d() {
                return Collections.unmodifiableList(((p) this.f126038b).d());
            }

            public a dm() {
                El();
                ((p) this.f126038b).Lm();
                return this;
            }

            @Override // com.google.protobuf.e0.q
            public p0 e(int i10) {
                return ((p) this.f126038b).e(i10);
            }

            public a em() {
                El();
                ((p) this.f126038b).Mm();
                return this;
            }

            @Override // com.google.protobuf.e0.q
            public int f() {
                return ((p) this.f126038b).f();
            }

            public a fm() {
                El();
                ((p) this.f126038b).Nm();
                return this;
            }

            public a gm() {
                El();
                ((p) this.f126038b).Om();
                return this;
            }

            public a hm() {
                El();
                ((p) this.f126038b).Pm();
                return this;
            }

            public a im(int i10) {
                El();
                ((p) this.f126038b).jn(i10);
                return this;
            }

            @Override // com.google.protobuf.e0.q
            public boolean j() {
                return ((p) this.f126038b).j();
            }

            public a jm(b bVar) {
                El();
                ((p) this.f126038b).kn(bVar);
                return this;
            }

            public a km(boolean z10) {
                El();
                ((p) this.f126038b).ln(z10);
                return this;
            }

            @Override // com.google.protobuf.e0.q
            public boolean l() {
                return ((p) this.f126038b).l();
            }

            @Override // com.google.protobuf.e0.q
            public boolean l6() {
                return ((p) this.f126038b).l6();
            }

            public a lm(c cVar) {
                El();
                ((p) this.f126038b).mn(cVar);
                return this;
            }

            public a mm(boolean z10) {
                El();
                ((p) this.f126038b).nn(z10);
                return this;
            }

            public a nm(boolean z10) {
                El();
                ((p) this.f126038b).on(z10);
                return this;
            }

            public a om(int i10, p0.a aVar) {
                El();
                ((p) this.f126038b).pn(i10, aVar.build());
                return this;
            }

            @Override // com.google.protobuf.e0.q
            public b p3() {
                return ((p) this.f126038b).p3();
            }

            @Override // com.google.protobuf.e0.q
            public boolean p4() {
                return ((p) this.f126038b).p4();
            }

            public a pm(int i10, p0 p0Var) {
                El();
                ((p) this.f126038b).pn(i10, p0Var);
                return this;
            }

            public a qm(boolean z10) {
                El();
                ((p) this.f126038b).qn(z10);
                return this;
            }

            @Override // com.google.protobuf.e0.q
            public boolean z5() {
                return ((p) this.f126038b).z5();
            }

            private a() {
                super(p.DEFAULT_INSTANCE);
            }
        }

        public enum b implements s1.c {
            STRING(0),
            CORD(1),
            STRING_PIECE(2);


            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f125894e = 0;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final int f125895f = 1;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final int f125896g = 2;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private static final s1.d<b> f125897h = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f125899a;

            class a implements s1.d<b> {
                a() {
                }

                @Override // com.google.protobuf.s1.d
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public b a(int i10) {
                    return b.l(i10);
                }
            }

            /* JADX INFO: renamed from: com.google.protobuf.e0$p$b$b, reason: collision with other inner class name */
            private static final class C1218b implements s1.e {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                static final s1.e f125900a = new C1218b();

                private C1218b() {
                }

                @Override // com.google.protobuf.s1.e
                public boolean a(int i10) {
                    return b.l(i10) != null;
                }
            }

            b(int i10) {
                this.f125899a = i10;
            }

            public static b l(int i10) {
                if (i10 == 0) {
                    return STRING;
                }
                if (i10 == 1) {
                    return CORD;
                }
                if (i10 != 2) {
                    return null;
                }
                return STRING_PIECE;
            }

            public static s1.d<b> n() {
                return f125897h;
            }

            public static s1.e o() {
                return C1218b.f125900a;
            }

            @Deprecated
            public static b p(int i10) {
                return l(i10);
            }

            @Override // com.google.protobuf.s1.c
            public final int i() {
                return this.f125899a;
            }
        }

        public enum c implements s1.c {
            JS_NORMAL(0),
            JS_STRING(1),
            JS_NUMBER(2);


            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f125904e = 0;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final int f125905f = 1;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final int f125906g = 2;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private static final s1.d<c> f125907h = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f125909a;

            class a implements s1.d<c> {
                a() {
                }

                @Override // com.google.protobuf.s1.d
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public c a(int i10) {
                    return c.l(i10);
                }
            }

            private static final class b implements s1.e {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                static final s1.e f125910a = new b();

                private b() {
                }

                @Override // com.google.protobuf.s1.e
                public boolean a(int i10) {
                    return c.l(i10) != null;
                }
            }

            c(int i10) {
                this.f125909a = i10;
            }

            public static c l(int i10) {
                if (i10 == 0) {
                    return JS_NORMAL;
                }
                if (i10 == 1) {
                    return JS_STRING;
                }
                if (i10 != 2) {
                    return null;
                }
                return JS_NUMBER;
            }

            public static s1.d<c> n() {
                return f125907h;
            }

            public static s1.e o() {
                return b.f125910a;
            }

            @Deprecated
            public static c p(int i10) {
                return l(i10);
            }

            @Override // com.google.protobuf.s1.c
            public final int i() {
                return this.f125909a;
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
        public void Gm(Iterable<? extends p0> iterable) {
            Qm();
            com.google.protobuf.a.y(iterable, this.uninterpretedOption_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Hm(int i10, p0 p0Var) {
            p0Var.getClass();
            Qm();
            this.uninterpretedOption_.add(i10, p0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Im(p0 p0Var) {
            p0Var.getClass();
            Qm();
            this.uninterpretedOption_.add(p0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Jm() {
            this.bitField0_ &= -2;
            this.ctype_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Km() {
            this.bitField0_ &= -17;
            this.deprecated_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Lm() {
            this.bitField0_ &= -5;
            this.jstype_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Mm() {
            this.bitField0_ &= -9;
            this.lazy_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Nm() {
            this.bitField0_ &= -3;
            this.packed_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Om() {
            this.uninterpretedOption_ = l1.Ij();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Pm() {
            this.bitField0_ &= -33;
            this.weak_ = false;
        }

        private void Qm() {
            s1.k<p0> kVar = this.uninterpretedOption_;
            if (!kVar.s1()) {
                this.uninterpretedOption_ = l1.yl(kVar);
            }
        }

        public static p Rm() {
            return DEFAULT_INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a Um() {
            return (a) DEFAULT_INSTANCE.jf();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a Vm(p pVar) {
            return (a) DEFAULT_INSTANCE.Uf(pVar);
        }

        public static p Wm(InputStream inputStream) throws IOException {
            return (p) l1.El(DEFAULT_INSTANCE, inputStream);
        }

        public static p Xm(InputStream inputStream, v0 v0Var) throws IOException {
            return (p) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static p Ym(com.google.protobuf.u uVar) throws t1 {
            return (p) l1.Gl(DEFAULT_INSTANCE, uVar);
        }

        public static p Zm(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
            return (p) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
        }

        public static p an(com.google.protobuf.z zVar) throws IOException {
            return (p) l1.Il(DEFAULT_INSTANCE, zVar);
        }

        public static p bn(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
            return (p) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
        }

        public static p cn(InputStream inputStream) throws IOException {
            return (p) l1.Kl(DEFAULT_INSTANCE, inputStream);
        }

        public static p dn(InputStream inputStream, v0 v0Var) throws IOException {
            return (p) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static p en(ByteBuffer byteBuffer) throws t1 {
            return (p) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
        }

        public static p fn(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
            return (p) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
        }

        public static p gn(byte[] bArr) throws t1 {
            return (p) l1.Ol(DEFAULT_INSTANCE, bArr);
        }

        public static p hn(byte[] bArr, v0 v0Var) throws t1 {
            return (p) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
        }

        public static f3<p> in() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void jn(int i10) {
            Qm();
            this.uninterpretedOption_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void kn(b bVar) {
            this.ctype_ = bVar.i();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void ln(boolean z10) {
            this.bitField0_ |= 16;
            this.deprecated_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mn(c cVar) {
            this.jstype_ = cVar.i();
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void nn(boolean z10) {
            this.bitField0_ |= 8;
            this.lazy_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void on(boolean z10) {
            this.bitField0_ |= 2;
            this.packed_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void pn(int i10, p0 p0Var) {
            p0Var.getClass();
            Qm();
            this.uninterpretedOption_.set(i10, p0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void qn(boolean z10) {
            this.bitField0_ |= 32;
            this.weak_ = z10;
        }

        @Override // com.google.protobuf.e0.q
        public boolean C0() {
            return this.packed_;
        }

        @Override // com.google.protobuf.e0.q
        public boolean E7() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.e0.q
        public c G5() {
            c cVarL = c.l(this.jstype_);
            return cVarL == null ? c.JS_NORMAL : cVarL;
        }

        @Override // com.google.protobuf.e0.q
        public boolean H3() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.e0.q
        public boolean J2() {
            return this.weak_;
        }

        @Override // com.google.protobuf.l1
        protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
            f3 cVar;
            a aVar = null;
            switch (a.f125834a[iVar.ordinal()]) {
                case 1:
                    return new p();
                case 2:
                    return new a(aVar);
                case 3:
                    return l1.Al(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001ϧ\u0007\u0000\u0001\u0001\u0001᠌\u0000\u0002ဇ\u0001\u0003ဇ\u0004\u0005ဇ\u0003\u0006᠌\u0002\nဇ\u0005ϧЛ", new Object[]{"bitField0_", "ctype_", b.o(), "packed_", "deprecated_", "lazy_", "jstype_", c.o(), "weak_", "uninterpretedOption_", p0.class});
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public q0 Sm(int i10) {
            return this.uninterpretedOption_.get(i10);
        }

        public List<? extends q0> Tm() {
            return this.uninterpretedOption_;
        }

        @Override // com.google.protobuf.e0.q
        public boolean Z1() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.e0.q
        public List<p0> d() {
            return this.uninterpretedOption_;
        }

        @Override // com.google.protobuf.e0.q
        public p0 e(int i10) {
            return this.uninterpretedOption_.get(i10);
        }

        @Override // com.google.protobuf.e0.q
        public int f() {
            return this.uninterpretedOption_.size();
        }

        @Override // com.google.protobuf.e0.q
        public boolean j() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.protobuf.e0.q
        public boolean l() {
            return this.deprecated_;
        }

        @Override // com.google.protobuf.e0.q
        public boolean l6() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.e0.q
        public b p3() {
            b bVarL = b.l(this.ctype_);
            return bVarL == null ? b.STRING : bVarL;
        }

        @Override // com.google.protobuf.e0.q
        public boolean p4() {
            return this.lazy_;
        }

        @Override // com.google.protobuf.e0.q
        public boolean z5() {
            return (this.bitField0_ & 32) != 0;
        }
    }

    public static final class p0 extends l1<p0, a> implements q0 {
        public static final int AGGREGATE_VALUE_FIELD_NUMBER = 8;
        private static final p0 DEFAULT_INSTANCE;
        public static final int DOUBLE_VALUE_FIELD_NUMBER = 6;
        public static final int IDENTIFIER_VALUE_FIELD_NUMBER = 3;
        public static final int NAME_FIELD_NUMBER = 2;
        public static final int NEGATIVE_INT_VALUE_FIELD_NUMBER = 5;
        private static volatile f3<p0> PARSER = null;
        public static final int POSITIVE_INT_VALUE_FIELD_NUMBER = 4;
        public static final int STRING_VALUE_FIELD_NUMBER = 7;
        private int bitField0_;
        private double doubleValue_;
        private long negativeIntValue_;
        private long positiveIntValue_;
        private byte memoizedIsInitialized = 2;
        private s1.k<b> name_ = l1.Ij();
        private String identifierValue_ = "";
        private com.google.protobuf.u stringValue_ = com.google.protobuf.u.f126379f;
        private String aggregateValue_ = "";

        public static final class a extends l1.b<p0, a> implements q0 {
            /* synthetic */ a(a aVar) {
                this();
            }

            @Override // com.google.protobuf.e0.q0
            public boolean G2() {
                return ((p0) this.f126038b).G2();
            }

            @Override // com.google.protobuf.e0.q0
            public long G3() {
                return ((p0) this.f126038b).G3();
            }

            @Override // com.google.protobuf.e0.q0
            public boolean I7() {
                return ((p0) this.f126038b).I7();
            }

            @Override // com.google.protobuf.e0.q0
            public com.google.protobuf.u O6() {
                return ((p0) this.f126038b).O6();
            }

            public a Ol(Iterable<? extends b> iterable) {
                El();
                ((p0) this.f126038b).um(iterable);
                return this;
            }

            public a Pl(int i10, b.a aVar) {
                El();
                ((p0) this.f126038b).vm(i10, aVar.build());
                return this;
            }

            public a Ql(int i10, b bVar) {
                El();
                ((p0) this.f126038b).vm(i10, bVar);
                return this;
            }

            public a Rl(b.a aVar) {
                El();
                ((p0) this.f126038b).wm(aVar.build());
                return this;
            }

            @Override // com.google.protobuf.e0.q0
            public boolean S4() {
                return ((p0) this.f126038b).S4();
            }

            public a Sl(b bVar) {
                El();
                ((p0) this.f126038b).wm(bVar);
                return this;
            }

            public a Tl() {
                El();
                ((p0) this.f126038b).xm();
                return this;
            }

            @Override // com.google.protobuf.e0.q0
            public boolean U5() {
                return ((p0) this.f126038b).U5();
            }

            public a Ul() {
                El();
                ((p0) this.f126038b).ym();
                return this;
            }

            public a Vl() {
                El();
                ((p0) this.f126038b).zm();
                return this;
            }

            public a Wl() {
                El();
                ((p0) this.f126038b).Am();
                return this;
            }

            @Override // com.google.protobuf.e0.q0
            public double X() {
                return ((p0) this.f126038b).X();
            }

            @Override // com.google.protobuf.e0.q0
            public String X2() {
                return ((p0) this.f126038b).X2();
            }

            @Override // com.google.protobuf.e0.q0
            public String X5() {
                return ((p0) this.f126038b).X5();
            }

            public a Xl() {
                El();
                ((p0) this.f126038b).Bm();
                return this;
            }

            @Override // com.google.protobuf.e0.q0
            public com.google.protobuf.u Y() {
                return ((p0) this.f126038b).Y();
            }

            public a Yl() {
                El();
                ((p0) this.f126038b).Cm();
                return this;
            }

            public a Zl() {
                El();
                ((p0) this.f126038b).Dm();
                return this;
            }

            public a am(int i10) {
                El();
                ((p0) this.f126038b).Xm(i10);
                return this;
            }

            @Override // com.google.protobuf.e0.q0
            public boolean b0() {
                return ((p0) this.f126038b).b0();
            }

            public a bm(String str) {
                El();
                ((p0) this.f126038b).Ym(str);
                return this;
            }

            public a cm(com.google.protobuf.u uVar) {
                El();
                ((p0) this.f126038b).Zm(uVar);
                return this;
            }

            public a dm(double d10) {
                El();
                ((p0) this.f126038b).an(d10);
                return this;
            }

            public a em(String str) {
                El();
                ((p0) this.f126038b).bn(str);
                return this;
            }

            public a fm(com.google.protobuf.u uVar) {
                El();
                ((p0) this.f126038b).cn(uVar);
                return this;
            }

            @Override // com.google.protobuf.e0.q0
            public b getName(int i10) {
                return ((p0) this.f126038b).getName(i10);
            }

            @Override // com.google.protobuf.e0.q0
            public int getNameCount() {
                return ((p0) this.f126038b).getNameCount();
            }

            public a gm(int i10, b.a aVar) {
                El();
                ((p0) this.f126038b).dn(i10, aVar.build());
                return this;
            }

            public a hm(int i10, b bVar) {
                El();
                ((p0) this.f126038b).dn(i10, bVar);
                return this;
            }

            public a im(long j10) {
                El();
                ((p0) this.f126038b).en(j10);
                return this;
            }

            public a jm(long j10) {
                El();
                ((p0) this.f126038b).fn(j10);
                return this;
            }

            @Override // com.google.protobuf.e0.q0
            public List<b> k2() {
                return Collections.unmodifiableList(((p0) this.f126038b).k2());
            }

            public a km(com.google.protobuf.u uVar) {
                El();
                ((p0) this.f126038b).gn(uVar);
                return this;
            }

            @Override // com.google.protobuf.e0.q0
            public long n3() {
                return ((p0) this.f126038b).n3();
            }

            @Override // com.google.protobuf.e0.q0
            public com.google.protobuf.u o5() {
                return ((p0) this.f126038b).o5();
            }

            @Override // com.google.protobuf.e0.q0
            public boolean y6() {
                return ((p0) this.f126038b).y6();
            }

            private a() {
                super(p0.DEFAULT_INSTANCE);
            }
        }

        public static final class b extends l1<b, a> implements c {
            private static final b DEFAULT_INSTANCE;
            public static final int IS_EXTENSION_FIELD_NUMBER = 2;
            public static final int NAME_PART_FIELD_NUMBER = 1;
            private static volatile f3<b> PARSER;
            private int bitField0_;
            private boolean isExtension_;
            private byte memoizedIsInitialized = 2;
            private String namePart_ = "";

            public static final class a extends l1.b<b, a> implements c {
                /* synthetic */ a(a aVar) {
                    this();
                }

                public a Ol() {
                    El();
                    ((b) this.f126038b).fm();
                    return this;
                }

                public a Pl() {
                    El();
                    ((b) this.f126038b).gm();
                    return this;
                }

                public a Ql(boolean z10) {
                    El();
                    ((b) this.f126038b).xm(z10);
                    return this;
                }

                public a Rl(String str) {
                    El();
                    ((b) this.f126038b).ym(str);
                    return this;
                }

                @Override // com.google.protobuf.e0.p0.c
                public boolean S5() {
                    return ((b) this.f126038b).S5();
                }

                public a Sl(com.google.protobuf.u uVar) {
                    El();
                    ((b) this.f126038b).zm(uVar);
                    return this;
                }

                @Override // com.google.protobuf.e0.p0.c
                public com.google.protobuf.u V2() {
                    return ((b) this.f126038b).V2();
                }

                @Override // com.google.protobuf.e0.p0.c
                public String n5() {
                    return ((b) this.f126038b).n5();
                }

                @Override // com.google.protobuf.e0.p0.c
                public boolean s6() {
                    return ((b) this.f126038b).s6();
                }

                @Override // com.google.protobuf.e0.p0.c
                public boolean u7() {
                    return ((b) this.f126038b).u7();
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
            public void fm() {
                this.bitField0_ &= -3;
                this.isExtension_ = false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void gm() {
                this.bitField0_ &= -2;
                this.namePart_ = hm().n5();
            }

            public static b hm() {
                return DEFAULT_INSTANCE;
            }

            public static a im() {
                return DEFAULT_INSTANCE.jf();
            }

            public static a jm(b bVar) {
                return DEFAULT_INSTANCE.Uf(bVar);
            }

            public static b km(InputStream inputStream) throws IOException {
                return (b) l1.El(DEFAULT_INSTANCE, inputStream);
            }

            public static b lm(InputStream inputStream, v0 v0Var) throws IOException {
                return (b) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
            }

            public static b mm(com.google.protobuf.u uVar) throws t1 {
                return (b) l1.Gl(DEFAULT_INSTANCE, uVar);
            }

            public static b nm(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
                return (b) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
            }

            public static b om(com.google.protobuf.z zVar) throws IOException {
                return (b) l1.Il(DEFAULT_INSTANCE, zVar);
            }

            public static b pm(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
                return (b) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
            }

            public static b qm(InputStream inputStream) throws IOException {
                return (b) l1.Kl(DEFAULT_INSTANCE, inputStream);
            }

            public static b rm(InputStream inputStream, v0 v0Var) throws IOException {
                return (b) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
            }

            public static b sm(ByteBuffer byteBuffer) throws t1 {
                return (b) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
            }

            public static b tm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
                return (b) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
            }

            public static b um(byte[] bArr) throws t1 {
                return (b) l1.Ol(DEFAULT_INSTANCE, bArr);
            }

            public static b vm(byte[] bArr, v0 v0Var) throws t1 {
                return (b) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
            }

            public static f3<b> wm() {
                return DEFAULT_INSTANCE.W7();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void xm(boolean z10) {
                this.bitField0_ |= 2;
                this.isExtension_ = z10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void ym(String str) {
                str.getClass();
                this.bitField0_ |= 1;
                this.namePart_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zm(com.google.protobuf.u uVar) {
                this.namePart_ = uVar.z0();
                this.bitField0_ |= 1;
            }

            @Override // com.google.protobuf.l1
            protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
                f3 cVar;
                a aVar = null;
                switch (a.f125834a[iVar.ordinal()]) {
                    case 1:
                        return new b();
                    case 2:
                        return new a(aVar);
                    case 3:
                        return l1.Al(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔇ\u0001", new Object[]{"bitField0_", "namePart_", "isExtension_"});
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
                        return Byte.valueOf(this.memoizedIsInitialized);
                    case 7:
                        this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            @Override // com.google.protobuf.e0.p0.c
            public boolean S5() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.e0.p0.c
            public com.google.protobuf.u V2() {
                return com.google.protobuf.u.C(this.namePart_);
            }

            @Override // com.google.protobuf.e0.p0.c
            public String n5() {
                return this.namePart_;
            }

            @Override // com.google.protobuf.e0.p0.c
            public boolean s6() {
                return this.isExtension_;
            }

            @Override // com.google.protobuf.e0.p0.c
            public boolean u7() {
                if ((this.bitField0_ & 2) == 0) {
                    return false;
                }
                int i10 = 4 >> 1;
                return true;
            }
        }

        public interface c extends o2 {
            boolean S5();

            com.google.protobuf.u V2();

            String n5();

            boolean s6();

            boolean u7();
        }

        static {
            p0 p0Var = new p0();
            DEFAULT_INSTANCE = p0Var;
            l1.Wl(p0.class, p0Var);
        }

        private p0() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Am() {
            this.name_ = l1.Ij();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Bm() {
            this.bitField0_ &= -5;
            this.negativeIntValue_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Cm() {
            this.bitField0_ &= -3;
            this.positiveIntValue_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Dm() {
            this.bitField0_ &= -17;
            this.stringValue_ = Fm().Y();
        }

        private void Em() {
            s1.k<b> kVar = this.name_;
            if (kVar.s1()) {
                return;
            }
            this.name_ = l1.yl(kVar);
        }

        public static p0 Fm() {
            return DEFAULT_INSTANCE;
        }

        public static a Im() {
            return DEFAULT_INSTANCE.jf();
        }

        public static a Jm(p0 p0Var) {
            return DEFAULT_INSTANCE.Uf(p0Var);
        }

        public static p0 Km(InputStream inputStream) throws IOException {
            return (p0) l1.El(DEFAULT_INSTANCE, inputStream);
        }

        public static p0 Lm(InputStream inputStream, v0 v0Var) throws IOException {
            return (p0) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static p0 Mm(com.google.protobuf.u uVar) throws t1 {
            return (p0) l1.Gl(DEFAULT_INSTANCE, uVar);
        }

        public static p0 Nm(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
            return (p0) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
        }

        public static p0 Om(com.google.protobuf.z zVar) throws IOException {
            return (p0) l1.Il(DEFAULT_INSTANCE, zVar);
        }

        public static p0 Pm(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
            return (p0) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
        }

        public static p0 Qm(InputStream inputStream) throws IOException {
            return (p0) l1.Kl(DEFAULT_INSTANCE, inputStream);
        }

        public static p0 Rm(InputStream inputStream, v0 v0Var) throws IOException {
            return (p0) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static p0 Sm(ByteBuffer byteBuffer) throws t1 {
            return (p0) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
        }

        public static p0 Tm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
            return (p0) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
        }

        public static p0 Um(byte[] bArr) throws t1 {
            return (p0) l1.Ol(DEFAULT_INSTANCE, bArr);
        }

        public static p0 Vm(byte[] bArr, v0 v0Var) throws t1 {
            return (p0) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
        }

        public static f3<p0> Wm() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Xm(int i10) {
            Em();
            this.name_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Ym(String str) {
            str.getClass();
            this.bitField0_ |= 32;
            this.aggregateValue_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Zm(com.google.protobuf.u uVar) {
            this.aggregateValue_ = uVar.z0();
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void an(double d10) {
            this.bitField0_ |= 8;
            this.doubleValue_ = d10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void bn(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.identifierValue_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void cn(com.google.protobuf.u uVar) {
            this.identifierValue_ = uVar.z0();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void dn(int i10, b bVar) {
            bVar.getClass();
            Em();
            this.name_.set(i10, bVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void en(long j10) {
            this.bitField0_ |= 4;
            this.negativeIntValue_ = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void fn(long j10) {
            this.bitField0_ |= 2;
            this.positiveIntValue_ = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void gn(com.google.protobuf.u uVar) {
            uVar.getClass();
            this.bitField0_ |= 16;
            this.stringValue_ = uVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void um(Iterable<? extends b> iterable) {
            Em();
            com.google.protobuf.a.y(iterable, this.name_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void vm(int i10, b bVar) {
            bVar.getClass();
            Em();
            this.name_.add(i10, bVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void wm(b bVar) {
            bVar.getClass();
            Em();
            this.name_.add(bVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void xm() {
            this.bitField0_ &= -33;
            this.aggregateValue_ = Fm().X5();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void ym() {
            this.bitField0_ &= -9;
            this.doubleValue_ = 0.0d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zm() {
            this.bitField0_ &= -2;
            this.identifierValue_ = Fm().X2();
        }

        @Override // com.google.protobuf.e0.q0
        public boolean G2() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.e0.q0
        public long G3() {
            return this.positiveIntValue_;
        }

        public c Gm(int i10) {
            return this.name_.get(i10);
        }

        public List<? extends c> Hm() {
            return this.name_;
        }

        @Override // com.google.protobuf.e0.q0
        public boolean I7() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.google.protobuf.e0.q0
        public com.google.protobuf.u O6() {
            return com.google.protobuf.u.C(this.identifierValue_);
        }

        @Override // com.google.protobuf.l1
        protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
            f3 cVar;
            a aVar = null;
            switch (a.f125834a[iVar.ordinal()]) {
                case 1:
                    return new p0();
                case 2:
                    return new a(aVar);
                case 3:
                    return l1.Al(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0002\b\u0007\u0000\u0001\u0001\u0002Л\u0003ဈ\u0000\u0004ဃ\u0001\u0005ဂ\u0002\u0006က\u0003\u0007ည\u0004\bဈ\u0005", new Object[]{"bitField0_", "name_", b.class, "identifierValue_", "positiveIntValue_", "negativeIntValue_", "doubleValue_", "stringValue_", "aggregateValue_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f3<p0> f3Var = PARSER;
                    if (f3Var != null) {
                        return f3Var;
                    }
                    synchronized (p0.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.protobuf.e0.q0
        public boolean S4() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.e0.q0
        public boolean U5() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.e0.q0
        public double X() {
            return this.doubleValue_;
        }

        @Override // com.google.protobuf.e0.q0
        public String X2() {
            return this.identifierValue_;
        }

        @Override // com.google.protobuf.e0.q0
        public String X5() {
            return this.aggregateValue_;
        }

        @Override // com.google.protobuf.e0.q0
        public com.google.protobuf.u Y() {
            return this.stringValue_;
        }

        @Override // com.google.protobuf.e0.q0
        public boolean b0() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.protobuf.e0.q0
        public b getName(int i10) {
            return this.name_.get(i10);
        }

        @Override // com.google.protobuf.e0.q0
        public int getNameCount() {
            return this.name_.size();
        }

        @Override // com.google.protobuf.e0.q0
        public List<b> k2() {
            return this.name_;
        }

        @Override // com.google.protobuf.e0.q0
        public long n3() {
            return this.negativeIntValue_;
        }

        @Override // com.google.protobuf.e0.q0
        public com.google.protobuf.u o5() {
            return com.google.protobuf.u.C(this.aggregateValue_);
        }

        @Override // com.google.protobuf.e0.q0
        public boolean y6() {
            return (this.bitField0_ & 4) != 0;
        }
    }

    public interface q extends l1.f<p, p.a> {
        boolean C0();

        boolean E7();

        p.c G5();

        boolean H3();

        boolean J2();

        boolean Z1();

        List<p0> d();

        p0 e(int i10);

        int f();

        boolean j();

        boolean l();

        boolean l6();

        p.b p3();

        boolean p4();

        boolean z5();
    }

    public interface q0 extends o2 {
        boolean G2();

        long G3();

        boolean I7();

        com.google.protobuf.u O6();

        boolean S4();

        boolean U5();

        double X();

        String X2();

        String X5();

        com.google.protobuf.u Y();

        boolean b0();

        p0.b getName(int i10);

        int getNameCount();

        List<p0.b> k2();

        long n3();

        com.google.protobuf.u o5();

        boolean y6();
    }

    public static final class r extends l1<r, a> implements s {
        private static final r DEFAULT_INSTANCE;
        public static final int DEPENDENCY_FIELD_NUMBER = 3;
        public static final int ENUM_TYPE_FIELD_NUMBER = 5;
        public static final int EXTENSION_FIELD_NUMBER = 7;
        public static final int MESSAGE_TYPE_FIELD_NUMBER = 4;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int OPTIONS_FIELD_NUMBER = 8;
        public static final int PACKAGE_FIELD_NUMBER = 2;
        private static volatile f3<r> PARSER = null;
        public static final int PUBLIC_DEPENDENCY_FIELD_NUMBER = 10;
        public static final int SERVICE_FIELD_NUMBER = 6;
        public static final int SOURCE_CODE_INFO_FIELD_NUMBER = 9;
        public static final int SYNTAX_FIELD_NUMBER = 12;
        public static final int WEAK_DEPENDENCY_FIELD_NUMBER = 11;
        private int bitField0_;
        private v options_;
        private n0 sourceCodeInfo_;
        private byte memoizedIsInitialized = 2;
        private String name_ = "";
        private String package_ = "";
        private s1.k<String> dependency_ = l1.Ij();
        private s1.g publicDependency_ = l1.gj();
        private s1.g weakDependency_ = l1.gj();
        private s1.k<b> messageType_ = l1.Ij();
        private s1.k<d> enumType_ = l1.Ij();
        private s1.k<j0> service_ = l1.Ij();
        private s1.k<n> extension_ = l1.Ij();
        private String syntax_ = "";

        public static final class a extends l1.b<r, a> implements s {
            /* synthetic */ a(a aVar) {
                this();
            }

            @Override // com.google.protobuf.e0.s
            public List<b> A3() {
                return Collections.unmodifiableList(((r) this.f126038b).A3());
            }

            public a Am() {
                El();
                ((r) this.f126038b).En();
                return this;
            }

            public a Bm(v vVar) {
                El();
                ((r) this.f126038b).Vn(vVar);
                return this;
            }

            public a Cm(n0 n0Var) {
                El();
                ((r) this.f126038b).Wn(n0Var);
                return this;
            }

            @Override // com.google.protobuf.e0.s
            public boolean D4() {
                return ((r) this.f126038b).D4();
            }

            public a Dm(int i10) {
                El();
                ((r) this.f126038b).no(i10);
                return this;
            }

            public a Em(int i10) {
                El();
                ((r) this.f126038b).oo(i10);
                return this;
            }

            public a Fm(int i10) {
                El();
                ((r) this.f126038b).po(i10);
                return this;
            }

            public a Gm(int i10) {
                El();
                ((r) this.f126038b).qo(i10);
                return this;
            }

            public a Hm(int i10, String str) {
                El();
                ((r) this.f126038b).ro(i10, str);
                return this;
            }

            @Override // com.google.protobuf.e0.s
            public int I2() {
                return ((r) this.f126038b).I2();
            }

            public a Im(int i10, d.a aVar) {
                El();
                ((r) this.f126038b).so(i10, aVar.build());
                return this;
            }

            @Override // com.google.protobuf.e0.s
            public List<Integer> J6() {
                return Collections.unmodifiableList(((r) this.f126038b).J6());
            }

            @Override // com.google.protobuf.e0.s
            public int J7() {
                return ((r) this.f126038b).J7();
            }

            public a Jm(int i10, d dVar) {
                El();
                ((r) this.f126038b).so(i10, dVar);
                return this;
            }

            @Override // com.google.protobuf.e0.s
            public n K0(int i10) {
                return ((r) this.f126038b).K0(i10);
            }

            @Override // com.google.protobuf.e0.s
            public int K5() {
                return ((r) this.f126038b).K5();
            }

            public a Km(int i10, n.a aVar) {
                El();
                ((r) this.f126038b).to(i10, aVar.build());
                return this;
            }

            public a Lm(int i10, n nVar) {
                El();
                ((r) this.f126038b).to(i10, nVar);
                return this;
            }

            @Override // com.google.protobuf.e0.s
            public String M5(int i10) {
                return ((r) this.f126038b).M5(i10);
            }

            public a Mm(int i10, b.a aVar) {
                El();
                ((r) this.f126038b).uo(i10, aVar.build());
                return this;
            }

            public a Nm(int i10, b bVar) {
                El();
                ((r) this.f126038b).uo(i10, bVar);
                return this;
            }

            @Override // com.google.protobuf.e0.s
            public int O5(int i10) {
                return ((r) this.f126038b).O5(i10);
            }

            public a Ol(Iterable<String> iterable) {
                El();
                ((r) this.f126038b).an(iterable);
                return this;
            }

            public a Om(String str) {
                El();
                ((r) this.f126038b).vo(str);
                return this;
            }

            public a Pl(Iterable<? extends d> iterable) {
                El();
                ((r) this.f126038b).bn(iterable);
                return this;
            }

            public a Pm(com.google.protobuf.u uVar) {
                El();
                ((r) this.f126038b).wo(uVar);
                return this;
            }

            @Override // com.google.protobuf.e0.s
            public b Q5(int i10) {
                return ((r) this.f126038b).Q5(i10);
            }

            public a Ql(Iterable<? extends n> iterable) {
                El();
                ((r) this.f126038b).cn(iterable);
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a Qm(v.a aVar) {
                El();
                ((r) this.f126038b).xo((v) aVar.build());
                return this;
            }

            public a Rl(Iterable<? extends b> iterable) {
                El();
                ((r) this.f126038b).dn(iterable);
                return this;
            }

            public a Rm(v vVar) {
                El();
                ((r) this.f126038b).xo(vVar);
                return this;
            }

            public a Sl(Iterable<? extends Integer> iterable) {
                El();
                ((r) this.f126038b).en(iterable);
                return this;
            }

            public a Sm(String str) {
                El();
                ((r) this.f126038b).yo(str);
                return this;
            }

            @Override // com.google.protobuf.e0.s
            public List<Integer> T2() {
                return Collections.unmodifiableList(((r) this.f126038b).T2());
            }

            public a Tl(Iterable<? extends j0> iterable) {
                El();
                ((r) this.f126038b).fn(iterable);
                return this;
            }

            public a Tm(com.google.protobuf.u uVar) {
                El();
                ((r) this.f126038b).zo(uVar);
                return this;
            }

            public a Ul(Iterable<? extends Integer> iterable) {
                El();
                ((r) this.f126038b).gn(iterable);
                return this;
            }

            public a Um(int i10, int i11) {
                El();
                ((r) this.f126038b).Ao(i10, i11);
                return this;
            }

            public a Vl(String str) {
                El();
                ((r) this.f126038b).hn(str);
                return this;
            }

            public a Vm(int i10, j0.a aVar) {
                El();
                ((r) this.f126038b).Bo(i10, aVar.build());
                return this;
            }

            public a Wl(com.google.protobuf.u uVar) {
                El();
                ((r) this.f126038b).in(uVar);
                return this;
            }

            public a Wm(int i10, j0 j0Var) {
                El();
                ((r) this.f126038b).Bo(i10, j0Var);
                return this;
            }

            public a Xl(int i10, d.a aVar) {
                El();
                ((r) this.f126038b).jn(i10, aVar.build());
                return this;
            }

            public a Xm(n0.a aVar) {
                El();
                ((r) this.f126038b).Co(aVar.build());
                return this;
            }

            @Override // com.google.protobuf.e0.s
            public com.google.protobuf.u Y2() {
                return ((r) this.f126038b).Y2();
            }

            public a Yl(int i10, d dVar) {
                El();
                ((r) this.f126038b).jn(i10, dVar);
                return this;
            }

            public a Ym(n0 n0Var) {
                El();
                ((r) this.f126038b).Co(n0Var);
                return this;
            }

            @Override // com.google.protobuf.e0.s
            public boolean Z2() {
                return ((r) this.f126038b).Z2();
            }

            public a Zl(d.a aVar) {
                El();
                ((r) this.f126038b).kn(aVar.build());
                return this;
            }

            public a Zm(String str) {
                El();
                ((r) this.f126038b).Do(str);
                return this;
            }

            @Override // com.google.protobuf.e0.s
            public com.google.protobuf.u a() {
                return ((r) this.f126038b).a();
            }

            @Override // com.google.protobuf.e0.s
            public List<d> a0() {
                return Collections.unmodifiableList(((r) this.f126038b).a0());
            }

            public a am(d dVar) {
                El();
                ((r) this.f126038b).kn(dVar);
                return this;
            }

            public a an(com.google.protobuf.u uVar) {
                El();
                ((r) this.f126038b).Eo(uVar);
                return this;
            }

            @Override // com.google.protobuf.e0.s
            public v b() {
                return ((r) this.f126038b).b();
            }

            @Override // com.google.protobuf.e0.s
            public int b6() {
                return ((r) this.f126038b).b6();
            }

            public a bm(int i10, n.a aVar) {
                El();
                ((r) this.f126038b).ln(i10, aVar.build());
                return this;
            }

            public a bn(int i10, int i11) {
                El();
                ((r) this.f126038b).Fo(i10, i11);
                return this;
            }

            public a cm(int i10, n nVar) {
                El();
                ((r) this.f126038b).ln(i10, nVar);
                return this;
            }

            public a dm(n.a aVar) {
                El();
                ((r) this.f126038b).mn(aVar.build());
                return this;
            }

            @Override // com.google.protobuf.e0.s
            public j0 e3(int i10) {
                return ((r) this.f126038b).e3(i10);
            }

            public a em(n nVar) {
                El();
                ((r) this.f126038b).mn(nVar);
                return this;
            }

            public a fm(int i10, b.a aVar) {
                El();
                ((r) this.f126038b).nn(i10, aVar.build());
                return this;
            }

            @Override // com.google.protobuf.e0.s
            public boolean g() {
                return ((r) this.f126038b).g();
            }

            @Override // com.google.protobuf.e0.s
            public String getName() {
                return ((r) this.f126038b).getName();
            }

            public a gm(int i10, b bVar) {
                El();
                ((r) this.f126038b).nn(i10, bVar);
                return this;
            }

            @Override // com.google.protobuf.e0.s
            public boolean h() {
                return ((r) this.f126038b).h();
            }

            public a hm(b.a aVar) {
                El();
                ((r) this.f126038b).on(aVar.build());
                return this;
            }

            public a im(b bVar) {
                El();
                ((r) this.f126038b).on(bVar);
                return this;
            }

            public a jm(int i10) {
                El();
                ((r) this.f126038b).pn(i10);
                return this;
            }

            public a km(int i10, j0.a aVar) {
                El();
                ((r) this.f126038b).qn(i10, aVar.build());
                return this;
            }

            @Override // com.google.protobuf.e0.s
            public boolean l2() {
                return ((r) this.f126038b).l2();
            }

            public a lm(int i10, j0 j0Var) {
                El();
                ((r) this.f126038b).qn(i10, j0Var);
                return this;
            }

            @Override // com.google.protobuf.e0.s
            public int m0() {
                return ((r) this.f126038b).m0();
            }

            public a mm(j0.a aVar) {
                El();
                ((r) this.f126038b).rn(aVar.build());
                return this;
            }

            @Override // com.google.protobuf.e0.s
            public com.google.protobuf.u n7() {
                return ((r) this.f126038b).n7();
            }

            public a nm(j0 j0Var) {
                El();
                ((r) this.f126038b).rn(j0Var);
                return this;
            }

            @Override // com.google.protobuf.e0.s
            public com.google.protobuf.u o3(int i10) {
                return ((r) this.f126038b).o3(i10);
            }

            public a om(int i10) {
                El();
                ((r) this.f126038b).sn(i10);
                return this;
            }

            @Override // com.google.protobuf.e0.s
            public String p() {
                return ((r) this.f126038b).p();
            }

            public a pm() {
                El();
                ((r) this.f126038b).tn();
                return this;
            }

            @Override // com.google.protobuf.e0.s
            public int q5(int i10) {
                return ((r) this.f126038b).q5(i10);
            }

            public a qm() {
                El();
                ((r) this.f126038b).un();
                return this;
            }

            @Override // com.google.protobuf.e0.s
            public List<n> r0() {
                return Collections.unmodifiableList(((r) this.f126038b).r0());
            }

            public a rm() {
                El();
                ((r) this.f126038b).vn();
                return this;
            }

            @Override // com.google.protobuf.e0.s
            public List<j0> s4() {
                return Collections.unmodifiableList(((r) this.f126038b).s4());
            }

            public a sm() {
                El();
                ((r) this.f126038b).wn();
                return this;
            }

            public a tm() {
                El();
                ((r) this.f126038b).xn();
                return this;
            }

            @Override // com.google.protobuf.e0.s
            public String u6() {
                return ((r) this.f126038b).u6();
            }

            public a um() {
                El();
                ((r) this.f126038b).yn();
                return this;
            }

            public a vm() {
                El();
                ((r) this.f126038b).zn();
                return this;
            }

            @Override // com.google.protobuf.e0.s
            public int w0() {
                return ((r) this.f126038b).w0();
            }

            @Override // com.google.protobuf.e0.s
            public n0 w3() {
                return ((r) this.f126038b).w3();
            }

            public a wm() {
                El();
                ((r) this.f126038b).An();
                return this;
            }

            @Override // com.google.protobuf.e0.s
            public int x3() {
                return ((r) this.f126038b).x3();
            }

            @Override // com.google.protobuf.e0.s
            public List<String> x6() {
                return Collections.unmodifiableList(((r) this.f126038b).x6());
            }

            public a xm() {
                El();
                ((r) this.f126038b).Bn();
                return this;
            }

            @Override // com.google.protobuf.e0.s
            public d y0(int i10) {
                return ((r) this.f126038b).y0(i10);
            }

            public a ym() {
                El();
                ((r) this.f126038b).Cn();
                return this;
            }

            public a zm() {
                El();
                ((r) this.f126038b).Dn();
                return this;
            }

            private a() {
                super(r.DEFAULT_INSTANCE);
            }
        }

        static {
            r rVar = new r();
            DEFAULT_INSTANCE = rVar;
            l1.Wl(r.class, rVar);
        }

        private r() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void An() {
            this.publicDependency_ = l1.gj();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Ao(int i10, int i11) {
            Jn();
            this.publicDependency_.X(i10, i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Bn() {
            this.service_ = l1.Ij();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Bo(int i10, j0 j0Var) {
            j0Var.getClass();
            Kn();
            this.service_.set(i10, j0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Cn() {
            this.sourceCodeInfo_ = null;
            this.bitField0_ &= -9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Co(n0 n0Var) {
            n0Var.getClass();
            this.sourceCodeInfo_ = n0Var;
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Dn() {
            this.bitField0_ &= -17;
            this.syntax_ = Mn().p();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Do(String str) {
            str.getClass();
            this.bitField0_ |= 16;
            this.syntax_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void En() {
            this.weakDependency_ = l1.gj();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Eo(com.google.protobuf.u uVar) {
            this.syntax_ = uVar.z0();
            this.bitField0_ |= 16;
        }

        private void Fn() {
            s1.k<String> kVar = this.dependency_;
            if (kVar.s1()) {
                return;
            }
            this.dependency_ = l1.yl(kVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Fo(int i10, int i11) {
            Ln();
            this.weakDependency_.X(i10, i11);
        }

        private void Gn() {
            s1.k<d> kVar = this.enumType_;
            if (kVar.s1()) {
                return;
            }
            this.enumType_ = l1.yl(kVar);
        }

        private void Hn() {
            s1.k<n> kVar = this.extension_;
            if (kVar.s1()) {
                return;
            }
            this.extension_ = l1.yl(kVar);
        }

        private void In() {
            s1.k<b> kVar = this.messageType_;
            if (kVar.s1()) {
                return;
            }
            this.messageType_ = l1.yl(kVar);
        }

        private void Jn() {
            s1.g gVar = this.publicDependency_;
            if (gVar.s1()) {
                return;
            }
            this.publicDependency_ = l1.wl(gVar);
        }

        private void Kn() {
            s1.k<j0> kVar = this.service_;
            if (kVar.s1()) {
                return;
            }
            this.service_ = l1.yl(kVar);
        }

        private void Ln() {
            s1.g gVar = this.weakDependency_;
            if (!gVar.s1()) {
                this.weakDependency_ = l1.wl(gVar);
            }
        }

        public static r Mn() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void Vn(v vVar) {
            vVar.getClass();
            v vVar2 = this.options_;
            if (vVar2 == null || vVar2 == v.Rn()) {
                this.options_ = vVar;
            } else {
                this.options_ = ((v.a) v.Vn(this.options_).Jl(vVar)).B1();
            }
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Wn(n0 n0Var) {
            n0Var.getClass();
            n0 n0Var2 = this.sourceCodeInfo_;
            if (n0Var2 == null || n0Var2 == n0.lm()) {
                this.sourceCodeInfo_ = n0Var;
            } else {
                this.sourceCodeInfo_ = n0.pm(this.sourceCodeInfo_).Jl(n0Var).B1();
            }
            this.bitField0_ |= 8;
        }

        public static a Xn() {
            return DEFAULT_INSTANCE.jf();
        }

        public static a Yn(r rVar) {
            return DEFAULT_INSTANCE.Uf(rVar);
        }

        public static r Zn(InputStream inputStream) throws IOException {
            return (r) l1.El(DEFAULT_INSTANCE, inputStream);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void an(Iterable<String> iterable) {
            Fn();
            com.google.protobuf.a.y(iterable, this.dependency_);
        }

        public static r ao(InputStream inputStream, v0 v0Var) throws IOException {
            return (r) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void bn(Iterable<? extends d> iterable) {
            Gn();
            com.google.protobuf.a.y(iterable, this.enumType_);
        }

        public static r bo(com.google.protobuf.u uVar) throws t1 {
            return (r) l1.Gl(DEFAULT_INSTANCE, uVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void cn(Iterable<? extends n> iterable) {
            Hn();
            com.google.protobuf.a.y(iterable, this.extension_);
        }

        public static r co(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
            return (r) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void dn(Iterable<? extends b> iterable) {
            In();
            com.google.protobuf.a.y(iterable, this.messageType_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void en(Iterable<? extends Integer> iterable) {
            Jn();
            com.google.protobuf.a.y(iterable, this.publicDependency_);
        }

        public static r eo(com.google.protobuf.z zVar) throws IOException {
            return (r) l1.Il(DEFAULT_INSTANCE, zVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void fn(Iterable<? extends j0> iterable) {
            Kn();
            com.google.protobuf.a.y(iterable, this.service_);
        }

        public static r fo(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
            return (r) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void gn(Iterable<? extends Integer> iterable) {
            Ln();
            com.google.protobuf.a.y(iterable, this.weakDependency_);
        }

        public static r go(InputStream inputStream) throws IOException {
            return (r) l1.Kl(DEFAULT_INSTANCE, inputStream);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void hn(String str) {
            str.getClass();
            Fn();
            this.dependency_.add(str);
        }

        public static r ho(InputStream inputStream, v0 v0Var) throws IOException {
            return (r) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void in(com.google.protobuf.u uVar) {
            Fn();
            this.dependency_.add(uVar.z0());
        }

        public static r io(ByteBuffer byteBuffer) throws t1 {
            return (r) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void jn(int i10, d dVar) {
            dVar.getClass();
            Gn();
            this.enumType_.add(i10, dVar);
        }

        public static r jo(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
            return (r) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void kn(d dVar) {
            dVar.getClass();
            Gn();
            this.enumType_.add(dVar);
        }

        public static r ko(byte[] bArr) throws t1 {
            return (r) l1.Ol(DEFAULT_INSTANCE, bArr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void ln(int i10, n nVar) {
            nVar.getClass();
            Hn();
            this.extension_.add(i10, nVar);
        }

        public static r lo(byte[] bArr, v0 v0Var) throws t1 {
            return (r) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mn(n nVar) {
            nVar.getClass();
            Hn();
            this.extension_.add(nVar);
        }

        public static f3<r> mo() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void nn(int i10, b bVar) {
            bVar.getClass();
            In();
            this.messageType_.add(i10, bVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void no(int i10) {
            Gn();
            this.enumType_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void on(b bVar) {
            bVar.getClass();
            In();
            this.messageType_.add(bVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void oo(int i10) {
            Hn();
            this.extension_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void pn(int i10) {
            Jn();
            this.publicDependency_.w1(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void po(int i10) {
            In();
            this.messageType_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void qn(int i10, j0 j0Var) {
            j0Var.getClass();
            Kn();
            this.service_.add(i10, j0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void qo(int i10) {
            Kn();
            this.service_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void rn(j0 j0Var) {
            j0Var.getClass();
            Kn();
            this.service_.add(j0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void ro(int i10, String str) {
            str.getClass();
            Fn();
            this.dependency_.set(i10, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void sn(int i10) {
            Ln();
            this.weakDependency_.w1(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void so(int i10, d dVar) {
            dVar.getClass();
            Gn();
            this.enumType_.set(i10, dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void tn() {
            this.dependency_ = l1.Ij();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void to(int i10, n nVar) {
            nVar.getClass();
            Hn();
            this.extension_.set(i10, nVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void un() {
            this.enumType_ = l1.Ij();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void uo(int i10, b bVar) {
            bVar.getClass();
            In();
            this.messageType_.set(i10, bVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void vn() {
            this.extension_ = l1.Ij();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void vo(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void wn() {
            this.messageType_ = l1.Ij();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void wo(com.google.protobuf.u uVar) {
            this.name_ = uVar.z0();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void xn() {
            this.bitField0_ &= -2;
            this.name_ = Mn().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void xo(v vVar) {
            vVar.getClass();
            this.options_ = vVar;
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void yn() {
            this.options_ = null;
            this.bitField0_ &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void yo(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.package_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zn() {
            this.bitField0_ &= -3;
            this.package_ = Mn().u6();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zo(com.google.protobuf.u uVar) {
            this.package_ = uVar.z0();
            this.bitField0_ |= 2;
        }

        @Override // com.google.protobuf.e0.s
        public List<b> A3() {
            return this.messageType_;
        }

        @Override // com.google.protobuf.e0.s
        public boolean D4() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.e0.s
        public int I2() {
            return this.publicDependency_.size();
        }

        @Override // com.google.protobuf.e0.s
        public List<Integer> J6() {
            return this.publicDependency_;
        }

        @Override // com.google.protobuf.e0.s
        public int J7() {
            return this.weakDependency_.size();
        }

        @Override // com.google.protobuf.e0.s
        public n K0(int i10) {
            return this.extension_.get(i10);
        }

        @Override // com.google.protobuf.e0.s
        public int K5() {
            return this.dependency_.size();
        }

        @Override // com.google.protobuf.e0.s
        public String M5(int i10) {
            return this.dependency_.get(i10);
        }

        public e Nn(int i10) {
            return this.enumType_.get(i10);
        }

        @Override // com.google.protobuf.e0.s
        public int O5(int i10) {
            return this.publicDependency_.getInt(i10);
        }

        public List<? extends e> On() {
            return this.enumType_;
        }

        public o Pn(int i10) {
            return this.extension_.get(i10);
        }

        @Override // com.google.protobuf.e0.s
        public b Q5(int i10) {
            return this.messageType_.get(i10);
        }

        public List<? extends o> Qn() {
            return this.extension_;
        }

        @Override // com.google.protobuf.l1
        protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
            f3 cVar;
            a aVar = null;
            switch (a.f125834a[iVar.ordinal()]) {
                case 1:
                    return new r();
                case 2:
                    return new a(aVar);
                case 3:
                    return l1.Al(DEFAULT_INSTANCE, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0007\u0005\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001a\u0004Л\u0005Л\u0006Л\u0007Л\bᐉ\u0002\tဉ\u0003\n\u0016\u000b\u0016\fဈ\u0004", new Object[]{"bitField0_", "name_", "package_", "dependency_", "messageType_", b.class, "enumType_", d.class, "service_", j0.class, "extension_", n.class, "options_", "sourceCodeInfo_", "publicDependency_", "weakDependency_", "syntax_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f3<r> f3Var = PARSER;
                    if (f3Var != null) {
                        return f3Var;
                    }
                    synchronized (r.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public c Rn(int i10) {
            return this.messageType_.get(i10);
        }

        public List<? extends c> Sn() {
            return this.messageType_;
        }

        @Override // com.google.protobuf.e0.s
        public List<Integer> T2() {
            return this.weakDependency_;
        }

        public k0 Tn(int i10) {
            return this.service_.get(i10);
        }

        public List<? extends k0> Un() {
            return this.service_;
        }

        @Override // com.google.protobuf.e0.s
        public com.google.protobuf.u Y2() {
            return com.google.protobuf.u.C(this.syntax_);
        }

        @Override // com.google.protobuf.e0.s
        public boolean Z2() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.e0.s
        public com.google.protobuf.u a() {
            return com.google.protobuf.u.C(this.name_);
        }

        @Override // com.google.protobuf.e0.s
        public List<d> a0() {
            return this.enumType_;
        }

        @Override // com.google.protobuf.e0.s
        public v b() {
            v vVarRn = this.options_;
            if (vVarRn == null) {
                vVarRn = v.Rn();
            }
            return vVarRn;
        }

        @Override // com.google.protobuf.e0.s
        public int b6() {
            return this.messageType_.size();
        }

        @Override // com.google.protobuf.e0.s
        public j0 e3(int i10) {
            return this.service_.get(i10);
        }

        @Override // com.google.protobuf.e0.s
        public boolean g() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.e0.s
        public String getName() {
            return this.name_;
        }

        @Override // com.google.protobuf.e0.s
        public boolean h() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.e0.s
        public boolean l2() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.protobuf.e0.s
        public int m0() {
            return this.extension_.size();
        }

        @Override // com.google.protobuf.e0.s
        public com.google.protobuf.u n7() {
            return com.google.protobuf.u.C(this.package_);
        }

        @Override // com.google.protobuf.e0.s
        public com.google.protobuf.u o3(int i10) {
            return com.google.protobuf.u.C(this.dependency_.get(i10));
        }

        @Override // com.google.protobuf.e0.s
        public String p() {
            return this.syntax_;
        }

        @Override // com.google.protobuf.e0.s
        public int q5(int i10) {
            return this.weakDependency_.getInt(i10);
        }

        @Override // com.google.protobuf.e0.s
        public List<n> r0() {
            return this.extension_;
        }

        @Override // com.google.protobuf.e0.s
        public List<j0> s4() {
            return this.service_;
        }

        @Override // com.google.protobuf.e0.s
        public String u6() {
            return this.package_;
        }

        @Override // com.google.protobuf.e0.s
        public int w0() {
            return this.enumType_.size();
        }

        @Override // com.google.protobuf.e0.s
        public n0 w3() {
            n0 n0Var = this.sourceCodeInfo_;
            return n0Var == null ? n0.lm() : n0Var;
        }

        @Override // com.google.protobuf.e0.s
        public int x3() {
            return this.service_.size();
        }

        @Override // com.google.protobuf.e0.s
        public List<String> x6() {
            return this.dependency_;
        }

        @Override // com.google.protobuf.e0.s
        public d y0(int i10) {
            return this.enumType_.get(i10);
        }
    }

    public interface s extends o2 {
        List<b> A3();

        boolean D4();

        int I2();

        List<Integer> J6();

        int J7();

        n K0(int i10);

        int K5();

        String M5(int i10);

        int O5(int i10);

        b Q5(int i10);

        List<Integer> T2();

        com.google.protobuf.u Y2();

        boolean Z2();

        com.google.protobuf.u a();

        List<d> a0();

        v b();

        int b6();

        j0 e3(int i10);

        boolean g();

        String getName();

        boolean h();

        boolean l2();

        int m0();

        com.google.protobuf.u n7();

        com.google.protobuf.u o3(int i10);

        String p();

        int q5(int i10);

        List<n> r0();

        List<j0> s4();

        String u6();

        int w0();

        n0 w3();

        int x3();

        List<String> x6();

        d y0(int i10);
    }

    public static final class t extends l1<t, a> implements u {
        private static final t DEFAULT_INSTANCE;
        public static final int FILE_FIELD_NUMBER = 1;
        private static volatile f3<t> PARSER;
        private byte memoizedIsInitialized = 2;
        private s1.k<r> file_ = l1.Ij();

        public static final class a extends l1.b<t, a> implements u {
            /* synthetic */ a(a aVar) {
                this();
            }

            public a Ol(Iterable<? extends r> iterable) {
                El();
                ((t) this.f126038b).gm(iterable);
                return this;
            }

            public a Pl(int i10, r.a aVar) {
                El();
                ((t) this.f126038b).hm(i10, aVar.build());
                return this;
            }

            public a Ql(int i10, r rVar) {
                El();
                ((t) this.f126038b).hm(i10, rVar);
                return this;
            }

            public a Rl(r.a aVar) {
                El();
                ((t) this.f126038b).im(aVar.build());
                return this;
            }

            public a Sl(r rVar) {
                El();
                ((t) this.f126038b).im(rVar);
                return this;
            }

            public a Tl() {
                El();
                ((t) this.f126038b).jm();
                return this;
            }

            public a Ul(int i10) {
                El();
                ((t) this.f126038b).Dm(i10);
                return this;
            }

            public a Vl(int i10, r.a aVar) {
                El();
                ((t) this.f126038b).Em(i10, aVar.build());
                return this;
            }

            public a Wl(int i10, r rVar) {
                El();
                ((t) this.f126038b).Em(i10, rVar);
                return this;
            }

            @Override // com.google.protobuf.e0.u
            public List<r> p5() {
                return Collections.unmodifiableList(((t) this.f126038b).p5());
            }

            @Override // com.google.protobuf.e0.u
            public int r3() {
                return ((t) this.f126038b).r3();
            }

            @Override // com.google.protobuf.e0.u
            public r t3(int i10) {
                return ((t) this.f126038b).t3(i10);
            }

            private a() {
                super(t.DEFAULT_INSTANCE);
            }
        }

        static {
            t tVar = new t();
            DEFAULT_INSTANCE = tVar;
            l1.Wl(t.class, tVar);
        }

        private t() {
        }

        public static t Am(byte[] bArr) throws t1 {
            return (t) l1.Ol(DEFAULT_INSTANCE, bArr);
        }

        public static t Bm(byte[] bArr, v0 v0Var) throws t1 {
            return (t) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
        }

        public static f3<t> Cm() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Dm(int i10) {
            km();
            this.file_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Em(int i10, r rVar) {
            rVar.getClass();
            km();
            this.file_.set(i10, rVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void gm(Iterable<? extends r> iterable) {
            km();
            com.google.protobuf.a.y(iterable, this.file_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void hm(int i10, r rVar) {
            rVar.getClass();
            km();
            this.file_.add(i10, rVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void im(r rVar) {
            rVar.getClass();
            km();
            this.file_.add(rVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void jm() {
            this.file_ = l1.Ij();
        }

        private void km() {
            s1.k<r> kVar = this.file_;
            if (kVar.s1()) {
                return;
            }
            this.file_ = l1.yl(kVar);
        }

        public static t lm() {
            return DEFAULT_INSTANCE;
        }

        public static a om() {
            return DEFAULT_INSTANCE.jf();
        }

        public static a pm(t tVar) {
            return DEFAULT_INSTANCE.Uf(tVar);
        }

        public static t qm(InputStream inputStream) throws IOException {
            return (t) l1.El(DEFAULT_INSTANCE, inputStream);
        }

        public static t rm(InputStream inputStream, v0 v0Var) throws IOException {
            return (t) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static t sm(com.google.protobuf.u uVar) throws t1 {
            return (t) l1.Gl(DEFAULT_INSTANCE, uVar);
        }

        public static t tm(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
            return (t) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
        }

        public static t um(com.google.protobuf.z zVar) throws IOException {
            return (t) l1.Il(DEFAULT_INSTANCE, zVar);
        }

        public static t vm(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
            return (t) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
        }

        public static t wm(InputStream inputStream) throws IOException {
            return (t) l1.Kl(DEFAULT_INSTANCE, inputStream);
        }

        public static t xm(InputStream inputStream, v0 v0Var) throws IOException {
            return (t) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static t ym(ByteBuffer byteBuffer) throws t1 {
            return (t) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
        }

        public static t zm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
            return (t) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
        }

        @Override // com.google.protobuf.l1
        protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
            f3 cVar;
            a aVar = null;
            switch (a.f125834a[iVar.ordinal()]) {
                case 1:
                    return new t();
                case 2:
                    return new a(aVar);
                case 3:
                    return l1.Al(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"file_", r.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f3<t> f3Var = PARSER;
                    if (f3Var != null) {
                        return f3Var;
                    }
                    synchronized (t.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public s mm(int i10) {
            return this.file_.get(i10);
        }

        public List<? extends s> nm() {
            return this.file_;
        }

        @Override // com.google.protobuf.e0.u
        public List<r> p5() {
            return this.file_;
        }

        @Override // com.google.protobuf.e0.u
        public int r3() {
            return this.file_.size();
        }

        @Override // com.google.protobuf.e0.u
        public r t3(int i10) {
            return this.file_.get(i10);
        }
    }

    public interface u extends o2 {
        List<r> p5();

        int r3();

        r t3(int i10);
    }

    public static final class v extends l1.e<v, a> implements w {
        public static final int CC_ENABLE_ARENAS_FIELD_NUMBER = 31;
        public static final int CC_GENERIC_SERVICES_FIELD_NUMBER = 16;
        public static final int CSHARP_NAMESPACE_FIELD_NUMBER = 37;
        private static final v DEFAULT_INSTANCE;
        public static final int DEPRECATED_FIELD_NUMBER = 23;
        public static final int GO_PACKAGE_FIELD_NUMBER = 11;
        public static final int JAVA_GENERATE_EQUALS_AND_HASH_FIELD_NUMBER = 20;
        public static final int JAVA_GENERIC_SERVICES_FIELD_NUMBER = 17;
        public static final int JAVA_MULTIPLE_FILES_FIELD_NUMBER = 10;
        public static final int JAVA_OUTER_CLASSNAME_FIELD_NUMBER = 8;
        public static final int JAVA_PACKAGE_FIELD_NUMBER = 1;
        public static final int JAVA_STRING_CHECK_UTF8_FIELD_NUMBER = 27;
        public static final int OBJC_CLASS_PREFIX_FIELD_NUMBER = 36;
        public static final int OPTIMIZE_FOR_FIELD_NUMBER = 9;
        private static volatile f3<v> PARSER = null;
        public static final int PHP_CLASS_PREFIX_FIELD_NUMBER = 40;
        public static final int PHP_GENERIC_SERVICES_FIELD_NUMBER = 42;
        public static final int PHP_METADATA_NAMESPACE_FIELD_NUMBER = 44;
        public static final int PHP_NAMESPACE_FIELD_NUMBER = 41;
        public static final int PY_GENERIC_SERVICES_FIELD_NUMBER = 18;
        public static final int RUBY_PACKAGE_FIELD_NUMBER = 45;
        public static final int SWIFT_PREFIX_FIELD_NUMBER = 39;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private int bitField0_;
        private boolean ccGenericServices_;
        private boolean deprecated_;
        private boolean javaGenerateEqualsAndHash_;
        private boolean javaGenericServices_;
        private boolean javaMultipleFiles_;
        private boolean javaStringCheckUtf8_;
        private boolean phpGenericServices_;
        private boolean pyGenericServices_;
        private byte memoizedIsInitialized = 2;
        private String javaPackage_ = "";
        private String javaOuterClassname_ = "";
        private int optimizeFor_ = 1;
        private String goPackage_ = "";
        private boolean ccEnableArenas_ = true;
        private String objcClassPrefix_ = "";
        private String csharpNamespace_ = "";
        private String swiftPrefix_ = "";
        private String phpClassPrefix_ = "";
        private String phpNamespace_ = "";
        private String phpMetadataNamespace_ = "";
        private String rubyPackage_ = "";
        private s1.k<p0> uninterpretedOption_ = l1.Ij();

        public static final class a extends l1.d<v, a> implements w {
            /* synthetic */ a(a aVar) {
                this();
            }

            @Override // com.google.protobuf.e0.w
            public boolean A2() {
                return ((v) this.f126038b).A2();
            }

            public a Am(com.google.protobuf.u uVar) {
                El();
                ((v) this.f126038b).oo(uVar);
                return this;
            }

            @Override // com.google.protobuf.e0.w
            public boolean B4() {
                return ((v) this.f126038b).B4();
            }

            @Override // com.google.protobuf.e0.w
            public String B6() {
                return ((v) this.f126038b).B6();
            }

            public a Bm(boolean z10) {
                El();
                ((v) this.f126038b).po(z10);
                return this;
            }

            @Override // com.google.protobuf.e0.w
            public String C5() {
                return ((v) this.f126038b).C5();
            }

            public a Cm(String str) {
                El();
                ((v) this.f126038b).qo(str);
                return this;
            }

            public a Dm(com.google.protobuf.u uVar) {
                El();
                ((v) this.f126038b).ro(uVar);
                return this;
            }

            @Override // com.google.protobuf.e0.w
            public boolean E2() {
                return ((v) this.f126038b).E2();
            }

            @Deprecated
            public a Em(boolean z10) {
                El();
                ((v) this.f126038b).so(z10);
                return this;
            }

            public a Fm(boolean z10) {
                El();
                ((v) this.f126038b).to(z10);
                return this;
            }

            @Override // com.google.protobuf.e0.w
            public String G6() {
                return ((v) this.f126038b).G6();
            }

            public a Gm(boolean z10) {
                El();
                ((v) this.f126038b).uo(z10);
                return this;
            }

            @Override // com.google.protobuf.e0.w
            public com.google.protobuf.u H6() {
                return ((v) this.f126038b).H6();
            }

            public a Hm(String str) {
                El();
                ((v) this.f126038b).vo(str);
                return this;
            }

            public a Im(com.google.protobuf.u uVar) {
                El();
                ((v) this.f126038b).wo(uVar);
                return this;
            }

            public a Jm(String str) {
                El();
                ((v) this.f126038b).xo(str);
                return this;
            }

            @Override // com.google.protobuf.e0.w
            public boolean K3() {
                return ((v) this.f126038b).K3();
            }

            public a Km(com.google.protobuf.u uVar) {
                El();
                ((v) this.f126038b).yo(uVar);
                return this;
            }

            public a Lm(boolean z10) {
                El();
                ((v) this.f126038b).zo(z10);
                return this;
            }

            public a Mm(String str) {
                El();
                ((v) this.f126038b).Ao(str);
                return this;
            }

            @Override // com.google.protobuf.e0.w
            public boolean N2() {
                return ((v) this.f126038b).N2();
            }

            public a Nm(com.google.protobuf.u uVar) {
                El();
                ((v) this.f126038b).Bo(uVar);
                return this;
            }

            @Override // com.google.protobuf.e0.w
            public String O4() {
                return ((v) this.f126038b).O4();
            }

            public a Om(b bVar) {
                El();
                ((v) this.f126038b).Co(bVar);
                return this;
            }

            @Override // com.google.protobuf.e0.w
            public boolean P6() {
                return ((v) this.f126038b).P6();
            }

            public a Pm(String str) {
                El();
                ((v) this.f126038b).Do(str);
                return this;
            }

            public a Qm(com.google.protobuf.u uVar) {
                El();
                ((v) this.f126038b).Eo(uVar);
                return this;
            }

            @Override // com.google.protobuf.e0.w
            public com.google.protobuf.u R2() {
                return ((v) this.f126038b).R2();
            }

            public a Rm(boolean z10) {
                El();
                ((v) this.f126038b).Fo(z10);
                return this;
            }

            @Override // com.google.protobuf.e0.w
            public boolean S2() {
                return ((v) this.f126038b).S2();
            }

            @Override // com.google.protobuf.e0.w
            public boolean S6() {
                return ((v) this.f126038b).S6();
            }

            @Override // com.google.protobuf.e0.w
            public boolean Sc() {
                return ((v) this.f126038b).Sc();
            }

            public a Sm(String str) {
                El();
                ((v) this.f126038b).Go(str);
                return this;
            }

            public a Tm(com.google.protobuf.u uVar) {
                El();
                ((v) this.f126038b).Ho(uVar);
                return this;
            }

            public a Um(String str) {
                El();
                ((v) this.f126038b).Io(str);
                return this;
            }

            @Override // com.google.protobuf.e0.w
            public String V5() {
                return ((v) this.f126038b).V5();
            }

            @Override // com.google.protobuf.e0.w
            @Deprecated
            public boolean V7() {
                return ((v) this.f126038b).V7();
            }

            public a Vm(com.google.protobuf.u uVar) {
                El();
                ((v) this.f126038b).Jo(uVar);
                return this;
            }

            @Override // com.google.protobuf.e0.w
            public b W1() {
                return ((v) this.f126038b).W1();
            }

            @Override // com.google.protobuf.e0.w
            public boolean W6() {
                return ((v) this.f126038b).W6();
            }

            public a Wl(Iterable<? extends p0> iterable) {
                El();
                ((v) this.f126038b).sn(iterable);
                return this;
            }

            public a Wm(boolean z10) {
                El();
                ((v) this.f126038b).Ko(z10);
                return this;
            }

            public a Xl(int i10, p0.a aVar) {
                El();
                ((v) this.f126038b).tn(i10, aVar.build());
                return this;
            }

            public a Xm(String str) {
                El();
                ((v) this.f126038b).Lo(str);
                return this;
            }

            @Override // com.google.protobuf.e0.w
            public boolean Y3() {
                return ((v) this.f126038b).Y3();
            }

            public a Yl(int i10, p0 p0Var) {
                El();
                ((v) this.f126038b).tn(i10, p0Var);
                return this;
            }

            public a Ym(com.google.protobuf.u uVar) {
                El();
                ((v) this.f126038b).Mo(uVar);
                return this;
            }

            public a Zl(p0.a aVar) {
                El();
                ((v) this.f126038b).un(aVar.build());
                return this;
            }

            public a Zm(String str) {
                El();
                ((v) this.f126038b).No(str);
                return this;
            }

            @Override // com.google.protobuf.e0.w
            public com.google.protobuf.u a2() {
                return ((v) this.f126038b).a2();
            }

            @Override // com.google.protobuf.e0.w
            public boolean a4() {
                return ((v) this.f126038b).a4();
            }

            @Override // com.google.protobuf.e0.w
            public String a7() {
                return ((v) this.f126038b).a7();
            }

            @Override // com.google.protobuf.e0.w
            public boolean a8() {
                return ((v) this.f126038b).a8();
            }

            public a am(p0 p0Var) {
                El();
                ((v) this.f126038b).un(p0Var);
                return this;
            }

            public a an(com.google.protobuf.u uVar) {
                El();
                ((v) this.f126038b).Oo(uVar);
                return this;
            }

            @Override // com.google.protobuf.e0.w
            public com.google.protobuf.u b2() {
                return ((v) this.f126038b).b2();
            }

            public a bm() {
                El();
                ((v) this.f126038b).vn();
                return this;
            }

            public a bn(int i10, p0.a aVar) {
                El();
                ((v) this.f126038b).Po(i10, aVar.build());
                return this;
            }

            @Override // com.google.protobuf.e0.w
            public com.google.protobuf.u c4() {
                return ((v) this.f126038b).c4();
            }

            public a cm() {
                El();
                ((v) this.f126038b).wn();
                return this;
            }

            public a cn(int i10, p0 p0Var) {
                El();
                ((v) this.f126038b).Po(i10, p0Var);
                return this;
            }

            @Override // com.google.protobuf.e0.w
            public List<p0> d() {
                return Collections.unmodifiableList(((v) this.f126038b).d());
            }

            @Override // com.google.protobuf.e0.w
            public boolean d7() {
                return ((v) this.f126038b).d7();
            }

            public a dm() {
                El();
                ((v) this.f126038b).xn();
                return this;
            }

            @Override // com.google.protobuf.e0.w
            public p0 e(int i10) {
                return ((v) this.f126038b).e(i10);
            }

            @Override // com.google.protobuf.e0.w
            public String e5() {
                return ((v) this.f126038b).e5();
            }

            @Override // com.google.protobuf.e0.w
            public com.google.protobuf.u e7() {
                return ((v) this.f126038b).e7();
            }

            public a em() {
                El();
                ((v) this.f126038b).yn();
                return this;
            }

            @Override // com.google.protobuf.e0.w
            public int f() {
                return ((v) this.f126038b).f();
            }

            public a fm() {
                El();
                ((v) this.f126038b).zn();
                return this;
            }

            @Override // com.google.protobuf.e0.w
            public boolean g4() {
                return ((v) this.f126038b).g4();
            }

            @Deprecated
            public a gm() {
                El();
                ((v) this.f126038b).An();
                return this;
            }

            @Override // com.google.protobuf.e0.w
            public com.google.protobuf.u h3() {
                return ((v) this.f126038b).h3();
            }

            @Override // com.google.protobuf.e0.w
            public boolean h4() {
                return ((v) this.f126038b).h4();
            }

            @Override // com.google.protobuf.e0.w
            public boolean h5() {
                return ((v) this.f126038b).h5();
            }

            public a hm() {
                El();
                ((v) this.f126038b).Bn();
                return this;
            }

            public a im() {
                El();
                ((v) this.f126038b).Cn();
                return this;
            }

            @Override // com.google.protobuf.e0.w
            public boolean j() {
                return ((v) this.f126038b).j();
            }

            public a jm() {
                El();
                ((v) this.f126038b).Dn();
                return this;
            }

            public a km() {
                El();
                ((v) this.f126038b).En();
                return this;
            }

            @Override // com.google.protobuf.e0.w
            public boolean l() {
                return ((v) this.f126038b).l();
            }

            @Override // com.google.protobuf.e0.w
            public boolean l7() {
                return ((v) this.f126038b).l7();
            }

            public a lm() {
                El();
                ((v) this.f126038b).Fn();
                return this;
            }

            @Override // com.google.protobuf.e0.w
            public String m4() {
                return ((v) this.f126038b).m4();
            }

            public a mm() {
                El();
                ((v) this.f126038b).Gn();
                return this;
            }

            public a nm() {
                El();
                ((v) this.f126038b).Hn();
                return this;
            }

            @Override // com.google.protobuf.e0.w
            public com.google.protobuf.u o4() {
                return ((v) this.f126038b).o4();
            }

            public a om() {
                El();
                ((v) this.f126038b).In();
                return this;
            }

            @Override // com.google.protobuf.e0.w
            public boolean pi() {
                return ((v) this.f126038b).pi();
            }

            public a pm() {
                El();
                ((v) this.f126038b).Jn();
                return this;
            }

            public a qm() {
                El();
                ((v) this.f126038b).Kn();
                return this;
            }

            public a rm() {
                El();
                ((v) this.f126038b).Ln();
                return this;
            }

            @Override // com.google.protobuf.e0.w
            public String s5() {
                return ((v) this.f126038b).s5();
            }

            @Override // com.google.protobuf.e0.w
            public boolean s7() {
                return ((v) this.f126038b).s7();
            }

            public a sm() {
                El();
                ((v) this.f126038b).Mn();
                return this;
            }

            @Override // com.google.protobuf.e0.w
            public boolean t7() {
                return ((v) this.f126038b).t7();
            }

            public a tm() {
                El();
                ((v) this.f126038b).Nn();
                return this;
            }

            @Override // com.google.protobuf.e0.w
            public com.google.protobuf.u u5() {
                return ((v) this.f126038b).u5();
            }

            public a um() {
                El();
                ((v) this.f126038b).On();
                return this;
            }

            @Override // com.google.protobuf.e0.w
            public boolean v2() {
                return ((v) this.f126038b).v2();
            }

            @Override // com.google.protobuf.e0.w
            public boolean v6() {
                return ((v) this.f126038b).v6();
            }

            public a vm() {
                El();
                ((v) this.f126038b).Pn();
                return this;
            }

            @Override // com.google.protobuf.e0.w
            public boolean w5() {
                return ((v) this.f126038b).w5();
            }

            @Override // com.google.protobuf.e0.w
            public com.google.protobuf.u w7() {
                return ((v) this.f126038b).w7();
            }

            public a wm(int i10) {
                El();
                ((v) this.f126038b).ko(i10);
                return this;
            }

            @Override // com.google.protobuf.e0.w
            @Deprecated
            public boolean x7() {
                return ((v) this.f126038b).x7();
            }

            public a xm(boolean z10) {
                El();
                ((v) this.f126038b).lo(z10);
                return this;
            }

            @Override // com.google.protobuf.e0.w
            public boolean y4() {
                return ((v) this.f126038b).y4();
            }

            public a ym(boolean z10) {
                El();
                ((v) this.f126038b).mo(z10);
                return this;
            }

            @Override // com.google.protobuf.e0.w
            public String z2() {
                return ((v) this.f126038b).z2();
            }

            public a zm(String str) {
                El();
                ((v) this.f126038b).no(str);
                return this;
            }

            private a() {
                super(v.DEFAULT_INSTANCE);
            }
        }

        public enum b implements s1.c {
            SPEED(1),
            CODE_SIZE(2),
            LITE_RUNTIME(3);


            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f125914e = 1;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final int f125915f = 2;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final int f125916g = 3;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private static final s1.d<b> f125917h = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f125919a;

            class a implements s1.d<b> {
                a() {
                }

                @Override // com.google.protobuf.s1.d
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public b a(int i10) {
                    return b.l(i10);
                }
            }

            /* JADX INFO: renamed from: com.google.protobuf.e0$v$b$b, reason: collision with other inner class name */
            private static final class C1219b implements s1.e {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                static final s1.e f125920a = new C1219b();

                private C1219b() {
                }

                @Override // com.google.protobuf.s1.e
                public boolean a(int i10) {
                    return b.l(i10) != null;
                }
            }

            b(int i10) {
                this.f125919a = i10;
            }

            public static b l(int i10) {
                if (i10 == 1) {
                    return SPEED;
                }
                if (i10 == 2) {
                    return CODE_SIZE;
                }
                if (i10 != 3) {
                    return null;
                }
                return LITE_RUNTIME;
            }

            public static s1.d<b> n() {
                return f125917h;
            }

            public static s1.e o() {
                return C1219b.f125920a;
            }

            @Deprecated
            public static b p(int i10) {
                return l(i10);
            }

            @Override // com.google.protobuf.s1.c
            public final int i() {
                return this.f125919a;
            }
        }

        static {
            v vVar = new v();
            DEFAULT_INSTANCE = vVar;
            l1.Wl(v.class, vVar);
        }

        private v() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void An() {
            this.bitField0_ &= -9;
            this.javaGenerateEqualsAndHash_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Ao(String str) {
            str.getClass();
            this.bitField0_ |= 8192;
            this.objcClassPrefix_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Bn() {
            this.bitField0_ &= -257;
            this.javaGenericServices_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Bo(com.google.protobuf.u uVar) {
            this.objcClassPrefix_ = uVar.z0();
            this.bitField0_ |= 8192;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Cn() {
            this.bitField0_ &= -5;
            this.javaMultipleFiles_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Co(b bVar) {
            this.optimizeFor_ = bVar.i();
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Dn() {
            this.bitField0_ &= -3;
            this.javaOuterClassname_ = Rn().G6();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Do(String str) {
            str.getClass();
            this.bitField0_ |= 65536;
            this.phpClassPrefix_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void En() {
            this.bitField0_ &= -2;
            this.javaPackage_ = Rn().C5();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Eo(com.google.protobuf.u uVar) {
            this.phpClassPrefix_ = uVar.z0();
            this.bitField0_ |= 65536;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Fn() {
            this.bitField0_ &= -17;
            this.javaStringCheckUtf8_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Fo(boolean z10) {
            this.bitField0_ |= 1024;
            this.phpGenericServices_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Gn() {
            this.bitField0_ &= -8193;
            this.objcClassPrefix_ = Rn().m4();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Go(String str) {
            str.getClass();
            this.bitField0_ |= 262144;
            this.phpMetadataNamespace_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Hn() {
            this.bitField0_ &= -33;
            this.optimizeFor_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Ho(com.google.protobuf.u uVar) {
            this.phpMetadataNamespace_ = uVar.z0();
            this.bitField0_ |= 262144;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void In() {
            this.bitField0_ &= -65537;
            this.phpClassPrefix_ = Rn().a7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Io(String str) {
            str.getClass();
            this.bitField0_ |= 131072;
            this.phpNamespace_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Jn() {
            this.bitField0_ &= -1025;
            this.phpGenericServices_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Jo(com.google.protobuf.u uVar) {
            this.phpNamespace_ = uVar.z0();
            this.bitField0_ |= 131072;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Kn() {
            this.bitField0_ &= -262145;
            this.phpMetadataNamespace_ = Rn().z2();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Ko(boolean z10) {
            this.bitField0_ |= 512;
            this.pyGenericServices_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Ln() {
            this.bitField0_ &= -131073;
            this.phpNamespace_ = Rn().V5();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Lo(String str) {
            str.getClass();
            this.bitField0_ |= 524288;
            this.rubyPackage_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Mn() {
            this.bitField0_ &= -513;
            this.pyGenericServices_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Mo(com.google.protobuf.u uVar) {
            this.rubyPackage_ = uVar.z0();
            this.bitField0_ |= 524288;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Nn() {
            this.bitField0_ &= -524289;
            this.rubyPackage_ = Rn().O4();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void No(String str) {
            str.getClass();
            this.bitField0_ |= 32768;
            this.swiftPrefix_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void On() {
            this.bitField0_ &= -32769;
            this.swiftPrefix_ = Rn().e5();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Oo(com.google.protobuf.u uVar) {
            this.swiftPrefix_ = uVar.z0();
            this.bitField0_ |= 32768;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Pn() {
            this.uninterpretedOption_ = l1.Ij();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Po(int i10, p0 p0Var) {
            p0Var.getClass();
            Qn();
            this.uninterpretedOption_.set(i10, p0Var);
        }

        private void Qn() {
            s1.k<p0> kVar = this.uninterpretedOption_;
            if (kVar.s1()) {
                return;
            }
            this.uninterpretedOption_ = l1.yl(kVar);
        }

        public static v Rn() {
            return DEFAULT_INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a Un() {
            return (a) DEFAULT_INSTANCE.jf();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a Vn(v vVar) {
            return (a) DEFAULT_INSTANCE.Uf(vVar);
        }

        public static v Wn(InputStream inputStream) throws IOException {
            return (v) l1.El(DEFAULT_INSTANCE, inputStream);
        }

        public static v Xn(InputStream inputStream, v0 v0Var) throws IOException {
            return (v) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static v Yn(com.google.protobuf.u uVar) throws t1 {
            return (v) l1.Gl(DEFAULT_INSTANCE, uVar);
        }

        public static v Zn(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
            return (v) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
        }

        public static v ao(com.google.protobuf.z zVar) throws IOException {
            return (v) l1.Il(DEFAULT_INSTANCE, zVar);
        }

        public static v bo(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
            return (v) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
        }

        public static v co(InputStream inputStream) throws IOException {
            return (v) l1.Kl(DEFAULT_INSTANCE, inputStream);
        }

        public static v eo(InputStream inputStream, v0 v0Var) throws IOException {
            return (v) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static v fo(ByteBuffer byteBuffer) throws t1 {
            return (v) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
        }

        public static v go(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
            return (v) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
        }

        public static v ho(byte[] bArr) throws t1 {
            return (v) l1.Ol(DEFAULT_INSTANCE, bArr);
        }

        public static v io(byte[] bArr, v0 v0Var) throws t1 {
            return (v) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
        }

        public static f3<v> jo() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void ko(int i10) {
            Qn();
            this.uninterpretedOption_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lo(boolean z10) {
            this.bitField0_ |= 4096;
            this.ccEnableArenas_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mo(boolean z10) {
            this.bitField0_ |= 128;
            this.ccGenericServices_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void no(String str) {
            str.getClass();
            this.bitField0_ |= 16384;
            this.csharpNamespace_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void oo(com.google.protobuf.u uVar) {
            this.csharpNamespace_ = uVar.z0();
            this.bitField0_ |= 16384;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void po(boolean z10) {
            this.bitField0_ |= 2048;
            this.deprecated_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void qo(String str) {
            str.getClass();
            this.bitField0_ |= 64;
            this.goPackage_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void ro(com.google.protobuf.u uVar) {
            this.goPackage_ = uVar.z0();
            this.bitField0_ |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void sn(Iterable<? extends p0> iterable) {
            Qn();
            com.google.protobuf.a.y(iterable, this.uninterpretedOption_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void so(boolean z10) {
            this.bitField0_ |= 8;
            this.javaGenerateEqualsAndHash_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void tn(int i10, p0 p0Var) {
            p0Var.getClass();
            Qn();
            this.uninterpretedOption_.add(i10, p0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void to(boolean z10) {
            this.bitField0_ |= 256;
            this.javaGenericServices_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void un(p0 p0Var) {
            p0Var.getClass();
            Qn();
            this.uninterpretedOption_.add(p0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void uo(boolean z10) {
            this.bitField0_ |= 4;
            this.javaMultipleFiles_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void vn() {
            this.bitField0_ &= -4097;
            this.ccEnableArenas_ = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void vo(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.javaOuterClassname_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void wn() {
            this.bitField0_ &= -129;
            this.ccGenericServices_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void wo(com.google.protobuf.u uVar) {
            this.javaOuterClassname_ = uVar.z0();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void xn() {
            this.bitField0_ &= -16385;
            this.csharpNamespace_ = Rn().s5();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void xo(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.javaPackage_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void yn() {
            this.bitField0_ &= -2049;
            this.deprecated_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void yo(com.google.protobuf.u uVar) {
            this.javaPackage_ = uVar.z0();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zn() {
            this.bitField0_ &= -65;
            this.goPackage_ = Rn().B6();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zo(boolean z10) {
            this.bitField0_ |= 16;
            this.javaStringCheckUtf8_ = z10;
        }

        @Override // com.google.protobuf.e0.w
        public boolean A2() {
            return this.ccEnableArenas_;
        }

        @Override // com.google.protobuf.e0.w
        public boolean B4() {
            return this.pyGenericServices_;
        }

        @Override // com.google.protobuf.e0.w
        public String B6() {
            return this.goPackage_;
        }

        @Override // com.google.protobuf.e0.w
        public String C5() {
            return this.javaPackage_;
        }

        @Override // com.google.protobuf.e0.w
        public boolean E2() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.e0.w
        public String G6() {
            return this.javaOuterClassname_;
        }

        @Override // com.google.protobuf.e0.w
        public com.google.protobuf.u H6() {
            return com.google.protobuf.u.C(this.rubyPackage_);
        }

        @Override // com.google.protobuf.e0.w
        public boolean K3() {
            return this.javaGenericServices_;
        }

        @Override // com.google.protobuf.e0.w
        public boolean N2() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.google.protobuf.e0.w
        public String O4() {
            return this.rubyPackage_;
        }

        @Override // com.google.protobuf.e0.w
        public boolean P6() {
            return (this.bitField0_ & 32768) != 0;
        }

        @Override // com.google.protobuf.e0.w
        public com.google.protobuf.u R2() {
            return com.google.protobuf.u.C(this.javaOuterClassname_);
        }

        @Override // com.google.protobuf.l1
        protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
            f3 cVar;
            a aVar = null;
            switch (a.f125834a[iVar.ordinal()]) {
                case 1:
                    return new v();
                case 2:
                    return new a(aVar);
                case 3:
                    return l1.Al(DEFAULT_INSTANCE, "\u0001\u0015\u0000\u0001\u0001ϧ\u0015\u0000\u0001\u0001\u0001ဈ\u0000\bဈ\u0001\t᠌\u0005\nဇ\u0002\u000bဈ\u0006\u0010ဇ\u0007\u0011ဇ\b\u0012ဇ\t\u0014ဇ\u0003\u0017ဇ\u000b\u001bဇ\u0004\u001fဇ\f$ဈ\r%ဈ\u000e'ဈ\u000f(ဈ\u0010)ဈ\u0011*ဇ\n,ဈ\u0012-ဈ\u0013ϧЛ", new Object[]{"bitField0_", "javaPackage_", "javaOuterClassname_", "optimizeFor_", b.o(), "javaMultipleFiles_", "goPackage_", "ccGenericServices_", "javaGenericServices_", "pyGenericServices_", "javaGenerateEqualsAndHash_", "deprecated_", "javaStringCheckUtf8_", "ccEnableArenas_", "objcClassPrefix_", "csharpNamespace_", "swiftPrefix_", "phpClassPrefix_", "phpNamespace_", "phpGenericServices_", "phpMetadataNamespace_", "rubyPackage_", "uninterpretedOption_", p0.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f3<v> f3Var = PARSER;
                    if (f3Var != null) {
                        return f3Var;
                    }
                    synchronized (v.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.protobuf.e0.w
        public boolean S2() {
            return this.javaStringCheckUtf8_;
        }

        @Override // com.google.protobuf.e0.w
        public boolean S6() {
            return (this.bitField0_ & 262144) != 0;
        }

        @Override // com.google.protobuf.e0.w
        public boolean Sc() {
            return (this.bitField0_ & 1024) != 0;
        }

        public q0 Sn(int i10) {
            return this.uninterpretedOption_.get(i10);
        }

        public List<? extends q0> Tn() {
            return this.uninterpretedOption_;
        }

        @Override // com.google.protobuf.e0.w
        public String V5() {
            return this.phpNamespace_;
        }

        @Override // com.google.protobuf.e0.w
        @Deprecated
        public boolean V7() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.e0.w
        public b W1() {
            b bVarL = b.l(this.optimizeFor_);
            return bVarL == null ? b.SPEED : bVarL;
        }

        @Override // com.google.protobuf.e0.w
        public boolean W6() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.e0.w
        public boolean Y3() {
            return this.javaMultipleFiles_;
        }

        @Override // com.google.protobuf.e0.w
        public com.google.protobuf.u a2() {
            return com.google.protobuf.u.C(this.csharpNamespace_);
        }

        @Override // com.google.protobuf.e0.w
        public boolean a4() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.e0.w
        public String a7() {
            return this.phpClassPrefix_;
        }

        @Override // com.google.protobuf.e0.w
        public boolean a8() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.google.protobuf.e0.w
        public com.google.protobuf.u b2() {
            return com.google.protobuf.u.C(this.objcClassPrefix_);
        }

        @Override // com.google.protobuf.e0.w
        public com.google.protobuf.u c4() {
            return com.google.protobuf.u.C(this.phpMetadataNamespace_);
        }

        @Override // com.google.protobuf.e0.w
        public List<p0> d() {
            return this.uninterpretedOption_;
        }

        @Override // com.google.protobuf.e0.w
        public boolean d7() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.google.protobuf.e0.w
        public p0 e(int i10) {
            return this.uninterpretedOption_.get(i10);
        }

        @Override // com.google.protobuf.e0.w
        public String e5() {
            return this.swiftPrefix_;
        }

        @Override // com.google.protobuf.e0.w
        public com.google.protobuf.u e7() {
            return com.google.protobuf.u.C(this.swiftPrefix_);
        }

        @Override // com.google.protobuf.e0.w
        public int f() {
            return this.uninterpretedOption_.size();
        }

        @Override // com.google.protobuf.e0.w
        public boolean g4() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.google.protobuf.e0.w
        public com.google.protobuf.u h3() {
            return com.google.protobuf.u.C(this.phpClassPrefix_);
        }

        @Override // com.google.protobuf.e0.w
        public boolean h4() {
            return (this.bitField0_ & 131072) != 0;
        }

        @Override // com.google.protobuf.e0.w
        public boolean h5() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.protobuf.e0.w
        public boolean j() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.google.protobuf.e0.w
        public boolean l() {
            return this.deprecated_;
        }

        @Override // com.google.protobuf.e0.w
        public boolean l7() {
            return (this.bitField0_ & 524288) != 0;
        }

        @Override // com.google.protobuf.e0.w
        public String m4() {
            return this.objcClassPrefix_;
        }

        @Override // com.google.protobuf.e0.w
        public com.google.protobuf.u o4() {
            return com.google.protobuf.u.C(this.phpNamespace_);
        }

        @Override // com.google.protobuf.e0.w
        public boolean pi() {
            return this.phpGenericServices_;
        }

        @Override // com.google.protobuf.e0.w
        public String s5() {
            return this.csharpNamespace_;
        }

        @Override // com.google.protobuf.e0.w
        public boolean s7() {
            return (this.bitField0_ & 65536) != 0;
        }

        @Override // com.google.protobuf.e0.w
        public boolean t7() {
            return this.ccGenericServices_;
        }

        @Override // com.google.protobuf.e0.w
        public com.google.protobuf.u u5() {
            return com.google.protobuf.u.C(this.javaPackage_);
        }

        @Override // com.google.protobuf.e0.w
        public boolean v2() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.google.protobuf.e0.w
        public boolean v6() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.google.protobuf.e0.w
        public boolean w5() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // com.google.protobuf.e0.w
        public com.google.protobuf.u w7() {
            return com.google.protobuf.u.C(this.goPackage_);
        }

        @Override // com.google.protobuf.e0.w
        @Deprecated
        public boolean x7() {
            return this.javaGenerateEqualsAndHash_;
        }

        @Override // com.google.protobuf.e0.w
        public boolean y4() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.google.protobuf.e0.w
        public String z2() {
            return this.phpMetadataNamespace_;
        }
    }

    public interface w extends l1.f<v, v.a> {
        boolean A2();

        boolean B4();

        String B6();

        String C5();

        boolean E2();

        String G6();

        com.google.protobuf.u H6();

        boolean K3();

        boolean N2();

        String O4();

        boolean P6();

        com.google.protobuf.u R2();

        boolean S2();

        boolean S6();

        boolean Sc();

        String V5();

        @Deprecated
        boolean V7();

        v.b W1();

        boolean W6();

        boolean Y3();

        com.google.protobuf.u a2();

        boolean a4();

        String a7();

        boolean a8();

        com.google.protobuf.u b2();

        com.google.protobuf.u c4();

        List<p0> d();

        boolean d7();

        p0 e(int i10);

        String e5();

        com.google.protobuf.u e7();

        int f();

        boolean g4();

        com.google.protobuf.u h3();

        boolean h4();

        boolean h5();

        boolean j();

        boolean l();

        boolean l7();

        String m4();

        com.google.protobuf.u o4();

        boolean pi();

        String s5();

        boolean s7();

        boolean t7();

        com.google.protobuf.u u5();

        boolean v2();

        boolean v6();

        boolean w5();

        com.google.protobuf.u w7();

        @Deprecated
        boolean x7();

        boolean y4();

        String z2();
    }

    public static final class x extends l1<x, c> implements y {
        public static final int ANNOTATION_FIELD_NUMBER = 1;
        private static final x DEFAULT_INSTANCE;
        private static volatile f3<x> PARSER;
        private s1.k<a> annotation_ = l1.Ij();

        public static final class a extends l1<a, C1220a> implements b {
            public static final int BEGIN_FIELD_NUMBER = 3;
            private static final a DEFAULT_INSTANCE;
            public static final int END_FIELD_NUMBER = 4;
            private static volatile f3<a> PARSER = null;
            public static final int PATH_FIELD_NUMBER = 1;
            public static final int SOURCE_FILE_FIELD_NUMBER = 2;
            private int begin_;
            private int bitField0_;
            private int end_;
            private int pathMemoizedSerializedSize = -1;
            private s1.g path_ = l1.gj();
            private String sourceFile_ = "";

            /* JADX INFO: renamed from: com.google.protobuf.e0$x$a$a, reason: collision with other inner class name */
            public static final class C1220a extends l1.b<a, C1220a> implements b {
                /* synthetic */ C1220a(a aVar) {
                    this();
                }

                @Override // com.google.protobuf.e0.x.b
                public int F0() {
                    return ((a) this.f126038b).F0();
                }

                public C1220a Ol(Iterable<? extends Integer> iterable) {
                    El();
                    ((a) this.f126038b).lm(iterable);
                    return this;
                }

                public C1220a Pl(int i10) {
                    El();
                    ((a) this.f126038b).mm(i10);
                    return this;
                }

                public C1220a Ql() {
                    El();
                    ((a) this.f126038b).nm();
                    return this;
                }

                public C1220a Rl() {
                    El();
                    ((a) this.f126038b).om();
                    return this;
                }

                public C1220a Sl() {
                    El();
                    ((a) this.f126038b).pm();
                    return this;
                }

                public C1220a Tl() {
                    El();
                    ((a) this.f126038b).qm();
                    return this;
                }

                public C1220a Ul(int i10) {
                    El();
                    ((a) this.f126038b).Im(i10);
                    return this;
                }

                public C1220a Vl(int i10) {
                    El();
                    ((a) this.f126038b).Jm(i10);
                    return this;
                }

                public C1220a Wl(int i10, int i11) {
                    El();
                    ((a) this.f126038b).Km(i10, i11);
                    return this;
                }

                @Override // com.google.protobuf.e0.x.b
                public String X6() {
                    return ((a) this.f126038b).X6();
                }

                public C1220a Xl(String str) {
                    El();
                    ((a) this.f126038b).Lm(str);
                    return this;
                }

                public C1220a Yl(com.google.protobuf.u uVar) {
                    El();
                    ((a) this.f126038b).Mm(uVar);
                    return this;
                }

                @Override // com.google.protobuf.e0.x.b
                public boolean c7() {
                    return ((a) this.f126038b).c7();
                }

                @Override // com.google.protobuf.e0.x.b
                public int f0(int i10) {
                    return ((a) this.f126038b).f0(i10);
                }

                @Override // com.google.protobuf.e0.x.b
                public com.google.protobuf.u k7() {
                    return ((a) this.f126038b).k7();
                }

                @Override // com.google.protobuf.e0.x.b
                public List<Integer> n0() {
                    return Collections.unmodifiableList(((a) this.f126038b).n0());
                }

                @Override // com.google.protobuf.e0.x.b
                public int v() {
                    return ((a) this.f126038b).v();
                }

                @Override // com.google.protobuf.e0.x.b
                public boolean x() {
                    return ((a) this.f126038b).x();
                }

                @Override // com.google.protobuf.e0.x.b
                public boolean y2() {
                    return ((a) this.f126038b).y2();
                }

                @Override // com.google.protobuf.e0.x.b
                public int z3() {
                    return ((a) this.f126038b).z3();
                }

                private C1220a() {
                    super(a.DEFAULT_INSTANCE);
                }
            }

            static {
                a aVar = new a();
                DEFAULT_INSTANCE = aVar;
                l1.Wl(a.class, aVar);
            }

            private a() {
            }

            public static a Am(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
                return (a) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
            }

            public static a Bm(InputStream inputStream) throws IOException {
                return (a) l1.Kl(DEFAULT_INSTANCE, inputStream);
            }

            public static a Cm(InputStream inputStream, v0 v0Var) throws IOException {
                return (a) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
            }

            public static a Dm(ByteBuffer byteBuffer) throws t1 {
                return (a) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
            }

            public static a Em(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
                return (a) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
            }

            public static a Fm(byte[] bArr) throws t1 {
                return (a) l1.Ol(DEFAULT_INSTANCE, bArr);
            }

            public static a Gm(byte[] bArr, v0 v0Var) throws t1 {
                return (a) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
            }

            public static f3<a> Hm() {
                return DEFAULT_INSTANCE.W7();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void Im(int i10) {
                this.bitField0_ |= 2;
                this.begin_ = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void Jm(int i10) {
                this.bitField0_ |= 4;
                this.end_ = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void Km(int i10, int i11) {
                rm();
                this.path_.X(i10, i11);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void Lm(String str) {
                str.getClass();
                this.bitField0_ |= 1;
                this.sourceFile_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void Mm(com.google.protobuf.u uVar) {
                this.sourceFile_ = uVar.z0();
                this.bitField0_ |= 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void lm(Iterable<? extends Integer> iterable) {
                rm();
                com.google.protobuf.a.y(iterable, this.path_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mm(int i10) {
                rm();
                this.path_.w1(i10);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void nm() {
                this.bitField0_ &= -3;
                this.begin_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void om() {
                this.bitField0_ &= -5;
                this.end_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void pm() {
                this.path_ = l1.gj();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void qm() {
                this.bitField0_ &= -2;
                this.sourceFile_ = sm().X6();
            }

            private void rm() {
                s1.g gVar = this.path_;
                if (gVar.s1()) {
                    return;
                }
                this.path_ = l1.wl(gVar);
            }

            public static a sm() {
                return DEFAULT_INSTANCE;
            }

            public static C1220a tm() {
                return DEFAULT_INSTANCE.jf();
            }

            public static C1220a um(a aVar) {
                return DEFAULT_INSTANCE.Uf(aVar);
            }

            public static a vm(InputStream inputStream) throws IOException {
                return (a) l1.El(DEFAULT_INSTANCE, inputStream);
            }

            public static a wm(InputStream inputStream, v0 v0Var) throws IOException {
                return (a) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
            }

            public static a xm(com.google.protobuf.u uVar) throws t1 {
                return (a) l1.Gl(DEFAULT_INSTANCE, uVar);
            }

            public static a ym(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
                return (a) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
            }

            public static a zm(com.google.protobuf.z zVar) throws IOException {
                return (a) l1.Il(DEFAULT_INSTANCE, zVar);
            }

            @Override // com.google.protobuf.e0.x.b
            public int F0() {
                return this.path_.size();
            }

            @Override // com.google.protobuf.l1
            protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
                f3 cVar;
                int i10 = a.f125834a[iVar.ordinal()];
                a aVar = null;
                switch (i10) {
                    case 1:
                        return new a();
                    case 2:
                        return new C1220a(aVar);
                    case 3:
                        return l1.Al(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001'\u0002ဈ\u0000\u0003င\u0001\u0004င\u0002", new Object[]{"bitField0_", "path_", "sourceFile_", "begin_", "end_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        f3<a> f3Var = PARSER;
                        if (f3Var != null) {
                            return f3Var;
                        }
                        synchronized (a.class) {
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

            @Override // com.google.protobuf.e0.x.b
            public String X6() {
                return this.sourceFile_;
            }

            @Override // com.google.protobuf.e0.x.b
            public boolean c7() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.e0.x.b
            public int f0(int i10) {
                return this.path_.getInt(i10);
            }

            @Override // com.google.protobuf.e0.x.b
            public com.google.protobuf.u k7() {
                return com.google.protobuf.u.C(this.sourceFile_);
            }

            @Override // com.google.protobuf.e0.x.b
            public List<Integer> n0() {
                return this.path_;
            }

            @Override // com.google.protobuf.e0.x.b
            public int v() {
                return this.end_;
            }

            @Override // com.google.protobuf.e0.x.b
            public boolean x() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.e0.x.b
            public boolean y2() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.e0.x.b
            public int z3() {
                return this.begin_;
            }
        }

        public interface b extends o2 {
            int F0();

            String X6();

            boolean c7();

            int f0(int i10);

            com.google.protobuf.u k7();

            List<Integer> n0();

            int v();

            boolean x();

            boolean y2();

            int z3();
        }

        public static final class c extends l1.b<x, c> implements y {
            /* synthetic */ c(a aVar) {
                this();
            }

            public c Ol(Iterable<? extends a> iterable) {
                El();
                ((x) this.f126038b).gm(iterable);
                return this;
            }

            public c Pl(int i10, a.C1220a c1220a) {
                El();
                ((x) this.f126038b).hm(i10, c1220a.build());
                return this;
            }

            @Override // com.google.protobuf.e0.y
            public List<a> Q2() {
                return Collections.unmodifiableList(((x) this.f126038b).Q2());
            }

            public c Ql(int i10, a aVar) {
                El();
                ((x) this.f126038b).hm(i10, aVar);
                return this;
            }

            public c Rl(a.C1220a c1220a) {
                El();
                ((x) this.f126038b).im(c1220a.build());
                return this;
            }

            public c Sl(a aVar) {
                El();
                ((x) this.f126038b).im(aVar);
                return this;
            }

            public c Tl() {
                El();
                ((x) this.f126038b).jm();
                return this;
            }

            public c Ul(int i10) {
                El();
                ((x) this.f126038b).Dm(i10);
                return this;
            }

            public c Vl(int i10, a.C1220a c1220a) {
                El();
                ((x) this.f126038b).Em(i10, c1220a.build());
                return this;
            }

            public c Wl(int i10, a aVar) {
                El();
                ((x) this.f126038b).Em(i10, aVar);
                return this;
            }

            @Override // com.google.protobuf.e0.y
            public a Z3(int i10) {
                return ((x) this.f126038b).Z3(i10);
            }

            @Override // com.google.protobuf.e0.y
            public int c5() {
                return ((x) this.f126038b).c5();
            }

            private c() {
                super(x.DEFAULT_INSTANCE);
            }
        }

        static {
            x xVar = new x();
            DEFAULT_INSTANCE = xVar;
            l1.Wl(x.class, xVar);
        }

        private x() {
        }

        public static x Am(byte[] bArr) throws t1 {
            return (x) l1.Ol(DEFAULT_INSTANCE, bArr);
        }

        public static x Bm(byte[] bArr, v0 v0Var) throws t1 {
            return (x) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
        }

        public static f3<x> Cm() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Dm(int i10) {
            km();
            this.annotation_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Em(int i10, a aVar) {
            aVar.getClass();
            km();
            this.annotation_.set(i10, aVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void gm(Iterable<? extends a> iterable) {
            km();
            com.google.protobuf.a.y(iterable, this.annotation_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void hm(int i10, a aVar) {
            aVar.getClass();
            km();
            this.annotation_.add(i10, aVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void im(a aVar) {
            aVar.getClass();
            km();
            this.annotation_.add(aVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void jm() {
            this.annotation_ = l1.Ij();
        }

        private void km() {
            s1.k<a> kVar = this.annotation_;
            if (kVar.s1()) {
                return;
            }
            this.annotation_ = l1.yl(kVar);
        }

        public static x nm() {
            return DEFAULT_INSTANCE;
        }

        public static c om() {
            return DEFAULT_INSTANCE.jf();
        }

        public static c pm(x xVar) {
            return DEFAULT_INSTANCE.Uf(xVar);
        }

        public static x qm(InputStream inputStream) throws IOException {
            return (x) l1.El(DEFAULT_INSTANCE, inputStream);
        }

        public static x rm(InputStream inputStream, v0 v0Var) throws IOException {
            return (x) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static x sm(com.google.protobuf.u uVar) throws t1 {
            return (x) l1.Gl(DEFAULT_INSTANCE, uVar);
        }

        public static x tm(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
            return (x) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
        }

        public static x um(com.google.protobuf.z zVar) throws IOException {
            return (x) l1.Il(DEFAULT_INSTANCE, zVar);
        }

        public static x vm(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
            return (x) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
        }

        public static x wm(InputStream inputStream) throws IOException {
            return (x) l1.Kl(DEFAULT_INSTANCE, inputStream);
        }

        public static x xm(InputStream inputStream, v0 v0Var) throws IOException {
            return (x) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static x ym(ByteBuffer byteBuffer) throws t1 {
            return (x) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
        }

        public static x zm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
            return (x) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
        }

        @Override // com.google.protobuf.e0.y
        public List<a> Q2() {
            return this.annotation_;
        }

        @Override // com.google.protobuf.l1
        protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
            f3 cVar;
            int i10 = a.f125834a[iVar.ordinal()];
            a aVar = null;
            switch (i10) {
                case 1:
                    return new x();
                case 2:
                    return new c(aVar);
                case 3:
                    return l1.Al(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"annotation_", a.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f3<x> f3Var = PARSER;
                    if (f3Var != null) {
                        return f3Var;
                    }
                    synchronized (x.class) {
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

        @Override // com.google.protobuf.e0.y
        public a Z3(int i10) {
            return this.annotation_.get(i10);
        }

        @Override // com.google.protobuf.e0.y
        public int c5() {
            return this.annotation_.size();
        }

        public b lm(int i10) {
            return this.annotation_.get(i10);
        }

        public List<? extends b> mm() {
            return this.annotation_;
        }
    }

    public interface y extends o2 {
        List<x.a> Q2();

        x.a Z3(int i10);

        int c5();
    }

    public static final class z extends l1.e<z, a> implements a0 {
        private static final z DEFAULT_INSTANCE;
        public static final int DEPRECATED_FIELD_NUMBER = 3;
        public static final int MAP_ENTRY_FIELD_NUMBER = 7;
        public static final int MESSAGE_SET_WIRE_FORMAT_FIELD_NUMBER = 1;
        public static final int NO_STANDARD_DESCRIPTOR_ACCESSOR_FIELD_NUMBER = 2;
        private static volatile f3<z> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private int bitField0_;
        private boolean deprecated_;
        private boolean mapEntry_;
        private boolean messageSetWireFormat_;
        private boolean noStandardDescriptorAccessor_;
        private byte memoizedIsInitialized = 2;
        private s1.k<p0> uninterpretedOption_ = l1.Ij();

        public static final class a extends l1.d<z, a> implements a0 {
            /* synthetic */ a(a aVar) {
                this();
            }

            @Override // com.google.protobuf.e0.a0
            public boolean G4() {
                return ((z) this.f126038b).G4();
            }

            @Override // com.google.protobuf.e0.a0
            public boolean P7() {
                return ((z) this.f126038b).P7();
            }

            @Override // com.google.protobuf.e0.a0
            public boolean T4() {
                return ((z) this.f126038b).T4();
            }

            public a Wl(Iterable<? extends p0> iterable) {
                El();
                ((z) this.f126038b).Cm(iterable);
                return this;
            }

            public a Xl(int i10, p0.a aVar) {
                El();
                ((z) this.f126038b).Dm(i10, aVar.build());
                return this;
            }

            public a Yl(int i10, p0 p0Var) {
                El();
                ((z) this.f126038b).Dm(i10, p0Var);
                return this;
            }

            @Override // com.google.protobuf.e0.a0
            public boolean Z7() {
                return ((z) this.f126038b).Z7();
            }

            public a Zl(p0.a aVar) {
                El();
                ((z) this.f126038b).Em(aVar.build());
                return this;
            }

            public a am(p0 p0Var) {
                El();
                ((z) this.f126038b).Em(p0Var);
                return this;
            }

            public a bm() {
                El();
                ((z) this.f126038b).Fm();
                return this;
            }

            public a cm() {
                El();
                ((z) this.f126038b).Gm();
                return this;
            }

            @Override // com.google.protobuf.e0.a0
            public List<p0> d() {
                return Collections.unmodifiableList(((z) this.f126038b).d());
            }

            public a dm() {
                El();
                ((z) this.f126038b).Hm();
                return this;
            }

            @Override // com.google.protobuf.e0.a0
            public p0 e(int i10) {
                return ((z) this.f126038b).e(i10);
            }

            public a em() {
                El();
                ((z) this.f126038b).Im();
                return this;
            }

            @Override // com.google.protobuf.e0.a0
            public int f() {
                return ((z) this.f126038b).f();
            }

            public a fm() {
                El();
                ((z) this.f126038b).Jm();
                return this;
            }

            @Override // com.google.protobuf.e0.a0
            public boolean g5() {
                return ((z) this.f126038b).g5();
            }

            public a gm(int i10) {
                El();
                ((z) this.f126038b).dn(i10);
                return this;
            }

            public a hm(boolean z10) {
                El();
                ((z) this.f126038b).en(z10);
                return this;
            }

            public a im(boolean z10) {
                El();
                ((z) this.f126038b).fn(z10);
                return this;
            }

            @Override // com.google.protobuf.e0.a0
            public boolean j() {
                return ((z) this.f126038b).j();
            }

            public a jm(boolean z10) {
                El();
                ((z) this.f126038b).gn(z10);
                return this;
            }

            public a km(boolean z10) {
                El();
                ((z) this.f126038b).hn(z10);
                return this;
            }

            @Override // com.google.protobuf.e0.a0
            public boolean l() {
                return ((z) this.f126038b).l();
            }

            public a lm(int i10, p0.a aVar) {
                El();
                ((z) this.f126038b).in(i10, aVar.build());
                return this;
            }

            public a mm(int i10, p0 p0Var) {
                El();
                ((z) this.f126038b).in(i10, p0Var);
                return this;
            }

            @Override // com.google.protobuf.e0.a0
            public boolean v4() {
                return ((z) this.f126038b).v4();
            }

            private a() {
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
        public void Cm(Iterable<? extends p0> iterable) {
            Km();
            com.google.protobuf.a.y(iterable, this.uninterpretedOption_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Dm(int i10, p0 p0Var) {
            p0Var.getClass();
            Km();
            this.uninterpretedOption_.add(i10, p0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Em(p0 p0Var) {
            p0Var.getClass();
            Km();
            this.uninterpretedOption_.add(p0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Fm() {
            this.bitField0_ &= -5;
            this.deprecated_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Gm() {
            this.bitField0_ &= -9;
            this.mapEntry_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Hm() {
            this.bitField0_ &= -2;
            this.messageSetWireFormat_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Im() {
            this.bitField0_ &= -3;
            this.noStandardDescriptorAccessor_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Jm() {
            this.uninterpretedOption_ = l1.Ij();
        }

        private void Km() {
            s1.k<p0> kVar = this.uninterpretedOption_;
            if (kVar.s1()) {
                return;
            }
            this.uninterpretedOption_ = l1.yl(kVar);
        }

        public static z Lm() {
            return DEFAULT_INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a Om() {
            return (a) DEFAULT_INSTANCE.jf();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a Pm(z zVar) {
            return (a) DEFAULT_INSTANCE.Uf(zVar);
        }

        public static z Qm(InputStream inputStream) throws IOException {
            return (z) l1.El(DEFAULT_INSTANCE, inputStream);
        }

        public static z Rm(InputStream inputStream, v0 v0Var) throws IOException {
            return (z) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static z Sm(com.google.protobuf.u uVar) throws t1 {
            return (z) l1.Gl(DEFAULT_INSTANCE, uVar);
        }

        public static z Tm(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
            return (z) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
        }

        public static z Um(com.google.protobuf.z zVar) throws IOException {
            return (z) l1.Il(DEFAULT_INSTANCE, zVar);
        }

        public static z Vm(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
            return (z) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
        }

        public static z Wm(InputStream inputStream) throws IOException {
            return (z) l1.Kl(DEFAULT_INSTANCE, inputStream);
        }

        public static z Xm(InputStream inputStream, v0 v0Var) throws IOException {
            return (z) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static z Ym(ByteBuffer byteBuffer) throws t1 {
            return (z) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
        }

        public static z Zm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
            return (z) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
        }

        public static z an(byte[] bArr) throws t1 {
            return (z) l1.Ol(DEFAULT_INSTANCE, bArr);
        }

        public static z bn(byte[] bArr, v0 v0Var) throws t1 {
            return (z) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
        }

        public static f3<z> cn() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void dn(int i10) {
            Km();
            this.uninterpretedOption_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void en(boolean z10) {
            this.bitField0_ |= 4;
            this.deprecated_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void fn(boolean z10) {
            this.bitField0_ |= 8;
            this.mapEntry_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void gn(boolean z10) {
            this.bitField0_ |= 1;
            this.messageSetWireFormat_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void hn(boolean z10) {
            this.bitField0_ |= 2;
            this.noStandardDescriptorAccessor_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void in(int i10, p0 p0Var) {
            p0Var.getClass();
            Km();
            this.uninterpretedOption_.set(i10, p0Var);
        }

        @Override // com.google.protobuf.e0.a0
        public boolean G4() {
            return this.noStandardDescriptorAccessor_;
        }

        public q0 Mm(int i10) {
            return this.uninterpretedOption_.get(i10);
        }

        public List<? extends q0> Nm() {
            return this.uninterpretedOption_;
        }

        @Override // com.google.protobuf.e0.a0
        public boolean P7() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.l1
        protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
            f3 cVar;
            a aVar = null;
            switch (a.f125834a[iVar.ordinal()]) {
                case 1:
                    return new z();
                case 2:
                    return new a(aVar);
                case 3:
                    return l1.Al(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001ϧ\u0005\u0000\u0001\u0001\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0007ဇ\u0003ϧЛ", new Object[]{"bitField0_", "messageSetWireFormat_", "noStandardDescriptorAccessor_", "deprecated_", "mapEntry_", "uninterpretedOption_", p0.class});
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.protobuf.e0.a0
        public boolean T4() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.e0.a0
        public boolean Z7() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.e0.a0
        public List<p0> d() {
            return this.uninterpretedOption_;
        }

        @Override // com.google.protobuf.e0.a0
        public p0 e(int i10) {
            return this.uninterpretedOption_.get(i10);
        }

        @Override // com.google.protobuf.e0.a0
        public int f() {
            return this.uninterpretedOption_.size();
        }

        @Override // com.google.protobuf.e0.a0
        public boolean g5() {
            return this.mapEntry_;
        }

        @Override // com.google.protobuf.e0.a0
        public boolean j() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.e0.a0
        public boolean l() {
            return this.deprecated_;
        }

        @Override // com.google.protobuf.e0.a0
        public boolean v4() {
            return this.messageSetWireFormat_;
        }
    }

    private e0() {
    }

    public static void a(v0 v0Var) {
    }
}
