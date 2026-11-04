package com.planner5d.library.services.utility;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.io.Serializable;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e1 f225196a = new e1();

    private e1() {
    }

    private final String b(Fragment fragment) {
        return c(kotlin.jvm.internal.j1.d(fragment.getClass()));
    }

    private final String c(kotlin.reflect.d<? extends Fragment> dVar) {
        String name = oj.b.e(dVar).getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return name;
    }

    public static /* synthetic */ void f(e1 e1Var, Fragment fragment, Serializable serializable, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = e1Var.b(fragment);
        }
        e1Var.e(fragment, serializable, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(Function1 function1, String str, String str2, Bundle bundle) {
        Intrinsics.checkNotNullParameter(str2, "<unused var>");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        function1.invoke(bundle.getSerializable(str));
        return Unit.f312394a;
    }

    public final boolean d(@NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        return (fragment.isRemoving() || fragment.getActivity() == null || fragment.isDetached() || !fragment.isAdded() || fragment.getView() == null) ? false : true;
    }

    public final void e(@NotNull Fragment fragment, @Nullable Serializable serializable, @NotNull String key) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        androidx.fragment.app.z.d(fragment, key, androidx.core.os.e.b(TuplesKt.to(key, serializable)));
    }

    public final /* synthetic */ <T extends Fragment> void g(Fragment fragment, Function1<? super Serializable, Unit> listener) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        h(fragment, kotlin.jvm.internal.j1.d(Fragment.class), listener);
    }

    public final <T extends Fragment> void h(@NotNull Fragment fragment, @NotNull kotlin.reflect.d<T> from, @NotNull final Function1<? super Serializable, Unit> listener) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(listener, "listener");
        final String strC = c(from);
        androidx.fragment.app.z.e(fragment, strC, new Function2() { // from class: com.planner5d.library.services.utility.d1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return e1.i(listener, strC, (String) obj, (Bundle) obj2);
            }
        });
    }
}
