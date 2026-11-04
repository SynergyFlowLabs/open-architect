package com.planner5d.library.project.fragment.roomstyle;

import androidx.lifecycle.c1;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import androidx.lifecycle.o0;
import androidx.lifecycle.w0;
import com.planner5d.library.activity.fragment.dialog.purchase.e0;
import com.planner5d.library.database.model.AutoStyle;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.statistics.events.j3;
import com.planner5d.library.modules.user.user.t;
import com.planner5d.library.services.utility.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.b1;
import kotlinx.coroutines.flow.k0;
import kotlinx.coroutines.flow.z0;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nRoomStyleViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomStyleViewModel.kt\ncom/planner5d/library/project/fragment/roomstyle/RoomStyleViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,148:1\n774#2:149\n865#2,2:150\n1557#2:152\n1628#2,3:153\n*S KotlinDebug\n*F\n+ 1 RoomStyleViewModel.kt\ncom/planner5d/library/project/fragment/roomstyle/RoomStyleViewModel\n*L\n92#1:149\n92#1:150,2\n92#1:152\n92#1:153,3\n*E\n"})
public final class l extends f2 {

    @NotNull
    public static final a X = new a(null);
    public static final int Y = 6;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final pd.a f223758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final pd.e f223759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final pd.c f223760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final le.c f223761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final b2 f223762e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final j3 f223763f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.j f223764g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final t f223765h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final k0<List<j>> f223766i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final z0<List<j>> f223767j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final c1<AutoStyle> f223768k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final w0<AutoStyle> f223769l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final c1<b> f223770m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final w0<b> f223771n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final k0<Boolean> f223772o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private final k0<Exception> f223773s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private final z0<Exception> f223774t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private final k0<Boolean> f223775v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.flow.i<Boolean> f223776w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public enum b {
        Next;


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f223779c = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<b> l() {
            return f223779c;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.project.fragment.roomstyle.RoomStyleViewModel$initiateInAppPurchase$1", f = "RoomStyleViewModel.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160745y1}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f223780a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ o0 f223782c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f223783d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(o0 o0Var, int i10, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f223782c = o0Var;
            this.f223783d = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return l.this.new c(this.f223782c, this.f223783d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Integer numE;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f223780a;
            if (i10 == 0) {
                ResultKt.m(obj);
                pd.c cVar = l.this.f223760c;
                o0 o0Var = this.f223782c;
                int i11 = this.f223783d;
                this.f223780a = 1;
                obj = cVar.a(o0Var, i11, this);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            e0 e0Var = (e0) obj;
            if (e0Var != null) {
                l lVar = l.this;
                int iIntValue = 0;
                if (e0Var.h()) {
                    timber.log.b.f381052a.c(e0Var.b(), "Failed purchase", new Object[0]);
                    b2 b2Var = lVar.f223762e;
                    Throwable thB = e0Var.b();
                    Intrinsics.checkNotNullExpressionValue(thB, "getError(...)");
                    b2Var.c(thB);
                    lVar.p0(0);
                } else if (e0Var.i()) {
                    timber.log.b.f381052a.a("Purchase is finished", new Object[0]);
                    fd.i iVarK = e0Var.f132585d.k();
                    if (iVarK != null && (numE = iVarK.e()) != null) {
                        iIntValue = numE.intValue();
                    }
                    lVar.p0(iIntValue);
                }
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.project.fragment.roomstyle.RoomStyleViewModel$loadAutoStyle$1", f = "RoomStyleViewModel.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160725s}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f223784a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f223786c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(long j10, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f223786c = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return l.this.new d(this.f223786c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f223784a;
            if (i10 == 0) {
                ResultKt.m(obj);
                pd.a aVar = l.this.f223758a;
                long j10 = this.f223786c;
                this.f223784a = 1;
                obj = aVar.a(j10, this);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            AutoStyle autoStyle = (AutoStyle) obj;
            if (autoStyle != null) {
                l.this.f223768k.o(autoStyle);
            }
            l.this.f223775v.setValue(kotlin.coroutines.jvm.internal.b.a(false));
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.project.fragment.roomstyle.RoomStyleViewModel$loadRoomStyles$1", f = "RoomStyleViewModel.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.D0}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nRoomStyleViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomStyleViewModel.kt\ncom/planner5d/library/project/fragment/roomstyle/RoomStyleViewModel$loadRoomStyles$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,148:1\n1557#2:149\n1628#2,3:150\n*S KotlinDebug\n*F\n+ 1 RoomStyleViewModel.kt\ncom/planner5d/library/project/fragment/roomstyle/RoomStyleViewModel$loadRoomStyles$1\n*L\n59#1:149\n59#1:150,3\n*E\n"})
    static final class e extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f223787a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f223788b;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit m(l lVar, le.c.a aVar) {
            String strH = aVar.h();
            Intrinsics.checkNotNull(strH);
            lVar.q0(strH);
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return l.this.new e(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            k0 k0Var;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f223788b;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    k0 k0Var2 = l.this.f223766i;
                    le.c cVar = l.this.f223761d;
                    this.f223787a = k0Var2;
                    this.f223788b = 1;
                    Object objA = cVar.a(this);
                    if (objA == objL) {
                        return objL;
                    }
                    k0Var = k0Var2;
                    obj = objA;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    k0Var = (k0) this.f223787a;
                    ResultKt.m(obj);
                }
                Iterable<le.c.a> iterable = (Iterable) obj;
                final l lVar = l.this;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                for (final le.c.a aVar : iterable) {
                    long jI = aVar.i();
                    String strH = aVar.h();
                    Intrinsics.checkNotNull(strH);
                    String strJ = aVar.j();
                    if (strJ == null) {
                        strJ = "";
                    }
                    arrayList.add(new j(jI, strH, strJ, aVar.g(), false, new Function0() { // from class: com.planner5d.library.project.fragment.roomstyle.m
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return l.e.m(lVar, aVar);
                        }
                    }, 16, null));
                }
                k0Var.setValue(arrayList);
                l.this.f223772o.setValue(kotlin.coroutines.jvm.internal.b.a(false));
            } catch (Exception e10) {
                timber.log.b.f381052a.e(e10);
                l.this.f223773s.setValue(e10);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.project.fragment.roomstyle.RoomStyleViewModel$loadingState$1", f = "RoomStyleViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends o implements pj.n<Boolean, Boolean, kotlin.coroutines.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f223790a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ boolean f223791b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ boolean f223792c;

        f(kotlin.coroutines.d<? super f> dVar) {
            super(3, dVar);
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, kotlin.coroutines.d<? super Boolean> dVar) {
            return k(bool.booleanValue(), bool2.booleanValue(), dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f223790a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return kotlin.coroutines.jvm.internal.b.a(this.f223791b || this.f223792c);
        }

        public final Object k(boolean z10, boolean z11, kotlin.coroutines.d<? super Boolean> dVar) {
            f fVar = new f(dVar);
            fVar.f223791b = z10;
            fVar.f223792c = z11;
            return fVar.invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.project.fragment.roomstyle.RoomStyleViewModel$saveNumberOfPurchasedGeneratorImages$1$1", f = "RoomStyleViewModel.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f223793a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AutoStyle f223794b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f223795c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ l f223796d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(AutoStyle autoStyle, int i10, l lVar, kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
            this.f223794b = autoStyle;
            this.f223795c = i10;
            this.f223796d = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new g(this.f223794b, this.f223795c, this.f223796d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f223793a;
            if (i10 == 0) {
                ResultKt.m(obj);
                this.f223794b.J(this.f223795c);
                pd.e eVar = this.f223796d.f223759b;
                AutoStyle autoStyle = this.f223794b;
                this.f223793a = 1;
                if (eVar.a(autoStyle, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            this.f223796d.f223770m.o(b.Next);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((g) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.project.fragment.roomstyle.RoomStyleViewModel$selectRoomStyle$1", f = "RoomStyleViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nRoomStyleViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomStyleViewModel.kt\ncom/planner5d/library/project/fragment/roomstyle/RoomStyleViewModel$selectRoomStyle$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,148:1\n1557#2:149\n1628#2,3:150\n*S KotlinDebug\n*F\n+ 1 RoomStyleViewModel.kt\ncom/planner5d/library/project/fragment/roomstyle/RoomStyleViewModel$selectRoomStyle$1\n*L\n82#1:149\n82#1:150,3\n*E\n"})
    static final class h extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f223797a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f223799c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str, kotlin.coroutines.d<? super h> dVar) {
            super(2, dVar);
            this.f223799c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return l.this.new h(this.f223799c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f223797a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            Iterable<j> iterable = (Iterable) l.this.f223766i.getValue();
            String str = this.f223799c;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (j jVarH : iterable) {
                if (Intrinsics.areEqual(jVarH.k(), str)) {
                    int i10 = 1 << 0;
                    jVarH = j.h(jVarH, 0L, null, null, null, !jVarH.m(), null, 47, null);
                }
                arrayList.add(jVarH);
            }
            l.this.f223766i.setValue(arrayList);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((h) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public l(@NotNull pd.a getAutoStyleUseCase, @NotNull pd.e saveAutoStyleUseCase, @NotNull pd.c initiateInAppPurchaseUseCase, @NotNull le.c getRoomStylesForDesignGeneratorUseCase, @NotNull b2 messageManager, @NotNull j3 events, @NotNull com.planner5d.library.model.manager.config.j featureConfigManager, @NotNull t userAuthorization) {
        Intrinsics.checkNotNullParameter(getAutoStyleUseCase, "getAutoStyleUseCase");
        Intrinsics.checkNotNullParameter(saveAutoStyleUseCase, "saveAutoStyleUseCase");
        Intrinsics.checkNotNullParameter(initiateInAppPurchaseUseCase, "initiateInAppPurchaseUseCase");
        Intrinsics.checkNotNullParameter(getRoomStylesForDesignGeneratorUseCase, "getRoomStylesForDesignGeneratorUseCase");
        Intrinsics.checkNotNullParameter(messageManager, "messageManager");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(featureConfigManager, "featureConfigManager");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        this.f223758a = getAutoStyleUseCase;
        this.f223759b = saveAutoStyleUseCase;
        this.f223760c = initiateInAppPurchaseUseCase;
        this.f223761d = getRoomStylesForDesignGeneratorUseCase;
        this.f223762e = messageManager;
        this.f223763f = events;
        this.f223764g = featureConfigManager;
        this.f223765h = userAuthorization;
        k0<List<j>> k0VarA = b1.a(CollectionsKt.emptyList());
        this.f223766i = k0VarA;
        this.f223767j = k0VarA;
        c1<AutoStyle> c1Var = new c1<>(null);
        this.f223768k = c1Var;
        this.f223769l = c1Var;
        c1<b> c1Var2 = new c1<>(null);
        this.f223770m = c1Var2;
        this.f223771n = c1Var2;
        Boolean bool = Boolean.FALSE;
        k0<Boolean> k0VarA2 = b1.a(bool);
        this.f223772o = k0VarA2;
        k0<Exception> k0VarA3 = b1.a(null);
        this.f223773s = k0VarA3;
        this.f223774t = k0VarA3;
        k0<Boolean> k0VarA4 = b1.a(bool);
        this.f223775v = k0VarA4;
        this.f223776w = kotlinx.coroutines.flow.k.L0(k0VarA2, k0VarA4, new f(null));
    }

    private final void m0(o0 o0Var, int i10) {
        kotlinx.coroutines.k.f(g2.a(this), s.f229729a.a(), null, new c(o0Var, i10, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p0(int i10) {
        AutoStyle autoStyleF = this.f223768k.f();
        if (autoStyleF != null) {
            int i11 = 0 ^ 2;
            kotlinx.coroutines.k.f(g2.a(this), s.f229729a.h(), null, new g(autoStyleF, i10, this, null), 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p2 q0(String str) {
        return kotlinx.coroutines.k.f(g2.a(this), s.f229729a.h(), null, new h(str, null), 2, null);
    }

    @NotNull
    public final z0<List<j>> getUiState() {
        return this.f223767j;
    }

    @NotNull
    public final w0<AutoStyle> i0() {
        return this.f223769l;
    }

    @NotNull
    public final z0<Exception> j0() {
        return this.f223774t;
    }

    @NotNull
    public final kotlinx.coroutines.flow.i<Boolean> k0() {
        return this.f223776w;
    }

    @NotNull
    public final w0<b> l0() {
        return this.f223771n;
    }

    public final void n0(long j10) {
        this.f223775v.setValue(Boolean.TRUE);
        kotlinx.coroutines.k.f(g2.a(this), s.f229729a.h(), null, new d(j10, null), 2, null);
    }

    public final void o0() {
        this.f223772o.setValue(Boolean.TRUE);
        int i10 = 7 ^ 0;
        kotlinx.coroutines.k.f(g2.a(this), s.f229729a.h(), null, new e(null), 2, null);
    }

    public final void r0(@NotNull o0 lifecycleOwner) {
        id.a aVarA;
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        AutoStyle autoStyleF = this.f223768k.f();
        if (autoStyleF != null) {
            List<j> value = this.f223766i.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : value) {
                if (((j) obj).m()) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(Long.valueOf(((j) it.next()).l()));
            }
            autoStyleF.K(CollectionsKt.joinToString$default(arrayList2, null, null, null, 0, null, null, 63, null));
            if (this.f223764g.a(com.planner5d.library.model.manager.config.f.ProAndroid) && (aVarA = this.f223765h.a()) != null && aVarA.g()) {
                p0(6);
            } else {
                m0(lifecycleOwner, arrayList2.size());
            }
        }
    }

    public final void s0() {
        j3.d.a(this.f223763f, j3.a.button_click, null, j3.b.back, null, null, null, 58, null);
    }

    public final void t0(@NotNull String selectedRoomStyles) {
        Intrinsics.checkNotNullParameter(selectedRoomStyles, "selectedRoomStyles");
        j3.d.a(this.f223763f, j3.a.room_design_selected, null, null, null, selectedRoomStyles, null, 46, null);
        j3.d.a(this.f223763f, j3.a.button_click, null, j3.b.f217007c, null, null, null, 58, null);
    }
}
