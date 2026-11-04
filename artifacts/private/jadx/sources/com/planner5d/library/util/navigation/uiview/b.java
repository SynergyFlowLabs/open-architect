package com.planner5d.library.util.navigation.uiview;

import androidx.lifecycle.c1;
import androidx.lifecycle.w0;
import com.planner5d.library.services.utility.k3;
import com.planner5d.library.services.utility.v1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nAppUiStateHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppUiStateHolder.kt\ncom/planner5d/library/util/navigation/uiview/AppUiStateHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,50:1\n1#2:51\n*E\n"})
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final C1716b f244810d = new C1716b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f244811e = 1000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private a f244812a = new a(new k3(), new com.planner5d.library.activity.helper.ui.b(false, null, false, 6, null));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final c1<a> f244813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final w0<a> f244814c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final k3 f244815a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final com.planner5d.library.activity.helper.ui.b f244816b;

        public a(@NotNull k3 title, @NotNull com.planner5d.library.activity.helper.ui.b indicatorUiState) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(indicatorUiState, "indicatorUiState");
            this.f244815a = title;
            this.f244816b = indicatorUiState;
        }

        @NotNull
        public final com.planner5d.library.activity.helper.ui.b a() {
            return this.f244816b;
        }

        @NotNull
        public final k3 b() {
            return this.f244815a;
        }
    }

    /* JADX INFO: renamed from: com.planner5d.library.util.navigation.uiview.b$b, reason: collision with other inner class name */
    public static final class C1716b {
        public /* synthetic */ C1716b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1716b() {
        }
    }

    public b() {
        int i10 = 2 ^ 0;
        c1<a> c1Var = new c1<>(new a(new k3(), new com.planner5d.library.activity.helper.ui.b(false, null, false, 6, null)));
        this.f244813b = c1Var;
        this.f244814c = v1.f229769a.x(c1Var, new Function2() { // from class: com.planner5d.library.util.navigation.uiview.a
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Long.valueOf(b.h(this.f244809a, (b.a) obj, (b.a) obj2));
            }
        });
    }

    private final boolean c(a aVar, a aVar2) {
        com.planner5d.library.activity.helper.ui.b bVarA;
        com.planner5d.library.activity.helper.ui.b bVarA2;
        return (aVar == null || (bVarA = aVar.a()) == null || bVarA.a() || aVar2 == null || (bVarA2 = aVar2.a()) == null || !bVarA2.a()) ? false : true;
    }

    private final void e(a aVar) {
        this.f244812a = aVar;
        this.f244813b.r(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long h(b bVar, a aVar, a aVar2) {
        k3 k3VarB;
        if (bVar.c(aVar, aVar2)) {
            return 0L;
        }
        return (aVar2 == null || (k3VarB = aVar2.b()) == null || !k3VarB.f()) ? 1000L : 0L;
    }

    @NotNull
    public final w0<a> b() {
        return this.f244814c;
    }

    @NotNull
    public final b d(@NotNull com.planner5d.library.activity.helper.ui.b inProgress) {
        Intrinsics.checkNotNullParameter(inProgress, "inProgress");
        e(new a(this.f244812a.b(), inProgress));
        return this;
    }

    @NotNull
    public final b f(@NotNull k3 title) {
        Intrinsics.checkNotNullParameter(title, "title");
        e(new a(title, this.f244812a.a()));
        return this;
    }

    @NotNull
    public final b g(@NotNull k3 title) {
        Intrinsics.checkNotNullParameter(title, "title");
        e(new a(title, new com.planner5d.library.activity.helper.ui.b(false, null, false, 6, null)));
        return this;
    }
}
