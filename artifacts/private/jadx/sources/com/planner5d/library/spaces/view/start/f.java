package com.planner5d.library.spaces.view.start;

import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import com.planner5d.library.model.manager.config.p;
import com.planner5d.library.model.manager.statistics.events.c4;
import com.planner5d.library.model.manager.w;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.k;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 0)
public final class f extends f2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f230530f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.spaces.data.a f230531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final w f230532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final p f230533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final c4 f230534d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.spaces.data.e f230535e;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.spaces.view.start.SpacesStartViewModel$onSkip$1", f = "SpacesStartViewModel.kt", i = {0}, l = {35, 37}, m = "invokeSuspend", n = {"spaceData"}, s = {"L$0"})
    static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f230536a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f230537b;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return f.this.new a(dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0062, code lost:
        
            if (r9.L(r1, true, r8) == r0) goto L16;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                r7 = 7
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r8.f230537b
                r2 = 2
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L28
                if (r1 == r3) goto L20
                r7 = 0
                if (r1 != r2) goto L16
                kotlin.ResultKt.m(r9)
                r7 = 3
                goto L65
            L16:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r7 = 3
                r8.<init>(r9)
                r7 = 2
                throw r8
            L20:
                java.lang.Object r1 = r8.f230536a
                com.planner5d.library.spaces.entity.SpacesProjectData r1 = (com.planner5d.library.spaces.entity.SpacesProjectData) r1
                kotlin.ResultKt.m(r9)
                goto L44
            L28:
                r7 = 5
                kotlin.ResultKt.m(r9)
                com.planner5d.library.spaces.entity.SpacesProjectData r1 = new com.planner5d.library.spaces.entity.SpacesProjectData
                r1.<init>()
                com.planner5d.library.spaces.view.start.f r9 = com.planner5d.library.spaces.view.start.f.this
                com.planner5d.library.spaces.data.e r9 = com.planner5d.library.spaces.view.start.f.W(r9)
                r8.f230536a = r1
                r8.f230537b = r3
                java.lang.Object r9 = r9.a(r1, r8)
                r7 = 7
                if (r9 != r0) goto L44
                r7 = 2
                goto L64
            L44:
                com.planner5d.library.spaces.view.start.f r9 = com.planner5d.library.spaces.view.start.f.this
                com.planner5d.library.spaces.data.a r9 = com.planner5d.library.spaces.view.start.f.U(r9)
                r9.A(r1)
                com.planner5d.library.spaces.view.start.f r9 = com.planner5d.library.spaces.view.start.f.this
                com.planner5d.library.model.manager.config.p r9 = com.planner5d.library.spaces.view.start.f.V(r9)
                r7 = 2
                com.planner5d.library.services.r r1 = com.planner5d.library.services.r.spacesProjectWasFound
                r4 = 1
                r4 = 0
                r8.f230536a = r4
                r8.f230537b = r2
                r7 = 3
                java.lang.Object r9 = r9.L(r1, r3, r8)
                r7 = 0
                if (r9 != r0) goto L65
            L64:
                return r0
            L65:
                r7 = 1
                com.planner5d.library.spaces.view.start.f r8 = com.planner5d.library.spaces.view.start.f.this
                com.planner5d.library.model.manager.statistics.events.c4 r0 = com.planner5d.library.spaces.view.start.f.X(r8)
                com.planner5d.library.model.manager.statistics.events.c4$a r1 = com.planner5d.library.model.manager.statistics.events.c4.a.skip
                com.planner5d.library.model.manager.statistics.events.c4$c r2 = com.planner5d.library.model.manager.statistics.events.c4.c.address_input
                r7 = 3
                r5 = 12
                r6 = 1
                r6 = 0
                r3 = 0
                r4 = 0
                com.planner5d.library.model.manager.statistics.events.c4.b.a(r0, r1, r2, r3, r4, r5, r6)
                r7 = 7
                kotlin.Unit r8 = kotlin.Unit.f312394a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.spaces.view.start.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public f(@NotNull com.planner5d.library.spaces.data.a addressRepository, @NotNull w featureConfigManager, @NotNull p sharedPreferences, @NotNull c4 statisticsEventSpaces, @NotNull com.planner5d.library.spaces.data.e spacesManagerService) {
        Intrinsics.checkNotNullParameter(addressRepository, "addressRepository");
        Intrinsics.checkNotNullParameter(featureConfigManager, "featureConfigManager");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(statisticsEventSpaces, "statisticsEventSpaces");
        Intrinsics.checkNotNullParameter(spacesManagerService, "spacesManagerService");
        this.f230531a = addressRepository;
        this.f230532b = featureConfigManager;
        this.f230533c = sharedPreferences;
        this.f230534d = statisticsEventSpaces;
        this.f230535e = spacesManagerService;
    }

    public final boolean Y() {
        return this.f230532b.a(com.planner5d.library.model.manager.config.f.SpacesOnboardingAddressSkip);
    }

    public final boolean Z() {
        return this.f230532b.a(com.planner5d.library.model.manager.config.f.OnboardingNew);
    }

    public final void a0() {
        c4.b.a(this.f230534d, c4.a.open, c4.c.address_input, null, null, 12, null);
    }

    public final void b0() {
        k.f(g2.a(this), null, null, new a(null), 3, null);
    }
}
