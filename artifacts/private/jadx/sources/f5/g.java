package f5;

import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import androidx.annotation.b1;
import androidx.compose.ui.platform.s;
import com.facebook.appevents.internal.p;
import com.facebook.internal.e1;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final String f275012c = "com.facebook.react.ReactRootView";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final String f275013d = "com.facebook.react.views.view.ReactViewGroup";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final String f275014e = "com.facebook.react.uimanager.TouchTargetHelper";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final String f275015f = "findTouchTargetView";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f275016g = 44;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private static Method f275018i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final g f275010a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f275011b = g.class.getCanonicalName();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static WeakReference<View> f275017h = new WeakReference<>(null);

    private g() {
    }

    @n
    @Nullable
    public static final View a(@Nullable View view) {
        if (com.facebook.internal.instrument.crashshield.b.e(g.class)) {
            return null;
        }
        while (view != null) {
            try {
                if (!f275010a.q(view)) {
                    Object parent = view.getParent();
                    if (!(parent instanceof View)) {
                        break;
                    }
                    view = (View) parent;
                } else {
                    return view;
                }
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, g.class);
            }
        }
        return null;
    }

    @n
    @NotNull
    public static final List<View> b(@Nullable View view) {
        int childCount;
        if (com.facebook.internal.instrument.crashshield.b.e(g.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if ((view instanceof ViewGroup) && (childCount = ((ViewGroup) view).getChildCount()) > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    arrayList.add(((ViewGroup) view).getChildAt(i10));
                    if (i11 >= childCount) {
                        break;
                    }
                    i10 = i11;
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, g.class);
            return null;
        }
    }

    @n
    public static final int c(@NotNull View view) {
        if (com.facebook.internal.instrument.crashshield.b.e(g.class)) {
            return 0;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            int i10 = view instanceof ImageView ? 2 : 0;
            if (view.isClickable()) {
                i10 |= 32;
            }
            if (o(view)) {
                i10 |= 512;
            }
            if (view instanceof TextView) {
                int i11 = i10 | 1025;
                if (view instanceof Button) {
                    i11 = i10 | 1029;
                    if (view instanceof Switch) {
                        i11 = i10 | 9221;
                    } else if (view instanceof CheckBox) {
                        i11 = 33797 | i10;
                    }
                }
                return view instanceof EditText ? i11 | 2048 : i11;
            }
            if (!(view instanceof Spinner) && !(view instanceof DatePicker)) {
                if (view instanceof RatingBar) {
                    return 65536 | i10;
                }
                if (view instanceof RadioGroup) {
                    return i10 | 16384;
                }
                return ((view instanceof ViewGroup) && f275010a.p(view, f275017h.get())) ? i10 | 64 : i10;
            }
            return i10 | 4096;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, g.class);
            return 0;
        }
    }

    @n
    @NotNull
    public static final JSONObject d(@NotNull View view) {
        if (com.facebook.internal.instrument.crashshield.b.e(g.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            if (Intrinsics.areEqual(view.getClass().getName(), f275012c)) {
                f275017h = new WeakReference<>(view);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                t(view, jSONObject);
                JSONArray jSONArray = new JSONArray();
                List<View> listB = b(view);
                int size = listB.size() - 1;
                if (size >= 0) {
                    int i10 = 0;
                    while (true) {
                        int i11 = i10 + 1;
                        jSONArray.put(d(listB.get(i10)));
                        if (i11 > size) {
                            break;
                        }
                        i10 = i11;
                    }
                }
                jSONObject.put(p.f99099j, jSONArray);
            } catch (JSONException unused) {
            }
            return jSONObject;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, g.class);
            return null;
        }
    }

    private final JSONObject e(View view) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("top", view.getTop());
                jSONObject.put("left", view.getLeft());
                jSONObject.put("width", view.getWidth());
                jSONObject.put("height", view.getHeight());
                jSONObject.put(p.f99105p, view.getScrollX());
                jSONObject.put(p.f99106q, view.getScrollY());
                jSONObject.put("visibility", view.getVisibility());
                return jSONObject;
            } catch (JSONException unused) {
                return jSONObject;
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return null;
        }
    }

    private final Class<?> f(String str) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return null;
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return null;
        }
    }

    @n
    @Nullable
    public static final View.OnClickListener g(@Nullable View view) {
        Field declaredField;
        if (com.facebook.internal.instrument.crashshield.b.e(g.class)) {
            return null;
        }
        try {
            Field declaredField2 = Class.forName(s.S).getDeclaredField("mListenerInfo");
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
            }
            Object obj = declaredField2.get(view);
            if (obj != null && (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener")) != null) {
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(obj);
                if (obj2 != null) {
                    return (View.OnClickListener) obj2;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.View.OnClickListener");
            }
            return null;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return null;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, g.class);
            return null;
        }
    }

    @n
    @Nullable
    public static final View.OnTouchListener h(@Nullable View view) {
        Field declaredField;
        try {
            if (com.facebook.internal.instrument.crashshield.b.e(g.class)) {
                return null;
            }
            try {
                try {
                    Field declaredField2 = Class.forName(s.S).getDeclaredField("mListenerInfo");
                    if (declaredField2 != null) {
                        declaredField2.setAccessible(true);
                    }
                    Object obj = declaredField2.get(view);
                    if (obj != null && (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener")) != null) {
                        declaredField.setAccessible(true);
                        Object obj2 = declaredField.get(obj);
                        if (obj2 != null) {
                            return (View.OnTouchListener) obj2;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type android.view.View.OnTouchListener");
                    }
                    return null;
                } catch (ClassNotFoundException e10) {
                    e1 e1Var = e1.f99794a;
                    e1.f0(f275011b, e10);
                    return null;
                }
            } catch (IllegalAccessException e11) {
                e1 e1Var2 = e1.f99794a;
                e1.f0(f275011b, e11);
                return null;
            } catch (NoSuchFieldException e12) {
                e1 e1Var3 = e1.f99794a;
                e1.f0(f275011b, e12);
                return null;
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, g.class);
            return null;
        }
    }

    @n
    @NotNull
    public static final String i(@Nullable View view) {
        CharSequence hint;
        String string;
        if (com.facebook.internal.instrument.crashshield.b.e(g.class)) {
            return null;
        }
        try {
            if (view instanceof EditText) {
                hint = ((EditText) view).getHint();
            } else {
                hint = view instanceof TextView ? ((TextView) view).getHint() : null;
            }
            if (hint != null && (string = hint.toString()) != null) {
                return string;
            }
            return "";
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, g.class);
            return null;
        }
    }

    @n
    @Nullable
    public static final ViewGroup j(@Nullable View view) {
        if (com.facebook.internal.instrument.crashshield.b.e(g.class) || view == null) {
            return null;
        }
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                return (ViewGroup) parent;
            }
            return null;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, g.class);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0127 A[EDGE_INSN: B:48:0x0127->B:49:0x0129 BREAK  A[LOOP:0: B:35:0x00f4->B:43:0x0115]] */
    @n
    @NotNull
    public static final String k(@Nullable View view) {
        CharSequence charSequenceValueOf;
        Object selectedItem;
        String string;
        if (com.facebook.internal.instrument.crashshield.b.e(g.class)) {
            return null;
        }
        try {
            if (!(view instanceof TextView)) {
                if (!(view instanceof Spinner)) {
                    if (!(view instanceof DatePicker)) {
                        if (!(view instanceof TimePicker)) {
                            if (!(view instanceof RadioGroup)) {
                                if (!(view instanceof RatingBar)) {
                                    charSequenceValueOf = null;
                                    break;
                                }
                                charSequenceValueOf = String.valueOf(((RatingBar) view).getRating());
                            } else {
                                int checkedRadioButtonId = ((RadioGroup) view).getCheckedRadioButtonId();
                                int childCount = ((RadioGroup) view).getChildCount();
                                if (childCount <= 0) {
                                    charSequenceValueOf = null;
                                    break;
                                }
                                int i10 = 0;
                                while (true) {
                                    int i11 = i10 + 1;
                                    View childAt = ((RadioGroup) view).getChildAt(i10);
                                    if (childAt.getId() == checkedRadioButtonId && (childAt instanceof RadioButton)) {
                                        charSequenceValueOf = ((RadioButton) childAt).getText();
                                        break;
                                    }
                                    if (i11 >= childCount) {
                                        charSequenceValueOf = null;
                                        break;
                                    }
                                    i10 = i11;
                                }
                            }
                        } else {
                            Integer currentHour = ((TimePicker) view).getCurrentHour();
                            Intrinsics.checkNotNullExpressionValue(currentHour, "view.currentHour");
                            int iIntValue = currentHour.intValue();
                            Integer currentMinute = ((TimePicker) view).getCurrentMinute();
                            Intrinsics.checkNotNullExpressionValue(currentMinute, "view.currentMinute");
                            int iIntValue2 = currentMinute.intValue();
                            q1 q1Var = q1.f312784a;
                            charSequenceValueOf = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2)}, 2));
                            Intrinsics.checkNotNullExpressionValue(charSequenceValueOf, "java.lang.String.format(format, *args)");
                        }
                    } else {
                        int year = ((DatePicker) view).getYear();
                        int month = ((DatePicker) view).getMonth();
                        int dayOfMonth = ((DatePicker) view).getDayOfMonth();
                        q1 q1Var2 = q1.f312784a;
                        charSequenceValueOf = String.format("%04d-%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(year), Integer.valueOf(month), Integer.valueOf(dayOfMonth)}, 3));
                        Intrinsics.checkNotNullExpressionValue(charSequenceValueOf, "java.lang.String.format(format, *args)");
                    }
                } else {
                    if (((Spinner) view).getCount() <= 0 || (selectedItem = ((Spinner) view).getSelectedItem()) == null) {
                        charSequenceValueOf = null;
                        break;
                    }
                    charSequenceValueOf = selectedItem.toString();
                }
            } else {
                charSequenceValueOf = ((TextView) view).getText();
                if (view instanceof Switch) {
                    charSequenceValueOf = ((Switch) view).isChecked() ? "1" : com.facebook.appevents.p.f99189d0;
                }
            }
            return (charSequenceValueOf == null || (string = charSequenceValueOf.toString()) == null) ? "" : string;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, g.class);
            return null;
        }
    }

    private final View l(float[] fArr, View view) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return null;
        }
        try {
            n();
            Method method = f275018i;
            if (method != null && view != null) {
                try {
                    if (method == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    Object objInvoke = method.invoke(null, fArr, view);
                    if (objInvoke == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                    }
                    View view2 = (View) objInvoke;
                    if (view2.getId() > 0) {
                        Object parent = view2.getParent();
                        if (parent != null) {
                            return (View) parent;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                    }
                } catch (IllegalAccessException e10) {
                    e1 e1Var = e1.f99794a;
                    e1.f0(f275011b, e10);
                } catch (InvocationTargetException e11) {
                    e1 e1Var2 = e1.f99794a;
                    e1.f0(f275011b, e11);
                }
            }
            return null;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return null;
        }
    }

    private final float[] m(View view) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return null;
        }
        try {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            return new float[]{iArr[0], iArr[1]};
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return null;
        }
    }

    private final void n() {
        if (!com.facebook.internal.instrument.crashshield.b.e(this)) {
            try {
                if (f275018i == null) {
                    try {
                        Method declaredMethod = Class.forName(f275014e).getDeclaredMethod(f275015f, float[].class, ViewGroup.class);
                        f275018i = declaredMethod;
                        if (declaredMethod == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        declaredMethod.setAccessible(true);
                    } catch (ClassNotFoundException e10) {
                        e1 e1Var = e1.f99794a;
                        e1.f0(f275011b, e10);
                    } catch (NoSuchMethodException e11) {
                        e1 e1Var2 = e1.f99794a;
                        e1.f0(f275011b, e11);
                    }
                }
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, this);
            }
        }
    }

    @n
    private static final boolean o(View view) {
        if (com.facebook.internal.instrument.crashshield.b.e(g.class)) {
            return false;
        }
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof AdapterView) {
                return true;
            }
            g gVar = f275010a;
            Class<?> clsF = gVar.f("android.support.v4.view.NestedScrollingChild");
            if (clsF != null && clsF.isInstance(parent)) {
                return true;
            }
            Class<?> clsF2 = gVar.f("androidx.core.view.NestedScrollingChild");
            return clsF2 != null && clsF2.isInstance(parent);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, g.class);
            return false;
        }
    }

    private final boolean q(View view) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return false;
        }
        try {
            return Intrinsics.areEqual(view.getClass().getName(), f275012c);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return false;
        }
    }

    @n
    public static final void r(@NotNull View view, @Nullable View.OnClickListener onClickListener) {
        Field declaredField;
        Field declaredField2;
        if (com.facebook.internal.instrument.crashshield.b.e(g.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            Object obj = null;
            try {
                try {
                    declaredField = Class.forName(s.S).getDeclaredField("mListenerInfo");
                    try {
                        declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
                    } catch (ClassNotFoundException | NoSuchFieldException unused) {
                        declaredField2 = null;
                    }
                } catch (ClassNotFoundException | NoSuchFieldException unused2) {
                    declaredField = null;
                }
                if (declaredField != null && declaredField2 != null) {
                    declaredField.setAccessible(true);
                    declaredField2.setAccessible(true);
                    try {
                        declaredField.setAccessible(true);
                        obj = declaredField.get(view);
                    } catch (IllegalAccessException unused3) {
                    }
                    if (obj == null) {
                        view.setOnClickListener(onClickListener);
                        return;
                    } else {
                        declaredField2.set(obj, onClickListener);
                        return;
                    }
                }
                view.setOnClickListener(onClickListener);
            } catch (Exception unused4) {
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, g.class);
        }
    }

    @n
    public static final void s(@NotNull View view, @NotNull JSONObject json, float f10) {
        Bitmap bitmap;
        Typeface typeface;
        if (!com.facebook.internal.instrument.crashshield.b.e(g.class)) {
            try {
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(json, "json");
                try {
                    JSONObject jSONObject = new JSONObject();
                    if ((view instanceof TextView) && (typeface = ((TextView) view).getTypeface()) != null) {
                        jSONObject.put(p.f99108s, ((TextView) view).getTextSize());
                        jSONObject.put(p.f99109t, typeface.isBold());
                        jSONObject.put(p.f99110u, typeface.isItalic());
                        json.put(p.f99111v, jSONObject);
                    }
                    if (view instanceof ImageView) {
                        Drawable drawable = ((ImageView) view).getDrawable();
                        if (drawable instanceof BitmapDrawable) {
                            float f11 = 44;
                            if (view.getHeight() / f10 <= f11 && view.getWidth() / f10 <= f11 && (bitmap = ((BitmapDrawable) drawable).getBitmap()) != null) {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                                int i10 = 3 & 0;
                                json.put(p.f99112w, Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0));
                            }
                        }
                    }
                } catch (JSONException e10) {
                    e1 e1Var = e1.f99794a;
                    e1.f0(f275011b, e10);
                }
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, g.class);
            }
        }
    }

    @n
    public static final void t(@NotNull View view, @NotNull JSONObject json) {
        if (com.facebook.internal.instrument.crashshield.b.e(g.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(json, "json");
            try {
                String strK = k(view);
                String strI = i(view);
                Object tag = view.getTag();
                CharSequence contentDescription = view.getContentDescription();
                json.put(p.f99089c, view.getClass().getCanonicalName());
                json.put(p.f99091d, c(view));
                json.put("id", view.getId());
                e eVar = e.f275001a;
                if (e.g(view)) {
                    json.put("text", "");
                    json.put(p.f99097h, true);
                } else {
                    e1 e1Var = e1.f99794a;
                    json.put("text", e1.k(e1.G0(strK), ""));
                }
                e1 e1Var2 = e1.f99794a;
                json.put(p.f99100k, e1.k(e1.G0(strI), ""));
                if (tag != null) {
                    json.put("tag", e1.k(e1.G0(tag.toString()), ""));
                }
                if (contentDescription != null) {
                    json.put("description", e1.k(e1.G0(contentDescription.toString()), ""));
                }
                json.put("dimension", f275010a.e(view));
            } catch (JSONException e10) {
                e1 e1Var3 = e1.f99794a;
                e1.f0(f275011b, e10);
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, g.class);
        }
    }

    public final boolean p(@NotNull View view, @Nullable View view2) {
        View viewL;
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            return Intrinsics.areEqual(view.getClass().getName(), f275013d) && (viewL = l(m(view), view2)) != null && viewL.getId() == view.getId();
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return false;
        }
    }
}
