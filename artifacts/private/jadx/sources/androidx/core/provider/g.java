package androidx.core.provider;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import androidx.annotation.NonNull;
import androidx.annotation.b0;
import androidx.annotation.p0;
import androidx.collection.d1;
import androidx.collection.h3;
import androidx.core.graphics.a0;
import androidx.core.graphics.z;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final d1<String, Typeface> f48115a = new d1<>(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ExecutorService f48116b = i.a("fonts-androidx", 10, 10000);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Object f48117c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @b0("LOCK")
    static final h3<String, ArrayList<androidx.core.util.e<e>>> f48118d = new h3<>();

    class a implements Callable<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f48119a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f48120b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f48121c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f48122d;

        a(String str, Context context, f fVar, int i10) {
            this.f48119a = str;
            this.f48120b = context;
            this.f48121c = fVar;
            this.f48122d = i10;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            return g.c(this.f48119a, this.f48120b, z.a(new Object[]{this.f48121c}), this.f48122d);
        }
    }

    class b implements androidx.core.util.e<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.core.provider.a f48123a;

        b(androidx.core.provider.a aVar) {
            this.f48123a = aVar;
        }

        @Override // androidx.core.util.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.f48123a.b(eVar);
        }
    }

    class c implements Callable<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f48124a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f48125b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f48126c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f48127d;

        c(String str, Context context, List list, int i10) {
            this.f48124a = str;
            this.f48125b = context;
            this.f48126c = list;
            this.f48127d = i10;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            try {
                return g.c(this.f48124a, this.f48125b, this.f48126c, this.f48127d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    class d implements androidx.core.util.e<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f48128a;

        d(String str) {
            this.f48128a = str;
        }

        @Override // androidx.core.util.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            synchronized (g.f48117c) {
                try {
                    h3<String, ArrayList<androidx.core.util.e<e>>> h3Var = g.f48118d;
                    ArrayList<androidx.core.util.e<e>> arrayList = h3Var.get(this.f48128a);
                    if (arrayList == null) {
                        return;
                    }
                    h3Var.remove(this.f48128a);
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        arrayList.get(i10).accept(eVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private g() {
    }

    private static String a(@NonNull List<f> list, int i10) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < list.size(); i11++) {
            sb2.append(list.get(i11).d());
            sb2.append("-");
            sb2.append(i10);
            if (i11 < list.size() - 1) {
                sb2.append(";");
            }
        }
        return sb2.toString();
    }

    @e.a({"WrongConstant"})
    private static int b(@NonNull h.b bVar) {
        int i10 = 1;
        if (bVar.e() != 0) {
            return bVar.e() != 1 ? -3 : -2;
        }
        h.c[] cVarArrC = bVar.c();
        if (cVarArrC != null && cVarArrC.length != 0) {
            i10 = 0;
            for (h.c cVar : cVarArrC) {
                int iB = cVar.b();
                if (iB != 0) {
                    if (iB < 0) {
                        return -3;
                    }
                    return iB;
                }
            }
        }
        return i10;
    }

    @NonNull
    static e c(@NonNull String str, @NonNull Context context, @NonNull List<f> list, int i10) {
        androidx.tracing.b.c("getFontSync");
        try {
            d1<String, Typeface> d1Var = f48115a;
            Typeface typefaceF = d1Var.f(str);
            if (typefaceF != null) {
                e eVar = new e(typefaceF);
                androidx.tracing.b.f();
                return eVar;
            }
            try {
                h.b bVarF = androidx.core.provider.e.f(context, list, null);
                int iB = b(bVarF);
                if (iB != 0) {
                    e eVar2 = new e(iB);
                    androidx.tracing.b.f();
                    return eVar2;
                }
                Typeface typefaceE = bVarF.f() ? a0.e(context, null, bVarF.d(), i10) : a0.d(context, null, bVarF.c(), i10);
                if (typefaceE == null) {
                    e eVar3 = new e(-3);
                    androidx.tracing.b.f();
                    return eVar3;
                }
                d1Var.j(str, typefaceE);
                e eVar4 = new e(typefaceE);
                androidx.tracing.b.f();
                return eVar4;
            } catch (PackageManager.NameNotFoundException unused) {
                e eVar5 = new e(-1);
                androidx.tracing.b.f();
                return eVar5;
            }
        } catch (Throwable th2) {
            androidx.tracing.b.f();
            throw th2;
        }
    }

    static Typeface d(@NonNull Context context, @NonNull List<f> list, int i10, @p0 Executor executor, @NonNull androidx.core.provider.a aVar) {
        String strA = a(list, i10);
        Typeface typefaceF = f48115a.f(strA);
        if (typefaceF != null) {
            aVar.b(new e(typefaceF));
            return typefaceF;
        }
        b bVar = new b(aVar);
        synchronized (f48117c) {
            try {
                h3<String, ArrayList<androidx.core.util.e<e>>> h3Var = f48118d;
                ArrayList<androidx.core.util.e<e>> arrayList = h3Var.get(strA);
                if (arrayList != null) {
                    arrayList.add(bVar);
                    return null;
                }
                ArrayList<androidx.core.util.e<e>> arrayList2 = new ArrayList<>();
                arrayList2.add(bVar);
                h3Var.put(strA, arrayList2);
                c cVar = new c(strA, context, list, i10);
                if (executor == null) {
                    executor = f48116b;
                }
                i.c(executor, cVar, new d(strA));
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static Typeface e(@NonNull Context context, @NonNull f fVar, @NonNull androidx.core.provider.a aVar, int i10, int i11) {
        String strA = a(z.a(new Object[]{fVar}), i10);
        Typeface typefaceF = f48115a.f(strA);
        if (typefaceF != null) {
            aVar.b(new e(typefaceF));
            return typefaceF;
        }
        if (i11 == -1) {
            e eVarC = c(strA, context, z.a(new Object[]{fVar}), i10);
            aVar.b(eVarC);
            return eVarC.f48129a;
        }
        try {
            e eVar = (e) i.d(f48116b, new a(strA, context, fVar, i10), i11);
            aVar.b(eVar);
            return eVar.f48129a;
        } catch (InterruptedException unused) {
            aVar.b(new e(-3));
            return null;
        }
    }

    static void f() {
        f48115a.d();
    }

    static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Typeface f48129a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f48130b;

        e(int i10) {
            this.f48129a = null;
            this.f48130b = i10;
        }

        @e.a({"WrongConstant"})
        boolean a() {
            return this.f48130b == 0;
        }

        @e.a({"WrongConstant"})
        e(@NonNull Typeface typeface) {
            this.f48129a = typeface;
            this.f48130b = 0;
        }
    }
}
