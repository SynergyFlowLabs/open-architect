package com.planner5d.library.widget.editor.popup.itemproperties.pages.size;

import android.content.Context;
import android.util.Range;
import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.c1;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import androidx.lifecycle.y0;
import com.canhub.cropper.core.CropImageOptions;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemLayout;
import com.planner5d.library.model.item.ItemMaterial;
import com.planner5d.library.model.item.ItemRoom;
import com.planner5d.library.model.manager.k5;
import com.planner5d.library.services.utility.v1;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.z1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomSettingsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomSettingsViewModel.kt\ncom/planner5d/library/widget/editor/popup/itemproperties/pages/size/RoomSettingsViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,285:1\n1#2:286\n11165#3:287\n11500#3,3:288\n*S KotlinDebug\n*F\n+ 1 RoomSettingsViewModel.kt\ncom/planner5d/library/widget/editor/popup/itemproperties/pages/size/RoomSettingsViewModel\n*L\n241#1:287\n241#1:288,3\n*E\n"})
public final class q extends f2 implements ze.a.InterfaceC2545a {
    public static final int Y = 8;

    @Nullable
    private com.planner5d.library.widget.editor.editaction.p X;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final k5 f257630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.f2 f257631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.builtin.i f257632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.widget.editor.interactor.e f257633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.j f257634e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ze.a f257635f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f257636g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final c1<ze.c> f257637h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.w0<List<com.planner5d.library.model.v>> f257638i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f257639j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f257640k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.widget.editor.editaction.c0.a f257641l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f257642m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    private com.planner5d.library.services.l.c f257643n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    private com.planner5d.library.widget.editor.editaction.d0 f257644o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    private com.planner5d.library.widget.editor.editaction.e0 f257645s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    private com.planner5d.library.widget.editor.editaction.b0 f257646t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    private com.planner5d.library.widget.editor.editaction.h0 f257647v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    private com.planner5d.library.widget.editor.editaction.c0 f257648w;

    @w0(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f257649i = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final com.planner5d.library.model.v f257650a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final com.planner5d.library.model.metricunit.a f257651b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final BigDecimal f257652c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final Range<BigDecimal> f257653d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private final BigDecimal f257654e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f257655f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f257656g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        private final BigDecimal f257657h;

        public a(@NotNull com.planner5d.library.model.v roomTitle, @NotNull com.planner5d.library.model.metricunit.a metricUnit, @NotNull BigDecimal roomHeight, @NotNull Range<BigDecimal> wallThicknessRange, @NotNull BigDecimal wallThickness, int i10, boolean z10, @NotNull BigDecimal flooringHeight) {
            Intrinsics.checkNotNullParameter(roomTitle, "roomTitle");
            Intrinsics.checkNotNullParameter(metricUnit, "metricUnit");
            Intrinsics.checkNotNullParameter(roomHeight, "roomHeight");
            Intrinsics.checkNotNullParameter(wallThicknessRange, "wallThicknessRange");
            Intrinsics.checkNotNullParameter(wallThickness, "wallThickness");
            Intrinsics.checkNotNullParameter(flooringHeight, "flooringHeight");
            this.f257650a = roomTitle;
            this.f257651b = metricUnit;
            this.f257652c = roomHeight;
            this.f257653d = wallThicknessRange;
            this.f257654e = wallThickness;
            this.f257655f = i10;
            this.f257656g = z10;
            this.f257657h = flooringHeight;
        }

        @NotNull
        public final BigDecimal a() {
            return this.f257657h;
        }

        @NotNull
        public final com.planner5d.library.model.metricunit.a b() {
            return this.f257651b;
        }

        @NotNull
        public final BigDecimal c() {
            return this.f257652c;
        }

        @NotNull
        public final com.planner5d.library.model.v d() {
            return this.f257650a;
        }

        public final int e() {
            return this.f257655f;
        }

        public final boolean f() {
            return this.f257656g;
        }

        @NotNull
        public final BigDecimal g() {
            return this.f257654e;
        }

        @NotNull
        public final Range<BigDecimal> h() {
            return this.f257653d;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.popup.itemproperties.pages.size.RoomSettingsViewModel$catalogRoomTitles$1", f = "RoomSettingsViewModel.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.I0, 61}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<y0<List<? extends com.planner5d.library.model.v>>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f257658a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f257659b;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.popup.itemproperties.pages.size.RoomSettingsViewModel$catalogRoomTitles$1$1", f = "RoomSettingsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super List<com.planner5d.library.model.v>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f257661a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ q f257662b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(q qVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f257662b = qVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f257662b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f257661a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return this.f257662b.f257632c.E();
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super List<com.planner5d.library.model.v>> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = q.this.new b(dVar);
            bVar.f257659b = obj;
            return bVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x005b, code lost:
        
            if (r1.emit(r9, r8) == r0) goto L16;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r8.f257658a
                r2 = 0
                r3 = 1
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L26
                if (r1 == r4) goto L1e
                r7 = 1
                if (r1 != r3) goto L15
                kotlin.ResultKt.m(r9)
                goto L5f
            L15:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                r7 = 0
                throw r8
            L1e:
                java.lang.Object r1 = r8.f257659b
                androidx.lifecycle.y0 r1 = (androidx.lifecycle.y0) r1
                kotlin.ResultKt.m(r9)
                goto L4c
            L26:
                kotlin.ResultKt.m(r9)
                java.lang.Object r9 = r8.f257659b
                r1 = r9
                androidx.lifecycle.y0 r1 = (androidx.lifecycle.y0) r1
                com.planner5d.library.services.utility.s r9 = com.planner5d.library.services.utility.s.f229729a
                kotlinx.coroutines.z1 r9 = r9.h()
                r7 = 4
                com.planner5d.library.widget.editor.popup.itemproperties.pages.size.q$b$a r5 = new com.planner5d.library.widget.editor.popup.itemproperties.pages.size.q$b$a
                r7 = 6
                com.planner5d.library.widget.editor.popup.itemproperties.pages.size.q r6 = com.planner5d.library.widget.editor.popup.itemproperties.pages.size.q.this
                r7 = 6
                r5.<init>(r6, r2)
                r7 = 3
                r8.f257659b = r1
                r7 = 6
                r8.f257658a = r4
                java.lang.Object r9 = kotlinx.coroutines.i.h(r9, r5, r8)
                r7 = 1
                if (r9 != r0) goto L4c
                goto L5d
            L4c:
                r7 = 6
                java.lang.String r4 = "withContext(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r4)
                r8.f257659b = r2
                r8.f257658a = r3
                r7 = 0
                java.lang.Object r8 = r1.emit(r9, r8)
                if (r8 != r0) goto L5f
            L5d:
                r7 = 7
                return r0
            L5f:
                r7 = 3
                kotlin.Unit r8 = kotlin.Unit.f312394a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.widget.editor.popup.itemproperties.pages.size.q.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(y0<List<com.planner5d.library.model.v>> y0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(y0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.popup.itemproperties.pages.size.RoomSettingsViewModel", f = "RoomSettingsViewModel.kt", i = {}, l = {218}, m = "getFlooringHeight", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        double f257663a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f257664b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f257665c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f257667e;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f257665c = obj;
            this.f257667e |= Integer.MIN_VALUE;
            return q.this.s0(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.popup.itemproperties.pages.size.RoomSettingsViewModel", f = "RoomSettingsViewModel.kt", i = {}, l = {135}, m = "getRoomHeight", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        double f257668a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f257669b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f257670c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f257672e;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f257670c = obj;
            this.f257672e |= Integer.MIN_VALUE;
            return q.this.z0(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.popup.itemproperties.pages.size.RoomSettingsViewModel", f = "RoomSettingsViewModel.kt", i = {}, l = {okhttp3.internal.ws.g.f334652s}, m = "getSelectedRoomTitle", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f257673a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f257675c;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f257673a = obj;
            this.f257675c |= Integer.MIN_VALUE;
            return q.this.G0(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.popup.itemproperties.pages.size.RoomSettingsViewModel$getSelectedRoomTitle$2", f = "RoomSettingsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nRoomSettingsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomSettingsViewModel.kt\ncom/planner5d/library/widget/editor/popup/itemproperties/pages/size/RoomSettingsViewModel$getSelectedRoomTitle$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,285:1\n1#2:286\n*E\n"})
    static final class f extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super com.planner5d.library.model.v>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f257676a;

        f(kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return q.this.new f(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object next;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f257676a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            List<com.planner5d.library.model.v> listE = q.this.f257632c.E();
            Intrinsics.checkNotNullExpressionValue(listE, "getCatalogRoomTitles(...)");
            q qVar = q.this;
            Iterator<T> it = listE.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                com.planner5d.library.model.v vVar = (com.planner5d.library.model.v) next;
                ItemRoom itemRoomU0 = qVar.u0();
                if (itemRoomU0 != null && vVar.a() == itemRoomU0.getType()) {
                    break;
                }
            }
            com.planner5d.library.model.v vVar2 = (com.planner5d.library.model.v) next;
            return vVar2 == null ? q.this.f257632c.E().get(0) : vVar2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super com.planner5d.library.model.v> dVar) {
            return ((f) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.popup.itemproperties.pages.size.RoomSettingsViewModel", f = "RoomSettingsViewModel.kt", i = {}, l = {161}, m = "getWallThickness", n = {}, s = {})
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        double f257678a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f257679b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f257680c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f257682e;

        g(kotlin.coroutines.d<? super g> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f257680c = obj;
            this.f257682e |= Integer.MIN_VALUE;
            return q.this.J0(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.popup.itemproperties.pages.size.RoomSettingsViewModel", f = "RoomSettingsViewModel.kt", i = {0}, l = {165, 165}, m = "getWallThicknessRange", n = {"this"}, s = {"L$0"})
    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f257683a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f257684b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f257686d;

        h(kotlin.coroutines.d<? super h> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f257684b = obj;
            this.f257686d |= Integer.MIN_VALUE;
            return q.this.K0(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.popup.itemproperties.pages.size.RoomSettingsViewModel$selectedItemData$1", f = "RoomSettingsViewModel.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160708m0, com.planner5d.library.engine.input.f.b.f160708m0, com.planner5d.library.engine.input.f.b.f160708m0, com.planner5d.library.engine.input.f.b.f160708m0, com.planner5d.library.engine.input.f.b.f160708m0, 70}, m = "invokeSuspend", n = {}, s = {})
    static final class i extends kotlin.coroutines.jvm.internal.o implements Function2<ze.b, kotlin.coroutines.d<? super a>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f257687a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f257688b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f257689c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f257690d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f257691e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f257692f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f257693g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f257694h;

        i(kotlin.coroutines.d<? super i> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return q.this.new i(dVar);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x00ba A[PHI: r2 r3
          0x00ba: PHI (r2v6 com.planner5d.library.model.v) = (r2v4 com.planner5d.library.model.v), (r2v8 com.planner5d.library.model.v) binds: [B:16:0x00b6, B:10:0x0085] A[DONT_GENERATE, DONT_INLINE]
          0x00ba: PHI (r3v4 java.lang.Object) = (r3v3 java.lang.Object), (r3v6 java.lang.Object) binds: [B:16:0x00b6, B:10:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:21:0x00ce A[PHI: r2 r3 r4
          0x00ce: PHI (r2v9 com.planner5d.library.model.v) = (r2v6 com.planner5d.library.model.v), (r2v14 com.planner5d.library.model.v) binds: [B:19:0x00cb, B:9:0x0071] A[DONT_GENERATE, DONT_INLINE]
          0x00ce: PHI (r3v7 com.planner5d.library.model.metricunit.a) = (r3v5 com.planner5d.library.model.metricunit.a), (r3v11 com.planner5d.library.model.metricunit.a) binds: [B:19:0x00cb, B:9:0x0071] A[DONT_GENERATE, DONT_INLINE]
          0x00ce: PHI (r4v3 java.lang.Object) = (r4v2 java.lang.Object), (r4v7 java.lang.Object) binds: [B:19:0x00cb, B:9:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:24:0x00e6  */
        /* JADX WARN: Code duplicated, block: B:28:0x0101  */
        /* JADX WARN: Code duplicated, block: B:32:0x0131  */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG0;
            com.planner5d.library.model.v vVar;
            Object objW0;
            com.planner5d.library.model.metricunit.a aVar;
            Object objZ0;
            BigDecimal bigDecimal;
            Object objK0;
            com.planner5d.library.model.v vVar2;
            BigDecimal bigDecimal2;
            Range range;
            Object objJ0;
            BigDecimal bigDecimal3;
            Range range2;
            BigDecimal bigDecimal4;
            int iB0;
            boolean zM0;
            Object objS0;
            Range range3;
            com.planner5d.library.model.v vVar3;
            BigDecimal bigDecimal5;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            switch (this.f257694h) {
                case 0:
                    ResultKt.m(obj);
                    q qVar = q.this;
                    this.f257694h = 1;
                    objG0 = qVar.G0(this);
                    if (objG0 != objL) {
                        vVar = (com.planner5d.library.model.v) objG0;
                        q qVar2 = q.this;
                        this.f257687a = vVar;
                        this.f257694h = 2;
                        objW0 = qVar2.w0(this);
                        if (objW0 != objL) {
                            aVar = (com.planner5d.library.model.metricunit.a) objW0;
                            q qVar3 = q.this;
                            this.f257687a = vVar;
                            this.f257688b = aVar;
                            this.f257694h = 3;
                            objZ0 = qVar3.z0(this);
                            if (objZ0 != objL) {
                                bigDecimal = (BigDecimal) objZ0;
                                q qVar4 = q.this;
                                this.f257687a = vVar;
                                this.f257688b = aVar;
                                this.f257689c = bigDecimal;
                                this.f257694h = 4;
                                objK0 = qVar4.K0(this);
                                if (objK0 != objL) {
                                    vVar2 = vVar;
                                    bigDecimal2 = bigDecimal;
                                    range = (Range) objK0;
                                    q qVar5 = q.this;
                                    this.f257687a = vVar2;
                                    this.f257688b = aVar;
                                    this.f257689c = bigDecimal2;
                                    this.f257690d = range;
                                    this.f257694h = 5;
                                    objJ0 = qVar5.J0(this);
                                    if (objJ0 != objL) {
                                        bigDecimal3 = bigDecimal2;
                                        range2 = range;
                                        bigDecimal4 = (BigDecimal) objJ0;
                                        iB0 = q.this.B0();
                                        zM0 = q.this.M0();
                                        q qVar6 = q.this;
                                        this.f257687a = vVar2;
                                        this.f257688b = aVar;
                                        this.f257689c = bigDecimal3;
                                        this.f257690d = range2;
                                        this.f257691e = bigDecimal4;
                                        this.f257692f = iB0;
                                        this.f257693g = zM0;
                                        this.f257694h = 6;
                                        objS0 = qVar6.s0(this);
                                        if (objS0 != objL) {
                                            BigDecimal bigDecimal6 = bigDecimal3;
                                            range3 = range2;
                                            vVar3 = vVar2;
                                            bigDecimal5 = bigDecimal6;
                                            return new a(vVar3, aVar, bigDecimal5, range3, bigDecimal4, iB0, zM0, (BigDecimal) objS0);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return objL;
                case 1:
                    ResultKt.m(obj);
                    objG0 = obj;
                    vVar = (com.planner5d.library.model.v) objG0;
                    q qVar7 = q.this;
                    this.f257687a = vVar;
                    this.f257694h = 2;
                    objW0 = qVar7.w0(this);
                    if (objW0 != objL) {
                        aVar = (com.planner5d.library.model.metricunit.a) objW0;
                        q qVar8 = q.this;
                        this.f257687a = vVar;
                        this.f257688b = aVar;
                        this.f257694h = 3;
                        objZ0 = qVar8.z0(this);
                        if (objZ0 != objL) {
                            bigDecimal = (BigDecimal) objZ0;
                            q qVar9 = q.this;
                            this.f257687a = vVar;
                            this.f257688b = aVar;
                            this.f257689c = bigDecimal;
                            this.f257694h = 4;
                            objK0 = qVar9.K0(this);
                            if (objK0 != objL) {
                                vVar2 = vVar;
                                bigDecimal2 = bigDecimal;
                                range = (Range) objK0;
                                q qVar10 = q.this;
                                this.f257687a = vVar2;
                                this.f257688b = aVar;
                                this.f257689c = bigDecimal2;
                                this.f257690d = range;
                                this.f257694h = 5;
                                objJ0 = qVar10.J0(this);
                                if (objJ0 != objL) {
                                    bigDecimal3 = bigDecimal2;
                                    range2 = range;
                                    bigDecimal4 = (BigDecimal) objJ0;
                                    iB0 = q.this.B0();
                                    zM0 = q.this.M0();
                                    q qVar11 = q.this;
                                    this.f257687a = vVar2;
                                    this.f257688b = aVar;
                                    this.f257689c = bigDecimal3;
                                    this.f257690d = range2;
                                    this.f257691e = bigDecimal4;
                                    this.f257692f = iB0;
                                    this.f257693g = zM0;
                                    this.f257694h = 6;
                                    objS0 = qVar11.s0(this);
                                    if (objS0 != objL) {
                                        BigDecimal bigDecimal7 = bigDecimal3;
                                        range3 = range2;
                                        vVar3 = vVar2;
                                        bigDecimal5 = bigDecimal7;
                                        return new a(vVar3, aVar, bigDecimal5, range3, bigDecimal4, iB0, zM0, (BigDecimal) objS0);
                                    }
                                }
                            }
                        }
                    }
                    return objL;
                case 2:
                    vVar = (com.planner5d.library.model.v) this.f257687a;
                    ResultKt.m(obj);
                    objW0 = obj;
                    aVar = (com.planner5d.library.model.metricunit.a) objW0;
                    q qVar12 = q.this;
                    this.f257687a = vVar;
                    this.f257688b = aVar;
                    this.f257694h = 3;
                    objZ0 = qVar12.z0(this);
                    if (objZ0 != objL) {
                        bigDecimal = (BigDecimal) objZ0;
                        q qVar13 = q.this;
                        this.f257687a = vVar;
                        this.f257688b = aVar;
                        this.f257689c = bigDecimal;
                        this.f257694h = 4;
                        objK0 = qVar13.K0(this);
                        if (objK0 != objL) {
                            vVar2 = vVar;
                            bigDecimal2 = bigDecimal;
                            range = (Range) objK0;
                            q qVar14 = q.this;
                            this.f257687a = vVar2;
                            this.f257688b = aVar;
                            this.f257689c = bigDecimal2;
                            this.f257690d = range;
                            this.f257694h = 5;
                            objJ0 = qVar14.J0(this);
                            if (objJ0 != objL) {
                                bigDecimal3 = bigDecimal2;
                                range2 = range;
                                bigDecimal4 = (BigDecimal) objJ0;
                                iB0 = q.this.B0();
                                zM0 = q.this.M0();
                                q qVar15 = q.this;
                                this.f257687a = vVar2;
                                this.f257688b = aVar;
                                this.f257689c = bigDecimal3;
                                this.f257690d = range2;
                                this.f257691e = bigDecimal4;
                                this.f257692f = iB0;
                                this.f257693g = zM0;
                                this.f257694h = 6;
                                objS0 = qVar15.s0(this);
                                if (objS0 != objL) {
                                    BigDecimal bigDecimal8 = bigDecimal3;
                                    range3 = range2;
                                    vVar3 = vVar2;
                                    bigDecimal5 = bigDecimal8;
                                    return new a(vVar3, aVar, bigDecimal5, range3, bigDecimal4, iB0, zM0, (BigDecimal) objS0);
                                }
                            }
                        }
                    }
                    return objL;
                case 3:
                    com.planner5d.library.model.metricunit.a aVar2 = (com.planner5d.library.model.metricunit.a) this.f257688b;
                    com.planner5d.library.model.v vVar4 = (com.planner5d.library.model.v) this.f257687a;
                    ResultKt.m(obj);
                    aVar = aVar2;
                    vVar = vVar4;
                    objZ0 = obj;
                    bigDecimal = (BigDecimal) objZ0;
                    q qVar16 = q.this;
                    this.f257687a = vVar;
                    this.f257688b = aVar;
                    this.f257689c = bigDecimal;
                    this.f257694h = 4;
                    objK0 = qVar16.K0(this);
                    if (objK0 != objL) {
                        vVar2 = vVar;
                        bigDecimal2 = bigDecimal;
                        range = (Range) objK0;
                        q qVar17 = q.this;
                        this.f257687a = vVar2;
                        this.f257688b = aVar;
                        this.f257689c = bigDecimal2;
                        this.f257690d = range;
                        this.f257694h = 5;
                        objJ0 = qVar17.J0(this);
                        if (objJ0 != objL) {
                            bigDecimal3 = bigDecimal2;
                            range2 = range;
                            bigDecimal4 = (BigDecimal) objJ0;
                            iB0 = q.this.B0();
                            zM0 = q.this.M0();
                            q qVar18 = q.this;
                            this.f257687a = vVar2;
                            this.f257688b = aVar;
                            this.f257689c = bigDecimal3;
                            this.f257690d = range2;
                            this.f257691e = bigDecimal4;
                            this.f257692f = iB0;
                            this.f257693g = zM0;
                            this.f257694h = 6;
                            objS0 = qVar18.s0(this);
                            if (objS0 != objL) {
                                BigDecimal bigDecimal9 = bigDecimal3;
                                range3 = range2;
                                vVar3 = vVar2;
                                bigDecimal5 = bigDecimal9;
                                return new a(vVar3, aVar, bigDecimal5, range3, bigDecimal4, iB0, zM0, (BigDecimal) objS0);
                            }
                        }
                    }
                    return objL;
                case 4:
                    bigDecimal2 = (BigDecimal) this.f257689c;
                    aVar = (com.planner5d.library.model.metricunit.a) this.f257688b;
                    vVar2 = (com.planner5d.library.model.v) this.f257687a;
                    ResultKt.m(obj);
                    objK0 = obj;
                    range = (Range) objK0;
                    q qVar19 = q.this;
                    this.f257687a = vVar2;
                    this.f257688b = aVar;
                    this.f257689c = bigDecimal2;
                    this.f257690d = range;
                    this.f257694h = 5;
                    objJ0 = qVar19.J0(this);
                    if (objJ0 != objL) {
                        bigDecimal3 = bigDecimal2;
                        range2 = range;
                        bigDecimal4 = (BigDecimal) objJ0;
                        iB0 = q.this.B0();
                        zM0 = q.this.M0();
                        q qVar110 = q.this;
                        this.f257687a = vVar2;
                        this.f257688b = aVar;
                        this.f257689c = bigDecimal3;
                        this.f257690d = range2;
                        this.f257691e = bigDecimal4;
                        this.f257692f = iB0;
                        this.f257693g = zM0;
                        this.f257694h = 6;
                        objS0 = qVar110.s0(this);
                        if (objS0 != objL) {
                            BigDecimal bigDecimal10 = bigDecimal3;
                            range3 = range2;
                            vVar3 = vVar2;
                            bigDecimal5 = bigDecimal10;
                            return new a(vVar3, aVar, bigDecimal5, range3, bigDecimal4, iB0, zM0, (BigDecimal) objS0);
                        }
                    }
                    return objL;
                case 5:
                    range2 = (Range) this.f257690d;
                    BigDecimal bigDecimal11 = (BigDecimal) this.f257689c;
                    com.planner5d.library.model.metricunit.a aVar3 = (com.planner5d.library.model.metricunit.a) this.f257688b;
                    com.planner5d.library.model.v vVar5 = (com.planner5d.library.model.v) this.f257687a;
                    ResultKt.m(obj);
                    bigDecimal3 = bigDecimal11;
                    aVar = aVar3;
                    vVar2 = vVar5;
                    objJ0 = obj;
                    bigDecimal4 = (BigDecimal) objJ0;
                    iB0 = q.this.B0();
                    zM0 = q.this.M0();
                    q qVar111 = q.this;
                    this.f257687a = vVar2;
                    this.f257688b = aVar;
                    this.f257689c = bigDecimal3;
                    this.f257690d = range2;
                    this.f257691e = bigDecimal4;
                    this.f257692f = iB0;
                    this.f257693g = zM0;
                    this.f257694h = 6;
                    objS0 = qVar111.s0(this);
                    if (objS0 != objL) {
                        BigDecimal bigDecimal12 = bigDecimal3;
                        range3 = range2;
                        vVar3 = vVar2;
                        bigDecimal5 = bigDecimal12;
                        return new a(vVar3, aVar, bigDecimal5, range3, bigDecimal4, iB0, zM0, (BigDecimal) objS0);
                    }
                    return objL;
                case 6:
                    boolean z10 = this.f257693g;
                    int i10 = this.f257692f;
                    BigDecimal bigDecimal13 = (BigDecimal) this.f257691e;
                    Range range4 = (Range) this.f257690d;
                    BigDecimal bigDecimal14 = (BigDecimal) this.f257689c;
                    com.planner5d.library.model.metricunit.a aVar4 = (com.planner5d.library.model.metricunit.a) this.f257688b;
                    com.planner5d.library.model.v vVar6 = (com.planner5d.library.model.v) this.f257687a;
                    ResultKt.m(obj);
                    bigDecimal4 = bigDecimal13;
                    aVar = aVar4;
                    range3 = range4;
                    bigDecimal5 = bigDecimal14;
                    zM0 = z10;
                    iB0 = i10;
                    vVar3 = vVar6;
                    objS0 = obj;
                    return new a(vVar3, aVar, bigDecimal5, range3, bigDecimal4, iB0, zM0, (BigDecimal) objS0);
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ze.b bVar, kotlin.coroutines.d<? super a> dVar) {
            return ((i) create(bVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.popup.itemproperties.pages.size.RoomSettingsViewModel$setFlooringHeight$1", f = "RoomSettingsViewModel.kt", i = {0}, l = {231}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    static final class j extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f257696a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f257697b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f257698c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f257699d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        double f257700e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f257701f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private /* synthetic */ Object f257702g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ BigDecimal f257704i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(BigDecimal bigDecimal, kotlin.coroutines.d<? super j> dVar) {
            super(2, dVar);
            this.f257704i = bigDecimal;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            j jVar = q.this.new j(this.f257704i, dVar);
            jVar.f257702g = obj;
            return jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            q qVar;
            com.planner5d.library.model.manager.f2 f2Var;
            String str;
            q qVar2;
            double d10;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f257701f;
            if (i10 == 0) {
                ResultKt.m(obj);
                s0 s0Var = (s0) this.f257702g;
                ItemRoom itemRoomU0 = q.this.u0();
                if (itemRoomU0 != null) {
                    q qVar3 = q.this;
                    BigDecimal bigDecimal = this.f257704i;
                    if (qVar3.X == null) {
                        qVar3.X = new com.planner5d.library.widget.editor.editaction.p(itemRoomU0.getUid(), itemRoomU0.getFlooringHeight());
                    }
                    String uid = itemRoomU0.getUid();
                    com.planner5d.library.model.manager.f2 f2Var2 = qVar3.f257631b;
                    double dDoubleValue = bigDecimal.doubleValue();
                    this.f257702g = s0Var;
                    this.f257696a = qVar3;
                    this.f257697b = f2Var2;
                    this.f257698c = uid;
                    this.f257699d = qVar3;
                    this.f257700e = dDoubleValue;
                    this.f257701f = 1;
                    obj = qVar3.w0(this);
                    if (obj == objL) {
                        return objL;
                    }
                    qVar = qVar3;
                    f2Var = f2Var2;
                    str = uid;
                    qVar2 = qVar;
                    d10 = dDoubleValue;
                } else {
                    timber.log.b.f381052a.d("Can't save flooring height because item is null", new Object[0]);
                }
                return Unit.f312394a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d10 = this.f257700e;
            qVar = (q) this.f257699d;
            str = (String) this.f257698c;
            f2Var = (com.planner5d.library.model.manager.f2) this.f257697b;
            qVar2 = (q) this.f257696a;
            ResultKt.m(obj);
            qVar.N0(new com.planner5d.library.widget.editor.editaction.p(str, f2Var.w(d10, (com.planner5d.library.model.metricunit.a) obj)), qVar2.X);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((j) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.popup.itemproperties.pages.size.RoomSettingsViewModel$setRoomHeight$1", f = "RoomSettingsViewModel.kt", i = {0, 0}, l = {146}, m = "invokeSuspend", n = {"$this$launch", "item"}, s = {"L$0", "L$2"})
    static final class k extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f257705a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f257706b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f257707c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        double f257708d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f257709e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f257710f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ BigDecimal f257712h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(BigDecimal bigDecimal, kotlin.coroutines.d<? super k> dVar) {
            super(2, dVar);
            this.f257712h = bigDecimal;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            k kVar = q.this.new k(this.f257712h, dVar);
            kVar.f257710f = obj;
            return kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ItemRoom itemRoomU0;
            q qVar;
            com.planner5d.library.model.manager.f2 f2Var;
            double d10;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f257709e;
            if (i10 == 0) {
                ResultKt.m(obj);
                s0 s0Var = (s0) this.f257710f;
                itemRoomU0 = q.this.u0();
                if (itemRoomU0 != null) {
                    qVar = q.this;
                    BigDecimal bigDecimal = this.f257712h;
                    if (qVar.f257646t == null) {
                        qVar.f257646t = new com.planner5d.library.widget.editor.editaction.b0(itemRoomU0.getUid(), itemRoomU0.height);
                    }
                    com.planner5d.library.model.manager.f2 f2Var2 = qVar.f257631b;
                    double dDoubleValue = bigDecimal.doubleValue();
                    this.f257710f = s0Var;
                    this.f257705a = qVar;
                    this.f257706b = itemRoomU0;
                    this.f257707c = f2Var2;
                    this.f257708d = dDoubleValue;
                    this.f257709e = 1;
                    obj = qVar.w0(this);
                    if (obj == objL) {
                        return objL;
                    }
                    f2Var = f2Var2;
                    d10 = dDoubleValue;
                } else {
                    timber.log.b.f381052a.d("Can't save room height because item is null", new Object[0]);
                }
                return Unit.f312394a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d10 = this.f257708d;
            f2Var = (com.planner5d.library.model.manager.f2) this.f257707c;
            itemRoomU0 = (ItemRoom) this.f257706b;
            qVar = (q) this.f257705a;
            ResultKt.m(obj);
            qVar.N0(new com.planner5d.library.widget.editor.editaction.b0(itemRoomU0.getUid(), f2Var.w(d10, (com.planner5d.library.model.metricunit.a) obj)), qVar.f257646t);
            if (qVar.t0() != null) {
                qVar.t0().r(itemRoomU0.getFlooringHeightRange());
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((k) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.popup.itemproperties.pages.size.RoomSettingsViewModel$setWallThickness$1", f = "RoomSettingsViewModel.kt", i = {0}, l = {177}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    static final class l extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f257713a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f257714b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f257715c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f257716d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        double f257717e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f257718f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private /* synthetic */ Object f257719g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ BigDecimal f257721i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(BigDecimal bigDecimal, kotlin.coroutines.d<? super l> dVar) {
            super(2, dVar);
            this.f257721i = bigDecimal;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            l lVar = q.this.new l(this.f257721i, dVar);
            lVar.f257719g = obj;
            return lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ItemRoom itemRoomU0;
            q qVar;
            com.planner5d.library.model.manager.f2 f2Var;
            q qVar2;
            double d10;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f257718f;
            if (i10 == 0) {
                ResultKt.m(obj);
                s0 s0Var = (s0) this.f257719g;
                itemRoomU0 = q.this.u0();
                if (itemRoomU0 != null) {
                    q qVar3 = q.this;
                    BigDecimal bigDecimal = this.f257721i;
                    if (qVar3.f257647v == null) {
                        qVar3.f257647v = new com.planner5d.library.widget.editor.editaction.h0(itemRoomU0, null);
                    }
                    com.planner5d.library.model.manager.f2 f2Var2 = qVar3.f257631b;
                    double dDoubleValue = bigDecimal.doubleValue();
                    this.f257719g = s0Var;
                    this.f257713a = qVar3;
                    this.f257714b = f2Var2;
                    this.f257715c = itemRoomU0;
                    this.f257716d = qVar3;
                    this.f257717e = dDoubleValue;
                    this.f257718f = 1;
                    obj = qVar3.w0(this);
                    if (obj == objL) {
                        return objL;
                    }
                    qVar = qVar3;
                    f2Var = f2Var2;
                    qVar2 = qVar;
                    d10 = dDoubleValue;
                } else {
                    timber.log.b.f381052a.d("Can't save room wall thickness because item is null", new Object[0]);
                }
                return Unit.f312394a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d10 = this.f257717e;
            qVar = (q) this.f257716d;
            itemRoomU0 = (ItemRoom) this.f257715c;
            f2Var = (com.planner5d.library.model.manager.f2) this.f257714b;
            qVar2 = (q) this.f257713a;
            ResultKt.m(obj);
            qVar.N0(new com.planner5d.library.widget.editor.editaction.h0(itemRoomU0, f2Var.x(d10, (com.planner5d.library.model.metricunit.a) obj)), qVar2.f257647v);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((l) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.popup.itemproperties.pages.size.RoomSettingsViewModel", f = "RoomSettingsViewModel.kt", i = {}, l = {168}, m = "widthFromCm", n = {}, s = {})
    static final class m extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f257722a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        double f257723b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f257724c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f257726e;

        m(kotlin.coroutines.d<? super m> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f257724c = obj;
            this.f257726e |= Integer.MIN_VALUE;
            boolean z10 = false & false;
            return q.this.d1(0, this);
        }
    }

    @ij.a
    public q(@NotNull k5 textureManager, @NotNull com.planner5d.library.model.manager.f2 metricUnitManager, @NotNull com.planner5d.library.model.manager.builtin.i builtInDataManager, @NotNull com.planner5d.library.widget.editor.interactor.e toggleMaterialUseCase, @NotNull com.planner5d.library.model.manager.config.j featureConfigManager) {
        Intrinsics.checkNotNullParameter(textureManager, "textureManager");
        Intrinsics.checkNotNullParameter(metricUnitManager, "metricUnitManager");
        Intrinsics.checkNotNullParameter(builtInDataManager, "builtInDataManager");
        Intrinsics.checkNotNullParameter(toggleMaterialUseCase, "toggleMaterialUseCase");
        Intrinsics.checkNotNullParameter(featureConfigManager, "featureConfigManager");
        this.f257630a = textureManager;
        this.f257631b = metricUnitManager;
        this.f257632c = builtInDataManager;
        this.f257633d = toggleMaterialUseCase;
        this.f257634e = featureConfigManager;
        this.f257636g = kotlin.g0.c(new Function0() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.size.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q.S0(this.f257627a);
            }
        });
        this.f257637h = new c1<>();
        this.f257638i = androidx.lifecycle.o.h(null, 0L, new b(null), 3, null);
        this.f257639j = kotlin.g0.c(new Function0() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.size.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q.R0(this.f257628a);
            }
        });
        this.f257640k = kotlin.g0.c(new Function0() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.size.p
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q.q0(this.f257629a);
            }
        });
        this.f257641l = new com.planner5d.library.widget.editor.editaction.c0.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int B0() {
        ItemRoom itemRoomU0 = u0();
        return ItemLayout.toRotationAngleForUser(itemRoomU0 != null ? itemRoomU0.getRotation() : 0.0f);
    }

    private final androidx.lifecycle.w0<ze.b> C0() {
        return (androidx.lifecycle.w0) this.f257639j.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object G0(kotlin.coroutines.d<? super com.planner5d.library.model.v> dVar) {
        e eVar;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i10 = eVar.f257675c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f257675c = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(dVar);
            }
        } else {
            eVar = new e(dVar);
        }
        Object objH = eVar.f257673a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = eVar.f257675c;
        if (i11 == 0) {
            ResultKt.m(objH);
            z1 z1VarH = com.planner5d.library.services.utility.s.f229729a.h();
            f fVar = new f(null);
            eVar.f257675c = 1;
            objH = kotlinx.coroutines.i.h(z1VarH, fVar, eVar);
            if (objH == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objH);
        }
        Intrinsics.checkNotNullExpressionValue(objH, "withContext(...)");
        return objH;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object J0(kotlin.coroutines.d<? super BigDecimal> dVar) {
        g gVar;
        com.planner5d.library.model.manager.f2 f2Var;
        double d10;
        if (dVar instanceof g) {
            gVar = (g) dVar;
            int i10 = gVar.f257682e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f257682e = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(dVar);
            }
        } else {
            gVar = new g(dVar);
        }
        Object objW0 = gVar.f257680c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = gVar.f257682e;
        if (i11 == 0) {
            ResultKt.m(objW0);
            ItemRoom itemRoomU0 = u0();
            if (itemRoomU0 != null) {
                float wallsThickness = itemRoomU0.getWallsThickness();
                com.planner5d.library.model.manager.f2 f2Var2 = this.f257631b;
                double d11 = wallsThickness;
                gVar.f257679b = f2Var2;
                gVar.f257678a = d11;
                gVar.f257682e = 1;
                objW0 = w0(gVar);
                if (objW0 == objL) {
                    return objL;
                }
                f2Var = f2Var2;
                d10 = d11;
            }
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            return ZERO;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        d10 = gVar.f257678a;
        f2Var = (com.planner5d.library.model.manager.f2) gVar.f257679b;
        ResultKt.m(objW0);
        BigDecimal bigDecimalD = f2Var.d(d10, (com.planner5d.library.model.metricunit.a) objW0);
        if (bigDecimalD != null) {
            return bigDecimalD;
        }
        BigDecimal ZERO2 = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO2, "ZERO");
        return ZERO2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object K0(kotlin.coroutines.d<? super Range<BigDecimal>> dVar) {
        h hVar;
        Comparable comparable;
        if (dVar instanceof h) {
            hVar = (h) dVar;
            int i10 = hVar.f257686d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hVar.f257686d = i10 - Integer.MIN_VALUE;
            } else {
                hVar = new h(dVar);
            }
        } else {
            hVar = new h(dVar);
        }
        Object objD1 = hVar.f257684b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = hVar.f257686d;
        if (i11 == 0) {
            ResultKt.m(objD1);
            hVar.f257683a = this;
            hVar.f257686d = 1;
            objD1 = d1(5, hVar);
            if (objD1 != objL) {
            }
            return objL;
        }
        if (i11 == 1) {
            this = (q) hVar.f257683a;
            ResultKt.m(objD1);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            comparable = (Comparable) hVar.f257683a;
            ResultKt.m(objD1);
        }
        Range rangeCreate = Range.create(comparable, (Comparable) objD1);
        Intrinsics.checkNotNullExpressionValue(rangeCreate, "create(...)");
        return rangeCreate;
        Comparable comparable2 = (Comparable) objD1;
        hVar.f257683a = comparable2;
        hVar.f257686d = 2;
        Object objD2 = this.d1(1000, hVar);
        if (objD2 != objL) {
            objD1 = objD2;
            comparable = comparable2;
            Range rangeCreate2 = Range.create(comparable, (Comparable) objD1);
            Intrinsics.checkNotNullExpressionValue(rangeCreate2, "create(...)");
            return rangeCreate2;
        }
        return objL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean M0() {
        ze.b bVarF = C0().f();
        return (bVarF == null || bVarF.g() || !this.f257634e.a(com.planner5d.library.model.manager.config.f.RoomRotation)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N0(com.planner5d.library.widget.editor.editaction.e eVar, com.planner5d.library.widget.editor.editaction.e eVar2) {
        v1.a<com.planner5d.library.services.l.c> aVar = com.planner5d.library.services.l.f224378d;
        com.planner5d.library.services.l.c cVar = new com.planner5d.library.services.l.c(eVar, eVar2, this.f257643n);
        this.f257643n = cVar;
        aVar.o(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.lifecycle.w0 R0(q qVar) {
        return qVar.d().a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c1 S0(q qVar) {
        return qVar.d().b();
    }

    public static /* synthetic */ void X0(q qVar, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        qVar.W0(i10, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public final Object d1(int i10, kotlin.coroutines.d<? super BigDecimal> dVar) {
        m mVar;
        com.planner5d.library.model.manager.f2 f2Var;
        double d10;
        if (dVar instanceof m) {
            mVar = (m) dVar;
            int i11 = mVar.f257726e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                mVar.f257726e = i11 - Integer.MIN_VALUE;
            } else {
                mVar = new m(dVar);
            }
        } else {
            mVar = new m(dVar);
        }
        Object obj = mVar.f257724c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i12 = mVar.f257726e;
        if (i12 == 0) {
            ResultKt.m(obj);
            com.planner5d.library.model.manager.f2 f2Var2 = this.f257631b;
            double d11 = i10;
            mVar.f257722a = f2Var2;
            mVar.f257723b = d11;
            mVar.f257726e = 1;
            Object objW0 = w0(mVar);
            if (objW0 == objL) {
                return objL;
            }
            f2Var = f2Var2;
            obj = objW0;
            d10 = d11;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d10 = mVar.f257723b;
            f2Var = (com.planner5d.library.model.manager.f2) mVar.f257722a;
            ResultKt.m(obj);
        }
        return f2Var.d(d10, (com.planner5d.library.model.metricunit.a) obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c1 q0(q qVar) {
        ItemRoom itemRoomU0 = qVar.u0();
        return new c1(itemRoomU0 != null ? itemRoomU0.getFlooringHeightRange() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object s0(kotlin.coroutines.d<? super BigDecimal> dVar) {
        c cVar;
        com.planner5d.library.model.manager.f2 f2Var;
        double d10;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i10 = cVar.f257667e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f257667e = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object objW0 = cVar.f257665c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = cVar.f257667e;
        if (i11 == 0) {
            ResultKt.m(objW0);
            ItemRoom itemRoomU0 = u0();
            if (itemRoomU0 != null) {
                com.planner5d.library.model.manager.f2 f2Var2 = this.f257631b;
                double flooringHeight = itemRoomU0.getFlooringHeight();
                cVar.f257664b = f2Var2;
                cVar.f257663a = flooringHeight;
                cVar.f257667e = 1;
                objW0 = w0(cVar);
                if (objW0 == objL) {
                    return objL;
                }
                f2Var = f2Var2;
                d10 = flooringHeight;
            }
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            return ZERO;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        d10 = cVar.f257663a;
        f2Var = (com.planner5d.library.model.manager.f2) cVar.f257664b;
        ResultKt.m(objW0);
        BigDecimal bigDecimalD = f2Var.d(d10, (com.planner5d.library.model.metricunit.a) objW0);
        if (bigDecimalD != null) {
            return bigDecimalD;
        }
        BigDecimal ZERO2 = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO2, "ZERO");
        return ZERO2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object w0(kotlin.coroutines.d<? super com.planner5d.library.model.metricunit.a> dVar) {
        return this.f257631b.k(dVar);
    }

    private final Project y0() {
        ze.b bVarF = C0().f();
        if (bVarF != null) {
            return bVarF.j();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object z0(kotlin.coroutines.d<? super BigDecimal> dVar) {
        d dVar2;
        com.planner5d.library.model.manager.f2 f2Var;
        double d10;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i10 = dVar2.f257672e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar2.f257672e = i10 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        Object objW0 = dVar2.f257670c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = dVar2.f257672e;
        if (i11 == 0) {
            ResultKt.m(objW0);
            ItemRoom itemRoomU0 = u0();
            if (itemRoomU0 != null) {
                float f10 = itemRoomU0.height;
                com.planner5d.library.model.manager.f2 f2Var2 = this.f257631b;
                double d11 = f10;
                dVar2.f257669b = f2Var2;
                dVar2.f257668a = d11;
                dVar2.f257672e = 1;
                objW0 = w0(dVar2);
                if (objW0 == objL) {
                    return objL;
                }
                f2Var = f2Var2;
                d10 = d11;
            }
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            return ZERO;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        d10 = dVar2.f257668a;
        f2Var = (com.planner5d.library.model.manager.f2) dVar2.f257669b;
        ResultKt.m(objW0);
        BigDecimal bigDecimalD = f2Var.d(d10, (com.planner5d.library.model.metricunit.a) objW0);
        if (bigDecimalD != null) {
            return bigDecimalD;
        }
        BigDecimal ZERO2 = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO2, "ZERO");
        return ZERO2;
    }

    @NotNull
    public final Range<BigDecimal> A0() {
        Range<BigDecimal> HEIGHT_RANGE = ItemRoom.HEIGHT_RANGE;
        Intrinsics.checkNotNullExpressionValue(HEIGHT_RANGE, "HEIGHT_RANGE");
        return HEIGHT_RANGE;
    }

    @NotNull
    public final androidx.lifecycle.w0<a> D0() {
        return v1.f229769a.p(g2.a(this), C0(), new i(null));
    }

    @NotNull
    public final c1<ItemMaterial> E0() {
        return (c1) this.f257636g.getValue();
    }

    @NotNull
    public final c1<ze.c> H0() {
        return this.f257637h;
    }

    @NotNull
    public final k5 I0() {
        return this.f257630a;
    }

    @Override // ze.a.InterfaceC2545a
    public void K(@NotNull ze.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f257635f = aVar;
    }

    public final boolean L0() {
        Project projectY0 = y0();
        return (projectY0 == null || projectY0.contestId == null) ? false : true;
    }

    public final void O0(@NotNull String text) {
        String title;
        Intrinsics.checkNotNullParameter(text, "text");
        ItemRoom itemRoomU0 = u0();
        if (itemRoomU0 == null || (title = itemRoomU0.getTitle()) == null) {
            title = "";
        }
        if (Intrinsics.areEqual(text, title)) {
            return;
        }
        ItemRoom itemRoomU1 = u0();
        if (itemRoomU1 == null) {
            timber.log.b.f381052a.d("Can't save room title because item is null", new Object[0]);
            return;
        }
        if (this.f257644o == null) {
            this.f257644o = new com.planner5d.library.widget.editor.editaction.d0(itemRoomU1.getUid(), itemRoomU1.getTitle());
        }
        N0(new com.planner5d.library.widget.editor.editaction.d0(itemRoomU1.getUid(), text), this.f257644o);
    }

    public final void P0(@Nullable com.planner5d.library.model.v vVar) {
        if (vVar != null) {
            ItemRoom itemRoomU0 = u0();
            if (itemRoomU0 == null || vVar.a() != itemRoomU0.getType()) {
                ItemRoom itemRoomU1 = u0();
                if (itemRoomU1 == null) {
                    timber.log.b.f381052a.d("Can't save room type because item is null", new Object[0]);
                    return;
                }
                if (this.f257645s == null) {
                    this.f257645s = new com.planner5d.library.widget.editor.editaction.e0(itemRoomU1.getUid(), itemRoomU1.getType());
                }
                N0(new com.planner5d.library.widget.editor.editaction.e0(itemRoomU1.getUid(), vVar.a()), this.f257645s);
            }
        }
    }

    public final void Q0() {
        this.f257648w = null;
        this.f257643n = null;
    }

    public final void U0(@NotNull BigDecimal height) {
        Intrinsics.checkNotNullParameter(height, "height");
        Float fValueOf = Float.valueOf(height.floatValue());
        ItemRoom itemRoomU0 = u0();
        if (Intrinsics.areEqual((Object) fValueOf, (Object) Float.valueOf(itemRoomU0 != null ? itemRoomU0.getFlooringHeight() : 0.0f))) {
            return;
        }
        kotlinx.coroutines.k.f(g2.a(this), null, null, new j(height, null), 3, null);
    }

    public final void V0(@NotNull BigDecimal height) {
        Intrinsics.checkNotNullParameter(height, "height");
        boolean z10 = true | false;
        kotlinx.coroutines.k.f(g2.a(this), null, null, new k(height, null), 3, null);
    }

    public final void W0(int i10, boolean z10) {
        if (z10 || i10 != this.f257642m) {
            ItemRoom itemRoomU0 = u0();
            if (itemRoomU0 == null) {
                timber.log.b.f381052a.d("Can't save room rotation because item is null", new Object[0]);
                return;
            }
            if (this.f257648w == null) {
                this.f257648w = this.f257641l.b(itemRoomU0, true);
            }
            float f10 = i10;
            N0(this.f257641l.a(itemRoomU0, CropImageOptions.S3 - f10, z10), this.f257648w);
            this.f257642m = f10;
        }
    }

    public final void Y0(@NotNull ItemMaterial itemMaterial) {
        Intrinsics.checkNotNullParameter(itemMaterial, "itemMaterial");
        E0().r(itemMaterial);
    }

    public final void Z0(@NotNull ze.c selectedTexture) {
        Intrinsics.checkNotNullParameter(selectedTexture, "selectedTexture");
        this.f257637h.r(selectedTexture);
    }

    public final void a1(@NotNull BigDecimal thickness) {
        Intrinsics.checkNotNullParameter(thickness, "thickness");
        kotlinx.coroutines.k.f(g2.a(this), null, null, new l(thickness, null), 3, null);
    }

    public final void b1() {
        ItemRoom itemRoomU0 = u0();
        if (itemRoomU0 != null) {
            itemRoomU0.startRotation();
        }
    }

    public final void c1(@NotNull Pair<? extends ItemMaterial, Boolean> toggleResult) {
        Intrinsics.checkNotNullParameter(toggleResult, "toggleResult");
        com.planner5d.library.widget.editor.interactor.e eVar = this.f257633d;
        ze.b bVarF = C0().f();
        Item itemH = bVarF != null ? bVarF.h() : null;
        String name = toggleResult.getFirst().name;
        Intrinsics.checkNotNullExpressionValue(name, "name");
        eVar.a(itemH, name, toggleResult.getSecond().booleanValue());
    }

    @Override // ze.a.InterfaceC2545a
    @NotNull
    public ze.a d() {
        ze.a aVar = this.f257635f;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("itemPropertiesSelection");
        return null;
    }

    @NotNull
    public final androidx.lifecycle.w0<List<com.planner5d.library.model.v>> r0() {
        return this.f257638i;
    }

    @NotNull
    public final c1<Range<BigDecimal>> t0() {
        return (c1) this.f257640k.getValue();
    }

    @Nullable
    public final ItemRoom u0() {
        ze.b bVarF = C0().f();
        Item itemH = bVarF != null ? bVarF.h() : null;
        if (itemH instanceof ItemRoom) {
            return (ItemRoom) itemH;
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x0066  */
    /* JADX WARN: Code duplicated, block: B:44:0x009c  */
    @NotNull
    public final List<com.planner5d.library.widget.editor.popup.properties.adapter.b<ItemMaterial>> v0(@NotNull Context context) {
        ItemMaterial[] materials;
        int i10;
        Intrinsics.checkNotNullParameter(context, "context");
        ItemRoom itemRoomU0 = u0();
        if (itemRoomU0 == null || (materials = itemRoomU0.getMaterials()) == null) {
            materials = new ItemMaterial[0];
        }
        ArrayList arrayList = new ArrayList(materials.length);
        for (ItemMaterial itemMaterial : materials) {
            String str = itemMaterial.name;
            if (str != null) {
                switch (str) {
                    case "indoor":
                        i10 = com.planner5d.library.f.s.cH;
                        break;
                    case "outdoor":
                        i10 = com.planner5d.library.f.s.iH;
                        break;
                    case "ceil":
                        i10 = com.planner5d.library.f.s.Qz;
                        break;
                    case "floor":
                        i10 = com.planner5d.library.f.s.Sz;
                        break;
                    default:
                        i10 = com.planner5d.library.f.s.Sz;
                        break;
                }
            } else {
                i10 = com.planner5d.library.f.s.Sz;
            }
            String string = context.getString(i10);
            boolean z10 = true;
            boolean z11 = Intrinsics.areEqual("floor", itemMaterial.name) || Intrinsics.areEqual("ceil", itemMaterial.name);
            ItemRoom itemRoomU1 = u0();
            if (itemRoomU1 != null) {
                String str2 = itemMaterial.name;
                if (Intrinsics.areEqual(str2, "floor")) {
                    if (itemRoomU1.getFloorHidden()) {
                        z10 = false;
                    }
                } else if (Intrinsics.areEqual(str2, "ceil") && itemRoomU1.getCeilingHidden()) {
                    z10 = false;
                }
            }
            arrayList.add(new com.planner5d.library.widget.editor.popup.properties.adapter.b(itemMaterial, string, false, z11, z10));
        }
        return arrayList;
    }

    @Nullable
    public final Integer x0(@NotNull ItemMaterial material) {
        Intrinsics.checkNotNullParameter(material, "material");
        ItemRoom itemRoomU0 = u0();
        if (itemRoomU0 != null) {
            int length = itemRoomU0.getMaterials().length;
            for (int i10 = 0; i10 < length; i10++) {
                if (material.name.equals(itemRoomU0.getMaterials()[i10].name)) {
                    return Integer.valueOf(i10);
                }
            }
        }
        return null;
    }
}
