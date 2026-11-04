package com.sdk.growthbook.utils;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i1;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nSseReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SseReader.kt\ncom/sdk/growthbook/utils/SseReaderKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
public final class u {

    @kotlin.coroutines.jvm.internal.f(c = "com.sdk.growthbook.utils.SseReaderKt", f = "SseReader.kt", i = {0, 0, 0}, l = {17}, m = "readSse", n = {"$this$readSse", "onSseEvent", "data"}, s = {"L$0", "L$1", "L$2"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f266524a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f266525b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f266526c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f266527d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f266528e;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f266527d = obj;
            this.f266528e |= Integer.MIN_VALUE;
            return u.c(null, null, this);
        }
    }

    private static final void b(String str, Function1<? super v, Unit> function1) {
        v aVar;
        String str2;
        String str3;
        String string = null;
        String str4 = !(str == null || StringsKt.w3(str)) ? str : null;
        List listSplit$default = str4 != null ? StringsKt.split$default(str4, new String[]{":"}, false, 2, 2, null) : null;
        String string2 = (listSplit$default == null || (str3 = (String) CollectionsKt.getOrNull(listSplit$default, 0)) == null) ? null : StringsKt.E5(str3).toString();
        if (listSplit$default != null && (str2 = (String) CollectionsKt.getOrNull(listSplit$default, 1)) != null) {
            string = StringsKt.E5(str2).toString();
        }
        if (string == null) {
            string = "";
        }
        if (string2 == null) {
            aVar = v.b.f266530a;
        } else {
            aVar = Intrinsics.areEqual(string2, "data") ? new v.a(string) : new v.c(string2, string);
        }
        function1.invoke(aVar);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0072  */
    /* JADX WARN: Code duplicated, block: B:22:0x0074  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0074 -> B:12:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object c(@org.jetbrains.annotations.NotNull io.ktor.utils.io.h r7, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function1<? super com.sdk.growthbook.utils.s<java.lang.String>, kotlin.Unit> r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r9) {
        /*
            boolean r0 = r9 instanceof com.sdk.growthbook.utils.u.a
            if (r0 == 0) goto L15
            r0 = r9
            com.sdk.growthbook.utils.u$a r0 = (com.sdk.growthbook.utils.u.a) r0
            int r1 = r0.f266528e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            r6 = 3
            if (r3 == 0) goto L15
            int r1 = r1 - r2
            r0.f266528e = r1
            r6 = 1
            goto L1c
        L15:
            r6 = 5
            com.sdk.growthbook.utils.u$a r0 = new com.sdk.growthbook.utils.u$a
            r6 = 4
            r0.<init>(r9)
        L1c:
            java.lang.Object r9 = r0.f266527d
            r6 = 2
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            r6 = 2
            int r2 = r0.f266528e
            r3 = 1
            if (r2 == 0) goto L4d
            if (r2 != r3) goto L43
            r6 = 6
            java.lang.Object r7 = r0.f266526c
            r6 = 5
            kotlin.jvm.internal.i1$h r7 = (kotlin.jvm.internal.i1.h) r7
            java.lang.Object r8 = r0.f266525b
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            java.lang.Object r2 = r0.f266524a
            io.ktor.utils.io.h r2 = (io.ktor.utils.io.h) r2
            kotlin.ResultKt.m(r9)
            r5 = r0
            r0 = r7
            r0 = r7
            r7 = r2
        L40:
            r2 = r5
            r6 = 5
            goto L7a
        L43:
            r6 = 6
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r6 = 0
            r7.<init>(r8)
            throw r7
        L4d:
            r6 = 0
            kotlin.ResultKt.m(r9)
            r6 = 2
            kotlin.jvm.internal.i1$h r9 = new kotlin.jvm.internal.i1$h
            r9.<init>()
        L57:
            boolean r2 = r7.k()
            r6 = 6
            if (r2 != 0) goto L88
            r6 = 6
            r0.f266524a = r7
            r6 = 1
            r0.f266525b = r8
            r0.f266526c = r9
            r0.f266528e = r3
            r6 = 3
            r2 = 0
            r4 = 0
            r6 = r6 & r4
            java.lang.Object r2 = io.ktor.utils.io.k.L(r7, r2, r0, r3, r4)
            if (r2 != r1) goto L74
            r6 = 4
            return r1
        L74:
            r5 = r0
            r5 = r0
            r0 = r9
            r9 = r2
            r6 = 5
            goto L40
        L7a:
            java.lang.String r9 = (java.lang.String) r9
            com.sdk.growthbook.utils.t r4 = new com.sdk.growthbook.utils.t
            r4.<init>()
            b(r9, r4)
            r9 = r0
            r0 = r2
            r0 = r2
            goto L57
        L88:
            r6 = 0
            kotlin.Unit r7 = kotlin.Unit.f312394a
            r6 = 5
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sdk.growthbook.utils.u.c(io.ktor.utils.io.h, kotlin.jvm.functions.Function1, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [T, java.lang.String] */
    public static final Unit d(i1.h hVar, Function1 function1, v sseRawEvent) {
        Intrinsics.checkNotNullParameter(sseRawEvent, "sseRawEvent");
        if (Intrinsics.areEqual(sseRawEvent, v.b.f266530a)) {
            CharSequence charSequence = (CharSequence) hVar.f312751a;
            if (charSequence != null && charSequence.length() != 0) {
                String str = (String) hVar.f312751a;
                if (str == null) {
                    str = "";
                }
                function1.invoke(new s.b(str));
                hVar.f312751a = null;
            }
        } else if (sseRawEvent instanceof v.a) {
            v.a aVar = (v.a) sseRawEvent;
            if (aVar.d().length() > 0) {
                hVar.f312751a = aVar.d();
            }
        }
        return Unit.f312394a;
    }
}
