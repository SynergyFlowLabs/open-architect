package com.planner5d.library.activity.fragment.feed;

import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c f133188a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Map<Integer, hc.a.EnumC1914a> f133189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final Map<hc.a.EnumC1914a, Integer> f133190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f133191d;

    static {
        jc.d dVar = jc.d.Inspiration;
        Integer numValueOf = Integer.valueOf(dVar.n());
        hc.a.EnumC1914a enumC1914a = hc.a.EnumC1914a.Inspiration;
        Pair pair = TuplesKt.to(numValueOf, enumC1914a);
        jc.d dVar2 = jc.d.ForYourHome;
        Integer numValueOf2 = Integer.valueOf(dVar2.n());
        hc.a.EnumC1914a enumC1914a2 = hc.a.EnumC1914a.ForYourHome;
        Pair pair2 = TuplesKt.to(numValueOf2, enumC1914a2);
        jc.d dVar3 = jc.d.Tips;
        Integer numValueOf3 = Integer.valueOf(dVar3.n());
        hc.a.EnumC1914a enumC1914a3 = hc.a.EnumC1914a.Tips;
        Pair pair3 = TuplesKt.to(numValueOf3, enumC1914a3);
        jc.d dVar4 = jc.d.Videos;
        Integer numValueOf4 = Integer.valueOf(dVar4.n());
        hc.a.EnumC1914a enumC1914a4 = hc.a.EnumC1914a.Videos;
        f133189b = MapsKt.mapOf(pair, pair2, pair3, TuplesKt.to(numValueOf4, enumC1914a4));
        f133190c = MapsKt.mapOf(TuplesKt.to(enumC1914a, Integer.valueOf(dVar.n())), TuplesKt.to(enumC1914a2, Integer.valueOf(dVar2.n())), TuplesKt.to(enumC1914a3, Integer.valueOf(dVar3.n())), TuplesKt.to(enumC1914a4, Integer.valueOf(dVar4.n())));
        f133191d = 8;
    }

    private c() {
    }

    @oj.n
    @Nullable
    public static final Integer a(@NotNull hc.a.EnumC1914a viewType) {
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        return f133190c.get(viewType);
    }

    @oj.n
    @Nullable
    public static final hc.a.EnumC1914a b(@Nullable Integer num) {
        return f133189b.get(num);
    }
}
