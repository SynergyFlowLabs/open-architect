package q5;

import androidx.annotation.b1;
import com.facebook.GraphRequest;
import com.facebook.g0;
import com.facebook.internal.e1;
import com.facebook.q0;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.r;
import o5.k;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class c implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f350253b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f350254c = c.class.getCanonicalName();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f350255d = 5;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private static c f350256e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Thread.UncaughtExceptionHandler f350257a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void d() {
            e1 e1Var = e1.f99794a;
            if (e1.W()) {
                return;
            }
            k kVar = k.f333571a;
            File[] fileArrP = k.p();
            ArrayList arrayList = new ArrayList(fileArrP.length);
            for (File file : fileArrP) {
                o5.c.a aVar = o5.c.a.f333560a;
                arrayList.add(o5.c.a.d(file));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((o5.c) obj).f()) {
                    arrayList2.add(obj);
                }
            }
            final List listSortedWith = CollectionsKt.sortedWith(arrayList2, new Comparator() { // from class: q5.a
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    return c.a.e((o5.c) obj2, (o5.c) obj3);
                }
            });
            JSONArray jSONArray = new JSONArray();
            Iterator<Integer> it = r.W1(0, Math.min(listSortedWith.size(), 5)).iterator();
            while (it.hasNext()) {
                jSONArray.put(listSortedWith.get(((IntIterator) it).nextInt()));
            }
            k kVar2 = k.f333571a;
            k.s("crash_reports", jSONArray, new GraphRequest.b() { // from class: q5.b
                @Override // com.facebook.GraphRequest.b
                public final void a(q0 q0Var) {
                    c.a.f(listSortedWith, q0Var);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int e(o5.c cVar, o5.c o10) {
            Intrinsics.checkNotNullExpressionValue(o10, "o2");
            return cVar.b(o10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(List validReports, q0 response) {
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
        }

        @n
        public final synchronized void c() {
            try {
                g0 g0Var = g0.f99617a;
                if (g0.s()) {
                    d();
                }
                if (c.f350256e != null) {
                    String unused = c.f350254c;
                } else {
                    c.f350256e = new c(Thread.getDefaultUncaughtExceptionHandler(), null);
                    Thread.setDefaultUncaughtExceptionHandler(c.f350256e);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }

        private a() {
        }
    }

    public /* synthetic */ c(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, DefaultConstructorMarker defaultConstructorMarker) {
        this(uncaughtExceptionHandler);
    }

    @n
    public static final synchronized void d() {
        f350253b.c();
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(@NotNull Thread t10, @NotNull Throwable e10) {
        Intrinsics.checkNotNullParameter(t10, "t");
        Intrinsics.checkNotNullParameter(e10, "e");
        k kVar = k.f333571a;
        if (k.j(e10)) {
            o5.b bVar = o5.b.f333541a;
            o5.b.c(e10);
            o5.c.a aVar = o5.c.a.f333560a;
            o5.c.a.b(e10, o5.c.EnumC2344c.CrashReport).g();
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f350257a;
        if (uncaughtExceptionHandler == null) {
            return;
        }
        uncaughtExceptionHandler.uncaughtException(t10, e10);
    }

    private c(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f350257a = uncaughtExceptionHandler;
    }
}
