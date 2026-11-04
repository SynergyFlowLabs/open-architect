package kotlinx.coroutines.selects;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.h0;
import kotlinx.coroutines.c2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nWhileSelect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WhileSelect.kt\nkotlinx/coroutines/selects/WhileSelectKt\n+ 2 Select.kt\nkotlinx/coroutines/selects/SelectKt\n*L\n1#1,29:1\n54#2,5:30\n*S KotlinDebug\n*F\n+ 1 WhileSelect.kt\nkotlinx/coroutines/selects/WhileSelectKt\n*L\n27#1:30,5\n*E\n"})
public final class v {

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.selects.WhileSelectKt", f = "WhileSelect.kt", i = {0}, l = {34}, m = "whileSelect", n = {"builder"}, s = {"L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f315571a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f315572b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f315573c;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f315572b = obj;
            this.f315573c |= Integer.MIN_VALUE;
            return v.a(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x0064  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0058 -> B:19:0x005b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @kotlinx.coroutines.c2
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object a(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlinx.coroutines.selects.d<? super java.lang.Boolean>, kotlin.Unit> r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r6) {
        /*
            r4 = 1
            boolean r0 = r6 instanceof kotlinx.coroutines.selects.v.a
            if (r0 == 0) goto L17
            r0 = r6
            kotlinx.coroutines.selects.v$a r0 = (kotlinx.coroutines.selects.v.a) r0
            r4 = 6
            int r1 = r0.f315573c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            r4 = 5
            int r1 = r1 - r2
            r4 = 0
            r0.f315573c = r1
            goto L1e
        L17:
            r4 = 1
            kotlinx.coroutines.selects.v$a r0 = new kotlinx.coroutines.selects.v$a
            r4 = 0
            r0.<init>(r6)
        L1e:
            r4 = 2
            java.lang.Object r6 = r0.f315572b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f315573c
            r3 = 1
            if (r2 == 0) goto L3e
            r4 = 4
            if (r2 != r3) goto L35
            java.lang.Object r5 = r0.f315571a
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            kotlin.ResultKt.m(r6)
            goto L5b
        L35:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r4 = 3
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3e:
            kotlin.ResultKt.m(r6)
        L41:
            kotlinx.coroutines.selects.m r6 = new kotlinx.coroutines.selects.m
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()
            r4 = 6
            r6.<init>(r2)
            r4 = 7
            r5.invoke(r6)
            r0.f315571a = r5
            r0.f315573c = r3
            java.lang.Object r6 = r6.w(r0)
            r4 = 4
            if (r6 != r1) goto L5b
            return r1
        L5b:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r4 = 4
            if (r6 != 0) goto L41
            kotlin.Unit r5 = kotlin.Unit.f312394a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.v.a(kotlin.jvm.functions.Function1, kotlin.coroutines.d):java.lang.Object");
    }

    @c2
    private static final Object b(Function1<? super d<? super Boolean>, Unit> function1, kotlin.coroutines.d<? super Unit> dVar) {
        h0.e(3);
        throw null;
    }
}
