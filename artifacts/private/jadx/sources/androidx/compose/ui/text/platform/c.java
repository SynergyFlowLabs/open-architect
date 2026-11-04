package androidx.compose.ui.text.platform;

import android.content.Context;
import android.graphics.Typeface;
import androidx.collection.l2;
import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.text.font.k0;
import androidx.compose.ui.text.font.o0;
import androidx.compose.ui.text.font.p0;
import androidx.compose.ui.text.font.q0;
import androidx.compose.ui.text.font.t0;
import androidx.compose.ui.text.font.v0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.l(message = "This is not supported after downloadable fonts.")
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nAndroidFontListTypeface.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidFontListTypeface.android.kt\nandroidx/compose/ui/text/platform/AndroidFontListTypeface\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,174:1\n231#2,2:175\n35#2,5:177\n233#2:182\n151#2,2:183\n35#2,5:185\n153#2:190\n483#2,3:191\n35#2,3:194\n486#2,3:197\n39#2:200\n489#2:201\n35#2,5:206\n81#3,4:202\n99#3,5:211\n99#3,5:216\n*S KotlinDebug\n*F\n+ 1 AndroidFontListTypeface.android.kt\nandroidx/compose/ui/text/platform/AndroidFontListTypeface\n*L\n66#1:175,2\n66#1:177,5\n66#1:182\n69#1:183,2\n69#1:185,5\n69#1:190\n73#1:191,3\n73#1:194,3\n73#1:197,3\n73#1:200\n73#1:201\n78#1:206,5\n75#1:202,4\n100#1:211,5\n103#1:216,5\n*E\n"})
public final class c implements q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final a f42058d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f42059e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final p0 f42060f = new p0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final p0 f42061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<androidx.compose.ui.text.font.x, Typeface> f42062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.text.font.y f42063c;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final p0 a() {
            return c.f42060f;
        }

        private a() {
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00c1  */
    public c(@NotNull k0 k0Var, @NotNull Context context, @Nullable List<Pair<v0, q0>> list, @NotNull p0 p0Var) {
        ArrayList arrayList;
        this.f42061a = p0Var;
        List<androidx.compose.ui.text.font.x> listB = k0Var.B();
        ArrayList arrayList2 = new ArrayList(listB.size());
        int size = listB.size();
        for (int i10 = 0; i10 < size; i10++) {
            androidx.compose.ui.text.font.x xVar = listB.get(i10);
            if (o0.g(xVar.b(), o0.f41676b.b())) {
                arrayList2.add(xVar);
            }
        }
        if (list != null) {
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i11 = 0; i11 < size2; i11++) {
                Pair<v0, q0> pair = list.get(i11);
                arrayList3.add((androidx.compose.ui.text.font.x) CollectionsKt.firstOrNull((List) this.f42061a.e(arrayList2, pair.component1(), pair.component2().j())));
            }
            List listF = androidx.compose.ui.util.d.f(arrayList3);
            if (listF != null) {
                l2 l2Var = new l2(listF.size());
                arrayList = new ArrayList(listF.size());
                int size3 = listF.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    Object obj = listF.get(i12);
                    if (l2Var.C((androidx.compose.ui.text.font.x) obj)) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = null;
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            arrayList2 = arrayList;
        }
        if (arrayList2.isEmpty()) {
            x0.a.g("Could not match font");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size4 = arrayList2.size();
        for (int i13 = 0; i13 < size4; i13++) {
            androidx.compose.ui.text.font.x xVar2 = (androidx.compose.ui.text.font.x) arrayList2.get(i13);
            try {
                linkedHashMap.put(xVar2, r.f42104a.b(context, xVar2));
            } catch (Exception unused) {
                x0.a.g("Cannot create Typeface from " + xVar2);
            }
        }
        this.f42062b = linkedHashMap;
        this.f42063c = k0Var;
    }

    @Override // androidx.compose.ui.text.font.n1
    @NotNull
    public androidx.compose.ui.text.font.y a() {
        return this.f42063c;
    }

    @Override // androidx.compose.ui.text.platform.q
    @NotNull
    public Typeface b(@NotNull v0 v0Var, int i10, int i11) {
        androidx.compose.ui.text.font.x xVar = (androidx.compose.ui.text.font.x) CollectionsKt.firstOrNull((List) this.f42061a.e(new ArrayList(this.f42062b.keySet()), v0Var, i10));
        if (xVar == null) {
            x0.a.h("Could not load font");
            throw new kotlin.a0();
        }
        Typeface typeface = this.f42062b.get(xVar);
        if (typeface == null) {
            x0.a.h("Could not load typeface");
            throw new kotlin.a0();
        }
        Object objA = t0.a(i11, typeface, xVar, v0Var, i10);
        Intrinsics.checkNotNull(objA, "null cannot be cast to non-null type android.graphics.Typeface");
        return (Typeface) objA;
    }

    @NotNull
    public final p0 d() {
        return this.f42061a;
    }

    public /* synthetic */ c(k0 k0Var, Context context, List list, p0 p0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(k0Var, context, (i10 & 4) != 0 ? null : list, (i10 & 8) != 0 ? f42060f : p0Var);
    }
}
