package com.appsflyer;

import com.appsflyer.internal.AFg1cSDK;
import com.appsflyer.internal.AFg1gSDK;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Unit;
import kotlin.b1;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import kotlin.l;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import oj.i;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nAFLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AFLogger.kt\ncom/appsflyer/AFLogger\n+ 2 StringExtensions.kt\ncom/appsflyer/internal/util/StringExtensionsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,285:1\n36#2:286\n36#2:287\n36#2:288\n36#2:289\n36#2:290\n1855#3,2:291\n*S KotlinDebug\n*F\n+ 1 AFLogger.kt\ncom/appsflyer/AFLogger\n*L\n184#1:286\n196#1:287\n215#1:288\n231#1:289\n250#1:290\n41#1:291,2\n*E\n"})
public final class AFLogger extends AFg1gSDK {

    @NotNull
    public static final AFLogger INSTANCE = new AFLogger();

    @NotNull
    private static final f0 getMediationNetwork = g0.c(AnonymousClass8.getMediationNetwork);

    @NotNull
    private static final f0 getRevenue = g0.c(AnonymousClass3.getMediationNetwork);

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$1, reason: invalid class name */
    static final class AnonymousClass1 extends l0 implements Function1<AFg1gSDK, Unit> {
        private /* synthetic */ String $getCurrencyIso4217Code;
        private /* synthetic */ AFg1cSDK $getMediationNetwork;
        private /* synthetic */ boolean $getRevenue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AFg1cSDK aFg1cSDK, String str, boolean z10) {
            super(1);
            this.$getMediationNetwork = aFg1cSDK;
            this.$getCurrencyIso4217Code = str;
            this.$getRevenue = z10;
        }

        public final void getRevenue(@NotNull AFg1gSDK aFg1gSDK) {
            Intrinsics.checkNotNullParameter(aFg1gSDK, "");
            aFg1gSDK.d(this.$getMediationNetwork, this.$getCurrencyIso4217Code, this.$getRevenue);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(AFg1gSDK aFg1gSDK) {
            getRevenue(aFg1gSDK);
            return Unit.f312394a;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$2, reason: invalid class name */
    static final class AnonymousClass2 extends l0 implements Function1<AFg1gSDK, Unit> {
        private /* synthetic */ String $AFAdRevenueData;
        private /* synthetic */ boolean $areAllFieldsValid;
        private /* synthetic */ boolean $component2;
        private /* synthetic */ Throwable $getCurrencyIso4217Code;
        private /* synthetic */ AFg1cSDK $getMediationNetwork;
        private /* synthetic */ boolean $getMonetizationNetwork;
        private /* synthetic */ boolean $getRevenue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(AFg1cSDK aFg1cSDK, String str, Throwable th2, boolean z10, boolean z11, boolean z12, boolean z13) {
            super(1);
            this.$getMediationNetwork = aFg1cSDK;
            this.$AFAdRevenueData = str;
            this.$getCurrencyIso4217Code = th2;
            this.$getRevenue = z10;
            this.$getMonetizationNetwork = z11;
            this.$areAllFieldsValid = z12;
            this.$component2 = z13;
        }

        public final void getRevenue(@NotNull AFg1gSDK aFg1gSDK) {
            Intrinsics.checkNotNullParameter(aFg1gSDK, "");
            aFg1gSDK.e(this.$getMediationNetwork, this.$AFAdRevenueData, this.$getCurrencyIso4217Code, this.$getRevenue, this.$getMonetizationNetwork, this.$areAllFieldsValid, this.$component2);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(AFg1gSDK aFg1gSDK) {
            getRevenue(aFg1gSDK);
            return Unit.f312394a;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$3, reason: invalid class name */
    static final class AnonymousClass3 extends l0 implements Function0<ExecutorService> {
        public static final AnonymousClass3 getMediationNetwork = new AnonymousClass3();

        AnonymousClass3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: getMonetizationNetwork, reason: merged with bridge method [inline-methods] */
        public final ExecutorService invoke() {
            return Executors.newSingleThreadExecutor();
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$4, reason: invalid class name */
    static final class AnonymousClass4 extends l0 implements Function1<AFg1gSDK, Unit> {
        private /* synthetic */ AFg1cSDK $getMediationNetwork;
        private /* synthetic */ String $getRevenue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(AFg1cSDK aFg1cSDK, String str) {
            super(1);
            this.$getMediationNetwork = aFg1cSDK;
            this.$getRevenue = str;
        }

        public final void getMediationNetwork(@NotNull AFg1gSDK aFg1gSDK) {
            Intrinsics.checkNotNullParameter(aFg1gSDK, "");
            aFg1gSDK.force(this.$getMediationNetwork, this.$getRevenue);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(AFg1gSDK aFg1gSDK) {
            getMediationNetwork(aFg1gSDK);
            return Unit.f312394a;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$5, reason: invalid class name */
    static final class AnonymousClass5 extends l0 implements Function1<AFg1gSDK, Unit> {
        private /* synthetic */ AFg1cSDK $getCurrencyIso4217Code;
        private /* synthetic */ boolean $getMonetizationNetwork;
        private /* synthetic */ String $getRevenue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(AFg1cSDK aFg1cSDK, String str, boolean z10) {
            super(1);
            this.$getCurrencyIso4217Code = aFg1cSDK;
            this.$getRevenue = str;
            this.$getMonetizationNetwork = z10;
        }

        public final void AFAdRevenueData(@NotNull AFg1gSDK aFg1gSDK) {
            Intrinsics.checkNotNullParameter(aFg1gSDK, "");
            aFg1gSDK.i(this.$getCurrencyIso4217Code, this.$getRevenue, this.$getMonetizationNetwork);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(AFg1gSDK aFg1gSDK) {
            AFAdRevenueData(aFg1gSDK);
            return Unit.f312394a;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$6, reason: invalid class name */
    static final class AnonymousClass6 extends l0 implements Function1<AFg1gSDK, Unit> {
        private /* synthetic */ AFg1cSDK $getMediationNetwork;
        private /* synthetic */ boolean $getMonetizationNetwork;
        private /* synthetic */ String $getRevenue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass6(AFg1cSDK aFg1cSDK, String str, boolean z10) {
            super(1);
            this.$getMediationNetwork = aFg1cSDK;
            this.$getRevenue = str;
            this.$getMonetizationNetwork = z10;
        }

        public final void getMonetizationNetwork(@NotNull AFg1gSDK aFg1gSDK) {
            Intrinsics.checkNotNullParameter(aFg1gSDK, "");
            aFg1gSDK.v(this.$getMediationNetwork, this.$getRevenue, this.$getMonetizationNetwork);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(AFg1gSDK aFg1gSDK) {
            getMonetizationNetwork(aFg1gSDK);
            return Unit.f312394a;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$8, reason: invalid class name */
    static final class AnonymousClass8 extends l0 implements Function0<Set<AFg1gSDK>> {
        public static final AnonymousClass8 getMediationNetwork = new AnonymousClass8();

        AnonymousClass8() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
        public final Set<AFg1gSDK> invoke() {
            return Collections.synchronizedSet(new LinkedHashSet());
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$9, reason: invalid class name */
    static final class AnonymousClass9 extends l0 implements Function1<AFg1gSDK, Unit> {
        private /* synthetic */ boolean $AFAdRevenueData;
        private /* synthetic */ String $getMonetizationNetwork;
        private /* synthetic */ AFg1cSDK $getRevenue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass9(AFg1cSDK aFg1cSDK, String str, boolean z10) {
            super(1);
            this.$getRevenue = aFg1cSDK;
            this.$getMonetizationNetwork = str;
            this.$AFAdRevenueData = z10;
        }

        public final void getCurrencyIso4217Code(@NotNull AFg1gSDK aFg1gSDK) {
            Intrinsics.checkNotNullParameter(aFg1gSDK, "");
            aFg1gSDK.w(this.$getRevenue, this.$getMonetizationNetwork, this.$AFAdRevenueData);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(AFg1gSDK aFg1gSDK) {
            getCurrencyIso4217Code(aFg1gSDK);
            return Unit.f312394a;
        }
    }

    public enum LogLevel {
        NONE(0),
        ERROR(1),
        WARNING(2),
        INFO(3),
        DEBUG(4),
        VERBOSE(5);

        private final int level;

        LogLevel(int i10) {
            this.level = i10;
        }

        @i(name = "getLevel")
        public final int getLevel() {
            return this.level;
        }
    }

    private AFLogger() {
    }

    @n
    @l(level = kotlin.n.WARNING, message = "Deprecated since v6.13.0", replaceWith = @b1(expression = "AFLogger.d()", imports = {}))
    public static final void afDebugLog(@NotNull String str, boolean z10) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.d(AFg1cSDK.OTHER, str, z10);
    }

    @n
    @l(level = kotlin.n.WARNING, message = "Deprecated since v6.13.0", replaceWith = @b1(expression = "AFLogger.e()", imports = {}))
    public static final void afErrorLog(@NotNull String str, @NotNull Throwable th2, boolean z10, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th2, "");
        AFg1gSDK.e$default(INSTANCE, AFg1cSDK.OTHER, str, th2, z10, z11, z12, false, 64, null);
    }

    @n
    @l(level = kotlin.n.WARNING, message = "Deprecated since v6.13.0", replaceWith = @b1(expression = "AFLogger.e()", imports = {}))
    public static final void afErrorLogForExcManagerOnly(@Nullable String str, @Nullable Throwable th2) {
        AFLogger aFLogger = INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
        if (str == null || StringsKt.w3(str)) {
            str = AbstractJsonLexerKt.NULL;
        }
        String str2 = str;
        if (th2 == null) {
            th2 = new NullPointerException("Invoked with null Throwable");
        }
        AFg1gSDK.e$default(aFLogger, aFg1cSDK, str2, th2, false, false, true, false, 64, null);
    }

    @n
    @l(level = kotlin.n.WARNING, message = "Deprecated since v6.13.0", replaceWith = @b1(expression = "AFLogger.i()", imports = {}))
    public static final void afInfoLog(@NotNull String str, boolean z10) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.i(AFg1cSDK.OTHER, str, z10);
    }

    @n
    @l(level = kotlin.n.WARNING, message = "Deprecated since v6.13.0", replaceWith = @b1(expression = "AFLogger.force()", imports = {}))
    public static final void afLogForce(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.force(AFg1cSDK.OTHER, str);
    }

    @n
    @l(level = kotlin.n.WARNING, message = "Deprecated since v6.13.0", replaceWith = @b1(expression = "AFLogger.v()", imports = {}))
    public static final void afRDLog(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.v(AFg1cSDK.OTHER, str, true);
    }

    @n
    @l(level = kotlin.n.WARNING, message = "Deprecated since v6.13.0", replaceWith = @b1(expression = "AFLogger.v()", imports = {}))
    public static final void afVerboseLog(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.v(AFg1cSDK.OTHER, str, false);
    }

    @n
    @l(level = kotlin.n.WARNING, message = "Deprecated since v6.13.0", replaceWith = @b1(expression = "AFLogger.w()", imports = {}))
    public static final void afWarnLog(@NotNull String str, boolean z10) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.w(AFg1cSDK.OTHER, str, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getCurrencyIso4217Code(AFg1gSDK[] aFg1gSDKArr) {
        Intrinsics.checkNotNullParameter(aFg1gSDKArr, "");
        f0 f0Var = getMediationNetwork;
        Object value = f0Var.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        synchronized (((Set) value)) {
            Object value2 = f0Var.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "");
            ((Set) value2).removeAll(ArraysKt.toSet(aFg1gSDKArr));
            Unit unit = Unit.f312394a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMediationNetwork(AFg1gSDK[] aFg1gSDKArr) {
        Intrinsics.checkNotNullParameter(aFg1gSDKArr, "");
        f0 f0Var = getMediationNetwork;
        Object value = f0Var.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        synchronized (((Set) value)) {
            try {
                Object value2 = f0Var.getValue();
                Intrinsics.checkNotNullExpressionValue(value2, "");
                CollectionsKt.addAll((Set) value2, aFg1gSDKArr);
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void d(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, boolean z10) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        ((ExecutorService) getRevenue.getValue()).execute(new a(new AnonymousClass1(aFg1cSDK, str, z10)));
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void e(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, @NotNull Throwable th2, boolean z10, boolean z11, boolean z12, boolean z13) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th2, "");
        ((ExecutorService) getRevenue.getValue()).execute(new a(new AnonymousClass2(aFg1cSDK, str, th2, z10, z11, z12, z13)));
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void force(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        ((ExecutorService) getRevenue.getValue()).execute(new a(new AnonymousClass4(aFg1cSDK, str)));
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void i(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, boolean z10) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        ((ExecutorService) getRevenue.getValue()).execute(new a(new AnonymousClass5(aFg1cSDK, str, z10)));
    }

    public final void registerClient(@NotNull final AFg1gSDK... aFg1gSDKArr) {
        Intrinsics.checkNotNullParameter(aFg1gSDKArr, "");
        ((ExecutorService) getRevenue.getValue()).execute(new Runnable() { // from class: com.appsflyer.b
            @Override // java.lang.Runnable
            public final void run() {
                AFLogger.getMediationNetwork(aFg1gSDKArr);
            }
        });
    }

    public final void unregisterClient(@NotNull final AFg1gSDK... aFg1gSDKArr) {
        Intrinsics.checkNotNullParameter(aFg1gSDKArr, "");
        ((ExecutorService) getRevenue.getValue()).execute(new Runnable() { // from class: com.appsflyer.c
            @Override // java.lang.Runnable
            public final void run() {
                AFLogger.getCurrencyIso4217Code(aFg1gSDKArr);
            }
        });
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void v(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, boolean z10) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        ((ExecutorService) getRevenue.getValue()).execute(new a(new AnonymousClass6(aFg1cSDK, str, z10)));
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void w(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, boolean z10) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        ((ExecutorService) getRevenue.getValue()).execute(new a(new AnonymousClass9(aFg1cSDK, str, z10)));
    }

    @n
    @l(level = kotlin.n.WARNING, message = "Deprecated since v6.13.0", replaceWith = @b1(expression = "AFLogger.d()", imports = {}))
    public static final void afDebugLog(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.d(AFg1cSDK.OTHER, str, true);
    }

    @n
    @l(level = kotlin.n.WARNING, message = "Deprecated since v6.13.0", replaceWith = @b1(expression = "AFLogger.i()", imports = {}))
    public static final void afInfoLog(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.i(AFg1cSDK.OTHER, str, true);
    }

    @n
    @l(level = kotlin.n.WARNING, message = "Deprecated since v6.13.0", replaceWith = @b1(expression = "AFLogger.w()", imports = {}))
    public static final void afWarnLog(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AFg1gSDK.w$default(INSTANCE, AFg1cSDK.OTHER, str, false, 4, null);
    }

    @n
    @l(level = kotlin.n.WARNING, message = "Deprecated since v6.13.0", replaceWith = @b1(expression = "AFLogger.e()", imports = {}))
    public static final void afErrorLog(@Nullable String str, @Nullable Throwable th2) {
        AFLogger aFLogger = INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
        if (str == null || StringsKt.w3(str)) {
            str = AbstractJsonLexerKt.NULL;
        }
        String str2 = str;
        if (th2 == null) {
            th2 = new NullPointerException("Invoked with null Throwable");
        }
        AFg1gSDK.e$default(aFLogger, aFg1cSDK, str2, th2, false, false, false, false, 120, null);
    }

    @n
    @l(level = kotlin.n.WARNING, message = "Deprecated since v6.13.0", replaceWith = @b1(expression = "AFLogger.e()", imports = {}))
    public static final void afErrorLogForExcManagerOnly(@Nullable String str, @Nullable Throwable th2, boolean z10) {
        AFLogger aFLogger = INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
        if (str == null || StringsKt.w3(str)) {
            str = AbstractJsonLexerKt.NULL;
        }
        String str2 = str;
        if (th2 == null) {
            th2 = new NullPointerException("Invoked with null Throwable");
        }
        AFg1gSDK.e$default(aFLogger, aFg1cSDK, str2, th2, false, false, !z10, false, 64, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMediationNetwork(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        f0 f0Var = getMediationNetwork;
        Object value = f0Var.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        synchronized (((Set) value)) {
            try {
                Object value2 = f0Var.getValue();
                Intrinsics.checkNotNullExpressionValue(value2, "");
                Iterator it = ((Set) value2).iterator();
                while (it.hasNext()) {
                    function1.invoke((AFg1gSDK) it.next());
                }
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @n
    @l(level = kotlin.n.WARNING, message = "Deprecated since v6.13.0", replaceWith = @b1(expression = "AFLogger.e()", imports = {}))
    public static final void afErrorLog(@Nullable String str, @Nullable Throwable th2, boolean z10) {
        AFLogger aFLogger = INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
        if (str == null || StringsKt.w3(str)) {
            str = AbstractJsonLexerKt.NULL;
        }
        String str2 = str;
        if (th2 == null) {
            th2 = new NullPointerException("Invoked with null Throwable");
        }
        AFg1gSDK.e$default(aFLogger, aFg1cSDK, str2, th2, false, z10, false, false, 104, null);
    }

    @n
    @l(level = kotlin.n.WARNING, message = "Deprecated since v6.13.0", replaceWith = @b1(expression = "AFLogger.e()", imports = {}))
    public static final void afErrorLog(@Nullable String str, @Nullable Throwable th2, boolean z10, boolean z11) {
        AFLogger aFLogger = INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
        if (str == null || StringsKt.w3(str)) {
            str = AbstractJsonLexerKt.NULL;
        }
        String str2 = str;
        if (th2 == null) {
            th2 = new NullPointerException("Invoked with null Throwable");
        }
        AFg1gSDK.e$default(aFLogger, aFg1cSDK, str2, th2, false, z10, z11, false, 72, null);
    }
}
