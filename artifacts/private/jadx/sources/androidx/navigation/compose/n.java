package androidx.navigation.compose;

import androidx.navigation.q3;
import androidx.navigation.w2;
import androidx.navigation.y1;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@q3.b(n.f70794f)
@SourceDebugExtension({"SMAP\nDialogNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogNavigator.kt\nandroidx/navigation/compose/DialogNavigator\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,89:1\n1863#2,2:90\n1872#2,3:92\n*S KotlinDebug\n*F\n+ 1 DialogNavigator.kt\nandroidx/navigation/compose/DialogNavigator\n*L\n55#1:90,2\n68#1:92,3\n*E\n"})
public final class n extends q3<b> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f70792d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f70793e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final String f70794f = "dialog";

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public n() {
        super(f70794f);
    }

    @Override // androidx.navigation.q3
    public void h(@NotNull List<androidx.navigation.n0> list, @Nullable w2 w2Var, @Nullable q3.a aVar) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            e().l((androidx.navigation.n0) it.next());
        }
    }

    @Override // androidx.navigation.q3
    public void o(@NotNull androidx.navigation.n0 n0Var, boolean z10) {
        e().j(n0Var, z10);
        int iIndexOf = CollectionsKt.indexOf(e().d().getValue(), n0Var);
        int i10 = 0;
        for (Object obj : e().d().getValue()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            androidx.navigation.n0 n0Var2 = (androidx.navigation.n0) obj;
            if (i10 > iIndexOf) {
                u(n0Var2);
            }
            i10 = i11;
        }
    }

    @Override // androidx.navigation.q3
    @NotNull
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public b c() {
        return new b(this, null, c.f70645a.a(), 2, null);
    }

    public final void r(@NotNull androidx.navigation.n0 n0Var) {
        o(n0Var, false);
    }

    @NotNull
    public final kotlinx.coroutines.flow.z0<List<androidx.navigation.n0>> s() {
        return e().c();
    }

    @NotNull
    public final kotlinx.coroutines.flow.z0<Set<androidx.navigation.n0>> t() {
        return e().d();
    }

    public final void u(@NotNull androidx.navigation.n0 n0Var) {
        e().f(n0Var);
    }

    @androidx.compose.runtime.internal.w0(parameters = 0)
    @y1.a(androidx.compose.runtime.o.class)
    public static final class b extends y1 implements androidx.navigation.u {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f70795j = 8;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        private final androidx.compose.ui.window.k f70796h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        private final pj.n<androidx.navigation.n0, androidx.compose.runtime.c0, Integer, Unit> f70797i;

        public /* synthetic */ b(n nVar, androidx.compose.ui.window.k kVar, pj.n nVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(nVar, (i10 & 2) != 0 ? new androidx.compose.ui.window.k(false, false, false, 7, (DefaultConstructorMarker) null) : kVar, nVar2);
        }

        @NotNull
        public final pj.n<androidx.navigation.n0, androidx.compose.runtime.c0, Integer, Unit> v0() {
            return this.f70797i;
        }

        @NotNull
        public final androidx.compose.ui.window.k z0() {
            return this.f70796h;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(@NotNull n nVar, @NotNull androidx.compose.ui.window.k kVar, @NotNull pj.n<? super androidx.navigation.n0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar2) {
            super(nVar);
            this.f70796h = kVar;
            this.f70797i = nVar2;
        }
    }
}
