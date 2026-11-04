package androidx.core.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.method.PasswordTransformationMethod;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.g0;
import androidx.annotation.g1;
import androidx.annotation.p0;
import androidx.annotation.t0;
import androidx.annotation.v0;
import androidx.annotation.w0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f49145a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f49146b = 1;

    @w0(23)
    static class a {
        private a() {
        }

        static int a(TextView textView) {
            return textView.getBreakStrategy();
        }

        static ColorStateList b(TextView textView) {
            return textView.getCompoundDrawableTintList();
        }

        static PorterDuff.Mode c(TextView textView) {
            return textView.getCompoundDrawableTintMode();
        }

        static int d(TextView textView) {
            return textView.getHyphenationFrequency();
        }

        static void e(TextView textView, int i10) {
            textView.setBreakStrategy(i10);
        }

        static void f(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        static void g(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        static void h(TextView textView, int i10) {
            textView.setHyphenationFrequency(i10);
        }
    }

    @w0(24)
    static class b {
        private b() {
        }

        static DecimalFormatSymbols a(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }
    }

    @w0(26)
    static class c {
        private c() {
        }

        static int a(TextView textView) {
            return textView.getAutoSizeMaxTextSize();
        }

        static int b(TextView textView) {
            return textView.getAutoSizeMinTextSize();
        }

        static int c(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        static int[] d(TextView textView) {
            return textView.getAutoSizeTextAvailableSizes();
        }

        static int e(TextView textView) {
            return textView.getAutoSizeTextType();
        }

        static void f(TextView textView, int i10, int i11, int i12, int i13) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        static void g(TextView textView, int[] iArr, int i10) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        static void h(TextView textView, int i10) {
            textView.setAutoSizeTextTypeWithDefaults(i10);
        }
    }

    @w0(28)
    static class d {
        private d() {
        }

        static CharSequence a(PrecomputedText precomputedText) {
            return precomputedText;
        }

        static String[] b(DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }

        static PrecomputedText.Params c(TextView textView) {
            return textView.getTextMetricsParams();
        }

        static void d(TextView textView, int i10) {
            textView.setFirstBaselineToTopHeight(i10);
        }
    }

    @w0(34)
    static class e {
        private e() {
        }

        public static void a(@NonNull TextView textView, int i10, @androidx.annotation.x(from = 0.0d) float f10) {
            textView.setLineHeight(i10, f10);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public @interface f {
    }

    @w0(26)
    private static class g implements ActionMode.Callback {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final int f49147g = 100;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ActionMode.Callback f49148a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final TextView f49149b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Class<?> f49150c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Method f49151d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f49152e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f49153f = false;

        g(ActionMode.Callback callback, TextView textView) {
            this.f49148a = callback;
            this.f49149b = textView;
        }

        private Intent a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        private Intent b(ResolveInfo resolveInfo, TextView textView) {
            Intent intentPutExtra = a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !e(textView));
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            return intentPutExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }

        private List<ResolveInfo> c(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (context instanceof Activity) {
                for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(a(), 0)) {
                    if (f(resolveInfo, context)) {
                        arrayList.add(resolveInfo);
                    }
                }
            }
            return arrayList;
        }

        private boolean e(TextView textView) {
            return (textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled();
        }

        private boolean f(ResolveInfo resolveInfo, Context context) {
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!activityInfo.exported) {
                return false;
            }
            String str = activityInfo.permission;
            return str == null || context.checkSelfPermission(str) == 0;
        }

        private void g(Menu menu) {
            Context context = this.f49149b.getContext();
            PackageManager packageManager = context.getPackageManager();
            boolean z10 = this.f49153f;
            Class cls = Integer.TYPE;
            if (!z10) {
                this.f49153f = true;
                try {
                    Class<?> cls2 = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f49150c = cls2;
                    this.f49151d = cls2.getDeclaredMethod("removeItemAt", cls);
                    this.f49152e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f49150c = null;
                    this.f49151d = null;
                    this.f49152e = false;
                }
            }
            try {
                Method declaredMethod = (this.f49152e && this.f49150c.isInstance(menu)) ? this.f49151d : menu.getClass().getDeclaredMethod("removeItemAt", cls);
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        declaredMethod.invoke(menu, Integer.valueOf(size));
                    }
                }
                List<ResolveInfo> listC = c(context, packageManager);
                for (int i10 = 0; i10 < listC.size(); i10++) {
                    ResolveInfo resolveInfo = listC.get(i10);
                    menu.add(0, 0, i10 + 100, resolveInfo.loadLabel(packageManager)).setIntent(b(resolveInfo, this.f49149b)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        @NonNull
        ActionMode.Callback d() {
            return this.f49148a;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f49148a.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f49148a.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            this.f49148a.onDestroyActionMode(actionMode);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            g(menu);
            return this.f49148a.onPrepareActionMode(actionMode, menu);
        }
    }

    private r() {
    }

    public static void A(@NonNull TextView textView, @g0(from = 0) @t0 int i10) {
        androidx.core.util.t.i(i10);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i10 != fontMetricsInt) {
            textView.setLineSpacing(i10 - fontMetricsInt, 1.0f);
        }
    }

    public static void B(@NonNull TextView textView, int i10, @androidx.annotation.x(from = 0.0d) float f10) {
        if (Build.VERSION.SDK_INT >= 34) {
            e.a(textView, i10, f10);
        } else {
            A(textView, Math.round(TypedValue.applyDimension(i10, f10, textView.getResources().getDisplayMetrics())));
        }
    }

    public static void C(@NonNull TextView textView, @NonNull androidx.core.text.g gVar) {
        textView.setText(d.a(gVar.f()));
    }

    public static void D(@NonNull TextView textView, @g1 int i10) {
        textView.setTextAppearance(i10);
    }

    public static void E(@NonNull TextView textView, @NonNull androidx.core.text.g.b bVar) {
        textView.setTextDirection(m(bVar.d()));
        textView.getPaint().set(bVar.e());
        a.e(textView, bVar.b());
        a.h(textView, bVar.c());
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @p0
    public static ActionMode.Callback F(@p0 ActionMode.Callback callback) {
        return callback instanceof g ? ((g) callback).d() : callback;
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @p0
    public static ActionMode.Callback G(@NonNull TextView textView, @p0 ActionMode.Callback callback) {
        return callback;
    }

    public static int a(@NonNull TextView textView) {
        return c.a(textView);
    }

    public static int b(@NonNull TextView textView) {
        return c.b(textView);
    }

    public static int c(@NonNull TextView textView) {
        return c.c(textView);
    }

    @NonNull
    public static int[] d(@NonNull TextView textView) {
        return c.d(textView);
    }

    public static int e(@NonNull TextView textView) {
        return c.e(textView);
    }

    @p0
    public static ColorStateList f(@NonNull TextView textView) {
        androidx.core.util.t.l(textView);
        return a.b(textView);
    }

    @p0
    public static PorterDuff.Mode g(@NonNull TextView textView) {
        androidx.core.util.t.l(textView);
        return a.c(textView);
    }

    @NonNull
    @v0(expression = "textView.getCompoundDrawablesRelative()")
    @Deprecated
    public static Drawable[] h(@NonNull TextView textView) {
        return textView.getCompoundDrawablesRelative();
    }

    public static int i(@NonNull TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    public static int j(@NonNull TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    @v0(expression = "textView.getMaxLines()")
    @Deprecated
    public static int k(@NonNull TextView textView) {
        return textView.getMaxLines();
    }

    @v0(expression = "textView.getMinLines()")
    @Deprecated
    public static int l(@NonNull TextView textView) {
        return textView.getMinLines();
    }

    private static int m(@NonNull TextDirectionHeuristic textDirectionHeuristic) {
        TextDirectionHeuristic textDirectionHeuristic2;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        if (textDirectionHeuristic != textDirectionHeuristic3 && textDirectionHeuristic != (textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
                return 2;
            }
            if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
                return 3;
            }
            if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
                return 4;
            }
            if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
                return 5;
            }
            if (textDirectionHeuristic == textDirectionHeuristic2) {
                return 6;
            }
            return textDirectionHeuristic == textDirectionHeuristic3 ? 7 : 1;
        }
        return 1;
    }

    private static TextDirectionHeuristic n(@NonNull TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        if ((textView.getInputType() & 15) == 3) {
            byte directionality = Character.getDirectionality(d.b(b.a(textView.getTextLocale()))[0].codePointAt(0));
            return (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        boolean z10 = textView.getLayoutDirection() == 1;
        switch (textView.getTextDirection()) {
            case 2:
                return TextDirectionHeuristics.ANYRTL_LTR;
            case 3:
                return TextDirectionHeuristics.LTR;
            case 4:
                return TextDirectionHeuristics.RTL;
            case 5:
                return TextDirectionHeuristics.LOCALE;
            case 6:
                return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            case 7:
                return TextDirectionHeuristics.FIRSTSTRONG_RTL;
            default:
                return z10 ? TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
    }

    @NonNull
    public static androidx.core.text.g.b o(@NonNull TextView textView) {
        return new androidx.core.text.g.b(d.c(textView));
    }

    public static void p(@NonNull TextView textView, int i10, int i11, int i12, int i13) throws IllegalArgumentException {
        c.f(textView, i10, i11, i12, i13);
    }

    public static void q(@NonNull TextView textView, @NonNull int[] iArr, int i10) throws IllegalArgumentException {
        c.g(textView, iArr, i10);
    }

    public static void r(@NonNull TextView textView, int i10) {
        c.h(textView, i10);
    }

    public static void s(@NonNull TextView textView, @p0 ColorStateList colorStateList) {
        androidx.core.util.t.l(textView);
        a.f(textView, colorStateList);
    }

    public static void t(@NonNull TextView textView, @p0 PorterDuff.Mode mode) {
        androidx.core.util.t.l(textView);
        a.g(textView, mode);
    }

    @v0(expression = "textView.setCompoundDrawablesRelative(start, top, end, bottom)")
    @Deprecated
    public static void u(@NonNull TextView textView, @p0 Drawable drawable, @p0 Drawable drawable2, @p0 Drawable drawable3, @p0 Drawable drawable4) {
        textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @v0(expression = "textView.setCompoundDrawablesRelativeWithIntrinsicBounds(start, top, end, bottom)")
    @Deprecated
    public static void v(@NonNull TextView textView, @androidx.annotation.v int i10, @androidx.annotation.v int i11, @androidx.annotation.v int i12, @androidx.annotation.v int i13) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
    }

    @v0(expression = "textView.setCompoundDrawablesRelativeWithIntrinsicBounds(start, top, end, bottom)")
    @Deprecated
    public static void w(@NonNull TextView textView, @p0 Drawable drawable, @p0 Drawable drawable2, @p0 Drawable drawable3, @p0 Drawable drawable4) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @v0(expression = "textView.setCustomSelectionActionModeCallback(callback)")
    @Deprecated
    public static void x(@NonNull TextView textView, @NonNull ActionMode.Callback callback) {
        textView.setCustomSelectionActionModeCallback(G(textView, callback));
    }

    public static void y(@NonNull TextView textView, @g0(from = 0) @t0 int i10) {
        androidx.core.util.t.i(i10);
        d.d(textView, i10);
    }

    public static void z(@NonNull TextView textView, @g0(from = 0) @t0 int i10) {
        androidx.core.util.t.i(i10);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i11 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i10 - i11);
        }
    }
}
