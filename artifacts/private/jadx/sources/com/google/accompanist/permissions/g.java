package com.google.accompanist.permissions;

import android.content.Context;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.o;
import androidx.compose.runtime.u1;
import androidx.compose.runtime.v1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMutablePermissionState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutablePermissionState.kt\ncom/google/accompanist/permissions/MutablePermissionStateKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,112:1\n77#2:113\n1223#3,6:114\n1223#3,6:120\n*S KotlinDebug\n*F\n+ 1 MutablePermissionState.kt\ncom/google/accompanist/permissions/MutablePermissionStateKt\n*L\n49#1:113\n50#1:114,6\n58#1:120,6\n*E\n"})
public final class g {

    static final class a extends l0 implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f103103a = new a();

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

    @SourceDebugExtension({"SMAP\nMutablePermissionState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutablePermissionState.kt\ncom/google/accompanist/permissions/MutablePermissionStateKt$rememberMutablePermissionState$2\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,112:1\n64#2,5:113\n*S KotlinDebug\n*F\n+ 1 MutablePermissionState.kt\ncom/google/accompanist/permissions/MutablePermissionStateKt$rememberMutablePermissionState$2\n*L\n64#1:113,5\n*E\n"})
    static final class b extends l0 implements Function1<v1, u1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f103104a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.activity.compose.k<String, Boolean> f103105b;

        @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 MutablePermissionState.kt\ncom/google/accompanist/permissions/MutablePermissionStateKt$rememberMutablePermissionState$2\n*L\n1#1,497:1\n65#2,2:498\n*E\n"})
        public static final class a implements u1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ f f103106a;

            public a(f fVar) {
                this.f103106a = fVar;
            }

            @Override // androidx.compose.runtime.u1
            public void dispose() {
                this.f103106a.d(null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(f fVar, androidx.activity.compose.k<String, Boolean> kVar) {
            super(1);
            this.f103104a = fVar;
            this.f103105b = kVar;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final u1 invoke(@NotNull v1 DisposableEffect) {
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            this.f103104a.d(this.f103105b);
            return new a(this.f103104a);
        }
    }

    static final class c extends l0 implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f103107a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<Boolean, Unit> f103108b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(f fVar, Function1<? super Boolean, Unit> function1) {
            super(1);
            this.f103107a = fVar;
            this.f103108b = function1;
        }

        public final void c(boolean z10) {
            this.f103107a.c();
            this.f103108b.invoke(Boolean.valueOf(z10));
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
    public static final f a(@NotNull String permission, @Nullable Function1<? super Boolean, Unit> function1, @Nullable c0 c0Var, int i10, int i11) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        c0Var.h0(1424240517);
        if ((i11 & 2) != 0) {
            function1 = a.f103103a;
        }
        if (m0.l0()) {
            m0.A0(1424240517, i10, -1, "com.google.accompanist.permissions.rememberMutablePermissionState (MutablePermissionState.kt:47)");
        }
        Context context = (Context) c0Var.W(AndroidCompositionLocals_androidKt.g());
        c0Var.h0(-1903070007);
        boolean z10 = true;
        boolean z11 = (((i10 & 14) ^ 6) > 4 && c0Var.D(permission)) || (i10 & 6) == 4;
        Object objI0 = c0Var.i0();
        if (z11 || objI0 == c0.f35327a.a()) {
            objI0 = new f(permission, context, m.h(context));
            c0Var.Y(objI0);
        }
        f fVar = (f) objI0;
        c0Var.w0();
        m.c(fVar, null, c0Var, 0, 2);
        g.b.l lVar = new g.b.l();
        c0Var.h0(-1903069605);
        boolean zD = c0Var.D(fVar);
        if ((((i10 & com.planner5d.library.engine.input.f.b.B) ^ 48) <= 32 || !c0Var.k0(function1)) && (i10 & 48) != 32) {
            z10 = false;
        }
        boolean z12 = zD | z10;
        Object objI1 = c0Var.i0();
        if (z12 || objI1 == c0.f35327a.a()) {
            objI1 = new c(fVar, function1);
            c0Var.Y(objI1);
        }
        c0Var.w0();
        androidx.activity.compose.k kVarA = androidx.activity.compose.d.a(lVar, (Function1) objI1, c0Var, 8);
        b2.c(fVar, kVarA, new b(fVar, kVarA), c0Var, androidx.activity.compose.k.f9830c << 3);
        if (m0.l0()) {
            m0.z0();
        }
        c0Var.w0();
        return fVar;
    }
}
