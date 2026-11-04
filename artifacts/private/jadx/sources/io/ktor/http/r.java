package io.ktor.http;

import io.ktor.util.date.GMTDate;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private Integer f296077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private Integer f296078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private Integer f296079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private Integer f296080d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private ni.h f296081e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private Integer f296082f;

    @NotNull
    public final GMTDate a() {
        Integer num = this.f296077a;
        Intrinsics.checkNotNull(num);
        int iIntValue = num.intValue();
        Integer num2 = this.f296078b;
        Intrinsics.checkNotNull(num2);
        int iIntValue2 = num2.intValue();
        Integer num3 = this.f296079c;
        Intrinsics.checkNotNull(num3);
        int iIntValue3 = num3.intValue();
        Integer num4 = this.f296080d;
        Intrinsics.checkNotNull(num4);
        int iIntValue4 = num4.intValue();
        ni.h hVar = this.f296081e;
        Intrinsics.checkNotNull(hVar);
        Integer num5 = this.f296082f;
        Intrinsics.checkNotNull(num5);
        return ni.a.a(iIntValue, iIntValue2, iIntValue3, iIntValue4, hVar, num5.intValue());
    }

    @Nullable
    public final Integer b() {
        return this.f296080d;
    }

    @Nullable
    public final Integer c() {
        return this.f296079c;
    }

    @Nullable
    public final Integer d() {
        return this.f296078b;
    }

    @Nullable
    public final ni.h e() {
        return this.f296081e;
    }

    @Nullable
    public final Integer f() {
        return this.f296077a;
    }

    @Nullable
    public final Integer g() {
        return this.f296082f;
    }

    public final void h(@Nullable Integer num) {
        this.f296080d = num;
    }

    public final void i(@Nullable Integer num) {
        this.f296079c = num;
    }

    public final void j(@Nullable Integer num) {
        this.f296078b = num;
    }

    public final void k(@Nullable ni.h hVar) {
        this.f296081e = hVar;
    }

    public final void l(@Nullable Integer num) {
        this.f296077a = num;
    }

    public final void m(@Nullable Integer num) {
        this.f296082f = num;
    }
}
