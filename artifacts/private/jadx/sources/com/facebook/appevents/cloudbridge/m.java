package com.facebook.appevents.cloudbridge;

import com.facebook.appevents.p;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public enum m {
    EVENT_TIME(com.facebook.appevents.internal.j.f99026b),
    EVENT_NAME(com.facebook.appevents.internal.j.f99027c),
    VALUE_TO_SUM(p.f99195g0),
    CONTENT_IDS(p.R),
    CONTENTS(p.Q),
    CONTENT_TYPE(p.P),
    DESCRIPTION(p.Y),
    LEVEL(p.X),
    MAX_RATING_VALUE(p.U),
    NUM_ITEMS(p.W),
    PAYMENT_INFO_AVAILABLE(p.V),
    REGISTRATION_METHOD(p.O),
    SEARCH_STRING(p.S),
    SUCCESS(p.T),
    ORDER_ID(p.f99193f0),
    AD_TYPE("ad_type"),
    CURRENCY(p.N);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f98734b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f98752a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final m a(@NotNull String rawValue) {
            Intrinsics.checkNotNullParameter(rawValue, "rawValue");
            for (m mVar : m.valuesCustom()) {
                if (Intrinsics.areEqual(mVar.l(), rawValue)) {
                    return mVar;
                }
            }
            return null;
        }

        private a() {
        }
    }

    static {
        int i10 = 5 << 4;
    }

    m(String str) {
        this.f98752a = str;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static m[] valuesCustom() {
        m[] mVarArrValuesCustom = values();
        return (m[]) Arrays.copyOf(mVarArrValuesCustom, mVarArrValuesCustom.length);
    }

    @NotNull
    public final String l() {
        return this.f98752a;
    }
}
