package com.superwall.sdk.billing;

import com.superwall.sdk.logger.LogLevel;
import com.superwall.sdk.logger.LogScope;
import com.superwall.sdk.logger.Logger;
import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.g0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nBillingClientUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BillingClientUseCase.kt\ncom/superwall/sdk/billing/BillingClientUseCase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,168:1\n1#2:169\n*E\n"})
public abstract class BillingClientUseCase<T> {
    private final boolean backoffForNetworkErrors;

    @NotNull
    private final Function2<Long, Function1<? super BillingError, Unit>, Unit> executeRequestOnUIThread;
    private final int maxRetries;

    @NotNull
    private final Function1<BillingError, Unit> onError;
    private int retryAttempt;
    private long retryBackoffMilliseconds;

    @NotNull
    private final UseCaseParams useCaseParams;

    /* JADX INFO: renamed from: com.superwall.sdk.billing.BillingClientUseCase$processResult$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends g0 implements Function1<T, Unit> {
        AnonymousClass1(Object obj) {
            super(1, obj, BillingClientUseCase.class, "onOk", "onOk(Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2(obj);
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(T t10) {
            ((BillingClientUseCase) this.receiver).onOk(t10);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.billing.BillingClientUseCase$processResult$2, reason: invalid class name */
    /* synthetic */ class AnonymousClass2 extends g0 implements Function1<com.android.billingclient.api.n, Unit> {
        AnonymousClass2(Object obj) {
            super(1, obj, BillingClientUseCase.class, "forwardError", "forwardError(Lcom/android/billingclient/api/BillingResult;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(com.android.billingclient.api.n nVar) {
            invoke2(nVar);
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(com.android.billingclient.api.n p10) {
            Intrinsics.checkNotNullParameter(p10, "p0");
            ((BillingClientUseCase) this.receiver).forwardError(p10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BillingClientUseCase(@NotNull UseCaseParams useCaseParams, @NotNull Function1<? super BillingError, Unit> onError, @NotNull Function2<? super Long, ? super Function1<? super BillingError, Unit>, Unit> executeRequestOnUIThread) {
        Intrinsics.checkNotNullParameter(useCaseParams, "useCaseParams");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Intrinsics.checkNotNullParameter(executeRequestOnUIThread, "executeRequestOnUIThread");
        this.useCaseParams = useCaseParams;
        this.onError = onError;
        this.executeRequestOnUIThread = executeRequestOnUIThread;
        this.maxRetries = 3;
        this.retryBackoffMilliseconds = 878L;
    }

    private final void backoffOrErrorIfUseInSession(Function1<? super com.android.billingclient.api.n, Unit> function1, com.android.billingclient.api.n nVar) {
        if (!this.useCaseParams.getAppInBackground()) {
            Logger.debug$default(Logger.INSTANCE, LogLevel.error, LogScope.productsManager, "Billing is unavailable. App is in foreground. Won't retry.", null, null, 24, null);
            function1.invoke(nVar);
            return;
        }
        Logger.debug$default(Logger.INSTANCE, LogLevel.warn, LogScope.productsManager, "Billing is unavailable. App is in background, will retry with backoff.", null, null, 24, null);
        if (this.retryBackoffMilliseconds < 900000) {
            retryWithBackoff();
        } else {
            function1.invoke(nVar);
        }
    }

    private final void backoffOrRetryNetworkError(Function1<? super com.android.billingclient.api.n, Unit> function1, com.android.billingclient.api.n nVar) {
        int i10;
        if (getBackoffForNetworkErrors() && this.retryBackoffMilliseconds < 900000) {
            retryWithBackoff();
        } else if (getBackoffForNetworkErrors() || (i10 = this.retryAttempt) >= this.maxRetries) {
            function1.invoke(nVar);
        } else {
            this.retryAttempt = i10 + 1;
            executeAsync();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void forwardError(com.android.billingclient.api.n nVar) {
        String str = "Error loading products - DebugMessage: " + nVar.a() + " ErrorCode: " + nVar.b() + ".";
        BillingError.BillingNotAvailable billingNotAvailable = new BillingError.BillingNotAvailable(str);
        Logger.debug$default(Logger.INSTANCE, LogLevel.error, LogScope.productsManager, str, null, null, 24, null);
        this.onError.invoke(billingNotAvailable);
    }

    private final String getStackTrace() {
        StringWriter stringWriter = new StringWriter();
        new Throwable().printStackTrace(new PrintWriter(stringWriter));
        String string = stringWriter.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void processResult$default(BillingClientUseCase billingClientUseCase, com.android.billingclient.api.n nVar, Object obj, Function1 function1, Function1 function2, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: processResult");
        }
        if ((i10 & 4) != 0) {
            function1 = new AnonymousClass1(billingClientUseCase);
        }
        if ((i10 & 8) != 0) {
            function2 = new AnonymousClass2(billingClientUseCase);
        }
        billingClientUseCase.processResult(nVar, obj, function1, function2);
    }

    private final void retryWithBackoff() {
        long j10 = this.retryBackoffMilliseconds;
        this.retryBackoffMilliseconds = Math.min(((long) 2) * j10, 900000L);
        run(j10);
    }

    public static /* synthetic */ void run$default(BillingClientUseCase billingClientUseCase, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: run");
        }
        if ((i10 & 1) != 0) {
            j10 = 0;
        }
        billingClientUseCase.run(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit run$lambda$0(BillingClientUseCase billingClientUseCase, BillingError billingError) {
        if (billingError == null) {
            billingClientUseCase.executeAsync();
        } else {
            billingClientUseCase.onError.invoke(billingError);
        }
        return Unit.f312394a;
    }

    public abstract void executeAsync();

    protected boolean getBackoffForNetworkErrors() {
        return this.backoffForNetworkErrors;
    }

    @NotNull
    public final Function2<Long, Function1<? super BillingError, Unit>, Unit> getExecuteRequestOnUIThread() {
        return this.executeRequestOnUIThread;
    }

    public abstract void onOk(T t10);

    public final void processResult(@NotNull com.android.billingclient.api.n billingResult, T t10, @NotNull Function1<? super T, Unit> onSuccess, @NotNull Function1<? super com.android.billingclient.api.n, Unit> onError) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        int iB = billingResult.b();
        if (iB == -1) {
            Logger.debug$default(Logger.INSTANCE, LogLevel.error, LogScope.productsManager, "Billing Service disconnected.", null, null, 24, null);
            run$default(this, 0L, 1, null);
            return;
        }
        if (iB == 0) {
            this.retryBackoffMilliseconds = 878L;
            onSuccess.invoke(t10);
        } else if (iB == 2) {
            backoffOrErrorIfUseInSession(onError, billingResult);
        } else if (iB == 6 || iB == 12) {
            backoffOrRetryNetworkError(onError, billingResult);
        } else {
            onError.invoke(billingResult);
        }
    }

    public final void run(long j10) {
        this.executeRequestOnUIThread.invoke(Long.valueOf(j10), new Function1() { // from class: com.superwall.sdk.billing.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BillingClientUseCase.run$lambda$0(this.f267359a, (BillingError) obj);
            }
        });
    }

    protected final void withConnectedClient(@Nullable com.android.billingclient.api.h hVar, @NotNull Function1<? super com.android.billingclient.api.h, Unit> receivingFunction) {
        Intrinsics.checkNotNullParameter(receivingFunction, "receivingFunction");
        if (hVar != null) {
            if (!hVar.k()) {
                hVar = null;
            }
            if (hVar != null) {
                receivingFunction.invoke(hVar);
                return;
            }
        }
        Logger.debug$default(Logger.INSTANCE, LogLevel.warn, LogScope.productsManager, "Billing Service disconnected.  Stack trace: " + getStackTrace(), null, null, 24, null);
    }
}
