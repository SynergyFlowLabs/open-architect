package androidx.compose.foundation.relocation;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nBringIntoViewRequester.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoViewRequester.kt\nandroidx/compose/foundation/relocation/BringIntoViewRequesterImpl\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,161:1\n1107#2:162\n1085#2,2:163\n424#3,8:165\n*S KotlinDebug\n*F\n+ 1 BringIntoViewRequester.kt\nandroidx/compose/foundation/relocation/BringIntoViewRequesterImpl\n*L\n99#1:162\n99#1:163,2\n102#1:165,8\n*E\n"})
final class c implements androidx.compose.foundation.relocation.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.collection.d<g> f18562a = new androidx.compose.runtime.collection.d<>(new g[16], 0);

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.relocation.BringIntoViewRequesterImpl", f = "BringIntoViewRequester.kt", i = {0, 0, 0, 0}, l = {102}, m = "bringIntoView", n = {"rect", "content$iv", "i$iv", "size$iv"}, s = {"L$0", "L$1", "I$0", "I$1"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f18563a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f18564b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f18565c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f18566d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f18567e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f18569g;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f18567e = obj;
            this.f18569g |= Integer.MIN_VALUE;
            return c.this.a(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n0.j d(n0.j jVar) {
        return jVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x005e  */
    /* JADX WARN: Code duplicated, block: B:18:0x0078 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0076 -> B:19:0x0079). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // androidx.compose.foundation.relocation.a
    @org.jetbrains.annotations.Nullable
    public java.lang.Object a(@org.jetbrains.annotations.Nullable n0.j r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof androidx.compose.foundation.relocation.c.a
            if (r0 == 0) goto L14
            r0 = r10
            r7 = 4
            androidx.compose.foundation.relocation.c$a r0 = (androidx.compose.foundation.relocation.c.a) r0
            int r1 = r0.f18569g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f18569g = r1
            goto L19
        L14:
            androidx.compose.foundation.relocation.c$a r0 = new androidx.compose.foundation.relocation.c$a
            r0.<init>(r10)
        L19:
            java.lang.Object r10 = r0.f18567e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            r7 = 0
            int r2 = r0.f18569g
            r3 = 1
            r7 = 2
            if (r2 == 0) goto L48
            if (r2 != r3) goto L3e
            int r8 = r0.f18566d
            r7 = 3
            int r9 = r0.f18565c
            r7 = 6
            java.lang.Object r2 = r0.f18564b
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r7 = 1
            java.lang.Object r4 = r0.f18563a
            r7 = 7
            n0.j r4 = (n0.j) r4
            r7 = 4
            kotlin.ResultKt.m(r10)
            r10 = r4
            goto L79
        L3e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r7 = 1
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r7 = 5
            r8.<init>(r9)
            throw r8
        L48:
            kotlin.ResultKt.m(r10)
            androidx.compose.runtime.collection.d<androidx.compose.foundation.relocation.g> r8 = r8.f18562a
            T[] r10 = r8.f35552a
            int r8 = r8.R()
            r7 = 7
            r2 = 0
            r6 = r10
            r10 = r9
            r10 = r9
            r7 = 2
            r9 = r2
            r2 = r6
            r2 = r6
        L5c:
            if (r9 >= r8) goto L7c
            r4 = r2[r9]
            androidx.compose.foundation.relocation.g r4 = (androidx.compose.foundation.relocation.g) r4
            androidx.compose.foundation.relocation.b r5 = new androidx.compose.foundation.relocation.b
            r5.<init>()
            r7 = 0
            r0.f18563a = r10
            r0.f18564b = r2
            r0.f18565c = r9
            r0.f18566d = r8
            r0.f18569g = r3
            java.lang.Object r4 = androidx.compose.ui.relocation.b.a(r4, r5, r0)
            if (r4 != r1) goto L79
            return r1
        L79:
            int r9 = r9 + r3
            r7 = 6
            goto L5c
        L7c:
            r7 = 2
            kotlin.Unit r8 = kotlin.Unit.f312394a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.relocation.c.a(n0.j, kotlin.coroutines.d):java.lang.Object");
    }

    @NotNull
    public final androidx.compose.runtime.collection.d<g> e() {
        return this.f18562a;
    }
}
