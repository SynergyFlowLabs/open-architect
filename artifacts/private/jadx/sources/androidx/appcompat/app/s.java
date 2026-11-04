package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.AppCompatToggleButton;
import androidx.appcompat.widget.g1;
import androidx.collection.h3;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class s {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f10378h = "AppCompatViewInflater";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object[] f10380a = new Object[2];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class<?>[] f10372b = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f10373c = {R.attr.onClick};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f10374d = {R.attr.accessibilityHeading};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f10375e = {R.attr.accessibilityPaneTitle};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f10376f = {R.attr.screenReaderFocusable};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String[] f10377g = {"android.widget.", "android.view.", "android.webkit."};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final h3<String, Constructor<? extends View>> f10379i = new h3<>();

    private static class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f10381a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f10382b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Method f10383c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Context f10384d;

        public a(@NonNull View view, @NonNull String str) {
            this.f10381a = view;
            this.f10382b = str;
        }

        private void a(@p0 Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f10382b, View.class)) != null) {
                        this.f10383c = method;
                        this.f10384d = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id2 = this.f10381a.getId();
            if (id2 == -1) {
                str = "";
            } else {
                str = " with id '" + this.f10381a.getContext().getResources().getResourceEntryName(id2) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f10382b + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f10381a.getClass() + str);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(@NonNull View view) {
            if (this.f10383c == null) {
                a(this.f10381a.getContext());
            }
            try {
                this.f10383c.invoke(this.f10384d, view);
            } catch (IllegalAccessException e10) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e10);
            } catch (InvocationTargetException e11) {
                throw new IllegalStateException("Could not execute method for android:onClick", e11);
            }
        }
    }

    private void a(@NonNull Context context, @NonNull View view, @NonNull AttributeSet attributeSet) {
    }

    private void b(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && view.hasOnClickListeners()) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f10373c);
            String string = typedArrayObtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new a(view, string));
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private View s(Context context, String str, String str2) throws InflateException, ClassNotFoundException {
        String str3;
        h3<String, Constructor<? extends View>> h3Var = f10379i;
        Constructor<? extends View> constructor = h3Var.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f10372b);
            h3Var.put(str, constructor);
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.f10380a);
    }

    private View t(Context context, String str, AttributeSet attributeSet) {
        if (str.equals(com.facebook.appevents.internal.p.A)) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.f10380a;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                View viewS = s(context, str, null);
                Object[] objArr2 = this.f10380a;
                objArr2[0] = null;
                objArr2[1] = null;
                return viewS;
            }
            int i10 = 0;
            while (true) {
                String[] strArr = f10377g;
                if (i10 >= strArr.length) {
                    Object[] objArr3 = this.f10380a;
                    objArr3[0] = null;
                    objArr3[1] = null;
                    return null;
                }
                View viewS2 = s(context, str, strArr[i10]);
                if (viewS2 != null) {
                    Object[] objArr4 = this.f10380a;
                    objArr4[0] = null;
                    objArr4[1] = null;
                    return viewS2;
                }
                i10++;
            }
        } catch (Exception unused) {
            Object[] objArr5 = this.f10380a;
            objArr5[0] = null;
            objArr5[1] = null;
            return null;
        } catch (Throwable th2) {
            Object[] objArr6 = this.f10380a;
            objArr6[0] = null;
            objArr6[1] = null;
            throw th2;
        }
    }

    private static Context u(Context context, AttributeSet attributeSet, boolean z10, boolean z11) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.a.m.W6, 0, 0);
        int resourceId = z10 ? typedArrayObtainStyledAttributes.getResourceId(i.a.m.X6, 0) : 0;
        if (z11 && resourceId == 0) {
            resourceId = typedArrayObtainStyledAttributes.getResourceId(i.a.m.f286512d7, 0);
        }
        typedArrayObtainStyledAttributes.recycle();
        return (resourceId == 0 || ((context instanceof androidx.appcompat.view.d) && ((androidx.appcompat.view.d) context).c() == resourceId)) ? context : new androidx.appcompat.view.d(context, resourceId);
    }

    private void v(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    @NonNull
    protected androidx.appcompat.widget.e c(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.e(context, attributeSet);
    }

    @NonNull
    protected androidx.appcompat.widget.h d(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.h(context, attributeSet);
    }

    @NonNull
    protected AppCompatCheckBox e(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    @NonNull
    protected androidx.appcompat.widget.k f(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.k(context, attributeSet);
    }

    @NonNull
    protected AppCompatEditText g(Context context, AttributeSet attributeSet) {
        return new AppCompatEditText(context, attributeSet);
    }

    @NonNull
    protected androidx.appcompat.widget.t h(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.t(context, attributeSet);
    }

    @NonNull
    protected AppCompatImageView i(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    @NonNull
    protected androidx.appcompat.widget.x j(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.x(context, attributeSet);
    }

    @NonNull
    protected AppCompatRadioButton k(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    @NonNull
    protected androidx.appcompat.widget.b0 l(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.b0(context, attributeSet);
    }

    @NonNull
    protected AppCompatSeekBar m(Context context, AttributeSet attributeSet) {
        return new AppCompatSeekBar(context, attributeSet);
    }

    @NonNull
    protected AppCompatSpinner n(Context context, AttributeSet attributeSet) {
        return new AppCompatSpinner(context, attributeSet);
    }

    @NonNull
    protected AppCompatTextView o(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    @NonNull
    protected AppCompatToggleButton p(Context context, AttributeSet attributeSet) {
        return new AppCompatToggleButton(context, attributeSet);
    }

    @p0
    protected View q(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @p0
    public final View r(@p0 View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet, boolean z10, boolean z11, boolean z12, boolean z13) {
        View viewL;
        Context context2 = (!z10 || view == null) ? context : view.getContext();
        if (z11 || z12) {
            context2 = u(context2, attributeSet, z11, z12);
        }
        if (z13) {
            context2 = g1.b(context2);
        }
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    b10 = 0;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    b10 = 1;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    b10 = 2;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    b10 = 3;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    b10 = 4;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    b10 = 5;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    b10 = 6;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    b10 = 7;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    b10 = 8;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    b10 = 9;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    b10 = 10;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    b10 = 11;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    b10 = com.google.common.base.c.f116461n;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    b10 = com.google.common.base.c.f116462o;
                }
                break;
        }
        switch (b10) {
            case 0:
                viewL = l(context2, attributeSet);
                v(viewL, str);
                break;
            case 1:
                viewL = f(context2, attributeSet);
                v(viewL, str);
                break;
            case 2:
                viewL = j(context2, attributeSet);
                v(viewL, str);
                break;
            case 3:
                viewL = o(context2, attributeSet);
                v(viewL, str);
                break;
            case 4:
                viewL = h(context2, attributeSet);
                v(viewL, str);
                break;
            case 5:
                viewL = m(context2, attributeSet);
                v(viewL, str);
                break;
            case 6:
                viewL = n(context2, attributeSet);
                v(viewL, str);
                break;
            case 7:
                viewL = k(context2, attributeSet);
                v(viewL, str);
                break;
            case 8:
                viewL = p(context2, attributeSet);
                v(viewL, str);
                break;
            case 9:
                viewL = i(context2, attributeSet);
                v(viewL, str);
                break;
            case 10:
                viewL = c(context2, attributeSet);
                v(viewL, str);
                break;
            case 11:
                viewL = e(context2, attributeSet);
                v(viewL, str);
                break;
            case 12:
                viewL = g(context2, attributeSet);
                v(viewL, str);
                break;
            case 13:
                viewL = d(context2, attributeSet);
                v(viewL, str);
                break;
            default:
                viewL = q(context2, str, attributeSet);
                break;
        }
        if (viewL == null && context != context2) {
            viewL = t(context2, str, attributeSet);
        }
        if (viewL != null) {
            b(viewL, attributeSet);
            a(context2, viewL, attributeSet);
        }
        return viewL;
    }
}
