package com.planner5d.library.model.manager;

import android.app.Application;
import android.telephony.TelephonyManager;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Iterator;
import java.util.Locale;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@ij.f
@SourceDebugExtension({"SMAP\nMetricUnitManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MetricUnitManager.kt\ncom/planner5d/library/model/manager/MetricUnitManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,119:1\n1#2:120\n*E\n"})
public final class f2 implements x1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f191325f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f191326g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final kotlin.f0<f2> f191327h = kotlin.g0.c(new Function0() { // from class: com.planner5d.library.model.manager.e2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return f2.t();
        }
    });

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final double f191328i = 2.54d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Application f191329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.p f191330d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.metricunit.a[] f191331e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @oj.n
        public static /* synthetic */ void b() {
        }

        @NotNull
        public final f2 a() {
            return (f2) f2.f191327h.getValue();
        }

        private a() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.MetricUnitManager", f = "MetricUnitManager.kt", i = {}, l = {71}, m = "get", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f191332a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f191333b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f191335d;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f191333b = obj;
            this.f191335d |= Integer.MIN_VALUE;
            return f2.this.k(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.MetricUnitManager", f = "MetricUnitManager.kt", i = {0}, l = {41, 44, 42}, m = "initialize", n = {"this"}, s = {"L$0"})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f191336a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f191337b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f191338c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f191339d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f191341f;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f191339d = obj;
            this.f191341f |= Integer.MIN_VALUE;
            return f2.this.r(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.MetricUnitManager$initialize$2", f = "MetricUnitManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super String>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f191342a;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return f2.this.new d(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f191342a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return f2.this.m();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super String> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public f2(@NotNull Application application, @NotNull com.planner5d.library.model.manager.config.p preferences, @NotNull com.planner5d.library.services.utility.p0 formatter) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        this.f191329c = application;
        this.f191330d = preferences;
        this.f191331e = new com.planner5d.library.model.metricunit.a[]{new com.planner5d.library.model.metricunit.b(application, formatter), new com.planner5d.library.model.metricunit.c(application, formatter)};
    }

    private final double f(double d10, com.planner5d.library.model.metricunit.a aVar) {
        return aVar instanceof com.planner5d.library.model.metricunit.b ? d10 / f191328i : d10;
    }

    @NotNull
    public static final f2 n() {
        return f191325f.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
    
        if (r3.equals("MM") == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
    
        if (r3.equals("GB") == false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int q(java.lang.String r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L49
            int r2 = r3.hashCode()
            r0 = 2267(0x8db, float:3.177E-42)
            r1 = 5
            if (r2 == r0) goto L3d
            r0 = 2438(0x986, float:3.416E-42)
            if (r2 == r0) goto L30
            r0 = 2464(0x9a0, float:3.453E-42)
            if (r2 == r0) goto L24
            r1 = 4
            r0 = 2718(0xa9e, float:3.809E-42)
            if (r2 == r0) goto L19
            goto L49
        L19:
            java.lang.String r2 = "US"
            r1 = 1
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L49
            r1 = 3
            goto L46
        L24:
            java.lang.String r2 = "MM"
            java.lang.String r2 = "MM"
            boolean r2 = r3.equals(r2)
            r1 = 7
            if (r2 != 0) goto L46
            goto L49
        L30:
            java.lang.String r2 = "RL"
            java.lang.String r2 = "LR"
            boolean r2 = r3.equals(r2)
            r1 = 5
            if (r2 != 0) goto L46
            r1 = 7
            goto L49
        L3d:
            java.lang.String r2 = "GB"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L46
            goto L49
        L46:
            r1 = 2
            r2 = 0
            return r2
        L49:
            r2 = 1
            r1 = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.f2.q(java.lang.String):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f2 t() {
        return com.planner5d.library.application.b.f142455c.a().l();
    }

    private final double y(double d10, com.planner5d.library.model.metricunit.a aVar) {
        return aVar instanceof com.planner5d.library.model.metricunit.b ? d10 * f191328i : d10;
    }

    public final float c(double d10, @NotNull com.planner5d.library.model.metricunit.a unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return (float) f(d10, unit);
    }

    @NotNull
    public final BigDecimal d(double d10, @NotNull com.planner5d.library.model.metricunit.a unit) {
        BigDecimal bigDecimalValueOf;
        Intrinsics.checkNotNullParameter(unit, "unit");
        try {
            bigDecimalValueOf = BigDecimal.valueOf(f(d10, unit));
        } catch (NumberFormatException unused) {
            bigDecimalValueOf = BigDecimal.ZERO;
        }
        BigDecimal scale = bigDecimalValueOf.setScale(2, RoundingMode.HALF_UP);
        Intrinsics.checkNotNullExpressionValue(scale, "setScale(...)");
        return scale;
    }

    public final double h(double d10) {
        return d10 / f191328i;
    }

    public final double i(double d10) {
        return d10 * f191328i;
    }

    @NotNull
    public final com.planner5d.library.model.metricunit.a j(int i10) {
        com.planner5d.library.model.metricunit.a[] aVarArr = this.f191331e;
        if (i10 >= aVarArr.length) {
            i10 = q(null);
        }
        return aVarArr[i10];
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Nullable
    public final Object k(@NotNull kotlin.coroutines.d<? super com.planner5d.library.model.metricunit.a> dVar) {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.f191335d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f191335d = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object objP = bVar.f191333b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = bVar.f191335d;
        if (i11 == 0) {
            ResultKt.m(objP);
            com.planner5d.library.model.manager.config.p pVar = this.f191330d;
            com.planner5d.library.services.r rVar = com.planner5d.library.services.r.metricUnit;
            int iQ = q(null);
            bVar.f191332a = this;
            bVar.f191335d = 1;
            objP = pVar.p(rVar, iQ, bVar);
            if (objP == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = (f2) bVar.f191332a;
            ResultKt.m(objP);
        }
        return this.j(((Number) objP).intValue());
    }

    @kotlin.l(message = "use coroutines", replaceWith = @kotlin.b1(expression = "get()", imports = {}))
    @NotNull
    public final com.planner5d.library.model.metricunit.a l() {
        return j(this.f191330d.l(com.planner5d.library.services.r.metricUnit, q(null)));
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0053  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0053 -> B:21:0x0055). Please report as a decompilation issue!!! */
    @androidx.annotation.m1
    @Nullable
    public final String m() {
        String lowerCase;
        String networkCountryIso;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) androidx.core.content.d.s(this.f191329c, TelephonyManager.class);
            if (telephonyManager != null) {
                String simCountryIso = telephonyManager.getSimCountryIso();
                if (simCountryIso != null && simCountryIso.length() == 2) {
                    Locale US = Locale.US;
                    Intrinsics.checkNotNullExpressionValue(US, "US");
                    lowerCase = simCountryIso.toLowerCase(US);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                } else if (telephonyManager.getPhoneType() == 2 || (networkCountryIso = telephonyManager.getNetworkCountryIso()) == null || networkCountryIso.length() != 2) {
                    lowerCase = null;
                } else {
                    Locale US2 = Locale.US;
                    Intrinsics.checkNotNullExpressionValue(US2, "US");
                    lowerCase = networkCountryIso.toLowerCase(US2);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                }
            } else {
                lowerCase = null;
            }
        } catch (Throwable th2) {
            timber.log.b.f381052a.e(th2);
        }
        if (lowerCase != null) {
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
            String upperCase = lowerCase.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            if (upperCase != null) {
                return upperCase;
            }
        }
        return Locale.getDefault().getCountry();
    }

    @NotNull
    public final com.planner5d.library.model.metricunit.a[] o() {
        return this.f191331e;
    }

    public final int p(@NotNull com.planner5d.library.model.metricunit.a model) {
        Integer next;
        Intrinsics.checkNotNullParameter(model, "model");
        Iterator<Integer> it = ArraysKt.getIndices(this.f191331e).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(this.f191331e[next.intValue()], model));
        Integer num = next;
        if (num != null) {
            return num.intValue();
        }
        throw new RuntimeException("Invalid unit of measurement");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b4, code lost:
    
        if (r4.t(r2, r10, r0) == r1) goto L31;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(@org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r11) {
        /*
            r10 = this;
            r9 = 1
            boolean r0 = r11 instanceof com.planner5d.library.model.manager.f2.c
            r9 = 5
            if (r0 == 0) goto L19
            r0 = r11
            r0 = r11
            com.planner5d.library.model.manager.f2$c r0 = (com.planner5d.library.model.manager.f2.c) r0
            int r1 = r0.f191341f
            r9 = 5
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            r9 = 5
            if (r3 == 0) goto L19
            int r1 = r1 - r2
            r9 = 7
            r0.f191341f = r1
            goto L1e
        L19:
            com.planner5d.library.model.manager.f2$c r0 = new com.planner5d.library.model.manager.f2$c
            r0.<init>(r11)
        L1e:
            java.lang.Object r11 = r0.f191339d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f191341f
            r3 = 3
            r9 = 7
            r4 = 2
            r5 = 3
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L5f
            r9 = 6
            if (r2 == r5) goto L57
            if (r2 == r4) goto L45
            r9 = 3
            if (r2 != r3) goto L3b
            kotlin.ResultKt.m(r11)
            goto Lb7
        L3b:
            r9 = 2
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            r9 = 0
            throw r10
        L45:
            r9 = 6
            java.lang.Object r10 = r0.f191338c
            com.planner5d.library.model.manager.f2 r10 = (com.planner5d.library.model.manager.f2) r10
            java.lang.Object r2 = r0.f191337b
            com.planner5d.library.services.r r2 = (com.planner5d.library.services.r) r2
            r9 = 7
            java.lang.Object r4 = r0.f191336a
            com.planner5d.library.model.manager.config.p r4 = (com.planner5d.library.model.manager.config.p) r4
            kotlin.ResultKt.m(r11)
            goto La1
        L57:
            java.lang.Object r10 = r0.f191336a
            com.planner5d.library.model.manager.f2 r10 = (com.planner5d.library.model.manager.f2) r10
            kotlin.ResultKt.m(r11)
            goto L71
        L5f:
            kotlin.ResultKt.m(r11)
            com.planner5d.library.model.manager.config.p r11 = r10.f191330d
            com.planner5d.library.services.r r2 = com.planner5d.library.services.r.metricUnit
            r0.f191336a = r10
            r0.f191341f = r5
            java.lang.Object r11 = r11.y(r2, r0)
            if (r11 != r1) goto L71
            goto Lb6
        L71:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            r9 = 7
            if (r11 != 0) goto Lba
            com.planner5d.library.model.manager.config.p r11 = r10.f191330d
            com.planner5d.library.services.r r2 = com.planner5d.library.services.r.metricUnit
            com.planner5d.library.services.utility.s r5 = com.planner5d.library.services.utility.s.f229729a
            kotlinx.coroutines.z1 r5 = r5.h()
            r9 = 1
            com.planner5d.library.model.manager.f2$d r7 = new com.planner5d.library.model.manager.f2$d
            r7.<init>(r6)
            r9 = 2
            r0.f191336a = r11
            r0.f191337b = r2
            r9 = 4
            r0.f191338c = r10
            r0.f191341f = r4
            r9 = 5
            java.lang.Object r4 = kotlinx.coroutines.i.h(r5, r7, r0)
            if (r4 != r1) goto L9d
            r9 = 4
            goto Lb6
        L9d:
            r8 = r4
            r8 = r4
            r4 = r11
            r11 = r8
        La1:
            r9 = 4
            java.lang.String r11 = (java.lang.String) r11
            int r10 = r10.q(r11)
            r0.f191336a = r6
            r0.f191337b = r6
            r0.f191338c = r6
            r0.f191341f = r3
            java.lang.Object r10 = r4.t(r2, r10, r0)
            if (r10 != r1) goto Lb7
        Lb6:
            return r1
        Lb7:
            kotlin.Unit r10 = kotlin.Unit.f312394a
            return r10
        Lba:
            kotlin.Unit r10 = kotlin.Unit.f312394a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.f2.r(kotlin.coroutines.d):java.lang.Object");
    }

    @Nullable
    public final Object u(@NotNull com.planner5d.library.model.metricunit.a aVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objT = this.f191330d.t(com.planner5d.library.services.r.metricUnit, p(aVar), dVar);
        return objT == kotlin.coroutines.intrinsics.b.l() ? objT : Unit.f312394a;
    }

    @kotlin.l(message = "use coroutines", replaceWith = @kotlin.b1(expression = "set(metricUnit: MetricUnit)", imports = {}))
    public final void v(@NotNull com.planner5d.library.model.metricunit.a metricUnit) {
        Intrinsics.checkNotNullParameter(metricUnit, "metricUnit");
        this.f191330d.g(com.planner5d.library.services.r.metricUnit, p(metricUnit));
    }

    public final float w(double d10, @NotNull com.planner5d.library.model.metricunit.a unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return (float) y(d10, unit);
    }

    @NotNull
    public final BigDecimal x(double d10, @NotNull com.planner5d.library.model.metricunit.a unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        BigDecimal scale = BigDecimal.valueOf(y(d10, unit)).setScale(2, RoundingMode.HALF_UP);
        Intrinsics.checkNotNullExpressionValue(scale, "setScale(...)");
        return scale;
    }
}
