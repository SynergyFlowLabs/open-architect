package com.facebook.appevents.cloudbridge;

import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public enum i {
    VALUE_TO_SUM("value"),
    EVENT_TIME("event_time"),
    EVENT_NAME("event_name"),
    CONTENT_IDS("content_ids"),
    CONTENTS("contents"),
    CONTENT_TYPE("content_type"),
    DESCRIPTION("description"),
    LEVEL("level"),
    MAX_RATING_VALUE("max_rating_value"),
    NUM_ITEMS("num_items"),
    PAYMENT_INFO_AVAILABLE("payment_info_available"),
    REGISTRATION_METHOD("registration_method"),
    SEARCH_STRING("search_string"),
    SUCCESS("success"),
    ORDER_ID(com.planner5d.library.model.manager.statistics.appsflyer.d.a.f202886b),
    AD_TYPE("ad_type"),
    CURRENCY("currency");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f98692a;

    static {
        int i10 = 2 & 5;
    }

    i(String str) {
        this.f98692a = str;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static i[] valuesCustom() {
        i[] iVarArrValuesCustom = values();
        return (i[]) Arrays.copyOf(iVarArrValuesCustom, iVarArrValuesCustom.length);
    }

    @NotNull
    public final String l() {
        return this.f98692a;
    }
}
