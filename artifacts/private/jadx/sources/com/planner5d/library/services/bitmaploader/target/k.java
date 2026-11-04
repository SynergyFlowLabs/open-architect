package com.planner5d.library.services.bitmaploader.target;

import android.graphics.Bitmap;
import androidx.annotation.l0;
import androidx.compose.animation.core.z1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final c f224197a;

    public static final class a extends com.planner5d.library.services.bitmaploader.target.a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        private final b f224198h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        private final com.planner5d.library.services.bitmaploader.target.a f224199i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        private final Function1<Throwable, Unit> f224200j;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull b request, @NotNull com.planner5d.library.services.bitmaploader.target.a target, @NotNull Function1<? super Throwable, Unit> onFailed) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(target, "target");
            Intrinsics.checkNotNullParameter(onFailed, "onFailed");
            this.f224198h = request;
            this.f224199i = target;
            this.f224200j = onFailed;
            target.a(this);
        }

        @Override // com.planner5d.library.services.bitmaploader.target.a
        @l0
        protected void g(@Nullable Throwable th2) {
            this.f224200j.invoke(th2);
        }

        @Override // com.planner5d.library.services.bitmaploader.target.a
        @l0
        protected void h(@NotNull Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            if (this.f224198h.e()) {
                this.f224199i.j(bitmap, null);
            } else {
                dispose();
            }
        }
    }

    @SourceDebugExtension({"SMAP\nBitmapTargetSlot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BitmapTargetSlot.kt\ncom/planner5d/library/services/bitmaploader/target/BitmapTargetSlot$Request\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,116:1\n1#2:117\n1863#3,2:118\n*S KotlinDebug\n*F\n+ 1 BitmapTargetSlot.kt\ncom/planner5d/library/services/bitmaploader/target/BitmapTargetSlot$Request\n*L\n76#1:118,2\n*E\n"})
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final c f224201a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final com.planner5d.library.services.bitmaploader.target.a f224202b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final List<com.planner5d.library.services.bitmaploader.d.C1663d> f224203c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final List<com.planner5d.library.services.bitmaploader.d.f> f224204d;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.services.bitmaploader.target.BitmapTargetSlot$Request$load$2", f = "BitmapTargetSlot.kt", i = {}, l = {64, com.planner5d.library.engine.input.f.b.V}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f224205a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ com.planner5d.library.services.bitmaploader.d.f f224207c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ com.planner5d.library.services.bitmaploader.target.a f224208d;

            /* JADX INFO: renamed from: com.planner5d.library.services.bitmaploader.target.k$b$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.services.bitmaploader.target.BitmapTargetSlot$Request$load$2$1", f = "BitmapTargetSlot.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class C1667a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f224209a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ com.planner5d.library.services.bitmaploader.target.a f224210b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1667a(com.planner5d.library.services.bitmaploader.target.a aVar, kotlin.coroutines.d<? super C1667a> dVar) {
                    super(2, dVar);
                    this.f224210b = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    return new C1667a(this.f224210b, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    kotlin.coroutines.intrinsics.b.l();
                    if (this.f224209a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    this.f224210b.j(null, null);
                    return Unit.f312394a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                    return ((C1667a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            /* JADX INFO: renamed from: com.planner5d.library.services.bitmaploader.target.k$b$a$b, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.services.bitmaploader.target.BitmapTargetSlot$Request$load$2$info$1", f = "BitmapTargetSlot.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class C1668b extends o implements Function2<s0, kotlin.coroutines.d<? super com.planner5d.library.services.bitmaploader.d.C1663d>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f224211a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ com.planner5d.library.services.bitmaploader.d.f f224212b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ com.planner5d.library.services.bitmaploader.target.a f224213c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1668b(com.planner5d.library.services.bitmaploader.d.f fVar, com.planner5d.library.services.bitmaploader.target.a aVar, kotlin.coroutines.d<? super C1668b> dVar) {
                    super(2, dVar);
                    this.f224212b = fVar;
                    this.f224213c = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    return new C1668b(this.f224212b, this.f224213c, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    kotlin.coroutines.intrinsics.b.l();
                    if (this.f224211a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    return this.f224212b.a(this.f224213c);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super com.planner5d.library.services.bitmaploader.d.C1663d> dVar) {
                    return ((C1668b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(com.planner5d.library.services.bitmaploader.d.f fVar, com.planner5d.library.services.bitmaploader.target.a aVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f224207c = fVar;
                this.f224208d = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return b.this.new a(this.f224207c, this.f224208d, dVar);
            }

            /* JADX WARN: Code restructure failed: missing block: B:17:0x006f, code lost:
            
                if (kotlinx.coroutines.i.h(r9, r1, r8) == r0) goto L18;
             */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                /*
                    r8 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    int r1 = r8.f224205a
                    r7 = 6
                    r2 = 0
                    r7 = 2
                    r3 = 2
                    r4 = 1
                    r7 = r7 & r4
                    if (r1 == 0) goto L27
                    if (r1 == r4) goto L22
                    if (r1 != r3) goto L17
                    kotlin.ResultKt.m(r9)
                    r7 = 2
                    goto L73
                L17:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "e st m/o///ih/f e/olc /owetto isnnelbcr k/raeovireu"
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r7 = 5
                    r8.<init>(r9)
                    throw r8
                L22:
                    kotlin.ResultKt.m(r9)
                    r7 = 2
                    goto L44
                L27:
                    kotlin.ResultKt.m(r9)
                    com.planner5d.library.services.utility.s r9 = com.planner5d.library.services.utility.s.f229729a
                    kotlinx.coroutines.z1 r9 = r9.d()
                    com.planner5d.library.services.bitmaploader.target.k$b$a$b r1 = new com.planner5d.library.services.bitmaploader.target.k$b$a$b
                    com.planner5d.library.services.bitmaploader.d$f r5 = r8.f224207c
                    com.planner5d.library.services.bitmaploader.target.a r6 = r8.f224208d
                    r7 = 1
                    r1.<init>(r5, r6, r2)
                    r8.f224205a = r4
                    java.lang.Object r9 = kotlinx.coroutines.i.h(r9, r1, r8)
                    r7 = 4
                    if (r9 != r0) goto L44
                    goto L71
                L44:
                    r7 = 3
                    com.planner5d.library.services.bitmaploader.d$d r9 = (com.planner5d.library.services.bitmaploader.d.C1663d) r9
                    if (r9 == 0) goto L5a
                    com.planner5d.library.services.bitmaploader.target.k$b r8 = com.planner5d.library.services.bitmaploader.target.k.b.this
                    r7 = 6
                    java.util.List r8 = com.planner5d.library.services.bitmaploader.target.k.b.b(r8)
                    boolean r8 = r8.add(r9)
                    r7 = 7
                    kotlin.coroutines.jvm.internal.b.a(r8)
                    r7 = 2
                    goto L73
                L5a:
                    com.planner5d.library.services.utility.s r9 = com.planner5d.library.services.utility.s.f229729a
                    kotlinx.coroutines.a3 r9 = r9.a()
                    com.planner5d.library.services.bitmaploader.target.k$b$a$a r1 = new com.planner5d.library.services.bitmaploader.target.k$b$a$a
                    r7 = 5
                    com.planner5d.library.services.bitmaploader.target.a r4 = r8.f224208d
                    r1.<init>(r4, r2)
                    r7 = 2
                    r8.f224205a = r3
                    java.lang.Object r8 = kotlinx.coroutines.i.h(r9, r1, r8)
                    if (r8 != r0) goto L73
                L71:
                    r7 = 3
                    return r0
                L73:
                    kotlin.Unit r8 = kotlin.Unit.f312394a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.services.bitmaploader.target.k.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        public b(@NotNull c state, @NotNull com.planner5d.library.services.bitmaploader.target.a target) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(target, "target");
            this.f224201a = state;
            this.f224202b = target;
            this.f224203c = new ArrayList();
            this.f224204d = new ArrayList();
        }

        private final void f(com.planner5d.library.services.bitmaploader.d.f fVar, com.planner5d.library.services.bitmaploader.target.a aVar) {
            kotlinx.coroutines.k.f(this.f224201a.c(), null, null, new a(fVar, aVar, null), 3, null);
        }

        private final void g(final Throwable th2) {
            List<com.planner5d.library.services.bitmaploader.d.f> list = this.f224204d;
            if (list.isEmpty()) {
                list = null;
            }
            com.planner5d.library.services.bitmaploader.d.f fVarRemove = list != null ? list.remove(0) : null;
            if (fVarRemove != null && e() && !this.f224202b.f()) {
                f(fVarRemove, new a(this, this.f224202b, new Function1() { // from class: com.planner5d.library.services.bitmaploader.target.l
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return k.b.h(this.f224217a, th2, (Throwable) obj);
                    }
                }));
            } else {
                this.f224202b.j(null, null);
                d();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit h(b bVar, Throwable th2, Throwable th3) {
            bVar.g(th2);
            return Unit.f312394a;
        }

        @NotNull
        public final b c(@NotNull com.planner5d.library.services.bitmaploader.d.f starter) {
            Intrinsics.checkNotNullParameter(starter, "starter");
            this.f224204d.add(starter);
            return this;
        }

        public final void d() {
            Iterator<T> it = this.f224203c.iterator();
            while (it.hasNext()) {
                ((com.planner5d.library.services.bitmaploader.d.C1663d) it.next()).a();
            }
            this.f224203c.clear();
            z1.a(this.f224201a.a(), this, null);
            this.f224201a.b().d(this.f224202b);
        }

        public final boolean e() {
            return Intrinsics.areEqual(this.f224201a.a().get(), this);
        }

        @NotNull
        public final b i() {
            this.f224201a.a().set(this);
            this.f224201a.b().c(this.f224202b);
            g(null);
            return this;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final h f224214a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final s0 f224215b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final AtomicReference<b> f224216c;

        public c(@NotNull h bitmapTargetManager, @NotNull s0 scope) {
            Intrinsics.checkNotNullParameter(bitmapTargetManager, "bitmapTargetManager");
            Intrinsics.checkNotNullParameter(scope, "scope");
            this.f224214a = bitmapTargetManager;
            this.f224215b = scope;
            this.f224216c = new AtomicReference<>(null);
        }

        @NotNull
        public final AtomicReference<b> a() {
            return this.f224216c;
        }

        @NotNull
        public final h b() {
            return this.f224214a;
        }

        @NotNull
        public final s0 c() {
            return this.f224215b;
        }
    }

    public k(@NotNull h bitmapTargetManager, @NotNull s0 scope) {
        Intrinsics.checkNotNullParameter(bitmapTargetManager, "bitmapTargetManager");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f224197a = new c(bitmapTargetManager, scope);
    }

    public final void a() {
        b andSet = this.f224197a.a().getAndSet(null);
        if (andSet != null) {
            andSet.d();
        }
    }

    @NotNull
    public final b b(@NotNull com.planner5d.library.services.bitmaploader.target.a target) {
        Intrinsics.checkNotNullParameter(target, "target");
        return new b(this.f224197a, target);
    }
}
