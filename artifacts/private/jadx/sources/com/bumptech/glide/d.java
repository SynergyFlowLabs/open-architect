package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.b0;
import androidx.annotation.l1;
import androidx.annotation.p0;
import com.bumptech.glide.request.target.r;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class d extends ContextWrapper {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @l1
    static final m<?, ?> f95962k = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.b f95963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f95964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.request.target.k f95965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b.a f95966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<com.bumptech.glide.request.g<Object>> f95967e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map<Class<?>, m<?, ?>> f95968f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.k f95969g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f95970h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f95971i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @b0("this")
    @p0
    private com.bumptech.glide.request.h f95972j;

    public d(@NonNull Context context, @NonNull com.bumptech.glide.load.engine.bitmap_recycle.b bVar, @NonNull j jVar, @NonNull com.bumptech.glide.request.target.k kVar, @NonNull b.a aVar, @NonNull Map<Class<?>, m<?, ?>> map, @NonNull List<com.bumptech.glide.request.g<Object>> list, @NonNull com.bumptech.glide.load.engine.k kVar2, boolean z10, int i10) {
        super(context.getApplicationContext());
        this.f95963a = bVar;
        this.f95964b = jVar;
        this.f95965c = kVar;
        this.f95966d = aVar;
        this.f95967e = list;
        this.f95968f = map;
        this.f95969g = kVar2;
        this.f95970h = z10;
        this.f95971i = i10;
    }

    @NonNull
    public <X> r<ImageView, X> a(@NonNull ImageView imageView, @NonNull Class<X> cls) {
        return this.f95965c.a(imageView, cls);
    }

    @NonNull
    public com.bumptech.glide.load.engine.bitmap_recycle.b b() {
        return this.f95963a;
    }

    public List<com.bumptech.glide.request.g<Object>> c() {
        return this.f95967e;
    }

    public synchronized com.bumptech.glide.request.h d() {
        try {
            if (this.f95972j == null) {
                this.f95972j = this.f95966d.build().n0();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f95972j;
    }

    @NonNull
    public <T> m<?, T> e(@NonNull Class<T> cls) {
        m<?, T> mVar = (m) this.f95968f.get(cls);
        if (mVar == null) {
            for (Map.Entry<Class<?>, m<?, ?>> entry : this.f95968f.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    mVar = (m) entry.getValue();
                }
            }
        }
        return mVar == null ? (m<?, T>) f95962k : mVar;
    }

    @NonNull
    public com.bumptech.glide.load.engine.k f() {
        return this.f95969g;
    }

    public int g() {
        return this.f95971i;
    }

    @NonNull
    public j h() {
        return this.f95964b;
    }

    public boolean i() {
        return this.f95970h;
    }
}
