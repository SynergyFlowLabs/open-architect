package k5;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TimePicker;
import com.facebook.appevents.internal.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c f307555a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final List<Class<? extends View>> f307556b = CollectionsKt.listOf((Object[]) new Class[]{Switch.class, Spinner.class, DatePicker.class, TimePicker.class, RadioGroup.class, RatingBar.class, EditText.class, AdapterView.class});

    private c() {
    }

    @n
    @NotNull
    public static final List<View> a(@NotNull View view) {
        int i10 = 6 >> 0;
        if (com.facebook.internal.instrument.crashshield.b.e(c.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            ArrayList arrayList = new ArrayList();
            Iterator<Class<? extends View>> it = f307556b.iterator();
            while (it.hasNext()) {
                if (it.next().isInstance(view)) {
                    return arrayList;
                }
            }
            if (view.isClickable()) {
                arrayList.add(view);
            }
            f5.g gVar = f5.g.f275010a;
            Iterator<View> it2 = f5.g.b(view).iterator();
            while (it2.hasNext()) {
                arrayList.addAll(a(it2.next()));
            }
            return arrayList;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, c.class);
            return null;
        }
    }

    @n
    @NotNull
    public static final JSONObject b(@NotNull View view, @NotNull View clickedView) {
        if (com.facebook.internal.instrument.crashshield.b.e(c.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(clickedView, "clickedView");
            JSONObject jSONObject = new JSONObject();
            if (view == clickedView) {
                try {
                    jSONObject.put(p.f99114y, true);
                } catch (JSONException unused) {
                }
            }
            e(view, jSONObject);
            JSONArray jSONArray = new JSONArray();
            f5.g gVar = f5.g.f275010a;
            Iterator<View> it = f5.g.b(view).iterator();
            while (it.hasNext()) {
                jSONArray.put(b(it.next(), clickedView));
            }
            jSONObject.put(p.f99099j, jSONArray);
            return jSONObject;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, c.class);
            return null;
        }
    }

    private final List<String> c(View view) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            f5.g gVar = f5.g.f275010a;
            for (View view2 : f5.g.b(view)) {
                f5.g gVar2 = f5.g.f275010a;
                String strK = f5.g.k(view2);
                if (strK.length() > 0) {
                    arrayList.add(strK);
                }
                arrayList.addAll(c(view2));
            }
            return arrayList;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return null;
        }
    }

    @n
    @NotNull
    public static final String d(@NotNull View hostView) {
        if (com.facebook.internal.instrument.crashshield.b.e(c.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            f5.g gVar = f5.g.f275010a;
            String strK = f5.g.k(hostView);
            if (strK.length() > 0) {
                return strK;
            }
            String strJoin = TextUtils.join(" ", f307555a.c(hostView));
            Intrinsics.checkNotNullExpressionValue(strJoin, "join(\" \", childrenText)");
            return strJoin;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, c.class);
            return null;
        }
    }

    @n
    public static final void e(@NotNull View view, @NotNull JSONObject json) {
        if (com.facebook.internal.instrument.crashshield.b.e(c.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(json, "json");
            try {
                f5.g gVar = f5.g.f275010a;
                String strK = f5.g.k(view);
                String strI = f5.g.i(view);
                json.put(p.f99089c, view.getClass().getSimpleName());
                json.put(p.f99091d, f5.g.c(view));
                if (strK.length() > 0) {
                    json.put("text", strK);
                }
                if (strI.length() > 0) {
                    json.put(p.f99100k, strI);
                }
                if (view instanceof EditText) {
                    json.put(p.f99113x, ((EditText) view).getInputType());
                }
            } catch (JSONException unused) {
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, c.class);
        }
    }
}
