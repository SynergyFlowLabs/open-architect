package com.sdk.growthbook.utils;

import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import kotlinx.serialization.internal.y0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
public final class GBFilter {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private String f266479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private List<Pair<Float, Float>> f266480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private String f266481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private Integer f266482d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private String f266483e;

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<GBFilter> serializer() {
            return GBFilter$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ GBFilter(int i10, String str, List list, String str2, Integer num, String str3, v2 v2Var) {
        if (3 != (i10 & 3)) {
            g2.b(i10, 3, GBFilter$$serializer.INSTANCE.getDescriptor());
        }
        this.f266479a = str;
        this.f266480b = list;
        if ((i10 & 4) == 0) {
            this.f266481c = null;
        } else {
            this.f266481c = str2;
        }
        if ((i10 & 8) == 0) {
            this.f266482d = null;
        } else {
            this.f266482d = num;
        }
        if ((i10 & 16) == 0) {
            this.f266483e = null;
        } else {
            this.f266483e = str3;
        }
    }

    @b0(with = r.a.class)
    public static /* synthetic */ void e() {
    }

    @oj.n
    public static final /* synthetic */ void l(GBFilter gBFilter, kotlinx.serialization.encoding.e eVar, SerialDescriptor serialDescriptor) {
        eVar.encodeStringElement(serialDescriptor, 0, gBFilter.f266479a);
        eVar.encodeSerializableElement(serialDescriptor, 1, r.a.f266516a, gBFilter.f266480b);
        int i10 = 0 | 2;
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 2) || gBFilter.f266481c != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 2, b3.f315897a, gBFilter.f266481c);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 3) || gBFilter.f266482d != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 3, y0.f316055a, gBFilter.f266482d);
        }
        if (!eVar.shouldEncodeElementDefault(serialDescriptor, 4) && gBFilter.f266483e == null) {
            return;
        }
        eVar.encodeNullableSerializableElement(serialDescriptor, 4, b3.f315897a, gBFilter.f266483e);
    }

    @Nullable
    public final String a() {
        return this.f266481c;
    }

    @Nullable
    public final String b() {
        return this.f266483e;
    }

    @Nullable
    public final Integer c() {
        return this.f266482d;
    }

    @NotNull
    public final List<Pair<Float, Float>> d() {
        return this.f266480b;
    }

    @NotNull
    public final String f() {
        return this.f266479a;
    }

    public final void g(@Nullable String str) {
        this.f266481c = str;
    }

    public final void h(@Nullable String str) {
        this.f266483e = str;
    }

    public final void i(@Nullable Integer num) {
        this.f266482d = num;
    }

    public final void j(@NotNull List<Pair<Float, Float>> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f266480b = list;
    }

    public final void k(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f266479a = str;
    }

    public GBFilter(@NotNull String seed, @NotNull List<Pair<Float, Float>> ranges, @Nullable String str, @Nullable Integer num, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(seed, "seed");
        Intrinsics.checkNotNullParameter(ranges, "ranges");
        this.f266479a = seed;
        this.f266480b = ranges;
        this.f266481c = str;
        this.f266482d = num;
        this.f266483e = str2;
    }

    public /* synthetic */ GBFilter(String str, List list, String str2, Integer num, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : num, (i10 & 16) != 0 ? null : str3);
    }
}
