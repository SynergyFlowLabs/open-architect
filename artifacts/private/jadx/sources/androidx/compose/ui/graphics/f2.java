package androidx.compose.ui.graphics;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f2 {

    public static final class a extends f2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final k2 f37763a;

        public a(@NotNull k2 k2Var) {
            super(null);
            this.f37763a = k2Var;
        }

        @Override // androidx.compose.ui.graphics.f2
        @NotNull
        public n0.j a() {
            return this.f37763a.getBounds();
        }

        @NotNull
        public final k2 b() {
            return this.f37763a;
        }
    }

    @androidx.compose.runtime.o2
    public static final class b extends f2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final n0.j f37764a;

        public b(@NotNull n0.j jVar) {
            super(null);
            this.f37764a = jVar;
        }

        @Override // androidx.compose.ui.graphics.f2
        @NotNull
        public n0.j a() {
            return this.f37764a;
        }

        @NotNull
        public final n0.j b() {
            return this.f37764a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.f37764a, ((b) obj).f37764a);
        }

        public int hashCode() {
            return this.f37764a.hashCode();
        }
    }

    @androidx.compose.runtime.o2
    @SourceDebugExtension({"SMAP\nOutline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Outline.kt\nandroidx/compose/ui/graphics/Outline$Rounded\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,291:1\n1#2:292\n*E\n"})
    public static final class c extends f2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final n0.l f37765a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final k2 f37766b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(@NotNull n0.l lVar) {
            super(0 == true ? 1 : 0);
            k2 k2Var = null;
            this.f37765a = lVar;
            if (!n0.m.q(lVar)) {
                k2 k2VarA = u.a();
                k2.S(k2VarA, lVar, null, 2, null);
                k2Var = k2VarA;
            }
            this.f37766b = k2Var;
        }

        @Override // androidx.compose.ui.graphics.f2
        @NotNull
        public n0.j a() {
            return n0.m.g(this.f37765a);
        }

        @NotNull
        public final n0.l b() {
            return this.f37765a;
        }

        @Nullable
        public final k2 c() {
            return this.f37766b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.areEqual(this.f37765a, ((c) obj).f37765a);
        }

        public int hashCode() {
            return this.f37765a.hashCode();
        }
    }

    public /* synthetic */ f2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public abstract n0.j a();

    private f2() {
    }
}
