package androidx.compose.ui.text.font;

import androidx.compose.runtime.o2;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nFontVariation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontVariation.kt\nandroidx/compose/ui/text/font/FontVariation\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,350:1\n118#2,4:351\n118#2,4:355\n118#2,4:359\n118#2,4:363\n118#2,4:367\n118#2,4:371\n118#2,4:375\n*S KotlinDebug\n*F\n+ 1 FontVariation.kt\nandroidx/compose/ui/text/font/FontVariation\n*L\n211#1:351,4\n233#1:355,4\n255#1:359,4\n270#1:363,4\n286#1:367,4\n311#1:371,4\n333#1:375,4\n*E\n"})
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final u0 f41723a = new u0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f41724b = 0;

    @o2
    public interface a {
        @NotNull
        String a();

        boolean b();

        float c(@Nullable androidx.compose.ui.unit.d dVar);
    }

    @o2
    private static final class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f41725a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float f41726b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f41727c;

        public b(@NotNull String str, float f10) {
            this.f41725a = str;
            this.f41726b = f10;
        }

        @Override // androidx.compose.ui.text.font.u0.a
        @NotNull
        public String a() {
            return this.f41725a;
        }

        @Override // androidx.compose.ui.text.font.u0.a
        public boolean b() {
            return this.f41727c;
        }

        @Override // androidx.compose.ui.text.font.u0.a
        public float c(@Nullable androidx.compose.ui.unit.d dVar) {
            return this.f41726b;
        }

        public final float d() {
            return this.f41726b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(a(), bVar.a()) && this.f41726b == bVar.f41726b;
        }

        public int hashCode() {
            return (a().hashCode() * 31) + Float.hashCode(this.f41726b);
        }

        @NotNull
        public String toString() {
            return "FontVariation.Setting(axisName='" + a() + "', value=" + this.f41726b + ')';
        }
    }

    @o2
    private static final class c implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f41728a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f41729b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f41730c;

        public c(@NotNull String str, int i10) {
            this.f41728a = str;
            this.f41729b = i10;
        }

        @Override // androidx.compose.ui.text.font.u0.a
        @NotNull
        public String a() {
            return this.f41728a;
        }

        @Override // androidx.compose.ui.text.font.u0.a
        public boolean b() {
            return this.f41730c;
        }

        @Override // androidx.compose.ui.text.font.u0.a
        public float c(@Nullable androidx.compose.ui.unit.d dVar) {
            return this.f41729b;
        }

        public final int d() {
            return this.f41729b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(a(), cVar.a()) && this.f41729b == cVar.f41729b;
        }

        public int hashCode() {
            return (a().hashCode() * 31) + this.f41729b;
        }

        @NotNull
        public String toString() {
            return "FontVariation.Setting(axisName='" + a() + "', value=" + this.f41729b + ')';
        }
    }

    @o2
    @SourceDebugExtension({"SMAP\nFontVariation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontVariation.kt\nandroidx/compose/ui/text/font/FontVariation$SettingTextUnit\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,350:1\n136#2,5:351\n*S KotlinDebug\n*F\n+ 1 FontVariation.kt\nandroidx/compose/ui/text/font/FontVariation$SettingTextUnit\n*L\n135#1:351,5\n*E\n"})
    private static final class d implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f41731a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f41732b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f41733c;

        public /* synthetic */ d(String str, long j10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, j10);
        }

        @Override // androidx.compose.ui.text.font.u0.a
        @NotNull
        public String a() {
            return this.f41731a;
        }

        @Override // androidx.compose.ui.text.font.u0.a
        public boolean b() {
            return this.f41733c;
        }

        @Override // androidx.compose.ui.text.font.u0.a
        public float c(@Nullable androidx.compose.ui.unit.d dVar) {
            if (dVar != null) {
                return androidx.compose.ui.unit.z.n(this.f41732b) * dVar.m0();
            }
            x0.a.f("density must not be null");
            throw new kotlin.a0();
        }

        public final long d() {
            return this.f41732b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.areEqual(a(), dVar.a()) && androidx.compose.ui.unit.z.j(this.f41732b, dVar.f41732b);
        }

        public int hashCode() {
            return (a().hashCode() * 31) + androidx.compose.ui.unit.z.o(this.f41732b);
        }

        @NotNull
        public String toString() {
            return "FontVariation.Setting(axisName='" + a() + "', value=" + ((Object) androidx.compose.ui.unit.z.u(this.f41732b)) + ')';
        }

        private d(String str, long j10) {
            this.f41731a = str;
            this.f41732b = j10;
            this.f41733c = true;
        }
    }

    @o2
    @SourceDebugExtension({"SMAP\nFontVariation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontVariation.kt\nandroidx/compose/ui/text/font/FontVariation$Settings\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,350:1\n10613#2:351\n10838#2,3:352\n10841#2,3:362\n381#3,7:355\n77#4:365\n97#4,5:366\n103#5:371\n35#5,5:372\n104#5:377\n*S KotlinDebug\n*F\n+ 1 FontVariation.kt\nandroidx/compose/ui/text/font/FontVariation$Settings\n*L\n54#1:351\n54#1:352,3\n54#1:362,3\n54#1:355,7\n55#1:365\n55#1:366,5\n63#1:371\n63#1:372,5\n63#1:377\n*E\n"})
    public static final class e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f41734c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final List<a> f41735a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f41736b;

        public e(@NotNull a... aVarArr) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            boolean z10 = false;
            for (a aVar : aVarArr) {
                String strA = aVar.a();
                Object arrayList = linkedHashMap.get(strA);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(strA, arrayList);
                }
                ((List) arrayList).add(aVar);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str = (String) entry.getKey();
                List list = (List) entry.getValue();
                if (list.size() != 1) {
                    throw new IllegalArgumentException(('\'' + str + "' must be unique. Actual [ [" + CollectionsKt.joinToString$default(list, null, null, null, 0, null, null, 63, null) + AbstractJsonLexerKt.END_LIST).toString());
                }
                CollectionsKt.addAll(arrayList2, list);
            }
            ArrayList arrayList3 = new ArrayList(arrayList2);
            this.f41735a = arrayList3;
            int size = arrayList3.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((a) arrayList3.get(i10)).b()) {
                    z10 = true;
                    break;
                }
            }
            this.f41736b = z10;
        }

        public final boolean a() {
            return this.f41736b;
        }

        @NotNull
        public final List<a> b() {
            return this.f41735a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && Intrinsics.areEqual(this.f41735a, ((e) obj).f41735a);
        }

        public int hashCode() {
            return this.f41735a.hashCode();
        }
    }

    private u0() {
    }

    @NotNull
    public final a a(@NotNull String str, float f10) {
        if (!(str.length() == 4)) {
            x0.a.e("Name must be exactly four characters. Actual: '" + str + '\'');
        }
        return new b(str, f10);
    }

    @NotNull
    public final e b(@NotNull v0 v0Var, int i10, @NotNull a... aVarArr) {
        kotlin.jvm.internal.p1 p1Var = new kotlin.jvm.internal.p1(3);
        p1Var.a(g(v0Var.O()));
        p1Var.a(d(i10));
        p1Var.b(aVarArr);
        return new e((a[]) p1Var.d(new a[p1Var.c()]));
    }

    @NotNull
    public final a c(int i10) {
        boolean z10 = false;
        if (-1000 <= i10 && i10 < 1001) {
            z10 = true;
        }
        if (!z10) {
            x0.a.e("'GRAD' must be in -1000..1000");
        }
        return new c("GRAD", i10);
    }

    @NotNull
    public final a d(float f10) {
        boolean z10 = false;
        if (0.0f <= f10 && f10 <= 1.0f) {
            z10 = true;
        }
        if (!z10) {
            x0.a.e("'ital' must be in 0.0f..1.0f. Actual: " + f10);
        }
        return new b("ital", f10);
    }

    @NotNull
    public final a e(long j10) {
        if (!androidx.compose.ui.unit.z.q(j10)) {
            x0.a.e("'opsz' must be provided in sp units");
        }
        return new d("opsz", j10, null);
    }

    @NotNull
    public final a f(float f10) {
        boolean z10 = false;
        if (-90.0f <= f10 && f10 <= 90.0f) {
            z10 = true;
        }
        if (!z10) {
            x0.a.e("'slnt' must be in -90f..90f. Actual: " + f10);
        }
        return new b("slnt", f10);
    }

    @NotNull
    public final a g(int i10) {
        boolean z10 = false;
        if (1 <= i10 && i10 < 1001) {
            z10 = true;
        }
        if (!z10) {
            x0.a.e("'wght' value must be in [1, 1000]. Actual: " + i10);
        }
        return new c("wght", i10);
    }

    @NotNull
    public final a h(float f10) {
        if (!(f10 > 0.0f)) {
            x0.a.e("'wdth' must be strictly > 0.0f. Actual: " + f10);
        }
        return new b("wdth", f10);
    }
}
