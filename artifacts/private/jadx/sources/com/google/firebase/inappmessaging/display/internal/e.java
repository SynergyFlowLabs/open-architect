package com.google.firebase.inappmessaging.display.internal;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.p0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@u8.a
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.l f122313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, Set<com.bumptech.glide.request.target.e>> f122314b = new HashMap();

    public static abstract class a extends com.bumptech.glide.request.target.e<Drawable> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ImageView f122315d;

        private void g(Drawable drawable) {
            ImageView imageView = this.f122315d;
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
            }
        }

        public abstract void c(Exception exc);

        @Override // com.bumptech.glide.request.target.p
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void i(@NonNull Drawable drawable, @p0 com.bumptech.glide.request.transition.f<? super Drawable> fVar) {
            l.a("Downloading Image Success!!!");
            g(drawable);
            f();
        }

        public abstract void f();

        @Override // com.bumptech.glide.request.target.p
        public void h(@p0 Drawable drawable) {
            l.a("Downloading Image Cleared");
            g(drawable);
            f();
        }

        void j(ImageView imageView) {
            this.f122315d = imageView;
        }

        @Override // com.bumptech.glide.request.target.e, com.bumptech.glide.request.target.p
        public void q(@p0 Drawable drawable) {
            l.a("Downloading Image Failed");
            g(drawable);
            c(new Exception("Image loading failed!"));
        }
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.bumptech.glide.k<Drawable> f122316a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private a f122317b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f122318c;

        public b(com.bumptech.glide.k<Drawable> kVar) {
            this.f122316a = kVar;
        }

        private void b() {
            Set hashSet;
            if (this.f122317b == null || TextUtils.isEmpty(this.f122318c)) {
                return;
            }
            synchronized (e.this.f122314b) {
                try {
                    if (e.this.f122314b.containsKey(this.f122318c)) {
                        hashSet = (Set) e.this.f122314b.get(this.f122318c);
                    } else {
                        hashSet = new HashSet();
                        e.this.f122314b.put(this.f122318c, hashSet);
                    }
                    if (!hashSet.contains(this.f122317b)) {
                        hashSet.add(this.f122317b);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public b a(j jVar) {
            this.f122316a.V0(jVar);
            return this;
        }

        public void c(ImageView imageView, a aVar) {
            l.a("Downloading Image Callback : " + aVar);
            aVar.j(imageView);
            this.f122316a.i1(aVar);
            this.f122317b = aVar;
            b();
        }

        public b d(int i10) {
            this.f122316a.z0(i10);
            l.a("Downloading Image Placeholder : " + i10);
            return this;
        }

        public b e(Class cls) {
            this.f122318c = cls.getSimpleName();
            b();
            return this;
        }
    }

    @ij.a
    public e(com.bumptech.glide.l lVar) {
        this.f122313a = lVar;
    }

    public void b(Class cls) {
        String simpleName = cls.getSimpleName();
        synchronized (simpleName) {
            try {
                if (this.f122314b.containsKey(simpleName)) {
                    for (com.bumptech.glide.request.target.e eVar : this.f122314b.get(simpleName)) {
                        if (eVar != null) {
                            this.f122313a.B(eVar);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @l1
    boolean c(String str) {
        Map<String, Set<com.bumptech.glide.request.target.e>> map = this.f122314b;
        return map != null && map.containsKey(str) && this.f122314b.get(str) != null && this.f122314b.get(str).size() > 0;
    }

    public b d(@p0 String str) {
        l.a("Starting Downloading Image : " + str);
        return new b(this.f122313a.j(new com.bumptech.glide.load.model.g(str, new com.bumptech.glide.load.model.j.a().b("Accept", "image/*").c())).E(com.bumptech.glide.load.b.PREFER_ARGB_8888));
    }
}
