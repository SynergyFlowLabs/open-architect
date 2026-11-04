package com.google.firebase.encoders.proto;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class f implements com.google.firebase.encoders.f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Charset f122035f = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final com.google.firebase.encoders.d f122036g = com.google.firebase.encoders.d.a("key").b(com.google.firebase.encoders.proto.a.b().d(1).a()).a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final com.google.firebase.encoders.d f122037h = com.google.firebase.encoders.d.a("value").b(com.google.firebase.encoders.proto.a.b().d(2).a()).a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final com.google.firebase.encoders.e<Map.Entry<Object, Object>> f122038i = new com.google.firebase.encoders.e() { // from class: com.google.firebase.encoders.proto.e
        @Override // com.google.firebase.encoders.b
        public final void a(Object obj, com.google.firebase.encoders.f fVar) throws IOException {
            f.b((Map.Entry) obj, fVar);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OutputStream f122039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, com.google.firebase.encoders.e<?>> f122040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<Class<?>, com.google.firebase.encoders.g<?>> f122041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.firebase.encoders.e<Object> f122042d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i f122043e = new i(this);

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f122044a;

        static {
            int[] iArr = new int[d.a.values().length];
            f122044a = iArr;
            try {
                iArr[d.a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f122044a[d.a.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f122044a[d.a.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    f(OutputStream outputStream, Map<Class<?>, com.google.firebase.encoders.e<?>> map, Map<Class<?>, com.google.firebase.encoders.g<?>> map2, com.google.firebase.encoders.e<Object> eVar) {
        this.f122039a = outputStream;
        this.f122040b = map;
        this.f122041c = map2;
        this.f122042d = eVar;
    }

    private <T> f A(com.google.firebase.encoders.e<T> eVar, com.google.firebase.encoders.d dVar, T t10, boolean z10) throws IOException {
        long jZ = z(eVar, t10);
        if (z10 && jZ == 0) {
            return this;
        }
        F((E(dVar) << 3) | 2);
        G(jZ);
        eVar.a(t10, this);
        return this;
    }

    private <T> f B(com.google.firebase.encoders.g<T> gVar, com.google.firebase.encoders.d dVar, T t10, boolean z10) throws IOException {
        this.f122043e.d(dVar, z10);
        gVar.a(t10, this.f122043e);
        return this;
    }

    private static d D(com.google.firebase.encoders.d dVar) {
        d dVar2 = (d) dVar.c(d.class);
        if (dVar2 != null) {
            return dVar2;
        }
        throw new com.google.firebase.encoders.c("Field has no @Protobuf config");
    }

    private static int E(com.google.firebase.encoders.d dVar) {
        d dVar2 = (d) dVar.c(d.class);
        if (dVar2 != null) {
            return dVar2.tag();
        }
        throw new com.google.firebase.encoders.c("Field has no @Protobuf config");
    }

    private void F(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            this.f122039a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f122039a.write(i10 & 127);
    }

    private void G(long j10) throws IOException {
        while (((-128) & j10) != 0) {
            this.f122039a.write((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        this.f122039a.write(((int) j10) & 127);
    }

    public static /* synthetic */ void b(Map.Entry entry, com.google.firebase.encoders.f fVar) throws IOException {
        fVar.o(f122036g, entry.getKey());
        fVar.o(f122037h, entry.getValue());
    }

    private static ByteBuffer y(int i10) {
        return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
    }

    private <T> long z(com.google.firebase.encoders.e<T> eVar, T t10) throws IOException {
        b bVar = new b();
        try {
            OutputStream outputStream = this.f122039a;
            this.f122039a = bVar;
            try {
                eVar.a(t10, this);
                this.f122039a = outputStream;
                long jA = bVar.a();
                bVar.close();
                return jA;
            } catch (Throwable th2) {
                this.f122039a = outputStream;
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                bVar.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    f C(@p0 Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        com.google.firebase.encoders.e<?> eVar = this.f122040b.get(obj.getClass());
        if (eVar != null) {
            eVar.a(obj, this);
            return this;
        }
        throw new com.google.firebase.encoders.c("No encoder for " + obj.getClass());
    }

    @Override // com.google.firebase.encoders.f
    @NonNull
    public com.google.firebase.encoders.f a(@NonNull com.google.firebase.encoders.d dVar) throws IOException {
        throw new com.google.firebase.encoders.c("nested() is not implemented for protobuf encoding.");
    }

    com.google.firebase.encoders.f c(@NonNull com.google.firebase.encoders.d dVar, double d10, boolean z10) throws IOException {
        if (z10 && d10 == 0.0d) {
            return this;
        }
        F((E(dVar) << 3) | 1);
        this.f122039a.write(y(8).putDouble(d10).array());
        return this;
    }

    @Override // com.google.firebase.encoders.f
    @NonNull
    public com.google.firebase.encoders.f d(@NonNull String str, @p0 Object obj) throws IOException {
        return o(com.google.firebase.encoders.d.d(str), obj);
    }

    com.google.firebase.encoders.f e(@NonNull com.google.firebase.encoders.d dVar, float f10, boolean z10) throws IOException {
        if (z10 && f10 == 0.0f) {
            return this;
        }
        F((E(dVar) << 3) | 5);
        this.f122039a.write(y(4).putFloat(f10).array());
        return this;
    }

    @Override // com.google.firebase.encoders.f
    @NonNull
    public com.google.firebase.encoders.f i(@NonNull com.google.firebase.encoders.d dVar, float f10) throws IOException {
        return e(dVar, f10, true);
    }

    @Override // com.google.firebase.encoders.f
    @NonNull
    public com.google.firebase.encoders.f j(@NonNull com.google.firebase.encoders.d dVar, double d10) throws IOException {
        return c(dVar, d10, true);
    }

    @Override // com.google.firebase.encoders.f
    @NonNull
    public com.google.firebase.encoders.f k(@NonNull String str, boolean z10) throws IOException {
        return f(com.google.firebase.encoders.d.d(str), z10);
    }

    @Override // com.google.firebase.encoders.f
    @NonNull
    public com.google.firebase.encoders.f l(@NonNull String str, double d10) throws IOException {
        return j(com.google.firebase.encoders.d.d(str), d10);
    }

    @Override // com.google.firebase.encoders.f
    @NonNull
    public com.google.firebase.encoders.f m(@NonNull String str, long j10) throws IOException {
        return g(com.google.firebase.encoders.d.d(str), j10);
    }

    @Override // com.google.firebase.encoders.f
    @NonNull
    public com.google.firebase.encoders.f n(@NonNull String str, int i10) throws IOException {
        return h(com.google.firebase.encoders.d.d(str), i10);
    }

    @Override // com.google.firebase.encoders.f
    @NonNull
    public com.google.firebase.encoders.f o(@NonNull com.google.firebase.encoders.d dVar, @p0 Object obj) throws IOException {
        return r(dVar, obj, true);
    }

    @Override // com.google.firebase.encoders.f
    @NonNull
    public com.google.firebase.encoders.f p(@p0 Object obj) throws IOException {
        return C(obj);
    }

    @Override // com.google.firebase.encoders.f
    @NonNull
    public com.google.firebase.encoders.f q(@NonNull String str) throws IOException {
        return a(com.google.firebase.encoders.d.d(str));
    }

    com.google.firebase.encoders.f r(@NonNull com.google.firebase.encoders.d dVar, @p0 Object obj, boolean z10) throws IOException {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z10 || charSequence.length() != 0) {
                    F((E(dVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f122035f);
                    F(bytes.length);
                    this.f122039a.write(bytes);
                    return this;
                }
            } else if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    r(dVar, it.next(), false);
                }
            } else if (obj instanceof Map) {
                Iterator it2 = ((Map) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    A(f122038i, dVar, (Map.Entry) it2.next(), false);
                }
            } else {
                if (obj instanceof Double) {
                    return c(dVar, ((Double) obj).doubleValue(), z10);
                }
                if (obj instanceof Float) {
                    return e(dVar, ((Float) obj).floatValue(), z10);
                }
                if (obj instanceof Number) {
                    return v(dVar, ((Number) obj).longValue(), z10);
                }
                if (obj instanceof Boolean) {
                    return x(dVar, ((Boolean) obj).booleanValue(), z10);
                }
                if (!(obj instanceof byte[])) {
                    com.google.firebase.encoders.e<?> eVar = this.f122040b.get(obj.getClass());
                    if (eVar != null) {
                        return A(eVar, dVar, obj, z10);
                    }
                    com.google.firebase.encoders.g<?> gVar = this.f122041c.get(obj.getClass());
                    if (gVar != null) {
                        return B(gVar, dVar, obj, z10);
                    }
                    if (obj instanceof c) {
                        return h(dVar, ((c) obj).i());
                    }
                    return obj instanceof Enum ? h(dVar, ((Enum) obj).ordinal()) : A(this.f122042d, dVar, obj, z10);
                }
                byte[] bArr = (byte[]) obj;
                if (!z10 || bArr.length != 0) {
                    F((E(dVar) << 3) | 2);
                    F(bArr.length);
                    this.f122039a.write(bArr);
                    return this;
                }
            }
        }
        return this;
    }

    @Override // com.google.firebase.encoders.f
    @NonNull
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public f h(@NonNull com.google.firebase.encoders.d dVar, int i10) throws IOException {
        return t(dVar, i10, true);
    }

    f t(@NonNull com.google.firebase.encoders.d dVar, int i10, boolean z10) throws IOException {
        if (!z10 || i10 != 0) {
            d dVarD = D(dVar);
            int i11 = a.f122044a[dVarD.intEncoding().ordinal()];
            if (i11 == 1) {
                F(dVarD.tag() << 3);
                F(i10);
                return this;
            }
            if (i11 == 2) {
                F(dVarD.tag() << 3);
                F((i10 << 1) ^ (i10 >> 31));
                return this;
            }
            if (i11 == 3) {
                F((dVarD.tag() << 3) | 5);
                this.f122039a.write(y(4).putInt(i10).array());
                return this;
            }
        }
        return this;
    }

    @Override // com.google.firebase.encoders.f
    @NonNull
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public f g(@NonNull com.google.firebase.encoders.d dVar, long j10) throws IOException {
        return v(dVar, j10, true);
    }

    f v(@NonNull com.google.firebase.encoders.d dVar, long j10, boolean z10) throws IOException {
        if (!z10 || j10 != 0) {
            d dVarD = D(dVar);
            int i10 = a.f122044a[dVarD.intEncoding().ordinal()];
            if (i10 == 1) {
                F(dVarD.tag() << 3);
                G(j10);
                return this;
            }
            if (i10 == 2) {
                F(dVarD.tag() << 3);
                G((j10 >> 63) ^ (j10 << 1));
                return this;
            }
            if (i10 == 3) {
                F((dVarD.tag() << 3) | 1);
                this.f122039a.write(y(8).putLong(j10).array());
                return this;
            }
        }
        return this;
    }

    @Override // com.google.firebase.encoders.f
    @NonNull
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public f f(@NonNull com.google.firebase.encoders.d dVar, boolean z10) throws IOException {
        return x(dVar, z10, true);
    }

    f x(@NonNull com.google.firebase.encoders.d dVar, boolean z10, boolean z11) throws IOException {
        return t(dVar, z10 ? 1 : 0, z11);
    }
}
