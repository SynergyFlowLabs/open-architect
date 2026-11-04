package com.planner5d.library.dgenerator.fragment.list;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.lifecycle.c1;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import androidx.lifecycle.w0;
import com.planner5d.library.activity.fragment.dialog.u;
import com.planner5d.library.database.model.AutoStyle;
import com.planner5d.library.dgenerator.dialog.RestartGenerationDialog;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.statistics.events.j3;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.utility.c2;
import com.planner5d.library.services.utility.f1;
import com.planner5d.library.services.utility.s;
import java.io.IOException;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.b1;
import kotlinx.coroutines.flow.k0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class n extends f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.application.b f160344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final b2 f160345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final nb.g f160346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final nb.h f160347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final nb.f f160348e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.database.manager.a f160349f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.builtin.i f160350g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final j3 f160351h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final c2 f160352i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.dialog.k f160353j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final f1 f160354k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final c1<a> f160355l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final w0<a> f160356m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final c1<r> f160357n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final w0<r> f160358o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private final k0<Boolean> f160359s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private final k0<Boolean> f160360t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private final k0<Boolean> f160361v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.flow.i<Boolean> f160362w;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final b f160363a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f160364b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final String f160365c;

        public a(@NotNull b type, long j10, @NotNull String title) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(title, "title");
            this.f160363a = type;
            this.f160364b = j10;
            this.f160365c = title;
        }

        public final long a() {
            return this.f160364b;
        }

        @NotNull
        public final String b() {
            return this.f160365c;
        }

        @NotNull
        public final b c() {
            return this.f160363a;
        }

        public /* synthetic */ a(b bVar, long j10, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(bVar, j10, (i10 & 4) != 0 ? "" : str);
        }
    }

    public enum b {
        Crop,
        Gallery;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f160369d = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<b> l() {
            return f160369d;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.dgenerator.fragment.list.AutoStyleListViewModel$loadingState$1", f = "AutoStyleListViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements pj.o<Boolean, Boolean, Boolean, kotlin.coroutines.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f160370a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ boolean f160371b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ boolean f160372c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ boolean f160373d;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(4, dVar);
        }

        @Override // pj.o
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, Boolean bool3, kotlin.coroutines.d<? super Boolean> dVar) {
            return k(bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue(), dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f160370a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return kotlin.coroutines.jvm.internal.b.a(this.f160371b || this.f160372c || this.f160373d);
        }

        public final Object k(boolean z10, boolean z11, boolean z12, kotlin.coroutines.d<? super Boolean> dVar) {
            c cVar = new c(dVar);
            cVar.f160371b = z10;
            cVar.f160372c = z11;
            cVar.f160373d = z12;
            return cVar.invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.dgenerator.fragment.list.AutoStyleListViewModel$openAutoStyle$1", f = "AutoStyleListViewModel.kt", i = {}, l = {90}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f160374a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AutoStyle f160376c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(AutoStyle autoStyle, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f160376c = autoStyle;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return n.this.new d(this.f160376c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f160374a;
            if (i10 == 0) {
                ResultKt.m(obj);
                n nVar = n.this;
                AutoStyle autoStyle = this.f160376c;
                this.f160374a = 1;
                obj = nVar.t0(autoStyle, this);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            n.this.f160355l.o(new a(b.Gallery, ((Number) obj).longValue(), n.this.l0(this.f160376c.z())));
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.dgenerator.fragment.list.AutoStyleListViewModel$refreshList$1", f = "AutoStyleListViewModel.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f160377a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f160379c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Integer f160380d;

        static final class a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ n f160381a;

            a(n nVar) {
                this.f160381a = nVar;
            }

            @Override // kotlinx.coroutines.flow.j
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(r rVar, kotlin.coroutines.d<? super Unit> dVar) {
                this.f160381a.f160359s.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                this.f160381a.f160357n.o(rVar);
                return Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(boolean z10, Integer num, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f160379c = z10;
            this.f160380d = num;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return n.this.new e(this.f160379c, this.f160380d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f160377a;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.flow.i<r> iVarA = n.this.f160348e.a(this.f160379c, this.f160380d);
                a aVar = new a(n.this);
                this.f160377a = 1;
                if (iVarA.collect(aVar, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.dgenerator.fragment.list.AutoStyleListViewModel$save$2", f = "AutoStyleListViewModel.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nAutoStyleListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoStyleListViewModel.kt\ncom/planner5d/library/dgenerator/fragment/list/AutoStyleListViewModel$save$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,170:1\n1#2:171\n*E\n"})
    static final class f extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Long>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f160382a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AutoStyle f160384c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(AutoStyle autoStyle, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f160384c = autoStyle;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return n.this.new f(this.f160384c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f160382a;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.database.manager.a aVar = n.this.f160349f;
                AutoStyle autoStyle = this.f160384c;
                this.f160382a = 1;
                obj = aVar.j(autoStyle, this);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            n nVar = n.this;
            ((Number) obj).longValue();
            nVar.f160361v.setValue(kotlin.coroutines.jvm.internal.b.a(false));
            return obj;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Long> dVar) {
            return ((f) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.dgenerator.fragment.list.AutoStyleListViewModel$startAutoStyle$1", f = "AutoStyleListViewModel.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f160385a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f160387c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Bitmap f160388d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Context context, Bitmap bitmap, kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
            this.f160387c = context;
            this.f160388d = bitmap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit m(n nVar, long j10) {
            nVar.f160360t.setValue(Boolean.FALSE);
            nVar.f160355l.o(new a(b.Crop, j10, null, 4, null));
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return n.this.new g(this.f160387c, this.f160388d, dVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v9 */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f160385a;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    nb.g gVar = n.this.f160346c;
                    Context context = this.f160387c;
                    Bitmap bitmap = this.f160388d;
                    final n nVar = n.this;
                    Function1<? super Long, Unit> function1 = new Function1() { // from class: com.planner5d.library.dgenerator.fragment.list.o
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return n.g.m(nVar, ((Long) obj2).longValue());
                        }
                    };
                    this.f160385a = 1;
                    Object objA = gVar.a(context, bitmap, function1, this);
                    this = objA;
                    if (objA == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    this = this;
                }
            } catch (IOException unused) {
                n.this.f160357n.r(n.this.i0().f());
                n.this.f160360t.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                n.this.f160345b.s("Error. Failed to save image and get URI.");
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((g) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.dgenerator.fragment.list.AutoStyleListViewModel$startNewGeneration$1", f = "AutoStyleListViewModel.kt", i = {}, l = {120}, m = "invokeSuspend", n = {}, s = {})
    static final class h extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f160389a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AutoStyle f160391c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f160392d;

        static final class a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ n f160393a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f160394b;

            a(n nVar, int i10) {
                this.f160393a = nVar;
                this.f160394b = i10;
            }

            @Override // kotlinx.coroutines.flow.j
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(AutoStyle autoStyle, kotlin.coroutines.d<? super Unit> dVar) {
                this.f160393a.r0(false, kotlin.coroutines.jvm.internal.b.f(this.f160394b));
                this.f160393a.f160360t.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                return Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(AutoStyle autoStyle, int i10, kotlin.coroutines.d<? super h> dVar) {
            super(2, dVar);
            this.f160391c = autoStyle;
            this.f160392d = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return n.this.new h(this.f160391c, this.f160392d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f160389a;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.flow.i<AutoStyle> iVarA = n.this.f160347d.a(this.f160391c);
                a aVar = new a(n.this, this.f160392d);
                this.f160389a = 1;
                if (iVarA.collect(aVar, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((h) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public n(@NotNull com.planner5d.library.application.b application, @NotNull b2 messageManager, @NotNull nb.g startAutoStyleUseCase, @NotNull nb.h startNewAutoStyleUseCase, @NotNull nb.f loadAutoStylesUseCase, @NotNull com.planner5d.library.database.manager.a databaseManager, @NotNull com.planner5d.library.model.manager.builtin.i builtInDataManager, @NotNull j3 events, @NotNull c2 networkStateUtility, @NotNull com.planner5d.library.activity.fragment.dialog.k dialogLauncher, @NotNull f1 globalCoroutineScope) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(messageManager, "messageManager");
        Intrinsics.checkNotNullParameter(startAutoStyleUseCase, "startAutoStyleUseCase");
        Intrinsics.checkNotNullParameter(startNewAutoStyleUseCase, "startNewAutoStyleUseCase");
        Intrinsics.checkNotNullParameter(loadAutoStylesUseCase, "loadAutoStylesUseCase");
        Intrinsics.checkNotNullParameter(databaseManager, "databaseManager");
        Intrinsics.checkNotNullParameter(builtInDataManager, "builtInDataManager");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(networkStateUtility, "networkStateUtility");
        Intrinsics.checkNotNullParameter(dialogLauncher, "dialogLauncher");
        Intrinsics.checkNotNullParameter(globalCoroutineScope, "globalCoroutineScope");
        this.f160344a = application;
        this.f160345b = messageManager;
        this.f160346c = startAutoStyleUseCase;
        this.f160347d = startNewAutoStyleUseCase;
        this.f160348e = loadAutoStylesUseCase;
        this.f160349f = databaseManager;
        this.f160350g = builtInDataManager;
        this.f160351h = events;
        this.f160352i = networkStateUtility;
        this.f160353j = dialogLauncher;
        this.f160354k = globalCoroutineScope;
        c1<a> c1Var = new c1<>(null);
        this.f160355l = c1Var;
        this.f160356m = c1Var;
        c1<r> c1Var2 = new c1<>(new r(null, null, 3, null));
        this.f160357n = c1Var2;
        this.f160358o = c1Var2;
        Boolean bool = Boolean.FALSE;
        k0<Boolean> k0VarA = b1.a(bool);
        this.f160359s = k0VarA;
        k0<Boolean> k0VarA2 = b1.a(bool);
        this.f160360t = k0VarA2;
        k0<Boolean> k0VarA3 = b1.a(bool);
        this.f160361v = k0VarA3;
        this.f160362w = kotlinx.coroutines.flow.k.H(k0VarA, k0VarA2, k0VarA3, new c(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String l0(Integer num) {
        if (num != null) {
            String strB = this.f160350g.b0(num.intValue()).b();
            if (strB != null) {
                return strB;
            }
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o0(n nVar, AutoStyle autoStyle, int i10, Boolean bool) {
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            nVar.w0(autoStyle, i10);
        }
    }

    private final void q0(AutoStyle autoStyle) {
        if (autoStyle.s()) {
            autoStyle.O(true);
            kotlinx.coroutines.k.f(g2.a(this), null, null, new d(autoStyle, null), 3, null);
        }
    }

    public static /* synthetic */ void s0(n nVar, boolean z10, Integer num, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            num = null;
        }
        nVar.r0(z10, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object t0(AutoStyle autoStyle, kotlin.coroutines.d<? super Long> dVar) {
        this.f160361v.setValue(kotlin.coroutines.jvm.internal.b.a(true));
        return kotlinx.coroutines.i.h(s.f229729a.h(), new f(autoStyle, null), dVar);
    }

    private final void w0(AutoStyle autoStyle, int i10) {
        this.f160360t.setValue(Boolean.TRUE);
        kotlinx.coroutines.k.f(this.f160354k, s.f229729a.h(), null, new h(autoStyle, i10, null), 2, null);
    }

    public final void A0() {
        j3.d.a(this.f160351h, j3.a.screen_view, j3.g.folders_page, null, null, null, null, 60, null);
    }

    @NotNull
    public final w0<r> i0() {
        return this.f160358o;
    }

    @NotNull
    public final kotlinx.coroutines.flow.i<Boolean> j0() {
        return this.f160362w;
    }

    @NotNull
    public final w0<a> k0() {
        return this.f160356m;
    }

    public final boolean m0() {
        boolean zD = this.f160352i.d(this.f160344a);
        if (!zD) {
            this.f160345b.r(new ErrorMessageException(com.planner5d.library.f.s.K9, new String[0]));
        }
        return zD;
    }

    public final void n0(@NotNull final AutoStyle autoStyle, final int i10) {
        Intrinsics.checkNotNullParameter(autoStyle, "autoStyle");
        if (autoStyle.C()) {
            this.f160353j.c(RestartGenerationDialog.class).m(new u() { // from class: com.planner5d.library.dgenerator.fragment.list.m
                @Override // com.planner5d.library.activity.fragment.dialog.u
                public final void a(Object obj) {
                    n.o0(this.f160341a, autoStyle, i10, (Boolean) obj);
                }
            }).g();
        } else {
            q0(autoStyle);
        }
    }

    public final void p0() {
        this.f160355l.r(null);
    }

    public final void r0(boolean z10, @Nullable Integer num) {
        this.f160359s.setValue(Boolean.TRUE);
        kotlinx.coroutines.k.f(this.f160354k, s.f229729a.h(), null, new e(z10, num, null), 2, null);
    }

    public final void u0(boolean z10) {
        this.f160360t.setValue(Boolean.valueOf(z10));
    }

    public final void v0(@NotNull Context context, @NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.f160360t.setValue(Boolean.TRUE);
        int i10 = 3 & 2;
        kotlinx.coroutines.k.f(g2.a(this), s.f229729a.h(), null, new g(context, bitmap, null), 2, null);
    }

    public final void x0() {
        List<AutoStyle> listF;
        j3 j3Var = this.f160351h;
        j3.a aVar = j3.a.button_click;
        j3.g gVar = j3.g.folders_page;
        r rVarF = this.f160357n.f();
        j3.d.a(j3Var, aVar, gVar, (rVarF == null || (listF = rVarF.f()) == null || !listF.isEmpty()) ? j3.b.generate_new_design : j3.b.back, null, null, null, 56, null);
    }

    public final void y0() {
        j3.d.a(this.f160351h, j3.a.button_click, j3.g.folders_page, j3.b.photo_upload, null, null, null, 56, null);
    }

    public final void z0() {
        j3.d.a(this.f160351h, j3.a.photo_uploaded, j3.g.folders_page, null, null, null, null, 60, null);
    }
}
