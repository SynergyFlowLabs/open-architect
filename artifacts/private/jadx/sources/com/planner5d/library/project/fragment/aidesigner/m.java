package com.planner5d.library.project.fragment.aidesigner;

import androidx.annotation.f1;
import androidx.annotation.u0;
import androidx.lifecycle.c1;
import androidx.lifecycle.f2;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.statistics.events.StatisticsEventAiDesigner;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.utility.c2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class m extends f2 implements StatisticsEventAiDesigner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ StatisticsEventAiDesigner f223701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final c2 f223702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final b2 f223703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @f1
    private int f223704d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @f1
    private int f223705e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @u0
    private int f223706f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private a f223707g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final c1<a> f223708h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private StatisticsEventAiDesigner.EventData f223709i;

    public enum a {
        Furnisher,
        Styler,
        Paywall,
        Decorator;


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f223715f = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<a> l() {
            return f223715f;
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f223716a;

        static {
            int[] iArr = new int[StatisticsEventAiDesigner.g.values().length];
            try {
                iArr[StatisticsEventAiDesigner.g.furnisher.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StatisticsEventAiDesigner.g.styler.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StatisticsEventAiDesigner.g.decorator.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f223716a = iArr;
        }
    }

    @ij.a
    public m(@NotNull StatisticsEventAiDesigner statisticsEventAiDesigner, @NotNull c2 networkStateUtility, @NotNull b2 messageManager) {
        Intrinsics.checkNotNullParameter(statisticsEventAiDesigner, "statisticsEventAiDesigner");
        Intrinsics.checkNotNullParameter(networkStateUtility, "networkStateUtility");
        Intrinsics.checkNotNullParameter(messageManager, "messageManager");
        this.f223701a = statisticsEventAiDesigner;
        this.f223702b = networkStateUtility;
        this.f223703c = messageManager;
        this.f223707g = a.Furnisher;
        this.f223708h = new c1<>();
        this.f223709i = new StatisticsEventAiDesigner.EventData(null, null, null, null, null, null, null, 127, null);
    }

    @Override // com.planner5d.library.model.manager.statistics.events.StatisticsEventAiDesigner
    public void F0(@NotNull StatisticsEventAiDesigner.a action, @Nullable StatisticsEventAiDesigner.d dVar, @Nullable StatisticsEventAiDesigner.g gVar, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable StatisticsEventAiDesigner.e eVar, @Nullable String str) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f223701a.F0(action, dVar, gVar, num, num2, num3, eVar, str);
    }

    public final void U(@NotNull StatisticsEventAiDesigner.a action) {
        Intrinsics.checkNotNullParameter(action, "action");
        i(action, this.f223709i);
    }

    public final void V() {
        this.f223708h.r(null);
    }

    public final int W() {
        return this.f223706f;
    }

    @NotNull
    public final c1<a> X() {
        return this.f223708h;
    }

    @NotNull
    public final StatisticsEventAiDesigner.EventData Y() {
        return this.f223709i;
    }

    public final int Z() {
        return this.f223705e;
    }

    public final int a0() {
        return this.f223704d;
    }

    public final void b0(@NotNull StatisticsEventAiDesigner.EventData eventData) {
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        this.f223709i = eventData;
        StatisticsEventAiDesigner.g gVarQ = eventData.q();
        int i10 = gVarQ == null ? -1 : b.f223716a[gVarQ.ordinal()];
        if (i10 != -1) {
            if (i10 == 1) {
                this.f223704d = md.b.s.B0;
                this.f223705e = md.b.s.C0;
                this.f223706f = md.b.r.f326350j;
                this.f223707g = a.Furnisher;
                return;
            }
            if (i10 == 2) {
                this.f223704d = md.b.s.D0;
                this.f223705e = md.b.s.E0;
                this.f223706f = md.b.r.f326362v;
                this.f223707g = a.Styler;
                return;
            }
            if (i10 != 3) {
                throw new k0();
            }
            this.f223704d = md.b.s.f326972z0;
            this.f223705e = md.b.s.A0;
            this.f223706f = md.b.r.f326347g;
            this.f223707g = a.Decorator;
        }
    }

    public final void c0(boolean z10) {
        if (this.f223702b.d(com.planner5d.library.application.b.f142455c.a().S0())) {
            this.f223708h.r(!z10 ? this.f223707g : a.Paywall);
            return;
        }
        b2 b2Var = this.f223703c;
        ErrorMessageException errorMessageExceptionCreateNoInternetException = ErrorMessageException.createNoInternetException();
        Intrinsics.checkNotNullExpressionValue(errorMessageExceptionCreateNoInternetException, "createNoInternetException(...)");
        b2Var.r(errorMessageExceptionCreateNoInternetException);
    }

    public final void d0(int i10) {
        this.f223706f = i10;
    }

    public final void f0(@NotNull StatisticsEventAiDesigner.EventData eventData) {
        Intrinsics.checkNotNullParameter(eventData, "<set-?>");
        this.f223709i = eventData;
    }

    public final void g0(int i10) {
        this.f223705e = i10;
    }

    public final void h0(int i10) {
        this.f223704d = i10;
    }

    @Override // com.planner5d.library.model.manager.statistics.events.StatisticsEventAiDesigner
    public void i(@NotNull StatisticsEventAiDesigner.a action, @NotNull StatisticsEventAiDesigner.EventData parameters) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.f223701a.i(action, parameters);
    }
}
