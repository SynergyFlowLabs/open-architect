package io.sentry.android.replay;

import androidx.compose.runtime.internal.w0;
import io.sentry.n4;
import io.sentry.q9;
import io.sentry.y7;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.f0;
import kotlin.g0;
import kotlin.j0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nDefaultReplayBreadcrumbConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultReplayBreadcrumbConverter.kt\nio/sentry/android/replay/DefaultReplayBreadcrumbConverter\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,165:1\n478#2,7:166\n*S KotlinDebug\n*F\n+ 1 DefaultReplayBreadcrumbConverter.kt\nio/sentry/android/replay/DefaultReplayBreadcrumbConverter\n*L\n98#1:166,7\n*E\n"})
public class b implements n4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final C2206b f304691b = new C2206b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f304692c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final f0<Regex> f304693d = g0.b(j0.NONE, a.f304696a);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final HashSet<String> f304694e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private String f304695a;

    static final class a extends l0 implements Function0<Regex> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f304696a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Regex invoke() {
            return new Regex("_[a-z]");
        }
    }

    /* JADX INFO: renamed from: io.sentry.android.replay.b$b, reason: collision with other inner class name */
    public static final class C2206b {
        public /* synthetic */ C2206b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Regex b() {
            return (Regex) b.f304693d.getValue();
        }

        private C2206b() {
        }
    }

    static final class c extends l0 implements Function1<MatchResult, CharSequence> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f304697a = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(MatchResult it) {
            Intrinsics.checkNotNullParameter(it, "it");
            String upperCase = String.valueOf(StringsKt.t7(it.getValue())).toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            return upperCase;
        }
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add(io.sentry.protocol.n.b.f306414c);
        hashSet.add("method");
        hashSet.add("response_content_length");
        hashSet.add("request_content_length");
        hashSet.add(q9.f306594g);
        hashSet.add("http.request_content_length");
        f304694e = hashSet;
    }

    private final boolean c(io.sentry.f fVar) {
        Object obj = fVar.s().get("url");
        String str = obj instanceof String ? (String) obj : null;
        if (str != null && str.length() != 0) {
            Map<String, Object> mapS = fVar.s();
            Intrinsics.checkNotNullExpressionValue(mapS, "getData(...)");
            if (mapS.containsKey(q9.f306605r)) {
                Map<String, Object> mapS2 = fVar.s();
                Intrinsics.checkNotNullExpressionValue(mapS2, "getData(...)");
                if (mapS2.containsKey(q9.f306606s)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final String d(String str) {
        return f304691b.b().m(str, c.f304697a);
    }

    private final io.sentry.rrweb.i e(io.sentry.f fVar) {
        double dLongValue;
        double dLongValue2;
        Object obj = fVar.s().get(q9.f306605r);
        Object obj2 = fVar.s().get(q9.f306606s);
        io.sentry.rrweb.i iVar = new io.sentry.rrweb.i();
        iVar.g(fVar.x().getTime());
        iVar.C("resource.http");
        Object obj3 = fVar.s().get("url");
        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
        iVar.A((String) obj3);
        if (obj instanceof Double) {
            dLongValue = ((Number) obj).doubleValue();
        } else {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Long");
            dLongValue = ((Long) obj).longValue();
        }
        iVar.E(dLongValue / 1000.0d);
        if (obj2 instanceof Double) {
            dLongValue2 = ((Number) obj2).doubleValue();
        } else {
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Long");
            dLongValue2 = ((Long) obj2).longValue();
        }
        iVar.B(dLongValue2 / 1000.0d);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, Object> mapS = fVar.s();
        Intrinsics.checkNotNullExpressionValue(mapS, "getData(...)");
        for (Map.Entry<String, Object> entry : mapS.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (f304694e.contains(key)) {
                Intrinsics.checkNotNull(key);
                int i10 = 4 >> 2;
                linkedHashMap.put(d(StringsKt.p5(StringsKt.k2(key, "content_length", "body_size", false, 4, null), ".", null, 2, null)), value);
            }
        }
        iVar.y(linkedHashMap);
        return iVar;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00eb  */
    @Override // io.sentry.n4
    @Nullable
    public io.sentry.rrweb.b a(@NotNull io.sentry.f breadcrumb) {
        String strV;
        y7 y7VarT;
        Object obj;
        String strS5;
        Intrinsics.checkNotNullParameter(breadcrumb, "breadcrumb");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        io.sentry.rrweb.a aVar = null;
        if (Intrinsics.areEqual(breadcrumb.q(), "http")) {
            if (c(breadcrumb)) {
                return e(breadcrumb);
            }
            return null;
        }
        String strQ = "navigation";
        if (Intrinsics.areEqual(breadcrumb.z(), "navigation") && Intrinsics.areEqual(breadcrumb.q(), "app.lifecycle")) {
            strQ = "app." + breadcrumb.s().get("state");
        } else if (Intrinsics.areEqual(breadcrumb.z(), "navigation") && Intrinsics.areEqual(breadcrumb.q(), "device.orientation")) {
            strQ = breadcrumb.q();
            Intrinsics.checkNotNull(strQ);
            Object obj2 = breadcrumb.s().get("position");
            if (!Intrinsics.areEqual(obj2, "landscape") && !Intrinsics.areEqual(obj2, "portrait")) {
                return null;
            }
            linkedHashMap.put("position", obj2);
        } else {
            if (!Intrinsics.areEqual(breadcrumb.z(), "navigation")) {
                if (Intrinsics.areEqual(breadcrumb.q(), "ui.click")) {
                    Object obj3 = breadcrumb.s().get("view.id");
                    if (obj3 == null && (obj3 = breadcrumb.s().get("view.tag")) == null) {
                        obj3 = breadcrumb.s().get("view.class");
                    }
                    strV = obj3 instanceof String ? (String) obj3 : null;
                    if (strV == null) {
                        return null;
                    }
                    Map<String, Object> mapS = breadcrumb.s();
                    Intrinsics.checkNotNullExpressionValue(mapS, "getData(...)");
                    linkedHashMap.putAll(mapS);
                    strQ = "ui.tap";
                    y7VarT = null;
                } else if (Intrinsics.areEqual(breadcrumb.z(), "system") && Intrinsics.areEqual(breadcrumb.q(), "network.event")) {
                    if (!Intrinsics.areEqual(breadcrumb.s().get(com.facebook.internal.w0.f100156c1), "NETWORK_LOST")) {
                        Map<String, Object> mapS2 = breadcrumb.s();
                        Intrinsics.checkNotNullExpressionValue(mapS2, "getData(...)");
                        if (mapS2.containsKey("network_type")) {
                            Object obj4 = breadcrumb.s().get("network_type");
                            String str = obj4 instanceof String ? (String) obj4 : null;
                            obj = (str == null || str.length() == 0) ? "offline" : breadcrumb.s().get("network_type");
                        }
                        return null;
                    }
                    linkedHashMap.put("state", obj);
                    if (Intrinsics.areEqual(this.f304695a, linkedHashMap.get("state"))) {
                        return null;
                    }
                    Object obj5 = linkedHashMap.get("state");
                    this.f304695a = obj5 instanceof String ? (String) obj5 : null;
                    strQ = "device.connectivity";
                } else if (Intrinsics.areEqual(breadcrumb.s().get(com.facebook.internal.w0.f100156c1), "BATTERY_CHANGED")) {
                    Map<String, Object> mapS3 = breadcrumb.s();
                    Intrinsics.checkNotNullExpressionValue(mapS3, "getData(...)");
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Map.Entry<String, Object> entry : mapS3.entrySet()) {
                        String key = entry.getKey();
                        if (Intrinsics.areEqual(key, "level") || Intrinsics.areEqual(key, io.sentry.protocol.e.c.f306221i)) {
                            linkedHashMap2.put(entry.getKey(), entry.getValue());
                        }
                    }
                    linkedHashMap.putAll(linkedHashMap2);
                    strQ = "device.battery";
                } else {
                    strQ = breadcrumb.q();
                    strV = breadcrumb.v();
                    y7VarT = breadcrumb.t();
                    Map<String, Object> mapS4 = breadcrumb.s();
                    Intrinsics.checkNotNullExpressionValue(mapS4, "getData(...)");
                    linkedHashMap.putAll(mapS4);
                }
                if (strQ != null && strQ.length() != 0) {
                    aVar = new io.sentry.rrweb.a();
                    aVar.g(breadcrumb.x().getTime());
                    aVar.A(breadcrumb.x().getTime() / 1000.0d);
                    aVar.B("default");
                    aVar.C(strQ);
                    aVar.G(strV);
                    aVar.F(y7VarT);
                    aVar.D(linkedHashMap);
                }
                return aVar;
            }
            if (Intrinsics.areEqual(breadcrumb.s().get("state"), "resumed")) {
                Object obj6 = breadcrumb.s().get(com.segment.analytics.kotlin.android.plugins.a.f266538j3);
                String str2 = obj6 instanceof String ? (String) obj6 : null;
                if (str2 != null) {
                    strS5 = StringsKt.s5(str2, '.', null, 2, null);
                } else {
                    strS5 = null;
                }
            } else {
                Map<String, Object> mapS5 = breadcrumb.s();
                Intrinsics.checkNotNullExpressionValue(mapS5, "getData(...)");
                if (mapS5.containsKey("to")) {
                    Object obj7 = breadcrumb.s().get("to");
                    if (obj7 instanceof String) {
                        strS5 = (String) obj7;
                    } else {
                        strS5 = null;
                    }
                } else {
                    strS5 = null;
                }
            }
            if (strS5 == null) {
                return null;
            }
            linkedHashMap.put("to", strS5);
        }
        strV = null;
        y7VarT = null;
        if (strQ != null) {
            aVar = new io.sentry.rrweb.a();
            aVar.g(breadcrumb.x().getTime());
            aVar.A(breadcrumb.x().getTime() / 1000.0d);
            aVar.B("default");
            aVar.C(strQ);
            aVar.G(strV);
            aVar.F(y7VarT);
            aVar.D(linkedHashMap);
        }
        return aVar;
    }
}
