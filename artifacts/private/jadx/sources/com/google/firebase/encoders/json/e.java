package com.google.firebase.encoders.json;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements l8.b<e> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final com.google.firebase.encoders.e<Object> f122011e = new com.google.firebase.encoders.e() { // from class: com.google.firebase.encoders.json.b
        @Override // com.google.firebase.encoders.b
        public final void a(Object obj, com.google.firebase.encoders.f fVar) {
            e.d(obj, fVar);
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final com.google.firebase.encoders.g<String> f122012f = new com.google.firebase.encoders.g() { // from class: com.google.firebase.encoders.json.c
        @Override // com.google.firebase.encoders.b
        public final void a(Object obj, com.google.firebase.encoders.h hVar) throws IOException {
            hVar.b((String) obj);
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final com.google.firebase.encoders.g<Boolean> f122013g = new com.google.firebase.encoders.g() { // from class: com.google.firebase.encoders.json.d
        @Override // com.google.firebase.encoders.b
        public final void a(Object obj, com.google.firebase.encoders.h hVar) throws IOException {
            hVar.c(((Boolean) obj).booleanValue());
        }
    };

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final b f122014h = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, com.google.firebase.encoders.e<?>> f122015a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, com.google.firebase.encoders.g<?>> f122016b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.google.firebase.encoders.e<Object> f122017c = f122011e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f122018d = false;

    class a implements com.google.firebase.encoders.a {
        a() {
        }

        @Override // com.google.firebase.encoders.a
        public String a(@NonNull Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                b(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }

        @Override // com.google.firebase.encoders.a
        public void b(@NonNull Object obj, @NonNull Writer writer) throws IOException {
            f fVar = new f(writer, e.this.f122015a, e.this.f122016b, e.this.f122017c, e.this.f122018d);
            int i10 = 0 >> 0;
            fVar.v(obj, false);
            fVar.G();
        }
    }

    private static final class b implements com.google.firebase.encoders.g<Date> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final DateFormat f122020a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f122020a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        private b() {
        }

        @Override // com.google.firebase.encoders.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull Date date, @NonNull com.google.firebase.encoders.h hVar) throws IOException {
            hVar.b(f122020a.format(date));
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    public e() {
        a(String.class, f122012f);
        a(Boolean.class, f122013g);
        a(Date.class, f122014h);
    }

    public static /* synthetic */ void d(Object obj, com.google.firebase.encoders.f fVar) {
        throw new com.google.firebase.encoders.c("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    @NonNull
    public com.google.firebase.encoders.a j() {
        return new a();
    }

    @NonNull
    public e k(@NonNull l8.a aVar) {
        aVar.a(this);
        return this;
    }

    @NonNull
    public e l(boolean z10) {
        this.f122018d = z10;
        return this;
    }

    @Override // l8.b
    @NonNull
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public <T> e b(@NonNull Class<T> cls, @NonNull com.google.firebase.encoders.e<? super T> eVar) {
        this.f122015a.put(cls, eVar);
        this.f122016b.remove(cls);
        return this;
    }

    @Override // l8.b
    @NonNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public <T> e a(@NonNull Class<T> cls, @NonNull com.google.firebase.encoders.g<? super T> gVar) {
        this.f122016b.put(cls, gVar);
        this.f122015a.remove(cls);
        return this;
    }

    @NonNull
    public e o(@NonNull com.google.firebase.encoders.e<Object> eVar) {
        this.f122017c = eVar;
        return this;
    }
}
