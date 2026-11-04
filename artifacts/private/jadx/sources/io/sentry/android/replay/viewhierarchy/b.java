package io.sentry.android.replay.viewhierarchy;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.w0;
import io.sentry.android.replay.g;
import io.sentry.android.replay.util.q;
import io.sentry.android.replay.util.r;
import io.sentry.n8;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i1;
import kotlin.jvm.internal.l0;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@e.b(26)
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nViewHierarchyNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewHierarchyNode.kt\nio/sentry/android/replay/viewhierarchy/ViewHierarchyNode\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,391:1\n1855#2,2:392\n*S KotlinDebug\n*F\n+ 1 ViewHierarchyNode.kt\nio/sentry/android/replay/viewhierarchy/ViewHierarchyNode\n*L\n149#1:392,2\n*E\n"})
public abstract class b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final a f305074m = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f305075n = 8;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private static final String f305076o = "sentry-unmask";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    private static final String f305077p = "sentry-mask";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f305078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f305079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f305080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f305081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f305082e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f305083f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private final b f305084g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f305085h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f305086i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f305087j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private final Rect f305088k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private List<? extends b> f305089l;

    @SourceDebugExtension({"SMAP\nViewHierarchyNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewHierarchyNode.kt\nio/sentry/android/replay/viewhierarchy/ViewHierarchyNode$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,391:1\n1#2:392\n*E\n"})
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean b(Class<?> cls, Set<String> set) {
            while (cls != null) {
                if (set.contains(cls.getName())) {
                    return true;
                }
                cls = cls.getSuperclass();
            }
            return false;
        }

        private final boolean c(View view, n8 n8Var) {
            String strF = n8Var.getSessionReplay().f();
            if (strF == null) {
                return false;
            }
            return Intrinsics.areEqual(view.getClass().getName(), strF);
        }

        private final boolean d(ViewParent viewParent, n8 n8Var) {
            String strN = n8Var.getSessionReplay().n();
            if (strN == null) {
                return false;
            }
            return Intrinsics.areEqual(viewParent.getClass().getName(), strN);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x002e  */
        /* JADX WARN: Code duplicated, block: B:16:0x003e  */
        /* JADX WARN: Code duplicated, block: B:18:0x0047  */
        /* JADX WARN: Code duplicated, block: B:19:0x004b  */
        /* JADX WARN: Code duplicated, block: B:21:0x004e  */
        /* JADX WARN: Code duplicated, block: B:26:0x0066  */
        /* JADX WARN: Code duplicated, block: B:29:0x0078  */
        /* JADX WARN: Code duplicated, block: B:31:0x007e  */
        /* JADX WARN: Code duplicated, block: B:35:0x0094 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:38:0x00b0  */
        /* JADX WARN: Code duplicated, block: B:40:0x00b2  */
        private final boolean e(View view, n8 n8Var) {
            Object tag;
            String str;
            Class<?> cls;
            Set<String> setM;
            ViewParent parent;
            String lowerCase;
            Object tag2 = view.getTag();
            String str2 = tag2 instanceof String ? (String) tag2 : null;
            if (str2 != null) {
                String lowerCase2 = str2.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                if (lowerCase2 == null || !StringsKt.V2(lowerCase2, b.f305076o, false, 2, null)) {
                    if (!Intrinsics.areEqual(view.getTag(g.a.f304902a), "unmask")) {
                        tag = view.getTag();
                        if (tag instanceof String) {
                            str = (String) tag;
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            lowerCase = str.toLowerCase(Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                            if (lowerCase != null || !StringsKt.V2(lowerCase, b.f305077p, false, 2, null)) {
                                if (!Intrinsics.areEqual(view.getTag(g.a.f304902a), "mask")) {
                                    if (!c(view, n8Var) && view.getParent() != null) {
                                        parent = view.getParent();
                                        Intrinsics.checkNotNullExpressionValue(parent, "getParent(...)");
                                        if (d(parent, n8Var)) {
                                            return false;
                                        }
                                    }
                                    cls = view.getClass();
                                    setM = n8Var.getSessionReplay().m();
                                    Intrinsics.checkNotNullExpressionValue(setM, "getUnmaskViewClasses(...)");
                                    if (b(cls, setM)) {
                                        return false;
                                    }
                                    Class<?> cls2 = view.getClass();
                                    Set<String> setE = n8Var.getSessionReplay().e();
                                    Intrinsics.checkNotNullExpressionValue(setE, "getMaskViewClasses(...)");
                                    return b(cls2, setE);
                                }
                            }
                        } else if (!Intrinsics.areEqual(view.getTag(g.a.f304902a), "mask")) {
                            if (!c(view, n8Var)) {
                                parent = view.getParent();
                                Intrinsics.checkNotNullExpressionValue(parent, "getParent(...)");
                                if (d(parent, n8Var)) {
                                    return false;
                                }
                            }
                            cls = view.getClass();
                            setM = n8Var.getSessionReplay().m();
                            Intrinsics.checkNotNullExpressionValue(setM, "getUnmaskViewClasses(...)");
                            if (b(cls, setM)) {
                                return false;
                            }
                            Class<?> cls3 = view.getClass();
                            Set<String> setE2 = n8Var.getSessionReplay().e();
                            Intrinsics.checkNotNullExpressionValue(setE2, "getMaskViewClasses(...)");
                            return b(cls3, setE2);
                        }
                        return true;
                    }
                }
            } else if (!Intrinsics.areEqual(view.getTag(g.a.f304902a), "unmask")) {
                tag = view.getTag();
                if (tag instanceof String) {
                    str = (String) tag;
                } else {
                    str = null;
                }
                if (str != null) {
                    lowerCase = str.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    if (lowerCase != null) {
                        if (!Intrinsics.areEqual(view.getTag(g.a.f304902a), "mask")) {
                            if (!c(view, n8Var)) {
                                parent = view.getParent();
                                Intrinsics.checkNotNullExpressionValue(parent, "getParent(...)");
                                if (d(parent, n8Var)) {
                                    return false;
                                }
                            }
                            cls = view.getClass();
                            setM = n8Var.getSessionReplay().m();
                            Intrinsics.checkNotNullExpressionValue(setM, "getUnmaskViewClasses(...)");
                            if (b(cls, setM)) {
                                return false;
                            }
                            Class<?> cls4 = view.getClass();
                            Set<String> setE3 = n8Var.getSessionReplay().e();
                            Intrinsics.checkNotNullExpressionValue(setE3, "getMaskViewClasses(...)");
                            return b(cls4, setE3);
                        }
                    } else if (!Intrinsics.areEqual(view.getTag(g.a.f304902a), "mask")) {
                        if (!c(view, n8Var)) {
                            parent = view.getParent();
                            Intrinsics.checkNotNullExpressionValue(parent, "getParent(...)");
                            if (d(parent, n8Var)) {
                                return false;
                            }
                        }
                        cls = view.getClass();
                        setM = n8Var.getSessionReplay().m();
                        Intrinsics.checkNotNullExpressionValue(setM, "getUnmaskViewClasses(...)");
                        if (b(cls, setM)) {
                            return false;
                        }
                        Class<?> cls5 = view.getClass();
                        Set<String> setE4 = n8Var.getSessionReplay().e();
                        Intrinsics.checkNotNullExpressionValue(setE4, "getMaskViewClasses(...)");
                        return b(cls5, setE4);
                    }
                } else if (!Intrinsics.areEqual(view.getTag(g.a.f304902a), "mask")) {
                    if (!c(view, n8Var)) {
                        parent = view.getParent();
                        Intrinsics.checkNotNullExpressionValue(parent, "getParent(...)");
                        if (d(parent, n8Var)) {
                            return false;
                        }
                    }
                    cls = view.getClass();
                    setM = n8Var.getSessionReplay().m();
                    Intrinsics.checkNotNullExpressionValue(setM, "getUnmaskViewClasses(...)");
                    if (b(cls, setM)) {
                        return false;
                    }
                    Class<?> cls6 = view.getClass();
                    Set<String> setE5 = n8Var.getSessionReplay().e();
                    Intrinsics.checkNotNullExpressionValue(setE5, "getMaskViewClasses(...)");
                    return b(cls6, setE5);
                }
                return true;
            }
            return false;
        }

        @NotNull
        public final b a(@NotNull View view, @Nullable b bVar, int i10, @NotNull n8 options) {
            Drawable drawable;
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(options, "options");
            Pair<Boolean, Rect> pairG = r.g(view);
            boolean zBooleanValue = pairG.component1().booleanValue();
            Rect rectComponent2 = pairG.component2();
            boolean z10 = zBooleanValue && e(view, options);
            if (!(view instanceof TextView)) {
                if (!(view instanceof ImageView)) {
                    return new C2220b(view.getX(), view.getY(), view.getWidth(), view.getHeight(), (bVar != null ? bVar.e() : 0.0f) + view.getElevation(), i10, bVar, z10, false, zBooleanValue, rectComponent2);
                }
                if (bVar != null) {
                    bVar.q(true);
                }
                ImageView imageView = (ImageView) view;
                return new c(imageView.getX(), imageView.getY(), imageView.getWidth(), imageView.getHeight(), (bVar != null ? bVar.e() : 0.0f) + imageView.getElevation(), i10, bVar, z10 && (drawable = imageView.getDrawable()) != null && r.f(drawable), true, zBooleanValue, rectComponent2);
            }
            if (bVar != null) {
                bVar.q(true);
            }
            TextView textView = (TextView) view;
            Layout layout = textView.getLayout();
            io.sentry.android.replay.util.a aVar = layout != null ? new io.sentry.android.replay.util.a(layout) : null;
            int iJ = r.j(textView.getCurrentTextColor());
            int totalPaddingLeft = textView.getTotalPaddingLeft();
            int iC = r.c(textView);
            float x10 = textView.getX();
            float y10 = textView.getY();
            int width = textView.getWidth();
            float fE = 0.0f;
            int height = textView.getHeight();
            if (bVar != null) {
                fE = bVar.e();
            }
            return new e(aVar, Integer.valueOf(iJ), totalPaddingLeft, iC, x10, y10, width, height, fE + textView.getElevation(), i10, bVar, z10, true, zBooleanValue, rectComponent2);
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: io.sentry.android.replay.viewhierarchy.b$b, reason: collision with other inner class name */
    @w0(parameters = 0)
    public static final class C2220b extends b {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final int f305090q = 8;

        public /* synthetic */ C2220b(float f10, float f11, int i10, int i11, float f12, int i12, b bVar, boolean z10, boolean z11, boolean z12, Rect rect, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(f10, f11, i10, i11, f12, i12, (i13 & 64) != 0 ? null : bVar, (i13 & 128) != 0 ? false : z10, (i13 & 256) != 0 ? false : z11, (i13 & 512) != 0 ? false : z12, (i13 & 1024) != 0 ? null : rect);
        }

        public C2220b(float f10, float f11, int i10, int i11, float f12, int i12, @Nullable b bVar, boolean z10, boolean z11, boolean z12, @Nullable Rect rect) {
            super(f10, f11, i10, i11, f12, i12, bVar, z10, z11, z12, rect, null);
        }
    }

    @w0(parameters = 0)
    public static final class c extends b {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final int f305091q = 8;

        public /* synthetic */ c(float f10, float f11, int i10, int i11, float f12, int i12, b bVar, boolean z10, boolean z11, boolean z12, Rect rect, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(f10, f11, i10, i11, f12, i12, (i13 & 64) != 0 ? null : bVar, (i13 & 128) != 0 ? false : z10, (i13 & 256) != 0 ? false : z11, (i13 & 512) != 0 ? false : z12, (i13 & 1024) != 0 ? null : rect);
        }

        public c(float f10, float f11, int i10, int i11, float f12, int i12, @Nullable b bVar, boolean z10, boolean z11, boolean z12, @Nullable Rect rect) {
            super(f10, f11, i10, i11, f12, i12, bVar, z10, z11, z12, rect, null);
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final b f305092a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private b f305093b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private b f305094c;

        public d(@Nullable b bVar, @Nullable b bVar2, @Nullable b bVar3) {
            this.f305092a = bVar;
            this.f305093b = bVar2;
            this.f305094c = bVar3;
        }

        public static /* synthetic */ d e(d dVar, b bVar, b bVar2, b bVar3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bVar = dVar.f305092a;
            }
            if ((i10 & 2) != 0) {
                bVar2 = dVar.f305093b;
            }
            if ((i10 & 4) != 0) {
                bVar3 = dVar.f305094c;
            }
            return dVar.d(bVar, bVar2, bVar3);
        }

        @Nullable
        public final b a() {
            return this.f305092a;
        }

        @Nullable
        public final b b() {
            return this.f305093b;
        }

        @Nullable
        public final b c() {
            return this.f305094c;
        }

        @NotNull
        public final d d(@Nullable b bVar, @Nullable b bVar2, @Nullable b bVar3) {
            return new d(bVar, bVar2, bVar3);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.areEqual(this.f305092a, dVar.f305092a) && Intrinsics.areEqual(this.f305093b, dVar.f305093b) && Intrinsics.areEqual(this.f305094c, dVar.f305094c);
        }

        @Nullable
        public final b f() {
            return this.f305092a;
        }

        @Nullable
        public final b g() {
            return this.f305093b;
        }

        @Nullable
        public final b h() {
            return this.f305094c;
        }

        public int hashCode() {
            b bVar = this.f305092a;
            int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
            b bVar2 = this.f305093b;
            int iHashCode2 = (iHashCode + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
            b bVar3 = this.f305094c;
            return iHashCode2 + (bVar3 != null ? bVar3.hashCode() : 0);
        }

        public final void i(@Nullable b bVar) {
            this.f305093b = bVar;
        }

        public final void j(@Nullable b bVar) {
            this.f305094c = bVar;
        }

        @NotNull
        public String toString() {
            return "LCAResult(lca=" + this.f305092a + ", nodeSubtree=" + this.f305093b + ", otherNodeSubtree=" + this.f305094c + ')';
        }
    }

    @w0(parameters = 0)
    public static final class e extends b {

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final int f305095u = 8;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        @Nullable
        private final q f305096q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        @Nullable
        private final Integer f305097r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final int f305098s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final int f305099t;

        public /* synthetic */ e(q qVar, Integer num, int i10, int i11, float f10, float f11, int i12, int i13, float f12, int i14, b bVar, boolean z10, boolean z11, boolean z12, Rect rect, int i15, DefaultConstructorMarker defaultConstructorMarker) {
            this((i15 & 1) != 0 ? null : qVar, (i15 & 2) != 0 ? null : num, (i15 & 4) != 0 ? 0 : i10, (i15 & 8) != 0 ? 0 : i11, f10, f11, i12, i13, f12, i14, (i15 & 1024) != 0 ? null : bVar, (i15 & 2048) != 0 ? false : z10, (i15 & 4096) != 0 ? false : z11, (i15 & 8192) != 0 ? false : z12, (i15 & 16384) != 0 ? null : rect);
        }

        @Nullable
        public final Integer t() {
            return this.f305097r;
        }

        @Nullable
        public final q u() {
            return this.f305096q;
        }

        public final int v() {
            return this.f305098s;
        }

        public final int w() {
            return this.f305099t;
        }

        public e(@Nullable q qVar, @Nullable Integer num, int i10, int i11, float f10, float f11, int i12, int i13, float f12, int i14, @Nullable b bVar, boolean z10, boolean z11, boolean z12, @Nullable Rect rect) {
            super(f10, f11, i12, i13, f12, i14, bVar, z10, z11, z12, rect, null);
            this.f305096q = qVar;
            this.f305097r = num;
            this.f305098s = i10;
            this.f305099t = i11;
        }
    }

    static final class f extends l0 implements Function1<b, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i1.a f305100a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f305101b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f305102c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(i1.a aVar, b bVar, b bVar2) {
            super(1);
            this.f305100a = aVar;
            this.f305101b = bVar;
            this.f305102c = bVar2;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(b otherNode) {
            Intrinsics.checkNotNullParameter(otherNode, "otherNode");
            if (otherNode.i() == null || this.f305100a.f312744a) {
                return Boolean.FALSE;
            }
            if (!otherNode.o() || !otherNode.m() || !otherNode.i().contains(this.f305101b.i())) {
                return Boolean.FALSE;
            }
            if (otherNode.e() > this.f305101b.e()) {
                this.f305100a.f312744a = true;
                return Boolean.FALSE;
            }
            if (otherNode.e() == this.f305101b.e()) {
                d dVarB = this.f305102c.b(this.f305101b, otherNode);
                b bVarA = dVarB.a();
                b bVarB = dVarB.b();
                b bVarC = dVarB.c();
                if (!Intrinsics.areEqual(bVarA, otherNode) && bVarC != null && bVarB != null) {
                    this.f305100a.f312744a = bVarC.d() > bVarB.d();
                    return Boolean.valueOf(!this.f305100a.f312744a);
                }
            }
            return Boolean.TRUE;
        }
    }

    public /* synthetic */ b(float f10, float f11, int i10, int i11, float f12, int i12, b bVar, boolean z10, boolean z11, boolean z12, Rect rect, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, i10, i11, f12, i12, bVar, z10, z11, z12, rect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d b(b bVar, b bVar2) {
        b bVar3 = Intrinsics.areEqual(this, bVar) ? this : null;
        b bVar4 = Intrinsics.areEqual(this, bVar2) ? this : null;
        List<? extends b> list = this.f305089l;
        if (list != null) {
            Intrinsics.checkNotNull(list);
            for (b bVar5 : list) {
                d dVarB = bVar5.b(bVar, bVar2);
                if (dVarB.f() != null) {
                    return dVarB;
                }
                if (dVarB.g() != null) {
                    bVar3 = bVar5;
                }
                if (dVarB.h() != null) {
                    bVar4 = bVar5;
                }
            }
        }
        if (bVar3 == null || bVar4 == null) {
            this = null;
        }
        return new d(this, bVar3, bVar4);
    }

    @Nullable
    public final List<b> c() {
        return this.f305089l;
    }

    public final int d() {
        return this.f305083f;
    }

    public final float e() {
        return this.f305082e;
    }

    public final int f() {
        return this.f305081d;
    }

    @Nullable
    public final b g() {
        return this.f305084g;
    }

    public final boolean h() {
        return this.f305085h;
    }

    @Nullable
    public final Rect i() {
        return this.f305088k;
    }

    public final int j() {
        return this.f305080c;
    }

    public final float k() {
        return this.f305078a;
    }

    public final float l() {
        return this.f305079b;
    }

    public final boolean m() {
        return this.f305086i;
    }

    public final boolean n(@NotNull b node) {
        Intrinsics.checkNotNullParameter(node, "node");
        if (this.f305084g != null) {
            throw new IllegalArgumentException("This method should be called on the root node of the view hierarchy.");
        }
        if (node.f305088k == null) {
            return false;
        }
        i1.a aVar = new i1.a();
        s(new f(aVar, node, this));
        return aVar.f312744a;
    }

    public final boolean o() {
        return this.f305087j;
    }

    public final void p(@Nullable List<? extends b> list) {
        this.f305089l = list;
    }

    public final void q(boolean z10) {
        for (b bVar = this.f305084g; bVar != null; bVar = bVar.f305084g) {
            bVar.f305086i = z10;
        }
    }

    public final void r(boolean z10) {
        this.f305086i = z10;
    }

    public final void s(@NotNull Function1<? super b, Boolean> callback) {
        List<? extends b> list;
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (callback.invoke(this).booleanValue() && (list = this.f305089l) != null) {
            Intrinsics.checkNotNull(list);
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((b) it.next()).s(callback);
            }
        }
    }

    private b(float f10, float f11, int i10, int i11, float f12, int i12, b bVar, boolean z10, boolean z11, boolean z12, Rect rect) {
        this.f305078a = f10;
        this.f305079b = f11;
        this.f305080c = i10;
        this.f305081d = i11;
        this.f305082e = f12;
        this.f305083f = i12;
        this.f305084g = bVar;
        this.f305085h = z10;
        this.f305086i = z11;
        this.f305087j = z12;
        this.f305088k = rect;
    }

    public /* synthetic */ b(float f10, float f11, int i10, int i11, float f12, int i12, b bVar, boolean z10, boolean z11, boolean z12, Rect rect, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, i10, i11, f12, i12, (i13 & 64) != 0 ? null : bVar, (i13 & 128) != 0 ? false : z10, (i13 & 256) != 0 ? false : z11, (i13 & 512) != 0 ? false : z12, (i13 & 1024) != 0 ? null : rect, null);
    }
}
