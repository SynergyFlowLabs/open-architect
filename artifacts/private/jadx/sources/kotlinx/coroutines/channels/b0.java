package kotlinx.coroutines.channels;

import com.facebook.internal.w0;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.a1;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.f2;
import kotlinx.coroutines.f3;
import kotlinx.coroutines.l1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nDeprecated.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt\n+ 2 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,509:1\n24#1,5:510\n94#2,8:515\n94#2,8:523\n94#2,8:531\n94#2,8:539\n160#2:547\n94#2,3:548\n161#2:551\n101#2:552\n162#2:553\n97#2,3:554\n94#2,8:557\n160#2:565\n94#2,3:566\n161#2,2:569\n101#2:571\n97#2,3:572\n94#2,8:575\n94#2,8:583\n94#2,8:591\n160#2:599\n94#2,3:600\n161#2,2:603\n101#2:605\n97#2,3:606\n160#2:609\n94#2,3:610\n161#2,2:613\n101#2:615\n97#2,3:616\n160#2:619\n94#2,3:620\n161#2,2:623\n101#2:625\n97#2,3:626\n160#2:629\n94#2,3:630\n161#2,2:633\n101#2:635\n97#2,3:636\n160#2:639\n94#2,3:640\n161#2,2:643\n101#2:645\n97#2,3:646\n94#2,8:649\n160#2:657\n94#2,3:658\n161#2,2:661\n101#2:663\n97#2,3:664\n94#2,8:667\n94#2,8:675\n94#2,8:683\n1#3:691\n*S KotlinDebug\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt\n*L\n40#1:510,5\n64#1:515,8\n79#1:523,8\n93#1:531,8\n103#1:539,8\n114#1:547\n114#1:548,3\n114#1:551\n114#1:552\n114#1:553\n114#1:554,3\n125#1:557,8\n140#1:565\n140#1:566,3\n140#1:569,2\n140#1:571\n140#1:572,3\n151#1:575,8\n164#1:583,8\n177#1:591,8\n262#1:599\n262#1:600,3\n262#1:603,2\n262#1:605\n262#1:606,3\n271#1:609\n271#1:610,3\n271#1:613,2\n271#1:615\n271#1:616,3\n307#1:619\n307#1:620,3\n307#1:623,2\n307#1:625\n307#1:626,3\n315#1:629\n315#1:630,3\n315#1:633,2\n315#1:635\n315#1:636,3\n328#1:639\n328#1:640,3\n328#1:643,2\n328#1:645\n328#1:646,3\n433#1:649,8\n441#1:657\n441#1:658,3\n441#1:661,2\n441#1:663\n441#1:664,3\n448#1:667,8\n462#1:675,8\n476#1:683,8\n*E\n"})
final /* synthetic */ class b0 {

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0}, l = {434}, m = org.apache.commons.codec.language.bm.c.f335307b, n = {"$this$consume$iv"}, s = {"L$0"})
    static final class a<E> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f313555a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f313556b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f313557c;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f313556b = obj;
            this.f313557c |= Integer.MIN_VALUE;
            return b0.d(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0}, l = {477}, m = "none", n = {"$this$consume$iv"}, s = {"L$0"})
    static final class a0<E> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f313558a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f313559b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f313560c;

        a0(kotlin.coroutines.d<? super a0> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f313559b = obj;
            this.f313560c |= Integer.MIN_VALUE;
            return b0.W(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {41}, m = "consumeEach", n = {w0.f100156c1, "channel$iv"}, s = {"L$0", "L$1"})
    static final class b<E> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f313561a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f313562b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f313563c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f313564d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f313565e;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f313564d = obj;
            this.f313565e |= Integer.MIN_VALUE;
            return b0.f(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.b0$b0, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$requireNoNulls$1", f = "Deprecated.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C2268b0 extends kotlin.coroutines.jvm.internal.o implements Function2<Object, kotlin.coroutines.d<Object>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f313566a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f313567b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ n0<Object> f313568c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2268b0(n0<Object> n0Var, kotlin.coroutines.d<? super C2268b0> dVar) {
            super(2, dVar);
            this.f313568c = n0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            C2268b0 c2268b0 = new C2268b0(this.f313568c, dVar);
            c2268b0.f313567b = obj;
            return c2268b0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f313566a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            Object obj2 = this.f313567b;
            if (obj2 != null) {
                return obj2;
            }
            throw new IllegalArgumentException("null element found in " + this.f313568c + '.');
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, kotlin.coroutines.d<Object> dVar) {
            return ((C2268b0) create(obj, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {514}, m = "count", n = {"count", "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
    static final class c<E> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f313569a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f313570b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f313571c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f313572d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f313573e;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f313572d = obj;
            this.f313573e |= Integer.MIN_VALUE;
            return b0.l(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {166, 169}, m = "single", n = {"$this$consume$iv", "iterator", "$this$consume$iv", "single"}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class c0<E> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f313574a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f313575b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f313576c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f313577d;

        c0(kotlin.coroutines.d<? super c0> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f313576c = obj;
            this.f313577d |= Integer.MIN_VALUE;
            return b0.Y(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinct$1", f = "Deprecated.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<Object, kotlin.coroutines.d<Object>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f313578a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f313579b;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            d dVar2 = new d(dVar);
            dVar2.f313579b = obj;
            return dVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f313578a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return this.f313579b;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, kotlin.coroutines.d<Object> dVar) {
            return ((d) create(obj, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {179, 182}, m = "singleOrNull", n = {"$this$consume$iv", "iterator", "$this$consume$iv", "single"}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class d0<E> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f313580a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f313581b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f313582c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f313583d;

        d0(kotlin.coroutines.d<? super d0> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f313582c = obj;
            this.f313583d |= Integer.MIN_VALUE;
            return b0.Z(null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 1, 2, 2, 2}, l = {417, 418, androidx.constraintlayout.core.motion.utils.v.c.f44017r}, m = "invokeSuspend", n = {"$this$produce", com.google.firebase.crashlytics.internal.metadata.p.f121327i, "$this$produce", com.google.firebase.crashlytics.internal.metadata.p.f121327i, "e", "$this$produce", com.google.firebase.crashlytics.internal.metadata.p.f121327i, "k"}, s = {"L$0", "L$1", "L$0", "L$1", "L$3", "L$0", "L$1", "L$3"})
    static final class e<E> extends kotlin.coroutines.jvm.internal.o implements Function2<l0<? super E>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f313584a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f313585b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f313586c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f313587d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f313588e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ n0<E> f313589f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2<E, kotlin.coroutines.d<? super K>, Object> f313590g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(n0<? extends E> n0Var, Function2<? super E, ? super kotlin.coroutines.d<? super K>, ? extends Object> function2, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f313589f = n0Var;
            this.f313590g = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            e eVar = new e(this.f313589f, this.f313590g, dVar);
            eVar.f313588e = obj;
            return eVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v10 */
        /* JADX WARN: Type inference failed for: r5v11 */
        /* JADX WARN: Type inference failed for: r5v2 */
        /* JADX WARN: Type inference failed for: r5v20 */
        /* JADX WARN: Type inference failed for: r5v21 */
        /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v1 */
        /* JADX WARN: Type inference failed for: r6v16 */
        /* JADX WARN: Type inference failed for: r6v17 */
        /* JADX WARN: Type inference failed for: r6v18 */
        /* JADX WARN: Type inference failed for: r6v19 */
        /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.util.HashSet] */
        /* JADX WARN: Type inference failed for: r6v20 */
        /* JADX WARN: Type inference failed for: r6v21 */
        /* JADX WARN: Type inference failed for: r6v22 */
        /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v5 */
        /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v7 */
        /* JADX WARN: Type inference failed for: r6v8 */
        /* JADX WARN: Type inference failed for: r6v9, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlinx.coroutines.channels.o0] */
        /* JADX WARN: Type inference failed for: r7v11 */
        /* JADX WARN: Type inference failed for: r7v12 */
        /* JADX WARN: Type inference failed for: r7v13 */
        /* JADX WARN: Type inference failed for: r7v14 */
        /* JADX WARN: Type inference failed for: r7v15 */
        /* JADX WARN: Type inference failed for: r7v3 */
        /* JADX WARN: Type inference failed for: r7v4 */
        /* JADX WARN: Type inference failed for: r7v5 */
        /* JADX WARN: Type inference failed for: r7v6 */
        /* JADX WARN: Type inference failed for: r9v0 */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00b7 -> B:31:0x00d6). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00cd -> B:30:0x00d1). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to kotlinx.coroutines.channels.b0$e<E> for r11v3 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instruction units count: 224
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.b0.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(l0<? super E> l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(l0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {284, 285}, m = "invokeSuspend", n = {"$this$produce", "remaining", "$this$produce", "remaining"}, s = {"L$0", "I$0", "L$0", "I$0"})
    @SourceDebugExtension({"SMAP\nDeprecated.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$take$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,509:1\n1#2:510\n*E\n"})
    static final class e0 extends kotlin.coroutines.jvm.internal.o implements Function2<l0<Object>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f313591a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f313592b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f313593c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f313594d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f313595e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ n0<Object> f313596f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e0(int i10, n0<Object> n0Var, kotlin.coroutines.d<? super e0> dVar) {
            super(2, dVar);
            this.f313595e = i10;
            this.f313596f = n0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            e0 e0Var = new e0(this.f313595e, this.f313596f, dVar);
            e0Var.f313594d = obj;
            return e0Var;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x006d  */
        /* JADX WARN: Code duplicated, block: B:23:0x006f  */
        /* JADX WARN: Code duplicated, block: B:26:0x007b  */
        /* JADX WARN: Code duplicated, block: B:33:0x0097  */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x008c, code lost:
        
            if (r5.G(r9, r8) == r0) goto L28;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x008c -> B:7:0x001e). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                r7 = 2
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r8.f313593c
                r7 = 7
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L3c
                if (r1 == r3) goto L2b
                if (r1 != r2) goto L21
                r7 = 6
                int r1 = r8.f313592b
                java.lang.Object r4 = r8.f313591a
                kotlinx.coroutines.channels.r r4 = (kotlinx.coroutines.channels.r) r4
                java.lang.Object r5 = r8.f313594d
                kotlinx.coroutines.channels.l0 r5 = (kotlinx.coroutines.channels.l0) r5
                kotlin.ResultKt.m(r9)
            L1e:
                r9 = r5
                r7 = 3
                goto L8f
            L21:
                r7 = 2
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                r7 = 5
                throw r8
            L2b:
                int r1 = r8.f313592b
                java.lang.Object r4 = r8.f313591a
                r7 = 6
                kotlinx.coroutines.channels.r r4 = (kotlinx.coroutines.channels.r) r4
                java.lang.Object r5 = r8.f313594d
                kotlinx.coroutines.channels.l0 r5 = (kotlinx.coroutines.channels.l0) r5
                r7 = 3
                kotlin.ResultKt.m(r9)
                r7 = 1
                goto L73
            L3c:
                kotlin.ResultKt.m(r9)
                java.lang.Object r9 = r8.f313594d
                kotlinx.coroutines.channels.l0 r9 = (kotlinx.coroutines.channels.l0) r9
                r7 = 7
                int r1 = r8.f313595e
                if (r1 != 0) goto L4b
                kotlin.Unit r8 = kotlin.Unit.f312394a
                return r8
            L4b:
                if (r1 < 0) goto L50
                r4 = r3
                r7 = 6
                goto L51
            L50:
                r4 = 0
            L51:
                if (r4 == 0) goto L9a
                r7 = 4
                kotlinx.coroutines.channels.n0<java.lang.Object> r4 = r8.f313596f
                r7 = 7
                kotlinx.coroutines.channels.r r4 = r4.iterator()
            L5b:
                r7 = 7
                r8.f313594d = r9
                r7 = 6
                r8.f313591a = r4
                r8.f313592b = r1
                r8.f313593c = r3
                r7 = 7
                java.lang.Object r5 = r4.c(r8)
                r7 = 3
                if (r5 != r0) goto L6f
                r7 = 0
                goto L8e
            L6f:
                r6 = r5
                r5 = r9
                r9 = r6
                r9 = r6
            L73:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto L97
                r7 = 7
                java.lang.Object r9 = r4.next()
                r8.f313594d = r5
                r8.f313591a = r4
                r8.f313592b = r1
                r8.f313593c = r2
                java.lang.Object r9 = r5.G(r9, r8)
                if (r9 != r0) goto L1e
            L8e:
                return r0
            L8f:
                int r1 = r1 + (-1)
                if (r1 != 0) goto L5b
                kotlin.Unit r8 = kotlin.Unit.f312394a
                r7 = 7
                return r8
            L97:
                kotlin.Unit r8 = kotlin.Unit.f312394a
                return r8
            L9a:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "Requested element count "
                r8.append(r9)
                r8.append(r1)
                r7 = 3
                java.lang.String r9 = "rns tze.oshs s leia"
                java.lang.String r9 = " is less than zero."
                r7 = 4
                r8.append(r9)
                java.lang.String r8 = r8.toString()
                r7 = 6
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                java.lang.String r8 = r8.toString()
                r7 = 7
                r9.<init>(r8)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.b0.e0.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(l0<Object> l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e0) create(l0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1", f = "Deprecated.kt", i = {0, 0, 1, 2}, l = {194, 199, 200}, m = "invokeSuspend", n = {"$this$produce", "remaining", "$this$produce", "$this$produce"}, s = {"L$0", "I$0", "L$0", "L$0"})
    @SourceDebugExtension({"SMAP\nDeprecated.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$drop$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,509:1\n1#2:510\n*E\n"})
    static final class f extends kotlin.coroutines.jvm.internal.o implements Function2<l0<Object>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f313597a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f313598b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f313599c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f313600d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f313601e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ n0<Object> f313602f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(int i10, n0<Object> n0Var, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f313601e = i10;
            this.f313602f = n0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            f fVar = new f(this.f313601e, this.f313602f, dVar);
            fVar.f313600d = obj;
            return fVar;
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0063 A[PHI: r1 r5 r6
          0x0063: PHI (r1v4 int) = (r1v1 int), (r1v6 int) binds: [B:19:0x005c, B:26:0x0084] A[DONT_GENERATE, DONT_INLINE]
          0x0063: PHI (r5v5 kotlinx.coroutines.channels.r<java.lang.Object>) = (r5v3 kotlinx.coroutines.channels.r<java.lang.Object>), (r5v6 kotlinx.coroutines.channels.r<java.lang.Object>) binds: [B:19:0x005c, B:26:0x0084] A[DONT_GENERATE, DONT_INLINE]
          0x0063: PHI (r6v1 kotlinx.coroutines.channels.l0) = (r6v0 kotlinx.coroutines.channels.l0), (r6v2 kotlinx.coroutines.channels.l0) binds: [B:19:0x005c, B:26:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:22:0x0073  */
        /* JADX WARN: Code duplicated, block: B:23:0x0075 A[PHI: r1 r5 r6 r10
          0x0075: PHI (r1v5 int) = (r1v4 int), (r1v10 int) binds: [B:21:0x0071, B:12:0x0039] A[DONT_GENERATE, DONT_INLINE]
          0x0075: PHI (r5v6 kotlinx.coroutines.channels.r<java.lang.Object>) = (r5v5 kotlinx.coroutines.channels.r<java.lang.Object>), (r5v8 kotlinx.coroutines.channels.r<java.lang.Object>) binds: [B:21:0x0071, B:12:0x0039] A[DONT_GENERATE, DONT_INLINE]
          0x0075: PHI (r6v2 kotlinx.coroutines.channels.l0) = (r6v1 kotlinx.coroutines.channels.l0), (r6v4 kotlinx.coroutines.channels.l0) binds: [B:21:0x0071, B:12:0x0039] A[DONT_GENERATE, DONT_INLINE]
          0x0075: PHI (r10v9 java.lang.Object) = (r10v8 java.lang.Object), (r10v0 java.lang.Object) binds: [B:21:0x0071, B:12:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:25:0x007d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0071 -> B:23:0x0075). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00b9 -> B:8:0x0020). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instruction units count: 230
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.b0.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(l0<Object> l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(l0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1", f = "Deprecated.kt", i = {0, 1, 1, 2}, l = {299, 300, 301}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "e", "$this$produce"}, s = {"L$0", "L$0", "L$2", "L$0"})
    static final class f0 extends kotlin.coroutines.jvm.internal.o implements Function2<l0<Object>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f313603a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f313604b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f313605c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f313606d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ n0<Object> f313607e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function2<Object, kotlin.coroutines.d<? super Boolean>, Object> f313608f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f0(n0<Object> n0Var, Function2<Object, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> function2, kotlin.coroutines.d<? super f0> dVar) {
            super(2, dVar);
            this.f313607e = n0Var;
            this.f313608f = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            f0 f0Var = new f0(this.f313607e, this.f313608f, dVar);
            f0Var.f313606d = obj;
            return f0Var;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0068 A[PHI: r1 r5 r10
          0x0068: PHI (r1v6 kotlinx.coroutines.channels.r<java.lang.Object>) = (r1v8 kotlinx.coroutines.channels.r<java.lang.Object>), (r1v10 kotlinx.coroutines.channels.r<java.lang.Object>) binds: [B:14:0x0065, B:11:0x003b] A[DONT_GENERATE, DONT_INLINE]
          0x0068: PHI (r5v3 kotlinx.coroutines.channels.l0) = (r5v5 kotlinx.coroutines.channels.l0), (r5v7 kotlinx.coroutines.channels.l0) binds: [B:14:0x0065, B:11:0x003b] A[DONT_GENERATE, DONT_INLINE]
          0x0068: PHI (r10v8 java.lang.Object) = (r10v13 java.lang.Object), (r10v0 java.lang.Object) binds: [B:14:0x0065, B:11:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:18:0x0071  */
        /* JADX WARN: Code duplicated, block: B:21:0x0088  */
        /* JADX WARN: Code duplicated, block: B:24:0x0098  */
        /* JADX WARN: Code duplicated, block: B:26:0x009c  */
        /* JADX WARN: Code duplicated, block: B:29:0x00af  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00af -> B:13:0x005b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r9.f313605c
                r2 = 3
                r8 = 7
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L4c
                if (r1 == r4) goto L3b
                if (r1 == r3) goto L2c
                if (r1 != r2) goto L20
                java.lang.Object r1 = r9.f313603a
                kotlinx.coroutines.channels.r r1 = (kotlinx.coroutines.channels.r) r1
                java.lang.Object r5 = r9.f313606d
                kotlinx.coroutines.channels.l0 r5 = (kotlinx.coroutines.channels.l0) r5
                r8 = 0
                kotlin.ResultKt.m(r10)
                r8 = 7
                goto L5b
            L20:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                r8 = 3
                java.lang.String r10 = "kosn l  e e/fo toceee/ntoevlrbhi/ i/msw/r/u/air/otu"
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                r8 = 5
                throw r9
            L2c:
                java.lang.Object r1 = r9.f313604b
                java.lang.Object r5 = r9.f313603a
                kotlinx.coroutines.channels.r r5 = (kotlinx.coroutines.channels.r) r5
                java.lang.Object r6 = r9.f313606d
                kotlinx.coroutines.channels.l0 r6 = (kotlinx.coroutines.channels.l0) r6
                r8 = 1
                kotlin.ResultKt.m(r10)
                goto L8e
            L3b:
                r8 = 6
                java.lang.Object r1 = r9.f313603a
                kotlinx.coroutines.channels.r r1 = (kotlinx.coroutines.channels.r) r1
                r8 = 2
                java.lang.Object r5 = r9.f313606d
                r8 = 7
                kotlinx.coroutines.channels.l0 r5 = (kotlinx.coroutines.channels.l0) r5
                r8 = 0
                kotlin.ResultKt.m(r10)
                r8 = 2
                goto L68
            L4c:
                kotlin.ResultKt.m(r10)
                java.lang.Object r10 = r9.f313606d
                kotlinx.coroutines.channels.l0 r10 = (kotlinx.coroutines.channels.l0) r10
                r8 = 1
                kotlinx.coroutines.channels.n0<java.lang.Object> r1 = r9.f313607e
                kotlinx.coroutines.channels.r r1 = r1.iterator()
                r5 = r10
            L5b:
                r9.f313606d = r5
                r9.f313603a = r1
                r9.f313605c = r4
                java.lang.Object r10 = r1.c(r9)
                if (r10 != r0) goto L68
                goto Lae
            L68:
                r8 = 4
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 == 0) goto Lb4
                r8 = 1
                java.lang.Object r10 = r1.next()
                r8 = 3
                kotlin.jvm.functions.Function2<java.lang.Object, kotlin.coroutines.d<? super java.lang.Boolean>, java.lang.Object> r6 = r9.f313608f
                r9.f313606d = r5
                r9.f313603a = r1
                r9.f313604b = r10
                r9.f313605c = r3
                java.lang.Object r6 = r6.invoke(r10, r9)
                if (r6 != r0) goto L88
                goto Lae
            L88:
                r7 = r1
                r7 = r1
                r1 = r10
                r10 = r6
                r6 = r5
                r5 = r7
            L8e:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                r8 = 3
                boolean r10 = r10.booleanValue()
                r8 = 3
                if (r10 != 0) goto L9c
                r8 = 7
                kotlin.Unit r9 = kotlin.Unit.f312394a
                return r9
            L9c:
                r8 = 0
                r9.f313606d = r6
                r9.f313603a = r5
                r10 = 0
                r8 = 7
                r9.f313604b = r10
                r9.f313605c = r2
                java.lang.Object r10 = r6.G(r1, r9)
                r8 = 5
                if (r10 != r0) goto Laf
            Lae:
                return r0
            Laf:
                r1 = r5
                r1 = r5
                r5 = r6
                r8 = 3
                goto L5b
            Lb4:
                r8 = 3
                kotlin.Unit r9 = kotlin.Unit.f312394a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.b0.f0.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(l0<Object> l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f0) create(l0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1", f = "Deprecated.kt", i = {0, 1, 1, 2, 3, 4}, l = {211, 212, 213, 217, 218}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "e", "$this$produce", "$this$produce", "$this$produce"}, s = {"L$0", "L$0", "L$2", "L$0", "L$0", "L$0"})
    static final class g extends kotlin.coroutines.jvm.internal.o implements Function2<l0<Object>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f313609a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f313610b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f313611c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f313612d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ n0<Object> f313613e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function2<Object, kotlin.coroutines.d<? super Boolean>, Object> f313614f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(n0<Object> n0Var, Function2<Object, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> function2, kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
            this.f313613e = n0Var;
            this.f313614f = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            g gVar = new g(this.f313613e, this.f313614f, dVar);
            gVar.f313612d = obj;
            return gVar;
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0070 A[PHI: r1 r8 r13
          0x0070: PHI (r1v3 kotlinx.coroutines.channels.r<java.lang.Object>) = (r1v5 kotlinx.coroutines.channels.r<java.lang.Object>), (r1v16 kotlinx.coroutines.channels.r<java.lang.Object>) binds: [B:21:0x0090, B:17:0x0063] A[DONT_GENERATE, DONT_INLINE]
          0x0070: PHI (r8v1 kotlinx.coroutines.channels.l0) = (r8v5 kotlinx.coroutines.channels.l0), (r8v9 kotlinx.coroutines.channels.l0) binds: [B:21:0x0090, B:17:0x0063] A[DONT_GENERATE, DONT_INLINE]
          0x0070: PHI (r13v3 java.lang.Object) = (r13v8 java.lang.Object), (r13v0 java.lang.Object) binds: [B:21:0x0090, B:17:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:25:0x009d  */
        /* JADX WARN: Code duplicated, block: B:28:0x00b5  */
        /* JADX WARN: Code duplicated, block: B:31:0x00c5  */
        /* JADX WARN: Code duplicated, block: B:34:0x00d6  */
        /* JADX WARN: Code duplicated, block: B:35:0x00d8  */
        /* JADX WARN: Code duplicated, block: B:39:0x00ef  */
        /* JADX WARN: Code duplicated, block: B:40:0x00f1  */
        /* JADX WARN: Code duplicated, block: B:43:0x0101  */
        /* JADX WARN: Code duplicated, block: B:46:0x0114  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00b5 -> B:16:0x0060). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0111 -> B:10:0x0028). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 279
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.b0.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(l0<Object> l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((g) create(l0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {514, 308}, m = "toChannel", n = {"destination", "$this$consume$iv$iv", "destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class g0<E, C extends o0<? super E>> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f313615a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f313616b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f313617c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f313618d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f313619e;

        g0(kotlin.coroutines.d<? super g0> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f313618d = obj;
            this.f313619e |= Integer.MIN_VALUE;
            int i10 = 6 & 0;
            return kotlinx.coroutines.channels.v.e0(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0}, l = {com.planner5d.library.engine.input.f.b.V}, m = "elementAt", n = {"$this$consume$iv", FirebaseAnalytics.d.f120644b0, "count"}, s = {"L$0", "I$0", "I$1"})
    static final class h<E> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f313620a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f313621b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f313622c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f313623d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f313624e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f313625f;

        h(kotlin.coroutines.d<? super h> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f313624e = obj;
            this.f313625f |= Integer.MIN_VALUE;
            return b0.t(null, 0, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {514}, m = "toCollection", n = {"destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
    static final class h0<E, C extends Collection<? super E>> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f313626a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f313627b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f313628c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f313629d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f313630e;

        h0(kotlin.coroutines.d<? super h0> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f313629d = obj;
            this.f313630e |= Integer.MIN_VALUE;
            return kotlinx.coroutines.channels.v.f0(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0}, l = {com.planner5d.library.engine.input.f.b.f160717p0}, m = "elementAtOrNull", n = {"$this$consume$iv", FirebaseAnalytics.d.f120644b0, "count"}, s = {"L$0", "I$0", "I$1"})
    static final class i<E> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f313631a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f313632b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f313633c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f313634d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f313635e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f313636f;

        i(kotlin.coroutines.d<? super i> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f313635e = obj;
            this.f313636f |= Integer.MIN_VALUE;
            boolean z10 = true;
            return b0.u(null, 0, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {514}, m = "toMap", n = {"destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
    static final class i0<K, V, M extends Map<? super K, ? super V>> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f313637a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f313638b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f313639c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f313640d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f313641e;

        i0(kotlin.coroutines.d<? super i0> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f313640d = obj;
            this.f313641e |= Integer.MIN_VALUE;
            return kotlinx.coroutines.channels.v.h0(null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1", f = "Deprecated.kt", i = {0, 1, 1, 2}, l = {228, 229, 229}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "e", "$this$produce"}, s = {"L$0", "L$0", "L$2", "L$0"})
    static final class j<E> extends kotlin.coroutines.jvm.internal.o implements Function2<l0<? super E>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f313642a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f313643b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f313644c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f313645d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ n0<E> f313646e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function2<E, kotlin.coroutines.d<? super Boolean>, Object> f313647f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(n0<? extends E> n0Var, Function2<? super E, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> function2, kotlin.coroutines.d<? super j> dVar) {
            super(2, dVar);
            this.f313646e = n0Var;
            this.f313647f = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            j jVar = new j(this.f313646e, this.f313647f, dVar);
            jVar.f313645d = obj;
            return jVar;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x006b A[PHI: r1 r6 r11
          0x006b: PHI (r1v4 kotlinx.coroutines.channels.r<E>) = (r1v5 kotlinx.coroutines.channels.r<E>), (r1v7 kotlinx.coroutines.channels.r<E>) binds: [B:15:0x0068, B:12:0x003e] A[DONT_GENERATE, DONT_INLINE]
          0x006b: PHI (r6v4 ??) = (r6v14 ??), (r6v15 ??) binds: [B:15:0x0068, B:12:0x003e] A[DONT_GENERATE, DONT_INLINE]
          0x006b: PHI (r11v7 java.lang.Object) = (r11v12 java.lang.Object), (r11v0 java.lang.Object) binds: [B:15:0x0068, B:12:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:19:0x0074  */
        /* JADX WARN: Code duplicated, block: B:22:0x008b  */
        /* JADX WARN: Code duplicated, block: B:25:0x0099  */
        /* JADX WARN: Code duplicated, block: B:29:0x00ab  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v0 */
        /* JADX WARN: Type inference failed for: r6v13, types: [kotlinx.coroutines.channels.l0] */
        /* JADX WARN: Type inference failed for: r6v14 */
        /* JADX WARN: Type inference failed for: r6v15 */
        /* JADX WARN: Type inference failed for: r6v2 */
        /* JADX WARN: Type inference failed for: r6v3 */
        /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlinx.coroutines.channels.o0] */
        /* JADX WARN: Type inference failed for: r7v3 */
        /* JADX WARN: Type inference failed for: r7v6 */
        /* JADX WARN: Type inference failed for: r8v0 */
        /* JADX WARN: Type inference failed for: r8v1 */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r9 = 7
                int r1 = r10.f313644c
                r2 = 0
                r9 = 1
                r3 = 3
                r4 = 2
                r5 = 1
                r9 = r5
                if (r1 == 0) goto L4a
                if (r1 == r5) goto L3e
                if (r1 == r4) goto L2a
                r9 = 5
                if (r1 != r3) goto L22
                java.lang.Object r1 = r10.f313642a
                kotlinx.coroutines.channels.r r1 = (kotlinx.coroutines.channels.r) r1
                java.lang.Object r6 = r10.f313645d
                kotlinx.coroutines.channels.l0 r6 = (kotlinx.coroutines.channels.l0) r6
                kotlin.ResultKt.m(r11)
                goto L5a
            L22:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r11)
                throw r10
            L2a:
                java.lang.Object r1 = r10.f313643b
                r9 = 4
                java.lang.Object r6 = r10.f313642a
                kotlinx.coroutines.channels.r r6 = (kotlinx.coroutines.channels.r) r6
                r9 = 6
                java.lang.Object r7 = r10.f313645d
                r9 = 7
                kotlinx.coroutines.channels.l0 r7 = (kotlinx.coroutines.channels.l0) r7
                kotlin.ResultKt.m(r11)
                r8 = r6
                r6 = r1
                r1 = r8
                goto L90
            L3e:
                java.lang.Object r1 = r10.f313642a
                kotlinx.coroutines.channels.r r1 = (kotlinx.coroutines.channels.r) r1
                java.lang.Object r6 = r10.f313645d
                kotlinx.coroutines.channels.l0 r6 = (kotlinx.coroutines.channels.l0) r6
                kotlin.ResultKt.m(r11)
                goto L6b
            L4a:
                r9 = 5
                kotlin.ResultKt.m(r11)
                r9 = 5
                java.lang.Object r11 = r10.f313645d
                kotlinx.coroutines.channels.l0 r11 = (kotlinx.coroutines.channels.l0) r11
                kotlinx.coroutines.channels.n0<E> r1 = r10.f313646e
                kotlinx.coroutines.channels.r r1 = r1.iterator()
                r6 = r11
            L5a:
                r9 = 0
                r10.f313645d = r6
                r9 = 5
                r10.f313642a = r1
                r10.f313643b = r2
                r10.f313644c = r5
                java.lang.Object r11 = r1.c(r10)
                if (r11 != r0) goto L6b
                goto La9
            L6b:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                r9 = 6
                boolean r11 = r11.booleanValue()
                if (r11 == 0) goto Lae
                java.lang.Object r11 = r1.next()
                r9 = 3
                kotlin.jvm.functions.Function2<E, kotlin.coroutines.d<? super java.lang.Boolean>, java.lang.Object> r7 = r10.f313647f
                r10.f313645d = r6
                r10.f313642a = r1
                r10.f313643b = r11
                r10.f313644c = r4
                java.lang.Object r7 = r7.invoke(r11, r10)
                r9 = 5
                if (r7 != r0) goto L8b
                goto La9
            L8b:
                r8 = r6
                r8 = r6
                r6 = r11
                r11 = r7
                r7 = r8
            L90:
                r9 = 4
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 == 0) goto Lab
                r9 = 7
                r10.f313645d = r7
                r9 = 1
                r10.f313642a = r1
                r10.f313643b = r2
                r10.f313644c = r3
                java.lang.Object r11 = r7.G(r6, r10)
                if (r11 != r0) goto Lab
            La9:
                r9 = 1
                return r0
            Lab:
                r6 = r7
                r9 = 6
                goto L5a
            Lae:
                r9 = 7
                kotlin.Unit r10 = kotlin.Unit.f312394a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.b0.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(l0<? super E> l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((j) create(l0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {400, 401}, m = "invokeSuspend", n = {"$this$produce", FirebaseAnalytics.d.f120644b0, "$this$produce", FirebaseAnalytics.d.f120644b0}, s = {"L$0", "I$0", "L$0", "I$0"})
    static final class j0 extends kotlin.coroutines.jvm.internal.o implements Function2<l0<? super IndexedValue<Object>>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f313648a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f313649b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f313650c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f313651d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ n0<Object> f313652e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j0(n0<Object> n0Var, kotlin.coroutines.d<? super j0> dVar) {
            super(2, dVar);
            this.f313652e = n0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            j0 j0Var = new j0(this.f313652e, dVar);
            j0Var.f313651d = obj;
            return j0Var;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x005f  */
        /* JADX WARN: Code duplicated, block: B:16:0x0061  */
        /* JADX WARN: Code duplicated, block: B:19:0x0075  */
        /* JADX WARN: Code duplicated, block: B:22:0x0092  */
        /* JADX WARN: Code duplicated, block: B:23:0x0095  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0092 -> B:8:0x0025). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r9 = 5
                int r1 = r10.f313650c
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L3f
                if (r1 == r3) goto L30
                r9 = 1
                if (r1 != r2) goto L27
                int r1 = r10.f313649b
                java.lang.Object r4 = r10.f313648a
                r9 = 6
                kotlinx.coroutines.channels.r r4 = (kotlinx.coroutines.channels.r) r4
                r9 = 1
                java.lang.Object r5 = r10.f313651d
                kotlinx.coroutines.channels.l0 r5 = (kotlinx.coroutines.channels.l0) r5
                kotlin.ResultKt.m(r11)
                r11 = r4
                r11 = r4
                r9 = 4
                r4 = r1
                r1 = r11
                r1 = r11
            L25:
                r11 = r5
                goto L50
            L27:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                r9 = 0
                r10.<init>(r11)
                throw r10
            L30:
                r9 = 7
                int r1 = r10.f313649b
                java.lang.Object r4 = r10.f313648a
                kotlinx.coroutines.channels.r r4 = (kotlinx.coroutines.channels.r) r4
                java.lang.Object r5 = r10.f313651d
                kotlinx.coroutines.channels.l0 r5 = (kotlinx.coroutines.channels.l0) r5
                kotlin.ResultKt.m(r11)
                goto L6b
            L3f:
                kotlin.ResultKt.m(r11)
                java.lang.Object r11 = r10.f313651d
                r9 = 3
                kotlinx.coroutines.channels.l0 r11 = (kotlinx.coroutines.channels.l0) r11
                r9 = 2
                kotlinx.coroutines.channels.n0<java.lang.Object> r1 = r10.f313652e
                kotlinx.coroutines.channels.r r1 = r1.iterator()
                r9 = 4
                r4 = 0
            L50:
                r9 = 7
                r10.f313651d = r11
                r10.f313648a = r1
                r10.f313649b = r4
                r10.f313650c = r3
                java.lang.Object r5 = r1.c(r10)
                if (r5 != r0) goto L61
                r9 = 2
                goto L91
            L61:
                r8 = r5
                r5 = r11
                r11 = r8
                r11 = r8
                r9 = 3
                r8 = r4
                r8 = r4
                r4 = r1
                r4 = r1
                r1 = r8
            L6b:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                r9 = 3
                boolean r11 = r11.booleanValue()
                r9 = 5
                if (r11 == 0) goto L95
                r9 = 5
                java.lang.Object r11 = r4.next()
                r9 = 3
                kotlin.collections.IndexedValue r6 = new kotlin.collections.IndexedValue
                int r7 = r1 + 1
                r6.<init>(r1, r11)
                r10.f313651d = r5
                r10.f313648a = r4
                r10.f313649b = r7
                r10.f313650c = r2
                java.lang.Object r11 = r5.G(r6, r10)
                r9 = 3
                if (r11 != r0) goto L92
            L91:
                return r0
            L92:
                r1 = r4
                r4 = r7
                goto L25
            L95:
                kotlin.Unit r10 = kotlin.Unit.f312394a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.b0.j0.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(l0<? super IndexedValue<Object>> l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((j0) create(l0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 1, 2, 2}, l = {241, 242, 242}, m = "invokeSuspend", n = {"$this$produce", FirebaseAnalytics.d.f120644b0, "$this$produce", "e", FirebaseAnalytics.d.f120644b0, "$this$produce", FirebaseAnalytics.d.f120644b0}, s = {"L$0", "I$0", "L$0", "L$2", "I$0", "L$0", "I$0"})
    static final class k extends kotlin.coroutines.jvm.internal.o implements Function2<l0<Object>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f313653a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f313654b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f313655c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f313656d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f313657e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ n0<Object> f313658f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ pj.n<Integer, Object, kotlin.coroutines.d<? super Boolean>, Object> f313659g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        k(n0<Object> n0Var, pj.n<? super Integer, Object, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> nVar, kotlin.coroutines.d<? super k> dVar) {
            super(2, dVar);
            this.f313658f = n0Var;
            this.f313659g = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            k kVar = new k(this.f313658f, this.f313659g, dVar);
            kVar.f313657e = obj;
            return kVar;
        }

        /* JADX WARN: Code duplicated, block: B:18:0x007d A[PHI: r1 r6 r7 r13
          0x007d: PHI (r1v5 int) = (r1v9 int), (r1v10 int) binds: [B:16:0x007a, B:13:0x0046] A[DONT_GENERATE, DONT_INLINE]
          0x007d: PHI (r6v3 kotlinx.coroutines.channels.r<java.lang.Object>) = (r6v4 kotlinx.coroutines.channels.r<java.lang.Object>), (r6v6 kotlinx.coroutines.channels.r<java.lang.Object>) binds: [B:16:0x007a, B:13:0x0046] A[DONT_GENERATE, DONT_INLINE]
          0x007d: PHI (r7v7 kotlinx.coroutines.channels.l0) = (r7v9 kotlinx.coroutines.channels.l0), (r7v11 kotlinx.coroutines.channels.l0) binds: [B:16:0x007a, B:13:0x0046] A[DONT_GENERATE, DONT_INLINE]
          0x007d: PHI (r13v7 java.lang.Object) = (r13v12 java.lang.Object), (r13v0 java.lang.Object) binds: [B:16:0x007a, B:13:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:20:0x0086  */
        /* JADX WARN: Code duplicated, block: B:23:0x00a6  */
        /* JADX WARN: Code duplicated, block: B:26:0x00b4  */
        /* JADX WARN: Code duplicated, block: B:29:0x00c7  */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 206
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.b0.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(l0<Object> l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((k) create(l0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V] */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2", f = "Deprecated.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2}, l = {514, 499, 501}, m = "invokeSuspend", n = {"$this$produce", "otherIterator", "$this$consume$iv$iv", "$this$produce", "otherIterator", "$this$consume$iv$iv", "element1", "$this$produce", "otherIterator", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$3", "L$0", "L$1", "L$3", "L$5", "L$0", "L$1", "L$3"})
    @SourceDebugExtension({"SMAP\nDeprecated.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$zip$2\n+ 2 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n1#1,509:1\n160#2:510\n94#2,3:511\n161#2,2:514\n101#2:516\n97#2,3:517\n*S KotlinDebug\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$zip$2\n*L\n498#1:510\n498#1:511,3\n498#1:514,2\n498#1:516\n498#1:517,3\n*E\n"})
    static final class k0<V> extends kotlin.coroutines.jvm.internal.o implements Function2<l0<? super V>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f313660a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f313661b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f313662c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f313663d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f313664e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f313665f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private /* synthetic */ Object f313666g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ n0<R> f313667h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ n0<E> f313668i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function2<E, R, V> f313669j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        k0(n0<? extends R> n0Var, n0<? extends E> n0Var2, Function2<? super E, ? super R, ? extends V> function2, kotlin.coroutines.d<? super k0> dVar) {
            super(2, dVar);
            this.f313667h = n0Var;
            this.f313668i = n0Var2;
            this.f313669j = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            k0 k0Var = new k0(this.f313667h, this.f313668i, this.f313669j, dVar);
            k0Var.f313666g = obj;
            return k0Var;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x00b3  */
        /* JADX WARN: Code duplicated, block: B:28:0x00b5 A[Catch: all -> 0x002f, PHI: r1 r6 r7 r8 r9 r14
          0x00b5: PHI (r1v5 kotlinx.coroutines.channels.r) = (r1v6 kotlinx.coroutines.channels.r), (r1v8 kotlinx.coroutines.channels.r) binds: [B:26:0x00b1, B:21:0x007a] A[DONT_GENERATE, DONT_INLINE]
          0x00b5: PHI (r6v9 kotlinx.coroutines.channels.n0) = (r6v12 kotlinx.coroutines.channels.n0), (r6v14 kotlinx.coroutines.channels.n0) binds: [B:26:0x00b1, B:21:0x007a] A[DONT_GENERATE, DONT_INLINE]
          0x00b5: PHI (r7v5 kotlin.jvm.functions.Function2) = (r7v7 kotlin.jvm.functions.Function2), (r7v9 kotlin.jvm.functions.Function2) binds: [B:26:0x00b1, B:21:0x007a] A[DONT_GENERATE, DONT_INLINE]
          0x00b5: PHI (r8v6 kotlinx.coroutines.channels.r) = (r8v8 kotlinx.coroutines.channels.r), (r8v10 kotlinx.coroutines.channels.r) binds: [B:26:0x00b1, B:21:0x007a] A[DONT_GENERATE, DONT_INLINE]
          0x00b5: PHI (r9v5 kotlinx.coroutines.channels.l0) = (r9v7 kotlinx.coroutines.channels.l0), (r9v9 kotlinx.coroutines.channels.l0) binds: [B:26:0x00b1, B:21:0x007a] A[DONT_GENERATE, DONT_INLINE]
          0x00b5: PHI (r14v10 java.lang.Object) = (r14v16 java.lang.Object), (r14v0 java.lang.Object) binds: [B:26:0x00b1, B:21:0x007a] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {all -> 0x002f, blocks: (B:9:0x002a, B:25:0x009c, B:28:0x00b5, B:30:0x00bd, B:41:0x0117, B:21:0x007a, B:24:0x0093), top: B:53:0x000c }] */
        /* JADX WARN: Code duplicated, block: B:30:0x00bd A[Catch: all -> 0x002f, TRY_LEAVE, TryCatch #2 {all -> 0x002f, blocks: (B:9:0x002a, B:25:0x009c, B:28:0x00b5, B:30:0x00bd, B:41:0x0117, B:21:0x007a, B:24:0x0093), top: B:53:0x000c }] */
        /* JADX WARN: Code duplicated, block: B:32:0x00d7  */
        /* JADX WARN: Code duplicated, block: B:33:0x00d9  */
        /* JADX WARN: Code duplicated, block: B:36:0x00ec A[Catch: all -> 0x005f, TRY_LEAVE, TryCatch #1 {all -> 0x005f, blocks: (B:34:0x00e3, B:36:0x00ec, B:16:0x0055), top: B:51:0x0055 }] */
        /* JADX WARN: Code duplicated, block: B:40:0x0110  */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instruction units count: 293
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.b0.k0.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(l0<? super V> l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((k0) create(l0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNot$1", f = "Deprecated.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.V1}, m = "invokeSuspend", n = {}, s = {})
    static final class l extends kotlin.coroutines.jvm.internal.o implements Function2<Object, kotlin.coroutines.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f313670a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f313671b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<Object, kotlin.coroutines.d<? super Boolean>, Object> f313672c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        l(Function2<Object, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> function2, kotlin.coroutines.d<? super l> dVar) {
            super(2, dVar);
            this.f313672c = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            l lVar = new l(this.f313672c, dVar);
            lVar.f313671b = obj;
            return lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f313670a;
            if (i10 == 0) {
                ResultKt.m(obj);
                Object obj2 = this.f313671b;
                Function2<Object, kotlin.coroutines.d<? super Boolean>, Object> function2 = this.f313672c;
                this.f313670a = 1;
                obj = function2.invoke(obj2, this);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return kotlin.coroutines.jvm.internal.b.a(!((Boolean) obj).booleanValue());
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, kotlin.coroutines.d<? super Boolean> dVar) {
            return ((l) create(obj, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNull$1", f = "Deprecated.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class m<E> extends kotlin.coroutines.jvm.internal.o implements Function2<E, kotlin.coroutines.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f313673a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f313674b;

        m(kotlin.coroutines.d<? super m> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            m mVar = new m(dVar);
            mVar.f313674b = obj;
            return mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f313673a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return kotlin.coroutines.jvm.internal.b.a(this.f313674b != null);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(E e10, kotlin.coroutines.d<? super Boolean> dVar) {
            return ((m) create(e10, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {514}, m = "filterNotNullTo", n = {"destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
    static final class n<E, C extends Collection<? super E>> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f313675a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f313676b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f313677c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f313678d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f313679e;

        n(kotlin.coroutines.d<? super n> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f313678d = obj;
            this.f313679e |= Integer.MIN_VALUE;
            return b0.C(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {514, com.badlogic.gdx.utils.compression.lzma.a.f95331z}, m = "filterNotNullTo", n = {"destination", "$this$consume$iv$iv", "destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class o<E, C extends o0<? super E>> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f313680a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f313681b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f313682c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f313683d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f313684e;

        o(kotlin.coroutines.d<? super o> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f313683d = obj;
            this.f313684e |= Integer.MIN_VALUE;
            return b0.D(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {com.planner5d.library.engine.input.f.b.f160706l1}, m = "first", n = {"$this$consume$iv", "iterator"}, s = {"L$0", "L$1"})
    static final class p<E> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f313685a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f313686b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f313687c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f313688d;

        p(kotlin.coroutines.d<? super p> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f313687c = obj;
            this.f313688d |= Integer.MIN_VALUE;
            return b0.E(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {105}, m = "firstOrNull", n = {"$this$consume$iv", "iterator"}, s = {"L$0", "L$1"})
    static final class q<E> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f313689a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f313690b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f313691c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f313692d;

        q(kotlin.coroutines.d<? super q> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f313691c = obj;
            this.f313692d |= Integer.MIN_VALUE;
            return b0.F(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1", f = "Deprecated.kt", i = {0, 1, 2}, l = {351, 352, 352}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "$this$produce"}, s = {"L$0", "L$0", "L$0"})
    static final class r extends kotlin.coroutines.jvm.internal.o implements Function2<l0<Object>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f313693a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f313694b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f313695c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ n0<Object> f313696d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function2<Object, kotlin.coroutines.d<? super n0<Object>>, Object> f313697e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        r(n0<Object> n0Var, Function2<Object, ? super kotlin.coroutines.d<? super n0<Object>>, ? extends Object> function2, kotlin.coroutines.d<? super r> dVar) {
            super(2, dVar);
            this.f313696d = n0Var;
            this.f313697e = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            r rVar = new r(this.f313696d, this.f313697e, dVar);
            rVar.f313695c = obj;
            return rVar;
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0052 A[PHI: r1 r5
          0x0052: PHI (r1v5 kotlinx.coroutines.channels.r<java.lang.Object>) = 
          (r1v2 kotlinx.coroutines.channels.r<java.lang.Object>)
          (r1v3 kotlinx.coroutines.channels.r<java.lang.Object>)
          (r1v11 kotlinx.coroutines.channels.r<java.lang.Object>)
         binds: [B:12:0x0042, B:22:0x008b, B:7:0x0013] A[DONT_GENERATE, DONT_INLINE]
          0x0052: PHI (r5v4 kotlinx.coroutines.channels.l0) = (r5v1 kotlinx.coroutines.channels.l0), (r5v2 kotlinx.coroutines.channels.l0), (r5v10 kotlinx.coroutines.channels.l0) binds: [B:12:0x0042, B:22:0x008b, B:7:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:16:0x0061 A[PHI: r1 r5 r9
          0x0061: PHI (r1v4 kotlinx.coroutines.channels.r<java.lang.Object>) = (r1v5 kotlinx.coroutines.channels.r<java.lang.Object>), (r1v7 kotlinx.coroutines.channels.r<java.lang.Object>) binds: [B:14:0x005e, B:11:0x0035] A[DONT_GENERATE, DONT_INLINE]
          0x0061: PHI (r5v3 kotlinx.coroutines.channels.l0) = (r5v4 kotlinx.coroutines.channels.l0), (r5v6 kotlinx.coroutines.channels.l0) binds: [B:14:0x005e, B:11:0x0035] A[DONT_GENERATE, DONT_INLINE]
          0x0061: PHI (r9v6 java.lang.Object) = (r9v11 java.lang.Object), (r9v0 java.lang.Object) binds: [B:14:0x005e, B:11:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:18:0x006a  */
        /* JADX WARN: Code duplicated, block: B:21:0x007f A[PHI: r1 r5 r9
          0x007f: PHI (r1v3 kotlinx.coroutines.channels.r<java.lang.Object>) = (r1v4 kotlinx.coroutines.channels.r<java.lang.Object>), (r1v9 kotlinx.coroutines.channels.r<java.lang.Object>) binds: [B:19:0x007c, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE]
          0x007f: PHI (r5v2 kotlinx.coroutines.channels.l0) = (r5v3 kotlinx.coroutines.channels.l0), (r5v8 kotlinx.coroutines.channels.l0) binds: [B:19:0x007c, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE]
          0x007f: PHI (r9v3 java.lang.Object) = (r9v10 java.lang.Object), (r9v0 java.lang.Object) binds: [B:19:0x007c, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x008b -> B:13:0x0052). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                r7 = 7
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r8.f313694b
                r7 = 4
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L42
                if (r1 == r4) goto L35
                if (r1 == r3) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r8.f313693a
                kotlinx.coroutines.channels.r r1 = (kotlinx.coroutines.channels.r) r1
                java.lang.Object r5 = r8.f313695c
                r7 = 7
                kotlinx.coroutines.channels.l0 r5 = (kotlinx.coroutines.channels.l0) r5
                kotlin.ResultKt.m(r9)
                goto L52
            L20:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L28:
                java.lang.Object r1 = r8.f313693a
                kotlinx.coroutines.channels.r r1 = (kotlinx.coroutines.channels.r) r1
                java.lang.Object r5 = r8.f313695c
                kotlinx.coroutines.channels.l0 r5 = (kotlinx.coroutines.channels.l0) r5
                kotlin.ResultKt.m(r9)
                r7 = 4
                goto L7f
            L35:
                java.lang.Object r1 = r8.f313693a
                kotlinx.coroutines.channels.r r1 = (kotlinx.coroutines.channels.r) r1
                r7 = 1
                java.lang.Object r5 = r8.f313695c
                kotlinx.coroutines.channels.l0 r5 = (kotlinx.coroutines.channels.l0) r5
                kotlin.ResultKt.m(r9)
                goto L61
            L42:
                r7 = 3
                kotlin.ResultKt.m(r9)
                java.lang.Object r9 = r8.f313695c
                kotlinx.coroutines.channels.l0 r9 = (kotlinx.coroutines.channels.l0) r9
                kotlinx.coroutines.channels.n0<java.lang.Object> r1 = r8.f313696d
                kotlinx.coroutines.channels.r r1 = r1.iterator()
                r5 = r9
                r5 = r9
            L52:
                r7 = 7
                r8.f313695c = r5
                r8.f313693a = r1
                r8.f313694b = r4
                java.lang.Object r9 = r1.c(r8)
                r7 = 4
                if (r9 != r0) goto L61
                goto L8d
            L61:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                r7 = 1
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto L8e
                java.lang.Object r9 = r1.next()
                kotlin.jvm.functions.Function2<java.lang.Object, kotlin.coroutines.d<? super kotlinx.coroutines.channels.n0<java.lang.Object>>, java.lang.Object> r6 = r8.f313697e
                r7 = 5
                r8.f313695c = r5
                r8.f313693a = r1
                r8.f313694b = r3
                java.lang.Object r9 = r6.invoke(r9, r8)
                r7 = 1
                if (r9 != r0) goto L7f
                goto L8d
            L7f:
                kotlinx.coroutines.channels.n0 r9 = (kotlinx.coroutines.channels.n0) r9
                r8.f313695c = r5
                r8.f313693a = r1
                r8.f313694b = r2
                java.lang.Object r9 = kotlinx.coroutines.channels.v.e0(r9, r5, r8)
                if (r9 != r0) goto L52
            L8d:
                return r0
            L8e:
                kotlin.Unit r8 = kotlin.Unit.f312394a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.b0.r.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(l0<Object> l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((r) create(l0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0}, l = {514}, m = "indexOf", n = {"element", FirebaseAnalytics.d.f120644b0, "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$2"})
    static final class s<E> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f313698a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f313699b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f313700c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f313701d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f313702e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f313703f;

        s(kotlin.coroutines.d<? super s> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f313702e = obj;
            this.f313703f |= Integer.MIN_VALUE;
            return b0.I(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1, 1}, l = {127, 130}, m = "last", n = {"$this$consume$iv", "iterator", "$this$consume$iv", "iterator", "last"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    static final class t<E> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f313704a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f313705b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f313706c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f313707d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f313708e;

        t(kotlin.coroutines.d<? super t> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f313707d = obj;
            this.f313708e |= Integer.MIN_VALUE;
            return b0.J(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0, 0}, l = {514}, m = "lastIndexOf", n = {"element", "lastIndex", FirebaseAnalytics.d.f120644b0, "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$2", "L$3"})
    static final class u<E> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f313709a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f313710b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f313711c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f313712d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f313713e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f313714f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f313715g;

        u(kotlin.coroutines.d<? super u> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f313714f = obj;
            this.f313715g |= Integer.MIN_VALUE;
            return b0.K(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1, 1}, l = {153, androidx.media2.widget.f.i.f59797r0}, m = "lastOrNull", n = {"$this$consume$iv", "iterator", "$this$consume$iv", "iterator", "last"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    static final class v<E> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f313716a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f313717b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f313718c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f313719d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f313720e;

        v(kotlin.coroutines.d<? super v> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f313719d = obj;
            this.f313720e |= Integer.MIN_VALUE;
            return b0.L(null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 2, 2}, l = {514, 363, 363}, m = "invokeSuspend", n = {"$this$produce", "$this$consume$iv$iv", "$this$produce", "$this$consume$iv$iv", "$this$produce", "$this$consume$iv$iv"}, s = {"L$0", "L$2", "L$0", "L$2", "L$0", "L$2"})
    @SourceDebugExtension({"SMAP\nDeprecated.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$map$1\n+ 2 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n1#1,509:1\n160#2:510\n94#2,3:511\n161#2,2:514\n101#2:516\n97#2,3:517\n*S KotlinDebug\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$map$1\n*L\n362#1:510\n362#1:511,3\n362#1:514,2\n362#1:516\n362#1:517,3\n*E\n"})
    static final class w<R> extends kotlin.coroutines.jvm.internal.o implements Function2<l0<? super R>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f313721a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f313722b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f313723c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f313724d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f313725e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f313726f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ n0<E> f313727g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function2<E, kotlin.coroutines.d<? super R>, Object> f313728h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        w(n0<? extends E> n0Var, Function2<? super E, ? super kotlin.coroutines.d<? super R>, ? extends Object> function2, kotlin.coroutines.d<? super w> dVar) {
            super(2, dVar);
            this.f313727g = n0Var;
            this.f313728h = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            w wVar = new w(this.f313727g, this.f313728h, dVar);
            wVar.f313726f = obj;
            return wVar;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x009b  */
        /* JADX WARN: Code duplicated, block: B:28:0x009c  */
        /* JADX WARN: Code duplicated, block: B:31:0x00a9 A[Catch: all -> 0x002e, TRY_LEAVE, TryCatch #2 {all -> 0x002e, blocks: (B:9:0x0029, B:25:0x008a, B:29:0x00a0, B:31:0x00a9, B:40:0x00e9, B:21:0x0073, B:24:0x0082), top: B:51:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:34:0x00c2  */
        /* JADX WARN: Code duplicated, block: B:39:0x00e2  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00e2 -> B:25:0x008a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 247
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.b0.w.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(l0<? super R> l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((w) create(l0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 2, 2}, l = {374, 375, 375}, m = "invokeSuspend", n = {"$this$produce", FirebaseAnalytics.d.f120644b0, "$this$produce", FirebaseAnalytics.d.f120644b0, "$this$produce", FirebaseAnalytics.d.f120644b0}, s = {"L$0", "I$0", "L$0", "I$0", "L$0", "I$0"})
    static final class x<R> extends kotlin.coroutines.jvm.internal.o implements Function2<l0<? super R>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f313729a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f313730b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f313731c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f313732d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f313733e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ n0<E> f313734f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ pj.n<Integer, E, kotlin.coroutines.d<? super R>, Object> f313735g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        x(n0<? extends E> n0Var, pj.n<? super Integer, ? super E, ? super kotlin.coroutines.d<? super R>, ? extends Object> nVar, kotlin.coroutines.d<? super x> dVar) {
            super(2, dVar);
            this.f313734f = n0Var;
            this.f313735g = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            x xVar = new x(this.f313734f, this.f313735g, dVar);
            xVar.f313733e = obj;
            return xVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00be -> B:15:0x0066). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to kotlinx.coroutines.channels.b0$x<R> for r11v3 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r10 = 5
                int r1 = r11.f313732d
                r2 = 3
                r3 = 2
                r10 = 7
                r4 = 1
                if (r1 == 0) goto L55
                r10 = 2
                if (r1 == r4) goto L46
                if (r1 == r3) goto L30
                r10 = 0
                if (r1 != r2) goto L26
                int r1 = r11.f313731c
                r10 = 6
                java.lang.Object r5 = r11.f313729a
                kotlinx.coroutines.channels.r r5 = (kotlinx.coroutines.channels.r) r5
                java.lang.Object r6 = r11.f313733e
                kotlinx.coroutines.channels.l0 r6 = (kotlinx.coroutines.channels.l0) r6
                kotlin.ResultKt.m(r12)
                r12 = r6
                r10 = 6
                goto L66
            L26:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "h/s/t/ei/roeelc nsei   u/ktwv orarfiuo e/tocboemln/"
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r12)
                throw r11
            L30:
                r10 = 6
                int r1 = r11.f313731c
                r10 = 1
                java.lang.Object r5 = r11.f313730b
                kotlinx.coroutines.channels.l0 r5 = (kotlinx.coroutines.channels.l0) r5
                java.lang.Object r6 = r11.f313729a
                kotlinx.coroutines.channels.r r6 = (kotlinx.coroutines.channels.r) r6
                r10 = 1
                java.lang.Object r7 = r11.f313733e
                kotlinx.coroutines.channels.l0 r7 = (kotlinx.coroutines.channels.l0) r7
                kotlin.ResultKt.m(r12)
                r10 = 6
                goto La9
            L46:
                int r1 = r11.f313731c
                java.lang.Object r5 = r11.f313729a
                r10 = 6
                kotlinx.coroutines.channels.r r5 = (kotlinx.coroutines.channels.r) r5
                java.lang.Object r6 = r11.f313733e
                kotlinx.coroutines.channels.l0 r6 = (kotlinx.coroutines.channels.l0) r6
                kotlin.ResultKt.m(r12)
                goto L7b
            L55:
                kotlin.ResultKt.m(r12)
                java.lang.Object r12 = r11.f313733e
                kotlinx.coroutines.channels.l0 r12 = (kotlinx.coroutines.channels.l0) r12
                kotlinx.coroutines.channels.n0<E> r1 = r11.f313734f
                kotlinx.coroutines.channels.r r1 = r1.iterator()
                r5 = 0
                r9 = r5
                r5 = r1
                r1 = r9
            L66:
                r11.f313733e = r12
                r11.f313729a = r5
                r11.f313731c = r1
                r11.f313732d = r4
                r10 = 1
                java.lang.Object r6 = r5.c(r11)
                if (r6 != r0) goto L76
                goto Lbd
            L76:
                r9 = r6
                r9 = r6
                r6 = r12
                r12 = r9
                r12 = r9
            L7b:
                r10 = 6
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
                r10 = 5
                if (r12 == 0) goto Lc2
                java.lang.Object r12 = r5.next()
                pj.n<java.lang.Integer, E, kotlin.coroutines.d<? super R>, java.lang.Object> r7 = r11.f313735g
                int r8 = r1 + 1
                java.lang.Integer r1 = kotlin.coroutines.jvm.internal.b.f(r1)
                r10 = 1
                r11.f313733e = r6
                r11.f313729a = r5
                r11.f313730b = r6
                r11.f313731c = r8
                r11.f313732d = r3
                java.lang.Object r12 = r7.invoke(r1, r12, r11)
                r10 = 5
                if (r12 != r0) goto La4
                goto Lbd
            La4:
                r7 = r6
                r1 = r8
                r1 = r8
                r6 = r5
                r5 = r7
            La9:
                r10 = 3
                r11.f313733e = r7
                r10 = 6
                r11.f313729a = r6
                r8 = 0
                r11.f313730b = r8
                r10 = 0
                r11.f313731c = r1
                r11.f313732d = r2
                java.lang.Object r12 = r5.G(r12, r11)
                if (r12 != r0) goto Lbe
            Lbd:
                return r0
            Lbe:
                r5 = r6
                r12 = r7
                r10 = 3
                goto L66
            Lc2:
                kotlin.Unit r11 = kotlin.Unit.f312394a
                r10 = 5
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.b0.x.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(l0<? super R> l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((x) create(l0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {450, 452}, m = "maxWith", n = {"comparator", "$this$consume$iv", "iterator", "comparator", "$this$consume$iv", "iterator", "max"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
    static final class y<E> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f313736a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f313737b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f313738c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f313739d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f313740e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f313741f;

        y(kotlin.coroutines.d<? super y> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f313740e = obj;
            this.f313741f |= Integer.MIN_VALUE;
            return b0.U(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {464, 466}, m = "minWith", n = {"comparator", "$this$consume$iv", "iterator", "comparator", "$this$consume$iv", "iterator", "min"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
    static final class z<E> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f313742a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f313743b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f313744c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f313745d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f313746e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f313747f;

        z(kotlin.coroutines.d<? super z> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f313746e = obj;
            this.f313747f |= Integer.MIN_VALUE;
            return b0.V(null, null, this);
        }
    }

    public static /* synthetic */ n0 A(n0 n0Var, CoroutineContext coroutineContext, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = l1.g();
        }
        return z(n0Var, coroutineContext, function2);
    }

    @a1
    @NotNull
    public static final <E> n0<E> B(@NotNull n0<? extends E> n0Var) {
        int i10 = 4 >> 1;
        n0<E> n0VarW = w(n0Var, null, new m(null), 1, null);
        Intrinsics.checkNotNull(n0VarW, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveChannel<E of kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.filterNotNull>");
        return n0VarW;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0062 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0063  */
    /* JADX WARN: Code duplicated, block: B:28:0x0070 A[Catch: all -> 0x0039, TryCatch #1 {all -> 0x0039, blocks: (B:13:0x0035, B:26:0x0067, B:28:0x0070, B:30:0x0076, B:22:0x0053, B:32:0x007c), top: B:44:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0076 A[Catch: all -> 0x0039, TryCatch #1 {all -> 0x0039, blocks: (B:13:0x0035, B:26:0x0067, B:28:0x0070, B:30:0x0076, B:22:0x0053, B:32:0x007c), top: B:44:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x007c A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #1 {all -> 0x0039, blocks: (B:13:0x0035, B:26:0x0067, B:28:0x0070, B:30:0x0076, B:22:0x0053, B:32:0x007c), top: B:44:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0063 -> B:26:0x0067). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object C(kotlinx.coroutines.channels.n0 r6, java.util.Collection r7, kotlin.coroutines.d r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.b0.n
            if (r0 == 0) goto L15
            r0 = r8
            kotlinx.coroutines.channels.b0$n r0 = (kotlinx.coroutines.channels.b0.n) r0
            int r1 = r0.f313679e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            r5 = 0
            if (r3 == 0) goto L15
            int r1 = r1 - r2
            r5 = 2
            r0.f313679e = r1
            goto L1a
        L15:
            kotlinx.coroutines.channels.b0$n r0 = new kotlinx.coroutines.channels.b0$n
            r0.<init>(r8)
        L1a:
            java.lang.Object r8 = r0.f313678d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            r5 = 1
            int r2 = r0.f313679e
            r3 = 1
            if (r2 == 0) goto L46
            r5 = 1
            if (r2 != r3) goto L3c
            java.lang.Object r6 = r0.f313677c
            kotlinx.coroutines.channels.r r6 = (kotlinx.coroutines.channels.r) r6
            java.lang.Object r7 = r0.f313676b
            kotlinx.coroutines.channels.n0 r7 = (kotlinx.coroutines.channels.n0) r7
            java.lang.Object r2 = r0.f313675a
            java.util.Collection r2 = (java.util.Collection) r2
            kotlin.ResultKt.m(r8)     // Catch: java.lang.Throwable -> L39
            goto L67
        L39:
            r6 = move-exception
            r5 = 0
            goto L8b
        L3c:
            r5 = 7
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r5 = 4
            r6.<init>(r7)
            throw r6
        L46:
            kotlin.ResultKt.m(r8)
            r5 = 1
            kotlinx.coroutines.channels.r r8 = r6.iterator()     // Catch: java.lang.Throwable -> L86
            r4 = r7
            r4 = r7
            r7 = r6
            r6 = r8
            r8 = r4
        L53:
            r5 = 2
            r0.f313675a = r8     // Catch: java.lang.Throwable -> L39
            r0.f313676b = r7     // Catch: java.lang.Throwable -> L39
            r0.f313677c = r6     // Catch: java.lang.Throwable -> L39
            r0.f313679e = r3     // Catch: java.lang.Throwable -> L39
            java.lang.Object r2 = r6.c(r0)     // Catch: java.lang.Throwable -> L39
            if (r2 != r1) goto L63
            return r1
        L63:
            r4 = r2
            r4 = r2
            r2 = r8
            r8 = r4
        L67:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L39
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L39
            r5 = 6
            if (r8 == 0) goto L7c
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L39
            if (r8 == 0) goto L7a
            r5 = 7
            r2.add(r8)     // Catch: java.lang.Throwable -> L39
        L7a:
            r8 = r2
            goto L53
        L7c:
            r5 = 0
            kotlin.Unit r6 = kotlin.Unit.f312394a     // Catch: java.lang.Throwable -> L39
            r6 = 0
            r5 = 4
            kotlinx.coroutines.channels.v.b(r7, r6)
            r5 = 1
            return r2
        L86:
            r7 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
            r6 = r4
        L8b:
            r5 = 4
            throw r6     // Catch: java.lang.Throwable -> L8d
        L8d:
            r8 = move-exception
            r5 = 4
            kotlinx.coroutines.channels.v.b(r7, r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.b0.C(kotlinx.coroutines.channels.n0, java.util.Collection, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0076  */
    /* JADX WARN: Code duplicated, block: B:28:0x0078  */
    /* JADX WARN: Code duplicated, block: B:31:0x0088 A[Catch: all -> 0x0041, TryCatch #1 {all -> 0x0041, blocks: (B:14:0x003c, B:29:0x007f, B:31:0x0088, B:33:0x008e, B:37:0x00a8, B:21:0x005a), top: B:49:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x008e A[Catch: all -> 0x0041, TryCatch #1 {all -> 0x0041, blocks: (B:14:0x003c, B:29:0x007f, B:31:0x0088, B:33:0x008e, B:37:0x00a8, B:21:0x005a), top: B:49:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a8 A[Catch: all -> 0x0041, TRY_LEAVE, TryCatch #1 {all -> 0x0041, blocks: (B:14:0x003c, B:29:0x007f, B:31:0x0088, B:33:0x008e, B:37:0x00a8, B:21:0x005a), top: B:49:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlinx.coroutines.channels.o0] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlinx.coroutines.channels.n0] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlinx.coroutines.channels.o0] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2, types: [kotlinx.coroutines.channels.n0] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, kotlinx.coroutines.channels.n0] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x008c -> B:36:0x00a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x009f -> B:36:0x00a2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object D(kotlinx.coroutines.channels.n0 r7, kotlinx.coroutines.channels.o0 r8, kotlin.coroutines.d r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.channels.b0.o
            if (r0 == 0) goto L15
            r0 = r9
            r0 = r9
            kotlinx.coroutines.channels.b0$o r0 = (kotlinx.coroutines.channels.b0.o) r0
            r6 = 4
            int r1 = r0.f313684e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L15
            int r1 = r1 - r2
            r0.f313684e = r1
            goto L1a
        L15:
            kotlinx.coroutines.channels.b0$o r0 = new kotlinx.coroutines.channels.b0$o
            r0.<init>(r9)
        L1a:
            java.lang.Object r9 = r0.f313683d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            r6 = 3
            int r2 = r0.f313684e
            r6 = 1
            r3 = 2
            r4 = 1
            r6 = 3
            if (r2 == 0) goto L5f
            r6 = 4
            if (r2 == r4) goto L4d
            if (r2 != r3) goto L44
            java.lang.Object r7 = r0.f313682c
            kotlinx.coroutines.channels.r r7 = (kotlinx.coroutines.channels.r) r7
            java.lang.Object r8 = r0.f313681b
            kotlinx.coroutines.channels.n0 r8 = (kotlinx.coroutines.channels.n0) r8
            r6 = 0
            java.lang.Object r2 = r0.f313680a
            r6 = 4
            kotlinx.coroutines.channels.o0 r2 = (kotlinx.coroutines.channels.o0) r2
            kotlin.ResultKt.m(r9)     // Catch: java.lang.Throwable -> L41
            r6 = 2
            goto La2
        L41:
            r7 = move-exception
            goto Lb4
        L44:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r6 = 5
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L4d:
            java.lang.Object r7 = r0.f313682c
            kotlinx.coroutines.channels.r r7 = (kotlinx.coroutines.channels.r) r7
            java.lang.Object r8 = r0.f313681b
            kotlinx.coroutines.channels.n0 r8 = (kotlinx.coroutines.channels.n0) r8
            java.lang.Object r2 = r0.f313680a
            r6 = 1
            kotlinx.coroutines.channels.o0 r2 = (kotlinx.coroutines.channels.o0) r2
            r6 = 3
            kotlin.ResultKt.m(r9)     // Catch: java.lang.Throwable -> L41
            goto L7f
        L5f:
            kotlin.ResultKt.m(r9)
            r6 = 1
            kotlinx.coroutines.channels.r r9 = r7.iterator()     // Catch: java.lang.Throwable -> Lb0
        L67:
            r6 = 1
            r0.f313680a = r8     // Catch: java.lang.Throwable -> Lb0
            r0.f313681b = r7     // Catch: java.lang.Throwable -> Lb0
            r0.f313682c = r9     // Catch: java.lang.Throwable -> Lb0
            r0.f313684e = r4     // Catch: java.lang.Throwable -> Lb0
            java.lang.Object r2 = r9.c(r0)     // Catch: java.lang.Throwable -> Lb0
            if (r2 != r1) goto L78
            r6 = 4
            goto La1
        L78:
            r5 = r8
            r5 = r8
            r8 = r7
            r7 = r9
            r9 = r2
            r2 = r5
            r2 = r5
        L7f:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L41
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L41
            r6 = 6
            if (r9 == 0) goto La8
            java.lang.Object r9 = r7.next()     // Catch: java.lang.Throwable -> L41
            if (r9 == 0) goto La2
            r0.f313680a = r2     // Catch: java.lang.Throwable -> L41
            r6 = 5
            r0.f313681b = r8     // Catch: java.lang.Throwable -> L41
            r6 = 6
            r0.f313682c = r7     // Catch: java.lang.Throwable -> L41
            r6 = 0
            r0.f313684e = r3     // Catch: java.lang.Throwable -> L41
            r6 = 3
            java.lang.Object r9 = r2.G(r9, r0)     // Catch: java.lang.Throwable -> L41
            r6 = 2
            if (r9 != r1) goto La2
        La1:
            return r1
        La2:
            r9 = r7
            r7 = r8
            r8 = r2
            r8 = r2
            r6 = 7
            goto L67
        La8:
            kotlin.Unit r7 = kotlin.Unit.f312394a     // Catch: java.lang.Throwable -> L41
            r6 = 2
            r7 = 0
            kotlinx.coroutines.channels.v.b(r8, r7)
            return r2
        Lb0:
            r8 = move-exception
            r5 = r8
            r8 = r7
            r7 = r5
        Lb4:
            r6 = 4
            throw r7     // Catch: java.lang.Throwable -> Lb6
        Lb6:
            r9 = move-exception
            kotlinx.coroutines.channels.v.b(r8, r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.b0.D(kotlinx.coroutines.channels.n0, kotlinx.coroutines.channels.o0, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006d A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #1 {all -> 0x003b, blocks: (B:12:0x0036, B:25:0x0063, B:27:0x006d, B:30:0x0076, B:31:0x007d), top: B:41:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0076 A[Catch: all -> 0x003b, TRY_ENTER, TryCatch #1 {all -> 0x003b, blocks: (B:12:0x0036, B:25:0x0063, B:27:0x006d, B:30:0x0076, B:31:0x007d), top: B:41:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object E(n0 n0Var, kotlin.coroutines.d dVar) {
        p pVar;
        n0 n0Var2;
        Throwable th2;
        kotlinx.coroutines.channels.r rVar;
        if (dVar instanceof p) {
            pVar = (p) dVar;
            int i10 = pVar.f313688d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                pVar.f313688d = i10 - Integer.MIN_VALUE;
            } else {
                pVar = new p(dVar);
            }
        } else {
            pVar = new p(dVar);
        }
        Object obj = pVar.f313687c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = pVar.f313688d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rVar = (kotlinx.coroutines.channels.r) pVar.f313686b;
            n0Var2 = (n0) pVar.f313685a;
            try {
                ResultKt.m(obj);
                if (((Boolean) obj).booleanValue()) {
                    throw new NoSuchElementException("ReceiveChannel is empty.");
                }
                Object next = rVar.next();
                kotlinx.coroutines.channels.v.b(n0Var2, null);
                return next;
            } catch (Throwable th3) {
                th2 = th3;
                try {
                    throw th2;
                } catch (Throwable th4) {
                    kotlinx.coroutines.channels.v.b(n0Var2, th2);
                    throw th4;
                }
            }
        }
        ResultKt.m(obj);
        try {
            kotlinx.coroutines.channels.r it = n0Var.iterator();
            pVar.f313685a = n0Var;
            pVar.f313686b = it;
            pVar.f313688d = 1;
            Object objC = it.c(pVar);
            if (objC == objL) {
                return objL;
            }
            n0Var2 = n0Var;
            rVar = it;
            obj = objC;
            if (((Boolean) obj).booleanValue()) {
                throw new NoSuchElementException("ReceiveChannel is empty.");
            }
            Object next2 = rVar.next();
            kotlinx.coroutines.channels.v.b(n0Var2, null);
            return next2;
        } catch (Throwable th5) {
            n0Var2 = n0Var;
            th2 = th5;
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object F(n0 n0Var, kotlin.coroutines.d dVar) {
        q qVar;
        n0 n0Var2;
        Throwable th2;
        kotlinx.coroutines.channels.r rVar;
        if (dVar instanceof q) {
            qVar = (q) dVar;
            int i10 = qVar.f313692d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                qVar.f313692d = i10 - Integer.MIN_VALUE;
            } else {
                qVar = new q(dVar);
            }
        } else {
            qVar = new q(dVar);
        }
        Object obj = qVar.f313691c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = qVar.f313692d;
        if (i11 == 0) {
            ResultKt.m(obj);
            try {
                kotlinx.coroutines.channels.r it = n0Var.iterator();
                qVar.f313689a = n0Var;
                qVar.f313690b = it;
                qVar.f313692d = 1;
                Object objC = it.c(qVar);
                if (objC == objL) {
                    return objL;
                }
                n0Var2 = n0Var;
                rVar = it;
                obj = objC;
            } catch (Throwable th3) {
                n0Var2 = n0Var;
                th2 = th3;
                throw th2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rVar = (kotlinx.coroutines.channels.r) qVar.f313690b;
            n0Var2 = (n0) qVar.f313689a;
            try {
                ResultKt.m(obj);
            } catch (Throwable th4) {
                th2 = th4;
                try {
                    throw th2;
                } catch (Throwable th5) {
                    kotlinx.coroutines.channels.v.b(n0Var2, th2);
                    throw th5;
                }
            }
        }
        if (!((Boolean) obj).booleanValue()) {
            kotlinx.coroutines.channels.v.b(n0Var2, null);
            return null;
        }
        Object next = rVar.next();
        kotlinx.coroutines.channels.v.b(n0Var2, null);
        return next;
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ n0 G(n0 n0Var, CoroutineContext coroutineContext, Function2 function2) {
        return kotlinx.coroutines.channels.j0.i(f2.f314023a, coroutineContext, 0, null, kotlinx.coroutines.channels.v.g(n0Var), new r(n0Var, function2, null), 6, null);
    }

    public static /* synthetic */ n0 H(n0 n0Var, CoroutineContext coroutineContext, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = l1.g();
        }
        return G(n0Var, coroutineContext, function2);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0073 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0074  */
    /* JADX WARN: Code duplicated, block: B:28:0x0081 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:13:0x003c, B:26:0x0077, B:28:0x0081, B:30:0x008b, B:33:0x0095, B:22:0x0060, B:34:0x009e), top: B:44:0x003c }] */
    /* JADX WARN: Code duplicated, block: B:30:0x008b A[Catch: all -> 0x0041, TRY_LEAVE, TryCatch #0 {all -> 0x0041, blocks: (B:13:0x003c, B:26:0x0077, B:28:0x0081, B:30:0x008b, B:33:0x0095, B:22:0x0060, B:34:0x009e), top: B:44:0x003c }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0095 A[Catch: all -> 0x0041, TRY_ENTER, TryCatch #0 {all -> 0x0041, blocks: (B:13:0x003c, B:26:0x0077, B:28:0x0081, B:30:0x008b, B:33:0x0095, B:22:0x0060, B:34:0x009e), top: B:44:0x003c }] */
    /* JADX WARN: Code duplicated, block: B:34:0x009e A[Catch: all -> 0x0041, TRY_LEAVE, TryCatch #0 {all -> 0x0041, blocks: (B:13:0x003c, B:26:0x0077, B:28:0x0081, B:30:0x008b, B:33:0x0095, B:22:0x0060, B:34:0x009e), top: B:44:0x003c }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0074 -> B:26:0x0077). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object I(kotlinx.coroutines.channels.n0 r8, java.lang.Object r9, kotlin.coroutines.d r10) {
        /*
            r7 = 7
            boolean r0 = r10 instanceof kotlinx.coroutines.channels.b0.s
            if (r0 == 0) goto L18
            r0 = r10
            r7 = 6
            kotlinx.coroutines.channels.b0$s r0 = (kotlinx.coroutines.channels.b0.s) r0
            int r1 = r0.f313703f
            r7 = 3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 2
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.f313703f = r1
            r7 = 7
            goto L1d
        L18:
            kotlinx.coroutines.channels.b0$s r0 = new kotlinx.coroutines.channels.b0$s
            r0.<init>(r10)
        L1d:
            java.lang.Object r10 = r0.f313702e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            r7 = 4
            int r2 = r0.f313703f
            r7 = 3
            r3 = 1
            if (r2 == 0) goto L4d
            r7 = 3
            if (r2 != r3) goto L44
            java.lang.Object r8 = r0.f313701d
            kotlinx.coroutines.channels.r r8 = (kotlinx.coroutines.channels.r) r8
            r7 = 6
            java.lang.Object r9 = r0.f313700c
            kotlinx.coroutines.channels.n0 r9 = (kotlinx.coroutines.channels.n0) r9
            java.lang.Object r2 = r0.f313699b
            kotlin.jvm.internal.i1$f r2 = (kotlin.jvm.internal.i1.f) r2
            java.lang.Object r4 = r0.f313698a
            r7 = 3
            kotlin.ResultKt.m(r10)     // Catch: java.lang.Throwable -> L41
            goto L77
        L41:
            r8 = move-exception
            goto Lb0
        L44:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r7 = 5
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L4d:
            kotlin.ResultKt.m(r10)
            kotlin.jvm.internal.i1$f r10 = new kotlin.jvm.internal.i1$f
            r10.<init>()
            r7 = 4
            kotlinx.coroutines.channels.r r2 = r8.iterator()     // Catch: java.lang.Throwable -> Lab
            r6 = r9
            r9 = r8
            r8 = r2
            r8 = r2
            r2 = r10
            r10 = r6
        L60:
            r7 = 6
            r0.f313698a = r10     // Catch: java.lang.Throwable -> L41
            r0.f313699b = r2     // Catch: java.lang.Throwable -> L41
            r7 = 5
            r0.f313700c = r9     // Catch: java.lang.Throwable -> L41
            r0.f313701d = r8     // Catch: java.lang.Throwable -> L41
            r7 = 6
            r0.f313703f = r3     // Catch: java.lang.Throwable -> L41
            java.lang.Object r4 = r8.c(r0)     // Catch: java.lang.Throwable -> L41
            if (r4 != r1) goto L74
            return r1
        L74:
            r6 = r4
            r4 = r10
            r10 = r6
        L77:
            r7 = 5
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L41
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L41
            r5 = 0
            if (r10 == 0) goto L9e
            java.lang.Object r10 = r8.next()     // Catch: java.lang.Throwable -> L41
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r10)     // Catch: java.lang.Throwable -> L41
            if (r10 == 0) goto L95
            int r8 = r2.f312749a     // Catch: java.lang.Throwable -> L41
            java.lang.Integer r8 = kotlin.coroutines.jvm.internal.b.f(r8)     // Catch: java.lang.Throwable -> L41
            kotlinx.coroutines.channels.v.b(r9, r5)
            return r8
        L95:
            int r10 = r2.f312749a     // Catch: java.lang.Throwable -> L41
            r7 = 5
            int r10 = r10 + r3
            r7 = 5
            r2.f312749a = r10     // Catch: java.lang.Throwable -> L41
            r10 = r4
            goto L60
        L9e:
            r7 = 5
            kotlin.Unit r8 = kotlin.Unit.f312394a     // Catch: java.lang.Throwable -> L41
            kotlinx.coroutines.channels.v.b(r9, r5)
            r8 = -1
            r7 = 4
            java.lang.Integer r8 = kotlin.coroutines.jvm.internal.b.f(r8)
            return r8
        Lab:
            r9 = move-exception
            r6 = r9
            r6 = r9
            r9 = r8
            r8 = r6
        Lb0:
            r7 = 7
            throw r8     // Catch: java.lang.Throwable -> Lb2
        Lb2:
            r10 = move-exception
            kotlinx.coroutines.channels.v.b(r9, r8)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.b0.I(kotlinx.coroutines.channels.n0, java.lang.Object, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b3 A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #3 {all -> 0x0043, blocks: (B:15:0x003e, B:41:0x00aa, B:43:0x00b3), top: B:60:0x003e }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00a6 -> B:41:0x00aa). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object J(kotlinx.coroutines.channels.n0 r7, kotlin.coroutines.d r8) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.b0.J(kotlinx.coroutines.channels.n0, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0084 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0085  */
    /* JADX WARN: Code duplicated, block: B:27:0x0096 A[Catch: all -> 0x0044, TryCatch #1 {all -> 0x0044, blocks: (B:12:0x003f, B:25:0x008b, B:27:0x0096, B:29:0x00a3, B:30:0x00a8, B:21:0x006f, B:31:0x00b0), top: B:43:0x003f }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00a3 A[Catch: all -> 0x0044, TryCatch #1 {all -> 0x0044, blocks: (B:12:0x003f, B:25:0x008b, B:27:0x0096, B:29:0x00a3, B:30:0x00a8, B:21:0x006f, B:31:0x00b0), top: B:43:0x003f }] */
    /* JADX WARN: Code duplicated, block: B:31:0x00b0 A[Catch: all -> 0x0044, TRY_LEAVE, TryCatch #1 {all -> 0x0044, blocks: (B:12:0x003f, B:25:0x008b, B:27:0x0096, B:29:0x00a3, B:30:0x00a8, B:21:0x006f, B:31:0x00b0), top: B:43:0x003f }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0085 -> B:25:0x008b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object K(kotlinx.coroutines.channels.n0 r8, java.lang.Object r9, kotlin.coroutines.d r10) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.b0.K(kotlinx.coroutines.channels.n0, java.lang.Object, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:41:0x009b  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a9 A[Catch: all -> 0x003f, TRY_LEAVE, TryCatch #3 {all -> 0x003f, blocks: (B:14:0x003a, B:42:0x00a0, B:44:0x00a9), top: B:60:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x009b -> B:42:0x00a0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object L(kotlinx.coroutines.channels.n0 r8, kotlin.coroutines.d r9) {
        /*
            r7 = 3
            boolean r0 = r9 instanceof kotlinx.coroutines.channels.b0.v
            if (r0 == 0) goto L17
            r0 = r9
            r0 = r9
            r7 = 0
            kotlinx.coroutines.channels.b0$v r0 = (kotlinx.coroutines.channels.b0.v) r0
            int r1 = r0.f313720e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r7 = 7
            r0.f313720e = r1
            goto L1c
        L17:
            kotlinx.coroutines.channels.b0$v r0 = new kotlinx.coroutines.channels.b0$v
            r0.<init>(r9)
        L1c:
            java.lang.Object r9 = r0.f313719d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f313720e
            r3 = 2
            r7 = r3
            r4 = 1
            r5 = 0
            r7 = 6
            if (r2 == 0) goto L5d
            if (r2 == r4) goto L4c
            r7 = 5
            if (r2 != r3) goto L44
            java.lang.Object r8 = r0.f313718c
            java.lang.Object r2 = r0.f313717b
            kotlinx.coroutines.channels.r r2 = (kotlinx.coroutines.channels.r) r2
            java.lang.Object r4 = r0.f313716a
            kotlinx.coroutines.channels.n0 r4 = (kotlinx.coroutines.channels.n0) r4
            kotlin.ResultKt.m(r9)     // Catch: java.lang.Throwable -> L3f
            r7 = 6
            goto La0
        L3f:
            r8 = move-exception
            r2 = r4
            r7 = 0
            goto Lb7
        L44:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L4c:
            r7 = 6
            java.lang.Object r8 = r0.f313717b
            kotlinx.coroutines.channels.r r8 = (kotlinx.coroutines.channels.r) r8
            r7 = 4
            java.lang.Object r2 = r0.f313716a
            kotlinx.coroutines.channels.n0 r2 = (kotlinx.coroutines.channels.n0) r2
            kotlin.ResultKt.m(r9)     // Catch: java.lang.Throwable -> L5b
            r7 = 6
            goto L75
        L5b:
            r8 = move-exception
            goto Lb7
        L5d:
            kotlin.ResultKt.m(r9)
            kotlinx.coroutines.channels.r r9 = r8.iterator()     // Catch: java.lang.Throwable -> Lb4
            r0.f313716a = r8     // Catch: java.lang.Throwable -> Lb4
            r0.f313717b = r9     // Catch: java.lang.Throwable -> Lb4
            r0.f313720e = r4     // Catch: java.lang.Throwable -> Lb4
            java.lang.Object r2 = r9.c(r0)     // Catch: java.lang.Throwable -> Lb4
            if (r2 != r1) goto L71
            goto L9a
        L71:
            r6 = r2
            r2 = r8
            r8 = r9
            r9 = r6
        L75:
            r7 = 5
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L5b
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L5b
            r7 = 5
            if (r9 != 0) goto L83
            kotlinx.coroutines.channels.v.b(r2, r5)
            return r5
        L83:
            java.lang.Object r9 = r8.next()     // Catch: java.lang.Throwable -> L5b
            r6 = r2
            r2 = r8
            r8 = r6
        L8a:
            r7 = 6
            r0.f313716a = r8     // Catch: java.lang.Throwable -> Lb4
            r0.f313717b = r2     // Catch: java.lang.Throwable -> Lb4
            r0.f313718c = r9     // Catch: java.lang.Throwable -> Lb4
            r0.f313720e = r3     // Catch: java.lang.Throwable -> Lb4
            java.lang.Object r4 = r2.c(r0)     // Catch: java.lang.Throwable -> Lb4
            r7 = 0
            if (r4 != r1) goto L9b
        L9a:
            return r1
        L9b:
            r6 = r4
            r6 = r4
            r4 = r8
            r8 = r9
            r9 = r6
        La0:
            r7 = 4
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L3f
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L3f
            if (r9 == 0) goto Laf
            java.lang.Object r9 = r2.next()     // Catch: java.lang.Throwable -> L3f
            r8 = r4
            goto L8a
        Laf:
            r7 = 4
            kotlinx.coroutines.channels.v.b(r4, r5)
            return r8
        Lb4:
            r9 = move-exception
            r2 = r8
            r8 = r9
        Lb7:
            throw r8     // Catch: java.lang.Throwable -> Lb8
        Lb8:
            r9 = move-exception
            r7 = 5
            kotlinx.coroutines.channels.v.b(r2, r8)
            r7 = 2
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.b0.L(kotlinx.coroutines.channels.n0, kotlin.coroutines.d):java.lang.Object");
    }

    @a1
    @NotNull
    public static final <E, R> n0<R> M(@NotNull n0<? extends E> n0Var, @NotNull CoroutineContext coroutineContext, @NotNull Function2<? super E, ? super kotlin.coroutines.d<? super R>, ? extends Object> function2) {
        boolean z10 = false | false;
        return kotlinx.coroutines.channels.j0.i(f2.f314023a, coroutineContext, 0, null, kotlinx.coroutines.channels.v.g(n0Var), new w(n0Var, function2, null), 6, null);
    }

    public static /* synthetic */ n0 N(n0 n0Var, CoroutineContext coroutineContext, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = l1.g();
        }
        return kotlinx.coroutines.channels.v.J(n0Var, coroutineContext, function2);
    }

    @a1
    @NotNull
    public static final <E, R> n0<R> O(@NotNull n0<? extends E> n0Var, @NotNull CoroutineContext coroutineContext, @NotNull pj.n<? super Integer, ? super E, ? super kotlin.coroutines.d<? super R>, ? extends Object> nVar) {
        return kotlinx.coroutines.channels.j0.i(f2.f314023a, coroutineContext, 0, null, kotlinx.coroutines.channels.v.g(n0Var), new x(n0Var, nVar, null), 6, null);
    }

    public static /* synthetic */ n0 P(n0 n0Var, CoroutineContext coroutineContext, pj.n nVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = l1.g();
        }
        return kotlinx.coroutines.channels.v.L(n0Var, coroutineContext, nVar);
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ n0 Q(n0 n0Var, CoroutineContext coroutineContext, pj.n nVar) {
        return kotlinx.coroutines.channels.v.y(kotlinx.coroutines.channels.v.L(n0Var, coroutineContext, nVar));
    }

    public static /* synthetic */ n0 R(n0 n0Var, CoroutineContext coroutineContext, pj.n nVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = l1.g();
        }
        return Q(n0Var, coroutineContext, nVar);
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ n0 S(n0 n0Var, CoroutineContext coroutineContext, Function2 function2) {
        return kotlinx.coroutines.channels.v.y(kotlinx.coroutines.channels.v.J(n0Var, coroutineContext, function2));
    }

    public static /* synthetic */ n0 T(n0 n0Var, CoroutineContext coroutineContext, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = l1.g();
        }
        return S(n0Var, coroutineContext, function2);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ca A[Catch: all -> 0x00db, TRY_LEAVE, TryCatch #1 {all -> 0x00db, blocks: (B:43:0x00c2, B:45:0x00ca, B:39:0x00a9, B:27:0x0074), top: B:60:0x0074 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00bc -> B:16:0x0047). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object U(kotlinx.coroutines.channels.n0 r9, java.util.Comparator r10, kotlin.coroutines.d r11) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.b0.U(kotlinx.coroutines.channels.n0, java.util.Comparator, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c9 A[Catch: all -> 0x00db, TRY_LEAVE, TryCatch #1 {all -> 0x00db, blocks: (B:40:0x00c0, B:42:0x00c9, B:36:0x00a8, B:26:0x0074), top: B:56:0x0074 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00bb -> B:15:0x004b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object V(kotlinx.coroutines.channels.n0 r9, java.util.Comparator r10, kotlin.coroutines.d r11) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.b0.V(kotlinx.coroutines.channels.n0, java.util.Comparator, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object W(n0 n0Var, kotlin.coroutines.d dVar) {
        a0 a0Var;
        if (dVar instanceof a0) {
            a0Var = (a0) dVar;
            int i10 = a0Var.f313560c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                a0Var.f313560c = i10 - Integer.MIN_VALUE;
            } else {
                a0Var = new a0(dVar);
            }
        } else {
            a0Var = new a0(dVar);
        }
        Object objC = a0Var.f313559b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = a0Var.f313560c;
        try {
            if (i11 == 0) {
                ResultKt.m(objC);
                kotlinx.coroutines.channels.r it = n0Var.iterator();
                a0Var.f313558a = n0Var;
                a0Var.f313560c = 1;
                objC = it.c(a0Var);
                if (objC == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                n0Var = (n0) a0Var.f313558a;
                ResultKt.m(objC);
            }
            Boolean boolA = kotlin.coroutines.jvm.internal.b.a(!((Boolean) objC).booleanValue());
            kotlinx.coroutines.channels.v.b(n0Var, null);
            return boolA;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlinx.coroutines.channels.v.b(n0Var, th2);
                throw th3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007d A[Catch: all -> 0x0057, TRY_LEAVE, TryCatch #1 {all -> 0x0057, blocks: (B:21:0x0053, B:30:0x0074, B:32:0x007d, B:43:0x00aa, B:44:0x00b2), top: B:54:0x0053 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x008e  */
    /* JADX WARN: Code duplicated, block: B:39:0x009d  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a2 A[Catch: all -> 0x003c, TRY_ENTER, TryCatch #3 {all -> 0x003c, blocks: (B:14:0x0037, B:36:0x0093, B:41:0x00a2, B:42:0x00a9), top: B:57:0x0037 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00aa A[Catch: all -> 0x0057, TRY_ENTER, TryCatch #1 {all -> 0x0057, blocks: (B:21:0x0053, B:30:0x0074, B:32:0x007d, B:43:0x00aa, B:44:0x00b2), top: B:54:0x0053 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object Y(n0 n0Var, kotlin.coroutines.d dVar) {
        c0 c0Var;
        n0 n0Var2;
        Throwable th2;
        kotlinx.coroutines.channels.r rVar;
        Object next;
        Object objC;
        Object obj;
        n0 n0Var3;
        if (dVar instanceof c0) {
            c0Var = (c0) dVar;
            int i10 = c0Var.f313577d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0Var.f313577d = i10 - Integer.MIN_VALUE;
            } else {
                c0Var = new c0(dVar);
            }
        } else {
            c0Var = new c0(dVar);
        }
        Object obj2 = c0Var.f313576c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = c0Var.f313577d;
        if (i11 == 0) {
            ResultKt.m(obj2);
            try {
                kotlinx.coroutines.channels.r it = n0Var.iterator();
                c0Var.f313574a = n0Var;
                c0Var.f313575b = it;
                c0Var.f313577d = 1;
                Object objC2 = it.c(c0Var);
                if (objC2 != objL) {
                    n0Var2 = n0Var;
                    rVar = it;
                    obj2 = objC2;
                    if (((Boolean) obj2).booleanValue()) {
                        throw new NoSuchElementException("ReceiveChannel is empty.");
                    }
                    next = rVar.next();
                    c0Var.f313574a = n0Var2;
                    c0Var.f313575b = next;
                    c0Var.f313577d = 2;
                    objC = rVar.c(c0Var);
                    if (objC != objL) {
                        obj2 = objC;
                        obj = next;
                        n0Var3 = n0Var2;
                        if (((Boolean) obj2).booleanValue()) {
                            throw new IllegalArgumentException("ReceiveChannel has more than one element.");
                        }
                        kotlinx.coroutines.channels.v.b(n0Var3, null);
                        return obj;
                    }
                }
                return objL;
            } catch (Throwable th3) {
                n0Var2 = n0Var;
                th2 = th3;
                throw th2;
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = c0Var.f313575b;
            n0Var3 = (n0) c0Var.f313574a;
            try {
                ResultKt.m(obj2);
                if (((Boolean) obj2).booleanValue()) {
                    throw new IllegalArgumentException("ReceiveChannel has more than one element.");
                }
                kotlinx.coroutines.channels.v.b(n0Var3, null);
                return obj;
            } catch (Throwable th4) {
                th2 = th4;
                n0Var2 = n0Var3;
                try {
                    throw th2;
                } catch (Throwable th5) {
                    kotlinx.coroutines.channels.v.b(n0Var2, th2);
                    throw th5;
                }
            }
        }
        rVar = (kotlinx.coroutines.channels.r) c0Var.f313575b;
        n0Var2 = (n0) c0Var.f313574a;
        try {
            ResultKt.m(obj2);
            if (((Boolean) obj2).booleanValue()) {
                throw new NoSuchElementException("ReceiveChannel is empty.");
            }
            next = rVar.next();
            c0Var.f313574a = n0Var2;
            c0Var.f313575b = next;
            c0Var.f313577d = 2;
            objC = rVar.c(c0Var);
            if (objC != objL) {
                obj2 = objC;
                obj = next;
                n0Var3 = n0Var2;
                if (((Boolean) obj2).booleanValue()) {
                    throw new IllegalArgumentException("ReceiveChannel has more than one element.");
                }
                kotlinx.coroutines.channels.v.b(n0Var3, null);
                return obj;
            }
            return objL;
        } catch (Throwable th6) {
            th2 = th6;
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object Z(n0 n0Var, kotlin.coroutines.d dVar) {
        d0 d0Var;
        n0 n0Var2;
        Throwable th2;
        kotlinx.coroutines.channels.r rVar;
        Object obj;
        n0 n0Var3;
        if (dVar instanceof d0) {
            d0Var = (d0) dVar;
            int i10 = d0Var.f313583d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                d0Var.f313583d = i10 - Integer.MIN_VALUE;
            } else {
                d0Var = new d0(dVar);
            }
        } else {
            d0Var = new d0(dVar);
        }
        Object obj2 = d0Var.f313582c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = d0Var.f313583d;
        if (i11 == 0) {
            ResultKt.m(obj2);
            try {
                kotlinx.coroutines.channels.r it = n0Var.iterator();
                d0Var.f313580a = n0Var;
                d0Var.f313581b = it;
                d0Var.f313583d = 1;
                Object objC = it.c(d0Var);
                if (objC != objL) {
                    n0Var2 = n0Var;
                    rVar = it;
                    obj2 = objC;
                }
                return objL;
            } catch (Throwable th3) {
                n0Var2 = n0Var;
                th2 = th3;
                throw th2;
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = d0Var.f313581b;
            n0Var3 = (n0) d0Var.f313580a;
            try {
                ResultKt.m(obj2);
                if (((Boolean) obj2).booleanValue()) {
                    kotlinx.coroutines.channels.v.b(n0Var3, null);
                    return null;
                }
                kotlinx.coroutines.channels.v.b(n0Var3, null);
                return obj;
            } catch (Throwable th4) {
                th2 = th4;
                n0Var2 = n0Var3;
                try {
                    throw th2;
                } catch (Throwable th5) {
                    kotlinx.coroutines.channels.v.b(n0Var2, th2);
                    throw th5;
                }
            }
        }
        rVar = (kotlinx.coroutines.channels.r) d0Var.f313581b;
        n0Var2 = (n0) d0Var.f313580a;
        try {
            ResultKt.m(obj2);
        } catch (Throwable th6) {
            th2 = th6;
            throw th2;
        }
        if (!((Boolean) obj2).booleanValue()) {
            kotlinx.coroutines.channels.v.b(n0Var2, null);
            return null;
        }
        Object next = rVar.next();
        d0Var.f313580a = n0Var2;
        d0Var.f313581b = next;
        d0Var.f313583d = 2;
        Object objC2 = rVar.c(d0Var);
        if (objC2 != objL) {
            obj2 = objC2;
            obj = next;
            n0Var3 = n0Var2;
            if (((Boolean) obj2).booleanValue()) {
                kotlinx.coroutines.channels.v.b(n0Var3, null);
                return null;
            }
            kotlinx.coroutines.channels.v.b(n0Var3, null);
            return obj;
        }
        return objL;
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ n0 a0(n0 n0Var, int i10, CoroutineContext coroutineContext) {
        return kotlinx.coroutines.channels.j0.i(f2.f314023a, coroutineContext, 0, null, kotlinx.coroutines.channels.v.g(n0Var), new e0(i10, n0Var, null), 6, null);
    }

    public static /* synthetic */ n0 b0(n0 n0Var, int i10, CoroutineContext coroutineContext, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            coroutineContext = l1.g();
        }
        return a0(n0Var, i10, coroutineContext);
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ n0 c0(n0 n0Var, CoroutineContext coroutineContext, Function2 function2) {
        return kotlinx.coroutines.channels.j0.i(f2.f314023a, coroutineContext, 0, null, kotlinx.coroutines.channels.v.g(n0Var), new f0(n0Var, function2, null), 6, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object d(n0 n0Var, kotlin.coroutines.d dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f313557c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f313557c = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objC = aVar.f313556b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f313557c;
        try {
            if (i11 == 0) {
                ResultKt.m(objC);
                kotlinx.coroutines.channels.r it = n0Var.iterator();
                aVar.f313555a = n0Var;
                aVar.f313557c = 1;
                objC = it.c(aVar);
                if (objC == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                n0Var = (n0) aVar.f313555a;
                ResultKt.m(objC);
            }
            kotlinx.coroutines.channels.v.b(n0Var, null);
            return objC;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlinx.coroutines.channels.v.b(n0Var, th2);
                throw th3;
            }
        }
    }

    public static /* synthetic */ n0 d0(n0 n0Var, CoroutineContext coroutineContext, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = l1.g();
        }
        return c0(n0Var, coroutineContext, function2);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    @f3
    public static final <E, R> R e(@NotNull kotlinx.coroutines.channels.d<E> dVar, @NotNull Function1<? super n0<? extends E>, ? extends R> function1) {
        n0<E> n0VarK = dVar.k();
        try {
            R rInvoke = function1.invoke(n0VarK);
            kotlin.jvm.internal.h0.d(1);
            return rInvoke;
        } finally {
            kotlin.jvm.internal.h0.d(1);
            n0.a.b(n0VarK, null, 1, null);
            kotlin.jvm.internal.h0.c(1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007c  */
    /* JADX WARN: Code duplicated, block: B:33:0x008b A[Catch: all -> 0x0047, TryCatch #2 {all -> 0x0047, blocks: (B:15:0x003e, B:31:0x0081, B:33:0x008b, B:37:0x00a5, B:22:0x005f), top: B:51:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a5 A[Catch: all -> 0x0047, TRY_LEAVE, TryCatch #2 {all -> 0x0047, blocks: (B:15:0x003e, B:31:0x0081, B:33:0x008b, B:37:0x00a5, B:22:0x005f), top: B:51:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a1, code lost:
    
        if (r2.G(r9, r0) == r1) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlinx.coroutines.channels.o0] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r8v0, types: [C extends kotlinx.coroutines.channels.o0<? super E>] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v2, types: [kotlinx.coroutines.channels.n0] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, kotlinx.coroutines.channels.n0] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00a1 -> B:16:0x0042). Please report as a decompilation issue!!! */
    @kotlin.a1
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <E, C extends kotlinx.coroutines.channels.o0<? super E>> java.lang.Object e0(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.n0<? extends E> r7, @org.jetbrains.annotations.NotNull C r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super C> r9) {
        /*
            r6 = 2
            boolean r0 = r9 instanceof kotlinx.coroutines.channels.b0.g0
            r6 = 4
            if (r0 == 0) goto L17
            r0 = r9
            kotlinx.coroutines.channels.b0$g0 r0 = (kotlinx.coroutines.channels.b0.g0) r0
            int r1 = r0.f313619e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r6 = 0
            r0.f313619e = r1
            r6 = 6
            goto L1c
        L17:
            kotlinx.coroutines.channels.b0$g0 r0 = new kotlinx.coroutines.channels.b0$g0
            r0.<init>(r9)
        L1c:
            java.lang.Object r9 = r0.f313618d
            r6 = 5
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f313619e
            r6 = 3
            r3 = 2
            r6 = 6
            r4 = 1
            if (r2 == 0) goto L63
            r6 = 3
            if (r2 == r4) goto L51
            r6 = 1
            if (r2 != r3) goto L49
            java.lang.Object r7 = r0.f313617c
            kotlinx.coroutines.channels.r r7 = (kotlinx.coroutines.channels.r) r7
            r6 = 5
            java.lang.Object r8 = r0.f313616b
            kotlinx.coroutines.channels.n0 r8 = (kotlinx.coroutines.channels.n0) r8
            java.lang.Object r2 = r0.f313615a
            kotlinx.coroutines.channels.o0 r2 = (kotlinx.coroutines.channels.o0) r2
            r6 = 1
            kotlin.ResultKt.m(r9)     // Catch: java.lang.Throwable -> L47
        L42:
            r9 = r7
            r9 = r7
            r7 = r8
            r8 = r2
            goto L6a
        L47:
            r7 = move-exception
            goto Lb4
        L49:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L51:
            java.lang.Object r7 = r0.f313617c
            r6 = 3
            kotlinx.coroutines.channels.r r7 = (kotlinx.coroutines.channels.r) r7
            java.lang.Object r8 = r0.f313616b
            kotlinx.coroutines.channels.n0 r8 = (kotlinx.coroutines.channels.n0) r8
            r6 = 2
            java.lang.Object r2 = r0.f313615a
            kotlinx.coroutines.channels.o0 r2 = (kotlinx.coroutines.channels.o0) r2
            kotlin.ResultKt.m(r9)     // Catch: java.lang.Throwable -> L47
            goto L81
        L63:
            kotlin.ResultKt.m(r9)
            kotlinx.coroutines.channels.r r9 = r7.iterator()     // Catch: java.lang.Throwable -> Lb0
        L6a:
            r0.f313615a = r8     // Catch: java.lang.Throwable -> Lb0
            r0.f313616b = r7     // Catch: java.lang.Throwable -> Lb0
            r6 = 2
            r0.f313617c = r9     // Catch: java.lang.Throwable -> Lb0
            r0.f313619e = r4     // Catch: java.lang.Throwable -> Lb0
            r6 = 1
            java.lang.Object r2 = r9.c(r0)     // Catch: java.lang.Throwable -> Lb0
            r6 = 7
            if (r2 != r1) goto L7c
            goto La3
        L7c:
            r5 = r8
            r8 = r7
            r7 = r9
            r9 = r2
            r2 = r5
        L81:
            r6 = 5
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L47
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L47
            r6 = 6
            if (r9 == 0) goto La5
            java.lang.Object r9 = r7.next()     // Catch: java.lang.Throwable -> L47
            r6 = 1
            r0.f313615a = r2     // Catch: java.lang.Throwable -> L47
            r6 = 4
            r0.f313616b = r8     // Catch: java.lang.Throwable -> L47
            r6 = 2
            r0.f313617c = r7     // Catch: java.lang.Throwable -> L47
            r6 = 0
            r0.f313619e = r3     // Catch: java.lang.Throwable -> L47
            r6 = 4
            java.lang.Object r9 = r2.G(r9, r0)     // Catch: java.lang.Throwable -> L47
            r6 = 3
            if (r9 != r1) goto L42
        La3:
            r6 = 4
            return r1
        La5:
            r6 = 7
            kotlin.Unit r7 = kotlin.Unit.f312394a     // Catch: java.lang.Throwable -> L47
            r7 = 6
            r7 = 0
            r6 = 3
            kotlinx.coroutines.channels.v.b(r8, r7)
            r6 = 3
            return r2
        Lb0:
            r8 = move-exception
            r5 = r8
            r8 = r7
            r7 = r5
        Lb4:
            r6 = 6
            throw r7     // Catch: java.lang.Throwable -> Lb6
        Lb6:
            r9 = move-exception
            r6 = 4
            kotlinx.coroutines.channels.v.b(r8, r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.b0.e0(kotlinx.coroutines.channels.n0, kotlinx.coroutines.channels.o0, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0070 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x0071  */
    /* JADX WARN: Code duplicated, block: B:30:0x0080 A[Catch: all -> 0x008c, TryCatch #2 {all -> 0x008c, blocks: (B:28:0x0078, B:30:0x0080, B:33:0x0091), top: B:46:0x0078 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0071 -> B:15:0x0042). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @kotlin.l(level = kotlin.n.ERROR, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    @org.jetbrains.annotations.Nullable
    public static final <E> java.lang.Object f(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.d<E> r7, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super E, kotlin.Unit> r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.channels.b0.b
            if (r0 == 0) goto L15
            r0 = r9
            kotlinx.coroutines.channels.b0$b r0 = (kotlinx.coroutines.channels.b0.b) r0
            r6 = 3
            int r1 = r0.f313565e
            r6 = 0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L15
            int r1 = r1 - r2
            r0.f313565e = r1
            goto L1c
        L15:
            r6 = 2
            kotlinx.coroutines.channels.b0$b r0 = new kotlinx.coroutines.channels.b0$b
            r6 = 3
            r0.<init>(r9)
        L1c:
            java.lang.Object r9 = r0.f313564d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            r6 = 0
            int r2 = r0.f313565e
            r3 = 0
            r4 = 1
            r6 = 2
            if (r2 == 0) goto L50
            r6 = 1
            if (r2 != r4) goto L48
            r6 = 0
            java.lang.Object r7 = r0.f313563c
            r6 = 5
            kotlinx.coroutines.channels.r r7 = (kotlinx.coroutines.channels.r) r7
            java.lang.Object r8 = r0.f313562b
            kotlinx.coroutines.channels.n0 r8 = (kotlinx.coroutines.channels.n0) r8
            java.lang.Object r2 = r0.f313561a
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r6 = 4
            kotlin.ResultKt.m(r9)     // Catch: java.lang.Throwable -> L45
            r5 = r0
            r0 = r8
            r8 = r2
        L42:
            r2 = r5
            r6 = 0
            goto L78
        L45:
            r7 = move-exception
            r6 = 5
            goto La7
        L48:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L50:
            r6 = 0
            kotlin.ResultKt.m(r9)
            kotlinx.coroutines.channels.n0 r7 = r7.k()
            r6 = 7
            kotlinx.coroutines.channels.r r9 = r7.iterator()     // Catch: java.lang.Throwable -> La2
            r5 = r9
            r9 = r7
            r7 = r5
        L60:
            r0.f313561a = r8     // Catch: java.lang.Throwable -> L9e
            r6 = 0
            r0.f313562b = r9     // Catch: java.lang.Throwable -> L9e
            r0.f313563c = r7     // Catch: java.lang.Throwable -> L9e
            r0.f313565e = r4     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r2 = r7.c(r0)     // Catch: java.lang.Throwable -> L9e
            r6 = 6
            if (r2 != r1) goto L71
            return r1
        L71:
            r5 = r0
            r5 = r0
            r0 = r9
            r0 = r9
            r9 = r2
            r6 = 1
            goto L42
        L78:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L8c
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L8c
            if (r9 == 0) goto L91
            java.lang.Object r9 = r7.next()     // Catch: java.lang.Throwable -> L8c
            r8.invoke(r9)     // Catch: java.lang.Throwable -> L8c
            r9 = r0
            r9 = r0
            r0 = r2
            r0 = r2
            goto L60
        L8c:
            r7 = move-exception
            r8 = r0
            r8 = r0
            r6 = 0
            goto La7
        L91:
            kotlin.Unit r7 = kotlin.Unit.f312394a     // Catch: java.lang.Throwable -> L8c
            kotlin.jvm.internal.h0.d(r4)
            kotlinx.coroutines.channels.n0.a.b(r0, r3, r4, r3)
            kotlin.jvm.internal.h0.c(r4)
            r6 = 6
            return r7
        L9e:
            r7 = move-exception
            r8 = r9
            r8 = r9
            goto La7
        La2:
            r8 = move-exception
            r5 = r8
            r5 = r8
            r8 = r7
            r7 = r5
        La7:
            r6 = 7
            kotlin.jvm.internal.h0.d(r4)
            r6 = 1
            kotlinx.coroutines.channels.n0.a.b(r8, r3, r4, r3)
            kotlin.jvm.internal.h0.c(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.b0.f(kotlinx.coroutines.channels.d, kotlin.jvm.functions.Function1, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0065 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0066  */
    /* JADX WARN: Code duplicated, block: B:27:0x0073 A[Catch: all -> 0x003d, TryCatch #2 {all -> 0x003d, blocks: (B:12:0x0039, B:25:0x0069, B:27:0x0073, B:21:0x0054, B:28:0x007c), top: B:42:0x0039 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0066 -> B:25:0x0069). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @kotlin.a1
    @org.jetbrains.annotations.Nullable
    public static final <E, C extends java.util.Collection<? super E>> java.lang.Object f0(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.n0<? extends E> r6, @org.jetbrains.annotations.NotNull C r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super C> r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.b0.h0
            if (r0 == 0) goto L16
            r0 = r8
            kotlinx.coroutines.channels.b0$h0 r0 = (kotlinx.coroutines.channels.b0.h0) r0
            int r1 = r0.f313630e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            r5 = 4
            int r1 = r1 - r2
            r5 = 1
            r0.f313630e = r1
            r5 = 2
            goto L1c
        L16:
            r5 = 0
            kotlinx.coroutines.channels.b0$h0 r0 = new kotlinx.coroutines.channels.b0$h0
            r0.<init>(r8)
        L1c:
            java.lang.Object r8 = r0.f313629d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            r5 = 4
            int r2 = r0.f313630e
            r3 = 4
            r3 = 1
            if (r2 == 0) goto L49
            if (r2 != r3) goto L40
            java.lang.Object r6 = r0.f313628c
            kotlinx.coroutines.channels.r r6 = (kotlinx.coroutines.channels.r) r6
            r5 = 0
            java.lang.Object r7 = r0.f313627b
            kotlinx.coroutines.channels.n0 r7 = (kotlinx.coroutines.channels.n0) r7
            r5 = 4
            java.lang.Object r2 = r0.f313626a
            java.util.Collection r2 = (java.util.Collection) r2
            kotlin.ResultKt.m(r8)     // Catch: java.lang.Throwable -> L3d
            goto L69
        L3d:
            r6 = move-exception
            r5 = 4
            goto L88
        L40:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r5 = 0
            r6.<init>(r7)
            throw r6
        L49:
            kotlin.ResultKt.m(r8)
            kotlinx.coroutines.channels.r r8 = r6.iterator()     // Catch: java.lang.Throwable -> L84
            r4 = r7
            r7 = r6
            r6 = r8
            r8 = r4
        L54:
            r5 = 5
            r0.f313626a = r8     // Catch: java.lang.Throwable -> L3d
            r0.f313627b = r7     // Catch: java.lang.Throwable -> L3d
            r0.f313628c = r6     // Catch: java.lang.Throwable -> L3d
            r0.f313630e = r3     // Catch: java.lang.Throwable -> L3d
            r5 = 5
            java.lang.Object r2 = r6.c(r0)     // Catch: java.lang.Throwable -> L3d
            r5 = 3
            if (r2 != r1) goto L66
            return r1
        L66:
            r4 = r2
            r2 = r8
            r8 = r4
        L69:
            r5 = 4
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L3d
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L3d
            r5 = 3
            if (r8 == 0) goto L7c
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L3d
            r2.add(r8)     // Catch: java.lang.Throwable -> L3d
            r8 = r2
            goto L54
        L7c:
            kotlin.Unit r6 = kotlin.Unit.f312394a     // Catch: java.lang.Throwable -> L3d
            r5 = 7
            r6 = 0
            kotlinx.coroutines.channels.v.b(r7, r6)
            return r2
        L84:
            r7 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L88:
            r5 = 3
            throw r6     // Catch: java.lang.Throwable -> L8a
        L8a:
            r8 = move-exception
            r5 = 6
            kotlinx.coroutines.channels.v.b(r7, r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.b0.f0(kotlinx.coroutines.channels.n0, java.util.Collection, kotlin.coroutines.d):java.lang.Object");
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    private static final <E> Object g(kotlinx.coroutines.channels.d<E> dVar, Function1<? super E, Unit> function1, kotlin.coroutines.d<? super Unit> dVar2) {
        n0<E> n0VarK = dVar.k();
        try {
            kotlinx.coroutines.channels.r<E> it = n0VarK.iterator();
            while (true) {
                kotlin.jvm.internal.h0.e(3);
                kotlin.jvm.internal.h0.e(0);
                Object objC = it.c(null);
                kotlin.jvm.internal.h0.e(1);
                if (!((Boolean) objC).booleanValue()) {
                    Unit unit = Unit.f312394a;
                    kotlin.jvm.internal.h0.d(1);
                    n0.a.b(n0VarK, null, 1, null);
                    return unit;
                }
                function1.invoke(it.next());
            }
        } finally {
            kotlin.jvm.internal.h0.d(1);
            n0.a.b(n0VarK, null, 1, null);
            kotlin.jvm.internal.h0.c(1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0068 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0069  */
    /* JADX WARN: Code duplicated, block: B:28:0x0077 A[Catch: all -> 0x003e, TryCatch #2 {all -> 0x003e, blocks: (B:13:0x003a, B:26:0x006e, B:28:0x0077, B:22:0x0057, B:29:0x008d), top: B:43:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0069 -> B:26:0x006e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @kotlin.a1
    @org.jetbrains.annotations.Nullable
    public static final <K, V, M extends java.util.Map<? super K, ? super V>> java.lang.Object g0(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.n0<? extends kotlin.Pair<? extends K, ? extends V>> r7, @org.jetbrains.annotations.NotNull M r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super M> r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.channels.b0.i0
            if (r0 == 0) goto L17
            r0 = r9
            kotlinx.coroutines.channels.b0$i0 r0 = (kotlinx.coroutines.channels.b0.i0) r0
            r6 = 3
            int r1 = r0.f313641e
            r6 = 4
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 5
            r3 = r1 & r2
            r6 = 6
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.f313641e = r1
            goto L1d
        L17:
            kotlinx.coroutines.channels.b0$i0 r0 = new kotlinx.coroutines.channels.b0$i0
            r6 = 3
            r0.<init>(r9)
        L1d:
            java.lang.Object r9 = r0.f313640d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f313641e
            r6 = 6
            r3 = 1
            r6 = 0
            if (r2 == 0) goto L4a
            r6 = 3
            if (r2 != r3) goto L41
            java.lang.Object r7 = r0.f313639c
            r6 = 5
            kotlinx.coroutines.channels.r r7 = (kotlinx.coroutines.channels.r) r7
            java.lang.Object r8 = r0.f313638b
            kotlinx.coroutines.channels.n0 r8 = (kotlinx.coroutines.channels.n0) r8
            java.lang.Object r2 = r0.f313637a
            java.util.Map r2 = (java.util.Map) r2
            kotlin.ResultKt.m(r9)     // Catch: java.lang.Throwable -> L3e
            goto L6e
        L3e:
            r7 = move-exception
            r6 = 2
            goto L9a
        L41:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r6 = 3
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L4a:
            kotlin.ResultKt.m(r9)
            kotlinx.coroutines.channels.r r9 = r7.iterator()     // Catch: java.lang.Throwable -> L96
            r5 = r8
            r8 = r7
            r8 = r7
            r7 = r9
            r7 = r9
            r9 = r5
        L57:
            r6 = 5
            r0.f313637a = r9     // Catch: java.lang.Throwable -> L3e
            r0.f313638b = r8     // Catch: java.lang.Throwable -> L3e
            r6 = 1
            r0.f313639c = r7     // Catch: java.lang.Throwable -> L3e
            r0.f313641e = r3     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r2 = r7.c(r0)     // Catch: java.lang.Throwable -> L3e
            r6 = 3
            if (r2 != r1) goto L69
            return r1
        L69:
            r5 = r2
            r5 = r2
            r2 = r9
            r2 = r9
            r9 = r5
        L6e:
            r6 = 1
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L3e
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L3e
            if (r9 == 0) goto L8d
            java.lang.Object r9 = r7.next()     // Catch: java.lang.Throwable -> L3e
            kotlin.Pair r9 = (kotlin.Pair) r9     // Catch: java.lang.Throwable -> L3e
            r6 = 2
            java.lang.Object r4 = r9.getFirst()     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r9 = r9.getSecond()     // Catch: java.lang.Throwable -> L3e
            r6 = 2
            r2.put(r4, r9)     // Catch: java.lang.Throwable -> L3e
            r9 = r2
            r6 = 0
            goto L57
        L8d:
            kotlin.Unit r7 = kotlin.Unit.f312394a     // Catch: java.lang.Throwable -> L3e
            r6 = 1
            r7 = 0
            r6 = 3
            kotlinx.coroutines.channels.v.b(r8, r7)
            return r2
        L96:
            r8 = move-exception
            r5 = r8
            r8 = r7
            r7 = r5
        L9a:
            r6 = 7
            throw r7     // Catch: java.lang.Throwable -> L9c
        L9c:
            r9 = move-exception
            r6 = 7
            kotlinx.coroutines.channels.v.b(r8, r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.b0.g0(kotlinx.coroutines.channels.n0, java.util.Map, kotlin.coroutines.d):java.lang.Object");
    }

    @a1
    @NotNull
    public static final Function1<Throwable, Unit> h(@NotNull final n0<?> n0Var) {
        return new Function1() { // from class: kotlinx.coroutines.channels.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b0.i(n0Var, (Throwable) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(n0 n0Var, Throwable th2) {
        kotlinx.coroutines.channels.v.b(n0Var, th2);
        return Unit.f312394a;
    }

    @a1
    @NotNull
    public static final Function1<Throwable, Unit> j(@NotNull final n0<?>... n0VarArr) {
        return new Function1() { // from class: kotlinx.coroutines.channels.z
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b0.k(n0VarArr, (Throwable) obj);
            }
        };
    }

    @a1
    @Nullable
    public static final <E> Object j0(@NotNull n0<? extends E> n0Var, @NotNull kotlin.coroutines.d<? super Set<E>> dVar) {
        return kotlinx.coroutines.channels.v.f0(n0Var, new LinkedHashSet(), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(n0[] n0VarArr, Throwable th2) throws Throwable {
        Throwable th3 = null;
        for (n0 n0Var : n0VarArr) {
            try {
                kotlinx.coroutines.channels.v.b(n0Var, th2);
            } catch (Throwable th4) {
                if (th3 == null) {
                    th3 = th4;
                } else {
                    kotlin.p.a(th3, th4);
                }
            }
        }
        if (th3 == null) {
            return Unit.f312394a;
        }
        throw th3;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0070  */
    /* JADX WARN: Code duplicated, block: B:28:0x007c A[Catch: all -> 0x0041, TryCatch #1 {all -> 0x0041, blocks: (B:13:0x003c, B:26:0x0074, B:28:0x007c, B:29:0x0089), top: B:43:0x003c }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0070 -> B:26:0x0074). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object l(kotlinx.coroutines.channels.n0 r7, kotlin.coroutines.d r8) {
        /*
            r6 = 0
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.b0.c
            r6 = 5
            if (r0 == 0) goto L18
            r0 = r8
            r6 = 2
            kotlinx.coroutines.channels.b0$c r0 = (kotlinx.coroutines.channels.b0.c) r0
            int r1 = r0.f313573e
            r6 = 1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 3
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.f313573e = r1
            goto L1d
        L18:
            kotlinx.coroutines.channels.b0$c r0 = new kotlinx.coroutines.channels.b0$c
            r0.<init>(r8)
        L1d:
            r6 = 7
            java.lang.Object r8 = r0.f313572d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            r6 = 2
            int r2 = r0.f313573e
            r3 = 1
            r6 = 0
            if (r2 == 0) goto L4d
            r6 = 1
            if (r2 != r3) goto L43
            java.lang.Object r7 = r0.f313571c
            r6 = 5
            kotlinx.coroutines.channels.r r7 = (kotlinx.coroutines.channels.r) r7
            java.lang.Object r2 = r0.f313570b
            r6 = 6
            kotlinx.coroutines.channels.n0 r2 = (kotlinx.coroutines.channels.n0) r2
            java.lang.Object r4 = r0.f313569a
            kotlin.jvm.internal.i1$f r4 = (kotlin.jvm.internal.i1.f) r4
            r6 = 0
            kotlin.ResultKt.m(r8)     // Catch: java.lang.Throwable -> L41
            goto L74
        L41:
            r7 = move-exception
            goto L9f
        L43:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r6 = 0
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            r6 = 2
            throw r7
        L4d:
            kotlin.ResultKt.m(r8)
            kotlin.jvm.internal.i1$f r8 = new kotlin.jvm.internal.i1$f
            r8.<init>()
            r6 = 5
            kotlinx.coroutines.channels.r r2 = r7.iterator()     // Catch: java.lang.Throwable -> L9c
            r4 = r8
            r4 = r8
            r8 = r7
            r7 = r2
        L5e:
            r6 = 3
            r0.f313569a = r4     // Catch: java.lang.Throwable -> L98
            r0.f313570b = r8     // Catch: java.lang.Throwable -> L98
            r6 = 6
            r0.f313571c = r7     // Catch: java.lang.Throwable -> L98
            r0.f313573e = r3     // Catch: java.lang.Throwable -> L98
            r6 = 2
            java.lang.Object r2 = r7.c(r0)     // Catch: java.lang.Throwable -> L98
            if (r2 != r1) goto L70
            return r1
        L70:
            r5 = r2
            r5 = r2
            r2 = r8
            r8 = r5
        L74:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L41
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L41
            if (r8 == 0) goto L89
            r6 = 7
            r7.next()     // Catch: java.lang.Throwable -> L41
            int r8 = r4.f312749a     // Catch: java.lang.Throwable -> L41
            int r8 = r8 + r3
            r6 = 1
            r4.f312749a = r8     // Catch: java.lang.Throwable -> L41
            r8 = r2
            r6 = 1
            goto L5e
        L89:
            kotlin.Unit r7 = kotlin.Unit.f312394a     // Catch: java.lang.Throwable -> L41
            r6 = 6
            r7 = 0
            kotlinx.coroutines.channels.v.b(r2, r7)
            int r7 = r4.f312749a
            java.lang.Integer r7 = kotlin.coroutines.jvm.internal.b.f(r7)
            r6 = 5
            return r7
        L98:
            r7 = move-exception
            r2 = r8
            r6 = 7
            goto L9f
        L9c:
            r8 = move-exception
            r2 = r7
            r7 = r8
        L9f:
            r6 = 6
            throw r7     // Catch: java.lang.Throwable -> La1
        La1:
            r8 = move-exception
            r6 = 4
            kotlinx.coroutines.channels.v.b(r2, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.b0.l(kotlinx.coroutines.channels.n0, kotlin.coroutines.d):java.lang.Object");
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ n0 l0(n0 n0Var, CoroutineContext coroutineContext) {
        int i10 = 3 | 0;
        return kotlinx.coroutines.channels.j0.i(f2.f314023a, coroutineContext, 0, null, kotlinx.coroutines.channels.v.g(n0Var), new j0(n0Var, null), 6, null);
    }

    public static /* synthetic */ n0 m0(n0 n0Var, CoroutineContext coroutineContext, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = l1.g();
        }
        return l0(n0Var, coroutineContext);
    }

    @a1
    @NotNull
    public static final <E, K> n0<E> n(@NotNull n0<? extends E> n0Var, @NotNull CoroutineContext coroutineContext, @NotNull Function2<? super E, ? super kotlin.coroutines.d<? super K>, ? extends Object> function2) {
        int i10 = 2 << 0;
        return kotlinx.coroutines.channels.j0.i(f2.f314023a, coroutineContext, 0, null, kotlinx.coroutines.channels.v.g(n0Var), new e(n0Var, function2, null), 6, null);
    }

    public static /* synthetic */ n0 o(n0 n0Var, CoroutineContext coroutineContext, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = l1.g();
        }
        return kotlinx.coroutines.channels.v.k(n0Var, coroutineContext, function2);
    }

    @a1
    @NotNull
    public static final <E, R, V> n0<V> o0(@NotNull n0<? extends E> n0Var, @NotNull n0<? extends R> n0Var2, @NotNull CoroutineContext coroutineContext, @NotNull Function2<? super E, ? super R, ? extends V> function2) {
        return kotlinx.coroutines.channels.j0.i(f2.f314023a, coroutineContext, 0, null, kotlinx.coroutines.channels.v.h(n0Var, n0Var2), new k0(n0Var2, n0Var, function2, null), 6, null);
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ n0 p(n0 n0Var, int i10, CoroutineContext coroutineContext) {
        return kotlinx.coroutines.channels.j0.i(f2.f314023a, coroutineContext, 0, null, kotlinx.coroutines.channels.v.g(n0Var), new f(i10, n0Var, null), 6, null);
    }

    public static /* synthetic */ n0 p0(n0 n0Var, n0 n0Var2, CoroutineContext coroutineContext, Function2 function2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            coroutineContext = l1.g();
        }
        return kotlinx.coroutines.channels.v.q0(n0Var, n0Var2, coroutineContext, function2);
    }

    public static /* synthetic */ n0 q(n0 n0Var, int i10, CoroutineContext coroutineContext, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            coroutineContext = l1.g();
        }
        return p(n0Var, i10, coroutineContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair q0(Object obj, Object obj2) {
        return TuplesKt.to(obj, obj2);
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ n0 r(n0 n0Var, CoroutineContext coroutineContext, Function2 function2) {
        return kotlinx.coroutines.channels.j0.i(f2.f314023a, coroutineContext, 0, null, kotlinx.coroutines.channels.v.g(n0Var), new g(n0Var, function2, null), 6, null);
    }

    public static /* synthetic */ n0 s(n0 n0Var, CoroutineContext coroutineContext, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = l1.g();
        }
        return r(n0Var, coroutineContext, function2);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0069 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x006a  */
    /* JADX WARN: Code duplicated, block: B:27:0x007b A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #0 {all -> 0x0043, blocks: (B:12:0x003e, B:25:0x0071, B:27:0x007b, B:33:0x008f, B:34:0x00a7), top: B:43:0x003e }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0084  */
    /* JADX WARN: Code duplicated, block: B:32:0x008a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x006a -> B:25:0x0071). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object t(kotlinx.coroutines.channels.n0 r10, int r11, kotlin.coroutines.d r12) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.b0.t(kotlinx.coroutines.channels.n0, int, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0074  */
    /* JADX WARN: Code duplicated, block: B:28:0x0076  */
    /* JADX WARN: Code duplicated, block: B:31:0x0084 A[Catch: all -> 0x0096, TRY_LEAVE, TryCatch #1 {all -> 0x0096, blocks: (B:29:0x007a, B:31:0x0084, B:24:0x0063, B:23:0x005c), top: B:47:0x005c }] */
    /* JADX WARN: Code duplicated, block: B:34:0x008c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0090  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0076 -> B:29:0x007a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object u(kotlinx.coroutines.channels.n0 r9, int r10, kotlin.coroutines.d r11) {
        /*
            r8 = 2
            boolean r0 = r11 instanceof kotlinx.coroutines.channels.b0.i
            if (r0 == 0) goto L19
            r0 = r11
            r0 = r11
            r8 = 4
            kotlinx.coroutines.channels.b0$i r0 = (kotlinx.coroutines.channels.b0.i) r0
            r8 = 5
            int r1 = r0.f313636f
            r8 = 6
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L19
            int r1 = r1 - r2
            r0.f313636f = r1
            r8 = 0
            goto L1e
        L19:
            kotlinx.coroutines.channels.b0$i r0 = new kotlinx.coroutines.channels.b0$i
            r0.<init>(r11)
        L1e:
            java.lang.Object r11 = r0.f313635e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            r8 = 0
            int r2 = r0.f313636f
            r3 = 1
            r8 = 6
            r4 = 0
            r8 = 7
            if (r2 == 0) goto L53
            r8 = 7
            if (r2 != r3) goto L4a
            int r9 = r0.f313632b
            int r10 = r0.f313631a
            java.lang.Object r2 = r0.f313634d
            kotlinx.coroutines.channels.r r2 = (kotlinx.coroutines.channels.r) r2
            java.lang.Object r5 = r0.f313633c
            kotlinx.coroutines.channels.n0 r5 = (kotlinx.coroutines.channels.n0) r5
            kotlin.ResultKt.m(r11)     // Catch: java.lang.Throwable -> L48
            r7 = r2
            r7 = r2
            r2 = r9
            r9 = r5
            r9 = r5
            r5 = r0
            r0 = r7
            r0 = r7
            goto L7a
        L48:
            r9 = move-exception
            goto La0
        L4a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r8 = 2
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L53:
            kotlin.ResultKt.m(r11)
            if (r10 >= 0) goto L5c
            kotlinx.coroutines.channels.v.b(r9, r4)
            return r4
        L5c:
            r8 = 6
            kotlinx.coroutines.channels.r r11 = r9.iterator()     // Catch: java.lang.Throwable -> L96
            r8 = 4
            r2 = 0
        L63:
            r0.f313633c = r9     // Catch: java.lang.Throwable -> L96
            r8 = 3
            r0.f313634d = r11     // Catch: java.lang.Throwable -> L96
            r0.f313631a = r10     // Catch: java.lang.Throwable -> L96
            r0.f313632b = r2     // Catch: java.lang.Throwable -> L96
            r0.f313636f = r3     // Catch: java.lang.Throwable -> L96
            java.lang.Object r5 = r11.c(r0)     // Catch: java.lang.Throwable -> L96
            if (r5 != r1) goto L76
            r8 = 4
            return r1
        L76:
            r7 = r0
            r0 = r11
            r11 = r5
            r5 = r7
        L7a:
            r8 = 1
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L96
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L96
            r8 = 7
            if (r11 == 0) goto L9a
            java.lang.Object r11 = r0.next()     // Catch: java.lang.Throwable -> L96
            int r6 = r2 + 1
            if (r10 != r2) goto L90
            kotlinx.coroutines.channels.v.b(r9, r4)
            return r11
        L90:
            r11 = r0
            r11 = r0
            r0 = r5
            r8 = 4
            r2 = r6
            goto L63
        L96:
            r10 = move-exception
            r5 = r9
            r9 = r10
            goto La0
        L9a:
            r8 = 2
            kotlinx.coroutines.channels.v.b(r9, r4)
            r8 = 1
            return r4
        La0:
            throw r9     // Catch: java.lang.Throwable -> La1
        La1:
            r10 = move-exception
            r8 = 6
            kotlinx.coroutines.channels.v.b(r5, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.b0.u(kotlinx.coroutines.channels.n0, int, kotlin.coroutines.d):java.lang.Object");
    }

    @a1
    @NotNull
    public static final <E> n0<E> v(@NotNull n0<? extends E> n0Var, @NotNull CoroutineContext coroutineContext, @NotNull Function2<? super E, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> function2) {
        return kotlinx.coroutines.channels.j0.i(f2.f314023a, coroutineContext, 0, null, kotlinx.coroutines.channels.v.g(n0Var), new j(n0Var, function2, null), 6, null);
    }

    public static /* synthetic */ n0 w(n0 n0Var, CoroutineContext coroutineContext, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = l1.g();
        }
        return kotlinx.coroutines.channels.v.s(n0Var, coroutineContext, function2);
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ n0 x(n0 n0Var, CoroutineContext coroutineContext, pj.n nVar) {
        return kotlinx.coroutines.channels.j0.i(f2.f314023a, coroutineContext, 0, null, kotlinx.coroutines.channels.v.g(n0Var), new k(n0Var, nVar, null), 6, null);
    }

    public static /* synthetic */ n0 y(n0 n0Var, CoroutineContext coroutineContext, pj.n nVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = l1.g();
        }
        return x(n0Var, coroutineContext, nVar);
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ n0 z(n0 n0Var, CoroutineContext coroutineContext, Function2 function2) {
        return kotlinx.coroutines.channels.v.s(n0Var, coroutineContext, new l(function2, null));
    }
}
