package androidx.navigation;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@c3
@SourceDebugExtension({"SMAP\nNavOptionsBuilder.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavOptionsBuilder.android.kt\nandroidx/navigation/NavOptionsBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,202:1\n1#2:203\n*E\n"})
public final class a3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f70621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f70622c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private String f70624e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f70625f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f70626g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private kotlin.reflect.d<?> f70627h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private Object f70628i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final w2.a f70620a = new w2.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.d0
    private int f70623d = -1;

    public static final class a implements Function1<x3, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f70629a = new a();

        public final void c(x3 x3Var) {
            Intrinsics.checkNotNullParameter(x3Var, "<this>");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(x3 x3Var) {
            c(x3Var);
            return Unit.f312394a;
        }
    }

    public a3() {
        int i10 = 7 ^ (-1);
    }

    private final void C(String str) {
        if (str != null) {
            if (StringsKt.w3(str)) {
                throw new IllegalArgumentException("Cannot pop up to an empty route");
            }
            this.f70624e = str;
            this.f70625f = false;
        }
    }

    private final void D(kotlin.reflect.d<?> dVar) {
        if (dVar != null) {
            this.f70627h = dVar;
            this.f70625f = false;
        }
    }

    private final void E(Object obj) {
        if (obj != null) {
            this.f70628i = obj;
            this.f70625f = false;
        }
    }

    @kotlin.l(message = "Use the popUpToId property.")
    public static /* synthetic */ void h() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void s(a3 a3Var, int i10, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function1 = new Function1() { // from class: androidx.navigation.x2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return a3.w((x3) obj2);
                }
            };
        }
        a3Var.n(i10, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void t(a3 a3Var, Object obj, Function1 function1, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            function1 = new Function1() { // from class: androidx.navigation.z2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    return a3.y((x3) obj3);
                }
            };
        }
        a3Var.o(obj, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void u(a3 a3Var, String str, Function1 function1, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = new Function1() { // from class: androidx.navigation.y2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return a3.x((x3) obj2);
                }
            };
        }
        a3Var.p(str, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void v(a3 a3Var, Function1 popUpToBuilder, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            popUpToBuilder = a.f70629a;
        }
        Intrinsics.checkNotNullParameter(popUpToBuilder, "popUpToBuilder");
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        a3Var.r(kotlin.jvm.internal.j1.d(Object.class), popUpToBuilder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(x3 x3Var) {
        Intrinsics.checkNotNullParameter(x3Var, "<this>");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(x3 x3Var) {
        Intrinsics.checkNotNullParameter(x3Var, "<this>");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(x3 x3Var) {
        Intrinsics.checkNotNullParameter(x3Var, "<this>");
        return Unit.f312394a;
    }

    @kotlin.l(message = "Use the popUpTo function and passing in the id.")
    public final void A(int i10) {
        s(this, i10, null, 2, null);
    }

    public final void B(int i10) {
        this.f70623d = i10;
        this.f70625f = false;
    }

    public final void F(boolean z10) {
        this.f70622c = z10;
    }

    public final void d(@NotNull Function1<? super m, Unit> animBuilder) {
        Intrinsics.checkNotNullParameter(animBuilder, "animBuilder");
        m mVar = new m();
        animBuilder.invoke(mVar);
        this.f70620a.b(mVar.a()).c(mVar.b()).e(mVar.c()).f(mVar.d());
    }

    @NotNull
    public final w2 e() {
        w2.a aVar = this.f70620a;
        aVar.d(this.f70621b);
        aVar.v(this.f70622c);
        String str = this.f70624e;
        if (str != null) {
            aVar.l(str, this.f70625f, this.f70626g);
        } else {
            kotlin.reflect.d<?> dVar = this.f70627h;
            if (dVar != null) {
                Intrinsics.checkNotNull(dVar);
                aVar.n(dVar, this.f70625f, this.f70626g);
            } else {
                Object obj = this.f70628i;
                if (obj != null) {
                    Intrinsics.checkNotNull(obj);
                    aVar.j(obj, this.f70625f, this.f70626g);
                } else {
                    aVar.h(this.f70623d, this.f70625f, this.f70626g);
                }
            }
        }
        return aVar.a();
    }

    public final boolean f() {
        return this.f70621b;
    }

    public final int g() {
        return this.f70623d;
    }

    public final int i() {
        return this.f70623d;
    }

    @Nullable
    public final String j() {
        return this.f70624e;
    }

    @Nullable
    public final kotlin.reflect.d<?> k() {
        return this.f70627h;
    }

    @Nullable
    public final Object l() {
        return this.f70628i;
    }

    public final boolean m() {
        return this.f70622c;
    }

    public final void n(@androidx.annotation.d0 int i10, @NotNull Function1<? super x3, Unit> popUpToBuilder) {
        Intrinsics.checkNotNullParameter(popUpToBuilder, "popUpToBuilder");
        B(i10);
        C(null);
        x3 x3Var = new x3();
        popUpToBuilder.invoke(x3Var);
        this.f70625f = x3Var.a();
        this.f70626g = x3Var.b();
    }

    public final <T> void o(@NotNull T route, @NotNull Function1<? super x3, Unit> popUpToBuilder) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(popUpToBuilder, "popUpToBuilder");
        E(route);
        B(-1);
        C(null);
        x3 x3Var = new x3();
        popUpToBuilder.invoke(x3Var);
        this.f70625f = x3Var.a();
        this.f70626g = x3Var.b();
    }

    public final void p(@NotNull String route, @NotNull Function1<? super x3, Unit> popUpToBuilder) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(popUpToBuilder, "popUpToBuilder");
        C(route);
        B(-1);
        x3 x3Var = new x3();
        popUpToBuilder.invoke(x3Var);
        this.f70625f = x3Var.a();
        this.f70626g = x3Var.b();
    }

    public final /* synthetic */ <T> void q(Function1<? super x3, Unit> popUpToBuilder) {
        Intrinsics.checkNotNullParameter(popUpToBuilder, "popUpToBuilder");
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        r(kotlin.jvm.internal.j1.d(Object.class), popUpToBuilder);
    }

    public final <T> void r(@NotNull kotlin.reflect.d<T> route, @NotNull Function1<? super x3, Unit> popUpToBuilder) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(popUpToBuilder, "popUpToBuilder");
        D(route);
        B(-1);
        C(null);
        x3 x3Var = new x3();
        popUpToBuilder.invoke(x3Var);
        this.f70625f = x3Var.a();
        this.f70626g = x3Var.b();
    }

    public final void z(boolean z10) {
        this.f70621b = z10;
    }
}
