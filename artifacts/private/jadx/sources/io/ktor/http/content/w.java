package io.ktor.http.content;

import io.ktor.http.l1;
import io.ktor.http.v0;
import io.ktor.utils.io.e1;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.f2;
import kotlinx.coroutines.p2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nOutgoingContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutgoingContent.kt\nio/ktor/http/content/OutgoingContent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,221:1\n1#2:222\n*E\n"})
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private io.ktor.util.b f295764a;

    public static abstract class a extends w {
        public a() {
            super(null);
        }

        @NotNull
        public abstract byte[] h();
    }

    public static abstract class b extends w {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final w f295765b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull w delegate) {
            super(null);
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.f295765b = delegate;
        }

        @Override // io.ktor.http.content.w
        @Nullable
        public Long a() {
            return this.f295765b.a();
        }

        @Override // io.ktor.http.content.w
        @Nullable
        public io.ktor.http.m b() {
            return this.f295765b.b();
        }

        @Override // io.ktor.http.content.w
        @NotNull
        public v0 c() {
            return this.f295765b.c();
        }

        @Override // io.ktor.http.content.w
        @Nullable
        public <T> T d(@NotNull io.ktor.util.a<T> key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return (T) this.f295765b.d(key);
        }

        @Override // io.ktor.http.content.w
        @Nullable
        public l1 e() {
            return this.f295765b.e();
        }

        @Override // io.ktor.http.content.w
        public <T> void f(@NotNull io.ktor.util.a<T> key, @Nullable T t10) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.f295765b.f(key, t10);
        }

        @NotNull
        public abstract b h(@NotNull w wVar);

        @NotNull
        public final w i() {
            return this.f295765b;
        }
    }

    public static abstract class c extends w {
        public c() {
            super(null);
        }
    }

    public static abstract class d extends w {
        public d() {
            super(null);
        }

        @Override // io.ktor.http.content.w
        @NotNull
        public final l1 e() {
            return l1.f295939c.S();
        }

        @Nullable
        public abstract Object h(@NotNull io.ktor.utils.io.h hVar, @NotNull io.ktor.utils.io.p pVar, @NotNull CoroutineContext coroutineContext, @NotNull CoroutineContext coroutineContext2, @NotNull kotlin.coroutines.d<? super p2> dVar);
    }

    public static abstract class e extends w {

        @kotlin.coroutines.jvm.internal.f(c = "io.ktor.http.content.OutgoingContent$ReadChannelContent$readFrom$1", f = "OutgoingContent.kt", i = {0, 0}, l = {119, 121}, m = "invokeSuspend", n = {"$this$writer", "source"}, s = {"L$0", "L$1"})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<e1, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f295766a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f295767b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f295768c;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ kotlin.ranges.n f295770e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(kotlin.ranges.n nVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f295770e = nVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                a aVar = e.this.new a(this.f295770e, dVar);
                aVar.f295768c = obj;
                return aVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x0078, code lost:
            
                if (io.ktor.utils.io.k.g(r1, r10, r4, r9) == r0) goto L17;
             */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                /*
                    r9 = this;
                    r8 = 0
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    int r1 = r9.f295767b
                    r8 = 1
                    r2 = 2
                    r3 = 1
                    r8 = r8 & r3
                    if (r1 == 0) goto L2f
                    if (r1 == r3) goto L20
                    r8 = 0
                    if (r1 != r2) goto L17
                    r8 = 2
                    kotlin.ResultKt.m(r10)
                    goto L7b
                L17:
                    r8 = 5
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r10)
                    throw r9
                L20:
                    java.lang.Object r1 = r9.f295766a
                    r8 = 4
                    io.ktor.utils.io.h r1 = (io.ktor.utils.io.h) r1
                    java.lang.Object r3 = r9.f295768c
                    io.ktor.utils.io.e1 r3 = (io.ktor.utils.io.e1) r3
                    r8 = 7
                    kotlin.ResultKt.m(r10)
                    r8 = 3
                    goto L56
                L2f:
                    kotlin.ResultKt.m(r10)
                    r8 = 3
                    java.lang.Object r10 = r9.f295768c
                    io.ktor.utils.io.e1 r10 = (io.ktor.utils.io.e1) r10
                    io.ktor.http.content.w$e r1 = io.ktor.http.content.w.e.this
                    io.ktor.utils.io.h r1 = r1.h()
                    r8 = 5
                    kotlin.ranges.n r4 = r9.f295770e
                    long r4 = r4.l()
                    r8 = 0
                    r9.f295768c = r10
                    r9.f295766a = r1
                    r9.f295767b = r3
                    r8 = 0
                    java.lang.Object r3 = io.ktor.utils.io.k.i(r1, r4, r9)
                    r8 = 3
                    if (r3 != r0) goto L54
                    goto L7a
                L54:
                    r3 = r10
                    r3 = r10
                L56:
                    kotlin.ranges.n r10 = r9.f295770e
                    long r4 = r10.m()
                    r8 = 6
                    kotlin.ranges.n r10 = r9.f295770e
                    long r6 = r10.l()
                    long r4 = r4 - r6
                    r6 = 1
                    r8 = 2
                    long r4 = r4 + r6
                    io.ktor.utils.io.p r10 = r3.c()
                    r8 = 5
                    r3 = 0
                    r9.f295768c = r3
                    r9.f295766a = r3
                    r9.f295767b = r2
                    java.lang.Object r9 = io.ktor.utils.io.k.g(r1, r10, r4, r9)
                    if (r9 != r0) goto L7b
                L7a:
                    return r0
                L7b:
                    r8 = 5
                    kotlin.Unit r9 = kotlin.Unit.f312394a
                    r8 = 7
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.content.w.e.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(e1 e1Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(e1Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        public e() {
            super(null);
        }

        @NotNull
        public abstract io.ktor.utils.io.h h();

        @NotNull
        public io.ktor.utils.io.h i(@NotNull kotlin.ranges.n range) {
            Intrinsics.checkNotNullParameter(range, "range");
            return range.isEmpty() ? io.ktor.utils.io.h.f296881a.a() : io.ktor.utils.io.t.E(f2.f314023a, kotlinx.coroutines.l1.g(), true, new a(range, null)).b();
        }
    }

    public static abstract class f extends w {
        public f() {
            super(null);
        }

        @Nullable
        public abstract Object h(@NotNull io.ktor.utils.io.p pVar, @NotNull kotlin.coroutines.d<? super Unit> dVar);
    }

    public /* synthetic */ w(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Nullable
    public Long a() {
        return null;
    }

    @Nullable
    public io.ktor.http.m b() {
        return null;
    }

    @NotNull
    public v0 c() {
        return v0.f296123a.b();
    }

    @Nullable
    public <T> T d(@NotNull io.ktor.util.a<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        io.ktor.util.b bVar = this.f295764a;
        if (bVar != null) {
            return (T) bVar.e(key);
        }
        return null;
    }

    @Nullable
    public l1 e() {
        return null;
    }

    public <T> void f(@NotNull io.ktor.util.a<T> key, @Nullable T t10) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (t10 == null && this.f295764a == null) {
            return;
        }
        if (t10 == null) {
            io.ktor.util.b bVar = this.f295764a;
            if (bVar != null) {
                bVar.c(key);
                return;
            }
            return;
        }
        io.ktor.util.b bVarB = this.f295764a;
        if (bVarB == null) {
            bVarB = io.ktor.util.d.b(false, 1, null);
        }
        this.f295764a = bVarB;
        bVarB.a(key, t10);
    }

    @Nullable
    public v0 g() {
        return null;
    }

    private w() {
    }
}
