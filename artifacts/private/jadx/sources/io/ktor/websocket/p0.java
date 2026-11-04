package io.ktor.websocket;

import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nWebSocketSession.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSocketSession.kt\nio/ktor/websocket/WebSocketSessionKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,186:1\n295#2,2:187\n*S KotlinDebug\n*F\n+ 1 WebSocketSession.kt\nio/ktor/websocket/WebSocketSessionKt\n*L\n120#1:187,2\n*E\n"})
public final class p0 {

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.websocket.WebSocketSessionKt", f = "WebSocketSession.kt", i = {0}, l = {150, 151}, m = "close", n = {"$this$close"}, s = {"L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f297409a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f297410b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f297411c;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f297410b = obj;
            this.f297411c |= Integer.MIN_VALUE;
            return p0.a(null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        if (r6.d(r0) == r1) goto L26;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@org.jetbrains.annotations.NotNull io.ktor.websocket.o0 r6, @org.jetbrains.annotations.NotNull io.ktor.websocket.a r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r8) {
        /*
            java.lang.String r5 = "Androeed.ru"
            boolean r0 = r8 instanceof io.ktor.websocket.p0.a
            if (r0 == 0) goto L19
            r0 = r8
            r0 = r8
            io.ktor.websocket.p0$a r0 = (io.ktor.websocket.p0.a) r0
            r5 = 0
            int r1 = r0.f297411c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 7
            r3 = r1 & r2
            if (r3 == 0) goto L19
            int r1 = r1 - r2
            r5 = 6
            r0.f297411c = r1
            goto L1e
        L19:
            io.ktor.websocket.p0$a r0 = new io.ktor.websocket.p0$a
            r0.<init>(r8)
        L1e:
            java.lang.Object r8 = r0.f297410b
            r5 = 7
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f297411c
            r5 = 7
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L34
            kotlin.ResultKt.m(r8)     // Catch: java.lang.Throwable -> L6e
            goto L6e
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = " /soefer/helooi/e  iru mbsckuoe/etc/r/tl awn //noti"
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r5 = 0
            r6.<init>(r7)
            throw r6
        L3f:
            r5 = 7
            java.lang.Object r6 = r0.f297409a
            r5 = 5
            io.ktor.websocket.o0 r6 = (io.ktor.websocket.o0) r6
            kotlin.ResultKt.m(r8)     // Catch: java.lang.Throwable -> L6e
            r5 = 0
            goto L60
        L4a:
            kotlin.ResultKt.m(r8)
            r5 = 1
            io.ktor.websocket.e$b r8 = new io.ktor.websocket.e$b     // Catch: java.lang.Throwable -> L6e
            r5 = 0
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L6e
            r0.f297409a = r6     // Catch: java.lang.Throwable -> L6e
            r0.f297411c = r4     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r7 = r6.g1(r8, r0)     // Catch: java.lang.Throwable -> L6e
            r5 = 6
            if (r7 != r1) goto L60
            goto L6c
        L60:
            r7 = 0
            r0.f297409a = r7     // Catch: java.lang.Throwable -> L6e
            r0.f297411c = r3     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r6 = r6.d(r0)     // Catch: java.lang.Throwable -> L6e
            r5 = 7
            if (r6 != r1) goto L6e
        L6c:
            r5 = 3
            return r1
        L6e:
            r5 = 5
            kotlin.Unit r6 = kotlin.Unit.f312394a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.p0.a(io.ktor.websocket.o0, io.ktor.websocket.a, kotlin.coroutines.d):java.lang.Object");
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Close with reason or terminate instead.")
    @Nullable
    public static final Object b(@NotNull o0 o0Var, @Nullable Throwable th2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        if (th2 == null) {
            Object objC = c(o0Var, null, dVar, 1, null);
            return objC == kotlin.coroutines.intrinsics.b.l() ? objC : Unit.f312394a;
        }
        Object objD = d(o0Var, th2, dVar);
        return objD == kotlin.coroutines.intrinsics.b.l() ? objD : Unit.f312394a;
    }

    public static /* synthetic */ Object c(o0 o0Var, io.ktor.websocket.a aVar, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = new io.ktor.websocket.a(io.ktor.websocket.a.EnumC2106a.NORMAL, "");
        }
        return a(o0Var, aVar, dVar);
    }

    @Nullable
    public static final Object d(@NotNull o0 o0Var, @NotNull Throwable th2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objA = a(o0Var, th2 instanceof CancellationException ? new io.ktor.websocket.a(io.ktor.websocket.a.EnumC2106a.NORMAL, "") : new io.ktor.websocket.a(io.ktor.websocket.a.EnumC2106a.INTERNAL_ERROR, th2.toString()), dVar);
        return objA == kotlin.coroutines.intrinsics.b.l() ? objA : Unit.f312394a;
    }

    @NotNull
    public static final <T extends e0<?>> T e(@NotNull o0 o0Var, @NotNull f0<?, T> extension) {
        Intrinsics.checkNotNullParameter(o0Var, "<this>");
        Intrinsics.checkNotNullParameter(extension, "extension");
        T t10 = (T) f(o0Var, extension);
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException(("Extension " + extension + " not found.").toString());
    }

    @Nullable
    public static final <T extends e0<?>> T f(@NotNull o0 o0Var, @NotNull f0<?, T> extension) {
        Object next;
        Intrinsics.checkNotNullParameter(o0Var, "<this>");
        Intrinsics.checkNotNullParameter(extension, "extension");
        Iterator<T> it = o0Var.O0().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((e0) next).a().getKey() != extension.getKey());
        if (next instanceof e0) {
            return (T) next;
        }
        return null;
    }

    @Nullable
    public static final Object g(@NotNull o0 o0Var, @NotNull String str, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objG1 = o0Var.g1(new e.f(str), dVar);
        return objG1 == kotlin.coroutines.intrinsics.b.l() ? objG1 : Unit.f312394a;
    }

    @Nullable
    public static final Object h(@NotNull o0 o0Var, @NotNull byte[] bArr, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        boolean z10 = !false;
        Object objG1 = o0Var.g1(new e.a(true, bArr), dVar);
        return objG1 == kotlin.coroutines.intrinsics.b.l() ? objG1 : Unit.f312394a;
    }
}
