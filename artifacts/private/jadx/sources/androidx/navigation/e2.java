package androidx.navigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nNavGraph.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavGraph.android.kt\nandroidx/navigation/NavGraph\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 SparseArray.kt\nandroidx/collection/SparseArrayKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,304:1\n233#2,3:305\n22#3:308\n62#3,4:311\n1228#4,2:309\n*S KotlinDebug\n*F\n+ 1 NavGraph.android.kt\nandroidx/navigation/NavGraph\n*L\n49#1:305,3\n263#1:308\n270#1:311,4\n265#1:309,2\n*E\n"})
public class e2 extends y1 implements Iterable<y1>, qj.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final a f70908i = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final androidx.navigation.internal.f0 f70909h;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final y1 c(y1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (!(it instanceof e2)) {
                return null;
            }
            e2 e2Var = (e2) it;
            return e2Var.F0(e2Var.Y0());
        }

        @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
        @NotNull
        public final Sequence<y1> b(@NotNull e2 e2Var) {
            Intrinsics.checkNotNullParameter(e2Var, "<this>");
            return kotlin.sequences.o.l(e2Var, new Function1() { // from class: androidx.navigation.d2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e2.a.c((y1) obj);
                }
            });
        }

        @oj.n
        @NotNull
        public final y1 d(@NotNull e2 e2Var) {
            Intrinsics.checkNotNullParameter(e2Var, "<this>");
            return (y1) kotlin.sequences.o.f1(b(e2Var));
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(@NotNull q3<? extends e2> navGraphNavigator) {
        super(navGraphNavigator);
        Intrinsics.checkNotNullParameter(navGraphNavigator, "navGraphNavigator");
        this.f70909h = new androidx.navigation.internal.f0(this);
    }

    public static /* synthetic */ y1 N0(e2 e2Var, int i10, y1 y1Var, boolean z10, y1 y1Var2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findNodeComprehensive");
        }
        if ((i11 & 8) != 0) {
            y1Var2 = null;
        }
        return e2Var.L0(i10, y1Var, z10, y1Var2);
    }

    @oj.n
    @NotNull
    public static final y1 O0(@NotNull e2 e2Var) {
        return f70908i.d(e2Var);
    }

    private static Object S0(e2 e2Var) {
        return kotlin.jvm.internal.j1.t(new kotlin.jvm.internal.c1(e2Var.f70909h, androidx.navigation.internal.f0.class, "nodes", "getNodes$navigation_common_release()Landroidx/collection/SparseArrayCompat;", 0));
    }

    private static Object W0(e2 e2Var) {
        return kotlin.jvm.internal.j1.t(new kotlin.jvm.internal.c1(e2Var.f70909h, androidx.navigation.internal.f0.class, "startDestDisplayName", "getStartDestDisplayName$navigation_common_release()Ljava/lang/String;", 0));
    }

    private static Object Z0(e2 e2Var) {
        return kotlin.jvm.internal.j1.j(new kotlin.jvm.internal.t0(e2Var.f70909h, androidx.navigation.internal.f0.class, "startDestinationId", "getStartDestinationId$navigation_common_release()I", 0));
    }

    private static Object c1(e2 e2Var) {
        return kotlin.jvm.internal.j1.j(new kotlin.jvm.internal.t0(e2Var.f70909h, androidx.navigation.internal.f0.class, "startDestinationRoute", "getStartDestinationRoute$navigation_common_release()Ljava/lang/String;", 0));
    }

    private final void t1(int i10) {
        this.f70909h.K(i10);
    }

    private final void u1(String str) {
        this.f70909h.L(str);
    }

    @Override // androidx.navigation.y1
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    @NotNull
    public String A() {
        return this.f70909h.o(super.A());
    }

    public final void A0(@NotNull Collection<? extends y1> nodes) {
        Intrinsics.checkNotNullParameter(nodes, "nodes");
        this.f70909h.e(nodes);
    }

    public final void D0(@NotNull y1... nodes) {
        Intrinsics.checkNotNullParameter(nodes, "nodes");
        this.f70909h.f((y1[]) Arrays.copyOf(nodes, nodes.length));
    }

    public final /* synthetic */ <T> y1 E0() {
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        return K0(kotlin.jvm.internal.j1.d(Object.class));
    }

    @Nullable
    public final y1 F0(@androidx.annotation.d0 int i10) {
        return this.f70909h.h(i10);
    }

    @Nullable
    public final <T> y1 G0(@Nullable T t10) {
        return this.f70909h.i(t10);
    }

    @Nullable
    public final y1 I0(@Nullable String str) {
        return this.f70909h.j(str);
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    @Nullable
    public final y1 J0(@NotNull String route, boolean z10) {
        Intrinsics.checkNotNullParameter(route, "route");
        return this.f70909h.k(route, z10);
    }

    @Nullable
    public final y1 K0(@NotNull kotlin.reflect.d<?> route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return this.f70909h.l(route);
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    @Nullable
    public final y1 L0(@androidx.annotation.d0 int i10, @Nullable y1 y1Var, boolean z10, @Nullable y1 y1Var2) {
        return this.f70909h.m(i10, y1Var, z10, y1Var2);
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    @NotNull
    public final androidx.collection.j3<y1> P0() {
        return this.f70909h.q();
    }

    @Override // androidx.navigation.y1
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    @Nullable
    public y1.c T(@NotNull w1 navDeepLinkRequest) {
        Intrinsics.checkNotNullParameter(navDeepLinkRequest, "navDeepLinkRequest");
        return this.f70909h.x(super.T(navDeepLinkRequest), navDeepLinkRequest);
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    @NotNull
    public final String V0() {
        return this.f70909h.r();
    }

    @androidx.annotation.d0
    @kotlin.l(message = "Use getStartDestinationId instead.", replaceWith = @kotlin.b1(expression = "startDestinationId", imports = {}))
    public final int X0() {
        return this.f70909h.u();
    }

    @androidx.annotation.d0
    public final int Y0() {
        return this.f70909h.u();
    }

    @Override // androidx.navigation.y1
    public void a0(@NotNull Context context, @NotNull AttributeSet attrs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        super.a0(context, attrs);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attrs, d3.a.b.f269648w);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainAttributes, "obtainAttributes(...)");
        t1(typedArrayObtainAttributes.getResourceId(d3.a.b.f269649x, 0));
        this.f70909h.C(y1.f71443f.d(new androidx.navigation.internal.h(context), this.f70909h.s()));
        Unit unit = Unit.f312394a;
        typedArrayObtainAttributes.recycle();
    }

    @Nullable
    public final String a1() {
        return this.f70909h.v();
    }

    public final void clear() {
        this.f70909h.g();
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    @Nullable
    public final y1.c d1(@NotNull w1 navDeepLinkRequest, boolean z10, boolean z11, @NotNull y1 lastVisited) {
        Intrinsics.checkNotNullParameter(navDeepLinkRequest, "navDeepLinkRequest");
        Intrinsics.checkNotNullParameter(lastVisited, "lastVisited");
        return this.f70909h.y(super.T(navDeepLinkRequest), navDeepLinkRequest, z10, z11, lastVisited);
    }

    @Override // androidx.navigation.y1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof e2) && super.equals(obj)) {
            e2 e2Var = (e2) obj;
            if (P0().size() == e2Var.P0().size() && Y0() == e2Var.Y0()) {
                for (y1 y1Var : kotlin.sequences.o.e(androidx.collection.l3.k(P0()))) {
                    if (!Intrinsics.areEqual(y1Var, e2Var.P0().g(y1Var.D()))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    @Nullable
    public final y1.c f1(@NotNull String route, boolean z10, boolean z11, @NotNull y1 lastVisited) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(lastVisited, "lastVisited");
        return this.f70909h.z(route, z10, z11, lastVisited);
    }

    @Override // androidx.navigation.y1
    public int hashCode() {
        int iY0 = Y0();
        androidx.collection.j3<y1> j3VarP0 = P0();
        int size = j3VarP0.size();
        for (int i10 = 0; i10 < size; i10++) {
            iY0 = (((iY0 * 31) + j3VarP0.n(i10)) * 31) + j3VarP0.z(i10).hashCode();
        }
        return iY0;
    }

    public final void i1(@NotNull y1 node) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.f70909h.A(node);
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<y1> iterator() {
        return this.f70909h.w();
    }

    public final /* synthetic */ <T> void k1() {
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        q1(kotlin.jvm.internal.j1.d(Object.class));
    }

    public final void m1(int i10) {
        this.f70909h.F(i10);
    }

    public final /* synthetic */ void n1(Object startDestRoute) {
        Intrinsics.checkNotNullParameter(startDestRoute, "startDestRoute");
        this.f70909h.G(startDestRoute);
    }

    public final void o1(@NotNull String startDestRoute) {
        Intrinsics.checkNotNullParameter(startDestRoute, "startDestRoute");
        this.f70909h.H(startDestRoute);
    }

    public final /* synthetic */ void q1(kotlin.reflect.d startDestRoute) {
        Intrinsics.checkNotNullParameter(startDestRoute, "startDestRoute");
        this.f70909h.I(startDestRoute);
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public final <T> void r1(@NotNull KSerializer<T> serializer, @NotNull Function1<? super y1, String> parseRoute) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(parseRoute, "parseRoute");
        this.f70909h.J(serializer, parseRoute);
    }

    @Override // androidx.navigation.y1
    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        y1 y1VarI0 = I0(a1());
        if (y1VarI0 == null) {
            y1VarI0 = F0(Y0());
        }
        sb2.append(" startDestination=");
        if (y1VarI0 != null) {
            sb2.append("{");
            sb2.append(y1VarI0.toString());
            sb2.append("}");
        } else if (a1() != null) {
            sb2.append(a1());
        } else if (this.f70909h.t() != null) {
            sb2.append(this.f70909h.t());
        } else {
            sb2.append("0x" + Integer.toHexString(this.f70909h.s()));
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final void v0(@NotNull e2 other) {
        Intrinsics.checkNotNullParameter(other, "other");
        this.f70909h.c(other);
    }

    public final void z0(@NotNull y1 node) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.f70909h.d(node);
    }
}
