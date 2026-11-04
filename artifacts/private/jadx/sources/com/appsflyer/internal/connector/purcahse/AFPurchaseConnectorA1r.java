package com.appsflyer.internal.connector.purcahse;

import com.appsflyer.api.InAppPurchaseEvent;
import com.appsflyer.api.SubscriptionPurchaseEvent;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface AFPurchaseConnectorA1r {

    public interface AFPurchaseConnectorA1v {
        void getPackageName(List<InAppPurchaseEvent> list);

        void getQuantity(List<SubscriptionPurchaseEvent> list);

        void toJsonMap(List<SubscriptionPurchaseEvent> list);
    }

    public interface AFPurchaseConnectorA1x<StoreClient> {
    }

    void InAppPurchaseEvent();

    boolean getPackageName();

    void getQuantity(AFPurchaseConnectorA1v aFPurchaseConnectorA1v);

    void toJsonMap();
}
