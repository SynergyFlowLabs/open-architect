package com.appsflyer.api;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.l1;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.exceptions.SDKMissingException;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1r;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1u;
import com.appsflyer.internal.models.InAppPurchaseValidationResult;
import com.appsflyer.internal.models.SubscriptionValidationResult;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import oj.i;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface PurchaseClient {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Builder {

        @Nullable
        private AppsFlyerLib afClient;

        @Nullable
        private AFPurchaseConnectorA1r.AFPurchaseConnectorA1x<?> billingClientFactory;

        @Nullable
        private AFPurchaseConnectorA1r connector;

        @NotNull
        private final Context context;

        @Nullable
        private InAppPurchaseEventDataSource inAppPurchaseEventDataSource;

        @Nullable
        private InAppPurchaseValidationResultListener inAppValidationResultListener;

        @NotNull
        private final Set<String> purchaseTypes;
        private boolean sandbox;

        @NotNull
        private final Store store;

        @Nullable
        private SubscriptionPurchaseEventDataSource subscriptionPurchaseEventDataSource;

        @Nullable
        private SubscriptionPurchaseValidationResultListener subscriptionValidationResultListener;

        public /* synthetic */ class AFPurchaseConnectorA1z {
            public static final /* synthetic */ int[] getOneTimePurchaseOfferDetails;

            static {
                int[] iArr = new int[Store.values().length];
                try {
                    iArr[Store.GOOGLE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                getOneTimePurchaseOfferDetails = iArr;
            }
        }

        public Builder(@NotNull Context context, @NotNull Store store) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(store, "");
            this.store = store;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "");
            this.context = applicationContext;
            this.purchaseTypes = new HashSet();
        }

        @NotNull
        public final Builder autoLogInApps(boolean z10) {
            if (z10) {
                this.purchaseTypes.add("inapp");
                return this;
            }
            this.purchaseTypes.remove("inapp");
            return this;
        }

        @NotNull
        public final PurchaseClient build() throws Throwable {
            try {
                if (this.afClient == null) {
                    this.afClient = AppsFlyerLib.getInstance();
                }
                if (AFPurchaseConnectorA1z.getOneTimePurchaseOfferDetails[this.store.ordinal()] == 1 && this.connector == null) {
                    Context context = this.context;
                    AFPurchaseConnectorA1u.AFPurchaseConnectorA1v aFPurchaseConnectorA1v = (AFPurchaseConnectorA1u.AFPurchaseConnectorA1v) this.billingClientFactory;
                    try {
                        Object[] objArr = {context};
                        Map<Integer, Object> map = com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1z.setSubscriptionPurchaseEventDataSource;
                        Object method = map.get(2053959550);
                        if (method == null) {
                            method = ((Class) com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1z.InAppPurchaseEvent(70 - Color.argb(0, 0, 0, 0), 70 - TextUtils.getOffsetAfter("", 0), (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))))).getMethod("getOneTimePurchaseOfferDetails", Context.class);
                            map.put(2053959550, method);
                        }
                        this.connector = new AFPurchaseConnectorA1u(context, aFPurchaseConnectorA1v, (SharedPreferences) ((Method) method).invoke(null, objArr));
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th2;
                    }
                }
                Context context2 = this.context;
                boolean z10 = this.sandbox;
                AFPurchaseConnectorA1r aFPurchaseConnectorA1r = this.connector;
                Intrinsics.checkNotNull(aFPurchaseConnectorA1r);
                Set<String> set = this.purchaseTypes;
                SubscriptionPurchaseValidationResultListener subscriptionPurchaseValidationResultListener = this.subscriptionValidationResultListener;
                InAppPurchaseValidationResultListener inAppPurchaseValidationResultListener = this.inAppValidationResultListener;
                SubscriptionPurchaseEventDataSource subscriptionPurchaseEventDataSource = this.subscriptionPurchaseEventDataSource;
                InAppPurchaseEventDataSource inAppPurchaseEventDataSource = this.inAppPurchaseEventDataSource;
                AppsFlyerLib appsFlyerLib = this.afClient;
                Intrinsics.checkNotNull(appsFlyerLib);
                try {
                    Object[] objArr2 = {context2, Boolean.valueOf(z10), aFPurchaseConnectorA1r, set, subscriptionPurchaseValidationResultListener, inAppPurchaseValidationResultListener, subscriptionPurchaseEventDataSource, inAppPurchaseEventDataSource, appsFlyerLib};
                    Map<Integer, Object> map2 = com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1z.setSubscriptionPurchaseEventDataSource;
                    Object declaredConstructor = map2.get(-1888424078);
                    if (declaredConstructor == null) {
                        declaredConstructor = ((Class) com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1z.InAppPurchaseEvent(70 - (ViewConfiguration.getPressedStateDuration() >> 16), View.MeasureSpec.getSize(0), (char) (4390 - (ViewConfiguration.getLongPressTimeout() >> 16)))).getDeclaredConstructor(Context.class, Boolean.TYPE, AFPurchaseConnectorA1r.class, Set.class, SubscriptionPurchaseValidationResultListener.class, InAppPurchaseValidationResultListener.class, SubscriptionPurchaseEventDataSource.class, InAppPurchaseEventDataSource.class, AppsFlyerLib.class);
                        map2.put(-1888424078, declaredConstructor);
                    }
                    return (PurchaseClient) ((Constructor) declaredConstructor).newInstance(objArr2);
                } catch (Throwable th3) {
                    Throwable cause2 = th3.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th3;
                }
            } catch (NoClassDefFoundError e10) {
                e10.printStackTrace();
                throw new SDKMissingException();
            }
        }

        @NotNull
        public final Builder logSubscriptions(boolean z10) {
            if (z10) {
                this.purchaseTypes.add("subs");
                return this;
            }
            this.purchaseTypes.remove("subs");
            return this;
        }

        @l1
        @NotNull
        public final Builder setAfClient(@Nullable AppsFlyerLib appsFlyerLib) {
            this.afClient = appsFlyerLib;
            return this;
        }

        @l1
        @NotNull
        public final Builder setBillingClientFactory(@Nullable AFPurchaseConnectorA1r.AFPurchaseConnectorA1x<?> aFPurchaseConnectorA1x) {
            this.billingClientFactory = aFPurchaseConnectorA1x;
            return this;
        }

        @l1
        @NotNull
        public final Builder setConnector(@Nullable AFPurchaseConnectorA1r aFPurchaseConnectorA1r) {
            this.connector = aFPurchaseConnectorA1r;
            return this;
        }

        @NotNull
        public final Builder setInAppPurchaseEventDataSource(@Nullable InAppPurchaseEventDataSource inAppPurchaseEventDataSource) {
            this.inAppPurchaseEventDataSource = inAppPurchaseEventDataSource;
            return this;
        }

        @NotNull
        public final Builder setInAppValidationResultListener(@Nullable InAppPurchaseValidationResultListener inAppPurchaseValidationResultListener) {
            this.inAppValidationResultListener = inAppPurchaseValidationResultListener;
            return this;
        }

        @NotNull
        public final Builder setSandbox(boolean z10) {
            this.sandbox = z10;
            return this;
        }

        @NotNull
        public final Builder setSubscriptionPurchaseEventDataSource(@Nullable SubscriptionPurchaseEventDataSource subscriptionPurchaseEventDataSource) {
            this.subscriptionPurchaseEventDataSource = subscriptionPurchaseEventDataSource;
            return this;
        }

        @NotNull
        public final Builder setSubscriptionValidationResultListener(@Nullable SubscriptionPurchaseValidationResultListener subscriptionPurchaseValidationResultListener) {
            this.subscriptionValidationResultListener = subscriptionPurchaseValidationResultListener;
            return this;
        }
    }

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final String VERSION_NAME = "2.0.1";

        private Companion() {
        }

        @n
        public static /* synthetic */ void getVERSION_NAME$annotations() {
        }

        @i(name = "getVERSION_NAME")
        @NotNull
        public final String getVERSION_NAME() {
            return VERSION_NAME;
        }
    }

    public interface InAppPurchaseEventDataSource extends PurchaseEventDataSource<InAppPurchaseEvent> {
    }

    public interface InAppPurchaseValidationResultListener extends ValidationResultListener<Map<String, ? extends InAppPurchaseValidationResult>> {
    }

    public interface PurchaseEventDataSource<PurchaseType extends PurchaseEvent> {
        @NotNull
        Map<String, Object> onNewPurchases(@NotNull List<? extends PurchaseType> list);
    }

    public interface SubscriptionPurchaseEventDataSource extends PurchaseEventDataSource<SubscriptionPurchaseEvent> {
    }

    public interface SubscriptionPurchaseValidationResultListener extends ValidationResultListener<Map<String, ? extends SubscriptionValidationResult>> {
    }

    public interface ValidationResultListener<Result> {
        void onFailure(@NotNull String str, @Nullable Throwable th2);

        void onResponse(@Nullable Result result);
    }

    @NotNull
    static String getVERSION_NAME() {
        return Companion.getVERSION_NAME();
    }

    void startObservingTransactions();

    void stopObservingTransactions();
}
