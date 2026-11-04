package androidx.navigation;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nNavGraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavGraph.kt\nandroidx/navigation/NavGraphKt__NavGraphKt\n+ 2 NavGraph.android.kt\nandroidx/navigation/NavGraph\n*L\n1#1,342:1\n136#2:343\n136#2:344\n*S KotlinDebug\n*F\n+ 1 NavGraph.kt\nandroidx/navigation/NavGraphKt__NavGraphKt\n*L\n289#1:343\n307#1:344\n*E\n"})
final /* synthetic */ class l2 {
    public static final <T> boolean a(@NotNull e2 e2Var, @NotNull T route) {
        Intrinsics.checkNotNullParameter(e2Var, "<this>");
        Intrinsics.checkNotNullParameter(route, "route");
        return e2Var.G0(route) != null;
    }

    public static final boolean b(@NotNull e2 e2Var, @NotNull String route) {
        Intrinsics.checkNotNullParameter(e2Var, "<this>");
        Intrinsics.checkNotNullParameter(route, "route");
        return e2Var.I0(route) != null;
    }

    public static final /* synthetic */ <T> boolean c(e2 e2Var, kotlin.reflect.d<T> route) {
        Intrinsics.checkNotNullParameter(e2Var, "<this>");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        return e2Var.K0(kotlin.jvm.internal.j1.d(Object.class)) != null;
    }

    @NotNull
    public static final <T> y1 d(@NotNull e2 e2Var, @NotNull T route) {
        Intrinsics.checkNotNullParameter(e2Var, "<this>");
        Intrinsics.checkNotNullParameter(route, "route");
        y1 y1VarG0 = e2Var.G0(route);
        if (y1VarG0 != null) {
            return y1VarG0;
        }
        throw new IllegalArgumentException("No destination for " + route + " was found in " + e2Var);
    }

    @NotNull
    public static final y1 e(@NotNull e2 e2Var, @NotNull String route) {
        Intrinsics.checkNotNullParameter(e2Var, "<this>");
        Intrinsics.checkNotNullParameter(route, "route");
        y1 y1VarI0 = e2Var.I0(route);
        if (y1VarI0 != null) {
            return y1VarI0;
        }
        throw new IllegalArgumentException("No destination for " + route + " was found in " + e2Var);
    }

    public static final /* synthetic */ <T> y1 f(e2 e2Var, kotlin.reflect.d<T> route) {
        Intrinsics.checkNotNullParameter(e2Var, "<this>");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        y1 y1VarK0 = e2Var.K0(kotlin.jvm.internal.j1.d(Object.class));
        if (y1VarK0 != null) {
            return y1VarK0;
        }
        throw new IllegalArgumentException("No destination for " + route + " was found in " + e2Var);
    }

    public static final void g(@NotNull e2 e2Var, @NotNull y1 node) {
        Intrinsics.checkNotNullParameter(e2Var, "<this>");
        Intrinsics.checkNotNullParameter(node, "node");
        e2Var.i1(node);
    }

    public static final void h(@NotNull e2 e2Var, @NotNull y1 node) {
        Intrinsics.checkNotNullParameter(e2Var, "<this>");
        Intrinsics.checkNotNullParameter(node, "node");
        e2Var.z0(node);
    }

    public static final void i(@NotNull e2 e2Var, @NotNull e2 other) {
        Intrinsics.checkNotNullParameter(e2Var, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        e2Var.v0(other);
    }
}
