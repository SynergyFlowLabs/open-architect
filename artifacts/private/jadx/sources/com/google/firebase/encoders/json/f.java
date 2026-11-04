package com.google.firebase.encoders.json;

import android.util.Base64;
import android.util.JsonWriter;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class f implements com.google.firebase.encoders.f, com.google.firebase.encoders.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private f f122021a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f122022b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final JsonWriter f122023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<Class<?>, com.google.firebase.encoders.e<?>> f122024d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<Class<?>, com.google.firebase.encoders.g<?>> f122025e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.firebase.encoders.e<Object> f122026f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f122027g;

    f(@NonNull Writer writer, @NonNull Map<Class<?>, com.google.firebase.encoders.e<?>> map, @NonNull Map<Class<?>, com.google.firebase.encoders.g<?>> map2, com.google.firebase.encoders.e<Object> eVar, boolean z10) {
        this.f122023c = new JsonWriter(writer);
        this.f122024d = map;
        this.f122025e = map2;
        this.f122026f = eVar;
        this.f122027g = z10;
    }

    private boolean F(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    private f I(@NonNull String str, @p0 Object obj) throws IOException, com.google.firebase.encoders.c {
        K();
        this.f122023c.name(str);
        if (obj != null) {
            return v(obj, false);
        }
        this.f122023c.nullValue();
        return this;
    }

    private f J(@NonNull String str, @p0 Object obj) throws IOException, com.google.firebase.encoders.c {
        if (obj == null) {
            return this;
        }
        K();
        this.f122023c.name(str);
        return v(obj, false);
    }

    private void K() throws IOException {
        if (!this.f122022b) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        f fVar = this.f122021a;
        if (fVar != null) {
            fVar.K();
            boolean z10 = false & false;
            this.f122021a.f122022b = false;
            this.f122021a = null;
            this.f122023c.endObject();
        }
    }

    @Override // com.google.firebase.encoders.f
    @NonNull
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public f m(@NonNull String str, long j10) throws IOException {
        K();
        this.f122023c.name(str);
        return add(j10);
    }

    @Override // com.google.firebase.encoders.f
    @NonNull
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public f d(@NonNull String str, @p0 Object obj) throws IOException {
        return this.f122027g ? J(str, obj) : I(str, obj);
    }

    @Override // com.google.firebase.encoders.f
    @NonNull
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public f k(@NonNull String str, boolean z10) throws IOException {
        K();
        this.f122023c.name(str);
        return c(z10);
    }

    @Override // com.google.firebase.encoders.h
    @NonNull
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public f c(boolean z10) throws IOException {
        K();
        this.f122023c.value(z10);
        return this;
    }

    @Override // com.google.firebase.encoders.h
    @NonNull
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public f x(@p0 byte[] bArr) throws IOException {
        K();
        if (bArr == null) {
            this.f122023c.nullValue();
            return this;
        }
        this.f122023c.value(Base64.encodeToString(bArr, 2));
        return this;
    }

    void G() throws IOException {
        K();
        this.f122023c.flush();
    }

    f H(com.google.firebase.encoders.e<Object> eVar, Object obj, boolean z10) throws IOException {
        if (!z10) {
            this.f122023c.beginObject();
        }
        eVar.a(obj, this);
        if (!z10) {
            this.f122023c.endObject();
        }
        return this;
    }

    @Override // com.google.firebase.encoders.f
    @NonNull
    public com.google.firebase.encoders.f a(@NonNull com.google.firebase.encoders.d dVar) throws IOException {
        return q(dVar.b());
    }

    @Override // com.google.firebase.encoders.f
    @NonNull
    public com.google.firebase.encoders.f f(@NonNull com.google.firebase.encoders.d dVar, boolean z10) throws IOException {
        return k(dVar.b(), z10);
    }

    @Override // com.google.firebase.encoders.f
    @NonNull
    public com.google.firebase.encoders.f g(@NonNull com.google.firebase.encoders.d dVar, long j10) throws IOException {
        return m(dVar.b(), j10);
    }

    @Override // com.google.firebase.encoders.f
    @NonNull
    public com.google.firebase.encoders.f h(@NonNull com.google.firebase.encoders.d dVar, int i10) throws IOException {
        return n(dVar.b(), i10);
    }

    @Override // com.google.firebase.encoders.f
    @NonNull
    public com.google.firebase.encoders.f i(@NonNull com.google.firebase.encoders.d dVar, float f10) throws IOException {
        return l(dVar.b(), f10);
    }

    @Override // com.google.firebase.encoders.f
    @NonNull
    public com.google.firebase.encoders.f j(@NonNull com.google.firebase.encoders.d dVar, double d10) throws IOException {
        return l(dVar.b(), d10);
    }

    @Override // com.google.firebase.encoders.f
    @NonNull
    public com.google.firebase.encoders.f o(@NonNull com.google.firebase.encoders.d dVar, @p0 Object obj) throws IOException {
        return d(dVar.b(), obj);
    }

    @Override // com.google.firebase.encoders.f
    @NonNull
    public com.google.firebase.encoders.f p(@p0 Object obj) throws IOException {
        return v(obj, true);
    }

    @Override // com.google.firebase.encoders.f
    @NonNull
    public com.google.firebase.encoders.f q(@NonNull String str) throws IOException {
        K();
        this.f122021a = new f(this);
        this.f122023c.name(str);
        this.f122023c.beginObject();
        return this.f122021a;
    }

    @Override // com.google.firebase.encoders.h
    @NonNull
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public f add(double d10) throws IOException {
        K();
        this.f122023c.value(d10);
        return this;
    }

    @Override // com.google.firebase.encoders.h
    @NonNull
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public f e(float f10) throws IOException {
        K();
        this.f122023c.value(f10);
        return this;
    }

    @Override // com.google.firebase.encoders.h
    @NonNull
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public f add(int i10) throws IOException {
        K();
        this.f122023c.value(i10);
        return this;
    }

    @Override // com.google.firebase.encoders.h
    @NonNull
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public f add(long j10) throws IOException {
        K();
        this.f122023c.value(j10);
        return this;
    }

    @NonNull
    f v(@p0 Object obj, boolean z10) throws IOException {
        if (z10 && F(obj)) {
            throw new com.google.firebase.encoders.c(String.format("%s cannot be encoded inline", obj == null ? null : obj.getClass()));
        }
        if (obj == null) {
            this.f122023c.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.f122023c.value((Number) obj);
            return this;
        }
        int i10 = 0;
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.f122023c.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    v(it.next(), false);
                }
                this.f122023c.endArray();
                return this;
            }
            if (obj instanceof Map) {
                this.f122023c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        d((String) key, entry.getValue());
                    } catch (ClassCastException e10) {
                        throw new com.google.firebase.encoders.c(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e10);
                    }
                }
                this.f122023c.endObject();
                return this;
            }
            com.google.firebase.encoders.e<?> eVar = this.f122024d.get(obj.getClass());
            if (eVar != null) {
                return H(eVar, obj, z10);
            }
            com.google.firebase.encoders.g<?> gVar = this.f122025e.get(obj.getClass());
            if (gVar != null) {
                gVar.a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                return H(this.f122026f, obj, z10);
            }
            if (obj instanceof g) {
                add(((g) obj).i());
                return this;
            }
            b(((Enum) obj).name());
            return this;
        }
        if (obj instanceof byte[]) {
            return x((byte[]) obj);
        }
        this.f122023c.beginArray();
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length = iArr.length;
            while (i10 < length) {
                this.f122023c.value(iArr[i10]);
                i10++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i10 < length2) {
                add(jArr[i10]);
                i10++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i10 < length3) {
                this.f122023c.value(dArr[i10]);
                i10++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i10 < length4) {
                this.f122023c.value(zArr[i10]);
                i10++;
            }
        } else if (obj instanceof Number[]) {
            for (Number number : (Number[]) obj) {
                v(number, false);
            }
        } else {
            for (Object obj2 : (Object[]) obj) {
                v(obj2, false);
            }
        }
        this.f122023c.endArray();
        return this;
    }

    @Override // com.google.firebase.encoders.h
    @NonNull
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public f b(@p0 String str) throws IOException {
        K();
        this.f122023c.value(str);
        return this;
    }

    @Override // com.google.firebase.encoders.f
    @NonNull
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public f l(@NonNull String str, double d10) throws IOException {
        K();
        this.f122023c.name(str);
        return add(d10);
    }

    @Override // com.google.firebase.encoders.f
    @NonNull
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public f n(@NonNull String str, int i10) throws IOException {
        K();
        this.f122023c.name(str);
        return add(i10);
    }

    private f(f fVar) {
        this.f122023c = fVar.f122023c;
        this.f122024d = fVar.f122024d;
        this.f122025e = fVar.f122025e;
        this.f122026f = fVar.f122026f;
        this.f122027g = fVar.f122027g;
    }
}
