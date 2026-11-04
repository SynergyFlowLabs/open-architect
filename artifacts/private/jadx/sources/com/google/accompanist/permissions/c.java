package com.google.accompanist.permissions;

import androidx.compose.runtime.c0;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.o;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    static final class a extends l0 implements Function1<Map<String, ? extends Boolean>, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f103076a = new a();

        a() {
            super(1);
        }

        public final void c(@NotNull Map<String, Boolean> it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends Boolean> map) {
            c(map);
            return Unit.f312394a;
        }
    }

    @o
    @com.google.accompanist.permissions.a
    @NotNull
    public static final b a(@NotNull List<String> permissions, @Nullable Function1<? super Map<String, Boolean>, Unit> function1, @Nullable c0 c0Var, int i10, int i11) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        c0Var.h0(-57132327);
        if ((i11 & 2) != 0) {
            function1 = a.f103076a;
        }
        if (m0.l0()) {
            m0.A0(-57132327, i10, -1, "com.google.accompanist.permissions.rememberMultiplePermissionsState (MultiplePermissionsState.kt:36)");
        }
        b bVarA = e.a(permissions, function1, c0Var, (i10 & com.planner5d.library.engine.input.f.b.B) | 8, 0);
        if (m0.l0()) {
            m0.z0();
        }
        c0Var.w0();
        return bVarA;
    }
}
