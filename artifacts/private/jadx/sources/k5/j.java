package k5;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.b1;
import com.facebook.GraphRequest;
import com.facebook.appevents.f0;
import com.facebook.appevents.internal.p;
import com.facebook.g0;
import com.facebook.internal.e1;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q1;
import kotlin.text.StringsKt;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY})
public final class j implements View.OnClickListener {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final String f307577f = "%s/suggested_events";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final String f307578g = "other";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final View.OnClickListener f307580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final WeakReference<View> f307581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final WeakReference<View> f307582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f307583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f307576e = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final Set<Integer> f307579h = new HashSet();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void e(String str, String str2, float[] fArr) {
            e eVar = e.f307557a;
            if (e.g(str)) {
                g0 g0Var = g0.f99617a;
                new f0(g0.n()).k(str, str2);
            } else if (e.e(str)) {
                h(str, str2, fArr);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean f(String str, final String str2) {
            b bVar = b.f307549a;
            final String strD = b.d(str);
            if (strD == null) {
                return false;
            }
            if (Intrinsics.areEqual(strD, "other")) {
                return true;
            }
            e1 e1Var = e1.f99794a;
            e1.A0(new Runnable() { // from class: k5.i
                @Override // java.lang.Runnable
                public final void run() {
                    j.a.g(strD, str2);
                }
            });
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void g(String queriedEvent, String buttonText) {
            Intrinsics.checkNotNullParameter(queriedEvent, "$queriedEvent");
            Intrinsics.checkNotNullParameter(buttonText, "$buttonText");
            int i10 = 2 ^ 0;
            j.f307576e.e(queriedEvent, buttonText, new float[0]);
        }

        private final void h(String str, String str2, float[] fArr) {
            Bundle bundle = new Bundle();
            try {
                bundle.putString("event_name", str);
                JSONObject jSONObject = new JSONObject();
                StringBuilder sb2 = new StringBuilder();
                int length = fArr.length;
                int i10 = 0;
                while (i10 < length) {
                    float f10 = fArr[i10];
                    i10++;
                    sb2.append(f10);
                    sb2.append(",");
                }
                jSONObject.put("dense", sb2.toString());
                jSONObject.put("button_text", str2);
                bundle.putString("metadata", jSONObject.toString());
                GraphRequest.c cVar = GraphRequest.f98518n;
                q1 q1Var = q1.f312784a;
                Locale locale = Locale.US;
                g0 g0Var = g0.f99617a;
                String str3 = String.format(locale, j.f307577f, Arrays.copyOf(new Object[]{g0.o()}, 1));
                Intrinsics.checkNotNullExpressionValue(str3, "java.lang.String.format(locale, format, *args)");
                GraphRequest graphRequestN = cVar.N(null, str3, null, null);
                graphRequestN.r0(bundle);
                graphRequestN.l();
            } catch (JSONException unused) {
            }
        }

        @n
        public final void d(@NotNull View hostView, @NotNull View rootView, @NotNull String activityName) {
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            Intrinsics.checkNotNullParameter(activityName, "activityName");
            int iHashCode = hostView.hashCode();
            if (j.b().contains(Integer.valueOf(iHashCode))) {
                return;
            }
            f5.g gVar = f5.g.f275010a;
            int i10 = 5 << 0;
            f5.g.r(hostView, new j(hostView, rootView, activityName, null));
            j.b().add(Integer.valueOf(iHashCode));
        }

        private a() {
        }
    }

    public /* synthetic */ j(View view, View view2, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, view2, str);
    }

    public static final /* synthetic */ Set b() {
        if (com.facebook.internal.instrument.crashshield.b.e(j.class)) {
            return null;
        }
        try {
            return f307579h;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, j.class);
            return null;
        }
    }

    @n
    public static final void c(@NotNull View view, @NotNull View view2, @NotNull String str) {
        if (com.facebook.internal.instrument.crashshield.b.e(j.class)) {
            return;
        }
        try {
            f307576e.d(view, view2, str);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, j.class);
        }
    }

    private final void d(final String str, final String str2, final JSONObject jSONObject) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            e1 e1Var = e1.f99794a;
            e1.A0(new Runnable() { // from class: k5.h
                @Override // java.lang.Runnable
                public final void run() {
                    j.e(jSONObject, str2, this, str);
                }
            });
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(JSONObject viewData, String buttonText, j this$0, String pathID) {
        if (!com.facebook.internal.instrument.crashshield.b.e(j.class)) {
            try {
                Intrinsics.checkNotNullParameter(viewData, "$viewData");
                Intrinsics.checkNotNullParameter(buttonText, "$buttonText");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(pathID, "$pathID");
                try {
                    e1 e1Var = e1.f99794a;
                    g0 g0Var = g0.f99617a;
                    String strU = e1.u(g0.n());
                    if (strU == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    String lowerCase = strU.toLowerCase();
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
                    k5.a aVar = k5.a.f307536a;
                    float[] fArrA = k5.a.a(viewData, lowerCase);
                    String strC = k5.a.c(buttonText, this$0.f307583d, lowerCase);
                    if (fArrA != null) {
                        i5.f fVar = i5.f.f287005a;
                        String[] strArrQ = i5.f.q(i5.f.a.MTML_APP_EVENT_PREDICTION, new float[][]{fArrA}, new String[]{strC});
                        if (strArrQ != null) {
                            String str = strArrQ[0];
                            b bVar = b.f307549a;
                            b.a(pathID, str);
                            if (!Intrinsics.areEqual(str, "other")) {
                                f307576e.e(str, buttonText, fArrA);
                            }
                        }
                    }
                } catch (Exception unused) {
                }
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, j.class);
            }
        }
    }

    private final void f() {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            View view = this.f307581b.get();
            View view2 = this.f307582c.get();
            if (view == null || view2 == null) {
                return;
            }
            try {
                c cVar = c.f307555a;
                String strD = c.d(view2);
                b bVar = b.f307549a;
                String strB = b.b(view2, strD);
                if (strB != null && !f307576e.f(strB, strD)) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(p.A, c.b(view, view2));
                    jSONObject.put(p.f99115z, this.f307583d);
                    d(strB, strD, jSONObject);
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull View view) {
        if (!com.facebook.internal.instrument.crashshield.b.e(this)) {
            try {
                if (!com.facebook.internal.instrument.crashshield.b.e(this)) {
                    try {
                        Intrinsics.checkNotNullParameter(view, "view");
                        View.OnClickListener onClickListener = this.f307580a;
                        if (onClickListener != null) {
                            onClickListener.onClick(view);
                        }
                        f();
                    } catch (Throwable th2) {
                        com.facebook.internal.instrument.crashshield.b.c(th2, this);
                    }
                }
            } catch (Throwable th3) {
                com.facebook.internal.instrument.crashshield.b.c(th3, this);
            }
        }
    }

    private j(View view, View view2, String str) {
        f5.g gVar = f5.g.f275010a;
        this.f307580a = f5.g.g(view);
        this.f307581b = new WeakReference<>(view2);
        this.f307582c = new WeakReference<>(view);
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String lowerCase = str.toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
        this.f307583d = StringsKt.k2(lowerCase, "activity", "", false, 4, null);
    }
}
