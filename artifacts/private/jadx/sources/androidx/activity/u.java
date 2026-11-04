package androidx.activity;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.annotation.l1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nEdgeToEdge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EdgeToEdge.kt\nandroidx/activity/EdgeToEdge\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,343:1\n1#2:344\n*E\n"})
@oj.i(name = "EdgeToEdge")
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f10063a = Color.argb(230, 255, 255, 255);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f10064b = Color.argb(128, 27, 27, 27);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private static c0 f10065c;

    @oj.j
    @oj.i(name = "enable")
    public static final void a(@NotNull l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        d(lVar, null, null, 3, null);
    }

    @oj.j
    @oj.i(name = "enable")
    public static final void b(@NotNull l lVar, @NotNull r0 statusBarStyle) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(statusBarStyle, "statusBarStyle");
        d(lVar, statusBarStyle, null, 2, null);
    }

    @oj.j
    @oj.i(name = "enable")
    public static final void c(@NotNull l lVar, @NotNull r0 statusBarStyle, @NotNull r0 navigationBarStyle) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(statusBarStyle, "statusBarStyle");
        Intrinsics.checkNotNullParameter(navigationBarStyle, "navigationBarStyle");
        View decorView = lVar.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        Function1<Resources, Boolean> function1E = statusBarStyle.e();
        Resources resources = decorView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "view.resources");
        boolean zBooleanValue = function1E.invoke(resources).booleanValue();
        Function1<Resources, Boolean> function1E2 = navigationBarStyle.e();
        Resources resources2 = decorView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "view.resources");
        boolean zBooleanValue2 = function1E2.invoke(resources2).booleanValue();
        c0 a0Var = f10065c;
        if (a0Var == null) {
            a0Var = Build.VERSION.SDK_INT >= 30 ? new a0() : new z();
        }
        c0 c0Var = a0Var;
        Window window = lVar.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "window");
        c0Var.b(statusBarStyle, navigationBarStyle, window, decorView, zBooleanValue, zBooleanValue2);
        Window window2 = lVar.getWindow();
        Intrinsics.checkNotNullExpressionValue(window2, "window");
        c0Var.a(window2);
    }

    public static /* synthetic */ void d(l lVar, r0 r0Var, r0 r0Var2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            r0Var = r0.a.c(r0.f9989e, 0, 0, null, 4, null);
        }
        if ((i10 & 2) != 0) {
            r0Var2 = r0.a.c(r0.f9989e, f10063a, f10064b, null, 4, null);
        }
        c(lVar, r0Var, r0Var2);
    }

    public static final int e() {
        return f10064b;
    }

    @l1
    public static /* synthetic */ void f() {
    }

    public static final int g() {
        return f10063a;
    }

    @l1
    public static /* synthetic */ void h() {
    }
}
