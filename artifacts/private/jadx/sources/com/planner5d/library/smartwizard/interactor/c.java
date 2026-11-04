package com.planner5d.library.smartwizard.interactor;

import com.devtodev.core.data.metrics.MetricConsts;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nGetRoomStylesForDesignGeneratorInteractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetRoomStylesForDesignGeneratorInteractor.kt\ncom/planner5d/library/smartwizard/interactor/GetRoomStylesForDesignGeneratorInteractor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,19:1\n774#2:20\n865#2,2:21\n1557#2:23\n1628#2,3:24\n*S KotlinDebug\n*F\n+ 1 GetRoomStylesForDesignGeneratorInteractor.kt\ncom/planner5d/library/smartwizard/interactor/GetRoomStylesForDesignGeneratorInteractor\n*L\n13#1:20\n13#1:21,2\n13#1:23\n13#1:24,3\n*E\n"})
public final class c implements le.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.smartwizard.data.c f229926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final ce.c f229927b;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.smartwizard.interactor.GetRoomStylesForDesignGeneratorInteractor", f = "GetRoomStylesForDesignGeneratorInteractor.kt", i = {0, 1, 1, 1}, l = {13, 15}, m = "getRoomStyles", n = {"this", "this", "destination$iv$iv", MetricConsts.Install}, s = {"L$0", "L$0", "L$1", "L$3"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f229928a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f229929b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f229930c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f229931d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f229932e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f229933f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        long f229934g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f229935h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f229937j;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f229935h = obj;
            this.f229937j |= Integer.MIN_VALUE;
            return c.this.a(this);
        }
    }

    @ij.a
    public c(@NotNull com.planner5d.library.smartwizard.data.c roomStyleRepository, @NotNull ce.c translateRoomStyleUseCase) {
        Intrinsics.checkNotNullParameter(roomStyleRepository, "roomStyleRepository");
        Intrinsics.checkNotNullParameter(translateRoomStyleUseCase, "translateRoomStyleUseCase");
        this.f229926a = roomStyleRepository;
        this.f229927b = translateRoomStyleUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00d8 -> B:13:0x004c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // le.c
    @org.jetbrains.annotations.Nullable
    public java.lang.Object a(@org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super java.util.List<le.c.a>> r18) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.smartwizard.interactor.c.a(kotlin.coroutines.d):java.lang.Object");
    }
}
