package com.google.android.filament.utils;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vector.kt\ncom/google/android/filament/utils/VectorKt\n+ 2 Vector.kt\ncom/google/android/filament/utils/Float2\n+ 3 Scalar.kt\ncom/google/android/filament/utils/ScalarKt\n+ 4 Vector.kt\ncom/google/android/filament/utils/Float3\n+ 5 Vector.kt\ncom/google/android/filament/utils/Float4\n+ 6 Vector.kt\ncom/google/android/filament/utils/Half2\n+ 7 Vector.kt\ncom/google/android/filament/utils/Half3\n+ 8 Vector.kt\ncom/google/android/filament/utils/Half4\n*L\n1#1,2155:1\n622#1:2156\n624#1:2158\n624#1:2159\n627#1:2160\n614#1:2161\n627#1:2163\n614#1:2165\n624#1:2167\n627#1:2168\n622#1:2181\n622#1:2182\n622#1:2183\n622#1:2184\n622#1:2185\n622#1:2186\n622#1:2187\n622#1:2188\n622#1:2189\n622#1:2190\n622#1:2191\n622#1:2192\n622#1:2193\n622#1:2194\n622#1:2195\n622#1:2196\n730#1:2198\n730#1:2199\n733#1:2200\n726#1:2201\n733#1:2203\n726#1:2205\n730#1:2207\n733#1:2208\n622#1:2226\n622#1:2227\n622#1:2228\n622#1:2229\n622#1:2230\n622#1:2231\n622#1:2232\n622#1:2233\n622#1:2234\n622#1:2235\n622#1:2236\n622#1:2237\n622#1:2238\n622#1:2239\n622#1:2240\n622#1:2241\n622#1:2242\n622#1:2243\n622#1:2244\n622#1:2245\n622#1:2246\n622#1:2247\n622#1:2248\n622#1:2249\n850#1:2251\n850#1:2252\n622#1:2274\n622#1:2275\n622#1:2276\n622#1:2277\n622#1:2278\n622#1:2279\n622#1:2280\n622#1:2281\n622#1:2282\n622#1:2283\n622#1:2284\n622#1:2285\n622#1:2286\n622#1:2287\n622#1:2288\n622#1:2289\n622#1:2290\n622#1:2291\n622#1:2292\n622#1:2293\n622#1:2294\n622#1:2295\n622#1:2296\n622#1:2297\n622#1:2298\n622#1:2299\n622#1:2300\n622#1:2301\n622#1:2302\n622#1:2303\n622#1:2304\n622#1:2305\n1982#1:2310\n1982#1:2311\n1985#1:2312\n1978#1:2313\n1985#1:2315\n1978#1:2317\n2075#1:2336\n2075#1:2337\n137#2:2157\n137#2:2162\n137#2:2166\n148#2,3:2178\n52#3:2164\n34#3:2169\n34#3:2170\n34#3:2171\n34#3:2172\n34#3:2173\n42#3:2174\n42#3:2175\n42#3:2176\n42#3:2177\n52#3:2204\n34#3:2209\n34#3:2210\n34#3:2211\n34#3:2212\n34#3:2213\n34#3:2214\n34#3:2215\n42#3:2216\n42#3:2217\n42#3:2218\n42#3:2219\n42#3:2220\n42#3:2221\n34#3:2253\n34#3:2254\n34#3:2255\n34#3:2256\n34#3:2257\n34#3:2258\n34#3:2259\n34#3:2260\n42#3:2261\n42#3:2262\n42#3:2263\n42#3:2264\n42#3:2265\n42#3:2266\n42#3:2267\n42#3:2268\n54#3:2316\n36#3:2319\n36#3:2320\n36#3:2321\n36#3:2322\n36#3:2323\n36#3:2324\n44#3:2325\n44#3:2326\n44#3:2327\n44#3:2328\n44#3:2329\n44#3:2330\n36#3:2338\n36#3:2339\n36#3:2340\n36#3:2341\n36#3:2342\n36#3:2343\n36#3:2344\n36#3:2345\n44#3:2346\n44#3:2347\n44#3:2348\n44#3:2349\n44#3:2350\n44#3:2351\n44#3:2352\n44#3:2353\n323#4:2197\n323#4:2202\n323#4:2206\n336#4,4:2222\n588#5:2250\n602#5,5:2269\n1508#6,3:2306\n1679#7:2309\n1679#7:2314\n1679#7:2318\n1684#7,4:2331\n1928#8:2335\n1933#8,5:2354\n1720#8:2359\n*S KotlinDebug\n*F\n+ 1 Vector.kt\ncom/google/android/filament/utils/VectorKt\n*L\n618#1:2156\n626#1:2158\n629#1:2159\n633#1:2160\n633#1:2161\n635#1:2163\n637#1:2165\n641#1:2167\n642#1:2168\n689#1:2181\n690#1:2182\n689#1:2183\n690#1:2184\n694#1:2185\n695#1:2186\n694#1:2187\n695#1:2188\n699#1:2189\n700#1:2190\n699#1:2191\n700#1:2192\n704#1:2193\n705#1:2194\n704#1:2195\n705#1:2196\n732#1:2198\n741#1:2199\n745#1:2200\n745#1:2201\n747#1:2203\n749#1:2205\n753#1:2207\n754#1:2208\n805#1:2226\n806#1:2227\n807#1:2228\n805#1:2229\n806#1:2230\n807#1:2231\n811#1:2232\n812#1:2233\n813#1:2234\n811#1:2235\n812#1:2236\n813#1:2237\n817#1:2238\n818#1:2239\n819#1:2240\n817#1:2241\n818#1:2242\n819#1:2243\n823#1:2244\n824#1:2245\n825#1:2246\n823#1:2247\n824#1:2248\n825#1:2249\n852#1:2251\n855#1:2252\n918#1:2274\n919#1:2275\n920#1:2276\n921#1:2277\n918#1:2278\n919#1:2279\n920#1:2280\n921#1:2281\n925#1:2282\n926#1:2283\n927#1:2284\n928#1:2285\n925#1:2286\n926#1:2287\n927#1:2288\n928#1:2289\n932#1:2290\n933#1:2291\n934#1:2292\n935#1:2293\n932#1:2294\n933#1:2295\n934#1:2296\n935#1:2297\n939#1:2298\n940#1:2299\n941#1:2300\n942#1:2301\n939#1:2302\n940#1:2303\n941#1:2304\n942#1:2305\n1984#1:2310\n1993#1:2311\n1997#1:2312\n1997#1:2313\n1999#1:2315\n2001#1:2317\n2077#1:2336\n2080#1:2337\n626#1:2157\n633#1:2162\n637#1:2166\n678#1:2178,3\n636#1:2164\n642#1:2169\n647#1:2170\n648#1:2171\n654#1:2172\n655#1:2173\n661#1:2174\n662#1:2175\n668#1:2176\n669#1:2177\n748#1:2204\n754#1:2209\n759#1:2210\n760#1:2211\n761#1:2212\n767#1:2213\n768#1:2214\n769#1:2215\n775#1:2216\n776#1:2217\n777#1:2218\n783#1:2219\n784#1:2220\n785#1:2221\n861#1:2253\n862#1:2254\n863#1:2255\n864#1:2256\n870#1:2257\n871#1:2258\n872#1:2259\n873#1:2260\n879#1:2261\n880#1:2262\n881#1:2263\n882#1:2264\n888#1:2265\n889#1:2266\n890#1:2267\n891#1:2268\n2000#1:2316\n2006#1:2319\n2007#1:2320\n2008#1:2321\n2014#1:2322\n2015#1:2323\n2016#1:2324\n2022#1:2325\n2023#1:2326\n2024#1:2327\n2030#1:2328\n2031#1:2329\n2032#1:2330\n2086#1:2338\n2087#1:2339\n2088#1:2340\n2089#1:2341\n2095#1:2342\n2096#1:2343\n2097#1:2344\n2098#1:2345\n2104#1:2346\n2105#1:2347\n2106#1:2348\n2107#1:2349\n2113#1:2350\n2114#1:2351\n2115#1:2352\n2116#1:2353\n732#1:2197\n745#1:2202\n749#1:2206\n794#1:2222,4\n852#1:2250\n903#1:2269,5\n1948#1:2306,3\n1984#1:2309\n1997#1:2314\n2001#1:2318\n2041#1:2331,4\n2077#1:2335\n2128#1:2354,5\n2143#1:2359\n*E\n"})
public final class i0 {
    public static final float A(@NotNull e a10, @NotNull e b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        e eVar = new e(a10.z() - b10.z(), a10.B() - b10.B());
        return (float) Math.sqrt((eVar.z() * eVar.z()) + (eVar.B() * eVar.B()));
    }

    @NotNull
    public static final c A0(@NotNull g a10, float f10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        int i10 = 0 >> 1;
        return new c(a10.Q() > f10, a10.U() > f10, a10.V() > f10, a10.P() > f10);
    }

    @NotNull
    public static final a A1(@NotNull e a10, float f10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        return new a(a10.z() < f10, a10.B() < f10);
    }

    @NotNull
    public static final f A2(@NotNull f a10, @NotNull f b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new f(Math.max(a10.H(), b10.H()), Math.max(a10.K(), b10.K()), Math.max(a10.L(), b10.L()));
    }

    @NotNull
    public static final a A3(@NotNull e a10, float f10, float f11) {
        Intrinsics.checkNotNullParameter(a10, "a");
        return new a(!(Math.abs(a10.z() - f10) < f11), !(Math.abs(a10.B() - f10) < f11));
    }

    public static final float B(@NotNull f a10, @NotNull f b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        f fVar = new f(a10.H() - b10.H(), a10.K() - b10.K(), a10.L() - b10.L());
        return (float) Math.sqrt((fVar.H() * fVar.H()) + (fVar.K() * fVar.K()) + (fVar.L() * fVar.L()));
    }

    @NotNull
    public static final c B0(@NotNull g a10, @NotNull g b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new c(a10.Q() > b10.U(), a10.U() > b10.U(), a10.V() > b10.V(), a10.P() > b10.P());
    }

    @NotNull
    public static final a B1(@NotNull e a10, @NotNull e b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new a(a10.z() < b10.z(), a10.B() < b10.B());
    }

    @NotNull
    public static final g B2(@NotNull g a10, @NotNull g b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new g(Math.max(a10.Q(), b10.Q()), Math.max(a10.U(), b10.U()), Math.max(a10.V(), b10.V()), Math.max(a10.P(), b10.P()));
    }

    @NotNull
    public static final a B3(@NotNull e a10, @NotNull e b10, float f10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new a(!(Math.abs(a10.z() - b10.z()) < f10), !(Math.abs(a10.B() - b10.B()) < f10));
    }

    public static final float C(@NotNull g a10, @NotNull g b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        g gVar = new g(a10.Q() - b10.Q(), a10.U() - b10.U(), a10.V() - b10.V(), a10.P() - b10.P());
        return (float) Math.sqrt((gVar.Q() * gVar.Q()) + (gVar.U() * gVar.U()) + (gVar.V() * gVar.V()) + (gVar.P() * gVar.P()));
    }

    @NotNull
    public static final c C0(@NotNull l a10, @NotNull l b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new c(i.z(a10.I(), b10.M()) > 0, i.z(a10.M(), b10.M()) > 0, i.z(a10.N(), b10.N()) > 0, i.z(a10.H(), b10.H()) > 0);
    }

    @NotNull
    public static final a C1(@NotNull j a10, @NotNull j b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new a(i.z(a10.r(), b10.r()) < 0, i.z(a10.t(), b10.t()) < 0);
    }

    @NotNull
    public static final j C2(@NotNull j a10, @NotNull j b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new j(m.n(a10.r(), b10.r()), m.n(a10.t(), b10.t()), null);
    }

    @NotNull
    public static final a C3(@NotNull j a10, @NotNull j b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new a(!i.L(a10.r(), b10.r()), !i.L(a10.t(), b10.t()));
    }

    public static final short D(@NotNull k a10, @NotNull k b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        k kVar = new k(i.a0(a10.z(), b10.z()), i.a0(a10.C(), b10.C()), i.a0(a10.D(), b10.D()), (DefaultConstructorMarker) null);
        return m.s(i.f0(i.f0(i.i0(kVar.z(), kVar.z()), i.i0(kVar.C(), kVar.C())), i.i0(kVar.D(), kVar.D())));
    }

    @NotNull
    public static final a D0(@NotNull j a10, short s10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        int i10 = 3 & 1;
        return new a(i.z(a10.r(), s10) > 0, i.z(a10.t(), s10) > 0);
    }

    @NotNull
    public static final b D1(@NotNull f a10, float f10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        return new b(a10.H() < f10, a10.K() < f10, a10.L() < f10);
    }

    @NotNull
    public static final k D2(@NotNull k a10, @NotNull k b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new k(m.n(a10.z(), b10.z()), m.n(a10.C(), b10.C()), m.n(a10.D(), b10.D()), (DefaultConstructorMarker) null);
    }

    @NotNull
    public static final b D3(@NotNull f a10, float f10, float f11) {
        Intrinsics.checkNotNullParameter(a10, "a");
        return new b(!(Math.abs(a10.H() - f10) < f11), !(Math.abs(a10.K() - f10) < f11), !(Math.abs(a10.L() - f10) < f11));
    }

    public static final short E(@NotNull l a10, @NotNull l b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        l lVar = new l(i.a0(a10.I(), b10.I()), i.a0(a10.M(), b10.M()), i.a0(a10.N(), b10.N()), i.a0(a10.H(), b10.H()), (DefaultConstructorMarker) null);
        return m.s(i.f0(i.f0(i.f0(i.i0(lVar.I(), lVar.I()), i.i0(lVar.M(), lVar.M())), i.i0(lVar.N(), lVar.N())), i.i0(lVar.H(), lVar.H())));
    }

    @NotNull
    public static final b E0(@NotNull k a10, short s10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        return new b(i.z(a10.z(), s10) > 0, i.z(a10.C(), s10) > 0, i.z(a10.D(), s10) > 0);
    }

    @NotNull
    public static final b E1(@NotNull f a10, @NotNull f b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new b(a10.H() < b10.H(), a10.K() < b10.K(), a10.L() < b10.L());
    }

    @NotNull
    public static final l E2(@NotNull l a10, @NotNull l b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new l(m.n(a10.I(), b10.I()), m.n(a10.M(), b10.M()), m.n(a10.N(), b10.N()), m.n(a10.H(), b10.H()), (DefaultConstructorMarker) null);
    }

    @NotNull
    public static final b E3(@NotNull f a10, @NotNull f b10, float f10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new b(!(Math.abs(a10.H() - b10.H()) < f10), !(Math.abs(a10.K() - b10.K()) < f10), !(Math.abs(a10.L() - b10.L()) < f10));
    }

    @NotNull
    public static final e F(float f10, @NotNull e v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new e(f10 / v10.z(), f10 / v10.B());
    }

    @NotNull
    public static final c F0(@NotNull l a10, short s10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        return new c(i.z(a10.I(), s10) > 0, i.z(a10.M(), s10) > 0, i.z(a10.N(), s10) > 0, i.z(a10.H(), s10) > 0);
    }

    @NotNull
    public static final b F1(@NotNull k a10, @NotNull k b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new b(i.z(a10.z(), b10.z()) < 0, i.z(a10.C(), b10.C()) < 0, i.z(a10.D(), b10.D()) < 0);
    }

    public static final short F2(@NotNull j v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return m.n(v10.r(), v10.t());
    }

    @NotNull
    public static final b F3(@NotNull k a10, @NotNull k b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new b(!i.L(a10.z(), b10.z()), !i.L(a10.C(), b10.C()), !i.L(a10.D(), b10.D()));
    }

    @NotNull
    public static final f G(float f10, @NotNull f v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new f(f10 / v10.H(), f10 / v10.K(), f10 / v10.L());
    }

    @NotNull
    public static final a G0(@NotNull e a10, float f10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        return new a(a10.z() >= f10, a10.B() >= f10);
    }

    @NotNull
    public static final c G1(@NotNull g a10, float f10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        return new c(a10.Q() < f10, a10.U() < f10, a10.V() < f10, a10.P() < f10);
    }

    public static final short G2(@NotNull k v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return m.n(v10.z(), m.n(v10.C(), v10.D()));
    }

    @NotNull
    public static final c G3(@NotNull g a10, float f10, float f11) {
        Intrinsics.checkNotNullParameter(a10, "a");
        return new c(!(Math.abs(a10.Q() - f10) < f11), !(Math.abs(a10.U() - f10) < f11), !(Math.abs(a10.V() - f10) < f11), !(Math.abs(a10.P() - f10) < f11));
    }

    @NotNull
    public static final g H(float f10, @NotNull g v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new g(f10 / v10.Q(), f10 / v10.U(), f10 / v10.V(), f10 / v10.P());
    }

    @NotNull
    public static final a H0(@NotNull e a10, @NotNull e b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new a(a10.z() >= b10.z(), a10.B() >= b10.B());
    }

    @NotNull
    public static final c H1(@NotNull g a10, @NotNull g b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new c(a10.Q() < b10.Q(), a10.U() < b10.U(), a10.V() < b10.V(), a10.P() < b10.P());
    }

    public static final short H2(@NotNull l v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return m.n(v10.I(), m.n(v10.M(), m.n(v10.N(), v10.H())));
    }

    @NotNull
    public static final c H3(@NotNull g a10, @NotNull g b10, float f10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new c(!(Math.abs(a10.Q() - b10.Q()) < f10), !(Math.abs(a10.U() - b10.U()) < f10), !(Math.abs(a10.V() - b10.V()) < f10), !(Math.abs(a10.P() - b10.P()) < f10));
    }

    @NotNull
    public static final k I(short s10, @NotNull k v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new k(i.H(s10, v10.z()), i.H(s10, v10.C()), i.H(s10, v10.D()), (DefaultConstructorMarker) null);
    }

    @NotNull
    public static final a I0(@NotNull j a10, @NotNull j b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new a(i.z(a10.r(), b10.r()) >= 0, i.z(a10.t(), b10.t()) >= 0);
    }

    @NotNull
    public static final c I1(@NotNull l a10, @NotNull l b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new c(i.z(a10.I(), b10.I()) < 0, i.z(a10.M(), b10.M()) < 0, i.z(a10.N(), b10.N()) < 0, i.z(a10.H(), b10.H()) < 0);
    }

    public static final float I2(@NotNull e v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return Math.min(v10.z(), v10.B());
    }

    @NotNull
    public static final c I3(@NotNull l a10, @NotNull l b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new c(!i.L(a10.I(), b10.I()), !i.L(a10.M(), b10.M()), !i.L(a10.N(), b10.N()), !i.L(a10.H(), b10.H()));
    }

    @NotNull
    public static final l J(short s10, @NotNull l v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new l(i.H(s10, v10.I()), i.H(s10, v10.M()), i.H(s10, v10.N()), i.H(s10, v10.H()), (DefaultConstructorMarker) null);
    }

    @NotNull
    public static final b J0(@NotNull f a10, float f10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        return new b(a10.H() >= f10, a10.K() >= f10, a10.L() >= f10);
    }

    @NotNull
    public static final a J1(@NotNull j a10, short s10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        int i10 = 5 | 1;
        return new a(i.z(a10.r(), s10) < 0, i.z(a10.t(), s10) < 0);
    }

    public static final float J2(@NotNull f v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return Math.min(v10.H(), Math.min(v10.K(), v10.L()));
    }

    public static /* synthetic */ a J3(e a10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f11 = 0.0f;
        }
        Intrinsics.checkNotNullParameter(a10, "a");
        int i11 = 3 & 1;
        return new a(!(Math.abs(a10.z() - f10) < f11), !(Math.abs(a10.B() - f10) < f11));
    }

    public static final float K(@NotNull e a10, @NotNull e b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return (a10.z() * b10.z()) + (a10.B() * b10.B());
    }

    @NotNull
    public static final b K0(@NotNull f a10, @NotNull f b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new b(a10.H() >= b10.H(), a10.K() >= b10.K(), a10.L() >= b10.L());
    }

    @NotNull
    public static final b K1(@NotNull k a10, short s10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        return new b(i.z(a10.z(), s10) < 0, i.z(a10.C(), s10) < 0, i.z(a10.D(), s10) < 0);
    }

    public static final float K2(@NotNull g v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return Math.min(v10.Q(), Math.min(v10.U(), Math.min(v10.V(), v10.P())));
    }

    public static /* synthetic */ a K3(e a10, e b10, float f10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f10 = 0.0f;
        }
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new a(!(Math.abs(a10.z() - b10.z()) < f10), !(Math.abs(a10.B() - b10.B()) < f10));
    }

    public static final float L(@NotNull f a10, @NotNull f b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return (a10.H() * b10.H()) + (a10.K() * b10.K()) + (a10.L() * b10.L());
    }

    @NotNull
    public static final b L0(@NotNull k a10, @NotNull k b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new b(i.z(a10.z(), b10.z()) >= 0, i.z(a10.C(), b10.C()) >= 0, i.z(a10.D(), b10.D()) >= 0);
    }

    @NotNull
    public static final c L1(@NotNull l a10, short s10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        return new c(i.z(a10.I(), s10) < 0, i.z(a10.M(), s10) < 0, i.z(a10.N(), s10) < 0, i.z(a10.H(), s10) < 0);
    }

    @NotNull
    public static final e L2(@NotNull e a10, @NotNull e b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new e(Math.min(a10.z(), b10.z()), Math.min(a10.B(), b10.B()));
    }

    public static /* synthetic */ b L3(f a10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f11 = 0.0f;
        }
        Intrinsics.checkNotNullParameter(a10, "a");
        return new b(!(Math.abs(a10.H() - f10) < f11), !(Math.abs(a10.K() - f10) < f11), !(Math.abs(a10.L() - f10) < f11));
    }

    public static final float M(@NotNull g a10, @NotNull g b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return (a10.Q() * b10.Q()) + (a10.U() * b10.U()) + (a10.V() * b10.V()) + (a10.P() * b10.P());
    }

    @NotNull
    public static final c M0(@NotNull g a10, float f10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        return new c(a10.Q() >= f10, a10.U() >= f10, a10.V() >= f10, a10.P() >= f10);
    }

    @NotNull
    public static final a M1(@NotNull e a10, float f10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        return new a(a10.z() <= f10, a10.B() <= f10);
    }

    @NotNull
    public static final f M2(@NotNull f a10, @NotNull f b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new f(Math.min(a10.H(), b10.H()), Math.min(a10.K(), b10.K()), Math.min(a10.L(), b10.L()));
    }

    public static /* synthetic */ b M3(f a10, f b10, float f10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f10 = 0.0f;
        }
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new b(!(Math.abs(a10.H() - b10.H()) < f10), !(Math.abs(a10.K() - b10.K()) < f10), !(Math.abs(a10.L() - b10.L()) < f10));
    }

    public static final short N(@NotNull k a10, @NotNull k b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return i.f0(i.f0(i.i0(a10.z(), b10.z()), i.i0(a10.C(), b10.C())), i.i0(a10.D(), b10.D()));
    }

    @NotNull
    public static final c N0(@NotNull g a10, @NotNull g b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new c(a10.Q() >= b10.Q(), a10.U() >= b10.U(), a10.V() >= b10.V(), a10.P() >= b10.P());
    }

    @NotNull
    public static final a N1(@NotNull e a10, @NotNull e b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new a(a10.z() <= b10.z(), a10.B() <= b10.B());
    }

    @NotNull
    public static final g N2(@NotNull g a10, @NotNull g b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new g(Math.min(a10.Q(), b10.Q()), Math.min(a10.U(), b10.U()), Math.min(a10.V(), b10.V()), Math.min(a10.P(), b10.P()));
    }

    public static /* synthetic */ c N3(g a10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f11 = 0.0f;
        }
        Intrinsics.checkNotNullParameter(a10, "a");
        return new c(!(Math.abs(a10.Q() - f10) < f11), !(Math.abs(a10.U() - f10) < f11), !(Math.abs(a10.V() - f10) < f11), !(Math.abs(a10.P() - f10) < f11));
    }

    public static final short O(@NotNull l a10, @NotNull l b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return i.f0(i.f0(i.f0(i.i0(a10.I(), b10.I()), i.i0(a10.M(), b10.M())), i.i0(a10.N(), b10.N())), i.i0(a10.H(), b10.H()));
    }

    @NotNull
    public static final c O0(@NotNull l a10, @NotNull l b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new c(i.z(a10.I(), b10.I()) >= 0, i.z(a10.M(), b10.M()) >= 0, i.z(a10.N(), b10.N()) >= 0, i.z(a10.H(), b10.H()) >= 0);
    }

    @NotNull
    public static final a O1(@NotNull j a10, @NotNull j b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new a(i.z(a10.r(), b10.r()) <= 0, i.z(a10.t(), b10.t()) <= 0);
    }

    @NotNull
    public static final j O2(@NotNull j a10, @NotNull j b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new j(m.o(a10.r(), b10.r()), m.o(a10.t(), b10.t()), null);
    }

    public static /* synthetic */ c O3(g a10, g b10, float f10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f10 = 0.0f;
            int i11 = 3 | 0;
        }
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        int i12 = 2 << 0;
        return new c(!(Math.abs(a10.Q() - b10.Q()) < f10), !(Math.abs(a10.U() - b10.U()) < f10), !(Math.abs(a10.V() - b10.V()) < f10), !(Math.abs(a10.P() - b10.P()) < f10));
    }

    @NotNull
    public static final a P(@NotNull e eVar, float f10) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        return new a(eVar.z() == f10, eVar.B() == f10);
    }

    @NotNull
    public static final a P0(@NotNull j a10, short s10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        return new a(i.z(a10.r(), s10) >= 0, i.z(a10.t(), s10) >= 0);
    }

    @NotNull
    public static final b P1(@NotNull f a10, float f10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        return new b(a10.H() <= f10, a10.K() <= f10, a10.L() <= f10);
    }

    @NotNull
    public static final k P2(@NotNull k a10, @NotNull k b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new k(m.o(a10.z(), b10.z()), m.o(a10.C(), b10.C()), m.o(a10.D(), b10.D()), (DefaultConstructorMarker) null);
    }

    @NotNull
    public static final a P3(@NotNull j a10, short s10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        return new a(!i.L(a10.r(), s10), !i.L(a10.t(), s10));
    }

    @NotNull
    public static final a Q(@NotNull e eVar, @NotNull e b10) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new a(eVar.z() == b10.z(), eVar.B() == b10.B());
    }

    @NotNull
    public static final b Q0(@NotNull k a10, short s10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        return new b(i.z(a10.z(), s10) >= 0, i.z(a10.C(), s10) >= 0, i.z(a10.D(), s10) >= 0);
    }

    @NotNull
    public static final b Q1(@NotNull f a10, @NotNull f b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new b(a10.H() <= b10.H(), a10.K() <= b10.K(), a10.L() <= b10.L());
    }

    @NotNull
    public static final l Q2(@NotNull l a10, @NotNull l b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        int i10 = 7 ^ 0;
        return new l(m.o(a10.I(), b10.I()), m.o(a10.M(), b10.M()), m.o(a10.N(), b10.N()), m.o(a10.H(), b10.H()), (DefaultConstructorMarker) null);
    }

    @NotNull
    public static final b Q3(@NotNull k a10, short s10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        return new b(!i.L(a10.z(), s10), !i.L(a10.C(), s10), !i.L(a10.D(), s10));
    }

    @NotNull
    public static final a R(@NotNull j jVar, @NotNull j b10) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new a(i.L(jVar.r(), b10.r()), i.L(jVar.t(), b10.t()));
    }

    @NotNull
    public static final c R0(@NotNull l a10, short s10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        return new c(i.z(a10.I(), s10) >= 0, i.z(a10.M(), s10) >= 0, i.z(a10.N(), s10) >= 0, i.z(a10.H(), s10) >= 0);
    }

    @NotNull
    public static final b R1(@NotNull k a10, @NotNull k b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new b(i.z(a10.z(), b10.z()) <= 0, i.z(a10.C(), b10.C()) <= 0, i.z(a10.D(), b10.D()) <= 0);
    }

    public static final short R2(@NotNull j v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return m.o(v10.r(), v10.t());
    }

    @NotNull
    public static final c R3(@NotNull l a10, short s10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        return new c(!i.L(a10.I(), s10), !i.L(a10.M(), s10), !i.L(a10.N(), s10), !i.L(a10.H(), s10));
    }

    @NotNull
    public static final b S(@NotNull f fVar, float f10) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return new b(fVar.H() == f10, fVar.K() == f10, fVar.L() == f10);
    }

    @NotNull
    public static final a S0(@NotNull e eVar, float f10) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        return new a(eVar.z() > f10, eVar.B() > f10);
    }

    @NotNull
    public static final c S1(@NotNull g a10, float f10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        return new c(a10.Q() <= f10, a10.U() <= f10, a10.V() <= f10, a10.P() <= f10);
    }

    public static final short S2(@NotNull k v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return m.o(v10.z(), m.o(v10.C(), v10.D()));
    }

    @NotNull
    public static final e S3(float f10, @NotNull e v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new e(v10.z() + f10, f10 + v10.B());
    }

    @NotNull
    public static final b T(@NotNull f fVar, @NotNull f b10) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new b(fVar.H() == b10.H(), fVar.K() == b10.K(), fVar.L() == b10.L());
    }

    @NotNull
    public static final a T0(@NotNull e eVar, @NotNull e b10) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new a(eVar.z() > b10.z(), eVar.B() > b10.B());
    }

    @NotNull
    public static final c T1(@NotNull g a10, @NotNull g b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new c(a10.Q() <= b10.Q(), a10.U() <= b10.U(), a10.V() <= b10.V(), a10.P() <= b10.P());
    }

    public static final short T2(@NotNull l v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return m.o(v10.I(), m.o(v10.M(), m.o(v10.N(), v10.H())));
    }

    @NotNull
    public static final f T3(float f10, @NotNull f v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new f(v10.H() + f10, v10.K() + f10, f10 + v10.L());
    }

    @NotNull
    public static final b U(@NotNull k kVar, @NotNull k b10) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new b(i.L(kVar.z(), b10.z()), i.L(kVar.C(), b10.C()), i.L(kVar.D(), b10.D()));
    }

    @NotNull
    public static final a U0(@NotNull j jVar, @NotNull j b10) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new a(i.z(jVar.r(), b10.r()) > 0, i.z(jVar.t(), b10.t()) > 0);
    }

    @NotNull
    public static final c U1(@NotNull l a10, @NotNull l b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        int i10 = 6 >> 1;
        return new c(i.z(a10.I(), b10.I()) <= 0, i.z(a10.M(), b10.M()) <= 0, i.z(a10.N(), b10.N()) <= 0, i.z(a10.H(), b10.H()) <= 0);
    }

    @NotNull
    public static final e U2(float f10, @NotNull e v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new e(f10 - v10.z(), f10 - v10.B());
    }

    @NotNull
    public static final g U3(float f10, @NotNull g v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new g(v10.Q() + f10, v10.U() + f10, v10.V() + f10, f10 + v10.P());
    }

    @NotNull
    public static final c V(@NotNull g gVar, float f10) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        int i10 = 5 ^ 0;
        return new c(gVar.Q() == f10, gVar.U() == f10, gVar.V() == f10, gVar.P() == f10);
    }

    @NotNull
    public static final b V0(@NotNull f fVar, float f10) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return new b(fVar.H() > f10, fVar.K() > f10, fVar.L() > f10);
    }

    @NotNull
    public static final a V1(@NotNull j a10, short s10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        return new a(i.z(a10.r(), s10) <= 0, i.z(a10.t(), s10) <= 0);
    }

    @NotNull
    public static final f V2(float f10, @NotNull f v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new f(f10 - v10.H(), f10 - v10.K(), f10 - v10.L());
    }

    @NotNull
    public static final k V3(short s10, @NotNull k v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new k(i.f0(s10, v10.z()), i.f0(s10, v10.C()), i.f0(s10, v10.D()), (DefaultConstructorMarker) null);
    }

    @NotNull
    public static final c W(@NotNull g gVar, @NotNull g b10) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(b10, "b");
        int i10 = 0 << 1;
        return new c(gVar.Q() == b10.Q(), gVar.U() == b10.U(), gVar.V() == b10.V(), gVar.P() == b10.P());
    }

    @NotNull
    public static final b W0(@NotNull f fVar, @NotNull f b10) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new b(fVar.H() > b10.H(), fVar.K() > b10.K(), fVar.L() > b10.L());
    }

    @NotNull
    public static final b W1(@NotNull k a10, short s10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        return new b(i.z(a10.z(), s10) <= 0, i.z(a10.C(), s10) <= 0, i.z(a10.D(), s10) <= 0);
    }

    @NotNull
    public static final g W2(float f10, @NotNull g v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new g(f10 - v10.Q(), f10 - v10.U(), f10 - v10.V(), f10 - v10.P());
    }

    @NotNull
    public static final l W3(short s10, @NotNull l v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new l(i.f0(s10, v10.I()), i.f0(s10, v10.M()), i.f0(s10, v10.N()), i.f0(s10, v10.H()), (DefaultConstructorMarker) null);
    }

    @NotNull
    public static final c X(@NotNull l lVar, @NotNull l b10) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new c(i.L(lVar.I(), b10.I()), i.L(lVar.M(), b10.M()), i.L(lVar.N(), b10.N()), i.L(lVar.H(), b10.H()));
    }

    @NotNull
    public static final b X0(@NotNull k kVar, @NotNull k b10) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new b(i.z(kVar.z(), b10.z()) > 0, i.z(kVar.C(), b10.C()) > 0, i.z(kVar.D(), b10.D()) > 0);
    }

    @NotNull
    public static final c X1(@NotNull l a10, short s10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        return new c(i.z(a10.I(), s10) <= 0, i.z(a10.M(), s10) <= 0, i.z(a10.N(), s10) <= 0, i.z(a10.H(), s10) <= 0);
    }

    @NotNull
    public static final k X2(short s10, @NotNull k v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new k(i.a0(s10, v10.z()), i.a0(s10, v10.C()), i.a0(s10, v10.D()), (DefaultConstructorMarker) null);
    }

    @NotNull
    public static final e X3(@NotNull e i10, @NotNull e n10) {
        Intrinsics.checkNotNullParameter(i10, "i");
        Intrinsics.checkNotNullParameter(n10, "n");
        float fZ = ((n10.z() * i10.z()) + (n10.B() * i10.B())) * 2.0f;
        e eVar = new e(n10.z() * fZ, fZ * n10.B());
        return new e(i10.z() - eVar.z(), i10.B() - eVar.B());
    }

    @NotNull
    public static final a Y(@NotNull j eq, short s10) {
        Intrinsics.checkNotNullParameter(eq, "$this$eq");
        return new a(i.L(eq.r(), s10), i.L(eq.t(), s10));
    }

    @NotNull
    public static final c Y0(@NotNull g gVar, float f10) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return new c(gVar.Q() > f10, gVar.U() > f10, gVar.V() > f10, gVar.P() > f10);
    }

    @NotNull
    public static final a Y1(@NotNull e eVar, float f10) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        return new a(eVar.z() < f10, eVar.B() < f10);
    }

    @NotNull
    public static final l Y2(short s10, @NotNull l v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new l(i.a0(s10, v10.I()), i.a0(s10, v10.M()), i.a0(s10, v10.N()), i.a0(s10, v10.H()), (DefaultConstructorMarker) null);
    }

    @NotNull
    public static final f Y3(@NotNull f i10, @NotNull f n10) {
        Intrinsics.checkNotNullParameter(i10, "i");
        Intrinsics.checkNotNullParameter(n10, "n");
        float fH = ((n10.H() * i10.H()) + (n10.K() * i10.K()) + (n10.L() * i10.L())) * 2.0f;
        f fVar = new f(n10.H() * fH, n10.K() * fH, fH * n10.L());
        return new f(i10.H() - fVar.H(), i10.K() - fVar.K(), i10.L() - fVar.L());
    }

    @NotNull
    public static final b Z(@NotNull k eq, short s10) {
        Intrinsics.checkNotNullParameter(eq, "$this$eq");
        return new b(i.L(eq.z(), s10), i.L(eq.C(), s10), i.L(eq.D(), s10));
    }

    @NotNull
    public static final c Z0(@NotNull g gVar, @NotNull g b10) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new c(gVar.Q() > b10.Q(), gVar.U() > b10.U(), gVar.V() > b10.V(), gVar.P() > b10.P());
    }

    @NotNull
    public static final a Z1(@NotNull e eVar, @NotNull e b10) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new a(eVar.z() < b10.z(), eVar.B() < b10.B());
    }

    @NotNull
    public static final e Z2(@NotNull e a10, @NotNull e b10, float f10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        float f11 = 1.0f - f10;
        return new e((a10.z() * f11) + (b10.z() * f10), (a10.B() * f11) + (b10.B() * f10));
    }

    @NotNull
    public static final k Z3(@NotNull k i10, @NotNull k n10) {
        Intrinsics.checkNotNullParameter(i10, "i");
        Intrinsics.checkNotNullParameter(n10, "n");
        short sI0 = i.i0(d0.f(), i.f0(i.f0(i.i0(n10.z(), i10.z()), i.i0(n10.C(), i10.C())), i.i0(n10.D(), i10.D())));
        k kVar = new k(i.i0(sI0, n10.z()), i.i0(sI0, n10.C()), i.i0(sI0, n10.D()), (DefaultConstructorMarker) null);
        return new k(i.a0(i10.z(), kVar.z()), i.a0(i10.C(), kVar.C()), i.a0(i10.D(), kVar.D()), (DefaultConstructorMarker) null);
    }

    @NotNull
    public static final e a(@NotNull e v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new e(Math.abs(v10.z()), Math.abs(v10.B()));
    }

    @NotNull
    public static final c a0(@NotNull l eq, short s10) {
        Intrinsics.checkNotNullParameter(eq, "$this$eq");
        return new c(i.L(eq.I(), s10), i.L(eq.M(), s10), i.L(eq.N(), s10), i.L(eq.H(), s10));
    }

    @NotNull
    public static final c a1(@NotNull l lVar, @NotNull l b10) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new c(i.z(lVar.I(), b10.I()) > 0, i.z(lVar.M(), b10.M()) > 0, i.z(lVar.N(), b10.N()) > 0, i.z(lVar.H(), b10.H()) > 0);
    }

    @NotNull
    public static final a a2(@NotNull j jVar, @NotNull j b10) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new a(i.z(jVar.r(), b10.r()) < 0, i.z(jVar.t(), b10.t()) < 0);
    }

    @NotNull
    public static final e a3(@NotNull e a10, @NotNull e b10, @NotNull e x10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        Intrinsics.checkNotNullParameter(x10, "x");
        float fZ = a10.z();
        float fZ2 = b10.z();
        float fZ3 = x10.z();
        float fB = a10.B();
        float fB2 = b10.B();
        float fB3 = x10.B();
        return new e((fZ * (1.0f - fZ3)) + (fZ2 * fZ3), (fB * (1.0f - fB3)) + (fB2 * fB3));
    }

    @NotNull
    public static final e a4(@NotNull e i10, @NotNull e n10, float f10) {
        Intrinsics.checkNotNullParameter(i10, "i");
        Intrinsics.checkNotNullParameter(n10, "n");
        float fZ = (n10.z() * i10.z()) + (n10.B() * i10.B());
        float f11 = 1.0f - ((f10 * f10) * (1.0f - (fZ * fZ)));
        if (f11 < 0.0f) {
            return new e(0.0f);
        }
        e eVar = new e(i10.z() * f10, i10.B() * f10);
        float fSqrt = (f10 * fZ) + ((float) Math.sqrt(f11));
        e eVar2 = new e(n10.z() * fSqrt, fSqrt * n10.B());
        return new e(eVar.z() - eVar2.z(), eVar.B() - eVar2.B());
    }

    @NotNull
    public static final f b(@NotNull f v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new f(Math.abs(v10.H()), Math.abs(v10.K()), Math.abs(v10.L()));
    }

    @NotNull
    public static final a b0(@NotNull e a10, float f10, float f11) {
        Intrinsics.checkNotNullParameter(a10, "a");
        return new a(Math.abs(a10.z() - f10) < f11, Math.abs(a10.B() - f10) < f11);
    }

    @NotNull
    public static final a b1(@NotNull j gt, short s10) {
        Intrinsics.checkNotNullParameter(gt, "$this$gt");
        return new a(i.z(gt.r(), s10) > 0, i.z(gt.t(), s10) > 0);
    }

    @NotNull
    public static final b b2(@NotNull f fVar, float f10) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return new b(fVar.H() < f10, fVar.K() < f10, fVar.L() < f10);
    }

    @NotNull
    public static final f b3(@NotNull f a10, @NotNull f b10, float f10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        float f11 = 1.0f - f10;
        return new f((a10.H() * f11) + (b10.H() * f10), (a10.K() * f11) + (b10.K() * f10), (a10.L() * f11) + (b10.L() * f10));
    }

    @NotNull
    public static final f b4(@NotNull f i10, @NotNull f n10, float f10) {
        Intrinsics.checkNotNullParameter(i10, "i");
        Intrinsics.checkNotNullParameter(n10, "n");
        float fH = (n10.H() * i10.H()) + (n10.K() * i10.K()) + (n10.L() * i10.L());
        float f11 = 1.0f - ((f10 * f10) * (1.0f - (fH * fH)));
        if (f11 < 0.0f) {
            return new f(0.0f);
        }
        f fVar = new f(i10.H() * f10, i10.K() * f10, i10.L() * f10);
        float fSqrt = (f10 * fH) + ((float) Math.sqrt(f11));
        f fVar2 = new f(n10.H() * fSqrt, n10.K() * fSqrt, fSqrt * n10.L());
        return new f(fVar.H() - fVar2.H(), fVar.K() - fVar2.K(), fVar.L() - fVar2.L());
    }

    @NotNull
    public static final g c(@NotNull g v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new g(Math.abs(v10.Q()), Math.abs(v10.U()), Math.abs(v10.V()), Math.abs(v10.P()));
    }

    @NotNull
    public static final a c0(@NotNull e a10, @NotNull e b10, float f10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new a(Math.abs(a10.z() - b10.z()) < f10, Math.abs(a10.B() - b10.B()) < f10);
    }

    @NotNull
    public static final b c1(@NotNull k gt, short s10) {
        Intrinsics.checkNotNullParameter(gt, "$this$gt");
        int i10 = 6 << 1;
        return new b(i.z(gt.z(), s10) > 0, i.z(gt.C(), s10) > 0, i.z(gt.D(), s10) > 0);
    }

    @NotNull
    public static final b c2(@NotNull f fVar, @NotNull f b10) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new b(fVar.H() < b10.H(), fVar.K() < b10.K(), fVar.L() < b10.L());
    }

    @NotNull
    public static final f c3(@NotNull f a10, @NotNull f b10, @NotNull f x10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        Intrinsics.checkNotNullParameter(x10, "x");
        float fH = a10.H();
        float fH2 = b10.H();
        float fH3 = x10.H();
        float f10 = (fH * (1.0f - fH3)) + (fH2 * fH3);
        float fK = a10.K();
        float fK2 = b10.K();
        float fK3 = x10.K();
        float fL = a10.L();
        float fL2 = b10.L();
        float fL3 = x10.L();
        return new f(f10, (fK * (1.0f - fK3)) + (fK2 * fK3), (fL * (1.0f - fL3)) + (fL2 * fL3));
    }

    @NotNull
    public static final k c4(@NotNull k i10, @NotNull k n10, short s10) {
        Intrinsics.checkNotNullParameter(i10, "i");
        Intrinsics.checkNotNullParameter(n10, "n");
        short sF0 = i.f0(i.f0(i.i0(n10.z(), i10.z()), i.i0(n10.C(), i10.C())), i.i0(n10.D(), i10.D()));
        short sA0 = i.a0(d0.e(), i.i0(i.i0(s10, s10), i.a0(d0.e(), i.i0(sF0, sF0))));
        if (i.z(sA0, i.f104900b.k()) < 0) {
            return new k((short) 0, (short) 0, (short) 0, 7, null);
        }
        k kVar = new k(i.i0(s10, i10.z()), i.i0(s10, i10.C()), i.i0(s10, i10.D()), (DefaultConstructorMarker) null);
        short sF1 = i.f0(i.i0(s10, sF0), m.s(sA0));
        k kVar2 = new k(i.i0(sF1, n10.z()), i.i0(sF1, n10.C()), i.i0(sF1, n10.D()), (DefaultConstructorMarker) null);
        return new k(i.a0(kVar.z(), kVar2.z()), i.a0(kVar.C(), kVar2.C()), i.a0(kVar.D(), kVar2.D()), (DefaultConstructorMarker) null);
    }

    @NotNull
    public static final k d(@NotNull k v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new k(m.d(v10.z()), m.d(v10.C()), m.d(v10.D()), (DefaultConstructorMarker) null);
    }

    @NotNull
    public static final a d0(@NotNull j a10, @NotNull j b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new a(i.L(a10.r(), b10.r()), i.L(a10.t(), b10.t()));
    }

    @NotNull
    public static final c d1(@NotNull l gt, short s10) {
        Intrinsics.checkNotNullParameter(gt, "$this$gt");
        return new c(i.z(gt.I(), s10) > 0, i.z(gt.M(), s10) > 0, i.z(gt.N(), s10) > 0, i.z(gt.H(), s10) > 0);
    }

    @NotNull
    public static final b d2(@NotNull k kVar, @NotNull k b10) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new b(i.z(kVar.z(), b10.z()) < 0, i.z(kVar.C(), b10.C()) < 0, i.z(kVar.D(), b10.D()) < 0);
    }

    @NotNull
    public static final g d3(@NotNull g a10, @NotNull g b10, float f10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        float f11 = 1.0f - f10;
        return new g((a10.Q() * f11) + (b10.Q() * f10), (a10.U() * f11) + (b10.U() * f10), (a10.V() * f11) + (b10.V() * f10), (a10.P() * f11) + (b10.P() * f10));
    }

    @NotNull
    public static final e d4(float f10, @NotNull e v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new e(v10.z() * f10, f10 * v10.B());
    }

    @NotNull
    public static final l e(@NotNull l v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new l(m.d(v10.I()), m.d(v10.M()), m.d(v10.N()), m.d(v10.H()), (DefaultConstructorMarker) null);
    }

    @NotNull
    public static final b e0(@NotNull f a10, float f10, float f11) {
        Intrinsics.checkNotNullParameter(a10, "a");
        return new b(Math.abs(a10.H() - f10) < f11, Math.abs(a10.K() - f10) < f11, Math.abs(a10.L() - f10) < f11);
    }

    @NotNull
    public static final a e1(@NotNull e eVar, float f10) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        return new a(eVar.z() >= f10, eVar.B() >= f10);
    }

    @NotNull
    public static final c e2(@NotNull g gVar, float f10) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return new c(gVar.Q() < f10, gVar.U() < f10, gVar.V() < f10, gVar.P() < f10);
    }

    @NotNull
    public static final g e3(@NotNull g a10, @NotNull g b10, @NotNull g x10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        Intrinsics.checkNotNullParameter(x10, "x");
        float fQ = a10.Q();
        float fQ2 = b10.Q();
        float fQ3 = x10.Q();
        float f10 = (fQ * (1.0f - fQ3)) + (fQ2 * fQ3);
        float fU = a10.U();
        float fU2 = b10.U();
        float fU3 = x10.U();
        float f11 = (fU * (1.0f - fU3)) + (fU2 * fU3);
        float fV = a10.V();
        float fV2 = b10.V();
        float fV3 = x10.V();
        float fP = a10.P();
        float fP2 = b10.P();
        float fP3 = x10.P();
        return new g(f10, f11, (fV * (1.0f - fV3)) + (fV2 * fV3), (fP * (1.0f - fP3)) + (fP2 * fP3));
    }

    @NotNull
    public static final f e4(float f10, @NotNull f v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new f(v10.H() * f10, v10.K() * f10, f10 * v10.L());
    }

    public static final boolean f(@NotNull a v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return v10.o() && v10.q();
    }

    @NotNull
    public static final b f0(@NotNull f a10, @NotNull f b10, float f10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new b(Math.abs(a10.H() - b10.H()) < f10, Math.abs(a10.K() - b10.K()) < f10, Math.abs(a10.L() - b10.L()) < f10);
    }

    @NotNull
    public static final a f1(@NotNull e eVar, @NotNull e b10) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new a(eVar.z() >= b10.z(), eVar.B() >= b10.B());
    }

    @NotNull
    public static final c f2(@NotNull g gVar, @NotNull g b10) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new c(gVar.Q() < b10.Q(), gVar.U() < b10.U(), gVar.V() < b10.V(), gVar.P() < b10.P());
    }

    @NotNull
    public static final k f3(@NotNull k a10, @NotNull k b10, @NotNull k x10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        Intrinsics.checkNotNullParameter(x10, "x");
        short sZ = a10.z();
        short sZ2 = b10.z();
        short sZ3 = x10.z();
        short sF0 = i.f0(i.i0(sZ, i.a0(d0.e(), sZ3)), i.i0(sZ2, sZ3));
        short sC = a10.C();
        short sC2 = b10.C();
        short sC3 = x10.C();
        short sF1 = i.f0(i.i0(sC, i.a0(d0.e(), sC3)), i.i0(sC2, sC3));
        short sD = a10.D();
        short sD2 = b10.D();
        short sD3 = x10.D();
        return new k(sF0, sF1, i.f0(i.i0(sD, i.a0(d0.e(), sD3)), i.i0(sD2, sD3)), (DefaultConstructorMarker) null);
    }

    @NotNull
    public static final g f4(float f10, @NotNull g v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new g(v10.Q() * f10, v10.U() * f10, v10.V() * f10, f10 * v10.P());
    }

    public static final boolean g(@NotNull b v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return v10.v() && v10.y() && v10.z();
    }

    @NotNull
    public static final b g0(@NotNull k a10, @NotNull k b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new b(i.L(a10.z(), b10.z()), i.L(a10.C(), b10.C()), i.L(a10.D(), b10.D()));
    }

    @NotNull
    public static final a g1(@NotNull j jVar, @NotNull j b10) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new a(i.z(jVar.r(), b10.r()) >= 0, i.z(jVar.t(), b10.t()) >= 0);
    }

    @NotNull
    public static final c g2(@NotNull l lVar, @NotNull l b10) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new c(i.z(lVar.I(), b10.I()) < 0, i.z(lVar.M(), b10.M()) < 0, i.z(lVar.N(), b10.N()) < 0, i.z(lVar.H(), b10.H()) < 0);
    }

    @NotNull
    public static final l g3(@NotNull l a10, @NotNull l b10, @NotNull l x10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        Intrinsics.checkNotNullParameter(x10, "x");
        short sI = a10.I();
        short sI2 = b10.I();
        short sI3 = x10.I();
        short sF0 = i.f0(i.i0(sI, i.a0(d0.e(), sI3)), i.i0(sI2, sI3));
        short sM = a10.M();
        short sM2 = b10.M();
        short sM3 = x10.M();
        short sF1 = i.f0(i.i0(sM, i.a0(d0.e(), sM3)), i.i0(sM2, sM3));
        short sN = a10.N();
        short sN2 = b10.N();
        short sN3 = x10.N();
        short sF2 = i.f0(i.i0(sN, i.a0(d0.e(), sN3)), i.i0(sN2, sN3));
        short sH = a10.H();
        short sH2 = b10.H();
        short sH3 = x10.H();
        return new l(sF0, sF1, sF2, i.f0(i.i0(sH, i.a0(d0.e(), sH3)), i.i0(sH2, sH3)), (DefaultConstructorMarker) null);
    }

    @NotNull
    public static final k g4(short s10, @NotNull k v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new k(i.i0(s10, v10.z()), i.i0(s10, v10.C()), i.i0(s10, v10.D()), (DefaultConstructorMarker) null);
    }

    public static final boolean h(@NotNull c v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        if (!v10.D() || !v10.H() || !v10.I() || !v10.C()) {
            return false;
        }
        boolean z10 = false | true;
        return true;
    }

    @NotNull
    public static final c h0(@NotNull g a10, float f10, float f11) {
        Intrinsics.checkNotNullParameter(a10, "a");
        return new c(Math.abs(a10.Q() - f10) < f11, Math.abs(a10.U() - f10) < f11, Math.abs(a10.V() - f10) < f11, Math.abs(a10.P() - f10) < f11);
    }

    @NotNull
    public static final b h1(@NotNull f fVar, float f10) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return new b(fVar.H() >= f10, fVar.K() >= f10, fVar.L() >= f10);
    }

    @NotNull
    public static final a h2(@NotNull j lt, short s10) {
        Intrinsics.checkNotNullParameter(lt, "$this$lt");
        int i10 = 7 << 0;
        return new a(i.z(lt.r(), s10) < 0, i.z(lt.t(), s10) < 0);
    }

    @NotNull
    public static final k h3(@NotNull k a10, @NotNull k b10, short s10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new k(i.f0(i.i0(a10.z(), i.a0(d0.e(), s10)), i.i0(b10.z(), s10)), i.f0(i.i0(a10.C(), i.a0(d0.e(), s10)), i.i0(b10.C(), s10)), i.f0(i.i0(a10.D(), i.a0(d0.e(), s10)), i.i0(b10.D(), s10)), (DefaultConstructorMarker) null);
    }

    @NotNull
    public static final l h4(short s10, @NotNull l v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return new l(i.i0(s10, v10.I()), i.i0(s10, v10.M()), i.i0(s10, v10.N()), i.i0(s10, v10.H()), (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x006b A[PHI: r5
      0x006b: PHI (r5v8 float) = (r5v3 float), (r5v4 float) binds: [B:7:0x0069, B:10:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    public static final float i(@NotNull e a10, @NotNull e b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        float fSqrt = ((float) Math.sqrt((a10.z() * a10.z()) + (a10.B() * a10.B()))) * ((float) Math.sqrt((b10.z() * b10.z()) + (b10.B() * b10.B())));
        if (fSqrt == 0.0f) {
            return 0.0f;
        }
        float fZ = ((a10.z() * b10.z()) + (a10.B() * b10.B())) / fSqrt;
        float f10 = -1.0f;
        if (fZ < -1.0f) {
            fZ = f10;
        } else {
            f10 = 1.0f;
            if (fZ > 1.0f) {
                fZ = f10;
            }
        }
        return (float) Math.acos(fZ);
    }

    @NotNull
    public static final c i0(@NotNull g a10, @NotNull g b10, float f10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new c(Math.abs(a10.Q() - b10.Q()) < f10, Math.abs(a10.U() - b10.U()) < f10, Math.abs(a10.V() - b10.V()) < f10, Math.abs(a10.P() - b10.P()) < f10);
    }

    @NotNull
    public static final b i1(@NotNull f fVar, @NotNull f b10) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new b(fVar.H() >= b10.H(), fVar.K() >= b10.K(), fVar.L() >= b10.L());
    }

    @NotNull
    public static final b i2(@NotNull k lt, short s10) {
        Intrinsics.checkNotNullParameter(lt, "$this$lt");
        return new b(i.z(lt.z(), s10) < 0, i.z(lt.C(), s10) < 0, i.z(lt.D(), s10) < 0);
    }

    @NotNull
    public static final l i3(@NotNull l a10, @NotNull l b10, short s10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new l(i.f0(i.i0(a10.I(), i.a0(d0.e(), s10)), i.i0(b10.I(), s10)), i.f0(i.i0(a10.M(), i.a0(d0.e(), s10)), i.i0(b10.M(), s10)), i.f0(i.i0(a10.N(), i.a0(d0.e(), s10)), i.i0(b10.N(), s10)), i.f0(i.i0(a10.H(), i.a0(d0.e(), s10)), i.i0(b10.H(), s10)), (DefaultConstructorMarker) null);
    }

    @NotNull
    public static final e i4(@NotNull e v10, @NotNull Function1<? super Float, Float> block) {
        Intrinsics.checkNotNullParameter(v10, "v");
        Intrinsics.checkNotNullParameter(block, "block");
        e eVarH = e.h(v10, 0.0f, 0.0f, 3, null);
        eVarH.S(block.invoke(Float.valueOf(eVarH.z())).floatValue());
        eVarH.U(block.invoke(Float.valueOf(eVarH.B())).floatValue());
        return eVarH;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0091 A[PHI: r5
      0x0091: PHI (r5v8 float) = (r5v3 float), (r5v4 float) binds: [B:6:0x008f, B:9:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    public static final float j(@NotNull f a10, @NotNull f b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        float fSqrt = ((float) Math.sqrt((a10.H() * a10.H()) + (a10.K() * a10.K()) + (a10.L() * a10.L()))) * ((float) Math.sqrt((b10.H() * b10.H()) + (b10.K() * b10.K()) + (b10.L() * b10.L())));
        if (fSqrt == 0.0f) {
            return 0.0f;
        }
        float fH = (((a10.H() * b10.H()) + (a10.K() * b10.K())) + (a10.L() * b10.L())) / fSqrt;
        float f10 = -1.0f;
        if (fH < -1.0f) {
            fH = f10;
        } else {
            f10 = 1.0f;
            if (fH > 1.0f) {
                fH = f10;
            }
        }
        return (float) Math.acos(fH);
    }

    @NotNull
    public static final c j0(@NotNull l a10, @NotNull l b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new c(i.L(a10.I(), b10.I()), i.L(a10.M(), b10.M()), i.L(a10.N(), b10.N()), i.L(a10.H(), b10.H()));
    }

    @NotNull
    public static final b j1(@NotNull k kVar, @NotNull k b10) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new b(i.z(kVar.z(), b10.z()) >= 0, i.z(kVar.C(), b10.C()) >= 0, i.z(kVar.D(), b10.D()) >= 0);
    }

    @NotNull
    public static final c j2(@NotNull l lt, short s10) {
        Intrinsics.checkNotNullParameter(lt, "$this$lt");
        return new c(i.z(lt.I(), s10) < 0, i.z(lt.M(), s10) < 0, i.z(lt.N(), s10) < 0, i.z(lt.H(), s10) < 0);
    }

    @NotNull
    public static final a j3(@NotNull e eVar, float f10) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        return new a(!(eVar.z() == f10), !(eVar.B() == f10));
    }

    @NotNull
    public static final f j4(@NotNull f v10, @NotNull Function1<? super Float, Float> block) {
        Intrinsics.checkNotNullParameter(v10, "v");
        Intrinsics.checkNotNullParameter(block, "block");
        boolean z10 = false | false;
        f fVarI = f.i(v10, 0.0f, 0.0f, 0.0f, 7, null);
        fVarI.k0(block.invoke(Float.valueOf(fVarI.H())).floatValue());
        fVarI.n0(block.invoke(Float.valueOf(fVarI.K())).floatValue());
        fVarI.o0(block.invoke(Float.valueOf(fVarI.L())).floatValue());
        return fVarI;
    }

    public static final boolean k(@NotNull a v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return v10.o() || v10.q();
    }

    public static /* synthetic */ a k0(e a10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f11 = 0.0f;
        }
        Intrinsics.checkNotNullParameter(a10, "a");
        return new a(Math.abs(a10.z() - f10) < f11, Math.abs(a10.B() - f10) < f11);
    }

    @NotNull
    public static final c k1(@NotNull g gVar, float f10) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return new c(gVar.Q() >= f10, gVar.U() >= f10, gVar.V() >= f10, gVar.P() >= f10);
    }

    @NotNull
    public static final a k2(@NotNull e eVar, float f10) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        return new a(eVar.z() <= f10, eVar.B() <= f10);
    }

    @NotNull
    public static final a k3(@NotNull e eVar, @NotNull e b10) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new a(!(eVar.z() == b10.z()), !(eVar.B() == b10.B()));
    }

    @NotNull
    public static final g k4(@NotNull g v10, @NotNull Function1<? super Float, Float> block) {
        Intrinsics.checkNotNullParameter(v10, "v");
        Intrinsics.checkNotNullParameter(block, "block");
        g gVarJ = g.j(v10, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
        gVarJ.D0(block.invoke(Float.valueOf(gVarJ.Q())).floatValue());
        gVarJ.H0(block.invoke(Float.valueOf(gVarJ.U())).floatValue());
        gVarJ.I0(block.invoke(Float.valueOf(gVarJ.V())).floatValue());
        gVarJ.C0(block.invoke(Float.valueOf(gVarJ.P())).floatValue());
        return gVarJ;
    }

    public static final boolean l(@NotNull b v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return v10.v() || v10.y() || v10.z();
    }

    public static /* synthetic */ a l0(e a10, e b10, float f10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f10 = 0.0f;
        }
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        int i11 = 6 << 0;
        return new a(Math.abs(a10.z() - b10.z()) < f10, Math.abs(a10.B() - b10.B()) < f10);
    }

    @NotNull
    public static final c l1(@NotNull g gVar, @NotNull g b10) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new c(gVar.Q() >= b10.Q(), gVar.U() >= b10.U(), gVar.V() >= b10.V(), gVar.P() >= b10.P());
    }

    @NotNull
    public static final a l2(@NotNull e eVar, @NotNull e b10) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new a(eVar.z() <= b10.z(), eVar.B() <= b10.B());
    }

    @NotNull
    public static final a l3(@NotNull j jVar, @NotNull j b10) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new a(!i.L(jVar.r(), b10.r()), !i.L(jVar.t(), b10.t()));
    }

    @NotNull
    public static final j l4(@NotNull j v10, @NotNull Function1<? super i, i> block) {
        Intrinsics.checkNotNullParameter(v10, "v");
        Intrinsics.checkNotNullParameter(block, "block");
        int i10 = 7 >> 0;
        j jVarD = j.d(v10, (short) 0, (short) 0, 3, null);
        jVarD.K(block.invoke(i.w(jVarD.r())).u0());
        jVarD.M(block.invoke(i.w(jVarD.t())).u0());
        return jVarD;
    }

    public static final boolean m(@NotNull c v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return v10.D() || v10.H() || v10.I() || v10.C();
    }

    public static /* synthetic */ b m0(f a10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f11 = 0.0f;
        }
        Intrinsics.checkNotNullParameter(a10, "a");
        return new b(Math.abs(a10.H() - f10) < f11, Math.abs(a10.K() - f10) < f11, Math.abs(a10.L() - f10) < f11);
    }

    @NotNull
    public static final c m1(@NotNull l lVar, @NotNull l b10) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new c(i.z(lVar.I(), b10.I()) >= 0, i.z(lVar.M(), b10.M()) >= 0, i.z(lVar.N(), b10.N()) >= 0, i.z(lVar.H(), b10.H()) >= 0);
    }

    @NotNull
    public static final a m2(@NotNull j jVar, @NotNull j b10) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Intrinsics.checkNotNullParameter(b10, "b");
        int i10 = 4 >> 1;
        return new a(i.z(jVar.r(), b10.r()) <= 0, i.z(jVar.t(), b10.t()) <= 0);
    }

    @NotNull
    public static final b m3(@NotNull f fVar, float f10) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        int i10 = 3 & 1;
        return new b(!(fVar.H() == f10), !(fVar.K() == f10), !(fVar.L() == f10));
    }

    @NotNull
    public static final k m4(@NotNull k v10, @NotNull Function1<? super i, i> block) {
        Intrinsics.checkNotNullParameter(v10, "v");
        Intrinsics.checkNotNullParameter(block, "block");
        boolean z10 = true;
        k kVarE = k.e(v10, (short) 0, (short) 0, (short) 0, 7, null);
        kVarE.c0(block.invoke(i.w(kVarE.z())).u0());
        kVarE.f0(block.invoke(i.w(kVarE.C())).u0());
        kVarE.g0(block.invoke(i.w(kVarE.D())).u0());
        return kVarE;
    }

    @NotNull
    public static final e n(@NotNull e v10, float f10, float f11) {
        Intrinsics.checkNotNullParameter(v10, "v");
        float fZ = v10.z();
        if (fZ < f10) {
            fZ = f10;
        } else if (fZ > f11) {
            fZ = f11;
        }
        float fB = v10.B();
        if (fB >= f10) {
            f10 = fB > f11 ? f11 : fB;
        }
        return new e(fZ, f10);
    }

    public static /* synthetic */ b n0(f a10, f b10, float f10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f10 = 0.0f;
        }
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new b(Math.abs(a10.H() - b10.H()) < f10, Math.abs(a10.K() - b10.K()) < f10, Math.abs(a10.L() - b10.L()) < f10);
    }

    @NotNull
    public static final a n1(@NotNull j gte, short s10) {
        Intrinsics.checkNotNullParameter(gte, "$this$gte");
        return new a(i.z(gte.r(), s10) >= 0, i.z(gte.t(), s10) >= 0);
    }

    @NotNull
    public static final b n2(@NotNull f fVar, float f10) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return new b(fVar.H() <= f10, fVar.K() <= f10, fVar.L() <= f10);
    }

    @NotNull
    public static final b n3(@NotNull f fVar, @NotNull f b10) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new b(!(fVar.H() == b10.H()), !(fVar.K() == b10.K()), !(fVar.L() == b10.L()));
    }

    @NotNull
    public static final l n4(@NotNull l v10, @NotNull Function1<? super i, i> block) {
        Intrinsics.checkNotNullParameter(v10, "v");
        Intrinsics.checkNotNullParameter(block, "block");
        l lVarF = l.f(v10, (short) 0, (short) 0, (short) 0, (short) 0, 15, null);
        lVarF.v0(block.invoke(i.w(lVarF.I())).u0());
        lVarF.z0(block.invoke(i.w(lVarF.M())).u0());
        lVarF.A0(block.invoke(i.w(lVarF.N())).u0());
        lVarF.u0(block.invoke(i.w(lVarF.H())).u0());
        return lVarF;
    }

    @NotNull
    public static final e o(@NotNull e v10, @NotNull e min, @NotNull e max) {
        Intrinsics.checkNotNullParameter(v10, "v");
        Intrinsics.checkNotNullParameter(min, "min");
        Intrinsics.checkNotNullParameter(max, "max");
        float fZ = v10.z();
        float fZ2 = min.z();
        float fZ3 = max.z();
        if (fZ < fZ2) {
            fZ = fZ2;
        } else if (fZ > fZ3) {
            fZ = fZ3;
        }
        float fB = v10.B();
        float fB2 = min.B();
        float fB3 = max.B();
        if (fB < fB2) {
            fB = fB2;
        } else if (fB > fB3) {
            fB = fB3;
        }
        return new e(fZ, fB);
    }

    public static /* synthetic */ c o0(g a10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f11 = 0.0f;
        }
        Intrinsics.checkNotNullParameter(a10, "a");
        return new c(Math.abs(a10.Q() - f10) < f11, Math.abs(a10.U() - f10) < f11, Math.abs(a10.V() - f10) < f11, Math.abs(a10.P() - f10) < f11);
    }

    @NotNull
    public static final b o1(@NotNull k gte, short s10) {
        Intrinsics.checkNotNullParameter(gte, "$this$gte");
        return new b(i.z(gte.z(), s10) >= 0, i.z(gte.C(), s10) >= 0, i.z(gte.D(), s10) >= 0);
    }

    @NotNull
    public static final b o2(@NotNull f fVar, @NotNull f b10) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new b(fVar.H() <= b10.H(), fVar.K() <= b10.K(), fVar.L() <= b10.L());
    }

    @NotNull
    public static final b o3(@NotNull k kVar, @NotNull k b10) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new b(!i.L(kVar.z(), b10.z()), !i.L(kVar.C(), b10.C()), !i.L(kVar.D(), b10.D()));
    }

    @NotNull
    public static final f o4(@NotNull f fVar, @NotNull f v10) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(v10, "v");
        return new f((fVar.K() * v10.L()) - (fVar.L() * v10.K()), (fVar.L() * v10.H()) - (fVar.H() * v10.L()), (fVar.H() * v10.K()) - (fVar.K() * v10.H()));
    }

    @NotNull
    public static final f p(@NotNull f v10, float f10, float f11) {
        Intrinsics.checkNotNullParameter(v10, "v");
        float fH = v10.H();
        if (fH < f10) {
            fH = f10;
        } else if (fH > f11) {
            fH = f11;
        }
        float fK = v10.K();
        if (fK < f10) {
            fK = f10;
        } else if (fK > f11) {
            fK = f11;
        }
        float fL = v10.L();
        if (fL >= f10) {
            f10 = fL > f11 ? f11 : fL;
        }
        return new f(fH, fK, f10);
    }

    public static /* synthetic */ c p0(g a10, g b10, float f10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f10 = 0.0f;
        }
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new c(Math.abs(a10.Q() - b10.Q()) < f10, Math.abs(a10.U() - b10.U()) < f10, Math.abs(a10.V() - b10.V()) < f10, Math.abs(a10.P() - b10.P()) < f10);
    }

    @NotNull
    public static final c p1(@NotNull l gte, short s10) {
        Intrinsics.checkNotNullParameter(gte, "$this$gte");
        return new c(i.z(gte.I(), s10) >= 0, i.z(gte.M(), s10) >= 0, i.z(gte.N(), s10) >= 0, i.z(gte.H(), s10) >= 0);
    }

    @NotNull
    public static final b p2(@NotNull k kVar, @NotNull k b10) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new b(i.z(kVar.z(), b10.z()) <= 0, i.z(kVar.C(), b10.C()) <= 0, i.z(kVar.D(), b10.D()) <= 0);
    }

    @NotNull
    public static final c p3(@NotNull g gVar, float f10) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return new c(!(gVar.Q() == f10), !(gVar.U() == f10), !(gVar.V() == f10), !(gVar.P() == f10));
    }

    @NotNull
    public static final k p4(@NotNull k kVar, @NotNull k v10) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        Intrinsics.checkNotNullParameter(v10, "v");
        return new k(i.a0(i.i0(kVar.C(), v10.D()), i.i0(kVar.D(), v10.C())), i.a0(i.i0(kVar.D(), v10.z()), i.i0(kVar.z(), v10.D())), i.a0(i.i0(kVar.z(), v10.C()), i.i0(kVar.C(), v10.z())), (DefaultConstructorMarker) null);
    }

    @NotNull
    public static final f q(@NotNull f v10, @NotNull f min, @NotNull f max) {
        Intrinsics.checkNotNullParameter(v10, "v");
        Intrinsics.checkNotNullParameter(min, "min");
        Intrinsics.checkNotNullParameter(max, "max");
        float fH = v10.H();
        float fH2 = min.H();
        float fH3 = max.H();
        if (fH < fH2) {
            fH = fH2;
        } else if (fH > fH3) {
            fH = fH3;
        }
        float fK = v10.K();
        float fK2 = min.K();
        float fK3 = max.K();
        if (fK < fK2) {
            fK = fK2;
        } else if (fK > fK3) {
            fK = fK3;
        }
        float fL = v10.L();
        float fL2 = min.L();
        float fL3 = max.L();
        if (fL < fL2) {
            fL = fL2;
        } else if (fL > fL3) {
            fL = fL3;
        }
        return new f(fH, fK, fL);
    }

    @NotNull
    public static final a q0(@NotNull j a10, short s10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        return new a(i.L(a10.r(), s10), i.L(a10.t(), s10));
    }

    public static final float q1(@NotNull e v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return (float) Math.sqrt((v10.z() * v10.z()) + (v10.B() * v10.B()));
    }

    @NotNull
    public static final c q2(@NotNull g gVar, float f10) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        int i10 = 6 << 1;
        return new c(gVar.Q() <= f10, gVar.U() <= f10, gVar.V() <= f10, gVar.P() <= f10);
    }

    @NotNull
    public static final c q3(@NotNull g gVar, @NotNull g b10) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new c(!(gVar.Q() == b10.Q()), !(gVar.U() == b10.U()), !(gVar.V() == b10.V()), !(gVar.P() == b10.P()));
    }

    @NotNull
    public static final g r(@NotNull g v10, float f10, float f11) {
        Intrinsics.checkNotNullParameter(v10, "v");
        float fQ = v10.Q();
        if (fQ < f10) {
            fQ = f10;
        } else if (fQ > f11) {
            fQ = f11;
        }
        float fU = v10.U();
        if (fU < f10) {
            fU = f10;
        } else if (fU > f11) {
            fU = f11;
        }
        float fV = v10.V();
        if (fV < f10) {
            fV = f10;
        } else if (fV > f11) {
            fV = f11;
        }
        float fP = v10.P();
        if (fP >= f10) {
            f10 = fP > f11 ? f11 : fP;
        }
        return new g(fQ, fU, fV, f10);
    }

    @NotNull
    public static final b r0(@NotNull k a10, short s10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        return new b(i.L(a10.z(), s10), i.L(a10.C(), s10), i.L(a10.D(), s10));
    }

    public static final float r1(@NotNull f v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return (float) Math.sqrt((v10.H() * v10.H()) + (v10.K() * v10.K()) + (v10.L() * v10.L()));
    }

    @NotNull
    public static final c r2(@NotNull g gVar, @NotNull g b10) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new c(gVar.Q() <= b10.Q(), gVar.U() <= b10.U(), gVar.V() <= b10.V(), gVar.P() <= b10.P());
    }

    @NotNull
    public static final c r3(@NotNull l lVar, @NotNull l b10) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new c(!i.L(lVar.I(), b10.I()), !i.L(lVar.M(), b10.M()), !i.L(lVar.N(), b10.N()), !i.L(lVar.H(), b10.H()));
    }

    @NotNull
    public static final g s(@NotNull g v10, @NotNull g min, @NotNull g max) {
        Intrinsics.checkNotNullParameter(v10, "v");
        Intrinsics.checkNotNullParameter(min, "min");
        Intrinsics.checkNotNullParameter(max, "max");
        float fQ = v10.Q();
        float fQ2 = min.Q();
        float fQ3 = max.Q();
        if (fQ < fQ2) {
            fQ = fQ2;
        } else if (fQ > fQ3) {
            fQ = fQ3;
        }
        float fU = v10.U();
        float fU2 = min.U();
        float fU3 = max.U();
        if (fU < fU2) {
            fU = fU2;
        } else if (fU > fU3) {
            fU = fU3;
        }
        float fV = v10.V();
        float fV2 = min.V();
        float fV3 = max.V();
        if (fV < fV2) {
            fV = fV2;
        } else if (fV > fV3) {
            fV = fV3;
        }
        float fP = v10.P();
        float fV4 = min.V();
        float fP2 = max.P();
        if (fP < fV4) {
            fP = fV4;
        } else if (fP > fP2) {
            fP = fP2;
        }
        return new g(fQ, fU, fV, fP);
    }

    @NotNull
    public static final c s0(@NotNull l a10, short s10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        return new c(i.L(a10.I(), s10), i.L(a10.M(), s10), i.L(a10.N(), s10), i.L(a10.H(), s10));
    }

    public static final float s1(@NotNull g v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return (float) Math.sqrt((v10.Q() * v10.Q()) + (v10.U() * v10.U()) + (v10.V() * v10.V()) + (v10.P() * v10.P()));
    }

    @NotNull
    public static final c s2(@NotNull l lVar, @NotNull l b10) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new c(i.z(lVar.I(), b10.I()) <= 0, i.z(lVar.M(), b10.M()) <= 0, i.z(lVar.N(), b10.N()) <= 0, i.z(lVar.H(), b10.H()) <= 0);
    }

    @NotNull
    public static final a s3(@NotNull j neq, short s10) {
        Intrinsics.checkNotNullParameter(neq, "$this$neq");
        return new a(!i.L(neq.r(), s10), !i.L(neq.t(), s10));
    }

    @NotNull
    public static final k t(@NotNull k v10, @NotNull k min, @NotNull k max) {
        Intrinsics.checkNotNullParameter(v10, "v");
        Intrinsics.checkNotNullParameter(min, "min");
        Intrinsics.checkNotNullParameter(max, "max");
        short sZ = v10.z();
        short sZ2 = min.z();
        short sZ3 = max.z();
        if (i.z(sZ, sZ2) < 0) {
            sZ = sZ2;
        } else if (i.z(sZ, sZ3) > 0) {
            sZ = sZ3;
        }
        short sC = v10.C();
        short sC2 = min.C();
        short sC3 = max.C();
        if (i.z(sC, sC2) < 0) {
            sC = sC2;
        } else if (i.z(sC, sC3) > 0) {
            sC = sC3;
        }
        short sD = v10.D();
        short sD2 = min.D();
        short sD3 = max.D();
        if (i.z(sD, sD2) < 0) {
            sD = sD2;
        } else if (i.z(sD, sD3) > 0) {
            sD = sD3;
        }
        return new k(sZ, sC, sD, (DefaultConstructorMarker) null);
    }

    public static final boolean t0(float f10, float f11, float f12) {
        return Math.abs(f10 - f11) < f12;
    }

    public static final short t1(@NotNull k v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return m.s(i.f0(i.f0(i.i0(v10.z(), v10.z()), i.i0(v10.C(), v10.C())), i.i0(v10.D(), v10.D())));
    }

    @NotNull
    public static final a t2(@NotNull j lte, short s10) {
        Intrinsics.checkNotNullParameter(lte, "$this$lte");
        return new a(i.z(lte.r(), s10) <= 0, i.z(lte.t(), s10) <= 0);
    }

    @NotNull
    public static final b t3(@NotNull k neq, short s10) {
        Intrinsics.checkNotNullParameter(neq, "$this$neq");
        return new b(!i.L(neq.z(), s10), !i.L(neq.C(), s10), !i.L(neq.D(), s10));
    }

    @NotNull
    public static final l u(@NotNull l v10, @NotNull l min, @NotNull l max) {
        short s10;
        Intrinsics.checkNotNullParameter(v10, "v");
        Intrinsics.checkNotNullParameter(min, "min");
        Intrinsics.checkNotNullParameter(max, "max");
        short sI = v10.I();
        short sI2 = min.I();
        short sI3 = max.I();
        if (i.z(sI, sI2) >= 0) {
            sI2 = i.z(sI, sI3) > 0 ? sI3 : sI;
        }
        short sM = v10.M();
        short sM2 = min.M();
        short sM3 = max.M();
        if (i.z(sM, sM2) >= 0) {
            sM2 = i.z(sM, sM3) > 0 ? sM3 : sM;
        }
        short sN = v10.N();
        short sN2 = min.N();
        short sN3 = max.N();
        if (i.z(sN, sN2) >= 0) {
            sN2 = i.z(sN, sN3) > 0 ? sN3 : sN;
        }
        short sH = v10.H();
        short sN4 = min.N();
        short sH2 = max.H();
        if (i.z(sH, sN4) < 0) {
            s10 = sN4;
        } else {
            s10 = i.z(sH, sH2) > 0 ? sH2 : sH;
        }
        return new l(sI2, sM2, sN2, s10, (DefaultConstructorMarker) null);
    }

    @NotNull
    public static final a u0(@NotNull e a10, float f10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        return new a(a10.z() > f10, a10.B() > f10);
    }

    public static final short u1(@NotNull l v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return m.s(i.f0(i.f0(i.f0(i.i0(v10.I(), v10.I()), i.i0(v10.M(), v10.M())), i.i0(v10.N(), v10.N())), i.i0(v10.H(), v10.H())));
    }

    @NotNull
    public static final b u2(@NotNull k lte, short s10) {
        Intrinsics.checkNotNullParameter(lte, "$this$lte");
        return new b(i.z(lte.z(), s10) <= 0, i.z(lte.C(), s10) <= 0, i.z(lte.D(), s10) <= 0);
    }

    @NotNull
    public static final c u3(@NotNull l neq, short s10) {
        Intrinsics.checkNotNullParameter(neq, "$this$neq");
        return new c(!i.L(neq.I(), s10), !i.L(neq.M(), s10), !i.L(neq.N(), s10), !i.L(neq.H(), s10));
    }

    @NotNull
    public static final k v(@NotNull k v10, short s10, short s11) {
        Intrinsics.checkNotNullParameter(v10, "v");
        short sZ = v10.z();
        if (i.z(sZ, s10) < 0) {
            sZ = s10;
        } else if (i.z(sZ, s11) > 0) {
            sZ = s11;
        }
        short sC = v10.C();
        if (i.z(sC, s10) < 0) {
            sC = s10;
        } else if (i.z(sC, s11) > 0) {
            sC = s11;
        }
        short sD = v10.D();
        if (i.z(sD, s10) >= 0) {
            s10 = i.z(sD, s11) > 0 ? s11 : sD;
        }
        return new k(sZ, sC, s10, (DefaultConstructorMarker) null);
    }

    @NotNull
    public static final a v0(@NotNull e a10, @NotNull e b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new a(a10.z() > b10.B(), a10.B() > b10.B());
    }

    public static final float v1(@NotNull e v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return (v10.z() * v10.z()) + (v10.B() * v10.B());
    }

    @NotNull
    public static final c v2(@NotNull l lte, short s10) {
        Intrinsics.checkNotNullParameter(lte, "$this$lte");
        return new c(i.z(lte.I(), s10) <= 0, i.z(lte.M(), s10) <= 0, i.z(lte.N(), s10) <= 0, i.z(lte.H(), s10) <= 0);
    }

    @NotNull
    public static final e v3(@NotNull e v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        float fSqrt = 1.0f / ((float) Math.sqrt((v10.z() * v10.z()) + (v10.B() * v10.B())));
        return new e(v10.z() * fSqrt, v10.B() * fSqrt);
    }

    @NotNull
    public static final l w(@NotNull l v10, short s10, short s11) {
        short s12;
        short s13;
        short s14;
        short s15;
        Intrinsics.checkNotNullParameter(v10, "v");
        short sI = v10.I();
        if (i.z(sI, s10) < 0) {
            s12 = s10;
        } else {
            s12 = i.z(sI, s11) > 0 ? s11 : sI;
        }
        short sM = v10.M();
        if (i.z(sM, s10) < 0) {
            s13 = s10;
        } else {
            s13 = i.z(sM, s11) > 0 ? s11 : sM;
        }
        short sN = v10.N();
        if (i.z(sN, s10) < 0) {
            s14 = s10;
        } else {
            s14 = i.z(sN, s11) > 0 ? s11 : sN;
        }
        short sH = v10.H();
        if (i.z(sH, s10) < 0) {
            s15 = s10;
        } else {
            s15 = i.z(sH, s11) > 0 ? s11 : sH;
        }
        return new l(s12, s13, s14, s15, (DefaultConstructorMarker) null);
    }

    @NotNull
    public static final a w0(@NotNull j a10, @NotNull j b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new a(i.z(a10.r(), b10.t()) > 0, i.z(a10.t(), b10.t()) > 0);
    }

    public static final float w1(@NotNull f v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return (v10.H() * v10.H()) + (v10.K() * v10.K()) + (v10.L() * v10.L());
    }

    public static final float w2(@NotNull e v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return Math.max(v10.z(), v10.B());
    }

    @NotNull
    public static final f w3(@NotNull f v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        float fSqrt = 1.0f / ((float) Math.sqrt(((v10.H() * v10.H()) + (v10.K() * v10.K())) + (v10.L() * v10.L())));
        return new f(v10.H() * fSqrt, v10.K() * fSqrt, v10.L() * fSqrt);
    }

    public static final float x(float f10, float f11, float f12) {
        if (Math.abs(f10 - f11) < f12) {
            return 0.0f;
        }
        return Float.compare(f10, f11);
    }

    @NotNull
    public static final b x0(@NotNull f a10, float f10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        return new b(a10.H() > f10, a10.K() > f10, a10.L() > f10);
    }

    public static final float x1(@NotNull g v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return (v10.Q() * v10.Q()) + (v10.U() * v10.U()) + (v10.V() * v10.V()) + (v10.P() * v10.P());
    }

    public static final float x2(@NotNull f v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return Math.max(v10.H(), Math.max(v10.K(), v10.L()));
    }

    @NotNull
    public static final g x3(@NotNull g v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        float fSqrt = 1.0f / ((float) Math.sqrt((((v10.Q() * v10.Q()) + (v10.U() * v10.U())) + (v10.V() * v10.V())) + (v10.P() * v10.P())));
        return new g(v10.Q() * fSqrt, v10.U() * fSqrt, v10.V() * fSqrt, v10.P() * fSqrt);
    }

    @NotNull
    public static final f y(@NotNull f a10, @NotNull f b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new f((a10.K() * b10.L()) - (a10.L() * b10.K()), (a10.L() * b10.H()) - (a10.H() * b10.L()), (a10.H() * b10.K()) - (a10.K() * b10.H()));
    }

    @NotNull
    public static final b y0(@NotNull f a10, @NotNull f b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new b(a10.H() > b10.K(), a10.K() > b10.K(), a10.L() > b10.L());
    }

    public static final short y1(@NotNull k v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return i.f0(i.f0(i.i0(v10.z(), v10.z()), i.i0(v10.C(), v10.C())), i.i0(v10.D(), v10.D()));
    }

    public static final float y2(@NotNull g v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return Math.max(v10.Q(), Math.max(v10.U(), Math.max(v10.V(), v10.P())));
    }

    @NotNull
    public static final k y3(@NotNull k v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        short sH = i.H(d0.e(), m.s(i.f0(i.f0(i.i0(v10.z(), v10.z()), i.i0(v10.C(), v10.C())), i.i0(v10.D(), v10.D()))));
        return new k(i.i0(v10.z(), sH), i.i0(v10.C(), sH), i.i0(v10.D(), sH), (DefaultConstructorMarker) null);
    }

    @NotNull
    public static final k z(@NotNull k a10, @NotNull k b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new k(i.a0(i.i0(a10.C(), b10.D()), i.i0(a10.D(), b10.C())), i.a0(i.i0(a10.D(), b10.z()), i.i0(a10.z(), b10.D())), i.a0(i.i0(a10.z(), b10.C()), i.i0(a10.C(), b10.z())), (DefaultConstructorMarker) null);
    }

    @NotNull
    public static final b z0(@NotNull k a10, @NotNull k b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new b(i.z(a10.z(), b10.C()) > 0, i.z(a10.C(), b10.C()) > 0, i.z(a10.D(), b10.D()) > 0);
    }

    public static final short z1(@NotNull l v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        return i.f0(i.f0(i.f0(i.i0(v10.I(), v10.I()), i.i0(v10.M(), v10.M())), i.i0(v10.N(), v10.N())), i.i0(v10.H(), v10.H()));
    }

    @NotNull
    public static final e z2(@NotNull e a10, @NotNull e b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return new e(Math.max(a10.z(), b10.z()), Math.max(a10.B(), b10.B()));
    }

    @NotNull
    public static final l z3(@NotNull l v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        short sH = i.H(d0.e(), m.s(i.f0(i.f0(i.f0(i.i0(v10.I(), v10.I()), i.i0(v10.M(), v10.M())), i.i0(v10.N(), v10.N())), i.i0(v10.H(), v10.H()))));
        return new l(i.i0(v10.I(), sH), i.i0(v10.M(), sH), i.i0(v10.N(), sH), i.i0(v10.H(), sH), (DefaultConstructorMarker) null);
    }
}
