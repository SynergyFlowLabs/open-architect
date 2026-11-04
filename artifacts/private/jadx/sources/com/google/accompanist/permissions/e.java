package com.google.accompanist.permissions;

import android.app.Activity;
import android.content.Context;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.o;
import androidx.compose.runtime.u1;
import androidx.compose.runtime.v1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMutableMultiplePermissionsState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableMultiplePermissionsState.kt\ncom/google/accompanist/permissions/MutableMultiplePermissionsStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,152:1\n1223#2,6:153\n1223#2,6:159\n1223#2,3:166\n1226#2,3:173\n1223#2,6:176\n77#3:165\n1549#4:169\n1620#4,3:170\n*S KotlinDebug\n*F\n+ 1 MutableMultiplePermissionsState.kt\ncom/google/accompanist/permissions/MutableMultiplePermissionsStateKt\n*L\n52#1:153,6\n59#1:159,6\n81#1:166,3\n81#1:173,3\n90#1:176,6\n79#1:165\n82#1:169\n82#1:170,3\n*E\n"})
public final class e {

    static final class a extends l0 implements Function1<Map<String, ? extends Boolean>, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f103087a = new a();

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

    @SourceDebugExtension({"SMAP\nMutableMultiplePermissionsState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableMultiplePermissionsState.kt\ncom/google/accompanist/permissions/MutableMultiplePermissionsStateKt$rememberMutableMultiplePermissionsState$2\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,152:1\n64#2,5:153\n*S KotlinDebug\n*F\n+ 1 MutableMultiplePermissionsState.kt\ncom/google/accompanist/permissions/MutableMultiplePermissionsStateKt$rememberMutableMultiplePermissionsState$2\n*L\n65#1:153,5\n*E\n"})
    static final class b extends l0 implements Function1<v1, u1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.accompanist.permissions.d f103088a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.activity.compose.k<String[], Map<String, Boolean>> f103089b;

        @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 MutableMultiplePermissionsState.kt\ncom/google/accompanist/permissions/MutableMultiplePermissionsStateKt$rememberMutableMultiplePermissionsState$2\n*L\n1#1,497:1\n66#2,2:498\n*E\n"})
        public static final class a implements u1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.google.accompanist.permissions.d f103090a;

            public a(com.google.accompanist.permissions.d dVar) {
                this.f103090a = dVar;
            }

            @Override // androidx.compose.runtime.u1
            public void dispose() {
                this.f103090a.g(null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(com.google.accompanist.permissions.d dVar, androidx.activity.compose.k<String[], Map<String, Boolean>> kVar) {
            super(1);
            this.f103088a = dVar;
            this.f103089b = kVar;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final u1 invoke(@NotNull v1 DisposableEffect) {
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            this.f103088a.g(this.f103089b);
            return new a(this.f103088a);
        }
    }

    static final class c extends l0 implements Function1<Map<String, Boolean>, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.accompanist.permissions.d f103091a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<Map<String, Boolean>, Unit> f103092b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(com.google.accompanist.permissions.d dVar, Function1<? super Map<String, Boolean>, Unit> function1) {
            super(1);
            this.f103091a = dVar;
            this.f103092b = function1;
        }

        public final void c(@NotNull Map<String, Boolean> permissionsResult) {
            Intrinsics.checkNotNullParameter(permissionsResult, "permissionsResult");
            this.f103091a.h(permissionsResult);
            this.f103092b.invoke(permissionsResult);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Map<String, Boolean> map) {
            c(map);
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nMutableMultiplePermissionsState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableMultiplePermissionsState.kt\ncom/google/accompanist/permissions/MutableMultiplePermissionsStateKt$rememberMutablePermissionsState$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,152:1\n64#2,5:153\n*S KotlinDebug\n*F\n+ 1 MutableMultiplePermissionsState.kt\ncom/google/accompanist/permissions/MutableMultiplePermissionsStateKt$rememberMutablePermissionsState$1\n*L\n95#1:153,5\n*E\n"})
    static final class d extends l0 implements Function1<v1, u1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f103093a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.activity.compose.k<String, Boolean> f103094b;

        @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 MutableMultiplePermissionsState.kt\ncom/google/accompanist/permissions/MutableMultiplePermissionsStateKt$rememberMutablePermissionsState$1\n*L\n1#1,497:1\n96#2,2:498\n*E\n"})
        public static final class a implements u1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ f f103095a;

            public a(f fVar) {
                this.f103095a = fVar;
            }

            @Override // androidx.compose.runtime.u1
            public void dispose() {
                this.f103095a.d(null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(f fVar, androidx.activity.compose.k<String, Boolean> kVar) {
            super(1);
            this.f103093a = fVar;
            this.f103094b = kVar;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final u1 invoke(@NotNull v1 DisposableEffect) {
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            this.f103093a.d(this.f103094b);
            return new a(this.f103093a);
        }
    }

    /* JADX INFO: renamed from: com.google.accompanist.permissions.e$e, reason: collision with other inner class name */
    static final class C0933e extends l0 implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f103096a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0933e(f fVar) {
            super(1);
            this.f103096a = fVar;
        }

        public final void c(boolean z10) {
            this.f103096a.c();
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
    public static final com.google.accompanist.permissions.b a(@NotNull List<String> permissions, @Nullable Function1<? super Map<String, Boolean>, Unit> function1, @Nullable c0 c0Var, int i10, int i11) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        c0Var.h0(-2044770427);
        if ((i11 & 2) != 0) {
            function1 = a.f103087a;
        }
        if (m0.l0()) {
            int i12 = 4 ^ (-1);
            m0.A0(-2044770427, i10, -1, "com.google.accompanist.permissions.rememberMutableMultiplePermissionsState (MutableMultiplePermissionsState.kt:45)");
        }
        List<f> listB = b(permissions, c0Var, 8);
        m.e(listB, null, c0Var, 8, 2);
        c0Var.h0(-1585748799);
        boolean zD = c0Var.D(permissions);
        Object objI0 = c0Var.i0();
        if (zD || objI0 == c0.f35327a.a()) {
            objI0 = new com.google.accompanist.permissions.d(listB);
            c0Var.Y(objI0);
        }
        com.google.accompanist.permissions.d dVar = (com.google.accompanist.permissions.d) objI0;
        c0Var.w0();
        g.b.k kVar = new g.b.k();
        c0Var.h0(-1585748493);
        boolean zD2 = ((((i10 & com.planner5d.library.engine.input.f.b.B) ^ 48) > 32 && c0Var.k0(function1)) || (i10 & 48) == 32) | c0Var.D(dVar);
        Object objI1 = c0Var.i0();
        if (zD2 || objI1 == c0.f35327a.a()) {
            objI1 = new c(dVar, function1);
            c0Var.Y(objI1);
        }
        c0Var.w0();
        androidx.activity.compose.k kVarA = androidx.activity.compose.d.a(kVar, (Function1) objI1, c0Var, 8);
        b2.c(dVar, kVarA, new b(dVar, kVarA), c0Var, androidx.activity.compose.k.f9830c << 3);
        if (m0.l0()) {
            m0.z0();
        }
        c0Var.w0();
        return dVar;
    }

    @o
    @com.google.accompanist.permissions.a
    private static final List<f> b(List<String> list, c0 c0Var, int i10) {
        Object obj;
        c0Var.h0(992349447);
        if (m0.l0()) {
            m0.A0(992349447, i10, -1, "com.google.accompanist.permissions.rememberMutablePermissionsState (MutableMultiplePermissionsState.kt:76)");
        }
        Context context = (Context) c0Var.W(AndroidCompositionLocals_androidKt.g());
        Activity activityH = m.h(context);
        c0Var.h0(-1458104306);
        boolean zD = c0Var.D(list);
        Object objI0 = c0Var.i0();
        if (zD || objI0 == c0.f35327a.a()) {
            obj = objI0;
            List<String> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(new f((String) it.next(), context, activityH));
            }
            c0Var.Y(arrayList);
            obj = arrayList;
        }
        obj = objI0;
        List<f> list3 = (List) obj;
        c0Var.w0();
        for (f fVar : list3) {
            c0Var.m0(-1458104076, fVar.F7());
            g.b.l lVar = new g.b.l();
            c0Var.h0(-1458103836);
            boolean zD2 = c0Var.D(fVar);
            Object objI1 = c0Var.i0();
            if (zD2 || objI1 == c0.f35327a.a()) {
                objI1 = new C0933e(fVar);
                c0Var.Y(objI1);
            }
            c0Var.w0();
            androidx.activity.compose.k kVarA = androidx.activity.compose.d.a(lVar, (Function1) objI1, c0Var, 8);
            b2.d(kVarA, new d(fVar, kVarA), c0Var, androidx.activity.compose.k.f9830c);
            c0Var.v0();
        }
        if (m0.l0()) {
            m0.z0();
        }
        c0Var.w0();
        return list3;
    }
}
