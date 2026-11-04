package e5;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import f5.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import oj.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c f274659a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f274660b = 100;

    private c() {
    }

    @n
    @NotNull
    public static final List<String> a(@NotNull View view) {
        if (com.facebook.internal.instrument.crashshield.b.e(c.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            ArrayList arrayList = new ArrayList();
            g gVar = g.f275010a;
            ViewGroup viewGroupJ = g.j(view);
            if (viewGroupJ != null) {
                for (View view2 : g.b(viewGroupJ)) {
                    if (view != view2) {
                        arrayList.addAll(f274659a.c(view2));
                    }
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, c.class);
            return null;
        }
    }

    @n
    @NotNull
    public static final List<String> b(@NotNull View view) {
        if (com.facebook.internal.instrument.crashshield.b.e(c.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            ArrayList<String> arrayList = new ArrayList();
            g gVar = g.f275010a;
            arrayList.add(g.i(view));
            Object tag = view.getTag();
            if (tag != null) {
                arrayList.add(tag.toString());
            }
            CharSequence contentDescription = view.getContentDescription();
            if (contentDescription != null) {
                arrayList.add(contentDescription.toString());
            }
            try {
                if (view.getId() != -1) {
                    String resourceName = view.getResources().getResourceName(view.getId());
                    Intrinsics.checkNotNullExpressionValue(resourceName, "resourceName");
                    Object[] array = new Regex("/").o(resourceName, 0).toArray(new String[0]);
                    if (array == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    String[] strArr = (String[]) array;
                    if (strArr.length == 2) {
                        arrayList.add(strArr[1]);
                    }
                }
            } catch (Resources.NotFoundException unused) {
            }
            ArrayList arrayList2 = new ArrayList();
            for (String str : arrayList) {
                if (str.length() > 0 && str.length() <= 100) {
                    String lowerCase = str.toLowerCase();
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
                    arrayList2.add(lowerCase);
                }
            }
            return arrayList2;
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
            if (view instanceof EditText) {
                return arrayList;
            }
            if (view instanceof TextView) {
                String string = ((TextView) view).getText().toString();
                if (string.length() > 0 && string.length() < 100) {
                    String lowerCase = string.toLowerCase();
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
                    arrayList.add(lowerCase);
                    return arrayList;
                }
            } else {
                g gVar = g.f275010a;
                Iterator<View> it = g.b(view).iterator();
                while (it.hasNext()) {
                    arrayList.addAll(c(it.next()));
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return null;
        }
    }

    private final boolean d(String str, List<String> list) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return false;
        }
        try {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                if (StringsKt.V2(str, it.next(), false, 2, null)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return false;
        }
    }

    @n
    public static final boolean e(@NotNull List<String> indicators, @NotNull List<String> keys) {
        if (com.facebook.internal.instrument.crashshield.b.e(c.class)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(indicators, "indicators");
            Intrinsics.checkNotNullParameter(keys, "keys");
            Iterator<String> it = indicators.iterator();
            while (it.hasNext()) {
                if (f274659a.d(it.next(), keys)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, c.class);
            return false;
        }
    }

    @n
    public static final boolean f(@NotNull String text, @NotNull String rule) {
        if (com.facebook.internal.instrument.crashshield.b.e(c.class)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(rule, "rule");
            return new Regex(rule).k(text);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, c.class);
            return false;
        }
    }
}
