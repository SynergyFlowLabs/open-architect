package h5;

import com.facebook.g0;
import com.facebook.internal.instrument.crashshield.b;
import com.facebook.internal.w;
import i5.f;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f280367a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final String f280368b = "none";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String f280369c = "address";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final String f280370d = "health";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final String f280371e = "_onDeviceParams";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f280372f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static boolean f280373g;

    private a() {
    }

    @n
    public static final void a() {
        if (b.e(a.class)) {
            return;
        }
        try {
            f280372f = true;
            w wVar = w.f100131a;
            g0 g0Var = g0.f99617a;
            f280373g = w.d("FBSDKFeatureIntegritySample", g0.o(), false);
        } catch (Throwable th2) {
            b.c(th2, a.class);
        }
    }

    private final String b(String str) {
        String str2;
        if (b.e(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            for (int i10 = 0; i10 < 30; i10++) {
                fArr[i10] = 0.0f;
            }
            f fVar = f.f287005a;
            String[] strArrQ = f.q(f.a.MTML_INTEGRITY_DETECT, new float[][]{fArr}, new String[]{str});
            if (strArrQ != null && (str2 = strArrQ[0]) != null) {
                return str2;
            }
            return "none";
        } catch (Throwable th2) {
            b.c(th2, this);
            return null;
        }
    }

    @n
    public static final void c(@NotNull Map<String, String> parameters) {
        if (b.e(a.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            if (!f280372f || parameters.isEmpty()) {
                return;
            }
            try {
                List<String> list = CollectionsKt.toList(parameters.keySet());
                JSONObject jSONObject = new JSONObject();
                for (String str : list) {
                    String str2 = parameters.get(str);
                    if (str2 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    String str3 = str2;
                    a aVar = f280367a;
                    if (aVar.d(str) || aVar.d(str3)) {
                        parameters.remove(str);
                        if (!f280373g) {
                            str3 = "";
                        }
                        jSONObject.put(str, str3);
                    }
                }
                if (jSONObject.length() != 0) {
                    String string = jSONObject.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "restrictiveParamJson.toString()");
                    parameters.put(f280371e, string);
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            b.c(th2, a.class);
        }
    }

    private final boolean d(String str) {
        if (b.e(this)) {
            return false;
        }
        try {
            return !Intrinsics.areEqual("none", b(str));
        } catch (Throwable th2) {
            b.c(th2, this);
            return false;
        }
    }
}
