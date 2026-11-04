package com.google.accompanist.permissions;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.o;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.u1;
import androidx.compose.runtime.v1;
import androidx.lifecycle.c0;
import androidx.lifecycle.compose.d0;
import androidx.lifecycle.j0;
import androidx.lifecycle.o0;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nPermissionsUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PermissionsUtil.kt\ncom/google/accompanist/permissions/PermissionsUtilKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,148:1\n1223#2,6:149\n1223#2,6:156\n77#3:155\n77#3:162\n*S KotlinDebug\n*F\n+ 1 PermissionsUtil.kt\ncom/google/accompanist/permissions/PermissionsUtilKt\n*L\n78#1:149,6\n108#1:156,6\n89#1:155\n121#1:162\n*E\n"})
public final class m {

    @SourceDebugExtension({"SMAP\nPermissionsUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PermissionsUtil.kt\ncom/google/accompanist/permissions/PermissionsUtilKt$PermissionLifecycleCheckerEffect$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,148:1\n64#2,5:149\n*S KotlinDebug\n*F\n+ 1 PermissionsUtil.kt\ncom/google/accompanist/permissions/PermissionsUtilKt$PermissionLifecycleCheckerEffect$1\n*L\n92#1:149,5\n*E\n"})
    static final class a extends l0 implements Function1<v1, u1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c0 f103118a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j0 f103119b;

        /* JADX INFO: renamed from: com.google.accompanist.permissions.m$a$a, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 PermissionsUtil.kt\ncom/google/accompanist/permissions/PermissionsUtilKt$PermissionLifecycleCheckerEffect$1\n*L\n1#1,497:1\n92#2:498\n*E\n"})
        public static final class C0934a implements u1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ c0 f103120a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ j0 f103121b;

            public C0934a(c0 c0Var, j0 j0Var) {
                this.f103120a = c0Var;
                this.f103121b = j0Var;
            }

            @Override // androidx.compose.runtime.u1
            public void dispose() {
                this.f103120a.g(this.f103121b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c0 c0Var, j0 j0Var) {
            super(1);
            this.f103118a = c0Var;
            this.f103119b = j0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final u1 invoke(@NotNull v1 DisposableEffect) {
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            this.f103118a.c(this.f103119b);
            return new C0934a(this.f103118a, this.f103119b);
        }
    }

    static final class b extends l0 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f103122a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c0.a f103123b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f103124c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f103125d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(f fVar, c0.a aVar, int i10, int i11) {
            super(2);
            this.f103122a = fVar;
            this.f103123b = aVar;
            this.f103124c = i10;
            this.f103125d = i11;
        }

        public final void c(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
            m.c(this.f103122a, this.f103123b, c0Var, t4.a(this.f103124c | 1), this.f103125d);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nPermissionsUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PermissionsUtil.kt\ncom/google/accompanist/permissions/PermissionsUtilKt$PermissionsLifecycleCheckerEffect$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,148:1\n64#2,5:149\n*S KotlinDebug\n*F\n+ 1 PermissionsUtil.kt\ncom/google/accompanist/permissions/PermissionsUtilKt$PermissionsLifecycleCheckerEffect$1\n*L\n124#1:149,5\n*E\n"})
    static final class c extends l0 implements Function1<v1, u1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c0 f103126a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j0 f103127b;

        @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 PermissionsUtil.kt\ncom/google/accompanist/permissions/PermissionsUtilKt$PermissionsLifecycleCheckerEffect$1\n*L\n1#1,497:1\n124#2:498\n*E\n"})
        public static final class a implements u1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ c0 f103128a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ j0 f103129b;

            public a(c0 c0Var, j0 j0Var) {
                this.f103128a = c0Var;
                this.f103129b = j0Var;
            }

            @Override // androidx.compose.runtime.u1
            public void dispose() {
                this.f103128a.g(this.f103129b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(c0 c0Var, j0 j0Var) {
            super(1);
            this.f103126a = c0Var;
            this.f103127b = j0Var;
            int i10 = 1 << 1;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final u1 invoke(@NotNull v1 DisposableEffect) {
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            this.f103126a.c(this.f103127b);
            return new a(this.f103126a, this.f103127b);
        }
    }

    static final class d extends l0 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List<f> f103130a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c0.a f103131b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f103132c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f103133d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(List<f> list, c0.a aVar, int i10, int i11) {
            super(2);
            this.f103130a = list;
            this.f103131b = aVar;
            this.f103132c = i10;
            this.f103133d = i11;
        }

        public final void c(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
            m.e(this.f103130a, this.f103131b, c0Var, t4.a(this.f103132c | 1), this.f103133d);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    @o
    @com.google.accompanist.permissions.a
    public static final void c(@NotNull final f permissionState, @Nullable final c0.a aVar, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(permissionState, "permissionState");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1770945943);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c0VarR.D(permissionState) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
            i12 |= c0VarR.D(aVar) ? 32 : 16;
        }
        if ((i12 & 91) == 18 && c0VarR.d()) {
            c0VarR.u();
        } else {
            if (i13 != 0) {
                aVar = c0.a.ON_RESUME;
            }
            if (m0.l0()) {
                m0.A0(-1770945943, i12, -1, "com.google.accompanist.permissions.PermissionLifecycleCheckerEffect (PermissionsUtil.kt:74)");
            }
            c0VarR.h0(-899069829);
            boolean z10 = (i12 & 14) == 4;
            Object objI0 = c0VarR.i0();
            if (z10 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new j0() { // from class: com.google.accompanist.permissions.k
                    @Override // androidx.lifecycle.j0
                    public final void e(o0 o0Var, c0.a aVar2) {
                        m.d(aVar, permissionState, o0Var, aVar2);
                    }
                };
                c0VarR.Y(objI0);
            }
            j0 j0Var = (j0) objI0;
            c0VarR.w0();
            c0 lifecycle = ((o0) c0VarR.W(d0.c())).getLifecycle();
            b2.c(lifecycle, j0Var, new a(lifecycle, j0Var), c0VarR, 72);
            if (m0.l0()) {
                m0.z0();
            }
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new b(permissionState, aVar, i10, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(c0.a aVar, f permissionState, o0 o0Var, c0.a event) {
        Intrinsics.checkNotNullParameter(permissionState, "$permissionState");
        Intrinsics.checkNotNullParameter(o0Var, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event != aVar || Intrinsics.areEqual(permissionState.t(), j.b.f103112a)) {
            return;
        }
        permissionState.c();
    }

    @o
    @com.google.accompanist.permissions.a
    public static final void e(@NotNull final List<f> permissions, @Nullable final c0.a aVar, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1533427666);
        if ((i11 & 2) != 0) {
            aVar = c0.a.ON_RESUME;
        }
        if (m0.l0()) {
            int i12 = 0 | (-1);
            m0.A0(1533427666, i10, -1, "com.google.accompanist.permissions.PermissionsLifecycleCheckerEffect (PermissionsUtil.kt:104)");
        }
        c0VarR.h0(-1664752211);
        boolean zD = c0VarR.D(permissions);
        Object objI0 = c0VarR.i0();
        if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = new j0() { // from class: com.google.accompanist.permissions.l
                @Override // androidx.lifecycle.j0
                public final void e(o0 o0Var, c0.a aVar2) {
                    m.f(aVar, permissions, o0Var, aVar2);
                }
            };
            c0VarR.Y(objI0);
        }
        j0 j0Var = (j0) objI0;
        c0VarR.w0();
        c0 lifecycle = ((o0) c0VarR.W(d0.c())).getLifecycle();
        b2.c(lifecycle, j0Var, new c(lifecycle, j0Var), c0VarR, 72);
        if (m0.l0()) {
            m0.z0();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new d(permissions, aVar, i10, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(c0.a aVar, List permissions, o0 o0Var, c0.a event) {
        Intrinsics.checkNotNullParameter(permissions, "$permissions");
        Intrinsics.checkNotNullParameter(o0Var, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == aVar) {
            Iterator it = permissions.iterator();
            while (it.hasNext()) {
                f fVar = (f) it.next();
                if (!Intrinsics.areEqual(fVar.t(), j.b.f103112a)) {
                    fVar.c();
                }
            }
        }
    }

    public static final boolean g(@NotNull Context context, @NotNull String permission) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(permission, "permission");
        return androidx.core.content.d.a(context, permission) == 0;
    }

    @NotNull
    public static final Activity h(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
            Intrinsics.checkNotNullExpressionValue(context, "getBaseContext(...)");
        }
        throw new IllegalStateException("Permissions should be called in the context of an Activity");
    }

    public static final boolean i(@NotNull j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        if (Intrinsics.areEqual(jVar, j.b.f103112a)) {
            return false;
        }
        if (jVar instanceof j.a) {
            return ((j.a) jVar).d();
        }
        throw new k0();
    }

    @com.google.accompanist.permissions.a
    public static /* synthetic */ void j(j jVar) {
    }

    public static final boolean k(@NotNull j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        return Intrinsics.areEqual(jVar, j.b.f103112a);
    }

    @com.google.accompanist.permissions.a
    public static /* synthetic */ void l(j jVar) {
    }

    public static final boolean m(@NotNull Activity activity, @NotNull String permission) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(permission, "permission");
        return androidx.core.app.b.S(activity, permission);
    }
}
