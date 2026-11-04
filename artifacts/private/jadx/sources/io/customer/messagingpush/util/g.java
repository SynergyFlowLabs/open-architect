package io.customer.messagingpush.util;

import android.os.Bundle;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public interface g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f288475a = a.f288478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final String f288476b = "CIO-Delivery-ID";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String f288477c = "CIO-Delivery-Token";

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f288478a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final String f288479b = "CIO-Delivery-ID";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final String f288480c = "CIO-Delivery-Token";

        private a() {
        }
    }

    boolean a(@NotNull Bundle bundle);
}
