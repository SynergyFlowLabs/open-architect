package androidx.compose.ui.text.android;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
final class z0 implements a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f41454a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f41455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private static Constructor<StaticLayout> f41456c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Constructor<StaticLayout> b() {
            if (z0.f41455b) {
                return z0.f41456c;
            }
            z0.f41455b = true;
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                z0.f41456c = StaticLayout.class.getConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
            } catch (NoSuchMethodException unused) {
                z0.f41456c = null;
            }
            return z0.f41456c;
        }

        private a() {
        }
    }

    @Override // androidx.compose.ui.text.android.a1
    @NotNull
    public StaticLayout a(@NotNull c1 c1Var) {
        Constructor constructorB = f41454a.b();
        StaticLayout staticLayout = null;
        if (constructorB != null) {
            try {
                staticLayout = (StaticLayout) constructorB.newInstance(c1Var.r(), Integer.valueOf(c1Var.q()), Integer.valueOf(c1Var.e()), c1Var.o(), Integer.valueOf(c1Var.u()), c1Var.a(), c1Var.s(), Float.valueOf(c1Var.m()), Float.valueOf(c1Var.l()), Boolean.valueOf(c1Var.g()), c1Var.c(), Integer.valueOf(c1Var.d()), Integer.valueOf(c1Var.n()));
            } catch (IllegalAccessException unused) {
                f41456c = null;
            } catch (InstantiationException unused2) {
                f41456c = null;
            } catch (InvocationTargetException unused3) {
                f41456c = null;
            }
        }
        return staticLayout != null ? staticLayout : new StaticLayout(c1Var.r(), c1Var.q(), c1Var.e(), c1Var.o(), c1Var.u(), c1Var.a(), c1Var.m(), c1Var.l(), c1Var.g(), c1Var.c(), c1Var.d());
    }

    @Override // androidx.compose.ui.text.android.a1
    public boolean b(@NotNull StaticLayout staticLayout, boolean z10) {
        return false;
    }
}
