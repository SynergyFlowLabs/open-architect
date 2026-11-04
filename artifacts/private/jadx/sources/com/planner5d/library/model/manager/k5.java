package com.planner5d.library.model.manager;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.planner5d.library.model.ManagedFile;
import com.planner5d.library.model.item.ItemProject;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import rx.Observable;
import rx.Subscriber;
import rx.functions.Func1;

/* JADX INFO: loaded from: classes7.dex */
@ij.f
public class k5 implements x1 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f191815s = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.planner5d.library.model.manager.builtin.i f191822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final y0 f191823e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.planner5d.library.api.requests.c f191824f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.planner5d.library.modules.user.user.t f191825g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.planner5d.library.application.b f191826h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.planner5d.library.model.manager.builtin.v0 f191827i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.planner5d.library.model.manager.builtin.n f191828j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.planner5d.library.services.bitmaploader.d f191829k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final t1 f191830l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final com.planner5d.library.services.utility.w f191831m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final com.planner5d.library.model.z[] f191834p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final com.planner5d.library.model.y f191813q = new com.planner5d.library.model.y("video");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final com.planner5d.library.model.y f191814r = new com.planner5d.library.model.y("__texture_grid__", -1);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final com.planner5d.library.model.z f191816t = new com.planner5d.library.model.z(com.planner5d.library.f.s.Mr);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final com.planner5d.library.model.z f191817u = new com.planner5d.library.model.z(com.planner5d.library.f.s.Ub);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final com.planner5d.library.model.z f191818v = new com.planner5d.library.model.z(com.planner5d.library.f.s.GG);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final com.planner5d.library.model.z f191819w = new com.planner5d.library.model.z(com.planner5d.library.f.s.FG);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final AtomicReference<k5> f191820x = new AtomicReference<>(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, com.planner5d.library.model.y> f191821c = new HashMap<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Bitmap f191832n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Object f191833o = new Object();

    class a extends com.planner5d.library.services.rx.e<List<com.planner5d.library.model.y>> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.services.bitmaploader.target.a f191835d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.z f191836e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.p.a f191837f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.p.b f191838g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f191839h;

        /* JADX INFO: renamed from: com.planner5d.library.model.manager.k5$a$a, reason: collision with other inner class name */
        class C1596a extends com.planner5d.library.services.utility.w.c<Void> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f191841a;

            C1596a(List list) {
                this.f191841a = list;
            }

            @Override // com.planner5d.library.services.utility.w.c
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public Void d() {
                k5 k5Var = k5.this;
                String str = ((com.planner5d.library.model.y) this.f191841a.get(String.valueOf(8).equalsIgnoreCase(a.this.f191836e.f222860a) ? 1 : 0)).f222851c;
                a aVar = a.this;
                k5Var.r(str, aVar.f191837f, aVar.f191838g, aVar.f191839h, aVar.f191835d);
                return null;
            }
        }

        a(com.planner5d.library.services.bitmaploader.target.a aVar, com.planner5d.library.model.z zVar, com.planner5d.library.model.p.a aVar2, com.planner5d.library.model.p.b bVar, int i10) {
            this.f191835d = aVar;
            this.f191836e = zVar;
            this.f191837f = aVar2;
            this.f191838g = bVar;
            this.f191839h = i10;
        }

        @Override // com.planner5d.library.services.rx.e
        public void c(Throwable th2) {
            k5.this.f191829k.w(this.f191835d, th2);
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onNext(List<com.planner5d.library.model.y> list) {
            if (list.isEmpty()) {
                onError(null);
            } else {
                k5.this.f191831m.f(new C1596a(list));
            }
        }
    }

    class b extends com.planner5d.library.services.utility.w.c<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f191843a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.p.a f191844b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.p.b f191845c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.services.bitmaploader.target.a f191846d;

        b(String str, com.planner5d.library.model.p.a aVar, com.planner5d.library.model.p.b bVar, com.planner5d.library.services.bitmaploader.target.a aVar2) {
            this.f191843a = str;
            this.f191844b = aVar;
            this.f191845c = bVar;
            this.f191846d = aVar2;
        }

        @Override // com.planner5d.library.services.utility.w.c
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Void d() {
            k5 k5Var = k5.this;
            String str = this.f191843a;
            com.planner5d.library.model.p.a aVar = this.f191844b;
            com.planner5d.library.model.p.b bVar = this.f191845c;
            k5Var.r(str, aVar, bVar, bVar.f222457a, this.f191846d);
            return null;
        }
    }

    public interface c {
    }

    @ij.a
    public k5(com.planner5d.library.model.manager.builtin.i iVar, y0 y0Var, com.planner5d.library.api.requests.c cVar, com.planner5d.library.modules.user.user.t tVar, com.planner5d.library.application.b bVar, com.planner5d.library.application.d dVar, com.planner5d.library.model.manager.builtin.v0 v0Var, com.planner5d.library.model.manager.builtin.n nVar, com.planner5d.library.services.bitmaploader.d dVar2, t1 t1Var, com.planner5d.library.services.utility.w wVar) {
        this.f191822d = iVar;
        this.f191823e = y0Var;
        this.f191824f = cVar;
        this.f191825g = tVar;
        this.f191826h = bVar;
        this.f191827i = v0Var;
        this.f191828j = nVar;
        this.f191829k = dVar2;
        this.f191830l = t1Var;
        this.f191831m = wVar;
        f191820x.set(this);
        LinkedList linkedList = new LinkedList();
        if (!dVar.t()) {
            linkedList.add(f191816t);
        }
        Collections.addAll(linkedList, f191817u, f191818v, f191819w);
        this.f191834p = (com.planner5d.library.model.z[]) linkedList.toArray(new com.planner5d.library.model.z[0]);
    }

    public static k5 B() {
        return f191820x.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.m1
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public List<com.planner5d.library.model.y> O(@NonNull com.planner5d.library.model.z zVar, ItemProject itemProject) {
        return zVar.f222860a == null ? z(zVar, itemProject).e() : Arrays.asList(this.f191822d.j0(zVar, true));
    }

    private com.planner5d.library.model.y J(String str) {
        for (com.planner5d.library.model.y yVar : com.planner5d.library.model.editorcollection.g.f180693c.f(this.f191825g.a()).f()) {
            if (yVar.f222851c.equalsIgnoreCase(str)) {
                return yVar;
            }
        }
        return new com.planner5d.library.model.y(str);
    }

    private String K(String str) {
        return com.planner5d.library.api.f.a().f142272j + "/m/t/" + str + ".jpg";
    }

    @androidx.annotation.m1
    private boolean L(String str, com.planner5d.library.model.p.b bVar, com.planner5d.library.model.p.a aVar) {
        return this.f191827i.i(str, bVar, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Pair P(List list) {
        return new Pair(p(list, false), p(list, true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean Q(Bitmap bitmap) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            final JSONObject jSONObject = new JSONObject();
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            jSONObject.put("data", "data:image/png;base64," + new String(Base64.encode(byteArrayOutputStream.toByteArray(), 0)));
            com.planner5d.library.api.c cVar = (com.planner5d.library.api.c) this.f191824f.j(this.f191825g.a(), new Function2() { // from class: com.planner5d.library.model.manager.g5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ((com.planner5d.library.api.b) obj).j((id.a) obj2, jSONObject);
                }
            });
            if (cVar == null || cVar.h()) {
                Boolean bool = Boolean.FALSE;
                byteArrayOutputStream.close();
                return bool;
            }
            try {
                S().toBlocking().firstOrDefault(null);
            } catch (Exception unused) {
            }
            Boolean bool2 = Boolean.TRUE;
            byteArrayOutputStream.close();
            return bool2;
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static Observable<Void> S() {
        return com.planner5d.library.services.rx.i.g(new Callable() { // from class: com.planner5d.library.model.manager.h5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return k5.d();
            }
        }).subscribeOn(com.planner5d.library.services.rx.c.f224933c);
    }

    public static /* synthetic */ Void d() {
        com.planner5d.library.modules.user.user.t tVar;
        while (true) {
            k5 k5Var = f191820x.get();
            if (k5Var != null && (tVar = k5Var.f191825g) != null) {
                com.planner5d.library.model.editorcollection.g.f180693c.f(tVar.a()).e();
                return null;
            }
        }
    }

    private com.planner5d.library.services.bitmaploader.d.C1663d n(com.planner5d.library.services.download.g[] gVarArr, com.planner5d.library.model.p.b bVar, com.planner5d.library.services.bitmaploader.target.a aVar, boolean z10) {
        if (z10) {
            y0 y0Var = this.f191823e;
            int i10 = bVar.f222457a;
            return y0Var.c(gVarArr, i10, i10, aVar, 1L);
        }
        y0 y0Var2 = this.f191823e;
        int i11 = bVar.f222457a;
        return y0Var2.m(gVarArr, i11, i11, aVar, 1L);
    }

    @androidx.annotation.m1
    private void o(com.planner5d.library.model.p pVar, com.planner5d.library.model.p.a aVar, @NotNull com.planner5d.library.model.p.b bVar) {
        try {
            if (L(pVar.f222439a, bVar, aVar)) {
                return;
            }
            com.planner5d.library.services.bitmaploader.target.b bVar2 = new com.planner5d.library.services.bitmaploader.target.b(false);
            if (x(pVar.f222439a, bVar, bVar2, aVar, true) == null) {
                this.f191829k.v(bVar2);
            } else {
                bVar2.k();
            }
            bVar2.dispose();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.m1
    public com.planner5d.library.services.bitmaploader.d.C1663d r(String str, com.planner5d.library.model.p.a aVar, com.planner5d.library.model.p.b bVar, int i10, com.planner5d.library.services.bitmaploader.target.a aVar2) {
        if (f191813q.f222851c.equals(str)) {
            this.f191829k.v(aVar2);
            return null;
        }
        boolean z10 = com.planner5d.library.model.p.a.diffuse == aVar;
        if (f191814r.f222851c.equals(str)) {
            if (z10) {
                return this.f191823e.k(str, i10, i10, aVar2, 1L);
            }
            this.f191829k.v(aVar2);
            return null;
        }
        com.planner5d.library.services.bitmaploader.target.a eVar = aVar2 instanceof com.planner5d.library.services.bitmaploader.target.e ? aVar2 : new com.planner5d.library.services.bitmaploader.target.e(aVar2, A(), new com.planner5d.library.services.bitmaploader.target.i("Texture", this.f191830l));
        if (this.f191822d.V(str)) {
            if (z10) {
                return this.f191823e.b(K(str), i10, i10, eVar, 1L);
            }
            this.f191829k.v(aVar2);
            return null;
        }
        com.planner5d.library.services.bitmaploader.d.C1663d c1663dW = w(str, bVar, eVar, aVar);
        if (c1663dW != null) {
            return c1663dW;
        }
        com.planner5d.library.services.bitmaploader.d.C1663d c1663dX = x(str, bVar, eVar, aVar, false);
        if (c1663dX == null) {
            this.f191829k.v(eVar);
        }
        return c1663dX;
    }

    @androidx.annotation.d
    private void t(com.planner5d.library.model.z zVar, ItemProject itemProject, com.planner5d.library.model.p.a aVar, com.planner5d.library.model.p.b bVar, int i10, com.planner5d.library.services.bitmaploader.target.a aVar2) {
        G(zVar, itemProject).subscribe((Subscriber<? super List<com.planner5d.library.model.y>>) new a(aVar2, zVar, aVar, bVar, i10));
    }

    @androidx.annotation.m1
    private com.planner5d.library.services.bitmaploader.d.C1663d w(String str, com.planner5d.library.model.p.b bVar, com.planner5d.library.services.bitmaploader.target.a aVar, com.planner5d.library.model.p.a aVar2) {
        com.planner5d.library.services.bitmaploader.d.C1663d c1663dY;
        com.planner5d.library.services.bitmaploader.d.C1663d c1663dY2 = y(str, bVar, aVar, aVar2);
        if (c1663dY2 != null) {
            return c1663dY2;
        }
        for (com.planner5d.library.model.p.b bVar2 : com.planner5d.library.model.p.b.values()) {
            if (bVar != bVar2 && (c1663dY = y(str, bVar2, aVar, aVar2)) != null) {
                return c1663dY;
            }
        }
        return null;
    }

    @androidx.annotation.m1
    private com.planner5d.library.services.bitmaploader.d.C1663d x(String str, com.planner5d.library.model.p.b bVar, com.planner5d.library.services.bitmaploader.target.a aVar, com.planner5d.library.model.p.a aVar2, boolean z10) {
        this.f191827i.r();
        com.planner5d.library.services.download.g[] gVarArrG = this.f191827i.g(str, aVar2, bVar);
        if (gVarArrG == null || gVarArrG.length <= 0) {
            return null;
        }
        return n(gVarArrG, bVar, aVar, z10);
    }

    @androidx.annotation.m1
    @androidx.annotation.p0
    private com.planner5d.library.services.bitmaploader.d.C1663d y(String str, com.planner5d.library.model.p.b bVar, com.planner5d.library.services.bitmaploader.target.a aVar, com.planner5d.library.model.p.a aVar2) {
        String strF = this.f191827i.f(str, aVar2, bVar);
        if (!this.f191828j.c(strF)) {
            return null;
        }
        y0 y0Var = this.f191823e;
        int i10 = bVar.f222457a;
        return y0Var.d(strF, i10, i10, aVar, 1L);
    }

    private com.planner5d.library.model.editorcollection.g<com.planner5d.library.model.y> z(com.planner5d.library.model.z zVar, ItemProject itemProject) {
        id.a aVarA = this.f191825g.a();
        if (zVar == f191816t) {
            return com.planner5d.library.model.editorcollection.g.f180693c.f(aVarA);
        }
        if (zVar == f191817u) {
            return com.planner5d.library.model.editorcollection.g.f180693c.a(aVarA);
        }
        if (zVar == f191819w) {
            return com.planner5d.library.model.editorcollection.g.f180693c.c(itemProject, this.f191822d);
        }
        if (zVar == f191818v) {
            return com.planner5d.library.model.editorcollection.g.f180693c.e(aVarA);
        }
        throw new RuntimeException("Unknown texture group");
    }

    public Bitmap A() {
        Bitmap bitmap;
        synchronized (this.f191833o) {
            try {
                if (this.f191832n == null) {
                    this.f191832n = BitmapFactory.decodeResource(this.f191826h.getResources(), com.planner5d.library.f.h.f167700o5);
                }
                bitmap = this.f191832n;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bitmap;
    }

    public com.planner5d.library.model.p C(com.planner5d.library.model.y yVar) {
        if (yVar == null) {
            return null;
        }
        return this.f191827i.d(yVar.f222851c);
    }

    @androidx.annotation.m1
    public com.planner5d.library.model.z[] D(boolean z10) {
        return this.f191822d.i0(z10);
    }

    public com.planner5d.library.model.z[] E(boolean z10) {
        return z10 ? this.f191834p : new com.planner5d.library.model.z[]{f191819w};
    }

    @androidx.annotation.m1
    public Pair<String, Integer> F(@androidx.annotation.p0 String str) {
        boolean z10;
        if (str == null) {
            return null;
        }
        if (this.f191822d.V(str)) {
            z10 = true;
        } else {
            str = com.planner5d.library.model.y.c(str);
            z10 = false;
        }
        if (!this.f191821c.containsKey(str)) {
            this.f191821c.put(str, z10 ? J(str) : this.f191822d.h0(new File(str).getName()));
        }
        com.planner5d.library.model.y yVar = this.f191821c.get(str);
        if (yVar == null) {
            return null;
        }
        return new Pair<>(yVar.f222851c, Integer.valueOf(yVar.f222849a));
    }

    public Observable<List<com.planner5d.library.model.y>> G(@NonNull final com.planner5d.library.model.z zVar, final ItemProject itemProject) {
        return this.f191831m.j(new com.planner5d.library.services.utility.w.a() { // from class: com.planner5d.library.model.manager.j5
            @Override // com.planner5d.library.services.utility.w.a
            public final Object run() {
                return this.f191796a.O(zVar, itemProject);
            }
        });
    }

    public Observable<Pair<com.planner5d.library.model.y[], com.planner5d.library.model.y[]>> H(@NonNull com.planner5d.library.model.z zVar, ItemProject itemProject) {
        return G(zVar, itemProject).map(new Func1() { // from class: com.planner5d.library.model.manager.f5
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return this.f191354a.P((List) obj);
            }
        });
    }

    @androidx.annotation.m1
    public boolean M(ManagedFile managedFile) {
        return L(managedFile.w(), com.planner5d.library.model.p.b.normal, com.planner5d.library.model.p.a.diffuse);
    }

    public boolean N(ManagedFile managedFile) {
        return managedFile.c() == 4 && managedFile.w() != null;
    }

    @androidx.annotation.m1
    public Boolean R(com.planner5d.library.model.y yVar, com.planner5d.library.model.p.a aVar, File file) throws Throwable {
        File parentFile;
        Throwable th2;
        FileOutputStream fileOutputStream = null;
        if (yVar != null && yVar.f222851c != null && file != null && (parentFile = file.getParentFile()) != null && (parentFile.isDirectory() || parentFile.mkdirs())) {
            boolean z10 = true;
            com.planner5d.library.services.bitmaploader.target.b bVar = new com.planner5d.library.services.bitmaploader.target.b(true);
            com.planner5d.library.model.p.b bVar2 = com.planner5d.library.model.p.a.normal == aVar ? com.planner5d.library.model.p.b.big : com.planner5d.library.model.p.b.normal;
            if (r(yVar.f222851c, aVar, bVar2, bVar2.f222457a, bVar) == null) {
                return null;
            }
            bVar.k();
            Bitmap bitmapC = bVar.c();
            if (bitmapC != null) {
                try {
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                    try {
                        bitmapC.compress(compressFormat, 100, fileOutputStream2);
                        try {
                            fileOutputStream2.close();
                        } catch (IOException unused) {
                        }
                    } catch (Exception unused2) {
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused3) {
                            }
                        }
                        z10 = false;
                    } catch (Throwable th3) {
                        th2 = th3;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream == null) {
                            throw th2;
                        }
                        try {
                            fileOutputStream.close();
                            throw th2;
                        } catch (IOException unused4) {
                            throw th2;
                        }
                    }
                } catch (Exception unused5) {
                } catch (Throwable th4) {
                    th2 = th4;
                }
            } else {
                z10 = false;
            }
            bVar.dispose();
            return Boolean.valueOf(z10);
        }
        return null;
    }

    public Observable<Boolean> T(final Bitmap bitmap) {
        return this.f191831m.j(new com.planner5d.library.services.utility.w.a() { // from class: com.planner5d.library.model.manager.i5
            @Override // com.planner5d.library.services.utility.w.a
            public final Object run() {
                return this.f191572a.Q(bitmap);
            }
        });
    }

    public void k(@NonNull com.planner5d.library.model.y yVar) {
        z(f191818v, null).c(yVar);
    }

    public com.planner5d.library.model.editorcollection.h<com.planner5d.library.model.y> l() {
        return new com.planner5d.library.model.editorcollection.h<>(z(f191817u, null));
    }

    @androidx.annotation.m1
    public boolean m(ManagedFile managedFile) {
        String strW = managedFile.w();
        com.planner5d.library.model.p pVarD = this.f191827i.d(strW);
        if (strW != null && pVarD != null) {
            o(pVarD, com.planner5d.library.model.p.a.diffuse, com.planner5d.library.model.p.b.normal);
        }
        return M(managedFile);
    }

    public com.planner5d.library.model.y[] p(List<com.planner5d.library.model.y> list, boolean z10) {
        LinkedList linkedList = new LinkedList();
        for (com.planner5d.library.model.y yVar : list) {
            if (yVar.f222856h == z10) {
                linkedList.add(yVar);
            }
        }
        return (com.planner5d.library.model.y[]) linkedList.toArray(new com.planner5d.library.model.y[0]);
    }

    @androidx.annotation.m1
    public com.planner5d.library.model.y q(@androidx.annotation.p0 String str) {
        String strC = com.planner5d.library.model.y.c(str);
        if (!this.f191821c.containsKey(strC)) {
            this.f191821c.put(strC, this.f191822d.V(strC) ? J(strC) : this.f191822d.h0(strC));
        }
        return this.f191821c.get(strC);
    }

    @androidx.annotation.d
    public void u(c cVar, ItemProject itemProject, com.planner5d.library.model.p.a aVar, com.planner5d.library.model.p.b bVar, int i10, com.planner5d.library.services.bitmaploader.target.a aVar2) {
        if (cVar instanceof com.planner5d.library.model.z) {
            t((com.planner5d.library.model.z) cVar, itemProject, aVar, bVar, i10, aVar2);
        } else {
            v(((com.planner5d.library.model.y) cVar).f222851c, aVar, bVar, aVar2);
        }
    }

    @androidx.annotation.d
    public void v(String str, com.planner5d.library.model.p.a aVar, com.planner5d.library.model.p.b bVar, com.planner5d.library.services.bitmaploader.target.a aVar2) {
        this.f191831m.f(new b(str, aVar, bVar, aVar2));
    }
}
