package com.google.accompanist.permissions;

import androidx.compose.runtime.c0;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class i {

    static final class a extends l0 implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f103109a = new a();

        a() {
            super(1);
        }

        public final void c(boolean z10) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            c(bool.booleanValue());
            return Unit.f312394a;
        }
    }

    @o
    @com.google.accompanist.permissions.a
    @NotNull
    public static final h a(@NotNull String permission, @Nullable Function1<? super Boolean, Unit> function1, @Nullable c0 c0Var, int i10, int i11) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        c0Var.h0(923020361);
        if ((i11 & 2) != 0) {
            function1 = a.f103109a;
        }
        if (m0.l0()) {
            m0.A0(923020361, i10, -1, "com.google.accompanist.permissions.rememberPermissionState (PermissionState.kt:36)");
        }
        f fVarA = g.a(permission, function1, c0Var, i10 & okhttp3.internal.ws.g.f334652s, 0);
        if (m0.l0()) {
            m0.z0();
        }
        c0Var.w0();
        return fVarA;
    }
}
