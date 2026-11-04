package com.planner5d.library.spaces.view.info;

import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.c1;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import com.planner5d.library.model.manager.config.p;
import com.planner5d.library.model.manager.statistics.events.c4;
import com.planner5d.library.services.q;
import com.planner5d.library.services.utility.v1;
import com.planner5d.library.spaces.entity.SpacesProjectData;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.k;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 0)
public final class g extends f2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f230324g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final q f230325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final p f230326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.spaces.data.e f230327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final c4 f230328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final c1<Boolean> f230329e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final v1.a<Unit> f230330f;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.spaces.view.info.SpacesInfoViewModel$markSpacesProjectFound$1", f = "SpacesInfoViewModel.kt", i = {}, l = {39, 40}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f230331a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SpacesProjectData f230333c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(SpacesProjectData spacesProjectData, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f230333c = spacesProjectData;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return g.this.new a(this.f230333c, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
        
            if (r6.L(r1, true, r5) == r0) goto L16;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                r4 = 0
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r4 = 3
                int r1 = r5.f230331a
                r2 = 5
                r2 = 2
                r4 = 1
                r3 = 1
                if (r1 == 0) goto L27
                r4 = 0
                if (r1 == r3) goto L22
                if (r1 != r2) goto L18
                kotlin.ResultKt.m(r6)
                r4 = 7
                goto L51
            L18:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "lbs/r//e/t etn/oa /eh ou/cere ukw  iciotos/fvorlenm"
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L22:
                kotlin.ResultKt.m(r6)
                r4 = 3
                goto L3b
            L27:
                kotlin.ResultKt.m(r6)
                com.planner5d.library.spaces.view.info.g r6 = com.planner5d.library.spaces.view.info.g.this
                com.planner5d.library.spaces.data.e r6 = com.planner5d.library.spaces.view.info.g.V(r6)
                com.planner5d.library.spaces.entity.SpacesProjectData r1 = r5.f230333c
                r5.f230331a = r3
                java.lang.Object r6 = r6.a(r1, r5)
                if (r6 != r0) goto L3b
                goto L50
            L3b:
                r4 = 6
                com.planner5d.library.spaces.view.info.g r6 = com.planner5d.library.spaces.view.info.g.this
                r4 = 5
                com.planner5d.library.model.manager.config.p r6 = com.planner5d.library.spaces.view.info.g.U(r6)
                r4 = 0
                com.planner5d.library.services.r r1 = com.planner5d.library.services.r.spacesProjectWasFound
                r5.f230331a = r2
                r4 = 3
                java.lang.Object r6 = r6.L(r1, r3, r5)
                r4 = 3
                if (r6 != r0) goto L51
            L50:
                return r0
            L51:
                com.planner5d.library.spaces.view.info.g r6 = com.planner5d.library.spaces.view.info.g.this
                androidx.lifecycle.c1 r6 = r6.Y()
                r0 = 6
                r0 = 0
                java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.b.a(r0)
                r6.r(r0)
                r4 = 0
                com.planner5d.library.spaces.view.info.g r5 = com.planner5d.library.spaces.view.info.g.this
                com.planner5d.library.services.utility.v1$a r5 = r5.X()
                kotlin.Unit r6 = kotlin.Unit.f312394a
                r4 = 4
                r5.r(r6)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.spaces.view.info.g.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public g(@NotNull q imageManager, @NotNull p sharedPreferences, @NotNull com.planner5d.library.spaces.data.e spacesManagerService, @NotNull c4 statisticsEventSpaces) {
        Intrinsics.checkNotNullParameter(imageManager, "imageManager");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(spacesManagerService, "spacesManagerService");
        Intrinsics.checkNotNullParameter(statisticsEventSpaces, "statisticsEventSpaces");
        this.f230325a = imageManager;
        this.f230326b = sharedPreferences;
        this.f230327c = spacesManagerService;
        this.f230328d = statisticsEventSpaces;
        this.f230329e = new c1<>(Boolean.FALSE);
        this.f230330f = v1.l(v1.f229769a, null, 1, null);
    }

    @NotNull
    public final String W(@Nullable Long l10) {
        return "$" + l10;
    }

    @NotNull
    public final v1.a<Unit> X() {
        return this.f230330f;
    }

    @NotNull
    public final c1<Boolean> Y() {
        return this.f230329e;
    }

    public final void Z(@NotNull com.planner5d.library.services.bitmaploader.target.a bitmapTarget, @NotNull String url) {
        Intrinsics.checkNotNullParameter(bitmapTarget, "bitmapTarget");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f230325a.b(url, 0, 0, bitmapTarget, 4L);
    }

    public final void a0(@NotNull SpacesProjectData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        c4.b.a(this.f230328d, c4.a.f216781d, c4.c.object, null, null, 12, null);
        this.f230329e.r(Boolean.TRUE);
        k.f(g2.a(this), null, null, new a(data, null), 3, null);
    }

    public final void b0() {
        c4.b.a(this.f230328d, c4.a.open, c4.c.object, null, null, 12, null);
    }

    public final void c0() {
        c4.b.a(this.f230328d, c4.a.back, c4.c.object, null, null, 12, null);
    }
}
