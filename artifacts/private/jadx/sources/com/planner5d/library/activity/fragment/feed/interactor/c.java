package com.planner5d.library.activity.fragment.feed.interactor;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.manager.config.p;
import com.planner5d.library.model.manager.q0;
import com.planner5d.library.services.utility.c0;
import com.planner5d.library.services.utility.s;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class c implements com.planner5d.library.feed.usecase.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f133456h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.application.b f133457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final q0 f133458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final ka.c f133459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final ka.b f133460d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.feed.usecase.b f133461e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final p f133462f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.p f133463g;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.feed.interactor.GetDesignOfTheDayDataUseCaseInteractor", f = "GetDesignOfTheDayDataUseCaseInteractor.kt", i = {}, l = {67}, m = "loadPage", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f133464a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f133466c;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f133464a = obj;
            this.f133466c |= Integer.MIN_VALUE;
            return c.this.i(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.feed.interactor.GetDesignOfTheDayDataUseCaseInteractor$provideFeedListDataLive$2", f = "GetDesignOfTheDayDataUseCaseInteractor.kt", i = {0, 1, 3}, l = {36, 42, 44, com.planner5d.library.engine.input.f.b.f160729t0}, m = "invokeSuspend", n = {"dayOfYear", "dayOfYear", "destination$iv$iv"}, s = {"I$0", "I$0", "L$1"})
    @SourceDebugExtension({"SMAP\nGetDesignOfTheDayDataUseCaseInteractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetDesignOfTheDayDataUseCaseInteractor.kt\ncom/planner5d/library/activity/fragment/feed/interactor/GetDesignOfTheDayDataUseCaseInteractor$provideFeedListDataLive$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,70:1\n1557#2:71\n1628#2,3:72\n*S KotlinDebug\n*F\n+ 1 GetDesignOfTheDayDataUseCaseInteractor.kt\ncom/planner5d/library/activity/fragment/feed/interactor/GetDesignOfTheDayDataUseCaseInteractor$provideFeedListDataLive$2\n*L\n53#1:71\n53#1:72,3\n*E\n"})
    static final class b extends o implements Function2<s0, kotlin.coroutines.d<? super List<? extends jc.e>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f133467a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f133468b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f133469c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f133470d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f133471e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f133472f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f133473g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f133474h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Object f133475i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f133476j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f133477k;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return c.this.new b(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(s0 s0Var, kotlin.coroutines.d<? super List<? extends jc.e>> dVar) {
            return invoke2(s0Var, (kotlin.coroutines.d<? super List<jc.e>>) dVar);
        }

        /* JADX WARN: Code duplicated, block: B:44:0x0117  */
        /* JADX WARN: Code duplicated, block: B:47:0x016b  */
        /* JADX WARN: Code duplicated, block: B:49:0x0189  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x016b -> B:9:0x0049). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instruction units count: 396
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.activity.fragment.feed.interactor.c.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(s0 s0Var, kotlin.coroutines.d<? super List<jc.e>> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public c(@NotNull com.planner5d.library.application.b application, @NotNull q0 manager, @NotNull ka.c saveGalleryRecordsUseCase, @NotNull ka.b readGalleryRecordsUseCase, @NotNull com.planner5d.library.feed.usecase.b selectDesignOfTheDayDataWindowUseCase, @NotNull p preferencesManager, @NotNull com.planner5d.library.model.manager.p favoriteManager) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(saveGalleryRecordsUseCase, "saveGalleryRecordsUseCase");
        Intrinsics.checkNotNullParameter(readGalleryRecordsUseCase, "readGalleryRecordsUseCase");
        Intrinsics.checkNotNullParameter(selectDesignOfTheDayDataWindowUseCase, "selectDesignOfTheDayDataWindowUseCase");
        Intrinsics.checkNotNullParameter(preferencesManager, "preferencesManager");
        Intrinsics.checkNotNullParameter(favoriteManager, "favoriteManager");
        this.f133457a = application;
        this.f133458b = manager;
        this.f133459c = saveGalleryRecordsUseCase;
        this.f133460d = readGalleryRecordsUseCase;
        this.f133461e = selectDesignOfTheDayDataWindowUseCase;
        this.f133462f = preferencesManager;
        this.f133463g = favoriteManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object i(kotlin.coroutines.d<? super List<? extends com.planner5d.library.model.h>> dVar) throws Throwable {
        a aVar;
        List list;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f133466c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f133466c = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objL = aVar.f133464a;
        Object objL2 = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f133466c;
        if (i11 == 0) {
            ResultKt.m(objL);
            q0.d dVar2 = new q0.d(q0.c.ideas, q0.e.popular, null, null, 70);
            c0 c0Var = c0.f225068a;
            Observable<com.planner5d.library.model.h[]> observableQ = this.f133458b.q(dVar2);
            Intrinsics.checkNotNullExpressionValue(observableQ, "getList(...)");
            aVar.f133466c = 1;
            objL = c0Var.l(observableQ, aVar);
            if (objL == objL2) {
                return objL2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objL);
        }
        com.planner5d.library.model.h[] hVarArr = (com.planner5d.library.model.h[]) objL;
        return (hVarArr == null || (list = ArraysKt.toList(hVarArr)) == null) ? CollectionsKt.emptyList() : list;
    }

    @Override // com.planner5d.library.feed.usecase.a
    @Nullable
    public Object a(@NotNull kotlin.coroutines.d<? super List<jc.e>> dVar) {
        return kotlinx.coroutines.i.h(s.f229729a.h(), new b(null), dVar);
    }
}
