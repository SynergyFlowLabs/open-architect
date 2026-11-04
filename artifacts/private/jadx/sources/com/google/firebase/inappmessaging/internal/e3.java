package com.google.firebase.inappmessaging.internal;

import com.google.protobuf.x4;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class e3 {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f122621a;

        static {
            int[] iArr = new int[com.google.protobuf.l1.i.values().length];
            f122621a = iArr;
            try {
                iArr[com.google.protobuf.l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f122621a[com.google.protobuf.l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f122621a[com.google.protobuf.l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f122621a[com.google.protobuf.l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f122621a[com.google.protobuf.l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f122621a[com.google.protobuf.l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f122621a[com.google.protobuf.l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends com.google.protobuf.l1<b, a> implements c {
        private static final b DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.f3<b> PARSER = null;
        public static final int START_TIME_EPOCH_FIELD_NUMBER = 2;
        public static final int VALUE_FIELD_NUMBER = 1;
        private long startTimeEpoch_;
        private long value_;

        public static final class a extends com.google.protobuf.l1.b<b, a> implements c {
            /* synthetic */ a(a aVar) {
                this();
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

            public a Ql(long j10) {
                El();
                ((b) this.f126038b).wm(j10);
                return this;
            }

            public a Rl(long j10) {
                El();
                ((b) this.f126038b).xm(j10);
                return this;
            }

            @Override // com.google.firebase.inappmessaging.internal.e3.c
            public long cf() {
                return ((b) this.f126038b).cf();
            }

            @Override // com.google.firebase.inappmessaging.internal.e3.c
            public long getValue() {
                return ((b) this.f126038b).getValue();
            }

            private a() {
                super(b.DEFAULT_INSTANCE);
            }
        }

        static {
            b bVar = new b();
            DEFAULT_INSTANCE = bVar;
            com.google.protobuf.l1.Wl(b.class, bVar);
        }

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void em() {
            this.startTimeEpoch_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void fm() {
            this.value_ = 0L;
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
            return (b) com.google.protobuf.l1.El(DEFAULT_INSTANCE, inputStream);
        }

        public static b km(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
            return (b) com.google.protobuf.l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static b lm(com.google.protobuf.u uVar) throws com.google.protobuf.t1 {
            return (b) com.google.protobuf.l1.Gl(DEFAULT_INSTANCE, uVar);
        }

        public static b mm(com.google.protobuf.u uVar, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
            return (b) com.google.protobuf.l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
        }

        public static b nm(com.google.protobuf.z zVar) throws IOException {
            return (b) com.google.protobuf.l1.Il(DEFAULT_INSTANCE, zVar);
        }

        public static b om(com.google.protobuf.z zVar, com.google.protobuf.v0 v0Var) throws IOException {
            return (b) com.google.protobuf.l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
        }

        public static b pm(InputStream inputStream) throws IOException {
            return (b) com.google.protobuf.l1.Kl(DEFAULT_INSTANCE, inputStream);
        }

        public static b qm(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
            return (b) com.google.protobuf.l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static b rm(ByteBuffer byteBuffer) throws com.google.protobuf.t1 {
            return (b) com.google.protobuf.l1.Ml(DEFAULT_INSTANCE, byteBuffer);
        }

        public static b sm(ByteBuffer byteBuffer, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
            return (b) com.google.protobuf.l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
        }

        public static b tm(byte[] bArr) throws com.google.protobuf.t1 {
            return (b) com.google.protobuf.l1.Ol(DEFAULT_INSTANCE, bArr);
        }

        public static b um(byte[] bArr, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
            return (b) com.google.protobuf.l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
        }

        public static com.google.protobuf.f3<b> vm() {
            return DEFAULT_INSTANCE.W7();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void wm(long j10) {
            this.startTimeEpoch_ = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void xm(long j10) {
            this.value_ = j10;
        }

        @Override // com.google.protobuf.l1
        protected final Object Rg(com.google.protobuf.l1.i iVar, Object obj, Object obj2) {
            com.google.protobuf.f3 cVar;
            int i10 = a.f122621a[iVar.ordinal()];
            a aVar = null;
            switch (i10) {
                case 1:
                    return new b();
                case 2:
                    return new a(aVar);
                case 3:
                    return com.google.protobuf.l1.Al(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0002", new Object[]{"value_", "startTimeEpoch_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.f3<b> f3Var = PARSER;
                    if (f3Var != null) {
                        return f3Var;
                    }
                    synchronized (b.class) {
                        try {
                            cVar = PARSER;
                            if (cVar == null) {
                                cVar = new com.google.protobuf.l1.c(DEFAULT_INSTANCE);
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

        @Override // com.google.firebase.inappmessaging.internal.e3.c
        public long cf() {
            return this.startTimeEpoch_;
        }

        @Override // com.google.firebase.inappmessaging.internal.e3.c
        public long getValue() {
            return this.value_;
        }
    }

    public interface c extends com.google.protobuf.o2 {
        long cf();

        long getValue();
    }

    public static final class d extends com.google.protobuf.l1<d, a> implements e {
        private static final d DEFAULT_INSTANCE;
        public static final int LIMITS_FIELD_NUMBER = 1;
        private static volatile com.google.protobuf.f3<d> PARSER;
        private com.google.protobuf.h2<String, b> limits_ = com.google.protobuf.h2.f();

        public static final class a extends com.google.protobuf.l1.b<d, a> implements e {
            /* synthetic */ a(a aVar) {
                this();
            }

            @Override // com.google.firebase.inappmessaging.internal.e3.e
            public boolean Ih(String str) {
                str.getClass();
                return ((d) this.f126038b).db().containsKey(str);
            }

            @Override // com.google.firebase.inappmessaging.internal.e3.e
            public b Jf(String str) {
                str.getClass();
                Map<String, b> mapDb = ((d) this.f126038b).db();
                if (mapDb.containsKey(str)) {
                    return mapDb.get(str);
                }
                throw new IllegalArgumentException();
            }

            @Override // com.google.firebase.inappmessaging.internal.e3.e
            public b O8(String str, b bVar) {
                str.getClass();
                Map<String, b> mapDb = ((d) this.f126038b).db();
                return mapDb.containsKey(str) ? mapDb.get(str) : bVar;
            }

            public a Ol() {
                El();
                ((d) this.f126038b).cm().clear();
                return this;
            }

            public a Pl(Map<String, b> map) {
                El();
                ((d) this.f126038b).cm().putAll(map);
                return this;
            }

            public a Ql(String str, b bVar) {
                str.getClass();
                bVar.getClass();
                El();
                ((d) this.f126038b).cm().put(str, bVar);
                return this;
            }

            public a Rl(String str) {
                str.getClass();
                El();
                ((d) this.f126038b).cm().remove(str);
                return this;
            }

            @Override // com.google.firebase.inappmessaging.internal.e3.e
            public Map<String, b> db() {
                return Collections.unmodifiableMap(((d) this.f126038b).db());
            }

            @Override // com.google.firebase.inappmessaging.internal.e3.e
            public int j7() {
                return ((d) this.f126038b).db().size();
            }

            @Override // com.google.firebase.inappmessaging.internal.e3.e
            @Deprecated
            public Map<String, b> rd() {
                return db();
            }

            private a() {
                super(d.DEFAULT_INSTANCE);
            }
        }

        private static final class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            static final com.google.protobuf.g2<String, b> f122622a = com.google.protobuf.g2.f(x4.b.f126490k, "", x4.b.f126492m, b.gm());

            private b() {
            }
        }

        static {
            d dVar = new d();
            DEFAULT_INSTANCE = dVar;
            com.google.protobuf.l1.Wl(d.class, dVar);
        }

        private d() {
        }

        public static d bm() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, b> cm() {
            return em();
        }

        private com.google.protobuf.h2<String, b> dm() {
            return this.limits_;
        }

        private com.google.protobuf.h2<String, b> em() {
            if (!this.limits_.j()) {
                this.limits_ = this.limits_.n();
            }
            return this.limits_;
        }

        public static a fm() {
            return DEFAULT_INSTANCE.jf();
        }

        public static a gm(d dVar) {
            return DEFAULT_INSTANCE.Uf(dVar);
        }

        public static d hm(InputStream inputStream) throws IOException {
            return (d) com.google.protobuf.l1.El(DEFAULT_INSTANCE, inputStream);
        }

        public static d im(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
            return (d) com.google.protobuf.l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static d jm(com.google.protobuf.u uVar) throws com.google.protobuf.t1 {
            return (d) com.google.protobuf.l1.Gl(DEFAULT_INSTANCE, uVar);
        }

        public static d km(com.google.protobuf.u uVar, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
            return (d) com.google.protobuf.l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
        }

        public static d lm(com.google.protobuf.z zVar) throws IOException {
            return (d) com.google.protobuf.l1.Il(DEFAULT_INSTANCE, zVar);
        }

        public static d mm(com.google.protobuf.z zVar, com.google.protobuf.v0 v0Var) throws IOException {
            return (d) com.google.protobuf.l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
        }

        public static d nm(InputStream inputStream) throws IOException {
            return (d) com.google.protobuf.l1.Kl(DEFAULT_INSTANCE, inputStream);
        }

        public static d om(InputStream inputStream, com.google.protobuf.v0 v0Var) throws IOException {
            return (d) com.google.protobuf.l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
        }

        public static d pm(ByteBuffer byteBuffer) throws com.google.protobuf.t1 {
            return (d) com.google.protobuf.l1.Ml(DEFAULT_INSTANCE, byteBuffer);
        }

        public static d qm(ByteBuffer byteBuffer, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
            return (d) com.google.protobuf.l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
        }

        public static d rm(byte[] bArr) throws com.google.protobuf.t1 {
            return (d) com.google.protobuf.l1.Ol(DEFAULT_INSTANCE, bArr);
        }

        public static d sm(byte[] bArr, com.google.protobuf.v0 v0Var) throws com.google.protobuf.t1 {
            return (d) com.google.protobuf.l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
        }

        public static com.google.protobuf.f3<d> tm() {
            return DEFAULT_INSTANCE.W7();
        }

        @Override // com.google.firebase.inappmessaging.internal.e3.e
        public boolean Ih(String str) {
            str.getClass();
            return dm().containsKey(str);
        }

        @Override // com.google.firebase.inappmessaging.internal.e3.e
        public b Jf(String str) {
            str.getClass();
            com.google.protobuf.h2<String, b> h2VarDm = dm();
            if (h2VarDm.containsKey(str)) {
                return h2VarDm.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // com.google.firebase.inappmessaging.internal.e3.e
        public b O8(String str, b bVar) {
            str.getClass();
            com.google.protobuf.h2<String, b> h2VarDm = dm();
            return h2VarDm.containsKey(str) ? h2VarDm.get(str) : bVar;
        }

        @Override // com.google.protobuf.l1
        protected final Object Rg(com.google.protobuf.l1.i iVar, Object obj, Object obj2) {
            com.google.protobuf.f3 cVar;
            int i10 = a.f122621a[iVar.ordinal()];
            a aVar = null;
            switch (i10) {
                case 1:
                    return new d();
                case 2:
                    return new a(aVar);
                case 3:
                    return com.google.protobuf.l1.Al(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"limits_", b.f122622a});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.f3<d> f3Var = PARSER;
                    if (f3Var != null) {
                        return f3Var;
                    }
                    synchronized (d.class) {
                        try {
                            cVar = PARSER;
                            if (cVar == null) {
                                cVar = new com.google.protobuf.l1.c(DEFAULT_INSTANCE);
                                PARSER = cVar;
                            }
                        } finally {
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

        @Override // com.google.firebase.inappmessaging.internal.e3.e
        public Map<String, b> db() {
            return Collections.unmodifiableMap(dm());
        }

        @Override // com.google.firebase.inappmessaging.internal.e3.e
        public int j7() {
            return dm().size();
        }

        @Override // com.google.firebase.inappmessaging.internal.e3.e
        @Deprecated
        public Map<String, b> rd() {
            return db();
        }
    }

    public interface e extends com.google.protobuf.o2 {
        boolean Ih(String str);

        b Jf(String str);

        b O8(String str, b bVar);

        Map<String, b> db();

        int j7();

        @Deprecated
        Map<String, b> rd();
    }

    private e3() {
    }

    public static void a(com.google.protobuf.v0 v0Var) {
    }
}
