package com.planner5d.library.activity.fragment;

import androidx.annotation.m1;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.s0;
import com.planner5d.library.model.manager.y1;
import com.planner5d.library.services.utility.k3;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.f2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@w0(parameters = 0)
@ij.f
@SourceDebugExtension({"SMAP\nProjectReloadingHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProjectReloadingHelper.kt\ncom/planner5d/library/activity/fragment/ProjectReloadingHelper\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,59:1\n37#2,2:60\n*S KotlinDebug\n*F\n+ 1 ProjectReloadingHelper.kt\ncom/planner5d/library/activity/fragment/ProjectReloadingHelper\n*L\n55#1:60,2\n*E\n"})
public final class c0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f131550e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final y1 f131551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final s0 f131552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final b2 f131553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final x f131554d;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.ProjectReloadingHelper$closeEditorDecreaseMemoryUsageAndReload$2", f = "ProjectReloadingHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f131555a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.activity.helper.event.content.a f131557c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(com.planner5d.library.activity.helper.event.content.a aVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f131557c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return c0.this.new a(this.f131557c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f131555a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            x.g(c0.this.f131554d, new com.planner5d.library.activity.helper.event.content.c(this.f131557c), false, 2, null);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public c0(@NotNull y1 menuManager, @NotNull s0 globalSettingsManager, @NotNull b2 messageManager, @NotNull x navigator) {
        Intrinsics.checkNotNullParameter(menuManager, "menuManager");
        Intrinsics.checkNotNullParameter(globalSettingsManager, "globalSettingsManager");
        Intrinsics.checkNotNullParameter(messageManager, "messageManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f131551a = menuManager;
        this.f131552b = globalSettingsManager;
        this.f131553c = messageManager;
        this.f131554d = navigator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(c0 c0Var, com.planner5d.library.activity.helper.event.content.a aVar) {
        x xVar = c0Var.f131554d;
        Intrinsics.checkNotNull(aVar);
        x.g(xVar, new com.planner5d.library.activity.helper.event.content.c(aVar), false, 2, null);
        return Unit.f312394a;
    }

    private final com.planner5d.library.model.u f(String str, final Function0<Unit> function0) {
        boolean zA = this.f131552b.a();
        k3 k3Var = new k3(zA ? com.planner5d.library.f.s.Zv : com.planner5d.library.f.s.ks, str);
        ArrayList arrayList = new ArrayList();
        if (zA) {
            arrayList.add(new com.planner5d.library.model.u.a(new k3(com.planner5d.library.f.s.Kz, new Object[0]), (Function0<Unit>) new Function0() { // from class: com.planner5d.library.activity.fragment.a0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return c0.g(this.f131543a, function0);
                }
            }));
        }
        arrayList.add(com.planner5d.library.model.u.f222819h);
        com.planner5d.library.model.u.c cVar = com.planner5d.library.model.u.c.Error;
        com.planner5d.library.model.u.a[] aVarArr = (com.planner5d.library.model.u.a[]) arrayList.toArray(new com.planner5d.library.model.u.a[0]);
        return new com.planner5d.library.model.u(cVar, k3Var, (com.planner5d.library.model.u.a[]) Arrays.copyOf(aVarArr, aVarArr.length));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(c0 c0Var, Function0 function0) {
        c0Var.f131552b.d();
        function0.invoke();
        return Unit.f312394a;
    }

    @m1
    public final void d(@NotNull Project project) {
        Intrinsics.checkNotNullParameter(project, "project");
        final com.planner5d.library.activity.helper.event.content.a aVarA = this.f131551a.a();
        com.planner5d.library.activity.helper.event.content.a aVarH = aVarA.h();
        if (aVarH == null) {
            return;
        }
        b2 b2Var = this.f131553c;
        String str = project.title;
        if (str == null) {
            str = com.planner5d.library.model.payments.a.f222474i;
        }
        b2Var.e(f(str, new Function0() { // from class: com.planner5d.library.activity.fragment.b0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return c0.e(this.f131547a, aVarA);
            }
        }));
        kotlinx.coroutines.k.f(f2.f314023a, com.planner5d.library.services.utility.s.f229729a.a(), null, new a(aVarH, null), 2, null);
    }
}
