package io.ktor.util;

import java.nio.ByteBuffer;
import java.util.zip.Checksum;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.f2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f296721a = 10;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final m0 f296722b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final m0 f296723c = new b();

    public static final class a implements m0 {
        a() {
        }

        @Override // io.ktor.util.m0
        public io.ktor.utils.io.h a(io.ktor.utils.io.h source, CoroutineContext coroutineContext) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
            return n0.g(source, false, coroutineContext);
        }

        @Override // io.ktor.util.m0
        public io.ktor.utils.io.h b(io.ktor.utils.io.h source, CoroutineContext coroutineContext) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
            return i0.o(source, false, null, coroutineContext, 2, null);
        }

        @Override // io.ktor.util.m0
        public io.ktor.utils.io.p c(io.ktor.utils.io.p source, CoroutineContext coroutineContext) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
            int i10 = 6 | 0 | 0;
            return i0.p(source, false, null, coroutineContext, 2, null);
        }
    }

    public static final class b implements m0 {
        b() {
        }

        @Override // io.ktor.util.m0
        public io.ktor.utils.io.h a(io.ktor.utils.io.h source, CoroutineContext coroutineContext) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
            int i10 = 3 << 0;
            return n0.h(source, false, coroutineContext, 2, null);
        }

        @Override // io.ktor.util.m0
        public io.ktor.utils.io.h b(io.ktor.utils.io.h source, CoroutineContext coroutineContext) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
            int i10 = 2 | 0;
            return i0.o(source, true, null, coroutineContext, 2, null);
        }

        @Override // io.ktor.util.m0
        public io.ktor.utils.io.p c(io.ktor.utils.io.p source, CoroutineContext coroutineContext) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
            return i0.p(source, true, null, coroutineContext, 2, null);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.util.EncodersJvmKt$inflate$1", f = "EncodersJvm.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6}, l = {com.planner5d.library.engine.input.f.b.f160705l0, 99, 100, 110, me.relex.circleindicator.a.f332619e, 123, 135}, m = "invokeSuspend", n = {"$this$writer", "readBuffer", "writeBuffer", "inflater", "checksum", "$this$writer", "readBuffer", "writeBuffer", "inflater", "checksum", "magic", "format", "flags", "$this$writer", "readBuffer", "writeBuffer", "inflater", "checksum", "magic", "format", "flags", "$this$writer", "readBuffer", "writeBuffer", "inflater", "checksum", "$this$writer", "readBuffer", "writeBuffer", "inflater", "checksum", "totalSize", "$this$writer", "readBuffer", "writeBuffer", "inflater", "checksum", "totalSize", "$this$writer", "readBuffer", "writeBuffer", "inflater", "checksum", "totalSize"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "S$0", "B$0", "B$1", "L$0", "L$1", "L$2", "L$3", "L$4", "S$0", "B$0", "B$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
    @SourceDebugExtension({"SMAP\nEncodersJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EncodersJvm.kt\nio/ktor/util/EncodersJvmKt$inflate$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,174:1\n1#2:175\n*E\n"})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<io.ktor.utils.io.e1, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f296724a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f296725b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f296726c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f296727d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f296728e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f296729f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        short f296730g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        byte f296731h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        byte f296732i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f296733j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f296734k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private /* synthetic */ Object f296735l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f296736m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ io.ktor.utils.io.h f296737n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z10, io.ktor.utils.io.h hVar, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f296736m = z10;
            this.f296737n = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            c cVar = new c(this.f296736m, this.f296737n, dVar);
            cVar.f296735l = obj;
            return cVar;
        }

        /* JADX WARN: Code duplicated, block: B:67:0x0262 A[Catch: all -> 0x003c, TryCatch #2 {all -> 0x003c, blocks: (B:7:0x0034, B:93:0x0327, B:87:0x0300, B:89:0x0306, B:94:0x033e, B:96:0x0342, B:98:0x034a, B:100:0x036a, B:103:0x036f, B:104:0x0393, B:105:0x0394, B:106:0x039b, B:107:0x039c, B:108:0x03bf, B:109:0x03c0, B:113:0x03da, B:114:0x03e3, B:73:0x0297, B:75:0x029d, B:77:0x02a3, B:83:0x02ed, B:65:0x025a, B:67:0x0262, B:70:0x027d, B:72:0x0285, B:84:0x02f2, B:86:0x02fa, B:115:0x03e4, B:17:0x0088, B:64:0x0251), top: B:124:0x000b }] */
        /* JADX WARN: Code duplicated, block: B:69:0x027b  */
        /* JADX WARN: Code duplicated, block: B:70:0x027d A[Catch: all -> 0x003c, PHI: r2 r3 r5 r7 r8 r9 r10
          0x027d: PHI (r2v26 kotlin.jvm.internal.i1$f) = (r2v25 kotlin.jvm.internal.i1$f), (r2v27 kotlin.jvm.internal.i1$f) binds: [B:18:0x008b, B:68:0x0279] A[DONT_GENERATE, DONT_INLINE]
          0x027d: PHI (r3v13 java.util.zip.CRC32) = (r3v12 java.util.zip.CRC32), (r3v14 java.util.zip.CRC32) binds: [B:18:0x008b, B:68:0x0279] A[DONT_GENERATE, DONT_INLINE]
          0x027d: PHI (r5v20 java.lang.Object) = (r5v19 java.lang.Object), (r5v27 java.lang.Object) binds: [B:18:0x008b, B:68:0x0279] A[DONT_GENERATE, DONT_INLINE]
          0x027d: PHI (r7v22 io.ktor.utils.io.e1) = (r7v21 io.ktor.utils.io.e1), (r7v23 io.ktor.utils.io.e1) binds: [B:18:0x008b, B:68:0x0279] A[DONT_GENERATE, DONT_INLINE]
          0x027d: PHI (r8v23 java.util.zip.Inflater) = (r8v21 java.util.zip.Inflater), (r8v24 java.util.zip.Inflater) binds: [B:18:0x008b, B:68:0x0279] A[DONT_GENERATE, DONT_INLINE]
          0x027d: PHI (r9v29 java.nio.ByteBuffer) = (r9v26 java.nio.ByteBuffer), (r9v30 java.nio.ByteBuffer) binds: [B:18:0x008b, B:68:0x0279] A[DONT_GENERATE, DONT_INLINE]
          0x027d: PHI (r10v22 java.nio.ByteBuffer) = (r10v19 java.nio.ByteBuffer), (r10v23 java.nio.ByteBuffer) binds: [B:18:0x008b, B:68:0x0279] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {all -> 0x003c, blocks: (B:7:0x0034, B:93:0x0327, B:87:0x0300, B:89:0x0306, B:94:0x033e, B:96:0x0342, B:98:0x034a, B:100:0x036a, B:103:0x036f, B:104:0x0393, B:105:0x0394, B:106:0x039b, B:107:0x039c, B:108:0x03bf, B:109:0x03c0, B:113:0x03da, B:114:0x03e3, B:73:0x0297, B:75:0x029d, B:77:0x02a3, B:83:0x02ed, B:65:0x025a, B:67:0x0262, B:70:0x027d, B:72:0x0285, B:84:0x02f2, B:86:0x02fa, B:115:0x03e4, B:17:0x0088, B:64:0x0251), top: B:124:0x000b }] */
        /* JADX WARN: Code duplicated, block: B:72:0x0285 A[Catch: all -> 0x003c, TryCatch #2 {all -> 0x003c, blocks: (B:7:0x0034, B:93:0x0327, B:87:0x0300, B:89:0x0306, B:94:0x033e, B:96:0x0342, B:98:0x034a, B:100:0x036a, B:103:0x036f, B:104:0x0393, B:105:0x0394, B:106:0x039b, B:107:0x039c, B:108:0x03bf, B:109:0x03c0, B:113:0x03da, B:114:0x03e3, B:73:0x0297, B:75:0x029d, B:77:0x02a3, B:83:0x02ed, B:65:0x025a, B:67:0x0262, B:70:0x027d, B:72:0x0285, B:84:0x02f2, B:86:0x02fa, B:115:0x03e4, B:17:0x0088, B:64:0x0251), top: B:124:0x000b }] */
        /* JADX WARN: Code duplicated, block: B:75:0x029d A[Catch: all -> 0x003c, TryCatch #2 {all -> 0x003c, blocks: (B:7:0x0034, B:93:0x0327, B:87:0x0300, B:89:0x0306, B:94:0x033e, B:96:0x0342, B:98:0x034a, B:100:0x036a, B:103:0x036f, B:104:0x0393, B:105:0x0394, B:106:0x039b, B:107:0x039c, B:108:0x03bf, B:109:0x03c0, B:113:0x03da, B:114:0x03e3, B:73:0x0297, B:75:0x029d, B:77:0x02a3, B:83:0x02ed, B:65:0x025a, B:67:0x0262, B:70:0x027d, B:72:0x0285, B:84:0x02f2, B:86:0x02fa, B:115:0x03e4, B:17:0x0088, B:64:0x0251), top: B:124:0x000b }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0283 -> B:65:0x025a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x0285 -> B:73:0x0297). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x02c4 -> B:81:0x02cf). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:92:0x0326 -> B:93:0x0327). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instruction units count: 1038
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.n0.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(io.ktor.utils.io.e1 e1Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(e1Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.util.EncodersJvmKt", f = "EncodersJvm.kt", i = {0}, l = {171}, m = "inflateTo", n = {"inflated"}, s = {"I$0"})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f296738a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f296739b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f296740c;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f296739b = obj;
            this.f296740c |= Integer.MIN_VALUE;
            return n0.i(null, null, null, null, this);
        }
    }

    @NotNull
    public static final m0 d() {
        return f296722b;
    }

    @NotNull
    public static final m0 e() {
        return f296723c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final io.ktor.utils.io.h g(io.ktor.utils.io.h hVar, boolean z10, CoroutineContext coroutineContext) {
        return io.ktor.utils.io.t.G(f2.f314023a, coroutineContext, false, new c(z10, hVar, null), 2, null).b();
    }

    static /* synthetic */ io.ktor.utils.io.h h(io.ktor.utils.io.h hVar, boolean z10, CoroutineContext coroutineContext, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return g(hVar, z10, coroutineContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final Object i(Inflater inflater, io.ktor.utils.io.p pVar, ByteBuffer byteBuffer, Checksum checksum, kotlin.coroutines.d<? super Integer> dVar) throws DataFormatException {
        d dVar2;
        int iInflate;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i10 = dVar2.f296740c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar2.f296740c = i10 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        Object obj = dVar2.f296739b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = dVar2.f296740c;
        if (i11 == 0) {
            ResultKt.m(obj);
            byteBuffer.clear();
            iInflate = inflater.inflate(byteBuffer.array(), byteBuffer.position(), byteBuffer.remaining());
            byteBuffer.position(byteBuffer.position() + iInflate);
            byteBuffer.flip();
            i0.u(checksum, byteBuffer);
            dVar2.f296738a = iInflate;
            dVar2.f296740c = 1;
            if (io.ktor.utils.io.u.g(pVar, byteBuffer, dVar2) == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iInflate = dVar2.f296738a;
            ResultKt.m(obj);
        }
        return kotlin.coroutines.jvm.internal.b.f(iInflate);
    }
}
