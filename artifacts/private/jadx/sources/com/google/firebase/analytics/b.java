package com.google.firebase.analytics;

import androidx.annotation.p0;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private FirebaseAnalytics.a f120688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private FirebaseAnalytics.a f120689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private FirebaseAnalytics.a f120690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private FirebaseAnalytics.a f120691d;

    @NotNull
    public final Map<FirebaseAnalytics.b, FirebaseAnalytics.a> a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        FirebaseAnalytics.a aVar = this.f120688a;
        if (aVar != null) {
            linkedHashMap.put(FirebaseAnalytics.b.AD_STORAGE, aVar);
        }
        FirebaseAnalytics.a aVar2 = this.f120689b;
        if (aVar2 != null) {
            linkedHashMap.put(FirebaseAnalytics.b.ANALYTICS_STORAGE, aVar2);
        }
        FirebaseAnalytics.a aVar3 = this.f120690c;
        if (aVar3 != null) {
            linkedHashMap.put(FirebaseAnalytics.b.AD_USER_DATA, aVar3);
        }
        FirebaseAnalytics.a aVar4 = this.f120691d;
        if (aVar4 != null) {
            linkedHashMap.put(FirebaseAnalytics.b.AD_PERSONALIZATION, aVar4);
        }
        return linkedHashMap;
    }

    @p0
    public final FirebaseAnalytics.a b() {
        return this.f120691d;
    }

    @p0
    public final FirebaseAnalytics.a c() {
        return this.f120688a;
    }

    @p0
    public final FirebaseAnalytics.a d() {
        return this.f120690c;
    }

    @p0
    public final FirebaseAnalytics.a e() {
        return this.f120689b;
    }

    public final void f(@Nullable FirebaseAnalytics.a aVar) {
        this.f120691d = aVar;
    }

    public final void g(@Nullable FirebaseAnalytics.a aVar) {
        this.f120688a = aVar;
    }

    public final void h(@Nullable FirebaseAnalytics.a aVar) {
        this.f120690c = aVar;
    }

    public final void i(@Nullable FirebaseAnalytics.a aVar) {
        this.f120689b = aVar;
    }
}
