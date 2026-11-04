package io.ktor.client.utils;

import io.ktor.utils.io.e1;
import io.ktor.utils.io.t;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.f2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: io.ktor.client.utils.a$a, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.utils.ByteChannelUtilsKt$observable$1", f = "ByteChannelUtils.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3}, l = {22, 24, 26, 31}, m = "invokeSuspend", n = {"$this$writer", "$this$useInstance$iv", "instance$iv", "byteArray", "bytesSend", "$this$writer", "$this$useInstance$iv", "instance$iv", "byteArray", "bytesSend", "read", "$this$writer", "$this$useInstance$iv", "instance$iv", "byteArray", "bytesSend", "$this$useInstance$iv", "instance$iv"}, s = {"L$0", "L$1", "L$5", "L$6", "J$0", "L$0", "L$1", "L$5", "L$6", "J$0", "I$0", "L$0", "L$1", "L$5", "L$6", "J$0", "L$0", "L$1"})
    @SourceDebugExtension({"SMAP\nByteChannelUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteChannelUtils.kt\nio/ktor/client/utils/ByteChannelUtilsKt$observable$1\n+ 2 Pool.kt\nio/ktor/utils/io/pool/PoolKt\n*L\n1#1,35:1\n182#2,5:36\n*S KotlinDebug\n*F\n+ 1 ByteChannelUtils.kt\nio/ktor/client/utils/ByteChannelUtilsKt$observable$1\n*L\n19#1:36,5\n*E\n"})
    static final class C2075a extends o implements Function2<e1, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f295371a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f295372b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f295373c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f295374d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f295375e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f295376f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        long f295377g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f295378h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f295379i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f295380j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ io.ktor.utils.io.h f295381k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ io.ktor.client.content.d f295382l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ Long f295383m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2075a(io.ktor.utils.io.h hVar, io.ktor.client.content.d dVar, Long l10, kotlin.coroutines.d<? super C2075a> dVar2) {
            super(2, dVar2);
            this.f295381k = hVar;
            this.f295382l = dVar;
            this.f295383m = l10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            C2075a c2075a = new C2075a(this.f295381k, this.f295382l, this.f295383m, dVar);
            c2075a.f295380j = obj;
            return c2075a;
        }

        /* JADX WARN: Code duplicated, block: B:37:0x00fc A[Catch: all -> 0x0195, TryCatch #3 {all -> 0x0195, blocks: (B:35:0x00f6, B:37:0x00fc, B:41:0x012e, B:43:0x0136, B:57:0x01a6, B:61:0x01b7), top: B:78:0x00f6 }] */
        /* JADX WARN: Code duplicated, block: B:39:0x0125  */
        /* JADX WARN: Code duplicated, block: B:40:0x0127  */
        /* JADX WARN: Code duplicated, block: B:43:0x0136 A[Catch: all -> 0x0195, TRY_LEAVE, TryCatch #3 {all -> 0x0195, blocks: (B:35:0x00f6, B:37:0x00fc, B:41:0x012e, B:43:0x0136, B:57:0x01a6, B:61:0x01b7), top: B:78:0x00f6 }] */
        /* JADX WARN: Code duplicated, block: B:46:0x0157  */
        /* JADX WARN: Code duplicated, block: B:51:0x0187  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0187 -> B:18:0x005d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0199 -> B:78:0x00f6). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r25) {
            /*
                Method dump skipped, instruction units count: 481
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.utils.a.C2075a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(e1 e1Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C2075a) create(e1Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @NotNull
    public static final io.ktor.utils.io.h a(@NotNull io.ktor.utils.io.h hVar, @NotNull CoroutineContext context, @Nullable Long l10, @NotNull io.ktor.client.content.d listener) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        return t.E(f2.f314023a, context, true, new C2075a(hVar, listener, l10, null)).b();
    }
}
