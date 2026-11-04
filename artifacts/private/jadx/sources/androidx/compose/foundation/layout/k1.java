package androidx.compose.foundation.layout;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
public abstract class k1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f16163b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c f16162a = new c(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final k1 f16164c = b.f16168f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final k1 f16165d = f.f16171f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final k1 f16166e = d.f16169f;

    private static final class a extends k1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        private final androidx.compose.foundation.layout.f f16167f;

        public a(@NotNull androidx.compose.foundation.layout.f fVar) {
            super(null);
            this.f16167f = fVar;
        }

        @Override // androidx.compose.foundation.layout.k1
        public int d(int i10, @NotNull androidx.compose.ui.unit.w wVar, @NotNull androidx.compose.ui.layout.i2 i2Var, int i11) {
            int iA = this.f16167f.a(i2Var);
            if (iA == Integer.MIN_VALUE) {
                return 0;
            }
            int i12 = i11 - iA;
            return wVar == androidx.compose.ui.unit.w.Rtl ? i10 - i12 : i12;
        }

        @Override // androidx.compose.foundation.layout.k1
        @NotNull
        public Integer e(@NotNull androidx.compose.ui.layout.i2 i2Var) {
            return Integer.valueOf(this.f16167f.a(i2Var));
        }

        @Override // androidx.compose.foundation.layout.k1
        public boolean f() {
            return true;
        }

        @NotNull
        public final androidx.compose.foundation.layout.f g() {
            return this.f16167f;
        }
    }

    private static final class b extends k1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public static final b f16168f = new b();

        private b() {
            super(null);
        }

        @Override // androidx.compose.foundation.layout.k1
        public int d(int i10, @NotNull androidx.compose.ui.unit.w wVar, @NotNull androidx.compose.ui.layout.i2 i2Var, int i11) {
            return i10 / 2;
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @androidx.compose.runtime.k7
        public static /* synthetic */ void d() {
        }

        @androidx.compose.runtime.k7
        public static /* synthetic */ void f() {
        }

        @androidx.compose.runtime.k7
        public static /* synthetic */ void h() {
        }

        @NotNull
        public final k1 a(@NotNull androidx.compose.ui.layout.a aVar) {
            return new a(new androidx.compose.foundation.layout.f.b(aVar));
        }

        @NotNull
        public final k1 b(@NotNull androidx.compose.foundation.layout.f fVar) {
            return new a(fVar);
        }

        @NotNull
        public final k1 c() {
            return k1.f16164c;
        }

        @NotNull
        public final k1 e() {
            return k1.f16166e;
        }

        @NotNull
        public final k1 g() {
            return k1.f16165d;
        }

        @NotNull
        public final k1 i(@NotNull androidx.compose.ui.e.b bVar) {
            return new e(bVar);
        }

        @NotNull
        public final k1 j(@NotNull androidx.compose.ui.e.c cVar) {
            return new g(cVar);
        }

        private c() {
        }
    }

    private static final class d extends k1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public static final d f16169f = new d();

        private d() {
            super(null);
        }

        @Override // androidx.compose.foundation.layout.k1
        public int d(int i10, @NotNull androidx.compose.ui.unit.w wVar, @NotNull androidx.compose.ui.layout.i2 i2Var, int i11) {
            if (wVar == androidx.compose.ui.unit.w.Ltr) {
                return i10;
            }
            return 0;
        }
    }

    private static final class e extends k1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        private final androidx.compose.ui.e.b f16170f;

        public e(@NotNull androidx.compose.ui.e.b bVar) {
            super(null);
            this.f16170f = bVar;
        }

        public static /* synthetic */ e i(e eVar, androidx.compose.ui.e.b bVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bVar = eVar.f16170f;
            }
            return eVar.h(bVar);
        }

        @Override // androidx.compose.foundation.layout.k1
        public int d(int i10, @NotNull androidx.compose.ui.unit.w wVar, @NotNull androidx.compose.ui.layout.i2 i2Var, int i11) {
            return this.f16170f.a(0, i10, wVar);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && Intrinsics.areEqual(this.f16170f, ((e) obj).f16170f);
        }

        @NotNull
        public final androidx.compose.ui.e.b g() {
            return this.f16170f;
        }

        @NotNull
        public final e h(@NotNull androidx.compose.ui.e.b bVar) {
            return new e(bVar);
        }

        public int hashCode() {
            return this.f16170f.hashCode();
        }

        @NotNull
        public final androidx.compose.ui.e.b j() {
            return this.f16170f;
        }

        @NotNull
        public String toString() {
            return "HorizontalCrossAxisAlignment(horizontal=" + this.f16170f + ')';
        }
    }

    private static final class f extends k1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public static final f f16171f = new f();

        private f() {
            super(null);
        }

        @Override // androidx.compose.foundation.layout.k1
        public int d(int i10, @NotNull androidx.compose.ui.unit.w wVar, @NotNull androidx.compose.ui.layout.i2 i2Var, int i11) {
            if (wVar == androidx.compose.ui.unit.w.Ltr) {
                return 0;
            }
            return i10;
        }
    }

    private static final class g extends k1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        private final androidx.compose.ui.e.c f16172f;

        public g(@NotNull androidx.compose.ui.e.c cVar) {
            super(null);
            this.f16172f = cVar;
        }

        public static /* synthetic */ g i(g gVar, androidx.compose.ui.e.c cVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                cVar = gVar.f16172f;
            }
            return gVar.h(cVar);
        }

        @Override // androidx.compose.foundation.layout.k1
        public int d(int i10, @NotNull androidx.compose.ui.unit.w wVar, @NotNull androidx.compose.ui.layout.i2 i2Var, int i11) {
            return this.f16172f.a(0, i10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && Intrinsics.areEqual(this.f16172f, ((g) obj).f16172f);
        }

        @NotNull
        public final androidx.compose.ui.e.c g() {
            return this.f16172f;
        }

        @NotNull
        public final g h(@NotNull androidx.compose.ui.e.c cVar) {
            return new g(cVar);
        }

        public int hashCode() {
            return this.f16172f.hashCode();
        }

        @NotNull
        public final androidx.compose.ui.e.c j() {
            return this.f16172f;
        }

        @NotNull
        public String toString() {
            return "VerticalCrossAxisAlignment(vertical=" + this.f16172f + ')';
        }
    }

    public /* synthetic */ k1(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract int d(int i10, @NotNull androidx.compose.ui.unit.w wVar, @NotNull androidx.compose.ui.layout.i2 i2Var, int i11);

    @Nullable
    public Integer e(@NotNull androidx.compose.ui.layout.i2 i2Var) {
        return null;
    }

    public boolean f() {
        return false;
    }

    private k1() {
    }
}
