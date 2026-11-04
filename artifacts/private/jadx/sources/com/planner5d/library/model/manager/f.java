package com.planner5d.library.model.manager;

import android.util.Pair;
import com.planner5d.library.model.item.ItemProject;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@ij.f
public final class f implements x1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f191304d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f191305e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final com.planner5d.library.model.c f191306f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final com.planner5d.library.model.c f191307g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final com.planner5d.library.model.c[] f191308h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.modules.user.user.t f191309c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final com.planner5d.library.model.c a() {
            return f.f191307g;
        }

        @NotNull
        public final com.planner5d.library.model.c b() {
            return f.f191306f;
        }

        @NotNull
        public final com.planner5d.library.model.c[] c() {
            return f.f191308h;
        }

        private a() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.ColorManager$getGroupsWithColors$2", f = "ColorManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nColorManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorManager.kt\ncom/planner5d/library/model/manager/ColorManager$getGroupsWithColors$2\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,45:1\n11165#2:46\n11500#2,3:47\n*S KotlinDebug\n*F\n+ 1 ColorManager.kt\ncom/planner5d/library/model/manager/ColorManager$getGroupsWithColors$2\n*L\n37#1:46\n37#1:47,3\n*E\n"})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super List<? extends Pair<com.planner5d.library.model.c, List<? extends com.planner5d.library.model.b>>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f191310a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ItemProject f191312c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ItemProject itemProject, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f191312c = itemProject;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return f.this.new b(this.f191312c, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super List<? extends Pair<com.planner5d.library.model.c, List<? extends com.planner5d.library.model.b>>>> dVar) {
            return invoke2(s0Var, (kotlin.coroutines.d<? super List<? extends Pair<com.planner5d.library.model.c, List<com.planner5d.library.model.b>>>>) dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f191310a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            com.planner5d.library.model.c[] cVarArrC = f.f191304d.c();
            f fVar = f.this;
            ItemProject itemProject = this.f191312c;
            ArrayList arrayList = new ArrayList(cVarArrC.length);
            for (com.planner5d.library.model.c cVar : cVarArrC) {
                arrayList.add(new Pair(cVar, fVar.h(cVar, itemProject).e()));
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super List<? extends Pair<com.planner5d.library.model.c, List<com.planner5d.library.model.b>>>> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    static {
        com.planner5d.library.model.c cVar = new com.planner5d.library.model.c(com.planner5d.library.f.s.GG);
        f191306f = cVar;
        com.planner5d.library.model.c cVar2 = new com.planner5d.library.model.c(com.planner5d.library.f.s.FG);
        f191307g = cVar2;
        f191308h = new com.planner5d.library.model.c[]{cVar, cVar2};
    }

    @ij.a
    public f(@NotNull com.planner5d.library.modules.user.user.t userAuthorization) {
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        this.f191309c = userAuthorization;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.planner5d.library.model.editorcollection.g<com.planner5d.library.model.b> h(com.planner5d.library.model.c cVar, ItemProject itemProject) {
        if (Intrinsics.areEqual(cVar, f191307g)) {
            return com.planner5d.library.model.editorcollection.g.f180693c.b(itemProject);
        }
        if (Intrinsics.areEqual(cVar, f191306f)) {
            return com.planner5d.library.model.editorcollection.g.f180693c.d(this.f191309c.a());
        }
        throw new RuntimeException("Unknown color group");
    }

    public final void f(@NotNull com.planner5d.library.model.b color) {
        Intrinsics.checkNotNullParameter(color, "color");
        h(f191306f, null).c(color);
    }

    @Nullable
    public final Object i(@NotNull ItemProject itemProject, @NotNull kotlin.coroutines.d<? super List<? extends Pair<com.planner5d.library.model.c, List<com.planner5d.library.model.b>>>> dVar) {
        return kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.h(), new b(itemProject, null), dVar);
    }
}
