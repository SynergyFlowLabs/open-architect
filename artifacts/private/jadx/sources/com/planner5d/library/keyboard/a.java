package com.planner5d.library.keyboard;

import com.facebook.appevents.internal.p;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@l(message = "Remove once we stop supporting old app versions")
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f180301a;

    /* JADX INFO: renamed from: com.planner5d.library.keyboard.a$a, reason: collision with other inner class name */
    @f(c = "com.planner5d.library.keyboard.KeyboardVisibilityWatcher", f = "KeyboardVisibilityWatcher.kt", i = {0, 0, 0, 0}, l = {20}, m = "startWatchingKeyboard", n = {"this", p.A, "onKeyboardVisibilityChange", "isKeyboardVisible"}, s = {"L$0", "L$1", "L$2", "I$0"})
    static final class C1564a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f180302a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f180303b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f180304c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f180305d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f180306e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f180308g;

        C1564a(kotlin.coroutines.d<? super C1564a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f180306e = obj;
            this.f180308g |= Integer.MIN_VALUE;
            return a.this.a(null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0068  */
    /* JADX WARN: Code duplicated, block: B:19:0x007c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0082  */
    /* JADX WARN: Code duplicated, block: B:25:0x008f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0093  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x007a -> B:20:0x007d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:25:0x008f
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull android.view.View r8, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r10) {
        /*
            r7 = this;
            r6 = 6
            boolean r0 = r10 instanceof com.planner5d.library.keyboard.a.C1564a
            if (r0 == 0) goto L17
            r0 = r10
            com.planner5d.library.keyboard.a$a r0 = (com.planner5d.library.keyboard.a.C1564a) r0
            r6 = 0
            int r1 = r0.f180308g
            r6 = 1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            r6 = 1
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.f180308g = r1
            goto L1c
        L17:
            com.planner5d.library.keyboard.a$a r0 = new com.planner5d.library.keyboard.a$a
            r0.<init>(r10)
        L1c:
            java.lang.Object r10 = r0.f180306e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f180308g
            r6 = 0
            r3 = 1
            r6 = 1
            if (r2 == 0) goto L50
            if (r2 != r3) goto L48
            int r7 = r0.f180305d
            java.lang.Object r8 = r0.f180304c
            r6 = 6
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            r6 = 4
            java.lang.Object r9 = r0.f180303b
            r6 = 6
            android.view.View r9 = (android.view.View) r9
            java.lang.Object r2 = r0.f180302a
            com.planner5d.library.keyboard.a r2 = (com.planner5d.library.keyboard.a) r2
            kotlin.ResultKt.m(r10)
            r10 = r9
            r10 = r9
            r9 = r8
            r8 = r10
            r8 = r10
            r6 = 3
            r10 = r7
            r7 = r2
            goto L7d
        L48:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L50:
            kotlin.ResultKt.m(r10)
            r7.f180301a = r3
            com.planner5d.library.services.s r10 = com.planner5d.library.services.s.f224951a
            boolean r10 = r10.c(r8)
            r6 = 6
            java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.b.a(r10)
            r9.invoke(r2)
        L63:
            r6 = 0
            boolean r2 = r7.f180301a
            if (r2 == 0) goto L9d
            r0.f180302a = r7
            r6 = 0
            r0.f180303b = r8
            r0.f180304c = r9
            r0.f180305d = r10
            r0.f180308g = r3
            r4 = 500(0x1f4, double:2.47E-321)
            r6 = 7
            java.lang.Object r2 = kotlinx.coroutines.d1.b(r4, r0)
            if (r2 != r1) goto L7d
            return r1
        L7d:
            boolean r2 = r7.f180301a
            r6 = 0
            if (r2 == 0) goto L8f
            com.planner5d.library.services.s r2 = com.planner5d.library.services.s.f224951a
            r6 = 3
            boolean r2 = r2.c(r8)
            r6 = 1
            if (r2 == 0) goto L8f
            r6 = 2
            r2 = r3
            goto L91
        L8f:
            r6 = 3
            r2 = 0
        L91:
            if (r10 == r2) goto L63
            java.lang.Boolean r10 = kotlin.coroutines.jvm.internal.b.a(r2)
            r6 = 6
            r9.invoke(r10)
            r10 = r2
            goto L63
        L9d:
            kotlin.Unit r7 = kotlin.Unit.f312394a
            r6 = 3
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.keyboard.a.a(android.view.View, kotlin.jvm.functions.Function1, kotlin.coroutines.d):java.lang.Object");
    }

    public final void b() {
        this.f180301a = false;
    }
}
