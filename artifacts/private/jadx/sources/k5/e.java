package k5;

import android.app.Activity;
import androidx.annotation.b1;
import androidx.annotation.l1;
import com.facebook.g0;
import com.facebook.internal.b0;
import com.facebook.internal.x;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e f307557a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final AtomicBoolean f307558b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final Set<String> f307559c = new LinkedHashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final Set<String> f307560d = new LinkedHashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final String f307561e = "production_events";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final String f307562f = "eligible_for_prediction_events";

    private e() {
    }

    @n
    public static final synchronized void b() {
        try {
            if (com.facebook.internal.instrument.crashshield.b.e(e.class)) {
                return;
            }
            try {
                g0 g0Var = g0.f99617a;
                g0.y().execute(new Runnable() { // from class: k5.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.c();
                    }
                });
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, e.class);
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c() {
        if (com.facebook.internal.instrument.crashshield.b.e(e.class)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = f307558b;
            if (atomicBoolean.get()) {
                return;
            }
            atomicBoolean.set(true);
            f307557a.d();
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, e.class);
        }
    }

    private final void d() {
        String strR;
        if (!com.facebook.internal.instrument.crashshield.b.e(this)) {
            try {
                b0 b0Var = b0.f99725a;
                g0 g0Var = g0.f99617a;
                x xVarN = b0.n(g0.o(), false);
                if (xVarN != null && (strR = xVarN.r()) != null) {
                    h(strR);
                    if (!f307559c.isEmpty() || !f307560d.isEmpty()) {
                        i5.f fVar = i5.f.f287005a;
                        File fileL = i5.f.l(i5.f.a.MTML_APP_EVENT_PREDICTION);
                        if (fileL != null) {
                            a aVar = a.f307536a;
                            a.d(fileL);
                            com.facebook.appevents.internal.f fVar2 = com.facebook.appevents.internal.f.f98997a;
                            Activity activityL = com.facebook.appevents.internal.f.l();
                            if (activityL != null) {
                                i(activityL);
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, this);
            }
        }
    }

    @n
    public static final boolean e(@NotNull String event) {
        if (com.facebook.internal.instrument.crashshield.b.e(e.class)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(event, "event");
            return f307560d.contains(event);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, e.class);
            return false;
        }
    }

    @n
    public static final boolean f() {
        if (com.facebook.internal.instrument.crashshield.b.e(e.class)) {
            return false;
        }
        try {
            return f307558b.get();
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, e.class);
            return false;
        }
    }

    @n
    public static final boolean g(@NotNull String event) {
        if (com.facebook.internal.instrument.crashshield.b.e(e.class)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(event, "event");
            return f307559c.contains(event);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, e.class);
            return false;
        }
    }

    @n
    public static final void i(@NotNull Activity activity) {
        if (com.facebook.internal.instrument.crashshield.b.e(e.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activity, "activity");
            try {
                if (f307558b.get()) {
                    a aVar = a.f307536a;
                    if (a.f()) {
                        if (f307559c.isEmpty()) {
                            if (!f307560d.isEmpty()) {
                            }
                        }
                        g.f307564d.a(activity);
                        return;
                    }
                }
                g.f307564d.b(activity);
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, e.class);
        }
    }

    @l1(otherwise = 2)
    public final void h(@Nullable String str) {
        JSONArray jSONArray;
        int length;
        JSONArray jSONArray2;
        int length2;
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i10 = 0;
            if (jSONObject.has(f307561e) && (length2 = (jSONArray2 = jSONObject.getJSONArray(f307561e)).length()) > 0) {
                int i11 = 0;
                while (true) {
                    int i12 = i11 + 1;
                    Set<String> set = f307559c;
                    String string = jSONArray2.getString(i11);
                    Intrinsics.checkNotNullExpressionValue(string, "jsonArray.getString(i)");
                    set.add(string);
                    if (i12 >= length2) {
                        break;
                    } else {
                        i11 = i12;
                    }
                }
            }
            if (!jSONObject.has(f307562f) || (length = (jSONArray = jSONObject.getJSONArray(f307562f)).length()) <= 0) {
                return;
            }
            while (true) {
                int i13 = i10 + 1;
                Set<String> set2 = f307560d;
                String string2 = jSONArray.getString(i10);
                Intrinsics.checkNotNullExpressionValue(string2, "jsonArray.getString(i)");
                set2.add(string2);
                if (i13 >= length) {
                    return;
                } else {
                    i10 = i13;
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }
}
