package androidx.privacysandbox.ads.adservices.common;

import android.adservices.common.FrequencyCapFilters;
import android.adservices.common.KeyedFrequencyCap;
import androidx.annotation.b1;
import androidx.annotation.x0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@q.d
public final class x {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final b f73495e = new b(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f73496f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f73497g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f73498h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f73499i = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<b0> f73500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<b0> f73501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<b0> f73502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final List<b0> f73503d;

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY})
    @jj.e(jj.a.SOURCE)
    public @interface a {
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public x() {
        this(null, null, null, null, 15, null);
        int i10 = 5 ^ 0;
    }

    @x0.a({@x0(extension = 1000000, version = 8), @x0(extension = 31, version = 9)})
    private final List<KeyedFrequencyCap> a(List<b0> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<b0> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a());
        }
        return arrayList;
    }

    @b1({b1.a.LIBRARY})
    @x0.a({@x0(extension = 1000000, version = 8), @x0(extension = 31, version = 9)})
    @NotNull
    public final FrequencyCapFilters b() {
        FrequencyCapFilters frequencyCapFiltersBuild = w.a().setKeyedFrequencyCapsForWinEvents(a(this.f73500a)).setKeyedFrequencyCapsForImpressionEvents(a(this.f73501b)).setKeyedFrequencyCapsForViewEvents(a(this.f73502c)).setKeyedFrequencyCapsForClickEvents(a(this.f73503d)).build();
        Intrinsics.checkNotNullExpressionValue(frequencyCapFiltersBuild, "Builder()\n            .s…   )\n            .build()");
        return frequencyCapFiltersBuild;
    }

    @NotNull
    public final List<b0> c() {
        return this.f73503d;
    }

    @NotNull
    public final List<b0> d() {
        return this.f73501b;
    }

    @NotNull
    public final List<b0> e() {
        return this.f73502c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Intrinsics.areEqual(this.f73500a, xVar.f73500a) && Intrinsics.areEqual(this.f73501b, xVar.f73501b) && Intrinsics.areEqual(this.f73502c, xVar.f73502c) && Intrinsics.areEqual(this.f73503d, xVar.f73503d);
    }

    @NotNull
    public final List<b0> f() {
        return this.f73500a;
    }

    public int hashCode() {
        return (((((this.f73500a.hashCode() * 31) + this.f73501b.hashCode()) * 31) + this.f73502c.hashCode()) * 31) + this.f73503d.hashCode();
    }

    @NotNull
    public String toString() {
        return "FrequencyCapFilters: keyedFrequencyCapsForWinEvents=" + this.f73500a + ", keyedFrequencyCapsForImpressionEvents=" + this.f73501b + ", keyedFrequencyCapsForViewEvents=" + this.f73502c + ", keyedFrequencyCapsForClickEvents=" + this.f73503d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public x(@NotNull List<b0> keyedFrequencyCapsForWinEvents) {
        this(keyedFrequencyCapsForWinEvents, null, null, null, 14, null);
        Intrinsics.checkNotNullParameter(keyedFrequencyCapsForWinEvents, "keyedFrequencyCapsForWinEvents");
        int i10 = 6 << 0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public x(@NotNull List<b0> keyedFrequencyCapsForWinEvents, @NotNull List<b0> keyedFrequencyCapsForImpressionEvents) {
        this(keyedFrequencyCapsForWinEvents, keyedFrequencyCapsForImpressionEvents, null, null, 12, null);
        Intrinsics.checkNotNullParameter(keyedFrequencyCapsForWinEvents, "keyedFrequencyCapsForWinEvents");
        Intrinsics.checkNotNullParameter(keyedFrequencyCapsForImpressionEvents, "keyedFrequencyCapsForImpressionEvents");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public x(@NotNull List<b0> keyedFrequencyCapsForWinEvents, @NotNull List<b0> keyedFrequencyCapsForImpressionEvents, @NotNull List<b0> keyedFrequencyCapsForViewEvents) {
        this(keyedFrequencyCapsForWinEvents, keyedFrequencyCapsForImpressionEvents, keyedFrequencyCapsForViewEvents, null, 8, null);
        Intrinsics.checkNotNullParameter(keyedFrequencyCapsForWinEvents, "keyedFrequencyCapsForWinEvents");
        Intrinsics.checkNotNullParameter(keyedFrequencyCapsForImpressionEvents, "keyedFrequencyCapsForImpressionEvents");
        Intrinsics.checkNotNullParameter(keyedFrequencyCapsForViewEvents, "keyedFrequencyCapsForViewEvents");
    }

    @oj.j
    public x(@NotNull List<b0> keyedFrequencyCapsForWinEvents, @NotNull List<b0> keyedFrequencyCapsForImpressionEvents, @NotNull List<b0> keyedFrequencyCapsForViewEvents, @NotNull List<b0> keyedFrequencyCapsForClickEvents) {
        Intrinsics.checkNotNullParameter(keyedFrequencyCapsForWinEvents, "keyedFrequencyCapsForWinEvents");
        Intrinsics.checkNotNullParameter(keyedFrequencyCapsForImpressionEvents, "keyedFrequencyCapsForImpressionEvents");
        Intrinsics.checkNotNullParameter(keyedFrequencyCapsForViewEvents, "keyedFrequencyCapsForViewEvents");
        Intrinsics.checkNotNullParameter(keyedFrequencyCapsForClickEvents, "keyedFrequencyCapsForClickEvents");
        this.f73500a = keyedFrequencyCapsForWinEvents;
        this.f73501b = keyedFrequencyCapsForImpressionEvents;
        this.f73502c = keyedFrequencyCapsForViewEvents;
        this.f73503d = keyedFrequencyCapsForClickEvents;
    }

    public /* synthetic */ x(List list, List list2, List list3, List list4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? CollectionsKt.emptyList() : list, (i10 & 2) != 0 ? CollectionsKt.emptyList() : list2, (i10 & 4) != 0 ? CollectionsKt.emptyList() : list3, (i10 & 8) != 0 ? CollectionsKt.emptyList() : list4);
    }
}
