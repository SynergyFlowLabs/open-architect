package com.bumptech.glide;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.core.util.s;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.t;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.load.model.n;
import com.bumptech.glide.load.model.o;
import com.bumptech.glide.load.model.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class j {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f96254k = "Gif";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f96255l = "Bitmap";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f96256m = "BitmapDrawable";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f96257n = "legacy_prepend_all";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f96258o = "legacy_append";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f96259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.provider.a f96260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.provider.e f96261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.bumptech.glide.provider.f f96262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.bumptech.glide.load.data.f f96263e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.bumptech.glide.load.resource.transcode.f f96264f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.bumptech.glide.provider.b f96265g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.bumptech.glide.provider.d f96266h = new com.bumptech.glide.provider.d();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.bumptech.glide.provider.c f96267i = new com.bumptech.glide.provider.c();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final s.a<List<Throwable>> f96268j;

    public static class a extends RuntimeException {
        public a(@NonNull String str) {
            super(str);
        }
    }

    public static final class b extends a {
        public b() {
            super("Failed to find image header parser.");
        }
    }

    public static class c extends a {
        public c(@NonNull Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public <M> c(@NonNull M m10, @NonNull List<n<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m10);
        }

        public c(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    public static class d extends a {
        public d(@NonNull Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    public static class e extends a {
        public e(@NonNull Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public j() {
        s.a<List<Throwable>> aVarF = com.bumptech.glide.util.pool.a.f();
        this.f96268j = aVarF;
        this.f96259a = new p(aVarF);
        this.f96260b = new com.bumptech.glide.provider.a();
        this.f96261c = new com.bumptech.glide.provider.e();
        this.f96262d = new com.bumptech.glide.provider.f();
        this.f96263e = new com.bumptech.glide.load.data.f();
        this.f96264f = new com.bumptech.glide.load.resource.transcode.f();
        this.f96265g = new com.bumptech.glide.provider.b();
        z(Arrays.asList(f96254k, f96255l, f96256m));
    }

    @NonNull
    private <Data, TResource, Transcode> List<com.bumptech.glide.load.engine.i<Data, TResource, Transcode>> f(@NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull Class<Transcode> cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.f96261c.d(cls, cls2)) {
            for (Class cls5 : this.f96264f.b(cls4, cls3)) {
                arrayList.add(new com.bumptech.glide.load.engine.i(cls, cls4, cls5, this.f96261c.b(cls, cls4), this.f96264f.a(cls4, cls5), this.f96268j));
            }
        }
        return arrayList;
    }

    @NonNull
    public <Data> j a(@NonNull Class<Data> cls, @NonNull com.bumptech.glide.load.d<Data> dVar) {
        this.f96260b.a(cls, dVar);
        return this;
    }

    @NonNull
    public <TResource> j b(@NonNull Class<TResource> cls, @NonNull com.bumptech.glide.load.m<TResource> mVar) {
        this.f96262d.a(cls, mVar);
        return this;
    }

    @NonNull
    public <Data, TResource> j c(@NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull com.bumptech.glide.load.l<Data, TResource> lVar) {
        e(f96258o, cls, cls2, lVar);
        return this;
    }

    @NonNull
    public <Model, Data> j d(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull o<Model, Data> oVar) {
        this.f96259a.a(cls, cls2, oVar);
        return this;
    }

    @NonNull
    public <Data, TResource> j e(@NonNull String str, @NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull com.bumptech.glide.load.l<Data, TResource> lVar) {
        this.f96261c.a(str, lVar, cls, cls2);
        return this;
    }

    @NonNull
    public List<ImageHeaderParser> g() {
        List<ImageHeaderParser> listB = this.f96265g.b();
        if (listB.isEmpty()) {
            throw new b();
        }
        return listB;
    }

    @p0
    public <Data, TResource, Transcode> t<Data, TResource, Transcode> h(@NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull Class<Transcode> cls3) {
        Class<Data> cls4;
        Class<TResource> cls5;
        Class<Transcode> cls6;
        t<Data, TResource, Transcode> tVarA = this.f96267i.a(cls, cls2, cls3);
        t<Data, TResource, Transcode> tVar = null;
        if (this.f96267i.c(tVarA)) {
            return null;
        }
        if (tVarA != null) {
            return tVarA;
        }
        List<com.bumptech.glide.load.engine.i<Data, TResource, Transcode>> listF = f(cls, cls2, cls3);
        if (listF.isEmpty()) {
            cls4 = cls;
            cls5 = cls2;
            cls6 = cls3;
        } else {
            cls4 = cls;
            cls5 = cls2;
            cls6 = cls3;
            tVar = new t<>(cls4, cls5, cls6, listF, this.f96268j);
        }
        this.f96267i.d(cls4, cls5, cls6, tVar);
        return tVar;
    }

    @NonNull
    public <Model> List<n<Model, ?>> i(@NonNull Model model) {
        return this.f96259a.e(model);
    }

    @NonNull
    public <Model, TResource, Transcode> List<Class<?>> j(@NonNull Class<Model> cls, @NonNull Class<TResource> cls2, @NonNull Class<Transcode> cls3) {
        List<Class<?>> listB = this.f96266h.b(cls, cls2, cls3);
        if (listB == null) {
            listB = new ArrayList<>();
            Iterator<Class<?>> it = this.f96259a.d(cls).iterator();
            while (it.hasNext()) {
                for (Class<?> cls4 : this.f96261c.d(it.next(), cls2)) {
                    if (!this.f96264f.b(cls4, cls3).isEmpty() && !listB.contains(cls4)) {
                        listB.add(cls4);
                    }
                }
            }
            this.f96266h.c(cls, cls2, cls3, Collections.unmodifiableList(listB));
        }
        return listB;
    }

    @NonNull
    public <X> com.bumptech.glide.load.m<X> k(@NonNull v<X> vVar) throws d {
        com.bumptech.glide.load.m<X> mVarB = this.f96262d.b(vVar.b());
        if (mVarB != null) {
            return mVarB;
        }
        throw new d(vVar.b());
    }

    @NonNull
    public <X> com.bumptech.glide.load.data.e<X> l(@NonNull X x10) {
        return this.f96263e.a(x10);
    }

    @NonNull
    public <X> com.bumptech.glide.load.d<X> m(@NonNull X x10) throws e {
        com.bumptech.glide.load.d<X> dVarB = this.f96260b.b(x10.getClass());
        if (dVarB != null) {
            return dVarB;
        }
        throw new e(x10.getClass());
    }

    public boolean n(@NonNull v<?> vVar) {
        return this.f96262d.b(vVar.b()) != null;
    }

    @NonNull
    public <Data> j o(@NonNull Class<Data> cls, @NonNull com.bumptech.glide.load.d<Data> dVar) {
        this.f96260b.c(cls, dVar);
        return this;
    }

    @NonNull
    public <TResource> j p(@NonNull Class<TResource> cls, @NonNull com.bumptech.glide.load.m<TResource> mVar) {
        this.f96262d.c(cls, mVar);
        return this;
    }

    @NonNull
    public <Data, TResource> j q(@NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull com.bumptech.glide.load.l<Data, TResource> lVar) {
        s(f96257n, cls, cls2, lVar);
        return this;
    }

    @NonNull
    public <Model, Data> j r(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull o<Model, Data> oVar) {
        this.f96259a.g(cls, cls2, oVar);
        return this;
    }

    @NonNull
    public <Data, TResource> j s(@NonNull String str, @NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull com.bumptech.glide.load.l<Data, TResource> lVar) {
        this.f96261c.e(str, lVar, cls, cls2);
        return this;
    }

    @NonNull
    public j t(@NonNull ImageHeaderParser imageHeaderParser) {
        this.f96265g.a(imageHeaderParser);
        return this;
    }

    @NonNull
    public j u(@NonNull com.bumptech.glide.load.data.e.a<?> aVar) {
        this.f96263e.b(aVar);
        return this;
    }

    @NonNull
    @Deprecated
    public <Data> j v(@NonNull Class<Data> cls, @NonNull com.bumptech.glide.load.d<Data> dVar) {
        return a(cls, dVar);
    }

    @NonNull
    @Deprecated
    public <TResource> j w(@NonNull Class<TResource> cls, @NonNull com.bumptech.glide.load.m<TResource> mVar) {
        return b(cls, mVar);
    }

    @NonNull
    public <TResource, Transcode> j x(@NonNull Class<TResource> cls, @NonNull Class<Transcode> cls2, @NonNull com.bumptech.glide.load.resource.transcode.e<TResource, Transcode> eVar) {
        this.f96264f.c(cls, cls2, eVar);
        return this;
    }

    @NonNull
    public <Model, Data> j y(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull o<? extends Model, ? extends Data> oVar) {
        this.f96259a.i(cls, cls2, oVar);
        return this;
    }

    @NonNull
    public final j z(@NonNull List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        arrayList.add(0, f96257n);
        arrayList.add(f96258o);
        this.f96261c.f(arrayList);
        return this;
    }
}
