package com.android.volley.toolbox;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import androidx.annotation.l0;
import androidx.annotation.p0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.android.volley.t f89596a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f89598c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Runnable f89602g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f89597b = 100;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashMap<String, e> f89599d = new HashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashMap<String, e> f89600e = new HashMap<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Handler f89601f = new Handler(Looper.getMainLooper());

    class a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f89603a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ImageView f89604b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f89605c;

        a(int i10, ImageView imageView, int i11) {
            this.f89603a = i10;
            this.f89604b = imageView;
            this.f89605c = i11;
        }

        @Override // com.android.volley.toolbox.q.h
        public void a(g gVar, boolean z10) {
            if (gVar.d() != null) {
                this.f89604b.setImageBitmap(gVar.d());
                return;
            }
            int i10 = this.f89605c;
            if (i10 != 0) {
                this.f89604b.setImageResource(i10);
            }
        }

        @Override // com.android.volley.v.a
        public void b(com.android.volley.a0 a0Var) {
            int i10 = this.f89603a;
            if (i10 != 0) {
                this.f89604b.setImageResource(i10);
            }
        }
    }

    class b implements com.android.volley.v.b<Bitmap> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f89606a;

        b(String str) {
            this.f89606a = str;
        }

        @Override // com.android.volley.v.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResponse(Bitmap bitmap) {
            q.this.n(this.f89606a, bitmap);
        }
    }

    class c implements com.android.volley.v.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f89608a;

        c(String str) {
            this.f89608a = str;
        }

        @Override // com.android.volley.v.a
        public void b(com.android.volley.a0 a0Var) {
            q.this.m(this.f89608a, a0Var);
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            for (e eVar : q.this.f89600e.values()) {
                for (g gVar : eVar.f89614d) {
                    if (gVar.f89616b != null) {
                        if (eVar.e() == null) {
                            gVar.f89615a = eVar.f89612b;
                            gVar.f89616b.a(gVar, false);
                        } else {
                            gVar.f89616b.b(eVar.e());
                        }
                    }
                }
            }
            q.this.f89600e.clear();
            q.this.f89602g = null;
        }
    }

    private static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.android.volley.s<?> f89611a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Bitmap f89612b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private com.android.volley.a0 f89613c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List<g> f89614d;

        public e(com.android.volley.s<?> sVar, g gVar) {
            ArrayList arrayList = new ArrayList();
            this.f89614d = arrayList;
            this.f89611a = sVar;
            arrayList.add(gVar);
        }

        public void d(g gVar) {
            this.f89614d.add(gVar);
        }

        public com.android.volley.a0 e() {
            return this.f89613c;
        }

        public boolean f(g gVar) {
            this.f89614d.remove(gVar);
            if (this.f89614d.size() != 0) {
                return false;
            }
            this.f89611a.cancel();
            return true;
        }

        public void g(com.android.volley.a0 a0Var) {
            this.f89613c = a0Var;
        }
    }

    public interface f {
        void a(String str, Bitmap bitmap);

        @p0
        Bitmap b(String str);
    }

    public class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Bitmap f89615a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final h f89616b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f89617c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f89618d;

        public g(Bitmap bitmap, String str, String str2, h hVar) {
            this.f89615a = bitmap;
            this.f89618d = str;
            this.f89617c = str2;
            this.f89616b = hVar;
        }

        @l0
        public void c() {
            c0.a();
            if (this.f89616b == null) {
                return;
            }
            e eVar = (e) q.this.f89599d.get(this.f89617c);
            if (eVar != null) {
                if (eVar.f(this)) {
                    q.this.f89599d.remove(this.f89617c);
                    return;
                }
                return;
            }
            e eVar2 = (e) q.this.f89600e.get(this.f89617c);
            if (eVar2 != null) {
                eVar2.f(this);
                if (eVar2.f89614d.size() == 0) {
                    q.this.f89600e.remove(this.f89617c);
                }
            }
        }

        public Bitmap d() {
            return this.f89615a;
        }

        public String e() {
            return this.f89618d;
        }
    }

    public interface h extends com.android.volley.v.a {
        void a(g gVar, boolean z10);
    }

    public q(com.android.volley.t tVar, f fVar) {
        this.f89596a = tVar;
        this.f89598c = fVar;
    }

    private void d(String str, e eVar) {
        this.f89600e.put(str, eVar);
        if (this.f89602g == null) {
            d dVar = new d();
            this.f89602g = dVar;
            this.f89601f.postDelayed(dVar, this.f89597b);
        }
    }

    private static String h(String str, int i10, int i11, ImageView.ScaleType scaleType) {
        StringBuilder sb2 = new StringBuilder(str.length() + 12);
        sb2.append("#W");
        sb2.append(i10);
        sb2.append("#H");
        sb2.append(i11);
        sb2.append("#S");
        sb2.append(scaleType.ordinal());
        sb2.append(str);
        return sb2.toString();
    }

    public static h i(ImageView imageView, int i10, int i11) {
        return new a(i11, imageView, i10);
    }

    public g e(String str, h hVar) {
        return f(str, hVar, 0, 0);
    }

    public g f(String str, h hVar, int i10, int i11) {
        return g(str, hVar, i10, i11, ImageView.ScaleType.CENTER_INSIDE);
    }

    @l0
    public g g(String str, h hVar, int i10, int i11, ImageView.ScaleType scaleType) {
        c0.a();
        String strH = h(str, i10, i11, scaleType);
        Bitmap bitmapB = this.f89598c.b(strH);
        if (bitmapB != null) {
            g gVar = new g(bitmapB, str, null, null);
            hVar.a(gVar, true);
            return gVar;
        }
        g gVar2 = new g(null, str, strH, hVar);
        hVar.a(gVar2, true);
        e eVar = this.f89599d.get(strH);
        if (eVar == null) {
            eVar = this.f89600e.get(strH);
        }
        if (eVar != null) {
            eVar.d(gVar2);
            return gVar2;
        }
        com.android.volley.s<Bitmap> sVarL = l(str, i10, i11, scaleType, strH);
        this.f89596a.a(sVarL);
        this.f89599d.put(strH, new e(sVarL, gVar2));
        return gVar2;
    }

    public boolean j(String str, int i10, int i11) {
        return k(str, i10, i11, ImageView.ScaleType.CENTER_INSIDE);
    }

    @l0
    public boolean k(String str, int i10, int i11, ImageView.ScaleType scaleType) {
        c0.a();
        return this.f89598c.b(h(str, i10, i11, scaleType)) != null;
    }

    protected com.android.volley.s<Bitmap> l(String str, int i10, int i11, ImageView.ScaleType scaleType, String str2) {
        return new r(str, new b(str2), i10, i11, scaleType, Bitmap.Config.RGB_565, new c(str2));
    }

    protected void m(String str, com.android.volley.a0 a0Var) {
        e eVarRemove = this.f89599d.remove(str);
        if (eVarRemove != null) {
            eVarRemove.g(a0Var);
            d(str, eVarRemove);
        }
    }

    protected void n(String str, Bitmap bitmap) {
        this.f89598c.a(str, bitmap);
        e eVarRemove = this.f89599d.remove(str);
        if (eVarRemove != null) {
            eVarRemove.f89612b = bitmap;
            d(str, eVarRemove);
        }
    }

    public void o(int i10) {
        this.f89597b = i10;
    }
}
