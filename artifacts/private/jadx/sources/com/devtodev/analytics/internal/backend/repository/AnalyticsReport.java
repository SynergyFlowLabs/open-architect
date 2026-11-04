package com.devtodev.analytics.internal.backend.repository;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AnalyticsReport {

    public static final class Error extends AnalyticsReport {

        @NotNull
        public static final Error INSTANCE = new Error();

        private Error() {
            super(null);
        }
    }

    public static final class Success extends AnalyticsReport {

        @NotNull
        public static final Success INSTANCE = new Success();

        private Success() {
            super(null);
        }
    }

    public /* synthetic */ AnalyticsReport(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AnalyticsReport() {
    }
}
