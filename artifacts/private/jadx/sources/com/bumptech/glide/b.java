package com.bumptech.glide;

import android.app.Activity;
import android.app.Fragment;
import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.b0;
import androidx.annotation.l1;
import androidx.annotation.p0;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.model.s;
import com.bumptech.glide.load.model.u;
import com.bumptech.glide.load.model.v;
import com.bumptech.glide.load.model.w;
import com.bumptech.glide.load.model.x;
import com.bumptech.glide.load.resource.bitmap.a0;
import com.bumptech.glide.load.resource.bitmap.c0;
import com.bumptech.glide.load.resource.bitmap.f0;
import com.bumptech.glide.load.resource.bitmap.h0;
import com.bumptech.glide.load.resource.bitmap.j0;
import com.bumptech.glide.load.resource.bitmap.o;
import com.bumptech.glide.load.resource.bitmap.q;
import com.bumptech.glide.load.resource.bitmap.t;
import com.bumptech.glide.load.resource.bitmap.y;
import com.bumptech.glide.request.target.p;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class b implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f95925m = "image_manager_disk_cache";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f95926n = "Glide";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static volatile b f95927o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static volatile boolean f95928s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.k f95929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.e f95930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.cache.j f95931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d f95932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final j f95933e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.b f95934f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.bumptech.glide.manager.l f95935g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.bumptech.glide.manager.d f95936h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final a f95938j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @b0("this")
    @p0
    private com.bumptech.glide.load.engine.prefill.b f95940l;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List<l> f95937i = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private f f95939k = f.NORMAL;

    public interface a {
        @NonNull
        com.bumptech.glide.request.h build();
    }

    b(@NonNull Context context, @NonNull com.bumptech.glide.load.engine.k kVar, @NonNull com.bumptech.glide.load.engine.cache.j jVar, @NonNull com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @NonNull com.bumptech.glide.load.engine.bitmap_recycle.b bVar, @NonNull com.bumptech.glide.manager.l lVar, @NonNull com.bumptech.glide.manager.d dVar, int i10, @NonNull a aVar, @NonNull Map<Class<?>, m<?, ?>> map, @NonNull List<com.bumptech.glide.request.g<Object>> list, boolean z10, boolean z11) {
        com.bumptech.glide.load.l jVar2;
        com.bumptech.glide.load.l f0Var;
        j jVar3;
        this.f95929a = kVar;
        this.f95930b = eVar;
        this.f95934f = bVar;
        this.f95931c = jVar;
        this.f95935g = lVar;
        this.f95936h = dVar;
        this.f95938j = aVar;
        Resources resources = context.getResources();
        j jVar4 = new j();
        this.f95933e = jVar4;
        jVar4.t(new o());
        jVar4.t(new t());
        List<ImageHeaderParser> listG = jVar4.g();
        com.bumptech.glide.load.resource.gif.a aVar2 = new com.bumptech.glide.load.resource.gif.a(context, listG, eVar, bVar);
        com.bumptech.glide.load.l<ParcelFileDescriptor, Bitmap> lVarH = j0.h(eVar);
        q qVar = new q(jVar4.g(), resources.getDisplayMetrics(), eVar, bVar);
        if (z11) {
            f0Var = new y();
            jVar2 = new com.bumptech.glide.load.resource.bitmap.k();
        } else {
            jVar2 = new com.bumptech.glide.load.resource.bitmap.j(qVar);
            f0Var = new f0(qVar, bVar);
        }
        com.bumptech.glide.load.resource.drawable.e eVar2 = new com.bumptech.glide.load.resource.drawable.e(context);
        s.c cVar = new s.c(resources);
        s.d dVar2 = new s.d(resources);
        s.b bVar2 = new s.b(resources);
        s.a aVar3 = new s.a(resources);
        com.bumptech.glide.load.resource.bitmap.e eVar3 = new com.bumptech.glide.load.resource.bitmap.e(bVar);
        com.bumptech.glide.load.resource.transcode.a aVar4 = new com.bumptech.glide.load.resource.transcode.a();
        com.bumptech.glide.load.resource.transcode.d dVar3 = new com.bumptech.glide.load.resource.transcode.d();
        ContentResolver contentResolver = context.getContentResolver();
        jVar4.a(ByteBuffer.class, new com.bumptech.glide.load.model.c()).a(InputStream.class, new com.bumptech.glide.load.model.t(bVar)).e(j.f96255l, ByteBuffer.class, Bitmap.class, jVar2).e(j.f96255l, InputStream.class, Bitmap.class, f0Var);
        if (com.bumptech.glide.load.data.m.c()) {
            jVar4.e(j.f96255l, ParcelFileDescriptor.class, Bitmap.class, new a0(qVar));
        }
        jVar4.e(j.f96255l, ParcelFileDescriptor.class, Bitmap.class, lVarH).e(j.f96255l, AssetFileDescriptor.class, Bitmap.class, j0.c(eVar)).d(Bitmap.class, Bitmap.class, v.a.a()).e(j.f96255l, Bitmap.class, Bitmap.class, new h0()).b(Bitmap.class, eVar3).e(j.f96256m, ByteBuffer.class, BitmapDrawable.class, new com.bumptech.glide.load.resource.bitmap.a(resources, jVar2)).e(j.f96256m, InputStream.class, BitmapDrawable.class, new com.bumptech.glide.load.resource.bitmap.a(resources, f0Var)).e(j.f96256m, ParcelFileDescriptor.class, BitmapDrawable.class, new com.bumptech.glide.load.resource.bitmap.a(resources, lVarH)).b(BitmapDrawable.class, new com.bumptech.glide.load.resource.bitmap.b(eVar, eVar3)).e(j.f96254k, InputStream.class, com.bumptech.glide.load.resource.gif.c.class, new com.bumptech.glide.load.resource.gif.j(listG, aVar2, bVar)).e(j.f96254k, ByteBuffer.class, com.bumptech.glide.load.resource.gif.c.class, aVar2).b(com.bumptech.glide.load.resource.gif.c.class, new com.bumptech.glide.load.resource.gif.d()).d(com.bumptech.glide.gifdecoder.a.class, com.bumptech.glide.gifdecoder.a.class, v.a.a()).e(j.f96255l, com.bumptech.glide.gifdecoder.a.class, Bitmap.class, new com.bumptech.glide.load.resource.gif.h(eVar)).c(Uri.class, Drawable.class, eVar2).c(Uri.class, Bitmap.class, new c0(eVar2, eVar)).u(new w4.a.C2528a()).d(File.class, ByteBuffer.class, new com.bumptech.glide.load.model.d.b()).d(File.class, InputStream.class, new com.bumptech.glide.load.model.f.e()).c(File.class, File.class, new x4.a()).d(File.class, ParcelFileDescriptor.class, new com.bumptech.glide.load.model.f.b()).d(File.class, File.class, v.a.a()).u(new com.bumptech.glide.load.data.k.a(bVar));
        if (com.bumptech.glide.load.data.m.c()) {
            jVar3 = jVar4;
            jVar3.u(new com.bumptech.glide.load.data.m.a());
        } else {
            jVar3 = jVar4;
        }
        Class cls = Integer.TYPE;
        jVar3.d(cls, InputStream.class, cVar).d(cls, ParcelFileDescriptor.class, bVar2).d(Integer.class, InputStream.class, cVar).d(Integer.class, ParcelFileDescriptor.class, bVar2).d(Integer.class, Uri.class, dVar2).d(cls, AssetFileDescriptor.class, aVar3).d(Integer.class, AssetFileDescriptor.class, aVar3).d(cls, Uri.class, dVar2).d(String.class, InputStream.class, new com.bumptech.glide.load.model.e.c()).d(Uri.class, InputStream.class, new com.bumptech.glide.load.model.e.c()).d(String.class, InputStream.class, new u.c()).d(String.class, ParcelFileDescriptor.class, new u.b()).d(String.class, AssetFileDescriptor.class, new u.a()).d(Uri.class, InputStream.class, new com.bumptech.glide.load.model.stream.c.a()).d(Uri.class, InputStream.class, new com.bumptech.glide.load.model.a.c(context.getAssets())).d(Uri.class, ParcelFileDescriptor.class, new com.bumptech.glide.load.model.a.b(context.getAssets())).d(Uri.class, InputStream.class, new com.bumptech.glide.load.model.stream.d.a(context)).d(Uri.class, InputStream.class, new com.bumptech.glide.load.model.stream.e.a(context));
        jVar3.d(Uri.class, InputStream.class, new com.bumptech.glide.load.model.stream.f.c(context));
        jVar3.d(Uri.class, ParcelFileDescriptor.class, new com.bumptech.glide.load.model.stream.f.b(context));
        jVar3.d(Uri.class, InputStream.class, new w.d(contentResolver)).d(Uri.class, ParcelFileDescriptor.class, new w.b(contentResolver)).d(Uri.class, AssetFileDescriptor.class, new w.a(contentResolver)).d(Uri.class, InputStream.class, new x.a()).d(URL.class, InputStream.class, new com.bumptech.glide.load.model.stream.g.a()).d(Uri.class, File.class, new com.bumptech.glide.load.model.k.a(context)).d(com.bumptech.glide.load.model.g.class, InputStream.class, new com.bumptech.glide.load.model.stream.b.a()).d(byte[].class, ByteBuffer.class, new com.bumptech.glide.load.model.b.a()).d(byte[].class, InputStream.class, new com.bumptech.glide.load.model.b.d()).d(Uri.class, Uri.class, v.a.a()).d(Drawable.class, Drawable.class, v.a.a()).c(Drawable.class, Drawable.class, new com.bumptech.glide.load.resource.drawable.f()).x(Bitmap.class, BitmapDrawable.class, new com.bumptech.glide.load.resource.transcode.b(resources)).x(Bitmap.class, byte[].class, aVar4).x(Drawable.class, byte[].class, new com.bumptech.glide.load.resource.transcode.c(eVar, aVar4, dVar3)).x(com.bumptech.glide.load.resource.gif.c.class, byte[].class, dVar3);
        com.bumptech.glide.load.l<ByteBuffer, Bitmap> lVarD = j0.d(eVar);
        jVar3.c(ByteBuffer.class, Bitmap.class, lVarD);
        jVar3.c(ByteBuffer.class, BitmapDrawable.class, new com.bumptech.glide.load.resource.bitmap.a(resources, lVarD));
        this.f95932d = new d(context, bVar, jVar3, new com.bumptech.glide.request.target.k(), aVar, map, list, kVar, z10, i10);
    }

    @NonNull
    public static l B(@NonNull Activity activity) {
        return o(activity).i(activity);
    }

    @NonNull
    @Deprecated
    public static l C(@NonNull Fragment fragment) {
        return o(fragment.getActivity()).j(fragment);
    }

    @NonNull
    public static l D(@NonNull Context context) {
        return o(context).k(context);
    }

    @NonNull
    public static l E(@NonNull View view) {
        return o(view.getContext()).l(view);
    }

    @NonNull
    public static l F(@NonNull androidx.fragment.app.Fragment fragment) {
        return o(fragment.getContext()).m(fragment);
    }

    @NonNull
    public static l G(@NonNull androidx.fragment.app.s sVar) {
        return o(sVar).n(sVar);
    }

    @b0("Glide.class")
    private static void a(@NonNull Context context, @p0 GeneratedAppGlideModule generatedAppGlideModule) {
        if (f95928s) {
            throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
        }
        f95928s = true;
        r(context, generatedAppGlideModule);
        f95928s = false;
    }

    @NonNull
    public static b d(@NonNull Context context) {
        if (f95927o == null) {
            GeneratedAppGlideModule generatedAppGlideModuleE = e(context.getApplicationContext());
            synchronized (b.class) {
                try {
                    if (f95927o == null) {
                        a(context, generatedAppGlideModuleE);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f95927o;
    }

    @p0
    private static GeneratedAppGlideModule e(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (IllegalAccessException e10) {
            y(e10);
            return null;
        } catch (InstantiationException e11) {
            y(e11);
            return null;
        } catch (NoSuchMethodException e12) {
            y(e12);
            return null;
        } catch (InvocationTargetException e13) {
            y(e13);
            return null;
        }
    }

    @p0
    public static File k(@NonNull Context context) {
        return l(context, "image_manager_disk_cache");
    }

    @p0
    public static File l(@NonNull Context context, @NonNull String str) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        File file = new File(cacheDir, str);
        if (file.mkdirs() || (file.exists() && file.isDirectory())) {
            return file;
        }
        return null;
    }

    @NonNull
    private static com.bumptech.glide.manager.l o(@p0 Context context) {
        com.bumptech.glide.util.k.e(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return d(context).n();
    }

    @l1
    public static void p(@NonNull Context context, @NonNull c cVar) {
        GeneratedAppGlideModule generatedAppGlideModuleE = e(context);
        synchronized (b.class) {
            try {
                if (f95927o != null) {
                    x();
                }
                s(context, cVar, generatedAppGlideModuleE);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @l1
    @Deprecated
    public static synchronized void q(b bVar) {
        try {
            if (f95927o != null) {
                x();
            }
            f95927o = bVar;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @b0("Glide.class")
    private static void r(@NonNull Context context, @p0 GeneratedAppGlideModule generatedAppGlideModule) {
        s(context, new c(), generatedAppGlideModule);
    }

    @b0("Glide.class")
    private static void s(@NonNull Context context, @NonNull c cVar, @p0 GeneratedAppGlideModule generatedAppGlideModule) {
        Context applicationContext = context.getApplicationContext();
        List<com.bumptech.glide.module.c> listA = Collections.EMPTY_LIST;
        if (generatedAppGlideModule == null || generatedAppGlideModule.c()) {
            listA = new com.bumptech.glide.module.e(applicationContext).a();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.d().isEmpty()) {
            Set<Class<?>> setD = generatedAppGlideModule.d();
            Iterator<com.bumptech.glide.module.c> it = listA.iterator();
            while (it.hasNext()) {
                com.bumptech.glide.module.c next = it.next();
                if (setD.contains(next.getClass())) {
                    if (Log.isLoggable(f95926n, 3)) {
                        next.toString();
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable(f95926n, 3)) {
            Iterator<com.bumptech.glide.module.c> it2 = listA.iterator();
            while (it2.hasNext()) {
                it2.next().getClass().toString();
            }
        }
        cVar.t(generatedAppGlideModule != null ? generatedAppGlideModule.e() : null);
        Iterator<com.bumptech.glide.module.c> it3 = listA.iterator();
        while (it3.hasNext()) {
            it3.next().a(applicationContext, cVar);
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.a(applicationContext, cVar);
        }
        b bVarB = cVar.b(applicationContext);
        for (com.bumptech.glide.module.c cVar2 : listA) {
            try {
                cVar2.b(applicationContext, bVarB, bVarB.f95933e);
            } catch (AbstractMethodError e10) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: " + cVar2.getClass().getName(), e10);
            }
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.b(applicationContext, bVarB, bVarB.f95933e);
        }
        applicationContext.registerComponentCallbacks(bVarB);
        f95927o = bVarB;
    }

    @l1
    public static synchronized void x() {
        try {
            if (f95927o != null) {
                f95927o.i().getApplicationContext().unregisterComponentCallbacks(f95927o);
                f95927o.f95929a.m();
            }
            f95927o = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static void y(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    void A(l lVar) {
        synchronized (this.f95937i) {
            try {
                if (!this.f95937i.contains(lVar)) {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
                this.f95937i.remove(lVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void b() {
        com.bumptech.glide.util.m.a();
        this.f95929a.e();
    }

    public void c() {
        com.bumptech.glide.util.m.b();
        this.f95931c.c();
        this.f95930b.c();
        this.f95934f.c();
    }

    @NonNull
    public com.bumptech.glide.load.engine.bitmap_recycle.b f() {
        return this.f95934f;
    }

    @NonNull
    public com.bumptech.glide.load.engine.bitmap_recycle.e g() {
        return this.f95930b;
    }

    com.bumptech.glide.manager.d h() {
        return this.f95936h;
    }

    @NonNull
    public Context i() {
        return this.f95932d.getBaseContext();
    }

    @NonNull
    d j() {
        return this.f95932d;
    }

    @NonNull
    public j m() {
        return this.f95933e;
    }

    @NonNull
    public com.bumptech.glide.manager.l n() {
        return this.f95935g;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        c();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        z(i10);
    }

    public synchronized void t(@NonNull com.bumptech.glide.load.engine.prefill.d.a... aVarArr) {
        try {
            if (this.f95940l == null) {
                this.f95940l = new com.bumptech.glide.load.engine.prefill.b(this.f95931c, this.f95930b, (com.bumptech.glide.load.b) this.f95938j.build().M().c(q.f97059g));
            }
            this.f95940l.c(aVarArr);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    void u(l lVar) {
        synchronized (this.f95937i) {
            try {
                if (this.f95937i.contains(lVar)) {
                    throw new IllegalStateException("Cannot register already registered manager");
                }
                this.f95937i.add(lVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    boolean v(@NonNull p<?> pVar) {
        synchronized (this.f95937i) {
            try {
                Iterator<l> it = this.f95937i.iterator();
                while (it.hasNext()) {
                    if (it.next().b0(pVar)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    public f w(@NonNull f fVar) {
        com.bumptech.glide.util.m.b();
        this.f95931c.d(fVar.k());
        this.f95930b.d(fVar.k());
        f fVar2 = this.f95939k;
        this.f95939k = fVar;
        return fVar2;
    }

    public void z(int i10) {
        com.bumptech.glide.util.m.b();
        Iterator<l> it = this.f95937i.iterator();
        while (it.hasNext()) {
            it.next().onTrimMemory(i10);
        }
        this.f95931c.b(i10);
        this.f95930b.b(i10);
        this.f95934f.b(i10);
    }
}
