package com.superwall.sdk.debug;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.l0;
import com.superwall.sdk.dependencies.ViewFactory;
import com.superwall.sdk.storage.LocalStorage;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.t0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class DebugManager {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final Context context;

    @NotNull
    private final ViewFactory factory;
    private boolean isDebuggerLaunched;

    @NotNull
    private final LocalStorage storage;

    @Nullable
    private DebugView view;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: outcomeForDeepLink-IoAF18A, reason: not valid java name */
        public final Object m23outcomeForDeepLinkIoAF18A(@NotNull Uri deepLinkUrl) {
            Intrinsics.checkNotNullParameter(deepLinkUrl, "deepLinkUrl");
            SWDebugManagerLogic sWDebugManagerLogic = SWDebugManagerLogic.INSTANCE;
            String queryItemValue = sWDebugManagerLogic.getQueryItemValue(deepLinkUrl, SWDebugManagerLogic.Parameter.SUPERWALL_DEBUG);
            if (queryItemValue == null) {
                Result.a aVar = Result.Companion;
                return Result.m785constructorimpl(ResultKt.createFailure(new IllegalArgumentException("Not debug link")));
            }
            if (!Boolean.parseBoolean(queryItemValue)) {
                Result.a aVar2 = Result.Companion;
                return Result.m785constructorimpl(ResultKt.createFailure(new IllegalArgumentException("Not debug link")));
            }
            String queryItemValue2 = sWDebugManagerLogic.getQueryItemValue(deepLinkUrl, SWDebugManagerLogic.Parameter.TOKEN);
            if (queryItemValue2 == null) {
                Result.a aVar3 = Result.Companion;
                return Result.m785constructorimpl(ResultKt.createFailure(new IllegalArgumentException("Not debug link")));
            }
            String queryItemValue3 = sWDebugManagerLogic.getQueryItemValue(deepLinkUrl, SWDebugManagerLogic.Parameter.PAYWALL_ID);
            Result.a aVar4 = Result.Companion;
            return Result.m785constructorimpl(new DeepLinkOutcome(queryItemValue2, queryItemValue3));
        }

        private Companion() {
        }
    }

    public static final class DeepLinkOutcome {

        @NotNull
        private final String debugKey;

        @Nullable
        private final String paywallId;

        public DeepLinkOutcome(@NotNull String debugKey, @Nullable String str) {
            Intrinsics.checkNotNullParameter(debugKey, "debugKey");
            this.debugKey = debugKey;
            this.paywallId = str;
        }

        public static /* synthetic */ DeepLinkOutcome copy$default(DeepLinkOutcome deepLinkOutcome, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = deepLinkOutcome.debugKey;
            }
            if ((i10 & 2) != 0) {
                str2 = deepLinkOutcome.paywallId;
            }
            return deepLinkOutcome.copy(str, str2);
        }

        @NotNull
        public final String component1() {
            return this.debugKey;
        }

        @Nullable
        public final String component2() {
            return this.paywallId;
        }

        @NotNull
        public final DeepLinkOutcome copy(@NotNull String debugKey, @Nullable String str) {
            Intrinsics.checkNotNullParameter(debugKey, "debugKey");
            return new DeepLinkOutcome(debugKey, str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeepLinkOutcome)) {
                return false;
            }
            DeepLinkOutcome deepLinkOutcome = (DeepLinkOutcome) obj;
            return Intrinsics.areEqual(this.debugKey, deepLinkOutcome.debugKey) && Intrinsics.areEqual(this.paywallId, deepLinkOutcome.paywallId);
        }

        @NotNull
        public final String getDebugKey() {
            return this.debugKey;
        }

        @Nullable
        public final String getPaywallId() {
            return this.paywallId;
        }

        public int hashCode() {
            int iHashCode = this.debugKey.hashCode() * 31;
            String str = this.paywallId;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return "DeepLinkOutcome(debugKey=" + this.debugKey + ", paywallId=" + this.paywallId + ")";
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.debug.DebugManager$launchDebugger$1, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.debug.DebugManager", f = "DebugManager.kt", i = {0, 0, 2, 2, 4, 4}, l = {67, com.planner5d.library.engine.input.f.b.V, 71, 72, com.planner5d.library.engine.input.f.b.C0, 75}, m = "launchDebugger", n = {"this", "paywallDatabaseId", "this", "paywallDatabaseId", "this", "paywallDatabaseId"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DebugManager.this.launchDebugger(null, this);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.debug.DebugManager$presentDebugger$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.debug.DebugManager", f = "DebugManager.kt", i = {0, 0}, l = {com.planner5d.library.engine.input.f.b.f160696i0}, m = "presentDebugger", n = {"this", "currentView"}, s = {"L$0", "L$1"})
    static final class C26401 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C26401(kotlin.coroutines.d<? super C26401> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DebugManager.this.presentDebugger(null, this);
        }
    }

    public DebugManager(@NotNull Context context, @NotNull LocalStorage storage, @NotNull ViewFactory factory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(factory, "factory");
        this.context = context;
        this.storage = storage;
        this.factory = factory;
    }

    public static /* synthetic */ Object launchDebugger$default(DebugManager debugManager, String str, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        return debugManager.launchDebugger(str, dVar);
    }

    public static /* synthetic */ Object presentDebugger$default(DebugManager debugManager, String str, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        return debugManager.presentDebugger(str, dVar);
    }

    @l0
    @Nullable
    public final Object closeDebugger(boolean z10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        androidx.appcompat.app.d encapsulatingActivity;
        DebugView debugView = this.view;
        if (debugView != null && (encapsulatingActivity = debugView.getEncapsulatingActivity()) != null) {
            encapsulatingActivity.finish();
        }
        this.view = null;
        this.isDebuggerLaunched = false;
        return Unit.f312394a;
    }

    @Nullable
    public final DebugView getView() {
        return this.view;
    }

    public final boolean handle(@NotNull Uri deepLinkUrl) {
        Intrinsics.checkNotNullParameter(deepLinkUrl, "deepLinkUrl");
        Object objM23outcomeForDeepLinkIoAF18A = Companion.m23outcomeForDeepLinkIoAF18A(deepLinkUrl);
        if (Result.h(objM23outcomeForDeepLinkIoAF18A)) {
            this.storage.setDebugKey(((DeepLinkOutcome) objM23outcomeForDeepLinkIoAF18A).getDebugKey());
        }
        if (Result.h(objM23outcomeForDeepLinkIoAF18A)) {
            kotlinx.coroutines.k.f(t0.a(l1.c()), null, null, new DebugManager$handle$2$1(this, (DeepLinkOutcome) objM23outcomeForDeepLinkIoAF18A, null), 3, null);
        }
        return Result.h(objM23outcomeForDeepLinkIoAF18A);
    }

    public final boolean isDebuggerLaunched() {
        return this.isDebuggerLaunched;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ab, code lost:
    
        if (r7.launchDebugger(r8, r0) == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d3, code lost:
    
        if (r7.presentDebugger(r8, r0) == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f5, code lost:
    
        if (r7.launchDebugger(r8, r0) == r1) goto L43;
     */
    @androidx.annotation.l0
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object launchDebugger(@org.jetbrains.annotations.Nullable java.lang.String r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r9) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.superwall.sdk.debug.DebugManager.launchDebugger(java.lang.String, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @l0
    @Nullable
    public final Object presentDebugger(@Nullable String str, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        C26401 c26401;
        DebugView debugView;
        if (dVar instanceof C26401) {
            c26401 = (C26401) dVar;
            int i10 = c26401.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c26401.label = i10 - Integer.MIN_VALUE;
            } else {
                c26401 = new C26401(dVar);
            }
        } else {
            c26401 = new C26401(dVar);
        }
        Object obj = c26401.result;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = c26401.label;
        if (i11 == 0) {
            ResultKt.m(obj);
            this.isDebuggerLaunched = true;
            debugView = this.view;
            if (debugView == null) {
                DebugView debugViewMakeDebugView = this.factory.makeDebugView(str);
                DebugViewActivity.Companion.startWithView(this.context, debugViewMakeDebugView);
                this.view = debugViewMakeDebugView;
            } else {
                if (debugView.isActive$superwall_release()) {
                    return Unit.f312394a;
                }
                debugView.setPaywallDatabaseId$superwall_release(str);
                c26401.L$0 = this;
                c26401.L$1 = debugView;
                c26401.label = 1;
                if (debugView.loadPreview(c26401) == objL) {
                    return objL;
                }
            }
            return Unit.f312394a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        DebugView debugView2 = (DebugView) c26401.L$1;
        DebugManager debugManager = (DebugManager) c26401.L$0;
        ResultKt.m(obj);
        debugView = debugView2;
        this = debugManager;
        DebugViewActivity.Companion.startWithView(this.context, debugView);
        return Unit.f312394a;
    }

    public final void setDebuggerLaunched(boolean z10) {
        this.isDebuggerLaunched = z10;
    }

    @l0
    public final void setView(@Nullable DebugView debugView) {
        this.view = debugView;
    }
}
