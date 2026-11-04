package i5;

import androidx.annotation.b1;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f286991n = 128;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final i5.a f286993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final i5.a f286994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final i5.a f286995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final i5.a f286996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final i5.a f286997e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final i5.a f286998f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final i5.a f286999g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final i5.a f287000h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final i5.a f287001i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final i5.a f287002j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final i5.a f287003k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final Map<String, i5.a> f287004l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final a f286990m = new a(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private static final Map<String, String> f286992o = MapsKt.hashMapOf(TuplesKt.to("embedding.weight", "embed.weight"), TuplesKt.to("dense1.weight", "fc1.weight"), TuplesKt.to("dense2.weight", "fc2.weight"), TuplesKt.to("dense3.weight", "fc3.weight"), TuplesKt.to("dense1.bias", "fc1.bias"), TuplesKt.to("dense2.bias", "fc2.bias"), TuplesKt.to("dense3.bias", "fc3.bias"));

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Map<String, i5.a> b(File file) {
            j jVar = j.f287037a;
            Map<String, i5.a> mapC = j.c(file);
            if (mapC == null) {
                return null;
            }
            HashMap map = new HashMap();
            Map mapA = b.a();
            for (Map.Entry<String, i5.a> entry : mapC.entrySet()) {
                String key = entry.getKey();
                if (mapA.containsKey(entry.getKey()) && (key = (String) mapA.get(entry.getKey())) == null) {
                    return null;
                }
                map.put(key, entry.getValue());
            }
            return map;
        }

        @Nullable
        public final b a(@NotNull File file) {
            Intrinsics.checkNotNullParameter(file, "file");
            Map<String, i5.a> mapB = b(file);
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (mapB == null) {
                return null;
            }
            try {
                return new b(mapB, defaultConstructorMarker);
            } catch (Exception unused) {
                return null;
            }
        }

        private a() {
        }
    }

    public /* synthetic */ b(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    public static final /* synthetic */ Map a() {
        if (com.facebook.internal.instrument.crashshield.b.e(b.class)) {
            return null;
        }
        try {
            return f286992o;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, b.class);
            return null;
        }
    }

    @Nullable
    public final i5.a b(@NotNull i5.a dense, @NotNull String[] texts, @NotNull String task) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(dense, "dense");
            Intrinsics.checkNotNullParameter(texts, "texts");
            Intrinsics.checkNotNullParameter(task, "task");
            i iVar = i.f287036a;
            i5.a aVarC = i.c(i.e(texts, 128, this.f286993a), this.f286994b);
            i.a(aVarC, this.f286997e);
            i.i(aVarC);
            i5.a aVarC2 = i.c(aVarC, this.f286995c);
            i.a(aVarC2, this.f286998f);
            i.i(aVarC2);
            int i10 = 0 >> 2;
            i5.a aVarG = i.g(aVarC2, 2);
            i5.a aVarC3 = i.c(aVarG, this.f286996d);
            i.a(aVarC3, this.f286999g);
            i.i(aVarC3);
            i5.a aVarG2 = i.g(aVarC, aVarC.b(1));
            i5.a aVarG3 = i.g(aVarG, aVarG.b(1));
            i5.a aVarG4 = i.g(aVarC3, aVarC3.b(1));
            i.f(aVarG2, 1);
            i.f(aVarG3, 1);
            i.f(aVarG4, 1);
            i5.a aVarD = i.d(i.b(new i5.a[]{aVarG2, aVarG3, aVarG4, dense}), this.f287000h, this.f287002j);
            i.i(aVarD);
            i5.a aVarD2 = i.d(aVarD, this.f287001i, this.f287003k);
            i.i(aVarD2);
            i5.a aVar = this.f287004l.get(Intrinsics.stringPlus(task, ".weight"));
            i5.a aVar2 = this.f287004l.get(Intrinsics.stringPlus(task, ".bias"));
            if (aVar != null && aVar2 != null) {
                i5.a aVarD3 = i.d(aVarD2, aVar, aVar2);
                i.j(aVarD3);
                return aVarD3;
            }
            return null;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return null;
        }
    }

    private b(Map<String, i5.a> map) {
        i5.a aVar = map.get("embed.weight");
        if (aVar == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f286993a = aVar;
        i iVar = i.f287036a;
        i5.a aVar2 = map.get("convs.0.weight");
        if (aVar2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f286994b = i.l(aVar2);
        i5.a aVar3 = map.get("convs.1.weight");
        if (aVar3 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f286995c = i.l(aVar3);
        i5.a aVar4 = map.get("convs.2.weight");
        if (aVar4 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f286996d = i.l(aVar4);
        i5.a aVar5 = map.get("convs.0.bias");
        if (aVar5 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f286997e = aVar5;
        i5.a aVar6 = map.get("convs.1.bias");
        if (aVar6 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f286998f = aVar6;
        i5.a aVar7 = map.get("convs.2.bias");
        if (aVar7 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f286999g = aVar7;
        i5.a aVar8 = map.get("fc1.weight");
        if (aVar8 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f287000h = i.k(aVar8);
        i5.a aVar9 = map.get("fc2.weight");
        if (aVar9 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f287001i = i.k(aVar9);
        i5.a aVar10 = map.get("fc1.bias");
        if (aVar10 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f287002j = aVar10;
        i5.a aVar11 = map.get("fc2.bias");
        if (aVar11 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f287003k = aVar11;
        this.f287004l = new HashMap();
        for (String str : SetsKt.setOf((Object[]) new String[]{f.a.MTML_INTEGRITY_DETECT.l(), f.a.MTML_APP_EVENT_PREDICTION.l()})) {
            String strStringPlus = Intrinsics.stringPlus(str, ".weight");
            String strStringPlus2 = Intrinsics.stringPlus(str, ".bias");
            i5.a aVar12 = map.get(strStringPlus);
            i5.a aVar13 = map.get(strStringPlus2);
            if (aVar12 != null) {
                i iVar2 = i.f287036a;
                this.f287004l.put(strStringPlus, i.k(aVar12));
            }
            if (aVar13 != null) {
                this.f287004l.put(strStringPlus2, aVar13);
            }
        }
    }
}
