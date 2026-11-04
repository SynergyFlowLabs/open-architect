package o5;

import androidx.annotation.b1;
import androidx.annotation.l1;
import com.facebook.GraphRequest;
import com.facebook.g0;
import com.facebook.internal.e1;
import com.facebook.internal.t;
import com.facebook.p0;
import com.facebook.q0;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q1;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f333541a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f333542b;

    private b() {
    }

    @n
    public static final void b() {
        f333542b = true;
        g0 g0Var = g0.f99617a;
        if (g0.s()) {
            f333541a.e();
        }
    }

    @n
    public static final void c(@Nullable Throwable th2) {
        if (f333542b && !d() && th2 != null) {
            HashSet hashSet = new HashSet();
            StackTraceElement[] stackTrace = th2.getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "e.stackTrace");
            for (StackTraceElement stackTraceElement : stackTrace) {
                t tVar = t.f100072a;
                String className = stackTraceElement.getClassName();
                Intrinsics.checkNotNullExpressionValue(className, "it.className");
                t.b bVarD = t.d(className);
                if (bVarD != t.b.Unknown) {
                    t.c(bVarD);
                    hashSet.add(bVarD.toString());
                }
            }
            g0 g0Var = g0.f99617a;
            if (!g0.s() || hashSet.isEmpty()) {
                return;
            }
            c.a aVar = c.a.f333560a;
            c.a.c(new JSONArray((Collection) hashSet)).g();
        }
    }

    @n
    @l1(otherwise = 2)
    public static final boolean d() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(c instrumentData, q0 response) {
        Intrinsics.checkNotNullParameter(instrumentData, "$instrumentData");
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            if (response.g() == null) {
                JSONObject jSONObjectK = response.k();
                if (Intrinsics.areEqual(jSONObjectK == null ? null : Boolean.valueOf(jSONObjectK.getBoolean("success")), Boolean.TRUE)) {
                    instrumentData.a();
                }
            }
        } catch (JSONException unused) {
        }
    }

    @l1(otherwise = 2)
    public final void e() {
        e1 e1Var = e1.f99794a;
        if (!e1.W()) {
            k kVar = k.f333571a;
            File[] fileArrN = k.n();
            ArrayList arrayList = new ArrayList();
            int length = fileArrN.length;
            int i10 = 0;
            while (i10 < length) {
                File file = fileArrN[i10];
                i10++;
                c.a aVar = c.a.f333560a;
                final c cVarD = c.a.d(file);
                if (cVarD.f()) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("crash_shield", cVarD.toString());
                        GraphRequest.c cVar = GraphRequest.f98518n;
                        q1 q1Var = q1.f312784a;
                        g0 g0Var = g0.f99617a;
                        String str = String.format("%s/instruments", Arrays.copyOf(new Object[]{g0.o()}, 1));
                        Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
                        arrayList.add(cVar.N(null, str, jSONObject, new GraphRequest.b() { // from class: o5.a
                            @Override // com.facebook.GraphRequest.b
                            public final void a(q0 q0Var) {
                                b.f(cVarD, q0Var);
                            }
                        }));
                    } catch (JSONException unused) {
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                new p0(arrayList).n();
            }
        }
    }
}
