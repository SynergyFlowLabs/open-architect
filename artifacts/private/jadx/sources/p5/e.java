package p5;

import androidx.annotation.b1;
import androidx.annotation.l1;
import com.facebook.GraphRequest;
import com.facebook.g0;
import com.facebook.internal.e1;
import com.facebook.q0;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.r;
import o5.k;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f340778b = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e f340777a = new e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final AtomicBoolean f340779c = new AtomicBoolean(false);

    private e() {
    }

    @n
    public static final synchronized void c() {
        try {
            if (com.facebook.internal.instrument.crashshield.b.e(e.class)) {
                return;
            }
            try {
                if (f340779c.getAndSet(true)) {
                    return;
                }
                g0 g0Var = g0.f99617a;
                if (g0.s()) {
                    d();
                }
                b bVar = b.f340770a;
                b.d();
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, e.class);
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @n
    @l1
    public static final void d() {
        if (!com.facebook.internal.instrument.crashshield.b.e(e.class)) {
            try {
                e1 e1Var = e1.f99794a;
                if (!e1.W()) {
                    k kVar = k.f333571a;
                    File[] fileArrL = k.l();
                    ArrayList arrayList = new ArrayList(fileArrL.length);
                    for (File file : fileArrL) {
                        o5.c.a aVar = o5.c.a.f333560a;
                        arrayList.add(o5.c.a.d(file));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        if (((o5.c) obj).f()) {
                            arrayList2.add(obj);
                        }
                    }
                    final List listSortedWith = CollectionsKt.sortedWith(arrayList2, new Comparator() { // from class: p5.c
                        @Override // java.util.Comparator
                        public final int compare(Object obj2, Object obj3) {
                            return e.e((o5.c) obj2, (o5.c) obj3);
                        }
                    });
                    JSONArray jSONArray = new JSONArray();
                    Iterator<Integer> it = r.W1(0, Math.min(listSortedWith.size(), 5)).iterator();
                    while (it.hasNext()) {
                        jSONArray.put(listSortedWith.get(((IntIterator) it).nextInt()));
                    }
                    k kVar2 = k.f333571a;
                    k.s("anr_reports", jSONArray, new GraphRequest.b() { // from class: p5.d
                        @Override // com.facebook.GraphRequest.b
                        public final void a(q0 q0Var) {
                            e.f(listSortedWith, q0Var);
                        }
                    });
                }
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, e.class);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(o5.c cVar, o5.c o10) {
        if (com.facebook.internal.instrument.crashshield.b.e(e.class)) {
            return 0;
        }
        try {
            Intrinsics.checkNotNullExpressionValue(o10, "o2");
            return cVar.b(o10);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, e.class);
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(List validReports, q0 response) {
        if (com.facebook.internal.instrument.crashshield.b.e(e.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(validReports, "$validReports");
            Intrinsics.checkNotNullParameter(response, "response");
            try {
                if (response.g() == null) {
                    JSONObject jSONObjectK = response.k();
                    if (Intrinsics.areEqual(jSONObjectK == null ? null : Boolean.valueOf(jSONObjectK.getBoolean("success")), Boolean.TRUE)) {
                        Iterator it = validReports.iterator();
                        while (it.hasNext()) {
                            ((o5.c) it.next()).a();
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, e.class);
        }
    }
}
