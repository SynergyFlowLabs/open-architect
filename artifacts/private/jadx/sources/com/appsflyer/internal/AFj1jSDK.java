package com.appsflyer.internal;

import android.content.Intent;
import android.os.Parcelable;
import com.appsflyer.AFLogger;
import java.util.ConcurrentModificationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nAFIntentWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AFIntentWrapper.kt\ncom/appsflyer/internal/util/AFIntentWrapper\n+ 2 MultiCatch.kt\ncom/appsflyer/internal/util/MultiCatchKt\n*L\n1#1,111:1\n16#2,7:112\n*S KotlinDebug\n*F\n+ 1 AFIntentWrapper.kt\ncom/appsflyer/internal/util/AFIntentWrapper\n*L\n84#1:112,7\n*E\n"})
public final class AFj1jSDK {

    @NotNull
    final Intent getCurrencyIso4217Code;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.appsflyer.internal.AFj1jSDK$1, reason: invalid class name */
    static final class AnonymousClass1<T> extends kotlin.jvm.internal.l0 implements Function0<T> {
        private /* synthetic */ String $getCurrencyIso4217Code;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(String str) {
            super(0);
            this.$getCurrencyIso4217Code = str;
        }

        /* JADX WARN: Incorrect return type in method signature: ()TT; */
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: J_, reason: merged with bridge method [inline-methods] */
        public final Parcelable invoke() {
            return AFj1jSDK.this.getCurrencyIso4217Code.getParcelableExtra(this.$getCurrencyIso4217Code);
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFj1jSDK$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.jvm.internal.l0 implements Function0<String> {
        private /* synthetic */ String $getCurrencyIso4217Code;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str) {
            super(0);
            this.$getCurrencyIso4217Code = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return AFj1jSDK.this.getCurrencyIso4217Code.getStringExtra(this.$getCurrencyIso4217Code);
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFj1jSDK$3, reason: invalid class name */
    static final class AnonymousClass3 extends kotlin.jvm.internal.l0 implements Function0<Intent> {
        private /* synthetic */ String $getMonetizationNetwork;
        private /* synthetic */ long $getRevenue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(String str, long j10) {
            super(0);
            this.$getMonetizationNetwork = str;
            this.$getRevenue = j10;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: K_, reason: merged with bridge method [inline-methods] */
        public final Intent invoke() {
            return AFj1jSDK.this.getCurrencyIso4217Code.putExtra(this.$getMonetizationNetwork, this.$getRevenue);
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFj1jSDK$5, reason: invalid class name */
    static final class AnonymousClass5 extends kotlin.jvm.internal.l0 implements Function0<Boolean> {
        private /* synthetic */ String $getMediationNetwork;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(String str) {
            super(0);
            this.$getMediationNetwork = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(AFj1jSDK.this.getCurrencyIso4217Code.hasExtra(this.$getMediationNetwork));
        }
    }

    public AFj1jSDK(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        this.getCurrencyIso4217Code = intent;
    }

    @Nullable
    public final <T extends Parcelable> T H_(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (T) getMonetizationNetwork(new AnonymousClass1(str), "Error while trying to read " + str + " extra from intent", null, true);
    }

    @Nullable
    public final Intent I_(@NotNull String str, long j10) {
        Intrinsics.checkNotNullParameter(str, "");
        return (Intent) getMonetizationNetwork(new AnonymousClass3(str, j10), "Error while trying to write " + str + " extra to intent", null, true);
    }

    public final boolean getMonetizationNetwork(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Boolean bool = (Boolean) getMonetizationNetwork(new AnonymousClass5(str), "Error while trying to check presence of " + str + " extra from intent", Boolean.TRUE, true);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    @Nullable
    public final String getRevenue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (String) getMonetizationNetwork(new AnonymousClass2(str), "Error while trying to read " + str + " extra from intent", null, true);
    }

    private final <T> T getMonetizationNetwork(Function0<? extends T> function0, String str, T t10, boolean z10) {
        Object objM785constructorimpl;
        Object objM785constructorimpl2;
        Object monetizationNetwork;
        synchronized (this.getCurrencyIso4217Code) {
            try {
                try {
                    Result.a aVar = Result.Companion;
                    objM785constructorimpl = Result.m785constructorimpl(function0.invoke());
                } catch (Throwable th2) {
                    Result.a aVar2 = Result.Companion;
                    objM785constructorimpl = Result.m785constructorimpl(ResultKt.createFailure(th2));
                }
                kotlin.reflect.d[] dVarArr = {j1.d(ConcurrentModificationException.class), j1.d(ArrayIndexOutOfBoundsException.class)};
                Throwable thD = Result.d(objM785constructorimpl);
                if (thD != null) {
                    try {
                        Result.a aVar3 = Result.Companion;
                        if (ArraysKt.contains(dVarArr, j1.d(thD.getClass()))) {
                            if (z10) {
                                monetizationNetwork = getMonetizationNetwork(function0, str, t10, false);
                            } else {
                                AFLogger.afErrorLog(str, thD, false, false);
                                monetizationNetwork = t10;
                            }
                            objM785constructorimpl2 = Result.m785constructorimpl(monetizationNetwork);
                            objM785constructorimpl = objM785constructorimpl2;
                        } else {
                            throw thD;
                        }
                    } catch (Throwable th3) {
                        Result.a aVar4 = Result.Companion;
                        objM785constructorimpl2 = Result.m785constructorimpl(ResultKt.createFailure(th3));
                    }
                }
                Throwable thD2 = Result.d(objM785constructorimpl);
                if (thD2 == null) {
                    t10 = (T) objM785constructorimpl;
                } else {
                    AFLogger.afErrorLog(str, thD2, false, false);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return t10;
    }
}
