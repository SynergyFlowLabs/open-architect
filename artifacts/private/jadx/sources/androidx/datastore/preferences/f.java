package androidx.datastore.preferences;

import androidx.datastore.preferences.protobuf.a5;
import androidx.datastore.preferences.protobuf.h3;
import androidx.datastore.preferences.protobuf.j2;
import androidx.datastore.preferences.protobuf.k2;
import androidx.datastore.preferences.protobuf.l1;
import androidx.datastore.preferences.protobuf.r2;
import androidx.datastore.preferences.protobuf.s1;
import androidx.datastore.preferences.protobuf.t1;
import androidx.datastore.preferences.protobuf.u;
import androidx.datastore.preferences.protobuf.v0;
import androidx.datastore.preferences.protobuf.z;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f49884a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f49884a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f49884a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f49884a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f49884a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f49884a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f49884a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f49884a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1<b, a> implements c {
        private static final b DEFAULT_INSTANCE;
        private static volatile h3<b> PARSER = null;
        public static final int PREFERENCES_FIELD_NUMBER = 1;
        private k2<String, C0442f> preferences_ = k2.f();

        public static final class a extends l1.b<b, a> implements c {
            /* synthetic */ a(a aVar) {
                this();
            }

            public a L4() {
                V3();
                ((b) this.f50422b).A7().clear();
                return this;
            }

            public a P4(Map<String, C0442f> map) {
                V3();
                ((b) this.f50422b).A7().putAll(map);
                return this;
            }

            public a Q4(String str, C0442f c0442f) {
                str.getClass();
                c0442f.getClass();
                V3();
                ((b) this.f50422b).A7().put(str, c0442f);
                return this;
            }

            @Override // androidx.datastore.preferences.f.c
            public int T() {
                return ((b) this.f50422b).p2().size();
            }

            public a U4(String str) {
                str.getClass();
                V3();
                ((b) this.f50422b).A7().remove(str);
                return this;
            }

            @Override // androidx.datastore.preferences.f.c
            public C0442f W0(String str, C0442f c0442f) {
                str.getClass();
                Map<String, C0442f> mapP2 = ((b) this.f50422b).p2();
                return mapP2.containsKey(str) ? mapP2.get(str) : c0442f;
            }

            @Override // androidx.datastore.preferences.f.c
            @Deprecated
            public Map<String, C0442f> c2() {
                return p2();
            }

            @Override // androidx.datastore.preferences.f.c
            public C0442f d1(String str) {
                str.getClass();
                Map<String, C0442f> mapP2 = ((b) this.f50422b).p2();
                if (mapP2.containsKey(str)) {
                    return mapP2.get(str);
                }
                throw new IllegalArgumentException();
            }

            @Override // androidx.datastore.preferences.f.c
            public Map<String, C0442f> p2() {
                return Collections.unmodifiableMap(((b) this.f50422b).p2());
            }

            @Override // androidx.datastore.preferences.f.c
            public boolean y1(String str) {
                str.getClass();
                return ((b) this.f50422b).p2().containsKey(str);
            }

            private a() {
                super(b.DEFAULT_INSTANCE);
            }
        }

        /* JADX INFO: renamed from: androidx.datastore.preferences.f$b$b, reason: collision with other inner class name */
        private static final class C0441b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            static final j2<String, C0442f> f49885a = j2.f(a5.b.f49975k, "", a5.b.f49977m, C0442f.E8());

            private C0441b() {
            }
        }

        static {
            b bVar = new b();
            DEFAULT_INSTANCE = bVar;
            l1.Y6(b.class, bVar);
        }

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, C0442f> A7() {
            return C7();
        }

        private k2<String, C0442f> C7() {
            if (!this.preferences_.j()) {
                this.preferences_ = this.preferences_.n();
            }
            return this.preferences_;
        }

        private k2<String, C0442f> f8() {
            return this.preferences_;
        }

        public static a g8() {
            return DEFAULT_INSTANCE.s3();
        }

        public static a h8(b bVar) {
            return DEFAULT_INSTANCE.v3(bVar);
        }

        public static b j8(InputStream inputStream) throws IOException {
            return (b) l1.J5(DEFAULT_INSTANCE, inputStream);
        }

        public static b k8(InputStream inputStream, v0 v0Var) throws IOException {
            return (b) l1.N5(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static b l8(u uVar) throws t1 {
            return (b) l1.R5(DEFAULT_INSTANCE, uVar);
        }

        public static b m8(u uVar, v0 v0Var) throws t1 {
            return (b) l1.Z5(DEFAULT_INSTANCE, uVar, v0Var);
        }

        public static b n8(z zVar) throws IOException {
            return (b) l1.a6(DEFAULT_INSTANCE, zVar);
        }

        public static b o8(z zVar, v0 v0Var) throws IOException {
            return (b) l1.c6(DEFAULT_INSTANCE, zVar, v0Var);
        }

        public static b p8(InputStream inputStream) throws IOException {
            return (b) l1.d6(DEFAULT_INSTANCE, inputStream);
        }

        public static b q8(InputStream inputStream, v0 v0Var) throws IOException {
            return (b) l1.e6(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static b r8(ByteBuffer byteBuffer) throws t1 {
            return (b) l1.i6(DEFAULT_INSTANCE, byteBuffer);
        }

        public static b s8(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
            return (b) l1.o6(DEFAULT_INSTANCE, byteBuffer, v0Var);
        }

        public static b t8(byte[] bArr) throws t1 {
            return (b) l1.p6(DEFAULT_INSTANCE, bArr);
        }

        public static b u8(byte[] bArr, v0 v0Var) throws t1 {
            return (b) l1.r6(DEFAULT_INSTANCE, bArr, v0Var);
        }

        public static h3<b> v8() {
            return DEFAULT_INSTANCE.W7();
        }

        public static b y7() {
            return DEFAULT_INSTANCE;
        }

        @Override // androidx.datastore.preferences.protobuf.l1
        protected final Object D3(l1.i iVar, Object obj, Object obj2) {
            h3 cVar;
            int i10 = a.f49884a[iVar.ordinal()];
            a aVar = null;
            switch (i10) {
                case 1:
                    return new b();
                case 2:
                    return new a(aVar);
                case 3:
                    return l1.A5(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", C0441b.f49885a});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    h3<b> h3Var = PARSER;
                    if (h3Var != null) {
                        return h3Var;
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

        @Override // androidx.datastore.preferences.f.c
        public int T() {
            return f8().size();
        }

        @Override // androidx.datastore.preferences.f.c
        public C0442f W0(String str, C0442f c0442f) {
            str.getClass();
            k2<String, C0442f> k2VarF8 = f8();
            return k2VarF8.containsKey(str) ? k2VarF8.get(str) : c0442f;
        }

        @Override // androidx.datastore.preferences.f.c
        @Deprecated
        public Map<String, C0442f> c2() {
            return p2();
        }

        @Override // androidx.datastore.preferences.f.c
        public C0442f d1(String str) {
            str.getClass();
            k2<String, C0442f> k2VarF8 = f8();
            if (k2VarF8.containsKey(str)) {
                return k2VarF8.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // androidx.datastore.preferences.f.c
        public Map<String, C0442f> p2() {
            return Collections.unmodifiableMap(f8());
        }

        @Override // androidx.datastore.preferences.f.c
        public boolean y1(String str) {
            str.getClass();
            return f8().containsKey(str);
        }
    }

    public interface c extends r2 {
        int T();

        C0442f W0(String str, C0442f c0442f);

        @Deprecated
        Map<String, C0442f> c2();

        C0442f d1(String str);

        Map<String, C0442f> p2();

        boolean y1(String str);
    }

    public static final class d extends l1<d, a> implements e {
        private static final d DEFAULT_INSTANCE;
        private static volatile h3<d> PARSER = null;
        public static final int STRINGS_FIELD_NUMBER = 1;
        private s1.l<String> strings_ = l1.T3();

        public static final class a extends l1.b<d, a> implements e {
            /* synthetic */ a(a aVar) {
                this();
            }

            public a L4(Iterable<String> iterable) {
                V3();
                ((d) this.f50422b).g8(iterable);
                return this;
            }

            @Override // androidx.datastore.preferences.f.e
            public u O1(int i10) {
                return ((d) this.f50422b).O1(i10);
            }

            public a P4(String str) {
                V3();
                ((d) this.f50422b).h8(str);
                return this;
            }

            public a Q4(u uVar) {
                V3();
                ((d) this.f50422b).j8(uVar);
                return this;
            }

            @Override // androidx.datastore.preferences.f.e
            public int S0() {
                return ((d) this.f50422b).S0();
            }

            public a U4() {
                V3();
                ((d) this.f50422b).k8();
                return this;
            }

            public a Z4(int i10, String str) {
                V3();
                ((d) this.f50422b).C8(i10, str);
                return this;
            }

            @Override // androidx.datastore.preferences.f.e
            public List<String> c1() {
                return Collections.unmodifiableList(((d) this.f50422b).c1());
            }

            @Override // androidx.datastore.preferences.f.e
            public String j2(int i10) {
                return ((d) this.f50422b).j2(i10);
            }

            private a() {
                super(d.DEFAULT_INSTANCE);
            }
        }

        static {
            d dVar = new d();
            DEFAULT_INSTANCE = dVar;
            l1.Y6(d.class, dVar);
        }

        private d() {
        }

        public static d A8(byte[] bArr, v0 v0Var) throws t1 {
            return (d) l1.r6(DEFAULT_INSTANCE, bArr, v0Var);
        }

        public static h3<d> B8() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void C8(int i10, String str) {
            str.getClass();
            l8();
            this.strings_.set(i10, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g8(Iterable<String> iterable) {
            l8();
            androidx.datastore.preferences.protobuf.a.m(iterable, this.strings_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h8(String str) {
            str.getClass();
            l8();
            this.strings_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j8(u uVar) {
            l8();
            this.strings_.add(uVar.A0());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void k8() {
            this.strings_ = l1.T3();
        }

        private void l8() {
            s1.l<String> lVar = this.strings_;
            if (lVar.s1()) {
                return;
            }
            this.strings_ = l1.r5(lVar);
        }

        public static d m8() {
            return DEFAULT_INSTANCE;
        }

        public static a n8() {
            return DEFAULT_INSTANCE.s3();
        }

        public static a o8(d dVar) {
            return DEFAULT_INSTANCE.v3(dVar);
        }

        public static d p8(InputStream inputStream) throws IOException {
            return (d) l1.J5(DEFAULT_INSTANCE, inputStream);
        }

        public static d q8(InputStream inputStream, v0 v0Var) throws IOException {
            return (d) l1.N5(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static d r8(u uVar) throws t1 {
            return (d) l1.R5(DEFAULT_INSTANCE, uVar);
        }

        public static d s8(u uVar, v0 v0Var) throws t1 {
            return (d) l1.Z5(DEFAULT_INSTANCE, uVar, v0Var);
        }

        public static d t8(z zVar) throws IOException {
            return (d) l1.a6(DEFAULT_INSTANCE, zVar);
        }

        public static d u8(z zVar, v0 v0Var) throws IOException {
            return (d) l1.c6(DEFAULT_INSTANCE, zVar, v0Var);
        }

        public static d v8(InputStream inputStream) throws IOException {
            return (d) l1.d6(DEFAULT_INSTANCE, inputStream);
        }

        public static d w8(InputStream inputStream, v0 v0Var) throws IOException {
            return (d) l1.e6(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static d x8(ByteBuffer byteBuffer) throws t1 {
            return (d) l1.i6(DEFAULT_INSTANCE, byteBuffer);
        }

        public static d y8(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
            return (d) l1.o6(DEFAULT_INSTANCE, byteBuffer, v0Var);
        }

        public static d z8(byte[] bArr) throws t1 {
            return (d) l1.p6(DEFAULT_INSTANCE, bArr);
        }

        @Override // androidx.datastore.preferences.protobuf.l1
        protected final Object D3(l1.i iVar, Object obj, Object obj2) {
            h3 cVar;
            int i10 = a.f49884a[iVar.ordinal()];
            a aVar = null;
            switch (i10) {
                case 1:
                    return new d();
                case 2:
                    return new a(aVar);
                case 3:
                    return l1.A5(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    h3<d> h3Var = PARSER;
                    if (h3Var != null) {
                        return h3Var;
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

        @Override // androidx.datastore.preferences.f.e
        public u O1(int i10) {
            return u.C(this.strings_.get(i10));
        }

        @Override // androidx.datastore.preferences.f.e
        public int S0() {
            return this.strings_.size();
        }

        @Override // androidx.datastore.preferences.f.e
        public List<String> c1() {
            return this.strings_;
        }

        @Override // androidx.datastore.preferences.f.e
        public String j2(int i10) {
            return this.strings_.get(i10);
        }
    }

    public interface e extends r2 {
        u O1(int i10);

        int S0();

        List<String> c1();

        String j2(int i10);
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.f$f, reason: collision with other inner class name */
    public static final class C0442f extends l1<C0442f, a> implements g {
        public static final int BOOLEAN_FIELD_NUMBER = 1;
        public static final int BYTES_FIELD_NUMBER = 8;
        private static final C0442f DEFAULT_INSTANCE;
        public static final int DOUBLE_FIELD_NUMBER = 7;
        public static final int FLOAT_FIELD_NUMBER = 2;
        public static final int INTEGER_FIELD_NUMBER = 3;
        public static final int LONG_FIELD_NUMBER = 4;
        private static volatile h3<C0442f> PARSER = null;
        public static final int STRING_FIELD_NUMBER = 5;
        public static final int STRING_SET_FIELD_NUMBER = 6;
        private int valueCase_ = 0;
        private Object value_;

        /* JADX INFO: renamed from: androidx.datastore.preferences.f$f$a */
        public static final class a extends l1.b<C0442f, a> implements g {
            /* synthetic */ a(a aVar) {
                this();
            }

            @Override // androidx.datastore.preferences.f.g
            public b A1() {
                return ((C0442f) this.f50422b).A1();
            }

            public a A5(boolean z10) {
                V3();
                ((C0442f) this.f50422b).V8(z10);
                return this;
            }

            public a B5(u uVar) {
                V3();
                ((C0442f) this.f50422b).W8(uVar);
                return this;
            }

            @Override // androidx.datastore.preferences.f.g
            public float C1() {
                return ((C0442f) this.f50422b).C1();
            }

            @Override // androidx.datastore.preferences.f.g
            public boolean D1() {
                return ((C0442f) this.f50422b).D1();
            }

            public a D5(double d10) {
                V3();
                ((C0442f) this.f50422b).X8(d10);
                return this;
            }

            @Override // androidx.datastore.preferences.f.g
            public int G0() {
                return ((C0442f) this.f50422b).G0();
            }

            public a I5(float f10) {
                V3();
                ((C0442f) this.f50422b).Y8(f10);
                return this;
            }

            @Override // androidx.datastore.preferences.f.g
            public double J1() {
                return ((C0442f) this.f50422b).J1();
            }

            public a J5(int i10) {
                V3();
                ((C0442f) this.f50422b).Z8(i10);
                return this;
            }

            @Override // androidx.datastore.preferences.f.g
            public d L0() {
                return ((C0442f) this.f50422b).L0();
            }

            public a L4() {
                V3();
                ((C0442f) this.f50422b).v8();
                return this;
            }

            @Override // androidx.datastore.preferences.f.g
            public String N1() {
                return ((C0442f) this.f50422b).N1();
            }

            public a P4() {
                V3();
                ((C0442f) this.f50422b).w8();
                return this;
            }

            @Override // androidx.datastore.preferences.f.g
            public boolean Q() {
                return ((C0442f) this.f50422b).Q();
            }

            @Override // androidx.datastore.preferences.f.g
            public boolean Q1() {
                return ((C0442f) this.f50422b).Q1();
            }

            public a Q4() {
                V3();
                ((C0442f) this.f50422b).x8();
                return this;
            }

            public a R5(long j10) {
                V3();
                ((C0442f) this.f50422b).a9(j10);
                return this;
            }

            @Override // androidx.datastore.preferences.f.g
            public u S() {
                return ((C0442f) this.f50422b).S();
            }

            @Override // androidx.datastore.preferences.f.g
            public long U0() {
                return ((C0442f) this.f50422b).U0();
            }

            public a U4() {
                V3();
                ((C0442f) this.f50422b).y8();
                return this;
            }

            @Override // androidx.datastore.preferences.f.g
            public boolean Y1() {
                return ((C0442f) this.f50422b).Y1();
            }

            public a Z4() {
                V3();
                ((C0442f) this.f50422b).z8();
                return this;
            }

            public a Z5(String str) {
                V3();
                ((C0442f) this.f50422b).b9(str);
                return this;
            }

            @Override // androidx.datastore.preferences.f.g
            public boolean a1() {
                return ((C0442f) this.f50422b).a1();
            }

            public a a5() {
                V3();
                ((C0442f) this.f50422b).A8();
                return this;
            }

            public a a6(u uVar) {
                V3();
                ((C0442f) this.f50422b).c9(uVar);
                return this;
            }

            public a b5() {
                V3();
                ((C0442f) this.f50422b).B8();
                return this;
            }

            public a c6(d.a aVar) {
                V3();
                ((C0442f) this.f50422b).d9(aVar.build());
                return this;
            }

            public a d5() {
                V3();
                ((C0442f) this.f50422b).C8();
                return this;
            }

            public a d6(d dVar) {
                V3();
                ((C0442f) this.f50422b).d9(dVar);
                return this;
            }

            @Override // androidx.datastore.preferences.f.g
            public boolean o0() {
                return ((C0442f) this.f50422b).o0();
            }

            @Override // androidx.datastore.preferences.f.g
            public boolean o2() {
                return ((C0442f) this.f50422b).o2();
            }

            @Override // androidx.datastore.preferences.f.g
            public boolean p0() {
                return ((C0442f) this.f50422b).p0();
            }

            @Override // androidx.datastore.preferences.f.g
            public boolean q1() {
                return ((C0442f) this.f50422b).q1();
            }

            public a r5() {
                V3();
                ((C0442f) this.f50422b).D8();
                return this;
            }

            public a y5(d dVar) {
                V3();
                ((C0442f) this.f50422b).F8(dVar);
                return this;
            }

            @Override // androidx.datastore.preferences.f.g
            public u z() {
                return ((C0442f) this.f50422b).z();
            }

            private a() {
                super(C0442f.DEFAULT_INSTANCE);
            }
        }

        /* JADX INFO: renamed from: androidx.datastore.preferences.f$f$b */
        public enum b {
            BOOLEAN(1),
            FLOAT(2),
            INTEGER(3),
            LONG(4),
            STRING(5),
            STRING_SET(6),
            DOUBLE(7),
            BYTES(8),
            VALUE_NOT_SET(0);


            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f49896a;

            static {
                int i10 = 4 ^ 6;
            }

            b(int i10) {
                this.f49896a = i10;
            }

            public static b l(int i10) {
                switch (i10) {
                    case 0:
                        return VALUE_NOT_SET;
                    case 1:
                        return BOOLEAN;
                    case 2:
                        return FLOAT;
                    case 3:
                        return INTEGER;
                    case 4:
                        return LONG;
                    case 5:
                        return STRING;
                    case 6:
                        return STRING_SET;
                    case 7:
                        return DOUBLE;
                    case 8:
                        return BYTES;
                    default:
                        return null;
                }
            }

            @Deprecated
            public static b n(int i10) {
                return l(i10);
            }

            public int i() {
                return this.f49896a;
            }
        }

        static {
            C0442f c0442f = new C0442f();
            DEFAULT_INSTANCE = c0442f;
            l1.Y6(C0442f.class, c0442f);
        }

        private C0442f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void A8() {
            if (this.valueCase_ == 4) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void B8() {
            if (this.valueCase_ == 5) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void C8() {
            if (this.valueCase_ == 6) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void D8() {
            this.valueCase_ = 0;
            this.value_ = null;
        }

        public static C0442f E8() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void F8(d dVar) {
            dVar.getClass();
            if (this.valueCase_ != 6 || this.value_ == d.m8()) {
                this.value_ = dVar;
            } else {
                this.value_ = d.o8((d) this.value_).u4(dVar).B1();
            }
            this.valueCase_ = 6;
        }

        public static a G8() {
            return DEFAULT_INSTANCE.s3();
        }

        public static a H8(C0442f c0442f) {
            return DEFAULT_INSTANCE.v3(c0442f);
        }

        public static C0442f I8(InputStream inputStream) throws IOException {
            return (C0442f) l1.J5(DEFAULT_INSTANCE, inputStream);
        }

        public static C0442f J8(InputStream inputStream, v0 v0Var) throws IOException {
            return (C0442f) l1.N5(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static C0442f K8(u uVar) throws t1 {
            return (C0442f) l1.R5(DEFAULT_INSTANCE, uVar);
        }

        public static C0442f L8(u uVar, v0 v0Var) throws t1 {
            return (C0442f) l1.Z5(DEFAULT_INSTANCE, uVar, v0Var);
        }

        public static C0442f M8(z zVar) throws IOException {
            return (C0442f) l1.a6(DEFAULT_INSTANCE, zVar);
        }

        public static C0442f N8(z zVar, v0 v0Var) throws IOException {
            return (C0442f) l1.c6(DEFAULT_INSTANCE, zVar, v0Var);
        }

        public static C0442f O8(InputStream inputStream) throws IOException {
            return (C0442f) l1.d6(DEFAULT_INSTANCE, inputStream);
        }

        public static C0442f P8(InputStream inputStream, v0 v0Var) throws IOException {
            return (C0442f) l1.e6(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static C0442f Q8(ByteBuffer byteBuffer) throws t1 {
            return (C0442f) l1.i6(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C0442f R8(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
            return (C0442f) l1.o6(DEFAULT_INSTANCE, byteBuffer, v0Var);
        }

        public static C0442f S8(byte[] bArr) throws t1 {
            return (C0442f) l1.p6(DEFAULT_INSTANCE, bArr);
        }

        public static C0442f T8(byte[] bArr, v0 v0Var) throws t1 {
            return (C0442f) l1.r6(DEFAULT_INSTANCE, bArr, v0Var);
        }

        public static h3<C0442f> U8() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void V8(boolean z10) {
            this.valueCase_ = 1;
            this.value_ = Boolean.valueOf(z10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void W8(u uVar) {
            uVar.getClass();
            this.valueCase_ = 8;
            this.value_ = uVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void X8(double d10) {
            this.valueCase_ = 7;
            this.value_ = Double.valueOf(d10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Y8(float f10) {
            this.valueCase_ = 2;
            this.value_ = Float.valueOf(f10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Z8(int i10) {
            this.valueCase_ = 3;
            this.value_ = Integer.valueOf(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a9(long j10) {
            this.valueCase_ = 4;
            this.value_ = Long.valueOf(j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b9(String str) {
            str.getClass();
            this.valueCase_ = 5;
            this.value_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c9(u uVar) {
            this.value_ = uVar.A0();
            this.valueCase_ = 5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d9(d dVar) {
            dVar.getClass();
            this.value_ = dVar;
            this.valueCase_ = 6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void v8() {
            if (this.valueCase_ == 1) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void w8() {
            if (this.valueCase_ == 8) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void x8() {
            if (this.valueCase_ == 7) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void y8() {
            if (this.valueCase_ == 2) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void z8() {
            if (this.valueCase_ == 3) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        @Override // androidx.datastore.preferences.f.g
        public b A1() {
            return b.l(this.valueCase_);
        }

        @Override // androidx.datastore.preferences.f.g
        public float C1() {
            if (this.valueCase_ == 2) {
                return ((Float) this.value_).floatValue();
            }
            return 0.0f;
        }

        @Override // androidx.datastore.preferences.f.g
        public boolean D1() {
            return this.valueCase_ == 3;
        }

        @Override // androidx.datastore.preferences.protobuf.l1
        protected final Object D3(l1.i iVar, Object obj, Object obj2) {
            h3 cVar;
            int i10 = a.f49884a[iVar.ordinal()];
            a aVar = null;
            switch (i10) {
                case 1:
                    return new C0442f();
                case 2:
                    return new a(aVar);
                case 3:
                    return l1.A5(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", d.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    h3<C0442f> h3Var = PARSER;
                    if (h3Var != null) {
                        return h3Var;
                    }
                    synchronized (C0442f.class) {
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

        @Override // androidx.datastore.preferences.f.g
        public int G0() {
            if (this.valueCase_ == 3) {
                return ((Integer) this.value_).intValue();
            }
            return 0;
        }

        @Override // androidx.datastore.preferences.f.g
        public double J1() {
            if (this.valueCase_ == 7) {
                return ((Double) this.value_).doubleValue();
            }
            return 0.0d;
        }

        @Override // androidx.datastore.preferences.f.g
        public d L0() {
            return this.valueCase_ == 6 ? (d) this.value_ : d.m8();
        }

        @Override // androidx.datastore.preferences.f.g
        public String N1() {
            return this.valueCase_ == 5 ? (String) this.value_ : "";
        }

        @Override // androidx.datastore.preferences.f.g
        public boolean Q() {
            if (this.valueCase_ == 1) {
                return ((Boolean) this.value_).booleanValue();
            }
            return false;
        }

        @Override // androidx.datastore.preferences.f.g
        public boolean Q1() {
            return this.valueCase_ == 4;
        }

        @Override // androidx.datastore.preferences.f.g
        public u S() {
            return u.C(this.valueCase_ == 5 ? (String) this.value_ : "");
        }

        @Override // androidx.datastore.preferences.f.g
        public long U0() {
            if (this.valueCase_ == 4) {
                return ((Long) this.value_).longValue();
            }
            return 0L;
        }

        @Override // androidx.datastore.preferences.f.g
        public boolean Y1() {
            return this.valueCase_ == 8;
        }

        @Override // androidx.datastore.preferences.f.g
        public boolean a1() {
            return this.valueCase_ == 7;
        }

        @Override // androidx.datastore.preferences.f.g
        public boolean o0() {
            return this.valueCase_ == 5;
        }

        @Override // androidx.datastore.preferences.f.g
        public boolean o2() {
            return this.valueCase_ == 6;
        }

        @Override // androidx.datastore.preferences.f.g
        public boolean p0() {
            if (this.valueCase_ != 2) {
                return false;
            }
            boolean z10 = !true;
            return true;
        }

        @Override // androidx.datastore.preferences.f.g
        public boolean q1() {
            return this.valueCase_ == 1;
        }

        @Override // androidx.datastore.preferences.f.g
        public u z() {
            return this.valueCase_ == 8 ? (u) this.value_ : u.f50632f;
        }
    }

    public interface g extends r2 {
        C0442f.b A1();

        float C1();

        boolean D1();

        int G0();

        double J1();

        d L0();

        String N1();

        boolean Q();

        boolean Q1();

        u S();

        long U0();

        boolean Y1();

        boolean a1();

        boolean o0();

        boolean o2();

        boolean p0();

        boolean q1();

        u z();
    }

    private f() {
    }

    public static void a(v0 v0Var) {
    }
}
