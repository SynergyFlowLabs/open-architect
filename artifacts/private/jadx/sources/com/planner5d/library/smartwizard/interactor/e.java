package com.planner5d.library.smartwizard.interactor;

import com.devtodev.core.data.metrics.MetricConsts;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nGetSmartWizardRoomStylesInteractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetSmartWizardRoomStylesInteractor.kt\ncom/planner5d/library/smartwizard/interactor/GetSmartWizardRoomStylesInteractor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,22:1\n774#2:23\n865#2,2:24\n1557#2:26\n1628#2,3:27\n*S KotlinDebug\n*F\n+ 1 GetSmartWizardRoomStylesInteractor.kt\ncom/planner5d/library/smartwizard/interactor/GetSmartWizardRoomStylesInteractor\n*L\n14#1:23\n14#1:24,2\n15#1:26\n15#1:27,3\n*E\n"})
public final class e implements ce.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.smartwizard.data.c f229940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final ce.c f229941b;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.smartwizard.interactor.GetSmartWizardRoomStylesInteractor", f = "GetSmartWizardRoomStylesInteractor.kt", i = {0, 1, 1, 1}, l = {13, 18}, m = "getStyles", n = {"this", "this", "destination$iv$iv", MetricConsts.Install}, s = {"L$0", "L$0", "L$1", "L$3"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f229942a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f229943b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f229944c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f229945d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f229946e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f229947f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f229948g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f229950i;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f229948g = obj;
            this.f229950i |= Integer.MIN_VALUE;
            return e.this.a(this);
        }
    }

    @ij.a
    public e(@NotNull com.planner5d.library.smartwizard.data.c repository, @NotNull ce.c translateRoomStyleUseCase) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(translateRoomStyleUseCase, "translateRoomStyleUseCase");
        this.f229940a = repository;
        this.f229941b = translateRoomStyleUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00cb -> B:13:0x0045). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // ce.b
    @org.jetbrains.annotations.Nullable
    public java.lang.Object a(@org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super java.util.List<com.planner5d.library.smartwizard.data.e>> r15) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.smartwizard.interactor.e.a(kotlin.coroutines.d):java.lang.Object");
    }
}
