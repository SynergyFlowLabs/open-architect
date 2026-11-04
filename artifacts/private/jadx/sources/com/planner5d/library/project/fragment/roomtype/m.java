package com.planner5d.library.project.fragment.roomtype;

import androidx.lifecycle.c1;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import androidx.lifecycle.w0;
import com.planner5d.library.database.model.AutoStyle;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.n1;
import com.planner5d.library.model.manager.statistics.events.StatisticsEventAiDesigner;
import com.planner5d.library.model.manager.statistics.events.a4;
import com.planner5d.library.model.manager.statistics.events.j3;
import com.planner5d.library.model.manager.statistics.events.p2;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.utility.s;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
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
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class m extends f2 implements StatisticsEventAiDesigner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ StatisticsEventAiDesigner f223842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final n1 f223843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final pd.a f223844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final pd.e f223845d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final pd.b f223846e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final j3 f223847f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final b2 f223848g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private c f223849h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private a4.e f223850i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final c1<Pair<b, Long>> f223851j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final w0<Pair<b, Long>> f223852k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final c1<AutoStyle> f223853l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final w0<AutoStyle> f223854m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final k0<d> f223855n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final z0<d> f223856o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private final k0<Boolean> f223857s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private final k0<Boolean> f223858t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.flow.i<Boolean> f223859v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private StatisticsEventAiDesigner.EventData f223860w;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.project.fragment.roomtype.RoomTypeViewModel$1", f = "RoomTypeViewModel.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.I0}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nRoomTypeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomTypeViewModel.kt\ncom/planner5d/library/project/fragment/roomtype/RoomTypeViewModel$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,153:1\n1557#2:154\n1628#2,3:155\n*S KotlinDebug\n*F\n+ 1 RoomTypeViewModel.kt\ncom/planner5d/library/project/fragment/roomtype/RoomTypeViewModel$1\n*L\n62#1:154\n62#1:155,3\n*E\n"})
    static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f223861a;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit m(m mVar, od.a aVar) {
            mVar.r0(aVar.g());
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return m.this.new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f223861a;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    pd.b bVar = m.this.f223846e;
                    this.f223861a = 1;
                    obj = bVar.a(this);
                    if (obj == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                Iterable<od.a> iterable = (Iterable) obj;
                final m mVar = m.this;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                for (final od.a aVar : iterable) {
                    arrayList.add(new j(aVar.i(), aVar.h(), new Function0() { // from class: com.planner5d.library.project.fragment.roomtype.l
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return m.a.m(mVar, aVar);
                        }
                    }));
                }
                m.this.f223855n.setValue(new d(arrayList));
                m.this.f223857s.setValue(kotlin.coroutines.jvm.internal.b.a(false));
            } catch (com.planner5d.library.api.e e10) {
                timber.log.b.f381052a.e(e10);
                m mVar2 = m.this;
                int i11 = 1 << 0;
                mVar2.i(StatisticsEventAiDesigner.a.error, StatisticsEventAiDesigner.EventData.j(mVar2.n0(), null, null, null, null, null, StatisticsEventAiDesigner.e.unexpected, null, 95, null));
                m.this.f223848g.r(new ErrorMessageException(com.planner5d.library.f.s.K9, new String[0]));
                m.this.f223851j.o(new Pair(b.Back, kotlin.coroutines.jvm.internal.b.g(0L)));
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public enum b {
        Next,
        Back,
        SmartWizard,
        AiDesigner;


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f223868f = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<b> l() {
            return f223868f;
        }
    }

    public enum c {
        DesignGenerator,
        SmartWizard,
        AiDesigner;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f223873e = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<c> l() {
            return f223873e;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final List<j> f223874a;

        /* JADX WARN: Multi-variable type inference failed */
        public d() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ d c(d dVar, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = dVar.f223874a;
            }
            return dVar.b(list);
        }

        @NotNull
        public final List<j> a() {
            return this.f223874a;
        }

        @NotNull
        public final d b(@NotNull List<j> items) {
            Intrinsics.checkNotNullParameter(items, "items");
            return new d(items);
        }

        @NotNull
        public final List<j> d() {
            return this.f223874a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.areEqual(this.f223874a, ((d) obj).f223874a);
        }

        public int hashCode() {
            return this.f223874a.hashCode();
        }

        @NotNull
        public String toString() {
            return "UiState(items=" + this.f223874a + ")";
        }

        public d(@NotNull List<j> items) {
            Intrinsics.checkNotNullParameter(items, "items");
            this.f223874a = items;
        }

        public /* synthetic */ d(List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? CollectionsKt.emptyList() : list);
        }
    }

    public /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f223875a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.SmartWizard.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.DesignGenerator.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.AiDesigner.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f223875a = iArr;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.project.fragment.roomtype.RoomTypeViewModel$loadAutoStyle$1", f = "RoomTypeViewModel.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160705l0}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f223876a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f223878c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(long j10, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f223878c = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return m.this.new f(this.f223878c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f223876a;
            if (i10 == 0) {
                ResultKt.m(obj);
                pd.a aVar = m.this.f223844c;
                long j10 = this.f223878c;
                this.f223876a = 1;
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
            m.this.f223853l.o((AutoStyle) obj);
            m.this.f223858t.setValue(kotlin.coroutines.jvm.internal.b.a(false));
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.project.fragment.roomtype.RoomTypeViewModel$loadingState$1", f = "RoomTypeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends o implements pj.n<Boolean, Boolean, kotlin.coroutines.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f223879a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ boolean f223880b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ boolean f223881c;

        g(kotlin.coroutines.d<? super g> dVar) {
            super(3, dVar);
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, kotlin.coroutines.d<? super Boolean> dVar) {
            return k(bool.booleanValue(), bool2.booleanValue(), dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f223879a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return kotlin.coroutines.jvm.internal.b.a(this.f223880b || this.f223881c);
        }

        public final Object k(boolean z10, boolean z11, kotlin.coroutines.d<? super Boolean> dVar) {
            g gVar = new g(dVar);
            gVar.f223880b = z10;
            gVar.f223881c = z11;
            return gVar.invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.project.fragment.roomtype.RoomTypeViewModel$selectRoomType$1", f = "RoomTypeViewModel.kt", i = {}, l = {com.rabbitmq.client.impl.k.b.p.f265340a}, m = "invokeSuspend", n = {}, s = {})
    static final class h extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f223882a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f223883b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f223885d;

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f223886a;

            static {
                int[] iArr = new int[c.values().length];
                try {
                    iArr[c.SmartWizard.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[c.AiDesigner.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f223886a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(int i10, kotlin.coroutines.d<? super h> dVar) {
            super(2, dVar);
            this.f223885d = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return m.this.new h(this.f223885d, dVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            m mVar;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f223883b;
            if (i10 == 0) {
                ResultKt.m(obj);
                int i11 = a.f223886a[m.this.f223849h.ordinal()];
                if (i11 == 1) {
                    m.this.f223851j.o(new Pair(b.SmartWizard, kotlin.coroutines.jvm.internal.b.g(this.f223885d)));
                } else if (i11 != 2) {
                    m.this.w0(this.f223885d);
                    AutoStyle autoStyle = (AutoStyle) m.this.f223853l.f();
                    if (autoStyle != null) {
                        int i12 = this.f223885d;
                        m mVar2 = m.this;
                        autoStyle.L(kotlin.coroutines.jvm.internal.b.f(i12));
                        pd.e eVar = mVar2.f223845d;
                        this.f223882a = mVar2;
                        this.f223883b = 1;
                        obj = eVar.a(autoStyle, this);
                        if (obj == objL) {
                            return objL;
                        }
                        mVar = mVar2;
                    }
                } else {
                    m.this.f223851j.o(new Pair(b.AiDesigner, kotlin.coroutines.jvm.internal.b.g(this.f223885d)));
                }
                return Unit.f312394a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mVar = (m) this.f223882a;
            ResultKt.m(obj);
            mVar.f223851j.o(new Pair(b.Next, kotlin.coroutines.jvm.internal.b.g(((Number) obj).longValue())));
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((h) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ij.a
    public m(@NotNull n1 languageManager, @NotNull pd.a getAutoStyleUseCase, @NotNull pd.e saveAutoStyleUseCase, @NotNull pd.b getRoomTypesUseCase, @NotNull j3 events, @NotNull b2 messageManager, @NotNull StatisticsEventAiDesigner statisticsEventAiDesigner) {
        Intrinsics.checkNotNullParameter(languageManager, "languageManager");
        Intrinsics.checkNotNullParameter(getAutoStyleUseCase, "getAutoStyleUseCase");
        Intrinsics.checkNotNullParameter(saveAutoStyleUseCase, "saveAutoStyleUseCase");
        Intrinsics.checkNotNullParameter(getRoomTypesUseCase, "getRoomTypesUseCase");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(messageManager, "messageManager");
        Intrinsics.checkNotNullParameter(statisticsEventAiDesigner, "statisticsEventAiDesigner");
        this.f223842a = statisticsEventAiDesigner;
        this.f223843b = languageManager;
        this.f223844c = getAutoStyleUseCase;
        this.f223845d = saveAutoStyleUseCase;
        this.f223846e = getRoomTypesUseCase;
        this.f223847f = events;
        this.f223848g = messageManager;
        this.f223849h = c.DesignGenerator;
        this.f223850i = a4.e.welcome_screen;
        c1<Pair<b, Long>> c1Var = new c1<>(null);
        this.f223851j = c1Var;
        this.f223852k = c1Var;
        c1<AutoStyle> c1Var2 = new c1<>(null);
        this.f223853l = c1Var2;
        this.f223854m = c1Var2;
        k0<d> k0VarA = b1.a(new d(null, 1, 0 == true ? 1 : 0));
        this.f223855n = k0VarA;
        this.f223856o = k0VarA;
        Boolean bool = Boolean.FALSE;
        k0<Boolean> k0VarA2 = b1.a(bool);
        this.f223857s = k0VarA2;
        k0<Boolean> k0VarA3 = b1.a(bool);
        this.f223858t = k0VarA3;
        this.f223859v = kotlinx.coroutines.flow.k.L0(k0VarA2, k0VarA3, new g(null));
        this.f223860w = new StatisticsEventAiDesigner.EventData(null, null, null, null, null, null, null, 127, null);
        k0VarA2.setValue(Boolean.TRUE);
        kotlinx.coroutines.k.f(g2.a(this), s.f229729a.b(), null, new a(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r0(int i10) {
        kotlinx.coroutines.k.f(g2.a(this), s.f229729a.h(), null, new h(i10, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w0(int i10) {
        j3.d.a(this.f223847f, j3.a.room_type_selected, j3.g.type, null, j3.f216996s2.a(i10), null, null, 52, null);
    }

    @Override // com.planner5d.library.model.manager.statistics.events.StatisticsEventAiDesigner
    public void F0(@NotNull StatisticsEventAiDesigner.a action, @Nullable StatisticsEventAiDesigner.d dVar, @Nullable StatisticsEventAiDesigner.g gVar, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable StatisticsEventAiDesigner.e eVar, @Nullable String str) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f223842a.F0(action, dVar, gVar, num, num2, num3, eVar, str);
    }

    @NotNull
    public final z0<d> getUiState() {
        return this.f223856o;
    }

    public final void h0(@NotNull StatisticsEventAiDesigner.a action) {
        Intrinsics.checkNotNullParameter(action, "action");
        i(action, this.f223860w);
    }

    @Override // com.planner5d.library.model.manager.statistics.events.StatisticsEventAiDesigner
    public void i(@NotNull StatisticsEventAiDesigner.a action, @NotNull StatisticsEventAiDesigner.EventData parameters) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.f223842a.i(action, parameters);
    }

    public final void i0() {
        this.f223851j.r(null);
    }

    @NotNull
    public final w0<AutoStyle> j0() {
        return this.f223854m;
    }

    @NotNull
    public final n1 k0() {
        return this.f223843b;
    }

    @NotNull
    public final kotlinx.coroutines.flow.i<Boolean> l0() {
        return this.f223859v;
    }

    @NotNull
    public final w0<Pair<b, Long>> m0() {
        return this.f223852k;
    }

    @NotNull
    public final StatisticsEventAiDesigner.EventData n0() {
        return this.f223860w;
    }

    public final void o0(long j10) {
        this.f223858t.setValue(Boolean.TRUE);
        kotlinx.coroutines.k.f(g2.a(this), s.f229729a.h(), null, new f(j10, null), 2, null);
    }

    public final void p0(long j10) {
        p2.f217307b.d(this.f223850i, a4.a.next, Long.valueOf(j10));
    }

    public final void q0() {
        p2.f217307b.e(a4.f.room_wizard_type, this.f223850i);
    }

    public final void s0() {
        this.f223849h = c.AiDesigner;
    }

    public final void t0(boolean z10) {
        this.f223849h = c.SmartWizard;
        this.f223850i = z10 ? a4.e.catalog : a4.e.welcome_screen;
    }

    public final void u0(@NotNull StatisticsEventAiDesigner.EventData eventData) {
        Intrinsics.checkNotNullParameter(eventData, "<set-?>");
        this.f223860w = eventData;
    }

    public final void v0() {
        int i10 = e.f223875a[this.f223849h.ordinal()];
        if (i10 == 1) {
            a4.b.e(p2.f217307b, this.f223850i, a4.a.back, null, 4, null);
        } else if (i10 == 2) {
            j3.d.a(this.f223847f, j3.a.button_click, null, j3.b.back, null, null, null, 58, null);
        } else {
            if (i10 != 3) {
                throw new kotlin.k0();
            }
            i(StatisticsEventAiDesigner.a.back, this.f223860w);
        }
    }

    public final void x0() {
        int i10 = 3 << 0;
        j3.d.a(this.f223847f, j3.a.screen_view, j3.g.type, null, null, null, null, 60, null);
    }
}
