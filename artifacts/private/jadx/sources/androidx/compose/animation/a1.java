package androidx.compose.animation;

import androidx.compose.runtime.d7;
import androidx.compose.runtime.k7;
import androidx.compose.runtime.n3;
import androidx.compose.ui.graphics.k2;
import androidx.compose.ui.graphics.q3;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@k7
@i0
public interface a1 extends androidx.compose.ui.layout.w0 {

    public interface a {
        @Nullable
        k2 a(@NotNull d dVar, @NotNull n0.j jVar, @NotNull androidx.compose.ui.unit.w wVar, @NotNull androidx.compose.ui.unit.d dVar2);
    }

    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f12604a = a.f12605a;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            static final /* synthetic */ a f12605a = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            private static final b f12606b = C0053a.f12608b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @NotNull
            private static final b f12607c = C0054b.f12609b;

            /* JADX INFO: renamed from: androidx.compose.animation.a1$b$a$a, reason: collision with other inner class name */
            static final class C0053a implements b {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final C0053a f12608b = new C0053a();

                C0053a() {
                }

                @Override // androidx.compose.animation.a1.b
                public final long a(long j10, long j11) {
                    return j11;
                }
            }

            /* JADX INFO: renamed from: androidx.compose.animation.a1$b$a$b, reason: collision with other inner class name */
            static final class C0054b implements b {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final C0054b f12609b = new C0054b();

                C0054b() {
                }

                @Override // androidx.compose.animation.a1.b
                public final long a(long j10, long j11) {
                    return j10;
                }
            }

            private a() {
            }

            @NotNull
            public final b a() {
                return f12606b;
            }

            @NotNull
            public final b b() {
                return f12607c;
            }
        }

        long a(long j10, long j11);
    }

    public interface c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f12610a = a.f12611a;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            static final /* synthetic */ a f12611a = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            private static final c f12612b = r0.f13709b;

            private a() {
            }

            public static /* synthetic */ c b(a aVar, androidx.compose.ui.layout.l lVar, androidx.compose.ui.e eVar, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    lVar = androidx.compose.ui.layout.l.f39405a.g();
                }
                if ((i10 & 2) != 0) {
                    eVar = androidx.compose.ui.e.f37317a.i();
                }
                return aVar.a(lVar, eVar);
            }

            @NotNull
            public final c a(@NotNull androidx.compose.ui.layout.l lVar, @NotNull androidx.compose.ui.e eVar) {
                return d1.c(lVar, eVar);
            }

            @NotNull
            public final c c() {
                return f12612b;
            }
        }
    }

    @androidx.compose.runtime.internal.w0(parameters = 0)
    @SourceDebugExtension({"SMAP\nSharedTransitionScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScope$SharedContentState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1222:1\n85#2:1223\n117#2,2:1224\n*S KotlinDebug\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScope$SharedContentState\n*L\n650#1:1223\n650#1:1224,2\n*E\n"})
    public static final class d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f12613c = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Object f12614a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final n3 f12615b = d7.g(null, null, 2, null);

        public d(@NotNull Object obj) {
            this.f12614a = obj;
        }

        private final y0 d() {
            y0 y0VarB = b();
            if (y0VarB != null) {
                return y0VarB;
            }
            throw new IllegalArgumentException("Error: SharedContentState has not been added to a sharedElement/sharedBoundsmodifier yet. Therefore the internal state has not bee initialized.");
        }

        @Nullable
        public final k2 a() {
            return d().f();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Nullable
        public final y0 b() {
            return (y0) this.f12615b.getValue();
        }

        @NotNull
        public final Object c() {
            return this.f12614a;
        }

        @Nullable
        public final d e() {
            y0 y0VarA = d().a();
            if (y0VarA != null) {
                return y0VarA.t();
            }
            return null;
        }

        public final boolean f() {
            x0 x0VarO;
            y0 y0VarB = b();
            if (y0VarB == null || (x0VarO = y0VarB.o()) == null) {
                return false;
            }
            return x0VarO.d();
        }

        public final void g(@Nullable y0 y0Var) {
            this.f12615b.setValue(y0Var);
        }
    }

    static final class e extends kotlin.jvm.internal.l0 implements Function0<Boolean> {
        e() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(a1.this.I());
        }
    }

    static /* synthetic */ f0 J(a1 a1Var, androidx.compose.ui.layout.l lVar, androidx.compose.ui.e eVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scaleOutSharedContentToBounds");
        }
        if ((i10 & 1) != 0) {
            lVar = androidx.compose.ui.layout.l.f39405a.i();
        }
        if ((i10 & 2) != 0) {
            eVar = androidx.compose.ui.e.f37317a.i();
        }
        return a1Var.w(lVar, eVar);
    }

    static /* synthetic */ androidx.compose.ui.a0 M(a1 a1Var, androidx.compose.ui.a0 a0Var, d dVar, l lVar, s sVar, b bVar, boolean z10, float f10, a aVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sharedElement");
        }
        if ((i10 & 4) != 0) {
            sVar = d1.f13422d;
        }
        s sVar2 = sVar;
        if ((i10 & 8) != 0) {
            bVar = b.f12604a.b();
        }
        return a1Var.W(a0Var, dVar, lVar, sVar2, bVar, (i10 & 16) != 0 ? true : z10, (i10 & 32) != 0 ? 0.0f : f10, (i10 & 64) != 0 ? d1.f13420b : aVar);
    }

    static /* synthetic */ d0 P(a1 a1Var, androidx.compose.ui.layout.l lVar, androidx.compose.ui.e eVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scaleInSharedContentToBounds");
        }
        if ((i10 & 1) != 0) {
            lVar = androidx.compose.ui.layout.l.f39405a.i();
        }
        if ((i10 & 2) != 0) {
            eVar = androidx.compose.ui.e.f37317a.i();
        }
        return a1Var.c(lVar, eVar);
    }

    static /* synthetic */ androidx.compose.ui.a0 X(a1 a1Var, androidx.compose.ui.a0 a0Var, d dVar, l lVar, d0 d0Var, f0 f0Var, s sVar, c cVar, b bVar, boolean z10, float f10, a aVar, int i10, Object obj) {
        if (obj == null) {
            return a1Var.e0(a0Var, dVar, lVar, (i10 & 4) != 0 ? b0.o(null, 0.0f, 3, null) : d0Var, (i10 & 8) != 0 ? b0.q(null, 0.0f, 3, null) : f0Var, (i10 & 16) != 0 ? d1.f13422d : sVar, (i10 & 32) != 0 ? c.f12610a.a(androidx.compose.ui.layout.l.f39405a.g(), androidx.compose.ui.e.f37317a.i()) : cVar, (i10 & 64) != 0 ? b.f12604a.b() : bVar, (i10 & 128) != 0 ? true : z10, (i10 & 256) != 0 ? 0.0f : f10, (i10 & 512) != 0 ? d1.f13420b : aVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sharedBounds");
    }

    static /* synthetic */ androidx.compose.ui.a0 c0(a1 a1Var, androidx.compose.ui.a0 a0Var, d dVar, boolean z10, s sVar, b bVar, boolean z11, float f10, a aVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sharedElementWithCallerManagedVisibility");
        }
        if ((i10 & 4) != 0) {
            sVar = d1.f13422d;
        }
        s sVar2 = sVar;
        if ((i10 & 8) != 0) {
            bVar = b.f12604a.b();
        }
        return a1Var.x(a0Var, dVar, z10, sVar2, bVar, (i10 & 16) != 0 ? true : z11, (i10 & 32) != 0 ? 0.0f : f10, (i10 & 64) != 0 ? d1.f13420b : aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ androidx.compose.ui.a0 k0(a1 a1Var, androidx.compose.ui.a0 a0Var, Function0 function0, float f10, Function2 function2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: renderInSharedTransitionScopeOverlay");
        }
        if ((i10 & 1) != 0) {
            function0 = a1Var.new e();
        }
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            function2 = d1.f13421c;
        }
        return a1Var.V(a0Var, function0, f10, function2);
    }

    boolean I();

    @androidx.compose.runtime.o
    @NotNull
    d U(@NotNull Object obj, @Nullable androidx.compose.runtime.c0 c0Var, int i10);

    @NotNull
    androidx.compose.ui.a0 V(@NotNull androidx.compose.ui.a0 a0Var, @NotNull Function0<Boolean> function0, float f10, @NotNull Function2<? super androidx.compose.ui.unit.w, ? super androidx.compose.ui.unit.d, ? extends k2> function2);

    @NotNull
    androidx.compose.ui.a0 W(@NotNull androidx.compose.ui.a0 a0Var, @NotNull d dVar, @NotNull l lVar, @NotNull s sVar, @NotNull b bVar, boolean z10, float f10, @NotNull a aVar);

    @kotlin.l(message = "This EnterTransition has been deprecated. Please replace the usage with resizeMode = ScaleToBounds(...) in sharedBounds to achieve the scale-to-bounds effect.")
    @NotNull
    default d0 c(@NotNull androidx.compose.ui.layout.l lVar, @NotNull androidx.compose.ui.e eVar) {
        return b0.X(d0.f13416a.a(), new w(lVar, eVar));
    }

    @NotNull
    androidx.compose.ui.a0 e0(@NotNull androidx.compose.ui.a0 a0Var, @NotNull d dVar, @NotNull l lVar, @NotNull d0 d0Var, @NotNull f0 f0Var, @NotNull s sVar, @NotNull c cVar, @NotNull b bVar, boolean z10, float f10, @NotNull a aVar);

    @NotNull
    androidx.compose.ui.a0 g0(@NotNull androidx.compose.ui.a0 a0Var);

    @NotNull
    a l0(@NotNull q3 q3Var);

    @kotlin.l(message = "This ExitTransition has been deprecated.  Please replace the usage with resizeMode = ScaleToBounds(...) in sharedBounds to achieve the scale-to-bounds effect.")
    @NotNull
    default f0 w(@NotNull androidx.compose.ui.layout.l lVar, @NotNull androidx.compose.ui.e eVar) {
        return b0.Y(f0.f13493a.b(), new w(lVar, eVar));
    }

    @NotNull
    androidx.compose.ui.a0 x(@NotNull androidx.compose.ui.a0 a0Var, @NotNull d dVar, boolean z10, @NotNull s sVar, @NotNull b bVar, boolean z11, float f10, @NotNull a aVar);
}
